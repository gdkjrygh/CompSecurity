.class public Lorg/spongycastle/crypto/modes/gcm/Tables64kGCMMultiplier;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/modes/gcm/GCMMultiplier;


# instance fields
.field private final a:[[[I


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    const/16 v0, 0x10

    const/16 v1, 0x100

    filled-new-array {v0, v1}, [I

    move-result-object v0

    const-class v1, [I

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[[I

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/gcm/Tables64kGCMMultiplier;->a:[[[I

    return-void
.end method


# virtual methods
.method public final a([B)V
    .locals 9

    .prologue
    const/16 v3, 0x80

    const/4 v8, 0x4

    const/4 v1, 0x0

    .line 12
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/gcm/Tables64kGCMMultiplier;->a:[[[I

    aget-object v0, v0, v1

    new-array v2, v8, [I

    aput-object v2, v0, v1

    .line 13
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/gcm/Tables64kGCMMultiplier;->a:[[[I

    aget-object v0, v0, v1

    invoke-static {p1}, Lorg/spongycastle/crypto/modes/gcm/a;->a([B)[I

    move-result-object v2

    aput-object v2, v0, v3

    .line 14
    const/16 v0, 0x40

    :goto_0
    if-lez v0, :cond_0

    .line 16
    new-array v2, v8, [I

    .line 17
    iget-object v4, p0, Lorg/spongycastle/crypto/modes/gcm/Tables64kGCMMultiplier;->a:[[[I

    aget-object v4, v4, v1

    add-int v5, v0, v0

    aget-object v4, v4, v5

    invoke-static {v4, v1, v2, v1, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 19
    invoke-static {v2}, Lorg/spongycastle/crypto/modes/gcm/a;->a([I)V

    .line 20
    iget-object v4, p0, Lorg/spongycastle/crypto/modes/gcm/Tables64kGCMMultiplier;->a:[[[I

    aget-object v4, v4, v1

    aput-object v2, v4, v0

    .line 14
    shr-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    .line 26
    :cond_1
    const/4 v2, 0x2

    move v4, v2

    :goto_1
    const/16 v2, 0x100

    if-ge v4, v2, :cond_3

    .line 28
    const/4 v2, 0x1

    :goto_2
    if-ge v2, v4, :cond_2

    .line 30
    new-array v5, v8, [I

    .line 31
    iget-object v6, p0, Lorg/spongycastle/crypto/modes/gcm/Tables64kGCMMultiplier;->a:[[[I

    aget-object v6, v6, v0

    aget-object v6, v6, v4

    invoke-static {v6, v1, v5, v1, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 33
    iget-object v6, p0, Lorg/spongycastle/crypto/modes/gcm/Tables64kGCMMultiplier;->a:[[[I

    aget-object v6, v6, v0

    aget-object v6, v6, v2

    invoke-static {v5, v6}, Lorg/spongycastle/crypto/modes/gcm/a;->a([I[I)V

    .line 34
    iget-object v6, p0, Lorg/spongycastle/crypto/modes/gcm/Tables64kGCMMultiplier;->a:[[[I

    aget-object v6, v6, v0

    add-int v7, v4, v2

    aput-object v5, v6, v7

    .line 28
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 26
    :cond_2
    add-int v2, v4, v4

    move v4, v2

    goto :goto_1

    .line 38
    :cond_3
    add-int/lit8 v0, v0, 0x1

    const/16 v2, 0x10

    if-ne v0, v2, :cond_4

    .line 40
    return-void

    .line 43
    :cond_4
    iget-object v2, p0, Lorg/spongycastle/crypto/modes/gcm/Tables64kGCMMultiplier;->a:[[[I

    aget-object v2, v2, v0

    new-array v4, v8, [I

    aput-object v4, v2, v1

    move v2, v3

    .line 44
    :goto_3
    if-lez v2, :cond_1

    .line 46
    new-array v4, v8, [I

    .line 47
    iget-object v5, p0, Lorg/spongycastle/crypto/modes/gcm/Tables64kGCMMultiplier;->a:[[[I

    add-int/lit8 v6, v0, -0x1

    aget-object v5, v5, v6

    aget-object v5, v5, v2

    invoke-static {v5, v1, v4, v1, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 49
    invoke-static {v4}, Lorg/spongycastle/crypto/modes/gcm/a;->b([I)V

    .line 50
    iget-object v5, p0, Lorg/spongycastle/crypto/modes/gcm/Tables64kGCMMultiplier;->a:[[[I

    aget-object v5, v5, v0

    aput-object v4, v5, v2

    .line 44
    shr-int/lit8 v2, v2, 0x1

    goto :goto_3
.end method

.method public final b([B)V
    .locals 9

    .prologue
    const/4 v8, 0x3

    const/4 v7, 0x2

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 59
    const/4 v0, 0x4

    new-array v1, v0, [I

    .line 60
    const/16 v0, 0xf

    :goto_0
    if-ltz v0, :cond_0

    .line 63
    iget-object v2, p0, Lorg/spongycastle/crypto/modes/gcm/Tables64kGCMMultiplier;->a:[[[I

    aget-object v2, v2, v0

    aget-byte v3, p1, v0

    and-int/lit16 v3, v3, 0xff

    aget-object v2, v2, v3

    .line 64
    aget v3, v1, v5

    aget v4, v2, v5

    xor-int/2addr v3, v4

    aput v3, v1, v5

    .line 65
    aget v3, v1, v6

    aget v4, v2, v6

    xor-int/2addr v3, v4

    aput v3, v1, v6

    .line 66
    aget v3, v1, v7

    aget v4, v2, v7

    xor-int/2addr v3, v4

    aput v3, v1, v7

    .line 67
    aget v3, v1, v8

    aget v2, v2, v8

    xor-int/2addr v2, v3

    aput v2, v1, v8

    .line 60
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 70
    :cond_0
    invoke-static {v1, p1, v5}, Lorg/spongycastle/crypto/util/Pack;->a([I[BI)V

    .line 71
    return-void
.end method
