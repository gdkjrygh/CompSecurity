.class public final Lkik/android/chat/b/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(I)Landroid/graphics/drawable/StateListDrawable;
    .locals 9

    .prologue
    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 53
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, p0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 54
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, 0x3

    new-array v2, v2, [F

    invoke-static {p0, v2}, Landroid/graphics/Color;->colorToHSV(I[F)V

    const/4 v3, 0x0

    aget v4, v2, v8

    const v5, 0x3e4ccccd    # 0.2f

    sub-float/2addr v4, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v3

    aput v3, v2, v8

    invoke-static {v2}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v2

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 56
    new-instance v2, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 57
    new-array v3, v7, [I

    const v4, 0x10100a1

    aput v4, v3, v6

    invoke-virtual {v2, v3, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 58
    new-array v3, v7, [I

    const v4, 0x10100a7

    aput v4, v3, v6

    invoke-virtual {v2, v3, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 59
    new-array v3, v7, [I

    const v4, 0x101009c

    aput v4, v3, v6

    invoke-virtual {v2, v3, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 60
    new-array v1, v6, [I

    invoke-virtual {v2, v1, v0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 61
    return-object v2
.end method

.method public static a(Landroid/view/View;Lkik/android/chat/b/b;)V
    .locals 1

    .prologue
    .line 33
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 37
    :cond_0
    :goto_0
    return-void

    .line 36
    :cond_1
    invoke-virtual {p1}, Lkik/android/chat/b/b;->c()I

    move-result v0

    invoke-static {v0}, Lkik/android/chat/b/c;->a(I)Landroid/graphics/drawable/StateListDrawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method

.method public static a(Landroid/view/View;Lkik/android/chat/b/b;I)V
    .locals 5

    .prologue
    .line 42
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 49
    :cond_0
    :goto_0
    return-void

    .line 45
    :cond_1
    invoke-virtual {p1}, Lkik/android/chat/b/b;->c()I

    move-result v0

    invoke-static {v0}, Lkik/android/chat/b/c;->a(I)Landroid/graphics/drawable/StateListDrawable;

    move-result-object v0

    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 47
    new-instance v2, Landroid/graphics/drawable/LayerDrawable;

    const/4 v3, 0x2

    new-array v3, v3, [Landroid/graphics/drawable/Drawable;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    invoke-direct {v2, v3}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 48
    invoke-virtual {p0, v2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method

.method public static a(Landroid/widget/ImageView;Lkik/android/chat/b/b;)V
    .locals 2

    .prologue
    .line 96
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 106
    :cond_0
    :goto_0
    return-void

    .line 100
    :cond_1
    const/4 v0, -0x1

    invoke-virtual {p1}, Lkik/android/chat/b/b;->b()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 101
    const v0, 0x7f020269

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 104
    :cond_2
    const v0, 0x7f02026a

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0
.end method

.method public static a(Landroid/widget/TextView;Lkik/android/chat/b/b;)V
    .locals 1

    .prologue
    .line 88
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 92
    :cond_0
    :goto_0
    return-void

    .line 91
    :cond_1
    invoke-virtual {p1}, Lkik/android/chat/b/b;->b()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0
.end method
