// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.Hex;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.h264.model.ChromaFormat;
import com.googlecode.mp4parser.h264.model.HRDParameters;
import com.googlecode.mp4parser.h264.model.PictureParameterSet;
import com.googlecode.mp4parser.h264.model.SeqParameterSet;
import com.googlecode.mp4parser.h264.model.VUIParameters;
import com.googlecode.mp4parser.h264.read.CAVLCReader;
import com.googlecode.mp4parser.util.RangeStartMap;
import com.mp4parser.iso14496.part15.AvcConfigurationBox;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

// Referenced classes of package com.googlecode.mp4parser.authoring.tracks:
//            CleanInputStream

public class H264TrackImpl extends AbstractTrack
{
    public class ByteBufferBackedInputStream extends InputStream
    {

        private final ByteBuffer buf;
        final H264TrackImpl this$0;

        public int read()
        {
            if (!buf.hasRemaining())
            {
                return -1;
            } else
            {
                return buf.get() & 0xff;
            }
        }

        public int read(byte abyte0[], int i, int j)
        {
            if (!buf.hasRemaining())
            {
                return -1;
            } else
            {
                j = Math.min(j, buf.remaining());
                buf.get(abyte0, i, j);
                return j;
            }
        }

        public ByteBufferBackedInputStream(ByteBuffer bytebuffer)
        {
            this$0 = H264TrackImpl.this;
            super();
            buf = bytebuffer.duplicate();
        }
    }

    class LookAhead
    {

        ByteBuffer buffer;
        long bufferStartPos;
        DataSource dataSource;
        int inBufferPos;
        long start;
        final H264TrackImpl this$0;

        void discardByte()
        {
            inBufferPos = inBufferPos + 1;
        }

        void discardNext3AndMarkStart()
        {
            inBufferPos = inBufferPos + 3;
            start = bufferStartPos + (long)inBufferPos;
        }

        public void fillBuffer()
        {
            buffer = dataSource.map(bufferStartPos, Math.min(dataSource.size() - bufferStartPos, H264TrackImpl.BUFFER));
        }

        public ByteBuffer getNal()
        {
            if (start >= bufferStartPos)
            {
                buffer.position((int)(start - bufferStartPos));
                ByteBuffer bytebuffer = buffer.slice();
                bytebuffer.limit((int)((long)inBufferPos - (start - bufferStartPos)));
                return (ByteBuffer)bytebuffer;
            } else
            {
                throw new RuntimeException("damn! NAL exceeds buffer");
            }
        }

        boolean nextThreeEquals000or001orEof()
        {
            if (buffer.limit() - inBufferPos < 3) goto _L2; else goto _L1
_L1:
            if (buffer.get(inBufferPos) != 0 || buffer.get(inBufferPos + 1) != 0 || buffer.get(inBufferPos + 2) != 0 && buffer.get(inBufferPos + 2) != 1) goto _L4; else goto _L3
_L3:
            return true;
_L4:
            return false;
_L2:
            if (bufferStartPos + (long)inBufferPos + 3L > dataSource.size())
            {
                if (bufferStartPos + (long)inBufferPos != dataSource.size())
                {
                    return false;
                }
            } else
            {
                bufferStartPos = start;
                inBufferPos = 0;
                fillBuffer();
                return nextThreeEquals000or001orEof();
            }
            if (true) goto _L3; else goto _L5
_L5:
        }

        boolean nextThreeEquals001()
        {
            if (buffer.limit() - inBufferPos >= 3)
            {
                return buffer.get(inBufferPos) == 0 && buffer.get(inBufferPos + 1) == 0 && buffer.get(inBufferPos + 2) == 1;
            }
            if (bufferStartPos + (long)inBufferPos + 3L >= dataSource.size())
            {
                throw new EOFException();
            } else
            {
                return false;
            }
        }

        LookAhead(DataSource datasource)
        {
            this$0 = H264TrackImpl.this;
            super();
            bufferStartPos = 0L;
            inBufferPos = 0;
            dataSource = datasource;
            fillBuffer();
        }
    }

    public class SEIMessage
    {

        boolean clock_timestamp_flag;
        int cnt_dropped_flag;
        int counting_type;
        int cpb_removal_delay;
        int ct_type;
        int discontinuity_flag;
        int dpb_removal_delay;
        int full_timestamp_flag;
        int hours_value;
        int minutes_value;
        int n_frames;
        int nuit_field_based_flag;
        int payloadSize;
        int payloadType;
        int pic_struct;
        boolean removal_delay_flag;
        int seconds_value;
        SeqParameterSet sps;
        final H264TrackImpl this$0;
        int time_offset;
        int time_offset_length;

