.class public Lorg/bouncycastle/crypto/params/DESedeParameters;
.super Lorg/bouncycastle/crypto/params/DESParameters;


# direct methods
.method public constructor <init>([B)V
    .locals 2

    invoke-direct {p0, p1}, Lorg/bouncycastle/crypto/params/DESParameters;-><init>([B)V

    const/4 v0, 0x0

    array-length v1, p1

    invoke-static {p1, v0, v1}, Lorg/bouncycastle/crypto/params/DESedeParameters;->isWeakKey([BII)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "attempt to create weak DESede key"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method public static isWeakKey([BI)Z
    .locals 1

    array-length v0, p0

    sub-int/2addr v0, p1

    invoke-static {p0, p1, v0}, Lorg/bouncycastle/crypto/params/DESedeParameters;->isWeakKey([BII)Z

    move-result v0

    return v0
.end method

.method public static isWeakKey([BII)Z
    .locals 1

    :goto_0
    if-ge p1, p2, :cond_1

    invoke-static {p0, p1}, Lorg/bouncycastle/crypto/params/DESParameters;->isWeakKey([BI)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_1
    return v0

    :cond_0
    add-int/lit8 p1, p1, 0x8

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method
