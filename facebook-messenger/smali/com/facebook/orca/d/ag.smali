.class Lcom/facebook/orca/d/ag;
.super Ljava/lang/Object;
.source "AudioRecorder.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/d/af;


# direct methods
.method constructor <init>(Lcom/facebook/orca/d/af;)V
    .locals 0

    .prologue
    .line 124
    iput-object p1, p0, Lcom/facebook/orca/d/ag;->a:Lcom/facebook/orca/d/af;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 127
    iget-object v0, p0, Lcom/facebook/orca/d/ag;->a:Lcom/facebook/orca/d/af;

    invoke-static {v0}, Lcom/facebook/orca/d/af;->a(Lcom/facebook/orca/d/af;)Lcom/facebook/common/executors/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 128
    iget-object v0, p0, Lcom/facebook/orca/d/ag;->a:Lcom/facebook/orca/d/af;

    new-instance v1, Lcom/facebook/orca/d/ah;

    invoke-direct {v1, p0}, Lcom/facebook/orca/d/ah;-><init>(Lcom/facebook/orca/d/ag;)V

    invoke-static {v0, v1}, Lcom/facebook/orca/d/af;->a(Lcom/facebook/orca/d/af;Ljava/lang/Runnable;)V

    .line 136
    return-void
.end method
