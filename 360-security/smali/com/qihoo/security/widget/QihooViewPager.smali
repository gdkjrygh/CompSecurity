.class public Lcom/qihoo/security/widget/QihooViewPager;
.super Landroid/support/v4/view/ViewPager;
.source "360Security"


# instance fields
.field protected a:Landroid/support/v4/view/ViewPager$e;

.field private b:Z

.field private c:Z

.field private d:Z

.field private e:I

.field private f:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 15
    invoke-direct {p0, p1}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;)V

    .line 12
    iput-boolean v1, p0, Lcom/qihoo/security/widget/QihooViewPager;->b:Z

    .line 32
    iput-boolean v0, p0, Lcom/qihoo/security/widget/QihooViewPager;->c:Z

    .line 34
    iput-boolean v0, p0, Lcom/qihoo/security/widget/QihooViewPager;->d:Z

    .line 36
    iput v0, p0, Lcom/qihoo/security/widget/QihooViewPager;->e:I

    .line 38
    iput-boolean v1, p0, Lcom/qihoo/security/widget/QihooViewPager;->f:Z

    .line 16
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 19
    invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 12
    iput-boolean v1, p0, Lcom/qihoo/security/widget/QihooViewPager;->b:Z

    .line 32
    iput-boolean v0, p0, Lcom/qihoo/security/widget/QihooViewPager;->c:Z

    .line 34
    iput-boolean v0, p0, Lcom/qihoo/security/widget/QihooViewPager;->d:Z

    .line 36
    iput v0, p0, Lcom/qihoo/security/widget/QihooViewPager;->e:I

    .line 38
    iput-boolean v1, p0, Lcom/qihoo/security/widget/QihooViewPager;->f:Z

    .line 20
    return-void
.end method

.method private b(IZ)V
    .locals 1

    .prologue
    .line 51
    iget-boolean v0, p0, Lcom/qihoo/security/widget/QihooViewPager;->c:Z

    if-nez v0, :cond_1

    .line 52
    iput p1, p0, Lcom/qihoo/security/widget/QihooViewPager;->e:I

    .line 53
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/widget/QihooViewPager;->d:Z

    .line 66
    :cond_0
    :goto_0
    return-void

    .line 56
    :cond_1
    iget-boolean v0, p0, Lcom/qihoo/security/widget/QihooViewPager;->c:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/qihoo/security/widget/QihooViewPager;->f:Z

    if-eqz v0, :cond_2

    invoke-super {p0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v0

    if-nez v0, :cond_2

    if-nez p1, :cond_2

    .line 58
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/widget/QihooViewPager;->f:Z

    .line 59
    invoke-super {p0, p1, p2}, Landroid/support/v4/view/ViewPager;->a(IZ)V

    .line 60
    iget-object v0, p0, Lcom/qihoo/security/widget/QihooViewPager;->a:Landroid/support/v4/view/ViewPager$e;

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Lcom/qihoo/security/widget/QihooViewPager;->a:Landroid/support/v4/view/ViewPager$e;

    invoke-interface {v0, p1}, Landroid/support/v4/view/ViewPager$e;->a(I)V

    goto :goto_0

    .line 64
    :cond_2
    invoke-super {p0, p1, p2}, Landroid/support/v4/view/ViewPager;->a(IZ)V

    goto :goto_0
.end method


# virtual methods
.method public a(IZ)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/widget/QihooViewPager;->b(IZ)V

    .line 48
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 109
    iget-boolean v1, p0, Lcom/qihoo/security/widget/QihooViewPager;->b:Z

    if-eqz v1, :cond_0

    .line 111
    :try_start_0
    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    .line 119
    :cond_0
    :goto_0
    return v0

    .line 113
    :catch_0
    move-exception v1

    goto :goto_0

    .line 115
    :catch_1
    move-exception v1

    goto :goto_0
.end method

.method protected onLayout(ZIIII)V
    .locals 2

    .prologue
    .line 70
    invoke-super/range {p0 .. p5}, Landroid/support/v4/view/ViewPager;->onLayout(ZIIII)V

    .line 71
    iget-boolean v0, p0, Lcom/qihoo/security/widget/QihooViewPager;->d:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/qihoo/security/widget/QihooViewPager;->c:Z

    if-nez v0, :cond_1

    .line 72
    iget-object v0, p0, Lcom/qihoo/security/widget/QihooViewPager;->a:Landroid/support/v4/view/ViewPager$e;

    if-eqz v0, :cond_1

    .line 73
    iget v0, p0, Lcom/qihoo/security/widget/QihooViewPager;->e:I

    if-nez v0, :cond_0

    .line 74
    iget-object v0, p0, Lcom/qihoo/security/widget/QihooViewPager;->a:Landroid/support/v4/view/ViewPager$e;

    iget v1, p0, Lcom/qihoo/security/widget/QihooViewPager;->e:I

    invoke-interface {v0, v1}, Landroid/support/v4/view/ViewPager$e;->a(I)V

    .line 76
    :cond_0
    iget v0, p0, Lcom/qihoo/security/widget/QihooViewPager;->e:I

    const/4 v1, 0x0

    invoke-super {p0, v0, v1}, Landroid/support/v4/view/ViewPager;->a(IZ)V

    .line 79
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/widget/QihooViewPager;->c:Z

    .line 80
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 94
    iget-boolean v1, p0, Lcom/qihoo/security/widget/QihooViewPager;->b:Z

    if-eqz v1, :cond_0

    .line 97
    :try_start_0
    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->onTouchEvent(Landroid/view/MotionEvent;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 102
    :cond_0
    :goto_0
    return v0

    .line 98
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public setCanScroll(Z)V
    .locals 0

    .prologue
    .line 88
    iput-boolean p1, p0, Lcom/qihoo/security/widget/QihooViewPager;->b:Z

    .line 89
    return-void
.end method

.method public setCurrentItem(I)V
    .locals 1

    .prologue
    .line 42
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/widget/QihooViewPager;->b(IZ)V

    .line 43
    return-void
.end method

.method public setOnPageChangeListener(Landroid/support/v4/view/ViewPager$e;)V
    .locals 0

    .prologue
    .line 27
    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$e;)V

    .line 28
    iput-object p1, p0, Lcom/qihoo/security/widget/QihooViewPager;->a:Landroid/support/v4/view/ViewPager$e;

    .line 29
    return-void
.end method
