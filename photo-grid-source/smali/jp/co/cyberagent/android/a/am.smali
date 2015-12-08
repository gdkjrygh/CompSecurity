.class public Ljp/co/cyberagent/android/a/am;
.super Ljp/co/cyberagent/android/a/al;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1, p2, p3, p4}, Ljp/co/cyberagent/android/a/al;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    return-void
.end method


# virtual methods
.method public final a(II)V
    .locals 0

    .prologue
    .line 53
    invoke-super {p0, p1, p2}, Ljp/co/cyberagent/android/a/al;->a(II)V

    .line 54
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/am;->r()V

    .line 55
    return-void
.end method

.method public final c()V
    .locals 0

    .prologue
    .line 31
    invoke-super {p0}, Ljp/co/cyberagent/android/a/al;->c()V

    .line 32
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/am;->r()V

    .line 33
    return-void
.end method

.method public f()F
    .locals 1

    .prologue
    .line 58
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public g()F
    .locals 1

    .prologue
    .line 62
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method protected r()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 36
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/am;->g()F

    move-result v1

    .line 37
    iget-object v0, p0, Ljp/co/cyberagent/android/a/am;->y:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/a/h;

    .line 38
    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/h;->p()I

    move-result v2

    const-string v3, "texelWidthOffset"

    invoke-static {v2, v3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v2

    .line 39
    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/h;->p()I

    move-result v3

    const-string v4, "texelHeightOffset"

    invoke-static {v3, v4}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v3

    .line 40
    iget v4, p0, Ljp/co/cyberagent/android/a/am;->g:I

    int-to-float v4, v4

    div-float/2addr v1, v4

    invoke-virtual {v0, v2, v1}, Ljp/co/cyberagent/android/a/h;->a(IF)V

    .line 41
    invoke-virtual {v0, v3, v5}, Ljp/co/cyberagent/android/a/h;->a(IF)V

    .line 43
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/am;->f()F

    move-result v1

    .line 44
    iget-object v0, p0, Ljp/co/cyberagent/android/a/am;->y:Ljava/util/List;

    const/4 v2, 0x1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/a/h;

    .line 45
    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/h;->p()I

    move-result v2

    const-string v3, "texelWidthOffset"

    invoke-static {v2, v3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v2

    .line 46
    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/h;->p()I

    move-result v3

    const-string v4, "texelHeightOffset"

    invoke-static {v3, v4}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v3

    .line 47
    invoke-virtual {v0, v2, v5}, Ljp/co/cyberagent/android/a/h;->a(IF)V

    .line 48
    iget v2, p0, Ljp/co/cyberagent/android/a/am;->h:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-virtual {v0, v3, v1}, Ljp/co/cyberagent/android/a/h;->a(IF)V

    .line 49
    return-void
.end method
