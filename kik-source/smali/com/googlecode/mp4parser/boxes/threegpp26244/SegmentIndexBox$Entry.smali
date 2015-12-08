.class public Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Entry"
.end annotation


# instance fields
.field referenceType:B

.field referencedSize:I

.field sapDeltaTime:I

.field sapType:B

.field startsWithSap:B

.field subsegmentDuration:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 184
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 185
    return-void
.end method

.method public constructor <init>(IIJZII)V
    .locals 1

    .prologue
    .line 187
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 188
    int-to-byte v0, p1

    iput-byte v0, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->referenceType:B

    .line 189
    iput p2, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->referencedSize:I

    .line 190
    iput-wide p3, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->subsegmentDuration:J

    .line 191
    if-eqz p5, :cond_0

    const/4 v0, 0x1

    :goto_0
    int-to-byte v0, v0

    iput-byte v0, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->startsWithSap:B

    .line 192
    int-to-byte v0, p6

    iput-byte v0, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->sapType:B

    .line 193
    iput p7, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->sapDeltaTime:I

    .line 194
    return-void

    .line 191
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 270
    if-ne p0, p1, :cond_1

    .line 282
    :cond_0
    :goto_0
    return v0

    .line 271
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

    .line 273
    :cond_3
    check-cast p1, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;

    .line 275
    iget-byte v2, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->referenceType:B

    iget-byte v3, p1, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->referenceType:B

    if-eq v2, v3, :cond_4

    move v0, v1

    goto :goto_0

    .line 276
    :cond_4
    iget v2, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->referencedSize:I

    iget v3, p1, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->referencedSize:I

    if-eq v2, v3, :cond_5

    move v0, v1

    goto :goto_0

    .line 277
    :cond_5
    iget v2, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->sapDeltaTime:I

    iget v3, p1, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->sapDeltaTime:I

    if-eq v2, v3, :cond_6

    move v0, v1

    goto :goto_0

    .line 278
    :cond_6
    iget-byte v2, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->sapType:B

    iget-byte v3, p1, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->sapType:B

    if-eq v2, v3, :cond_7

    move v0, v1

    goto :goto_0

    .line 279
    :cond_7
    iget-byte v2, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->startsWithSap:B

    iget-byte v3, p1, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->startsWithSap:B

    if-eq v2, v3, :cond_8

    move v0, v1

    goto :goto_0

    .line 280
    :cond_8
    iget-wide v2, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->subsegmentDuration:J

    iget-wide v4, p1, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->subsegmentDuration:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public getReferenceType()B
    .locals 1

    .prologue
    .line 203
    iget-byte v0, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->referenceType:B

    return v0
.end method

.method public getReferencedSize()I
    .locals 1

    .prologue
    .line 217
    iget v0, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->referencedSize:I

    return v0
.end method

.method public getSapDeltaTime()I
    .locals 1

    .prologue
    .line 249
    iget v0, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->sapDeltaTime:I

    return v0
.end method

.method public getSapType()B
    .locals 1

    .prologue
    .line 241
    iget-byte v0, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->sapType:B

    return v0
.end method

.method public getStartsWithSap()B
    .locals 1

    .prologue
    .line 233
    iget-byte v0, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->startsWithSap:B

    return v0
.end method

.method public getSubsegmentDuration()J
    .locals 2

    .prologue
    .line 225
    iget-wide v0, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->subsegmentDuration:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 6

    .prologue
    .line 287
    iget-byte v0, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->referenceType:B

    .line 288
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->referencedSize:I

    add-int/2addr v0, v1

    .line 289
    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->subsegmentDuration:J

    iget-wide v4, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->subsegmentDuration:J

    const/16 v1, 0x20

    ushr-long/2addr v4, v1

    xor-long/2addr v2, v4

    long-to-int v1, v2

    add-int/2addr v0, v1

    .line 290
    mul-int/lit8 v0, v0, 0x1f

    iget-byte v1, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->startsWithSap:B

    add-int/2addr v0, v1

    .line 291
    mul-int/lit8 v0, v0, 0x1f

    iget-byte v1, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->sapType:B

    add-int/2addr v0, v1

    .line 292
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->sapDeltaTime:I

    add-int/2addr v0, v1

    .line 293
    return v0
.end method

.method public setReferenceType(B)V
    .locals 0

    .prologue
    .line 213
    iput-byte p1, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->referenceType:B

    .line 214
    return-void
.end method

.method public setReferencedSize(I)V
    .locals 0

    .prologue
    .line 221
    iput p1, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->referencedSize:I

    .line 222
    return-void
.end method

.method public setSapDeltaTime(I)V
    .locals 0

    .prologue
    .line 253
    iput p1, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->sapDeltaTime:I

    .line 254
    return-void
.end method

.method public setSapType(B)V
    .locals 0

    .prologue
    .line 245
    iput-byte p1, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->sapType:B

    .line 246
    return-void
.end method

.method public setStartsWithSap(B)V
    .locals 0

    .prologue
    .line 237
    iput-byte p1, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->startsWithSap:B

    .line 238
    return-void
.end method

.method public setSubsegmentDuration(J)V
    .locals 1

    .prologue
    .line 229
    iput-wide p1, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->subsegmentDuration:J

    .line 230
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 258
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Entry{referenceType="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 259
    iget-byte v1, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->referenceType:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 260
    const-string v1, ", referencedSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->referencedSize:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 261
    const-string v1, ", subsegmentDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->subsegmentDuration:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 262
    const-string v1, ", startsWithSap="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-byte v1, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->startsWithSap:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 263
    const-string v1, ", sapType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-byte v1, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->sapType:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 264
    const-string v1, ", sapDeltaTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/boxes/threegpp26244/SegmentIndexBox$Entry;->sapDeltaTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 265
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 258
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
