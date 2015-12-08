.class Lcom/jirbo/adcolony/x;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field a:Ljava/io/InputStream;

.field b:[B

.field c:I

.field d:I

.field e:I

.field f:I

.field g:I

.field h:I


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 8
    const/16 v0, 0x400

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/jirbo/adcolony/x;->b:[B

    .line 19
    sget v0, Lcom/jirbo/adcolony/a;->n:I

    if-eqz v0, :cond_0

    const/16 v0, 0x17

    iput v0, p0, Lcom/jirbo/adcolony/x;->h:I

    iput v0, p0, Lcom/jirbo/adcolony/x;->g:I

    .line 21
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    long-to-int v0, v0

    iput v0, p0, Lcom/jirbo/adcolony/x;->c:I

    .line 22
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/x;->a:Ljava/io/InputStream;

    .line 23
    return-void
.end method


# virtual methods
.method a()V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 93
    iput v1, p0, Lcom/jirbo/adcolony/x;->e:I

    .line 94
    :goto_0
    iget v0, p0, Lcom/jirbo/adcolony/x;->e:I

    if-nez v0, :cond_0

    .line 96
    iget-object v0, p0, Lcom/jirbo/adcolony/x;->a:Ljava/io/InputStream;

    iget-object v2, p0, Lcom/jirbo/adcolony/x;->b:[B

    const/16 v3, 0x400

    invoke-virtual {v0, v2, v1, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    iput v0, p0, Lcom/jirbo/adcolony/x;->e:I

    goto :goto_0

    :cond_0
    move v0, v1

    .line 99
    :goto_1
    iget v2, p0, Lcom/jirbo/adcolony/x;->e:I

    if-ge v0, v2, :cond_1

    .line 101
    iget-object v2, p0, Lcom/jirbo/adcolony/x;->b:[B

    iget-object v3, p0, Lcom/jirbo/adcolony/x;->b:[B

    aget-byte v3, v3, v0

    iget v4, p0, Lcom/jirbo/adcolony/x;->g:I

    xor-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    .line 102
    iget v2, p0, Lcom/jirbo/adcolony/x;->g:I

    iget v3, p0, Lcom/jirbo/adcolony/x;->h:I

    add-int/2addr v2, v3

    iput v2, p0, Lcom/jirbo/adcolony/x;->g:I

    .line 99
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 105
    :cond_1
    iput v1, p0, Lcom/jirbo/adcolony/x;->f:I

    .line 106
    return-void
.end method

.method public available()I
    .locals 2

    .prologue
    .line 27
    iget v0, p0, Lcom/jirbo/adcolony/x;->e:I

    iget v1, p0, Lcom/jirbo/adcolony/x;->f:I

    sub-int/2addr v0, v1

    iget-object v1, p0, Lcom/jirbo/adcolony/x;->a:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public close()V
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/jirbo/adcolony/x;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 33
    return-void
.end method

.method public mark(I)V
    .locals 0

    .prologue
    .line 37
    return-void
.end method

.method public markSupported()Z
    .locals 1

    .prologue
    .line 41
    const/4 v0, 0x0

    return v0
.end method

.method public read()I
    .locals 3

    .prologue
    .line 46
    iget v0, p0, Lcom/jirbo/adcolony/x;->d:I

    iget v1, p0, Lcom/jirbo/adcolony/x;->c:I

    if-ne v0, v1, :cond_0

    const/4 v0, -0x1

    .line 51
    :goto_0
    return v0

    .line 48
    :cond_0
    iget v0, p0, Lcom/jirbo/adcolony/x;->f:I

    iget v1, p0, Lcom/jirbo/adcolony/x;->e:I

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/jirbo/adcolony/x;->a()V

    .line 50
    :cond_1
    iget v0, p0, Lcom/jirbo/adcolony/x;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/jirbo/adcolony/x;->d:I

    .line 51
    iget-object v0, p0, Lcom/jirbo/adcolony/x;->b:[B

    iget v1, p0, Lcom/jirbo/adcolony/x;->f:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/jirbo/adcolony/x;->f:I

    aget-byte v0, v0, v1

    goto :goto_0
.end method

.method public read([B)I
    .locals 2

    .prologue
    .line 56
    const/4 v0, 0x0

    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lcom/jirbo/adcolony/x;->read([BII)I

    move-result v0

    return v0
.end method

.method public read([BII)I
    .locals 10

    .prologue
    const/4 v4, 0x0

    .line 61
    iget v0, p0, Lcom/jirbo/adcolony/x;->d:I

    iget v1, p0, Lcom/jirbo/adcolony/x;->c:I

    if-ne v0, v1, :cond_0

    const/4 v0, -0x1

    .line 78
    :goto_0
    return v0

    .line 63
    :cond_0
    iget v0, p0, Lcom/jirbo/adcolony/x;->c:I

    iget v1, p0, Lcom/jirbo/adcolony/x;->d:I

    sub-int/2addr v0, v1

    .line 64
    if-le p3, v0, :cond_1

    move p3, v0

    :cond_1
    move v2, v4

    move v1, p3

    move v3, p2

    .line 67
    :goto_1
    if-lez v1, :cond_5

    .line 69
    iget v0, p0, Lcom/jirbo/adcolony/x;->f:I

    iget v5, p0, Lcom/jirbo/adcolony/x;->e:I

    if-ne v0, v5, :cond_2

    invoke-virtual {p0}, Lcom/jirbo/adcolony/x;->a()V

    .line 71
    :cond_2
    iget v0, p0, Lcom/jirbo/adcolony/x;->e:I

    if-ge v1, v0, :cond_3

    move v0, v1

    :goto_2
    move v5, v3

    move v3, v4

    .line 72
    :goto_3
    if-ge v3, v0, :cond_4

    add-int/lit8 v6, v5, 0x1

    iget-object v7, p0, Lcom/jirbo/adcolony/x;->b:[B

    iget v8, p0, Lcom/jirbo/adcolony/x;->f:I

    add-int/lit8 v9, v8, 0x1

    iput v9, p0, Lcom/jirbo/adcolony/x;->f:I

    aget-byte v7, v7, v8

    aput-byte v7, p1, v5

    add-int/lit8 v3, v3, 0x1

    move v5, v6

    goto :goto_3

    .line 71
    :cond_3
    iget v0, p0, Lcom/jirbo/adcolony/x;->e:I

    goto :goto_2

    .line 73
    :cond_4
    sub-int/2addr v1, v0

    .line 74
    add-int/2addr v2, v0

    .line 75
    iget v3, p0, Lcom/jirbo/adcolony/x;->d:I

    add-int/2addr v0, v3

    iput v0, p0, Lcom/jirbo/adcolony/x;->d:I

    move v3, v5

    .line 76
    goto :goto_1

    :cond_5
    move v0, v2

    .line 78
    goto :goto_0
.end method

.method public reset()V
    .locals 2

    .prologue
    .line 83
    new-instance v0, Ljava/io/IOException;

    const-string v1, "ADCStreamReader does not support reset()."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public skip(J)J
    .locals 2

    .prologue
    .line 88
    new-instance v0, Ljava/io/IOException;

    const-string v1, "ADCStreamReader does not support skip()."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
