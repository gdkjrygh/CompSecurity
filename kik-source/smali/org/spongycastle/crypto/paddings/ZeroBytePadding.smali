.class public Lorg/spongycastle/crypto/paddings/ZeroBytePadding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/paddings/BlockCipherPadding;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a([B)I
    .locals 2

    .prologue
    .line 59
    array-length v0, p1

    .line 61
    :goto_0
    if-lez v0, :cond_0

    .line 63
    add-int/lit8 v1, v0, -0x1

    aget-byte v1, p1, v1

    if-nez v1, :cond_0

    .line 65
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 71
    :cond_0
    array-length v1, p1

    sub-int v0, v1, v0

    return v0
.end method

.method public final a([BI)I
    .locals 2

    .prologue
    .line 42
    array-length v0, p1

    sub-int/2addr v0, p2

    .line 44
    :goto_0
    array-length v1, p1

    if-ge p2, v1, :cond_0

    .line 46
    const/4 v1, 0x0

    aput-byte v1, p1, p2

    .line 47
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 50
    :cond_0
    return v0
.end method

.method public final a(Ljava/security/SecureRandom;)V
    .locals 0

    .prologue
    .line 22
    return-void
.end method
