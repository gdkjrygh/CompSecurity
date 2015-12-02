.class public Lcom/facebook/ui/images/d/b;
.super Ljava/lang/Object;
.source "CropRegionConstraints.java"


# instance fields
.field private final a:F

.field private final b:F

.field private final c:F

.field private final d:Lcom/facebook/ui/images/d/c;


# direct methods
.method constructor <init>(Lcom/facebook/ui/images/d/d;)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    invoke-virtual {p1}, Lcom/facebook/ui/images/d/d;->a()F

    move-result v0

    iput v0, p0, Lcom/facebook/ui/images/d/b;->a:F

    .line 32
    invoke-virtual {p1}, Lcom/facebook/ui/images/d/d;->b()F

    move-result v0

    iput v0, p0, Lcom/facebook/ui/images/d/b;->b:F

    .line 33
    invoke-virtual {p1}, Lcom/facebook/ui/images/d/d;->c()F

    move-result v0

    iput v0, p0, Lcom/facebook/ui/images/d/b;->c:F

    .line 34
    invoke-virtual {p1}, Lcom/facebook/ui/images/d/d;->d()Lcom/facebook/ui/images/d/c;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/images/d/b;->d:Lcom/facebook/ui/images/d/c;

    .line 36
    iget v0, p0, Lcom/facebook/ui/images/d/b;->b:F

    cmpl-float v0, v0, v3

    if-ltz v0, :cond_0

    iget v0, p0, Lcom/facebook/ui/images/d/b;->b:F

    cmpg-float v0, v0, v4

    if-gtz v0, :cond_0

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 37
    iget v0, p0, Lcom/facebook/ui/images/d/b;->c:F

    cmpl-float v0, v0, v3

    if-ltz v0, :cond_1

    iget v0, p0, Lcom/facebook/ui/images/d/b;->c:F

    cmpg-float v0, v0, v4

    if-gtz v0, :cond_1

    :goto_1
    invoke-static {v1}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 38
    iget-object v0, p0, Lcom/facebook/ui/images/d/b;->d:Lcom/facebook/ui/images/d/c;

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    return-void

    :cond_0
    move v0, v2

    .line 36
    goto :goto_0

    :cond_1
    move v1, v2

    .line 37
    goto :goto_1
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 6

    .prologue
    .line 58
    const-string v0, ":"

    invoke-static {v0}, Lcom/google/common/base/Joiner;->on(Ljava/lang/String;)Lcom/google/common/base/Joiner;

    move-result-object v1

    iget v0, p0, Lcom/facebook/ui/images/d/b;->a:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    iget v0, p0, Lcom/facebook/ui/images/d/b;->b:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/4 v0, 0x2

    new-array v4, v0, [Ljava/lang/Object;

    const/4 v0, 0x0

    iget v5, p0, Lcom/facebook/ui/images/d/b;->c:F

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    aput-object v5, v4, v0

    const/4 v5, 0x1

    iget-object v0, p0, Lcom/facebook/ui/images/d/b;->d:Lcom/facebook/ui/images/d/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ui/images/d/b;->d:Lcom/facebook/ui/images/d/c;

    invoke-virtual {v0}, Lcom/facebook/ui/images/d/c;->name()Ljava/lang/String;

    move-result-object v0

    :goto_0
    aput-object v0, v4, v5

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/common/base/Joiner;->join(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public a(Landroid/graphics/Rect;IILandroid/graphics/Rect;)V
    .locals 8

    .prologue
    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    .line 75
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v5

    .line 76
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v2

    .line 79
    int-to-float v0, v5

    int-to-float v1, v2

    div-float v1, v0, v1

    .line 81
    iget-object v0, p0, Lcom/facebook/ui/images/d/b;->d:Lcom/facebook/ui/images/d/c;

    .line 82
    sget-object v4, Lcom/facebook/ui/images/d/c;->DEFAULT:Lcom/facebook/ui/images/d/c;

    if-ne v0, v4, :cond_0

    .line 83
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v4

    if-le v0, v4, :cond_1

    .line 84
    sget-object v0, Lcom/facebook/ui/images/d/c;->CENTER:Lcom/facebook/ui/images/d/c;

    .line 90
    :cond_0
    :goto_0
    iget v4, p0, Lcom/facebook/ui/images/d/b;->a:F

    cmpl-float v1, v1, v4

    if-lez v1, :cond_2

    .line 92
    if-le v5, p2, :cond_9

    .line 93
    int-to-float v1, v2

    iget v4, p0, Lcom/facebook/ui/images/d/b;->a:F

    mul-float/2addr v1, v4

    float-to-int v1, v1

    .line 94
    iget v4, p0, Lcom/facebook/ui/images/d/b;->b:F

    sub-float v4, v6, v4

    int-to-float v6, v5

    mul-float/2addr v4, v6

    float-to-int v4, v4

    .line 95
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    move-result v4

    move v1, v2

    .line 108
    :goto_1
    if-le v5, v4, :cond_5

    .line 109
    sget-object v6, Lcom/facebook/ui/images/d/c;->CENTER:Lcom/facebook/ui/images/d/c;

    if-ne v0, v6, :cond_3

    .line 110
    sub-int/2addr v5, v4

    .line 111
    div-int/lit8 v5, v5, 0x2

    .line 112
    add-int/2addr v4, v5

    .line 126
    :goto_2
    if-le v2, v1, :cond_8

    .line 127
    sget-object v6, Lcom/facebook/ui/images/d/c;->CENTER:Lcom/facebook/ui/images/d/c;

    if-ne v0, v6, :cond_6

    .line 128
    sub-int v0, v2, v1

    .line 129
    div-int/lit8 v2, v0, 0x2

    .line 130
    add-int v0, v2, v1

    move v1, v2

    .line 142
    :goto_3
    iget v2, p1, Landroid/graphics/Rect;->left:I

    add-int/2addr v2, v5

    iget v3, p1, Landroid/graphics/Rect;->top:I

    add-int/2addr v1, v3

    iget v3, p1, Landroid/graphics/Rect;->left:I

    add-int/2addr v3, v4

    iget v4, p1, Landroid/graphics/Rect;->top:I

    add-int/2addr v0, v4

    invoke-virtual {p4, v2, v1, v3, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 143
    return-void

    .line 86
    :cond_1
    sget-object v0, Lcom/facebook/ui/images/d/c;->TOP_OR_LEFT:Lcom/facebook/ui/images/d/c;

    goto :goto_0

    .line 99
    :cond_2
    if-le v2, p3, :cond_9

    .line 100
    int-to-float v1, v5

    iget v4, p0, Lcom/facebook/ui/images/d/b;->a:F

    div-float/2addr v1, v4

    float-to-int v1, v1

    .line 101
    iget v4, p0, Lcom/facebook/ui/images/d/b;->c:F

    sub-float v4, v6, v4

    int-to-float v6, v2

    mul-float/2addr v4, v6

    float-to-int v4, v4

    .line 102
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {p3, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    move v4, v5

    goto :goto_1

    .line 113
    :cond_3
    sget-object v6, Lcom/facebook/ui/images/d/c;->TOP_OR_LEFT:Lcom/facebook/ui/images/d/c;

    if-ne v0, v6, :cond_4

    move v5, v3

    .line 115
    goto :goto_2

    .line 117
    :cond_4
    sub-int v4, v5, v4

    move v7, v5

    move v5, v4

    move v4, v7

    .line 118
    goto :goto_2

    :cond_5
    move v4, v5

    move v5, v3

    .line 122
    goto :goto_2

    .line 131
    :cond_6
    sget-object v6, Lcom/facebook/ui/images/d/c;->TOP_OR_LEFT:Lcom/facebook/ui/images/d/c;

    if-ne v0, v6, :cond_7

    move v0, v1

    move v1, v3

    .line 133
    goto :goto_3

    .line 135
    :cond_7
    sub-int v0, v2, v1

    move v1, v0

    move v0, v2

    .line 136
    goto :goto_3

    :cond_8
    move v0, v2

    move v1, v3

    .line 140
    goto :goto_3

    :cond_9
    move v1, v2

    move v4, v5

    goto :goto_1
.end method
