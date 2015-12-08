.class public Landroid/support/v7/internal/widget/LinearLayoutICS;
.super Landroid/widget/LinearLayout;
.source "LinearLayoutICS.java"


# static fields
.field private static final SHOW_DIVIDER_BEGINNING:I = 0x1

.field private static final SHOW_DIVIDER_END:I = 0x4

.field private static final SHOW_DIVIDER_MIDDLE:I = 0x2

.field private static final SHOW_DIVIDER_NONE:I


# instance fields
.field private final mDivider:Landroid/graphics/drawable/Drawable;

.field private final mDividerHeight:I

.field private final mDividerPadding:I

.field private final mDividerWidth:I

.field private final mShowDividers:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 44
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 46
    sget-object v3, Landroid/support/v7/appcompat/R$styleable;->LinearLayoutICS:[I

    invoke-virtual {p1, p2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 48
    .local v0, "a":Landroid/content/res/TypedArray;
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    iput-object v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDivider:Landroid/graphics/drawable/Drawable;

    .line 49
    iget-object v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDivider:Landroid/graphics/drawable/Drawable;

    if-eqz v3, :cond_0

    .line 50
    iget-object v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDivider:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    iput v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerWidth:I

    .line 51
    iget-object v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDivider:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    iput v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerHeight:I

    .line 56
    :goto_0
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mShowDividers:I

    .line 57
    const/4 v3, 0x2

    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerPadding:I

    .line 59
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 61
    iget-object v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDivider:Landroid/graphics/drawable/Drawable;

    if-nez v3, :cond_1

    :goto_1
    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/LinearLayoutICS;->setWillNotDraw(Z)V

    .line 62
    return-void

    .line 53
    :cond_0
    iput v2, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerWidth:I

    iput v2, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerHeight:I

    goto :goto_0

    :cond_1
    move v1, v2

    .line 61
    goto :goto_1
.end method


# virtual methods
.method drawSupportDividersHorizontal(Landroid/graphics/Canvas;)V
    .locals 7
    .param p1, "canvas"    # Landroid/graphics/Canvas;

    .prologue
    .line 135
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getChildCount()I

    move-result v1

    .line 136
    .local v1, "count":I
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    if-ge v2, v1, :cond_1

    .line 137
    invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 138
    .local v0, "child":Landroid/view/View;
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v5

    const/16 v6, 0x8

    if-eq v5, v6, :cond_0

    invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/LinearLayoutICS;->hasSupportDividerBeforeChildAt(I)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 140
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 141
    .local v3, "lp":Landroid/widget/LinearLayout$LayoutParams;
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v5

    iget v6, v3, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    sub-int/2addr v5, v6

    invoke-virtual {p0, p1, v5}, Landroid/support/v7/internal/widget/LinearLayoutICS;->drawSupportVerticalDivider(Landroid/graphics/Canvas;I)V

    .line 136
    .end local v3    # "lp":Landroid/widget/LinearLayout$LayoutParams;
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 145
    .end local v0    # "child":Landroid/view/View;
    :cond_1
    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/LinearLayoutICS;->hasSupportDividerBeforeChildAt(I)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 146
    add-int/lit8 v5, v1, -0x1

    invoke-virtual {p0, v5}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 147
    .restart local v0    # "child":Landroid/view/View;
    const/4 v4, 0x0

    .line 148
    .local v4, "right":I
    if-nez v0, :cond_3

    .line 149
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getWidth()I

    move-result v5

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getPaddingRight()I

    move-result v6

    sub-int/2addr v5, v6

    iget v6, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerWidth:I

    sub-int v4, v5, v6

    .line 153
    :goto_1
    invoke-virtual {p0, p1, v4}, Landroid/support/v7/internal/widget/LinearLayoutICS;->drawSupportVerticalDivider(Landroid/graphics/Canvas;I)V

    .line 155
    .end local v0    # "child":Landroid/view/View;
    .end local v4    # "right":I
    :cond_2
    return-void

    .line 151
    .restart local v0    # "child":Landroid/view/View;
    .restart local v4    # "right":I
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v4

    goto :goto_1
.end method

.method drawSupportDividersVertical(Landroid/graphics/Canvas;)V
    .locals 7
    .param p1, "canvas"    # Landroid/graphics/Canvas;

    .prologue
    .line 112
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getChildCount()I

    move-result v2

    .line 113
    .local v2, "count":I
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    if-ge v3, v2, :cond_1

    .line 114
    invoke-virtual {p0, v3}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 115
    .local v1, "child":Landroid/view/View;
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v5

    const/16 v6, 0x8

    if-eq v5, v6, :cond_0

    invoke-virtual {p0, v3}, Landroid/support/v7/internal/widget/LinearLayoutICS;->hasSupportDividerBeforeChildAt(I)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 117
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 118
    .local v4, "lp":Landroid/widget/LinearLayout$LayoutParams;
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v5

    iget v6, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    sub-int/2addr v5, v6

    invoke-virtual {p0, p1, v5}, Landroid/support/v7/internal/widget/LinearLayoutICS;->drawSupportHorizontalDivider(Landroid/graphics/Canvas;I)V

    .line 113
    .end local v4    # "lp":Landroid/widget/LinearLayout$LayoutParams;
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 122
    .end local v1    # "child":Landroid/view/View;
    :cond_1
    invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/LinearLayoutICS;->hasSupportDividerBeforeChildAt(I)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 123
    add-int/lit8 v5, v2, -0x1

    invoke-virtual {p0, v5}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 124
    .restart local v1    # "child":Landroid/view/View;
    const/4 v0, 0x0

    .line 125
    .local v0, "bottom":I
    if-nez v1, :cond_3

    .line 126
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getHeight()I

    move-result v5

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getPaddingBottom()I

    move-result v6

    sub-int/2addr v5, v6

    iget v6, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerHeight:I

    sub-int v0, v5, v6

    .line 130
    :goto_1
    invoke-virtual {p0, p1, v0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->drawSupportHorizontalDivider(Landroid/graphics/Canvas;I)V

    .line 132
    .end local v0    # "bottom":I
    .end local v1    # "child":Landroid/view/View;
    :cond_2
    return-void

    .line 128
    .restart local v0    # "bottom":I
    .restart local v1    # "child":Landroid/view/View;
    :cond_3
    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v0

    goto :goto_1
.end method

.method drawSupportHorizontalDivider(Landroid/graphics/Canvas;I)V
    .locals 4
    .param p1, "canvas"    # Landroid/graphics/Canvas;
    .param p2, "top"    # I

    .prologue
    .line 158
    iget-object v0, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDivider:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getPaddingLeft()I

    move-result v1

    iget v2, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerPadding:I

    add-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    iget v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerPadding:I

    sub-int/2addr v2, v3

    iget v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerHeight:I

    add-int/2addr v3, p2

    invoke-virtual {v0, v1, p2, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 160
    iget-object v0, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDivider:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 161
    return-void
.end method

.method drawSupportVerticalDivider(Landroid/graphics/Canvas;I)V
    .locals 5
    .param p1, "canvas"    # Landroid/graphics/Canvas;
    .param p2, "left"    # I

    .prologue
    .line 164
    iget-object v0, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDivider:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getPaddingTop()I

    move-result v1

    iget v2, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerPadding:I

    add-int/2addr v1, v2

    iget v2, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerWidth:I

    add-int/2addr v2, p2

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getHeight()I

    move-result v3

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    iget v4, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerPadding:I

    sub-int/2addr v3, v4

    invoke-virtual {v0, p2, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 166
    iget-object v0, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDivider:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 167
    return-void
.end method

.method public getSupportDividerWidth()I
    .locals 1

    .prologue
    .line 65
    iget v0, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerWidth:I

    return v0
.end method

.method protected hasSupportDividerBeforeChildAt(I)Z
    .locals 5
    .param p1, "childIndex"    # I

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 176
    if-nez p1, :cond_2

    .line 177
    iget v4, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mShowDividers:I

    and-int/lit8 v4, v4, 0x1

    if-eqz v4, :cond_1

    .line 190
    :cond_0
    :goto_0
    return v2

    :cond_1
    move v2, v3

    .line 177
    goto :goto_0

    .line 178
    :cond_2
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getChildCount()I

    move-result v4

    if-ne p1, v4, :cond_3

    .line 179
    iget v4, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mShowDividers:I

    and-int/lit8 v4, v4, 0x4

    if-nez v4, :cond_0

    move v2, v3

    goto :goto_0

    .line 180
    :cond_3
    iget v2, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mShowDividers:I

    and-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_6

    .line 181
    const/4 v0, 0x0

    .line 182
    .local v0, "hasVisibleViewBefore":Z
    add-int/lit8 v1, p1, -0x1

    .local v1, "i":I
    :goto_1
    if-ltz v1, :cond_4

    .line 183
    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-eq v2, v3, :cond_5

    .line 184
    const/4 v0, 0x1

    :cond_4
    move v2, v0

    .line 188
    goto :goto_0

    .line 182
    :cond_5
    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    .end local v0    # "hasVisibleViewBefore":Z
    .end local v1    # "i":I
    :cond_6
    move v2, v3

    .line 190
    goto :goto_0
.end method

.method protected measureChildWithMargins(Landroid/view/View;IIII)V
    .locals 5
    .param p1, "child"    # Landroid/view/View;
    .param p2, "parentWidthMeasureSpec"    # I
    .param p3, "widthUsed"    # I
    .param p4, "parentHeightMeasureSpec"    # I
    .param p5, "heightUsed"    # I

    .prologue
    .line 85
    iget-object v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDivider:Landroid/graphics/drawable/Drawable;

    if-eqz v3, :cond_0

    .line 86
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/LinearLayoutICS;->indexOfChild(Landroid/view/View;)I

    move-result v0

    .line 87
    .local v0, "childIndex":I
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getChildCount()I

    move-result v1

    .line 88
    .local v1, "count":I
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 92
    .local v2, "params":Landroid/widget/LinearLayout$LayoutParams;
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getOrientation()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_2

    .line 93
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->hasSupportDividerBeforeChildAt(I)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 94
    iget v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerHeight:I

    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 107
    .end local v0    # "childIndex":I
    .end local v1    # "count":I
    .end local v2    # "params":Landroid/widget/LinearLayout$LayoutParams;
    :cond_0
    :goto_0
    invoke-super/range {p0 .. p5}, Landroid/widget/LinearLayout;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 109
    return-void

    .line 95
    .restart local v0    # "childIndex":I
    .restart local v1    # "count":I
    .restart local v2    # "params":Landroid/widget/LinearLayout$LayoutParams;
    :cond_1
    add-int/lit8 v3, v1, -0x1

    if-ne v0, v3, :cond_0

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/LinearLayoutICS;->hasSupportDividerBeforeChildAt(I)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 96
    iget v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerHeight:I

    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    goto :goto_0

    .line 99
    :cond_2
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->hasSupportDividerBeforeChildAt(I)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 100
    iget v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerWidth:I

    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    goto :goto_0

    .line 101
    :cond_3
    add-int/lit8 v3, v1, -0x1

    if-ne v0, v3, :cond_0

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/LinearLayoutICS;->hasSupportDividerBeforeChildAt(I)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 102
    iget v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerWidth:I

    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    goto :goto_0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 2
    .param p1, "canvas"    # Landroid/graphics/Canvas;

    .prologue
    .line 70
    iget-object v0, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDivider:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    .line 79
    :goto_0
    return-void

    .line 74
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getOrientation()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 75
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/LinearLayoutICS;->drawSupportDividersVertical(Landroid/graphics/Canvas;)V

    goto :goto_0

    .line 77
    :cond_1
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/LinearLayoutICS;->drawSupportDividersHorizontal(Landroid/graphics/Canvas;)V

    goto :goto_0
.end method
