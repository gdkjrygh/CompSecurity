.class final Lkik/android/scan/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/scan/a;


# direct methods
.method constructor <init>(Lkik/android/scan/a;)V
    .locals 0

    .prologue
    .line 30
    iput-object p1, p0, Lkik/android/scan/b;->a:Lkik/android/scan/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 34
    iget-object v0, p0, Lkik/android/scan/b;->a:Lkik/android/scan/a;

    invoke-static {v0}, Lkik/android/scan/a;->a(Lkik/android/scan/a;)Lorg/c/b;

    .line 35
    iget-object v0, p0, Lkik/android/scan/b;->a:Lkik/android/scan/a;

    invoke-static {v0}, Lkik/android/scan/a;->b(Lkik/android/scan/a;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 36
    iget-object v0, p0, Lkik/android/scan/b;->a:Lkik/android/scan/a;

    invoke-static {v0}, Lkik/android/scan/a;->c(Lkik/android/scan/a;)Landroid/hardware/Camera;

    move-result-object v0

    iget-object v1, p0, Lkik/android/scan/b;->a:Lkik/android/scan/a;

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V

    .line 38
    :cond_0
    return-void
.end method
