.class Lcom/facebook/orca/d/am;
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
    .line 300
    iput-object p1, p0, Lcom/facebook/orca/d/am;->a:Lcom/facebook/orca/d/af;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 303
    iget-object v0, p0, Lcom/facebook/orca/d/am;->a:Lcom/facebook/orca/d/af;

    invoke-static {v0}, Lcom/facebook/orca/d/af;->f(Lcom/facebook/orca/d/af;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/d/am;->a:Lcom/facebook/orca/d/af;

    invoke-static {v1}, Lcom/facebook/orca/d/af;->g(Lcom/facebook/orca/d/af;)Ljava/lang/Runnable;

    move-result-object v1

    const-wide/32 v2, 0xea60

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 304
    iget-object v0, p0, Lcom/facebook/orca/d/am;->a:Lcom/facebook/orca/d/af;

    invoke-static {v0}, Lcom/facebook/orca/d/af;->h(Lcom/facebook/orca/d/af;)V

    .line 305
    iget-object v0, p0, Lcom/facebook/orca/d/am;->a:Lcom/facebook/orca/d/af;

    invoke-static {v0}, Lcom/facebook/orca/d/af;->i(Lcom/facebook/orca/d/af;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 307
    iget-object v0, p0, Lcom/facebook/orca/d/am;->a:Lcom/facebook/orca/d/af;

    invoke-static {v0}, Lcom/facebook/orca/d/af;->c(Lcom/facebook/orca/d/af;)Lcom/facebook/orca/d/ao;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/orca/d/ao;->a()V

    .line 309
    :cond_0
    return-void
.end method
