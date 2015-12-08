.class public Lcom/arist/model/skin/ColorTextView;
.super Landroid/widget/TextView;

# interfaces
.implements Lcom/arist/model/skin/m;


# instance fields
.field private a:Z

.field private b:Z

.field private c:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/arist/model/skin/ColorTextView;->a:Z

    iput-boolean v1, p0, Lcom/arist/model/skin/ColorTextView;->b:Z

    iput-boolean v1, p0, Lcom/arist/model/skin/ColorTextView;->c:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    invoke-direct {p0, p1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-boolean v3, p0, Lcom/arist/model/skin/ColorTextView;->a:Z

    iput-boolean v2, p0, Lcom/arist/model/skin/ColorTextView;->b:Z

    iput-boolean v2, p0, Lcom/arist/model/skin/ColorTextView;->c:Z

    invoke-virtual {p0}, Lcom/arist/model/skin/ColorTextView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget-object v1, La/a/a/a/b;->d:[I

    invoke-virtual {v0, p2, v1}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    iget-boolean v1, p0, Lcom/arist/model/skin/ColorTextView;->a:Z

    invoke-virtual {v0, v2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/arist/model/skin/ColorTextView;->a:Z

    iget-boolean v1, p0, Lcom/arist/model/skin/ColorTextView;->c:Z

    invoke-virtual {v0, v3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/arist/model/skin/ColorTextView;->c:Z

    const/4 v1, 0x2

    iget-boolean v2, p0, Lcom/arist/model/skin/ColorTextView;->b:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/arist/model/skin/ColorTextView;->b:Z

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/arist/model/skin/ColorTextView;->a:Z

    iput-boolean v1, p0, Lcom/arist/model/skin/ColorTextView;->b:Z

    iput-boolean v1, p0, Lcom/arist/model/skin/ColorTextView;->c:Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/arist/model/skin/ColorTextView;->a:Z

    iput-boolean v0, p0, Lcom/arist/model/skin/ColorTextView;->c:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/arist/model/skin/ColorTextView;->b:Z

    return-void
.end method

.method public final a(I)V
    .locals 6

    const/4 v5, 0x1

    iget-boolean v0, p0, Lcom/arist/model/skin/ColorTextView;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/arist/model/skin/ColorTextView;->setTextColor(I)V

    :cond_0
    iget-boolean v0, p0, Lcom/arist/model/skin/ColorTextView;->c:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/arist/model/skin/ColorTextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v1

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-lt v0, v2, :cond_3

    :cond_1
    iget-boolean v0, p0, Lcom/arist/model/skin/ColorTextView;->b:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/arist/model/skin/ColorTextView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lcom/arist/model/skin/ColorTextView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    new-instance v1, Landroid/graphics/LightingColorFilter;

    invoke-direct {v1, p1, v5}, Landroid/graphics/LightingColorFilter;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :cond_2
    :goto_1
    return-void

    :cond_3
    aget-object v3, v1, v0

    if-eqz v3, :cond_4

    new-instance v4, Landroid/graphics/LightingColorFilter;

    invoke-direct {v4, p1, v5}, Landroid/graphics/LightingColorFilter;-><init>(II)V

    invoke-virtual {v3, v4}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    invoke-virtual {p0, p1}, Lcom/arist/model/skin/ColorTextView;->setBackgroundColor(I)V

    goto :goto_1
.end method

.method protected onAttachedToWindow()V
    .locals 1

    invoke-static {}, Lcom/arist/model/skin/b;->a()Lcom/arist/model/skin/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/arist/model/skin/b;->a(Lcom/arist/model/skin/m;)V

    invoke-super {p0}, Landroid/widget/TextView;->onAttachedToWindow()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    invoke-static {}, Lcom/arist/model/skin/b;->a()Lcom/arist/model/skin/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/arist/model/skin/b;->b(Lcom/arist/model/skin/m;)V

    invoke-super {p0}, Landroid/widget/TextView;->onDetachedFromWindow()V

    return-void
.end method
