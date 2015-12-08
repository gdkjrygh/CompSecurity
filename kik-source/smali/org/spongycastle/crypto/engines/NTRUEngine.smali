.class public Lorg/spongycastle/crypto/engines/NTRUEngine;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/AsymmetricBlockCipher;


# instance fields
.field private a:Z

.field private b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

.field private c:Lorg/spongycastle/crypto/params/NTRUEncryptionPublicKeyParameters;

.field private d:Lorg/spongycastle/crypto/params/NTRUEncryptionPrivateKeyParameters;

.field private e:Ljava/security/SecureRandom;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    return-void
.end method

.method private a([BIIZ)Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;
    .locals 12

    .prologue
    .line 273
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget-object v7, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->A:Lorg/spongycastle/crypto/Digest;

    .line 274
    invoke-interface {v7}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v2

    .line 275
    mul-int v0, p3, v2

    new-array v1, v0, [B

    .line 276
    if-eqz p4, :cond_0

    invoke-interface {v7}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v0

    new-array v0, v0, [B

    const/4 v3, 0x0

    array-length v4, p1

    invoke-interface {v7, p1, v3, v4}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    const/4 v3, 0x0

    invoke-interface {v7, v0, v3}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    move-object p1, v0

    .line 277
    :cond_0
    const/4 v0, 0x0

    .line 278
    :goto_0
    if-ge v0, p3, :cond_1

    .line 280
    const/4 v3, 0x0

    array-length v4, p1

    invoke-interface {v7, p1, v3, v4}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 281
    invoke-static {v7, v0}, Lorg/spongycastle/crypto/engines/NTRUEngine;->a(Lorg/spongycastle/crypto/Digest;I)V

    .line 283
    invoke-static {v7}, Lorg/spongycastle/crypto/engines/NTRUEngine;->a(Lorg/spongycastle/crypto/Digest;)[B

    move-result-object v3

    .line 284
    const/4 v4, 0x0

    mul-int v5, v0, v2

    invoke-static {v3, v4, v1, v5, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 285
    add-int/lit8 v0, v0, 0x1

    .line 286
    goto :goto_0

    .line 288
    :cond_1
    new-instance v4, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    invoke-direct {v4, p2}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;-><init>(I)V

    move-object v11, v1

    move v1, v0

    move-object v0, v11

    .line 291
    :goto_1
    const/4 v3, 0x0

    .line 292
    const/4 v2, 0x0

    :goto_2
    array-length v5, v0

    if-eq v2, v5, :cond_5

    .line 294
    aget-byte v5, v0, v2

    and-int/lit16 v6, v5, 0xff

    .line 295
    const/16 v5, 0xf3

    if-ge v6, v5, :cond_4

    .line 297
    const/4 v5, 0x0

    move v11, v5

    move v5, v6

    move v6, v3

    move v3, v11

    :goto_3
    const/4 v8, 0x4

    if-ge v3, v8, :cond_3

    .line 302
    rem-int/lit8 v8, v5, 0x3

    .line 303
    iget-object v9, v4, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    add-int/lit8 v10, v8, -0x1

    aput v10, v9, v6

    .line 304
    add-int/lit8 v6, v6, 0x1

    .line 305
    if-ne v6, p2, :cond_2

    move-object v0, v4

    .line 322
    :goto_4
    return-object v0

    .line 309
    :cond_2
    sub-int/2addr v5, v8

    div-int/lit8 v5, v5, 0x3

    .line 300
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 312
    :cond_3
    iget-object v3, v4, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    add-int/lit8 v5, v5, -0x1

    aput v5, v3, v6

    .line 313
    add-int/lit8 v3, v6, 0x1

    .line 314
    if-ne v3, p2, :cond_4

    move-object v0, v4

    .line 316
    goto :goto_4

    .line 292
    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 320
    :cond_5
    if-lt v3, p2, :cond_6

    move-object v0, v4

    .line 322
    goto :goto_4

    .line 325
    :cond_6
    const/4 v0, 0x0

    array-length v2, p1

    invoke-interface {v7, p1, v0, v2}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 326
    invoke-static {v7, v1}, Lorg/spongycastle/crypto/engines/NTRUEngine;->a(Lorg/spongycastle/crypto/Digest;I)V

    .line 328
    invoke-static {v7}, Lorg/spongycastle/crypto/engines/NTRUEngine;->a(Lorg/spongycastle/crypto/Digest;)[B

    move-result-object v0

    .line 332
    add-int/lit8 v1, v1, 0x1

    .line 333
    goto :goto_1
.end method

.method private a([B)Lorg/spongycastle/math/ntru/polynomial/Polynomial;
    .locals 5

    .prologue
    .line 207
    new-instance v0, Lorg/spongycastle/crypto/engines/IndexGenerator;

    iget-object v1, p0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    invoke-direct {v0, p1, v1}, Lorg/spongycastle/crypto/engines/IndexGenerator;-><init>([BLorg/spongycastle/crypto/params/NTRUEncryptionParameters;)V

    .line 209
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget v1, v1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->z:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 211
    new-instance v1, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

    iget-object v2, p0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget v2, v2, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->h:I

    invoke-direct {p0, v0, v2}, Lorg/spongycastle/crypto/engines/NTRUEngine;->a(Lorg/spongycastle/crypto/engines/IndexGenerator;I)[I

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;-><init>([I)V

    .line 212
    new-instance v2, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

    iget-object v3, p0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget v3, v3, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->i:I

    invoke-direct {p0, v0, v3}, Lorg/spongycastle/crypto/engines/NTRUEngine;->a(Lorg/spongycastle/crypto/engines/IndexGenerator;I)[I

    move-result-object v3

    invoke-direct {v2, v3}, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;-><init>([I)V

    .line 213
    new-instance v3, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

    iget-object v4, p0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget v4, v4, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->j:I

    invoke-direct {p0, v0, v4}, Lorg/spongycastle/crypto/engines/NTRUEngine;->a(Lorg/spongycastle/crypto/engines/IndexGenerator;I)[I

    move-result-object v0

    invoke-direct {v3, v0}, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;-><init>([I)V

    .line 214
    new-instance v0, Lorg/spongycastle/math/ntru/polynomial/ProductFormPolynomial;

    invoke-direct {v0, v1, v2, v3}, Lorg/spongycastle/math/ntru/polynomial/ProductFormPolynomial;-><init>(Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;)V

    .line 227
    :goto_0
    return-object v0

    .line 218
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget v1, v1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->g:I

    .line 219
    iget-object v2, p0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget-boolean v2, v2, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->x:Z

    .line 220
    invoke-direct {p0, v0, v1}, Lorg/spongycastle/crypto/engines/NTRUEngine;->a(Lorg/spongycastle/crypto/engines/IndexGenerator;I)[I

    move-result-object v1

    .line 221
    if-eqz v2, :cond_1

    .line 223
    new-instance v0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

    invoke-direct {v0, v1}, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;-><init>([I)V

    goto :goto_0

    .line 227
    :cond_1
    new-instance v0, Lorg/spongycastle/math/ntru/polynomial/DenseTernaryPolynomial;

    invoke-direct {v0, v1}, Lorg/spongycastle/math/ntru/polynomial/DenseTernaryPolynomial;-><init>([I)V

    goto :goto_0
.end method

.method private static a(Lorg/spongycastle/crypto/Digest;I)V
    .locals 1

    .prologue
    .line 338
    shr-int/lit8 v0, p1, 0x18

    int-to-byte v0, v0

    invoke-interface {p0, v0}, Lorg/spongycastle/crypto/Digest;->a(B)V

    .line 339
    shr-int/lit8 v0, p1, 0x10

    int-to-byte v0, v0

    invoke-interface {p0, v0}, Lorg/spongycastle/crypto/Digest;->a(B)V

    .line 340
    shr-int/lit8 v0, p1, 0x8

    int-to-byte v0, v0

    invoke-interface {p0, v0}, Lorg/spongycastle/crypto/Digest;->a(B)V

    .line 341
    int-to-byte v0, p1

    invoke-interface {p0, v0}, Lorg/spongycastle/crypto/Digest;->a(B)V

    .line 342
    return-void
.end method

.method private static a(Lorg/spongycastle/crypto/Digest;)[B
    .locals 2

    .prologue
    .line 346
    invoke-interface {p0}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v0

    new-array v0, v0, [B

    .line 348
    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 350
    return-object v0
.end method

.method private static a([BI)[B
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 483
    new-array v0, p1, [B

    .line 485
    array-length v1, p0

    if-ge p1, v1, :cond_0

    :goto_0
    invoke-static {p0, v2, v0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 487
    return-object v0

    .line 485
    :cond_0
    array-length p1, p0

    goto :goto_0
.end method

.method private static a([B[BI[B[B)[B
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 181
    array-length v0, p0

    add-int/2addr v0, p2

    array-length v1, p3

    add-int/2addr v0, v1

    array-length v1, p4

    add-int/2addr v0, v1

    new-array v0, v0, [B

    .line 183
    array-length v1, p0

    invoke-static {p0, v3, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 184
    array-length v1, p0

    array-length v2, p1

    invoke-static {p1, v3, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 185
    array-length v1, p0

    array-length v2, p1

    add-int/2addr v1, v2

    array-length v2, p3

    invoke-static {p3, v3, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 186
    array-length v1, p0

    array-length v2, p1

    add-int/2addr v1, v2

    array-length v2, p3

    add-int/2addr v1, v2

    array-length v2, p4

    invoke-static {p4, v3, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 187
    return-object v0
.end method

.method private a(Lorg/spongycastle/crypto/engines/IndexGenerator;I)[I
    .locals 5

    .prologue
    .line 242
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget v0, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->a:I

    .line 244
    new-array v2, v0, [I

    .line 245
    const/4 v0, -0x1

    move v1, v0

    :goto_0
    const/4 v0, 0x1

    if-gt v1, v0, :cond_2

    .line 247
    const/4 v0, 0x0

    .line 248
    :cond_0
    :goto_1
    if-ge v0, p2, :cond_1

    .line 250
    invoke-virtual {p1}, Lorg/spongycastle/crypto/engines/IndexGenerator;->a()I

    move-result v3

    .line 251
    aget v4, v2, v3

    if-nez v4, :cond_0

    .line 253
    aput v1, v2, v3

    .line 254
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 245
    :cond_1
    add-int/lit8 v0, v1, 0x2

    move v1, v0

    goto :goto_0

    .line 259
    :cond_2
    return-object v2
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget v0, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->m:I

    return v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 1

    .prologue
    .line 46
    iput-boolean p1, p0, Lorg/spongycastle/crypto/engines/NTRUEngine;->a:Z

    .line 47
    if-eqz p1, :cond_1

    .line 49
    instance-of v0, p2, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    if-eqz v0, :cond_0

    .line 51
    check-cast p2, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    .line 53
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithRandom;->a()Ljava/security/SecureRandom;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/NTRUEngine;->e:Ljava/security/SecureRandom;

    .line 54
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithRandom;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/NTRUEncryptionPublicKeyParameters;

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/NTRUEngine;->c:Lorg/spongycastle/crypto/params/NTRUEncryptionPublicKeyParameters;

    .line 62
    :goto_0
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/NTRUEngine;->c:Lorg/spongycastle/crypto/params/NTRUEncryptionPublicKeyParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/NTRUEncryptionPublicKeyParameters;->b()Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    .line 69
    :goto_1
    return-void

    .line 58
    :cond_0
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/NTRUEngine;->e:Ljava/security/SecureRandom;

    .line 59
    check-cast p2, Lorg/spongycastle/crypto/params/NTRUEncryptionPublicKeyParameters;

    iput-object p2, p0, Lorg/spongycastle/crypto/engines/NTRUEngine;->c:Lorg/spongycastle/crypto/params/NTRUEncryptionPublicKeyParameters;

    goto :goto_0

    .line 66
    :cond_1
    check-cast p2, Lorg/spongycastle/crypto/params/NTRUEncryptionPrivateKeyParameters;

    iput-object p2, p0, Lorg/spongycastle/crypto/engines/NTRUEngine;->d:Lorg/spongycastle/crypto/params/NTRUEncryptionPrivateKeyParameters;

    .line 67
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/NTRUEngine;->d:Lorg/spongycastle/crypto/params/NTRUEncryptionPrivateKeyParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/NTRUEncryptionPrivateKeyParameters;->b()Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    goto :goto_1
.end method

.method public final a([BII)[B
    .locals 24

    .prologue
    .line 84
    move/from16 v0, p3

    new-array v6, v0, [B

    .line 86
    const/4 v5, 0x0

    move-object/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p3

    invoke-static {v0, v1, v6, v5, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 88
    move-object/from16 v0, p0

    iget-boolean v5, v0, Lorg/spongycastle/crypto/engines/NTRUEngine;->a:Z

    if-eqz v5, :cond_2

    .line 90
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/engines/NTRUEngine;->c:Lorg/spongycastle/crypto/params/NTRUEncryptionPublicKeyParameters;

    iget-object v7, v5, Lorg/spongycastle/crypto/params/NTRUEncryptionPublicKeyParameters;->c:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget v8, v5, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->a:I

    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget v9, v5, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->b:I

    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget v10, v5, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->m:I

    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget v11, v5, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->n:I

    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget v12, v5, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->o:I

    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget v13, v5, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->q:I

    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget v14, v5, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->r:I

    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget v15, v5, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->u:I

    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget-boolean v0, v5, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->v:Z

    move/from16 v16, v0

    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget-object v0, v5, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->w:[B

    move-object/from16 v17, v0

    array-length v0, v6

    move/from16 v18, v0

    const/16 v5, 0xff

    if-le v10, v5, :cond_0

    new-instance v5, Ljava/lang/IllegalArgumentException;

    const-string v6, "llen values bigger than 1 are not supported"

    invoke-direct {v5, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v5

    :cond_0
    move/from16 v0, v18

    if-le v0, v10, :cond_1

    new-instance v5, Lorg/spongycastle/crypto/DataLengthException;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Message too long: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move/from16 v0, v18

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ">"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v5

    :cond_1
    div-int/lit8 v5, v11, 0x8

    new-array v5, v5, [B

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/spongycastle/crypto/engines/NTRUEngine;->e:Ljava/security/SecureRandom;

    move-object/from16 v19, v0

    move-object/from16 v0, v19

    invoke-virtual {v0, v5}, Ljava/security/SecureRandom;->nextBytes([B)V

    add-int/lit8 v19, v10, 0x1

    sub-int v19, v19, v18

    move/from16 v0, v19

    new-array v0, v0, [B

    move-object/from16 v19, v0

    div-int/lit8 v20, v12, 0x8

    move/from16 v0, v20

    new-array v0, v0, [B

    move-object/from16 v20, v0

    const/16 v21, 0x0

    const/16 v22, 0x0

    array-length v0, v5

    move/from16 v23, v0

    move/from16 v0, v21

    move-object/from16 v1, v20

    move/from16 v2, v22

    move/from16 v3, v23

    invoke-static {v5, v0, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v0, v5

    move/from16 v21, v0

    move/from16 v0, v18

    int-to-byte v0, v0

    move/from16 v22, v0

    aput-byte v22, v20, v21

    const/16 v21, 0x0

    array-length v0, v5

    move/from16 v22, v0

    add-int/lit8 v22, v22, 0x1

    array-length v0, v6

    move/from16 v23, v0

    move/from16 v0, v21

    move-object/from16 v1, v20

    move/from16 v2, v22

    move/from16 v3, v23

    invoke-static {v6, v0, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v21, 0x0

    array-length v0, v5

    move/from16 v22, v0

    add-int/lit8 v22, v22, 0x1

    array-length v0, v6

    move/from16 v23, v0

    add-int v22, v22, v23

    move-object/from16 v0, v19

    array-length v0, v0

    move/from16 v23, v0

    move-object/from16 v0, v19

    move/from16 v1, v21

    move-object/from16 v2, v20

    move/from16 v3, v22

    move/from16 v4, v23

    invoke-static {v0, v1, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object/from16 v0, v20

    invoke-static {v0, v8}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a([BI)Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    move-result-object v19

    invoke-virtual {v7, v9}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a(I)[B

    move-result-object v20

    div-int/lit8 v21, v14, 0x8

    invoke-static/range {v20 .. v21}, Lorg/spongycastle/crypto/engines/NTRUEngine;->a([BI)[B

    move-result-object v20

    move-object/from16 v0, v17

    move/from16 v1, v18

    move-object/from16 v2, v20

    invoke-static {v0, v6, v1, v5, v2}, Lorg/spongycastle/crypto/engines/NTRUEngine;->a([B[BI[B[B)[B

    move-result-object v5

    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Lorg/spongycastle/crypto/engines/NTRUEngine;->a([B)Lorg/spongycastle/math/ntru/polynomial/Polynomial;

    move-result-object v5

    invoke-interface {v5, v7, v9}, Lorg/spongycastle/math/ntru/polynomial/Polynomial;->a(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;I)Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->clone()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    const/16 v21, 0x4

    move/from16 v0, v21

    invoke-virtual {v5, v0}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->b(I)V

    const/16 v21, 0x4

    move/from16 v0, v21

    invoke-virtual {v5, v0}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a(I)[B

    move-result-object v5

    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-direct {v0, v5, v8, v15, v1}, Lorg/spongycastle/crypto/engines/NTRUEngine;->a([BIIZ)Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    move-result-object v5

    move-object/from16 v0, v19

    invoke-virtual {v0, v5}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->b(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;)V

    invoke-virtual/range {v19 .. v19}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->e()V

    const/4 v5, -0x1

    move-object/from16 v0, v19

    invoke-virtual {v0, v5}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->f(I)I

    move-result v5

    if-lt v5, v13, :cond_1

    const/4 v5, 0x0

    move-object/from16 v0, v19

    invoke-virtual {v0, v5}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->f(I)I

    move-result v5

    if-lt v5, v13, :cond_1

    const/4 v5, 0x1

    move-object/from16 v0, v19

    invoke-virtual {v0, v5}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->f(I)I

    move-result v5

    if-lt v5, v13, :cond_1

    move-object/from16 v0, v20

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->b(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v9}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->c(I)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v9}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->d(I)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v9}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a(I)[B

    move-result-object v5

    .line 94
    :goto_0
    return-object v5

    :cond_2
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/engines/NTRUEngine;->d:Lorg/spongycastle/crypto/params/NTRUEncryptionPrivateKeyParameters;

    iget-object v7, v5, Lorg/spongycastle/crypto/params/NTRUEncryptionPrivateKeyParameters;->c:Lorg/spongycastle/math/ntru/polynomial/Polynomial;

    iget-object v8, v5, Lorg/spongycastle/crypto/params/NTRUEncryptionPrivateKeyParameters;->d:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    iget-object v9, v5, Lorg/spongycastle/crypto/params/NTRUEncryptionPrivateKeyParameters;->e:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget v10, v5, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->a:I

    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget v11, v5, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->b:I

    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget v5, v5, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->n:I

    move-object/from16 v0, p0

    iget-object v12, v0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget v12, v12, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->m:I

    move-object/from16 v0, p0

    iget-object v13, v0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget v13, v13, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->q:I

    move-object/from16 v0, p0

    iget-object v14, v0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget v14, v14, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->r:I

    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget v15, v15, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->u:I

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    iget-boolean v0, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->v:Z

    move/from16 v16, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    move-object/from16 v17, v0

    move-object/from16 v0, v17

    iget-object v0, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->w:[B

    move-object/from16 v17, v0

    const/16 v18, 0xff

    move/from16 v0, v18

    if-le v12, v0, :cond_3

    new-instance v5, Lorg/spongycastle/crypto/DataLengthException;

    const-string v6, "maxMsgLenBytes values bigger than 255 are not supported"

    invoke-direct {v5, v6}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v5

    :cond_3
    div-int/lit8 v18, v5, 0x8

    invoke-static {v6, v10, v11}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a([BII)Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    move-result-object v6

    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget-boolean v5, v5, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->y:Z

    if-eqz v5, :cond_4

    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget v5, v5, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->b:I

    invoke-interface {v7, v6, v5}, Lorg/spongycastle/math/ntru/polynomial/Polynomial;->a(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;I)Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    move-result-object v5

    invoke-virtual {v5}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->d()V

    invoke-virtual {v5, v6}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->b(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;)V

    :goto_1
    move-object/from16 v0, p0

    iget-object v7, v0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget v7, v7, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->b:I

    invoke-virtual {v5, v7}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->e(I)V

    invoke-virtual {v5}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->e()V

    move-object/from16 v0, p0

    iget-object v7, v0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget-boolean v7, v7, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->y:Z

    if-eqz v7, :cond_5

    move-object v7, v5

    :goto_2
    const/4 v5, 0x3

    invoke-virtual {v7, v5}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->e(I)V

    const/4 v5, -0x1

    invoke-virtual {v7, v5}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->f(I)I

    move-result v5

    if-ge v5, v13, :cond_6

    new-instance v5, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v6, "Less than dm0 coefficients equal -1"

    invoke-direct {v5, v6}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v5

    :cond_4
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget v5, v5, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->b:I

    invoke-interface {v7, v6, v5}, Lorg/spongycastle/math/ntru/polynomial/Polynomial;->a(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;I)Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    move-result-object v5

    goto :goto_1

    :cond_5
    new-instance v7, Lorg/spongycastle/math/ntru/polynomial/DenseTernaryPolynomial;

    invoke-direct {v7, v5}, Lorg/spongycastle/math/ntru/polynomial/DenseTernaryPolynomial;-><init>(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;)V

    const/4 v5, 0x3

    invoke-virtual {v7, v8, v5}, Lorg/spongycastle/math/ntru/polynomial/DenseTernaryPolynomial;->a(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;I)Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    move-result-object v5

    move-object v7, v5

    goto :goto_2

    :cond_6
    const/4 v5, 0x0

    invoke-virtual {v7, v5}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->f(I)I

    move-result v5

    if-ge v5, v13, :cond_7

    new-instance v5, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v6, "Less than dm0 coefficients equal 0"

    invoke-direct {v5, v6}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v5

    :cond_7
    const/4 v5, 0x1

    invoke-virtual {v7, v5}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->f(I)I

    move-result v5

    if-ge v5, v13, :cond_8

    new-instance v5, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v6, "Less than dm0 coefficients equal 1"

    invoke-direct {v5, v6}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v5

    :cond_8
    invoke-virtual {v6}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->clone()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    invoke-virtual {v5, v7}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->c(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;)V

    invoke-virtual {v5, v11}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->b(I)V

    invoke-virtual {v5}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->clone()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    const/4 v8, 0x4

    invoke-virtual {v6, v8}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->b(I)V

    const/4 v8, 0x4

    invoke-virtual {v6, v8}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a(I)[B

    move-result-object v6

    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-direct {v0, v6, v10, v15, v1}, Lorg/spongycastle/crypto/engines/NTRUEngine;->a([BIIZ)Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    move-result-object v6

    invoke-virtual {v7, v6}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->c(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;)V

    invoke-virtual {v7}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->e()V

    iget-object v6, v7, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    invoke-static {v6}, Lorg/spongycastle/math/ntru/util/ArrayEncoder;->a([I)[B

    move-result-object v7

    move/from16 v0, v18

    new-array v8, v0, [B

    const/4 v6, 0x0

    const/4 v10, 0x0

    move/from16 v0, v18

    invoke-static {v7, v6, v8, v10, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aget-byte v6, v7, v18

    and-int/lit16 v10, v6, 0xff

    if-le v10, v12, :cond_9

    new-instance v5, Lorg/spongycastle/crypto/InvalidCipherTextException;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Message too long: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ">"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v5

    :cond_9
    new-array v6, v10, [B

    add-int/lit8 v12, v18, 0x1

    const/4 v13, 0x0

    invoke-static {v7, v12, v6, v13, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v12, v7

    add-int/lit8 v13, v18, 0x1

    add-int/2addr v13, v10

    sub-int/2addr v12, v13

    new-array v12, v12, [B

    add-int/lit8 v13, v18, 0x1

    add-int/2addr v13, v10

    const/4 v15, 0x0

    array-length v0, v12

    move/from16 v16, v0

    move/from16 v0, v16

    invoke-static {v7, v13, v12, v15, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v7, v12

    new-array v7, v7, [B

    invoke-static {v12, v7}, Lorg/spongycastle/util/Arrays;->a([B[B)Z

    move-result v7

    if-nez v7, :cond_a

    new-instance v5, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v6, "The message is not followed by zeroes"

    invoke-direct {v5, v6}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v5

    :cond_a
    invoke-virtual {v9, v11}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a(I)[B

    move-result-object v7

    div-int/lit8 v12, v14, 0x8

    invoke-static {v7, v12}, Lorg/spongycastle/crypto/engines/NTRUEngine;->a([BI)[B

    move-result-object v7

    move-object/from16 v0, v17

    invoke-static {v0, v6, v10, v8, v7}, Lorg/spongycastle/crypto/engines/NTRUEngine;->a([B[BI[B[B)[B

    move-result-object v7

    move-object/from16 v0, p0

    invoke-direct {v0, v7}, Lorg/spongycastle/crypto/engines/NTRUEngine;->a([B)Lorg/spongycastle/math/ntru/polynomial/Polynomial;

    move-result-object v7

    invoke-interface {v7, v9}, Lorg/spongycastle/math/ntru/polynomial/Polynomial;->a(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;)Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    move-result-object v7

    invoke-virtual {v7, v11}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->b(I)V

    invoke-virtual {v7, v5}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_b

    new-instance v5, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v6, "Invalid message encoding"

    invoke-direct {v5, v6}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v5

    :cond_b
    move-object v5, v6

    goto/16 :goto_0
.end method

.method public final b()I
    .locals 3

    .prologue
    .line 78
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget v0, v0, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->a:I

    iget-object v1, p0, Lorg/spongycastle/crypto/engines/NTRUEngine;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget v1, v1, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->b:I

    const/16 v2, 0x800

    if-ne v1, v2, :cond_0

    mul-int/lit8 v0, v0, 0xb

    add-int/lit8 v0, v0, 0x7

    div-int/lit8 v0, v0, 0x8

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "log2 not fully implemented"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
