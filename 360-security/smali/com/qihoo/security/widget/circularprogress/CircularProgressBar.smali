.class public Lcom/qihoo/security/widget/circularprogress/CircularProgressBar;
.super Landroid/widget/ProgressBar;
.source "360Security"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 37
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 38
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 41
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 42
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 10

    .prologue
    const/4 v7, 0x0

    .line 45
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 47
    invoke-virtual {p0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressBar;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 48
    new-instance v0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;

    invoke-direct {v0, p1}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->a()Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 88
    :goto_0
    return-void

    .line 52
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 53
    sget-object v0, Lcom/qihoo/security/lite/a$a;->CircularProgressBar:[I

    invoke-virtual {p1, p2, v0, p3, v7}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 55
    const/4 v2, 0x1

    const v3, 0x7f080048

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    .line 57
    const/4 v3, 0x3

    const v4, 0x7f090015

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    invoke-virtual {v0, v3, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    .line 59
    const/4 v4, 0x6

    const v5, 0x7f0c006c

    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v5

    invoke-virtual {v0, v4, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v4

    .line 61
    const/4 v5, 0x7

    const v6, 0x7f0c006d

    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v6

    invoke-virtual {v0, v5, v6}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v5

    .line 63
    const/4 v6, 0x2

    invoke-virtual {v0, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    .line 64
    const/4 v7, 0x4

    const v8, 0x7f0a0002

    invoke-virtual {v1, v8}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v8

    invoke-virtual {v0, v7, v8}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v7

    .line 66
    const/4 v8, 0x5

    const v9, 0x7f0a0003

    invoke-virtual {v1, v9}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v9

    invoke-virtual {v0, v8, v9}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v8

    .line 68
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 70
    const/4 v0, 0x0

    .line 72
    if-eqz v6, :cond_1

    .line 73
    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v0

    .line 77
    :cond_1
    new-instance v1, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;

    invoke-direct {v1, p1}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v4}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->a(F)Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;

    move-result-object v1

    invoke-virtual {v1, v5}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->b(F)Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->c(F)Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;

    move-result-object v1

    invoke-virtual {v1, v7}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->b(I)Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;

    move-result-object v1

    invoke-virtual {v1, v8}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->c(I)Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;

    move-result-object v1

    .line 81
    if-eqz v0, :cond_2

    array-length v3, v0

    if-lez v3, :cond_2

    .line 82
    invoke-virtual {v1, v0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->a([I)Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;

    .line 86
    :goto_1
    invoke-virtual {v1}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->a()Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    move-result-object v0

    .line 87
    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_0

    .line 84
    :cond_2
    invoke-virtual {v1, v2}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->a(I)Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;

    goto :goto_1
.end method
