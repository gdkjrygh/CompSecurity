.class public Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;
.super Lcom/googlecode/mp4parser/h264/model/BitstreamElement;
.source "SourceFile"


# instance fields
.field public bit_depth_chroma_minus8:I

.field public bit_depth_luma_minus8:I

.field public chroma_format_idc:Lcom/googlecode/mp4parser/h264/model/ChromaFormat;

.field public constraint_set_0_flag:Z

.field public constraint_set_1_flag:Z

.field public constraint_set_2_flag:Z

.field public constraint_set_3_flag:Z

.field public constraint_set_4_flag:Z

.field public constraint_set_5_flag:Z

.field public delta_pic_order_always_zero_flag:Z

.field public direct_8x8_inference_flag:Z

.field public entropy_coding_mode_flag:Z

.field public field_pic_flag:Z

.field public frame_crop_bottom_offset:I

.field public frame_crop_left_offset:I

.field public frame_crop_right_offset:I

.field public frame_crop_top_offset:I

.field public frame_cropping_flag:Z

.field public frame_mbs_only_flag:Z

.field public gaps_in_frame_num_value_allowed_flag:Z

.field public level_idc:I

.field public log2_max_frame_num_minus4:I

.field public log2_max_pic_order_cnt_lsb_minus4:I

.field public mb_adaptive_frame_field_flag:Z

.field public num_ref_frames:I

.field public num_ref_frames_in_pic_order_cnt_cycle:I

