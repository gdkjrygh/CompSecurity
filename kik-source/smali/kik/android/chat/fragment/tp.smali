.class final Lkik/android/chat/fragment/tp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/WebVideoFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/WebVideoFragment;)V
    .locals 0

    .prologue
    .line 74
    iput-object p1, p0, Lkik/android/chat/fragment/tp;->a:Lkik/android/chat/fragment/WebVideoFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCompletion(Landroid/media/MediaPlayer;)V
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lkik/android/chat/fragment/tp;->a:Lkik/android/chat/fragment/WebVideoFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/WebVideoFragment;->a(Lkik/android/chat/fragment/WebVideoFragment;)Lcom/kik/cards/web/video/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/cards/web/video/b;->t()V

    .line 79
    iget-object v0, p0, Lkik/android/chat/fragment/tp;->a:Lkik/android/chat/fragment/WebVideoFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/WebVideoFragment;->J()V

    .line 80
    iget-object v0, p0, Lkik/android/chat/fragment/tp;->a:Lkik/android/chat/fragment/WebVideoFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/WebVideoFragment;->b(Lkik/android/chat/fragment/WebVideoFragment;)Z

    .line 81
    return-void
.end method
