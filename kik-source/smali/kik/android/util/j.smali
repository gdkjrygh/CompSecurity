.class final Lkik/android/util/j;
.super Landroid/graphics/Paint;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 2

    .prologue
    const/4 v0, 0x1

    const/16 v1, 0x7d

    .line 120
    invoke-direct {p0}, Landroid/graphics/Paint;-><init>()V

    .line 122
    invoke-virtual {p0, v0}, Lkik/android/util/j;->setAntiAlias(Z)V

    .line 123
    invoke-virtual {p0, v0}, Lkik/android/util/j;->setDither(Z)V

    .line 124
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p0, v0}, Lkik/android/util/j;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 125
    invoke-static {v1, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {p0, v0}, Lkik/android/util/j;->setColor(I)V

    .line 126
    return-void
.end method
