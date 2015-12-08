.class public Lcom/aetn/history/android/historyhere/widgets/FontFitTextView;
.super Landroid/widget/TextView;
.source "FontFitTextView.java"


# instance fields
.field private mTestPaint:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 12
    invoke-direct {p0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 13
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/widgets/FontFitTextView;->initialise()V

    .line 14
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 17
    invoke-direct {p0, p1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 18
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/widgets/FontFitTextView;->initialise()V

    .line 19
    return-void
.end method

.method private initialise()V
    .locals 2

    .prologue
    .line 22
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/widgets/FontFitTextView;->mTestPaint:Landroid/graphics/Paint;

    .line 23
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/widgets/FontFitTextView;->mTestPaint:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/widgets/FontFitTextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    .line 25
    return-void
.end method

.method private refitText(Ljava/lang/String;I)V
    .locals 7
    .param p1, "text"    # Ljava/lang/String;
    .param p2, "textWidth"    # I

    .prologue
    .line 32
    if-gtz p2, :cond_0

    .line 52
    :goto_0
    return-void

    .line 34
    :cond_0
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/widgets/FontFitTextView;->getPaddingLeft()I

    move-result v5

    sub-int v5, p2, v5

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/widgets/FontFitTextView;->getPaddingRight()I

    move-result v6

    sub-int v3, v5, v6

    .line 36
    .local v3, "targetWidth":I
    const/high16 v0, 0x41b00000    # 22.0f

    .line 37
    .local v0, "hi":F
    const/high16 v1, 0x40000000    # 2.0f

    .line 38
    .local v1, "lo":F
    const/high16 v4, 0x3f000000    # 0.5f

    .line 40
    .local v4, "threshold":F
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/widgets/FontFitTextView;->mTestPaint:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/widgets/FontFitTextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    .line 42
    :goto_1
    sub-float v5, v0, v1

    const/high16 v6, 0x3f000000    # 0.5f

    cmpl-float v5, v5, v6

    if-lez v5, :cond_2

    .line 43
    add-float v5, v0, v1

    const/high16 v6, 0x40000000    # 2.0f

    div-float v2, v5, v6

    .line 44
    .local v2, "size":F
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/widgets/FontFitTextView;->mTestPaint:Landroid/graphics/Paint;

    invoke-virtual {v5, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 45
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/widgets/FontFitTextView;->mTestPaint:Landroid/graphics/Paint;

    invoke-virtual {v5, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v5

    int-to-float v6, v3

    cmpl-float v5, v5, v6

    if-ltz v5, :cond_1

    .line 46
    move v0, v2

    goto :goto_1

    .line 48
    :cond_1
    move v1, v2

    goto :goto_1

    .line 51
    .end local v2    # "size":F
    :cond_2
    const/4 v5, 0x0

    invoke-virtual {p0, v5, v1}, Lcom/aetn/history/android/historyhere/widgets/FontFitTextView;->setTextSize(IF)V

    goto :goto_0
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 3
    .param p1, "widthMeasureSpec"    # I
    .param p2, "heightMeasureSpec"    # I

    .prologue
    .line 57
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->onMeasure(II)V

    .line 58
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 59
    .local v1, "parentWidth":I
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/widgets/FontFitTextView;->getMeasuredHeight()I

    move-result v0

    .line 60
    .local v0, "height":I
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/widgets/FontFitTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2, v1}, Lcom/aetn/history/android/historyhere/widgets/FontFitTextView;->refitText(Ljava/lang/String;I)V

    .line 61
    invoke-virtual {p0, v1, v0}, Lcom/aetn/history/android/historyhere/widgets/FontFitTextView;->setMeasuredDimension(II)V

    .line 62
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 1
    .param p1, "w"    # I
    .param p2, "h"    # I
    .param p3, "oldw"    # I
    .param p4, "oldh"    # I

    .prologue
    .line 71
    if-eq p1, p3, :cond_0

    .line 72
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/widgets/FontFitTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/aetn/history/android/historyhere/widgets/FontFitTextView;->refitText(Ljava/lang/String;I)V

    .line 74
    :cond_0
    return-void
.end method

.method protected onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2
    .param p1, "text"    # Ljava/lang/CharSequence;
    .param p2, "start"    # I
    .param p3, "before"    # I
    .param p4, "after"    # I

    .prologue
    .line 66
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/widgets/FontFitTextView;->getWidth()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/aetn/history/android/historyhere/widgets/FontFitTextView;->refitText(Ljava/lang/String;I)V

    .line 67
    return-void
.end method
