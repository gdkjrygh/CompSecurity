.class public final Lcom/google/android/gms/internal/fp;
.super Landroid/widget/ImageView;


# instance fields
.field private a:Landroid/net/Uri;

.field private b:I

.field private c:I


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/fp;->b:I

    return v0
.end method

.method public final a(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/fp;->b:I

    return-void
.end method

.method public final a(Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/fp;->a:Landroid/net/Uri;

    return-void
.end method

.method protected final onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    iget v0, p0, Lcom/google/android/gms/internal/fp;->c:I

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/fp;->c:I

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    :cond_0
    return-void
.end method
