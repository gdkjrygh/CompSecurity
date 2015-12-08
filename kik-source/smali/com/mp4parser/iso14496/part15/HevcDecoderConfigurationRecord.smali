.class public Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord$Array;
    }
.end annotation


# instance fields
.field arrays:Ljava/util/List;

.field avgFrameRate:I

.field bitDepthChromaMinus8:I

.field bitDepthLumaMinus8:I

.field chromaFormat:I

.field configurationVersion:I

.field constantFrameRate:I

.field frame_only_constraint_flag:Z

.field general_constraint_indicator_flags:J

.field general_level_idc:I

.field general_profile_compatibility_flags:J

.field general_profile_idc:I

.field general_profile_space:I

.field general_tier_flag:Z

.field interlaced_source_flag:Z

.field lengthSizeMinusOne:I

.field min_spatial_segmentation_idc:I

.field non_packed_constraint_flag:Z

.field numTemporalLayers:I

.field parallelismType:I

.field progressive_source_flag:Z

.field reserved1:I

.field reserved2:I

.field reserved3:I

.field reserved4:I

.field reserved5:I

.field temporalIdNested:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/16 v2, 0x3f

    const/16 v1, 0x1f

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    const/16 v0, 0xf

    iput v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved1:I

    .line 27
    iput v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved2:I

    .line 30
    iput v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved3:I

    .line 33
    iput v1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved4:I

    .line 36
    iput v1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved5:I

    .line 55
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 210
    if-ne p0, p1, :cond_1

    .line 239
    :cond_0
    :goto_0
    return v0

    .line 211
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    goto :goto_0

    .line 213
    :cond_3
    check-cast p1, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;

    .line 215
    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->avgFrameRate:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->avgFrameRate:I

    if-eq v2, v3, :cond_4

    move v0, v1

    goto :goto_0

    .line 216
    :cond_4
    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->bitDepthChromaMinus8:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->bitDepthChromaMinus8:I

    if-eq v2, v3, :cond_5

    move v0, v1

    goto :goto_0

    .line 217
    :cond_5
    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->bitDepthLumaMinus8:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->bitDepthLumaMinus8:I

    if-eq v2, v3, :cond_6

    move v0, v1

    goto :goto_0

    .line 218
    :cond_6
    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->chromaFormat:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->chromaFormat:I

    if-eq v2, v3, :cond_7

    move v0, v1

    goto :goto_0

    .line 219
    :cond_7
    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->configurationVersion:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->configurationVersion:I

    if-eq v2, v3, :cond_8

    move v0, v1

    goto :goto_0

    .line 220
    :cond_8
    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->constantFrameRate:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->constantFrameRate:I

    if-eq v2, v3, :cond_9

    move v0, v1

    goto :goto_0

    .line 221
    :cond_9
    iget-wide v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_constraint_indicator_flags:J

    iget-wide v4, p1, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_constraint_indicator_flags:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_a

    move v0, v1

    goto :goto_0

    .line 222
    :cond_a
    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_level_idc:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_level_idc:I

    if-eq v2, v3, :cond_b

    move v0, v1

    goto :goto_0

    .line 223
    :cond_b
    iget-wide v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_profile_compatibility_flags:J

    iget-wide v4, p1, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_profile_compatibility_flags:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_c

    move v0, v1

    goto :goto_0

    .line 224
    :cond_c
    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_profile_idc:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_profile_idc:I

    if-eq v2, v3, :cond_d

    move v0, v1

    goto :goto_0

    .line 225
    :cond_d
    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_profile_space:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_profile_space:I

    if-eq v2, v3, :cond_e

    move v0, v1

    goto :goto_0

    .line 226
    :cond_e
    iget-boolean v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_tier_flag:Z

    iget-boolean v3, p1, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_tier_flag:Z

    if-eq v2, v3, :cond_f

    move v0, v1

    goto :goto_0

    .line 227
    :cond_f
    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->lengthSizeMinusOne:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->lengthSizeMinusOne:I

    if-eq v2, v3, :cond_10

    move v0, v1

    goto :goto_0

    .line 228
    :cond_10
    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->min_spatial_segmentation_idc:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->min_spatial_segmentation_idc:I

    if-eq v2, v3, :cond_11

    move v0, v1

    goto/16 :goto_0

    .line 229
    :cond_11
    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->numTemporalLayers:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->numTemporalLayers:I

    if-eq v2, v3, :cond_12

    move v0, v1

    goto/16 :goto_0

    .line 230
    :cond_12
    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->parallelismType:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->parallelismType:I

    if-eq v2, v3, :cond_13

    move v0, v1

    goto/16 :goto_0

    .line 231
    :cond_13
    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved1:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved1:I

    if-eq v2, v3, :cond_14

    move v0, v1

    goto/16 :goto_0

    .line 232
    :cond_14
    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved2:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved2:I

    if-eq v2, v3, :cond_15

    move v0, v1

    goto/16 :goto_0

    .line 233
    :cond_15
    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved3:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved3:I

    if-eq v2, v3, :cond_16

    move v0, v1

    goto/16 :goto_0

    .line 234
    :cond_16
    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved4:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved4:I

    if-eq v2, v3, :cond_17

    move v0, v1

    goto/16 :goto_0

    .line 235
    :cond_17
    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved5:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved5:I

    if-eq v2, v3, :cond_18

    move v0, v1

    goto/16 :goto_0

    .line 236
    :cond_18
    iget-boolean v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->temporalIdNested:Z

    iget-boolean v3, p1, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->temporalIdNested:Z

    if-eq v2, v3, :cond_19

    move v0, v1

    goto/16 :goto_0

    .line 237
    :cond_19
    iget-object v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->arrays:Ljava/util/List;

    if-eqz v2, :cond_1a

    iget-object v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->arrays:Ljava/util/List;

    iget-object v3, p1, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->arrays:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :goto_1
    move v0, v1

    goto/16 :goto_0

    :cond_1a
    iget-object v2, p1, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->arrays:Ljava/util/List;

    if-eqz v2, :cond_0

    goto :goto_1
