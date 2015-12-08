// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.googlecode.mp4parser.h264.model.HRDParameters;
import com.googlecode.mp4parser.h264.model.SeqParameterSet;
import com.googlecode.mp4parser.h264.model.VUIParameters;
import com.googlecode.mp4parser.h264.read.CAVLCReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.logging.Logger;

// Referenced classes of package com.googlecode.mp4parser.authoring.tracks:
//            H264TrackImpl

public class payloadSize
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

    public (InputStream inputstream, SeqParameterSet seqparameterset)
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
    //                   3 438
    //                   4 438
    //                   5 444
    //                   6 444
    //                   7 438
    //                   8 444;
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
        H264TrackImpl.access$0().fine(toString());
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
