.class public final Lcom/roidapp/photogrid/release/rh;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/util/Random;

.field private d:Lcom/roidapp/photogrid/release/lc;

.field private e:I

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/release/lc;",
            ">;"
        }
    .end annotation
.end field

.field private g:F

.field private h:I

.field private i:I

.field private j:I


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/rh;->c:Ljava/util/Random;

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/rh;->f:Ljava/util/List;

    .line 23
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/release/rh;->g:F

    .line 26
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/release/rh;->j:I

    .line 727
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/rh;->a:Ljava/util/List;

    .line 728
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/rh;->b:Ljava/util/List;

    .line 28
    iput p1, p0, Lcom/roidapp/photogrid/release/rh;->e:I

    .line 29
    const/16 v0, 0x2710

    div-int/2addr v0, p1

    int-to-float v0, v0

    const v1, 0x402ccccd    # 2.7f

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/rh;->g:F

    .line 30
    const/high16 v0, 0x43910000    # 290.0f

    int-to-float v1, p1

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/rh;->i:I

    .line 31
    return-void
.end method

.method private a(IILcom/roidapp/photogrid/release/lc;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lcom/roidapp/photogrid/release/lc;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/release/lc;",
            ">;"
        }
    .end annotation

    .prologue
    .line 67
    iput-object p3, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    .line 69
    iget v0, p0, Lcom/roidapp/photogrid/release/rh;->e:I

    const/4 v1, 0x4

    if-gt v0, v1, :cond_0

    .line 70
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rh;->c:Ljava/util/Random;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    .line 2108
    :goto_0
    invoke-direct {p0, p2}, Lcom/roidapp/photogrid/release/rh;->b(I)I

    move-result v1

    int-to-float v2, v1

    .line 2109
    invoke-direct {p0, p2}, Lcom/roidapp/photogrid/release/rh;->b(I)I

    move-result v1

    int-to-float v3, v1

    .line 2110
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2111
    packed-switch v0, :pswitch_data_0

    move-object v0, v1

    .line 104
    :goto_1
    return-object v0

    .line 72
    :cond_0
    const/4 v0, 0x2

    if-gt p1, v0, :cond_4

    .line 73
    if-eqz p2, :cond_2

    .line 74
    iget v0, p3, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v1, p3, Lcom/roidapp/photogrid/release/lc;->m:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 75
    const/4 v0, 0x1

    goto :goto_0

    .line 77
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 80
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rh;->c:Ljava/util/Random;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    .line 81
    iget v0, p3, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v1, p3, Lcom/roidapp/photogrid/release/lc;->m:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    .line 82
    const/4 v0, 0x1

    goto :goto_0

    .line 84
    :cond_3
    const/4 v0, 0x0

    goto :goto_0

    .line 87
    :cond_4
    const/4 v0, 0x3

    if-gt p1, v0, :cond_6

    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rh;->c:Ljava/util/Random;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    .line 89
    iget v0, p3, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v1, p3, Lcom/roidapp/photogrid/release/lc;->m:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_5

    .line 90
    const/4 v0, 0x1

    goto :goto_0

    .line 92
    :cond_5
    const/4 v0, 0x0

    goto :goto_0

    .line 95
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rh;->c:Ljava/util/Random;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    .line 96
    iget v0, p3, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v1, p3, Lcom/roidapp/photogrid/release/lc;->m:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_7

    .line 97
    const/4 v0, 0x1

    goto :goto_0

    .line 99
    :cond_7
    const/4 v0, 0x0

    goto :goto_0

    .line 2161
    :pswitch_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2176
    new-instance v1, Lcom/roidapp/photogrid/release/lc;

    invoke-direct {v1}, Lcom/roidapp/photogrid/release/lc;-><init>()V

    .line 2177
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v2, v2, Lcom/roidapp/photogrid/release/lc;->j:F

    iput v2, v1, Lcom/roidapp/photogrid/release/lc;->j:F

    .line 2178
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v2, v2, Lcom/roidapp/photogrid/release/lc;->k:F

    iput v2, v1, Lcom/roidapp/photogrid/release/lc;->k:F

    .line 2179
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v2, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    iput v2, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    .line 2180
    const/high16 v2, 0x42c80000    # 100.0f

    div-float v2, v3, v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v3, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v2, v3

    iput v2, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    .line 2181
    new-instance v2, Landroid/graphics/PointF;

    const/high16 v3, 0x3f000000    # 0.5f

    iget v4, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v3, v4

    const/high16 v4, 0x3f000000    # 0.5f

    iget v5, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v4, v5

    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v2, v1, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    .line 2182
    new-instance v2, Lcom/roidapp/photogrid/release/lc;

    invoke-direct {v2}, Lcom/roidapp/photogrid/release/lc;-><init>()V

    .line 2183
    iget-object v3, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v3, v3, Lcom/roidapp/photogrid/release/lc;->j:F

    iput v3, v2, Lcom/roidapp/photogrid/release/lc;->j:F

    .line 2184
    iget-object v3, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v3, v3, Lcom/roidapp/photogrid/release/lc;->k:F

    iget v4, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    add-float/2addr v3, v4

    iput v3, v2, Lcom/roidapp/photogrid/release/lc;->k:F

    .line 2185
    iget-object v3, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v3, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    iput v3, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    .line 2186
    iget-object v3, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v3, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    iget v4, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    sub-float/2addr v3, v4

    iput v3, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    .line 2187
    new-instance v3, Landroid/graphics/PointF;

    const/high16 v4, 0x3f000000    # 0.5f

    iget v5, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v4, v5

    const/high16 v5, 0x3f000000    # 0.5f

    iget v6, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v5, v6

    invoke-direct {v3, v4, v5}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v3, v2, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    .line 2188
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 2189
    new-instance v4, Landroid/graphics/PointF;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct {v4, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2190
    new-instance v4, Landroid/graphics/PointF;

    iget v5, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    const/4 v6, 0x0

    invoke-direct {v4, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2191
    new-instance v4, Landroid/graphics/PointF;

    iget v5, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v6, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v4, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2192
    new-instance v4, Landroid/graphics/PointF;

    const/4 v5, 0x0

    iget v6, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v4, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2193
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 2194
    new-instance v5, Landroid/graphics/PointF;

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2195
    new-instance v5, Landroid/graphics/PointF;

    iget v6, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    const/4 v7, 0x0

    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2196
    new-instance v5, Landroid/graphics/PointF;

    iget v6, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v7, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2197
    new-instance v5, Landroid/graphics/PointF;

    const/4 v6, 0x0

    iget v7, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2198
    iput-object v3, v1, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 2199
    iput-object v4, v2, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 2200
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2201
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 2205
    :pswitch_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2219
    new-instance v1, Lcom/roidapp/photogrid/release/lc;

    invoke-direct {v1}, Lcom/roidapp/photogrid/release/lc;-><init>()V

    .line 2220
    iget-object v3, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v3, v3, Lcom/roidapp/photogrid/release/lc;->j:F

    iput v3, v1, Lcom/roidapp/photogrid/release/lc;->j:F

    .line 2221
    iget-object v3, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v3, v3, Lcom/roidapp/photogrid/release/lc;->k:F

    iput v3, v1, Lcom/roidapp/photogrid/release/lc;->k:F

    .line 2222
    const/high16 v3, 0x42c80000    # 100.0f

    div-float/2addr v2, v3

    iget-object v3, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v3, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v2, v3

    iput v2, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    .line 2223
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v2, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    iput v2, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    .line 2224
    new-instance v2, Landroid/graphics/PointF;

    const/high16 v3, 0x3f000000    # 0.5f

    iget v4, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v3, v4

    const/high16 v4, 0x3f000000    # 0.5f

    iget v5, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v4, v5

    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v2, v1, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    .line 2225
    new-instance v2, Lcom/roidapp/photogrid/release/lc;

    invoke-direct {v2}, Lcom/roidapp/photogrid/release/lc;-><init>()V

    .line 2226
    iget-object v3, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v3, v3, Lcom/roidapp/photogrid/release/lc;->j:F

    iget v4, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    add-float/2addr v3, v4

    iput v3, v2, Lcom/roidapp/photogrid/release/lc;->j:F

    .line 2227
    iget-object v3, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v3, v3, Lcom/roidapp/photogrid/release/lc;->k:F

    iput v3, v2, Lcom/roidapp/photogrid/release/lc;->k:F

    .line 2228
    iget-object v3, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v3, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v4, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    sub-float/2addr v3, v4

    iput v3, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    .line 2229
    iget-object v3, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v3, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    iput v3, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    .line 2230
    new-instance v3, Landroid/graphics/PointF;

    const/high16 v4, 0x3f000000    # 0.5f

    iget v5, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v4, v5

    const/high16 v5, 0x3f000000    # 0.5f

    iget v6, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v5, v6

    invoke-direct {v3, v4, v5}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v3, v2, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    .line 2231
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 2232
    new-instance v4, Landroid/graphics/PointF;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct {v4, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2233
    new-instance v4, Landroid/graphics/PointF;

    iget v5, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    const/4 v6, 0x0

    invoke-direct {v4, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2234
    new-instance v4, Landroid/graphics/PointF;

    iget v5, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v6, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v4, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2235
    new-instance v4, Landroid/graphics/PointF;

    const/4 v5, 0x0

    iget v6, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v4, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2236
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 2237
    new-instance v5, Landroid/graphics/PointF;

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2238
    new-instance v5, Landroid/graphics/PointF;

    iget v6, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    const/4 v7, 0x0

    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2239
    new-instance v5, Landroid/graphics/PointF;

    iget v6, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v7, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2240
    new-instance v5, Landroid/graphics/PointF;

    const/4 v6, 0x0

    iget v7, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2241
    iput-object v3, v1, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 2242
    iput-object v4, v2, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 2243
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2244
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 2248
    :pswitch_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2262
    new-instance v1, Lcom/roidapp/photogrid/release/lc;

    invoke-direct {v1}, Lcom/roidapp/photogrid/release/lc;-><init>()V

    .line 2263
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->j:F

    iput v4, v1, Lcom/roidapp/photogrid/release/lc;->j:F

    .line 2264
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->k:F

    iput v4, v1, Lcom/roidapp/photogrid/release/lc;->k:F

    .line 2265
    const/high16 v4, 0x42c80000    # 100.0f

    div-float/2addr v2, v4

    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v2, v4

    iput v2, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    .line 2266
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v2, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    iput v2, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    .line 2267
    new-instance v2, Landroid/graphics/PointF;

    const/high16 v4, 0x3f000000    # 0.5f

    iget v5, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v4, v5

    const/high16 v5, 0x3f000000    # 0.5f

    iget v6, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v5, v6

    invoke-direct {v2, v4, v5}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v2, v1, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    .line 2268
    new-instance v2, Lcom/roidapp/photogrid/release/lc;

    invoke-direct {v2}, Lcom/roidapp/photogrid/release/lc;-><init>()V

    .line 2269
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->j:F

    iget v5, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    add-float/2addr v4, v5

    iput v4, v2, Lcom/roidapp/photogrid/release/lc;->j:F

    .line 2270
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->k:F

    iput v4, v2, Lcom/roidapp/photogrid/release/lc;->k:F

    .line 2271
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v5, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    sub-float/2addr v4, v5

    iput v4, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    .line 2272
    const/high16 v4, 0x42c80000    # 100.0f

    div-float/2addr v3, v4

    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v3, v4

    iput v3, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    .line 2273
    new-instance v3, Landroid/graphics/PointF;

    const/high16 v4, 0x3f000000    # 0.5f

    iget v5, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v4, v5

    const/high16 v5, 0x3f000000    # 0.5f

    iget v6, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v5, v6

    invoke-direct {v3, v4, v5}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v3, v2, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    .line 2274
    new-instance v3, Lcom/roidapp/photogrid/release/lc;

    invoke-direct {v3}, Lcom/roidapp/photogrid/release/lc;-><init>()V

    .line 2275
    iget v4, v2, Lcom/roidapp/photogrid/release/lc;->j:F

    iput v4, v3, Lcom/roidapp/photogrid/release/lc;->j:F

    .line 2276
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->k:F

    iget v5, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    add-float/2addr v4, v5

    iput v4, v3, Lcom/roidapp/photogrid/release/lc;->k:F

    .line 2277
    iget v4, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    iput v4, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    .line 2278
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->m:F

    iget v5, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    sub-float/2addr v4, v5

    iput v4, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    .line 2279
    new-instance v4, Landroid/graphics/PointF;

    const/high16 v5, 0x3f000000    # 0.5f

    iget v6, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v5, v6

    const/high16 v6, 0x3f000000    # 0.5f

    iget v7, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v6, v7

    invoke-direct {v4, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v4, v3, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    .line 2280
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 2281
    new-instance v5, Landroid/graphics/PointF;

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2282
    new-instance v5, Landroid/graphics/PointF;

    iget v6, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    const/4 v7, 0x0

    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2283
    new-instance v5, Landroid/graphics/PointF;

    iget v6, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v7, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2284
    new-instance v5, Landroid/graphics/PointF;

    const/4 v6, 0x0

    iget v7, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2285
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 2286
    new-instance v6, Landroid/graphics/PointF;

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct {v6, v7, v8}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2287
    new-instance v6, Landroid/graphics/PointF;

    iget v7, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    const/4 v8, 0x0

    invoke-direct {v6, v7, v8}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2288
    new-instance v6, Landroid/graphics/PointF;

    iget v7, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v8, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v6, v7, v8}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2289
    new-instance v6, Landroid/graphics/PointF;

    const/4 v7, 0x0

    iget v8, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v6, v7, v8}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2290
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 2291
    new-instance v7, Landroid/graphics/PointF;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct {v7, v8, v9}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2292
    new-instance v7, Landroid/graphics/PointF;

    iget v8, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    const/4 v9, 0x0

    invoke-direct {v7, v8, v9}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2293
    new-instance v7, Landroid/graphics/PointF;

    iget v8, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v9, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v7, v8, v9}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2294
    new-instance v7, Landroid/graphics/PointF;

    const/4 v8, 0x0

    iget v9, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v7, v8, v9}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2295
    iput-object v4, v1, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 2296
    iput-object v5, v2, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 2297
    iput-object v6, v3, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 2298
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2299
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2300
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 2304
    :pswitch_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2318
    new-instance v1, Lcom/roidapp/photogrid/release/lc;

    invoke-direct {v1}, Lcom/roidapp/photogrid/release/lc;-><init>()V

    .line 2319
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->j:F

    iput v4, v1, Lcom/roidapp/photogrid/release/lc;->j:F

    .line 2320
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->k:F

    iput v4, v1, Lcom/roidapp/photogrid/release/lc;->k:F

    .line 2321
    const/high16 v4, 0x42c80000    # 100.0f

    div-float/2addr v2, v4

    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v2, v4

    iput v2, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    .line 2322
    const/high16 v2, 0x42c80000    # 100.0f

    div-float v2, v3, v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v3, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v2, v3

    iput v2, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    .line 2323
    new-instance v2, Landroid/graphics/PointF;

    const/high16 v3, 0x3f000000    # 0.5f

    iget v4, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v3, v4

    const/high16 v4, 0x3f000000    # 0.5f

    iget v5, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v4, v5

    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v2, v1, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    .line 2324
    new-instance v2, Lcom/roidapp/photogrid/release/lc;

    invoke-direct {v2}, Lcom/roidapp/photogrid/release/lc;-><init>()V

    .line 2325
    iget-object v3, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v3, v3, Lcom/roidapp/photogrid/release/lc;->j:F

    iget v4, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    add-float/2addr v3, v4

    iput v3, v2, Lcom/roidapp/photogrid/release/lc;->j:F

    .line 2326
    iget-object v3, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v3, v3, Lcom/roidapp/photogrid/release/lc;->k:F

    iput v3, v2, Lcom/roidapp/photogrid/release/lc;->k:F

    .line 2327
    iget-object v3, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v3, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v4, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    sub-float/2addr v3, v4

    iput v3, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    .line 2328
    iget-object v3, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v3, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    iput v3, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    .line 2329
    new-instance v3, Landroid/graphics/PointF;

    const/high16 v4, 0x3f000000    # 0.5f

    iget v5, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v4, v5

    const/high16 v5, 0x3f000000    # 0.5f

    iget v6, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v5, v6

    invoke-direct {v3, v4, v5}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v3, v2, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    .line 2330
    new-instance v3, Lcom/roidapp/photogrid/release/lc;

    invoke-direct {v3}, Lcom/roidapp/photogrid/release/lc;-><init>()V

    .line 2331
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->j:F

    iput v4, v3, Lcom/roidapp/photogrid/release/lc;->j:F

    .line 2332
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->k:F

    iget v5, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    add-float/2addr v4, v5

    iput v4, v3, Lcom/roidapp/photogrid/release/lc;->k:F

    .line 2333
    iget v4, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    iput v4, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    .line 2334
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->m:F

    iget v5, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    sub-float/2addr v4, v5

    iput v4, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    .line 2335
    new-instance v4, Landroid/graphics/PointF;

    const/high16 v5, 0x3f000000    # 0.5f

    iget v6, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v5, v6

    const/high16 v6, 0x3f000000    # 0.5f

    iget v7, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v6, v7

    invoke-direct {v4, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v4, v3, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    .line 2336
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 2337
    new-instance v5, Landroid/graphics/PointF;

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2338
    new-instance v5, Landroid/graphics/PointF;

    iget v6, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    const/4 v7, 0x0

    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2339
    new-instance v5, Landroid/graphics/PointF;

    iget v6, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v7, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2340
    new-instance v5, Landroid/graphics/PointF;

    const/4 v6, 0x0

    iget v7, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2341
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 2342
    new-instance v6, Landroid/graphics/PointF;

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct {v6, v7, v8}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2343
    new-instance v6, Landroid/graphics/PointF;

    iget v7, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    const/4 v8, 0x0

    invoke-direct {v6, v7, v8}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2344
    new-instance v6, Landroid/graphics/PointF;

    iget v7, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v8, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v6, v7, v8}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2345
    new-instance v6, Landroid/graphics/PointF;

    const/4 v7, 0x0

    iget v8, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v6, v7, v8}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2346
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 2347
    new-instance v7, Landroid/graphics/PointF;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct {v7, v8, v9}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2348
    new-instance v7, Landroid/graphics/PointF;

    iget v8, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    const/4 v9, 0x0

    invoke-direct {v7, v8, v9}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2349
    new-instance v7, Landroid/graphics/PointF;

    iget v8, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v9, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v7, v8, v9}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2350
    new-instance v7, Landroid/graphics/PointF;

    const/4 v8, 0x0

    iget v9, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v7, v8, v9}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2351
    iput-object v4, v1, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 2352
    iput-object v5, v2, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 2353
    iput-object v6, v3, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 2354
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2355
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2356
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 2360
    :pswitch_4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2374
    new-instance v1, Lcom/roidapp/photogrid/release/lc;

    invoke-direct {v1}, Lcom/roidapp/photogrid/release/lc;-><init>()V

    .line 2375
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->j:F

    iput v4, v1, Lcom/roidapp/photogrid/release/lc;->j:F

    .line 2376
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->k:F

    iput v4, v1, Lcom/roidapp/photogrid/release/lc;->k:F

    .line 2377
    const/high16 v4, 0x42c80000    # 100.0f

    div-float/2addr v2, v4

    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v2, v4

    iput v2, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    .line 2378
    const/high16 v2, 0x42c80000    # 100.0f

    div-float v2, v3, v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v3, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v2, v3

    iput v2, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    .line 2379
    new-instance v2, Landroid/graphics/PointF;

    const/high16 v3, 0x3f000000    # 0.5f

    iget v4, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v3, v4

    const/high16 v4, 0x3f000000    # 0.5f

    iget v5, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v4, v5

    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v2, v1, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    .line 2380
    new-instance v2, Lcom/roidapp/photogrid/release/lc;

    invoke-direct {v2}, Lcom/roidapp/photogrid/release/lc;-><init>()V

    .line 2381
    iget-object v3, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v3, v3, Lcom/roidapp/photogrid/release/lc;->j:F

    iget v4, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    add-float/2addr v3, v4

    iput v3, v2, Lcom/roidapp/photogrid/release/lc;->j:F

    .line 2382
    iget-object v3, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v3, v3, Lcom/roidapp/photogrid/release/lc;->k:F

    iput v3, v2, Lcom/roidapp/photogrid/release/lc;->k:F

    .line 2383
    iget-object v3, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v3, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v4, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    sub-float/2addr v3, v4

    iput v3, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    .line 2384
    iget v3, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    iput v3, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    .line 2385
    new-instance v3, Landroid/graphics/PointF;

    const/high16 v4, 0x3f000000    # 0.5f

    iget v5, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v4, v5

    const/high16 v5, 0x3f000000    # 0.5f

    iget v6, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v5, v6

    invoke-direct {v3, v4, v5}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v3, v2, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    .line 2386
    new-instance v3, Lcom/roidapp/photogrid/release/lc;

    invoke-direct {v3}, Lcom/roidapp/photogrid/release/lc;-><init>()V

    .line 2387
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->j:F

    iput v4, v3, Lcom/roidapp/photogrid/release/lc;->j:F

    .line 2388
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->k:F

    iget v5, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    add-float/2addr v4, v5

    iput v4, v3, Lcom/roidapp/photogrid/release/lc;->k:F

    .line 2389
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->l:F

    iput v4, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    .line 2390
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->m:F

    iget v5, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    sub-float/2addr v4, v5

    iput v4, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    .line 2391
    new-instance v4, Landroid/graphics/PointF;

    const/high16 v5, 0x3f000000    # 0.5f

    iget v6, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v5, v6

    const/high16 v6, 0x3f000000    # 0.5f

    iget v7, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v6, v7

    invoke-direct {v4, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v4, v3, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    .line 2392
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 2393
    new-instance v5, Landroid/graphics/PointF;

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2394
    new-instance v5, Landroid/graphics/PointF;

    iget v6, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    const/4 v7, 0x0

    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2395
    new-instance v5, Landroid/graphics/PointF;

    iget v6, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v7, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2396
    new-instance v5, Landroid/graphics/PointF;

    const/4 v6, 0x0

    iget v7, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2397
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 2398
    new-instance v6, Landroid/graphics/PointF;

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct {v6, v7, v8}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2399
    new-instance v6, Landroid/graphics/PointF;

    iget v7, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    const/4 v8, 0x0

    invoke-direct {v6, v7, v8}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2400
    new-instance v6, Landroid/graphics/PointF;

    iget v7, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v8, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v6, v7, v8}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2401
    new-instance v6, Landroid/graphics/PointF;

    const/4 v7, 0x0

    iget v8, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v6, v7, v8}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2402
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 2403
    new-instance v7, Landroid/graphics/PointF;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct {v7, v8, v9}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2404
    new-instance v7, Landroid/graphics/PointF;

    iget v8, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    const/4 v9, 0x0

    invoke-direct {v7, v8, v9}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2405
    new-instance v7, Landroid/graphics/PointF;

    iget v8, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v9, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v7, v8, v9}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2406
    new-instance v7, Landroid/graphics/PointF;

    const/4 v8, 0x0

    iget v9, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v7, v8, v9}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2407
    iput-object v4, v1, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 2408
    iput-object v5, v2, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 2409
    iput-object v6, v3, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 2410
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2411
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2412
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 2416
    :pswitch_5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2430
    new-instance v1, Lcom/roidapp/photogrid/release/lc;

    invoke-direct {v1}, Lcom/roidapp/photogrid/release/lc;-><init>()V

    .line 2431
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->j:F

    iput v4, v1, Lcom/roidapp/photogrid/release/lc;->j:F

    .line 2432
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->k:F

    iput v4, v1, Lcom/roidapp/photogrid/release/lc;->k:F

    .line 2433
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->l:F

    iput v4, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    .line 2434
    const/high16 v4, 0x42c80000    # 100.0f

    div-float/2addr v3, v4

    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v3, v4

    iput v3, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    .line 2435
    new-instance v3, Landroid/graphics/PointF;

    const/high16 v4, 0x3f000000    # 0.5f

    iget v5, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v4, v5

    const/high16 v5, 0x3f000000    # 0.5f

    iget v6, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v5, v6

    invoke-direct {v3, v4, v5}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v3, v1, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    .line 2436
    new-instance v3, Lcom/roidapp/photogrid/release/lc;

    invoke-direct {v3}, Lcom/roidapp/photogrid/release/lc;-><init>()V

    .line 2437
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->j:F

    iput v4, v3, Lcom/roidapp/photogrid/release/lc;->j:F

    .line 2438
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->k:F

    iget v5, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    add-float/2addr v4, v5

    iput v4, v3, Lcom/roidapp/photogrid/release/lc;->k:F

    .line 2439
    const/high16 v4, 0x42c80000    # 100.0f

    div-float/2addr v2, v4

    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v2, v4

    iput v2, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    .line 2440
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v2, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    iget v4, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    sub-float/2addr v2, v4

    iput v2, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    .line 2441
    new-instance v2, Landroid/graphics/PointF;

    const/high16 v4, 0x3f000000    # 0.5f

    iget v5, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v4, v5

    const/high16 v5, 0x3f000000    # 0.5f

    iget v6, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v5, v6

    invoke-direct {v2, v4, v5}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v2, v3, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    .line 2442
    new-instance v2, Lcom/roidapp/photogrid/release/lc;

    invoke-direct {v2}, Lcom/roidapp/photogrid/release/lc;-><init>()V

    .line 2443
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->j:F

    iget v5, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    add-float/2addr v4, v5

    iput v4, v2, Lcom/roidapp/photogrid/release/lc;->j:F

    .line 2444
    iget v4, v3, Lcom/roidapp/photogrid/release/lc;->k:F

    iput v4, v2, Lcom/roidapp/photogrid/release/lc;->k:F

    .line 2445
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v5, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    sub-float/2addr v4, v5

    iput v4, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    .line 2446
    iget v4, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    iput v4, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    .line 2447
    new-instance v4, Landroid/graphics/PointF;

    const/high16 v5, 0x3f000000    # 0.5f

    iget v6, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v5, v6

    const/high16 v6, 0x3f000000    # 0.5f

    iget v7, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v6, v7

    invoke-direct {v4, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v4, v2, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    .line 2449
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 2450
    new-instance v5, Landroid/graphics/PointF;

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2451
    new-instance v5, Landroid/graphics/PointF;

    iget v6, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    const/4 v7, 0x0

    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2452
    new-instance v5, Landroid/graphics/PointF;

    iget v6, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v7, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2453
    new-instance v5, Landroid/graphics/PointF;

    const/4 v6, 0x0

    iget v7, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2454
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 2455
    new-instance v6, Landroid/graphics/PointF;

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct {v6, v7, v8}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2456
    new-instance v6, Landroid/graphics/PointF;

    iget v7, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    const/4 v8, 0x0

    invoke-direct {v6, v7, v8}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2457
    new-instance v6, Landroid/graphics/PointF;

    iget v7, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v8, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v6, v7, v8}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2458
    new-instance v6, Landroid/graphics/PointF;

    const/4 v7, 0x0

    iget v8, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v6, v7, v8}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2459
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 2460
    new-instance v7, Landroid/graphics/PointF;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct {v7, v8, v9}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2461
    new-instance v7, Landroid/graphics/PointF;

    iget v8, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    const/4 v9, 0x0

    invoke-direct {v7, v8, v9}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2462
    new-instance v7, Landroid/graphics/PointF;

    iget v8, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v9, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v7, v8, v9}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2463
    new-instance v7, Landroid/graphics/PointF;

    const/4 v8, 0x0

    iget v9, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v7, v8, v9}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2464
    iput-object v4, v1, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 2465
    iput-object v5, v2, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 2466
    iput-object v6, v3, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 2467
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2468
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2469
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 2473
    :pswitch_6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2487
    new-instance v1, Lcom/roidapp/photogrid/release/lc;

    invoke-direct {v1}, Lcom/roidapp/photogrid/release/lc;-><init>()V

    .line 2488
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->j:F

    iput v4, v1, Lcom/roidapp/photogrid/release/lc;->j:F

    .line 2489
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->k:F

    iput v4, v1, Lcom/roidapp/photogrid/release/lc;->k:F

    .line 2490
    const/high16 v4, 0x42c80000    # 100.0f

    div-float/2addr v2, v4

    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v2, v4

    iput v2, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    .line 2491
    const/high16 v2, 0x42c80000    # 100.0f

    div-float v2, v3, v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v3, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v2, v3

    iput v2, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    .line 2492
    new-instance v2, Landroid/graphics/PointF;

    const/high16 v3, 0x3f000000    # 0.5f

    iget v4, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v3, v4

    const/high16 v4, 0x3f000000    # 0.5f

    iget v5, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v4, v5

    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v2, v1, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    .line 2493
    new-instance v2, Lcom/roidapp/photogrid/release/lc;

    invoke-direct {v2}, Lcom/roidapp/photogrid/release/lc;-><init>()V

    .line 2494
    iget v3, v1, Lcom/roidapp/photogrid/release/lc;->j:F

    iget v4, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    add-float/2addr v3, v4

    iput v3, v2, Lcom/roidapp/photogrid/release/lc;->j:F

    .line 2495
    iget v3, v1, Lcom/roidapp/photogrid/release/lc;->k:F

    iput v3, v2, Lcom/roidapp/photogrid/release/lc;->k:F

    .line 2496
    iget-object v3, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v3, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v4, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    sub-float/2addr v3, v4

    iput v3, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    .line 2497
    iget v3, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    iput v3, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    .line 2498
    new-instance v3, Landroid/graphics/PointF;

    const/high16 v4, 0x3f000000    # 0.5f

    iget v5, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v4, v5

    const/high16 v5, 0x3f000000    # 0.5f

    iget v6, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v5, v6

    invoke-direct {v3, v4, v5}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v3, v2, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    .line 2499
    new-instance v3, Lcom/roidapp/photogrid/release/lc;

    invoke-direct {v3}, Lcom/roidapp/photogrid/release/lc;-><init>()V

    .line 2500
    iget v4, v2, Lcom/roidapp/photogrid/release/lc;->j:F

    iput v4, v3, Lcom/roidapp/photogrid/release/lc;->j:F

    .line 2501
    iget v4, v2, Lcom/roidapp/photogrid/release/lc;->k:F

    iget v5, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    add-float/2addr v4, v5

    iput v4, v3, Lcom/roidapp/photogrid/release/lc;->k:F

    .line 2502
    iget v4, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    iput v4, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    .line 2503
    iget-object v4, p0, Lcom/roidapp/photogrid/release/rh;->d:Lcom/roidapp/photogrid/release/lc;

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->m:F

    iget v5, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    sub-float/2addr v4, v5

    iput v4, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    .line 2504
    new-instance v4, Landroid/graphics/PointF;

    const/high16 v5, 0x3f000000    # 0.5f

    iget v6, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v5, v6

    const/high16 v6, 0x3f000000    # 0.5f

    iget v7, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v6, v7

    invoke-direct {v4, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v4, v3, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    .line 2505
    new-instance v4, Lcom/roidapp/photogrid/release/lc;

    invoke-direct {v4}, Lcom/roidapp/photogrid/release/lc;-><init>()V

    .line 2506
    iget v5, v1, Lcom/roidapp/photogrid/release/lc;->j:F

    iput v5, v4, Lcom/roidapp/photogrid/release/lc;->j:F

    .line 2507
    iget v5, v3, Lcom/roidapp/photogrid/release/lc;->k:F

    iput v5, v4, Lcom/roidapp/photogrid/release/lc;->k:F

    .line 2508
    iget v5, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    iput v5, v4, Lcom/roidapp/photogrid/release/lc;->l:F

    .line 2509
    iget v5, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    iput v5, v4, Lcom/roidapp/photogrid/release/lc;->m:F

    .line 2510
    new-instance v5, Landroid/graphics/PointF;

    const/high16 v6, 0x3f000000    # 0.5f

    iget v7, v4, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v6, v7

    const/high16 v7, 0x3f000000    # 0.5f

    iget v8, v4, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v7, v8

    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v5, v4, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    .line 2511
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 2512
    new-instance v6, Landroid/graphics/PointF;

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct {v6, v7, v8}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2513
    new-instance v6, Landroid/graphics/PointF;

    iget v7, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    const/4 v8, 0x0

    invoke-direct {v6, v7, v8}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2514
    new-instance v6, Landroid/graphics/PointF;

    iget v7, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v8, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v6, v7, v8}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2515
    new-instance v6, Landroid/graphics/PointF;

    const/4 v7, 0x0

    iget v8, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v6, v7, v8}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2516
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 2517
    new-instance v7, Landroid/graphics/PointF;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct {v7, v8, v9}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2518
    new-instance v7, Landroid/graphics/PointF;

    iget v8, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    const/4 v9, 0x0

    invoke-direct {v7, v8, v9}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2519
    new-instance v7, Landroid/graphics/PointF;

    iget v8, v2, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v9, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v7, v8, v9}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2520
    new-instance v7, Landroid/graphics/PointF;

    const/4 v8, 0x0

    iget v9, v2, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v7, v8, v9}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2521
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 2522
    new-instance v8, Landroid/graphics/PointF;

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct {v8, v9, v10}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2523
    new-instance v8, Landroid/graphics/PointF;

    iget v9, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    const/4 v10, 0x0

    invoke-direct {v8, v9, v10}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2524
    new-instance v8, Landroid/graphics/PointF;

    iget v9, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v10, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v8, v9, v10}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2525
    new-instance v8, Landroid/graphics/PointF;

    const/4 v9, 0x0

    iget v10, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v8, v9, v10}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2526
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 2527
    new-instance v9, Landroid/graphics/PointF;

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct {v9, v10, v11}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2528
    new-instance v9, Landroid/graphics/PointF;

    iget v10, v4, Lcom/roidapp/photogrid/release/lc;->l:F

    const/4 v11, 0x0

    invoke-direct {v9, v10, v11}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2529
    new-instance v9, Landroid/graphics/PointF;

    iget v10, v4, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v11, v4, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v9, v10, v11}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2530
    new-instance v9, Landroid/graphics/PointF;

    const/4 v10, 0x0

    iget v11, v4, Lcom/roidapp/photogrid/release/lc;->m:F

    invoke-direct {v9, v10, v11}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2531
    iput-object v5, v1, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 2532
    iput-object v6, v2, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 2533
    iput-object v7, v3, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 2534
    iput-object v8, v4, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 2535
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2536
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2537
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2538
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 2111
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method private declared-synchronized a(Ljava/util/List;)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/release/lc;",
            ">;)",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/release/lc;",
            ">;"
        }
    .end annotation

    .prologue
    .line 626
    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 627
    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    .line 628
    const/4 v1, 0x0

    .line 629
    const/4 v0, 0x0

    .line 630
    packed-switch v2, :pswitch_data_0

    move v3, v0

    move v4, v1

    .line 663
    :goto_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 665
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/lc;

    .line 666
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/lc;->a()Lcom/roidapp/photogrid/release/lc;

    move-result-object v7

    .line 667
    iget-object v8, v7, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 669
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    .line 670
    iget v2, v0, Landroid/graphics/PointF;->x:F

    iget v9, v7, Lcom/roidapp/photogrid/release/lc;->j:F

    add-float/2addr v2, v9

    iput v2, v0, Landroid/graphics/PointF;->x:F

    .line 671
    iget v2, v0, Landroid/graphics/PointF;->y:F

    iget v9, v7, Lcom/roidapp/photogrid/release/lc;->k:F

    add-float/2addr v2, v9

    iput v2, v0, Landroid/graphics/PointF;->y:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    .line 626
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 632
    :pswitch_0
    const/4 v0, 0x0

    .line 633
    const/4 v1, 0x0

    move v3, v0

    move v4, v1

    .line 634
    goto :goto_0

    .line 636
    :pswitch_1
    const/4 v0, -0x2

    .line 637
    const/16 v1, 0x5a

    move v3, v0

    move v4, v1

    .line 638
    goto :goto_0

    .line 640
    :pswitch_2
    const/4 v0, -0x4

    .line 641
    const/16 v1, 0xb4

    move v3, v0

    move v4, v1

    .line 642
    goto :goto_0

    .line 644
    :pswitch_3
    const/4 v0, -0x6

    .line 645
    const/16 v1, 0x10e

    move v3, v0

    move v4, v1

    .line 646
    goto :goto_0

    .line 648
    :pswitch_4
    const/4 v0, 0x2

    .line 649
    const/16 v1, -0x5a

    move v3, v0

    move v4, v1

    .line 650
    goto :goto_0

    .line 652
    :pswitch_5
    const/4 v0, 0x4

    .line 653
    const/16 v1, -0xb4

    move v3, v0

    move v4, v1

    .line 654
    goto :goto_0

    .line 656
    :pswitch_6
    const/4 v0, 0x6

    .line 657
    const/16 v1, -0x10e

    move v3, v0

    move v4, v1

    goto :goto_0

    .line 674
    :cond_0
    :try_start_1
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    .line 675
    mul-int/lit8 v0, v9, 0x2

    new-array v10, v0, [F

    .line 676
    const/4 v1, 0x0

    const/4 v0, 0x0

    move v2, v1

    move v1, v0

    :goto_3
    if-ge v2, v9, :cond_1

    .line 677
    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    aput v0, v10, v1

    .line 678
    add-int/lit8 v1, v1, 0x1

    .line 679
    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    aput v0, v10, v1

    .line 680
    add-int/lit8 v0, v1, 0x1

    .line 676
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    move v1, v0

    goto :goto_3

    .line 683
    :cond_1
    invoke-virtual {v10}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    .line 684
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 685
    int-to-float v2, v4

    const/high16 v8, 0x42480000    # 50.0f

    const/high16 v9, 0x42480000    # 50.0f

    invoke-virtual {v1, v2, v8, v9}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 686
    invoke-virtual {v1, v0, v10}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 687
    array-length v8, v0

    .line 691
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 692
    if-lez v4, :cond_2

    .line 693
    add-int v1, v8, v3

    :goto_4
    move v2, v1

    .line 699
    :goto_5
    if-ge v2, v8, :cond_3

    .line 700
    aget v10, v0, v2

    .line 701
    add-int/lit8 v2, v2, 0x1

    .line 702
    aget v11, v0, v2

    .line 703
    new-instance v12, Landroid/graphics/PointF;

    invoke-direct {v12, v10, v11}, Landroid/graphics/PointF;-><init>(FF)V

    .line 704
    iget-object v13, p0, Lcom/roidapp/photogrid/release/rh;->a:Ljava/util/List;

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-interface {v13, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 705
    iget-object v10, p0, Lcom/roidapp/photogrid/release/rh;->b:Ljava/util/List;

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 706
    invoke-interface {v9, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 699
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    .line 695
    :cond_2
    add-int/lit8 v1, v3, 0x0

    goto :goto_4

    .line 710
    :cond_3
    const/4 v2, 0x0

    :goto_6
    if-ge v2, v1, :cond_4

    .line 711
    aget v8, v0, v2

    .line 712
    add-int/lit8 v2, v2, 0x1

    .line 713
    aget v10, v0, v2

    .line 714
    new-instance v11, Landroid/graphics/PointF;

    invoke-direct {v11, v8, v10}, Landroid/graphics/PointF;-><init>(FF)V

    .line 715
    iget-object v12, p0, Lcom/roidapp/photogrid/release/rh;->a:Ljava/util/List;

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-interface {v12, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 716
    iget-object v8, p0, Lcom/roidapp/photogrid/release/rh;->b:Ljava/util/List;

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-interface {v8, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 717
    invoke-interface {v9, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 710
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    .line 719
    :cond_4
    iput-object v9, v7, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 720
    invoke-direct {p0, v7}, Lcom/roidapp/photogrid/release/rh;->a(Lcom/roidapp/photogrid/release/lc;)V

    .line 721
    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_1

    .line 724
    :cond_5
    monitor-exit p0

    return-object v5

    .line 630
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method private a(Lcom/roidapp/photogrid/release/lc;)V
    .locals 5

    .prologue
    const/high16 v4, 0x3f000000    # 0.5f

    .line 737
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rh;->a:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->min(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p1, Lcom/roidapp/photogrid/release/lc;->j:F

    .line 738
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rh;->b:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->min(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p1, Lcom/roidapp/photogrid/release/lc;->k:F

    .line 739
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rh;->a:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget v1, p1, Lcom/roidapp/photogrid/release/lc;->j:F

    sub-float/2addr v0, v1

    iput v0, p1, Lcom/roidapp/photogrid/release/lc;->l:F

    .line 740
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rh;->b:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget v1, p1, Lcom/roidapp/photogrid/release/lc;->k:F

    sub-float/2addr v0, v1

    iput v0, p1, Lcom/roidapp/photogrid/release/lc;->m:F

    .line 742
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rh;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 743
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rh;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 744
    iget-object v0, p1, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 745
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    .line 746
    iget v2, v0, Landroid/graphics/PointF;->x:F

    iget v3, p1, Lcom/roidapp/photogrid/release/lc;->j:F

    sub-float/2addr v2, v3

    iput v2, v0, Landroid/graphics/PointF;->x:F

    .line 747
    iget v2, v0, Landroid/graphics/PointF;->y:F

    iget v3, p1, Lcom/roidapp/photogrid/release/lc;->k:F

    sub-float/2addr v2, v3

    iput v2, v0, Landroid/graphics/PointF;->y:F

    goto :goto_0

    .line 749
    :cond_0
    new-instance v0, Landroid/graphics/PointF;

    iget v1, p1, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v1, v4

    iget v2, p1, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v2, v4

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, p1, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    .line 750
    return-void
.end method

.method private b(I)I
    .locals 3

    .prologue
    const/16 v2, 0x19

    const/4 v1, 0x4

    .line 141
    if-nez p1, :cond_1

    .line 142
    iget v0, p0, Lcom/roidapp/photogrid/release/rh;->e:I

    if-gt v0, v1, :cond_0

    .line 143
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rh;->c:Ljava/util/Random;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x3c

    .line 157
    :goto_0
    return v0

    .line 145
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rh;->c:Ljava/util/Random;

    const/16 v1, 0x1e

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x25

    goto :goto_0

    .line 147
    :cond_1
    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    .line 148
    iget v0, p0, Lcom/roidapp/photogrid/release/rh;->e:I

    if-gt v0, v1, :cond_2

    .line 149
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rh;->c:Ljava/util/Random;

    const/16 v1, 0x23

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x21

    goto :goto_0

    .line 151
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rh;->c:Ljava/util/Random;

    invoke-virtual {v0, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x27

    goto :goto_0

    .line 155
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rh;->c:Ljava/util/Random;

    invoke-virtual {v0, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x25

    goto :goto_0
.end method

.method private declared-synchronized c(I)I
    .locals 2

    .prologue
    .line 609
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rh;->c:Ljava/util/Random;

    invoke-virtual {v0, p1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    .line 610
    iget v1, p0, Lcom/roidapp/photogrid/release/rh;->h:I

    if-ne v0, v1, :cond_0

    .line 611
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/rh;->c(I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    .line 613
    :cond_0
    monitor-exit p0

    return v0

    .line 609
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method protected final a(I)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/release/lc;",
            ">;"
        }
    .end annotation

    .prologue
    const/high16 v6, 0x42c80000    # 100.0f

    const/4 v5, 0x0

    const/4 v4, 0x0

    .line 35
    :goto_0
    if-nez p1, :cond_0

    .line 36
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rh;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 38
    new-instance v0, Lcom/roidapp/photogrid/release/lc;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/lc;-><init>()V

    .line 39
    iput v5, v0, Lcom/roidapp/photogrid/release/lc;->j:F

    .line 40
    iput v5, v0, Lcom/roidapp/photogrid/release/lc;->k:F

    .line 41
    iput v6, v0, Lcom/roidapp/photogrid/release/lc;->l:F

    .line 42
    iput v6, v0, Lcom/roidapp/photogrid/release/lc;->m:F

    .line 43
    iget v1, p0, Lcom/roidapp/photogrid/release/rh;->e:I

    invoke-direct {p0, v1, v4, v0}, Lcom/roidapp/photogrid/release/rh;->a(IILcom/roidapp/photogrid/release/lc;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/rh;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 44
    iget-object v1, p0, Lcom/roidapp/photogrid/release/rh;->f:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 51
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rh;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lcom/roidapp/photogrid/release/rh;->e:I

    if-ge v0, v1, :cond_4

    .line 52
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 46
    :cond_0
    iput v4, p0, Lcom/roidapp/photogrid/release/rh;->j:I

    .line 47
    iget-object v1, p0, Lcom/roidapp/photogrid/release/rh;->f:Ljava/util/List;

    .line 1559
    :goto_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    .line 1560
    iget v0, p0, Lcom/roidapp/photogrid/release/rh;->j:I

    if-lt v0, v2, :cond_1

    .line 1561
    iget v0, p0, Lcom/roidapp/photogrid/release/rh;->i:I

    int-to-float v0, v0

    const v3, 0x3f333333    # 0.7f

    mul-float/2addr v0, v3

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/rh;->i:I

    .line 1562
    iput v4, p0, Lcom/roidapp/photogrid/release/rh;->j:I

    .line 1564
    :cond_1
    invoke-direct {p0, v2}, Lcom/roidapp/photogrid/release/rh;->c(I)I

    move-result v0

    .line 1565
    iput v0, p0, Lcom/roidapp/photogrid/release/rh;->h:I

    .line 1566
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/lc;

    .line 1592
    const/4 v3, 0x4

    if-le v2, v3, :cond_3

    .line 1593
    iget v2, v0, Lcom/roidapp/photogrid/release/lc;->l:F

    iget v3, p0, Lcom/roidapp/photogrid/release/rh;->i:I

    int-to-float v3, v3

    cmpg-float v2, v2, v3

    if-ltz v2, :cond_2

    iget v2, v0, Lcom/roidapp/photogrid/release/lc;->m:F

    iget v3, p0, Lcom/roidapp/photogrid/release/rh;->i:I

    int-to-float v3, v3

    cmpg-float v2, v2, v3

    if-gez v2, :cond_3

    .line 1594
    :cond_2
    iget v0, p0, Lcom/roidapp/photogrid/release/rh;->j:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/roidapp/photogrid/release/rh;->j:I

    goto :goto_2

    .line 48
    :cond_3
    iget-object v1, p0, Lcom/roidapp/photogrid/release/rh;->f:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 49
    iget-object v1, p0, Lcom/roidapp/photogrid/release/rh;->f:Ljava/util/List;

    iget v2, p0, Lcom/roidapp/photogrid/release/rh;->e:I

    iget-object v3, p0, Lcom/roidapp/photogrid/release/rh;->f:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    sub-int/2addr v2, v3

    add-int/lit8 v3, p1, 0x1

    invoke-direct {p0, v2, v3, v0}, Lcom/roidapp/photogrid/release/rh;->a(IILcom/roidapp/photogrid/release/lc;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 63
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rh;->f:Ljava/util/List;

    return-object v0
.end method
