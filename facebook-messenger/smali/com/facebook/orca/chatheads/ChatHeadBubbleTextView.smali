.class public Lcom/facebook/orca/chatheads/ChatHeadBubbleTextView;
.super Landroid/widget/TextView;
.source "ChatHeadBubbleTextView.java"


# instance fields
.field private a:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 27
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/orca/chatheads/ChatHeadBubbleTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 31
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/chatheads/ChatHeadBubbleTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

    .prologue
    .line 35
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 37
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ChatHeadBubbleTextView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 40
    sget v1, Lcom/facebook/g;->chat_head_nux_bubble_text_shadow_radius:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    sget v2, Lcom/facebook/g;->chat_head_nux_bubble_text_shadow_dx:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    sget v3, Lcom/facebook/g;->chat_head_nux_bubble_text_shadow_dy:I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    sget v4, Lcom/facebook/f;->chat_heads_nux_bubble_shadow:I

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p0, v1, v2, v3, v0}, Lcom/facebook/orca/chatheads/ChatHeadBubbleTextView;->setShadowLayer(FFFI)V

    .line 45
    return-void
.end method

.method private getTextRealWidth()I
    .locals 3

    .prologue
    .line 65
    const/4 v1, 0x0

    .line 66
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ChatHeadBubbleTextView;->getLayout()Landroid/text/Layout;

    move-result-object v2

    invoke-virtual {v2}, Landroid/text/Layout;->getLineCount()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 67
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ChatHeadBubbleTextView;->getLayout()Landroid/text/Layout;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/text/Layout;->getLineWidth(I)F

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    .line 66
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 69
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ChatHeadBubbleTextView;->getPaddingLeft()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v0, v1

    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ChatHeadBubbleTextView;->getPaddingRight()I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 2

    .prologue
    .line 49
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->onMeasure(II)V

    .line 51
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/ChatHeadBubbleTextView;->a:Z

    if-eqz v0, :cond_0

    .line 52
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_0

    .line 53
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ChatHeadBubbleTextView;->getLayout()Landroid/text/Layout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/text/Layout;->getLineCount()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 54
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadBubbleTextView;->getTextRealWidth()I

    move-result v0

    .line 55
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ChatHeadBubbleTextView;->getMeasuredWidth()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 56
    const/high16 v1, -0x80000000

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-super {p0, v0, p2}, Landroid/widget/TextView;->onMeasure(II)V

    .line 62
    :cond_0
    return-void
.end method

.method public setMaxEms(I)V
    .locals 1

    .prologue
    .line 80
    invoke-super {p0, p1}, Landroid/widget/TextView;->setMaxEms(I)V

    .line 81
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/ChatHeadBubbleTextView;->a:Z

    .line 82
    return-void
.end method

.method public setMaxWidth(I)V
    .locals 1

    .prologue
    .line 74
    invoke-super {p0, p1}, Landroid/widget/TextView;->setMaxWidth(I)V

    .line 75
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/ChatHeadBubbleTextView;->a:Z

    .line 76
    return-void
.end method
