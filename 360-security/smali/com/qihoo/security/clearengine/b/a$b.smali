.class Lcom/qihoo/security/clearengine/b/a$b;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/clearengine/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/clearengine/b/a;


# direct methods
.method public constructor <init>(Lcom/qihoo/security/clearengine/b/a;Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 1349
    iput-object p1, p0, Lcom/qihoo/security/clearengine/b/a$b;->a:Lcom/qihoo/security/clearengine/b/a;

    .line 1350
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 1351
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .prologue
    .line 1356
    :try_start_0
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 1392
    :goto_0
    return-void

    .line 1358
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$b;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->k(Lcom/qihoo/security/clearengine/b/a;)V

    .line 1359
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$b;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->l(Lcom/qihoo/security/clearengine/b/a;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1382
    :catch_0
    move-exception v0

    .line 1383
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    .line 1387
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$b;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->b(Lcom/qihoo/security/clearengine/b/a;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 1388
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$b;->a:Lcom/qihoo/security/clearengine/b/a;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/qihoo/security/clearengine/b/a;->a(Lcom/qihoo/security/clearengine/b/a;Z)V

    .line 1389
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$b;->a:Lcom/qihoo/security/clearengine/b/a;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/qihoo/security/clearengine/b/a;->b(Lcom/qihoo/security/clearengine/b/a;Z)V

    .line 1387
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 1362
    :pswitch_1
    :try_start_2
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$b;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->m(Lcom/qihoo/security/clearengine/b/a;)V

    goto :goto_0

    .line 1366
    :pswitch_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    .line 1367
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a$b;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v1, v0}, Lcom/qihoo/security/clearengine/b/a;->a(Lcom/qihoo/security/clearengine/b/a;Ljava/util/List;)V

    goto :goto_0

    .line 1370
    :pswitch_3
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$b;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->n(Lcom/qihoo/security/clearengine/b/a;)V

    goto :goto_0

    .line 1373
    :pswitch_4
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a$b;->a:Lcom/qihoo/security/clearengine/b/a;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/os/IBinder;

    invoke-static {v1, v0}, Lcom/qihoo/security/clearengine/b/a;->a(Lcom/qihoo/security/clearengine/b/a;Landroid/os/IBinder;)V

    goto :goto_0

    .line 1376
    :pswitch_5
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$b;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->o(Lcom/qihoo/security/clearengine/b/a;)V

    goto :goto_0

    .line 1379
    :pswitch_6
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$b;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->p(Lcom/qihoo/security/clearengine/b/a;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    .line 1356
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method
