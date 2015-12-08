// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.h264.model;


// Referenced classes of package com.googlecode.mp4parser.h264.model:
//            PictureParameterSet, ScalingMatrix

public static class scalindMatrix
{

    public boolean pic_scaling_list_present_flag[];
    public ScalingMatrix scalindMatrix;
    public int second_chroma_qp_index_offset;
    public boolean transform_8x8_mode_flag;

    public String toString()
    {
        return (new StringBuilder("PPSExt{transform_8x8_mode_flag=")).append(transform_8x8_mode_flag).append(", scalindMatrix=").append(scalindMatrix).append(", second_chroma_qp_index_offset=").append(second_chroma_qp_index_offset).append(", pic_scaling_list_present_flag=").append(pic_scaling_list_present_flag).append('}').toString();
    }

    public ()
    {
        scalindMatrix = new ScalingMatrix();
    }
}
