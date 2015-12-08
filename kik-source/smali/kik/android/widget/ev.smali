.class final Lkik/android/widget/ev;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/widget/eu;


# direct methods
.method constructor <init>(Lkik/android/widget/eu;)V
    .locals 0

    .prologue
    .line 385
    iput-object p1, p0, Lkik/android/widget/ev;->a:Lkik/android/widget/eu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 392
    iget-object v0, p0, Lkik/android/widget/ev;->a:Lkik/android/widget/eu;

    iget-object v0, v0, Lkik/android/widget/eu;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->i(Lkik/android/widget/WebVideoView;)Landroid/media/MediaPlayer$OnCompletionListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 393
    iget-object v0, p0, Lkik/android/widget/ev;->a:Lkik/android/widget/eu;

    iget-object v0, v0, Lkik/android/widget/eu;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->i(Lkik/android/widget/WebVideoView;)Landroid/media/MediaPlayer$OnCompletionListener;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/ev;->a:Lkik/android/widget/eu;

    iget-object v1, v1, Lkik/android/widget/eu;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v1}, Lkik/android/widget/WebVideoView;->g(Lkik/android/widget/WebVideoView;)Landroid/media/MediaPlayer;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/media/MediaPlayer$OnCompletionListener;->onCompletion(Landroid/media/MediaPlayer;)V

    .line 395
    :cond_0
    return-void
.end method