        public String toString()
        {
            String s;
label0:
            {
                String s1;
label1:
                {
                    String s2 = (new StringBuilder("SEIMessage{payloadType=")).append(payloadType).append(", payloadSize=").append(payloadSize).toString();
                    s = s2;
                    if (payloadType != 1)
                    {
                        break label0;
                    }
                    if (sps.vuiParams.nalHRDParams == null)
                    {
                        s1 = s2;
                        if (sps.vuiParams.vclHRDParams == null)
                        {
                            break label1;
                        }
                    }
                    s1 = (new StringBuilder(String.valueOf(s2))).append(", cpb_removal_delay=").append(cpb_removal_delay).append(", dpb_removal_delay=").append(dpb_removal_delay).toString();
                }
                s = s1;
                if (sps.vuiParams.pic_struct_present_flag)
                {
                    s1 = (new StringBuilder(String.valueOf(s1))).append(", pic_struct=").append(pic_struct).toString();
                    s = s1;
                    if (clock_timestamp_flag)
                    {
                        s = (new StringBuilder(String.valueOf(s1))).append(", ct_type=").append(ct_type).append(", nuit_field_based_flag=").append(nuit_field_based_flag).append(", counting_type=").append(counting_type).append(", full_timestamp_flag=").append(full_timestamp_flag).append(", discontinuity_flag=").append(discontinuity_flag).append(", cnt_dropped_flag=").append(cnt_dropped_flag).append(", n_frames=").append(n_frames).append(", seconds_value=").append(seconds_value).append(", minutes_value=").append(minutes_value).append(", hours_value=").append(hours_value).append(", time_offset_length=").append(time_offset_length).append(", time_offset=").append(time_offset).toString();
                    }
                }
            }
            return (new StringBuilder(String.valueOf(s))).append('}').toString();
        }

        public SEIMessage(InputStream inputstream, SeqParameterSet seqparameterset)
        {
            int i;
            int i1;
            this$0 = H264TrackImpl.this;
            super();
            payloadType = 0;
            payloadSize = 0;
            sps = seqparameterset;
            inputstream.read();
            i1 = inputstream.available();
            i = 0;
_L16:
            int j;
            if (i >= i1)
            {
                return;
            }
            payloadType = 0;
            payloadSize = 0;
            j = inputstream.read();
            i++;
_L17:
            if (j == 255) goto _L2; else goto _L1
_L1:
            payloadType = j + payloadType;
            j = inputstream.read();
            i++;
_L18:
            if (j == 255) goto _L4; else goto _L3
_L3:
            payloadSize = j + payloadSize;
            if (i1 - i < payloadSize)
            {
                break MISSING_BLOCK_LABEL_834;
            }
            if (payloadType != 1) goto _L6; else goto _L5
_L5:
            if (seqparameterset.vuiParams == null || seqparameterset.vuiParams.nalHRDParams == null && seqparameterset.vuiParams.vclHRDParams == null && !seqparameterset.vuiParams.pic_struct_present_flag) goto _L8; else goto _L7
_L7:
            h264trackimpl = new byte[payloadSize];
            inputstream.read(H264TrackImpl.this);
            int k = i + payloadSize;
            h264trackimpl = new CAVLCReader(new ByteArrayInputStream(H264TrackImpl.this));
            if (seqparameterset.vuiParams.nalHRDParams != null || seqparameterset.vuiParams.vclHRDParams != null)
            {
                removal_delay_flag = true;
                cpb_removal_delay = readU(seqparameterset.vuiParams.nalHRDParams.cpb_removal_delay_length_minus1 + 1, "SEI: cpb_removal_delay");
                dpb_removal_delay = readU(seqparameterset.vuiParams.nalHRDParams.dpb_output_delay_length_minus1 + 1, "SEI: dpb_removal_delay");
            } else
            {
                removal_delay_flag = false;
            }
            i = k;
            if (!seqparameterset.vuiParams.pic_struct_present_flag) goto _L10; else goto _L9
_L9:
            pic_struct = readU(4, "SEI: pic_struct");
            pic_struct;
            JVM INSTR tableswitch 3 8: default 348
        //                       3 438
        //                       4 438
        //                       5 444
        //                       6 444
        //                       7 438
        //                       8 444;
               goto _L11 _L12 _L12 _L13 _L13 _L12 _L13
_L11:
            i = 1;
_L19:
            j = 0;
_L20:
            if (j < i) goto _L15; else goto _L14
_L14:
            i = k;
_L10:
            H264TrackImpl.LOG.fine(toString());
              goto _L16
_L2:
            payloadType = j + payloadType;
            j = inputstream.read();
            i++;
              goto _L17
_L4:
            payloadSize = j + payloadSize;
            j = inputstream.read();
            i++;
              goto _L18
_L12:
            i = 2;
              goto _L19
_L13:
            i = 3;
              goto _L19
_L15:
            clock_timestamp_flag = readBool((new StringBuilder("pic_timing SEI: clock_timestamp_flag[")).append(j).append("]").toString());
            if (clock_timestamp_flag)
            {
                ct_type = readU(2, "pic_timing SEI: ct_type");
                nuit_field_based_flag = readU(1, "pic_timing SEI: nuit_field_based_flag");
                counting_type = readU(5, "pic_timing SEI: counting_type");
                full_timestamp_flag = readU(1, "pic_timing SEI: full_timestamp_flag");
                discontinuity_flag = readU(1, "pic_timing SEI: discontinuity_flag");
                cnt_dropped_flag = readU(1, "pic_timing SEI: cnt_dropped_flag");
                n_frames = readU(8, "pic_timing SEI: n_frames");
                if (full_timestamp_flag == 1)
                {
                    seconds_value = readU(6, "pic_timing SEI: seconds_value");
                    minutes_value = readU(6, "pic_timing SEI: minutes_value");
                    hours_value = readU(5, "pic_timing SEI: hours_value");
                } else
                if (readBool("pic_timing SEI: seconds_flag"))
                {
                    seconds_value = readU(6, "pic_timing SEI: seconds_value");
                    if (readBool("pic_timing SEI: minutes_flag"))
                    {
                        minutes_value = readU(6, "pic_timing SEI: minutes_value");
                        if (readBool("pic_timing SEI: hours_flag"))
                        {
                            hours_value = readU(5, "pic_timing SEI: hours_value");
                        }
                    }
                }
                if (seqparameterset.vuiParams.nalHRDParams != null)
                {
                    time_offset_length = seqparameterset.vuiParams.nalHRDParams.time_offset_length;
                } else
                if (seqparameterset.vuiParams.vclHRDParams != null)
                {
                    time_offset_length = seqparameterset.vuiParams.vclHRDParams.time_offset_length;
                } else
                {
                    time_offset_length = 24;
                }
                time_offset = readU(24, "pic_timing SEI: time_offset");
            }
            j++;
              goto _L20
_L8:
            int l;
            l = 0;
            j = i;
_L22:
            i = j;
            if (l >= payloadSize) goto _L10; else goto _L21
_L21:
            inputstream.read();
            j++;
            l++;
              goto _L22
_L6:
            l = 0;
            j = i;
_L24:
            i = j;
            if (l >= payloadSize) goto _L10; else goto _L23
_L23:
            inputstream.read();
            j++;
            l++;
              goto _L24
            i = i1;
              goto _L10
        }
    }

