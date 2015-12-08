.class public final Lcom/roidapp/photogrid/release/ck;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field a:Landroid/content/SharedPreferences;

.field b:Landroid/content/SharedPreferences$Editor;

.field public final c:[I

.field private d:F

.field private e:F

.field private f:F

.field private g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private h:I

.field private i:I

.field private j:I

.field private k:Landroid/view/View;

.field private l:F

.field private m:Z

.field private n:Z

.field private o:Z

.field private p:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/high16 v0, -0x3e500000    # -22.0f

    .line 24
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 29
    iput v0, p0, Lcom/roidapp/photogrid/release/ck;->d:F

    iput v0, p0, Lcom/roidapp/photogrid/release/ck;->e:F

    iput v0, p0, Lcom/roidapp/photogrid/release/ck;->f:F

    .line 549
    const/16 v0, 0xa

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ck;->c:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x7f020077
        0x7f020078
        0x7f020079
        0x7f02007f
        0x7f02007e
        0x7f020076
        0x7f02007a
        0x7f02007b
        0x7f02007c
        0x7f02007d
    .end array-data
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ck;)F
    .locals 1

    .prologue
    .line 24
    iget v0, p0, Lcom/roidapp/photogrid/release/ck;->e:F

    return v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ck;F)F
    .locals 0

    .prologue
    .line 24
    iput p1, p0, Lcom/roidapp/photogrid/release/ck;->e:F

    return p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ck;I)I
    .locals 0

    .prologue
    .line 24
    iput p1, p0, Lcom/roidapp/photogrid/release/ck;->i:I

    return p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ck;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    .prologue
    .line 24
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ck;->p:Ljava/lang/Integer;

    return-object p1
.end method

.method private a(Landroid/widget/SeekBar;Landroid/widget/SeekBar;Landroid/widget/SeekBar;)V
    .locals 6

    .prologue
    const/high16 v5, 0x42c80000    # 100.0f

    const/high16 v4, 0x42480000    # 50.0f

    const/high16 v3, 0x40000000    # 2.0f

    const/high16 v2, 0x3fc00000    # 1.5f

    .line 418
    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    .line 420
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->S()F

    move-result v0

    iget v1, p0, Lcom/roidapp/photogrid/release/ck;->l:F

    div-float/2addr v1, v3

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 421
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/release/ck;->l:F

    div-float/2addr v1, v3

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 423
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->R()F

    move-result v0

    iget v1, p0, Lcom/roidapp/photogrid/release/ck;->l:F

    div-float/2addr v1, v3

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 424
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/release/ck;->l:F

    div-float/2addr v1, v3

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->d(F)V

    .line 426
    :cond_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->S()F

    move-result v0

    cmpg-float v0, v0, v2

    if-gtz v0, :cond_8

    .line 427
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->S()F

    move-result v0

    div-float/2addr v0, v2

    mul-float/2addr v0, v4

    float-to-int v0, v0

    invoke-virtual {p1, v0}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 431
    :goto_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->R()F

    move-result v0

    cmpg-float v0, v0, v2

    if-gtz v0, :cond_9

    .line 432
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->R()F

    move-result v0

    div-float/2addr v0, v2

    mul-float/2addr v0, v4

    float-to-int v0, v0

    invoke-virtual {p2, v0}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 437
    :goto_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ck;->m:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ck;->n:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ck;->o:Z

    if-nez v0, :cond_2

    .line 438
    const-string v0, "OUTER_SPACE"

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->S()F

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/release/ck;->a(Ljava/lang/String;F)V

    .line 439
    const-string v0, "INNER_SPACE"

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->R()F

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/release/ck;->a(Ljava/lang/String;F)V

    .line 442
    :cond_2
    invoke-virtual {p1}, Landroid/widget/SeekBar;->getProgress()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ck;->i:I

    .line 443
    invoke-virtual {p2}, Landroid/widget/SeekBar;->getProgress()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ck;->h:I

    .line 445
    :cond_3
    if-eqz p3, :cond_7

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ck;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ck;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ck;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/mm;->j:Landroid/view/ViewGroup;

    if-eqz v0, :cond_7

    .line 448
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ck;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/mm;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 449
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ck;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/mm;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 450
    int-to-float v0, v1

    .line 451
    if-le v1, v2, :cond_4

    .line 452
    int-to-float v0, v2

    .line 454
    :cond_4
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->Q()F

    move-result v1

    mul-float/2addr v0, v1

    div-float v1, v0, v5

    .line 457
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v2, 0x6

    if-ne v0, v2, :cond_a

    .line 458
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->V()F

    move-result v0

    float-to-int v0, v0

    .line 466
    :cond_5
    :goto_2
    invoke-virtual {p3, v0}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 467
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    if-nez v0, :cond_6

    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ck;->n:Z

    if-nez v0, :cond_6

    .line 468
    const-string v0, "CORNER_RADIOUS"

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->V()F

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/release/ck;->a(Ljava/lang/String;F)V

    .line 470
    :cond_6
    invoke-virtual {p3}, Landroid/widget/SeekBar;->getProgress()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ck;->j:I

    .line 472
    :cond_7
    return-void

    .line 429
    :cond_8
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->S()F

    move-result v0

    sub-float/2addr v0, v2

    iget v1, p0, Lcom/roidapp/photogrid/release/ck;->l:F

    div-float/2addr v1, v3

    sub-float/2addr v1, v2

    div-float/2addr v0, v1

    mul-float/2addr v0, v4

    add-float/2addr v0, v4

    float-to-int v0, v0

    invoke-virtual {p1, v0}, Landroid/widget/SeekBar;->setProgress(I)V

    goto/16 :goto_0

    .line 434
    :cond_9
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->R()F

    move-result v0

    sub-float/2addr v0, v2

    iget v1, p0, Lcom/roidapp/photogrid/release/ck;->l:F

    div-float/2addr v1, v3

    sub-float/2addr v1, v2

    div-float/2addr v0, v1

    mul-float/2addr v0, v4

    add-float/2addr v0, v4

    float-to-int v0, v0

    invoke-virtual {p2, v0}, Landroid/widget/SeekBar;->setProgress(I)V

    goto/16 :goto_1

    .line 460
    :cond_a
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->V()F

    move-result v0

    div-float/2addr v0, v1

    const/high16 v2, 0x43480000    # 200.0f

    mul-float/2addr v0, v2

    float-to-int v0, v0

    .line 461
    int-to-float v2, v0

    cmpl-float v2, v2, v5

    if-lez v2, :cond_5

    .line 462
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    div-float/2addr v1, v3

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->f(F)V

    .line 463
    const/16 v0, 0x64

    goto :goto_2
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ck;Ljava/lang/String;F)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0, p1, p2}, Lcom/roidapp/photogrid/release/ck;->a(Ljava/lang/String;F)V

    return-void
