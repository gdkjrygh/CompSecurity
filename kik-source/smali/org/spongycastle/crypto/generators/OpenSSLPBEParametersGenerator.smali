.class public Lorg/spongycastle/crypto/generators/OpenSSLPBEParametersGenerator;
.super Lorg/spongycastle/crypto/PBEParametersGenerator;
.source "SourceFile"


# instance fields
.field private d:Lorg/spongycastle/crypto/Digest;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0}, Lorg/spongycastle/crypto/PBEParametersGenerator;-><init>()V

    .line 20
    new-instance v0, Lorg/spongycastle/crypto/digests/MD5Digest;

    invoke-direct {v0}, Lorg/spongycastle/crypto/digests/MD5Digest;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/crypto/generators/OpenSSLPBEParametersGenerator;->d:Lorg/spongycastle/crypto/Digest;

    .line 27
    return-void
.end method

.method private c(I)[B
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 48
    iget-object v0, p0, Lorg/spongycastle/crypto/generators/OpenSSLPBEParametersGenerator;->d:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v0

    new-array v3, v0, [B

    .line 49
    new-array v4, p1, [B

    move v0, v1

    .line 54
    :goto_0
    iget-object v2, p0, Lorg/spongycastle/crypto/generators/OpenSSLPBEParametersGenerator;->d:Lorg/spongycastle/crypto/Digest;

    iget-object v5, p0, Lorg/spongycastle/crypto/generators/OpenSSLPBEParametersGenerator;->a:[B

    iget-object v6, p0, Lorg/spongycastle/crypto/generators/OpenSSLPBEParametersGenerator;->a:[B

    array-length v6, v6

    invoke-interface {v2, v5, v1, v6}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 55
    iget-object v2, p0, Lorg/spongycastle/crypto/generators/OpenSSLPBEParametersGenerator;->d:Lorg/spongycastle/crypto/Digest;

    iget-object v5, p0, Lorg/spongycastle/crypto/generators/OpenSSLPBEParametersGenerator;->b:[B

    iget-object v6, p0, Lorg/spongycastle/crypto/generators/OpenSSLPBEParametersGenerator;->b:[B

    array-length v6, v6

    invoke-interface {v2, v5, v1, v6}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 57
    iget-object v2, p0, Lorg/spongycastle/crypto/generators/OpenSSLPBEParametersGenerator;->d:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v2, v3, v1}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 59
    array-length v2, v3

    if-le p1, v2, :cond_0

    array-length v2, v3

    .line 60
    :goto_1
    invoke-static {v3, v1, v4, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 61
    add-int/2addr v0, v2

    .line 64
    sub-int/2addr p1, v2

    .line 65
    if-eqz p1, :cond_1

    .line 67
    iget-object v2, p0, Lorg/spongycastle/crypto/generators/OpenSSLPBEParametersGenerator;->d:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v2}, Lorg/spongycastle/crypto/Digest;->c()V

    .line 72
    iget-object v2, p0, Lorg/spongycastle/crypto/generators/OpenSSLPBEParametersGenerator;->d:Lorg/spongycastle/crypto/Digest;

    array-length v5, v3

    invoke-interface {v2, v3, v1, v5}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    goto :goto_0

    :cond_0
    move v2, p1

    .line 59
    goto :goto_1

    .line 75
    :cond_1
    return-object v4
.end method


# virtual methods
.method public final a(I)Lorg/spongycastle/crypto/CipherParameters;
    .locals 4

    .prologue
    .line 89
    div-int/lit8 v0, p1, 0x8

    .line 91
    invoke-direct {p0, v0}, Lorg/spongycastle/crypto/generators/OpenSSLPBEParametersGenerator;->c(I)[B

    move-result-object v1

    .line 93
    new-instance v2, Lorg/spongycastle/crypto/params/KeyParameter;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3, v0}, Lorg/spongycastle/crypto/params/KeyParameter;-><init>([BII)V

    return-object v2
.end method

.method public final a(II)Lorg/spongycastle/crypto/CipherParameters;
    .locals 6

    .prologue
    .line 110
    div-int/lit8 v0, p1, 0x8

    .line 111
    div-int/lit8 v1, p2, 0x8

    .line 113
    add-int v2, v0, v1

    invoke-direct {p0, v2}, Lorg/spongycastle/crypto/generators/OpenSSLPBEParametersGenerator;->c(I)[B

    move-result-object v2

    .line 115
    new-instance v3, Lorg/spongycastle/crypto/params/ParametersWithIV;

    new-instance v4, Lorg/spongycastle/crypto/params/KeyParameter;

    const/4 v5, 0x0

    invoke-direct {v4, v2, v5, v0}, Lorg/spongycastle/crypto/params/KeyParameter;-><init>([BII)V

    invoke-direct {v3, v4, v2, v0, v1}, Lorg/spongycastle/crypto/params/ParametersWithIV;-><init>(Lorg/spongycastle/crypto/CipherParameters;[BII)V

    return-object v3
.end method

.method public final b(I)Lorg/spongycastle/crypto/CipherParameters;
    .locals 1

    .prologue
    .line 129
    invoke-virtual {p0, p1}, Lorg/spongycastle/crypto/generators/OpenSSLPBEParametersGenerator;->a(I)Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    return-object v0
.end method
