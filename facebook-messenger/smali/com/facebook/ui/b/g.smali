.class Lcom/facebook/ui/b/g;
.super Ljava/lang/Object;
.source "FrameCallbackWrapper.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/ui/b/e;


# direct methods
.method constructor <init>(Lcom/facebook/ui/b/e;)V
    .locals 0

    .prologue
    .line 34
    iput-object p1, p0, Lcom/facebook/ui/b/g;->a:Lcom/facebook/ui/b/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/ui/b/g;->a:Lcom/facebook/ui/b/e;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/ui/b/e;->a(J)V

    .line 38
    return-void
.end method
