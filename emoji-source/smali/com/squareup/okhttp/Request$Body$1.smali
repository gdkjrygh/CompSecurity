.class final Lcom/squareup/okhttp/Request$Body$1;
.super Lcom/squareup/okhttp/Request$Body;
.source "Request.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/squareup/okhttp/Request$Body;->create(Lcom/squareup/okhttp/MediaType;[B)Lcom/squareup/okhttp/Request$Body;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$content:[B

.field final synthetic val$contentType:Lcom/squareup/okhttp/MediaType;


# direct methods
.method constructor <init>(Lcom/squareup/okhttp/MediaType;[B)V
    .locals 0

    .prologue
    .line 144
    iput-object p1, p0, Lcom/squareup/okhttp/Request$Body$1;->val$contentType:Lcom/squareup/okhttp/MediaType;

    iput-object p2, p0, Lcom/squareup/okhttp/Request$Body$1;->val$content:[B

    invoke-direct {p0}, Lcom/squareup/okhttp/Request$Body;-><init>()V

    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .prologue
    .line 150
    iget-object v0, p0, Lcom/squareup/okhttp/Request$Body$1;->val$content:[B

    array-length v0, v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public contentType()Lcom/squareup/okhttp/MediaType;
    .locals 1

    .prologue
    .line 146
    iget-object v0, p0, Lcom/squareup/okhttp/Request$Body$1;->val$contentType:Lcom/squareup/okhttp/MediaType;

    return-object v0
.end method

.method public writeTo(Ljava/io/OutputStream;)V
    .locals 1
    .param p1, "out"    # Ljava/io/OutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 154
    iget-object v0, p0, Lcom/squareup/okhttp/Request$Body$1;->val$content:[B

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 155
    return-void
.end method
