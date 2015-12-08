.class Lorg/chromium/ui/DropdownDividerDrawable;
.super Landroid/graphics/drawable/Drawable;
.source "DropdownDividerDrawable.java"


# instance fields
.field private mDividerRect:Landroid/graphics/Rect;

.field private mPaint:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 20
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lorg/chromium/ui/DropdownDividerDrawable;->mPaint:Landroid/graphics/Paint;

    .line 21
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lorg/chromium/ui/DropdownDividerDrawable;->mDividerRect:Landroid/graphics/Rect;

    .line 22
    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 2
    .param p1, "canvas"    # Landroid/graphics/Canvas;

    .prologue
    .line 26
    iget-object v0, p0, Lorg/chromium/ui/DropdownDividerDrawable;->mDividerRect:Landroid/graphics/Rect;

    iget-object v1, p0, Lorg/chromium/ui/DropdownDividerDrawable;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 27
    return-void
.end method

.method public getOpacity()I
    .locals 1

    .prologue
    .line 52
    const/4 v0, -0x1

    return v0
.end method

.method public onBoundsChange(Landroid/graphics/Rect;)V
    .locals 4
    .param p1, "bounds"    # Landroid/graphics/Rect;

    .prologue
    const/4 v3, 0x0

    .line 31
    iget-object v0, p0, Lorg/chromium/ui/DropdownDividerDrawable;->mDividerRect:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v1

    iget-object v2, p0, Lorg/chromium/ui/DropdownDividerDrawable;->mDividerRect:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    invoke-virtual {v0, v3, v3, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 32
    return-void
.end method

.method public setAlpha(I)V
    .locals 0
    .param p1, "alpha"    # I

    .prologue
    .line 44
    return-void
.end method

.method public setColor(I)V
    .locals 1
    .param p1, "color"    # I

    .prologue
    .line 39
    iget-object v0, p0, Lorg/chromium/ui/DropdownDividerDrawable;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 40
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0
    .param p1, "cf"    # Landroid/graphics/ColorFilter;

    .prologue
    .line 48
    return-void
.end method

.method public setHeight(I)V
    .locals 3
    .param p1, "height"    # I

    .prologue
    const/4 v2, 0x0

    .line 35
    iget-object v0, p0, Lorg/chromium/ui/DropdownDividerDrawable;->mDividerRect:Landroid/graphics/Rect;

    iget-object v1, p0, Lorg/chromium/ui/DropdownDividerDrawable;->mDividerRect:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->right:I

    invoke-virtual {v0, v2, v2, v1, p1}, Landroid/graphics/Rect;->set(IIII)V

    .line 36
    return-void
.end method
