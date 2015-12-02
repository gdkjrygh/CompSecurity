.class public Lcom/qihoo360/mobilesafe/b/l;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public static a(Landroid/content/Context;F)F
    .locals 3

    .prologue
    .line 23
    if-nez p0, :cond_0

    .line 24
    const/high16 v0, -0x40800000    # -1.0f

    .line 26
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-static {v0, p1, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f090030

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    mul-float/2addr v0, v1

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;F)I
    .locals 2

    .prologue
    .line 31
    invoke-static {p0, p1}, Lcom/qihoo360/mobilesafe/b/l;->a(Landroid/content/Context;F)F

    move-result v0

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method
