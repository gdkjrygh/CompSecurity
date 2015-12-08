// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.h264.model;

import com.googlecode.mp4parser.h264.read.CAVLCReader;
import com.googlecode.mp4parser.h264.write.CAVLCWriter;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

// Referenced classes of package com.googlecode.mp4parser.h264.model:
//            BitstreamElement, ScalingList, ScalingMatrix

public class PictureParameterSet extends BitstreamElement
{
    public static class PPSExt
    {

        public boolean pic_scaling_list_present_flag[];
        public ScalingMatrix scalindMatrix;
        public int second_chroma_qp_index_offset;
        public boolean transform_8x8_mode_flag;

        public String toString()
        {
            return (new StringBuilder("PPSExt{transform_8x8_mode_flag=")).append(transform_8x8_mode_flag).append(", scalindMatrix=").append(scalindMatrix).append(", second_chroma_qp_index_offset=").append(second_chroma_qp_index_offset).append(", pic_scaling_list_present_flag=").append(pic_scaling_list_present_flag).append('}').toString();
        }

        public PPSExt()
        {
            scalindMatrix = new ScalingMatrix();
        }
    }


    public boolean bottom_field_pic_order_in_frame_present_flag;
    public int bottom_right[];
    public int chroma_qp_index_offset;
    public boolean constrained_intra_pred_flag;
    public boolean deblocking_filter_control_present_flag;
    public boolean entropy_coding_mode_flag;
    public PPSExt extended;
    public int num_ref_idx_l0_active_minus1;
    public int num_ref_idx_l1_active_minus1;
    public int num_slice_groups_minus1;
    public int pic_init_qp_minus26;
    public int pic_init_qs_minus26;
    public int pic_parameter_set_id;
    public boolean redundant_pic_cnt_present_flag;
    public int run_length_minus1[];
    public int seq_parameter_set_id;
    public boolean slice_group_change_direction_flag;
    public int slice_group_change_rate_minus1;
    public int slice_group_id[];
    public int slice_group_map_type;
    public int top_left[];
    public int weighted_bipred_idc;
    public boolean weighted_pred_flag;

    public PictureParameterSet()
    {
    }

