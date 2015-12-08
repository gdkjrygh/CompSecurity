.class Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader$1;
.super Ljava/io/InputStream;
.source "NameValueBlockReader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;-><init>(Ljava/io/InputStream;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;

.field final synthetic val$in:Ljava/io/InputStream;


# direct methods
.method constructor <init>(Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;Ljava/io/InputStream;)V
    .locals 0
    .param p1, "this$0"    # Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;

    .prologue
    .line 45
    iput-object p1, p0, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader$1;->this$0:Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;

    iput-object p2, p0, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader$1;->val$in:Ljava/io/InputStream;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    return-void
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
    .line 58
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader$1;->val$in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 59
    return-void
.end method

.method public read()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 47
    invoke-static {p0}, Lcom/squareup/okhttp/internal/Util;->readSingleByte(Ljava/io/InputStream;)I

    move-result v0

    return v0
.end method

.method public read([BII)I
    .locals 3
    .param p1, "buffer"    # [B
    .param p2, "offset"    # I
    .param p3, "byteCount"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 51
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader$1;->this$0:Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;

    # getter for: Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;->compressedLimit:I
    invoke-static {v1}, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;->access$000(Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;)I

    move-result v1

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 52
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader$1;->val$in:Ljava/io/InputStream;

    invoke-virtual {v1, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    .line 53
    .local v0, "consumed":I
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader$1;->this$0:Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;

    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader$1;->this$0:Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;

    # getter for: Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;->compressedLimit:I
    invoke-static {v2}, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;->access$000(Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;)I

    move-result v2

    sub-int/2addr v2, v0

    # setter for: Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;->compressedLimit:I
    invoke-static {v1, v2}, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;->access$002(Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;I)I

    .line 54
    return v0
.end method
