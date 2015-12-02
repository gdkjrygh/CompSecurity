.class Lcom/qihoo/security/a/a/a$1;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/a/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/a/a/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/a/a/a;)V
    .locals 0

    .prologue
    .line 117
    iput-object p1, p0, Lcom/qihoo/security/a/a/a$1;->a:Lcom/qihoo/security/a/a/a;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .prologue
    .line 120
    iget-object v0, p0, Lcom/qihoo/security/a/a/a$1;->a:Lcom/qihoo/security/a/a/a;

    invoke-static {v0}, Lcom/qihoo/security/a/a/a;->a(Lcom/qihoo/security/a/a/a;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 132
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/a/a/a$1;->a:Lcom/qihoo/security/a/a/a;

    invoke-static {v0}, Lcom/qihoo/security/a/a/a;->b(Lcom/qihoo/security/a/a/a;)Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 133
    iget-object v0, p0, Lcom/qihoo/security/a/a/a$1;->a:Lcom/qihoo/security/a/a/a;

    invoke-static {v0}, Lcom/qihoo/security/a/a/a;->c(Lcom/qihoo/security/a/a/a;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/a/a/a$1;->a:Lcom/qihoo/security/a/a/a;

    invoke-static {v1}, Lcom/qihoo/security/a/a/a;->c(Lcom/qihoo/security/a/a/a;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/a/a/a$1;->a:Lcom/qihoo/security/a/a/a;

    invoke-static {v2}, Lcom/qihoo/security/a/a/a;->d(Lcom/qihoo/security/a/a/a;)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 135
    :cond_0
    return-void

    .line 122
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/a/a/a$1;->a:Lcom/qihoo/security/a/a/a;

    iget-object v1, p0, Lcom/qihoo/security/a/a/a$1;->a:Lcom/qihoo/security/a/a/a;

    invoke-static {v1}, Lcom/qihoo/security/a/a/a;->b(Lcom/qihoo/security/a/a/a;)Ljava/util/concurrent/BlockingQueue;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/a/a/a;->a(Lcom/qihoo/security/a/a/a;Ljava/util/concurrent/BlockingQueue;)V

    goto :goto_0

    .line 125
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/a/a/a$1;->a:Lcom/qihoo/security/a/a/a;

    iget-object v1, p0, Lcom/qihoo/security/a/a/a$1;->a:Lcom/qihoo/security/a/a/a;

    invoke-static {v1}, Lcom/qihoo/security/a/a/a;->b(Lcom/qihoo/security/a/a/a;)Ljava/util/concurrent/BlockingQueue;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/a/a/a$1;->a:Lcom/qihoo/security/a/a/a;

    invoke-static {v2}, Lcom/qihoo/security/a/a/a;->b(Lcom/qihoo/security/a/a/a;)Ljava/util/concurrent/BlockingQueue;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/a/a/a;->a(Lcom/qihoo/security/a/a/a;Ljava/util/concurrent/BlockingQueue;I)V

    goto :goto_0

    .line 128
    :pswitch_2
    iget-object v0, p0, Lcom/qihoo/security/a/a/a$1;->a:Lcom/qihoo/security/a/a/a;

    iget-object v1, p0, Lcom/qihoo/security/a/a/a$1;->a:Lcom/qihoo/security/a/a/a;

    invoke-static {v1}, Lcom/qihoo/security/a/a/a;->b(Lcom/qihoo/security/a/a/a;)Ljava/util/concurrent/BlockingQueue;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/a/a/a$1;->a:Lcom/qihoo/security/a/a/a;

    invoke-static {v2}, Lcom/qihoo/security/a/a/a;->b(Lcom/qihoo/security/a/a/a;)Ljava/util/concurrent/BlockingQueue;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/a/a/a;->b(Lcom/qihoo/security/a/a/a;Ljava/util/concurrent/BlockingQueue;I)V

    goto :goto_0

    .line 120
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
