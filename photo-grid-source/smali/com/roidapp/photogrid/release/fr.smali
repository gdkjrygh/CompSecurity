.class public final Lcom/roidapp/photogrid/release/fr;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field private a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private b:I

.field private c:Landroid/content/SharedPreferences;

.field private d:Landroid/widget/SeekBar;

.field private e:Landroid/widget/SeekBar;

.field private f:Landroid/widget/SeekBar;

.field private g:Ljava/lang/Integer;

.field private h:Landroid/widget/HorizontalScrollView;

.field private i:I

.field private j:I

.field private k:Landroid/widget/SeekBar$OnSeekBarChangeListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 281
    new-instance v0, Lcom/roidapp/photogrid/release/fz;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/fz;-><init>(Lcom/roidapp/photogrid/release/fr;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fr;->k:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/fr;I)I
    .locals 0

    .prologue
    .line 28
    iput p1, p0, Lcom/roidapp/photogrid/release/fr;->b:I

    return p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/fr;)Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fr;->g:Ljava/lang/Integer;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/fr;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    .prologue
    .line 28
    iput-object p1, p0, Lcom/roidapp/photogrid/release/fr;->g:Ljava/lang/Integer;

    return-object p1
.end method

.method private a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V
    .locals 13

    .prologue
    .line 183
    .line 3472
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fr;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 3473
    if-eqz v0, :cond_1

    instance-of v1, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_1

    .line 3474
    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    .line 3475
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->s()I

    move-result v0

    move v6, v0

    .line 3481
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fr;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 3482
    if-eqz v0, :cond_2

    instance-of v1, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_2

    .line 3483
    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    .line 3484
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->t()I

    move-result v0

    move v7, v0

    .line 3489
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fr;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 3490
    if-eqz v0, :cond_3

    instance-of v1, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_3

    .line 3491
    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    .line 4051
    iget v0, v0, Lcom/roidapp/photogrid/release/ra;->ax:I

    move v8, v0

    .line 186
    :goto_2
    invoke-virtual {p2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 187
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/fr;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0900d1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/fr;->i:I

    .line 188
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/fr;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/roidapp/photogrid/release/fr;->j:I

    .line 189
    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v0

    iget-object v10, v0, Lcom/roidapp/baselib/c/p;->i:[I

    .line 191
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fr;->g:Ljava/lang/Integer;

    .line 192
    const/4 v0, 0x0

    move v9, v0

    :goto_3
    array-length v0, v10

    if-ge v9, v0, :cond_6

    .line 193
    aget v5, v10, v9

    .line 194
    add-int/lit16 v4, v9, 0x2710

    .line 195
    iget v0, p0, Lcom/roidapp/photogrid/release/fr;->b:I

    packed-switch v0, :pswitch_data_0

    .line 221
    :cond_0
    :goto_4
    const v0, 0x7f030129

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 222
    const v0, 0x7f0d0494

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 223
    const v1, 0x7f0d0493

    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 224
    invoke-virtual {v3, v4}, Landroid/view/View;->setId(I)V

    .line 225
    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    iget v11, p0, Lcom/roidapp/photogrid/release/fr;->i:I

    div-int/lit8 v11, v11, 0x2

    iget v12, p0, Lcom/roidapp/photogrid/release/fr;->i:I

    invoke-direct {v2, v11, v12}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 226
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    iget v11, p0, Lcom/roidapp/photogrid/release/fr;->i:I

    div-int/lit8 v11, v11, 0x2

    iget v12, p0, Lcom/roidapp/photogrid/release/fr;->i:I

    invoke-direct {v2, v11, v12}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 227
    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 228
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 229
    new-instance v0, Lcom/roidapp/photogrid/release/fy;

    move-object v1, p0

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/release/fy;-><init>(Lcom/roidapp/photogrid/release/fr;Landroid/view/ViewGroup;Landroid/view/View;II)V

    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 275
    invoke-virtual {p2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 192
    add-int/lit8 v0, v9, 0x1

    move v9, v0

    goto :goto_3

    .line 3477
    :cond_1
    const/4 v0, -0x1

    move v6, v0

    goto/16 :goto_0

    .line 3486
    :cond_2
    const/4 v0, -0x1

    move v7, v0

    goto/16 :goto_1

    .line 3494
    :cond_3
    const/4 v0, -0x1

    move v8, v0

    goto/16 :goto_2

    .line 197
    :pswitch_0
    if-ne v6, v5, :cond_0

    .line 215
    :cond_4
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fr;->g:Ljava/lang/Integer;

    goto :goto_4

    .line 202
    :pswitch_1
    if-ne v7, v5, :cond_0

    .line 203
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fr;->d:Landroid/widget/SeekBar;

    invoke-virtual {v0}, Landroid/widget/SeekBar;->getProgress()I

    move-result v0

    if-nez v0, :cond_5

    .line 204
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fr;->g:Ljava/lang/Integer;

    goto :goto_4

    .line 206
    :cond_5
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fr;->g:Ljava/lang/Integer;

    goto :goto_4

    .line 211
    :pswitch_2
    if-ne v8, v5, :cond_0

    .line 212
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/fr;->b()Z

    move-result v0

    if-nez v0, :cond_4

    .line 213
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fr;->g:Ljava/lang/Integer;

    goto/16 :goto_4

    .line 278
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fr;->g:Ljava/lang/Integer;

    if-eqz v0, :cond_7

    .line 279
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fr;->g:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0d0493

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 280
    :cond_7
    return-void

    .line 195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/fr;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1, p2}, Lcom/roidapp/photogrid/release/fr;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V

    return-void
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/fr;)Landroid/widget/SeekBar;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fr;->d:Landroid/widget/SeekBar;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/fr;)Landroid/content/SharedPreferences;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fr;->c:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/fr;)Landroid/widget/SeekBar;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fr;->e:Landroid/widget/SeekBar;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/fr;)Landroid/widget/SeekBar;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fr;->f:Landroid/widget/SeekBar;

    return-object v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/release/fr;)Lcom/roidapp/photogrid/release/PhotoGridActivity;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fr;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    return-object v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/release/fr;)Landroid/widget/HorizontalScrollView;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fr;->h:Landroid/widget/HorizontalScrollView;

    return-object v0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/release/fr;)I
    .locals 1

    .prologue
    .line 28
    iget v0, p0, Lcom/roidapp/photogrid/release/fr;->j:I

    return v0
