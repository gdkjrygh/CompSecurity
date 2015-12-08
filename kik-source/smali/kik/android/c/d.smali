.class final Lkik/android/c/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/c/c;


# direct methods
.method constructor <init>(Lkik/android/c/c;)V
    .locals 0

    .prologue
    .line 66
    iput-object p1, p0, Lkik/android/c/d;->a:Lkik/android/c/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 70
    iget-object v0, p0, Lkik/android/c/d;->a:Lkik/android/c/c;

    invoke-static {v0}, Lkik/android/c/c;->a(Lkik/android/c/c;)Landroid/hardware/Camera;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/c/d;->a:Lkik/android/c/c;

    iget-boolean v0, v0, Lkik/android/c/c;->e:Z

    if-nez v0, :cond_1

    .line 102
    :cond_0
    :goto_0
    return-void

    .line 73
    :cond_1
    iget-object v0, p0, Lkik/android/c/d;->a:Lkik/android/c/c;

    invoke-static {v0}, Lkik/android/c/c;->b(Lkik/android/c/c;)Landroid/view/SurfaceView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    .line 74
    if-eqz v0, :cond_0

    .line 88
    :try_start_0
    iget-object v1, p0, Lkik/android/c/d;->a:Lkik/android/c/c;

    invoke-static {v1}, Lkik/android/c/c;->a(Lkik/android/c/c;)Landroid/hardware/Camera;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/hardware/Camera;->setPreviewDisplay(Landroid/view/SurfaceHolder;)V

    .line 89
    iget-object v0, p0, Lkik/android/c/d;->a:Lkik/android/c/c;

    invoke-static {v0}, Lkik/android/c/c;->a(Lkik/android/c/c;)Landroid/hardware/Camera;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V

    .line 90
    iget-object v0, p0, Lkik/android/c/d;->a:Lkik/android/c/c;

    invoke-static {v0}, Lkik/android/c/c;->b(Lkik/android/c/c;)Landroid/view/SurfaceView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/SurfaceView;->requestLayout()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 92
    :catch_0
    move-exception v0

    invoke-static {v0}, Lcom/a/a/a;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 95
    :catch_1
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    .line 98
    iget-object v0, p0, Lkik/android/c/d;->a:Lkik/android/c/c;

    iget-object v0, v0, Lkik/android/c/c;->c:Lkik/android/c/b$b;

    if-eqz v0, :cond_0

    .line 99
    iget-object v0, p0, Lkik/android/c/d;->a:Lkik/android/c/c;

    iget-object v0, v0, Lkik/android/c/c;->c:Lkik/android/c/b$b;

    invoke-virtual {v0}, Lkik/android/c/b$b;->a()V

    goto :goto_0
.end method