.end method

.method public getArrays()Ljava/util/List;
    .locals 1

    .prologue
    .line 436
    iget-object v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->arrays:Ljava/util/List;

    return-object v0
.end method

.method public getAvgFrameRate()I
    .locals 1

    .prologue
    .line 396
    iget v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->avgFrameRate:I

    return v0
.end method

.method public getBitDepthChromaMinus8()I
    .locals 1

    .prologue
    .line 388
    iget v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->bitDepthChromaMinus8:I

    return v0
.end method

.method public getBitDepthLumaMinus8()I
    .locals 1

    .prologue
    .line 380
    iget v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->bitDepthLumaMinus8:I

    return v0
.end method

.method public getChromaFormat()I
    .locals 1

    .prologue
    .line 372
    iget v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->chromaFormat:I

    return v0
.end method

.method public getConfigurationVersion()I
    .locals 1

    .prologue
    .line 300
    iget v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->configurationVersion:I

    return v0
.end method

.method public getConstantFrameRate()I
    .locals 1

    .prologue
    .line 428
    iget v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->constantFrameRate:I

    return v0
.end method

.method public getGeneral_constraint_indicator_flags()J
    .locals 2

    .prologue
    .line 340
    iget-wide v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_constraint_indicator_flags:J

    return-wide v0
.end method

.method public getGeneral_level_idc()I
    .locals 1

    .prologue
    .line 348
    iget v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_level_idc:I

    return v0
.end method

.method public getGeneral_profile_compatibility_flags()J
    .locals 2

    .prologue
    .line 332
    iget-wide v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_profile_compatibility_flags:J

    return-wide v0
.end method

.method public getGeneral_profile_idc()I
    .locals 1

    .prologue
    .line 324
    iget v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_profile_idc:I

    return v0
.end method

