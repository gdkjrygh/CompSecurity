.class public Lcom/googlecode/mp4parser/util/Math;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static gcd(II)I
    .locals 1

    .prologue
    .line 14
    :goto_0
    if-gtz p1, :cond_0

    .line 19
    return p0

    .line 16
    :cond_0
    rem-int v0, p0, p1

    move p0, p1

    move p1, v0

    .line 17
    goto :goto_0
.end method

.method public static gcd(JJ)J
    .locals 2

    .prologue
    .line 5
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-gtz v0, :cond_0

    .line 10
    return-wide p0

    .line 7
    :cond_0
    rem-long v0, p0, p2

    move-wide p0, p2

    move-wide p2, v0

    .line 8
    goto :goto_0
.end method

.method public static lcm(II)I
    .locals 1

    .prologue
    .line 27
    invoke-static {p0, p1}, Lcom/googlecode/mp4parser/util/Math;->gcd(II)I

    move-result v0

    div-int v0, p1, v0

    mul-int/2addr v0, p0

    return v0
.end method

.method public static lcm(JJ)J
    .locals 2

    .prologue
    .line 23
    invoke-static {p0, p1, p2, p3}, Lcom/googlecode/mp4parser/util/Math;->gcd(JJ)J

    move-result-wide v0

    div-long v0, p2, v0

    mul-long/2addr v0, p0

    return-wide v0
.end method
