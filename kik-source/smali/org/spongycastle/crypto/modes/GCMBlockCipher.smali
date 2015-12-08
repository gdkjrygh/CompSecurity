.class public Lorg/spongycastle/crypto/modes/GCMBlockCipher;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/modes/AEADBlockCipher;


# static fields
.field private static final a:[B


# instance fields
.field private b:Lorg/spongycastle/crypto/BlockCipher;

.field private c:Lorg/spongycastle/crypto/modes/gcm/GCMMultiplier;

.field private d:Z

.field private e:I

.field private f:[B

.field private g:[B

.field private h:[B

.field private i:[B

.field private j:[B

.field private k:[B

.field private l:[B

.field private m:[B

.field private n:[B

.field private o:I

.field private p:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    const/16 v0, 0x10

    new-array v0, v0, [B

    sput-object v0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->a:[B

    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/crypto/BlockCipher;)V
    .locals 1

    .prologue
    .line 48
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/spongycastle/crypto/modes/GCMBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;B)V

    .line 49
    return-void
.end method

.method private constructor <init>(Lorg/spongycastle/crypto/BlockCipher;B)V
    .locals 2

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    const/16 v1, 0x10

    if-eq v0, v1, :cond_0

    .line 55
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "cipher required with a block size of 16."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 59
    :cond_0
    new-instance v0, Lorg/spongycastle/crypto/modes/gcm/Tables8kGCMMultiplier;

    invoke-direct {v0}, Lorg/spongycastle/crypto/modes/gcm/Tables8kGCMMultiplier;-><init>()V

    .line 65
    iput-object p1, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    .line 66
    iput-object v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->c:Lorg/spongycastle/crypto/modes/gcm/GCMMultiplier;

    .line 67
    return-void
.end method

.method private static a(J[BI)V
    .locals 2

    .prologue
    .line 418
    const/16 v0, 0x20

    ushr-long v0, p0, v0

    long-to-int v0, v0

    invoke-static {v0, p2, p3}, Lorg/spongycastle/crypto/util/Pack;->a(I[BI)V

    .line 419
    long-to-int v0, p0

    add-int/lit8 v1, p3, 0x4

    invoke-static {v0, p2, v1}, Lorg/spongycastle/crypto/util/Pack;->a(I[BI)V

    .line 420
    return-void
.end method

.method private a([BI[BI)V
    .locals 5

    .prologue
    const/4 v3, 0x0

    .line 334
    const/16 v0, 0xf

    :goto_0
    const/16 v1, 0xc

    if-lt v0, v1, :cond_0

    .line 336
    iget-object v1, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->n:[B

    aget-byte v1, v1, v0

    add-int/lit8 v1, v1, 0x1

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    .line 337
    iget-object v2, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->n:[B

    aput-byte v1, v2, v0

    .line 339
    if-nez v1, :cond_0

    .line 341
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 345
    :cond_0
    const/16 v0, 0x10

    new-array v1, v0, [B

    .line 346
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->n:[B

    invoke-interface {v0, v2, v3, v1, v3}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    .line 349
    iget-boolean v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->d:Z

    if-eqz v0, :cond_1

    .line 351
    sget-object v0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->a:[B

    rsub-int/lit8 v2, p2, 0x10

    invoke-static {v0, p2, v1, p2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v0, v1

    .line 359
    :goto_1
    add-int/lit8 v2, p2, -0x1

    :goto_2
    if-ltz v2, :cond_2

    .line 361
    aget-byte v3, v1, v2

    aget-byte v4, p1, v2

    xor-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    .line 362
    add-int v3, p4, v2

    aget-byte v4, v1, v2

    aput-byte v4, p3, v3

    .line 359
    add-int/lit8 v2, v2, -0x1

    goto :goto_2

    :cond_1
    move-object v0, p1

    .line 356
    goto :goto_1

    .line 366
    :cond_2
    iget-object v1, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->m:[B

    invoke-static {v1, v0}, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->a([B[B)V

    .line 367
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->c:Lorg/spongycastle/crypto/modes/gcm/GCMMultiplier;

    iget-object v1, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->m:[B

    invoke-interface {v0, v1}, Lorg/spongycastle/crypto/modes/gcm/GCMMultiplier;->b([B)V

    .line 369
    iget-wide v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->p:J

    int-to-long v2, p2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->p:J

    .line 370
    return-void
.end method

.method private static a([B[B)V
    .locals 3

    .prologue
    .line 410
    const/16 v0, 0xf

    :goto_0
    if-ltz v0, :cond_0

    .line 412
    aget-byte v1, p0, v0

    aget-byte v2, p1, v0

    xor-int/2addr v1, v2

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 410
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 414
    :cond_0
    return-void
.end method

.method private a([B)[B
    .locals 6

    .prologue
    const/4 v1, 0x0

    const/16 v5, 0x10

    .line 374
    new-array v2, v5, [B

    move v0, v1

    .line 376
    :goto_0
    array-length v3, p1

    if-ge v0, v3, :cond_0

    .line 378
    new-array v3, v5, [B

    .line 379
    array-length v4, p1

    sub-int/2addr v4, v0

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 380
    invoke-static {p1, v0, v3, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 381
    invoke-static {v2, v3}, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->a([B[B)V

    .line 382
    iget-object v3, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->c:Lorg/spongycastle/crypto/modes/gcm/GCMMultiplier;

    invoke-interface {v3, v2}, Lorg/spongycastle/crypto/modes/gcm/GCMMultiplier;->b([B)V

    .line 376
    add-int/lit8 v0, v0, 0x10

    goto :goto_0

    .line 385
    :cond_0
    return-object v2
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    .prologue
    .line 186
    iget v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->o:I

    add-int/2addr v0, p1

    div-int/lit8 v0, v0, 0x10

    mul-int/lit8 v0, v0, 0x10

    return v0
.end method

.method public final a([BI)I
    .locals 10

    .prologue
    const-wide/16 v8, 0x8

    const/16 v6, 0x10

    const/4 v5, 0x0

    .line 246
    iget v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->o:I

    .line 247
    iget-boolean v1, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->d:Z

    if-nez v1, :cond_1

    .line 249
    iget v1, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->e:I

    if-ge v0, v1, :cond_0

    .line 251
    new-instance v0, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v1, "data too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 253
    :cond_0
    iget v1, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->e:I

    sub-int/2addr v0, v1

    .line 256
    :cond_1
    if-lez v0, :cond_2

    .line 258
    new-array v1, v6, [B

    .line 259
    iget-object v2, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->k:[B

    invoke-static {v2, v5, v1, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 260
    invoke-direct {p0, v1, v0, p1, p2}, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->a([BI[BI)V

    .line 264
    :cond_2
    new-array v1, v6, [B

    .line 265
    iget-object v2, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->g:[B

    array-length v2, v2

    int-to-long v2, v2

    mul-long/2addr v2, v8

    invoke-static {v2, v3, v1, v5}, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->a(J[BI)V

    .line 266
    iget-wide v2, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->p:J

    mul-long/2addr v2, v8

    const/16 v4, 0x8

    invoke-static {v2, v3, v1, v4}, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->a(J[BI)V

    .line 268
    iget-object v2, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->m:[B

    invoke-static {v2, v1}, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->a([B[B)V

    .line 269
    iget-object v1, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->c:Lorg/spongycastle/crypto/modes/gcm/GCMMultiplier;

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->m:[B

    invoke-interface {v1, v2}, Lorg/spongycastle/crypto/modes/gcm/GCMMultiplier;->b([B)V

    .line 273
    new-array v1, v6, [B

    .line 274
    iget-object v2, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->j:[B

    invoke-interface {v2, v3, v5, v1, v5}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    .line 275
    iget-object v2, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->m:[B

    invoke-static {v1, v2}, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->a([B[B)V

    .line 280
    iget v2, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->e:I

    new-array v2, v2, [B

    iput-object v2, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->l:[B

    .line 281
    iget-object v2, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->l:[B

    iget v3, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->e:I

    invoke-static {v1, v5, v2, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 283
    iget-boolean v1, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->d:Z

    if-eqz v1, :cond_5

    .line 286
    iget-object v1, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->l:[B

    iget v2, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->o:I

    add-int/2addr v2, p2

    iget v3, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->e:I

    invoke-static {v1, v5, p1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 287
    iget v1, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->e:I

    add-int/2addr v0, v1

    .line 300
    :cond_3
    iget-object v1, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->i:[B

    invoke-static {v1}, Lorg/spongycastle/util/Arrays;->b([B)[B

    move-result-object v1

    iput-object v1, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->m:[B

    iget-object v1, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->j:[B

    invoke-static {v1}, Lorg/spongycastle/util/Arrays;->b([B)[B

    move-result-object v1

    iput-object v1, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->n:[B

    iput v5, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->o:I

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->p:J

    iget-object v1, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->k:[B

    if-eqz v1, :cond_4

    iget-object v1, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->k:[B

    invoke-static {v1, v5}, Lorg/spongycastle/util/Arrays;->a([BB)V

    :cond_4
    iget-object v1, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v1}, Lorg/spongycastle/crypto/BlockCipher;->c()V

    .line 302
    return v0

    .line 292
    :cond_5
    iget v1, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->e:I

    new-array v1, v1, [B

    .line 293
    iget-object v2, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->k:[B

    iget v3, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->e:I

    invoke-static {v2, v0, v1, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 294
    iget-object v2, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->l:[B

    invoke-static {v2, v1}, Lorg/spongycastle/util/Arrays;->b([B[B)Z

    move-result v1

    if-nez v1, :cond_3

    .line 296
    new-instance v0, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v1, "mac check in GCM failed"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final a([BII[BI)I
    .locals 7

    .prologue
    const/16 v6, 0x10

    const/4 v2, 0x0

    .line 198
    move v1, v2

    move v0, v2

    .line 200
    :goto_0
    if-eq v1, p3, :cond_2

    .line 203
    iget-object v3, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->k:[B

    iget v4, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->o:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->o:I

    add-int v5, p2, v1

    aget-byte v5, p1, v5

    aput-byte v5, v3, v4

    .line 205
    iget v3, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->o:I

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->k:[B

    array-length v4, v4

    if-ne v3, v4, :cond_1

    .line 207
    iget-object v3, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->k:[B

    add-int v4, p5, v0

    invoke-direct {p0, v3, v6, p4, v4}, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->a([BI[BI)V

    .line 208
    iget-boolean v3, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->d:Z

    if-nez v3, :cond_0

    .line 210
    iget-object v3, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->k:[B

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->k:[B

    iget v5, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->e:I

    invoke-static {v3, v6, v4, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 213
    :cond_0
    iget-object v3, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->k:[B

    array-length v3, v3

    add-int/lit8 v3, v3, -0x10

    iput v3, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->o:I

    .line 215
    add-int/lit8 v0, v0, 0x10

    .line 200
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 219
    :cond_2
    return v0
.end method

.method public final a()Lorg/spongycastle/crypto/BlockCipher;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    return-object v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 7

    .prologue
    const/4 v2, 0x0

    const/4 v4, 0x1

    const/16 v1, 0x10

    const/4 v6, 0x0

    .line 82
    iput-boolean p1, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->d:Z

    .line 83
    iput-object v2, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->l:[B

    .line 87
    instance-of v0, p2, Lorg/spongycastle/crypto/params/AEADParameters;

    if-eqz v0, :cond_3

    .line 89
    check-cast p2, Lorg/spongycastle/crypto/params/AEADParameters;

    .line 91
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/AEADParameters;->d()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->f:[B

    .line 92
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/AEADParameters;->c()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->g:[B

    .line 94
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/AEADParameters;->b()I

    move-result v0

    .line 95
    const/16 v2, 0x60

    if-lt v0, v2, :cond_0

    const/16 v2, 0x80

    if-gt v0, v2, :cond_0

    rem-int/lit8 v2, v0, 0x8

    if-eqz v2, :cond_1

    .line 97
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid value for MAC size: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 100
    :cond_1
    div-int/lit8 v0, v0, 0x8

    iput v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->e:I

    .line 101
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/AEADParameters;->a()Lorg/spongycastle/crypto/params/KeyParameter;

    move-result-object v0

    move-object v2, v0

    .line 117
    :goto_0
    if-eqz p1, :cond_5

    move v0, v1

    .line 118
    :goto_1
    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->k:[B

    .line 120
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->f:[B

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->f:[B

    array-length v0, v0

    if-gtz v0, :cond_6

    .line 122
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "IV must be at least 1 byte"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 103
    :cond_3
    instance-of v0, p2, Lorg/spongycastle/crypto/params/ParametersWithIV;

    if-eqz v0, :cond_4

    .line 105
    check-cast p2, Lorg/spongycastle/crypto/params/ParametersWithIV;

    .line 107
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithIV;->a()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->f:[B

    .line 108
    iput-object v2, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->g:[B

    .line 109
    iput v1, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->e:I

    .line 110
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithIV;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/KeyParameter;

    move-object v2, v0

    .line 111
    goto :goto_0

    .line 114
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid parameters passed to GCM"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 117
    :cond_5
    iget v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->e:I

    add-int/lit8 v0, v0, 0x10

    goto :goto_1

    .line 125
    :cond_6
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->g:[B

    if-nez v0, :cond_7

    .line 128
    new-array v0, v6, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->g:[B

    .line 133
    :cond_7
    if-eqz v2, :cond_8

    .line 135
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0, v4, v2}, Lorg/spongycastle/crypto/BlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 142
    :cond_8
    new-array v0, v1, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->h:[B

    .line 143
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    sget-object v2, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->a:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->h:[B

    invoke-interface {v0, v2, v6, v3, v6}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    .line 144
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->c:Lorg/spongycastle/crypto/modes/gcm/GCMMultiplier;

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->h:[B

    invoke-interface {v0, v2}, Lorg/spongycastle/crypto/modes/gcm/GCMMultiplier;->a([B)V

    .line 146
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->g:[B

    invoke-direct {p0, v0}, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->a([B)[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->i:[B

    .line 148
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->f:[B

    array-length v0, v0

    const/16 v2, 0xc

    if-ne v0, v2, :cond_9

    .line 150
    new-array v0, v1, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->j:[B

    .line 151
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->f:[B

    iget-object v1, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->j:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->f:[B

    array-length v2, v2

    invoke-static {v0, v6, v1, v6, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 152
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->j:[B

    const/16 v1, 0xf

    aput-byte v4, v0, v1

    .line 163
    :goto_2
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->i:[B

    invoke-static {v0}, Lorg/spongycastle/util/Arrays;->b([B)[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->m:[B

    .line 164
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->j:[B

    invoke-static {v0}, Lorg/spongycastle/util/Arrays;->b([B)[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->n:[B

    .line 165
    iput v6, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->o:I

    .line 166
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->p:J

    .line 167
    return-void

    .line 156
    :cond_9
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->f:[B

    invoke-direct {p0, v0}, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->a([B)[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->j:[B

    .line 157
    new-array v0, v1, [B

    .line 158
    iget-object v1, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->f:[B

    array-length v1, v1

    int-to-long v2, v1

    const-wide/16 v4, 0x8

    mul-long/2addr v2, v4

    const/16 v1, 0x8

    invoke-static {v2, v3, v0, v1}, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->a(J[BI)V

    .line 159
    iget-object v1, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->j:[B

    invoke-static {v1, v0}, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->a([B[B)V

    .line 160
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->c:Lorg/spongycastle/crypto/modes/gcm/GCMMultiplier;

    iget-object v1, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->j:[B

    invoke-interface {v0, v1}, Lorg/spongycastle/crypto/modes/gcm/GCMMultiplier;->b([B)V

    goto :goto_2
.end method

.method public final b(I)I
    .locals 2

    .prologue
    .line 176
    iget-boolean v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->d:Z

    if-eqz v0, :cond_0

    .line 178
    iget v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->o:I

    add-int/2addr v0, p1

    iget v1, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->e:I

    add-int/2addr v0, v1

    .line 181
    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->o:I

    add-int/2addr v0, p1

    iget v1, p0, Lorg/spongycastle/crypto/modes/GCMBlockCipher;->e:I

    sub-int/2addr v0, v1

    goto :goto_0
.end method
