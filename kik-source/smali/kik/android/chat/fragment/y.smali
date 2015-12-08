.class final Lkik/android/chat/fragment/y;
.super Lkik/android/c/c;
.source "SourceFile"


# instance fields
.field final synthetic f:Lkik/android/chat/fragment/CameraFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/CameraFragment;Landroid/view/SurfaceView;Landroid/os/Handler;Lkik/android/c/b$c;)V
    .locals 0

    .prologue
    .line 607
    iput-object p1, p0, Lkik/android/chat/fragment/y;->f:Lkik/android/chat/fragment/CameraFragment;

    invoke-direct {p0, p2, p3, p4}, Lkik/android/c/c;-><init>(Landroid/view/SurfaceView;Landroid/os/Handler;Lkik/android/c/b$c;)V

    return-void
.end method


# virtual methods
.method public final surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 1

    .prologue
    .line 611
    iget-object v0, p0, Lkik/android/chat/fragment/y;->f:Lkik/android/chat/fragment/CameraFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/CameraFragment;->q(Lkik/android/chat/fragment/CameraFragment;)Landroid/view/View$OnTouchListener;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/y;->a(Landroid/view/View$OnTouchListener;)Lkik/android/c/b;

    .line 612
    invoke-super {p0, p1}, Lkik/android/c/c;->surfaceCreated(Landroid/view/SurfaceHolder;)V

    .line 613
    return-void
.end method
