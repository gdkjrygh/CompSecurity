.class public Lcom/coremedia/iso/boxes/ItemLocationBox$Item;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/coremedia/iso/boxes/ItemLocationBox;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Item"
.end annotation


# instance fields
.field public baseOffset:J

.field public constructionMethod:I

.field public dataReferenceIndex:I

.field public extents:Ljava/util/List;

.field public itemId:I

.field final synthetic this$0:Lcom/coremedia/iso/boxes/ItemLocationBox;


# direct methods
.method public constructor <init>(Lcom/coremedia/iso/boxes/ItemLocationBox;IIIJLjava/util/List;)V
    .locals 1

    .prologue
    .line 197
    iput-object p1, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->this$0:Lcom/coremedia/iso/boxes/ItemLocationBox;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 173
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->extents:Ljava/util/List;

    .line 198
    iput p2, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->itemId:I

    .line 199
    iput p3, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->constructionMethod:I

    .line 200
    iput p4, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->dataReferenceIndex:I

    .line 201
    iput-wide p5, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->baseOffset:J

    .line 202
    iput-object p7, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->extents:Ljava/util/List;

    .line 203
    return-void
.end method

.method public constructor <init>(Lcom/coremedia/iso/boxes/ItemLocationBox;Ljava/nio/ByteBuffer;)V
    .locals 4

    .prologue
    .line 175
    iput-object p1, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->this$0:Lcom/coremedia/iso/boxes/ItemLocationBox;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 173
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->extents:Ljava/util/List;

    .line 176
    invoke-static {p2}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16(Ljava/nio/ByteBuffer;)I

    move-result v0

    iput v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->itemId:I

    .line 178
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/ItemLocationBox;->getVersion()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 179
    invoke-static {p2}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16(Ljava/nio/ByteBuffer;)I

    move-result v0

    .line 180
    and-int/lit8 v0, v0, 0xf

    iput v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->constructionMethod:I

    .line 183
    :cond_0
    invoke-static {p2}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16(Ljava/nio/ByteBuffer;)I

    move-result v0

    iput v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->dataReferenceIndex:I

    .line 184
    iget v0, p1, Lcom/coremedia/iso/boxes/ItemLocationBox;->baseOffsetSize:I

    if-lez v0, :cond_1

    .line 185
    iget v0, p1, Lcom/coremedia/iso/boxes/ItemLocationBox;->baseOffsetSize:I

    invoke-static {p2, v0}, Lcom/coremedia/iso/IsoTypeReaderVariable;->read(Ljava/nio/ByteBuffer;I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->baseOffset:J

    .line 189
    :goto_0
    invoke-static {p2}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16(Ljava/nio/ByteBuffer;)I

    move-result v1

    .line 192
    const/4 v0, 0x0

    :goto_1
    if-lt v0, v1, :cond_2

    .line 195
    return-void

    .line 187
    :cond_1
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->baseOffset:J

    goto :goto_0

    .line 193
    :cond_2
    iget-object v2, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->extents:Ljava/util/List;

    new-instance v3, Lcom/coremedia/iso/boxes/ItemLocationBox$Extent;

    invoke-direct {v3, p1, p2}, Lcom/coremedia/iso/boxes/ItemLocationBox$Extent;-><init>(Lcom/coremedia/iso/boxes/ItemLocationBox;Ljava/nio/ByteBuffer;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 192
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 248
    if-ne p0, p1, :cond_1

    .line 259
    :cond_0
    :goto_0
    return v0

    .line 249
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

    .line 251
    :cond_3
    check-cast p1, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;

    .line 253
    iget-wide v2, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->baseOffset:J

    iget-wide v4, p1, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->baseOffset:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_4

    move v0, v1

    goto :goto_0

    .line 254
    :cond_4
    iget v2, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->constructionMethod:I

    iget v3, p1, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->constructionMethod:I

    if-eq v2, v3, :cond_5

    move v0, v1

    goto :goto_0

    .line 255
    :cond_5
    iget v2, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->dataReferenceIndex:I

    iget v3, p1, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->dataReferenceIndex:I

    if-eq v2, v3, :cond_6

    move v0, v1

    goto :goto_0

    .line 256
    :cond_6
    iget v2, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->itemId:I

    iget v3, p1, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->itemId:I

    if-eq v2, v3, :cond_7

    move v0, v1

    goto :goto_0

    .line 257
    :cond_7
    iget-object v2, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->extents:Ljava/util/List;

    if-eqz v2, :cond_8

    iget-object v2, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->extents:Ljava/util/List;

    iget-object v3, p1, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->extents:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :goto_1
    move v0, v1

    goto :goto_0

    :cond_8
    iget-object v2, p1, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->extents:Ljava/util/List;

    if-eqz v2, :cond_0

    goto :goto_1
.end method

.method public getContent(Ljava/nio/ByteBuffer;)V
    .locals 3

    .prologue
    .line 228
    iget v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->itemId:I

    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt16(Ljava/nio/ByteBuffer;I)V

    .line 230
    iget-object v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->this$0:Lcom/coremedia/iso/boxes/ItemLocationBox;

    invoke-virtual {v0}, Lcom/coremedia/iso/boxes/ItemLocationBox;->getVersion()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 231
    iget v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->constructionMethod:I

    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt16(Ljava/nio/ByteBuffer;I)V

    .line 235
    :cond_0
    iget v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->dataReferenceIndex:I

    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt16(Ljava/nio/ByteBuffer;I)V

    .line 236
    iget-object v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->this$0:Lcom/coremedia/iso/boxes/ItemLocationBox;

    iget v0, v0, Lcom/coremedia/iso/boxes/ItemLocationBox;->baseOffsetSize:I

    if-lez v0, :cond_1

    .line 237
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->baseOffset:J

    iget-object v2, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->this$0:Lcom/coremedia/iso/boxes/ItemLocationBox;

    iget v2, v2, Lcom/coremedia/iso/boxes/ItemLocationBox;->baseOffsetSize:I

    invoke-static {v0, v1, p1, v2}, Lcom/coremedia/iso/IsoTypeWriterVariable;->write(JLjava/nio/ByteBuffer;I)V

    .line 239
    :cond_1
    iget-object v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->extents:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt16(Ljava/nio/ByteBuffer;I)V

    .line 241
    iget-object v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->extents:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    .line 244
    return-void

    .line 241
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/ItemLocationBox$Extent;

    .line 242
    invoke-virtual {v0, p1}, Lcom/coremedia/iso/boxes/ItemLocationBox$Extent;->getContent(Ljava/nio/ByteBuffer;)V

    goto :goto_0
.end method

.method public getSize()I
    .locals 3

    .prologue
    .line 206
    const/4 v0, 0x2

    .line 208
    iget-object v1, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->this$0:Lcom/coremedia/iso/boxes/ItemLocationBox;

    invoke-virtual {v1}, Lcom/coremedia/iso/boxes/ItemLocationBox;->getVersion()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 209
    const/4 v0, 0x4

    .line 212
    :cond_0
    add-int/lit8 v0, v0, 0x2

    .line 213
    iget-object v1, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->this$0:Lcom/coremedia/iso/boxes/ItemLocationBox;

    iget v1, v1, Lcom/coremedia/iso/boxes/ItemLocationBox;->baseOffsetSize:I

    add-int/2addr v0, v1

    .line 214
    add-int/lit8 v0, v0, 0x2

    .line 217
    iget-object v1, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->extents:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 220
    return v1

    .line 217
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/ItemLocationBox$Extent;

    .line 218
    invoke-virtual {v0}, Lcom/coremedia/iso/boxes/ItemLocationBox$Extent;->getSize()I

    move-result v0

    add-int/2addr v0, v1

    move v1, v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 6

    .prologue
    .line 264
    iget v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->itemId:I

    .line 265
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->constructionMethod:I

    add-int/2addr v0, v1

    .line 266
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->dataReferenceIndex:I

    add-int/2addr v0, v1

    .line 267
    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->baseOffset:J

    iget-wide v4, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->baseOffset:J

    const/16 v1, 0x20

    ushr-long/2addr v4, v1

    xor-long/2addr v2, v4

    long-to-int v1, v2

    add-int/2addr v0, v1

    .line 268
    mul-int/lit8 v1, v0, 0x1f

    iget-object v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->extents:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->extents:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v0, v1

    .line 269
    return v0

    .line 268
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setBaseOffset(J)V
    .locals 1

    .prologue
    .line 224
    iput-wide p1, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->baseOffset:J

    .line 225
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 274
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Item{baseOffset="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 275
    iget-wide v2, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->baseOffset:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 276
    const-string v1, ", itemId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->itemId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 277
    const-string v1, ", constructionMethod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->constructionMethod:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 278
    const-string v1, ", dataReferenceIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->dataReferenceIndex:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 279
    const-string v1, ", extents="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/coremedia/iso/boxes/ItemLocationBox$Item;->extents:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 280
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 274
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
