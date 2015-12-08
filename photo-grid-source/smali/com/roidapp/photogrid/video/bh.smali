.class final Lcom/roidapp/photogrid/video/bh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/video/TrackSelector;


# direct methods
.method private constructor <init>(Lcom/roidapp/photogrid/video/TrackSelector;)V
    .locals 0

    .prologue
    .line 1291
    iput-object p1, p0, Lcom/roidapp/photogrid/video/bh;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/photogrid/video/TrackSelector;B)V
    .locals 0

    .prologue
    .line 1291
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/video/bh;-><init>(Lcom/roidapp/photogrid/video/TrackSelector;)V

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .prologue
    .line 1296
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bh;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    check-cast p2, Lcom/roidapp/photogrid/video/k;

    .line 2088
    iget-object v1, p2, Lcom/roidapp/photogrid/video/k;->a:Lcom/roidapp/photogrid/video/MusicPlayerService;

    .line 1296
    invoke-static {v0, v1}, Lcom/roidapp/photogrid/video/TrackSelector;->a(Lcom/roidapp/photogrid/video/TrackSelector;Lcom/roidapp/photogrid/video/MusicPlayerService;)Lcom/roidapp/photogrid/video/MusicPlayerService;

    .line 1297
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bh;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->b(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/bh;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->K(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 1298
    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .prologue
    .line 1302
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bh;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/video/TrackSelector;->a(Lcom/roidapp/photogrid/video/TrackSelector;Lcom/roidapp/photogrid/video/MusicPlayerService;)Lcom/roidapp/photogrid/video/MusicPlayerService;

    .line 1303
    return-void
.end method
