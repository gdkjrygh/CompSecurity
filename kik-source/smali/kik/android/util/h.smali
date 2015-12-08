.class final Lkik/android/util/h;
.super Landroid/graphics/Paint;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 101
    invoke-direct {p0}, Landroid/graphics/Paint;-><init>()V

    .line 103
    invoke-virtual {p0, v0}, Lkik/android/util/h;->setAntiAlias(Z)V

    .line 104
    invoke-virtual {p0, v0}, Lkik/android/util/h;->setDither(Z)V

    .line 105
    invoke-virtual {p0, v0}, Lkik/android/util/h;->setFilterBitmap(Z)V

    .line 106
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p0, v0}, Lkik/android/util/h;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 107
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkik/android/util/h;->setColor(I)V

    .line 108
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p0, v0}, Lkik/android/util/h;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 109
    return-void
.end method