    public static PictureParameterSet read(InputStream inputstream)
    {
        PictureParameterSet pictureparameterset;
        int i;
        i = 3;
        inputstream = new CAVLCReader(inputstream);
        pictureparameterset = new PictureParameterSet();
        pictureparameterset.pic_parameter_set_id = inputstream.readUE("PPS: pic_parameter_set_id");
        pictureparameterset.seq_parameter_set_id = inputstream.readUE("PPS: seq_parameter_set_id");
        pictureparameterset.entropy_coding_mode_flag = inputstream.readBool("PPS: entropy_coding_mode_flag");
        pictureparameterset.bottom_field_pic_order_in_frame_present_flag = inputstream.readBool("PPS: pic_order_present_flag");
        pictureparameterset.num_slice_groups_minus1 = inputstream.readUE("PPS: num_slice_groups_minus1");
        if (pictureparameterset.num_slice_groups_minus1 <= 0) goto _L2; else goto _L1
_L1:
        pictureparameterset.slice_group_map_type = inputstream.readUE("PPS: slice_group_map_type");
        pictureparameterset.top_left = new int[pictureparameterset.num_slice_groups_minus1 + 1];
        pictureparameterset.bottom_right = new int[pictureparameterset.num_slice_groups_minus1 + 1];
        pictureparameterset.run_length_minus1 = new int[pictureparameterset.num_slice_groups_minus1 + 1];
        if (pictureparameterset.slice_group_map_type != 0) goto _L4; else goto _L3
_L3:
        i = 0;
_L10:
        if (i <= pictureparameterset.num_slice_groups_minus1) goto _L5; else goto _L2
_L2:
        pictureparameterset.num_ref_idx_l0_active_minus1 = inputstream.readUE("PPS: num_ref_idx_l0_active_minus1");
        pictureparameterset.num_ref_idx_l1_active_minus1 = inputstream.readUE("PPS: num_ref_idx_l1_active_minus1");
        pictureparameterset.weighted_pred_flag = inputstream.readBool("PPS: weighted_pred_flag");
        pictureparameterset.weighted_bipred_idc = (int)inputstream.readNBit(2, "PPS: weighted_bipred_idc");
        pictureparameterset.pic_init_qp_minus26 = inputstream.readSE("PPS: pic_init_qp_minus26");
        pictureparameterset.pic_init_qs_minus26 = inputstream.readSE("PPS: pic_init_qs_minus26");
        pictureparameterset.chroma_qp_index_offset = inputstream.readSE("PPS: chroma_qp_index_offset");
        pictureparameterset.deblocking_filter_control_present_flag = inputstream.readBool("PPS: deblocking_filter_control_present_flag");
        pictureparameterset.constrained_intra_pred_flag = inputstream.readBool("PPS: constrained_intra_pred_flag");
        pictureparameterset.redundant_pic_cnt_present_flag = inputstream.readBool("PPS: redundant_pic_cnt_present_flag");
        if (!inputstream.moreRBSPData()) goto _L7; else goto _L6
_L6:
        pictureparameterset.extended = new PPSExt();
        pictureparameterset.extended.transform_8x8_mode_flag = inputstream.readBool("PPS: transform_8x8_mode_flag");
        if (!inputstream.readBool("PPS: pic_scaling_matrix_present_flag")) goto _L9; else goto _L8
_L8:
        i = 0;
_L12:
        int j;
        int k;
        if (pictureparameterset.extended.transform_8x8_mode_flag)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (i < j * 2 + 6)
        {
            break MISSING_BLOCK_LABEL_543;
        }
_L9:
        pictureparameterset.extended.second_chroma_qp_index_offset = inputstream.readSE("PPS: second_chroma_qp_index_offset");
_L7:
        inputstream.readTrailingBits();
        return pictureparameterset;
_L5:
        pictureparameterset.run_length_minus1[i] = inputstream.readUE("PPS: run_length_minus1");
        i++;
          goto _L10
_L4:
        if (pictureparameterset.slice_group_map_type == 2)
        {
            i = 0;
            while (i < pictureparameterset.num_slice_groups_minus1) 
            {
                pictureparameterset.top_left[i] = inputstream.readUE("PPS: top_left");
                pictureparameterset.bottom_right[i] = inputstream.readUE("PPS: bottom_right");
                i++;
            }
        } else
        {
            if (pictureparameterset.slice_group_map_type != 3 && pictureparameterset.slice_group_map_type != 4 && pictureparameterset.slice_group_map_type != 5)
            {
                continue; /* Loop/switch isn't completed */
            }
            pictureparameterset.slice_group_change_direction_flag = inputstream.readBool("PPS: slice_group_change_direction_flag");
            pictureparameterset.slice_group_change_rate_minus1 = inputstream.readUE("PPS: slice_group_change_rate_minus1");
        }
          goto _L2
        if (pictureparameterset.slice_group_map_type != 6) goto _L2; else goto _L11
_L11:
        if (pictureparameterset.num_slice_groups_minus1 + 1 <= 4)
        {
            if (pictureparameterset.num_slice_groups_minus1 + 1 > 2)
            {
                i = 2;
            } else
            {
                i = 1;
            }
        }
        k = inputstream.readUE("PPS: pic_size_in_map_units_minus1");
        pictureparameterset.slice_group_id = new int[k + 1];
        j = 0;
        while (j <= k) 
        {
            pictureparameterset.slice_group_id[j] = inputstream.readU(i, (new StringBuilder("PPS: slice_group_id [")).append(j).append("]f").toString());
            j++;
        }
          goto _L2
        if (inputstream.readBool("PPS: pic_scaling_list_present_flag"))
        {
            pictureparameterset.extended.scalindMatrix.ScalingList4x4 = new ScalingList[8];
            pictureparameterset.extended.scalindMatrix.ScalingList8x8 = new ScalingList[8];
            if (i < 6)
            {
                pictureparameterset.extended.scalindMatrix.ScalingList4x4[i] = ScalingList.read(inputstream, 16);
            } else
            {
                pictureparameterset.extended.scalindMatrix.ScalingList8x8[i - 6] = ScalingList.read(inputstream, 64);
            }
        }
        i++;
          goto _L12
    }