.field public offsetForRefFrame:[I

.field public offset_for_non_ref_pic:I

.field public offset_for_top_to_bottom_field:I

.field public pic_height_in_map_units_minus1:I

.field public pic_order_cnt_type:I

.field public pic_width_in_mbs_minus1:I

.field public profile_idc:I

.field public qpprime_y_zero_transform_bypass_flag:Z

.field public reserved_zero_2bits:J

.field public residual_color_transform_flag:Z

.field public scalingMatrix:Lcom/googlecode/mp4parser/h264/model/ScalingMatrix;

.field public seq_parameter_set_id:I

.field public vuiParams:Lcom/googlecode/mp4parser/h264/model/VUIParameters;

.field public weighted_bipred_idc:I

.field public weighted_pred_flag:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/googlecode/mp4parser/h264/model/BitstreamElement;-><init>()V

    return-void
.end method

.method private static ReadVUIParameters(Lcom/googlecode/mp4parser/h264/read/CAVLCReader;)Lcom/googlecode/mp4parser/h264/model/VUIParameters;
    .locals 7

    .prologue
    const/16 v6, 0x20

    const/16 v5, 0x10

    const/16 v4, 0x8

    .line 202
    new-instance v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;

    invoke-direct {v0}, Lcom/googlecode/mp4parser/h264/model/VUIParameters;-><init>()V

    .line 204
    const-string v1, "VUI: aspect_ratio_info_present_flag"

    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v1

    .line 203
    iput-boolean v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->aspect_ratio_info_present_flag:Z

    .line 205
    iget-boolean v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->aspect_ratio_info_present_flag:Z

    if-eqz v1, :cond_0

    .line 207
    const-string v1, "VUI: aspect_ratio"

    .line 206
    invoke-virtual {p0, v4, v1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readNBit(ILjava/lang/String;)J

    move-result-wide v2

    long-to-int v1, v2

    invoke-static {v1}, Lcom/googlecode/mp4parser/h264/model/AspectRatio;->fromValue(I)Lcom/googlecode/mp4parser/h264/model/AspectRatio;

    move-result-object v1

    iput-object v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->aspect_ratio:Lcom/googlecode/mp4parser/h264/model/AspectRatio;

    .line 208
    iget-object v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->aspect_ratio:Lcom/googlecode/mp4parser/h264/model/AspectRatio;

    sget-object v2, Lcom/googlecode/mp4parser/h264/model/AspectRatio;->Extended_SAR:Lcom/googlecode/mp4parser/h264/model/AspectRatio;

    if-ne v1, v2, :cond_0

    .line 209
    const-string v1, "VUI: sar_width"

    invoke-virtual {p0, v5, v1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readNBit(ILjava/lang/String;)J

    move-result-wide v2

    long-to-int v1, v2

    iput v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->sar_width:I

    .line 210
    const-string v1, "VUI: sar_height"

    invoke-virtual {p0, v5, v1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readNBit(ILjava/lang/String;)J

    move-result-wide v2

    long-to-int v1, v2

    iput v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->sar_height:I

    .line 214
    :cond_0
    const-string v1, "VUI: overscan_info_present_flag"

    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v1

    .line 213
    iput-boolean v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->overscan_info_present_flag:Z

    .line 215
    iget-boolean v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->overscan_info_present_flag:Z

    if-eqz v1, :cond_1

    .line 217
    const-string v1, "VUI: overscan_appropriate_flag"

    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v1

    .line 216
    iput-boolean v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->overscan_appropriate_flag:Z

    .line 220
    :cond_1
    const-string v1, "VUI: video_signal_type_present_flag"

    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v1

    .line 219
    iput-boolean v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->video_signal_type_present_flag:Z

    .line 221
    iget-boolean v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->video_signal_type_present_flag:Z

    if-eqz v1, :cond_2

    .line 222
    const/4 v1, 0x3

    const-string v2, "VUI: video_format"

    invoke-virtual {p0, v1, v2}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readNBit(ILjava/lang/String;)J

    move-result-wide v2

    long-to-int v1, v2

    iput v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->video_format:I

    .line 224
    const-string v1, "VUI: video_full_range_flag"

    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v1

    .line 223
    iput-boolean v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->video_full_range_flag:Z

    .line 226
    const-string v1, "VUI: colour_description_present_flag"

    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v1

    .line 225
    iput-boolean v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->colour_description_present_flag:Z

    .line 227
    iget-boolean v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->colour_description_present_flag:Z

    if-eqz v1, :cond_2

    .line 229
    const-string v1, "VUI: colour_primaries"

    .line 228
    invoke-virtual {p0, v4, v1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readNBit(ILjava/lang/String;)J

    move-result-wide v2

    long-to-int v1, v2

    iput v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->colour_primaries:I

    .line 231
    const-string v1, "VUI: transfer_characteristics"

    .line 230
    invoke-virtual {p0, v4, v1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readNBit(ILjava/lang/String;)J

    move-result-wide v2

    long-to-int v1, v2

    iput v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->transfer_characteristics:I

    .line 233
    const-string v1, "VUI: matrix_coefficients"

    .line 232
    invoke-virtual {p0, v4, v1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readNBit(ILjava/lang/String;)J

    move-result-wide v2

    long-to-int v1, v2

    iput v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->matrix_coefficients:I

    .line 237
    :cond_2
    const-string v1, "VUI: chroma_loc_info_present_flag"

    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v1

    .line 236
    iput-boolean v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->chroma_loc_info_present_flag:Z

    .line 238
    iget-boolean v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->chroma_loc_info_present_flag:Z

    if-eqz v1, :cond_3

    .line 240
    const-string v1, "VUI chroma_sample_loc_type_top_field"

    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE(Ljava/lang/String;)I

    move-result v1

    .line 239
    iput v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->chroma_sample_loc_type_top_field:I

    .line 242
    const-string v1, "VUI chroma_sample_loc_type_bottom_field"

    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE(Ljava/lang/String;)I

    move-result v1

    .line 241
    iput v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->chroma_sample_loc_type_bottom_field:I

    .line 245
    :cond_3
    const-string v1, "VUI: timing_info_present_flag"

    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v1

    .line 244
    iput-boolean v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->timing_info_present_flag:Z

    .line 246
    iget-boolean v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->timing_info_present_flag:Z

    if-eqz v1, :cond_4

    .line 248
    const-string v1, "VUI: num_units_in_tick"

    .line 247
    invoke-virtual {p0, v6, v1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readNBit(ILjava/lang/String;)J

    move-result-wide v2

    long-to-int v1, v2

    iput v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->num_units_in_tick:I

    .line 249
    const-string v1, "VUI: time_scale"

    invoke-virtual {p0, v6, v1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readNBit(ILjava/lang/String;)J

    move-result-wide v2

    long-to-int v1, v2

    iput v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->time_scale:I

    .line 251
    const-string v1, "VUI: fixed_frame_rate_flag"

    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v1

    .line 250
    iput-boolean v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->fixed_frame_rate_flag:Z

    .line 254
    :cond_4
    const-string v1, "VUI: nal_hrd_parameters_present_flag"

    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v1

    .line 255
    if-eqz v1, :cond_5

    .line 256
    invoke-static {p0}, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->readHRDParameters(Lcom/googlecode/mp4parser/h264/read/CAVLCReader;)Lcom/googlecode/mp4parser/h264/model/HRDParameters;

    move-result-object v2

    iput-object v2, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->nalHRDParams:Lcom/googlecode/mp4parser/h264/model/HRDParameters;

    .line 258
    :cond_5
    const-string v2, "VUI: vcl_hrd_parameters_present_flag"

    invoke-virtual {p0, v2}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v2

    .line 259
    if-eqz v2, :cond_6

    .line 260
    invoke-static {p0}, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->readHRDParameters(Lcom/googlecode/mp4parser/h264/read/CAVLCReader;)Lcom/googlecode/mp4parser/h264/model/HRDParameters;

    move-result-object v3

    iput-object v3, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->vclHRDParams:Lcom/googlecode/mp4parser/h264/model/HRDParameters;

    .line 261
    :cond_6
    if-nez v1, :cond_7

    if-eqz v2, :cond_8

    .line 263
    :cond_7
    const-string v1, "VUI: low_delay_hrd_flag"

    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v1

    .line 262
    iput-boolean v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->low_delay_hrd_flag:Z

    .line 266
    :cond_8
    const-string v1, "VUI: pic_struct_present_flag"

    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v1

    .line 265
    iput-boolean v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->pic_struct_present_flag:Z

    .line 268
    const-string v1, "VUI: bitstream_restriction_flag"

    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v1

    .line 267
    if-eqz v1, :cond_9

    .line 270
    new-instance v1, Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;

    invoke-direct {v1}, Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;-><init>()V

    iput-object v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->bitstreamRestriction:Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;

    .line 271
    iget-object v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->bitstreamRestriction:Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;

    .line 272
    const-string v2, "VUI: motion_vectors_over_pic_boundaries_flag"

    invoke-virtual {p0, v2}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v2

    .line 271
    iput-boolean v2, v1, Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;->motion_vectors_over_pic_boundaries_flag:Z

    .line 273
    iget-object v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->bitstreamRestriction:Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;

    .line 274
    const-string v2, "VUI max_bytes_per_pic_denom"

    invoke-virtual {p0, v2}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE(Ljava/lang/String;)I

    move-result v2

    .line 273
    iput v2, v1, Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;->max_bytes_per_pic_denom:I

    .line 275
    iget-object v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->bitstreamRestriction:Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;

    .line 276
    const-string v2, "VUI max_bits_per_mb_denom"

    invoke-virtual {p0, v2}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE(Ljava/lang/String;)I

    move-result v2

    .line 275
    iput v2, v1, Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;->max_bits_per_mb_denom:I

    .line 277
    iget-object v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->bitstreamRestriction:Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;

    .line 278
    const-string v2, "VUI log2_max_mv_length_horizontal"

    invoke-virtual {p0, v2}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE(Ljava/lang/String;)I

    move-result v2

    .line 277
    iput v2, v1, Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;->log2_max_mv_length_horizontal:I

    .line 279
    iget-object v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->bitstreamRestriction:Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;

    .line 280
    const-string v2, "VUI log2_max_mv_length_vertical"

    invoke-virtual {p0, v2}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE(Ljava/lang/String;)I

    move-result v2

    .line 279
    iput v2, v1, Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;->log2_max_mv_length_vertical:I

    .line 281
    iget-object v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->bitstreamRestriction:Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;

    .line 282
    const-string v2, "VUI num_reorder_frames"

    invoke-virtual {p0, v2}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE(Ljava/lang/String;)I

    move-result v2

    .line 281
    iput v2, v1, Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;->num_reorder_frames:I

    .line 283
    iget-object v1, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->bitstreamRestriction:Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;

    .line 284
    const-string v2, "VUI max_dec_frame_buffering"

    invoke-virtual {p0, v2}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE(Ljava/lang/String;)I

    move-result v2

    .line 283
    iput v2, v1, Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;->max_dec_frame_buffering:I

    .line 287
    :cond_9
    return-object v0
.end method

.method public static read(Ljava/io/InputStream;)Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;
    .locals 7

    .prologue
    const/16 v6, 0x8

    .line 81
    new-instance v1, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;

    invoke-direct {v1, p0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;-><init>(Ljava/io/InputStream;)V

    .line 82
    new-instance v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;

    invoke-direct {v2}, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;-><init>()V

    .line 84
    const-string v0, "SPS: profile_idc"

    invoke-virtual {v1, v6, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readNBit(ILjava/lang/String;)J

    move-result-wide v4

    long-to-int v0, v4

    iput v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->profile_idc:I

    .line 86
    const-string v0, "SPS: constraint_set_0_flag"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v0

    .line 85
    iput-boolean v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->constraint_set_0_flag:Z

    .line 88
    const-string v0, "SPS: constraint_set_1_flag"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v0

    .line 87
    iput-boolean v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->constraint_set_1_flag:Z

    .line 90
    const-string v0, "SPS: constraint_set_2_flag"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v0

    .line 89
    iput-boolean v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->constraint_set_2_flag:Z

    .line 92
    const-string v0, "SPS: constraint_set_3_flag"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v0

    .line 91
    iput-boolean v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->constraint_set_3_flag:Z

    .line 94
    const-string v0, "SPS: constraint_set_4_flag"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v0

    .line 93
    iput-boolean v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->constraint_set_4_flag:Z

    .line 96
    const-string v0, "SPS: constraint_set_5_flag"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v0

    .line 95
    iput-boolean v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->constraint_set_5_flag:Z

    .line 98
    const/4 v0, 0x2

    const-string v3, "SPS: reserved_zero_2bits"

    invoke-virtual {v1, v0, v3}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readNBit(ILjava/lang/String;)J

    move-result-wide v4

    iput-wide v4, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->reserved_zero_2bits:J

    .line 99
    const-string v0, "SPS: level_idc"

    invoke-virtual {v1, v6, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readNBit(ILjava/lang/String;)J

    move-result-wide v4

    long-to-int v0, v4

    iput v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->level_idc:I

    .line 100
    const-string v0, "SPS: seq_parameter_set_id"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE(Ljava/lang/String;)I

    move-result v0

    iput v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->seq_parameter_set_id:I

    .line 102
    iget v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->profile_idc:I

    const/16 v3, 0x64

    if-eq v0, v3, :cond_0

    iget v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->profile_idc:I

    const/16 v3, 0x6e

    if-eq v0, v3, :cond_0

    .line 103
    iget v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->profile_idc:I

    const/16 v3, 0x7a

    if-eq v0, v3, :cond_0

    iget v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->profile_idc:I

    const/16 v3, 0x90

    if-ne v0, v3, :cond_7

    .line 105
    :cond_0
    const-string v0, "SPS: chroma_format_idc"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE(Ljava/lang/String;)I

    move-result v0

    .line 104
    invoke-static {v0}, Lcom/googlecode/mp4parser/h264/model/ChromaFormat;->fromId(I)Lcom/googlecode/mp4parser/h264/model/ChromaFormat;

    move-result-object v0

    iput-object v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->chroma_format_idc:Lcom/googlecode/mp4parser/h264/model/ChromaFormat;

    .line 106
    iget-object v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->chroma_format_idc:Lcom/googlecode/mp4parser/h264/model/ChromaFormat;

    sget-object v3, Lcom/googlecode/mp4parser/h264/model/ChromaFormat;->YUV_444:Lcom/googlecode/mp4parser/h264/model/ChromaFormat;

    if-ne v0, v3, :cond_1

    .line 108
    const-string v0, "SPS: residual_color_transform_flag"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v0

    .line 107
    iput-boolean v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->residual_color_transform_flag:Z

    .line 111
    :cond_1
    const-string v0, "SPS: bit_depth_luma_minus8"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE(Ljava/lang/String;)I

    move-result v0

    .line 110
    iput v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->bit_depth_luma_minus8:I

    .line 113
    const-string v0, "SPS: bit_depth_chroma_minus8"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE(Ljava/lang/String;)I

    move-result v0

    .line 112
    iput v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->bit_depth_chroma_minus8:I

    .line 115
    const-string v0, "SPS: qpprime_y_zero_transform_bypass_flag"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v0

    .line 114
    iput-boolean v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->qpprime_y_zero_transform_bypass_flag:Z

    .line 117
    const-string v0, "SPS: seq_scaling_matrix_present_lag"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v0

    .line 116
    if-eqz v0, :cond_2

    .line 119
    invoke-static {v1, v2}, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->readScalingListMatrix(Lcom/googlecode/mp4parser/h264/read/CAVLCReader;Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;)V

    .line 125
    :cond_2
    :goto_0
    const-string v0, "SPS: log2_max_frame_num_minus4"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE(Ljava/lang/String;)I

    move-result v0

    .line 124
    iput v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->log2_max_frame_num_minus4:I

    .line 126
    const-string v0, "SPS: pic_order_cnt_type"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE(Ljava/lang/String;)I

    move-result v0

    iput v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->pic_order_cnt_type:I

    .line 127
    iget v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->pic_order_cnt_type:I

    if-nez v0, :cond_8

    .line 129
    const-string v0, "SPS: log2_max_pic_order_cnt_lsb_minus4"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE(Ljava/lang/String;)I

    move-result v0

    .line 128
    iput v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->log2_max_pic_order_cnt_lsb_minus4:I

    .line 145
    :cond_3
    const-string v0, "SPS: num_ref_frames"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE(Ljava/lang/String;)I

    move-result v0

    iput v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->num_ref_frames:I

    .line 147
    const-string v0, "SPS: gaps_in_frame_num_value_allowed_flag"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v0

    .line 146
    iput-boolean v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->gaps_in_frame_num_value_allowed_flag:Z

    .line 149
    const-string v0, "SPS: pic_width_in_mbs_minus1"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE(Ljava/lang/String;)I

    move-result v0

    .line 148
    iput v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->pic_width_in_mbs_minus1:I

    .line 151
    const-string v0, "SPS: pic_height_in_map_units_minus1"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE(Ljava/lang/String;)I

    move-result v0

    .line 150
    iput v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->pic_height_in_map_units_minus1:I

    .line 152
    const-string v0, "SPS: frame_mbs_only_flag"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->frame_mbs_only_flag:Z

    .line 153
    iget-boolean v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->frame_mbs_only_flag:Z

    if-nez v0, :cond_4

    .line 155
    const-string v0, "SPS: mb_adaptive_frame_field_flag"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v0

    .line 154
    iput-boolean v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->mb_adaptive_frame_field_flag:Z

    .line 158
    :cond_4
    const-string v0, "SPS: direct_8x8_inference_flag"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v0

    .line 157
    iput-boolean v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->direct_8x8_inference_flag:Z

    .line 159
    const-string v0, "SPS: frame_cropping_flag"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->frame_cropping_flag:Z

    .line 160
    iget-boolean v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->frame_cropping_flag:Z

    if-eqz v0, :cond_5

    .line 162
    const-string v0, "SPS: frame_crop_left_offset"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE(Ljava/lang/String;)I

    move-result v0

    .line 161
    iput v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->frame_crop_left_offset:I

    .line 164
    const-string v0, "SPS: frame_crop_right_offset"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE(Ljava/lang/String;)I

    move-result v0

    .line 163
    iput v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->frame_crop_right_offset:I

    .line 166
    const-string v0, "SPS: frame_crop_top_offset"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE(Ljava/lang/String;)I

    move-result v0

    .line 165
    iput v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->frame_crop_top_offset:I

    .line 168
    const-string v0, "SPS: frame_crop_bottom_offset"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE(Ljava/lang/String;)I

    move-result v0

    .line 167
    iput v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->frame_crop_bottom_offset:I

    .line 171
    :cond_5
    const-string v0, "SPS: vui_parameters_present_flag"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v0

    .line 170
    if-eqz v0, :cond_6

    .line 173
    invoke-static {v1}, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->ReadVUIParameters(Lcom/googlecode/mp4parser/h264/read/CAVLCReader;)Lcom/googlecode/mp4parser/h264/model/VUIParameters;

    move-result-object v0

    iput-object v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->vuiParams:Lcom/googlecode/mp4parser/h264/model/VUIParameters;

    .line 175
    :cond_6
    invoke-virtual {v1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readTrailingBits()V

    .line 177
    return-object v2

    .line 122
    :cond_7
    sget-object v0, Lcom/googlecode/mp4parser/h264/model/ChromaFormat;->YUV_420:Lcom/googlecode/mp4parser/h264/model/ChromaFormat;

    iput-object v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->chroma_format_idc:Lcom/googlecode/mp4parser/h264/model/ChromaFormat;

    goto/16 :goto_0

    .line 130
    :cond_8
    iget v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->pic_order_cnt_type:I

    const/4 v3, 0x1

    if-ne v0, v3, :cond_3

    .line 132
    const-string v0, "SPS: delta_pic_order_always_zero_flag"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v0

    .line 131
    iput-boolean v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->delta_pic_order_always_zero_flag:Z

    .line 134
    const-string v0, "SPS: offset_for_non_ref_pic"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readSE(Ljava/lang/String;)I

    move-result v0

    .line 133
    iput v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->offset_for_non_ref_pic:I

    .line 136
    const-string v0, "SPS: offset_for_top_to_bottom_field"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readSE(Ljava/lang/String;)I

    move-result v0

    .line 135
    iput v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->offset_for_top_to_bottom_field:I

    .line 138
    const-string v0, "SPS: num_ref_frames_in_pic_order_cnt_cycle"

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE(Ljava/lang/String;)I

    move-result v0

    .line 137
    iput v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->num_ref_frames_in_pic_order_cnt_cycle:I

    .line 139
    iget v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->num_ref_frames_in_pic_order_cnt_cycle:I

    new-array v0, v0, [I

    iput-object v0, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->offsetForRefFrame:[I

    .line 140
    const/4 v0, 0x0

    :goto_1
    iget v3, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->num_ref_frames_in_pic_order_cnt_cycle:I

    if-ge v0, v3, :cond_3

    .line 141
    iget-object v3, v2, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->offsetForRefFrame:[I

    .line 142
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "SPS: offsetForRefFrame ["

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "]"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readSE(Ljava/lang/String;)I

    move-result v4

    .line 141
    aput v4, v3, v0

    .line 140
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method private static readHRDParameters(Lcom/googlecode/mp4parser/h264/read/CAVLCReader;)Lcom/googlecode/mp4parser/h264/model/HRDParameters;
    .locals 6

    .prologue
    const/4 v5, 0x4

    const/4 v4, 0x5

    .line 292
    new-instance v1, Lcom/googlecode/mp4parser/h264/model/HRDParameters;

    invoke-direct {v1}, Lcom/googlecode/mp4parser/h264/model/HRDParameters;-><init>()V

    .line 293
    const-string v0, "SPS: cpb_cnt_minus1"

    invoke-virtual {p0, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE(Ljava/lang/String;)I

    move-result v0

    iput v0, v1, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->cpb_cnt_minus1:I

    .line 294
    const-string v0, "HRD: bit_rate_scale"

    invoke-virtual {p0, v5, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readNBit(ILjava/lang/String;)J

    move-result-wide v2

    long-to-int v0, v2

    iput v0, v1, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->bit_rate_scale:I

    .line 295
    const-string v0, "HRD: cpb_size_scale"

    invoke-virtual {p0, v5, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readNBit(ILjava/lang/String;)J

    move-result-wide v2

    long-to-int v0, v2

    iput v0, v1, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->cpb_size_scale:I

    .line 296
    iget v0, v1, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->cpb_cnt_minus1:I

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [I

    iput-object v0, v1, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->bit_rate_value_minus1:[I

    .line 297
    iget v0, v1, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->cpb_cnt_minus1:I

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [I

    iput-object v0, v1, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->cpb_size_value_minus1:[I

    .line 298
    iget v0, v1, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->cpb_cnt_minus1:I

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [Z

    iput-object v0, v1, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->cbr_flag:[Z

    .line 300
    const/4 v0, 0x0

    :goto_0
    iget v2, v1, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->cpb_cnt_minus1:I

    if-le v0, v2, :cond_0

    .line 308
    const-string v0, "HRD: initial_cpb_removal_delay_length_minus1"

    .line 307
    invoke-virtual {p0, v4, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readNBit(ILjava/lang/String;)J

    move-result-wide v2

    long-to-int v0, v2

    iput v0, v1, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->initial_cpb_removal_delay_length_minus1:I

    .line 310
    const-string v0, "HRD: cpb_removal_delay_length_minus1"

    .line 309
    invoke-virtual {p0, v4, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readNBit(ILjava/lang/String;)J

    move-result-wide v2

    long-to-int v0, v2

    iput v0, v1, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->cpb_removal_delay_length_minus1:I

    .line 312
    const-string v0, "HRD: dpb_output_delay_length_minus1"

    .line 311
    invoke-virtual {p0, v4, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readNBit(ILjava/lang/String;)J

    move-result-wide v2

    long-to-int v0, v2

    iput v0, v1, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->dpb_output_delay_length_minus1:I

    .line 314
    const-string v0, "HRD: time_offset_length"

    .line 313
    invoke-virtual {p0, v4, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readNBit(ILjava/lang/String;)J

    move-result-wide v2

    long-to-int v0, v2

    iput v0, v1, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->time_offset_length:I

    .line 315
    return-object v1

    .line 301
    :cond_0
    iget-object v2, v1, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->bit_rate_value_minus1:[I

    .line 302
    const-string v3, "HRD: bit_rate_value_minus1"

    invoke-virtual {p0, v3}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE(Ljava/lang/String;)I

    move-result v3

    .line 301
    aput v3, v2, v0

    .line 303
    iget-object v2, v1, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->cpb_size_value_minus1:[I

    .line 304
    const-string v3, "HRD: cpb_size_value_minus1"

    invoke-virtual {p0, v3}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE(Ljava/lang/String;)I

    move-result v3

    .line 303
    aput v3, v2, v0

    .line 305
    iget-object v2, v1, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->cbr_flag:[Z

    const-string v3, "HRD: cbr_flag"

    invoke-virtual {p0, v3}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v3

    aput-boolean v3, v2, v0

    .line 300
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private static readScalingListMatrix(Lcom/googlecode/mp4parser/h264/read/CAVLCReader;Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;)V
    .locals 5

    .prologue
    const/16 v4, 0x8

    .line 182
    new-instance v0, Lcom/googlecode/mp4parser/h264/model/ScalingMatrix;

    invoke-direct {v0}, Lcom/googlecode/mp4parser/h264/model/ScalingMatrix;-><init>()V

    iput-object v0, p1, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->scalingMatrix:Lcom/googlecode/mp4parser/h264/model/ScalingMatrix;

    .line 183
    const/4 v0, 0x0

    :goto_0
    if-lt v0, v4, :cond_0

    .line 198
    return-void

    .line 185
    :cond_0
    const-string v1, "SPS: seqScalingListPresentFlag"

    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v1

    .line 184
    if-eqz v1, :cond_1

    .line 187
    iget-object v1, p1, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->scalingMatrix:Lcom/googlecode/mp4parser/h264/model/ScalingMatrix;

    new-array v2, v4, [Lcom/googlecode/mp4parser/h264/model/ScalingList;

    iput-object v2, v1, Lcom/googlecode/mp4parser/h264/model/ScalingMatrix;->ScalingList4x4:[Lcom/googlecode/mp4parser/h264/model/ScalingList;

    .line 188
    iget-object v1, p1, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->scalingMatrix:Lcom/googlecode/mp4parser/h264/model/ScalingMatrix;

    new-array v2, v4, [Lcom/googlecode/mp4parser/h264/model/ScalingList;

    iput-object v2, v1, Lcom/googlecode/mp4parser/h264/model/ScalingMatrix;->ScalingList8x8:[Lcom/googlecode/mp4parser/h264/model/ScalingList;

    .line 189
    const/4 v1, 0x6

    if-ge v0, v1, :cond_2

    .line 190
    iget-object v1, p1, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->scalingMatrix:Lcom/googlecode/mp4parser/h264/model/ScalingMatrix;

    iget-object v1, v1, Lcom/googlecode/mp4parser/h264/model/ScalingMatrix;->ScalingList4x4:[Lcom/googlecode/mp4parser/h264/model/ScalingList;

    .line 191
    const/16 v2, 0x10

    .line 190
    invoke-static {p0, v2}, Lcom/googlecode/mp4parser/h264/model/ScalingList;->read(Lcom/googlecode/mp4parser/h264/read/CAVLCReader;I)Lcom/googlecode/mp4parser/h264/model/ScalingList;

    move-result-object v2

    aput-object v2, v1, v0

    .line 183
    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 193
    :cond_2
    iget-object v1, p1, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->scalingMatrix:Lcom/googlecode/mp4parser/h264/model/ScalingMatrix;

    iget-object v1, v1, Lcom/googlecode/mp4parser/h264/model/ScalingMatrix;->ScalingList8x8:[Lcom/googlecode/mp4parser/h264/model/ScalingList;

    add-int/lit8 v2, v0, -0x6

    .line 194
    const/16 v3, 0x40

    .line 193
    invoke-static {p0, v3}, Lcom/googlecode/mp4parser/h264/model/ScalingList;->read(Lcom/googlecode/mp4parser/h264/read/CAVLCReader;I)Lcom/googlecode/mp4parser/h264/model/ScalingList;

    move-result-object v3

    aput-object v3, v1, v2

    goto :goto_1
.end method

.method private writeHRDParameters(Lcom/googlecode/mp4parser/h264/model/HRDParameters;Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;)V
    .locals 5

    .prologue
    const/4 v4, 0x4

    const/4 v3, 0x5

    .line 503
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->cpb_cnt_minus1:I

    const-string v1, "HRD: cpb_cnt_minus1"

    invoke-virtual {p2, v0, v1}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeUE(ILjava/lang/String;)V

    .line 504
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->bit_rate_scale:I

    int-to-long v0, v0

    const-string v2, "HRD: bit_rate_scale"

    invoke-virtual {p2, v0, v1, v4, v2}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeNBit(JILjava/lang/String;)V

    .line 505
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->cpb_size_scale:I

    int-to-long v0, v0

    const-string v2, "HRD: cpb_size_scale"

    invoke-virtual {p2, v0, v1, v4, v2}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeNBit(JILjava/lang/String;)V

    .line 507
    const/4 v0, 0x0

    :goto_0
    iget v1, p1, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->cpb_cnt_minus1:I

    if-le v0, v1, :cond_0

    .line 512
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->initial_cpb_removal_delay_length_minus1:I

    int-to-long v0, v0

    .line 513
    const-string v2, "HRD: initial_cpb_removal_delay_length_minus1"

    .line 512
    invoke-virtual {p2, v0, v1, v3, v2}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeNBit(JILjava/lang/String;)V

    .line 514
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->cpb_removal_delay_length_minus1:I

    int-to-long v0, v0

    .line 515
    const-string v2, "HRD: cpb_removal_delay_length_minus1"

    .line 514
    invoke-virtual {p2, v0, v1, v3, v2}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeNBit(JILjava/lang/String;)V

    .line 516
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->dpb_output_delay_length_minus1:I

    int-to-long v0, v0

    .line 517
    const-string v2, "HRD: dpb_output_delay_length_minus1"

    .line 516
    invoke-virtual {p2, v0, v1, v3, v2}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeNBit(JILjava/lang/String;)V

    .line 518
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->time_offset_length:I

    int-to-long v0, v0

    const-string v2, "HRD: time_offset_length"

    invoke-virtual {p2, v0, v1, v3, v2}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeNBit(JILjava/lang/String;)V

    .line 519
    return-void

    .line 508
    :cond_0
    iget-object v1, p1, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->bit_rate_value_minus1:[I

    aget v1, v1, v0

    const-string v2, "HRD: "

    invoke-virtual {p2, v1, v2}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeUE(ILjava/lang/String;)V

    .line 509
    iget-object v1, p1, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->cpb_size_value_minus1:[I

    aget v1, v1, v0

    const-string v2, "HRD: "

    invoke-virtual {p2, v1, v2}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeUE(ILjava/lang/String;)V

    .line 510
    iget-object v1, p1, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->cbr_flag:[Z

    aget-boolean v1, v1, v0

    const-string v2, "HRD: "

    invoke-virtual {p2, v1, v2}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 507
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private writeVUIParameters(Lcom/googlecode/mp4parser/h264/model/VUIParameters;Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;)V
    .locals 9

    .prologue
    const/16 v8, 0x20

    const/16 v7, 0x10

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/16 v6, 0x8

    .line 411
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->aspect_ratio_info_present_flag:Z

    .line 412
    const-string v3, "VUI: aspect_ratio_info_present_flag"

    .line 411
    invoke-virtual {p2, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 413
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->aspect_ratio_info_present_flag:Z

    if-eqz v0, :cond_0

    .line 414
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->aspect_ratio:Lcom/googlecode/mp4parser/h264/model/AspectRatio;

    invoke-virtual {v0}, Lcom/googlecode/mp4parser/h264/model/AspectRatio;->getValue()I

    move-result v0

    int-to-long v4, v0

    .line 415
    const-string v0, "VUI: aspect_ratio"

    .line 414
    invoke-virtual {p2, v4, v5, v6, v0}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeNBit(JILjava/lang/String;)V

    .line 416
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->aspect_ratio:Lcom/googlecode/mp4parser/h264/model/AspectRatio;

    sget-object v3, Lcom/googlecode/mp4parser/h264/model/AspectRatio;->Extended_SAR:Lcom/googlecode/mp4parser/h264/model/AspectRatio;

    if-ne v0, v3, :cond_0

    .line 417
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->sar_width:I

    int-to-long v4, v0

    const-string v0, "VUI: sar_width"

    invoke-virtual {p2, v4, v5, v7, v0}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeNBit(JILjava/lang/String;)V

    .line 418
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->sar_height:I

    int-to-long v4, v0

    const-string v0, "VUI: sar_height"

    invoke-virtual {p2, v4, v5, v7, v0}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeNBit(JILjava/lang/String;)V

    .line 421
    :cond_0
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->overscan_info_present_flag:Z

    .line 422
    const-string v3, "VUI: overscan_info_present_flag"

    .line 421
    invoke-virtual {p2, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 423
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->overscan_info_present_flag:Z

    if-eqz v0, :cond_1

    .line 424
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->overscan_appropriate_flag:Z

    .line 425
    const-string v3, "VUI: overscan_appropriate_flag"

    .line 424
    invoke-virtual {p2, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 427
    :cond_1
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->video_signal_type_present_flag:Z

    .line 428
    const-string v3, "VUI: video_signal_type_present_flag"

    .line 427
    invoke-virtual {p2, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 429
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->video_signal_type_present_flag:Z

    if-eqz v0, :cond_2

    .line 430
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->video_format:I

    int-to-long v4, v0

    const/4 v0, 0x3

    const-string v3, "VUI: video_format"

    invoke-virtual {p2, v4, v5, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeNBit(JILjava/lang/String;)V

    .line 431
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->video_full_range_flag:Z

    .line 432
    const-string v3, "VUI: video_full_range_flag"

    .line 431
    invoke-virtual {p2, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 433
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->colour_description_present_flag:Z

    .line 434
    const-string v3, "VUI: colour_description_present_flag"

    .line 433
    invoke-virtual {p2, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 435
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->colour_description_present_flag:Z

    if-eqz v0, :cond_2

    .line 436
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->colour_primaries:I

    int-to-long v4, v0

    .line 437
    const-string v0, "VUI: colour_primaries"

    .line 436
    invoke-virtual {p2, v4, v5, v6, v0}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeNBit(JILjava/lang/String;)V

    .line 438
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->transfer_characteristics:I

    int-to-long v4, v0

    .line 439
    const-string v0, "VUI: transfer_characteristics"

    .line 438
    invoke-virtual {p2, v4, v5, v6, v0}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeNBit(JILjava/lang/String;)V

    .line 440
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->matrix_coefficients:I

    int-to-long v4, v0

    .line 441
    const-string v0, "VUI: matrix_coefficients"

    .line 440
    invoke-virtual {p2, v4, v5, v6, v0}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeNBit(JILjava/lang/String;)V

    .line 444
    :cond_2
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->chroma_loc_info_present_flag:Z

    .line 445
    const-string v3, "VUI: chroma_loc_info_present_flag"

    .line 444
    invoke-virtual {p2, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 446
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->chroma_loc_info_present_flag:Z

    if-eqz v0, :cond_3

    .line 447
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->chroma_sample_loc_type_top_field:I

    .line 448
    const-string v3, "VUI: chroma_sample_loc_type_top_field"

    .line 447
    invoke-virtual {p2, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeUE(ILjava/lang/String;)V

    .line 449
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->chroma_sample_loc_type_bottom_field:I

    .line 450
    const-string v3, "VUI: chroma_sample_loc_type_bottom_field"

    .line 449
    invoke-virtual {p2, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeUE(ILjava/lang/String;)V

    .line 452
    :cond_3
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->timing_info_present_flag:Z

    .line 453
    const-string v3, "VUI: timing_info_present_flag"

    .line 452
    invoke-virtual {p2, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 454
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->timing_info_present_flag:Z

    if-eqz v0, :cond_4

    .line 455
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->num_units_in_tick:I

    int-to-long v4, v0

    .line 456
    const-string v0, "VUI: num_units_in_tick"

    .line 455
    invoke-virtual {p2, v4, v5, v8, v0}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeNBit(JILjava/lang/String;)V

    .line 457
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->time_scale:I

    int-to-long v4, v0

    const-string v0, "VUI: time_scale"

    invoke-virtual {p2, v4, v5, v8, v0}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeNBit(JILjava/lang/String;)V

    .line 458
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->fixed_frame_rate_flag:Z

    .line 459
    const-string v3, "VUI: fixed_frame_rate_flag"

    .line 458
    invoke-virtual {p2, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 461
    :cond_4
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->nalHRDParams:Lcom/googlecode/mp4parser/h264/model/HRDParameters;

    if-eqz v0, :cond_a

    move v0, v1

    :goto_0
    const-string v3, "VUI: "

    invoke-virtual {p2, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 462
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->nalHRDParams:Lcom/googlecode/mp4parser/h264/model/HRDParameters;

    if-eqz v0, :cond_5

    .line 463
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->nalHRDParams:Lcom/googlecode/mp4parser/h264/model/HRDParameters;

    invoke-direct {p0, v0, p2}, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->writeHRDParameters(Lcom/googlecode/mp4parser/h264/model/HRDParameters;Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;)V

    .line 465
    :cond_5
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->vclHRDParams:Lcom/googlecode/mp4parser/h264/model/HRDParameters;

    if-eqz v0, :cond_b

    move v0, v1

    :goto_1
    const-string v3, "VUI: "

    invoke-virtual {p2, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 466
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->vclHRDParams:Lcom/googlecode/mp4parser/h264/model/HRDParameters;

    if-eqz v0, :cond_6

    .line 467
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->vclHRDParams:Lcom/googlecode/mp4parser/h264/model/HRDParameters;

    invoke-direct {p0, v0, p2}, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->writeHRDParameters(Lcom/googlecode/mp4parser/h264/model/HRDParameters;Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;)V

    .line 470
    :cond_6
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->nalHRDParams:Lcom/googlecode/mp4parser/h264/model/HRDParameters;

    if-nez v0, :cond_7

    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->vclHRDParams:Lcom/googlecode/mp4parser/h264/model/HRDParameters;

    if-eqz v0, :cond_8

    .line 472
    :cond_7
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->low_delay_hrd_flag:Z

    .line 473
    const-string v3, "VUI: low_delay_hrd_flag"

    .line 472
    invoke-virtual {p2, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 475
    :cond_8
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->pic_struct_present_flag:Z

    .line 476
    const-string v3, "VUI: pic_struct_present_flag"

    .line 475
    invoke-virtual {p2, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 477
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->bitstreamRestriction:Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;

    if-eqz v0, :cond_c

    :goto_2
    const-string v0, "VUI: "

    invoke-virtual {p2, v1, v0}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 478
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->bitstreamRestriction:Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;

    if-eqz v0, :cond_9

    .line 481
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->bitstreamRestriction:Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;

    iget-boolean v0, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;->motion_vectors_over_pic_boundaries_flag:Z

    .line 482
    const-string v1, "VUI: motion_vectors_over_pic_boundaries_flag"

    .line 480
    invoke-virtual {p2, v0, v1}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 483
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->bitstreamRestriction:Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;

    iget v0, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;->max_bytes_per_pic_denom:I

    .line 484
    const-string v1, "VUI: max_bytes_per_pic_denom"

    .line 483
    invoke-virtual {p2, v0, v1}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeUE(ILjava/lang/String;)V

    .line 485
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->bitstreamRestriction:Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;

    iget v0, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;->max_bits_per_mb_denom:I

    .line 486
    const-string v1, "VUI: max_bits_per_mb_denom"

    .line 485
    invoke-virtual {p2, v0, v1}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeUE(ILjava/lang/String;)V

    .line 488
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->bitstreamRestriction:Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;

    iget v0, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;->log2_max_mv_length_horizontal:I

    .line 489
    const-string v1, "VUI: log2_max_mv_length_horizontal"

    .line 487
    invoke-virtual {p2, v0, v1}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeUE(ILjava/lang/String;)V

    .line 491
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->bitstreamRestriction:Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;

    iget v0, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;->log2_max_mv_length_vertical:I

    .line 492
    const-string v1, "VUI: log2_max_mv_length_vertical"

    .line 490
    invoke-virtual {p2, v0, v1}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeUE(ILjava/lang/String;)V

    .line 493
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->bitstreamRestriction:Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;

    iget v0, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;->num_reorder_frames:I

    .line 494
    const-string v1, "VUI: num_reorder_frames"

    .line 493
    invoke-virtual {p2, v0, v1}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeUE(ILjava/lang/String;)V

    .line 495
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->bitstreamRestriction:Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;

    iget v0, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters$BitstreamRestriction;->max_dec_frame_buffering:I

    .line 496
    const-string v1, "VUI: max_dec_frame_buffering"

    .line 495
    invoke-virtual {p2, v0, v1}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeUE(ILjava/lang/String;)V

    .line 499
    :cond_9
    return-void

    :cond_a
    move v0, v2

    .line 461
    goto/16 :goto_0

    :cond_b
    move v0, v2

    .line 465
    goto :goto_1

    :cond_c
    move v1, v2

    .line 477
    goto :goto_2
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 523
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SeqParameterSet{ \n        pic_order_cnt_type="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 524
    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->pic_order_cnt_type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 525
    const-string v1, ", \n        field_pic_flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->field_pic_flag:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 526
    const-string v1, ", \n        delta_pic_order_always_zero_flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->delta_pic_order_always_zero_flag:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 527
    const-string v1, ", \n        weighted_pred_flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->weighted_pred_flag:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 528
    const-string v1, ", \n        weighted_bipred_idc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->weighted_bipred_idc:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 529
    const-string v1, ", \n        entropy_coding_mode_flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->entropy_coding_mode_flag:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 530
    const-string v1, ", \n        mb_adaptive_frame_field_flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->mb_adaptive_frame_field_flag:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 531
    const-string v1, ", \n        direct_8x8_inference_flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->direct_8x8_inference_flag:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 532
    const-string v1, ", \n        chroma_format_idc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->chroma_format_idc:Lcom/googlecode/mp4parser/h264/model/ChromaFormat;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 533
    const-string v1, ", \n        log2_max_frame_num_minus4="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->log2_max_frame_num_minus4:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 534
    const-string v1, ", \n        log2_max_pic_order_cnt_lsb_minus4="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->log2_max_pic_order_cnt_lsb_minus4:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 535
    const-string v1, ", \n        pic_height_in_map_units_minus1="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->pic_height_in_map_units_minus1:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 536
    const-string v1, ", \n        pic_width_in_mbs_minus1="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->pic_width_in_mbs_minus1:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 537
    const-string v1, ", \n        bit_depth_luma_minus8="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->bit_depth_luma_minus8:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 538
    const-string v1, ", \n        bit_depth_chroma_minus8="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->bit_depth_chroma_minus8:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 539
    const-string v1, ", \n        qpprime_y_zero_transform_bypass_flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->qpprime_y_zero_transform_bypass_flag:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 540
    const-string v1, ", \n        profile_idc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->profile_idc:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 541
    const-string v1, ", \n        constraint_set_0_flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->constraint_set_0_flag:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 542
    const-string v1, ", \n        constraint_set_1_flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->constraint_set_1_flag:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 543
    const-string v1, ", \n        constraint_set_2_flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->constraint_set_2_flag:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 544
    const-string v1, ", \n        constraint_set_3_flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->constraint_set_3_flag:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 545
    const-string v1, ", \n        constraint_set_4_flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->constraint_set_4_flag:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 546
    const-string v1, ", \n        constraint_set_5_flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->constraint_set_5_flag:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 547
    const-string v1, ", \n        level_idc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->level_idc:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 548
    const-string v1, ", \n        seq_parameter_set_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->seq_parameter_set_id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 549
    const-string v1, ", \n        residual_color_transform_flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->residual_color_transform_flag:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 550
    const-string v1, ", \n        offset_for_non_ref_pic="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->offset_for_non_ref_pic:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 551
    const-string v1, ", \n        offset_for_top_to_bottom_field="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->offset_for_top_to_bottom_field:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 552
    const-string v1, ", \n        num_ref_frames="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->num_ref_frames:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 553
    const-string v1, ", \n        gaps_in_frame_num_value_allowed_flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->gaps_in_frame_num_value_allowed_flag:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 554
    const-string v1, ", \n        frame_mbs_only_flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->frame_mbs_only_flag:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 555
    const-string v1, ", \n        frame_cropping_flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->frame_cropping_flag:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 556
    const-string v1, ", \n        frame_crop_left_offset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->frame_crop_left_offset:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 557
    const-string v1, ", \n        frame_crop_right_offset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->frame_crop_right_offset:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 558
    const-string v1, ", \n        frame_crop_top_offset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->frame_crop_top_offset:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 559
    const-string v1, ", \n        frame_crop_bottom_offset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->frame_crop_bottom_offset:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 560
    const-string v1, ", \n        offsetForRefFrame="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->offsetForRefFrame:[I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 561
    const-string v1, ", \n        vuiParams="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->vuiParams:Lcom/googlecode/mp4parser/h264/model/VUIParameters;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 562
    const-string v1, ", \n        scalingMatrix="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->scalingMatrix:Lcom/googlecode/mp4parser/h264/model/ScalingMatrix;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 563
    const-string v1, ", \n        num_ref_frames_in_pic_order_cnt_cycle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->num_ref_frames_in_pic_order_cnt_cycle:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 564
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 523
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public write(Ljava/io/OutputStream;)V
    .locals 9

    .prologue
    const/16 v8, 0x8

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 319
    new-instance v4, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;

    invoke-direct {v4, p1}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;-><init>(Ljava/io/OutputStream;)V

    .line 321
    iget v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->profile_idc:I

    int-to-long v6, v0

    const-string v0, "SPS: profile_idc"

    invoke-virtual {v4, v6, v7, v8, v0}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeNBit(JILjava/lang/String;)V

    .line 322
    iget-boolean v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->constraint_set_0_flag:Z

    const-string v3, "SPS: constraint_set_0_flag"

    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 323
    iget-boolean v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->constraint_set_1_flag:Z

    const-string v3, "SPS: constraint_set_1_flag"

    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 324
    iget-boolean v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->constraint_set_2_flag:Z

    const-string v3, "SPS: constraint_set_2_flag"

    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 325
    iget-boolean v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->constraint_set_3_flag:Z

    const-string v3, "SPS: constraint_set_3_flag"

    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 326
    const-wide/16 v6, 0x0

    const/4 v0, 0x4

    const-string v3, "SPS: reserved"

    invoke-virtual {v4, v6, v7, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeNBit(JILjava/lang/String;)V

    .line 327
    iget v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->level_idc:I

    int-to-long v6, v0

    const-string v0, "SPS: level_idc"

    invoke-virtual {v4, v6, v7, v8, v0}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeNBit(JILjava/lang/String;)V

    .line 328
    iget v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->seq_parameter_set_id:I

    const-string v3, "SPS: seq_parameter_set_id"

    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeUE(ILjava/lang/String;)V

    .line 330
    iget v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->profile_idc:I

    const/16 v3, 0x64

    if-eq v0, v3, :cond_0

    iget v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->profile_idc:I

    const/16 v3, 0x6e

    if-eq v0, v3, :cond_0

    iget v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->profile_idc:I

    const/16 v3, 0x7a

    if-eq v0, v3, :cond_0

    .line 331
    iget v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->profile_idc:I

    const/16 v3, 0x90

    if-ne v0, v3, :cond_2

    .line 332
    :cond_0
    iget-object v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->chroma_format_idc:Lcom/googlecode/mp4parser/h264/model/ChromaFormat;

    invoke-virtual {v0}, Lcom/googlecode/mp4parser/h264/model/ChromaFormat;->getId()I

    move-result v0

    const-string v3, "SPS: chroma_format_idc"

    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeUE(ILjava/lang/String;)V

    .line 333
    iget-object v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->chroma_format_idc:Lcom/googlecode/mp4parser/h264/model/ChromaFormat;

    sget-object v3, Lcom/googlecode/mp4parser/h264/model/ChromaFormat;->YUV_444:Lcom/googlecode/mp4parser/h264/model/ChromaFormat;

    if-ne v0, v3, :cond_1

    .line 334
    iget-boolean v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->residual_color_transform_flag:Z

    .line 335
    const-string v3, "SPS: residual_color_transform_flag"

    .line 334
    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 337
    :cond_1
    iget v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->bit_depth_luma_minus8:I

    const-string v3, "SPS: "

    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeUE(ILjava/lang/String;)V

    .line 338
    iget v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->bit_depth_chroma_minus8:I

    const-string v3, "SPS: "

    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeUE(ILjava/lang/String;)V

    .line 339
    iget-boolean v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->qpprime_y_zero_transform_bypass_flag:Z

    .line 340
    const-string v3, "SPS: qpprime_y_zero_transform_bypass_flag"

    .line 339
    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 341
    iget-object v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->scalingMatrix:Lcom/googlecode/mp4parser/h264/model/ScalingMatrix;

    if-eqz v0, :cond_7

    move v0, v1

    :goto_0
    const-string v3, "SPS: "

    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 342
    iget-object v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->scalingMatrix:Lcom/googlecode/mp4parser/h264/model/ScalingMatrix;

    if-eqz v0, :cond_2

    move v3, v2

    .line 343
    :goto_1
    if-lt v3, v8, :cond_8

    .line 362
    :cond_2
    iget v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->log2_max_frame_num_minus4:I

    .line 363
    const-string v3, "SPS: log2_max_frame_num_minus4"

    .line 362
    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeUE(ILjava/lang/String;)V

    .line 364
    iget v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->pic_order_cnt_type:I

    const-string v3, "SPS: pic_order_cnt_type"

    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeUE(ILjava/lang/String;)V

    .line 365
    iget v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->pic_order_cnt_type:I

    if-nez v0, :cond_d

    .line 366
    iget v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->log2_max_pic_order_cnt_lsb_minus4:I

    .line 367
    const-string v3, "SPS: log2_max_pic_order_cnt_lsb_minus4"

    .line 366
    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeUE(ILjava/lang/String;)V

    .line 379
    :cond_3
    iget v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->num_ref_frames:I

    const-string v3, "SPS: num_ref_frames"

    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeUE(ILjava/lang/String;)V

    .line 380
    iget-boolean v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->gaps_in_frame_num_value_allowed_flag:Z

    .line 381
    const-string v3, "SPS: gaps_in_frame_num_value_allowed_flag"

    .line 380
    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 382
    iget v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->pic_width_in_mbs_minus1:I

    const-string v3, "SPS: pic_width_in_mbs_minus1"

    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeUE(ILjava/lang/String;)V

    .line 383
    iget v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->pic_height_in_map_units_minus1:I

    .line 384
    const-string v3, "SPS: pic_height_in_map_units_minus1"

    .line 383
    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeUE(ILjava/lang/String;)V

    .line 385
    iget-boolean v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->frame_mbs_only_flag:Z

    const-string v3, "SPS: frame_mbs_only_flag"

    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 386
    iget-boolean v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->frame_mbs_only_flag:Z

    if-nez v0, :cond_4

    .line 387
    iget-boolean v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->mb_adaptive_frame_field_flag:Z

    .line 388
    const-string v3, "SPS: mb_adaptive_frame_field_flag"

    .line 387
    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 390
    :cond_4
    iget-boolean v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->direct_8x8_inference_flag:Z

    .line 391
    const-string v3, "SPS: direct_8x8_inference_flag"

    .line 390
    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 392
    iget-boolean v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->frame_cropping_flag:Z

    const-string v3, "SPS: frame_cropping_flag"

    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 393
    iget-boolean v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->frame_cropping_flag:Z

    if-eqz v0, :cond_5

    .line 394
    iget v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->frame_crop_left_offset:I

    .line 395
    const-string v3, "SPS: frame_crop_left_offset"

    .line 394
    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeUE(ILjava/lang/String;)V

    .line 396
    iget v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->frame_crop_right_offset:I

    .line 397
    const-string v3, "SPS: frame_crop_right_offset"

    .line 396
    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeUE(ILjava/lang/String;)V

    .line 398
    iget v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->frame_crop_top_offset:I

    const-string v3, "SPS: frame_crop_top_offset"

    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeUE(ILjava/lang/String;)V

    .line 399
    iget v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->frame_crop_bottom_offset:I

    .line 400
    const-string v3, "SPS: frame_crop_bottom_offset"

    .line 399
    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeUE(ILjava/lang/String;)V

    .line 402
    :cond_5
    iget-object v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->vuiParams:Lcom/googlecode/mp4parser/h264/model/VUIParameters;

    if-eqz v0, :cond_e

    :goto_2
    const-string v0, "SPS: "

    invoke-virtual {v4, v1, v0}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 403
    iget-object v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->vuiParams:Lcom/googlecode/mp4parser/h264/model/VUIParameters;

    if-eqz v0, :cond_6

    .line 404
    iget-object v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->vuiParams:Lcom/googlecode/mp4parser/h264/model/VUIParameters;

    invoke-direct {p0, v0, v4}, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->writeVUIParameters(Lcom/googlecode/mp4parser/h264/model/VUIParameters;Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;)V

    .line 406
    :cond_6
    invoke-virtual {v4}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeTrailingBits()V

    .line 407
    return-void

    :cond_7
    move v0, v2

    .line 341
    goto/16 :goto_0

    .line 344
    :cond_8
    const/4 v0, 0x6

    if-ge v3, v0, :cond_b

    .line 346
    iget-object v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->scalingMatrix:Lcom/googlecode/mp4parser/h264/model/ScalingMatrix;

    iget-object v0, v0, Lcom/googlecode/mp4parser/h264/model/ScalingMatrix;->ScalingList4x4:[Lcom/googlecode/mp4parser/h264/model/ScalingList;

    aget-object v0, v0, v3

    if-eqz v0, :cond_a

    move v0, v1

    .line 347
    :goto_3
    const-string v5, "SPS: "

    .line 345
    invoke-virtual {v4, v0, v5}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 348
    iget-object v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->scalingMatrix:Lcom/googlecode/mp4parser/h264/model/ScalingMatrix;

    iget-object v0, v0, Lcom/googlecode/mp4parser/h264/model/ScalingMatrix;->ScalingList4x4:[Lcom/googlecode/mp4parser/h264/model/ScalingList;

    aget-object v0, v0, v3

    if-eqz v0, :cond_9

    .line 349
    iget-object v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->scalingMatrix:Lcom/googlecode/mp4parser/h264/model/ScalingMatrix;

    iget-object v0, v0, Lcom/googlecode/mp4parser/h264/model/ScalingMatrix;->ScalingList4x4:[Lcom/googlecode/mp4parser/h264/model/ScalingList;

    aget-object v0, v0, v3

    invoke-virtual {v0, v4}, Lcom/googlecode/mp4parser/h264/model/ScalingList;->write(Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;)V

    .line 343
    :cond_9
    :goto_4
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto/16 :goto_1

    :cond_a
    move v0, v2

    .line 346
    goto :goto_3

    .line 353
    :cond_b
    iget-object v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->scalingMatrix:Lcom/googlecode/mp4parser/h264/model/ScalingMatrix;

    iget-object v0, v0, Lcom/googlecode/mp4parser/h264/model/ScalingMatrix;->ScalingList8x8:[Lcom/googlecode/mp4parser/h264/model/ScalingList;

    add-int/lit8 v5, v3, -0x6

    aget-object v0, v0, v5

    if-eqz v0, :cond_c

    move v0, v1

    .line 354
    :goto_5
    const-string v5, "SPS: "

    .line 352
    invoke-virtual {v4, v0, v5}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 355
    iget-object v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->scalingMatrix:Lcom/googlecode/mp4parser/h264/model/ScalingMatrix;

    iget-object v0, v0, Lcom/googlecode/mp4parser/h264/model/ScalingMatrix;->ScalingList8x8:[Lcom/googlecode/mp4parser/h264/model/ScalingList;

    add-int/lit8 v5, v3, -0x6

    aget-object v0, v0, v5

    if-eqz v0, :cond_9

    .line 356
    iget-object v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->scalingMatrix:Lcom/googlecode/mp4parser/h264/model/ScalingMatrix;

    iget-object v0, v0, Lcom/googlecode/mp4parser/h264/model/ScalingMatrix;->ScalingList8x8:[Lcom/googlecode/mp4parser/h264/model/ScalingList;

    add-int/lit8 v5, v3, -0x6

    aget-object v0, v0, v5

    invoke-virtual {v0, v4}, Lcom/googlecode/mp4parser/h264/model/ScalingList;->write(Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;)V

    goto :goto_4

    :cond_c
    move v0, v2

    .line 353
    goto :goto_5

    .line 368
    :cond_d
    iget v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->pic_order_cnt_type:I

    if-ne v0, v1, :cond_3

    .line 369
    iget-boolean v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->delta_pic_order_always_zero_flag:Z

    .line 370
    const-string v3, "SPS: delta_pic_order_always_zero_flag"

    .line 369
    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeBool(ZLjava/lang/String;)V

    .line 371
    iget v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->offset_for_non_ref_pic:I

    .line 372
    const-string v3, "SPS: offset_for_non_ref_pic"

    .line 371
    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeSE(ILjava/lang/String;)V

    .line 373
    iget v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->offset_for_top_to_bottom_field:I

    .line 374
    const-string v3, "SPS: offset_for_top_to_bottom_field"

    .line 373
    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeSE(ILjava/lang/String;)V

    .line 375
    iget-object v0, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->offsetForRefFrame:[I

    array-length v0, v0

    const-string v3, "SPS: "

    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeUE(ILjava/lang/String;)V

    move v0, v2

    .line 376
    :goto_6
    iget-object v3, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->offsetForRefFrame:[I

    array-length v3, v3

    if-ge v0, v3, :cond_3

    .line 377
    iget-object v3, p0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->offsetForRefFrame:[I

    aget v3, v3, v0

    const-string v5, "SPS: "

    invoke-virtual {v4, v3, v5}, Lcom/googlecode/mp4parser/h264/write/CAVLCWriter;->writeSE(ILjava/lang/String;)V

    .line 376
    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_e
    move v1, v2

    .line 402
    goto/16 :goto_2
.end method
