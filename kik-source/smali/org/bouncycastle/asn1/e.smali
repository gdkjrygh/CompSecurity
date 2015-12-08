.class final Lorg/bouncycastle/asn1/e;
.super Lorg/bouncycastle/asn1/g;


# instance fields
.field private b:I

.field private c:I

.field private d:Z

.field private e:Z


# direct methods
.method constructor <init>(Ljava/io/InputStream;I)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lorg/bouncycastle/asn1/g;-><init>(Ljava/io/InputStream;I)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/bouncycastle/asn1/e;->d:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/asn1/e;->e:Z

    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/asn1/e;->b:I

    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/asn1/e;->c:I

    iget v0, p0, Lorg/bouncycastle/asn1/e;->c:I

    if-gez v0, :cond_0

    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    :cond_0
    invoke-direct {p0}, Lorg/bouncycastle/asn1/e;->b()Z

    return-void
.end method

.method private b()Z
    .locals 1

    iget-boolean v0, p0, Lorg/bouncycastle/asn1/e;->d:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lorg/bouncycastle/asn1/e;->e:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/bouncycastle/asn1/e;->b:I

    if-nez v0, :cond_0

    iget v0, p0, Lorg/bouncycastle/asn1/e;->c:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/asn1/e;->d:Z

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/e;->c()V

    :cond_0
    iget-boolean v0, p0, Lorg/bouncycastle/asn1/e;->d:Z

    return v0
.end method


# virtual methods
.method final a(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/bouncycastle/asn1/e;->e:Z

    invoke-direct {p0}, Lorg/bouncycastle/asn1/e;->b()Z

    return-void
.end method

.method public final read()I
    .locals 3

    invoke-direct {p0}, Lorg/bouncycastle/asn1/e;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/asn1/e;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v1

    if-gez v1, :cond_1

    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    :cond_1
    iget v0, p0, Lorg/bouncycastle/asn1/e;->b:I

    iget v2, p0, Lorg/bouncycastle/asn1/e;->c:I

    iput v2, p0, Lorg/bouncycastle/asn1/e;->b:I

    iput v1, p0, Lorg/bouncycastle/asn1/e;->c:I

    goto :goto_0
.end method

.method public final read([BII)I
    .locals 3

    iget-boolean v0, p0, Lorg/bouncycastle/asn1/e;->e:Z

    if-nez v0, :cond_0

    const/4 v0, 0x3

    if-ge p3, v0, :cond_1

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lorg/bouncycastle/asn1/g;->read([BII)I

    move-result v0

    :goto_0
    return v0

    :cond_1
    iget-boolean v0, p0, Lorg/bouncycastle/asn1/e;->d:Z

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lorg/bouncycastle/asn1/e;->a:Ljava/io/InputStream;

    add-int/lit8 v1, p2, 0x2

    add-int/lit8 v2, p3, -0x2

    invoke-virtual {v0, p1, v1, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    if-gez v0, :cond_3

    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    :cond_3
    iget v1, p0, Lorg/bouncycastle/asn1/e;->b:I

    int-to-byte v1, v1

    aput-byte v1, p1, p2

    add-int/lit8 v1, p2, 0x1

    iget v2, p0, Lorg/bouncycastle/asn1/e;->c:I

    int-to-byte v2, v2

    aput-byte v2, p1, v1

    iget-object v1, p0, Lorg/bouncycastle/asn1/e;->a:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    move-result v1

    iput v1, p0, Lorg/bouncycastle/asn1/e;->b:I

    iget-object v1, p0, Lorg/bouncycastle/asn1/e;->a:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    move-result v1

    iput v1, p0, Lorg/bouncycastle/asn1/e;->c:I

    iget v1, p0, Lorg/bouncycastle/asn1/e;->c:I

    if-gez v1, :cond_4

    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    :cond_4
    add-int/lit8 v0, v0, 0x2

    goto :goto_0
.end method
