.class public Lcom/roidapp/baselib/view/ProSwipeRefreshLayout;
.super Lcom/roidapp/baselib/view/FixedSwipeRefreshLayout;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:F

.field private c:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/view/FixedSwipeRefreshLayout;-><init>(Landroid/content/Context;)V

    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0, p1, p2}, Lcom/roidapp/baselib/view/FixedSwipeRefreshLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 25
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Lcom/roidapp/baselib/view/ProSwipeRefreshLayout;->a:I

    .line 26
    return-void
.end method


# virtual methods
.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 31
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 46
    :cond_0
    :goto_0
    :pswitch_0
    invoke-super {p0, p1}, Lcom/roidapp/baselib/view/FixedSwipeRefreshLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    :goto_1
    return v0

    .line 33
    :pswitch_1
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iput v1, p0, Lcom/roidapp/baselib/view/ProSwipeRefreshLayout;->b:F

    .line 34
    iput-boolean v0, p0, Lcom/roidapp/baselib/view/ProSwipeRefreshLayout;->c:Z

    goto :goto_0

    .line 38
    :pswitch_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    .line 39
    iget v2, p0, Lcom/roidapp/baselib/view/ProSwipeRefreshLayout;->b:F

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    .line 41
    iget-boolean v2, p0, Lcom/roidapp/baselib/view/ProSwipeRefreshLayout;->c:Z

    if-nez v2, :cond_1

    iget v2, p0, Lcom/roidapp/baselib/view/ProSwipeRefreshLayout;->a:I

    int-to-float v2, v2

    cmpl-float v1, v1, v2

    if-lez v1, :cond_0

    .line 42
    :cond_1
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/roidapp/baselib/view/ProSwipeRefreshLayout;->c:Z

    goto :goto_1

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method
