.class Lcom/google/maps/android/MathUtil;
.super Ljava/lang/Object;
.source "MathUtil.java"


# static fields
.field static final EARTH_RADIUS:D = 6371009.0


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static arcHav(D)D
    .locals 4
    .param p0, "x"    # D

    .prologue
    .line 87
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    invoke-static {p0, p1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->asin(D)D

    move-result-wide v2

    mul-double/2addr v0, v2

    return-wide v0
.end method

.method static clamp(DDD)D
    .locals 1
    .param p0, "x"    # D
    .param p2, "low"    # D
    .param p4, "high"    # D

    .prologue
    .line 35
    cmpg-double v0, p0, p2

    if-gez v0, :cond_0

    .end local p2    # "low":D
    :goto_0
    return-wide p2

    .restart local p2    # "low":D
    :cond_0
    cmpl-double v0, p0, p4

    if-lez v0, :cond_1

    move-wide p2, p4

    goto :goto_0

    :cond_1
    move-wide p2, p0

    goto :goto_0
.end method

.method static hav(D)D
    .locals 4
    .param p0, "x"    # D

    .prologue
    .line 77
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    mul-double/2addr v2, p0

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    .line 78
    .local v0, "sinHalf":D
    mul-double v2, v0, v0

    return-wide v2
.end method

.method static havDistance(DDD)D
    .locals 6
    .param p0, "lat1"    # D
    .param p2, "lat2"    # D
    .param p4, "dLng"    # D

    .prologue
    .line 112
    sub-double v0, p0, p2

    invoke-static {v0, v1}, Lcom/google/maps/android/MathUtil;->hav(D)D

    move-result-wide v0

    invoke-static {p4, p5}, Lcom/google/maps/android/MathUtil;->hav(D)D

    move-result-wide v2

    invoke-static {p0, p1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    invoke-static {p2, p3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    return-wide v0
.end method

.method static havFromSin(D)D
    .locals 6
    .param p0, "x"    # D

    .prologue
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 97
    mul-double v0, p0, p0

    .line 98
    .local v0, "x2":D
    sub-double v2, v4, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    add-double/2addr v2, v4

    div-double v2, v0, v2

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    mul-double/2addr v2, v4

    return-wide v2
.end method

.method static inverseMercator(D)D
    .locals 4
    .param p0, "y"    # D

    .prologue
    .line 69
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    invoke-static {p0, p1}, Ljava/lang/Math;->exp(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->atan(D)D

    move-result-wide v2

    mul-double/2addr v0, v2

    const-wide v2, 0x3ff921fb54442d18L    # 1.5707963267948966

    sub-double/2addr v0, v2

    return-wide v0
.end method

.method static mercator(D)D
    .locals 4
    .param p0, "lat"    # D

    .prologue
    .line 62
    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    mul-double/2addr v0, p0

    const-wide v2, 0x3fe921fb54442d18L    # 0.7853981633974483

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->tan(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    return-wide v0
.end method

.method static mod(DD)D
    .locals 2
    .param p0, "x"    # D
    .param p2, "m"    # D

    .prologue
    .line 54
    rem-double v0, p0, p2

    add-double/2addr v0, p2

    rem-double/2addr v0, p2

    return-wide v0
.end method

.method static sinFromHav(D)D
    .locals 4
    .param p0, "h"    # D

    .prologue
    .line 92
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v2, p0

    mul-double/2addr v2, p0

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    mul-double/2addr v0, v2

    return-wide v0
.end method

.method static sinSumFromHav(DD)D
    .locals 12
    .param p0, "x"    # D
    .param p2, "y"    # D

    .prologue
    const-wide/high16 v10, 0x4000000000000000L    # 2.0

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    .line 103
    sub-double v4, v6, p0

    mul-double/2addr v4, p0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    .line 104
    .local v0, "a":D
    sub-double v4, v6, p2

    mul-double/2addr v4, p2

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    .line 105
    .local v2, "b":D
    add-double v4, v0, v2

    mul-double v6, v0, p2

    mul-double v8, v2, p0

    add-double/2addr v6, v8

    mul-double/2addr v6, v10

    sub-double/2addr v4, v6

    mul-double/2addr v4, v10

    return-wide v4
.end method

.method static wrap(DDD)D
    .locals 4
    .param p0, "n"    # D
    .param p2, "min"    # D
    .param p4, "max"    # D

    .prologue
    .line 45
    cmpl-double v0, p0, p2

    if-ltz v0, :cond_0

    cmpg-double v0, p0, p4

    if-gez v0, :cond_0

    .end local p0    # "n":D
    :goto_0
    return-wide p0

    .restart local p0    # "n":D
    :cond_0
    sub-double v0, p0, p2

    sub-double v2, p4, p2

    invoke-static {v0, v1, v2, v3}, Lcom/google/maps/android/MathUtil;->mod(DD)D

    move-result-wide v0

    add-double p0, v0, p2

    goto :goto_0
.end method