    public static class SliceHeader
    {

        public boolean bottom_field_flag;
        public int colour_plane_id;
        public int delta_pic_order_cnt_0;
        public int delta_pic_order_cnt_1;
        public int delta_pic_order_cnt_bottom;
        public boolean field_pic_flag;
        public int first_mb_in_slice;
        public int frame_num;
        public int idr_pic_id;
        public int pic_order_cnt_lsb;
        public int pic_parameter_set_id;
        public SliceType slice_type;

        public String toString()
        {
            return (new StringBuilder("SliceHeader{first_mb_in_slice=")).append(first_mb_in_slice).append(", slice_type=").append(slice_type).append(", pic_parameter_set_id=").append(pic_parameter_set_id).append(", colour_plane_id=").append(colour_plane_id).append(", frame_num=").append(frame_num).append(", field_pic_flag=").append(field_pic_flag).append(", bottom_field_flag=").append(bottom_field_flag).append(", idr_pic_id=").append(idr_pic_id).append(", pic_order_cnt_lsb=").append(pic_order_cnt_lsb).append(", delta_pic_order_cnt_bottom=").append(delta_pic_order_cnt_bottom).append('}').toString();
        }

        public SliceHeader(InputStream inputstream, Map map, Map map1, boolean flag)
        {
            field_pic_flag = false;
            bottom_field_flag = false;
            inputstream.read();
            inputstream = new CAVLCReader(inputstream);
            first_mb_in_slice = inputstream.readUE("SliceHeader: first_mb_in_slice");
            inputstream.readUE("SliceHeader: slice_type");
            JVM INSTR tableswitch 0 9: default 384
        //                       0 324
        //                       1 344
        //                       2 354
        //                       3 364
        //                       4 374
        //                       5 324
        //                       6 344
        //                       7 354
        //                       8 364
        //                       9 374;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L2 _L3 _L4 _L5 _L6
_L1:
            break; /* Loop/switch isn't completed */
_L6:
            break MISSING_BLOCK_LABEL_374;
_L7:
            pic_parameter_set_id = inputstream.readUE("SliceHeader: pic_parameter_set_id");
            map1 = (PictureParameterSet)map1.get(Integer.valueOf(pic_parameter_set_id));
            map = (SeqParameterSet)map.get(Integer.valueOf(((PictureParameterSet) (map1)).seq_parameter_set_id));
            if (((SeqParameterSet) (map)).residual_color_transform_flag)
            {
                colour_plane_id = inputstream.readU(2, "SliceHeader: colour_plane_id");
            }
            frame_num = inputstream.readU(((SeqParameterSet) (map)).log2_max_frame_num_minus4 + 4, "SliceHeader: frame_num");
            if (!((SeqParameterSet) (map)).frame_mbs_only_flag)
            {
                field_pic_flag = inputstream.readBool("SliceHeader: field_pic_flag");
                if (field_pic_flag)
                {
                    bottom_field_flag = inputstream.readBool("SliceHeader: bottom_field_flag");
                }
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_227;
            }
            idr_pic_id = inputstream.readUE("SliceHeader: idr_pic_id");
            if (((SeqParameterSet) (map)).pic_order_cnt_type == 0)
            {
                pic_order_cnt_lsb = inputstream.readU(((SeqParameterSet) (map)).log2_max_pic_order_cnt_lsb_minus4 + 4, "SliceHeader: pic_order_cnt_lsb");
                if (((PictureParameterSet) (map1)).bottom_field_pic_order_in_frame_present_flag && !field_pic_flag)
                {
                    delta_pic_order_cnt_bottom = inputstream.readSE("SliceHeader: delta_pic_order_cnt_bottom");
                }
            }
            if (((SeqParameterSet) (map)).pic_order_cnt_type == 1 && !((SeqParameterSet) (map)).delta_pic_order_always_zero_flag)
            {
                delta_pic_order_cnt_0 = inputstream.readSE("delta_pic_order_cnt_0");
                if (((PictureParameterSet) (map1)).bottom_field_pic_order_in_frame_present_flag && !field_pic_flag)
                {
                    delta_pic_order_cnt_1 = inputstream.readSE("delta_pic_order_cnt_1");
                    return;
                }
            }
            break MISSING_BLOCK_LABEL_387;
_L2:
            try
            {
                slice_type = SliceType.P;
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                throw new RuntimeException(inputstream);
            }
              goto _L7
_L3:
            slice_type = SliceType.B;
              goto _L7
_L4:
            slice_type = SliceType.I;
              goto _L7
_L5:
            slice_type = SliceType.SP;
              goto _L7
            slice_type = SliceType.SI;
              goto _L7
        }
    }

