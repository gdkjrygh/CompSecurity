.class public Lcom/facebook/reflex/view/ContainerView;
.super Landroid/view/ViewGroup;
.source "ContainerView.java"

# interfaces
.implements Lcom/facebook/reflex/view/b/h;
.implements Lcom/facebook/reflex/view/b/i;
.implements Lcom/facebook/reflex/view/b/r;


# instance fields
.field protected final b:Lcom/facebook/reflex/view/b/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 32
    const/4 v0, 0x0

    check-cast v0, Landroid/util/AttributeSet;

    invoke-direct {p0, p1, v0}, Lcom/facebook/reflex/view/ContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 33
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .annotation build Lcom/facebook/base/DoNotStrip;
    .end annotation

    .prologue
    .line 37
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/reflex/view/ContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 38
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 41
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 42
    new-instance v0, Lcom/facebook/reflex/view/b/a;

    invoke-direct {v0, p0, p0}, Lcom/facebook/reflex/view/b/a;-><init>(Lcom/facebook/reflex/view/b/i;Lcom/facebook/reflex/view/b/h;)V

    iput-object v0, p0, Lcom/facebook/reflex/view/ContainerView;->b:Lcom/facebook/reflex/view/b/a;

    .line 43
    iget-object v0, p0, Lcom/facebook/reflex/view/ContainerView;->b:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p2}, Lcom/facebook/reflex/view/b/a;->a(Landroid/util/AttributeSet;)V

    .line 44
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Canvas;)V
    .locals 0

    .prologue
    .line 238
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V

    .line 239
    return-void
.end method

