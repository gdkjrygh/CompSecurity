.class public Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;
.super Ljava/lang/Object;


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

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->e:Ljava/math/BigInteger;

    const-wide/16 v0, 0x1

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->f:Ljava/math/BigInteger;

    const-wide/16 v0, 0x2

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->g:Ljava/math/BigInteger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static calculateGenerator_FIPS186_2(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/security/SecureRandom;)Ljava/math/BigInteger;
    .locals 5

    sget-object v0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->f:Ljava/math/BigInteger;

    invoke-virtual {p0, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    sget-object v1, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->g:Ljava/math/BigInteger;

    invoke-virtual {p0, v1}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    :cond_0
    sget-object v2, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->g:Ljava/math/BigInteger;

    invoke-static {v2, v1, p2}, Lorg/bouncycastle/util/BigIntegers;->a(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/security/SecureRandom;)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2, v0, p0}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->bitLength()I

    move-result v3

    const/4 v4, 0x1

    if-le v3, v4, :cond_0

    return-object v2
.end method

.method private static calculateGenerator_FIPS186_3_Unverifiable(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/security/SecureRandom;)Ljava/math/BigInteger;
    .locals 1

    invoke-static {p0, p1, p2}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->calculateGenerator_FIPS186_2(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/security/SecureRandom;)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method private generateParameters_FIPS186_2()Lorg/bouncycastle/crypto/params/DSAParameters;
    .locals 14

    const/16 v0, 0x14

    new-array v2, v0, [B

    const/16 v0, 0x14

    new-array v3, v0, [B

    const/16 v0, 0x14

    new-array v4, v0, [B

    const/16 v0, 0x14

    new-array v5, v0, [B

    new-instance v6, Lorg/bouncycastle/crypto/digests/SHA1Digest;

    invoke-direct {v6}, Lorg/bouncycastle/crypto/digests/SHA1Digest;-><init>()V

    iget v0, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->a:I

    add-int/lit8 v0, v0, -0x1

    div-int/lit16 v7, v0, 0xa0

    iget v0, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->a:I

    div-int/lit8 v0, v0, 0x8

    new-array v8, v0, [B

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->d:Ljava/security/SecureRandom;

    invoke-virtual {v0, v2}, Ljava/security/SecureRandom;->nextBytes([B)V

    invoke-static {v6, v2, v3}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->hash(Lorg/bouncycastle/crypto/Digest;[B[B)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/16 v9, 0x14

    invoke-static {v2, v0, v4, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v4}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->inc([B)V

    invoke-static {v6, v4, v4}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->hash(Lorg/bouncycastle/crypto/Digest;[B[B)V

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x14

    if-eq v0, v1, :cond_1

    aget-byte v1, v3, v0

    aget-byte v9, v4, v0

    xor-int/2addr v1, v9

    int-to-byte v1, v1

    aput-byte v1, v5, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    aget-byte v1, v5, v0

    or-int/lit8 v1, v1, -0x80

    int-to-byte v1, v1

    aput-byte v1, v5, v0

    const/16 v0, 0x13

    aget-byte v1, v5, v0

    or-int/lit8 v1, v1, 0x1

    int-to-byte v1, v1

    aput-byte v1, v5, v0

    new-instance v9, Ljava/math/BigInteger;

    const/4 v0, 0x1

    invoke-direct {v9, v0, v5}, Ljava/math/BigInteger;-><init>(I[B)V

    iget v0, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->c:I

    invoke-virtual {v9, v0}, Ljava/math/BigInteger;->isProbablePrime(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v2}, Lorg/bouncycastle/util/Arrays;->c([B)[B

    move-result-object v10

    invoke-static {v10}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->inc([B)V

    const/4 v0, 0x0

    move v1, v0

    :goto_1
    const/16 v0, 0x1000

    if-ge v1, v0, :cond_0

    const/4 v0, 0x0

    :goto_2
    if-ge v0, v7, :cond_2

    invoke-static {v10}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->inc([B)V

    invoke-static {v6, v10, v3}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->hash(Lorg/bouncycastle/crypto/Digest;[B[B)V

    const/4 v11, 0x0

    array-length v12, v8

    add-int/lit8 v13, v0, 0x1

    mul-int/lit8 v13, v13, 0x14

    sub-int/2addr v12, v13

    const/16 v13, 0x14

    invoke-static {v3, v11, v8, v12, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    invoke-static {v10}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->inc([B)V

    invoke-static {v6, v10, v3}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->hash(Lorg/bouncycastle/crypto/Digest;[B[B)V

    array-length v0, v8

    mul-int/lit8 v11, v7, 0x14

    sub-int/2addr v0, v11

    rsub-int/lit8 v0, v0, 0x14

    const/4 v11, 0x0

    array-length v12, v8

    mul-int/lit8 v13, v7, 0x14

    sub-int/2addr v12, v13

    invoke-static {v3, v0, v8, v11, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v0, 0x0

    aget-byte v11, v8, v0

    or-int/lit8 v11, v11, -0x80

    int-to-byte v11, v11

    aput-byte v11, v8, v0

    new-instance v0, Ljava/math/BigInteger;

    const/4 v11, 0x1

    invoke-direct {v0, v11, v8}, Ljava/math/BigInteger;-><init>(I[B)V

    const/4 v11, 0x1

    invoke-virtual {v9, v11}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v11

    invoke-virtual {v0, v11}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v11

    sget-object v12, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->f:Ljava/math/BigInteger;

    invoke-virtual {v11, v12}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v11

    invoke-virtual {v0, v11}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v11

    iget v12, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->a:I

    if-ne v11, v12, :cond_3

    iget v11, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->c:I

    invoke-virtual {v0, v11}, Ljava/math/BigInteger;->isProbablePrime(I)Z

    move-result v11

    if-eqz v11, :cond_3

    iget-object v3, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->d:Ljava/security/SecureRandom;

    invoke-static {v0, v9, v3}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->calculateGenerator_FIPS186_2(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/security/SecureRandom;)Ljava/math/BigInteger;

    move-result-object v3

    new-instance v4, Lorg/bouncycastle/crypto/params/DSAParameters;

    new-instance v5, Lorg/bouncycastle/crypto/params/DSAValidationParameters;

    invoke-direct {v5, v2, v1}, Lorg/bouncycastle/crypto/params/DSAValidationParameters;-><init>([BI)V

    invoke-direct {v4, v0, v9, v3, v5}, Lorg/bouncycastle/crypto/params/DSAParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/DSAValidationParameters;)V

    return-object v4

    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1
.end method

.method private generateParameters_FIPS186_3()Lorg/bouncycastle/crypto/params/DSAParameters;
    .locals 15

    new-instance v5, Lorg/bouncycastle/crypto/digests/SHA256Digest;

    invoke-direct {v5}, Lorg/bouncycastle/crypto/digests/SHA256Digest;-><init>()V

    invoke-interface {v5}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v0

    mul-int/lit8 v6, v0, 0x8

    iget v0, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->b:I

    div-int/lit8 v0, v0, 0x8

    new-array v7, v0, [B

    iget v0, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->a:I

    add-int/lit8 v0, v0, -0x1

    div-int v8, v0, v6

    iget v0, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->a:I

    add-int/lit8 v0, v0, -0x1

    rem-int v9, v0, v6

    invoke-interface {v5}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v0

    new-array v10, v0, [B

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->d:Ljava/security/SecureRandom;

    invoke-virtual {v0, v7}, Ljava/security/SecureRandom;->nextBytes([B)V

    invoke-static {v5, v7, v10}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->hash(Lorg/bouncycastle/crypto/Digest;[B[B)V

    new-instance v0, Ljava/math/BigInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1, v10}, Ljava/math/BigInteger;-><init>(I[B)V

    sget-object v1, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->f:Ljava/math/BigInteger;

    iget v2, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->b:I

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    sget-object v1, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->f:Ljava/math/BigInteger;

    iget v2, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->b:I

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    sget-object v2, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->f:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    sget-object v2, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->g:Ljava/math/BigInteger;

    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v11

    iget v0, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->c:I

    invoke-virtual {v11, v0}, Ljava/math/BigInteger;->isProbablePrime(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v7}, Lorg/bouncycastle/util/Arrays;->c([B)[B

    move-result-object v12

    iget v0, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->a:I

    mul-int/lit8 v13, v0, 0x4

    const/4 v0, 0x0

    move v4, v0

    :goto_0
    if-ge v4, v13, :cond_0

    sget-object v2, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->e:Ljava/math/BigInteger;

    const/4 v1, 0x0

    const/4 v0, 0x0

    move-object v3, v2

    move v2, v1

    move v1, v0

    :goto_1
    if-gt v2, v8, :cond_2

    invoke-static {v12}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->inc([B)V

    invoke-static {v5, v12, v10}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->hash(Lorg/bouncycastle/crypto/Digest;[B[B)V

    new-instance v0, Ljava/math/BigInteger;

    const/4 v14, 0x1

    invoke-direct {v0, v14, v10}, Ljava/math/BigInteger;-><init>(I[B)V

    if-ne v2, v8, :cond_1

    sget-object v14, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->f:Ljava/math/BigInteger;

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
    sget-object v0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->f:Ljava/math/BigInteger;

    iget v1, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->a:I

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

    sget-object v2, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->f:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v1

    iget v2, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->a:I

    if-ne v1, v2, :cond_3

    iget v1, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->c:I

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->isProbablePrime(I)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->d:Ljava/security/SecureRandom;

    invoke-static {v0, v11, v1}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->calculateGenerator_FIPS186_3_Unverifiable(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/security/SecureRandom;)Ljava/math/BigInteger;

    move-result-object v1

    new-instance v2, Lorg/bouncycastle/crypto/params/DSAParameters;

    new-instance v3, Lorg/bouncycastle/crypto/params/DSAValidationParameters;

    invoke-direct {v3, v7, v4}, Lorg/bouncycastle/crypto/params/DSAValidationParameters;-><init>([BI)V

    invoke-direct {v2, v0, v11, v1, v3}, Lorg/bouncycastle/crypto/params/DSAParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/DSAValidationParameters;)V

    return-object v2

    :cond_3
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_0
.end method

.method private static getDefaultN(I)I
    .locals 1

    const/16 v0, 0x400

    if-le p0, v0, :cond_0

    const/16 v0, 0x100

    :goto_0
    return v0

    :cond_0
    const/16 v0, 0xa0

    goto :goto_0
.end method

.method private static hash(Lorg/bouncycastle/crypto/Digest;[B[B)V
    .locals 2

    const/4 v1, 0x0

    array-length v0, p1

    invoke-interface {p0, p1, v1, v0}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    invoke-interface {p0, p2, v1}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    return-void
.end method

.method private static inc([B)V
    .locals 2

    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    aget-byte v1, p0, v0

    add-int/lit8 v1, v1, 0x1

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    if-nez v1, :cond_0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private init(IIILjava/security/SecureRandom;)V
    .locals 0

    iput p1, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->a:I

    iput p2, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->b:I

    iput p3, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->c:I

    iput-object p4, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->d:Ljava/security/SecureRandom;

    return-void
.end method


# virtual methods
.method public generateParameters()Lorg/bouncycastle/crypto/params/DSAParameters;
    .locals 2

    iget v0, p0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->a:I

    const/16 v1, 0x400

    if-le v0, v1, :cond_0

    invoke-direct {p0}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->generateParameters_FIPS186_3()Lorg/bouncycastle/crypto/params/DSAParameters;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->generateParameters_FIPS186_2()Lorg/bouncycastle/crypto/params/DSAParameters;

    move-result-object v0

    goto :goto_0
.end method

.method public init(IILjava/security/SecureRandom;)V
    .locals 1

    invoke-static {p1}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->getDefaultN(I)I

    move-result v0

    invoke-direct {p0, p1, v0, p2, p3}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->init(IIILjava/security/SecureRandom;)V

    return-void
.end method
