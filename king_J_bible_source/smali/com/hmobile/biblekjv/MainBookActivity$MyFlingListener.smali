.class Lcom/hmobile/biblekjv/MainBookActivity$MyFlingListener;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "MainBookActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/biblekjv/MainBookActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "MyFlingListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/MainBookActivity;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/MainBookActivity;)V
    .locals 0

    .prologue
    .line 1501
    iput-object p1, p0, Lcom/hmobile/biblekjv/MainBookActivity$MyFlingListener;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 5
    .param p1, "e1"    # Landroid/view/MotionEvent;
    .param p2, "e2"    # Landroid/view/MotionEvent;
    .param p3, "velocityX"    # F
    .param p4, "velocityY"    # F

    .prologue
    const/4 v4, 0x0

    const/high16 v3, 0x43480000    # 200.0f

    const/high16 v2, 0x42f00000    # 120.0f

    .line 1505
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 1507
    :try_start_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x437a0000    # 250.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 1522
    :cond_0
    :goto_0
    return v4

    .line 1511
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    sub-float/2addr v0, v1

    cmpl-float v0, v0, v2

    if-lez v0, :cond_2

    .line 1512
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpl-float v0, v0, v3

    if-lez v0, :cond_2

    .line 1513
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$MyFlingListener;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    # invokes: Lcom/hmobile/biblekjv/MainBookActivity;->clickNext()V
    invoke-static {v0}, Lcom/hmobile/biblekjv/MainBookActivity;->access$25(Lcom/hmobile/biblekjv/MainBookActivity;)V

    goto :goto_0

    .line 1518
    :catch_0
    move-exception v0

    goto :goto_0

    .line 1514
    :cond_2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    sub-float/2addr v0, v1

    cmpl-float v0, v0, v2

    if-lez v0, :cond_0

    .line 1515
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpl-float v0, v0, v3

    if-lez v0, :cond_0

    .line 1516
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$MyFlingListener;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    # invokes: Lcom/hmobile/biblekjv/MainBookActivity;->clickPrev()V
    invoke-static {v0}, Lcom/hmobile/biblekjv/MainBookActivity;->access$26(Lcom/hmobile/biblekjv/MainBookActivity;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1
    .param p1, "e1"    # Landroid/view/MotionEvent;
    .param p2, "e2"    # Landroid/view/MotionEvent;
    .param p3, "distanceX"    # F
    .param p4, "distanceY"    # F

    .prologue
    .line 1528
    const/4 v0, 0x0

    return v0
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1, "e"    # Landroid/view/MotionEvent;

    .prologue
    .line 1533
    const/4 v0, 0x0

    return v0
.end method
