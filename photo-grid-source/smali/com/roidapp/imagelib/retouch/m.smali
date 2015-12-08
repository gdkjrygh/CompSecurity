.class public final Lcom/roidapp/imagelib/retouch/m;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$OnDrawDoneListener;


# instance fields
.field private A:I

.field private B:Z

.field private C:Landroid/os/Handler;

.field private final D:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private E:Z

.field protected a:Landroid/view/View;

.field protected b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:I

.field private final e:I

.field private final f:I

.field private final g:I

.field private h:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

.field private i:Z

.field private j:Landroid/view/View;

.field private k:Landroid/view/View;

.field private l:Landroid/view/View;

.field private m:Landroid/view/View;

.field private n:Landroid/view/View;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/ImageView;

.field private q:Landroid/view/ViewGroup;

.field private r:Lcom/roidapp/imagelib/retouch/v;

.field private s:Lcom/roidapp/imagelib/retouch/ac;

.field private t:Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;

.field private u:Lcom/roidapp/imagelib/retouch/t;

.field private v:I

.field private w:I

.field private x:I

.field private y:I

.field private z:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v1, -0x1

    const/4 v2, 0x1

    .line 50
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 52
    const-string v0, "SkinFragment"

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->c:Ljava/lang/String;

    .line 59
    const/16 v0, 0x402

    iput v0, p0, Lcom/roidapp/imagelib/retouch/m;->d:I

    .line 60
    const/16 v0, 0x403

    iput v0, p0, Lcom/roidapp/imagelib/retouch/m;->e:I

    .line 61
    const/16 v0, 0x404

    iput v0, p0, Lcom/roidapp/imagelib/retouch/m;->f:I

    .line 62
    const/16 v0, 0x405

    iput v0, p0, Lcom/roidapp/imagelib/retouch/m;->g:I

    .line 75
    iput v1, p0, Lcom/roidapp/imagelib/retouch/m;->v:I

    iput v1, p0, Lcom/roidapp/imagelib/retouch/m;->w:I

    .line 79
    iput-boolean v2, p0, Lcom/roidapp/imagelib/retouch/m;->B:Z

    .line 81
    new-instance v0, Lcom/roidapp/imagelib/retouch/s;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/roidapp/imagelib/retouch/s;-><init>(Lcom/roidapp/imagelib/retouch/m;B)V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->C:Landroid/os/Handler;

    .line 82
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->D:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 305
    iput-boolean v2, p0, Lcom/roidapp/imagelib/retouch/m;->E:Z

    .line 499
    return-void
.end method

.method static synthetic a(Lcom/roidapp/imagelib/retouch/m;I)I
    .locals 0

    .prologue
    .line 50
    iput p1, p0, Lcom/roidapp/imagelib/retouch/m;->v:I

    return p1
.end method

.method static synthetic a(Lcom/roidapp/imagelib/retouch/m;)Lcom/roidapp/imagelib/retouch/t;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->u:Lcom/roidapp/imagelib/retouch/t;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/imagelib/retouch/m;Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;)Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;
    .locals 0

    .prologue
    .line 50
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/m;->t:Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;

    return-object p1
.end method

