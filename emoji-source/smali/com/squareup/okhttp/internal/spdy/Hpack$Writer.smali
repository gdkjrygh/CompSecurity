.class Lcom/squareup/okhttp/internal/spdy/Hpack$Writer;
.super Ljava/lang/Object;
.source "Hpack.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/spdy/Hpack;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Writer"
.end annotation


# instance fields
.field private final out:Ljava/io/OutputStream;


# direct methods
.method constructor <init>(Ljava/io/OutputStream;)V
    .locals 0
    .param p1, "out"    # Ljava/io/OutputStream;

    .prologue
    .line 344
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 345
    iput-object p1, p0, Lcom/squareup/okhttp/internal/spdy/Hpack$Writer;->out:Ljava/io/OutputStream;

    .line 346
    return-void
.end method


# virtual methods
.method public writeHeaders(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 350
    .local p1, "nameValueBlock":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v0, 0x0

    .local v0, "i":I
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    .local v1, "size":I
    :goto_0
    if-ge v0, v1, :cond_0

    .line 351
    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/Hpack$Writer;->out:Ljava/io/OutputStream;

    const/16 v3, 0x60

    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write(I)V

    .line 352
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0, v2}, Lcom/squareup/okhttp/internal/spdy/Hpack$Writer;->writeString(Ljava/lang/String;)V

    .line 353
    add-int/lit8 v2, v0, 0x1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0, v2}, Lcom/squareup/okhttp/internal/spdy/Hpack$Writer;->writeString(Ljava/lang/String;)V

    .line 350
    add-int/lit8 v0, v0, 0x2

    goto :goto_0

    .line 355
    :cond_0
    return-void
.end method

.method public writeInt(III)V
    .locals 3
    .param p1, "value"    # I
    .param p2, "prefixMask"    # I
    .param p3, "bits"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 359
    if-ge p1, p2, :cond_0

    .line 360
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Hpack$Writer;->out:Ljava/io/OutputStream;

    or-int v2, p3, p1

    invoke-virtual {v1, v2}, Ljava/io/OutputStream;->write(I)V

    .line 375
    :goto_0
    return-void

    .line 365
    :cond_0
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Hpack$Writer;->out:Ljava/io/OutputStream;

    or-int v2, p3, p2

    invoke-virtual {v1, v2}, Ljava/io/OutputStream;->write(I)V

    .line 366
    sub-int/2addr p1, p2

    .line 369
    :goto_1
    const/16 v1, 0x80

    if-lt p1, v1, :cond_1

    .line 370
    and-int/lit8 v0, p1, 0x7f

    .line 371
    .local v0, "b":I
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Hpack$Writer;->out:Ljava/io/OutputStream;

    or-int/lit16 v2, v0, 0x80

    invoke-virtual {v1, v2}, Ljava/io/OutputStream;->write(I)V

    .line 372
    ushr-int/lit8 p1, p1, 0x7

    .line 373
    goto :goto_1

    .line 374
    .end local v0    # "b":I
    :cond_1
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Hpack$Writer;->out:Ljava/io/OutputStream;

    invoke-virtual {v1, p1}, Ljava/io/OutputStream;->write(I)V

    goto :goto_0
.end method

.method public writeString(Ljava/lang/String;)V
    .locals 4
    .param p1, "headerName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 382
    const-string v1, "UTF-8"

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    .line 383
    .local v0, "bytes":[B
    array-length v1, v0

    const/16 v2, 0xff

    const/4 v3, 0x0

    invoke-virtual {p0, v1, v2, v3}, Lcom/squareup/okhttp/internal/spdy/Hpack$Writer;->writeInt(III)V

    .line 384
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Hpack$Writer;->out:Ljava/io/OutputStream;

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 385
    return-void
.end method
