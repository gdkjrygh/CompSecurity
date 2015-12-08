.class public abstract Lcom/squareup/okhttp/Response$Body;
.super Ljava/lang/Object;
.source "Response.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/Response;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Body"
.end annotation


# instance fields
.field private reader:Ljava/io/Reader;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private charset()Ljava/nio/charset/Charset;
    .locals 2

    .prologue
    .line 191
    invoke-virtual {p0}, Lcom/squareup/okhttp/Response$Body;->contentType()Lcom/squareup/okhttp/MediaType;

    move-result-object v0

    .line 192
    .local v0, "contentType":Lcom/squareup/okhttp/MediaType;
    if-eqz v0, :cond_0

    sget-object v1, Lcom/squareup/okhttp/internal/Util;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/MediaType;->charset(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v1

    :goto_0
    return-object v1

    :cond_0
    sget-object v1, Lcom/squareup/okhttp/internal/Util;->UTF_8:Ljava/nio/charset/Charset;

    goto :goto_0
.end method


# virtual methods
.method public abstract byteStream()Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final bytes()[B
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 150
    invoke-virtual {p0}, Lcom/squareup/okhttp/Response$Body;->contentLength()J

    move-result-wide v2

    .line 151
    .local v2, "contentLength":J
    const-wide/32 v6, 0x7fffffff

    cmp-long v5, v2, v6

    if-lez v5, :cond_0

    .line 152
    new-instance v5, Ljava/io/IOException;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Cannot buffer entire body for content length: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 155
    :cond_0
    const-wide/16 v6, -0x1

    cmp-long v5, v2, v6

    if-eqz v5, :cond_1

    .line 156
    long-to-int v5, v2

    new-array v0, v5, [B

    .line 157
    .local v0, "content":[B
    invoke-virtual {p0}, Lcom/squareup/okhttp/Response$Body;->byteStream()Ljava/io/InputStream;

    move-result-object v1

    .line 158
    .local v1, "in":Ljava/io/InputStream;
    invoke-static {v1, v0}, Lcom/squareup/okhttp/internal/Util;->readFully(Ljava/io/InputStream;[B)V

    .line 159
    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_2

    new-instance v5, Ljava/io/IOException;

    const-string v6, "Content-Length and stream length disagree"

    invoke-direct {v5, v6}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 163
    .end local v0    # "content":[B
    .end local v1    # "in":Ljava/io/InputStream;
    :cond_1
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 164
    .local v4, "out":Ljava/io/ByteArrayOutputStream;
    invoke-virtual {p0}, Lcom/squareup/okhttp/Response$Body;->byteStream()Ljava/io/InputStream;

    move-result-object v5

    invoke-static {v5, v4}, Lcom/squareup/okhttp/internal/Util;->copy(Ljava/io/InputStream;Ljava/io/OutputStream;)I

    .line 165
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .end local v4    # "out":Ljava/io/ByteArrayOutputStream;
    :cond_2
    return-object v0
.end method

.method public final charStream()Ljava/io/Reader;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 175
    iget-object v0, p0, Lcom/squareup/okhttp/Response$Body;->reader:Ljava/io/Reader;

    if-nez v0, :cond_0

    .line 176
    new-instance v0, Ljava/io/InputStreamReader;

    invoke-virtual {p0}, Lcom/squareup/okhttp/Response$Body;->byteStream()Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {p0}, Lcom/squareup/okhttp/Response$Body;->charset()Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    iput-object v0, p0, Lcom/squareup/okhttp/Response$Body;->reader:Ljava/io/Reader;

    .line 178
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/Response$Body;->reader:Ljava/io/Reader;

    return-object v0
.end method

.method public abstract contentLength()J
.end method

.method public abstract contentType()Lcom/squareup/okhttp/MediaType;
.end method

.method public abstract ready()Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final string()Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 187
    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0}, Lcom/squareup/okhttp/Response$Body;->bytes()[B

    move-result-object v1

    invoke-direct {p0}, Lcom/squareup/okhttp/Response$Body;->charset()Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    return-object v0
.end method
