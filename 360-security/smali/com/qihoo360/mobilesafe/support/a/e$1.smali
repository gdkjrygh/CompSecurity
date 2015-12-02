.class Lcom/qihoo360/mobilesafe/support/a/e$1;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/support/a/e;->b(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/mobilesafe/support/a/e;


# direct methods
.method constructor <init>(Lcom/qihoo360/mobilesafe/support/a/e;Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/support/a/e$1;->a:Lcom/qihoo360/mobilesafe/support/a/e;

    .line 82
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .prologue
    .line 84
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/qihoo360/mobilesafe/support/a/e$a;

    .line 85
    iget v1, p1, Landroid/os/Message;->what:I

    packed-switch v1, :pswitch_data_0

    .line 107
    :goto_0
    monitor-enter v0

    .line 108
    const/4 v1, 0x0

    :try_start_0
    iput-boolean v1, v0, Lcom/qihoo360/mobilesafe/support/a/e$a;->d:Z

    .line 109
    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 107
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    :pswitch_0
    return-void

    .line 88
    :pswitch_1
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/e$1;->a:Lcom/qihoo360/mobilesafe/support/a/e;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/support/a/e;->a(Lcom/qihoo360/mobilesafe/support/a/e;)Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/e$1;->a:Lcom/qihoo360/mobilesafe/support/a/e;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/support/a/e;->a(Lcom/qihoo360/mobilesafe/support/a/e;)Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo360/mobilesafe/support/a/c;->a()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/e$1;->a:Lcom/qihoo360/mobilesafe/support/a/e;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/support/a/e;->b(Lcom/qihoo360/mobilesafe/support/a/e;)Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 89
    :cond_1
    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/qihoo360/mobilesafe/support/a/e$a;->c:Z

    goto :goto_0

    .line 91
    :cond_2
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/e$1;->a:Lcom/qihoo360/mobilesafe/support/a/e;

    iget-wide v2, v0, Lcom/qihoo360/mobilesafe/support/a/e$a;->a:J

    invoke-static {v1, v2, v3}, Lcom/qihoo360/mobilesafe/support/a/e;->a(Lcom/qihoo360/mobilesafe/support/a/e;J)Z

    move-result v1

    iput-boolean v1, v0, Lcom/qihoo360/mobilesafe/support/a/e$a;->c:Z

    goto :goto_0

    .line 95
    :pswitch_2
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/e$1;->a:Lcom/qihoo360/mobilesafe/support/a/e;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/support/a/e;->c(Lcom/qihoo360/mobilesafe/support/a/e;)Z

    move-result v1

    iput-boolean v1, v0, Lcom/qihoo360/mobilesafe/support/a/e$a;->c:Z

    goto :goto_0

    .line 98
    :pswitch_3
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/e$1;->a:Lcom/qihoo360/mobilesafe/support/a/e;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/support/a/e;->d(Lcom/qihoo360/mobilesafe/support/a/e;)Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v1

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/support/a/c;->a(Lcom/qihoo360/mobilesafe/support/a/c;)Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo360/mobilesafe/support/a/e$a;->b:Lcom/qihoo360/mobilesafe/support/a/c;

    goto :goto_0

    .line 101
    :pswitch_4
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/e$1;->a:Lcom/qihoo360/mobilesafe/support/a/e;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/support/a/e;->e(Lcom/qihoo360/mobilesafe/support/a/e;)Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v1

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/support/a/c;->a(Lcom/qihoo360/mobilesafe/support/a/c;)Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo360/mobilesafe/support/a/e$a;->b:Lcom/qihoo360/mobilesafe/support/a/c;

    goto :goto_0

    .line 107
    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    .line 85
    nop

    :pswitch_data_0
    .packed-switch 0xc8
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_0
    .end packed-switch
.end method
