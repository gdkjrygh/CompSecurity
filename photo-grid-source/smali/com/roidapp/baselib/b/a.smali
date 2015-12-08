.class public final Lcom/roidapp/baselib/b/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Landroid/graphics/Bitmap;
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 11
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 12
    const v1, -0x232324

    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 13
    return-object v0
.end method

.method public static b()Landroid/graphics/drawable/ColorDrawable;
    .locals 2

    .prologue
    .line 17
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    const v1, -0x232324

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    return-object v0
.end method
