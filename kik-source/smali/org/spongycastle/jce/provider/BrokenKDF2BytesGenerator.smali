.class public Lorg/spongycastle/jce/provider/BrokenKDF2BytesGenerator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/DerivationFunction;


# instance fields
.field private a:Lorg/spongycastle/crypto/Digest;

.field private b:[B

.field private c:[B


# direct methods
.method public constructor <init>(Lorg/spongycastle/crypto/Digest;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lorg/spongycastle/jce/provider/BrokenKDF2BytesGenerator;->a:Lorg/spongycastle/crypto/Digest;

    .line 38
    return-void
.end method


# virtual methods
.method public final a([BII)I
    .locals 8

    .prologue
    const/4 v7, 0x0

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
    mul-int/lit8 v0, p3, 0x8

    int-to-long v0, v0

    .line 88
    iget-object v2, p0, Lorg/spongycastle/jce/provider/BrokenKDF2BytesGenerator;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v2}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v2

    mul-int/lit8 v2, v2, 0x8

    int-to-long v2, v2

    const-wide/16 v4, 0x1d

    mul-long/2addr v2, v4

    cmp-long v2, v0, v2

    if-lez v2, :cond_1

    .line 90
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "Output length to large"

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 93
    :cond_1
    iget-object v2, p0, Lorg/spongycastle/jce/provider/BrokenKDF2BytesGenerator;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v2}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v2

    int-to-long v2, v2

    div-long/2addr v0, v2

    long-to-int v2, v0

    .line 95
    iget-object v0, p0, Lorg/spongycastle/jce/provider/BrokenKDF2BytesGenerator;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v0

    new-array v3, v0, [B

    .line 99
    const/4 v0, 0x1

    move v1, v0

    move v0, p2

    :goto_0
    if-gt v1, v2, :cond_3

    .line 101
    iget-object v4, p0, Lorg/spongycastle/jce/provider/BrokenKDF2BytesGenerator;->a:Lorg/spongycastle/crypto/Digest;

    iget-object v5, p0, Lorg/spongycastle/jce/provider/BrokenKDF2BytesGenerator;->b:[B

    iget-object v6, p0, Lorg/spongycastle/jce/provider/BrokenKDF2BytesGenerator;->b:[B

    array-length v6, v6

    invoke-interface {v4, v5, v7, v6}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 103
    iget-object v4, p0, Lorg/spongycastle/jce/provider/BrokenKDF2BytesGenerator;->a:Lorg/spongycastle/crypto/Digest;

    and-int/lit16 v5, v1, 0xff

    int-to-byte v5, v5

    invoke-interface {v4, v5}, Lorg/spongycastle/crypto/Digest;->a(B)V

    .line 104
    iget-object v4, p0, Lorg/spongycastle/jce/provider/BrokenKDF2BytesGenerator;->a:Lorg/spongycastle/crypto/Digest;

    shr-int/lit8 v5, v1, 0x8

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    invoke-interface {v4, v5}, Lorg/spongycastle/crypto/Digest;->a(B)V

    .line 105
    iget-object v4, p0, Lorg/spongycastle/jce/provider/BrokenKDF2BytesGenerator;->a:Lorg/spongycastle/crypto/Digest;

    shr-int/lit8 v5, v1, 0x10

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    invoke-interface {v4, v5}, Lorg/spongycastle/crypto/Digest;->a(B)V

    .line 106
    iget-object v4, p0, Lorg/spongycastle/jce/provider/BrokenKDF2BytesGenerator;->a:Lorg/spongycastle/crypto/Digest;

    shr-int/lit8 v5, v1, 0x18

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    invoke-interface {v4, v5}, Lorg/spongycastle/crypto/Digest;->a(B)V

    .line 108
    iget-object v4, p0, Lorg/spongycastle/jce/provider/BrokenKDF2BytesGenerator;->a:Lorg/spongycastle/crypto/Digest;

    iget-object v5, p0, Lorg/spongycastle/jce/provider/BrokenKDF2BytesGenerator;->c:[B

    iget-object v6, p0, Lorg/spongycastle/jce/provider/BrokenKDF2BytesGenerator;->c:[B

    array-length v6, v6

    invoke-interface {v4, v5, v7, v6}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 110
    iget-object v4, p0, Lorg/spongycastle/jce/provider/BrokenKDF2BytesGenerator;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v4, v3, v7}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 112
    sub-int v4, p3, v0

    array-length v5, v3

    if-le v4, v5, :cond_2

    .line 114
    array-length v4, v3

    invoke-static {v3, v7, p1, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 115
    array-length v4, v3

    add-int/2addr v0, v4

    .line 99
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 119
    :cond_2
    sub-int v4, p3, v0

    invoke-static {v3, v7, p1, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    .line 123
    :cond_3
    iget-object v0, p0, Lorg/spongycastle/jce/provider/BrokenKDF2BytesGenerator;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->c()V

    .line 125
    return p3
.end method

.method public final a(Lorg/spongycastle/crypto/DerivationParameters;)V
    .locals 2

    .prologue
    .line 43
    instance-of v0, p1, Lorg/spongycastle/crypto/params/KDFParameters;

    if-nez v0, :cond_0

    .line 45
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "KDF parameters required for KDF2Generator"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 48
    :cond_0
    check-cast p1, Lorg/spongycastle/crypto/params/KDFParameters;

    .line 50
    invoke-virtual {p1}, Lorg/spongycastle/crypto/params/KDFParameters;->a()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/BrokenKDF2BytesGenerator;->b:[B

    .line 51
    invoke-virtual {p1}, Lorg/spongycastle/crypto/params/KDFParameters;->b()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/BrokenKDF2BytesGenerator;->c:[B

    .line 52
    return-void
.end method
