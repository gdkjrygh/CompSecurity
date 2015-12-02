.class Lcom/facebook/orca/chatheads/aa;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "ChatHeadTextBubbleView.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/v;

.field private b:Z


# direct methods
.method private constructor <init>(Lcom/facebook/orca/chatheads/v;)V
    .locals 0

    .prologue
    .line 311
    iput-object p1, p0, Lcom/facebook/orca/chatheads/aa;->a:Lcom/facebook/orca/chatheads/v;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/chatheads/v;Lcom/facebook/orca/chatheads/w;)V
    .locals 0

    .prologue
    .line 311
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/aa;-><init>(Lcom/facebook/orca/chatheads/v;)V

    return-void
.end method


# virtual methods
.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 320
    iget-object v0, p0, Lcom/facebook/orca/chatheads/aa;->a:Lcom/facebook/orca/chatheads/v;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/v;->c(Lcom/facebook/orca/chatheads/v;)V

    .line 322
    iput-boolean v3, p0, Lcom/facebook/orca/chatheads/aa;->b:Z

    .line 323
    iget-object v0, p0, Lcom/facebook/orca/chatheads/aa;->a:Lcom/facebook/orca/chatheads/v;

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    invoke-static {v0, v1, v2}, Lcom/facebook/orca/chatheads/v;->a(Lcom/facebook/orca/chatheads/v;D)Lcom/google/common/d/a/s;

    .line 324
    return v3
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 3

    .prologue
    .line 329
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/aa;->b:Z

    if-nez v0, :cond_0

    .line 330
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/aa;->b:Z

    .line 331
    iget-object v0, p0, Lcom/facebook/orca/chatheads/aa;->a:Lcom/facebook/orca/chatheads/v;

    const-wide/16 v1, 0x0

    invoke-static {v0, v1, v2}, Lcom/facebook/orca/chatheads/v;->a(Lcom/facebook/orca/chatheads/v;D)Lcom/google/common/d/a/s;

    .line 333
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
