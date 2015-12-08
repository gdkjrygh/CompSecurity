.class final Lkik/android/chat/fragment/w;
.super Lkik/android/c/e;
.source "SourceFile"


# instance fields
.field final synthetic f:Lkik/android/chat/fragment/CameraFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/CameraFragment;Landroid/view/TextureView;Lkik/android/c/b$c;)V
    .locals 0

    .prologue
    .line 587
    iput-object p1, p0, Lkik/android/chat/fragment/w;->f:Lkik/android/chat/fragment/CameraFragment;

    invoke-direct {p0, p2, p3}, Lkik/android/c/e;-><init>(Landroid/view/TextureView;Lkik/android/c/b$c;)V

    return-void
.end method


# virtual methods
.method public final onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 1

    .prologue
    .line 591
    iget-object v0, p0, Lkik/android/chat/fragment/w;->f:Lkik/android/chat/fragment/CameraFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/CameraFragment;->q(Lkik/android/chat/fragment/CameraFragment;)Landroid/view/View$OnTouchListener;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/w;->a(Landroid/view/View$OnTouchListener;)Lkik/android/c/b;

    .line 592
    invoke-super {p0, p1, p2, p3}, Lkik/android/c/e;->onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V

    .line 593
    return-void
.end method
