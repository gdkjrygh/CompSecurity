.class final Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;
.super Ljava/lang/Object;
.source "Spdy3.java"

# interfaces
.implements Lcom/squareup/okhttp/internal/spdy/FrameReader;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/spdy/Spdy3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Reader"
.end annotation


# instance fields
.field private final client:Z

.field private final in:Ljava/io/DataInputStream;

.field private final nameValueBlockReader:Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;


# direct methods
.method constructor <init>(Ljava/io/InputStream;Z)V
    .locals 1
    .param p1, "in"    # Ljava/io/InputStream;
    .param p2, "client"    # Z

    .prologue
    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    new-instance v0, Ljava/io/DataInputStream;

    invoke-direct {v0, p1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->in:Ljava/io/DataInputStream;

    .line 106
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;

    invoke-direct {v0, p1}, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->nameValueBlockReader:Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;

    .line 107
    iput-boolean p2, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->client:Z

    .line 108
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
    .line 278
    new-instance v0, Ljava/io/IOException;

    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private readGoAway(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;II)V
    .locals 7
    .param p1, "handler"    # Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;
    .param p2, "flags"    # I
    .param p3, "length"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v5, 0x1

    const/4 v6, 0x0

    .line 250
    const/16 v3, 0x8

    if-eq p3, v3, :cond_0

    const-string v3, "TYPE_GOAWAY length: %d != 8"

    new-array v4, v5, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-static {v3, v4}, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->ioException(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v3

    throw v3

    .line 251
    :cond_0
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v3}, Ljava/io/DataInputStream;->readInt()I

    move-result v3

    const v4, 0x7fffffff

    and-int v2, v3, v4

    .line 252
    .local v2, "lastGoodStreamId":I
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v3}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    .line 253
    .local v1, "errorCodeInt":I
    invoke-static {v1}, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->fromSpdyGoAway(I)Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    move-result-object v0

    .line 254
    .local v0, "errorCode":Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    if-nez v0, :cond_1

    .line 255
    const-string v3, "TYPE_GOAWAY unexpected error code: %d"

    new-array v4, v5, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-static {v3, v4}, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->ioException(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v3

    throw v3

    .line 257
    :cond_1
    invoke-interface {p1, v2, v0}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->goAway(ILcom/squareup/okhttp/internal/spdy/ErrorCode;)V

    .line 258
    return-void
.end method

.method private readHeaders(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;II)V
    .locals 9
    .param p1, "handler"    # Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;
    .param p2, "flags"    # I
    .param p3, "length"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    const/4 v4, -0x1

    .line 227
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v8

    .line 228
    .local v8, "w1":I
    const v0, 0x7fffffff

    and-int v3, v8, v0

    .line 229
    .local v3, "streamId":I
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->nameValueBlockReader:Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;

    add-int/lit8 v2, p3, -0x4

    invoke-virtual {v0, v2}, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;->readNameValueBlock(I)Ljava/util/List;

    move-result-object v6

    .line 230
    .local v6, "nameValueBlock":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    sget-object v7, Lcom/squareup/okhttp/internal/spdy/HeadersMode;->SPDY_HEADERS:Lcom/squareup/okhttp/internal/spdy/HeadersMode;

    move-object v0, p1

    move v2, v1

    move v5, v4

    invoke-interface/range {v0 .. v7}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->headers(ZZIIILjava/util/List;Lcom/squareup/okhttp/internal/spdy/HeadersMode;)V

    .line 231
    return-void
.end method

.method private readPing(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;II)V
    .locals 6
    .param p1, "handler"    # Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;
    .param p2, "flags"    # I
    .param p3, "length"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 243
    const/4 v3, 0x4

    if-eq p3, v3, :cond_0

    const-string v3, "TYPE_PING length: %d != 4"

    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v3, v4}, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->ioException(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v2

    throw v2

    .line 244
    :cond_0
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v3}, Ljava/io/DataInputStream;->readInt()I

    move-result v0

    .line 245
    .local v0, "id":I
    iget-boolean v4, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->client:Z

    rem-int/lit8 v3, v0, 0x2

    if-ne v3, v1, :cond_1

    move v3, v1

    :goto_0
    if-ne v4, v3, :cond_2

    .line 246
    .local v1, "reply":Z
    :goto_1
    invoke-interface {p1, v1, v0, v2}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->ping(ZII)V

    .line 247
    return-void

    .end local v1    # "reply":Z
    :cond_1
    move v3, v2

    .line 245
    goto :goto_0

    :cond_2
    move v1, v2

    goto :goto_1
.end method

