.class Lorg/chromium/content/browser/PopupZoomer$1;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "PopupZoomer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/content/browser/PopupZoomer;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/content/browser/PopupZoomer;


# direct methods
.method constructor <init>(Lorg/chromium/content/browser/PopupZoomer;)V
    .locals 0

    .prologue
    .line 182
    iput-object p1, p0, Lorg/chromium/content/browser/PopupZoomer$1;->this$0:Lorg/chromium/content/browser/PopupZoomer;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method

.method private handleTapOrPress(Landroid/view/MotionEvent;Z)Z
    .locals 7
    .param p1, "e"    # Landroid/view/MotionEvent;
    .param p2, "isLongPress"    # Z

    .prologue
    const/4 v6, 0x1

    .line 207
    iget-object v4, p0, Lorg/chromium/content/browser/PopupZoomer$1;->this$0:Lorg/chromium/content/browser/PopupZoomer;

    # getter for: Lorg/chromium/content/browser/PopupZoomer;->mAnimating:Z
    invoke-static {v4}, Lorg/chromium/content/browser/PopupZoomer;->access$000(Lorg/chromium/content/browser/PopupZoomer;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 225
    :cond_0
    :goto_0
    return v6

    .line 209
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    .line 210
    .local v2, "x":F
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    .line 211
    .local v3, "y":F
    iget-object v4, p0, Lorg/chromium/content/browser/PopupZoomer$1;->this$0:Lorg/chromium/content/browser/PopupZoomer;

    # invokes: Lorg/chromium/content/browser/PopupZoomer;->isTouchOutsideArea(FF)Z
    invoke-static {v4, v2, v3}, Lorg/chromium/content/browser/PopupZoomer;->access$100(Lorg/chromium/content/browser/PopupZoomer;FF)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 213
    iget-object v4, p0, Lorg/chromium/content/browser/PopupZoomer$1;->this$0:Lorg/chromium/content/browser/PopupZoomer;

    invoke-virtual {v4, v6}, Lorg/chromium/content/browser/PopupZoomer;->hide(Z)V

    goto :goto_0

    .line 214
    :cond_2
    iget-object v4, p0, Lorg/chromium/content/browser/PopupZoomer$1;->this$0:Lorg/chromium/content/browser/PopupZoomer;

    # getter for: Lorg/chromium/content/browser/PopupZoomer;->mOnTapListener:Lorg/chromium/content/browser/PopupZoomer$OnTapListener;
    invoke-static {v4}, Lorg/chromium/content/browser/PopupZoomer;->access$300(Lorg/chromium/content/browser/PopupZoomer;)Lorg/chromium/content/browser/PopupZoomer$OnTapListener;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 215
    iget-object v4, p0, Lorg/chromium/content/browser/PopupZoomer$1;->this$0:Lorg/chromium/content/browser/PopupZoomer;

    # invokes: Lorg/chromium/content/browser/PopupZoomer;->convertTouchPoint(FF)Landroid/graphics/PointF;
    invoke-static {v4, v2, v3}, Lorg/chromium/content/browser/PopupZoomer;->access$400(Lorg/chromium/content/browser/PopupZoomer;FF)Landroid/graphics/PointF;

    move-result-object v0

    .line 216
    .local v0, "converted":Landroid/graphics/PointF;
    invoke-static {p1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v1

    .line 217
    .local v1, "event":Landroid/view/MotionEvent;
    iget v4, v0, Landroid/graphics/PointF;->x:F

    iget v5, v0, Landroid/graphics/PointF;->y:F

    invoke-virtual {v1, v4, v5}, Landroid/view/MotionEvent;->setLocation(FF)V

    .line 218
    if-eqz p2, :cond_3

    .line 219
    iget-object v4, p0, Lorg/chromium/content/browser/PopupZoomer$1;->this$0:Lorg/chromium/content/browser/PopupZoomer;

    # getter for: Lorg/chromium/content/browser/PopupZoomer;->mOnTapListener:Lorg/chromium/content/browser/PopupZoomer$OnTapListener;
    invoke-static {v4}, Lorg/chromium/content/browser/PopupZoomer;->access$300(Lorg/chromium/content/browser/PopupZoomer;)Lorg/chromium/content/browser/PopupZoomer$OnTapListener;

    move-result-object v4

    iget-object v5, p0, Lorg/chromium/content/browser/PopupZoomer$1;->this$0:Lorg/chromium/content/browser/PopupZoomer;

    invoke-interface {v4, v5, v1}, Lorg/chromium/content/browser/PopupZoomer$OnTapListener;->onLongPress(Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 223
    :goto_1
    iget-object v4, p0, Lorg/chromium/content/browser/PopupZoomer$1;->this$0:Lorg/chromium/content/browser/PopupZoomer;

    invoke-virtual {v4, v6}, Lorg/chromium/content/browser/PopupZoomer;->hide(Z)V

    goto :goto_0

    .line 221
    :cond_3
    iget-object v4, p0, Lorg/chromium/content/browser/PopupZoomer$1;->this$0:Lorg/chromium/content/browser/PopupZoomer;

    # getter for: Lorg/chromium/content/browser/PopupZoomer;->mOnTapListener:Lorg/chromium/content/browser/PopupZoomer$OnTapListener;
    invoke-static {v4}, Lorg/chromium/content/browser/PopupZoomer;->access$300(Lorg/chromium/content/browser/PopupZoomer;)Lorg/chromium/content/browser/PopupZoomer$OnTapListener;

    move-result-object v4

    iget-object v5, p0, Lorg/chromium/content/browser/PopupZoomer$1;->this$0:Lorg/chromium/content/browser/PopupZoomer;

    invoke-interface {v4, v5, v1}, Lorg/chromium/content/browser/PopupZoomer$OnTapListener;->onSingleTap(Landroid/view/View;Landroid/view/MotionEvent;)Z

    goto :goto_1
.end method


# virtual methods
.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 1
    .param p1, "e"    # Landroid/view/MotionEvent;

    .prologue
    .line 203
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lorg/chromium/content/browser/PopupZoomer$1;->handleTapOrPress(Landroid/view/MotionEvent;Z)Z

    .line 204
    return-void
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 4
    .param p1, "e1"    # Landroid/view/MotionEvent;
    .param p2, "e2"    # Landroid/view/MotionEvent;
    .param p3, "distanceX"    # F
    .param p4, "distanceY"    # F

    .prologue
    const/4 v3, 0x1

    .line 186
    iget-object v0, p0, Lorg/chromium/content/browser/PopupZoomer$1;->this$0:Lorg/chromium/content/browser/PopupZoomer;

    # getter for: Lorg/chromium/content/browser/PopupZoomer;->mAnimating:Z
    invoke-static {v0}, Lorg/chromium/content/browser/PopupZoomer;->access$000(Lorg/chromium/content/browser/PopupZoomer;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 193
    :goto_0
    return v3

    .line 188
    :cond_0
    iget-object v0, p0, Lorg/chromium/content/browser/PopupZoomer$1;->this$0:Lorg/chromium/content/browser/PopupZoomer;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    # invokes: Lorg/chromium/content/browser/PopupZoomer;->isTouchOutsideArea(FF)Z
    invoke-static {v0, v1, v2}, Lorg/chromium/content/browser/PopupZoomer;->access$100(Lorg/chromium/content/browser/PopupZoomer;FF)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 189
    iget-object v0, p0, Lorg/chromium/content/browser/PopupZoomer$1;->this$0:Lorg/chromium/content/browser/PopupZoomer;

    invoke-virtual {v0, v3}, Lorg/chromium/content/browser/PopupZoomer;->hide(Z)V

    goto :goto_0

    .line 191
    :cond_1
    iget-object v0, p0, Lorg/chromium/content/browser/PopupZoomer$1;->this$0:Lorg/chromium/content/browser/PopupZoomer;

    # invokes: Lorg/chromium/content/browser/PopupZoomer;->scroll(FF)V
    invoke-static {v0, p3, p4}, Lorg/chromium/content/browser/PopupZoomer;->access$200(Lorg/chromium/content/browser/PopupZoomer;FF)V

    goto :goto_0
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1, "e"    # Landroid/view/MotionEvent;

    .prologue
    .line 198
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/chromium/content/browser/PopupZoomer$1;->handleTapOrPress(Landroid/view/MotionEvent;Z)Z

    move-result v0

    return v0
.end method
