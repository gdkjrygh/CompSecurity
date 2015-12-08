.class public Lorg/spongycastle/crypto/generators/DSAParametersGenerator;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:Ljava/math/BigInteger;

.field private static final f:Ljava/math/BigInteger;

.field private static final g:Ljava/math/BigInteger;


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:Ljava/security/SecureRandom;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 24
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->e:Ljava/math/BigInteger;

    .line 25
    const-wide/16 v0, 0x1

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->f:Ljava/math/BigInteger;

    .line 26
    const-wide/16 v0, 0x2

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->g:Ljava/math/BigInteger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/security/SecureRandom;)Ljava/math/BigInteger;
    .locals 5

    .prologue
    .line 147
    sget-object v0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->f:Ljava/math/BigInteger;

    invoke-virtual {p0, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 148
    sget-object v1, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->g:Ljava/math/BigInteger;

    invoke-virtual {p0, v1}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    .line 152
    :cond_0
    sget-object v2, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->g:Ljava/math/BigInteger;

    invoke-static {v2, v1, p2}, Lorg/spongycastle/util/BigIntegers;->a(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/security/SecureRandom;)Ljava/math/BigInteger;

    move-result-object v2

    .line 153
    invoke-virtual {v2, v0, p0}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    .line 154
    invoke-virtual {v2}, Ljava/math/BigInteger;->bitLength()I

    move-result v3

    const/4 v4, 0x1

    if-le v3, v4, :cond_0

    .line 156
    return-object v2
.end method

.method private static a(Lorg/spongycastle/crypto/Digest;[B[B)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 315
    array-length v0, p1

    invoke-interface {p0, p1, v1, v0}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 316
    invoke-interface {p0, p2, v1}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 317
    return-void
.end method

.method private static a([B)V
    .locals 2

    .prologue
    .line 326
    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    .line 328
    aget-byte v1, p0, v0

    add-int/lit8 v1, v1, 0x1

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    .line 329
    aput-byte v1, p0, v0

    .line 331
    if-nez v1, :cond_0

    .line 333
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 336
    :cond_0
    return-void
.end method

.method private b()Lorg/spongycastle/crypto/params/DSAParameters;
    .locals 14

    .prologue
    .line 74
    const/16 v0, 0x14

    new-array v2, v0, [B

    .line 75
    const/16 v0, 0x14

    new-array v3, v0, [B

    .line 76
    const/16 v0, 0x14

    new-array v4, v0, [B

    .line 77
    const/16 v0, 0x14

    new-array v5, v0, [B

    .line 78
    new-instance v6, Lorg/spongycastle/crypto/digests/SHA1Digest;

    invoke-direct {v6}, Lorg/spongycastle/crypto/digests/SHA1Digest;-><init>()V

    .line 79
    iget v0, p0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->a:I

    add-int/lit8 v0, v0, -0x1

    div-int/lit16 v7, v0, 0xa0

    .line 80
    iget v0, p0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->a:I

    div-int/lit8 v0, v0, 0x8

    new-array v8, v0, [B

    .line 84
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->d:Ljava/security/SecureRandom;

    invoke-virtual {v0, v2}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 86
    invoke-static {v6, v2, v3}, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->a(Lorg/spongycastle/crypto/Digest;[B[B)V

    .line 87
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/16 v9, 0x14

    invoke-static {v2, v0, v4, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 88
    invoke-static {v4}, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->a([B)V

    .line 89
    invoke-static {v6, v4, v4}, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->a(Lorg/spongycastle/crypto/Digest;[B[B)V

    .line 91
    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x14

    if-eq v0, v1, :cond_1

    .line 93
    aget-byte v1, v3, v0

    aget-byte v9, v4, v0

    xor-int/2addr v1, v9

    int-to-byte v1, v1

    aput-byte v1, v5, v0

    .line 91
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 96
    :cond_1
    const/4 v0, 0x0

    aget-byte v1, v5, v0

    or-int/lit8 v1, v1, -0x80

    int-to-byte v1, v1

    aput-byte v1, v5, v0

    .line 97
    const/16 v0, 0x13

    aget-byte v1, v5, v0

    or-int/lit8 v1, v1, 0x1

    int-to-byte v1, v1

    aput-byte v1, v5, v0

    .line 99
    new-instance v9, Ljava/math/BigInteger;

    const/4 v0, 0x1

    invoke-direct {v9, v0, v5}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 101
    iget v0, p0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->c:I

    invoke-virtual {v9, v0}, Ljava/math/BigInteger;->isProbablePrime(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 103
    invoke-static {v2}, Lorg/spongycastle/util/Arrays;->b([B)[B

    move-result-object v10

    .line 107
    invoke-static {v10}, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->a([B)V

    .line 109
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    const/16 v0, 0x1000

    if-ge v1, v0, :cond_0

    .line 111
    const/4 v0, 0x0

    :goto_2
    if-ge v0, v7, :cond_2

    .line 113
    invoke-static {v10}, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->a([B)V

    .line 114
    invoke-static {v6, v10, v3}, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->a(Lorg/spongycastle/crypto/Digest;[B[B)V

    .line 115
    const/4 v11, 0x0

    array-length v12, v8

    add-int/lit8 v13, v0, 0x1

    mul-int/lit8 v13, v13, 0x14

    sub-int/2addr v12, v13

    const/16 v13, 0x14

    invoke-static {v3, v11, v8, v12, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 111
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 118
    :cond_2
    invoke-static {v10}, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->a([B)V

    .line 119
    invoke-static {v6, v10, v3}, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->a(Lorg/spongycastle/crypto/Digest;[B[B)V

    .line 120
    array-length v0, v8

    mul-int/lit8 v11, v7, 0x14

    sub-int/2addr v0, v11

    rsub-int/lit8 v0, v0, 0x14

    const/4 v11, 0x0

    array-length v12, v8

    mul-int/lit8 v13, v7, 0x14

    sub-int/2addr v12, v13

    invoke-static {v3, v0, v8, v11, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 122
    const/4 v0, 0x0

    aget-byte v11, v8, v0

    or-int/lit8 v11, v11, -0x80

    int-to-byte v11, v11

    aput-byte v11, v8, v0

    .line 124
    new-instance v0, Ljava/math/BigInteger;

    const/4 v11, 0x1

    invoke-direct {v0, v11, v8}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 126
    const/4 v11, 0x1

    invoke-virtual {v9, v11}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v11

    invoke-virtual {v0, v11}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v11

    .line 128
    sget-object v12, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->f:Ljava/math/BigInteger;

    invoke-virtual {v11, v12}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v11

    invoke-virtual {v0, v11}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 130
    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v11

    iget v12, p0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->a:I

    if-ne v11, v12, :cond_3

    .line 132
    iget v11, p0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->c:I

    invoke-virtual {v0, v11}, Ljava/math/BigInteger;->isProbablePrime(I)Z

    move-result v11

    if-eqz v11, :cond_3

    .line 137
    iget-object v3, p0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->d:Ljava/security/SecureRandom;

    invoke-static {v0, v9, v3}, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->a(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/security/SecureRandom;)Ljava/math/BigInteger;

    move-result-object v3

    .line 139
    new-instance v4, Lorg/spongycastle/crypto/params/DSAParameters;

    new-instance v5, Lorg/spongycastle/crypto/params/DSAValidationParameters;

    invoke-direct {v5, v2, v1}, Lorg/spongycastle/crypto/params/DSAValidationParameters;-><init>([BI)V

    invoke-direct {v4, v0, v9, v3, v5}, Lorg/spongycastle/crypto/params/DSAParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Lorg/spongycastle/crypto/params/DSAValidationParameters;)V

    return-object v4

    .line 109
    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1
.end method


# virtual methods
.method public final a()Lorg/spongycastle/crypto/params/DSAParameters;
    .locals 15

    .prologue
    .line 67
    iget v0, p0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->a:I

    const/16 v1, 0x400

    if-le v0, v1, :cond_4

    new-instance v5, Lorg/spongycastle/crypto/digests/SHA256Digest;

    invoke-direct {v5}, Lorg/spongycastle/crypto/digests/SHA256Digest;-><init>()V

    invoke-interface {v5}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v0

    mul-int/lit8 v6, v0, 0x8

    iget v0, p0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->b:I

    div-int/lit8 v0, v0, 0x8

    new-array v7, v0, [B

    iget v0, p0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->a:I

    add-int/lit8 v0, v0, -0x1

    div-int v8, v0, v6

    iget v0, p0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->a:I

    add-int/lit8 v0, v0, -0x1

    rem-int v9, v0, v6

    invoke-interface {v5}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v0

    new-array v10, v0, [B

    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->d:Ljava/security/SecureRandom;

    invoke-virtual {v0, v7}, Ljava/security/SecureRandom;->nextBytes([B)V

    invoke-static {v5, v7, v10}, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->a(Lorg/spongycastle/crypto/Digest;[B[B)V

    new-instance v0, Ljava/math/BigInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1, v10}, Ljava/math/BigInteger;-><init>(I[B)V

    sget-object v1, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->f:Ljava/math/BigInteger;

    iget v2, p0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->b:I

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    sget-object v1, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->f:Ljava/math/BigInteger;

    iget v2, p0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->b:I

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    sget-object v2, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->f:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    sget-object v2, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->g:Ljava/math/BigInteger;

    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v11

    iget v0, p0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->c:I

    invoke-virtual {v11, v0}, Ljava/math/BigInteger;->isProbablePrime(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v7}, Lorg/spongycastle/util/Arrays;->b([B)[B

    move-result-object v12

    iget v0, p0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->a:I

    mul-int/lit8 v13, v0, 0x4

    const/4 v0, 0x0

    move v4, v0

    :goto_0
    if-ge v4, v13, :cond_0

    sget-object v2, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->e:Ljava/math/BigInteger;

    const/4 v1, 0x0

    const/4 v0, 0x0

    move-object v3, v2

    move v2, v1

    move v1, v0

    :goto_1
    if-gt v2, v8, :cond_2

    invoke-static {v12}, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->a([B)V

    invoke-static {v5, v12, v10}, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->a(Lorg/spongycastle/crypto/Digest;[B[B)V

    new-instance v0, Ljava/math/BigInteger;

    const/4 v14, 0x1

    invoke-direct {v0, v14, v10}, Ljava/math/BigInteger;-><init>(I[B)V

    if-ne v2, v8, :cond_1

    sget-object v14, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->f:Ljava/math/BigInteger;

    invoke-virtual {v14, v9}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v14

    invoke-virtual {v0, v14}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    :cond_1
    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    add-int v0, v1, v6

    move v1, v0

    goto :goto_1

    :cond_2
    sget-object v0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->f:Ljava/math/BigInteger;

    iget v1, p0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->a:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v11, v1}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    sget-object v2, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->f:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    iget v2, p0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->a:I

    if-ne v0, v2, :cond_3

    iget v0, p0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->c:I

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->isProbablePrime(I)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->d:Ljava/security/SecureRandom;

    invoke-static {v1, v11, v0}, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->a(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/security/SecureRandom;)Ljava/math/BigInteger;

    move-result-object v2

    new-instance v0, Lorg/spongycastle/crypto/params/DSAParameters;

    new-instance v3, Lorg/spongycastle/crypto/params/DSAValidationParameters;

    invoke-direct {v3, v7, v4}, Lorg/spongycastle/crypto/params/DSAValidationParameters;-><init>([BI)V

    invoke-direct {v0, v1, v11, v2, v3}, Lorg/spongycastle/crypto/params/DSAParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Lorg/spongycastle/crypto/params/DSAValidationParameters;)V

    :goto_2
    return-object v0

    :cond_3
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_0

    :cond_4
    invoke-direct {p0}, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->b()Lorg/spongycastle/crypto/params/DSAParameters;

    move-result-object v0

    goto :goto_2
.end method

.method public final a(IILjava/security/SecureRandom;)V
    .locals 1

    .prologue
    .line 40
    const/16 v0, 0x400

    if-le p1, v0, :cond_0

    const/16 v0, 0x100

    :goto_0
    iput p1, p0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->a:I

    iput v0, p0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->b:I

    iput p2, p0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->c:I

    iput-object p3, p0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->d:Ljava/security/SecureRandom;

    .line 41
    return-void

    .line 40
    :cond_0
    const/16 v0, 0xa0

    goto :goto_0
.end method
