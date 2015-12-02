.class Lcom/facebook/orca/common/ui/titlebar/ah;
.super Ljava/lang/Object;
.source "TitleBarDivebarButtonOverlay.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/common/ui/titlebar/ac;


# direct methods
.method constructor <init>(Lcom/facebook/orca/common/ui/titlebar/ac;)V
    .locals 0

    .prologue
    .line 314
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/ah;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 317
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ah;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/common/ui/titlebar/ac;->a(Lcom/facebook/orca/common/ui/titlebar/ac;F)Lcom/google/common/d/a/s;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/common/ui/titlebar/ai;

    invoke-direct {v1, p0}, Lcom/facebook/orca/common/ui/titlebar/ai;-><init>(Lcom/facebook/orca/common/ui/titlebar/ah;)V

    invoke-static {}, Lcom/google/common/d/a/w;->a()Lcom/google/common/d/a/u;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/common/d/a/s;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 326
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ah;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/common/ui/titlebar/ac;->b(Lcom/facebook/orca/common/ui/titlebar/ac;I)I

    .line 327
    return-void
.end method
