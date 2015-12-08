.class public final Lcom/google/android/gms/internal/ez;
.super Landroid/widget/ImageView;


# instance fields
.field private CO:Landroid/net/Uri;

.field private CP:I

.field private CQ:I


# virtual methods
.method public L(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ez;->CP:I

    return-void
.end method

.method public e(Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ez;->CO:Landroid/net/Uri;

    return-void
.end method

.method public eB()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ez;->CP:I

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 1
    .param p1, "canvas"    # Landroid/graphics/Canvas;

    .prologue
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    iget v0, p0, Lcom/google/android/gms/internal/ez;->CQ:I

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/ez;->CQ:I

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    :cond_0
    return-void
.end method