.method public getGeneral_profile_space()I
    .locals 1

    .prologue
    .line 308
    iget v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_profile_space:I

    return v0
.end method

.method public getLengthSizeMinusOne()I
    .locals 1

    .prologue
    .line 412
    iget v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->lengthSizeMinusOne:I

    return v0
.end method

.method public getMin_spatial_segmentation_idc()I
    .locals 1

    .prologue
    .line 356
    iget v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->min_spatial_segmentation_idc:I

    return v0
.end method

.method public getNumTemporalLayers()I
    .locals 1

    .prologue
    .line 404
    iget v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->numTemporalLayers:I

    return v0
.end method

.method public getParallelismType()I
    .locals 1

    .prologue
    .line 364
    iget v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->parallelismType:I

    return v0
.end method

.method public getSize()I
    .locals 4

    .prologue
    .line 197
    const/16 v0, 0x17

    .line 198
    iget-object v1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->arrays:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 205
    return v1

    .line 198
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord$Array;

    .line 199
    add-int/lit8 v1, v1, 0x3

    .line 200
    iget-object v0, v0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord$Array;->nalUnits:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 201
    add-int/lit8 v1, v1, 0x2

    .line 202
    array-length v0, v0

    add-int/2addr v1, v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 9

    .prologue
    const/16 v8, 0x20

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 244
    iget v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->configurationVersion:I

    .line 245
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_profile_space:I

    add-int/2addr v0, v3

    .line 246
    mul-int/lit8 v3, v0, 0x1f

    iget-boolean v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_tier_flag:Z

    if-eqz v0, :cond_1

    move v0, v1

    :goto_0
    add-int/2addr v0, v3

    .line 247
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_profile_idc:I

    add-int/2addr v0, v3

    .line 248
    mul-int/lit8 v0, v0, 0x1f

    iget-wide v4, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_profile_compatibility_flags:J

    iget-wide v6, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_profile_compatibility_flags:J

    ushr-long/2addr v6, v8

    xor-long/2addr v4, v6

    long-to-int v3, v4

    add-int/2addr v0, v3

    .line 249
    mul-int/lit8 v0, v0, 0x1f

    iget-wide v4, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_constraint_indicator_flags:J

    iget-wide v6, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_constraint_indicator_flags:J

    ushr-long/2addr v6, v8

    xor-long/2addr v4, v6

    long-to-int v3, v4

    add-int/2addr v0, v3

    .line 250
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_level_idc:I

    add-int/2addr v0, v3

    .line 251
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved1:I

    add-int/2addr v0, v3

    .line 252
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->min_spatial_segmentation_idc:I

    add-int/2addr v0, v3

    .line 253
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved2:I

    add-int/2addr v0, v3

    .line 254
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->parallelismType:I

    add-int/2addr v0, v3

    .line 255
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved3:I

    add-int/2addr v0, v3

    .line 256
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->chromaFormat:I

    add-int/2addr v0, v3

    .line 257
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved4:I

    add-int/2addr v0, v3

    .line 258
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->bitDepthLumaMinus8:I

    add-int/2addr v0, v3

    .line 259
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved5:I

    add-int/2addr v0, v3

    .line 260
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->bitDepthChromaMinus8:I

    add-int/2addr v0, v3

    .line 261
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->avgFrameRate:I

    add-int/2addr v0, v3

    .line 262
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->constantFrameRate:I

    add-int/2addr v0, v3

    .line 263
    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->numTemporalLayers:I

    add-int/2addr v0, v3

    .line 264
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v3, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->temporalIdNested:Z

    if-eqz v3, :cond_2

    :goto_1
    add-int/2addr v0, v1

    .line 265
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->lengthSizeMinusOne:I

    add-int/2addr v0, v1

    .line 266
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->arrays:Ljava/util/List;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->arrays:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v2

    :cond_0
    add-int/2addr v0, v2

    .line 267
    return v0

    :cond_1
    move v0, v2

    .line 246
    goto :goto_0

    :cond_2
    move v1, v2

    .line 264
    goto :goto_1
