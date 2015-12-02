.class public Lcom/facebook/widget/f;
.super Landroid/view/ViewGroup;
.source "CustomViewGroup.java"

# interfaces
.implements Lcom/facebook/widget/g;


# instance fields
.field private mSubscriberListManager:Lcom/facebook/c/a/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 36
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 40
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 44
    return-void
.end method


# virtual methods
.method protected addFbEventSubscriber(Lcom/facebook/c/a/c;)Z
    .locals 1

    .prologue
    .line 286
    iget-object v0, p0, Lcom/facebook/widget/f;->mSubscriberListManager:Lcom/facebook/c/a/d;

    if-nez v0, :cond_0

    .line 287
    new-instance v0, Lcom/facebook/c/a/d;

    invoke-direct {v0}, Lcom/facebook/c/a/d;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/f;->mSubscriberListManager:Lcom/facebook/c/a/d;

    .line 289
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/f;->mSubscriberListManager:Lcom/facebook/c/a/d;

    invoke-virtual {v0, p1}, Lcom/facebook/c/a/d;->a(Lcom/facebook/c/a/c;)Z

    move-result v0

    return v0
.end method

.method public attachRecyclableViewToParent(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .prologue
    .line 225
    instance-of v0, p1, Lcom/facebook/widget/j;

    if-eqz v0, :cond_0

    .line 226
    invoke-static {p0, p1, p2}, Lcom/facebook/widget/q;->a(Lcom/facebook/widget/g;Landroid/view/View;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 235
    :goto_0
    return-void

    .line 232
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->onFinishTemporaryDetach()V

    .line 233
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->attachViewToParent(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 234
    invoke-virtual {p0}, Lcom/facebook/widget/f;->requestLayout()V

    goto :goto_0
.end method

.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    .prologue
    .line 166
    instance-of v0, p1, Landroid/widget/FrameLayout$LayoutParams;

    return v0
.end method

.method public detachRecyclableViewFromParent(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 204
    invoke-virtual {p1}, Landroid/view/View;->onStartTemporaryDetach()V

    .line 205
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->detachViewFromParent(Landroid/view/View;)V

    .line 208
    invoke-virtual {p0}, Lcom/facebook/widget/f;->requestLayout()V

    .line 209
    return-void
.end method

.method public detachRecyclableViewsFromParent(II)V
    .locals 2

    .prologue
    .line 213
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_1

    .line 214
    add-int v1, p1, v0

    invoke-virtual {p0, v1}, Lcom/facebook/widget/f;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 215
    if-eqz v1, :cond_0

    .line 216
    invoke-virtual {v1}, Landroid/view/View;->onStartTemporaryDetach()V

    .line 213
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 219
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->detachViewsFromParent(II)V

    .line 220
    invoke-virtual {p0}, Lcom/facebook/widget/f;->requestLayout()V

    .line 221
    return-void
.end method

.method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 150
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .prologue
    .line 158
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p0}, Lcom/facebook/widget/f;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .prologue
    .line 171
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, p1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method protected getEventBus()Lcom/facebook/c/a/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/facebook/c/a/b;",
            ">()TT;"
        }
    .end annotation

    .prologue
    .line 282
    const/4 v0, 0x0

    return-object v0
.end method

.method public getInjector()Lcom/facebook/inject/t;
    .locals 1

    .prologue
    .line 182
    invoke-virtual {p0}, Lcom/facebook/widget/f;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    return-object v0
.end method

.method protected getView(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    .prologue
    .line 187
    invoke-virtual {p0, p1}, Lcom/facebook/widget/f;->findViewById(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method protected getViewRequired(I)Landroid/view/View;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    .prologue
    .line 192
    invoke-virtual {p0, p1}, Lcom/facebook/widget/f;->getView(I)Landroid/view/View;

    move-result-object v0

    .line 195
    if-nez v0, :cond_0

    .line 196
    invoke-virtual {p0}, Lcom/facebook/widget/f;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v1

    .line 197
    const-string v2, "Required view with ID %s not found"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    invoke-static {v0, v2, v3}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    :cond_0
    return-object v0
.end method

.method protected layoutChild(IIIILandroid/view/View;)V
    .locals 6

    .prologue
    .line 95
    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 97
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    .line 98
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    .line 103
    iget v3, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 105
    const/4 v4, -0x1

    if-eq v3, v4, :cond_0

    .line 106
    and-int/lit8 v4, v3, 0x7

    .line 107
    and-int/lit8 v3, v3, 0x70

    .line 109
    packed-switch v4, :pswitch_data_0

    .line 121
    :pswitch_0
    iget v4, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    add-int/2addr p1, v4

    .line 124
    :goto_0
    sparse-switch v3, :sswitch_data_0

    .line 136
    iget v0, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    add-int/2addr p3, v0

    .line 140
    :cond_0
    :goto_1
    add-int v0, p1, v1

    add-int v1, p3, v2

    invoke-virtual {p5, p1, p3, v0, v1}, Landroid/view/View;->layout(IIII)V

    .line 141
    return-void

    .line 111
    :pswitch_1
    iget v4, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    add-int/2addr p1, v4

    .line 112
    goto :goto_0

    .line 114
    :pswitch_2
    sub-int v4, p2, p1

    sub-int/2addr v4, v1

    div-int/lit8 v4, v4, 0x2

    add-int/2addr v4, p1

    iget v5, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    add-int/2addr v4, v5

    iget v5, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    sub-int p1, v4, v5

    .line 116
    goto :goto_0

    .line 118
    :pswitch_3
    sub-int v4, p2, v1

    iget v5, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    sub-int p1, v4, v5

    .line 119
    goto :goto_0

    .line 126
    :sswitch_0
    iget v0, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    add-int/2addr p3, v0

    .line 127
    goto :goto_1

    .line 129
    :sswitch_1
    sub-int v3, p4, p3

    sub-int/2addr v3, v2

    div-int/lit8 v3, v3, 0x2

    add-int/2addr v3, p3

    iget v4, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    add-int/2addr v3, v4

    iget v0, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    sub-int p3, v3, v0

    .line 131
    goto :goto_1

    .line 133
    :sswitch_2
    sub-int v3, p4, v2

    iget v0, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    sub-int p3, v3, v0

    .line 134
    goto :goto_1

    .line 109
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch

    .line 124
    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_1
        0x30 -> :sswitch_0
        0x50 -> :sswitch_2
    .end sparse-switch
.end method

.method protected onAttachedToWindow()V
    .locals 0

    .prologue
    .line 244
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 245
    invoke-virtual {p0}, Lcom/facebook/widget/f;->registerAllSubscribers()V

    .line 246
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .prologue
    .line 250
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 251
    invoke-virtual {p0}, Lcom/facebook/widget/f;->unregisterAllSubscribers()V

    .line 252
    return-void
.end method

.method public onFinishTemporaryDetach()V
    .locals 0

    .prologue
    .line 262
    invoke-super {p0}, Landroid/view/ViewGroup;->onFinishTemporaryDetach()V

    .line 263
    invoke-virtual {p0}, Lcom/facebook/widget/f;->registerAllSubscribers()V

    .line 264
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 9

    .prologue
    .line 77
    invoke-virtual {p0}, Lcom/facebook/widget/f;->getChildCount()I

    move-result v7

    .line 79
    invoke-virtual {p0}, Lcom/facebook/widget/f;->getPaddingLeft()I

    move-result v1

    .line 80
    invoke-virtual {p0}, Lcom/facebook/widget/f;->getRight()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/widget/f;->getLeft()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {p0}, Lcom/facebook/widget/f;->getPaddingRight()I

    move-result v2

    sub-int v2, v0, v2

    .line 82
    invoke-virtual {p0}, Lcom/facebook/widget/f;->getPaddingTop()I

    move-result v3

    .line 83
    invoke-virtual {p0}, Lcom/facebook/widget/f;->getBottom()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/widget/f;->getTop()I

    move-result v4

    sub-int/2addr v0, v4

    invoke-virtual {p0}, Lcom/facebook/widget/f;->getPaddingBottom()I

    move-result v4

    sub-int v4, v0, v4

    .line 85
    const/4 v0, 0x0

    move v6, v0

    :goto_0
    if-ge v6, v7, :cond_1

    .line 86
    invoke-virtual {p0, v6}, Lcom/facebook/widget/f;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 87
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v8, 0x8

    if-eq v0, v8, :cond_0

    move-object v0, p0

    .line 88
    invoke-virtual/range {v0 .. v5}, Lcom/facebook/widget/f;->layoutChild(IIIILandroid/view/View;)V

    .line 85
    :cond_0
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    goto :goto_0

    .line 91
    :cond_1
    return-void
.end method

.method protected onMeasure(II)V
    .locals 11

    .prologue
    const/4 v3, 0x0

    .line 48
    invoke-virtual {p0}, Lcom/facebook/widget/f;->getChildCount()I

    move-result v10

    move v9, v3

    move v7, v3

    move v8, v3

    .line 54
    :goto_0
    if-ge v9, v10, :cond_0

    .line 55
    invoke-virtual {p0, v9}, Lcom/facebook/widget/f;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 56
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v2, 0x8

    if-eq v0, v2, :cond_1

    .line 57
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/view/ViewGroup$MarginLayoutParams;

    move-object v0, p0

    move v2, p1

    move v4, p2

    move v5, v3

    .line 58
    invoke-virtual/range {v0 .. v5}, Lcom/facebook/widget/f;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 59
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget v2, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v0, v2

    iget v2, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v0, v2

    invoke-static {v7, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 60
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    iget v2, v6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v1, v2

    iget v2, v6, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v1, v2

    invoke-static {v8, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 54
    :goto_1
    add-int/lit8 v2, v9, 0x1

    move v9, v2

    move v7, v0

    move v8, v1

    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/widget/f;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/widget/f;->getPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    add-int/2addr v0, v7

    .line 66
    invoke-virtual {p0}, Lcom/facebook/widget/f;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Lcom/facebook/widget/f;->getPaddingBottom()I

    move-result v2

    add-int/2addr v1, v2

    add-int/2addr v1, v8

    .line 68
    invoke-virtual {p0}, Lcom/facebook/widget/f;->getSuggestedMinimumHeight()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 69
    invoke-virtual {p0}, Lcom/facebook/widget/f;->getSuggestedMinimumWidth()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 70
    invoke-static {v0, p1}, Lcom/facebook/widget/f;->resolveSize(II)I

    move-result v0

    invoke-static {v1, p2}, Lcom/facebook/widget/f;->resolveSize(II)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/facebook/widget/f;->setMeasuredDimension(II)V

    .line 73
    return-void

    :cond_1
    move v0, v7

    move v1, v8

    goto :goto_1
.end method

.method public onStartTemporaryDetach()V
    .locals 0

    .prologue
    .line 256
    invoke-super {p0}, Landroid/view/ViewGroup;->onStartTemporaryDetach()V

    .line 257
    invoke-virtual {p0}, Lcom/facebook/widget/f;->unregisterAllSubscribers()V

    .line 258
    return-void
.end method

.method protected registerAllSubscribers()V
    .locals 2

    .prologue
    .line 267
    iget-object v0, p0, Lcom/facebook/widget/f;->mSubscriberListManager:Lcom/facebook/c/a/d;

    if-eqz v0, :cond_0

    .line 268
    iget-object v0, p0, Lcom/facebook/widget/f;->mSubscriberListManager:Lcom/facebook/c/a/d;

    invoke-virtual {p0}, Lcom/facebook/widget/f;->getEventBus()Lcom/facebook/c/a/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/c/a/d;->a(Lcom/facebook/c/a/b;)V

    .line 270
    :cond_0
    return-void
.end method

.method protected removeFbEventSubscriber(Lcom/facebook/c/a/c;)Z
    .locals 1

    .prologue
    .line 293
    iget-object v0, p0, Lcom/facebook/widget/f;->mSubscriberListManager:Lcom/facebook/c/a/d;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/f;->mSubscriberListManager:Lcom/facebook/c/a/d;

    invoke-virtual {v0, p1}, Lcom/facebook/c/a/d;->b(Lcom/facebook/c/a/c;)Z

    move-result v0

    goto :goto_0
.end method

.method public removeRecyclableViewFromParent(Landroid/view/View;Z)V
    .locals 0

    .prologue
    .line 239
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->removeDetachedView(Landroid/view/View;Z)V

    .line 240
    return-void
.end method

.method protected setContentView(I)V
    .locals 2

    .prologue
    .line 175
    const-string v0, "CustomViewGroup.setContentView"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 176
    invoke-virtual {p0}, Lcom/facebook/widget/f;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    .line 177
    invoke-virtual {v1, p1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 178
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    .line 179
    return-void
.end method

.method protected unregisterAllSubscribers()V
    .locals 2

    .prologue
    .line 273
    iget-object v0, p0, Lcom/facebook/widget/f;->mSubscriberListManager:Lcom/facebook/c/a/d;

    if-eqz v0, :cond_0

    .line 274
    iget-object v0, p0, Lcom/facebook/widget/f;->mSubscriberListManager:Lcom/facebook/c/a/d;

    invoke-virtual {p0}, Lcom/facebook/widget/f;->getEventBus()Lcom/facebook/c/a/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/c/a/d;->b(Lcom/facebook/c/a/b;)V

    .line 276
    :cond_0
    return-void
.end method
