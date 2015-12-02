.class Lcom/facebook/orca/threadview/be;
.super Ljava/lang/Object;
.source "ThreadViewAudioAttachmentView.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Landroid/net/Uri;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/d/a/s;

.field final synthetic b:Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;Lcom/google/common/d/a/s;)V
    .locals 0

    .prologue
    .line 346
    iput-object p1, p0, Lcom/facebook/orca/threadview/be;->b:Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;

    iput-object p2, p0, Lcom/facebook/orca/threadview/be;->a:Lcom/google/common/d/a/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)V
    .locals 2

    .prologue
    .line 349
    iget-object v0, p0, Lcom/facebook/orca/threadview/be;->a:Lcom/google/common/d/a/s;

    iget-object v1, p0, Lcom/facebook/orca/threadview/be;->b:Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;

    invoke-static {v1}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->d(Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;)Lcom/google/common/d/a/s;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 354
    :goto_0
    return-void

    .line 352
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/be;->b:Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;

    invoke-static {v0, p1}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->a(Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;Landroid/net/Uri;)V

    .line 353
    iget-object v0, p0, Lcom/facebook/orca/threadview/be;->b:Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->a()V

    goto :goto_0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 346
    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/threadview/be;->a(Landroid/net/Uri;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 4

    .prologue
    .line 358
    iget-object v0, p0, Lcom/facebook/orca/threadview/be;->a:Lcom/google/common/d/a/s;

    iget-object v1, p0, Lcom/facebook/orca/threadview/be;->b:Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;

    invoke-static {v1}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->d(Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;)Lcom/google/common/d/a/s;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 370
    :goto_0
    return-void

    .line 361
    :cond_0
    invoke-static {}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->d()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "downloading audio failed!"

    invoke-static {v0, v1, p1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 362
    iget-object v0, p0, Lcom/facebook/orca/threadview/be;->b:Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->e(Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;)Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->setIsLoading(Z)V

    .line 364
    iget-object v0, p0, Lcom/facebook/orca/threadview/be;->b:Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->e(Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;)Lcom/facebook/orca/attachments/AudioPlayerBubbleView;

    move-result-object v0

    const-string v1, "error"

    invoke-virtual {v0, v1}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->setTimerText(Ljava/lang/String;)V

    .line 365
    iget-object v0, p0, Lcom/facebook/orca/threadview/be;->b:Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;

    sget-object v1, Lcom/facebook/orca/threadview/bh;->ERROR:Lcom/facebook/orca/threadview/bh;

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->a(Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;Lcom/facebook/orca/threadview/bh;)Lcom/facebook/orca/threadview/bh;

    .line 366
    iget-object v0, p0, Lcom/facebook/orca/threadview/be;->b:Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->f(Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;)Lcom/facebook/analytics/av;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "audio_clips_download_error"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "error_message"

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "audio_clips"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    goto :goto_0
.end method
