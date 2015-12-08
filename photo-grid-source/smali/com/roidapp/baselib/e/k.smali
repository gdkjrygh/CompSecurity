.class public final Lcom/roidapp/baselib/e/k;
.super Lcom/roidapp/baselib/e/f;
.source "SourceFile"


# instance fields
.field private b:[B


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 16
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/e/f;-><init>(Ljava/lang/String;)V

    .line 17
    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/baselib/e/k;->b:[B

    .line 18
    return-void
.end method


# virtual methods
.method final a(Ljava/io/OutputStream;)V
    .locals 2

    .prologue
    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Content-Disposition: form-data; name=\""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/roidapp/baselib/e/k;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\"\r\n\r\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 33
    iget-object v0, p0, Lcom/roidapp/baselib/e/k;->b:[B

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 34
    return-void
.end method

.method public final a()[B
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/baselib/e/k;->b:[B

    return-object v0
.end method
