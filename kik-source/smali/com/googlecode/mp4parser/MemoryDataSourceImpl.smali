.class public Lcom/googlecode/mp4parser/MemoryDataSourceImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/googlecode/mp4parser/DataSource;


# instance fields
.field data:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/googlecode/mp4parser/MemoryDataSourceImpl;->data:Ljava/nio/ByteBuffer;

    .line 21
    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/googlecode/mp4parser/MemoryDataSourceImpl;->data:Ljava/nio/ByteBuffer;

    .line 17
    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    .prologue
    .line 55
    return-void
.end method

.method public map(JJ)Ljava/nio/ByteBuffer;
    .locals 3

    .prologue
    .line 50
    iget-object v0, p0, Lcom/googlecode/mp4parser/MemoryDataSourceImpl;->data:Ljava/nio/ByteBuffer;

    invoke-static {p1, p2}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {p3, p4}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public position()J
    .locals 2

    .prologue
    .line 38
    iget-object v0, p0, Lcom/googlecode/mp4parser/MemoryDataSourceImpl;->data:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public position(J)V
    .locals 3

    .prologue
    .line 42
    iget-object v0, p0, Lcom/googlecode/mp4parser/MemoryDataSourceImpl;->data:Ljava/nio/ByteBuffer;

    invoke-static {p1, p2}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 43
    return-void
.end method

.method public read(Ljava/nio/ByteBuffer;)I
    .locals 2

    .prologue
    .line 24
    iget-object v0, p0, Lcom/googlecode/mp4parser/MemoryDataSourceImpl;->data:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    if-eqz v0, :cond_0

    .line 25
    const/4 v0, -0x1

    .line 30
    :goto_0
    return v0

    .line 27
    :cond_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    iget-object v1, p0, Lcom/googlecode/mp4parser/MemoryDataSourceImpl;->data:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    new-array v0, v0, [B

    .line 28
    iget-object v1, p0, Lcom/googlecode/mp4parser/MemoryDataSourceImpl;->data:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 29
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 30
    array-length v0, v0

    goto :goto_0
.end method

.method public size()J
    .locals 2

    .prologue
    .line 34
    iget-object v0, p0, Lcom/googlecode/mp4parser/MemoryDataSourceImpl;->data:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public transferTo(JJLjava/nio/channels/WritableByteChannel;)J
    .locals 3

    .prologue
    .line 46
    iget-object v0, p0, Lcom/googlecode/mp4parser/MemoryDataSourceImpl;->data:Ljava/nio/ByteBuffer;

    invoke-static {p1, p2}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {p3, p4}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-interface {p5, v0}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method
