.class final Lkik/android/chat/fragment/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/Camera$AutoFocusCallback;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/CameraFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/CameraFragment;)V
    .locals 0

    .prologue
    .line 394
    iput-object p1, p0, Lkik/android/chat/fragment/t;->a:Lkik/android/chat/fragment/CameraFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAutoFocus(ZLandroid/hardware/Camera;)V
    .locals 2

    .prologue
    .line 398
    if-eqz p1, :cond_0

    .line 399
    iget-object v0, p0, Lkik/android/chat/fragment/t;->a:Lkik/android/chat/fragment/CameraFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/CameraFragment;->f(Lkik/android/chat/fragment/CameraFragment;)V

    .line 401
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/t;->a:Lkik/android/chat/fragment/CameraFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/CameraFragment;->e(Lkik/android/chat/fragment/CameraFragment;)Z

    .line 402
    iget-object v0, p0, Lkik/android/chat/fragment/t;->a:Lkik/android/chat/fragment/CameraFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/CameraFragment;->_touchFocusImage:Landroid/widget/FrameLayout;

    const/16 v1, 0xfa

    invoke-static {v0, v1}, Lkik/android/util/av;->b(Landroid/view/View;I)V

    .line 403
    return-void
.end method
