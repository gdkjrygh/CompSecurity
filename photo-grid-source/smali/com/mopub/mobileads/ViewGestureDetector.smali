.class public Lcom/mopub/mobileads/ViewGestureDetector;
.super Landroid/view/GestureDetector;
.source "SourceFile"


# instance fields
.field private final a:Landroid/view/View;

.field private b:Lcom/mopub/mobileads/AdAlertGestureListener;

.field private c:Lcom/mopub/mobileads/ViewGestureDetector$UserClickListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;Lcom/mopub/common/AdReport;)V
    .locals 1

    .prologue
    .line 26
    new-instance v0, Lcom/mopub/mobileads/AdAlertGestureListener;

    invoke-direct {v0, p2, p3}, Lcom/mopub/mobileads/AdAlertGestureListener;-><init>(Landroid/view/View;Lcom/mopub/common/AdReport;)V

    invoke-direct {p0, p1, p2, v0}, Lcom/mopub/mobileads/ViewGestureDetector;-><init>(Landroid/content/Context;Landroid/view/View;Lcom/mopub/mobileads/AdAlertGestureListener;)V

    .line 27
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/view/View;Lcom/mopub/mobileads/AdAlertGestureListener;)V
    .locals 1

    .prologue
    .line 30
    invoke-direct {p0, p1, p3}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 32
    iput-object p3, p0, Lcom/mopub/mobileads/ViewGestureDetector;->b:Lcom/mopub/mobileads/AdAlertGestureListener;

    .line 33
    iput-object p2, p0, Lcom/mopub/mobileads/ViewGestureDetector;->a:Landroid/view/View;

    .line 35
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/ViewGestureDetector;->setIsLongpressEnabled(Z)V

    .line 36
    return-void
.end method


# virtual methods
.method public sendTouchEvent(Landroid/view/MotionEvent;)V
    .locals 6

    .prologue
    const/4 v0, 0x0

    const/4 v5, 0x0

    .line 39
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 64
    :goto_0
    return-void

    .line 41
    :pswitch_0
    iget-object v0, p0, Lcom/mopub/mobileads/ViewGestureDetector;->c:Lcom/mopub/mobileads/ViewGestureDetector$UserClickListener;

    if-eqz v0, :cond_0

    .line 42
    iget-object v0, p0, Lcom/mopub/mobileads/ViewGestureDetector;->c:Lcom/mopub/mobileads/ViewGestureDetector$UserClickListener;

    invoke-interface {v0}, Lcom/mopub/mobileads/ViewGestureDetector$UserClickListener;->onUserClick()V

    .line 46
    :goto_1
    iget-object v0, p0, Lcom/mopub/mobileads/ViewGestureDetector;->b:Lcom/mopub/mobileads/AdAlertGestureListener;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdAlertGestureListener;->a()V

    goto :goto_0

    .line 44
    :cond_0
    const-string v0, "View\'s onUserClick() is not registered."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    goto :goto_1

    .line 50
    :pswitch_1
    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/ViewGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    goto :goto_0

    .line 54
    :pswitch_2
    iget-object v1, p0, Lcom/mopub/mobileads/ViewGestureDetector;->a:Landroid/view/View;

    .line 1075
    if-eqz p1, :cond_1

    if-nez v1, :cond_2

    .line 54
    :cond_1
    :goto_2
    if-eqz v0, :cond_3

    .line 55
    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/ViewGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    goto :goto_0

    .line 1079
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    .line 1080
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    .line 1082
    cmpl-float v4, v2, v5

    if-ltz v4, :cond_1

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    cmpg-float v2, v2, v4

    if-gtz v2, :cond_1

    cmpl-float v2, v3, v5

    if-ltz v2, :cond_1

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    cmpg-float v1, v3, v1

    if-gtz v1, :cond_1

    const/4 v0, 0x1

    goto :goto_2

    .line 2071
    :cond_3
    iget-object v0, p0, Lcom/mopub/mobileads/ViewGestureDetector;->b:Lcom/mopub/mobileads/AdAlertGestureListener;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdAlertGestureListener;->b()V

    goto :goto_0

    .line 39
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public setUserClickListener(Lcom/mopub/mobileads/ViewGestureDetector$UserClickListener;)V
    .locals 0

    .prologue
    .line 67
    iput-object p1, p0, Lcom/mopub/mobileads/ViewGestureDetector;->c:Lcom/mopub/mobileads/ViewGestureDetector$UserClickListener;

    .line 68
    return-void
.end method
