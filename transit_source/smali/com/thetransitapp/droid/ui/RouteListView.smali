.class public Lcom/thetransitapp/droid/ui/RouteListView;
.super Landroid/widget/ListView;
.source "RouteListView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/thetransitapp/droid/ui/RouteListView$OnMoveListener;
    }
.end annotation


# instance fields
.field private onMoveListener:Lcom/thetransitapp/droid/ui/RouteListView$OnMoveListener;

.field private scrolling:Z

.field private startX:F

.field private startY:F

.field private vertical:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 23
    invoke-direct {p0, p1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 27
    invoke-direct {p0, p1, p2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    .line 31
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    return-void
.end method


# virtual methods
.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7
    .param p1, "event"    # Landroid/view/MotionEvent;

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    const/high16 v6, 0x40a00000    # 5.0f

    .line 36
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v4

    packed-switch v4, :pswitch_data_0

    .line 60
    :goto_0
    :pswitch_0
    invoke-super {p0, p1}, Landroid/widget/ListView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v2

    :goto_1
    return v2

    .line 38
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    iput v3, p0, Lcom/thetransitapp/droid/ui/RouteListView;->startX:F

    .line 39
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    iput v3, p0, Lcom/thetransitapp/droid/ui/RouteListView;->startY:F

    .line 41
    iput-boolean v2, p0, Lcom/thetransitapp/droid/ui/RouteListView;->scrolling:Z

    goto :goto_0

    .line 45
    :pswitch_2
    iget-boolean v4, p0, Lcom/thetransitapp/droid/ui/RouteListView;->scrolling:Z

    if-nez v4, :cond_2

    .line 46
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    iget v5, p0, Lcom/thetransitapp/droid/ui/RouteListView;->startX:F

    sub-float/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v0

    .line 47
    .local v0, "offsetX":F
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    iget v5, p0, Lcom/thetransitapp/droid/ui/RouteListView;->startY:F

    sub-float/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v1

    .line 49
    .local v1, "offsetY":F
    cmpg-float v4, v0, v6

    if-gez v4, :cond_0

    cmpg-float v4, v1, v6

    if-gez v4, :cond_0

    .line 50
    invoke-super {p0, p1}, Landroid/widget/ListView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v2

    goto :goto_1

    .line 53
    :cond_0
    cmpg-float v4, v0, v1

    if-gez v4, :cond_1

    move v2, v3

    :cond_1
    iput-boolean v2, p0, Lcom/thetransitapp/droid/ui/RouteListView;->vertical:Z

    .line 54
    iput-boolean v3, p0, Lcom/thetransitapp/droid/ui/RouteListView;->scrolling:Z

    .line 57
    .end local v0    # "offsetX":F
    .end local v1    # "offsetY":F
    :cond_2
    iget-boolean v2, p0, Lcom/thetransitapp/droid/ui/RouteListView;->vertical:Z

    goto :goto_1

    .line 36
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public setOnMoveListener(Lcom/thetransitapp/droid/ui/RouteListView$OnMoveListener;)V
    .locals 0
    .param p1, "onMoveListener"    # Lcom/thetransitapp/droid/ui/RouteListView$OnMoveListener;

    .prologue
    .line 19
    iput-object p1, p0, Lcom/thetransitapp/droid/ui/RouteListView;->onMoveListener:Lcom/thetransitapp/droid/ui/RouteListView$OnMoveListener;

    return-void
.end method
