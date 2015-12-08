// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.h264.model;


// Referenced classes of package com.googlecode.mp4parser.h264.model:
//            AspectRatio, HRDParameters

public class VUIParameters
{
    public static class BitstreamRestriction
    {

        public int log2_max_mv_length_horizontal;
        public int log2_max_mv_length_vertical;
        public int max_bits_per_mb_denom;
        public int max_bytes_per_pic_denom;
        public int max_dec_frame_buffering;
        public boolean motion_vectors_over_pic_boundaries_flag;
        public int num_reorder_frames;

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder("BitstreamRestriction{");
            stringbuilder.append("motion_vectors_over_pic_boundaries_flag=").append(motion_vectors_over_pic_boundaries_flag);
            stringbuilder.append(", max_bytes_per_pic_denom=").append(max_bytes_per_pic_denom);
            stringbuilder.append(", max_bits_per_mb_denom=").append(max_bits_per_mb_denom);
            stringbuilder.append(", log2_max_mv_length_horizontal=").append(log2_max_mv_length_horizontal);
            stringbuilder.append(", log2_max_mv_length_vertical=").append(log2_max_mv_length_vertical);
            stringbuilder.append(", num_reorder_frames=").append(num_reorder_frames);
            stringbuilder.append(", max_dec_frame_buffering=").append(max_dec_frame_buffering);
            stringbuilder.append('}');
            return stringbuilder.toString();
        }

        public BitstreamRestriction()
        {
        }
    }


    public AspectRatio aspect_ratio;
    public boolean aspect_ratio_info_present_flag;
    public BitstreamRestriction bitstreamRestriction;
    public boolean chroma_loc_info_present_flag;
    public int chroma_sample_loc_type_bottom_field;
    public int chroma_sample_loc_type_top_field;
    public boolean colour_description_present_flag;
    public int colour_primaries;
    public boolean fixed_frame_rate_flag;
    public boolean low_delay_hrd_flag;
    public int matrix_coefficients;
    public HRDParameters nalHRDParams;
    public int num_units_in_tick;
    public boolean overscan_appropriate_flag;
    public boolean overscan_info_present_flag;
    public boolean pic_struct_present_flag;
    public int sar_height;
    public int sar_width;
    public int time_scale;
    public boolean timing_info_present_flag;
    public int transfer_characteristics;
    public HRDParameters vclHRDParams;
    public int video_format;
    public boolean video_full_range_flag;
    public boolean video_signal_type_present_flag;

    public VUIParameters()
    {
    }

    public String toString()
    {
        return (new StringBuilder("VUIParameters{\naspect_ratio_info_present_flag=")).append(aspect_ratio_info_present_flag).append("\n, sar_width=").append(sar_width).append("\n, sar_height=").append(sar_height).append("\n, overscan_info_present_flag=").append(overscan_info_present_flag).append("\n, overscan_appropriate_flag=").append(overscan_appropriate_flag).append("\n, video_signal_type_present_flag=").append(video_signal_type_present_flag).append("\n, video_format=").append(video_format).append("\n, video_full_range_flag=").append(video_full_range_flag).append("\n, colour_description_present_flag=").append(colour_description_present_flag).append("\n, colour_primaries=").append(colour_primaries).append("\n, transfer_characteristics=").append(transfer_characteristics).append("\n, matrix_coefficients=").append(matrix_coefficients).append("\n, chroma_loc_info_present_flag=").append(chroma_loc_info_present_flag).append("\n, chroma_sample_loc_type_top_field=").append(chroma_sample_loc_type_top_field).append("\n, chroma_sample_loc_type_bottom_field=").append(chroma_sample_loc_type_bottom_field).append("\n, timing_info_present_flag=").append(timing_info_present_flag).append("\n, num_units_in_tick=").append(num_units_in_tick).append("\n, time_scale=").append(time_scale).append("\n, fixed_frame_rate_flag=").append(fixed_frame_rate_flag).append("\n, low_delay_hrd_flag=").append(low_delay_hrd_flag).append("\n, pic_struct_present_flag=").append(pic_struct_present_flag).append("\n, nalHRDParams=").append(nalHRDParams).append("\n, vclHRDParams=").append(vclHRDParams).append("\n, bitstreamRestriction=").append(bitstreamRestriction).append("\n, aspect_ratio=").append(aspect_ratio).append("\n}").toString();
    }
}
