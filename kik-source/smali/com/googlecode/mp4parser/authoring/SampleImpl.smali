.class public Lcom/googlecode/mp4parser/authoring/SampleImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/googlecode/mp4parser/authoring/Sample;


# instance fields
.field private data:[Ljava/nio/ByteBuffer;

.field private final offset:J

.field private final parent:Lcom/coremedia/iso/boxes/Container;

.field private final size:J


# direct methods
.method public constructor <init>(JJLcom/coremedia/iso/boxes/Container;)V
    .locals 1

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-wide p1, p0, Lcom/googlecode/mp4parser/authoring/SampleImpl;->offset:J

    .line 44
    iput-wide p3, p0, Lcom/googlecode/mp4parser/authoring/SampleImpl;->size:J

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/SampleImpl;->data:[Ljava/nio/ByteBuffer;

    .line 46
    iput-object p5, p0, Lcom/googlecode/mp4parser/authoring/SampleImpl;->parent:Lcom/coremedia/iso/boxes/Container;

    .line 47
    return-void
.end method

.method public constructor <init>(JJLjava/nio/ByteBuffer;)V
    .locals 3

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-wide p1, p0, Lcom/googlecode/mp4parser/authoring/SampleImpl;->offset:J

    .line 37
    iput-wide p3, p0, Lcom/googlecode/mp4parser/authoring/SampleImpl;->size:J

    .line 38
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/nio/ByteBuffer;

    const/4 v1, 0x0

    aput-object p5, v0, v1

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/SampleImpl;->data:[Ljava/nio/ByteBuffer;

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/SampleImpl;->parent:Lcom/coremedia/iso/boxes/Container;

    .line 40
    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 2

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/googlecode/mp4parser/authoring/SampleImpl;->offset:J

    .line 19
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/googlecode/mp4parser/authoring/SampleImpl;->size:J

    .line 20
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/nio/ByteBuffer;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/SampleImpl;->data:[Ljava/nio/ByteBuffer;

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/SampleImpl;->parent:Lcom/coremedia/iso/boxes/Container;

    .line 22
    return-void
.end method

.method public constructor <init>([Ljava/nio/ByteBuffer;)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const-wide/16 v2, -0x1

    iput-wide v2, p0, Lcom/googlecode/mp4parser/authoring/SampleImpl;->offset:J

    .line 27
    array-length v2, p1

    move v1, v0

    :goto_0
    if-lt v0, v2, :cond_0

    .line 30
    int-to-long v0, v1

    iput-wide v0, p0, Lcom/googlecode/mp4parser/authoring/SampleImpl;->size:J

    .line 31
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/SampleImpl;->data:[Ljava/nio/ByteBuffer;

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/SampleImpl;->parent:Lcom/coremedia/iso/boxes/Container;

    .line 33
    return-void

    .line 27
    :cond_0
    aget-object v3, p1, v0

    .line 28
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v3

    add-int/2addr v1, v3

    .line 27
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public asByteBuffer()Ljava/nio/ByteBuffer;
    .locals 5

    .prologue
    .line 73
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/authoring/SampleImpl;->ensureData()V

    .line 74
    iget-wide v0, p0, Lcom/googlecode/mp4parser/authoring/SampleImpl;->size:J

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v0

    new-array v0, v0, [B

    .line 75
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 76
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/SampleImpl;->data:[Ljava/nio/ByteBuffer;

    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-lt v0, v3, :cond_0

    .line 79
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 80
    return-object v1

    .line 76
    :cond_0
    aget-object v4, v2, v0

    .line 77
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 76
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method protected ensureData()V
    .locals 8

    .prologue
    .line 50
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/SampleImpl;->data:[Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_0

    .line 56
    :goto_0
    return-void

    .line 51
    :cond_0
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/SampleImpl;->parent:Lcom/coremedia/iso/boxes/Container;

    if-nez v0, :cond_1

    .line 52
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Missing parent container, can\'t read sample "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 55
    :cond_1
    const/4 v0, 0x1

    :try_start_0
    new-array v0, v0, [Ljava/nio/ByteBuffer;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/SampleImpl;->parent:Lcom/coremedia/iso/boxes/Container;

    iget-wide v4, p0, Lcom/googlecode/mp4parser/authoring/SampleImpl;->offset:J

    iget-wide v6, p0, Lcom/googlecode/mp4parser/authoring/SampleImpl;->size:J

    invoke-interface {v2, v4, v5, v6, v7}, Lcom/coremedia/iso/boxes/Container;->getByteBuffer(JJ)Ljava/nio/ByteBuffer;

    move-result-object v2

    aput-object v2, v0, v1

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/SampleImpl;->data:[Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 56
    :catch_0
    move-exception v0

    .line 57
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "couldn\'t read sample "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public getSize()J
    .locals 2

    .prologue
    .line 69
    iget-wide v0, p0, Lcom/googlecode/mp4parser/authoring/SampleImpl;->size:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    const-string v1, "SampleImpl"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    const-string v1, "{offset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lcom/googlecode/mp4parser/authoring/SampleImpl;->offset:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 88
    const-string v1, "{size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lcom/googlecode/mp4parser/authoring/SampleImpl;->size:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 89
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 90
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Ljava/nio/channels/WritableByteChannel;)V
    .locals 4

    .prologue
    .line 62
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/authoring/SampleImpl;->ensureData()V

    .line 63
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/SampleImpl;->data:[Ljava/nio/ByteBuffer;

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-lt v0, v2, :cond_0

    .line 66
    return-void

    .line 63
    :cond_0
    aget-object v3, v1, v0

    .line 64
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 63
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
