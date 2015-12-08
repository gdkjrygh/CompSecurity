.class final Lkik/android/scan/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:[B

.field final synthetic b:Landroid/hardware/Camera;

.field final synthetic c:Lkik/android/scan/m;


# direct methods
.method constructor <init>(Lkik/android/scan/m;[BLandroid/hardware/Camera;)V
    .locals 0

    .prologue
    .line 81
    iput-object p1, p0, Lkik/android/scan/n;->c:Lkik/android/scan/m;

    iput-object p2, p0, Lkik/android/scan/n;->a:[B

    iput-object p3, p0, Lkik/android/scan/n;->b:Landroid/hardware/Camera;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 87
    :try_start_0
    iget-object v0, p0, Lkik/android/scan/n;->c:Lkik/android/scan/m;

    iget-object v0, v0, Lkik/android/scan/m;->a:Lkik/android/scan/k;

    iget-object v1, p0, Lkik/android/scan/n;->a:[B

    iget-object v2, p0, Lkik/android/scan/n;->b:Landroid/hardware/Camera;

    invoke-static {v0, v1, v2}, Lkik/android/scan/k;->a(Lkik/android/scan/k;[BLandroid/hardware/Camera;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    :goto_0
    iget-object v0, p0, Lkik/android/scan/n;->c:Lkik/android/scan/m;

    iget-object v0, v0, Lkik/android/scan/m;->a:Lkik/android/scan/k;

    invoke-static {v0}, Lkik/android/scan/k;->b(Lkik/android/scan/k;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 95
    iget-object v0, p0, Lkik/android/scan/n;->b:Landroid/hardware/Camera;

    iget-object v1, p0, Lkik/android/scan/n;->a:[B

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->addCallbackBuffer([B)V

    .line 97
    :cond_0
    return-void

    .line 89
    :catch_0
    move-exception v0

    .line 90
    invoke-static {}, Lkik/android/scan/k;->f()Lorg/c/b;

    move-result-object v1

    const-string v2, "Unexpected error in decode thread"

    invoke-interface {v1, v2, v0}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