    public static final class SliceHeader.SliceType extends Enum
    {

        public static final SliceHeader.SliceType B;
        private static final SliceHeader.SliceType ENUM$VALUES[];
        public static final SliceHeader.SliceType I;
        public static final SliceHeader.SliceType P;
        public static final SliceHeader.SliceType SI;
        public static final SliceHeader.SliceType SP;

        public static SliceHeader.SliceType valueOf(String s)
        {
            return (SliceHeader.SliceType)Enum.valueOf(com/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader$SliceType, s);
        }

        public static SliceHeader.SliceType[] values()
        {
            SliceHeader.SliceType aslicetype[] = ENUM$VALUES;
            int i = aslicetype.length;
            SliceHeader.SliceType aslicetype1[] = new SliceHeader.SliceType[i];
            System.arraycopy(aslicetype, 0, aslicetype1, 0, i);
            return aslicetype1;
        }

        static 
        {
            P = new SliceHeader.SliceType("P", 0);
            B = new SliceHeader.SliceType("B", 1);
            I = new SliceHeader.SliceType("I", 2);
            SP = new SliceHeader.SliceType("SP", 3);
            SI = new SliceHeader.SliceType("SI", 4);
            ENUM$VALUES = (new SliceHeader.SliceType[] {
                P, B, I, SP, SI
            });
        }

        private SliceHeader.SliceType(String s, int i)
        {
            super(s, i);
        }
    }


    static int BUFFER = 0x3fffc00;
    private static final Logger LOG = Logger.getLogger(com/googlecode/mp4parser/authoring/tracks/H264TrackImpl.getName());
    List ctts;
    private DataSource dataSource;
    private long decodingTimes[];
    private boolean determineFrameRate;
    PictureParameterSet firstPictureParameterSet;
    SeqParameterSet firstSeqParameterSet;
    int frameNrInGop;
    private int frametick;
    MessageDigest hash;
    private int height;
    private String lang;
    RangeStartMap pictureParameterRangeMap;
    Map ppsIdToPps;
    Map ppsIdToPpsBytes;
    SampleDescriptionBox sampleDescriptionBox;
    private List samples;
    List sdtp;
    private SEIMessage seiMessage;
    RangeStartMap seqParameterRangeMap;
    Map spsIdToSps;
    Map spsIdToSpsBytes;
    List stss;
    private long timescale;
    TrackMetaData trackMetaData;
    private int width;

    public H264TrackImpl(DataSource datasource)
    {
        this(datasource, "eng");
    }

    public H264TrackImpl(DataSource datasource, String s)
    {
        this(datasource, s, -1L, -1);
    }