.end method

.method static synthetic i(Lcom/roidapp/photogrid/release/fr;)I
    .locals 1

    .prologue
    .line 28
    iget v0, p0, Lcom/roidapp/photogrid/release/fr;->i:I

    return v0
.end method

.method static synthetic j(Lcom/roidapp/photogrid/release/fr;)I
    .locals 1

    .prologue
    .line 28
    iget v0, p0, Lcom/roidapp/photogrid/release/fr;->b:I

    return v0
.end method


# virtual methods
.method public final a()F
    .locals 2

    .prologue
    .line 330
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fr;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 331
    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_0

    .line 332
    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    .line 333
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->z()F

    move-result v0

    .line 335
    :goto_0
    return v0

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0
.end method

.method public final a(F)V
    .locals 2

    .prologue
    .line 367
    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_0

    const/high16 v0, 0x40a00000    # 5.0f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_1

    .line 376
    :cond_0
    :goto_0
    return-void

    .line 370
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fr;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 371
    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_0

    .line 372
    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    .line 373
    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/release/ra;->f(F)V

    .line 374
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fr;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    goto :goto_0
.end method

.method public final a(FF)V
    .locals 2

    .prologue
    .line 384
    const/high16 v0, -0x3ee00000    # -10.0f

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_0

    const/high16 v0, 0x41200000    # 10.0f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_1

    .line 393
    :cond_0
    :goto_0
    return-void

    .line 387
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fr;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 388
    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_0

    .line 389
    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    .line 390
    invoke-virtual {v0, p1, p2}, Lcom/roidapp/photogrid/release/ra;->d(FF)V

    .line 391
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fr;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    goto :goto_0
.end method

.method public final a(II)V
    .locals 2

    .prologue
    .line 418
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fr;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 419
    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_0

    .line 420
    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    .line 421
    packed-switch p2, :pswitch_data_0

    .line 432
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fr;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    .line 434
    :cond_0
    return-void

    .line 423
    :pswitch_0
    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/release/ra;->e(I)V

    goto :goto_0

    .line 426
    :pswitch_1
    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/release/ra;->f(I)V

    goto :goto_0

    .line 429
    :pswitch_2
    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/release/ra;->g(I)V

    goto :goto_0

    .line 421
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public final b(F)V
    .locals 2

    .prologue
    .line 400
    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_0

    const/high16 v0, 0x40a00000    # 5.0f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_1

    .line 409
    :cond_0
    :goto_0
    return-void

    .line 403
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fr;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 404
    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_0

    .line 405
    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    .line 406
    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/release/ra;->d(F)V

    .line 407
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fr;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    goto :goto_0
.end method

