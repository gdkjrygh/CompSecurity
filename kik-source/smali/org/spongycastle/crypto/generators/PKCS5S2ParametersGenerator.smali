.class public Lorg/spongycastle/crypto/generators/PKCS5S2ParametersGenerator;
.super Lorg/spongycastle/crypto/PBEParametersGenerator;
.source "SourceFile"


# instance fields
.field private d:Lorg/spongycastle/crypto/Mac;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 30
    new-instance v0, Lorg/spongycastle/crypto/digests/SHA1Digest;

    invoke-direct {v0}, Lorg/spongycastle/crypto/digests/SHA1Digest;-><init>()V

    invoke-direct {p0, v0}, Lorg/spongycastle/crypto/generators/PKCS5S2ParametersGenerator;-><init>(Lorg/spongycastle/crypto/Digest;)V

    .line 31
    return-void
.end method

.method private constructor <init>(Lorg/spongycastle/crypto/Digest;)V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Lorg/spongycastle/crypto/PBEParametersGenerator;-><init>()V

    .line 35
    new-instance v0, Lorg/spongycastle/crypto/macs/HMac;

    invoke-direct {v0, p1}, Lorg/spongycastle/crypto/macs/HMac;-><init>(Lorg/spongycastle/crypto/Digest;)V

    iput-object v0, p0, Lorg/spongycastle/crypto/generators/PKCS5S2ParametersGenerator;->d:Lorg/spongycastle/crypto/Mac;

    .line 36
    return-void
.end method

