.class final Lkik/android/chat/fragment/v;
.super Lkik/android/c/b$c;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/CameraFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/CameraFragment;)V
    .locals 0

    .prologue
    .line 578
    iput-object p1, p0, Lkik/android/chat/fragment/v;->a:Lkik/android/chat/fragment/CameraFragment;

    invoke-direct {p0}, Lkik/android/c/b$c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 582
    iget-object v0, p0, Lkik/android/chat/fragment/v;->a:Lkik/android/chat/fragment/CameraFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/CameraFragment;->n(Lkik/android/chat/fragment/CameraFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 583
    iget-object v0, p0, Lkik/android/chat/fragment/v;->a:Lkik/android/chat/fragment/CameraFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/CameraFragment;->o(Lkik/android/chat/fragment/CameraFragment;)V

    .line 585
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/v;->a:Lkik/android/chat/fragment/CameraFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/CameraFragment;->p(Lkik/android/chat/fragment/CameraFragment;)V

    .line 586
    return-void
.end method
