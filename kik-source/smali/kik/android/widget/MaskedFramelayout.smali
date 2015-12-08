.class public Lkik/android/widget/MaskedFramelayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field private a:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 20
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkik/android/widget/MaskedFramelayout;->setWillNotDraw(Z)V

    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 26
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkik/android/widget/MaskedFramelayout;->setWillNotDraw(Z)V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 31
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkik/android/widget/MaskedFramelayout;->setWillNotDraw(Z)V

    .line 33
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    .prologue
    .line 37
    invoke-virtual {p0}, Lkik/android/widget/MaskedFramelayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/MaskedFramelayout;->a:Landroid/graphics/drawable/Drawable;

    .line 38
    return-void
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 43
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 44
    iget-object v0, p0, Lkik/android/widget/MaskedFramelayout;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 45
    iget-object v0, p0, Lkik/android/widget/MaskedFramelayout;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lkik/android/widget/MaskedFramelayout;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Lkik/android/widget/MaskedFramelayout;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {v0, v3, v3, v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 46
    iget-object v0, p0, Lkik/android/widget/MaskedFramelayout;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 48
    :cond_0
    return-void
.end method
