.class public Lcom/facebook/widget/images/a;
.super Landroid/widget/Gallery;
.source "GalleryWithSwipingFix.java"


# instance fields
.field private a:Ljava/lang/Runnable;

.field private b:J

.field private c:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0, p1}, Landroid/widget/Gallery;-><init>(Landroid/content/Context;)V

    .line 32
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0, p1, p2}, Landroid/widget/Gallery;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 36
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/Gallery;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 40
    return-void
.end method

.method static synthetic a(Lcom/facebook/widget/images/a;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    .locals 0

    .prologue
    .line 21
    iput-object p1, p0, Lcom/facebook/widget/images/a;->a:Ljava/lang/Runnable;

    return-object p1
.end method

.method private a()V
    .locals 3

    .prologue
    .line 88
    iget-object v0, p0, Lcom/facebook/widget/images/a;->a:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 99
    :goto_0
    return-void

    .line 91
    :cond_0
    new-instance v0, Lcom/facebook/widget/images/b;

    invoke-direct {v0, p0}, Lcom/facebook/widget/images/b;-><init>(Lcom/facebook/widget/images/a;)V

    iput-object v0, p0, Lcom/facebook/widget/images/a;->a:Ljava/lang/Runnable;

    .line 98
    iget-object v0, p0, Lcom/facebook/widget/images/a;->a:Ljava/lang/Runnable;

    const-wide/16 v1, 0xfa

    invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/widget/images/a;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/widget/images/a;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Lcom/facebook/widget/images/a;->b()V

    return-void
.end method

.method private b()V
    .locals 4

    .prologue
    .line 119
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 120
    iget-wide v2, p0, Lcom/facebook/widget/images/a;->b:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0xfa

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/widget/images/a;->c:Z

    if-nez v0, :cond_0

    .line 121
    invoke-virtual {p0}, Lcom/facebook/widget/images/a;->requestLayout()V

    .line 125
    :goto_0
    return-void

    .line 123
    :cond_0
    invoke-direct {p0}, Lcom/facebook/widget/images/a;->a()V

    goto :goto_0
.end method


# virtual methods
.method protected onLayout(ZIIII)V
    .locals 4

    .prologue
    .line 76
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 77
    iget-wide v2, p0, Lcom/facebook/widget/images/a;->b:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0xfa

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/widget/images/a;->c:Z

    if-nez v0, :cond_0

    .line 78
    invoke-super/range {p0 .. p5}, Landroid/widget/Gallery;->onLayout(ZIIII)V

    .line 82
    :goto_0
    return-void

    .line 80
    :cond_0
    invoke-direct {p0}, Lcom/facebook/widget/images/a;->a()V

    goto :goto_0
.end method

.method protected onScrollChanged(IIII)V
    .locals 2

    .prologue
    .line 111
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/Gallery;->onScrollChanged(IIII)V

    .line 112
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/widget/images/a;->b:J

    .line 113
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 52
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_1

    .line 53
    iput-boolean v1, p0, Lcom/facebook/widget/images/a;->c:Z

    .line 58
    :cond_0
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/Gallery;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 54
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-eq v0, v1, :cond_2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 56
    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/widget/images/a;->c:Z

    goto :goto_0
.end method
