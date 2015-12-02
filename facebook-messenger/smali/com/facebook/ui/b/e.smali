.class public abstract Lcom/facebook/ui/b/e;
.super Ljava/lang/Object;
.source "FrameCallbackWrapper.java"


# instance fields
.field private a:Ljava/lang/Runnable;

.field private b:Landroid/view/Choreographer$FrameCallback;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a()Landroid/view/Choreographer$FrameCallback;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .prologue
    .line 21
    iget-object v0, p0, Lcom/facebook/ui/b/e;->b:Landroid/view/Choreographer$FrameCallback;

    if-nez v0, :cond_0

    .line 22
    new-instance v0, Lcom/facebook/ui/b/f;

    invoke-direct {v0, p0}, Lcom/facebook/ui/b/f;-><init>(Lcom/facebook/ui/b/e;)V

    iput-object v0, p0, Lcom/facebook/ui/b/e;->b:Landroid/view/Choreographer$FrameCallback;

    .line 29
    :cond_0
    iget-object v0, p0, Lcom/facebook/ui/b/e;->b:Landroid/view/Choreographer$FrameCallback;

    return-object v0
.end method

.method public abstract a(J)V
.end method

.method b()Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/ui/b/e;->a:Ljava/lang/Runnable;

    if-nez v0, :cond_0

    .line 34
    new-instance v0, Lcom/facebook/ui/b/g;

    invoke-direct {v0, p0}, Lcom/facebook/ui/b/g;-><init>(Lcom/facebook/ui/b/e;)V

    iput-object v0, p0, Lcom/facebook/ui/b/e;->a:Ljava/lang/Runnable;

    .line 41
    :cond_0
    iget-object v0, p0, Lcom/facebook/ui/b/e;->a:Ljava/lang/Runnable;

    return-object v0
.end method
