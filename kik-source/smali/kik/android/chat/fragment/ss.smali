.class final Lkik/android/chat/fragment/ss;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# instance fields
.field final synthetic a:Lkik/a/d/a/a;

.field final synthetic b:Lkik/android/chat/fragment/ViewPictureFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ViewPictureFragment;Lkik/a/d/a/a;)V
    .locals 0

    .prologue
    .line 843
    iput-object p1, p0, Lkik/android/chat/fragment/ss;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/ss;->a:Lkik/a/d/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCompletion(Landroid/media/MediaPlayer;)V
    .locals 1

    .prologue
    .line 847
    iget-object v0, p0, Lkik/android/chat/fragment/ss;->a:Lkik/a/d/a/a;

    invoke-virtual {v0}, Lkik/a/d/a/a;->z()Z

    move-result v0

    if-nez v0, :cond_0

    .line 848
    iget-object v0, p0, Lkik/android/chat/fragment/ss;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ViewPictureFragment;->v(Lkik/android/chat/fragment/ViewPictureFragment;)V

    .line 850
    :cond_0
    return-void
.end method
