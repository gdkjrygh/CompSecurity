.class public final Lcom/roidapp/photogrid/release/ms;
.super Lcom/roidapp/photogrid/release/mm;
.source "SourceFile"


# direct methods
.method public constructor <init>(ZLandroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/az;)V
    .locals 5

    .prologue
    const v3, 0x3f23d70a    # 0.64f

    const/4 v4, 0x0

    .line 45
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/mm;-><init>()V

    .line 46
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/ms;->F:Z

    .line 47
    iput-object p2, p0, Lcom/roidapp/photogrid/release/ms;->h:Landroid/app/Activity;

    .line 48
    iput-object p3, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    .line 49
    iput-object p4, p0, Lcom/roidapp/photogrid/release/ms;->l:Lcom/roidapp/photogrid/release/ml;

    .line 50
    iput-object p5, p0, Lcom/roidapp/photogrid/release/ms;->D:Lcom/roidapp/photogrid/release/PhotoView;

    .line 51
    iput-object p6, p0, Lcom/roidapp/photogrid/release/ms;->E:Lcom/roidapp/photogrid/release/az;

    .line 52
    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setFormat(I)V

    .line 53
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    .line 55
    if-eqz p1, :cond_0

    .line 56
    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->d(Z)V

    .line 57
    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->c(I)V

    .line 58
    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    .line 59
    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->f(Z)V

    .line 61
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aI()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 62
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v1

    iget-object v1, v1, Lcom/roidapp/photogrid/common/aj;->a:[I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    aget v1, v1, v2

    .line 63
    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->k(I)V

    .line 64
    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 65
    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->r(I)V

    .line 72
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->w()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 73
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->w()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/photogrid/release/ms;->z:Ljava/util/List;

    .line 77
    :cond_1
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->A()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/ms;->r:I

    .line 79
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_2

    .line 82
    invoke-virtual {p2, v4}, Landroid/app/Activity;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 83
    const-string v2, "INNER_SPACE"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v2

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->d(F)V

    .line 84
    iget v2, p0, Lcom/roidapp/photogrid/release/ms;->r:I

    if-nez v2, :cond_5

    .line 86
    const-string v2, "OUTER_SPACE"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v2

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 91
    :goto_1
    const-string v2, "CORNER_RADIOUS"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->f(F)V

    .line 96
    :cond_2
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->I()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/ms;->m:I

    .line 97
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->x()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/ms;->s:I

    .line 98
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->A()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/ms;->r:I

    .line 99
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->y()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/ms;->t:I

    .line 100
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->z()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/ms;->u:I

    .line 102
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->m()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ms;->A:Ljava/util/List;

    .line 1107
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    if-nez v0, :cond_6

    .line 1108
    const-string v0, "190"

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->h:Landroid/app/Activity;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    .line 1109
    :cond_3
    :goto_2
    return-void

    .line 67
    :cond_4
    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 68
    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->r(I)V

    goto :goto_0

    .line 88
    :cond_5
    const-string v2, "OUTER_SPACE"

    const v3, 0x3fb9999a    # 1.45f

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v2

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    goto :goto_1

    .line 1111
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    packed-switch v0, :pswitch_data_0

    .line 1158
    new-array v0, v4, [I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ms;->B:[I

    .line 1162
    :goto_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->B:[I

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/roidapp/photogrid/release/ms;->m:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->B:[I

    array-length v1, v1

    if-lt v0, v1, :cond_3

    .line 1163
    iput v4, p0, Lcom/roidapp/photogrid/release/ms;->m:I

    goto :goto_2

    .line 1113
    :pswitch_0
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->b:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ms;->B:[I

    goto :goto_3

    .line 1116
    :pswitch_1
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->c:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ms;->B:[I

    goto :goto_3

    .line 1119
    :pswitch_2
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->d:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ms;->B:[I

    goto :goto_3

    .line 1122
    :pswitch_3
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->e:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ms;->B:[I

    goto :goto_3

    .line 1125
    :pswitch_4
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->f:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ms;->B:[I

    goto :goto_3

    .line 1128
    :pswitch_5
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->g:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ms;->B:[I

    goto :goto_3

    .line 1131
    :pswitch_6
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->h:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ms;->B:[I

    goto :goto_3

    .line 1134
    :pswitch_7
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->i:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ms;->B:[I

    goto :goto_3

    .line 1137
    :pswitch_8
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->j:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ms;->B:[I

    goto :goto_3

    .line 1140
    :pswitch_9
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->k:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ms;->B:[I

    goto :goto_3

    .line 1143
    :pswitch_a
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->l:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ms;->B:[I

    goto :goto_3

    .line 1146
    :pswitch_b
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->m:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ms;->B:[I

    goto :goto_3

    .line 1149
    :pswitch_c
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->n:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ms;->B:[I

    goto/16 :goto_3

    .line 1152
    :pswitch_d
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->o:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ms;->B:[I

    goto/16 :goto_3

    .line 1155
    :pswitch_e
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->p:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ms;->B:[I

    goto/16 :goto_3

    .line 1111
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
    .end packed-switch
.end method

.method private a(Landroid/widget/RelativeLayout;)V
    .locals 6

    .prologue
    .line 517
    :try_start_0
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->j:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ms;->p:Landroid/widget/LinearLayout;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ms;->h:Landroid/app/Activity;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ms;->y:Ljava/util/ArrayList;

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/view/View;Landroid/widget/RelativeLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 523
    :goto_0
    return-void

    .line 519
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V

    goto :goto_0

    .line 521
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ms;)V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ms;->n()V

    return-void
.end method

.method private d(II)V
    .locals 13

    .prologue
    .line 418
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v5, v4

    const/4 v0, 0x0

    move v3, v0

    :goto_0
    if-ge v3, v5, :cond_c

    aget-object v0, v4, v3

    .line 419
    iget-object v6, v0, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    .line 421
    if-nez v6, :cond_0

    .line 422
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "data null"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 428
    :cond_0
    int-to-float v0, p1

    iget v1, v6, Lcom/roidapp/photogrid/release/lc;->j:F

    mul-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 429
    int-to-float v0, p2

    iget v1, v6, Lcom/roidapp/photogrid/release/lc;->k:F

    mul-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v7

    .line 430
    int-to-float v0, p1

    iget v1, v6, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    add-int/2addr v0, v2

    .line 431
    int-to-float v1, p2

    iget v8, v6, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v1, v8

    const/high16 v8, 0x42c80000    # 100.0f

    div-float/2addr v1, v8

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    add-int/2addr v1, v7

    .line 433
    iget-boolean v8, v6, Lcom/roidapp/photogrid/release/lc;->f:Z

    if-eqz v8, :cond_6

    .line 434
    new-instance v8, Landroid/graphics/Path;

    invoke-direct {v8}, Landroid/graphics/Path;-><init>()V

    .line 435
    iget-object v0, v6, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    .line 436
    iget v1, v0, Landroid/graphics/PointF;->x:F

    int-to-float v9, p1

    mul-float/2addr v1, v9

    const/high16 v9, 0x42c80000    # 100.0f

    div-float/2addr v1, v9

    int-to-float v9, v2

    add-float/2addr v1, v9

    iget v0, v0, Landroid/graphics/PointF;->y:F

    int-to-float v9, p2

    mul-float/2addr v0, v9

    const/high16 v9, 0x42c80000    # 100.0f

    div-float/2addr v0, v9

    int-to-float v9, v7

    add-float/2addr v0, v9

    invoke-virtual {v8, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 438
    const/4 v0, 0x1

    move v1, v0

    :goto_1
    iget-object v0, v6, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 439
    iget-object v0, v6, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    .line 440
    iget v9, v0, Landroid/graphics/PointF;->x:F

    int-to-float v10, p1

    mul-float/2addr v9, v10

    const/high16 v10, 0x42c80000    # 100.0f

    div-float/2addr v9, v10

    int-to-float v10, v2

    add-float/2addr v9, v10

    iget v0, v0, Landroid/graphics/PointF;->y:F

    int-to-float v10, p2

    mul-float/2addr v0, v10

    const/high16 v10, 0x42c80000    # 100.0f

    div-float/2addr v0, v10

    int-to-float v10, v7

    add-float/2addr v0, v10

    invoke-virtual {v8, v9, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 438
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 442
    :cond_1
    invoke-virtual {v8}, Landroid/graphics/Path;->close()V

    .line 443
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 444
    const/4 v1, 0x1

    invoke-virtual {v8, v0, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 445
    iget-object v1, v6, Lcom/roidapp/photogrid/release/lc;->p:Landroid/graphics/Region;

    new-instance v2, Landroid/graphics/Region;

    iget v7, v0, Landroid/graphics/RectF;->left:F

    float-to-int v7, v7

    iget v9, v0, Landroid/graphics/RectF;->top:F

    float-to-int v9, v9

    iget v10, v0, Landroid/graphics/RectF;->right:F

    float-to-int v10, v10

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    float-to-int v0, v0

    invoke-direct {v2, v7, v9, v10, v0}, Landroid/graphics/Region;-><init>(IIII)V

    invoke-virtual {v1, v8, v2}, Landroid/graphics/Region;->setPath(Landroid/graphics/Path;Landroid/graphics/Region;)Z

    .line 451
    :goto_2
    new-instance v7, Landroid/graphics/Path;

    invoke-direct {v7}, Landroid/graphics/Path;-><init>()V

    .line 453
    iget-object v8, v6, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 454
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    .line 455
    iget-object v0, v6, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    iget v10, v0, Landroid/graphics/PointF;->x:F

    .line 456
    iget-object v0, v6, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    iget v11, v0, Landroid/graphics/PointF;->y:F

    .line 458
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 459
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 461
    cmpg-float v2, v1, v10

    if-gez v2, :cond_7

    .line 462
    int-to-float v2, p1

    mul-float/2addr v1, v2

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v1, v2

    .line 466
    :goto_3
    cmpg-float v2, v0, v11

    if-gez v2, :cond_8

    .line 467
    int-to-float v2, p2

    mul-float/2addr v0, v2

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v0, v2

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v0, v2

    .line 474
    :goto_4
    const/4 v2, 0x0

    cmpg-float v2, v1, v2

    if-gez v2, :cond_2

    .line 475
    const/4 v1, 0x0

    .line 477
    :cond_2
    const/4 v2, 0x0

    cmpg-float v2, v0, v2

    if-gez v2, :cond_3

    .line 478
    const/4 v0, 0x0

    .line 480
    :cond_3
    invoke-virtual {v7, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 482
    const/4 v0, 0x1

    move v2, v0

    :goto_5
    if-ge v2, v9, :cond_b

    .line 483
    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    .line 484
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 485
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 487
    cmpg-float v12, v1, v10

    if-gez v12, :cond_9

    .line 488
    int-to-float v12, p1

    mul-float/2addr v1, v12

    const/high16 v12, 0x42c80000    # 100.0f

    div-float/2addr v1, v12

    const/high16 v12, 0x3f800000    # 1.0f

    sub-float/2addr v1, v12

    .line 492
    :goto_6
    cmpg-float v12, v0, v11

    if-gez v12, :cond_a

    .line 493
    int-to-float v12, p2

    mul-float/2addr v0, v12

    const/high16 v12, 0x42c80000    # 100.0f

    div-float/2addr v0, v12

    const/high16 v12, 0x3f800000    # 1.0f

    sub-float/2addr v0, v12

    .line 498
    :goto_7
    const/4 v12, 0x0

    cmpg-float v12, v1, v12

    if-gez v12, :cond_4

    .line 499
    const/4 v1, 0x0

    .line 501
    :cond_4
    const/4 v12, 0x0

    cmpg-float v12, v0, v12

    if-gez v12, :cond_5

    .line 502
    const/4 v0, 0x0

    .line 504
    :cond_5
    invoke-virtual {v7, v1, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 482
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_5

    .line 447
    :cond_6
    iget-object v8, v6, Lcom/roidapp/photogrid/release/lc;->p:Landroid/graphics/Region;

    invoke-virtual {v8, v2, v7, v0, v1}, Landroid/graphics/Region;->set(IIII)Z

    goto/16 :goto_2

    .line 464
    :cond_7
    int-to-float v2, p1

    mul-float/2addr v1, v2

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x3f800000    # 1.0f

    add-float/2addr v1, v2

    goto :goto_3

    .line 469
    :cond_8
    int-to-float v2, p2

    mul-float/2addr v0, v2

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v0, v2

    const/high16 v2, 0x3f800000    # 1.0f

    add-float/2addr v0, v2

    goto :goto_4

    .line 490
    :cond_9
    int-to-float v12, p1

    mul-float/2addr v1, v12

    const/high16 v12, 0x42c80000    # 100.0f

    div-float/2addr v1, v12

    const/high16 v12, 0x3f800000    # 1.0f

    add-float/2addr v1, v12

    goto :goto_6

    .line 495
    :cond_a
    int-to-float v12, p2

    mul-float/2addr v0, v12

    const/high16 v12, 0x42c80000    # 100.0f

    div-float/2addr v0, v12

    const/high16 v12, 0x3f800000    # 1.0f

    add-float/2addr v0, v12

    goto :goto_7

    .line 506
    :cond_b
    invoke-virtual {v7}, Landroid/graphics/Path;->close()V

    .line 507
    iput-object v7, v6, Lcom/roidapp/photogrid/release/lc;->a:Landroid/graphics/Path;

    .line 418
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto/16 :goto_0

    .line 509
    :cond_c
    return-void
.end method

.method private m()V
    .locals 14

    .prologue
    const/4 v13, 0x2

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v11, 0x1

    const/high16 v10, 0x42c80000    # 100.0f

    .line 531
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->D:Lcom/roidapp/photogrid/release/PhotoView;

    if-nez v0, :cond_1

    .line 615
    :cond_0
    return-void

    .line 535
    :cond_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ms;->F:Z

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->z:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_d

    .line 536
    :cond_2
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_d

    .line 3770
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->p()Ljava/util/List;

    move-result-object v4

    .line 3771
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->q()Ljava/util/List;

    move-result-object v5

    .line 3772
    if-eqz v4, :cond_4

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_4

    move v2, v3

    .line 3774
    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_4

    .line 3775
    new-instance v6, Lcom/roidapp/photogrid/release/qz;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->h:Landroid/app/Activity;

    invoke-direct {v6, v0}, Lcom/roidapp/photogrid/release/qz;-><init>(Landroid/content/Context;)V

    .line 3776
    iput v13, v6, Lcom/roidapp/photogrid/release/qz;->V:I

    .line 3777
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, v6, Lcom/roidapp/photogrid/release/qz;->K:Ljava/lang/String;

    .line 3778
    iget-object v0, v6, Lcom/roidapp/photogrid/release/qz;->K:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 3781
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 3782
    const-string v1, "x"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    div-float/2addr v1, v10

    iput v1, v6, Lcom/roidapp/photogrid/release/qz;->M:F

    .line 3783
    const-string v1, "y"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    div-float/2addr v1, v10

    iput v1, v6, Lcom/roidapp/photogrid/release/qz;->N:F

    .line 3784
    const-string v1, "angle"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    iput v1, v6, Lcom/roidapp/photogrid/release/qz;->l:F

    .line 3785
    const-string v1, "scale"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    div-float/2addr v0, v10

    iput v0, v6, Lcom/roidapp/photogrid/release/qz;->O:F

    .line 3786
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0, v6}, Lcom/roidapp/photogrid/release/PhotoView;->a(Lcom/roidapp/photogrid/release/ao;)V

    .line 3774
    :cond_3
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 4680
    :cond_4
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->X()Ljava/util/List;

    move-result-object v0

    .line 4681
    if-eqz v0, :cond_d

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_d

    .line 4682
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->h:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/rc;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/release/rc;

    move-result-object v1

    .line 4683
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/rc;->a()Ljava/util/HashMap;

    move-result-object v2

    .line 4684
    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    move-result v4

    .line 4685
    iget-object v1, v1, Lcom/roidapp/photogrid/release/rc;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 4687
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_5
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/m;

    .line 4688
    iget-object v1, v0, Lcom/roidapp/cloudlib/template/m;->a:Ljava/lang/String;

    .line 4689
    if-eqz v1, :cond_5

    .line 4692
    new-instance v7, Lcom/roidapp/photogrid/release/ra;

    iget-object v8, p0, Lcom/roidapp/photogrid/release/ms;->h:Landroid/app/Activity;

    invoke-direct {v7, v8, v1}, Lcom/roidapp/photogrid/release/ra;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 4693
    iput-boolean v11, v7, Lcom/roidapp/photogrid/release/ra;->an:Z

    .line 4694
    iget v1, p0, Lcom/roidapp/photogrid/release/ms;->n:I

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->c:I

    .line 4695
    iget v1, p0, Lcom/roidapp/photogrid/release/ms;->o:I

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->d:I

    .line 4696
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->g:I

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->ae:I

    .line 4697
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->h:I

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->af:I

    .line 4698
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->i:F

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->ah:F

    .line 4700
    iget-object v1, v0, Lcom/roidapp/cloudlib/template/m;->l:Ljava/lang/String;

    iput-object v1, v7, Lcom/roidapp/photogrid/release/ra;->ao:Ljava/lang/String;

    .line 4701
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->m:I

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->ap:I

    .line 4702
    iput-boolean v11, v7, Lcom/roidapp/photogrid/release/ra;->aq:Z

    .line 4703
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->n:I

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->ar:I

    .line 4704
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->n:I

    if-eq v1, v11, :cond_8

    .line 4705
    const/4 v1, 0x3

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->P:I

    .line 4706
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->n:I

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->ar:I

    .line 4711
    :goto_2
    iget-boolean v1, v0, Lcom/roidapp/cloudlib/template/m;->u:Z

    .line 4712
    iput-boolean v1, v7, Lcom/roidapp/photogrid/release/ra;->ag:Z

    .line 4713
    if-eqz v1, :cond_9

    .line 4714
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->q:F

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->au:F

    .line 4715
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->r:F

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->av:F

    .line 4716
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->s:F

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->aw:F

    .line 4717
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->t:I

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->ax:I

    .line 4725
    :goto_3
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->o:I

    if-ne v1, v11, :cond_a

    .line 4726
    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    iput-object v1, v7, Lcom/roidapp/photogrid/release/ra;->K:Landroid/text/Layout$Alignment;

    .line 4734
    :cond_6
    :goto_4
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->p:I

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->as:I

    .line 4736
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->k:I

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->aj:I

    .line 4738
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->f:I

    add-int/lit8 v8, v4, -0x1

    if-gt v1, v8, :cond_7

    .line 4739
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->f:I

    add-int/2addr v1, v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    iput-object v1, v7, Lcom/roidapp/photogrid/release/ra;->J:Landroid/graphics/Typeface;

    .line 4742
    :cond_7
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->j:I

    int-to-float v1, v1

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->ad:F

    .line 4743
    iget v1, p0, Lcom/roidapp/photogrid/release/ms;->n:I

    iget v8, p0, Lcom/roidapp/photogrid/release/ms;->o:I

    invoke-virtual {v7, v1, v8}, Lcom/roidapp/photogrid/release/ra;->b(II)V

    .line 4744
    invoke-virtual {v7}, Lcom/roidapp/photogrid/release/ra;->g()V

    .line 4745
    invoke-virtual {v7}, Lcom/roidapp/photogrid/release/ra;->l()V

    .line 4749
    iget v1, p0, Lcom/roidapp/photogrid/release/ms;->n:I

    int-to-float v1, v1

    iget v8, v0, Lcom/roidapp/cloudlib/template/m;->b:F

    mul-float/2addr v1, v8

    div-float/2addr v1, v10

    invoke-virtual {v7}, Lcom/roidapp/photogrid/release/ra;->c()I

    move-result v8

    div-int/lit8 v8, v8, 0x2

    int-to-float v8, v8

    sub-float/2addr v1, v8

    .line 4750
    iget v8, p0, Lcom/roidapp/photogrid/release/ms;->o:I

    int-to-float v8, v8

    iget v9, v0, Lcom/roidapp/cloudlib/template/m;->c:F

    mul-float/2addr v8, v9

    div-float/2addr v8, v10

    invoke-virtual {v7}, Lcom/roidapp/photogrid/release/ra;->d()I

    move-result v9

    div-int/lit8 v9, v9, 0x2

    int-to-float v9, v9

    sub-float/2addr v8, v9

    .line 4752
    invoke-virtual {v7, v12, v12}, Lcom/roidapp/photogrid/release/ra;->a(FF)Z

    .line 4754
    iget v9, v0, Lcom/roidapp/cloudlib/template/m;->e:F

    invoke-virtual {v7, v9}, Lcom/roidapp/photogrid/release/ra;->b(F)V

    .line 4755
    iget v9, v0, Lcom/roidapp/cloudlib/template/m;->d:F

    div-float/2addr v9, v10

    invoke-virtual {v7, v9}, Lcom/roidapp/photogrid/release/ra;->c(F)V

    .line 4756
    iget-boolean v0, v0, Lcom/roidapp/cloudlib/template/m;->v:Z

    if-eqz v0, :cond_c

    .line 4757
    invoke-virtual {v7, v1, v8}, Lcom/roidapp/photogrid/release/ra;->c(FF)V

    .line 4761
    :goto_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->z:Ljava/util/List;

    invoke-interface {v0, v3, v7}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto/16 :goto_1

    .line 4708
    :cond_8
    iput v11, v7, Lcom/roidapp/photogrid/release/ra;->P:I

    goto/16 :goto_2

    .line 4719
    :cond_9
    iput v12, v7, Lcom/roidapp/photogrid/release/ra;->au:F

    .line 4720
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->r:F

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->av:F

    .line 4721
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->s:F

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->aw:F

    .line 4722
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->t:I

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->ax:I

    goto/16 :goto_3

    .line 4727
    :cond_a
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->o:I

    if-ne v1, v13, :cond_b

    .line 4728
    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    iput-object v1, v7, Lcom/roidapp/photogrid/release/ra;->K:Landroid/text/Layout$Alignment;

    goto/16 :goto_4

    .line 4729
    :cond_b
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->o:I

    const/4 v8, 0x3

    if-ne v1, v8, :cond_6

    .line 4730
    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    iput-object v1, v7, Lcom/roidapp/photogrid/release/ra;->K:Landroid/text/Layout$Alignment;

    goto/16 :goto_4

    .line 4759
    :cond_c
    invoke-virtual {v7, v1, v8}, Lcom/roidapp/photogrid/release/ra;->b(FF)V

    goto :goto_5

    .line 544
    :cond_d
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->z:Ljava/util/List;

    if-eqz v0, :cond_14

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_14

    .line 545
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_10

    .line 546
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_e
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    .line 551
    instance-of v2, v0, Lcom/roidapp/photogrid/release/ps;

    if-nez v2, :cond_e

    .line 554
    iput-boolean v3, v0, Lcom/roidapp/photogrid/release/ao;->f:Z

    .line 555
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ms;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/PhotoView;->a(Lcom/roidapp/photogrid/release/ao;)V

    goto :goto_6

    .line 557
    :cond_f
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->h:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i()V

    .line 560
    :cond_10
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 564
    :goto_7
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->A:Ljava/util/List;

    if-eqz v0, :cond_12

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->A:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_12

    .line 565
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->E:Lcom/roidapp/photogrid/release/az;

    if-eqz v0, :cond_11

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_11

    .line 566
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->A:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 568
    :cond_11
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->A:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 573
    :cond_12
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 574
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v4, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 577
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_13
    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    .line 578
    instance-of v1, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_15

    move-object v1, v0

    .line 579
    check-cast v1, Lcom/roidapp/photogrid/release/ra;

    .line 580
    iget v6, v1, Lcom/roidapp/photogrid/release/ra;->j:F

    .line 581
    iget v7, v1, Lcom/roidapp/photogrid/release/ra;->k:F

    .line 585
    int-to-float v8, v2

    iget v9, v1, Lcom/roidapp/photogrid/release/ra;->c:I

    int-to-float v9, v9

    div-float/2addr v8, v9

    .line 586
    int-to-float v9, v4

    iget v10, v1, Lcom/roidapp/photogrid/release/ra;->d:I

    int-to-float v10, v10

    div-float/2addr v9, v10

    .line 588
    mul-float v10, v6, v8

    .line 589
    mul-float/2addr v9, v7

    .line 591
    iput v2, v1, Lcom/roidapp/photogrid/release/ra;->c:I

    .line 592
    iput v4, v1, Lcom/roidapp/photogrid/release/ra;->d:I

    .line 593
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ra;->i()V

    .line 596
    neg-float v6, v6

    neg-float v7, v7

    invoke-virtual {v1, v6, v7}, Lcom/roidapp/photogrid/release/ra;->b(FF)V

    .line 598
    iget v6, v1, Lcom/roidapp/photogrid/release/ra;->h:F

    .line 599
    mul-float/2addr v6, v8

    iget v7, v1, Lcom/roidapp/photogrid/release/ra;->l:F

    invoke-virtual {v1, v6, v7, v10, v9}, Lcom/roidapp/photogrid/release/ra;->b(FFFF)V

    move-object v1, v0

    .line 600
    check-cast v1, Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ra;->j()V

    .line 601
    iput-boolean v3, v0, Lcom/roidapp/photogrid/release/ao;->f:Z

    goto :goto_8

    .line 562
    :cond_14
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->h:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i()V

    goto/16 :goto_7

    .line 602
    :cond_15
    instance-of v1, v0, Lcom/roidapp/photogrid/release/qz;

    if-eqz v1, :cond_13

    .line 604
    check-cast v0, Lcom/roidapp/photogrid/release/qz;

    .line 606
    iget v1, v0, Lcom/roidapp/photogrid/release/qz;->c:I

    if-lez v1, :cond_16

    iget v1, v0, Lcom/roidapp/photogrid/release/qz;->d:I

    if-lez v1, :cond_16

    .line 607
    iget v1, v0, Lcom/roidapp/photogrid/release/qz;->j:F

    int-to-float v6, v2

    iget v7, v0, Lcom/roidapp/photogrid/release/qz;->c:I

    int-to-float v7, v7

    div-float/2addr v6, v7

    mul-float/2addr v1, v6

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->j:F

    .line 608
    iget v1, v0, Lcom/roidapp/photogrid/release/qz;->k:F

    int-to-float v6, v4

    iget v7, v0, Lcom/roidapp/photogrid/release/qz;->d:I

    int-to-float v7, v7

    div-float/2addr v6, v7

    mul-float/2addr v1, v6

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->k:F

    .line 610
    :cond_16
    iput v2, v0, Lcom/roidapp/photogrid/release/qz;->c:I

    .line 611
    iput v4, v0, Lcom/roidapp/photogrid/release/qz;->d:I

    .line 612
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/qz;->g()V

    goto :goto_8
.end method

.method private n()V
    .locals 5

    .prologue
    .line 823
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->y:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    .line 824
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ms;->G:Z

    if-eqz v0, :cond_4

    .line 825
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 826
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ms;->y:Ljava/util/ArrayList;

    monitor-enter v2

    .line 827
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ic;

    .line 828
    if-eqz v0, :cond_0

    .line 829
    iget-object v4, v0, Lcom/roidapp/photogrid/release/ic;->b:Lcom/roidapp/photogrid/release/lc;

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 830
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ic;->a()V

    goto :goto_0

    .line 838
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 834
    :cond_1
    :try_start_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 835
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->m(Ljava/util/List;)V

    .line 837
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 838
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 853
    :cond_3
    :goto_1
    return-void

    .line 840
    :cond_4
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ms;->G:Z

    .line 841
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->y:Ljava/util/ArrayList;

    monitor-enter v1

    .line 842
    :try_start_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ic;

    .line 843
    if-eqz v0, :cond_5

    .line 844
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ic;->a()V

    goto :goto_2

    .line 849
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    .line 848
    :cond_6
    :try_start_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 849
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1
.end method


# virtual methods
.method public final a()V
    .locals 11

    .prologue
    const/high16 v10, 0x3f400000    # 0.75f

    const/high16 v9, 0x3f800000    # 1.0f

    const/4 v8, 0x1

    .line 252
    :try_start_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ms;->n()V

    .line 253
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xb

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 1168
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->j:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 1169
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 1172
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v2

    .line 1175
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, p0, Lcom/roidapp/photogrid/release/ms;->x:I

    .line 1176
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/roidapp/photogrid/release/ms;->w:I

    .line 1177
    iget v0, p0, Lcom/roidapp/photogrid/release/ms;->x:I

    iget v1, p0, Lcom/roidapp/photogrid/release/ms;->w:I

    if-ge v0, v1, :cond_1

    .line 1178
    iget v0, p0, Lcom/roidapp/photogrid/release/ms;->x:I

    .line 1179
    iget v1, p0, Lcom/roidapp/photogrid/release/ms;->w:I

    iput v1, p0, Lcom/roidapp/photogrid/release/ms;->x:I

    .line 1180
    iput v0, p0, Lcom/roidapp/photogrid/release/ms;->w:I

    .line 1184
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0900dd

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    .line 1185
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f090058

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    .line 1186
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f090057

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    .line 1188
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->h:Landroid/app/Activity;

    const v5, 0x7f0d0085

    invoke-virtual {v0, v5}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v5

    .line 1189
    if-eqz v5, :cond_2

    .line 1190
    invoke-static {}, Lcom/roidapp/photogrid/common/a;->a()Lcom/roidapp/photogrid/common/a;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->h:Landroid/app/Activity;

    const-string v6, "grid"

    const/4 v7, 0x1

    invoke-static {v0, v6, v7}, Lcom/roidapp/photogrid/common/a;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->h:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/photogrid/a/m;->a(Landroid/content/Context;)I

    move-result v0

    if-eq v0, v8, :cond_5

    .line 1191
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->B:Z

    if-nez v0, :cond_3

    .line 1192
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1194
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->h:Landroid/app/Activity;

    instance-of v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_2

    .line 1195
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->h:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 1196
    iget-boolean v6, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->F:Z

    if-eqz v6, :cond_2

    .line 1197
    const/4 v6, 0x0

    iput-boolean v6, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->F:Z

    .line 1198
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->C()V

    .line 1208
    :cond_2
    :goto_0
    if-eqz v5, :cond_6

    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_6

    .line 1209
    const v0, 0x7f0d0086

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 1210
    if-eqz v0, :cond_11

    .line 1211
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1212
    if-lez v0, :cond_11

    .line 1213
    int-to-float v0, v0

    .line 1221
    :goto_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->h:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v5, 0x7f0900cb

    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    .line 1222
    iget v5, p0, Lcom/roidapp/photogrid/release/ms;->x:I

    int-to-float v5, v5

    sub-float v3, v5, v3

    sub-float/2addr v3, v4

    sub-float v0, v3, v0

    sub-float/2addr v0, v1

    sget v1, Lcom/roidapp/photogrid/common/az;->g:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    float-to-int v1, v0

    .line 1225
    iget v0, p0, Lcom/roidapp/photogrid/release/ms;->w:I

    int-to-float v0, v0

    int-to-float v3, v1

    div-float/2addr v0, v3

    .line 1226
    cmpg-float v0, v2, v0

    if-gez v0, :cond_7

    .line 1228
    int-to-float v0, v1

    mul-float/2addr v0, v2

    float-to-int v0, v0

    .line 1233
    :goto_2
    int-to-float v0, v0

    iget v2, p0, Lcom/roidapp/photogrid/release/ms;->C:F

    mul-float/2addr v0, v2

    float-to-int v2, v0

    .line 1234
    int-to-float v0, v1

    iget v1, p0, Lcom/roidapp/photogrid/release/ms;->C:F

    mul-float/2addr v0, v1

    float-to-int v1, v0

    .line 1236
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->h:Landroid/app/Activity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v3, 0x7f03000c

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ms;->j:Landroid/view/ViewGroup;

    .line 1237
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v3, -0x2

    const/4 v4, -0x2

    invoke-direct {v0, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 1238
    iput v2, v0, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 1239
    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 1240
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->j:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1241
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->j:Landroid/view/ViewGroup;

    const v1, 0x7f0d0061

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ms;->k:Landroid/widget/RelativeLayout;

    .line 1243
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->j:Landroid/view/ViewGroup;

    const v1, 0x7f0d0060

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ms;->p:Landroid/widget/LinearLayout;

    .line 1244
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 1246
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ms;->q:Lcom/roidapp/photogrid/release/an;

    .line 255
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xc

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 256
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->k:Landroid/widget/RelativeLayout;

    if-nez v0, :cond_8

    .line 257
    const-string v0, "192"

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->h:Landroid/app/Activity;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    .line 304
    :goto_3
    return-void

    .line 1202
    :cond_3
    const/16 v0, 0x8

    invoke-virtual {v5, v0}, Landroid/view/View;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 281
    :catch_0
    move-exception v0

    .line 282
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ms;->n()V

    .line 283
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_10

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "bg create decodeBitmap null"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "sticker create bitmap null"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    .line 284
    :cond_4
    iget v1, p0, Lcom/roidapp/photogrid/release/ms;->C:F

    cmpl-float v1, v1, v9

    if-nez v1, :cond_e

    .line 285
    iput v10, p0, Lcom/roidapp/photogrid/release/ms;->C:F

    .line 286
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->K:Landroid/os/Handler;

    invoke-virtual {v0, v8}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_3

    .line 1205
    :cond_5
    const/16 v0, 0x8

    :try_start_1
    invoke-virtual {v5, v0}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_0

    .line 1218
    :cond_6
    const/4 v0, 0x0

    goto/16 :goto_1

    .line 1230
    :cond_7
    iget v0, p0, Lcom/roidapp/photogrid/release/ms;->w:I

    .line 1231
    int-to-float v1, v0

    div-float/2addr v1, v2

    float-to-int v1, v1

    goto/16 :goto_2

    .line 260
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1313
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ay()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 1314
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->y:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v1, v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/rf;->a(Ljava/util/ArrayList;I)V

    .line 261
    :goto_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xd

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 262
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->k:Landroid/widget/RelativeLayout;

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ms;->a(Landroid/widget/RelativeLayout;)V

    .line 263
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xe

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 1403
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v0, p0, Lcom/roidapp/photogrid/release/ms;->n:I

    .line 1404
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v0, p0, Lcom/roidapp/photogrid/release/ms;->o:I

    .line 1405
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->q:Lcom/roidapp/photogrid/release/an;

    if-nez v0, :cond_9

    .line 1406
    new-instance v0, Lcom/roidapp/photogrid/release/an;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->h:Landroid/app/Activity;

    iget v2, p0, Lcom/roidapp/photogrid/release/ms;->n:I

    iget v3, p0, Lcom/roidapp/photogrid/release/ms;->o:I

    invoke-direct {v0, v1, v2, v3}, Lcom/roidapp/photogrid/release/an;-><init>(Landroid/content/Context;II)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ms;->q:Lcom/roidapp/photogrid/release/an;

    .line 1407
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->q:Lcom/roidapp/photogrid/release/an;

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->B()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/an;->c(Z)V

    .line 1408
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->q:Lcom/roidapp/photogrid/release/an;

    iget v1, p0, Lcom/roidapp/photogrid/release/ms;->r:I

    iget v2, p0, Lcom/roidapp/photogrid/release/ms;->s:I

    iget v3, p0, Lcom/roidapp/photogrid/release/ms;->t:I

    iget v4, p0, Lcom/roidapp/photogrid/release/ms;->u:I

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/release/an;->a(IIII)V

    .line 265
    :cond_9
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xf

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 267
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x10

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 272
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x11

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 2372
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 2373
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->D:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v1, :cond_a

    .line 2374
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/PhotoView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2376
    :cond_a
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->E:Lcom/roidapp/photogrid/release/az;

    if-eqz v1, :cond_b

    .line 2377
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/az;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 274
    :cond_b
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x12

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 275
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ms;->m()V

    .line 276
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x13

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 277
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/release/ms;->d(II)V

    .line 278
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x14

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 279
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->j:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 3330
    new-instance v2, Ljava/lang/Thread;

    new-instance v3, Lcom/roidapp/photogrid/release/mt;

    invoke-direct {v3, p0, v0, v1}, Lcom/roidapp/photogrid/release/mt;-><init>(Lcom/roidapp/photogrid/release/ms;II)V

    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 280
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x15

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    goto/16 :goto_3

    .line 1315
    :cond_c
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aL()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aM()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 1316
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->y:Ljava/util/ArrayList;

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->aL()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/rf;->a(Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 1317
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->k(Ljava/lang/String;)V

    .line 1318
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->r(Z)V

    goto/16 :goto_4

    .line 1320
    :cond_d
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->h:Landroid/app/Activity;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->y:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ms;->B:[I

    iget v3, p0, Lcom/roidapp/photogrid/release/ms;->m:I

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v4, v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;Ljava/util/ArrayList;[III)V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_4

    .line 288
    :cond_e
    iget v1, p0, Lcom/roidapp/photogrid/release/ms;->C:F

    cmpl-float v1, v1, v10

    if-nez v1, :cond_f

    .line 289
    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lcom/roidapp/photogrid/release/ms;->C:F

    .line 290
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->K:Landroid/os/Handler;

    invoke-virtual {v0, v8}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_3

    .line 293
    :cond_f
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 294
    iput v9, p0, Lcom/roidapp/photogrid/release/ms;->C:F

    .line 295
    const/16 v0, 0x8e

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ms;->d(I)V

    goto/16 :goto_3

    .line 299
    :cond_10
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 300
    iput v9, p0, Lcom/roidapp/photogrid/release/ms;->C:F

    .line 301
    const/16 v0, 0x8f

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ms;->d(I)V

    goto/16 :goto_3

    :cond_11
    move v0, v1

    goto/16 :goto_1
.end method

.method public final a(Landroid/widget/RelativeLayout;Landroid/view/View$OnTouchListener;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 619
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ms;->H:Z

    if-eqz v0, :cond_0

    .line 674
    :goto_0
    return-void

    .line 622
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x4a

    invoke-virtual {v0, v1, v3}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 624
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->q:Lcom/roidapp/photogrid/release/an;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-nez v0, :cond_1

    .line 625
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->p:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->q:Lcom/roidapp/photogrid/release/an;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 628
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x4b

    invoke-virtual {v0, v1, v3}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 630
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v1, v1

    if-ne v0, v1, :cond_8

    move v2, v3

    .line 631
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-ge v2, v0, :cond_2

    .line 632
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->k:Landroid/widget/RelativeLayout;

    add-int/lit8 v1, v2, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/if;

    .line 633
    if-nez v0, :cond_7

    .line 634
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ms;->a()V

    .line 649
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->E:Lcom/roidapp/photogrid/release/az;

    if-eqz v0, :cond_4

    .line 650
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 651
    if-eqz v0, :cond_3

    .line 652
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 654
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->j:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 657
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->D:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_6

    .line 658
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 659
    if-eqz v0, :cond_5

    .line 660
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 662
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->j:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 667
    :cond_6
    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 668
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->h:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f09010a

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v0, v3, v3, v3, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 669
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 670
    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->removeAllViews()V

    .line 671
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->j:Landroid/view/ViewGroup;

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 673
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p2}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    goto/16 :goto_0

    .line 637
    :cond_7
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 638
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 639
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/if;->b(Landroid/graphics/Bitmap;)V

    .line 640
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/if;->a(Landroid/graphics/Bitmap;)V

    .line 641
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->l:Lcom/roidapp/photogrid/release/ml;

    mul-int/lit8 v1, v2, 0x2

    add-int/lit8 v1, v1, 0x4c

    invoke-virtual {v0, v1, v3}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 631
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto/16 :goto_1

    .line 644
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->l:Lcom/roidapp/photogrid/release/ml;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    goto/16 :goto_0
.end method

.method public final b(Z)I
    .locals 2

    .prologue
    .line 857
    if-eqz p1, :cond_0

    .line 858
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->B:[I

    array-length v0, v0

    .line 865
    :goto_0
    return v0

    .line 860
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aA()I

    move-result v0

    .line 861
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->B:[I

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    if-lt v0, v1, :cond_1

    .line 862
    const/4 v0, 0x0

    goto :goto_0

    .line 864
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 865
    goto :goto_0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 793
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ms;->H:Z

    .line 794
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->j:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 795
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 797
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ms;->n()V

    .line 798
    return-void
.end method

.method public final b(II)V
    .locals 4

    .prologue
    .line 918
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, p1

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ig;->c()V

    .line 919
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, p2

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ig;->c()V

    .line 921
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, p1

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ig;->a()Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    .line 922
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, p1

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/lc;->a()Lcom/roidapp/photogrid/release/lc;

    move-result-object v1

    .line 924
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v3, v3, p2

    aput-object v3, v2, p1

    .line 925
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    aput-object v0, v2, p2

    .line 926
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, p2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    iput-object v2, v0, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    .line 927
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, p1

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    .line 935
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 936
    const/4 v1, 0x2

    iput v1, v0, Landroid/os/Message;->what:I

    .line 937
    iput p1, v0, Landroid/os/Message;->arg1:I

    .line 938
    iput p2, v0, Landroid/os/Message;->arg2:I

    .line 939
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->K:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 945
    return-void
.end method

.method public final b(IZ)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    const/4 v4, 0x0

    .line 1056
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->y:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 1085
    :cond_0
    :goto_0
    return-void

    .line 1059
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->j:Landroid/view/ViewGroup;

    add-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/if;

    .line 1061
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    .line 1062
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput-boolean p2, v2, Lcom/roidapp/photogrid/release/ig;->B:Z

    .line 1064
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    const/high16 v3, 0x3f800000    # 1.0f

    iput v3, v2, Lcom/roidapp/photogrid/release/ig;->v:F

    .line 1065
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v4, v2, Lcom/roidapp/photogrid/release/ig;->t:F

    .line 1066
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v4, v2, Lcom/roidapp/photogrid/release/ig;->u:F

    .line 1067
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v5, v2, Lcom/roidapp/photogrid/release/ig;->p:I

    .line 1068
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v5, v2, Lcom/roidapp/photogrid/release/ig;->x:I

    .line 1069
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v6, v2, Lcom/roidapp/photogrid/release/ig;->r:I

    .line 1070
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v6, v2, Lcom/roidapp/photogrid/release/ig;->s:I

    .line 1078
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput-object v2, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    .line 1079
    iget-object v1, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/if;->a(Landroid/graphics/Bitmap;)V

    goto :goto_0
.end method

.method public final c(I)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v2, 0x0

    .line 1015
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->k:Landroid/widget/RelativeLayout;

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ms;->a(Landroid/widget/RelativeLayout;)V

    .line 1016
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/release/ms;->d(II)V

    .line 1018
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v1, v1

    if-ne v0, v1, :cond_0

    move v1, v2

    .line 1019
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-ge v1, v0, :cond_0

    .line 1020
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->k:Landroid/widget/RelativeLayout;

    add-int/lit8 v3, v1, 0x1

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/if;

    .line 1021
    if-nez v0, :cond_1

    .line 1026
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ms;->a()V

    .line 1038
    :cond_0
    return-void

    .line 1032
    :cond_1
    iget-object v3, v0, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/if;->b(Landroid/graphics/Bitmap;)V

    .line 1033
    if-ne p1, v4, :cond_2

    move v3, v4

    :goto_1
    iput-boolean v3, v0, Lcom/roidapp/photogrid/release/if;->D:Z

    .line 1034
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/if;->invalidate()V

    .line 1019
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_2
    move v3, v2

    .line 1033
    goto :goto_1
.end method

.method public final c(II)V
    .locals 9

    .prologue
    const/16 v8, 0xf

    .line 949
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->y:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 1011
    :cond_0
    :goto_0
    return-void

    .line 952
    :cond_1
    const-string v0, "Exchange"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 954
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->y:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ic;

    .line 955
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    .line 957
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ms;->j:Landroid/view/ViewGroup;

    add-int/lit8 v3, p1, 0x1

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/roidapp/photogrid/release/if;

    .line 958
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ms;->j:Landroid/view/ViewGroup;

    add-int/lit8 v4, p2, 0x1

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/roidapp/photogrid/release/if;

    .line 959
    iget-object v4, v2, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    .line 960
    iget-object v5, v3, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    .line 964
    iput-object v5, v0, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    .line 965
    iput-object v4, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    .line 966
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v4, v4, p1

    iput-object v4, v2, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    .line 967
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v4, v4, p2

    iput-object v4, v3, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    .line 970
    iget-object v4, v2, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget-boolean v4, v4, Lcom/roidapp/photogrid/release/ig;->B:Z

    iput-boolean v4, v2, Lcom/roidapp/photogrid/release/if;->C:Z

    .line 974
    iget-object v4, v3, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget-boolean v4, v4, Lcom/roidapp/photogrid/release/ig;->B:Z

    iput-boolean v4, v3, Lcom/roidapp/photogrid/release/if;->C:Z

    .line 979
    :try_start_0
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ms;->h:Landroid/app/Activity;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v5, v5, p1

    iget v6, v0, Lcom/roidapp/photogrid/release/ic;->d:I

    iget v7, v0, Lcom/roidapp/photogrid/release/ic;->e:I

    invoke-virtual {v0, v4, v5, v6, v7}, Lcom/roidapp/photogrid/release/ic;->a(Landroid/content/Context;Lcom/roidapp/photogrid/release/ig;II)Landroid/graphics/Bitmap;

    .line 980
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ms;->h:Landroid/app/Activity;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ms;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v5, v5, p2

    iget v6, v1, Lcom/roidapp/photogrid/release/ic;->d:I

    iget v7, v1, Lcom/roidapp/photogrid/release/ic;->e:I

    invoke-virtual {v1, v4, v5, v6, v7}, Lcom/roidapp/photogrid/release/ic;->a(Landroid/content/Context;Lcom/roidapp/photogrid/release/ig;II)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 988
    iget-object v4, v0, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/if;->b(Landroid/graphics/Bitmap;)V

    .line 989
    iget-object v0, v0, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/if;->a(Landroid/graphics/Bitmap;)V

    .line 991
    iget-object v0, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/if;->b(Landroid/graphics/Bitmap;)V

    .line 992
    iget-object v0, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/if;->a(Landroid/graphics/Bitmap;)V

    .line 994
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->l:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v0, v8}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 982
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 983
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->l:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v0, v8}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    .line 984
    const/16 v0, 0xa1

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ms;->d(I)V

    goto/16 :goto_0
.end method

.method public final f()V
    .locals 2

    .prologue
    .line 802
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->A:Ljava/util/List;

    if-nez v0, :cond_0

    .line 803
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ms;->A:Ljava/util/List;

    .line 805
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->D:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_2

    .line 806
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->z:Ljava/util/List;

    if-nez v0, :cond_1

    .line 807
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ms;->z:Ljava/util/List;

    .line 809
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->z:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->e()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 810
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->z:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->j(Ljava/util/List;)V

    .line 812
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->E:Lcom/roidapp/photogrid/release/az;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 813
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->A:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 814
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ms;->A:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->e(Ljava/util/List;)V

    .line 815
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ms;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 817
    :cond_3
    return-void
.end method
