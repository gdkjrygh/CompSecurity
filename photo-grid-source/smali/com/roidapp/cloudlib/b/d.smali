.class final Lcom/roidapp/cloudlib/b/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/roidapp/cloudlib/b/a;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/b/a;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 252
    iput-object p1, p0, Lcom/roidapp/cloudlib/b/d;->b:Lcom/roidapp/cloudlib/b/a;

    iput-object p2, p0, Lcom/roidapp/cloudlib/b/d;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 255
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/d;->a:Ljava/lang/String;

    .line 256
    iget-object v1, p0, Lcom/roidapp/cloudlib/b/d;->b:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v1}, Lcom/roidapp/cloudlib/b/a;->a(Lcom/roidapp/cloudlib/b/a;)I

    move-result v1

    .line 258
    const-wide/16 v2, 0x1f4

    :try_start_0
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V

    .line 259
    iget-object v2, p0, Lcom/roidapp/cloudlib/b/d;->b:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v2}, Lcom/roidapp/cloudlib/b/a;->m(Lcom/roidapp/cloudlib/b/a;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 263
    :goto_0
    return-void

    .line 261
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0
.end method