.end method

.method private a(Ljava/lang/String;F)V
    .locals 1

    .prologue
    .line 530
    const/high16 v0, -0x3e500000    # -22.0f

    cmpl-float v0, p2, v0

    if-nez v0, :cond_0

    .line 534
    :goto_0
    return-void

    .line 533
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ck;->b:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/ck;F)F
    .locals 0

    .prologue
    .line 24
    iput p1, p0, Lcom/roidapp/photogrid/release/ck;->d:F

    return p1
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/ck;I)I
    .locals 0

    .prologue
    .line 24
    iput p1, p0, Lcom/roidapp/photogrid/release/ck;->h:I

    return p1
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/ck;)Lcom/roidapp/photogrid/release/PhotoGridActivity;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ck;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/ck;F)F
    .locals 0

    .prologue
    .line 24
    iput p1, p0, Lcom/roidapp/photogrid/release/ck;->f:F

    return p1
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/ck;)I
    .locals 1

    .prologue
    .line 24
    iget v0, p0, Lcom/roidapp/photogrid/release/ck;->i:I

    return v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/ck;I)I
    .locals 0

    .prologue
    .line 24
    iput p1, p0, Lcom/roidapp/photogrid/release/ck;->j:I

    return p1
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/ck;)F
    .locals 1

    .prologue
    .line 24
    iget v0, p0, Lcom/roidapp/photogrid/release/ck;->l:F

    return v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/ck;)Z
    .locals 1

    .prologue
    .line 24
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ck;->m:Z

    return v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/release/ck;)Z
    .locals 1

    .prologue
    .line 24
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ck;->n:Z

    return v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/release/ck;)Z
    .locals 1

    .prologue
    .line 24
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ck;->o:Z

    return v0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/release/ck;)F
    .locals 1

    .prologue
    .line 24
    iget v0, p0, Lcom/roidapp/photogrid/release/ck;->d:F

    return v0
