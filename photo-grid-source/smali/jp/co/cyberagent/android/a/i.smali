.class final Ljp/co/cyberagent/android/a/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:I

.field final synthetic b:F

.field final synthetic c:Ljp/co/cyberagent/android/a/h;


# direct methods
.method constructor <init>(Ljp/co/cyberagent/android/a/h;IF)V
    .locals 0

    .prologue
    .line 414
    iput-object p1, p0, Ljp/co/cyberagent/android/a/i;->c:Ljp/co/cyberagent/android/a/h;

    iput p2, p0, Ljp/co/cyberagent/android/a/i;->a:I

    iput p3, p0, Ljp/co/cyberagent/android/a/i;->b:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 417
    iget v0, p0, Ljp/co/cyberagent/android/a/i;->a:I

    iget v1, p0, Ljp/co/cyberagent/android/a/i;->b:F

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glUniform1f(IF)V

    .line 418
    return-void
.end method
