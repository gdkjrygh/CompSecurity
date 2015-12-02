.class public Lcom/facebook/http/a/a/a/a/d;
.super Lcom/facebook/http/a/a/a/a/a;
.source "StringBody.java"


# instance fields
.field private final a:I

.field private final b:[B

.field private final c:Ljava/nio/charset/Charset;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)V
    .locals 2

    .prologue
    .line 92
    invoke-direct {p0, p2}, Lcom/facebook/http/a/a/a/a/a;-><init>(Ljava/lang/String;)V

    .line 45
    const/16 v0, 0x1000

    iput v0, p0, Lcom/facebook/http/a/a/a/a/d;->a:I

    .line 93
    if-nez p1, :cond_0

    .line 94
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Text may not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 96
    :cond_0
    if-nez p3, :cond_1

    .line 97
    const-string v0, "US-ASCII"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object p3

    .line 99
    :cond_1
    invoke-virtual {p3}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/http/a/a/a/a/d;->b:[B

    .line 100
    iput-object p3, p0, Lcom/facebook/http/a/a/a/a/d;->c:Ljava/nio/charset/Charset;

    .line 101
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/nio/charset/Charset;)V
    .locals 1

    .prologue
    .line 113
    const-string v0, "text/plain"

    invoke-direct {p0, p1, v0, p2}, Lcom/facebook/http/a/a/a/a/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)V

    .line 114
    return-void
.end method


# virtual methods
.method public a(Ljava/io/OutputStream;)V
    .locals 5

    .prologue
    .line 144
    if-nez p1, :cond_0

    .line 145
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Output stream may not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 147
    :cond_0
    iget-object v0, p0, Lcom/facebook/http/a/a/a/a/d;->b:[B

    array-length v1, v0

    .line 148
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 149
    iget-object v2, p0, Lcom/facebook/http/a/a/a/a/d;->b:[B

    sub-int v3, v1, v0

    const/16 v4, 0x1000

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-virtual {p1, v2, v0, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 148
    add-int/lit16 v0, v0, 0x1000

    goto :goto_0

    .line 151
    :cond_1
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    .line 152
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 167
    const/4 v0, 0x0

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 159
    iget-object v0, p0, Lcom/facebook/http/a/a/a/a/d;->c:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 155
    const-string v0, "8bit"

    return-object v0
.end method

.method public e()J
    .locals 2

    .prologue
    .line 163
    iget-object v0, p0, Lcom/facebook/http/a/a/a/a/d;->b:[B

    array-length v0, v0

    int-to-long v0, v0

    return-wide v0
.end method