.method private readRstStream(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;II)V
    .locals 7
    .param p1, "handler"    # Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;
    .param p2, "flags"    # I
    .param p3, "length"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v5, 0x1

    const/4 v6, 0x0

    .line 216
    const/16 v3, 0x8

    if-eq p3, v3, :cond_0

    const-string v3, "TYPE_RST_STREAM length: %d != 8"

    new-array v4, v5, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-static {v3, v4}, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->ioException(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v3

    throw v3

    .line 217
    :cond_0
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v3}, Ljava/io/DataInputStream;->readInt()I

    move-result v3

    const v4, 0x7fffffff

    and-int v2, v3, v4

    .line 218
    .local v2, "streamId":I
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v3}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    .line 219
    .local v1, "errorCodeInt":I
    invoke-static {v1}, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->fromSpdy3Rst(I)Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    move-result-object v0

    .line 220
    .local v0, "errorCode":Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    if-nez v0, :cond_1

    .line 221
    const-string v3, "TYPE_RST_STREAM unexpected error code: %d"

    new-array v4, v5, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-static {v3, v4}, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->ioException(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v3

    throw v3

    .line 223
    :cond_1
    invoke-interface {p1, v2, v0}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->rstStream(ILcom/squareup/okhttp/internal/spdy/ErrorCode;)V

    .line 224
    return-void
.end method

.method private readSettings(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;II)V
    .locals 12
    .param p1, "handler"    # Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;
    .param p2, "flags"    # I
    .param p3, "length"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x1

    const/4 v8, 0x0

    .line 261
    iget-object v9, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v9}, Ljava/io/DataInputStream;->readInt()I

    move-result v4

    .line 262
    .local v4, "numberOfEntries":I
    mul-int/lit8 v9, v4, 0x8

    add-int/lit8 v9, v9, 0x4

    if-eq p3, v9, :cond_0

    .line 263
    const-string v9, "TYPE_SETTINGS length: %d != 4 + 8 * %d"

    const/4 v10, 0x2

    new-array v10, v10, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    aput-object v11, v10, v8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v10, v0

    invoke-static {v9, v10}, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->ioException(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v8

    throw v8

    .line 265
    :cond_0
    new-instance v5, Lcom/squareup/okhttp/internal/spdy/Settings;

    invoke-direct {v5}, Lcom/squareup/okhttp/internal/spdy/Settings;-><init>()V

    .line 266
    .local v5, "settings":Lcom/squareup/okhttp/internal/spdy/Settings;
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    if-ge v1, v4, :cond_1

    .line 267
    iget-object v9, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v9}, Ljava/io/DataInputStream;->readInt()I

    move-result v7

    .line 268
    .local v7, "w1":I
    iget-object v9, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v9}, Ljava/io/DataInputStream;->readInt()I

    move-result v6

    .line 269
    .local v6, "value":I
    const/high16 v9, -0x1000000

    and-int/2addr v9, v7

    ushr-int/lit8 v3, v9, 0x18

    .line 270
    .local v3, "idFlags":I
    const v9, 0xffffff

    and-int v2, v7, v9

    .line 271
    .local v2, "id":I
    invoke-virtual {v5, v2, v3, v6}, Lcom/squareup/okhttp/internal/spdy/Settings;->set(III)V

    .line 266
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 273
    .end local v2    # "id":I
    .end local v3    # "idFlags":I
    .end local v6    # "value":I
    .end local v7    # "w1":I
    :cond_1
    and-int/lit8 v9, p2, 0x1

    if-eqz v9, :cond_2

    .line 274
    .local v0, "clearPrevious":Z
    :goto_1
    invoke-interface {p1, v0, v5}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->settings(ZLcom/squareup/okhttp/internal/spdy/Settings;)V

    .line 275
    return-void

    .end local v0    # "clearPrevious":Z
    :cond_2
    move v0, v8

    .line 273
    goto :goto_1
.end method

.method private readSynReply(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;II)V
    .locals 9
    .param p1, "handler"    # Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;
    .param p2, "flags"    # I
    .param p3, "length"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    const/4 v4, -0x1

    .line 208
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v8

    .line 209
    .local v8, "w1":I
    const v0, 0x7fffffff

    and-int v3, v8, v0

    .line 210
    .local v3, "streamId":I
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->nameValueBlockReader:Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;

    add-int/lit8 v5, p3, -0x4

    invoke-virtual {v0, v5}, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;->readNameValueBlock(I)Ljava/util/List;

    move-result-object v6

    .line 211
    .local v6, "nameValueBlock":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    .line 212
    .local v2, "inFinished":Z
    :goto_0
    sget-object v7, Lcom/squareup/okhttp/internal/spdy/HeadersMode;->SPDY_REPLY:Lcom/squareup/okhttp/internal/spdy/HeadersMode;

    move-object v0, p1

    move v5, v4

    invoke-interface/range {v0 .. v7}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->headers(ZZIIILjava/util/List;Lcom/squareup/okhttp/internal/spdy/HeadersMode;)V

    .line 213
    return-void

    .end local v2    # "inFinished":Z
    :cond_0
    move v2, v1

    .line 211
    goto :goto_0