    public static PictureParameterSet read(byte abyte0[])
    {
        return read(((InputStream) (new ByteArrayInputStream(abyte0))));
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (PictureParameterSet)obj;
            if (!Arrays.equals(bottom_right, ((PictureParameterSet) (obj)).bottom_right))
            {
                return false;
            }
            if (chroma_qp_index_offset != ((PictureParameterSet) (obj)).chroma_qp_index_offset)
            {
                return false;
            }
            if (constrained_intra_pred_flag != ((PictureParameterSet) (obj)).constrained_intra_pred_flag)
            {
                return false;
            }
            if (deblocking_filter_control_present_flag != ((PictureParameterSet) (obj)).deblocking_filter_control_present_flag)
            {
                return false;
            }
            if (entropy_coding_mode_flag != ((PictureParameterSet) (obj)).entropy_coding_mode_flag)
            {
                return false;
            }
            if (extended == null)
            {
                if (((PictureParameterSet) (obj)).extended != null)
                {
                    return false;
                }
            } else
            if (!extended.equals(((PictureParameterSet) (obj)).extended))
            {
                return false;
            }
            if (num_ref_idx_l0_active_minus1 != ((PictureParameterSet) (obj)).num_ref_idx_l0_active_minus1)
            {
                return false;
            }
            if (num_ref_idx_l1_active_minus1 != ((PictureParameterSet) (obj)).num_ref_idx_l1_active_minus1)
            {
                return false;
            }
            if (num_slice_groups_minus1 != ((PictureParameterSet) (obj)).num_slice_groups_minus1)
            {
                return false;
            }
            if (pic_init_qp_minus26 != ((PictureParameterSet) (obj)).pic_init_qp_minus26)
            {
                return false;
            }
            if (pic_init_qs_minus26 != ((PictureParameterSet) (obj)).pic_init_qs_minus26)
            {
                return false;
            }
            if (bottom_field_pic_order_in_frame_present_flag != ((PictureParameterSet) (obj)).bottom_field_pic_order_in_frame_present_flag)
            {
                return false;
            }
            if (pic_parameter_set_id != ((PictureParameterSet) (obj)).pic_parameter_set_id)
            {
                return false;
            }
            if (redundant_pic_cnt_present_flag != ((PictureParameterSet) (obj)).redundant_pic_cnt_present_flag)
            {
                return false;
            }
            if (!Arrays.equals(run_length_minus1, ((PictureParameterSet) (obj)).run_length_minus1))
            {
                return false;
            }
            if (seq_parameter_set_id != ((PictureParameterSet) (obj)).seq_parameter_set_id)
            {
                return false;
            }
            if (slice_group_change_direction_flag != ((PictureParameterSet) (obj)).slice_group_change_direction_flag)
            {
                return false;
            }
            if (slice_group_change_rate_minus1 != ((PictureParameterSet) (obj)).slice_group_change_rate_minus1)
            {
                return false;
            }
            if (!Arrays.equals(slice_group_id, ((PictureParameterSet) (obj)).slice_group_id))
            {
                return false;
            }
            if (slice_group_map_type != ((PictureParameterSet) (obj)).slice_group_map_type)
            {
                return false;
            }
            if (!Arrays.equals(top_left, ((PictureParameterSet) (obj)).top_left))
            {
                return false;
            }
            if (weighted_bipred_idc != ((PictureParameterSet) (obj)).weighted_bipred_idc)
            {
                return false;
            }
            if (weighted_pred_flag != ((PictureParameterSet) (obj)).weighted_pred_flag)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        char c6 = '\u04CF';
        int j = Arrays.hashCode(bottom_right);
        int k = chroma_qp_index_offset;
        char c;
        char c1;
        char c2;
        int i;
        char c3;
        char c4;
        char c5;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        if (constrained_intra_pred_flag)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (deblocking_filter_control_present_flag)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        if (entropy_coding_mode_flag)
        {
            c2 = '\u04CF';
        } else
        {
            c2 = '\u04D5';
        }
        if (extended == null)
        {
            i = 0;
        } else
        {
            i = extended.hashCode();
        }
        l = num_ref_idx_l0_active_minus1;
        i1 = num_ref_idx_l1_active_minus1;
        j1 = num_slice_groups_minus1;
        k1 = pic_init_qp_minus26;
        l1 = pic_init_qs_minus26;
        if (bottom_field_pic_order_in_frame_present_flag)
        {
            c3 = '\u04CF';
        } else
        {
            c3 = '\u04D5';
        }
        i2 = pic_parameter_set_id;
        if (redundant_pic_cnt_present_flag)
        {
            c4 = '\u04CF';
        } else
        {
            c4 = '\u04D5';
        }
        j2 = Arrays.hashCode(run_length_minus1);
        k2 = seq_parameter_set_id;
        if (slice_group_change_direction_flag)
        {
            c5 = '\u04CF';
        } else
        {
            c5 = '\u04D5';
        }
        l2 = slice_group_change_rate_minus1;
        i3 = Arrays.hashCode(slice_group_id);
        j3 = slice_group_map_type;
        k3 = Arrays.hashCode(top_left);
        l3 = weighted_bipred_idc;
        if (!weighted_pred_flag)
        {
            c6 = '\u04D5';
        }
        return ((((((c5 + (((c4 + ((c3 + ((((((i + (c2 + (c1 + (c + ((j + 31) * 31 + k) * 31) * 31) * 31) * 31) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31) * 31 + i2) * 31) * 31 + j2) * 31 + k2) * 31) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + k3) * 31 + l3) * 31 + c6;
    }

    public String toString()
    {
        return (new StringBuilder("PictureParameterSet{\n       entropy_coding_mode_flag=")).append(entropy_coding_mode_flag).append(",\n       num_ref_idx_l0_active_minus1=").append(num_ref_idx_l0_active_minus1).append(",\n       num_ref_idx_l1_active_minus1=").append(num_ref_idx_l1_active_minus1).append(",\n       slice_group_change_rate_minus1=").append(slice_group_change_rate_minus1).append(",\n       pic_parameter_set_id=").append(pic_parameter_set_id).append(",\n       seq_parameter_set_id=").append(seq_parameter_set_id).append(",\n       pic_order_present_flag=").append(bottom_field_pic_order_in_frame_present_flag).append(",\n       num_slice_groups_minus1=").append(num_slice_groups_minus1).append(",\n       slice_group_map_type=").append(slice_group_map_type).append(",\n       weighted_pred_flag=").append(weighted_pred_flag).append(",\n       weighted_bipred_idc=").append(weighted_bipred_idc).append(",\n       pic_init_qp_minus26=").append(pic_init_qp_minus26).append(",\n       pic_init_qs_minus26=").append(pic_init_qs_minus26).append(",\n       chroma_qp_index_offset=").append(chroma_qp_index_offset).append(",\n       deblocking_filter_control_present_flag=").append(deblocking_filter_control_present_flag).append(",\n       constrained_intra_pred_flag=").append(constrained_intra_pred_flag).append(",\n       redundant_pic_cnt_present_flag=").append(redundant_pic_cnt_present_flag).append(",\n       top_left=").append(top_left).append(",\n       bottom_right=").append(bottom_right).append(",\n       run_length_minus1=").append(run_length_minus1).append(",\n       slice_group_change_direction_flag=").append(slice_group_change_direction_flag).append(",\n       slice_group_id=").append(slice_group_id).append(",\n       extended=").append(extended).append('}').toString();
    }

    public void write(OutputStream outputstream)
    {
        int i;
        i = 3;
        outputstream = new CAVLCWriter(outputstream);
        outputstream.writeUE(pic_parameter_set_id, "PPS: pic_parameter_set_id");
        outputstream.writeUE(seq_parameter_set_id, "PPS: seq_parameter_set_id");
        outputstream.writeBool(entropy_coding_mode_flag, "PPS: entropy_coding_mode_flag");
        outputstream.writeBool(bottom_field_pic_order_in_frame_present_flag, "PPS: pic_order_present_flag");
        outputstream.writeUE(num_slice_groups_minus1, "PPS: num_slice_groups_minus1");
        if (num_slice_groups_minus1 <= 0) goto _L2; else goto _L1
_L1:
        int ai[];
        int ai1[];
        int ai2[];
        outputstream.writeUE(slice_group_map_type, "PPS: slice_group_map_type");
        ai = new int[1];
        ai1 = new int[1];
        ai2 = new int[1];
        if (slice_group_map_type != 0) goto _L4; else goto _L3
_L3:
        i = 0;
_L10:
        if (i <= num_slice_groups_minus1) goto _L5; else goto _L2
_L2:
        outputstream.writeUE(num_ref_idx_l0_active_minus1, "PPS: num_ref_idx_l0_active_minus1");
        outputstream.writeUE(num_ref_idx_l1_active_minus1, "PPS: num_ref_idx_l1_active_minus1");
        outputstream.writeBool(weighted_pred_flag, "PPS: weighted_pred_flag");
        outputstream.writeNBit(weighted_bipred_idc, 2, "PPS: weighted_bipred_idc");
        outputstream.writeSE(pic_init_qp_minus26, "PPS: pic_init_qp_minus26");
        outputstream.writeSE(pic_init_qs_minus26, "PPS: pic_init_qs_minus26");
        outputstream.writeSE(chroma_qp_index_offset, "PPS: chroma_qp_index_offset");
        outputstream.writeBool(deblocking_filter_control_present_flag, "PPS: deblocking_filter_control_present_flag");
        outputstream.writeBool(constrained_intra_pred_flag, "PPS: constrained_intra_pred_flag");
        outputstream.writeBool(redundant_pic_cnt_present_flag, "PPS: redundant_pic_cnt_present_flag");
        if (extended == null) goto _L7; else goto _L6
_L6:
        outputstream.writeBool(extended.transform_8x8_mode_flag, "PPS: transform_8x8_mode_flag");
        boolean flag;
        if (extended.scalindMatrix != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        outputstream.writeBool(flag, "PPS: scalindMatrix");
        if (extended.scalindMatrix == null) goto _L9; else goto _L8
_L8:
        i = 0;
_L12:
        int j;
        boolean flag1;
        if (extended.transform_8x8_mode_flag)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (i < j * 2 + 6)
        {
            break MISSING_BLOCK_LABEL_525;
        }
_L9:
        outputstream.writeSE(extended.second_chroma_qp_index_offset, "PPS: ");
_L7:
        outputstream.writeTrailingBits();
        return;
_L5:
        outputstream.writeUE(ai2[i], "PPS: ");
        i++;
          goto _L10
_L4:
        if (slice_group_map_type == 2)
        {
            i = 0;
            while (i < num_slice_groups_minus1) 
            {
                outputstream.writeUE(ai[i], "PPS: ");
                outputstream.writeUE(ai1[i], "PPS: ");
                i++;
            }
        } else
        {
            if (slice_group_map_type != 3 && slice_group_map_type != 4 && slice_group_map_type != 5)
            {
                continue; /* Loop/switch isn't completed */
            }
            outputstream.writeBool(slice_group_change_direction_flag, "PPS: slice_group_change_direction_flag");
            outputstream.writeUE(slice_group_change_rate_minus1, "PPS: slice_group_change_rate_minus1");
        }
          goto _L2
        if (slice_group_map_type != 6) goto _L2; else goto _L11
_L11:
        if (num_slice_groups_minus1 + 1 <= 4)
        {
            if (num_slice_groups_minus1 + 1 > 2)
            {
                i = 2;
            } else
            {
                i = 1;
            }
        }
        outputstream.writeUE(slice_group_id.length, "PPS: ");
        j = 0;
        while (j <= slice_group_id.length) 
        {
            outputstream.writeU(slice_group_id[j], i);
            j++;
        }
          goto _L2
        if (i < 6)
        {
            if (extended.scalindMatrix.ScalingList4x4[i] != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            outputstream.writeBool(flag1, "PPS: ");
            if (extended.scalindMatrix.ScalingList4x4[i] != null)
            {
                extended.scalindMatrix.ScalingList4x4[i].write(outputstream);
            }
        } else
        {
            if (extended.scalindMatrix.ScalingList8x8[i - 6] != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            outputstream.writeBool(flag1, "PPS: ");
            if (extended.scalindMatrix.ScalingList8x8[i - 6] != null)
            {
                extended.scalindMatrix.ScalingList8x8[i - 6].write(outputstream);
            }
        }
        i++;
          goto _L12
    }
}
