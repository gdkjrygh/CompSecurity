.class final Lcom/kik/cards/web/video/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;


# instance fields
.field final synthetic a:Lcom/kik/cards/web/video/b;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/video/b;)V
    .locals 0

    .prologue
    .line 126
    iput-object p1, p0, Lcom/kik/cards/web/video/d;->a:Lcom/kik/cards/web/video/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPrepared(Landroid/media/MediaPlayer;)V
    .locals 2

    .prologue
    .line 133
    iget-object v0, p0, Lcom/kik/cards/web/video/d;->a:Lcom/kik/cards/web/video/b;

    invoke-static {v0}, Lcom/kik/cards/web/video/b;->a(Lcom/kik/cards/web/video/b;)Lkik/android/chat/fragment/WebVideoFragment;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 134
    iget-object v0, p0, Lcom/kik/cards/web/video/d;->a:Lcom/kik/cards/web/video/b;

    invoke-static {v0}, Lcom/kik/cards/web/video/b;->b(Lcom/kik/cards/web/video/b;)Lkik/android/widget/WebVideoView;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/widget/WebVideoView;->l()V

    .line 135
    iget-object v0, p0, Lcom/kik/cards/web/video/d;->a:Lcom/kik/cards/web/video/b;

    invoke-static {v0}, Lcom/kik/cards/web/video/b;->a(Lcom/kik/cards/web/video/b;)Lkik/android/chat/fragment/WebVideoFragment;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/fragment/WebVideoFragment;->d()V

    .line 136
    iget-object v0, p0, Lcom/kik/cards/web/video/d;->a:Lcom/kik/cards/web/video/b;

    invoke-static {v0}, Lcom/kik/cards/web/video/b;->c(Lcom/kik/cards/web/video/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 137
    iget-object v0, p0, Lcom/kik/cards/web/video/d;->a:Lcom/kik/cards/web/video/b;

    invoke-static {v0}, Lcom/kik/cards/web/video/b;->b(Lcom/kik/cards/web/video/b;)Lkik/android/widget/WebVideoView;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/widget/WebVideoView;->a()V

    .line 138
    iget-object v0, p0, Lcom/kik/cards/web/video/d;->a:Lcom/kik/cards/web/video/b;

    invoke-static {v0}, Lcom/kik/cards/web/video/b;->a(Lcom/kik/cards/web/video/b;)Lkik/android/chat/fragment/WebVideoFragment;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/fragment/WebVideoFragment;->a()V

    .line 141
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/video/d;->a:Lcom/kik/cards/web/video/b;

    invoke-static {v0}, Lcom/kik/cards/web/video/b;->d(Lcom/kik/cards/web/video/b;)Z

    .line 142
    iget-object v0, p0, Lcom/kik/cards/web/video/d;->a:Lcom/kik/cards/web/video/b;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/kik/cards/web/video/b;->a(Lcom/kik/cards/web/video/b;Z)Z

    .line 143
    return-void
.end method