.end method

.method private readSynStream(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;II)V
    .locals 12
    .param p1, "handler"    # Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;
    .param p2, "flags"    # I
    .param p3, "length"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 192
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v10

    .line 193
    .local v10, "w1":I
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v11

    .line 194
    .local v11, "w2":I
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readShort()S

    move-result v8

    .line 195
    .local v8, "s3":I
    const v0, 0x7fffffff

    and-int v3, v10, v0

    .line 196
    .local v3, "streamId":I
    const v0, 0x7fffffff

    and-int v4, v11, v0

    .line 197
    .local v4, "associatedStreamId":I
    const v0, 0xe000

    and-int/2addr v0, v8

    ushr-int/lit8 v5, v0, 0xd

    .line 198
    .local v5, "priority":I
    and-int/lit16 v9, v8, 0xff

    .line 199
    .local v9, "slot":I
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->nameValueBlockReader:Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;

    add-int/lit8 v7, p3, -0xa

    invoke-virtual {v0, v7}, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;->readNameValueBlock(I)Ljava/util/List;

    move-result-object v6

    .line 201
    .local v6, "nameValueBlock":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    .line 202
    .local v2, "inFinished":Z
    :goto_0
    and-int/lit8 v0, p2, 0x2

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    .line 203
    .local v1, "outFinished":Z
    :goto_1
    sget-object v7, Lcom/squareup/okhttp/internal/spdy/HeadersMode;->SPDY_SYN_STREAM:Lcom/squareup/okhttp/internal/spdy/HeadersMode;

    move-object v0, p1

    invoke-interface/range {v0 .. v7}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->headers(ZZIIILjava/util/List;Lcom/squareup/okhttp/internal/spdy/HeadersMode;)V

    .line 205
    return-void

    .line 201
    .end local v1    # "outFinished":Z
    .end local v2    # "inFinished":Z
    :cond_0
    const/4 v2, 0x0

    goto :goto_0

    .line 202
    .restart local v2    # "inFinished":Z
    :cond_1
    const/4 v1, 0x0

    goto :goto_1
.end method

.method private readWindowUpdate(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;II)V
    .locals 8
    .param p1, "handler"    # Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;
    .param p2, "flags"    # I
    .param p3, "length"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const v5, 0x7fffffff

    const/4 v7, 0x0

    .line 234
    const/16 v4, 0x8

    if-eq p3, v4, :cond_0

    const-string v4, "TYPE_WINDOW_UPDATE length: %d != 8"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v7

    invoke-static {v4, v5}, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->ioException(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v4

    throw v4

    .line 235
    :cond_0
    iget-object v4, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v4}, Ljava/io/DataInputStream;->readInt()I

    move-result v2

    .line 236
    .local v2, "w1":I
    iget-object v4, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v4}, Ljava/io/DataInputStream;->readInt()I

    move-result v3

    .line 237
    .local v3, "w2":I
    and-int v1, v2, v5

    .line 238
    .local v1, "streamId":I
    and-int v0, v3, v5

    .line 239
    .local v0, "deltaWindowSize":I
    invoke-interface {p1, v1, v0, v7}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->windowUpdate(IIZ)V

    .line 240
    return-void
.end method


# virtual methods
.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 282
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->in:Ljava/io/DataInputStream;

    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->nameValueBlockReader:Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;

    invoke-static {v0, v1}, Lcom/squareup/okhttp/internal/Util;->closeAll(Ljava/io/Closeable;Ljava/io/Closeable;)V

    .line 283
    return-void
.end method

