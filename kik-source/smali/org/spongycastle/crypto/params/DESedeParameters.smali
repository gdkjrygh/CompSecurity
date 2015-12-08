.class public Lorg/spongycastle/crypto/params/DESedeParameters;
.super Lorg/spongycastle/crypto/params/DESParameters;
.source "SourceFile"


# direct methods
.method public static b([BI)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 34
    move v1, v0

    :goto_0
    if-ge v1, p1, :cond_0

    .line 36
    invoke-static {p0, v1}, Lorg/spongycastle/crypto/params/DESParameters;->a([BI)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 38
    const/4 v0, 0x1

    .line 42
    :cond_0
    return v0

    .line 34
    :cond_1
    add-int/lit8 v1, v1, 0x8

    goto :goto_0
.end method
