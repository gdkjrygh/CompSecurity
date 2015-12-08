.class public Lcom/jirbo/adcolony/AdColonyOverlay;
.super Lcom/jirbo/adcolony/ADCVideo;
.source "SourceFile"


# instance fields
.field U:Landroid/graphics/Rect;

.field V:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/jirbo/adcolony/ADCVideo;-><init>()V

    .line 26
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyOverlay;->U:Landroid/graphics/Rect;

    .line 27
    const/4 v0, 0x0

    iput v0, p0, Lcom/jirbo/adcolony/AdColonyOverlay;->V:I

    return-void
.end method


# virtual methods
.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 7

    .prologue
    const/16 v6, 0x11

    .line 31
    invoke-super {p0, p1}, Lcom/jirbo/adcolony/ADCVideo;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 32
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyOverlay;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 33
    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v1

    iput v1, p0, Lcom/jirbo/adcolony/AdColonyOverlay;->t:I

    .line 34
    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/jirbo/adcolony/AdColonyOverlay;->u:I

    .line 35
    const/4 v0, 0x1

    sput-boolean v0, Lcom/jirbo/adcolony/a;->B:Z

    .line 37
    new-instance v0, Landroid/view/View;

    invoke-direct {v0, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 38
    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 39
    sget-boolean v1, Lcom/jirbo/adcolony/AdColonyOverlay;->d:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyOverlay;->F:Lcom/jirbo/adcolony/ae;

    iget-boolean v1, v1, Lcom/jirbo/adcolony/ae;->Q:Z

    if-eqz v1, :cond_0

    .line 41
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyOverlay;->O:Landroid/widget/FrameLayout;

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    iget v3, p0, Lcom/jirbo/adcolony/AdColonyOverlay;->t:I

    iget v4, p0, Lcom/jirbo/adcolony/AdColonyOverlay;->u:I

    iget-object v5, p0, Lcom/jirbo/adcolony/AdColonyOverlay;->F:Lcom/jirbo/adcolony/ae;

    iget v5, v5, Lcom/jirbo/adcolony/ae;->m:I

    sub-int/2addr v4, v5

    invoke-direct {v2, v3, v4, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 42
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyOverlay;->N:Landroid/widget/FrameLayout;

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    iget v3, p0, Lcom/jirbo/adcolony/AdColonyOverlay;->t:I

    iget v4, p0, Lcom/jirbo/adcolony/AdColonyOverlay;->u:I

    invoke-direct {v2, v3, v4, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v1, v0, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 43
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 44
    new-instance v2, Lcom/jirbo/adcolony/AdColonyOverlay$1;

    invoke-direct {v2, p0, v0}, Lcom/jirbo/adcolony/AdColonyOverlay$1;-><init>(Lcom/jirbo/adcolony/AdColonyOverlay;Landroid/view/View;)V

    .line 51
    const-wide/16 v4, 0x5dc

    invoke-virtual {v1, v2, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 54
    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyOverlay;->F:Lcom/jirbo/adcolony/ae;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ae;->a()V

    .line 55
    return-void
.end method
