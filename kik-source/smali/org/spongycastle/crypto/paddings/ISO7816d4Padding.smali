.class public Lorg/spongycastle/crypto/paddings/ISO7816d4Padding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/paddings/BlockCipherPadding;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a([B)I
    .locals 3

    .prologue
    .line 63
    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    .line 65
    :goto_0
    if-lez v0, :cond_0

    aget-byte v1, p1, v0

    if-nez v1, :cond_0

    .line 67
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 70
    :cond_0
    aget-byte v1, p1, v0

    const/16 v2, -0x80

    if-eq v1, v2, :cond_1

    .line 72
    new-instance v0, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v1, "pad block corrupted"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 75
    :cond_1
    array-length v1, p1

    sub-int v0, v1, v0

    return v0
.end method

.method public final a([BI)I
    .locals 3

    .prologue
    .line 43
    array-length v0, p1

    sub-int v1, v0, p2

    .line 45
    const/16 v0, -0x80

    aput-byte v0, p1, p2

    .line 46
    add-int/lit8 v0, p2, 0x1

    .line 48
    :goto_0
    array-length v2, p1

    if-ge v0, v2, :cond_0

    .line 50
    const/4 v2, 0x0

    aput-byte v2, p1, v0

    .line 51
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 54
    :cond_0
    return v1
.end method

.method public final a(Ljava/security/SecureRandom;)V
    .locals 0

    .prologue
    .line 23
    return-void
.end method
