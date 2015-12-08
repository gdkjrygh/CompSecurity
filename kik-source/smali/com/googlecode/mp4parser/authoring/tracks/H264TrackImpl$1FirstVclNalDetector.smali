.class Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field bottom_field_flag:Z

.field delta_pic_order_cnt_0:I

.field delta_pic_order_cnt_1:I

.field delta_pic_order_cnt_bottom:I

.field field_pic_flag:Z

.field frame_num:I

.field idrPicFlag:Z

.field idr_pic_id:I

.field nal_ref_idc:I

.field pic_order_cnt_lsb:I

.field pic_order_cnt_type:I

.field pic_parameter_set_id:I

.field final synthetic this$0:Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;


# direct methods
.method public constructor <init>(Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;Ljava/nio/ByteBuffer;II)V
    .locals 5

    .prologue
    .line 359
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->this$0:Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 360
    new-instance v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$ByteBufferBackedInputStream;

    invoke-direct {v0, p1, p2}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$ByteBufferBackedInputStream;-><init>(Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;Ljava/nio/ByteBuffer;)V

    invoke-virtual {p1, v0}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->cleanBuffer(Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object v1

    .line 361
    new-instance v2, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader;

    iget-object v3, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->spsIdToSps:Ljava/util/Map;

    iget-object v4, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->ppsIdToPps:Ljava/util/Map;

    const/4 v0, 0x5

    if-ne p4, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-direct {v2, v1, v3, v4, v0}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader;-><init>(Ljava/io/InputStream;Ljava/util/Map;Ljava/util/Map;Z)V

    .line 362
    iget v0, v2, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader;->frame_num:I

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->frame_num:I

    .line 363
    iget v0, v2, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader;->pic_parameter_set_id:I

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->pic_parameter_set_id:I

    .line 364
    iget-boolean v0, v2, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader;->field_pic_flag:Z

    iput-boolean v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->field_pic_flag:Z

    .line 365
    iget-boolean v0, v2, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader;->bottom_field_flag:Z

    iput-boolean v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->bottom_field_flag:Z

    .line 366
    iput p3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->nal_ref_idc:I

    .line 367
    iget-object v1, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->spsIdToSps:Ljava/util/Map;

    iget-object v0, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->ppsIdToPps:Ljava/util/Map;

    iget v3, v2, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader;->pic_parameter_set_id:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/googlecode/mp4parser/h264/model/PictureParameterSet;

    iget v0, v0, Lcom/googlecode/mp4parser/h264/model/PictureParameterSet;->seq_parameter_set_id:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;

    iget v0, v0, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->pic_order_cnt_type:I

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->pic_order_cnt_type:I

    .line 368
    iget v0, v2, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader;->delta_pic_order_cnt_bottom:I

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->delta_pic_order_cnt_bottom:I

    .line 369
    iget v0, v2, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader;->pic_order_cnt_lsb:I

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->pic_order_cnt_lsb:I

    .line 370
    iget v0, v2, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader;->delta_pic_order_cnt_0:I

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->delta_pic_order_cnt_0:I

    .line 371
    iget v0, v2, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader;->delta_pic_order_cnt_1:I

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->delta_pic_order_cnt_1:I

    .line 372
    iget v0, v2, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader;->idr_pic_id:I

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->idr_pic_id:I

    .line 373
    return-void

    .line 361
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method isFirstInNew(Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 389
    iget v1, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->frame_num:I

    iget v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->frame_num:I

    if-eq v1, v2, :cond_1

    .line 430
    :cond_0
    :goto_0
    return v0

    .line 392
    :cond_1
    iget v1, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->pic_parameter_set_id:I

    iget v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->pic_parameter_set_id:I

    if-ne v1, v2, :cond_0

    .line 395
    iget-boolean v1, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->field_pic_flag:Z

    iget-boolean v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->field_pic_flag:Z

    if-ne v1, v2, :cond_0

    .line 398
    iget-boolean v1, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->field_pic_flag:Z

    if-eqz v1, :cond_2

    .line 399
    iget-boolean v1, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->bottom_field_flag:Z

    iget-boolean v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->bottom_field_flag:Z

    if-ne v1, v2, :cond_0

    .line 403
    :cond_2
    iget v1, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->nal_ref_idc:I

    iget v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->nal_ref_idc:I

    if-ne v1, v2, :cond_0

    .line 406
    iget v1, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->pic_order_cnt_type:I

    if-nez v1, :cond_3

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->pic_order_cnt_type:I

    if-nez v1, :cond_3

    .line 407
    iget v1, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->pic_order_cnt_lsb:I

    iget v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->pic_order_cnt_lsb:I

    if-ne v1, v2, :cond_0

    .line 410
    iget v1, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->delta_pic_order_cnt_bottom:I

    iget v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->delta_pic_order_cnt_bottom:I

    if-ne v1, v2, :cond_0

    .line 414
    :cond_3
    iget v1, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->pic_order_cnt_type:I

    if-ne v1, v0, :cond_4

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->pic_order_cnt_type:I

    if-ne v1, v0, :cond_4

    .line 415
    iget v1, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->delta_pic_order_cnt_0:I

    iget v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->delta_pic_order_cnt_0:I

    if-ne v1, v2, :cond_0

    .line 418
    iget v1, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->delta_pic_order_cnt_1:I

    iget v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->delta_pic_order_cnt_1:I

    if-ne v1, v2, :cond_0

    .line 422
    :cond_4
    iget-boolean v1, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->idrPicFlag:Z

    iget-boolean v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->idrPicFlag:Z

    if-ne v1, v2, :cond_0

    .line 425
    iget-boolean v1, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->idrPicFlag:Z

    if-eqz v1, :cond_5

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->idrPicFlag:Z

    if-eqz v1, :cond_5

    .line 426
    iget v1, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->idr_pic_id:I

    iget v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$1FirstVclNalDetector;->idr_pic_id:I

    if-ne v1, v2, :cond_0

    .line 430
    :cond_5
    const/4 v0, 0x0

    goto :goto_0
.end method
