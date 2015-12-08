.class final Lcom/roidapp/photogrid/video/ay;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/video/TrackSelector;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/TrackSelector;)V
    .locals 0

    .prologue
    .line 1257
    iput-object p1, p0, Lcom/roidapp/photogrid/video/ay;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .prologue
    const/16 v3, 0x4002

    const/16 v2, 0x4001

    .line 1262
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MusicPlayerService.onError"

    if-ne v0, v1, :cond_2

    .line 1263
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ay;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->b(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1264
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ay;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->b(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ay;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->b(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0701c8

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 1265
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ay;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1266
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ay;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ay;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1288
    :cond_1
    :goto_0
    return-void

    .line 1267
    :cond_2
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MusicPlayerServic.onComplete"

    if-ne v0, v1, :cond_3

    .line 1268
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ay;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1269
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ay;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ay;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 1271
    :cond_3
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MusicPlayerService.onInfo"

    if-ne v0, v1, :cond_4

    .line 1272
    const-string v0, "what"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 1273
    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1275
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ay;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1276
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ay;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ay;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0x4004

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 1279
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ay;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1280
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ay;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ay;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 1283
    :cond_4
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MusicPlayerService.onPrepared"

    if-ne v0, v1, :cond_1

    .line 1284
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ay;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1285
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ay;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ay;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_0

    .line 1273
    :pswitch_data_0
    .packed-switch 0x2bd
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
