.class final Lcom/roidapp/photogrid/video/bd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/photogrid/video/f;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/video/TrackSelector;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/TrackSelector;)V
    .locals 0

    .prologue
    .line 404
    iput-object p1, p0, Lcom/roidapp/photogrid/video/bd;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 407
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bd;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    if-eqz v0, :cond_0

    .line 408
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bd;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/q;->d()I

    move-result v0

    .line 410
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(I)Lcom/roidapp/photogrid/video/onlinemusic/Genre;
    .locals 1

    .prologue
    .line 415
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bd;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    if-eqz v0, :cond_0

    .line 416
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bd;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/video/q;->b(I)Lcom/roidapp/photogrid/video/onlinemusic/Genre;

    move-result-object v0

    .line 418
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 423
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bd;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->f(Lcom/roidapp/photogrid/video/TrackSelector;)I

    move-result v0

    return v0
.end method

.method public final b(I)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;
    .locals 2

    .prologue
    .line 432
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bd;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    if-eqz v0, :cond_0

    .line 433
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bd;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/bd;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->e(Lcom/roidapp/photogrid/video/TrackSelector;)I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lcom/roidapp/photogrid/video/q;->a(II)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    move-result-object v0

    .line 434
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c()Z
    .locals 2

    .prologue
    .line 439
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bd;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    if-eqz v0, :cond_0

    .line 440
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bd;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/bd;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->e(Lcom/roidapp/photogrid/video/TrackSelector;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/q;->a(I)Z

    move-result v0

    .line 441
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final d()Landroid/os/Handler;
    .locals 1

    .prologue
    .line 446
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bd;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->w(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/os/Handler;

    move-result-object v0

    return-object v0
.end method
