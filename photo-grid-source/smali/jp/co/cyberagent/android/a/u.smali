.class public Ljp/co/cyberagent/android/a/u;
.super Ljp/co/cyberagent/android/a/aj;
.source "SourceFile"


# instance fields
.field private C:F

.field private y:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 27
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ljp/co/cyberagent/android/a/u;-><init>(Ljava/lang/String;B)V

    .line 28
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;B)V
    .locals 1

    .prologue
    .line 31
    invoke-direct {p0, p1}, Ljp/co/cyberagent/android/a/aj;-><init>(Ljava/lang/String;)V

    .line 32
    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Ljp/co/cyberagent/android/a/u;->C:F

    .line 33
    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 2

    .prologue
    .line 51
    iput p1, p0, Ljp/co/cyberagent/android/a/u;->C:F

    .line 52
    iget v0, p0, Ljp/co/cyberagent/android/a/u;->y:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 53
    iget v0, p0, Ljp/co/cyberagent/android/a/u;->y:I

    iget v1, p0, Ljp/co/cyberagent/android/a/u;->C:F

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/a/u;->a(IF)V

    .line 54
    :cond_0
    return-void
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 37
    invoke-super {p0}, Ljp/co/cyberagent/android/a/aj;->c()V

    .line 38
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/u;->p()I

    move-result v0

    const-string v1, "mixturePercent"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/u;->y:I

    .line 39
    return-void
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 43
    invoke-super {p0}, Ljp/co/cyberagent/android/a/aj;->d()V

    .line 44
    iget v0, p0, Ljp/co/cyberagent/android/a/u;->C:F

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/a/u;->a(F)V

    .line 45
    return-void
.end method
