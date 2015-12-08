.class final Lkik/android/chat/fragment/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/Camera$ShutterCallback;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/CameraFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/CameraFragment;)V
    .locals 0

    .prologue
    .line 374
    iput-object p1, p0, Lkik/android/chat/fragment/k;->a:Lkik/android/chat/fragment/CameraFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onShutter()V
    .locals 1

    .prologue
    .line 379
    iget-object v0, p0, Lkik/android/chat/fragment/k;->a:Lkik/android/chat/fragment/CameraFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/CameraFragment;->_cameraCover:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 380
    iget-object v0, p0, Lkik/android/chat/fragment/k;->a:Lkik/android/chat/fragment/CameraFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/CameraFragment;->_cameraCover:Landroid/view/View;

    invoke-static {v0}, Lkik/android/util/av;->a(Landroid/view/View;)V

    .line 382
    :cond_0
    return-void
.end method
