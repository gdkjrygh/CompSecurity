.class final Ljp/co/cyberagent/android/a/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:I

.field final synthetic b:[F

.field final synthetic c:Ljp/co/cyberagent/android/a/h;


# direct methods
.method constructor <init>(Ljp/co/cyberagent/android/a/h;I[F)V
    .locals 0

    .prologue
    .line 441
    iput-object p1, p0, Ljp/co/cyberagent/android/a/j;->c:Ljp/co/cyberagent/android/a/h;

    iput p2, p0, Ljp/co/cyberagent/android/a/j;->a:I

    iput-object p3, p0, Ljp/co/cyberagent/android/a/j;->b:[F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 444
    iget v0, p0, Ljp/co/cyberagent/android/a/j;->a:I

    const/4 v1, 0x1

    iget-object v2, p0, Ljp/co/cyberagent/android/a/j;->b:[F

    invoke-static {v2}, Ljava/nio/FloatBuffer;->wrap([F)Ljava/nio/FloatBuffer;

    move-result-object v2

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glUniform4fv(IILjava/nio/FloatBuffer;)V

    .line 445
    return-void
.end method
