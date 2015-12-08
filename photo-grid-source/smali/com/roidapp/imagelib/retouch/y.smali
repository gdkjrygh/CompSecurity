.class final Lcom/roidapp/imagelib/retouch/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/GestureDetector$OnGestureListener;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/retouch/x;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/retouch/x;)V
    .locals 0

    .prologue
    .line 43
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/y;->a:Lcom/roidapp/imagelib/retouch/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDown(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 46
    const/4 v0, 0x1

    return v0
.end method

.method public final onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1

    .prologue
    .line 73
    const/4 v0, 0x0

    return v0
.end method

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 0

    .prologue
    .line 69
    return-void
.end method

.method public final onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 3

    .prologue
    .line 61
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/y;->a:Lcom/roidapp/imagelib/retouch/x;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/x;->a(Lcom/roidapp/imagelib/retouch/x;)Landroid/graphics/Matrix;

    move-result-object v0

    neg-float v1, p3

    neg-float v2, p4

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 62
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/y;->a:Lcom/roidapp/imagelib/retouch/x;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/x;->b(Lcom/roidapp/imagelib/retouch/x;)V

    .line 63
    const/4 v0, 0x1

    return v0
.end method

.method public final onShowPress(Landroid/view/MotionEvent;)V
    .locals 0

    .prologue
    .line 52
    return-void
.end method

.method public final onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 56
    const/4 v0, 0x1

    return v0
.end method
