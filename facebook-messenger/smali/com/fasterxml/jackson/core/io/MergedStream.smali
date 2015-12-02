.class public final Lcom/fasterxml/jackson/core/io/MergedStream;
.super Ljava/io/InputStream;
.source "MergedStream.java"


# instance fields
.field _buffer:[B

.field protected final _context:Lcom/fasterxml/jackson/core/io/IOContext;

.field final _end:I

.field final _in:Ljava/io/InputStream;

.field _ptr:I


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/core/io/IOContext;Ljava/io/InputStream;[BII)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_context:Lcom/fasterxml/jackson/core/io/IOContext;

    .line 30
    iput-object p2, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_in:Ljava/io/InputStream;

    .line 31
    iput-object p3, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_buffer:[B

    .line 32
    iput p4, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_ptr:I

    .line 33
    iput p5, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_end:I

    .line 34
    return-void
.end method

.method private freeMergedBuffer()V
    .locals 2

    .prologue
    .line 137
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_buffer:[B

    .line 138
    if-eqz v0, :cond_0

    .line 139
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_buffer:[B

    .line 140
    iget-object v1, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_context:Lcom/fasterxml/jackson/core/io/IOContext;

    if-eqz v1, :cond_0

    .line 141
    iget-object v1, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_context:Lcom/fasterxml/jackson/core/io/IOContext;

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/core/io/IOContext;->releaseReadIOBuffer([B)V

    .line 144
    :cond_0
    return-void
.end method


# virtual methods
.method public available()I
    .locals 2

    .prologue
    .line 39
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_buffer:[B

    if-eqz v0, :cond_0

    .line 40
    iget v0, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_end:I

    iget v1, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_ptr:I

    sub-int/2addr v0, v1

    .line 42
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    goto :goto_0
.end method

.method public close()V
    .locals 1

    .prologue
    .line 48
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/io/MergedStream;->freeMergedBuffer()V

    .line 49
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 50
    return-void
.end method

.method public mark(I)V
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_buffer:[B

    if-nez v0, :cond_0

    .line 56
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_in:Ljava/io/InputStream;

    invoke-virtual {v0, p1}, Ljava/io/InputStream;->mark(I)V

    .line 58
    :cond_0
    return-void
.end method

.method public markSupported()Z
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_buffer:[B

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public read()I
    .locals 3

    .prologue
    .line 70
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_buffer:[B

    if-eqz v0, :cond_1

    .line 71
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_buffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_ptr:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_ptr:I

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    .line 72
    iget v1, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_ptr:I

    iget v2, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_end:I

    if-lt v1, v2, :cond_0

    .line 73
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/io/MergedStream;->freeMergedBuffer()V

    .line 77
    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    goto :goto_0
.end method

.method public read([B)I
    .locals 2

    .prologue
    .line 83
    const/4 v0, 0x0

    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lcom/fasterxml/jackson/core/io/MergedStream;->read([BII)I

    move-result v0

    return v0
.end method

.method public read([BII)I
    .locals 2

    .prologue
    .line 89
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_buffer:[B

    if-eqz v0, :cond_2

    .line 90
    iget v0, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_end:I

    iget v1, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_ptr:I

    sub-int/2addr v0, v1

    .line 91
    if-le p3, v0, :cond_0

    move p3, v0

    .line 94
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_buffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_ptr:I

    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 95
    iget v0, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_ptr:I

    add-int/2addr v0, p3

    iput v0, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_ptr:I

    .line 96
    iget v0, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_ptr:I

    iget v1, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_end:I

    if-lt v0, v1, :cond_1

    .line 97
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/io/MergedStream;->freeMergedBuffer()V

    .line 101
    :cond_1
    :goto_0
    return p3

    :cond_2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_in:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p3

    goto :goto_0
.end method

.method public reset()V
    .locals 1

    .prologue
    .line 107
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_buffer:[B

    if-nez v0, :cond_0

    .line 108
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V

    .line 110
    :cond_0
    return-void
.end method

.method public skip(J)J
    .locals 6

    .prologue
    const-wide/16 v2, 0x0

    .line 115
    .line 117
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_buffer:[B

    if-eqz v0, :cond_2

    .line 118
    iget v0, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_end:I

    iget v1, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_ptr:I

    sub-int v4, v0, v1

    .line 120
    int-to-long v0, v4

    cmp-long v0, v0, p1

    if-lez v0, :cond_0

    .line 121
    iget v0, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_ptr:I

    long-to-int v1, p1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_ptr:I

    .line 132
    :goto_0
    return-wide p1

    .line 124
    :cond_0
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/io/MergedStream;->freeMergedBuffer()V

    .line 125
    int-to-long v0, v4

    add-long/2addr v0, v2

    .line 126
    int-to-long v4, v4

    sub-long/2addr p1, v4

    .line 129
    :goto_1
    cmp-long v2, p1, v2

    if-lez v2, :cond_1

    .line 130
    iget-object v2, p0, Lcom/fasterxml/jackson/core/io/MergedStream;->_in:Ljava/io/InputStream;

    invoke-virtual {v2, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v2

    add-long/2addr v0, v2

    :cond_1
    move-wide p1, v0

    .line 132
    goto :goto_0

    :cond_2
    move-wide v0, v2

    goto :goto_1
.end method
