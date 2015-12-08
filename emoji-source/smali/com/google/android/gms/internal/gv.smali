.class public final Lcom/google/android/gms/internal/gv;
.super Landroid/widget/ImageView;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/gv$a;
    }
.end annotation


# instance fields
.field private FO:Landroid/net/Uri;

.field private FP:I

.field private FQ:I

.field private FR:Lcom/google/android/gms/internal/gv$a;


# virtual methods
.method public al(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/gv;->FP:I

    return-void
.end method

.method public fi()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/gv;->FP:I

    return v0
.end method

.method public g(Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/gv;->FO:Landroid/net/Uri;

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 3
    .param p1, "canvas"    # Landroid/graphics/Canvas;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/gv;->FR:Lcom/google/android/gms/internal/gv$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/gv;->FR:Lcom/google/android/gms/internal/gv$a;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gv;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gv;->getHeight()I

    move-result v2

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/gv$a;->d(II)Landroid/graphics/Path;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    iget v0, p0, Lcom/google/android/gms/internal/gv;->FQ:I

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/google/android/gms/internal/gv;->FQ:I

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    :cond_1
    return-void
.end method
