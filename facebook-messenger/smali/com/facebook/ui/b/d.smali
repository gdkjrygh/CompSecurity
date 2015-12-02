.class public Lcom/facebook/ui/b/d;
.super Ljava/lang/Object;
.source "ChoreographerWrapper.java"


# static fields
.field private static a:Z


# instance fields
.field private b:Landroid/os/Handler;

.field private c:Landroid/view/Choreographer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 16
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/facebook/ui/b/d;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    sget-boolean v0, Lcom/facebook/ui/b/d;->a:Z

    if-eqz v0, :cond_0

    .line 25
    invoke-direct {p0}, Lcom/facebook/ui/b/d;->a()Landroid/view/Choreographer;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/b/d;->c:Landroid/view/Choreographer;

    .line 29
    :goto_0
    return-void

    .line 27
    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/facebook/ui/b/d;->b:Landroid/os/Handler;

    goto :goto_0
.end method

.method private a()Landroid/view/Choreographer;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .prologue
    .line 57
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v0

    return-object v0
.end method

.method private a(Landroid/view/Choreographer$FrameCallback;)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .prologue
    .line 62
    iget-object v0, p0, Lcom/facebook/ui/b/d;->c:Landroid/view/Choreographer;

    invoke-virtual {v0, p1}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 63
    return-void
.end method

.method private b(Landroid/view/Choreographer$FrameCallback;)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .prologue
    .line 74
    iget-object v0, p0, Lcom/facebook/ui/b/d;->c:Landroid/view/Choreographer;

    invoke-virtual {v0, p1}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 75
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/ui/b/e;)V
    .locals 4

    .prologue
    .line 32
    sget-boolean v0, Lcom/facebook/ui/b/d;->a:Z

    if-eqz v0, :cond_0

    .line 33
    invoke-virtual {p1}, Lcom/facebook/ui/b/e;->a()Landroid/view/Choreographer$FrameCallback;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/ui/b/d;->a(Landroid/view/Choreographer$FrameCallback;)V

    .line 37
    :goto_0
    return-void

    .line 35
    :cond_0
    iget-object v0, p0, Lcom/facebook/ui/b/d;->b:Landroid/os/Handler;

    invoke-virtual {p1}, Lcom/facebook/ui/b/e;->b()Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method public b(Lcom/facebook/ui/b/e;)V
    .locals 2

    .prologue
    .line 48
    sget-boolean v0, Lcom/facebook/ui/b/d;->a:Z

    if-eqz v0, :cond_0

    .line 49
    invoke-virtual {p1}, Lcom/facebook/ui/b/e;->a()Landroid/view/Choreographer$FrameCallback;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/ui/b/d;->b(Landroid/view/Choreographer$FrameCallback;)V

    .line 53
    :goto_0
    return-void

    .line 51
    :cond_0
    iget-object v0, p0, Lcom/facebook/ui/b/d;->b:Landroid/os/Handler;

    invoke-virtual {p1}, Lcom/facebook/ui/b/e;->b()Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    goto :goto_0
.end method
