.class final Lcom/google/android/gms/common/images/b;
.super Lcom/google/android/gms/internal/vu;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/vu",
        "<",
        "Lcom/google/android/gms/common/images/f;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# virtual methods
.method protected final synthetic a(Ljava/lang/Object;)I
    .locals 2

    .prologue
    .line 0
    check-cast p1, Landroid/graphics/Bitmap;

    .line 1000
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getRowBytes()I

    move-result v1

    mul-int/2addr v0, v1

    .line 0
    return v0
.end method
