.class Lcom/jirbo/adcolony/AdColonyBrowser$a;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field a:Landroid/graphics/Rect;

.field b:Landroid/graphics/Paint;

.field final synthetic c:Lcom/jirbo/adcolony/AdColonyBrowser;


# direct methods
.method public constructor <init>(Lcom/jirbo/adcolony/AdColonyBrowser;Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 376
    iput-object p1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    .line 377
    invoke-direct {p0, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 372
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->a:Landroid/graphics/Rect;

    .line 373
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->b:Landroid/graphics/Paint;

    .line 378
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 439
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyBrowser;->r:Landroid/widget/ProgressBar;

    invoke-virtual {v1}, Landroid/widget/ProgressBar;->getWidth()I

    move-result v1

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->r:Landroid/widget/ProgressBar;

    invoke-virtual {v2}, Landroid/widget/ProgressBar;->getHeight()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 440
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyBrowser;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v1

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->d:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->g:I

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 441
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyBrowser;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0xa

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->d:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v2}, Lcom/jirbo/adcolony/ADCImage;->c()I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->d:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->f:I

    add-int/2addr v1, v2

    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 442
    sget-boolean v1, Lcom/jirbo/adcolony/AdColonyBrowser;->z:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyBrowser;->d:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/ADCImage;->c()I

    move-result v1

    if-eqz v1, :cond_0

    .line 444
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyBrowser;->m:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->r:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    .line 445
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyBrowser;->m:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->r:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 446
    const/4 v0, 0x0

    sput-boolean v0, Lcom/jirbo/adcolony/AdColonyBrowser;->z:Z

    .line 450
    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyBrowser;->r:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_1

    .line 453
    :goto_0
    return-void

    .line 451
    :cond_1
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyBrowser;->r:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyBrowser;->d:Lcom/jirbo/adcolony/ADCImage;

    iget v1, v1, Lcom/jirbo/adcolony/ADCImage;->g:I

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 452
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyBrowser;->r:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyBrowser;->d:Lcom/jirbo/adcolony/ADCImage;

    iget v1, v1, Lcom/jirbo/adcolony/ADCImage;->f:I

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    goto :goto_0
.end method

.method public a(Lcom/jirbo/adcolony/ADCImage;II)Z
    .locals 2

    .prologue
    .line 551
    invoke-virtual {p1}, Lcom/jirbo/adcolony/ADCImage;->c()I

    move-result v0

    iget v1, p1, Lcom/jirbo/adcolony/ADCImage;->f:I

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x10

    if-ge p2, v0, :cond_0

    invoke-virtual {p1}, Lcom/jirbo/adcolony/ADCImage;->c()I

    move-result v0

    add-int/lit8 v0, v0, -0x10

    if-le p2, v0, :cond_0

    invoke-virtual {p1}, Lcom/jirbo/adcolony/ADCImage;->d()I

    move-result v0

    iget v1, p1, Lcom/jirbo/adcolony/ADCImage;->g:I

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x10

    if-ge p3, v0, :cond_0

    invoke-virtual {p1}, Lcom/jirbo/adcolony/ADCImage;->d()I

    move-result v0

    add-int/lit8 v0, v0, -0x10

    if-le p3, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 542
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iput-boolean v1, v0, Lcom/jirbo/adcolony/AdColonyBrowser;->n:Z

    .line 543
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iput-boolean v1, v0, Lcom/jirbo/adcolony/AdColonyBrowser;->o:Z

    .line 544
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iput-boolean v1, v0, Lcom/jirbo/adcolony/AdColonyBrowser;->p:Z

    .line 545
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iput-boolean v1, v0, Lcom/jirbo/adcolony/AdColonyBrowser;->q:Z

    .line 546
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyBrowser$a;->invalidate()V

    .line 547
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .prologue
    .line 382
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->a:Landroid/graphics/Rect;

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/AdColonyBrowser$a;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 383
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyBrowser;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v0

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyBrowser;->c:Lcom/jirbo/adcolony/ADCImage;

    iget v1, v1, Lcom/jirbo/adcolony/ADCImage;->g:I

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    .line 386
    sget-boolean v1, Lcom/jirbo/adcolony/AdColonyBrowser;->v:Z

    if-nez v1, :cond_4

    .line 388
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyBrowser;->c:Lcom/jirbo/adcolony/ADCImage;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->c:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->f:I

    invoke-virtual {v1, p1, v2, v0}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    .line 394
    :goto_0
    sget-boolean v1, Lcom/jirbo/adcolony/AdColonyBrowser;->w:Z

    if-nez v1, :cond_5

    .line 396
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyBrowser;->f:Lcom/jirbo/adcolony/ADCImage;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->c:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v2}, Lcom/jirbo/adcolony/ADCImage;->c()I

    move-result v2

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v3, v3, Lcom/jirbo/adcolony/AdColonyBrowser;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v3}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0xa

    add-int/2addr v2, v3

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v3, v3, Lcom/jirbo/adcolony/AdColonyBrowser;->c:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->f:I

    add-int/2addr v2, v3

    invoke-virtual {v1, p1, v2, v0}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    .line 402
    :goto_1
    sget-boolean v1, Lcom/jirbo/adcolony/AdColonyBrowser;->x:Z

    if-eqz v1, :cond_6

    .line 404
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyBrowser;->d:Lcom/jirbo/adcolony/ADCImage;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->f:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v2}, Lcom/jirbo/adcolony/ADCImage;->c()I

    move-result v2

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v3, v3, Lcom/jirbo/adcolony/AdColonyBrowser;->f:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->f:I

    add-int/2addr v2, v3

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v3, v3, Lcom/jirbo/adcolony/AdColonyBrowser;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v3}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0xa

    add-int/2addr v2, v3

    invoke-virtual {v1, p1, v2, v0}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    .line 410
    :goto_2
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyBrowser;->g:Lcom/jirbo/adcolony/ADCImage;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v2}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v2

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v3, v3, Lcom/jirbo/adcolony/AdColonyBrowser;->g:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->f:I

    mul-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    invoke-virtual {v1, p1, v2, v0}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    .line 413
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/AdColonyBrowser;->n:Z

    if-eqz v0, :cond_0

    .line 415
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyBrowser;->h:Lcom/jirbo/adcolony/ADCImage;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyBrowser;->c:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/ADCImage;->c()I

    move-result v1

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->h:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->f:I

    div-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->c:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->f:I

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v1, v2

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->c:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v2}, Lcom/jirbo/adcolony/ADCImage;->d()I

    move-result v2

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v3, v3, Lcom/jirbo/adcolony/AdColonyBrowser;->h:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->g:I

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v3, v3, Lcom/jirbo/adcolony/AdColonyBrowser;->c:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->g:I

    div-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCImage;->c(II)V

    .line 416
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyBrowser;->h:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v0, p1}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;)V

    .line 418
    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/AdColonyBrowser;->o:Z

    if-eqz v0, :cond_1

    .line 420
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyBrowser;->h:Lcom/jirbo/adcolony/ADCImage;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyBrowser;->f:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/ADCImage;->c()I

    move-result v1

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->h:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->f:I

    div-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->f:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->f:I

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v1, v2

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->f:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v2}, Lcom/jirbo/adcolony/ADCImage;->d()I

    move-result v2

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v3, v3, Lcom/jirbo/adcolony/AdColonyBrowser;->h:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->g:I

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v3, v3, Lcom/jirbo/adcolony/AdColonyBrowser;->f:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->g:I

    div-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCImage;->c(II)V

    .line 421
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyBrowser;->h:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v0, p1}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;)V

    .line 423
    :cond_1
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/AdColonyBrowser;->p:Z

    if-eqz v0, :cond_2

    .line 425
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyBrowser;->h:Lcom/jirbo/adcolony/ADCImage;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyBrowser;->e:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/ADCImage;->c()I

    move-result v1

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->h:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->f:I

    div-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->e:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->f:I

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v1, v2

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->e:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v2}, Lcom/jirbo/adcolony/ADCImage;->d()I

    move-result v2

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v3, v3, Lcom/jirbo/adcolony/AdColonyBrowser;->h:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->g:I

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v3, v3, Lcom/jirbo/adcolony/AdColonyBrowser;->e:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->g:I

    div-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCImage;->c(II)V

    .line 426
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyBrowser;->h:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v0, p1}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;)V

    .line 428
    :cond_2
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/AdColonyBrowser;->q:Z

    if-eqz v0, :cond_3

    .line 430
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyBrowser;->h:Lcom/jirbo/adcolony/ADCImage;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyBrowser;->g:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/ADCImage;->c()I

    move-result v1

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->h:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->f:I

    div-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->g:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->f:I

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v1, v2

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->g:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v2}, Lcom/jirbo/adcolony/ADCImage;->d()I

    move-result v2

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v3, v3, Lcom/jirbo/adcolony/AdColonyBrowser;->h:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->g:I

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v3, v3, Lcom/jirbo/adcolony/AdColonyBrowser;->g:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->g:I

    div-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCImage;->c(II)V

    .line 431
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyBrowser;->h:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v0, p1}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;)V

    .line 434
    :cond_3
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyBrowser$a;->a()V

    .line 436
    return-void

    .line 392
    :cond_4
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyBrowser;->j:Lcom/jirbo/adcolony/ADCImage;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->c:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->f:I

    invoke-virtual {v1, p1, v2, v0}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    goto/16 :goto_0

    .line 400
    :cond_5
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyBrowser;->k:Lcom/jirbo/adcolony/ADCImage;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->c:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v2}, Lcom/jirbo/adcolony/ADCImage;->c()I

    move-result v2

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v3, v3, Lcom/jirbo/adcolony/AdColonyBrowser;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v3}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0xa

    add-int/2addr v2, v3

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v3, v3, Lcom/jirbo/adcolony/AdColonyBrowser;->c:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->f:I

    add-int/2addr v2, v3

    invoke-virtual {v1, p1, v2, v0}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    goto/16 :goto_1

    .line 408
    :cond_6
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyBrowser;->e:Lcom/jirbo/adcolony/ADCImage;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->f:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v2}, Lcom/jirbo/adcolony/ADCImage;->c()I

    move-result v2

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v3, v3, Lcom/jirbo/adcolony/AdColonyBrowser;->f:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->f:I

    add-int/2addr v2, v3

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v3, v3, Lcom/jirbo/adcolony/AdColonyBrowser;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v3}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0xa

    add-int/2addr v2, v3

    invoke-virtual {v1, p1, v2, v0}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    goto/16 :goto_2
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 458
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    .line 461
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    float-to-int v3, v3

    .line 462
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    float-to-int v4, v4

    .line 465
    if-nez v2, :cond_3

    .line 467
    iget-object v5, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v5, v5, Lcom/jirbo/adcolony/AdColonyBrowser;->c:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {p0, v5, v3, v4}, Lcom/jirbo/adcolony/AdColonyBrowser$a;->a(Lcom/jirbo/adcolony/ADCImage;II)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-boolean v5, Lcom/jirbo/adcolony/AdColonyBrowser;->v:Z

    if-eqz v5, :cond_0

    .line 469
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iput-boolean v0, v1, Lcom/jirbo/adcolony/AdColonyBrowser;->n:Z

    .line 470
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyBrowser$a;->invalidate()V

    .line 536
    :goto_0
    return v0

    .line 473
    :cond_0
    iget-object v5, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v5, v5, Lcom/jirbo/adcolony/AdColonyBrowser;->f:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {p0, v5, v3, v4}, Lcom/jirbo/adcolony/AdColonyBrowser$a;->a(Lcom/jirbo/adcolony/ADCImage;II)Z

    move-result v5

    if-eqz v5, :cond_1

    sget-boolean v5, Lcom/jirbo/adcolony/AdColonyBrowser;->w:Z

    if-eqz v5, :cond_1

    .line 475
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iput-boolean v0, v1, Lcom/jirbo/adcolony/AdColonyBrowser;->o:Z

    .line 476
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyBrowser$a;->invalidate()V

    goto :goto_0

    .line 479
    :cond_1
    iget-object v5, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v5, v5, Lcom/jirbo/adcolony/AdColonyBrowser;->e:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {p0, v5, v3, v4}, Lcom/jirbo/adcolony/AdColonyBrowser$a;->a(Lcom/jirbo/adcolony/ADCImage;II)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 481
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iput-boolean v0, v1, Lcom/jirbo/adcolony/AdColonyBrowser;->p:Z

    .line 482
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyBrowser$a;->invalidate()V

    goto :goto_0

    .line 485
    :cond_2
    iget-object v5, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v5, v5, Lcom/jirbo/adcolony/AdColonyBrowser;->g:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {p0, v5, v3, v4}, Lcom/jirbo/adcolony/AdColonyBrowser$a;->a(Lcom/jirbo/adcolony/ADCImage;II)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 487
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iput-boolean v0, v1, Lcom/jirbo/adcolony/AdColonyBrowser;->q:Z

    .line 488
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyBrowser$a;->invalidate()V

    goto :goto_0

    .line 494
    :cond_3
    if-ne v2, v0, :cond_9

    .line 496
    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->c:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {p0, v2, v3, v4}, Lcom/jirbo/adcolony/AdColonyBrowser$a;->a(Lcom/jirbo/adcolony/ADCImage;II)Z

    move-result v2

    if-eqz v2, :cond_4

    sget-boolean v2, Lcom/jirbo/adcolony/AdColonyBrowser;->v:Z

    if-eqz v2, :cond_4

    .line 498
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyBrowser;->b:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->goBack()V

    .line 499
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyBrowser$a;->b()V

    goto :goto_0

    .line 502
    :cond_4
    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->f:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {p0, v2, v3, v4}, Lcom/jirbo/adcolony/AdColonyBrowser$a;->a(Lcom/jirbo/adcolony/ADCImage;II)Z

    move-result v2

    if-eqz v2, :cond_5

    sget-boolean v2, Lcom/jirbo/adcolony/AdColonyBrowser;->w:Z

    if-eqz v2, :cond_5

    .line 504
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyBrowser;->b:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->goForward()V

    .line 505
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyBrowser$a;->b()V

    goto :goto_0

    .line 508
    :cond_5
    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->e:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {p0, v2, v3, v4}, Lcom/jirbo/adcolony/AdColonyBrowser$a;->a(Lcom/jirbo/adcolony/ADCImage;II)Z

    move-result v2

    if-eqz v2, :cond_6

    sget-boolean v2, Lcom/jirbo/adcolony/AdColonyBrowser;->x:Z

    if-eqz v2, :cond_6

    .line 510
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyBrowser;->b:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->stopLoading()V

    .line 511
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyBrowser$a;->b()V

    goto/16 :goto_0

    .line 514
    :cond_6
    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->e:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {p0, v2, v3, v4}, Lcom/jirbo/adcolony/AdColonyBrowser$a;->a(Lcom/jirbo/adcolony/ADCImage;II)Z

    move-result v2

    if-eqz v2, :cond_7

    sget-boolean v2, Lcom/jirbo/adcolony/AdColonyBrowser;->x:Z

    if-nez v2, :cond_7

    .line 516
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyBrowser;->b:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->reload()V

    .line 517
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyBrowser$a;->b()V

    goto/16 :goto_0

    .line 520
    :cond_7
    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->g:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {p0, v2, v3, v4}, Lcom/jirbo/adcolony/AdColonyBrowser$a;->a(Lcom/jirbo/adcolony/ADCImage;II)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 523
    sput-boolean v0, Lcom/jirbo/adcolony/AdColonyBrowser;->C:Z

    .line 524
    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyBrowser;->b:Landroid/webkit/WebView;

    const-string v3, ""

    const-string v4, "text/html"

    const-string v5, "utf-8"

    invoke-virtual {v2, v3, v4, v5}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 525
    sput-boolean v1, Lcom/jirbo/adcolony/AdColonyBrowser;->w:Z

    .line 526
    sput-boolean v1, Lcom/jirbo/adcolony/AdColonyBrowser;->v:Z

    .line 527
    sput-boolean v1, Lcom/jirbo/adcolony/AdColonyBrowser;->x:Z

    .line 528
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyBrowser$a;->b()V

    .line 529
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$a;->c:Lcom/jirbo/adcolony/AdColonyBrowser;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/AdColonyBrowser;->finish()V

    goto/16 :goto_0

    .line 532
    :cond_8
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyBrowser$a;->b()V

    :cond_9
    move v0, v1

    .line 536
    goto/16 :goto_0
.end method
