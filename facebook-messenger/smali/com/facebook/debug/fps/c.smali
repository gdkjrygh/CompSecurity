.class Lcom/facebook/debug/fps/c;
.super Ljava/lang/Thread;
.source "FPSController.java"


# instance fields
.field volatile a:Z

.field final synthetic b:Lcom/facebook/debug/fps/a;


# direct methods
.method constructor <init>(Lcom/facebook/debug/fps/a;)V
    .locals 1

    .prologue
    .line 246
    iput-object p1, p0, Lcom/facebook/debug/fps/c;->b:Lcom/facebook/debug/fps/a;

    .line 247
    const-string v0, "FPS"

    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 248
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 252
    :cond_0
    :goto_0
    iget-boolean v0, p0, Lcom/facebook/debug/fps/c;->a:Z

    if-nez v0, :cond_1

    .line 254
    const-wide/16 v0, 0xa

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 255
    iget-object v0, p0, Lcom/facebook/debug/fps/c;->b:Lcom/facebook/debug/fps/a;

    invoke-static {v0}, Lcom/facebook/debug/fps/a;->b(Lcom/facebook/debug/fps/a;)Landroid/app/Activity;

    move-result-object v0

    .line 256
    if-eqz v0, :cond_0

    .line 257
    iget-object v1, p0, Lcom/facebook/debug/fps/c;->b:Lcom/facebook/debug/fps/a;

    invoke-static {v1}, Lcom/facebook/debug/fps/a;->f(Lcom/facebook/debug/fps/a;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/debug/fps/i;

    .line 258
    if-eqz v0, :cond_0

    .line 259
    invoke-virtual {v0}, Lcom/facebook/debug/fps/i;->postInvalidate()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 262
    :catch_0
    move-exception v0

    .line 263
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 267
    :cond_1
    return-void
.end method
