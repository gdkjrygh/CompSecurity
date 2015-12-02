.class Lcom/facebook/orca/d/al;
.super Ljava/lang/Object;
.source "AudioRecorder.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/Runnable;

.field final synthetic b:Lcom/facebook/orca/d/af;


# direct methods
.method constructor <init>(Lcom/facebook/orca/d/af;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 268
    iput-object p1, p0, Lcom/facebook/orca/d/al;->b:Lcom/facebook/orca/d/af;

    iput-object p2, p0, Lcom/facebook/orca/d/al;->a:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 271
    iget-object v0, p0, Lcom/facebook/orca/d/al;->b:Lcom/facebook/orca/d/af;

    invoke-static {v0}, Lcom/facebook/orca/d/af;->e(Lcom/facebook/orca/d/af;)V

    .line 272
    iget-object v0, p0, Lcom/facebook/orca/d/al;->a:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 273
    iget-object v0, p0, Lcom/facebook/orca/d/al;->b:Lcom/facebook/orca/d/af;

    invoke-static {v0}, Lcom/facebook/orca/d/af;->f(Lcom/facebook/orca/d/af;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/d/al;->a:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 275
    :cond_0
    return-void
.end method
