.class final Lkik/android/widget/ew;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnBufferingUpdateListener;


# instance fields
.field final synthetic a:Lkik/android/widget/WebVideoView;


# direct methods
.method constructor <init>(Lkik/android/widget/WebVideoView;)V
    .locals 0

    .prologue
    .line 405
    iput-object p1, p0, Lkik/android/widget/ew;->a:Lkik/android/widget/WebVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onBufferingUpdate(Landroid/media/MediaPlayer;I)V
    .locals 1

    .prologue
    .line 408
    if-lez p2, :cond_0

    const/16 v0, 0x64

    if-ge p2, v0, :cond_0

    .line 409
    iget-object v0, p0, Lkik/android/widget/ew;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0, p2}, Lkik/android/widget/WebVideoView;->e(Lkik/android/widget/WebVideoView;I)I

    .line 411
    :cond_0
    return-void
.end method
