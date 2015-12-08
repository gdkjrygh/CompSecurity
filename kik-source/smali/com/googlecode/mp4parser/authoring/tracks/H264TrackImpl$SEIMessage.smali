.class public Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "SEIMessage"
.end annotation


# instance fields
.field clock_timestamp_flag:Z

.field cnt_dropped_flag:I

.field counting_type:I

.field cpb_removal_delay:I

.field ct_type:I

.field discontinuity_flag:I

.field dpb_removal_delay:I

.field full_timestamp_flag:I

.field hours_value:I

.field minutes_value:I

.field n_frames:I

.field nuit_field_based_flag:I

.field payloadSize:I

.field payloadType:I

.field pic_struct:I

.field removal_delay_flag:Z

.field seconds_value:I

.field sps:Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;

.field final synthetic this$0:Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;

.field time_offset:I

.field time_offset_length:I


# direct methods
.method public constructor <init>(Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;Ljava/io/InputStream;Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;)V
    .locals 7

    .prologue
    .line 827
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->this$0:Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 803
    const/4 v0, 0x0

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->payloadType:I

    .line 804
    const/4 v0, 0x0

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->payloadSize:I

    .line 828
    iput-object p3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->sps:Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;

    .line 829
    invoke-virtual {p2}, Ljava/io/InputStream;->read()I

    .line 830
    invoke-virtual {p2}, Ljava/io/InputStream;->available()I

    move-result v2

    .line 831
    const/4 v1, 0x0

    .line 832
    :goto_0
    if-lt v1, v2, :cond_0

    .line 945
    return-void

    .line 833
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->payloadType:I

    .line 834
    const/4 v0, 0x0

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->payloadSize:I

    .line 835
    invoke-virtual {p2}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 836
    add-int/lit8 v1, v1, 0x1

    .line 837
    :goto_1
    const/16 v3, 0xff

    if-eq v0, v3, :cond_4

    .line 842
    iget v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->payloadType:I

    add-int/2addr v0, v3

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->payloadType:I

    .line 843
    invoke-virtual {p2}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 844
    add-int/lit8 v1, v1, 0x1

    .line 846
    :goto_2
    const/16 v3, 0xff

    if-eq v0, v3, :cond_5

    .line 851
    iget v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->payloadSize:I

    add-int/2addr v0, v3

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->payloadSize:I

    .line 852
    sub-int v0, v2, v1

    iget v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->payloadSize:I

    if-lt v0, v3, :cond_f

    .line 853
    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->payloadType:I

    const/4 v3, 0x1

    if-ne v0, v3, :cond_e

    .line 854
    iget-object v0, p3, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->vuiParams:Lcom/googlecode/mp4parser/h264/model/VUIParameters;

    if-eqz v0, :cond_d

    iget-object v0, p3, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->vuiParams:Lcom/googlecode/mp4parser/h264/model/VUIParameters;

    iget-object v0, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->nalHRDParams:Lcom/googlecode/mp4parser/h264/model/HRDParameters;

    if-nez v0, :cond_1

    iget-object v0, p3, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->vuiParams:Lcom/googlecode/mp4parser/h264/model/VUIParameters;

    iget-object v0, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->vclHRDParams:Lcom/googlecode/mp4parser/h264/model/HRDParameters;

    if-nez v0, :cond_1

    iget-object v0, p3, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->vuiParams:Lcom/googlecode/mp4parser/h264/model/VUIParameters;

    iget-boolean v0, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->pic_struct_present_flag:Z

    if-eqz v0, :cond_d

    .line 855
    :cond_1
    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->payloadSize:I

    new-array v0, v0, [B

    .line 856
    invoke-virtual {p2, v0}, Ljava/io/InputStream;->read([B)I

    .line 857
    iget v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->payloadSize:I

    add-int/2addr v1, v3

    .line 858
    new-instance v4, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;

    new-instance v3, Ljava/io/ByteArrayInputStream;

    invoke-direct {v3, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v4, v3}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;-><init>(Ljava/io/InputStream;)V

    .line 859
    iget-object v0, p3, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->vuiParams:Lcom/googlecode/mp4parser/h264/model/VUIParameters;

    iget-object v0, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->nalHRDParams:Lcom/googlecode/mp4parser/h264/model/HRDParameters;

    if-nez v0, :cond_2

    iget-object v0, p3, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->vuiParams:Lcom/googlecode/mp4parser/h264/model/VUIParameters;

    iget-object v0, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->vclHRDParams:Lcom/googlecode/mp4parser/h264/model/HRDParameters;

    if-eqz v0, :cond_6

    .line 860
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->removal_delay_flag:Z

    .line 861
    iget-object v0, p3, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->vuiParams:Lcom/googlecode/mp4parser/h264/model/VUIParameters;

    iget-object v0, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->nalHRDParams:Lcom/googlecode/mp4parser/h264/model/HRDParameters;

    iget v0, v0, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->cpb_removal_delay_length_minus1:I

    add-int/lit8 v0, v0, 0x1

    const-string v3, "SEI: cpb_removal_delay"

    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readU(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->cpb_removal_delay:I

    .line 862
    iget-object v0, p3, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->vuiParams:Lcom/googlecode/mp4parser/h264/model/VUIParameters;

    iget-object v0, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->nalHRDParams:Lcom/googlecode/mp4parser/h264/model/HRDParameters;

    iget v0, v0, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->dpb_output_delay_length_minus1:I

    add-int/lit8 v0, v0, 0x1

    const-string v3, "SEI: dpb_removal_delay"

    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readU(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->dpb_removal_delay:I

    .line 866
    :goto_3
    iget-object v0, p3, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->vuiParams:Lcom/googlecode/mp4parser/h264/model/VUIParameters;

    iget-boolean v0, v0, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->pic_struct_present_flag:Z

    if-eqz v0, :cond_3

    .line 867
    const/4 v0, 0x4

    const-string v3, "SEI: pic_struct"

    invoke-virtual {v4, v0, v3}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readU(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->pic_struct:I

    .line 869
    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->pic_struct:I

    packed-switch v0, :pswitch_data_0

    .line 874
    const/4 v0, 0x1

    .line 889
    :goto_4
    const/4 v3, 0x0

    :goto_5
    if-lt v3, v0, :cond_7

    .line 943
    :cond_3
    :goto_6
    # getter for: Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->LOG:Ljava/util/logging/Logger;
    invoke-static {}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->access$0()Ljava/util/logging/Logger;

    move-result-object v0

    invoke-virtual {p0}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 838
    :cond_4
    iget v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->payloadType:I

    add-int/2addr v0, v3

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->payloadType:I

    .line 839
    invoke-virtual {p2}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 840
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_1

    .line 847
    :cond_5
    iget v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->payloadSize:I

    add-int/2addr v0, v3

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->payloadSize:I

    .line 848
    invoke-virtual {p2}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 849
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_2

    .line 864
    :cond_6
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->removal_delay_flag:Z

    goto :goto_3

    .line 880
    :pswitch_0
    const/4 v0, 0x2

    .line 881
    goto :goto_4

    .line 886
    :pswitch_1
    const/4 v0, 0x3

    goto :goto_4

    .line 890
    :cond_7
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "pic_timing SEI: clock_timestamp_flag["

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "]"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v5

    iput-boolean v5, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->clock_timestamp_flag:Z

    .line 891
    iget-boolean v5, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->clock_timestamp_flag:Z

    if-eqz v5, :cond_9

    .line 892
    const/4 v5, 0x2

    const-string v6, "pic_timing SEI: ct_type"

    invoke-virtual {v4, v5, v6}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readU(ILjava/lang/String;)I

    move-result v5

    iput v5, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->ct_type:I

    .line 893
    const/4 v5, 0x1

    const-string v6, "pic_timing SEI: nuit_field_based_flag"

    invoke-virtual {v4, v5, v6}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readU(ILjava/lang/String;)I

    move-result v5

    iput v5, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->nuit_field_based_flag:I

    .line 894
    const/4 v5, 0x5

    const-string v6, "pic_timing SEI: counting_type"

    invoke-virtual {v4, v5, v6}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readU(ILjava/lang/String;)I

    move-result v5

    iput v5, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->counting_type:I

    .line 895
    const/4 v5, 0x1

    const-string v6, "pic_timing SEI: full_timestamp_flag"

    invoke-virtual {v4, v5, v6}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readU(ILjava/lang/String;)I

    move-result v5

    iput v5, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->full_timestamp_flag:I

    .line 896
    const/4 v5, 0x1

    const-string v6, "pic_timing SEI: discontinuity_flag"

    invoke-virtual {v4, v5, v6}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readU(ILjava/lang/String;)I

    move-result v5

    iput v5, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->discontinuity_flag:I

    .line 897
    const/4 v5, 0x1

    const-string v6, "pic_timing SEI: cnt_dropped_flag"

    invoke-virtual {v4, v5, v6}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readU(ILjava/lang/String;)I

    move-result v5

    iput v5, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->cnt_dropped_flag:I

    .line 898
    const/16 v5, 0x8

    const-string v6, "pic_timing SEI: n_frames"

    invoke-virtual {v4, v5, v6}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readU(ILjava/lang/String;)I

    move-result v5

    iput v5, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->n_frames:I

    .line 899
    iget v5, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->full_timestamp_flag:I

    const/4 v6, 0x1

    if-ne v5, v6, :cond_a

    .line 900
    const/4 v5, 0x6

    const-string v6, "pic_timing SEI: seconds_value"

    invoke-virtual {v4, v5, v6}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readU(ILjava/lang/String;)I

    move-result v5

    iput v5, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->seconds_value:I

    .line 901
    const/4 v5, 0x6

    const-string v6, "pic_timing SEI: minutes_value"

    invoke-virtual {v4, v5, v6}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readU(ILjava/lang/String;)I

    move-result v5

    iput v5, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->minutes_value:I

    .line 902
    const/4 v5, 0x5

    const-string v6, "pic_timing SEI: hours_value"

    invoke-virtual {v4, v5, v6}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readU(ILjava/lang/String;)I

    move-result v5

    iput v5, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->hours_value:I

    .line 915
    :cond_8
    :goto_7
    iget-object v5, p3, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->vuiParams:Lcom/googlecode/mp4parser/h264/model/VUIParameters;

    iget-object v5, v5, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->nalHRDParams:Lcom/googlecode/mp4parser/h264/model/HRDParameters;

    if-eqz v5, :cond_b

    .line 916
    iget-object v5, p3, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->vuiParams:Lcom/googlecode/mp4parser/h264/model/VUIParameters;

    iget-object v5, v5, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->nalHRDParams:Lcom/googlecode/mp4parser/h264/model/HRDParameters;

    iget v5, v5, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->time_offset_length:I

    iput v5, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->time_offset_length:I

    .line 922
    :goto_8
    const/16 v5, 0x18

    const-string v6, "pic_timing SEI: time_offset"

    invoke-virtual {v4, v5, v6}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readU(ILjava/lang/String;)I

    move-result v5

    iput v5, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->time_offset:I

    .line 889
    :cond_9
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_5

    .line 904
    :cond_a
    const-string v5, "pic_timing SEI: seconds_flag"

    invoke-virtual {v4, v5}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 905
    const/4 v5, 0x6

    const-string v6, "pic_timing SEI: seconds_value"

    invoke-virtual {v4, v5, v6}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readU(ILjava/lang/String;)I

    move-result v5

    iput v5, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->seconds_value:I

    .line 906
    const-string v5, "pic_timing SEI: minutes_flag"

    invoke-virtual {v4, v5}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 907
    const/4 v5, 0x6

    const-string v6, "pic_timing SEI: minutes_value"

    invoke-virtual {v4, v5, v6}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readU(ILjava/lang/String;)I

    move-result v5

    iput v5, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->minutes_value:I

    .line 908
    const-string v5, "pic_timing SEI: hours_flag"

    invoke-virtual {v4, v5}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readBool(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 909
    const/4 v5, 0x5

    const-string v6, "pic_timing SEI: hours_value"

    invoke-virtual {v4, v5, v6}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readU(ILjava/lang/String;)I

    move-result v5

    iput v5, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->hours_value:I

    goto :goto_7

    .line 917
    :cond_b
    iget-object v5, p3, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->vuiParams:Lcom/googlecode/mp4parser/h264/model/VUIParameters;

    iget-object v5, v5, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->vclHRDParams:Lcom/googlecode/mp4parser/h264/model/HRDParameters;

    if-eqz v5, :cond_c

    .line 918
    iget-object v5, p3, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->vuiParams:Lcom/googlecode/mp4parser/h264/model/VUIParameters;

    iget-object v5, v5, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->vclHRDParams:Lcom/googlecode/mp4parser/h264/model/HRDParameters;

    iget v5, v5, Lcom/googlecode/mp4parser/h264/model/HRDParameters;->time_offset_length:I

    iput v5, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->time_offset_length:I

    goto :goto_8

    .line 920
    :cond_c
    const/16 v5, 0x18

    iput v5, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->time_offset_length:I

    goto :goto_8

    .line 929
    :cond_d
    const/4 v0, 0x0

    :goto_9
    iget v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->payloadSize:I

    if-ge v0, v3, :cond_3

    .line 930
    invoke-virtual {p2}, Ljava/io/InputStream;->read()I

    .line 931
    add-int/lit8 v1, v1, 0x1

    .line 929
    add-int/lit8 v0, v0, 0x1

    goto :goto_9

    .line 935
    :cond_e
    const/4 v0, 0x0

    :goto_a
    iget v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->payloadSize:I

    if-ge v0, v3, :cond_3

    .line 936
    invoke-virtual {p2}, Ljava/io/InputStream;->read()I

    .line 937
    add-int/lit8 v1, v1, 0x1

    .line 935
    add-int/lit8 v0, v0, 0x1

    goto :goto_a

    :cond_f
    move v1, v2

    .line 941
    goto/16 :goto_6

    .line 869
    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 949
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SEIMessage{payloadType="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 950
    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->payloadType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 951
    const-string v1, ", payloadSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->payloadSize:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 949
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 952
    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->payloadType:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    .line 953
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->sps:Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;

    iget-object v1, v1, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->vuiParams:Lcom/googlecode/mp4parser/h264/model/VUIParameters;

    iget-object v1, v1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->nalHRDParams:Lcom/googlecode/mp4parser/h264/model/HRDParameters;

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->sps:Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;

    iget-object v1, v1, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->vuiParams:Lcom/googlecode/mp4parser/h264/model/VUIParameters;

    iget-object v1, v1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->vclHRDParams:Lcom/googlecode/mp4parser/h264/model/HRDParameters;

    if-eqz v1, :cond_1

    .line 955
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v0, ", cpb_removal_delay="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->cpb_removal_delay:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 956
    const-string v1, ", dpb_removal_delay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->dpb_removal_delay:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 955
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 958
    :cond_1
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->sps:Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;

    iget-object v1, v1, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->vuiParams:Lcom/googlecode/mp4parser/h264/model/VUIParameters;

    iget-boolean v1, v1, Lcom/googlecode/mp4parser/h264/model/VUIParameters;->pic_struct_present_flag:Z

    if-eqz v1, :cond_2

    .line 959
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v0, ", pic_struct="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->pic_struct:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 960
    iget-boolean v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->clock_timestamp_flag:Z

    if-eqz v1, :cond_2

    .line 961
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v0, ", ct_type="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->ct_type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 962
    const-string v1, ", nuit_field_based_flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->nuit_field_based_flag:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 963
    const-string v1, ", counting_type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->counting_type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 964
    const-string v1, ", full_timestamp_flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->full_timestamp_flag:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 965
    const-string v1, ", discontinuity_flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->discontinuity_flag:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 966
    const-string v1, ", cnt_dropped_flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->cnt_dropped_flag:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 967
    const-string v1, ", n_frames="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->n_frames:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 968
    const-string v1, ", seconds_value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->seconds_value:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 969
    const-string v1, ", minutes_value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->minutes_value:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 970
    const-string v1, ", hours_value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->hours_value:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 971
    const-string v1, ", time_offset_length="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->time_offset_length:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 972
    const-string v1, ", time_offset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SEIMessage;->time_offset:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 961
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 976
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v0, 0x7d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 977
    return-object v0
.end method
