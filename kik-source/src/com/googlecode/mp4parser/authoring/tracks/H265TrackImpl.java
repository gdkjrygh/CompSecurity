// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.IsoTypeReader;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.FileDataSourceImpl;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.h264.read.CAVLCReader;
import com.googlecode.mp4parser.util.ByteBufferByteChannel;
import com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord;
import java.io.EOFException;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public class H265TrackImpl
{
    class LookAhead
    {

        ByteBuffer buffer;
        long bufferStartPos;
        DataSource dataSource;
        int inBufferPos;
        long start;
        final H265TrackImpl this$0;

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
            buffer = dataSource.map(bufferStartPos, Math.min(dataSource.size() - bufferStartPos, 0x100000L));
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
            if (bufferStartPos + (long)inBufferPos == dataSource.size())
            {
                throw new EOFException();
            } else
            {
                throw new RuntimeException("buffer repositioning require");
            }
        }

        LookAhead(DataSource datasource)
        {
            this$0 = H265TrackImpl.this;
            super();
            bufferStartPos = 0L;
            inBufferPos = 0;
            dataSource = datasource;
            fillBuffer();
        }
    }

    public static class NalUnitHeader
    {

        int forbiddenZeroFlag;
        int nalUnitType;
        int nuhLayerId;
        int nuhTemporalIdPlusOne;

        public NalUnitHeader()
        {
        }
    }

    public static final class PARSE_STATE extends Enum
    {

        public static final PARSE_STATE AUD_SEI_SLICE;
        private static final PARSE_STATE ENUM$VALUES[];
        public static final PARSE_STATE SEI_SLICE;
        public static final PARSE_STATE SLICE_OES_EOB;

        public static PARSE_STATE valueOf(String s)
        {
            return (PARSE_STATE)Enum.valueOf(com/googlecode/mp4parser/authoring/tracks/H265TrackImpl$PARSE_STATE, s);
        }

        public static PARSE_STATE[] values()
        {
            PARSE_STATE aparse_state[] = ENUM$VALUES;
            int i = aparse_state.length;
            PARSE_STATE aparse_state1[] = new PARSE_STATE[i];
            System.arraycopy(aparse_state, 0, aparse_state1, 0, i);
            return aparse_state1;
        }

        static 
        {
            AUD_SEI_SLICE = new PARSE_STATE("AUD_SEI_SLICE", 0);
            SEI_SLICE = new PARSE_STATE("SEI_SLICE", 1);
            SLICE_OES_EOB = new PARSE_STATE("SLICE_OES_EOB", 2);
            ENUM$VALUES = (new PARSE_STATE[] {
                AUD_SEI_SLICE, SEI_SLICE, SLICE_OES_EOB
            });
        }

        private PARSE_STATE(String s, int i)
        {
            super(s, i);
        }
    }


    public static final int AUD_NUT = 35;
    private static final int BLA_N_LP = 18;
    private static final int BLA_W_LP = 16;
    private static final int BLA_W_RADL = 17;
    private static final long BUFFER = 0x100000L;
    private static final int CRA_NUT = 21;
    private static final int IDR_N_LP = 20;
    private static final int IDR_W_RADL = 19;
    public static final int PPS_NUT = 34;
    public static final int PREFIX_SEI_NUT = 39;
    private static final int RADL_N = 6;
    private static final int RADL_R = 7;
    private static final int RASL_N = 8;
    private static final int RASL_R = 9;
    public static final int RSV_NVCL41 = 41;
    public static final int RSV_NVCL42 = 42;
    public static final int RSV_NVCL43 = 43;
    public static final int RSV_NVCL44 = 44;
    public static final int SPS_NUT = 33;
    private static final int STSA_N = 4;
    private static final int STSA_R = 5;
    private static final int TRAIL_N = 0;
    private static final int TRAIL_R = 1;
    private static final int TSA_N = 2;
    private static final int TSA_R = 3;
    public static final int UNSPEC48 = 48;
    public static final int UNSPEC49 = 49;
    public static final int UNSPEC50 = 50;
    public static final int UNSPEC51 = 51;
    public static final int UNSPEC52 = 52;
    public static final int UNSPEC53 = 53;
    public static final int UNSPEC54 = 54;
    public static final int UNSPEC55 = 55;
    public static final int VPS_NUT = 32;
    LinkedHashMap pictureParamterSets;
    List samples;
    LinkedHashMap sequenceParamterSets;
    List syncSamples;
    LinkedHashMap videoParamterSets;

    public H265TrackImpl(DataSource datasource)
    {
        ArrayList arraylist;
        int i;
        long l;
        videoParamterSets = new LinkedHashMap();
        sequenceParamterSets = new LinkedHashMap();
        pictureParamterSets = new LinkedHashMap();
        syncSamples = new ArrayList();
        samples = new ArrayList();
        datasource = new LookAhead(datasource);
        l = 1L;
        arraylist = new ArrayList();
        i = 0;
_L8:
        ByteBuffer bytebuffer;
        Object obj;
        bytebuffer = findNextNal(datasource);
        if (bytebuffer == null)
        {
            System.err.println("");
            datasource = new HevcDecoderConfigurationRecord();
            datasource.setArrays(getArrays());
            datasource.setAvgFrameRate(0);
            return;
        }
        obj = getNalUnitHeader(bytebuffer);
        ((NalUnitHeader) (obj)).nalUnitType;
        JVM INSTR tableswitch 32 34: default 160
    //                   32 313
    //                   33 330
    //                   34 347;
           goto _L1 _L2 _L3 _L4
_L1:
        long l1;
        if (((NalUnitHeader) (obj)).nalUnitType < 32)
        {
            i = ((NalUnitHeader) (obj)).nalUnitType;
        }
        l1 = l;
        if (!isFirstOfAU(((NalUnitHeader) (obj)).nalUnitType, bytebuffer, arraylist)) goto _L6; else goto _L5
_L5:
        l1 = l;
        if (arraylist.isEmpty()) goto _L6; else goto _L7
_L7:
        System.err.println("##########################");
        obj = arraylist.iterator();
_L9:
        if (((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_364;
        }
        System.err.println("                          ##########################");
        samples.add(createSample(arraylist));
        arraylist.clear();
        l1 = l + 1L;
_L6:
        arraylist.add(bytebuffer);
        if (i >= 16 && i <= 21)
        {
            syncSamples.add(Long.valueOf(l1));
        }
        l = l1;
          goto _L8
_L2:
        videoParamterSets.put(Long.valueOf(l), bytebuffer);
          goto _L1
_L3:
        sequenceParamterSets.put(Long.valueOf(l), bytebuffer);
          goto _L1
_L4:
        pictureParamterSets.put(Long.valueOf(l), bytebuffer);
          goto _L1
        ByteBuffer bytebuffer1 = (ByteBuffer)((Iterator) (obj)).next();
        NalUnitHeader nalunitheader = getNalUnitHeader(bytebuffer1);
        System.err.println(String.format("type: %3d - layer: %3d - tempId: %3d - size: %3d", new Object[] {
            Integer.valueOf(nalunitheader.nalUnitType), Integer.valueOf(nalunitheader.nuhLayerId), Integer.valueOf(nalunitheader.nuhTemporalIdPlusOne), Integer.valueOf(bytebuffer1.limit())
        }));
          goto _L9
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

    private List getArrays()
    {
        com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord.Array array;
        Object obj;
        array = new com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord.Array();
        array.array_completeness = true;
        array.nal_unit_type = 32;
        array.nalUnits = new ArrayList();
        obj = videoParamterSets.values().iterator();
_L5:
        if (((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj = new com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord.Array();
        obj.array_completeness = true;
        obj.nal_unit_type = 33;
        obj.nalUnits = new ArrayList();
        obj1 = sequenceParamterSets.values().iterator();
_L6:
        if (((Iterator) (obj1)).hasNext()) goto _L4; else goto _L3
_L3:
        Object obj2;
        obj1 = new com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord.Array();
        obj1.array_completeness = true;
        obj1.nal_unit_type = 33;
        obj1.nalUnits = new ArrayList();
        obj2 = pictureParamterSets.values().iterator();
_L7:
        if (!((Iterator) (obj2)).hasNext())
        {
            return Arrays.asList(new com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord.Array[] {
                array, obj, obj1
            });
        }
        break MISSING_BLOCK_LABEL_274;
_L2:
        obj1 = (ByteBuffer)((Iterator) (obj)).next();
        obj2 = new byte[((ByteBuffer) (obj1)).limit()];
        ((ByteBuffer) (obj1)).position(0);
        ((ByteBuffer) (obj1)).get(((byte []) (obj2)));
        array.nalUnits.add(obj2);
          goto _L5
_L4:
        obj2 = (ByteBuffer)((Iterator) (obj1)).next();
        byte abyte0[] = new byte[((ByteBuffer) (obj2)).limit()];
        ((ByteBuffer) (obj2)).position(0);
        ((ByteBuffer) (obj2)).get(abyte0);
        ((com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord.Array) (obj)).nalUnits.add(abyte0);
          goto _L6
        ByteBuffer bytebuffer = (ByteBuffer)((Iterator) (obj2)).next();
        byte abyte1[] = new byte[bytebuffer.limit()];
        bytebuffer.position(0);
        bytebuffer.get(abyte1);
        ((com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord.Array) (obj1)).nalUnits.add(abyte1);
          goto _L7
    }

    private void hrd_parameters(boolean flag, int i, CAVLCReader cavlcreader)
    {
        int j = 0;
        boolean flag1;
        boolean flag2;
        if (flag)
        {
            flag2 = cavlcreader.readBool("nal_hrd_parameters_present_flag");
            flag1 = cavlcreader.readBool("vcl_hrd_parameters_present_flag");
            boolean aflag[];
            boolean aflag1[];
            boolean aflag2[];
            int ai[];
            int ai1[];
            if (flag2 || flag1)
            {
                flag = cavlcreader.readBool("sub_pic_hrd_params_present_flag");
                if (flag)
                {
                    cavlcreader.readU(8, "tick_divisor_minus2");
                    cavlcreader.readU(5, "du_cpb_removal_delay_increment_length_minus1");
                    cavlcreader.readBool("sub_pic_cpb_params_in_pic_timing_sei_flag");
                    cavlcreader.readU(5, "dpb_output_delay_du_length_minus1");
                }
                cavlcreader.readU(4, "bit_rate_scale");
                cavlcreader.readU(4, "cpb_size_scale");
                if (flag)
                {
                    cavlcreader.readU(4, "cpb_size_du_scale");
                }
                cavlcreader.readU(5, "initial_cpb_removal_delay_length_minus1");
                cavlcreader.readU(5, "au_cpb_removal_delay_length_minus1");
                cavlcreader.readU(5, "dpb_output_delay_length_minus1");
            } else
            {
                flag = false;
            }
        } else
        {
            flag = false;
            flag1 = false;
            flag2 = false;
        }
        aflag = new boolean[i];
        aflag1 = new boolean[i];
        aflag2 = new boolean[i];
        ai = new int[i];
        ai1 = new int[i];
        do
        {
            if (j > i)
            {
                return;
            }
            aflag[j] = cavlcreader.readBool((new StringBuilder("fixed_pic_rate_general_flag[")).append(j).append("]").toString());
            if (!aflag[j])
            {
                aflag1[j] = cavlcreader.readBool((new StringBuilder("fixed_pic_rate_within_cvs_flag[")).append(j).append("]").toString());
            }
            if (aflag1[j])
            {
                ai1[j] = cavlcreader.readUE((new StringBuilder("elemental_duration_in_tc_minus1[")).append(j).append("]").toString());
            } else
            {
                aflag2[j] = cavlcreader.readBool((new StringBuilder("low_delay_hrd_flag[")).append(j).append("]").toString());
            }
            if (!aflag2[j])
            {
                ai[j] = cavlcreader.readUE((new StringBuilder("cpb_cnt_minus1[")).append(j).append("]").toString());
            }
            if (flag2)
            {
                sub_layer_hrd_parameters(j, ai[j], flag, cavlcreader);
            }
            if (flag1)
            {
                sub_layer_hrd_parameters(j, ai[j], flag, cavlcreader);
            }
            j++;
        } while (true);
    }

    public static void main(String args[])
    {
        new H265TrackImpl(new FileDataSourceImpl("c:\\dev\\hevc\\surfing.265"));
    }

    protected Sample createSample(List list)
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

    public int getFrameRate(ByteBuffer bytebuffer)
    {
        Object obj;
        int ai[];
        int ai1[];
        int i;
        int j;
        int i1;
        bytebuffer = new CAVLCReader(Channels.newInputStream(new ByteBufferByteChannel((ByteBuffer)bytebuffer.position(0))));
        bytebuffer.readU(4, "vps_parameter_set_id");
        bytebuffer.readU(2, "vps_reserved_three_2bits");
        bytebuffer.readU(6, "vps_max_layers_minus1");
        i = bytebuffer.readU(3, "vps_max_sub_layers_minus1");
        bytebuffer.readBool("vps_temporal_id_nesting_flag");
        bytebuffer.readU(16, "vps_reserved_0xffff_16bits");
        profile_tier_level(i, bytebuffer);
        boolean flag = bytebuffer.readBool("vps_sub_layer_ordering_info_present_flag");
        int k;
        int j1;
        if (flag)
        {
            j = 0;
        } else
        {
            j = i;
        }
        obj = new int[j];
        if (flag)
        {
            j = 0;
        } else
        {
            j = i;
        }
        ai = new int[j];
        if (flag)
        {
            j = 0;
        } else
        {
            j = i;
        }
        ai1 = new int[j];
        if (flag)
        {
            j = 0;
        } else
        {
            j = i;
        }
_L7:
        if (j <= i) goto _L2; else goto _L1
_L1:
        i1 = bytebuffer.readU(6, "vps_max_layer_id");
        j1 = bytebuffer.readUE("vps_num_layer_sets_minus1");
        obj = (boolean[][])Array.newInstance(Boolean.TYPE, new int[] {
            j1, i1
        });
        j = 1;
_L8:
        if (j <= j1) goto _L4; else goto _L3
_L3:
        if (!bytebuffer.readBool("vps_timing_info_present_flag")) goto _L6; else goto _L5
_L5:
        bytebuffer.readU(32, "vps_num_units_in_tick");
        bytebuffer.readU(32, "vps_time_scale");
        if (bytebuffer.readBool("vps_poc_proportional_to_timing_flag"))
        {
            bytebuffer.readUE("vps_num_ticks_poc_diff_one_minus1");
        }
        k = bytebuffer.readUE("vps_num_hrd_parameters");
        obj = new int[k];
        ai = new boolean[k];
        j = 0;
_L10:
        if (j < k)
        {
            break MISSING_BLOCK_LABEL_514;
        }
_L6:
        if (bytebuffer.readBool("vps_extension_flag"))
        {
            int l;
            for (; bytebuffer.moreRBSPData(); bytebuffer.readBool("vps_extension_data_flag"))
            {
                break MISSING_BLOCK_LABEL_610;
            }

        }
        bytebuffer.readTrailingBits();
        return 0;
_L2:
        obj[j] = bytebuffer.readUE((new StringBuilder("vps_max_dec_pic_buffering_minus1[")).append(j).append("]").toString());
        ai[j] = bytebuffer.readUE((new StringBuilder("vps_max_dec_pic_buffering_minus1[")).append(j).append("]").toString());
        ai1[j] = bytebuffer.readUE((new StringBuilder("vps_max_dec_pic_buffering_minus1[")).append(j).append("]").toString());
        j++;
          goto _L7
_L4:
        l = 0;
_L9:
label0:
        {
            if (l <= i1)
            {
                break label0;
            }
            j++;
        }
          goto _L8
        obj[j][l] = bytebuffer.readBool((new StringBuilder("layer_id_included_flag[")).append(j).append("][").append(l).append("]").toString());
        l++;
          goto _L9
        obj[j] = bytebuffer.readUE((new StringBuilder("hrd_layer_set_idx[")).append(j).append("]").toString());
        if (j > 0)
        {
            ai[j] = bytebuffer.readBool((new StringBuilder("cprms_present_flag[")).append(j).append("]").toString());
        } else
        {
            ai[0] = 1;
        }
        hrd_parameters(ai[j], i, bytebuffer);
        j++;
          goto _L10
    }

    public NalUnitHeader getNalUnitHeader(ByteBuffer bytebuffer)
    {
        bytebuffer.position(0);
        int i = IsoTypeReader.readUInt16(bytebuffer);
        bytebuffer = new NalUnitHeader();
        bytebuffer.forbiddenZeroFlag = (0x8000 & i) >> 15;
        bytebuffer.nalUnitType = (i & 0x7e00) >> 9;
        bytebuffer.nuhLayerId = (i & 0x1f8) >> 3;
        bytebuffer.nuhTemporalIdPlusOne = i & 7;
        return bytebuffer;
    }

    boolean isFirstOfAU(int i, ByteBuffer bytebuffer, List list)
    {
        boolean flag;
        if (list.isEmpty())
        {
            return true;
        }
        if (getNalUnitHeader((ByteBuffer)list.get(list.size() - 1)).nalUnitType <= 31)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i;
        JVM INSTR tableswitch 32 55: default 156
    //                   32 268
    //                   33 268
    //                   34 268
    //                   35 268
    //                   36 156
    //                   37 156
    //                   38 156
    //                   39 268
    //                   40 156
    //                   41 268
    //                   42 268
    //                   43 268
    //                   44 268
    //                   45 156
    //                   46 156
    //                   47 156
    //                   48 268
    //                   49 268
    //                   50 268
    //                   51 268
    //                   52 268
    //                   53 268
    //                   54 268
    //                   55 268;
           goto _L1 _L2 _L2 _L2 _L2 _L1 _L1 _L1 _L2 _L1 _L2 _L2 _L2 _L2 _L1 _L1 _L1 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2
_L1:
        switch (i)
        {
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        default:
            return false;

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
            list = new byte[50];
            break;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (!flag) goto _L1; else goto _L3
_L3:
        return true;
        bytebuffer.position(0);
        bytebuffer.get(list);
        bytebuffer.position(2);
        i = IsoTypeReader.readUInt8(bytebuffer);
        return flag && (i & 0x80) > 0;
    }

    public void profile_tier_level(int i, CAVLCReader cavlcreader)
    {
        boolean aflag[];
        int j;
        cavlcreader.readU(2, "general_profile_space ");
        cavlcreader.readBool("general_tier_flag");
        cavlcreader.readU(5, "general_profile_idc");
        aflag = new boolean[32];
        j = 0;
_L9:
        if (j < 32) goto _L2; else goto _L1
_L1:
        boolean aflag1[];
        cavlcreader.readBool("general_progressive_source_flag");
        cavlcreader.readBool("general_interlaced_source_flag");
        cavlcreader.readBool("general_non_packed_constraint_flag");
        cavlcreader.readBool("general_frame_only_constraint_flag");
        cavlcreader.readU(44, "general_reserved_zero_44bits");
        cavlcreader.readU(8, "general_level_idc");
        aflag = new boolean[i];
        aflag1 = new boolean[i];
        j = 0;
_L10:
        if (j < i) goto _L4; else goto _L3
_L3:
        if (i <= 0) goto _L6; else goto _L5
_L5:
        j = i;
_L11:
        if (j < 8) goto _L7; else goto _L6
_L6:
        int ai[];
        boolean aflag2[];
        int ai1[];
        boolean aflag3[][];
        boolean aflag4[];
        boolean aflag5[];
        boolean aflag6[];
        boolean aflag7[];
        int ai2[];
        ai = new int[i];
        aflag2 = new boolean[i];
        ai1 = new int[i];
        aflag3 = (boolean[][])Array.newInstance(Boolean.TYPE, new int[] {
            i, 32
        });
        aflag4 = new boolean[i];
        aflag5 = new boolean[i];
        aflag6 = new boolean[i];
        aflag7 = new boolean[i];
        ai2 = new int[i];
        j = 0;
_L14:
        if (j >= i)
        {
            return;
        }
          goto _L8
_L2:
        aflag[j] = cavlcreader.readBool((new StringBuilder("general_profile_compatibility_flag[")).append(j).append("]").toString());
        j++;
          goto _L9
_L4:
        aflag[j] = cavlcreader.readBool((new StringBuilder("sub_layer_profile_present_flag[")).append(j).append("]").toString());
        aflag1[j] = cavlcreader.readBool((new StringBuilder("sub_layer_level_present_flag[")).append(j).append("]").toString());
        j++;
          goto _L10
_L7:
        cavlcreader.readU(2, "reserved_zero_2bits");
        j++;
          goto _L11
_L8:
        if (!aflag[j]) goto _L13; else goto _L12
_L12:
        int k;
        ai[j] = cavlcreader.readU(2, (new StringBuilder("sub_layer_profile_space[")).append(j).append("]").toString());
        aflag2[j] = cavlcreader.readBool((new StringBuilder("sub_layer_tier_flag[")).append(j).append("]").toString());
        ai1[j] = cavlcreader.readU(5, (new StringBuilder("sub_layer_profile_idc[")).append(j).append("]").toString());
        k = 0;
_L15:
        if (k < 32)
        {
            break MISSING_BLOCK_LABEL_622;
        }
        aflag4[j] = cavlcreader.readBool((new StringBuilder("sub_layer_progressive_source_flag[")).append(j).append("]").toString());
        aflag5[j] = cavlcreader.readBool((new StringBuilder("sub_layer_interlaced_source_flag[")).append(j).append("]").toString());
        aflag6[j] = cavlcreader.readBool((new StringBuilder("sub_layer_non_packed_constraint_flag[")).append(j).append("]").toString());
        aflag7[j] = cavlcreader.readBool((new StringBuilder("sub_layer_frame_only_constraint_flag[")).append(j).append("]").toString());
        cavlcreader.readNBit(44, "reserved");
_L13:
        if (aflag1[j])
        {
            ai2[j] = cavlcreader.readU(8, "sub_layer_level_idc");
        }
        j++;
          goto _L14
        aflag3[j][k] = cavlcreader.readBool((new StringBuilder("sub_layer_profile_compatibility_flag[")).append(j).append("][").append(k).append("]").toString());
        k++;
          goto _L15
    }

    void sub_layer_hrd_parameters(int i, int j, boolean flag, CAVLCReader cavlcreader)
    {
        int ai[] = new int[j];
        int ai1[] = new int[j];
        int ai2[] = new int[j];
        int ai3[] = new int[j];
        boolean aflag[] = new boolean[j];
        i = 0;
        do
        {
            if (i > j)
            {
                return;
            }
            ai[i] = cavlcreader.readUE((new StringBuilder("bit_rate_value_minus1[")).append(i).append("]").toString());
            ai1[i] = cavlcreader.readUE((new StringBuilder("cpb_size_value_minus1[")).append(i).append("]").toString());
            if (flag)
            {
                ai2[i] = cavlcreader.readUE((new StringBuilder("cpb_size_du_value_minus1[")).append(i).append("]").toString());
                ai3[i] = cavlcreader.readUE((new StringBuilder("bit_rate_du_value_minus1[")).append(i).append("]").toString());
            }
            aflag[i] = cavlcreader.readBool((new StringBuilder("cbr_flag[")).append(i).append("]").toString());
            i++;
        } while (true);
    }
}
