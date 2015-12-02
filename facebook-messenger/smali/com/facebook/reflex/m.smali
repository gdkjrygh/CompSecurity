.class Lcom/facebook/reflex/m;
.super Lcom/facebook/reflex/view/ContainerView;
.source "FragmentReflexActivity.java"


# instance fields
.field final synthetic a:Lcom/facebook/reflex/j;

.field private c:Lcom/facebook/reflex/Container;

.field private d:Landroid/view/SurfaceView;

.field private e:[I

.field private f:I

.field private g:I

.field private h:I

.field private i:I


# direct methods
.method public constructor <init>(Lcom/facebook/reflex/j;Landroid/content/Context;)V
    .locals 4

    .prologue
    const/4 v3, 0x2

    const/4 v2, 0x1

    .line 292
    iput-object p1, p0, Lcom/facebook/reflex/m;->a:Lcom/facebook/reflex/j;

    .line 293
    invoke-direct {p0, p2}, Lcom/facebook/reflex/view/ContainerView;-><init>(Landroid/content/Context;)V

    .line 294
    new-instance v0, Lcom/facebook/reflex/Container;

    invoke-direct {v0}, Lcom/facebook/reflex/Container;-><init>()V

    iput-object v0, p0, Lcom/facebook/reflex/m;->c:Lcom/facebook/reflex/Container;

    .line 295
    iget-object v0, p0, Lcom/facebook/reflex/m;->c:Lcom/facebook/reflex/Container;

    invoke-virtual {p0}, Lcom/facebook/reflex/m;->getBackingWidget()Lcom/facebook/reflex/Widget;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/Container;->a(Lcom/facebook/reflex/Widget;)V

    .line 296
    new-instance v0, Landroid/view/SurfaceView;

    invoke-direct {v0, p2}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/reflex/m;->d:Landroid/view/SurfaceView;

    .line 299
    iget-object v0, p0, Lcom/facebook/reflex/m;->d:Landroid/view/SurfaceView;

    invoke-virtual {v0, v2}, Landroid/view/SurfaceView;->setWillNotDraw(Z)V

    .line 300
    iget-object v0, p0, Lcom/facebook/reflex/m;->d:Landroid/view/SurfaceView;

    invoke-virtual {v0, v2}, Landroid/view/SurfaceView;->setZOrderOnTop(Z)V

    .line 302
    iget-object v0, p0, Lcom/facebook/reflex/m;->d:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-interface {v0, v3}, Landroid/view/SurfaceHolder;->setFormat(I)V

    .line 303
    iget-object v0, p0, Lcom/facebook/reflex/m;->d:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    new-instance v1, Lcom/facebook/reflex/n;

    invoke-direct {v1, p0, p1}, Lcom/facebook/reflex/n;-><init>(Lcom/facebook/reflex/m;Lcom/facebook/reflex/j;)V

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 324
    new-array v0, v3, [I

    iput-object v0, p0, Lcom/facebook/reflex/m;->e:[I

    .line 326
    invoke-virtual {p0}, Lcom/facebook/reflex/m;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/facebook/reflex/o;

    invoke-direct {v1, p0, p1}, Lcom/facebook/reflex/o;-><init>(Lcom/facebook/reflex/m;Lcom/facebook/reflex/j;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 334
    iget-object v0, p0, Lcom/facebook/reflex/m;->c:Lcom/facebook/reflex/Container;

    new-instance v1, Lcom/facebook/reflex/p;

    invoke-direct {v1, p0, p1}, Lcom/facebook/reflex/p;-><init>(Lcom/facebook/reflex/m;Lcom/facebook/reflex/j;)V

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/Container;->a(Lcom/facebook/reflex/q;)V

    .line 340
    return-void
.end method

.method static synthetic a(Lcom/facebook/reflex/m;)Landroid/view/SurfaceView;
    .locals 1

    .prologue
    .line 286
    iget-object v0, p0, Lcom/facebook/reflex/m;->d:Landroid/view/SurfaceView;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/reflex/m;Landroid/view/MotionEvent;)V
    .locals 0

    .prologue
    .line 286
    invoke-direct {p0, p1}, Lcom/facebook/reflex/m;->b(Landroid/view/MotionEvent;)V

    return-void
.end method

.method private b(Landroid/view/MotionEvent;)V
    .locals 5

    .prologue
    .line 347
    iget-object v0, p0, Lcom/facebook/reflex/m;->a:Lcom/facebook/reflex/j;

    invoke-virtual {v0}, Lcom/facebook/reflex/j;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    .line 350
    iget-object v1, p0, Lcom/facebook/reflex/m;->e:[I

    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 351
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iget-object v2, p0, Lcom/facebook/reflex/m;->e:[I

    const/4 v3, 0x0

    aget v2, v2, v3

    int-to-float v2, v2

    sub-float/2addr v1, v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    iget-object v3, p0, Lcom/facebook/reflex/m;->e:[I

    const/4 v4, 0x1

    aget v3, v3, v4

    int-to-float v3, v3

    sub-float/2addr v2, v3

    invoke-virtual {p1, v1, v2}, Landroid/view/MotionEvent;->setLocation(FF)V

    .line 352
    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 353
    return-void
.end method

.method static synthetic b(Lcom/facebook/reflex/m;)V
    .locals 0

    .prologue
    .line 286
    invoke-direct {p0}, Lcom/facebook/reflex/m;->h()V

    return-void
.end method

.method private h()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 370
    iget-object v0, p0, Lcom/facebook/reflex/m;->e:[I

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/m;->getLocationInWindow([I)V

    .line 372
    iget-object v0, p0, Lcom/facebook/reflex/m;->a:Lcom/facebook/reflex/j;

    invoke-virtual {v0}, Lcom/facebook/reflex/j;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    .line 374
    iget v1, p0, Lcom/facebook/reflex/m;->f:I

    iget-object v2, p0, Lcom/facebook/reflex/m;->e:[I

    aget v2, v2, v3

    if-ne v1, v2, :cond_0

    iget v1, p0, Lcom/facebook/reflex/m;->g:I

    iget-object v2, p0, Lcom/facebook/reflex/m;->e:[I

    aget v2, v2, v4

    if-ne v1, v2, :cond_0

    iget v1, p0, Lcom/facebook/reflex/m;->h:I

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    if-ne v1, v2, :cond_0

    iget v1, p0, Lcom/facebook/reflex/m;->i:I

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v2

    if-ne v1, v2, :cond_0

    .line 391
    :goto_0
    return-void

    .line 379
    :cond_0
    iget-object v1, p0, Lcom/facebook/reflex/m;->e:[I

    aget v1, v1, v3

    iput v1, p0, Lcom/facebook/reflex/m;->f:I

    .line 380
    iget-object v1, p0, Lcom/facebook/reflex/m;->e:[I

    aget v1, v1, v4

    iput v1, p0, Lcom/facebook/reflex/m;->g:I

    .line 381
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    iput v1, p0, Lcom/facebook/reflex/m;->h:I

    .line 382
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/facebook/reflex/m;->i:I

    .line 387
    iget v0, p0, Lcom/facebook/reflex/m;->f:I

    neg-int v0, v0

    iget v1, p0, Lcom/facebook/reflex/m;->g:I

    neg-int v1, v1

    invoke-static {v0, v1}, Lcom/facebook/reflex/Widget;->b(II)V

    .line 388
    iget v0, p0, Lcom/facebook/reflex/m;->f:I

    neg-int v0, v0

    iget v1, p0, Lcom/facebook/reflex/m;->g:I

    neg-int v1, v1

    iget v2, p0, Lcom/facebook/reflex/m;->h:I

    iget v3, p0, Lcom/facebook/reflex/m;->i:I

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/reflex/Widget;->updateRootWidgetBounds(IIII)V

    .line 389
    iget-object v0, p0, Lcom/facebook/reflex/m;->c:Lcom/facebook/reflex/Container;

    iget v1, p0, Lcom/facebook/reflex/m;->h:I

    iget v2, p0, Lcom/facebook/reflex/m;->i:I

    invoke-virtual {v0, v1, v2}, Lcom/facebook/reflex/Container;->a(II)V

    .line 390
    invoke-virtual {p0}, Lcom/facebook/reflex/m;->getBackingWidget()Lcom/facebook/reflex/Widget;

    move-result-object v0

    iget v1, p0, Lcom/facebook/reflex/m;->f:I

    int-to-float v1, v1

    iget v2, p0, Lcom/facebook/reflex/m;->g:I

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/reflex/Widget;->b(FF)V

    goto :goto_0
.end method


# virtual methods
.method public a()Lcom/facebook/reflex/Widget;
    .locals 1

    .prologue
    .line 343
    iget-object v0, p0, Lcom/facebook/reflex/m;->c:Lcom/facebook/reflex/Container;

    return-object v0
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 358
    const/4 v0, 0x0

    return v0
.end method

.method public g()V
    .locals 0

    .prologue
    .line 394
    invoke-virtual {p0}, Lcom/facebook/reflex/m;->removeAllViews()V

    .line 395
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 1

    .prologue
    .line 363
    invoke-super/range {p0 .. p5}, Lcom/facebook/reflex/view/ContainerView;->onLayout(ZIIII)V

    .line 364
    iget-object v0, p0, Lcom/facebook/reflex/m;->a:Lcom/facebook/reflex/j;

    invoke-static {v0}, Lcom/facebook/reflex/j;->a(Lcom/facebook/reflex/j;)Lcom/facebook/reflex/view/b/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/p;->a()V

    .line 365
    return-void
.end method
