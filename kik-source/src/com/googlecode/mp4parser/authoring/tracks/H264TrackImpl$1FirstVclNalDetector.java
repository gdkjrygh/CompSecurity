// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.googlecode.mp4parser.h264.model.PictureParameterSet;
import com.googlecode.mp4parser.h264.model.SeqParameterSet;
import java.nio.ByteBuffer;
import java.util.Map;

// Referenced classes of package com.googlecode.mp4parser.authoring.tracks:
//            H264TrackImpl

class d
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

    boolean isFirstInNew(d d)
    {
        while (d.frame_num != frame_num || d.pic_parameter_set_id != pic_parameter_set_id || d.field_pic_flag != field_pic_flag || d.field_pic_flag && d.bottom_field_flag != bottom_field_flag || d.nal_ref_idc != nal_ref_idc || d.pic_order_cnt_type == 0 && pic_order_cnt_type == 0 && (d.pic_order_cnt_lsb != pic_order_cnt_lsb || d.delta_pic_order_cnt_bottom != delta_pic_order_cnt_bottom) || d.pic_order_cnt_type == 1 && pic_order_cnt_type == 1 && (d.delta_pic_order_cnt_0 != delta_pic_order_cnt_0 || d.delta_pic_order_cnt_1 != delta_pic_order_cnt_1) || d.idrPicFlag != idrPicFlag || d.idrPicFlag && idrPicFlag && d.idr_pic_id != idr_pic_id) 
        {
            return true;
        }
        return false;
    }

    public Stream(ByteBuffer bytebuffer, int i, int j)
    {
        this$0 = H264TrackImpl.this;
        super();
        bytebuffer = cleanBuffer(new Stream(H264TrackImpl.this, bytebuffer));
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
        bytebuffer = new Stream(bytebuffer, map, map1, flag);
        frame_num = ((frame_num) (bytebuffer)).;
        pic_parameter_set_id = ((pic_parameter_set_id) (bytebuffer)).eter_set_id;
        field_pic_flag = ((field_pic_flag) (bytebuffer))._flag;
        bottom_field_flag = ((bottom_field_flag) (bytebuffer)).eld_flag;
        nal_ref_idc = i;
        pic_order_cnt_type = ((SeqParameterSet)spsIdToSps.get(Integer.valueOf(((PictureParameterSet)ppsIdToPps.get(Integer.valueOf(((pic_order_cnt_type) (bytebuffer)).eter_set_id))).seq_parameter_set_id))).pic_order_cnt_type;
        delta_pic_order_cnt_bottom = ((delta_pic_order_cnt_bottom) (bytebuffer))._order_cnt_bottom;
        pic_order_cnt_lsb = ((pic_order_cnt_lsb) (bytebuffer))._cnt_lsb;
        delta_pic_order_cnt_0 = ((delta_pic_order_cnt_0) (bytebuffer))._order_cnt_0;
        delta_pic_order_cnt_1 = ((delta_pic_order_cnt_1) (bytebuffer))._order_cnt_1;
        idr_pic_id = ((idr_pic_id) (bytebuffer)).d;
    }
}