.method private a(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 414
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->q:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 415
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->q:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 418
    :cond_0
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 419
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/m;->q:Landroid/view/ViewGroup;

    invoke-virtual {v1, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 420
    return-void
.end method

.method static synthetic a(Lcom/roidapp/imagelib/retouch/m;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0, p1, p2}, Lcom/roidapp/imagelib/retouch/m;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 487
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->C:Landroid/os/Handler;

    new-instance v1, Lcom/roidapp/imagelib/retouch/r;

    invoke-direct {v1, p0, p1, p2}, Lcom/roidapp/imagelib/retouch/r;-><init>(Lcom/roidapp/imagelib/retouch/m;Ljava/lang/Throwable;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 497
    return-void
.end method

.method private a(Z)V
    .locals 6

    .prologue
    const/high16 v5, 0x42c80000    # 100.0f

    .line 400
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->t:Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;

    if-nez v0, :cond_0

    .line 401
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;

    const/high16 v1, 0x41200000    # 10.0f

    const/4 v2, 0x0

    iget v3, p0, Lcom/roidapp/imagelib/retouch/m;->v:I

    iget v4, p0, Lcom/roidapp/imagelib/retouch/m;->w:I

    invoke-direct {v0, v1, v2, v3, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;-><init>(FFII)V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->t:Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;

    .line 402
    if-eqz p1, :cond_1

    .line 403
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->h:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/m;->t:Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->setFilter(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 407
    :goto_0
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->t:Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;

    iget v1, p0, Lcom/roidapp/imagelib/retouch/m;->x:I

    int-to-float v1, v1

    const v2, 0x3b83126f    # 0.004f

    mul-float/2addr v1, v2

    div-float/2addr v1, v5

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->setEps(F)V

    .line 408
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->t:Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;

    iget v1, p0, Lcom/roidapp/imagelib/retouch/m;->y:I

    int-to-float v1, v1

    div-float/2addr v1, v5

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->setAlpha(F)V

    .line 409
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->h:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->requestRender()V

    .line 411
    :cond_0
    return-void

    .line 405
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->h:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/m;->t:Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->setFilterNoApply(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/imagelib/retouch/m;I)I
    .locals 0

    .prologue
    .line 50
    iput p1, p0, Lcom/roidapp/imagelib/retouch/m;->w:I

    return p1
.end method

.method static synthetic b(Lcom/roidapp/imagelib/retouch/m;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->D:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/imagelib/retouch/m;)I
    .locals 1

    .prologue
    .line 50
    iget v0, p0, Lcom/roidapp/imagelib/retouch/m;->y:I

    return v0
.end method

.method private c()V
    .locals 8

    .prologue
    .line 334
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/retouch/m;->a(Z)V

    .line 335
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->s:Lcom/roidapp/imagelib/retouch/ac;

    if-nez v0, :cond_0

    .line 336
    new-instance v0, Lcom/roidapp/imagelib/retouch/ac;

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/m;->z:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/m;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/imagelib/retouch/m;->h:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    iget-object v4, p0, Lcom/roidapp/imagelib/retouch/m;->o:Landroid/widget/TextView;

    iget-object v5, p0, Lcom/roidapp/imagelib/retouch/m;->t:Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;

    iget-object v6, p0, Lcom/roidapp/imagelib/retouch/m;->m:Landroid/view/View;

    iget-object v7, p0, Lcom/roidapp/imagelib/retouch/m;->n:Landroid/view/View;

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/imagelib/retouch/ac;-><init>(Ljava/lang/String;Landroid/content/Context;Ljp/co/cyberagent/android/gpuimage/GPUImageView;Landroid/widget/TextView;Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;Landroid/view/View;Landroid/view/View;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->s:Lcom/roidapp/imagelib/retouch/ac;

    .line 337
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->s:Lcom/roidapp/imagelib/retouch/ac;

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/m;->u:Lcom/roidapp/imagelib/retouch/t;

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/retouch/ac;->a(Lcom/roidapp/imagelib/retouch/t;)V

    .line 338
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->s:Lcom/roidapp/imagelib/retouch/ac;

    iget v1, p0, Lcom/roidapp/imagelib/retouch/m;->y:I

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/retouch/ac;->a(I)V

    .line 341
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->r:Lcom/roidapp/imagelib/retouch/v;

    if-nez v0, :cond_1

    .line 342
    new-instance v0, Lcom/roidapp/imagelib/retouch/v;

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/m;->z:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/m;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/imagelib/retouch/m;->h:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    iget-object v4, p0, Lcom/roidapp/imagelib/retouch/m;->o:Landroid/widget/TextView;

    iget-object v5, p0, Lcom/roidapp/imagelib/retouch/m;->t:Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;

    iget-object v6, p0, Lcom/roidapp/imagelib/retouch/m;->m:Landroid/view/View;

    iget-object v7, p0, Lcom/roidapp/imagelib/retouch/m;->n:Landroid/view/View;

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/imagelib/retouch/v;-><init>(Ljava/lang/String;Landroid/content/Context;Ljp/co/cyberagent/android/gpuimage/GPUImageView;Landroid/widget/TextView;Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;Landroid/view/View;Landroid/view/View;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->r:Lcom/roidapp/imagelib/retouch/v;

    .line 343
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->r:Lcom/roidapp/imagelib/retouch/v;

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/m;->u:Lcom/roidapp/imagelib/retouch/t;

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/retouch/v;->a(Lcom/roidapp/imagelib/retouch/t;)V

    .line 344
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->r:Lcom/roidapp/imagelib/retouch/v;

    iget v1, p0, Lcom/roidapp/imagelib/retouch/m;->x:I

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/retouch/v;->a(I)V

    .line 346
    :cond_1
    return-void
.end method

.method static synthetic d(Lcom/roidapp/imagelib/retouch/m;)I
    .locals 1

    .prologue
    .line 50
    iget v0, p0, Lcom/roidapp/imagelib/retouch/m;->x:I

    return v0
.end method

.method static synthetic e(Lcom/roidapp/imagelib/retouch/m;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->C:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic f(Lcom/roidapp/imagelib/retouch/m;)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0}, Lcom/roidapp/imagelib/retouch/m;->c()V

    return-void
.end method

.method static synthetic g(Lcom/roidapp/imagelib/retouch/m;)V
    .locals 2

    .prologue
    .line 50
    .line 1423
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->q:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    .line 1424
    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->q:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 1425
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->q:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->isShown()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->q:Landroid/view/ViewGroup;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 1426
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->j:Landroid/view/View;

    sget v1, Lcom/roidapp/imagelib/d;->k:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 1427
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->l:Landroid/view/View;

    sget v1, Lcom/roidapp/imagelib/d;->k:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 50
    return-void
.end method

.method static synthetic h(Lcom/roidapp/imagelib/retouch/m;)Landroid/view/View;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->m:Landroid/view/View;

    return-object v0
.end method

.method static synthetic i(Lcom/roidapp/imagelib/retouch/m;)Lcom/roidapp/imagelib/retouch/ac;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->s:Lcom/roidapp/imagelib/retouch/ac;

    return-object v0
.end method

.method static synthetic j(Lcom/roidapp/imagelib/retouch/m;)Lcom/roidapp/imagelib/retouch/v;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->r:Lcom/roidapp/imagelib/retouch/v;

    return-object v0
.end method

.method static synthetic k(Lcom/roidapp/imagelib/retouch/m;)Ljp/co/cyberagent/android/gpuimage/GPUImageView;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->h:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    return-object v0
.end method

.method static synthetic l(Lcom/roidapp/imagelib/retouch/m;)Landroid/view/View;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->n:Landroid/view/View;

    return-object v0
.end method

.method static synthetic m(Lcom/roidapp/imagelib/retouch/m;)V
    .locals 8

    .prologue
    const/4 v3, 0x0

    .line 50
    .line 2307
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/m;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 2308
    if-eqz v0, :cond_0

    .line 2309
    iput-boolean v3, p0, Lcom/roidapp/imagelib/retouch/m;->E:Z

    .line 2310
    new-instance v1, Landroid/app/Dialog;

    sget v2, Lcom/roidapp/imagelib/k;->a:I

    invoke-direct {v1, v0, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 2311
    new-instance v2, Landroid/widget/ImageView;

    invoke-direct {v2, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 2312
    sget v0, Lcom/roidapp/imagelib/f;->bd:I

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2313
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 2314
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 2315
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    .line 2316
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/m;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    .line 2317
    iget v4, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-double v4, v4

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    mul-double/2addr v4, v6

    double-to-int v4, v4

    iput v4, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 2318
    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-double v4, v3

    const-wide v6, 0x3fd999999999999aL    # 0.4

    mul-double/2addr v4, v6

    double-to-int v3, v4

    iput v3, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 2319
    invoke-virtual {v1, v2}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 2320
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 2321
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v2, Lcom/roidapp/imagelib/retouch/q;

    invoke-direct {v2, p0, v1}, Lcom/roidapp/imagelib/retouch/q;-><init>(Lcom/roidapp/imagelib/retouch/m;Landroid/app/Dialog;)V

    const-wide/16 v4, 0x1f4

    invoke-virtual {v0, v2, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 50
    :cond_0
    return-void
.end method

.method static synthetic n(Lcom/roidapp/imagelib/retouch/m;)Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->t:Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;

    return-object v0
.end method

.method static synthetic o(Lcom/roidapp/imagelib/retouch/m;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->p:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic p(Lcom/roidapp/imagelib/retouch/m;)Z
    .locals 1

    .prologue
    .line 50
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/imagelib/retouch/m;->E:Z

    return v0
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .prologue
    .line 301
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->m:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 302
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->m:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isSelected()Z

    move-result v0

    goto :goto_0
.end method

.method public final b()Z
    .locals 8

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 385
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->D:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 395
    :goto_0
    return v5

    .line 387
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->D:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 388
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->h:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->setDrawListener(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$OnDrawDoneListener;)V

    .line 389
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->s:Lcom/roidapp/imagelib/retouch/ac;

    if-eqz v0, :cond_1

    .line 390
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->s:Lcom/roidapp/imagelib/retouch/ac;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/retouch/ac;->getProgress()I

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/retouch/m;->y:I

    .line 391
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->r:Lcom/roidapp/imagelib/retouch/v;

    if-eqz v0, :cond_2

    .line 392
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->r:Lcom/roidapp/imagelib/retouch/v;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/retouch/v;->getProgress()I

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/retouch/m;->x:I

    .line 1376
    :cond_2
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->q:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->isShown()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1377
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->q:Landroid/view/ViewGroup;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 1378
    :cond_3
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->q:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_4

    .line 1379
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->q:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 1380
    :cond_4
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->j:Landroid/view/View;

    sget v1, Lcom/roidapp/imagelib/d;->k:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 1381
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->l:Landroid/view/View;

    sget v1, Lcom/roidapp/imagelib/d;->k:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 394
    new-instance v7, Ljava/lang/Thread;

    new-instance v0, Lcom/roidapp/imagelib/retouch/u;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/m;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    iget v3, p0, Lcom/roidapp/imagelib/retouch/m;->y:I

    iget v4, p0, Lcom/roidapp/imagelib/retouch/m;->x:I

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/imagelib/retouch/u;-><init>(Lcom/roidapp/imagelib/retouch/m;Landroid/content/Context;III)V

    invoke-direct {v7, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v7}, Ljava/lang/Thread;->start()V

    move v5, v6

    .line 395
    goto :goto_0
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 181
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 182
    instance-of v0, p1, Lcom/roidapp/imagelib/retouch/t;

    if-eqz v0, :cond_0

    .line 183
    check-cast p1, Lcom/roidapp/imagelib/retouch/t;

    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/m;->u:Lcom/roidapp/imagelib/retouch/t;

    return-void

    .line 185
    :cond_0
    new-instance v0, Ljava/lang/ClassCastException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " must implemenet SkinFragment.OnImageReTouchListener"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    const/16 v4, 0x8

    const/4 v3, 0x0

    .line 432
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 433
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/m;->D:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 484
    :cond_0
    :goto_0
    return-void

    .line 435
    :cond_1
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/m;->u:Lcom/roidapp/imagelib/retouch/t;

    if-eqz v1, :cond_0

    .line 438
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/m;->j:Landroid/view/View;

    sget v2, Lcom/roidapp/imagelib/d;->k:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 440
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/m;->l:Landroid/view/View;

    sget v2, Lcom/roidapp/imagelib/d;->k:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 441
    iget v1, p0, Lcom/roidapp/imagelib/retouch/m;->A:I

    if-ne v1, v0, :cond_5

    .line 442
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/m;->q:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->isShown()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 443
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->q:Landroid/view/ViewGroup;

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_0

    .line 446
    :cond_2
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/m;->q:Landroid/view/ViewGroup;

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 452
    :goto_1
    sget v1, Lcom/roidapp/imagelib/g;->d:I

    if-ne v0, v1, :cond_3

    .line 453
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/m;->q:Landroid/view/ViewGroup;

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 457
    :cond_3
    sget v1, Lcom/roidapp/imagelib/g;->aP:I

    if-ne v0, v1, :cond_6

    .line 458
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/m;->l:Landroid/view/View;

    sget v2, Lcom/roidapp/imagelib/d;->j:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 465
    invoke-direct {p0}, Lcom/roidapp/imagelib/retouch/m;->c()V

    .line 466
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/m;->r:Lcom/roidapp/imagelib/retouch/v;

    invoke-direct {p0, v1}, Lcom/roidapp/imagelib/retouch/m;->a(Landroid/view/View;)V

    .line 483
    :cond_4
    :goto_2
    iput v0, p0, Lcom/roidapp/imagelib/retouch/m;->A:I

    goto :goto_0

    .line 449
    :cond_5
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/m;->q:Landroid/view/ViewGroup;

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_1

    .line 467
    :cond_6
    sget v1, Lcom/roidapp/imagelib/g;->aS:I

    if-ne v0, v1, :cond_7

    .line 468
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/m;->j:Landroid/view/View;

    sget v2, Lcom/roidapp/imagelib/d;->j:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 475
    invoke-direct {p0}, Lcom/roidapp/imagelib/retouch/m;->c()V

    .line 476
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/m;->s:Lcom/roidapp/imagelib/retouch/ac;

    invoke-direct {p0, v1}, Lcom/roidapp/imagelib/retouch/m;->a(Landroid/view/View;)V

    goto :goto_2

    .line 477
    :cond_7
    sget v1, Lcom/roidapp/imagelib/g;->d:I

    if-ne v0, v1, :cond_4

    .line 478
    iget-boolean v1, p0, Lcom/roidapp/imagelib/retouch/m;->E:Z

    if-eqz v1, :cond_0

    .line 480
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/m;->u:Lcom/roidapp/imagelib/retouch/t;

    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/m;->b:Ljava/lang/String;

    invoke-interface {v1, v2}, Lcom/roidapp/imagelib/retouch/t;->a(Ljava/lang/String;)V

    goto :goto_2
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 143
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 144
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/m;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    .line 145
    if-eqz v0, :cond_0

    .line 146
    const-string v1, "auto_retouch"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/roidapp/imagelib/retouch/m;->i:Z

    .line 147
    const-string v1, "image_path"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/imagelib/retouch/m;->b:Ljava/lang/String;

    .line 148
    const-string v1, "smoother_bar"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/roidapp/imagelib/retouch/m;->x:I

    .line 149
    const-string v1, "whiten_bar"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/roidapp/imagelib/retouch/m;->y:I

    .line 150
    const-string v1, "modeStr"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->z:Ljava/lang/String;

    .line 152
    :cond_0
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 8

    .prologue
    const/4 v0, 0x0

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 158
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/m;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/baselib/c/n;->b(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 159
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "OpenGL ES 2.0 is not supported on this phone."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    const-string v2, ""

    invoke-direct {p0, v1, v2}, Lcom/roidapp/imagelib/retouch/m;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 176
    :goto_0
    return-object v0

    .line 164
    :cond_0
    :try_start_0
    const-class v1, Landroid/opengl/GLSurfaceView;

    const-string v2, "setEGLContextClientVersion"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Class;

    const/4 v4, 0x0

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 171
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->D:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 172
    sget v0, Lcom/roidapp/imagelib/h;->n:I

    invoke-virtual {p1, v0, p2, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->a:Landroid/view/View;

    .line 174
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->a:Landroid/view/View;

    .line 1191
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v1

    const-string v2, "SkinFrag/initView"

    invoke-virtual {v1, v2}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 1196
    sget v1, Lcom/roidapp/imagelib/g;->aL:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->h:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    .line 1198
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->h:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/m;->b:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v2, Lcom/roidapp/imagelib/retouch/n;

    invoke-direct {v2, p0}, Lcom/roidapp/imagelib/retouch/n;-><init>(Lcom/roidapp/imagelib/retouch/m;)V

    invoke-virtual {v0, v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->setFile(Ljava/io/File;Ljp/co/cyberagent/android/gpuimage/GPUImage$OnImageLoadDoneListener;)V

    .line 1207
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->h:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0, p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->setDrawListener(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$OnDrawDoneListener;)V

    .line 1208
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/m;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 1209
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v1, p0, Lcom/roidapp/imagelib/retouch/m;->v:I

    .line 1210
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, p0, Lcom/roidapp/imagelib/retouch/m;->w:I

    .line 1212
    iget v0, p0, Lcom/roidapp/imagelib/retouch/m;->x:I

    if-gtz v0, :cond_1

    iget v0, p0, Lcom/roidapp/imagelib/retouch/m;->y:I

    if-lez v0, :cond_2

    .line 1213
    :cond_1
    invoke-direct {p0, v6}, Lcom/roidapp/imagelib/retouch/m;->a(Z)V

    .line 175
    :goto_1
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/m;->a:Landroid/view/View;

    .line 1226
    sget v0, Lcom/roidapp/imagelib/g;->n:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->n:Landroid/view/View;

    .line 1227
    sget v0, Lcom/roidapp/imagelib/g;->b:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->m:Landroid/view/View;

    .line 1228
    iget-boolean v0, p0, Lcom/roidapp/imagelib/retouch/m;->i:Z

    if-eqz v0, :cond_3

    .line 1229
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->n:Landroid/view/View;

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1230
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->m:Landroid/view/View;

    invoke-virtual {v0, v7}, Landroid/view/View;->setSelected(Z)V

    .line 1235
    :goto_2
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->m:Landroid/view/View;

    new-instance v2, Lcom/roidapp/imagelib/retouch/o;

    invoke-direct {v2, p0}, Lcom/roidapp/imagelib/retouch/o;-><init>(Lcom/roidapp/imagelib/retouch/m;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1260
    sget v0, Lcom/roidapp/imagelib/g;->aS:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->j:Landroid/view/View;

    .line 1261
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->j:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1262
    sget v0, Lcom/roidapp/imagelib/g;->d:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->k:Landroid/view/View;

    .line 1263
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->k:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1264
    sget v0, Lcom/roidapp/imagelib/g;->aP:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->l:Landroid/view/View;

    .line 1265
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->l:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1266
    sget v0, Lcom/roidapp/imagelib/g;->E:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->q:Landroid/view/ViewGroup;

    .line 1267
    sget v0, Lcom/roidapp/imagelib/g;->aN:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->o:Landroid/widget/TextView;

    .line 1268
    sget v0, Lcom/roidapp/imagelib/g;->a:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->p:Landroid/widget/ImageView;

    .line 1270
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->p:Landroid/widget/ImageView;

    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setClickable(Z)V

    .line 1271
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->p:Landroid/widget/ImageView;

    new-instance v1, Lcom/roidapp/imagelib/retouch/p;

    invoke-direct {v1, p0}, Lcom/roidapp/imagelib/retouch/p;-><init>(Lcom/roidapp/imagelib/retouch/m;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 176
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->a:Landroid/view/View;

    goto/16 :goto_0

    .line 165
    :catch_0
    move-exception v1

    .line 166
    invoke-virtual {v1}, Ljava/lang/NoSuchMethodException;->printStackTrace()V

    .line 167
    const-string v2, ""

    invoke-direct {p0, v1, v2}, Lcom/roidapp/imagelib/retouch/m;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 1215
    :cond_2
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->h:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    invoke-direct {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;-><init>()V

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->setFilterNoApply(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    goto/16 :goto_1

    .line 1232
    :cond_3
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->n:Landroid/view/View;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1233
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->m:Landroid/view/View;

    invoke-virtual {v0, v6}, Landroid/view/View;->setSelected(Z)V

    goto/16 :goto_2
.end method

.method public final onDrawLoadDone()V
    .locals 2

    .prologue
    .line 86
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->C:Landroid/os/Handler;

    const/16 v1, 0x405

    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    .line 87
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/m;->C:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 88
    return-void
.end method

.method public final onPause()V
    .locals 1

    .prologue
    .line 362
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onPause()V

    .line 364
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->h:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    if-eqz v0, :cond_0

    .line 365
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->h:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->releaseGLSurfaceView()V

    .line 366
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->h:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->onPause()V

    .line 370
    :cond_0
    return-void
.end method

.method public final onPreviewFailed()V
    .locals 0

    .prologue
    .line 93
    return-void
.end method

.method public final onResume()V
    .locals 1

    .prologue
    .line 350
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 352
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->h:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    if-eqz v0, :cond_1

    .line 353
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->u:Lcom/roidapp/imagelib/retouch/t;

    if-eqz v0, :cond_0

    .line 354
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->u:Lcom/roidapp/imagelib/retouch/t;

    invoke-interface {v0}, Lcom/roidapp/imagelib/retouch/t;->a()V

    .line 356
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/m;->h:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->onResume()V

    .line 358
    :cond_1
    return-void
.end method