.end method

.method static synthetic i(Lcom/roidapp/photogrid/release/ck;)I
    .locals 1

    .prologue
    .line 24
    iget v0, p0, Lcom/roidapp/photogrid/release/ck;->h:I

    return v0
.end method

.method static synthetic j(Lcom/roidapp/photogrid/release/ck;)F
    .locals 1

    .prologue
    .line 24
    iget v0, p0, Lcom/roidapp/photogrid/release/ck;->f:F

    return v0
.end method

.method static synthetic k(Lcom/roidapp/photogrid/release/ck;)I
    .locals 1

    .prologue
    .line 24
    iget v0, p0, Lcom/roidapp/photogrid/release/ck;->j:I

    return v0
.end method

.method static synthetic l(Lcom/roidapp/photogrid/release/ck;)V
    .locals 5

    .prologue
    const/4 v0, 0x1

    const v2, 0x3fb9999a    # 1.45f

    const v4, 0x3f23d70a    # 0.64f

    const/4 v3, 0x0

    .line 1478
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v1, :pswitch_data_0

    .line 1525
    :cond_0
    :goto_0
    :pswitch_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ck;->a()V

    .line 1526
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ck;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/mm;->c(I)V

    .line 24
    return-void

    .line 1483
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ck;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget v0, v0, Lcom/roidapp/photogrid/release/mm;->r:I

    if-eqz v0, :cond_1

    .line 1484
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 1485
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->d(F)V

    .line 1489
    :goto_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->f(F)V

    goto :goto_0

    .line 1487
    :cond_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    goto :goto_1

    .line 1492
    :pswitch_2
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ck;->o:Z

    if-eqz v0, :cond_2

    .line 1493
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->aO()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 1494
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->aQ()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->d(F)V

    .line 1495
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->aP()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->f(F)V

    goto :goto_0

    .line 1497
    :cond_2
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 1498
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->d(F)V

    .line 1499
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->f(F)V

    goto :goto_0

    .line 1503
    :pswitch_3
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ck;->o:Z

    if-eqz v1, :cond_3

    .line 1504
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->aO()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 1505
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->aQ()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ih;->d(F)V

    .line 1506
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->aP()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ih;->f(F)V

    .line 2410
    :goto_2
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v2, 0x5

    if-ne v1, v2, :cond_5

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v1

    if-ne v1, v0, :cond_5

    .line 1517
    :goto_3
    if-nez v0, :cond_0

    .line 1518
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ck;->b:Landroid/content/SharedPreferences$Editor;

    const-string v1, "OUTER_SPACE"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 1519
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ck;->b:Landroid/content/SharedPreferences$Editor;

    const-string v1, "INNER_SPACE"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 1520
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ck;->b:Landroid/content/SharedPreferences$Editor;

    const-string v1, "CORNER_RADIOUS"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 1521
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ck;->b:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto/16 :goto_0

    .line 1508
    :cond_3
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ck;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget v1, v1, Lcom/roidapp/photogrid/release/mm;->r:I

    if-eqz v1, :cond_4

    .line 1509
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 1513
    :goto_4
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/ih;->d(F)V

    .line 1514
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/roidapp/photogrid/release/ih;->f(F)V

    goto :goto_2

    .line 1511
    :cond_4
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    goto :goto_4

    .line 2413
    :cond_5
    const/4 v0, 0x0

    goto :goto_3

    .line 1478
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method static synthetic m(Lcom/roidapp/photogrid/release/ck;)Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ck;->p:Ljava/lang/Integer;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    .line 540
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ck;->k:Landroid/view/View;

    if-nez v0, :cond_0

    .line 547
    :goto_0
    return-void

    .line 543
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ck;->k:Landroid/view/View;

    const v1, 0x7f0d004f

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    .line 544
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ck;->k:Landroid/view/View;

    const v2, 0x7f0d0052

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/SeekBar;

    .line 545
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ck;->k:Landroid/view/View;

    const v3, 0x7f0d0055

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/SeekBar;

    .line 546
    invoke-direct {p0, v0, v1, v2}, Lcom/roidapp/photogrid/release/ck;->a(Landroid/widget/SeekBar;Landroid/widget/SeekBar;Landroid/widget/SeekBar;)V

    goto :goto_0
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 45
    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ck;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 46
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 47
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 11

    .prologue
    .line 55
    const v0, 0x7f030007

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ck;->k:Landroid/view/View;

    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ck;->k:Landroid/view/View;

    const v1, 0x7f0d004b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 57
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ck;->k:Landroid/view/View;

    const v1, 0x7f0d0056

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    .line 58
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ck;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ck;->a:Landroid/content/SharedPreferences;

    .line 59
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ck;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ck;->b:Landroid/content/SharedPreferences$Editor;

    .line 60
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->Q()F

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ck;->l:F

    .line 1372
    const v0, 0x7f0d0058

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 1373
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ck;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v5

    .line 1374
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ck;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0900d1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v6, v1

    .line 1375
    iget-object v7, p0, Lcom/roidapp/photogrid/release/ck;->c:[I

    .line 1376
    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v1, v7

    if-ge v2, v1, :cond_0

    .line 1377
    aget v8, v7, v2

    .line 1378
    const v1, 0x7f030128

    const/4 v9, 0x0

    invoke-virtual {v5, v1, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v9

    .line 1379
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v1, v6, v6}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v9, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1380
    invoke-virtual {v9, v8}, Landroid/view/View;->setId(I)V

    .line 1381
    const v1, 0x7f0d0494

    invoke-virtual {v9, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 1383
    iget-object v10, p0, Lcom/roidapp/photogrid/release/ck;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v10}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10, v8}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v10

    .line 1384
    invoke-virtual {v1, v10}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1386
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v1, v10}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 1387
    new-instance v10, Lcom/roidapp/photogrid/release/cr;

    invoke-direct {v10, p0, v0, v9, v8}, Lcom/roidapp/photogrid/release/cr;-><init>(Lcom/roidapp/photogrid/release/ck;Landroid/view/ViewGroup;Landroid/view/View;I)V

    invoke-virtual {v1, v10}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1402
    invoke-virtual {v0, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1376
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_0

    .line 63
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ck;->m:Z

    .line 64
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ck;->n:Z

    .line 65
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_0

    .line 101
    :cond_1
    :goto_1
    :pswitch_0
    if-eqz v3, :cond_2

    .line 102
    new-instance v0, Lcom/roidapp/photogrid/release/cl;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/cl;-><init>(Lcom/roidapp/photogrid/release/ck;)V

    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 110
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ck;->k:Landroid/view/View;

    const v1, 0x7f0d0059

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 111
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ck;->k:Landroid/view/View;

    const v2, 0x7f0d004f

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/SeekBar;

    .line 112
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ck;->k:Landroid/view/View;

    const v3, 0x7f0d0052

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/SeekBar;

    .line 113
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ck;->k:Landroid/view/View;

    const v4, 0x7f0d0055

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/SeekBar;

    .line 114
    invoke-direct {p0, v1, v2, v3}, Lcom/roidapp/photogrid/release/ck;->a(Landroid/widget/SeekBar;Landroid/widget/SeekBar;Landroid/widget/SeekBar;)V

    .line 115
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ck;->k:Landroid/view/View;

    const v5, 0x7f0d0053

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 116
    new-instance v4, Lcom/roidapp/photogrid/release/cm;

    invoke-direct {v4, p0, v0}, Lcom/roidapp/photogrid/release/cm;-><init>(Lcom/roidapp/photogrid/release/ck;Landroid/widget/TextView;)V

    invoke-virtual {v1, v4}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 160
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ck;->m:Z

    if-nez v1, :cond_3

    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ck;->o:Z

    if-eqz v1, :cond_9

    .line 161
    :cond_3
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ck;->k:Landroid/view/View;

    const v2, 0x7f0d0050

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 211
    :goto_2
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ck;->o:Z

    if-eqz v1, :cond_a

    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ck;->m:Z

    if-eqz v1, :cond_a

    .line 212
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ck;->k:Landroid/view/View;

    const v1, 0x7f0d0053

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 264
    :goto_3
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_4

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_5

    .line 265
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ck;->k:Landroid/view/View;

    const v1, 0x7f0d004a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 266
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 268
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ck;->k:Landroid/view/View;

    const v1, 0x7f0d0049

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 269
    new-instance v1, Lcom/roidapp/photogrid/release/cp;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/cp;-><init>(Lcom/roidapp/photogrid/release/ck;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 293
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ck;->k:Landroid/view/View;

    const v2, 0x7f0d004c

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 294
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ck;->g:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v4, v2, Landroid/util/DisplayMetrics;->density:F

    .line 295
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    sparse-switch v2, :sswitch_data_0

    .line 317
    :cond_6
    :goto_4
    new-instance v2, Lcom/roidapp/photogrid/release/cq;

    invoke-direct {v2, p0, v0}, Lcom/roidapp/photogrid/release/cq;-><init>(Lcom/roidapp/photogrid/release/ck;Landroid/widget/ImageView;)V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 368
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ck;->k:Landroid/view/View;

    return-object v0

    .line 69
    :pswitch_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ck;->m:Z

    .line 70
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_7

    .line 71
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ck;->o:Z

    .line 73
    :cond_7
    const/high16 v0, 0x42a00000    # 80.0f

    iput v0, p0, Lcom/roidapp/photogrid/release/ck;->l:F

    goto/16 :goto_1

    .line 76
    :pswitch_2
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 77
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ck;->o:Z

    goto/16 :goto_1

    .line 81
    :pswitch_3
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ck;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0203df

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 82
    const/16 v0, 0x8

    invoke-virtual {v4, v0}, Landroid/view/View;->setVisibility(I)V

    .line 83
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ck;->m:Z

    .line 84
    const/high16 v0, 0x42700000    # 60.0f

    iput v0, p0, Lcom/roidapp/photogrid/release/ck;->l:F

    goto/16 :goto_1

    .line 87
    :pswitch_4
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ck;->n:Z

    .line 88
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_8

    .line 89
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ck;->o:Z

    .line 91
    :cond_8
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 93
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ck;->m:Z

    .line 94
    const/high16 v0, 0x42a00000    # 80.0f

    iput v0, p0, Lcom/roidapp/photogrid/release/ck;->l:F

    goto/16 :goto_1

    .line 163
    :cond_9
    new-instance v1, Lcom/roidapp/photogrid/release/cn;

    invoke-direct {v1, p0, v0}, Lcom/roidapp/photogrid/release/cn;-><init>(Lcom/roidapp/photogrid/release/ck;Landroid/widget/TextView;)V

    invoke-virtual {v2, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    goto/16 :goto_2

    .line 214
    :cond_a
    new-instance v1, Lcom/roidapp/photogrid/release/co;

    invoke-direct {v1, p0, v0}, Lcom/roidapp/photogrid/release/co;-><init>(Lcom/roidapp/photogrid/release/ck;Landroid/widget/TextView;)V

    invoke-virtual {v3, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    goto/16 :goto_3

    .line 298
    :sswitch_0
    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/ck;->o:Z

    if-nez v2, :cond_6

    .line 299
    const/high16 v2, -0x3e100000    # -30.0f

    mul-float/2addr v2, v4

    float-to-int v2, v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    .line 300
    const/4 v2, 0x0

    const/high16 v3, 0x41f00000    # 30.0f

    mul-float/2addr v3, v4

    float-to-int v3, v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    goto/16 :goto_4

    .line 306
    :sswitch_1
    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/ck;->o:Z

    if-eqz v2, :cond_6

    .line 307
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    .line 308
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual {v1, v2, v3, v5, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 309
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ck;->k:Landroid/view/View;

    const v3, 0x7f0d004d

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    .line 310
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 311
    const/high16 v5, 0x41200000    # 10.0f

    mul-float/2addr v5, v4

    float-to-int v5, v5

    const/high16 v6, 0x41700000    # 15.0f

    mul-float/2addr v6, v4

    float-to-int v6, v6

    const/high16 v7, 0x40a00000    # 5.0f

    mul-float/2addr v7, v4

    float-to-int v7, v7

    const/high16 v8, 0x41700000    # 15.0f

    mul-float/2addr v4, v8

    float-to-int v4, v4

    invoke-virtual {v3, v5, v6, v7, v4}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 312
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_4

    .line 65
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_1
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch

    .line 295
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x5 -> :sswitch_1
        0x9 -> :sswitch_1
        0xa -> :sswitch_1
    .end sparse-switch
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 51
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 52
    return-void
.end method
