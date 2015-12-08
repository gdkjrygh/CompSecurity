.class final Lkik/android/chat/fragment/sp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnErrorListener;


# instance fields
.field final synthetic a:Lkik/a/d/a/a;

.field final synthetic b:Lkik/android/chat/fragment/ViewPictureFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ViewPictureFragment;Lkik/a/d/a/a;)V
    .locals 0

    .prologue
    .line 801
    iput-object p1, p0, Lkik/android/chat/fragment/sp;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/sp;->a:Lkik/a/d/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onError(Landroid/media/MediaPlayer;II)Z
    .locals 2

    .prologue
    .line 806
    iget-object v0, p0, Lkik/android/chat/fragment/sp;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/ViewPictureFragment;->j:Lcom/kik/l/ab;

    iget-object v1, p0, Lkik/android/chat/fragment/sp;->a:Lkik/a/d/a/a;

    invoke-virtual {v1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/kik/l/ab;->d(Ljava/lang/String;)Z

    .line 807
    iget-object v0, p0, Lkik/android/chat/fragment/sp;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ViewPictureFragment;->h(Lkik/android/chat/fragment/ViewPictureFragment;)V

    .line 808
    const/4 v0, 0x0

    return v0
.end method
