.class public Lcom/facebook/orca/common/ui/widgets/TouchStealingLinearLayout;
.super Lcom/facebook/widget/e;
.source "TouchStealingLinearLayout.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p1}, Lcom/facebook/widget/e;-><init>(Landroid/content/Context;)V

    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    return-void
.end method

.method private a()V
    .locals 2

    .prologue
    .line 26
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/TouchStealingLinearLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 30
    :cond_0
    return-void
.end method


# virtual methods
.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .prologue
    .line 34
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 35
    invoke-super {p0, p1}, Lcom/facebook/widget/e;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    .line 36
    packed-switch v0, :pswitch_data_0

    .line 42
    :goto_0
    :pswitch_0
    return v1

    .line 39
    :pswitch_1
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/widgets/TouchStealingLinearLayout;->a()V

    goto :goto_0

    .line 36
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