.end method

.method public isFrame_only_constraint_flag()Z
    .locals 1

    .prologue
    .line 444
    iget-boolean v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->frame_only_constraint_flag:Z

    return v0
.end method

.method public isGeneral_tier_flag()Z
    .locals 1

    .prologue
    .line 316
    iget-boolean v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_tier_flag:Z

    return v0
.end method

.method public isInterlaced_source_flag()Z
    .locals 1

    .prologue
    .line 460
    iget-boolean v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->interlaced_source_flag:Z

    return v0
.end method

.method public isNon_packed_constraint_flag()Z
    .locals 1

    .prologue
    .line 452
    iget-boolean v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->non_packed_constraint_flag:Z

    return v0
.end method

.method public isProgressive_source_flag()Z
    .locals 1

    .prologue
    .line 468
    iget-boolean v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->progressive_source_flag:Z

    return v0
.end method

.method public isTemporalIdNested()Z
    .locals 1

    .prologue
    .line 420
    iget-boolean v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->temporalIdNested:Z

    return v0
.end method

.method public parse(Ljava/nio/ByteBuffer;)V
    .locals 12

    .prologue
    const-wide/16 v10, 0x0

    const/16 v8, 0x2c

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 59
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v0

    iput v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->configurationVersion:I

    .line 66
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v3

    .line 67
    and-int/lit16 v0, v3, 0xc0

    shr-int/lit8 v0, v0, 0x6

    iput v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_profile_space:I

    .line 68
    and-int/lit8 v0, v3, 0x20

    if-lez v0, :cond_0

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_tier_flag:Z

    .line 69
    and-int/lit8 v0, v3, 0x1f

    iput v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_profile_idc:I

    .line 72
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt32(Ljava/nio/ByteBuffer;)J

    move-result-wide v4

    iput-wide v4, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_profile_compatibility_flags:J

    .line 76
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt48(Ljava/nio/ByteBuffer;)J

    move-result-wide v4

    iput-wide v4, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_constraint_indicator_flags:J

    .line 78
    iget-wide v4, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_constraint_indicator_flags:J

    shr-long/2addr v4, v8

    const-wide/16 v6, 0x8

    and-long/2addr v4, v6

    cmp-long v0, v4, v10

    if-lez v0, :cond_1

    move v0, v1

    :goto_1
    iput-boolean v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->frame_only_constraint_flag:Z

    .line 79
    iget-wide v4, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_constraint_indicator_flags:J

    shr-long/2addr v4, v8

    const-wide/16 v6, 0x4

    and-long/2addr v4, v6

    cmp-long v0, v4, v10

    if-lez v0, :cond_2

    move v0, v1

    :goto_2
    iput-boolean v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->non_packed_constraint_flag:Z

    .line 80
    iget-wide v4, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_constraint_indicator_flags:J

    shr-long/2addr v4, v8

    const-wide/16 v6, 0x2

    and-long/2addr v4, v6

    cmp-long v0, v4, v10

    if-lez v0, :cond_3

    move v0, v1

    :goto_3
    iput-boolean v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->interlaced_source_flag:Z

    .line 81
    iget-wide v4, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_constraint_indicator_flags:J

    shr-long/2addr v4, v8

    const-wide/16 v6, 0x1

    and-long/2addr v4, v6

    cmp-long v0, v4, v10

    if-lez v0, :cond_4

    move v0, v1

    :goto_4
    iput-boolean v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->progressive_source_flag:Z

    .line 83
    iget-wide v4, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_constraint_indicator_flags:J

    const-wide v6, 0x7fffffffffffL

    and-long/2addr v4, v6

    iput-wide v4, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_constraint_indicator_flags:J

    .line 86
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v0

    iput v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_level_idc:I

    .line 92
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16(Ljava/nio/ByteBuffer;)I

    move-result v0

    .line 93
    const v3, 0xf000

    and-int/2addr v3, v0

    shr-int/lit8 v3, v3, 0xc

    iput v3, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved1:I

    .line 94
    and-int/lit16 v0, v0, 0xfff

    iput v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->min_spatial_segmentation_idc:I

    .line 96
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v0

    .line 97
    and-int/lit16 v3, v0, 0xfc

    shr-int/lit8 v3, v3, 0x2

    iput v3, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved2:I

    .line 98
    and-int/lit8 v0, v0, 0x3

    iput v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->parallelismType:I

    .line 100
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v0

    .line 101
    and-int/lit16 v3, v0, 0xfc

    shr-int/lit8 v3, v3, 0x2

    iput v3, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved3:I

    .line 102
    and-int/lit8 v0, v0, 0x3

    iput v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->chromaFormat:I

    .line 104
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v0

    .line 105
    and-int/lit16 v3, v0, 0xf8

    shr-int/lit8 v3, v3, 0x3

    iput v3, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved4:I

    .line 106
    and-int/lit8 v0, v0, 0x7

    iput v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->bitDepthLumaMinus8:I

    .line 108
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v0

    .line 109
    and-int/lit16 v3, v0, 0xf8

    shr-int/lit8 v3, v3, 0x3

    iput v3, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved5:I

    .line 110
    and-int/lit8 v0, v0, 0x7

    iput v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->bitDepthChromaMinus8:I

    .line 112
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16(Ljava/nio/ByteBuffer;)I

    move-result v0

    iput v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->avgFrameRate:I

    .line 114
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v3

    .line 115
    and-int/lit16 v0, v3, 0xc0

    shr-int/lit8 v0, v0, 0x6

    iput v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->constantFrameRate:I

    .line 116
    and-int/lit8 v0, v3, 0x38

    shr-int/lit8 v0, v0, 0x3

    iput v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->numTemporalLayers:I

    .line 117
    and-int/lit8 v0, v3, 0x4

    if-lez v0, :cond_5

    move v0, v1

    :goto_5
    iput-boolean v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->temporalIdNested:Z

    .line 118
    and-int/lit8 v0, v3, 0x3

    iput v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->lengthSizeMinusOne:I

    .line 121
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v4

    .line 122
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->arrays:Ljava/util/List;

    move v3, v2

    .line 123
    :goto_6
    if-lt v3, v4, :cond_6

    .line 141
    return-void

    :cond_0
    move v0, v2

    .line 68
    goto/16 :goto_0

    :cond_1
    move v0, v2

    .line 78
    goto/16 :goto_1

    :cond_2
    move v0, v2

    .line 79
    goto/16 :goto_2

    :cond_3
    move v0, v2

    .line 80
    goto/16 :goto_3

    :cond_4
    move v0, v2

    .line 81
    goto/16 :goto_4

    :cond_5
    move v0, v2

    .line 117
    goto :goto_5

    .line 124
    :cond_6
    new-instance v5, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord$Array;

    invoke-direct {v5}, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord$Array;-><init>()V

    .line 126
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v6

    .line 127
    and-int/lit16 v0, v6, 0x80

    if-lez v0, :cond_7

    move v0, v1

    :goto_7
    iput-boolean v0, v5, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord$Array;->array_completeness:Z

    .line 128
    and-int/lit8 v0, v6, 0x40

    if-lez v0, :cond_8

    move v0, v1

    :goto_8
    iput-boolean v0, v5, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord$Array;->reserved:Z

    .line 129
    and-int/lit8 v0, v6, 0x3f

    iput v0, v5, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord$Array;->nal_unit_type:I

    .line 131
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16(Ljava/nio/ByteBuffer;)I

    move-result v6

    .line 132
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v5, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord$Array;->nalUnits:Ljava/util/List;

    move v0, v2

    .line 133
    :goto_9
    if-lt v0, v6, :cond_9

    .line 139
    iget-object v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->arrays:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 123
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_6

    :cond_7
    move v0, v2

    .line 127
    goto :goto_7

    :cond_8
    move v0, v2

    .line 128
    goto :goto_8

    .line 134
    :cond_9
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16(Ljava/nio/ByteBuffer;)I

    move-result v7

    .line 135
    new-array v7, v7, [B

    .line 136
    invoke-virtual {p1, v7}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 137
    iget-object v8, v5, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord$Array;->nalUnits:Ljava/util/List;

    invoke-interface {v8, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 133
    add-int/lit8 v0, v0, 0x1

    goto :goto_9
.end method

.method public setArrays(Ljava/util/List;)V
    .locals 0

    .prologue
    .line 440
    iput-object p1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->arrays:Ljava/util/List;

    .line 441
    return-void
.end method

.method public setAvgFrameRate(I)V
    .locals 0

    .prologue
    .line 400
    iput p1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->avgFrameRate:I

    .line 401
    return-void
.end method

.method public setBitDepthChromaMinus8(I)V
    .locals 0

    .prologue
    .line 392
    iput p1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->bitDepthChromaMinus8:I

    .line 393
    return-void
.end method

.method public setBitDepthLumaMinus8(I)V
    .locals 0

    .prologue
    .line 384
    iput p1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->bitDepthLumaMinus8:I

    .line 385
    return-void
.end method

.method public setChromaFormat(I)V
    .locals 0

    .prologue
    .line 376
    iput p1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->chromaFormat:I

    .line 377
    return-void
.end method

.method public setConfigurationVersion(I)V
    .locals 0

    .prologue
    .line 304
    iput p1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->configurationVersion:I

    .line 305
    return-void
.end method

.method public setConstantFrameRate(I)V
    .locals 0

    .prologue
    .line 432
    iput p1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->constantFrameRate:I

    .line 433
    return-void
.end method

.method public setFrame_only_constraint_flag(Z)V
    .locals 0

    .prologue
    .line 448
    iput-boolean p1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->frame_only_constraint_flag:Z

    .line 449
    return-void
.end method

.method public setGeneral_constraint_indicator_flags(J)V
    .locals 1

    .prologue
    .line 344
    iput-wide p1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_constraint_indicator_flags:J

    .line 345
    return-void
.end method

.method public setGeneral_level_idc(I)V
    .locals 0

    .prologue
    .line 352
    iput p1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_level_idc:I

    .line 353
    return-void
.end method

.method public setGeneral_profile_compatibility_flags(J)V
    .locals 1

    .prologue
    .line 336
    iput-wide p1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_profile_compatibility_flags:J

    .line 337
    return-void
.end method

.method public setGeneral_profile_idc(I)V
    .locals 0

    .prologue
    .line 328
    iput p1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_profile_idc:I

    .line 329
    return-void
.end method

.method public setGeneral_profile_space(I)V
    .locals 0

    .prologue
    .line 312
    iput p1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_profile_space:I

    .line 313
    return-void
.end method

.method public setGeneral_tier_flag(Z)V
    .locals 0

    .prologue
    .line 320
    iput-boolean p1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_tier_flag:Z

    .line 321
    return-void
.end method

.method public setInterlaced_source_flag(Z)V
    .locals 0

    .prologue
    .line 464
    iput-boolean p1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->interlaced_source_flag:Z

    .line 465
    return-void
.end method

.method public setLengthSizeMinusOne(I)V
    .locals 0

    .prologue
    .line 416
    iput p1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->lengthSizeMinusOne:I

    .line 417
    return-void
.end method

.method public setMin_spatial_segmentation_idc(I)V
    .locals 0

    .prologue
    .line 360
    iput p1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->min_spatial_segmentation_idc:I

    .line 361
    return-void
.end method

.method public setNon_packed_constraint_flag(Z)V
    .locals 0

    .prologue
    .line 456
    iput-boolean p1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->non_packed_constraint_flag:Z

    .line 457
    return-void
.end method

.method public setNumTemporalLayers(I)V
    .locals 0

    .prologue
    .line 408
    iput p1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->numTemporalLayers:I

    .line 409
    return-void
.end method

.method public setParallelismType(I)V
    .locals 0

    .prologue
    .line 368
    iput p1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->parallelismType:I

    .line 369
    return-void
.end method

.method public setProgressive_source_flag(Z)V
    .locals 0

    .prologue
    .line 472
    iput-boolean p1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->progressive_source_flag:Z

    .line 473
    return-void
.end method

.method public setTemporalIdNested(Z)V
    .locals 0

    .prologue
    .line 424
    iput-boolean p1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->temporalIdNested:Z

    .line 425
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .prologue
    const/16 v5, 0x3f

    const/16 v4, 0x1f

    .line 272
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HEVCDecoderConfigurationRecord{configurationVersion="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 273
    iget v1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->configurationVersion:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 274
    const-string v1, ", general_profile_space="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_profile_space:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 275
    const-string v1, ", general_tier_flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_tier_flag:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 276
    const-string v1, ", general_profile_idc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_profile_idc:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 277
    const-string v1, ", general_profile_compatibility_flags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_profile_compatibility_flags:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 278
    const-string v1, ", general_constraint_indicator_flags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_constraint_indicator_flags:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 279
    const-string v1, ", general_level_idc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_level_idc:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 280
    iget v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved1:I

    const/16 v2, 0xf

    if-eq v0, v2, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, ", reserved1="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved1:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 281
    const-string v1, ", min_spatial_segmentation_idc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->min_spatial_segmentation_idc:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 282
    iget v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved2:I

    if-eq v0, v5, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, ", reserved2="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved2:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 283
    const-string v1, ", parallelismType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->parallelismType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 284
    iget v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved3:I

    if-eq v0, v5, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, ", reserved3="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved3:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 285
    const-string v1, ", chromaFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->chromaFormat:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 286
    iget v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved4:I

    if-eq v0, v4, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, ", reserved4="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved4:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 287
    const-string v1, ", bitDepthLumaMinus8="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->bitDepthLumaMinus8:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 288
    iget v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved5:I

    if-eq v0, v4, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, ", reserved5="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved5:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_4
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 289
    const-string v1, ", bitDepthChromaMinus8="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->bitDepthChromaMinus8:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 290
    const-string v1, ", avgFrameRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->avgFrameRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 291
    const-string v1, ", constantFrameRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->constantFrameRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 292
    const-string v1, ", numTemporalLayers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->numTemporalLayers:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 293
    const-string v1, ", temporalIdNested="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->temporalIdNested:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 294
    const-string v1, ", lengthSizeMinusOne="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->lengthSizeMinusOne:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 295
    const-string v1, ", arrays="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->arrays:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 296
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 272
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 280
    :cond_0
    const-string v0, ""

    goto/16 :goto_0

    .line 282
    :cond_1
    const-string v0, ""

    goto/16 :goto_1

    .line 284
    :cond_2
    const-string v0, ""

    goto/16 :goto_2

    .line 286
    :cond_3
    const-string v0, ""

    goto/16 :goto_3

    .line 288
    :cond_4
    const-string v0, ""

    goto :goto_4
.end method

.method public write(Ljava/nio/ByteBuffer;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 144
    iget v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->configurationVersion:I

    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 147
    iget v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_profile_space:I

    shl-int/lit8 v2, v0, 0x6

    iget-boolean v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_tier_flag:Z

    if-eqz v0, :cond_5

    const/16 v0, 0x20

    :goto_0
    add-int/2addr v0, v2

    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_profile_idc:I

    add-int/2addr v0, v2

    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 149
    iget-wide v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_profile_compatibility_flags:J

    invoke-static {p1, v2, v3}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt32(Ljava/nio/ByteBuffer;J)V

    .line 150
    iget-wide v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_constraint_indicator_flags:J

    .line 151
    iget-boolean v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->frame_only_constraint_flag:Z

    if-eqz v0, :cond_0

    .line 152
    const-wide v4, 0x800000000000L

    or-long/2addr v2, v4

    .line 154
    :cond_0
    iget-boolean v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->non_packed_constraint_flag:Z

    if-eqz v0, :cond_1

    .line 155
    const-wide v4, 0x400000000000L

    or-long/2addr v2, v4

    .line 157
    :cond_1
    iget-boolean v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->interlaced_source_flag:Z

    if-eqz v0, :cond_2

    .line 158
    const-wide v4, 0x200000000000L

    or-long/2addr v2, v4

    .line 160
    :cond_2
    iget-boolean v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->progressive_source_flag:Z

    if-eqz v0, :cond_3

    .line 161
    const-wide v4, 0x100000000000L

    or-long/2addr v2, v4

    .line 164
    :cond_3
    invoke-static {p1, v2, v3}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt48(Ljava/nio/ByteBuffer;J)V

    .line 167
    iget v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->general_level_idc:I

    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 169
    iget v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved1:I

    shl-int/lit8 v0, v0, 0xc

    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->min_spatial_segmentation_idc:I

    add-int/2addr v0, v2

    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt16(Ljava/nio/ByteBuffer;I)V

    .line 171
    iget v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved2:I

    shl-int/lit8 v0, v0, 0x2

    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->parallelismType:I

    add-int/2addr v0, v2

    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 173
    iget v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved3:I

    shl-int/lit8 v0, v0, 0x2

    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->chromaFormat:I

    add-int/2addr v0, v2

    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 175
    iget v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved4:I

    shl-int/lit8 v0, v0, 0x3

    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->bitDepthLumaMinus8:I

    add-int/2addr v0, v2

    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 177
    iget v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->reserved5:I

    shl-int/lit8 v0, v0, 0x3

    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->bitDepthChromaMinus8:I

    add-int/2addr v0, v2

    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 179
    iget v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->avgFrameRate:I

    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt16(Ljava/nio/ByteBuffer;I)V

    .line 181
    iget v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->constantFrameRate:I

    shl-int/lit8 v0, v0, 0x6

    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->numTemporalLayers:I

    shl-int/lit8 v2, v2, 0x3

    add-int/2addr v2, v0

    iget-boolean v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->temporalIdNested:Z

    if-eqz v0, :cond_6

    const/4 v0, 0x4

    :goto_1
    add-int/2addr v0, v2

    iget v2, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->lengthSizeMinusOne:I

    add-int/2addr v0, v2

    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 183
    iget-object v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->arrays:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 185
    iget-object v0, p0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord;->arrays:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_7

    .line 194
    return-void

    :cond_5
    move v0, v1

    .line 147
    goto/16 :goto_0

    :cond_6
    move v0, v1

    .line 181
    goto :goto_1

    .line 185
    :cond_7
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord$Array;

    .line 186
    iget-boolean v2, v0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord$Array;->array_completeness:Z

    if-eqz v2, :cond_8

    const/16 v2, 0x80

    :goto_2
    iget-boolean v3, v0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord$Array;->reserved:Z

    if-eqz v3, :cond_9

    const/16 v3, 0x40

    :goto_3
    add-int/2addr v2, v3

    iget v3, v0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord$Array;->nal_unit_type:I

    add-int/2addr v2, v3

    invoke-static {p1, v2}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 188
    iget-object v2, v0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord$Array;->nalUnits:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {p1, v2}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt16(Ljava/nio/ByteBuffer;I)V

    .line 189
    iget-object v0, v0, Lcom/mp4parser/iso14496/part15/HevcDecoderConfigurationRecord$Array;->nalUnits:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 190
    array-length v3, v0

    invoke-static {p1, v3}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt16(Ljava/nio/ByteBuffer;I)V

    .line 191
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    goto :goto_4

    :cond_8
    move v2, v1

    .line 186
    goto :goto_2

    :cond_9
    move v3, v1

    goto :goto_3
.end method