.method private c(I)[B
    .locals 14

    .prologue
    .line 93
    iget-object v0, p0, Lorg/spongycastle/crypto/generators/PKCS5S2ParametersGenerator;->d:Lorg/spongycastle/crypto/Mac;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Mac;->a()I

    move-result v3

    .line 94
    add-int v0, p1, v3

    add-int/lit8 v0, v0, -0x1

    div-int v4, v0, v3

    .line 95
    const/4 v0, 0x4

    new-array v5, v0, [B

    .line 96
    mul-int v0, v4, v3

    new-array v6, v0, [B

    .line 98
    const/4 v0, 0x1

    move v2, v0

    :goto_0
    if-gt v2, v4, :cond_4

    .line 100
    const/4 v0, 0x0

    ushr-int/lit8 v1, v2, 0x18

    int-to-byte v1, v1

    aput-byte v1, v5, v0

    const/4 v0, 0x1

    ushr-int/lit8 v1, v2, 0x10

    int-to-byte v1, v1

    aput-byte v1, v5, v0

    const/4 v0, 0x2

    ushr-int/lit8 v1, v2, 0x8

    int-to-byte v1, v1

    aput-byte v1, v5, v0

    const/4 v0, 0x3

    int-to-byte v1, v2

    aput-byte v1, v5, v0

    .line 102
    iget-object v0, p0, Lorg/spongycastle/crypto/generators/PKCS5S2ParametersGenerator;->a:[B

    iget-object v1, p0, Lorg/spongycastle/crypto/generators/PKCS5S2ParametersGenerator;->b:[B

    iget v7, p0, Lorg/spongycastle/crypto/generators/PKCS5S2ParametersGenerator;->c:I

    add-int/lit8 v8, v2, -0x1

    mul-int/2addr v8, v3

    iget-object v9, p0, Lorg/spongycastle/crypto/generators/PKCS5S2ParametersGenerator;->d:Lorg/spongycastle/crypto/Mac;

    invoke-interface {v9}, Lorg/spongycastle/crypto/Mac;->a()I

    move-result v9

    new-array v9, v9, [B

    new-instance v10, Lorg/spongycastle/crypto/params/KeyParameter;

    invoke-direct {v10, v0}, Lorg/spongycastle/crypto/params/KeyParameter;-><init>([B)V

    iget-object v0, p0, Lorg/spongycastle/crypto/generators/PKCS5S2ParametersGenerator;->d:Lorg/spongycastle/crypto/Mac;

    invoke-interface {v0, v10}, Lorg/spongycastle/crypto/Mac;->a(Lorg/spongycastle/crypto/CipherParameters;)V

    if-eqz v1, :cond_0

    iget-object v0, p0, Lorg/spongycastle/crypto/generators/PKCS5S2ParametersGenerator;->d:Lorg/spongycastle/crypto/Mac;

    const/4 v11, 0x0

    array-length v12, v1

    invoke-interface {v0, v1, v11, v12}, Lorg/spongycastle/crypto/Mac;->a([BII)V

    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/generators/PKCS5S2ParametersGenerator;->d:Lorg/spongycastle/crypto/Mac;

    const/4 v1, 0x0

    const/4 v11, 0x4

    invoke-interface {v0, v5, v1, v11}, Lorg/spongycastle/crypto/Mac;->a([BII)V

    iget-object v0, p0, Lorg/spongycastle/crypto/generators/PKCS5S2ParametersGenerator;->d:Lorg/spongycastle/crypto/Mac;

    const/4 v1, 0x0

    invoke-interface {v0, v9, v1}, Lorg/spongycastle/crypto/Mac;->a([BI)I

    const/4 v0, 0x0

    array-length v1, v9

    invoke-static {v9, v0, v6, v8, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-nez v7, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "iteration count must be at least 1."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 v0, 0x1

    move v1, v0

    :goto_1
    if-ge v1, v7, :cond_3

    iget-object v0, p0, Lorg/spongycastle/crypto/generators/PKCS5S2ParametersGenerator;->d:Lorg/spongycastle/crypto/Mac;

    invoke-interface {v0, v10}, Lorg/spongycastle/crypto/Mac;->a(Lorg/spongycastle/crypto/CipherParameters;)V

    iget-object v0, p0, Lorg/spongycastle/crypto/generators/PKCS5S2ParametersGenerator;->d:Lorg/spongycastle/crypto/Mac;

    const/4 v11, 0x0

    array-length v12, v9

    invoke-interface {v0, v9, v11, v12}, Lorg/spongycastle/crypto/Mac;->a([BII)V

    iget-object v0, p0, Lorg/spongycastle/crypto/generators/PKCS5S2ParametersGenerator;->d:Lorg/spongycastle/crypto/Mac;

    const/4 v11, 0x0

    invoke-interface {v0, v9, v11}, Lorg/spongycastle/crypto/Mac;->a([BI)I

    const/4 v0, 0x0

    :goto_2
    array-length v11, v9

    if-eq v0, v11, :cond_2

    add-int v11, v8, v0

    aget-byte v12, v6, v11

    aget-byte v13, v9, v0

    xor-int/2addr v12, v13

    int-to-byte v12, v12

    aput-byte v12, v6, v11

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 98
    :cond_3
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto/16 :goto_0

    .line 105
    :cond_4
    return-object v6
.end method


# virtual methods
.method public final a(I)Lorg/spongycastle/crypto/CipherParameters;
    .locals 4

    .prologue
    .line 118
    div-int/lit8 v0, p1, 0x8

    .line 120
    invoke-direct {p0, v0}, Lorg/spongycastle/crypto/generators/PKCS5S2ParametersGenerator;->c(I)[B

    move-result-object v1

    .line 122
    new-instance v2, Lorg/spongycastle/crypto/params/KeyParameter;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3, v0}, Lorg/spongycastle/crypto/params/KeyParameter;-><init>([BII)V

    return-object v2
.end method

.method public final a(II)Lorg/spongycastle/crypto/CipherParameters;
    .locals 6

    .prologue
    .line 138
    div-int/lit8 v0, p1, 0x8

    .line 139
    div-int/lit8 v1, p2, 0x8

    .line 141
    add-int v2, v0, v1

    invoke-direct {p0, v2}, Lorg/spongycastle/crypto/generators/PKCS5S2ParametersGenerator;->c(I)[B

    move-result-object v2

    .line 143
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
    .line 156
    invoke-virtual {p0, p1}, Lorg/spongycastle/crypto/generators/PKCS5S2ParametersGenerator;->a(I)Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    return-object v0
.end method
