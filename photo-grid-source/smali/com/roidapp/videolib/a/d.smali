.class final Lcom/roidapp/videolib/a/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field final synthetic a:Lcom/roidapp/videolib/a/b;


# direct methods
.method constructor <init>(Lcom/roidapp/videolib/a/b;)V
    .locals 0

    .prologue
    .line 160
    iput-object p1, p0, Lcom/roidapp/videolib/a/d;->a:Lcom/roidapp/videolib/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 164
    iget-object v0, p0, Lcom/roidapp/videolib/a/d;->a:Lcom/roidapp/videolib/a/b;

    new-instance v2, Landroid/os/Messenger;

    invoke-direct {v2, p2}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    invoke-static {v0, v2}, Lcom/roidapp/videolib/a/b;->a(Lcom/roidapp/videolib/a/b;Landroid/os/Messenger;)Landroid/os/Messenger;

    .line 165
    iget-object v0, p0, Lcom/roidapp/videolib/a/d;->a:Lcom/roidapp/videolib/a/b;

    new-instance v2, Landroid/os/Messenger;

    iget-object v3, p0, Lcom/roidapp/videolib/a/d;->a:Lcom/roidapp/videolib/a/b;

    invoke-static {v3}, Lcom/roidapp/videolib/a/b;->b(Lcom/roidapp/videolib/a/b;)Landroid/os/Handler;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    invoke-static {v0, v2}, Lcom/roidapp/videolib/a/b;->b(Lcom/roidapp/videolib/a/b;Landroid/os/Messenger;)Landroid/os/Messenger;

    .line 167
    const/4 v2, 0x0

    const v3, 0xaa00

    iget-object v0, p0, Lcom/roidapp/videolib/a/d;->a:Lcom/roidapp/videolib/a/b;

    invoke-static {v0}, Lcom/roidapp/videolib/a/b;->g(Lcom/roidapp/videolib/a/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-static {v2, v3, v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 168
    iget-object v1, p0, Lcom/roidapp/videolib/a/d;->a:Lcom/roidapp/videolib/a/b;

    invoke-static {v1}, Lcom/roidapp/videolib/a/b;->h(Lcom/roidapp/videolib/a/b;)Lcom/roidapp/videolib/core/a/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/videolib/core/a/a;->i()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 169
    iget-object v1, p0, Lcom/roidapp/videolib/a/d;->a:Lcom/roidapp/videolib/a/b;

    invoke-static {v1, v0}, Lcom/roidapp/videolib/a/b;->a(Lcom/roidapp/videolib/a/b;Landroid/os/Message;)V

    .line 170
    return-void

    :cond_0
    move v0, v1

    .line 167
    goto :goto_0
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .prologue
    .line 174
    iget-object v0, p0, Lcom/roidapp/videolib/a/d;->a:Lcom/roidapp/videolib/a/b;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/videolib/a/b;->a(Lcom/roidapp/videolib/a/b;Landroid/os/Messenger;)Landroid/os/Messenger;

    .line 175
    return-void
.end method
