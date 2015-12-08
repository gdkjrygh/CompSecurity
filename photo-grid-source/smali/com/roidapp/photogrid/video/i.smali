.class final Lcom/roidapp/photogrid/video/i;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/video/MusicPlayerService;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/MusicPlayerService;)V
    .locals 0

    .prologue
    .line 98
    iput-object p1, p0, Lcom/roidapp/photogrid/video/i;->a:Lcom/roidapp/photogrid/video/MusicPlayerService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .prologue
    const/4 v2, 0x2

    const/4 v3, 0x1

    .line 103
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MusicPlayerService.PlayMusic"

    if-ne v0, v1, :cond_2

    .line 105
    const-string v0, "MusicPlayerService.Source"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 106
    iget-object v1, p0, Lcom/roidapp/photogrid/video/i;->a:Lcom/roidapp/photogrid/video/MusicPlayerService;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/MusicPlayerService;->a(Lcom/roidapp/photogrid/video/MusicPlayerService;)Landroid/os/Handler;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 107
    iget-object v1, p0, Lcom/roidapp/photogrid/video/i;->a:Lcom/roidapp/photogrid/video/MusicPlayerService;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/MusicPlayerService;->a(Lcom/roidapp/photogrid/video/MusicPlayerService;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 108
    iget-object v1, p0, Lcom/roidapp/photogrid/video/i;->a:Lcom/roidapp/photogrid/video/MusicPlayerService;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/MusicPlayerService;->a(Lcom/roidapp/photogrid/video/MusicPlayerService;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 109
    iget-object v1, p0, Lcom/roidapp/photogrid/video/i;->a:Lcom/roidapp/photogrid/video/MusicPlayerService;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/MusicPlayerService;->a(Lcom/roidapp/photogrid/video/MusicPlayerService;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/video/i;->a:Lcom/roidapp/photogrid/video/MusicPlayerService;

    invoke-static {v2}, Lcom/roidapp/photogrid/video/MusicPlayerService;->a(Lcom/roidapp/photogrid/video/MusicPlayerService;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v3, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 124
    :cond_0
    :goto_0
    return-void

    .line 111
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/video/i;->a:Lcom/roidapp/photogrid/video/MusicPlayerService;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/video/MusicPlayerService;->a(Lcom/roidapp/photogrid/video/MusicPlayerService;Ljava/lang/String;)V

    goto :goto_0

    .line 114
    :cond_2
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MusicPlayerService.StopMusic"

    if-ne v0, v1, :cond_0

    .line 116
    iget-object v0, p0, Lcom/roidapp/photogrid/video/i;->a:Lcom/roidapp/photogrid/video/MusicPlayerService;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/MusicPlayerService;->a(Lcom/roidapp/photogrid/video/MusicPlayerService;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 117
    iget-object v0, p0, Lcom/roidapp/photogrid/video/i;->a:Lcom/roidapp/photogrid/video/MusicPlayerService;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/MusicPlayerService;->a(Lcom/roidapp/photogrid/video/MusicPlayerService;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 118
    iget-object v0, p0, Lcom/roidapp/photogrid/video/i;->a:Lcom/roidapp/photogrid/video/MusicPlayerService;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/MusicPlayerService;->a(Lcom/roidapp/photogrid/video/MusicPlayerService;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 119
    iget-object v0, p0, Lcom/roidapp/photogrid/video/i;->a:Lcom/roidapp/photogrid/video/MusicPlayerService;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/MusicPlayerService;->a(Lcom/roidapp/photogrid/video/MusicPlayerService;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/i;->a:Lcom/roidapp/photogrid/video/MusicPlayerService;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/MusicPlayerService;->a(Lcom/roidapp/photogrid/video/MusicPlayerService;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 121
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/video/i;->a:Lcom/roidapp/photogrid/video/MusicPlayerService;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/MusicPlayerService;->b(Lcom/roidapp/photogrid/video/MusicPlayerService;)V

    goto :goto_0
.end method
