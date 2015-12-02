.class Lcom/facebook/orca/threadview/dr;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "ZoomOverlay.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/dq;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/dq;)V
    .locals 0

    .prologue
    .line 22
    iput-object p1, p0, Lcom/facebook/orca/threadview/dr;->a:Lcom/facebook/orca/threadview/dq;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/facebook/orca/threadview/dr;->a:Lcom/facebook/orca/threadview/dq;

    invoke-static {v0, p1}, Lcom/facebook/orca/threadview/dq;->a(Lcom/facebook/orca/threadview/dq;Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method
