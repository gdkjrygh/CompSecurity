// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.h264.model;


// Referenced classes of package com.googlecode.mp4parser.h264.model:
//            VUIParameters

public static class 
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

    public ()
    {
    }
}
