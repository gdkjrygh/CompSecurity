.class final Lcom/kik/view/adapters/bt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;


# instance fields
.field final synthetic a:Lcom/kik/view/adapters/bf$b;

.field final synthetic b:Lkik/a/d/s;

.field final synthetic c:Lkik/a/d/a/a;

.field final synthetic d:J

.field final synthetic e:Z

.field final synthetic f:Landroid/view/TextureView;

.field final synthetic g:Lcom/kik/view/adapters/bf;


# direct methods
.method constructor <init>(Lcom/kik/view/adapters/bf;Lcom/kik/view/adapters/bf$b;Lkik/a/d/s;Lkik/a/d/a/a;JZLandroid/view/TextureView;)V
    .locals 1

    .prologue
    .line 401
    iput-object p1, p0, Lcom/kik/view/adapters/bt;->g:Lcom/kik/view/adapters/bf;

    iput-object p2, p0, Lcom/kik/view/adapters/bt;->a:Lcom/kik/view/adapters/bf$b;

    iput-object p3, p0, Lcom/kik/view/adapters/bt;->b:Lkik/a/d/s;

    iput-object p4, p0, Lcom/kik/view/adapters/bt;->c:Lkik/a/d/a/a;

    iput-wide p5, p0, Lcom/kik/view/adapters/bt;->d:J

    iput-boolean p7, p0, Lcom/kik/view/adapters/bt;->e:Z

    iput-object p8, p0, Lcom/kik/view/adapters/bt;->f:Landroid/view/TextureView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPrepared(Landroid/media/MediaPlayer;)V
    .locals 8

    .prologue
    const/4 v4, 0x1

    const-wide v6, 0x408f400000000000L    # 1000.0

    const/4 v3, 0x0

    .line 405
    iget-object v0, p0, Lcom/kik/view/adapters/bt;->a:Lcom/kik/view/adapters/bf$b;

    check-cast v0, Lcom/kik/view/adapters/bf$b;

    iget-object v0, v0, Lcom/kik/view/adapters/bf$b;->w:Lkik/android/widget/ProgressWheel;

    .line 406
    if-eqz v0, :cond_0

    .line 407
    invoke-virtual {v0}, Lkik/android/widget/ProgressWheel;->a()V

    .line 409
    :cond_0
    iget-object v0, p0, Lcom/kik/view/adapters/bt;->g:Lcom/kik/view/adapters/bf;

    iget-object v1, p0, Lcom/kik/view/adapters/bt;->a:Lcom/kik/view/adapters/bf$b;

    iget-object v2, p0, Lcom/kik/view/adapters/bt;->b:Lkik/a/d/s;

    invoke-virtual {v0, v1, v2}, Lcom/kik/view/adapters/bf;->a(Lcom/kik/view/adapters/bf$b;Lkik/a/d/s;)V

    .line 411
    iget-object v0, p0, Lcom/kik/view/adapters/bt;->c:Lkik/a/d/a/a;

    invoke-virtual {v0}, Lkik/a/d/a/a;->A()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 412
    invoke-virtual {p1, v3, v3}, Landroid/media/MediaPlayer;->setVolume(FF)V

    .line 423
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/kik/view/adapters/bt;->g:Lcom/kik/view/adapters/bf;

    iget-object v0, v0, Lcom/kik/view/adapters/bf;->e:Lcom/kik/android/a;

    const-string v1, "Video Playback Begin"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "App ID"

    iget-object v2, p0, Lcom/kik/view/adapters/bt;->c:Lkik/a/d/a/a;

    invoke-virtual {v2}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Is Inline"

    invoke-virtual {v0, v1, v4}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Loading Duration"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/kik/view/adapters/bt;->d:J

    sub-long/2addr v2, v4

    long-to-double v2, v2

    div-double/2addr v2, v6

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;D)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Video Length"

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v2

    int-to-double v2, v2

    div-double/2addr v2, v6

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;D)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Was Cached"

    iget-boolean v2, p0, Lcom/kik/view/adapters/bt;->e:Z

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Autoplay"

    iget-object v2, p0, Lcom/kik/view/adapters/bt;->c:Lkik/a/d/a/a;

    invoke-virtual {v2}, Lkik/a/d/a/a;->y()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Looping"

    iget-object v2, p0, Lcom/kik/view/adapters/bt;->c:Lkik/a/d/a/a;

    invoke-virtual {v2}, Lkik/a/d/a/a;->z()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Muted"

    iget-object v2, p0, Lcom/kik/view/adapters/bt;->c:Lkik/a/d/a/a;

    invoke-virtual {v2}, Lkik/a/d/a/a;->A()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Did Autoplay"

    iget-object v2, p0, Lcom/kik/view/adapters/bt;->a:Lcom/kik/view/adapters/bf$b;

    iget-boolean v2, v2, Lcom/kik/view/adapters/bf$b;->z:Z

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 435
    iget-object v0, p0, Lcom/kik/view/adapters/bt;->f:Landroid/view/TextureView;

    invoke-virtual {v0}, Landroid/view/TextureView;->bringToFront()V

    .line 436
    iget-object v0, p0, Lcom/kik/view/adapters/bt;->a:Lcom/kik/view/adapters/bf$b;

    iget-object v0, v0, Lcom/kik/view/adapters/bf$b;->u:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->bringToFront()V

    .line 437
    return-void

    .line 416
    :cond_2
    iget-object v0, p0, Lcom/kik/view/adapters/bt;->a:Lcom/kik/view/adapters/bf$b;

    iget-boolean v0, v0, Lcom/kik/view/adapters/bf$b;->z:Z

    if-eqz v0, :cond_1

    .line 418
    new-array v0, v4, [Landroid/view/View;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/kik/view/adapters/bt;->a:Lcom/kik/view/adapters/bf$b;

    iget-object v2, v2, Lcom/kik/view/adapters/bf$b;->u:Landroid/widget/ImageView;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 419
    invoke-virtual {p1, v3, v3}, Landroid/media/MediaPlayer;->setVolume(FF)V

    goto/16 :goto_0
.end method