.method public final b()Z
    .locals 2

    .prologue
    .line 343
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fr;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 344
    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_0

    .line 345
    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    .line 346
    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/ra;->ag:Z

    .line 348
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 440
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fr;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 441
    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_0

    .line 442
    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    .line 443
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->v()V

    .line 444
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fr;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    .line 446
    :cond_0
    return-void
.end method

.method public final d()V
    .locals 2

    .prologue
    .line 454
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fr;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 455
    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_0

    .line 456
    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    .line 457
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->u()V

    .line 458
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fr;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    .line 460
    :cond_0
    return-void
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 2

    .prologue
    .line 47
    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fr;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 48
    invoke-virtual {p1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fr;->c:Landroid/content/SharedPreferences;

    .line 49
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 50
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 27

    .prologue
    .line 53
    const v2, 0x7f0300bd

    const/4 v3, 0x0

    move-object/from16 v0, p1

    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v26

    .line 54
    new-instance v2, Lcom/roidapp/photogrid/release/fs;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Lcom/roidapp/photogrid/release/fs;-><init>(Lcom/roidapp/photogrid/release/fr;)V

    move-object/from16 v0, v26

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 61
    const v2, 0x7f0d02fe

    move-object/from16 v0, v26

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/TextView;

    .line 62
    const v2, 0x7f0d02ff

    move-object/from16 v0, v26

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/TextView;

    .line 63
    const v2, 0x7f0d0300

    move-object/from16 v0, v26

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Landroid/widget/TextView;

    .line 64
    const v2, 0x7f0d0309

    move-object/from16 v0, v26

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    .line 65
    const v2, 0x7f0d030a

    move-object/from16 v0, v26

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/ImageView;

    .line 66
    const v2, 0x7f0d02f9

    move-object/from16 v0, v26

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/RelativeLayout;

    .line 67
    const v2, 0x7f0d0301

    move-object/from16 v0, v26

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/RelativeLayout;

    .line 68
    const v2, 0x7f0d0304

    move-object/from16 v0, v26

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/RelativeLayout;

    .line 70
    const v2, 0x7f0d0303

    move-object/from16 v0, v26

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/SeekBar;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/fr;->d:Landroid/widget/SeekBar;

    .line 71
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/fr;->d:Landroid/widget/SeekBar;

    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/photogrid/release/fr;->a()F

    move-result v3

    const/high16 v12, 0x41200000    # 10.0f

    mul-float/2addr v3, v12

    float-to-int v3, v3

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 72
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/fr;->d:Landroid/widget/SeekBar;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setKeyProgressIncrement(I)V

    .line 73
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/fr;->d:Landroid/widget/SeekBar;

    const/16 v3, 0x32

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setMax(I)V

    .line 74
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/fr;->d:Landroid/widget/SeekBar;

    const-string v3, "storke"

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setTag(Ljava/lang/Object;)V

    .line 75
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/fr;->d:Landroid/widget/SeekBar;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/fr;->k:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 77
    const v2, 0x7f0d0306

    move-object/from16 v0, v26

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/SeekBar;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/fr;->e:Landroid/widget/SeekBar;

    .line 78
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/fr;->e:Landroid/widget/SeekBar;

    .line 1353
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/fr;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v2

    .line 1354
    if-eqz v2, :cond_0

    instance-of v12, v2, Lcom/roidapp/photogrid/release/ra;

    if-eqz v12, :cond_0

    .line 1355
    check-cast v2, Lcom/roidapp/photogrid/release/ra;

    .line 2072
    iget v2, v2, Lcom/roidapp/photogrid/release/ra;->av:F

    .line 78
    :goto_0
    const/high16 v12, 0x41200000    # 10.0f

    mul-float/2addr v2, v12

    const/high16 v12, 0x42c80000    # 100.0f

    add-float/2addr v2, v12

    float-to-int v2, v2

    invoke-virtual {v3, v2}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 79
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/fr;->e:Landroid/widget/SeekBar;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setKeyProgressIncrement(I)V

    .line 80
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/fr;->e:Landroid/widget/SeekBar;

    const/16 v3, 0xc8

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setMax(I)V

    .line 81
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/fr;->e:Landroid/widget/SeekBar;

    const-string v3, "shadow_space"

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setTag(Ljava/lang/Object;)V

    .line 82
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/fr;->e:Landroid/widget/SeekBar;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/fr;->k:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 84
    const v2, 0x7f0d0308

    move-object/from16 v0, v26

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/SeekBar;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/fr;->f:Landroid/widget/SeekBar;

    .line 85
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/fr;->f:Landroid/widget/SeekBar;

    .line 2463
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/fr;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v2

    .line 2464
    if-eqz v2, :cond_1

    instance-of v12, v2, Lcom/roidapp/photogrid/release/ra;

    if-eqz v12, :cond_1

    .line 2465
    check-cast v2, Lcom/roidapp/photogrid/release/ra;

    .line 3068
    iget v2, v2, Lcom/roidapp/photogrid/release/ra;->au:F

    .line 85
    :goto_1
    const/high16 v12, 0x41a00000    # 20.0f

    mul-float/2addr v2, v12

    float-to-int v2, v2

    invoke-virtual {v3, v2}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 86
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/fr;->f:Landroid/widget/SeekBar;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setKeyProgressIncrement(I)V

    .line 87
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/fr;->f:Landroid/widget/SeekBar;

    const/16 v3, 0x64

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setMax(I)V

    .line 88
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/fr;->f:Landroid/widget/SeekBar;

    const-string v3, "shadow_size"

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setTag(Ljava/lang/Object;)V

    .line 89
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/fr;->f:Landroid/widget/SeekBar;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/fr;->k:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 91
    const v2, 0x7f0d0287

    move-object/from16 v0, v26

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/HorizontalScrollView;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/fr;->h:Landroid/widget/HorizontalScrollView;

    .line 92
    const v2, 0x7f0d030b

    move-object/from16 v0, v26

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Landroid/view/ViewGroup;

    .line 93
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput v2, v0, Lcom/roidapp/photogrid/release/fr;->b:I

    .line 94
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v13}, Lcom/roidapp/photogrid/release/fr;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V

    .line 95
    new-instance v2, Lcom/roidapp/photogrid/release/ft;

    move-object/from16 v3, p0

    move-object/from16 v12, p1

    invoke-direct/range {v2 .. v13}, Lcom/roidapp/photogrid/release/ft;-><init>(Lcom/roidapp/photogrid/release/fr;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/RelativeLayout;Landroid/widget/RelativeLayout;Landroid/widget/RelativeLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V

    invoke-virtual {v9, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 114
    new-instance v14, Lcom/roidapp/photogrid/release/fu;

    move-object/from16 v15, p0

    move-object/from16 v16, v4

    move-object/from16 v17, v5

    move-object/from16 v18, v6

    move-object/from16 v19, v7

    move-object/from16 v20, v8

    move-object/from16 v21, v10

    move-object/from16 v22, v9

    move-object/from16 v23, v11

    move-object/from16 v24, p1

    move-object/from16 v25, v13

    invoke-direct/range {v14 .. v25}, Lcom/roidapp/photogrid/release/fu;-><init>(Lcom/roidapp/photogrid/release/fr;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/RelativeLayout;Landroid/widget/RelativeLayout;Landroid/widget/RelativeLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V

    invoke-virtual {v10, v14}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 131
    new-instance v14, Lcom/roidapp/photogrid/release/fv;

    move-object/from16 v15, p0

    move-object/from16 v16, v4

    move-object/from16 v17, v5

    move-object/from16 v18, v6

    move-object/from16 v19, v7

    move-object/from16 v20, v8

    move-object/from16 v21, v10

    move-object/from16 v22, v9

    move-object/from16 v23, v11

    move-object/from16 v24, p1

    move-object/from16 v25, v13

    invoke-direct/range {v14 .. v25}, Lcom/roidapp/photogrid/release/fv;-><init>(Lcom/roidapp/photogrid/release/fr;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/RelativeLayout;Landroid/widget/RelativeLayout;Landroid/widget/RelativeLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V

    invoke-virtual {v11, v14}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 148
    new-instance v2, Lcom/roidapp/photogrid/release/fw;

    move-object/from16 v0, p0

    invoke-direct {v2, v0, v13}, Lcom/roidapp/photogrid/release/fw;-><init>(Lcom/roidapp/photogrid/release/fr;Landroid/view/ViewGroup;)V

    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 160
    new-instance v2, Lcom/roidapp/photogrid/release/fx;

    move-object/from16 v0, p0

    invoke-direct {v2, v0, v13}, Lcom/roidapp/photogrid/release/fx;-><init>(Lcom/roidapp/photogrid/release/fr;Landroid/view/ViewGroup;)V

    invoke-virtual {v5, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 172
    const v2, 0x7f020074

    invoke-virtual {v9, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 173
    const/4 v2, 0x0

    invoke-virtual {v10, v2}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 174
    return-object v26

    .line 1358
    :cond_0
    const/4 v2, 0x0

    goto/16 :goto_0

    .line 2468
    :cond_1
    const/high16 v2, 0x3f800000    # 1.0f

    goto/16 :goto_1
.end method
