.class public Lcom/facebook/widget/text/BetterTextView;
.super Landroid/widget/TextView;
.source "BetterTextView.java"


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/widget/text/b;",
            ">;"
        }
    .end annotation
.end field

.field private b:Z

.field private c:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 44
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/widget/text/BetterTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 45
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 48
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/widget/text/BetterTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 49
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 52
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 54
    sget-object v0, Lcom/facebook/q;->BetterTextView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 55
    sget v1, Lcom/facebook/q;->BetterTextView_minimallyWide:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/facebook/widget/text/BetterTextView;->b:Z

    .line 56
    sget v1, Lcom/facebook/q;->BetterTextView_maximallyWideThreshold:I

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v1

    iput v1, p0, Lcom/facebook/widget/text/BetterTextView;->c:I

    .line 59
    sget v1, Lcom/facebook/q;->BetterTextView_fontFamily:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    .line 60
    invoke-static {v1}, Lcom/facebook/widget/text/d;->fromIndex(I)Lcom/facebook/widget/text/d;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/widget/text/BetterTextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v2

    invoke-static {p0, v1, v2}, Lcom/facebook/widget/text/c;->a(Landroid/widget/TextView;Lcom/facebook/widget/text/d;Landroid/graphics/Typeface;)V

    .line 65
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 66
    return-void
.end method

.method private getMaxLineWidth()I
    .locals 6

    .prologue
    .line 208
    invoke-virtual {p0}, Lcom/facebook/widget/text/BetterTextView;->getLayout()Landroid/text/Layout;

    move-result-object v3

    .line 209
    invoke-virtual {v3}, Landroid/text/Layout;->getLineCount()I

    move-result v4

    .line 210
    const/4 v1, 0x0

    .line 211
    const/4 v0, 0x0

    move v2, v1

    move v1, v0

    :goto_0
    if-ge v1, v4, :cond_1

    .line 217
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0xe

    if-le v0, v5, :cond_0

    .line 218
    invoke-virtual {v3, v1}, Landroid/text/Layout;->getLineMax(I)F

    move-result v0

    .line 222
    :goto_1
    invoke-static {v2, v0}, Ljava/lang/Math;->max(FF)F

    move-result v2

    .line 211
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 220
    :cond_0
    invoke-virtual {v3, v1}, Landroid/text/Layout;->getLineWidth(I)F

    move-result v0

    goto :goto_1

    .line 224
    :cond_1
    float-to-int v0, v2

    return v0
.end method


# virtual methods
.method public a(Lcom/facebook/widget/text/b;)V
    .locals 1

    .prologue
    .line 123
    iget-object v0, p0, Lcom/facebook/widget/text/BetterTextView;->a:Ljava/util/List;

    if-nez v0, :cond_0

    .line 124
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/text/BetterTextView;->a:Ljava/util/List;

    .line 126
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/text/BetterTextView;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    return-void
.end method

.method public getMaximallyWideThreshold()F
    .locals 1

    .prologue
    .line 76
    iget v0, p0, Lcom/facebook/widget/text/BetterTextView;->c:I

    int-to-float v0, v0

    return v0
.end method

.method public getMinimallyWide()Z
    .locals 1

    .prologue
    .line 100
    iget-boolean v0, p0, Lcom/facebook/widget/text/BetterTextView;->b:Z

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .prologue
    .line 186
    iget-object v0, p0, Lcom/facebook/widget/text/BetterTextView;->a:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 187
    iget-object v0, p0, Lcom/facebook/widget/text/BetterTextView;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/text/b;

    .line 188
    invoke-interface {v0, p1}, Lcom/facebook/widget/text/b;->a(Landroid/graphics/Canvas;)V

    goto :goto_0

    .line 198
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/widget/text/BetterTextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v0

    instance-of v0, v0, Landroid/text/method/SingleLineTransformationMethod;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/facebook/widget/text/BetterTextView;->getMovementMethod()Landroid/text/method/MovementMethod;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 200
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/widget/text/BetterTextView;->bringPointIntoView(I)Z

    .line 203
    :cond_1
    invoke-super {p0, p1}, Landroid/widget/TextView;->onDraw(Landroid/graphics/Canvas;)V

    .line 204
    return-void
.end method

.method protected onMeasure(II)V
    .locals 9

    .prologue
    const/4 v0, 0x1

    const/high16 v8, -0x80000000

    const/high16 v7, 0x40000000    # 2.0f

    .line 149
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->onMeasure(II)V

    .line 151
    invoke-virtual {p0}, Lcom/facebook/widget/text/BetterTextView;->getLineCount()I

    move-result v1

    if-le v1, v0, :cond_2

    .line 153
    const/4 v1, 0x0

    .line 154
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    .line 155
    iget v3, p0, Lcom/facebook/widget/text/BetterTextView;->c:I

    if-lez v3, :cond_3

    .line 156
    if-ne v2, v8, :cond_3

    .line 157
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    .line 158
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    .line 159
    invoke-direct {p0}, Lcom/facebook/widget/text/BetterTextView;->getMaxLineWidth()I

    move-result v5

    .line 160
    if-ge v5, v3, :cond_3

    sub-int v5, v3, v5

    iget v6, p0, Lcom/facebook/widget/text/BetterTextView;->c:I

    if-ge v5, v6, :cond_3

    .line 162
    if-ge v4, v3, :cond_0

    .line 163
    invoke-static {v3, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 164
    invoke-super {p0, v1, p2}, Landroid/widget/TextView;->onMeasure(II)V

    .line 172
    :cond_0
    :goto_0
    iget-boolean v1, p0, Lcom/facebook/widget/text/BetterTextView;->b:Z

    if-eqz v1, :cond_2

    if-eq v2, v7, :cond_1

    if-ne v2, v8, :cond_2

    :cond_1
    if-nez v0, :cond_2

    .line 175
    invoke-direct {p0}, Lcom/facebook/widget/text/BetterTextView;->getMaxLineWidth()I

    move-result v0

    .line 176
    invoke-virtual {p0}, Lcom/facebook/widget/text/BetterTextView;->getMeasuredWidth()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 177
    invoke-static {v0, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 178
    invoke-super {p0, v0, p2}, Landroid/widget/TextView;->onMeasure(II)V

    .line 182
    :cond_2
    return-void

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .prologue
    .line 131
    const/4 v0, 0x0

    .line 132
    iget-object v1, p0, Lcom/facebook/widget/text/BetterTextView;->a:Ljava/util/List;

    if-eqz v1, :cond_1

    .line 133
    iget-object v1, p0, Lcom/facebook/widget/text/BetterTextView;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/text/b;

    .line 134
    invoke-interface {v0, p1}, Lcom/facebook/widget/text/b;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 135
    if-eqz v0, :cond_0

    .line 141
    :cond_1
    if-nez v0, :cond_2

    .line 142
    invoke-super {p0, p1}, Landroid/widget/TextView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 144
    :cond_2
    return v0
.end method

.method public setMaximallyWideThreshold(I)V
    .locals 0

    .prologue
    .line 87
    iput p1, p0, Lcom/facebook/widget/text/BetterTextView;->c:I

    .line 88
    return-void
.end method

.method public setMinimallyWide(Z)V
    .locals 0

    .prologue
    .line 113
    iput-boolean p1, p0, Lcom/facebook/widget/text/BetterTextView;->b:Z

    .line 114
    invoke-virtual {p0}, Lcom/facebook/widget/text/BetterTextView;->requestLayout()V

    .line 115
    return-void
.end method
