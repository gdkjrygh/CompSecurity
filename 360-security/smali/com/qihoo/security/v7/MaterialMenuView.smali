.class public Lcom/qihoo/security/v7/MaterialMenuView;
.super Landroid/view/View;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/v7/MaterialMenuView$1;,
        Lcom/qihoo/security/v7/MaterialMenuView$SavedState;
    }
.end annotation


# instance fields
.field private a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

.field private b:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/v7/MaterialMenuView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 30
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/qihoo/security/v7/MaterialMenuView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 31
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 22
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->BURGER:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuView;->b:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    .line 35
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/v7/MaterialMenuView;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 36
    return-void
.end method

.method private a(Landroid/content/Context;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 188
    invoke-virtual {p1, p2, p3, v0, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    return-object v0
.end method

.method private a()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 181
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuView;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    if-eqz v0, :cond_0

    .line 182
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuView;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    iget-object v1, p0, Lcom/qihoo/security/v7/MaterialMenuView;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-virtual {v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->getIntrinsicWidth()I

    move-result v1

    invoke-virtual {p0}, Lcom/qihoo/security/v7/MaterialMenuView;->getPaddingLeft()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p0}, Lcom/qihoo/security/v7/MaterialMenuView;->getPaddingRight()I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p0, Lcom/qihoo/security/v7/MaterialMenuView;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-virtual {v2}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->getIntrinsicHeight()I

    move-result v2

    invoke-virtual {p0}, Lcom/qihoo/security/v7/MaterialMenuView;->getPaddingTop()I

    move-result v3

    add-int/2addr v2, v3

    invoke-virtual {p0}, Lcom/qihoo/security/v7/MaterialMenuView;->getPaddingBottom()I

    move-result v3

    add-int/2addr v2, v3

    invoke-virtual {v0, v4, v4, v1, v2}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->setBounds(IIII)V

    .line 185
    :cond_0
    return-void
.end method

.method private a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 9

    .prologue
    .line 39
    sget-object v0, Lcom/qihoo/security/lite/a$a;->MaterialMenuView:[I

    invoke-direct {p0, p1, p2, v0}, Lcom/qihoo/security/v7/MaterialMenuView;->a(Landroid/content/Context;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v7

    .line 42
    const/4 v0, 0x0

    const/4 v1, -0x1

    :try_start_0
    invoke-virtual {v7, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    .line 43
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-virtual {v7, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    .line 44
    const/4 v0, 0x2

    const/16 v1, 0xc8

    invoke-virtual {v7, v0, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v5

    .line 46
    const/4 v0, 0x3

    const/16 v1, 0x64

    invoke-virtual {v7, v0, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v6

    .line 48
    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v0

    invoke-static {v0}, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;->a(I)Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

    move-result-object v3

    .line 49
    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v8

    .line 51
    new-instance v0, Lcom/qihoo/security/v7/MaterialMenuDrawable;

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lcom/qihoo/security/v7/MaterialMenuDrawable;-><init>(Landroid/content/Context;ILcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;III)V

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuView;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    .line 52
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuView;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-virtual {v0, v8}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->recycle()V

    .line 57
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuView;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 58
    return-void

    .line 54
    :catchall_0
    move-exception v0

    invoke-virtual {v7}, Landroid/content/res/TypedArray;->recycle()V

    throw v0
.end method


# virtual methods
.method public a(Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;)V
    .locals 2

    .prologue
    .line 98
    iput-object p1, p0, Lcom/qihoo/security/v7/MaterialMenuView;->b:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    .line 99
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuView;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;Z)V

    .line 100
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 3

    .prologue
    .line 62
    invoke-super {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 63
    invoke-virtual {p0}, Lcom/qihoo/security/v7/MaterialMenuView;->getPaddingLeft()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/qihoo/security/v7/MaterialMenuView;->getPaddingTop()I

    move-result v0

    if-eqz v0, :cond_1

    .line 64
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getSaveCount()I

    move-result v0

    .line 65
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 66
    invoke-virtual {p0}, Lcom/qihoo/security/v7/MaterialMenuView;->getPaddingLeft()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p0}, Lcom/qihoo/security/v7/MaterialMenuView;->getPaddingTop()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 67
    iget-object v1, p0, Lcom/qihoo/security/v7/MaterialMenuView;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-virtual {v1, p1}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 68
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 72
    :goto_0
    return-void

    .line 70
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuView;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->draw(Landroid/graphics/Canvas;)V

    goto :goto_0
.end method

.method public getDrawable()Lcom/qihoo/security/v7/MaterialMenuDrawable;
    .locals 1

    .prologue
    .line 140
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuView;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    return-object v0
.end method

.method public getState()Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuView;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-virtual {v0}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a()Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    move-result-object v0

    return-object v0
.end method

.method protected onMeasure(II)V
    .locals 5

    .prologue
    const/high16 v4, 0x40000000    # 2.0f

    .line 145
    invoke-virtual {p0}, Lcom/qihoo/security/v7/MaterialMenuView;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Lcom/qihoo/security/v7/MaterialMenuView;->getPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    .line 146
    invoke-virtual {p0}, Lcom/qihoo/security/v7/MaterialMenuView;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Lcom/qihoo/security/v7/MaterialMenuView;->getPaddingBottom()I

    move-result v2

    add-int/2addr v1, v2

    .line 148
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xb

    if-lt v2, v3, :cond_0

    .line 149
    iget-object v2, p0, Lcom/qihoo/security/v7/MaterialMenuView;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-virtual {v2}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->getIntrinsicWidth()I

    move-result v2

    add-int/2addr v0, v2

    invoke-static {v0, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 151
    iget-object v2, p0, Lcom/qihoo/security/v7/MaterialMenuView;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-virtual {v2}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->getIntrinsicHeight()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {v1, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 153
    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/v7/MaterialMenuView;->setMeasuredDimension(II)V

    .line 157
    :goto_0
    return-void

    .line 155
    :cond_0
    iget-object v2, p0, Lcom/qihoo/security/v7/MaterialMenuView;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-virtual {v2}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->getIntrinsicWidth()I

    move-result v2

    add-int/2addr v0, v2

    iget-object v2, p0, Lcom/qihoo/security/v7/MaterialMenuView;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-virtual {v2}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->getIntrinsicHeight()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/v7/MaterialMenuView;->setMeasuredDimension(II)V

    goto :goto_0
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .prologue
    .line 175
    check-cast p1, Lcom/qihoo/security/v7/MaterialMenuView$SavedState;

    .line 176
    invoke-virtual {p1}, Lcom/qihoo/security/v7/MaterialMenuView$SavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 177
    iget-object v0, p1, Lcom/qihoo/security/v7/MaterialMenuView$SavedState;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/v7/MaterialMenuView;->setState(Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;)V

    .line 178
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .prologue
    .line 167
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 168
    new-instance v1, Lcom/qihoo/security/v7/MaterialMenuView$SavedState;

    invoke-direct {v1, v0}, Lcom/qihoo/security/v7/MaterialMenuView$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 169
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuView;->b:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    iput-object v0, v1, Lcom/qihoo/security/v7/MaterialMenuView$SavedState;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    .line 170
    return-object v1
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .prologue
    .line 161
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 162
    invoke-direct {p0}, Lcom/qihoo/security/v7/MaterialMenuView;->a()V

    .line 163
    return-void
.end method

.method public setColor(I)V
    .locals 1

    .prologue
    .line 110
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuView;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(I)V

    .line 111
    return-void
.end method

.method public setInterpolator(Landroid/view/animation/Interpolator;)V
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuView;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(Landroid/view/animation/Interpolator;)V

    .line 126
    return-void
.end method

.method public setPadding(IIII)V
    .locals 0

    .prologue
    .line 76
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->setPadding(IIII)V

    .line 77
    invoke-direct {p0}, Lcom/qihoo/security/v7/MaterialMenuView;->a()V

    .line 78
    return-void
.end method

.method public setPressedDuration(I)V
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuView;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->c(I)V

    .line 121
    return-void
.end method

.method public setRTLEnabled(Z)V
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuView;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(Z)V

    .line 131
    return-void
.end method

.method public setState(Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;)V
    .locals 1

    .prologue
    .line 87
    iput-object p1, p0, Lcom/qihoo/security/v7/MaterialMenuView;->b:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    .line 88
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuView;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->a(Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;)V

    .line 89
    return-void
.end method

.method public setTransformationDuration(I)V
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuView;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->b(I)V

    .line 116
    return-void
.end method

.method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuView;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    if-eq p1, v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
