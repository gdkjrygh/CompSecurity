.class final Ljp/co/cyberagent/android/a/ak;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/graphics/Bitmap;

.field final synthetic b:Ljp/co/cyberagent/android/a/aj;


# direct methods
.method constructor <init>(Ljp/co/cyberagent/android/a/aj;Landroid/graphics/Bitmap;)V
    .locals 0

    .prologue
    .line 81
    iput-object p1, p0, Ljp/co/cyberagent/android/a/ak;->b:Ljp/co/cyberagent/android/a/aj;

    iput-object p2, p0, Ljp/co/cyberagent/android/a/ak;->a:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    const/4 v3, -0x1

    .line 83
    iget-object v0, p0, Ljp/co/cyberagent/android/a/ak;->b:Ljp/co/cyberagent/android/a/aj;

    iget v0, v0, Ljp/co/cyberagent/android/a/aj;->B:I

    if-ne v0, v3, :cond_0

    .line 84
    iget-object v0, p0, Ljp/co/cyberagent/android/a/ak;->a:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljp/co/cyberagent/android/a/ak;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 90
    :cond_0
    :goto_0
    return-void

    .line 87
    :cond_1
    const v0, 0x84c3

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 88
    iget-object v0, p0, Ljp/co/cyberagent/android/a/ak;->b:Ljp/co/cyberagent/android/a/aj;

    iget-object v1, p0, Ljp/co/cyberagent/android/a/ak;->a:Landroid/graphics/Bitmap;

    const/4 v2, 0x0

    invoke-static {v1, v3, v2}, Ljp/co/cyberagent/android/gpuimage/OpenGlUtils;->loadTexture(Landroid/graphics/Bitmap;IZ)I

    move-result v1

    iput v1, v0, Ljp/co/cyberagent/android/a/aj;->B:I

    goto :goto_0
.end method
