.class final Lkik/android/util/i;
.super Landroid/graphics/Paint;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x1

    .line 111
    invoke-direct {p0}, Landroid/graphics/Paint;-><init>()V

    .line 113
    invoke-virtual {p0, v0}, Lkik/android/util/i;->setAntiAlias(Z)V

    .line 114
    invoke-virtual {p0, v0}, Lkik/android/util/i;->setDither(Z)V

    .line 115
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p0, v0}, Lkik/android/util/i;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 116
    const v0, -0x777778

    invoke-virtual {p0, v0}, Lkik/android/util/i;->setColor(I)V

    .line 117
    return-void
.end method
