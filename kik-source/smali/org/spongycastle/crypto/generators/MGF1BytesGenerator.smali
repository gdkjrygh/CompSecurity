.class public Lorg/spongycastle/crypto/generators/MGF1BytesGenerator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/DerivationFunction;


# instance fields
.field private a:Lorg/spongycastle/crypto/Digest;

.field private b:[B

.field private c:I


# direct methods
.method private static a(I[B)V
    .locals 2

    .prologue
    .line 57
    const/4 v0, 0x0

    ushr-int/lit8 v1, p0, 0x18

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 58
    const/4 v0, 0x1

    ushr-int/lit8 v1, p0, 0x10

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 59
    const/4 v0, 0x2

    ushr-int/lit8 v1, p0, 0x8

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 60
    const/4 v0, 0x3

    ushr-int/lit8 v1, p0, 0x0

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 61
    return-void
.end method


# virtual methods
.method public final a([BII)I
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v1, 0x0

    .line 75
    array-length v0, p1

    sub-int/2addr v0, p3

    if-ge v0, p2, :cond_0

    .line 77
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "output buffer too small"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 80
    :cond_0
    iget v0, p0, Lorg/spongycastle/crypto/generators/MGF1BytesGenerator;->c:I

    new-array v2, v0, [B

    .line 81
    new-array v3, v7, [B

    .line 84
    iget-object v0, p0, Lorg/spongycastle/crypto/generators/MGF1BytesGenerator;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->c()V

    .line 86
    iget v0, p0, Lorg/spongycastle/crypto/generators/MGF1BytesGenerator;->c:I

    if-le p3, v0, :cond_3

    move v0, v1

    .line 90
    :cond_1
    invoke-static {v0, v3}, Lorg/spongycastle/crypto/generators/MGF1BytesGenerator;->a(I[B)V

    .line 92
    iget-object v4, p0, Lorg/spongycastle/crypto/generators/MGF1BytesGenerator;->a:Lorg/spongycastle/crypto/Digest;

    iget-object v5, p0, Lorg/spongycastle/crypto/generators/MGF1BytesGenerator;->b:[B

    iget-object v6, p0, Lorg/spongycastle/crypto/generators/MGF1BytesGenerator;->b:[B

    array-length v6, v6

    invoke-interface {v4, v5, v1, v6}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 93
    iget-object v4, p0, Lorg/spongycastle/crypto/generators/MGF1BytesGenerator;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v4, v3, v1, v7}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 94
    iget-object v4, p0, Lorg/spongycastle/crypto/generators/MGF1BytesGenerator;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v4, v2, v1}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 96
    iget v4, p0, Lorg/spongycastle/crypto/generators/MGF1BytesGenerator;->c:I

    mul-int/2addr v4, v0

    add-int/2addr v4, p2

    iget v5, p0, Lorg/spongycastle/crypto/generators/MGF1BytesGenerator;->c:I

    invoke-static {v2, v1, p1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 98
    add-int/lit8 v0, v0, 0x1

    iget v4, p0, Lorg/spongycastle/crypto/generators/MGF1BytesGenerator;->c:I

    div-int v4, p3, v4

    if-lt v0, v4, :cond_1

    .line 101
    :goto_0
    iget v4, p0, Lorg/spongycastle/crypto/generators/MGF1BytesGenerator;->c:I

    mul-int/2addr v4, v0

    if-ge v4, p3, :cond_2

    .line 103
    invoke-static {v0, v3}, Lorg/spongycastle/crypto/generators/MGF1BytesGenerator;->a(I[B)V

    .line 105
    iget-object v4, p0, Lorg/spongycastle/crypto/generators/MGF1BytesGenerator;->a:Lorg/spongycastle/crypto/Digest;

    iget-object v5, p0, Lorg/spongycastle/crypto/generators/MGF1BytesGenerator;->b:[B

    iget-object v6, p0, Lorg/spongycastle/crypto/generators/MGF1BytesGenerator;->b:[B

    array-length v6, v6

    invoke-interface {v4, v5, v1, v6}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 106
    iget-object v4, p0, Lorg/spongycastle/crypto/generators/MGF1BytesGenerator;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v4, v3, v1, v7}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 107
    iget-object v3, p0, Lorg/spongycastle/crypto/generators/MGF1BytesGenerator;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v3, v2, v1}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 109
    iget v3, p0, Lorg/spongycastle/crypto/generators/MGF1BytesGenerator;->c:I

    mul-int/2addr v3, v0

    add-int/2addr v3, p2

    iget v4, p0, Lorg/spongycastle/crypto/generators/MGF1BytesGenerator;->c:I

    mul-int/2addr v0, v4

    sub-int v0, p3, v0

    invoke-static {v2, v1, p1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 112
    :cond_2
    return p3

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public final a(Lorg/spongycastle/crypto/DerivationParameters;)V
    .locals 2

    .prologue
    .line 32
    instance-of v0, p1, Lorg/spongycastle/crypto/params/MGFParameters;

    if-nez v0, :cond_0

    .line 34
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "MGF parameters required for MGF1Generator"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 37
    :cond_0
    check-cast p1, Lorg/spongycastle/crypto/params/MGFParameters;

    .line 39
    invoke-virtual {p1}, Lorg/spongycastle/crypto/params/MGFParameters;->a()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/generators/MGF1BytesGenerator;->b:[B

    .line 40
    return-void
.end method
