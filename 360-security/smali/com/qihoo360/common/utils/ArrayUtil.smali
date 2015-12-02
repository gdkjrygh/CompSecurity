.class public Lcom/qihoo360/common/utils/ArrayUtil;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static endsWith([B[B)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 28
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    .line 29
    array-length v0, p0

    array-length v2, p1

    if-lt v0, v2, :cond_0

    move v0, v1

    .line 30
    :goto_0
    array-length v2, p1

    if-lt v0, v2, :cond_1

    .line 34
    const/4 v1, 0x1

    .line 39
    :cond_0
    return v1

    .line 31
    :cond_1
    array-length v2, p0

    add-int/lit8 v2, v2, -0x1

    sub-int/2addr v2, v0

    aget-byte v2, p0, v2

    array-length v3, p1

    add-int/lit8 v3, v3, -0x1

    sub-int/2addr v3, v0

    aget-byte v3, p1, v3

    if-ne v2, v3, :cond_0

    .line 30
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public static startsWith([B[B)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 12
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    .line 13
    array-length v0, p0

    array-length v2, p1

    if-lt v0, v2, :cond_0

    move v0, v1

    .line 14
    :goto_0
    array-length v2, p1

    if-lt v0, v2, :cond_1

    .line 18
    const/4 v1, 0x1

    .line 23
    :cond_0
    return v1

    .line 15
    :cond_1
    aget-byte v2, p0, v0

    aget-byte v3, p1, v0

    if-ne v2, v3, :cond_0

    .line 14
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