.method public nextFrame(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;)Z
    .locals 14
    .param p1, "handler"    # Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    const/4 v10, 0x1

    .line 120
    :try_start_0
    iget-object v11, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v11}, Ljava/io/DataInputStream;->readInt()I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v8

    .line 124
    .local v8, "w1":I
    iget-object v11, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->in:Ljava/io/DataInputStream;

    invoke-virtual {v11}, Ljava/io/DataInputStream;->readInt()I

    move-result v9

    .line 126
    .local v9, "w2":I
    const/high16 v11, -0x80000000

    and-int/2addr v11, v8

    if-eqz v11, :cond_0

    move v0, v10

    .line 127
    .local v0, "control":Z
    :goto_0
    const/high16 v11, -0x1000000

    and-int/2addr v11, v9

    ushr-int/lit8 v2, v11, 0x18

    .line 128
    .local v2, "flags":I
    const v11, 0xffffff

    and-int v4, v9, v11

    .line 130
    .local v4, "length":I
    if-eqz v0, :cond_3

    .line 131
    const/high16 v11, 0x7fff0000

    and-int/2addr v11, v8

    ushr-int/lit8 v7, v11, 0x10

    .line 132
    .local v7, "version":I
    const v11, 0xffff

    and-int v6, v8, v11

    .line 134
    .local v6, "type":I
    const/4 v11, 0x3

    if-eq v7, v11, :cond_1

    .line 135
    new-instance v10, Ljava/net/ProtocolException;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "version != 3: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v11}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v10

    .line 121
    .end local v0    # "control":Z
    .end local v2    # "flags":I
    .end local v4    # "length":I
    .end local v6    # "type":I
    .end local v7    # "version":I
    .end local v8    # "w1":I
    .end local v9    # "w2":I
    :catch_0
    move-exception v1

    .local v1, "e":Ljava/io/IOException;
    move v10, v3

    .line 187
    .end local v1    # "e":Ljava/io/IOException;
    :goto_1
    return v10

    .restart local v8    # "w1":I
    .restart local v9    # "w2":I
    :cond_0
    move v0, v3

    .line 126
    goto :goto_0

    .line 138
    .restart local v0    # "control":Z
    .restart local v2    # "flags":I
    .restart local v4    # "length":I
    .restart local v6    # "type":I
    .restart local v7    # "version":I
    :cond_1
    packed-switch v6, :pswitch_data_0

    .line 181
    :pswitch_0
    new-instance v10, Ljava/io/IOException;

    const-string v11, "Unexpected frame"

    invoke-direct {v10, v11}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v10

    .line 140
    :pswitch_1
    invoke-direct {p0, p1, v2, v4}, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->readSynStream(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;II)V

    goto :goto_1

    .line 144
    :pswitch_2
    invoke-direct {p0, p1, v2, v4}, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->readSynReply(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;II)V

    goto :goto_1

    .line 148
    :pswitch_3
    invoke-direct {p0, p1, v2, v4}, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->readRstStream(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;II)V

    goto :goto_1

    .line 152
    :pswitch_4
    invoke-direct {p0, p1, v2, v4}, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->readSettings(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;II)V

    goto :goto_1

    .line 156
    :pswitch_5
    if-eqz v4, :cond_2

    const-string v11, "TYPE_NOOP length: %d != 0"

    new-array v10, v10, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    aput-object v12, v10, v3

    invoke-static {v11, v10}, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->ioException(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v10

    throw v10

    .line 157
    :cond_2
    invoke-interface {p1}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->noop()V

    goto :goto_1

    .line 161
    :pswitch_6
    invoke-direct {p0, p1, v2, v4}, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->readPing(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;II)V

    goto :goto_1

    .line 165
    :pswitch_7
    invoke-direct {p0, p1, v2, v4}, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->readGoAway(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;II)V

    goto :goto_1

    .line 169
    :pswitch_8
    invoke-direct {p0, p1, v2, v4}, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->readHeaders(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;II)V

    goto :goto_1

    .line 173
    :pswitch_9
    invoke-direct {p0, p1, v2, v4}, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->readWindowUpdate(Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;II)V

    goto :goto_1

    .line 177
    :pswitch_a
    iget-object v10, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->in:Ljava/io/DataInputStream;

    int-to-long v12, v4

    invoke-static {v10, v12, v13}, Lcom/squareup/okhttp/internal/Util;->skipByReading(Ljava/io/InputStream;J)J

    .line 178
    new-instance v10, Ljava/lang/UnsupportedOperationException;

    const-string v11, "TODO"

    invoke-direct {v10, v11}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v10

    .line 184
    .end local v6    # "type":I
    .end local v7    # "version":I
    :cond_3
    const v11, 0x7fffffff

    and-int v5, v8, v11

    .line 185
    .local v5, "streamId":I
    and-int/lit8 v11, v2, 0x1

    if-eqz v11, :cond_4

    move v3, v10

    .line 186
    .local v3, "inFinished":Z
    :cond_4
    iget-object v11, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Reader;->in:Ljava/io/DataInputStream;

    invoke-interface {p1, v3, v5, v11, v4}, Lcom/squareup/okhttp/internal/spdy/FrameReader$Handler;->data(ZILjava/io/InputStream;I)V

    goto :goto_1

    .line 138
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_a
    .end packed-switch
.end method

.method public readConnectionHeader()V
    .locals 0

    .prologue
    .line 111
    return-void
.end method