    public H264TrackImpl(DataSource datasource, String s, long l, int i)
    {
        super(datasource.toString());
        spsIdToSpsBytes = new HashMap();
        spsIdToSps = new HashMap();
        ppsIdToPpsBytes = new HashMap();
        ppsIdToPps = new HashMap();
        trackMetaData = new TrackMetaData();
        firstSeqParameterSet = null;
        firstPictureParameterSet = null;
        seqParameterRangeMap = new RangeStartMap();
        pictureParameterRangeMap = new RangeStartMap();
        frameNrInGop = 0;
        determineFrameRate = true;
        lang = "eng";
        lang = s;
        timescale = l;
        frametick = i;
        dataSource = datasource;
        if (l > 0L && i > 0)
        {
            determineFrameRate = false;
        }
        try
        {
            hash = MessageDigest.getInstance("MD5");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        parse(new LookAhead(datasource));
    }

    private void configureFramerate()
    {
label0:
        {
            if (determineFrameRate)
            {
                if (firstSeqParameterSet.vuiParams == null)
                {
                    break label0;
                }
                timescale = firstSeqParameterSet.vuiParams.time_scale >> 1;
                frametick = firstSeqParameterSet.vuiParams.num_units_in_tick;
                if (timescale == 0L || frametick == 0)
                {
                    System.err.println((new StringBuilder("Warning: vuiParams contain invalid values: time_scale: ")).append(timescale).append(" and frame_tick: ").append(frametick).append(". Setting frame rate to 25fps").toString());
                    timescale = 0x15f90L;
                    frametick = 3600;
                }
            }
            return;
        }
        System.err.println("Warning: Can't determine frame rate. Guessing 25 fps");
        timescale = 0x15f90L;
        frametick = 3600;
    }

    private void createSample(List list)
    {
        boolean flag = false;
        int i = 22;
        Object obj = list.iterator();
        boolean flag1 = false;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                if (flag1)
                {
                    i = 38;
                }
                int j = i;
                if ((new SliceHeader(cleanBuffer(new ByteBufferBackedInputStream((ByteBuffer)list.get(list.size() - 1))), spsIdToSps, ppsIdToPps, flag1)).slice_type == SliceHeader.SliceType.B)
                {
                    j = i + 4;
                }
                obj = createSampleObject(list);
                list.clear();
                if (seiMessage == null || seiMessage.n_frames == 0)
                {
                    frameNrInGop = 0;
                }
                if (seiMessage != null && seiMessage.clock_timestamp_flag)
                {
                    i = seiMessage.n_frames - frameNrInGop;
                } else
                {
                    i = ((flag) ? 1 : 0);
                    if (seiMessage != null)
                    {
                        i = ((flag) ? 1 : 0);
                        if (seiMessage.removal_delay_flag)
                        {
                            i = seiMessage.dpb_removal_delay / 2;
                        }
                    }
                }
                ctts.add(new com.coremedia.iso.boxes.CompositionTimeToSample.Entry(1, i * frametick));
                sdtp.add(new com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry(j));
                frameNrInGop = frameNrInGop + 1;
                samples.add(obj);
                if (flag1)
                {
                    stss.add(Integer.valueOf(samples.size()));
                }
                return;
            }
            if ((((ByteBuffer)((Iterator) (obj)).next()).get(0) & 0x1f) == 5)
            {
                flag1 = true;
            }
        } while (true);
    }

    private ByteBuffer findNextNal(LookAhead lookahead)
    {
_L5:
        if (!lookahead.nextThreeEquals001()) goto _L2; else goto _L1
_L1:
        lookahead.discardNext3AndMarkStart();
_L3:
        if (lookahead.nextThreeEquals000or001orEof())
        {
            return lookahead.getNal();
        }
        break MISSING_BLOCK_LABEL_30;
_L2:
        lookahead.discardByte();
        continue; /* Loop/switch isn't completed */
        lookahead.discardByte();
          goto _L3
        lookahead;
        return null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void handlePPS(ByteBuffer bytebuffer)
    {
        Object obj = new ByteBufferBackedInputStream(bytebuffer);
        ((InputStream) (obj)).read();
        obj = PictureParameterSet.read(((InputStream) (obj)));
        if (firstPictureParameterSet == null)
        {
            firstPictureParameterSet = ((PictureParameterSet) (obj));
        }
        bytebuffer = toArray((ByteBuffer)bytebuffer.rewind());
        byte abyte0[] = (byte[])ppsIdToPpsBytes.get(Integer.valueOf(((PictureParameterSet) (obj)).pic_parameter_set_id));
        String s = Hex.encodeHex(bytebuffer);
        System.err.println(s);
        if (abyte0 != null && !Arrays.equals(abyte0, bytebuffer))
        {
            throw new RuntimeException("OMG - I got two SPS with same ID but different settings! (AVC3 is the solution)");
        }
        if (abyte0 == null)
        {
            pictureParameterRangeMap.put(Integer.valueOf(samples.size()), bytebuffer);
        }
        ppsIdToPpsBytes.put(Integer.valueOf(((PictureParameterSet) (obj)).pic_parameter_set_id), bytebuffer);
        ppsIdToPps.put(Integer.valueOf(((PictureParameterSet) (obj)).pic_parameter_set_id), obj);
    }

    private void handleSPS(ByteBuffer bytebuffer)
    {
        Object obj = cleanBuffer(new ByteBufferBackedInputStream(bytebuffer));
        ((InputStream) (obj)).read();
        obj = SeqParameterSet.read(((InputStream) (obj)));
        if (firstSeqParameterSet == null)
        {
            firstSeqParameterSet = ((SeqParameterSet) (obj));
            configureFramerate();
        }
        bytebuffer = toArray((ByteBuffer)bytebuffer.rewind());
        String s = Hex.encodeHex(bytebuffer);
        System.err.println(s);
        byte abyte0[] = (byte[])spsIdToSpsBytes.get(Integer.valueOf(((SeqParameterSet) (obj)).seq_parameter_set_id));
        if (abyte0 != null && !Arrays.equals(abyte0, bytebuffer))
        {
            throw new RuntimeException("OMG - I got two SPS with same ID but different settings!");
        }
        if (abyte0 != null)
        {
            seqParameterRangeMap.put(Integer.valueOf(samples.size()), bytebuffer);
        }
        spsIdToSpsBytes.put(Integer.valueOf(((SeqParameterSet) (obj)).seq_parameter_set_id), bytebuffer);
        spsIdToSps.put(Integer.valueOf(((SeqParameterSet) (obj)).seq_parameter_set_id), obj);
    }

    private void parse(LookAhead lookahead)
    {
        byte byte3 = 0;
        ctts = new LinkedList();
        sdtp = new LinkedList();
        stss = new LinkedList();
        samples = new LinkedList();
        if (!readSamples(lookahead))
        {
            throw new IOException();
        }
        if (!readVariables())
        {
            throw new IOException();
        }
        sampleDescriptionBox = new SampleDescriptionBox();
        lookahead = new VisualSampleEntry("avc1");
        lookahead.setDataReferenceIndex(1);
        lookahead.setDepth(24);
        lookahead.setFrameCount(1);
        lookahead.setHorizresolution(72D);
        lookahead.setVertresolution(72D);
        lookahead.setWidth(width);
        lookahead.setHeight(height);
        lookahead.setCompressorname("AVC Coding");
        AvcConfigurationBox avcconfigurationbox = new AvcConfigurationBox();
        avcconfigurationbox.setSequenceParameterSets(new ArrayList(spsIdToSpsBytes.values()));
        avcconfigurationbox.setPictureParameterSets(new ArrayList(ppsIdToPpsBytes.values()));
        avcconfigurationbox.setAvcLevelIndication(firstSeqParameterSet.level_idc);
        avcconfigurationbox.setAvcProfileIndication(firstSeqParameterSet.profile_idc);
        avcconfigurationbox.setBitDepthLumaMinus8(firstSeqParameterSet.bit_depth_luma_minus8);
        avcconfigurationbox.setBitDepthChromaMinus8(firstSeqParameterSet.bit_depth_chroma_minus8);
        avcconfigurationbox.setChromaFormat(firstSeqParameterSet.chroma_format_idc.getId());
        avcconfigurationbox.setConfigurationVersion(1);
        avcconfigurationbox.setLengthSizeMinusOne(3);
        char c;
        byte byte0;
        byte byte1;
        byte byte2;
        if (firstSeqParameterSet.constraint_set_0_flag)
        {
            c = '\200';
        } else
        {
            c = '\0';
        }
        if (firstSeqParameterSet.constraint_set_1_flag)
        {
            byte0 = 64;
        } else
        {
            byte0 = 0;
        }
        if (firstSeqParameterSet.constraint_set_2_flag)
        {
            byte1 = 32;
        } else
        {
            byte1 = 0;
        }
        if (firstSeqParameterSet.constraint_set_3_flag)
        {
            byte2 = 16;
        } else
        {
            byte2 = 0;
        }
        if (firstSeqParameterSet.constraint_set_4_flag)
        {
            byte3 = 8;
        }
        avcconfigurationbox.setProfileCompatibility(byte2 + (byte0 + c + byte1) + byte3 + (int)(firstSeqParameterSet.reserved_zero_2bits & 3L));
        lookahead.addBox(avcconfigurationbox);
        sampleDescriptionBox.addBox(lookahead);
        trackMetaData.setCreationTime(new Date());
        trackMetaData.setModificationTime(new Date());
        trackMetaData.setLanguage(lang);
        trackMetaData.setTimescale(timescale);
        trackMetaData.setWidth(width);
        trackMetaData.setHeight(height);
    }

    private boolean readSamples(LookAhead lookahead)
    {
        _cls1FirstVclNalDetector _lcls1firstvclnaldetector;
        ArrayList arraylist;
        arraylist = new ArrayList();
        _lcls1firstvclnaldetector = null;
_L5:
        ByteBuffer bytebuffer = findNextNal(lookahead);
        if (bytebuffer != null) goto _L2; else goto _L1
_L1:
        createSample(arraylist);
        decodingTimes = new long[samples.size()];
        Arrays.fill(decodingTimes, frametick);
        return true;
_L2:
        byte byte0 = bytebuffer.get(0);
        int i = byte0 & 0x1f;
        switch (i)
        {
        default:
            System.err.println((new StringBuilder("Unknown NAL unit type: ")).append(i).toString());
            continue; /* Loop/switch isn't completed */

        case 10: // '\n'
        case 11: // '\013'
            break;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            _cls1FirstVclNalDetector _lcls1firstvclnaldetector6 = new _cls1FirstVclNalDetector(bytebuffer, byte0 >> 5 & 3, i);
            _cls1FirstVclNalDetector _lcls1firstvclnaldetector1;
            if (_lcls1firstvclnaldetector == null)
            {
                _lcls1firstvclnaldetector1 = _lcls1firstvclnaldetector6;
            } else
            {
                _lcls1firstvclnaldetector1 = _lcls1firstvclnaldetector;
                if (_lcls1firstvclnaldetector.isFirstInNew(_lcls1firstvclnaldetector6))
                {
                    createSample(arraylist);
                    _lcls1firstvclnaldetector1 = _lcls1firstvclnaldetector6;
                }
            }
            arraylist.add((ByteBuffer)bytebuffer.rewind());
            _lcls1firstvclnaldetector = _lcls1firstvclnaldetector1;
            continue; /* Loop/switch isn't completed */

        case 6: // '\006'
            _cls1FirstVclNalDetector _lcls1firstvclnaldetector2 = _lcls1firstvclnaldetector;
            if (_lcls1firstvclnaldetector != null)
            {
                System.err.println("Wrapping up cause of SEI after vcl marks new sample");
                createSample(arraylist);
                _lcls1firstvclnaldetector2 = null;
            }
            seiMessage = new SEIMessage(cleanBuffer(new ByteBufferBackedInputStream(bytebuffer)), firstSeqParameterSet);
            arraylist.add(bytebuffer);
            _lcls1firstvclnaldetector = _lcls1firstvclnaldetector2;
            continue; /* Loop/switch isn't completed */

        case 9: // '\t'
            _cls1FirstVclNalDetector _lcls1firstvclnaldetector3 = _lcls1firstvclnaldetector;
            if (_lcls1firstvclnaldetector != null)
            {
                createSample(arraylist);
                _lcls1firstvclnaldetector3 = null;
            }
            arraylist.add(bytebuffer);
            _lcls1firstvclnaldetector = _lcls1firstvclnaldetector3;
            continue; /* Loop/switch isn't completed */

        case 7: // '\007'
            _cls1FirstVclNalDetector _lcls1firstvclnaldetector4 = _lcls1firstvclnaldetector;
            if (_lcls1firstvclnaldetector != null)
            {
                createSample(arraylist);
                _lcls1firstvclnaldetector4 = null;
            }
            handleSPS((ByteBuffer)bytebuffer.rewind());
            _lcls1firstvclnaldetector = _lcls1firstvclnaldetector4;
            continue; /* Loop/switch isn't completed */

        case 8: // '\b'
            _cls1FirstVclNalDetector _lcls1firstvclnaldetector5 = _lcls1firstvclnaldetector;
            if (_lcls1firstvclnaldetector != null)
            {
                createSample(arraylist);
                _lcls1firstvclnaldetector5 = null;
            }
            handlePPS((ByteBuffer)bytebuffer.rewind());
            _lcls1firstvclnaldetector = _lcls1firstvclnaldetector5;
            continue; /* Loop/switch isn't completed */
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (true) goto _L5; else goto _L4
_L4:
    }

    private boolean readVariables()
    {
        width = (firstSeqParameterSet.pic_width_in_mbs_minus1 + 1) * 16;
        int i = 2;
        if (firstSeqParameterSet.frame_mbs_only_flag)
        {
            i = 1;
        }
        height = (firstSeqParameterSet.pic_height_in_map_units_minus1 + 1) * 16 * i;
        if (firstSeqParameterSet.frame_cropping_flag)
        {
            int j = 0;
            if (!firstSeqParameterSet.residual_color_transform_flag)
            {
                j = firstSeqParameterSet.chroma_format_idc.getId();
            }
            if (j != 0)
            {
                j = firstSeqParameterSet.chroma_format_idc.getSubWidth();
                i *= firstSeqParameterSet.chroma_format_idc.getSubHeight();
            } else
            {
                j = 1;
            }
            width = width - j * (firstSeqParameterSet.frame_crop_left_offset + firstSeqParameterSet.frame_crop_right_offset);
            height = height - i * (firstSeqParameterSet.frame_crop_top_offset + firstSeqParameterSet.frame_crop_bottom_offset);
        }
        return true;
    }

    static byte[] toArray(ByteBuffer bytebuffer)
    {
        bytebuffer = bytebuffer.duplicate();
        byte abyte0[] = new byte[bytebuffer.remaining()];
        bytebuffer.get(abyte0, 0, abyte0.length);
        return abyte0;
    }

    protected InputStream cleanBuffer(InputStream inputstream)
    {
        return new CleanInputStream(inputstream);
    }

    public void close()
    {
        dataSource.close();
    }

    protected Sample createSampleObject(List list)
    {
        byte abyte0[];
        ByteBuffer abytebuffer[];
        Iterator iterator;
        abyte0 = new byte[list.size() * 4];
        abytebuffer = ByteBuffer.wrap(abyte0);
        iterator = list.iterator();
_L3:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        int i;
        abytebuffer = new ByteBuffer[list.size() * 2];
        i = 0;
_L4:
        if (i >= list.size())
        {
            return new SampleImpl(abytebuffer);
        }
        break MISSING_BLOCK_LABEL_90;
_L2:
        abytebuffer.putInt(((ByteBuffer)iterator.next()).remaining());
          goto _L3
        abytebuffer[i * 2] = ByteBuffer.wrap(abyte0, i * 4, 4);
        abytebuffer[i * 2 + 1] = (ByteBuffer)list.get(i);
        i++;
          goto _L4
    }

    public List getCompositionTimeEntries()
    {
        return ctts;
    }

    public String getHandler()
    {
        return "vide";
    }

    public List getSampleDependencies()
    {
        return sdtp;
    }

    public SampleDescriptionBox getSampleDescriptionBox()
    {
        return sampleDescriptionBox;
    }

    public long[] getSampleDurations()
    {
        return decodingTimes;
    }

    public List getSamples()
    {
        return samples;
    }

    public long[] getSyncSamples()
    {
        long al[] = new long[stss.size()];
        int i = 0;
        do
        {
            if (i >= stss.size())
            {
                return al;
            }
            al[i] = ((Integer)stss.get(i)).intValue();
            i++;
        } while (true);
    }

    public TrackMetaData getTrackMetaData()
    {
        return trackMetaData;
    }

    public byte[] toByteArray(InputStream inputstream)
    {
        byte abyte0[];
        byte abyte1[];
        abyte0 = new byte[0];
        abyte1 = new byte[32];
_L1:
        int i;
        try
        {
            i = inputstream.read(abyte1);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new RuntimeException(inputstream);
        }
        if (i == -1)
        {
            return abyte0;
        }
        Arrays.copyOf(abyte0, i + 0);
        System.arraycopy(abyte1, 0, abyte0, 0 - i - 1, i);
          goto _L1
    }



    private class _cls1FirstVclNalDetector
    {

        boolean bottom_field_flag;
        int delta_pic_order_cnt_0;
        int delta_pic_order_cnt_1;
        int delta_pic_order_cnt_bottom;
        boolean field_pic_flag;
        int frame_num;
        boolean idrPicFlag;
        int idr_pic_id;
        int nal_ref_idc;
        int pic_order_cnt_lsb;
        int pic_order_cnt_type;
        int pic_parameter_set_id;
        final H264TrackImpl this$0;

        boolean isFirstInNew(_cls1FirstVclNalDetector _pcls1firstvclnaldetector)
        {
            while (_pcls1firstvclnaldetector.frame_num != frame_num || _pcls1firstvclnaldetector.pic_parameter_set_id != pic_parameter_set_id || _pcls1firstvclnaldetector.field_pic_flag != field_pic_flag || _pcls1firstvclnaldetector.field_pic_flag && _pcls1firstvclnaldetector.bottom_field_flag != bottom_field_flag || _pcls1firstvclnaldetector.nal_ref_idc != nal_ref_idc || _pcls1firstvclnaldetector.pic_order_cnt_type == 0 && pic_order_cnt_type == 0 && (_pcls1firstvclnaldetector.pic_order_cnt_lsb != pic_order_cnt_lsb || _pcls1firstvclnaldetector.delta_pic_order_cnt_bottom != delta_pic_order_cnt_bottom) || _pcls1firstvclnaldetector.pic_order_cnt_type == 1 && pic_order_cnt_type == 1 && (_pcls1firstvclnaldetector.delta_pic_order_cnt_0 != delta_pic_order_cnt_0 || _pcls1firstvclnaldetector.delta_pic_order_cnt_1 != delta_pic_order_cnt_1) || _pcls1firstvclnaldetector.idrPicFlag != idrPicFlag || _pcls1firstvclnaldetector.idrPicFlag && idrPicFlag && _pcls1firstvclnaldetector.idr_pic_id != idr_pic_id) 
            {
                return true;
            }
            return false;
        }

        public _cls1FirstVclNalDetector(ByteBuffer bytebuffer, int i, int j)
        {
            this$0 = H264TrackImpl.this;
            super();
            bytebuffer = cleanBuffer(new ByteBufferBackedInputStream(bytebuffer));
            Map map = spsIdToSps;
            Map map1 = ppsIdToPps;
            boolean flag;
            if (j == 5)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            bytebuffer = new SliceHeader(bytebuffer, map, map1, flag);
            frame_num = ((SliceHeader) (bytebuffer)).frame_num;
            pic_parameter_set_id = ((SliceHeader) (bytebuffer)).pic_parameter_set_id;
            field_pic_flag = ((SliceHeader) (bytebuffer)).field_pic_flag;
            bottom_field_flag = ((SliceHeader) (bytebuffer)).bottom_field_flag;
            nal_ref_idc = i;
            pic_order_cnt_type = ((SeqParameterSet)spsIdToSps.get(Integer.valueOf(((PictureParameterSet)ppsIdToPps.get(Integer.valueOf(((SliceHeader) (bytebuffer)).pic_parameter_set_id))).seq_parameter_set_id))).pic_order_cnt_type;
            delta_pic_order_cnt_bottom = ((SliceHeader) (bytebuffer)).delta_pic_order_cnt_bottom;
            pic_order_cnt_lsb = ((SliceHeader) (bytebuffer)).pic_order_cnt_lsb;
            delta_pic_order_cnt_0 = ((SliceHeader) (bytebuffer)).delta_pic_order_cnt_0;
            delta_pic_order_cnt_1 = ((SliceHeader) (bytebuffer)).delta_pic_order_cnt_1;
            idr_pic_id = ((SliceHeader) (bytebuffer)).idr_pic_id;
        }
    }

}
