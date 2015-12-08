.class final Lkik/android/util/f;
.super Landroid/graphics/Paint;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x1

    .line 94
    invoke-direct {p0}, Landroid/graphics/Paint;-><init>()V

    .line 96
    invoke-virtual {p0, v0}, Lkik/android/util/f;->setAntiAlias(Z)V

    .line 97
    invoke-virtual {p0, v0}, Lkik/android/util/f;->setDither(Z)V

    .line 98
    invoke-virtual {p0, v0}, Lkik/android/util/f;->setFilterBitmap(Z)V

    .line 99
    return-void
.end method