.method public a(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 232
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public b()Landroid/view/ViewGroup;
    .locals 0

    .prologue
    .line 217
    return-object p0
.end method

.method public c()Lcom/facebook/reflex/view/b/r;
    .locals 0

    .prologue
    .line 222
    return-object p0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/facebook/reflex/view/ContainerView;->b:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/a;->h()Z

    move-result v0

    return v0
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/facebook/reflex/view/ContainerView;->b:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/b/a;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lcom/facebook/reflex/view/ContainerView;->b:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/b/a;->a(Landroid/graphics/Canvas;)V

    .line 138
    return-void
.end method

.method public e()V
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lcom/facebook/reflex/view/ContainerView;->b:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/a;->f()V

    .line 143
    return-void
.end method

.method public f()Landroid/view/View;
    .locals 0

    .prologue
    .line 227
    return-object p0
.end method

.method public getBackingContent()Lcom/facebook/reflex/d;
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lcom/facebook/reflex/view/ContainerView;->b:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/a;->b()Lcom/facebook/reflex/d;

    move-result-object v0

    return-object v0
.end method

.method public getBackingWidget()Lcom/facebook/reflex/Widget;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/facebook/reflex/view/ContainerView;->b:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/a;->a()Lcom/facebook/reflex/Container;

    move-result-object v0

    return-object v0
.end method

.method public getScrollOffsetX()I
    .locals 1

    .prologue
    .line 83
    invoke-virtual {p0}, Lcom/facebook/reflex/view/ContainerView;->getScrollX()I

    move-result v0

    return v0
.end method

.method public getScrollOffsetY()I
    .locals 1

    .prologue
    .line 88
    invoke-virtual {p0}, Lcom/facebook/reflex/view/ContainerView;->getScrollY()I

    move-result v0

    return v0
.end method

.method public invalidate()V
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lcom/facebook/reflex/view/ContainerView;->b:Lcom/facebook/reflex/view/b/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/reflex/view/ContainerView;->b:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/a;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 122
    invoke-super {p0}, Landroid/view/ViewGroup;->invalidate()V

    .line 124
    :cond_0
    return-void
.end method

.method public invalidate(IIII)V
    .locals 1

    .prologue
    .line 114
    iget-object v0, p0, Lcom/facebook/reflex/view/ContainerView;->b:Lcom/facebook/reflex/view/b/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/reflex/view/ContainerView;->b:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/facebook/reflex/view/b/a;->a(IIII)Z

    move-result v0

    if-nez v0, :cond_0

    .line 115
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->invalidate(IIII)V

    .line 117
    :cond_0
    return-void
.end method

.method public invalidate(Landroid/graphics/Rect;)V
    .locals 1

    .prologue
    .line 107
    iget-object v0, p0, Lcom/facebook/reflex/view/ContainerView;->b:Lcom/facebook/reflex/view/b/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/reflex/view/ContainerView;->b:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/b/a;->a(Landroid/graphics/Rect;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 108
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->invalidate(Landroid/graphics/Rect;)V

    .line 110
    :cond_0
    return-void
.end method

.method public invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Lcom/facebook/reflex/view/ContainerView;->b:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/reflex/view/b/a;->a([ILandroid/graphics/Rect;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 129
    const/4 v0, 0x0

    .line 131
    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0
.end method

.method protected onLayout(ZIIII)V
    .locals 9

    .prologue
    .line 183
    invoke-virtual {p0}, Lcom/facebook/reflex/view/ContainerView;->getChildCount()I

    move-result v5

    .line 185
    invoke-virtual {p0}, Lcom/facebook/reflex/view/ContainerView;->getPaddingLeft()I

    move-result v3

    .line 186
    invoke-virtual {p0}, Lcom/facebook/reflex/view/ContainerView;->getPaddingTop()I

    move-result v1

    .line 188
    const/4 v0, 0x0

    move v4, v0

    :goto_0
    if-ge v4, v5, :cond_1

    .line 189
    invoke-virtual {p0, v4}, Lcom/facebook/reflex/view/ContainerView;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 190
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v2, 0x8

    if-eq v0, v2, :cond_0

    .line 191
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    .line 192
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v8

    .line 197
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 198
    instance-of v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v2, :cond_2

    .line 199
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 200
    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v2, v3

    .line 201
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v0, v1

    .line 203
    :goto_1
    add-int/2addr v7, v2

    add-int/2addr v8, v0

    invoke-virtual {v6, v2, v0, v7, v8}, Landroid/view/View;->layout(IIII)V

    .line 188
    :cond_0
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_0

    .line 206
    :cond_1
    iget-object v0, p0, Lcom/facebook/reflex/view/ContainerView;->b:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/a;->g()V

    .line 207
    iget-object v0, p0, Lcom/facebook/reflex/view/ContainerView;->b:Lcom/facebook/reflex/view/b/a;

    sub-int v1, p4, p2

    sub-int v2, p5, p3

    invoke-virtual {v0, v1, v2}, Lcom/facebook/reflex/view/b/a;->a(II)V

    .line 208
    return-void

    :cond_2
    move v0, v1

    move v2, v3

    goto :goto_1
.end method

.method protected onMeasure(II)V
    .locals 11

    .prologue
    const/4 v3, 0x0

    .line 147
    invoke-virtual {p0}, Lcom/facebook/reflex/view/ContainerView;->getChildCount()I

    move-result v10

    move v9, v3

    move v7, v3

    move v8, v3

    .line 153
    :goto_0
    if-ge v9, v10, :cond_1

    .line 154
    invoke-virtual {p0, v9}, Lcom/facebook/reflex/view/ContainerView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 155
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v2, 0x8

    if-eq v0, v2, :cond_2

    .line 156
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 157
    instance-of v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_0

    .line 158
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/view/ViewGroup$MarginLayoutParams;

    move-object v0, p0

    move v2, p1

    move v4, p2

    move v5, v3

    .line 159
    invoke-virtual/range {v0 .. v5}, Lcom/facebook/reflex/view/ContainerView;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 160
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget v2, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v0, v2

    iget v2, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v0, v2

    invoke-static {v7, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 161
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    iget v2, v6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v1, v2

    iget v2, v6, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v1, v2

    invoke-static {v8, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 153
    :goto_1
    add-int/lit8 v2, v9, 0x1

    move v9, v2

    move v7, v0

    move v8, v1

    goto :goto_0

    .line 163
    :cond_0
    invoke-virtual {p0, v1, p1, p2}, Lcom/facebook/reflex/view/ContainerView;->measureChild(Landroid/view/View;II)V

    .line 164
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-static {v7, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 165
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-static {v8, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_1

    .line 171
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/reflex/view/ContainerView;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/reflex/view/ContainerView;->getPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    add-int/2addr v0, v7

    .line 172
    invoke-virtual {p0}, Lcom/facebook/reflex/view/ContainerView;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Lcom/facebook/reflex/view/ContainerView;->getPaddingBottom()I

    move-result v2

    add-int/2addr v1, v2

    add-int/2addr v1, v8

    .line 174
    invoke-virtual {p0}, Lcom/facebook/reflex/view/ContainerView;->getSuggestedMinimumHeight()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 175
    invoke-virtual {p0}, Lcom/facebook/reflex/view/ContainerView;->getSuggestedMinimumWidth()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 176
    invoke-static {v0, p1}, Lcom/facebook/reflex/view/ContainerView;->resolveSize(II)I

    move-result v0

    invoke-static {v1, p2}, Lcom/facebook/reflex/view/ContainerView;->resolveSize(II)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/facebook/reflex/view/ContainerView;->setMeasuredDimension(II)V

    .line 179
    return-void

    :cond_2
    move v0, v7

    move v1, v8

    goto :goto_1
.end method

.method public onWindowFocusChanged(Z)V
    .locals 0

    .prologue
    .line 213
    return-void
.end method

.method public setAndroidTouchMode(Ljava/util/EnumSet;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/EnumSet",
            "<",
            "Lcom/facebook/reflex/view/b/g;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 63
    iget-object v0, p0, Lcom/facebook/reflex/view/ContainerView;->b:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/b/a;->a(Ljava/util/EnumSet;)V

    .line 64
    return-void
.end method

.method public setCompatibilityDrawEnabled(Z)V
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lcom/facebook/reflex/view/ContainerView;->b:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/b/a;->b(Z)V

    .line 74
    return-void
.end method

.method public setDispatchAndroidTouchEventsEnabled(Z)V
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/facebook/reflex/view/ContainerView;->b:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/b/a;->a(Z)V

    .line 54
    return-void
.end method
