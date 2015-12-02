.class public Lcom/facebook/http/d/a/d;
.super Lorg/apache/http/entity/StringEntity;
.source "StringEntityWithProgressListener.java"


# instance fields
.field private a:Lcom/facebook/http/d/a/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0, p1, p2}, Lorg/apache/http/entity/StringEntity;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/http/d/a/d;->a:Lcom/facebook/http/d/a/a;

    .line 20
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/http/d/a/a;)V
    .locals 0

    .prologue
    .line 44
    iput-object p1, p0, Lcom/facebook/http/d/a/d;->a:Lcom/facebook/http/d/a/a;

    .line 45
    return-void
.end method

.method public writeTo(Ljava/io/OutputStream;)V
    .locals 6

    .prologue
    .line 28
    if-nez p1, :cond_0

    .line 29
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Output stream may not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 31
    :cond_0
    iget-object v0, p0, Lcom/facebook/http/d/a/d;->a:Lcom/facebook/http/d/a/a;

    if-nez v0, :cond_1

    .line 32
    iget-object v0, p0, Lcom/facebook/http/d/a/d;->content:[B

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 40
    :goto_0
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    .line 41
    return-void

    .line 34
    :cond_1
    new-instance v0, Lcom/facebook/http/d/a/c;

    iget-object v1, p0, Lcom/facebook/http/d/a/d;->a:Lcom/facebook/http/d/a/a;

    invoke-direct {v0, p1, v1}, Lcom/facebook/http/d/a/c;-><init>(Ljava/io/OutputStream;Lcom/facebook/http/d/a/a;)V

    .line 35
    iget-object v1, p0, Lcom/facebook/http/d/a/d;->content:[B

    array-length v2, v1

    .line 36
    const/4 v1, 0x0

    :goto_1
    if-ge v1, v2, :cond_2

    .line 37
    iget-object v3, p0, Lcom/facebook/http/d/a/d;->content:[B

    sub-int v4, v2, v1

    const/16 v5, 0x1000

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-virtual {v0, v3, v1, v4}, Ljava/io/OutputStream;->write([BII)V

    .line 36
    add-int/lit16 v1, v1, 0x1000

    goto :goto_1

    :cond_2
    move-object p1, v0

    goto :goto_0
.end method
