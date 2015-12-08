.class public Lorg/bouncycastle/crypto/modes/gcm/Tables64kGCMMultiplier;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/modes/gcm/GCMMultiplier;


# instance fields
.field private final a:[[[I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    const/16 v1, 0x100

    filled-new-array {v0, v1}, [I

    move-result-object v0

    const-class v1, [I

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[[I

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/gcm/Tables64kGCMMultiplier;->a:[[[I

    return-void
.end method


# virtual methods
.method public init([B)V
    .locals 9

    const/16 v3, 0x80

    const/4 v8, 0x4

    const/4 v1, 0x0

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/gcm/Tables64kGCMMultiplier;->a:[[[I

    aget-object v0, v0, v1

    new-array v2, v8, [I

    aput-object v2, v0, v1

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/gcm/Tables64kGCMMultiplier;->a:[[[I

    aget-object v0, v0, v1

    invoke-static {p1}, Lorg/bouncycastle/crypto/modes/gcm/a;->asInts([B)[I

    move-result-object v2

    aput-object v2, v0, v3

    const/16 v0, 0x40

    :goto_0
    if-lez v0, :cond_0

    new-array v2, v8, [I

    iget-object v4, p0, Lorg/bouncycastle/crypto/modes/gcm/Tables64kGCMMultiplier;->a:[[[I

    aget-object v4, v4, v1

    add-int v5, v0, v0

    aget-object v4, v4, v5

    invoke-static {v4, v1, v2, v1, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v2}, Lorg/bouncycastle/crypto/modes/gcm/a;->multiplyP([I)V

    iget-object v4, p0, Lorg/bouncycastle/crypto/modes/gcm/Tables64kGCMMultiplier;->a:[[[I

    aget-object v4, v4, v1

    aput-object v2, v4, v0

    shr-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :cond_1
    const/4 v2, 0x2

    move v4, v2

    :goto_1
    const/16 v2, 0x100

    if-ge v4, v2, :cond_3

    const/4 v2, 0x1

    :goto_2
    if-ge v2, v4, :cond_2

    new-array v5, v8, [I

    iget-object v6, p0, Lorg/bouncycastle/crypto/modes/gcm/Tables64kGCMMultiplier;->a:[[[I

    aget-object v6, v6, v0

    aget-object v6, v6, v4

    invoke-static {v6, v1, v5, v1, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v6, p0, Lorg/bouncycastle/crypto/modes/gcm/Tables64kGCMMultiplier;->a:[[[I

    aget-object v6, v6, v0

    aget-object v6, v6, v2

    invoke-static {v5, v6}, Lorg/bouncycastle/crypto/modes/gcm/a;->xor([I[I)V

    iget-object v6, p0, Lorg/bouncycastle/crypto/modes/gcm/Tables64kGCMMultiplier;->a:[[[I

    aget-object v6, v6, v0

    add-int v7, v4, v2

    aput-object v5, v6, v7

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    add-int v2, v4, v4

    move v4, v2

    goto :goto_1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    const/16 v2, 0x10

    if-ne v0, v2, :cond_4

    return-void

    :cond_4
    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/gcm/Tables64kGCMMultiplier;->a:[[[I

    aget-object v2, v2, v0

    new-array v4, v8, [I

    aput-object v4, v2, v1

    move v2, v3

    :goto_3
    if-lez v2, :cond_1

    new-array v4, v8, [I

    iget-object v5, p0, Lorg/bouncycastle/crypto/modes/gcm/Tables64kGCMMultiplier;->a:[[[I

    add-int/lit8 v6, v0, -0x1

    aget-object v5, v5, v6

    aget-object v5, v5, v2

    invoke-static {v5, v1, v4, v1, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v4}, Lorg/bouncycastle/crypto/modes/gcm/a;->multiplyP8([I)V

    iget-object v5, p0, Lorg/bouncycastle/crypto/modes/gcm/Tables64kGCMMultiplier;->a:[[[I

    aget-object v5, v5, v0

    aput-object v4, v5, v2

    shr-int/lit8 v2, v2, 0x1

    goto :goto_3
.end method

.method public multiplyH([B)V
    .locals 10

    const/4 v9, 0x4

    const/4 v8, 0x3

    const/4 v7, 0x2

    const/4 v6, 0x1

    const/4 v5, 0x0

    new-array v1, v9, [I

    const/16 v0, 0xf

    :goto_0
    if-ltz v0, :cond_0

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/gcm/Tables64kGCMMultiplier;->a:[[[I

    aget-object v2, v2, v0

    aget-byte v3, p1, v0

    and-int/lit16 v3, v3, 0xff

    aget-object v2, v2, v3

    aget v3, v1, v5

    aget v4, v2, v5

    xor-int/2addr v3, v4

    aput v3, v1, v5

    aget v3, v1, v6

    aget v4, v2, v6

    xor-int/2addr v3, v4

    aput v3, v1, v6

    aget v3, v1, v7

    aget v4, v2, v7

    xor-int/2addr v3, v4

    aput v3, v1, v7

    aget v3, v1, v8

    aget v2, v2, v8

    xor-int/2addr v2, v3

    aput v2, v1, v8

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    aget v0, v1, v5

    invoke-static {v0, p1, v5}, Lorg/bouncycastle/crypto/util/Pack;->intToBigEndian(I[BI)V

    aget v0, v1, v6

    invoke-static {v0, p1, v9}, Lorg/bouncycastle/crypto/util/Pack;->intToBigEndian(I[BI)V

    aget v0, v1, v7

    const/16 v2, 0x8

    invoke-static {v0, p1, v2}, Lorg/bouncycastle/crypto/util/Pack;->intToBigEndian(I[BI)V

    aget v0, v1, v8

    const/16 v1, 0xc

    invoke-static {v0, p1, v1}, Lorg/bouncycastle/crypto/util/Pack;->intToBigEndian(I[BI)V

    return-void
.end method
