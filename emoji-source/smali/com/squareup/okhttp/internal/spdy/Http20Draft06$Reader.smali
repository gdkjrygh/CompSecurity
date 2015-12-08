.class final Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;
.super Ljava/lang/Object;
.source "Http20Draft06.java"

# interfaces
.implements Lcom/squareup/okhttp/internal/spdy/FrameReader;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/spdy/Http20Draft06;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Reader"
.end annotation


# instance fields
.field private final client:Z

.field private final hpackReader:Lcom/squareup/okhttp/internal/spdy/Hpack$Reader;

.field private final in:Ljava/io/DataInputStream;


# direct methods
.method constructor <init>(Ljava/io/InputStream;Z)V
    .locals 2
    .param p1, "in"    # Ljava/io/InputStream;
    .param p2, "client"    # Z

    .prologue
    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    new-instance v0, Ljava/io/DataInputStream;

    invoke-direct {v0, p1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->in:Ljava/io/DataInputStream;

    .line 76
    iput-boolean p2, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->client:Z

    .line 77
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/Hpack$Reader;

    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->in:Ljava/io/DataInputStream;

    invoke-direct {v0, v1, p2}, Lcom/squareup/okhttp/internal/spdy/Hpack$Reader;-><init>(Ljava/io/DataInputStream;Z)V

    iput-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->hpackReader:Lcom/squareup/okhttp/internal/spdy/Hpack$Reader;

    .line 78
    return-void
.end method

.method private static varargs ioException(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;
    .locals 2
    .param p0, "message"    # Ljava/lang/String;
    .param p1, "args"    # [Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 266
    new-instance v0, Ljava/io/IOException;

    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private readData(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;III)V
    .locals 2
    .param p1, "handler"    # Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;
    .param p2, "flags"    # I
    .param p3, "length"    # I
    .param p4, "streamId"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 186
    and-int/lit8 v1, p2, 0x1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    .line 187
    .local v0, "inFinished":Z
    :goto_0
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->in:Ljava/io/DataInputStream;

    invoke-interface {p1, v0, p4, v1, p3}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->data(ZILjava/io/InputStream;I)V

    .line 188
    return-void

    .line 186
    .end local v0    # "inFinished":Z
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private readGoAway(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;III)V
    .locals 8
    .param p1, "handler"    # Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;
    .param p2, "flags"    # I
    .param p3, "length"    # I
    .param p4, "streamId"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v5, 0x1

    const/4 v7, 0x0

    .line 242
    const/16 v4, 0x8

    if-ge p3, v4, :cond_0

    const-string v4, "TYPE_GOAWAY length < 8: %s"

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v7

    invoke-static {v4, v5}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->ioException(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v4

    throw v4

    .line 243
    :cond_0
    iget-object v4, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v4}, Ljava/io/DataInputStream;->readInt()I

    move-result v2

    .line 244
    .local v2, "lastStreamId":I
    iget-object v4, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v4}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    .line 245
    .local v1, "errorCodeInt":I
    add-int/lit8 v3, p3, -0x8

    .line 246
    .local v3, "opaqueDataLength":I
    invoke-static {v1}, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->fromHttp2(I)Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    move-result-object v0

    .line 247
    .local v0, "errorCode":Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    if-nez v0, :cond_1

    .line 248
    const-string v4, "TYPE_RST_STREAM unexpected error code: %d"

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v7

    invoke-static {v4, v5}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->ioException(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v4

    throw v4

    .line 250
    :cond_1
    iget-object v4, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->in:Ljava/io/DataInputStream;

    int-to-long v6, v3

    invoke-static {v4, v6, v7}, Lcom/squareup/okhttp/internal/Util;->skipByReading(Ljava/io/InputStream;J)J

    move-result-wide v4

    int-to-long v6, v3

    cmp-long v4, v4, v6

    if-eqz v4, :cond_2

    .line 251
    new-instance v4, Ljava/io/IOException;

    const-string v5, "TYPE_GOAWAY opaque data was truncated"

    invoke-direct {v4, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 253
    :cond_2
    invoke-interface {p1, v2, v0}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->goAway(ILcom/squareup/okhttp/internal/spdy/ErrorCode;)V

    .line 254
    return-void
.end method

.method private readHeaders(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;III)V
    .locals 13
    .param p1, "handler"    # Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;
    .param p2, "flags"    # I
    .param p3, "length"    # I
    .param p4, "streamId"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 148
    if-nez p4, :cond_0

    const-string v1, "TYPE_HEADERS streamId == 0"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->ioException(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    .line 150
    :cond_0
    and-int/lit8 v1, p2, 0x1

    if-eqz v1, :cond_2

    const/4 v3, 0x1

    .line 153
    .local v3, "inFinished":Z
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->hpackReader:Lcom/squareup/okhttp/internal/spdy/Hpack$Reader;

    move/from16 v0, p3

    invoke-virtual {v1, v0}, Lcom/squareup/okhttp/internal/spdy/Hpack$Reader;->readHeaders(I)V

    .line 155
    and-int/lit8 v1, p2, 0x4

    if-eqz v1, :cond_3

    .line 156
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->hpackReader:Lcom/squareup/okhttp/internal/spdy/Hpack$Reader;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/spdy/Hpack$Reader;->emitReferenceSet()V

    .line 157
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->hpackReader:Lcom/squareup/okhttp/internal/spdy/Hpack$Reader;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/spdy/Hpack$Reader;->getAndReset()Ljava/util/List;

    move-result-object v7

    .line 158
    .local v7, "namesAndValues":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v6, -0x1

    .line 159
    .local v6, "priority":I
    const/4 v2, 0x0

    const/4 v5, -0x1

    sget-object v8, Lcom/squareup/okhttp/internal/spdy/HeadersMode;->HTTP_20_HEADERS:Lcom/squareup/okhttp/internal/spdy/HeadersMode;

    move-object v1, p1

    move/from16 v4, p4

    invoke-interface/range {v1 .. v8}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->headers(ZZIIILjava/util/List;Lcom/squareup/okhttp/internal/spdy/HeadersMode;)V

    .line 161
    return-void

    .line 150
    .end local v3    # "inFinished":Z
    .end local v6    # "priority":I
    .end local v7    # "namesAndValues":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :cond_2
    const/4 v3, 0x0

    goto :goto_0

    .line 165
    .restart local v3    # "inFinished":Z
    :cond_3
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I

    move-result v11

    .line 166
    .local v11, "w1":I
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I

    move-result v12

    .line 168
    .local v12, "w2":I
    const/high16 v1, -0x10000

    and-int/2addr v1, v11

    shr-int/lit8 p3, v1, 0x10

    .line 169
    const v1, 0xff00

    and-int/2addr v1, v11

    shr-int/lit8 v10, v1, 0x8

    .line 170
    .local v10, "newType":I
    and-int/lit16 p2, v11, 0xff

    .line 173
    and-int/lit8 v1, p2, 0x1

    if-eqz v1, :cond_4

    const/4 v3, 0x1

    .line 176
    :goto_1
    const v1, 0x7fffffff

    and-int v9, v12, v1

    .line 178
    .local v9, "newStreamId":I
    const/16 v1, 0xa

    if-eq v10, v1, :cond_5

    .line 179
    const-string v1, "TYPE_CONTINUATION didn\'t have FLAG_END_HEADERS"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->ioException(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    .line 173
    .end local v9    # "newStreamId":I
    :cond_4
    const/4 v3, 0x0

    goto :goto_1

    .line 181
    .restart local v9    # "newStreamId":I
    :cond_5
    move/from16 v0, p4

    if-eq v9, v0, :cond_1

    const-string v1, "TYPE_CONTINUATION streamId changed"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->ioException(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v1

    throw v1
.end method

.method private readPing(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;III)V
    .locals 7
    .param p1, "handler"    # Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;
    .param p2, "flags"    # I
    .param p3, "length"    # I
    .param p4, "streamId"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 232
    const/16 v4, 0x8

    if-eq p3, v4, :cond_0

    const-string v4, "TYPE_PING length != 8: %s"

    new-array v5, v2, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v3

    invoke-static {v4, v5}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->ioException(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v3

    throw v3

    .line 233
    :cond_0
    if-eqz p4, :cond_1

    const-string v4, "TYPE_PING streamId != 0"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v4, v3}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->ioException(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v3

    throw v3

    .line 234
    :cond_1
    iget-object v4, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v4}, Ljava/io/DataInputStream;->readInt()I

    move-result v0

    .line 235
    .local v0, "payload1":I
    iget-object v4, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v4}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    .line 236
    .local v1, "payload2":I
    and-int/lit8 v4, p2, 0x1

    if-eqz v4, :cond_2

    .line 237
    .local v2, "reply":Z
    :goto_0
    invoke-interface {p1, v2, v0, v1}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->ping(ZII)V

    .line 238
    return-void

    .end local v2    # "reply":Z
    :cond_2
    move v2, v3

    .line 236
    goto :goto_0
.end method

.method private readPriority(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;III)V
    .locals 6
    .param p1, "handler"    # Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;
    .param p2, "flags"    # I
    .param p3, "length"    # I
    .param p4, "streamId"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v5, 0x0

    .line 192
    const/4 v2, 0x4

    if-eq p3, v2, :cond_0

    const-string v2, "TYPE_PRIORITY length: %d != 4"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-static {v2, v3}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->ioException(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v2

    throw v2

    .line 193
    :cond_0
    if-nez p4, :cond_1

    const-string v2, "TYPE_PRIORITY streamId == 0"

    new-array v3, v5, [Ljava/lang/Object;

    invoke-static {v2, v3}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->ioException(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v2

    throw v2

    .line 194
    :cond_1
    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v2}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    .line 196
    .local v1, "w1":I
    const v2, 0x7fffffff

    and-int v0, v1, v2

    .line 197
    .local v0, "priority":I
    invoke-interface {p1, p4, v0}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->priority(II)V

    .line 198
    return-void
.end method

.method private readPushPromise(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;III)V
    .locals 0
    .param p1, "handler"    # Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;
    .param p2, "flags"    # I
    .param p3, "length"    # I
    .param p4, "streamId"    # I

    .prologue
    .line 229
    return-void
.end method

.method private readRstStream(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;III)V
    .locals 6
    .param p1, "handler"    # Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;
    .param p2, "flags"    # I
    .param p3, "length"    # I
    .param p4, "streamId"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v3, 0x1

    const/4 v5, 0x0

    .line 202
    const/4 v2, 0x4

    if-eq p3, v2, :cond_0

    const-string v2, "TYPE_RST_STREAM length: %d != 4"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-static {v2, v3}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->ioException(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v2

    throw v2

    .line 203
    :cond_0
    if-nez p4, :cond_1

    const-string v2, "TYPE_RST_STREAM streamId == 0"

    new-array v3, v5, [Ljava/lang/Object;

    invoke-static {v2, v3}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->ioException(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v2

    throw v2

    .line 204
    :cond_1
    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v2}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    .line 205
    .local v1, "errorCodeInt":I
    invoke-static {v1}, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->fromHttp2(I)Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    move-result-object v0

    .line 206
    .local v0, "errorCode":Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    if-nez v0, :cond_2

    .line 207
    const-string v2, "TYPE_RST_STREAM unexpected error code: %d"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-static {v2, v3}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->ioException(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v2

    throw v2

    .line 209
    :cond_2
    invoke-interface {p1, p4, v0}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->rstStream(ILcom/squareup/okhttp/internal/spdy/ErrorCode;)V

    .line 210
    return-void
.end method

.method private readSettings(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;III)V
    .locals 9
    .param p1, "handler"    # Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;
    .param p2, "flags"    # I
    .param p3, "length"    # I
    .param p4, "streamId"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v8, 0x0

    .line 214
    rem-int/lit8 v5, p3, 0x8

    if-eqz v5, :cond_0

    const-string v5, "TYPE_SETTINGS length %% 8 != 0: %s"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v8

    invoke-static {v5, v6}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->ioException(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v5

    throw v5

    .line 215
    :cond_0
    if-eqz p4, :cond_1

    const-string v5, "TYPE_SETTINGS streamId != 0"

    new-array v6, v8, [Ljava/lang/Object;

    invoke-static {v5, v6}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->ioException(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v5

    throw v5

    .line 216
    :cond_1
    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Settings;

    invoke-direct {v2}, Lcom/squareup/okhttp/internal/spdy/Settings;-><init>()V

    .line 217
    .local v2, "settings":Lcom/squareup/okhttp/internal/spdy/Settings;
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    if-ge v0, p3, :cond_2

    .line 218
    iget-object v5, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v5}, Ljava/io/DataInputStream;->readInt()I

    move-result v4

    .line 219
    .local v4, "w1":I
    iget-object v5, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v5}, Ljava/io/DataInputStream;->readInt()I

    move-result v3

    .line 221
    .local v3, "value":I
    const v5, 0xffffff

    and-int v1, v4, v5

    .line 222
    .local v1, "id":I
    invoke-virtual {v2, v1, v8, v3}, Lcom/squareup/okhttp/internal/spdy/Settings;->set(III)V

    .line 217
    add-int/lit8 v0, v0, 0x8

    goto :goto_0

    .line 224
    .end local v1    # "id":I
    .end local v3    # "value":I
    .end local v4    # "w1":I
    :cond_2
    invoke-interface {p1, v8, v2}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->settings(ZLcom/squareup/okhttp/internal/spdy/Settings;)V

    .line 225
    return-void
.end method

.method private readWindowUpdate(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;III)V
    .locals 4
    .param p1, "handler"    # Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;
    .param p2, "flags"    # I
    .param p3, "length"    # I
    .param p4, "streamId"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 258
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v3}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    .line 260
    .local v1, "w1":I
    const v3, 0x7fffffff

    and-int v2, v1, v3

    .line 261
    .local v2, "windowSizeIncrement":I
    and-int/lit8 v3, p2, 0x1

    if-eqz v3, :cond_0

    const/4 v0, 0x1

    .line 262
    .local v0, "endFlowControl":Z
    :goto_0
    invoke-interface {p1, p4, v2, v0}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->windowUpdate(IIZ)V

    .line 263
    return-void

    .line 261
    .end local v0    # "endFlowControl":Z
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 270
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->close()V

    .line 271
    return-void
.end method

.method public nextFrame(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;)Z
    .locals 9
    .param p1, "handler"    # Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v7, 0x1

    .line 93
    :try_start_0
    iget-object v8, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v8}, Ljava/io/DataInputStream;->readInt()I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v5

    .line 97
    .local v5, "w1":I
    iget-object v8, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v8}, Ljava/io/DataInputStream;->readInt()I

    move-result v6

    .line 99
    .local v6, "w2":I
    const/high16 v8, -0x10000

    and-int/2addr v8, v5

    shr-int/lit8 v2, v8, 0x10

    .line 100
    .local v2, "length":I
    const v8, 0xff00

    and-int/2addr v8, v5

    shr-int/lit8 v4, v8, 0x8

    .line 101
    .local v4, "type":I
    and-int/lit16 v1, v5, 0xff

    .line 103
    .local v1, "flags":I
    const v8, 0x7fffffff

    and-int v3, v6, v8

    .line 105
    .local v3, "streamId":I
    packed-switch v4, :pswitch_data_0

    .line 143
    :pswitch_0
    new-instance v7, Ljava/lang/UnsupportedOperationException;

    const-string v8, "TODO"

    invoke-direct {v7, v8}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v7

    .line 94
    .end local v1    # "flags":I
    .end local v2    # "length":I
    .end local v3    # "streamId":I
    .end local v4    # "type":I
    .end local v5    # "w1":I
    .end local v6    # "w2":I
    :catch_0
    move-exception v0

    .line 95
    .local v0, "e":Ljava/io/IOException;
    const/4 v7, 0x0

    .line 140
    .end local v0    # "e":Ljava/io/IOException;
    :goto_0
    return v7

    .line 107
    .restart local v1    # "flags":I
    .restart local v2    # "length":I
    .restart local v3    # "streamId":I
    .restart local v4    # "type":I
    .restart local v5    # "w1":I
    .restart local v6    # "w2":I
    :pswitch_1
    invoke-direct {p0, p1, v1, v2, v3}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->readData(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;III)V

    goto :goto_0

    .line 111
    :pswitch_2
    invoke-direct {p0, p1, v1, v2, v3}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->readHeaders(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;III)V

    goto :goto_0

    .line 115
    :pswitch_3
    invoke-direct {p0, p1, v1, v2, v3}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->readPriority(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;III)V

    goto :goto_0

    .line 119
    :pswitch_4
    invoke-direct {p0, p1, v1, v2, v3}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->readRstStream(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;III)V

    goto :goto_0

    .line 123
    :pswitch_5
    invoke-direct {p0, p1, v1, v2, v3}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->readSettings(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;III)V

    goto :goto_0

    .line 127
    :pswitch_6
    invoke-direct {p0, p1, v1, v2, v3}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->readPushPromise(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;III)V

    goto :goto_0

    .line 131
    :pswitch_7
    invoke-direct {p0, p1, v1, v2, v3}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->readPing(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;III)V

    goto :goto_0

    .line 135
    :pswitch_8
    invoke-direct {p0, p1, v1, v2, v3}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->readGoAway(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;III)V

    goto :goto_0

    .line 139
    :pswitch_9
    invoke-direct {p0, p1, v1, v2, v3}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->readWindowUpdate(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;III)V

    goto :goto_0

    .line 105
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_0
        :pswitch_9
    .end packed-switch
.end method

.method public readConnectionHeader()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 81
    iget-boolean v1, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->client:Z

    if-eqz v1, :cond_1

    .line 88
    :cond_0
    return-void

    .line 82
    :cond_1
    # getter for: Lcom/squareup/okhttp/internal/spdy/Http20Draft06;->CONNECTION_HEADER:[B
    invoke-static {}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06;->access$000()[B

    move-result-object v1

    array-length v1, v1

    new-array v0, v1, [B

    .line 83
    .local v0, "connectionHeader":[B
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v1, v0}, Ljava/io/DataInputStream;->readFully([B)V

    .line 84
    # getter for: Lcom/squareup/okhttp/internal/spdy/Http20Draft06;->CONNECTION_HEADER:[B
    invoke-static {}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06;->access$000()[B

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_0

    .line 85
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected a connection header but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 86
    invoke-static {v0}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    .line 85
    invoke-static {v1, v2}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Reader;->ioException(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v1

    throw v1
.end method
