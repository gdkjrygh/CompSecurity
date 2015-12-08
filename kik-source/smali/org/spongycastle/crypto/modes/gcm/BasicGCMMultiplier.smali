.class public Lorg/spongycastle/crypto/modes/gcm/BasicGCMMultiplier;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/modes/gcm/GCMMultiplier;


# instance fields
.field private a:[B


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a([B)V
    .locals 1

    .prologue
    .line 11
    invoke-static {p1}, Lorg/spongycastle/util/Arrays;->b([B)[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/gcm/BasicGCMMultiplier;->a:[B

    .line 12
    return-void
.end method

.method public final b([B)V
    .locals 11

    .prologue
    .line 16
    iget-object v5, p0, Lorg/spongycastle/crypto/modes/gcm/BasicGCMMultiplier;->a:[B

    invoke-static {p1}, Lorg/spongycastle/util/Arrays;->b([B)[B

    move-result-object v6

    const/16 v0, 0x10

    new-array v7, v0, [B

    const/4 v0, 0x0

    move v4, v0

    :goto_0
    const/16 v0, 0x10

    if-ge v4, v0, :cond_5

    aget-byte v8, v5, v4

    const/4 v0, 0x7

    move v3, v0

    :goto_1
    if-ltz v3, :cond_4

    const/4 v0, 0x1

    shl-int/2addr v0, v3

    and-int/2addr v0, v8

    if-eqz v0, :cond_0

    const/16 v0, 0xf

    :goto_2
    if-ltz v0, :cond_0

    aget-byte v1, v7, v0

    aget-byte v2, v6, v0

    xor-int/2addr v1, v2

    int-to-byte v1, v1

    aput-byte v1, v7, v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    :cond_0
    const/16 v0, 0xf

    aget-byte v0, v6, v0

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_3
    const/4 v2, 0x0

    const/4 v1, 0x0

    :goto_4
    aget-byte v9, v6, v2

    and-int/lit16 v9, v9, 0xff

    ushr-int/lit8 v10, v9, 0x1

    or-int/2addr v1, v10

    int-to-byte v1, v1

    aput-byte v1, v6, v2

    add-int/lit8 v2, v2, 0x1

    const/16 v1, 0x10

    if-eq v2, v1, :cond_2

    and-int/lit8 v1, v9, 0x1

    shl-int/lit8 v1, v1, 0x7

    goto :goto_4

    :cond_1
    const/4 v0, 0x0

    goto :goto_3

    :cond_2
    if-eqz v0, :cond_3

    const/4 v0, 0x0

    aget-byte v1, v6, v0

    xor-int/lit8 v1, v1, -0x1f

    int-to-byte v1, v1

    aput-byte v1, v6, v0

    :cond_3
    add-int/lit8 v0, v3, -0x1

    move v3, v0

    goto :goto_1

    :cond_4
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_0

    :cond_5
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/16 v2, 0x10

    invoke-static {v7, v0, p1, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 17
    return-void
.end method
