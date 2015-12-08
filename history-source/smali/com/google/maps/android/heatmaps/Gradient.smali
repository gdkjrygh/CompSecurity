.class public Lcom/google/maps/android/heatmaps/Gradient;
.super Ljava/lang/Object;
.source "Gradient.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/maps/android/heatmaps/Gradient$1;,
        Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;
    }
.end annotation


# static fields
.field private static final DEFAULT_COLOR_MAP_SIZE:I = 0x3e8


# instance fields
.field public final mColorMapSize:I

.field public mColors:[I

.field public mStartPoints:[F


# direct methods
.method public constructor <init>([I[F)V
    .locals 1
    .param p1, "colors"    # [I
    .param p2, "startPoints"    # [F

    .prologue
    .line 73
    const/16 v0, 0x3e8

    invoke-direct {p0, p1, p2, v0}, Lcom/google/maps/android/heatmaps/Gradient;-><init>([I[FI)V

    .line 74
    return-void
.end method

.method public constructor <init>([I[FI)V
    .locals 4
    .param p1, "colors"    # [I
    .param p2, "startPoints"    # [F
    .param p3, "colorMapSize"    # I

    .prologue
    const/4 v3, 0x0

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    array-length v1, p1

    array-length v2, p2

    if-eq v1, v2, :cond_0

    .line 87
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "colors and startPoints should be same length"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 88
    :cond_0
    array-length v1, p1

    if-nez v1, :cond_1

    .line 89
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "No colors have been defined"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 91
    :cond_1
    const/4 v0, 0x1

    .local v0, "i":I
    :goto_0
    array-length v1, p2

    if-ge v0, v1, :cond_3

    .line 92
    aget v1, p2, v0

    add-int/lit8 v2, v0, -0x1

    aget v2, p2, v2

    cmpg-float v1, v1, v2

    if-gtz v1, :cond_2

    .line 93
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "startPoints should be in increasing order"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 91
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 96
    :cond_3
    iput p3, p0, Lcom/google/maps/android/heatmaps/Gradient;->mColorMapSize:I

    .line 97
    array-length v1, p1

    new-array v1, v1, [I

    iput-object v1, p0, Lcom/google/maps/android/heatmaps/Gradient;->mColors:[I

    .line 98
    array-length v1, p2

    new-array v1, v1, [F

    iput-object v1, p0, Lcom/google/maps/android/heatmaps/Gradient;->mStartPoints:[F

    .line 99
    iget-object v1, p0, Lcom/google/maps/android/heatmaps/Gradient;->mColors:[I

    array-length v2, p1

    invoke-static {p1, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 100
    iget-object v1, p0, Lcom/google/maps/android/heatmaps/Gradient;->mStartPoints:[F

    array-length v2, p2

    invoke-static {p2, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 101
    return-void
.end method

.method private generateColorIntervals()Ljava/util/HashMap;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;",
            ">;"
        }
    .end annotation

    .prologue
    const/high16 v14, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    const/4 v7, 0x0

    .line 104
    new-instance v12, Ljava/util/HashMap;

    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    .line 107
    .local v12, "colorIntervals":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/Integer;Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;>;"
    iget-object v0, p0, Lcom/google/maps/android/heatmaps/Gradient;->mStartPoints:[F

    aget v0, v0, v7

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    .line 108
    iget-object v0, p0, Lcom/google/maps/android/heatmaps/Gradient;->mColors:[I

    aget v0, v0, v7

    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/maps/android/heatmaps/Gradient;->mColors:[I

    aget v1, v1, v7

    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    move-result v1

    iget-object v3, p0, Lcom/google/maps/android/heatmaps/Gradient;->mColors:[I

    aget v3, v3, v7

    invoke-static {v3}, Landroid/graphics/Color;->blue(I)I

    move-result v3

    invoke-static {v7, v0, v1, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    .line 110
    .local v2, "initialColor":I
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-instance v0, Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;

    iget-object v1, p0, Lcom/google/maps/android/heatmaps/Gradient;->mColors:[I

    aget v3, v1, v7

    iget v1, p0, Lcom/google/maps/android/heatmaps/Gradient;->mColorMapSize:I

    int-to-float v1, v1

    iget-object v4, p0, Lcom/google/maps/android/heatmaps/Gradient;->mStartPoints:[F

    aget v4, v4, v7

    mul-float/2addr v4, v1

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;-><init>(Lcom/google/maps/android/heatmaps/Gradient;IIFLcom/google/maps/android/heatmaps/Gradient$1;)V

    invoke-virtual {v12, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .end local v2    # "initialColor":I
    :cond_0
    const/4 v13, 0x1

    .local v13, "i":I
    :goto_0
    iget-object v0, p0, Lcom/google/maps/android/heatmaps/Gradient;->mColors:[I

    array-length v0, v0

    if-ge v13, v0, :cond_1

    .line 114
    iget v0, p0, Lcom/google/maps/android/heatmaps/Gradient;->mColorMapSize:I

    int-to-float v0, v0

    iget-object v1, p0, Lcom/google/maps/android/heatmaps/Gradient;->mStartPoints:[F

    add-int/lit8 v3, v13, -0x1

    aget v1, v1, v3

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v6, Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;

    iget-object v1, p0, Lcom/google/maps/android/heatmaps/Gradient;->mColors:[I

    add-int/lit8 v3, v13, -0x1

    aget v8, v1, v3

    iget-object v1, p0, Lcom/google/maps/android/heatmaps/Gradient;->mColors:[I

    aget v9, v1, v13

    iget v1, p0, Lcom/google/maps/android/heatmaps/Gradient;->mColorMapSize:I

    int-to-float v1, v1

    iget-object v3, p0, Lcom/google/maps/android/heatmaps/Gradient;->mStartPoints:[F

    aget v3, v3, v13

    iget-object v4, p0, Lcom/google/maps/android/heatmaps/Gradient;->mStartPoints:[F

    add-int/lit8 v7, v13, -0x1

    aget v4, v4, v7

    sub-float/2addr v3, v4

    mul-float v10, v1, v3

    move-object v7, p0

    move-object v11, v5

    invoke-direct/range {v6 .. v11}, Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;-><init>(Lcom/google/maps/android/heatmaps/Gradient;IIFLcom/google/maps/android/heatmaps/Gradient$1;)V

    invoke-virtual {v12, v0, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    .line 120
    :cond_1
    iget-object v0, p0, Lcom/google/maps/android/heatmaps/Gradient;->mStartPoints:[F

    iget-object v1, p0, Lcom/google/maps/android/heatmaps/Gradient;->mStartPoints:[F

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    cmpl-float v0, v0, v14

    if-eqz v0, :cond_2

    .line 121
    iget-object v0, p0, Lcom/google/maps/android/heatmaps/Gradient;->mStartPoints:[F

    array-length v0, v0

    add-int/lit8 v13, v0, -0x1

    .line 122
    iget v0, p0, Lcom/google/maps/android/heatmaps/Gradient;->mColorMapSize:I

    int-to-float v0, v0

    iget-object v1, p0, Lcom/google/maps/android/heatmaps/Gradient;->mStartPoints:[F

    aget v1, v1, v13

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v6, Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;

    iget-object v1, p0, Lcom/google/maps/android/heatmaps/Gradient;->mColors:[I

    aget v8, v1, v13

    iget-object v1, p0, Lcom/google/maps/android/heatmaps/Gradient;->mColors:[I

    aget v9, v1, v13

    iget v1, p0, Lcom/google/maps/android/heatmaps/Gradient;->mColorMapSize:I

    int-to-float v1, v1

    iget-object v3, p0, Lcom/google/maps/android/heatmaps/Gradient;->mStartPoints:[F

    aget v3, v3, v13

    sub-float v3, v14, v3

    mul-float v10, v1, v3

    move-object v7, p0

    move-object v11, v5

    invoke-direct/range {v6 .. v11}, Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;-><init>(Lcom/google/maps/android/heatmaps/Gradient;IIFLcom/google/maps/android/heatmaps/Gradient$1;)V

    invoke-virtual {v12, v0, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    :cond_2
    return-object v12
.end method

.method static interpolateColor(IIF)I
    .locals 12
    .param p0, "color1"    # I
    .param p1, "color2"    # I
    .param p2, "ratio"    # F

    .prologue
    const/high16 v11, 0x43b40000    # 360.0f

    const/high16 v10, 0x43340000    # 180.0f

    const/4 v9, 0x3

    const/4 v8, 0x0

    .line 170
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v5

    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    move-result v6

    sub-int/2addr v5, v6

    int-to-float v5, v5

    mul-float/2addr v5, p2

    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    move-result v6

    int-to-float v6, v6

    add-float/2addr v5, v6

    float-to-int v0, v5

    .line 172
    .local v0, "alpha":I
    new-array v1, v9, [F

    .line 173
    .local v1, "hsv1":[F
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    move-result v5

    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    move-result v6

    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    move-result v7

    invoke-static {v5, v6, v7, v1}, Landroid/graphics/Color;->RGBToHSV(III[F)V

    .line 174
    new-array v2, v9, [F

    .line 175
    .local v2, "hsv2":[F
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v5

    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v6

    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result v7

    invoke-static {v5, v6, v7, v2}, Landroid/graphics/Color;->RGBToHSV(III[F)V

    .line 178
    aget v5, v1, v8

    aget v6, v2, v8

    sub-float/2addr v5, v6

    cmpl-float v5, v5, v10

    if-lez v5, :cond_1

    .line 179
    aget v5, v2, v8

    add-float/2addr v5, v11

    aput v5, v2, v8

    .line 185
    :cond_0
    :goto_0
    new-array v4, v9, [F

    .line 186
    .local v4, "result":[F
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_1
    if-ge v3, v9, :cond_2

    .line 187
    aget v5, v2, v3

    aget v6, v1, v3

    sub-float/2addr v5, v6

    mul-float/2addr v5, p2

    aget v6, v1, v3

    add-float/2addr v5, v6

    aput v5, v4, v3

    .line 186
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 180
    .end local v3    # "i":I
    .end local v4    # "result":[F
    :cond_1
    aget v5, v2, v8

    aget v6, v1, v8

    sub-float/2addr v5, v6

    cmpl-float v5, v5, v10

    if-lez v5, :cond_0

    .line 181
    aget v5, v1, v8

    add-float/2addr v5, v11

    aput v5, v1, v8

    goto :goto_0

    .line 190
    .restart local v3    # "i":I
    .restart local v4    # "result":[F
    :cond_2
    invoke-static {v0, v4}, Landroid/graphics/Color;->HSVToColor(I[F)I

    move-result v5

    return v5
.end method


# virtual methods
.method generateColorMap(D)[I
    .locals 11
    .param p1, "opacity"    # D

    .prologue
    .line 136
    invoke-direct {p0}, Lcom/google/maps/android/heatmaps/Gradient;->generateColorIntervals()Ljava/util/HashMap;

    move-result-object v1

    .line 137
    .local v1, "colorIntervals":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/Integer;Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;>;"
    iget v7, p0, Lcom/google/maps/android/heatmaps/Gradient;->mColorMapSize:I

    new-array v2, v7, [I

    .line 138
    .local v2, "colorMap":[I
    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;

    .line 139
    .local v4, "interval":Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;
    const/4 v6, 0x0

    .line 140
    .local v6, "start":I
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    iget v7, p0, Lcom/google/maps/android/heatmaps/Gradient;->mColorMapSize:I

    if-ge v3, v7, :cond_1

    .line 141
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 142
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .end local v4    # "interval":Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;
    check-cast v4, Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;

    .line 143
    .restart local v4    # "interval":Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;
    move v6, v3

    .line 145
    :cond_0
    sub-int v7, v3, v6

    int-to-float v7, v7

    # getter for: Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;->duration:F
    invoke-static {v4}, Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;->access$100(Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;)F

    move-result v8

    div-float v5, v7, v8

    .line 146
    .local v5, "ratio":F
    # getter for: Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;->color1:I
    invoke-static {v4}, Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;->access$200(Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;)I

    move-result v7

    # getter for: Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;->color2:I
    invoke-static {v4}, Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;->access$300(Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;)I

    move-result v8

    invoke-static {v7, v8, v5}, Lcom/google/maps/android/heatmaps/Gradient;->interpolateColor(IIF)I

    move-result v7

    aput v7, v2, v3

    .line 140
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 148
    .end local v5    # "ratio":F
    :cond_1
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    cmpl-double v7, p1, v7

    if-eqz v7, :cond_2

    .line 149
    const/4 v3, 0x0

    :goto_1
    iget v7, p0, Lcom/google/maps/android/heatmaps/Gradient;->mColorMapSize:I

    if-ge v3, v7, :cond_2

    .line 150
    aget v0, v2, v3

    .line 151
    .local v0, "c":I
    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v7

    int-to-double v7, v7

    mul-double/2addr v7, p1

    double-to-int v7, v7

    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    move-result v8

    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    move-result v9

    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    move-result v10

    invoke-static {v7, v8, v9, v10}, Landroid/graphics/Color;->argb(IIII)I

    move-result v7

    aput v7, v2, v3

    .line 149
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 156
    .end local v0    # "c":I
    :cond_2
    return-object v2
.end method
