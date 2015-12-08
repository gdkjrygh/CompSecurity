.class public Landroid/support/v7/internal/view/menu/ActionMenuView;
.super Landroid/support/v7/internal/widget/LinearLayoutICS;
.source "ActionMenuView.java"

# interfaces
.implements Landroid/support/v7/internal/view/menu/MenuBuilder$ItemInvoker;
.implements Landroid/support/v7/internal/view/menu/MenuView;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;,
        Landroid/support/v7/internal/view/menu/ActionMenuView$ActionMenuChildView;
    }
.end annotation


# static fields
.field static final GENERATED_ITEM_PADDING:I = 0x4

.field static final MIN_CELL_SIZE:I = 0x38

.field private static final TAG:Ljava/lang/String; = "ActionMenuView"


# instance fields
.field private mFormatItems:Z

.field private mFormatItemsWidth:I

.field private mGeneratedItemPadding:I

.field private mMaxItemHeight:I

.field private mMeasuredExtraWidth:I

.field private mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

.field private mMinCellSize:I

.field private mPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

.field private mReserveOverflow:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 54
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroid/support/v7/internal/view/menu/ActionMenuView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 55
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    const/4 v4, 0x0

    .line 58
    invoke-direct {p0, p1, p2}, Landroid/support/v7/internal/widget/LinearLayoutICS;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 59
    invoke-virtual {p0, v4}, Landroid/support/v7/internal/view/menu/ActionMenuView;->setBaselineAligned(Z)V

    .line 60
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v1, v2, Landroid/util/DisplayMetrics;->density:F

    .line 61
    .local v1, "density":F
    const/high16 v2, 0x42600000    # 56.0f

    mul-float/2addr v2, v1

    float-to-int v2, v2

    iput v2, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMinCellSize:I

    .line 62
    const/high16 v2, 0x40800000    # 4.0f

    mul-float/2addr v2, v1

    float-to-int v2, v2

    iput v2, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mGeneratedItemPadding:I

    .line 64
    sget-object v2, Landroid/support/v7/appcompat/R$styleable;->ActionBar:[I

    sget v3, Landroid/support/v7/appcompat/R$attr;->actionBarStyle:I

    invoke-virtual {p1, p2, v2, v3, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 66
    .local v0, "a":Landroid/content/res/TypedArray;
    invoke-virtual {v0, v4, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMaxItemHeight:I

    .line 67
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 68
    return-void
.end method

.method static measureChildForCells(Landroid/view/View;IIII)I
    .locals 13
    .param p0, "child"    # Landroid/view/View;
    .param p1, "cellSize"    # I
    .param p2, "cellsRemaining"    # I
    .param p3, "parentHeightMeasureSpec"    # I
    .param p4, "parentHeightPadding"    # I

    .prologue
    .line 377
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    check-cast v8, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    .line 379
    .local v8, "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    invoke-static/range {p3 .. p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v11

    sub-int v2, v11, p4

    .line 381
    .local v2, "childHeightSize":I
    invoke-static/range {p3 .. p3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 382
    .local v1, "childHeightMode":I
    invoke-static {v2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    .line 384
    .local v3, "childHeightSpec":I
    instance-of v11, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;

    if-eqz v11, :cond_3

    move-object v11, p0

    check-cast v11, Landroid/support/v7/internal/view/menu/ActionMenuItemView;

    move-object v7, v11

    .line 386
    .local v7, "itemView":Landroid/support/v7/internal/view/menu/ActionMenuItemView;
    :goto_0
    if-eqz v7, :cond_4

    invoke-virtual {v7}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->hasText()Z

    move-result v11

    if-eqz v11, :cond_4

    const/4 v6, 0x1

    .line 388
    .local v6, "hasText":Z
    :goto_1
    const/4 v0, 0x0

    .line 389
    .local v0, "cellsUsed":I
    if-lez p2, :cond_2

    if-eqz v6, :cond_0

    const/4 v11, 0x2

    if-lt p2, v11, :cond_2

    .line 390
    :cond_0
    mul-int v11, p1, p2

    const/high16 v12, -0x80000000

    invoke-static {v11, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    .line 392
    .local v4, "childWidthSpec":I
    invoke-virtual {p0, v4, v3}, Landroid/view/View;->measure(II)V

    .line 394
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    .line 395
    .local v9, "measuredWidth":I
    div-int v0, v9, p1

    .line 396
    rem-int v11, v9, p1

    if-eqz v11, :cond_1

    .line 397
    add-int/lit8 v0, v0, 0x1

    .line 399
    :cond_1
    if-eqz v6, :cond_2

    const/4 v11, 0x2

    if-ge v0, v11, :cond_2

    .line 400
    const/4 v0, 0x2

    .line 404
    .end local v4    # "childWidthSpec":I
    .end local v9    # "measuredWidth":I
    :cond_2
    iget-boolean v11, v8, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z

    if-nez v11, :cond_5

    if-eqz v6, :cond_5

    const/4 v5, 0x1

    .line 405
    .local v5, "expandable":Z
    :goto_2
    iput-boolean v5, v8, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->expandable:Z

    .line 407
    iput v0, v8, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I

    .line 408
    mul-int v10, v0, p1

    .line 409
    .local v10, "targetWidth":I
    const/high16 v11, 0x40000000    # 2.0f

    invoke-static {v10, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v11

    invoke-virtual {p0, v11, v3}, Landroid/view/View;->measure(II)V

    .line 411
    return v0

    .line 384
    .end local v0    # "cellsUsed":I
    .end local v5    # "expandable":Z
    .end local v6    # "hasText":Z
    .end local v7    # "itemView":Landroid/support/v7/internal/view/menu/ActionMenuItemView;
    .end local v10    # "targetWidth":I
    :cond_3
    const/4 v7, 0x0

    goto :goto_0

    .line 386
    .restart local v7    # "itemView":Landroid/support/v7/internal/view/menu/ActionMenuItemView;
    :cond_4
    const/4 v6, 0x0

    goto :goto_1

    .line 404
    .restart local v0    # "cellsUsed":I
    .restart local v6    # "hasText":Z
    :cond_5
    const/4 v5, 0x0

    goto :goto_2
.end method

.method private onMeasureExactFormat(II)V
    .locals 42
    .param p1, "widthMeasureSpec"    # I
    .param p2, "heightMeasureSpec"    # I

    .prologue
    .line 126
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v17

    .line 127
    .local v17, "heightMode":I
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v37

    .line 128
    .local v37, "widthSize":I
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v19

    .line 130
    .local v19, "heightSize":I
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getPaddingLeft()I

    move-result v38

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getPaddingRight()I

    move-result v39

    add-int v36, v38, v39

    .line 131
    .local v36, "widthPadding":I
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getPaddingTop()I

    move-result v38

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getPaddingBottom()I

    move-result v39

    add-int v18, v38, v39

    .line 133
    .local v18, "heightPadding":I
    const/high16 v38, 0x40000000    # 2.0f

    move/from16 v0, v17

    move/from16 v1, v38

    if-ne v0, v1, :cond_0

    sub-int v38, v19, v18

    const/high16 v39, 0x40000000    # 2.0f

    invoke-static/range {v38 .. v39}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v22

    .line 138
    .local v22, "itemHeightSpec":I
    :goto_0
    sub-int v37, v37, v36

    .line 141
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMinCellSize:I

    move/from16 v38, v0

    div-int v4, v37, v38

    .line 142
    .local v4, "cellCount":I
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMinCellSize:I

    move/from16 v38, v0

    rem-int v6, v37, v38

    .line 144
    .local v6, "cellSizeRemaining":I
    if-nez v4, :cond_1

    .line 146
    const/16 v38, 0x0

    move-object/from16 v0, p0

    move/from16 v1, v37

    move/from16 v2, v38

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/internal/view/menu/ActionMenuView;->setMeasuredDimension(II)V

    .line 360
    :goto_1
    return-void

    .line 133
    .end local v4    # "cellCount":I
    .end local v6    # "cellSizeRemaining":I
    .end local v22    # "itemHeightSpec":I
    :cond_0
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMaxItemHeight:I

    move/from16 v38, v0

    sub-int v39, v19, v18

    invoke-static/range {v38 .. v39}, Ljava/lang/Math;->min(II)I

    move-result v38

    const/high16 v39, -0x80000000

    invoke-static/range {v38 .. v39}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v22

    goto :goto_0

    .line 150
    .restart local v4    # "cellCount":I
    .restart local v6    # "cellSizeRemaining":I
    .restart local v22    # "itemHeightSpec":I
    :cond_1
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMinCellSize:I

    move/from16 v38, v0

    div-int v39, v6, v4

    add-int v5, v38, v39

    .line 152
    .local v5, "cellSize":I
    move v8, v4

    .line 153
    .local v8, "cellsRemaining":I
    const/16 v25, 0x0

    .line 154
    .local v25, "maxChildHeight":I
    const/16 v24, 0x0

    .line 155
    .local v24, "maxCellsUsed":I
    const/4 v14, 0x0

    .line 156
    .local v14, "expandableItemCount":I
    const/16 v34, 0x0

    .line 157
    .local v34, "visibleItemCount":I
    const/16 v16, 0x0

    .line 160
    .local v16, "hasOverflow":Z
    const-wide/16 v32, 0x0

    .line 162
    .local v32, "smallestItemsAt":J
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildCount()I

    move-result v12

    .line 163
    .local v12, "childCount":I
    const/16 v20, 0x0

    .local v20, "i":I
    :goto_2
    move/from16 v0, v20

    if-ge v0, v12, :cond_9

    .line 164
    move-object/from16 v0, p0

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    .line 165
    .local v11, "child":Landroid/view/View;
    invoke-virtual {v11}, Landroid/view/View;->getVisibility()I

    move-result v38

    const/16 v39, 0x8

    move/from16 v0, v38

    move/from16 v1, v39

    if-ne v0, v1, :cond_3

    .line 163
    :cond_2
    :goto_3
    add-int/lit8 v20, v20, 0x1

    goto :goto_2

    .line 169
    :cond_3
    instance-of v0, v11, Landroid/support/v7/internal/view/menu/ActionMenuItemView;

    move/from16 v21, v0

    .line 170
    .local v21, "isGeneratedItem":Z
    add-int/lit8 v34, v34, 0x1

    .line 172
    if-eqz v21, :cond_4

    .line 175
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mGeneratedItemPadding:I

    move/from16 v38, v0

    const/16 v39, 0x0

    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mGeneratedItemPadding:I

    move/from16 v40, v0

    const/16 v41, 0x0

    move/from16 v0, v38

    move/from16 v1, v39

    move/from16 v2, v40

    move/from16 v3, v41

    invoke-virtual {v11, v0, v1, v2, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 178
    :cond_4
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v23

    check-cast v23, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    .line 179
    .local v23, "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    const/16 v38, 0x0

    move/from16 v0, v38

    move-object/from16 v1, v23

    iput-boolean v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->expanded:Z

    .line 180
    const/16 v38, 0x0

    move/from16 v0, v38

    move-object/from16 v1, v23

    iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->extraPixels:I

    .line 181
    const/16 v38, 0x0

    move/from16 v0, v38

    move-object/from16 v1, v23

    iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I

    .line 182
    const/16 v38, 0x0

    move/from16 v0, v38

    move-object/from16 v1, v23

    iput-boolean v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->expandable:Z

    .line 183
    const/16 v38, 0x0

    move/from16 v0, v38

    move-object/from16 v1, v23

    iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->leftMargin:I

    .line 184
    const/16 v38, 0x0

    move/from16 v0, v38

    move-object/from16 v1, v23

    iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->rightMargin:I

    .line 185
    if-eqz v21, :cond_7

    move-object/from16 v38, v11

    check-cast v38, Landroid/support/v7/internal/view/menu/ActionMenuItemView;

    invoke-virtual/range {v38 .. v38}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->hasText()Z

    move-result v38

    if-eqz v38, :cond_7

    const/16 v38, 0x1

    :goto_4
    move/from16 v0, v38

    move-object/from16 v1, v23

    iput-boolean v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->preventEdgeOffset:Z

    .line 188
    move-object/from16 v0, v23

    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z

    move/from16 v38, v0

    if-eqz v38, :cond_8

    const/4 v7, 0x1

    .line 190
    .local v7, "cellsAvailable":I
    :goto_5
    move/from16 v0, v22

    move/from16 v1, v18

    invoke-static {v11, v5, v7, v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->measureChildForCells(Landroid/view/View;IIII)I

    move-result v9

    .line 193
    .local v9, "cellsUsed":I
    move/from16 v0, v24

    invoke-static {v0, v9}, Ljava/lang/Math;->max(II)I

    move-result v24

    .line 194
    move-object/from16 v0, v23

    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->expandable:Z

    move/from16 v38, v0

    if-eqz v38, :cond_5

    .line 195
    add-int/lit8 v14, v14, 0x1

    .line 197
    :cond_5
    move-object/from16 v0, v23

    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z

    move/from16 v38, v0

    if-eqz v38, :cond_6

    .line 198
    const/16 v16, 0x1

    .line 201
    :cond_6
    sub-int/2addr v8, v9

    .line 202
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    move-result v38

    move/from16 v0, v25

    move/from16 v1, v38

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v25

    .line 203
    const/16 v38, 0x1

    move/from16 v0, v38

    if-ne v9, v0, :cond_2

    .line 204
    const/16 v38, 0x1

    shl-int v38, v38, v20

    move/from16 v0, v38

    int-to-long v0, v0

    move-wide/from16 v38, v0

    or-long v32, v32, v38

    goto/16 :goto_3

    .line 185
    .end local v7    # "cellsAvailable":I
    .end local v9    # "cellsUsed":I
    :cond_7
    const/16 v38, 0x0

    goto :goto_4

    :cond_8
    move v7, v8

    .line 188
    goto :goto_5

    .line 210
    .end local v11    # "child":Landroid/view/View;
    .end local v21    # "isGeneratedItem":Z
    .end local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    :cond_9
    if-eqz v16, :cond_b

    const/16 v38, 0x2

    move/from16 v0, v34

    move/from16 v1, v38

    if-ne v0, v1, :cond_b

    const/4 v10, 0x1

    .line 215
    .local v10, "centerSingleExpandedItem":Z
    :goto_6
    const/16 v30, 0x0

    .line 216
    .local v30, "needsExpansion":Z
    :goto_7
    if-lez v14, :cond_f

    if-lez v8, :cond_f

    .line 217
    const v26, 0x7fffffff

    .line 218
    .local v26, "minCells":I
    const-wide/16 v27, 0x0

    .line 219
    .local v27, "minCellsAt":J
    const/16 v29, 0x0

    .line 220
    .local v29, "minCellsItemCount":I
    const/16 v20, 0x0

    :goto_8
    move/from16 v0, v20

    if-ge v0, v12, :cond_e

    .line 221
    move-object/from16 v0, p0

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    .line 222
    .restart local v11    # "child":Landroid/view/View;
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v23

    check-cast v23, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    .line 225
    .restart local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    move-object/from16 v0, v23

    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->expandable:Z

    move/from16 v38, v0

    if-nez v38, :cond_c

    .line 220
    :cond_a
    :goto_9
    add-int/lit8 v20, v20, 0x1

    goto :goto_8

    .line 210
    .end local v10    # "centerSingleExpandedItem":Z
    .end local v11    # "child":Landroid/view/View;
    .end local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    .end local v26    # "minCells":I
    .end local v27    # "minCellsAt":J
    .end local v29    # "minCellsItemCount":I
    .end local v30    # "needsExpansion":Z
    :cond_b
    const/4 v10, 0x0

    goto :goto_6

    .line 230
    .restart local v10    # "centerSingleExpandedItem":Z
    .restart local v11    # "child":Landroid/view/View;
    .restart local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    .restart local v26    # "minCells":I
    .restart local v27    # "minCellsAt":J
    .restart local v29    # "minCellsItemCount":I
    .restart local v30    # "needsExpansion":Z
    :cond_c
    move-object/from16 v0, v23

    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I

    move/from16 v38, v0

    move/from16 v0, v38

    move/from16 v1, v26

    if-ge v0, v1, :cond_d

    .line 231
    move-object/from16 v0, v23

    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I

    move/from16 v26, v0

    .line 232
    const/16 v38, 0x1

    shl-int v38, v38, v20

    move/from16 v0, v38

    int-to-long v0, v0

    move-wide/from16 v27, v0

    .line 233
    const/16 v29, 0x1

    goto :goto_9

    .line 234
    :cond_d
    move-object/from16 v0, v23

    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I

    move/from16 v38, v0

    move/from16 v0, v38

    move/from16 v1, v26

    if-ne v0, v1, :cond_a

    .line 235
    const/16 v38, 0x1

    shl-int v38, v38, v20

    move/from16 v0, v38

    int-to-long v0, v0

    move-wide/from16 v38, v0

    or-long v27, v27, v38

    .line 236
    add-int/lit8 v29, v29, 0x1

    goto :goto_9

    .line 241
    .end local v11    # "child":Landroid/view/View;
    .end local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    :cond_e
    or-long v32, v32, v27

    .line 243
    move/from16 v0, v29

    if-le v0, v8, :cond_14

    .line 276
    .end local v26    # "minCells":I
    .end local v27    # "minCellsAt":J
    .end local v29    # "minCellsItemCount":I
    :cond_f
    if-nez v16, :cond_19

    const/16 v38, 0x1

    move/from16 v0, v34

    move/from16 v1, v38

    if-ne v0, v1, :cond_19

    const/16 v31, 0x1

    .line 277
    .local v31, "singleItem":Z
    :goto_a
    if-lez v8, :cond_21

    const-wide/16 v38, 0x0

    cmp-long v38, v32, v38

    if-eqz v38, :cond_21

    add-int/lit8 v38, v34, -0x1

    move/from16 v0, v38

    if-lt v8, v0, :cond_10

    if-nez v31, :cond_10

    const/16 v38, 0x1

    move/from16 v0, v24

    move/from16 v1, v38

    if-le v0, v1, :cond_21

    .line 279
    :cond_10
    invoke-static/range {v32 .. v33}, Ljava/lang/Long;->bitCount(J)I

    move-result v38

    move/from16 v0, v38

    int-to-float v13, v0

    .line 281
    .local v13, "expandCount":F
    if-nez v31, :cond_12

    .line 283
    const-wide/16 v38, 0x1

    and-long v38, v38, v32

    const-wide/16 v40, 0x0

    cmp-long v38, v38, v40

    if-eqz v38, :cond_11

    .line 284
    const/16 v38, 0x0

    move-object/from16 v0, p0

    move/from16 v1, v38

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v38

    invoke-virtual/range {v38 .. v38}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v23

    check-cast v23, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    .line 285
    .restart local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    move-object/from16 v0, v23

    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->preventEdgeOffset:Z

    move/from16 v38, v0

    if-nez v38, :cond_11

    .line 286
    const/high16 v38, 0x3f000000    # 0.5f

    sub-float v13, v13, v38

    .line 289
    .end local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    :cond_11
    const/16 v38, 0x1

    add-int/lit8 v39, v12, -0x1

    shl-int v38, v38, v39

    move/from16 v0, v38

    int-to-long v0, v0

    move-wide/from16 v38, v0

    and-long v38, v38, v32

    const-wide/16 v40, 0x0

    cmp-long v38, v38, v40

    if-eqz v38, :cond_12

    .line 290
    add-int/lit8 v38, v12, -0x1

    move-object/from16 v0, p0

    move/from16 v1, v38

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v38

    invoke-virtual/range {v38 .. v38}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v23

    check-cast v23, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    .line 291
    .restart local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    move-object/from16 v0, v23

    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->preventEdgeOffset:Z

    move/from16 v38, v0

    if-nez v38, :cond_12

    .line 292
    const/high16 v38, 0x3f000000    # 0.5f

    sub-float v13, v13, v38

    .line 297
    .end local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    :cond_12
    const/16 v38, 0x0

    cmpl-float v38, v13, v38

    if-lez v38, :cond_1a

    mul-int v38, v8, v5

    move/from16 v0, v38

    int-to-float v0, v0

    move/from16 v38, v0

    div-float v38, v38, v13

    move/from16 v0, v38

    float-to-int v15, v0

    .line 300
    .local v15, "extraPixels":I
    :goto_b
    const/16 v20, 0x0

    :goto_c
    move/from16 v0, v20

    if-ge v0, v12, :cond_20

    .line 301
    const/16 v38, 0x1

    shl-int v38, v38, v20

    move/from16 v0, v38

    int-to-long v0, v0

    move-wide/from16 v38, v0

    and-long v38, v38, v32

    const-wide/16 v40, 0x0

    cmp-long v38, v38, v40

    if-nez v38, :cond_1b

    .line 300
    :cond_13
    :goto_d
    add-int/lit8 v20, v20, 0x1

    goto :goto_c

    .line 248
    .end local v13    # "expandCount":F
    .end local v15    # "extraPixels":I
    .end local v31    # "singleItem":Z
    .restart local v26    # "minCells":I
    .restart local v27    # "minCellsAt":J
    .restart local v29    # "minCellsItemCount":I
    :cond_14
    add-int/lit8 v26, v26, 0x1

    .line 250
    const/16 v20, 0x0

    :goto_e
    move/from16 v0, v20

    if-ge v0, v12, :cond_18

    .line 251
    move-object/from16 v0, p0

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    .line 252
    .restart local v11    # "child":Landroid/view/View;
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v23

    check-cast v23, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    .line 253
    .restart local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    const/16 v38, 0x1

    shl-int v38, v38, v20

    move/from16 v0, v38

    int-to-long v0, v0

    move-wide/from16 v38, v0

    and-long v38, v38, v27

    const-wide/16 v40, 0x0

    cmp-long v38, v38, v40

    if-nez v38, :cond_16

    .line 255
    move-object/from16 v0, v23

    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I

    move/from16 v38, v0

    move/from16 v0, v38

    move/from16 v1, v26

    if-ne v0, v1, :cond_15

    .line 256
    const/16 v38, 0x1

    shl-int v38, v38, v20

    move/from16 v0, v38

    int-to-long v0, v0

    move-wide/from16 v38, v0

    or-long v32, v32, v38

    .line 250
    :cond_15
    :goto_f
    add-int/lit8 v20, v20, 0x1

    goto :goto_e

    .line 261
    :cond_16
    if-eqz v10, :cond_17

    move-object/from16 v0, v23

    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->preventEdgeOffset:Z

    move/from16 v38, v0

    if-eqz v38, :cond_17

    const/16 v38, 0x1

    move/from16 v0, v38

    if-ne v8, v0, :cond_17

    .line 263
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mGeneratedItemPadding:I

    move/from16 v38, v0

    add-int v38, v38, v5

    const/16 v39, 0x0

    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mGeneratedItemPadding:I

    move/from16 v40, v0

    const/16 v41, 0x0

    move/from16 v0, v38

    move/from16 v1, v39

    move/from16 v2, v40

    move/from16 v3, v41

    invoke-virtual {v11, v0, v1, v2, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 265
    :cond_17
    move-object/from16 v0, v23

    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I

    move/from16 v38, v0

    add-int/lit8 v38, v38, 0x1

    move/from16 v0, v38

    move-object/from16 v1, v23

    iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I

    .line 266
    const/16 v38, 0x1

    move/from16 v0, v38

    move-object/from16 v1, v23

    iput-boolean v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->expanded:Z

    .line 267
    add-int/lit8 v8, v8, -0x1

    goto :goto_f

    .line 270
    .end local v11    # "child":Landroid/view/View;
    .end local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    :cond_18
    const/16 v30, 0x1

    .line 271
    goto/16 :goto_7

    .line 276
    .end local v26    # "minCells":I
    .end local v27    # "minCellsAt":J
    .end local v29    # "minCellsItemCount":I
    :cond_19
    const/16 v31, 0x0

    goto/16 :goto_a

    .line 297
    .restart local v13    # "expandCount":F
    .restart local v31    # "singleItem":Z
    :cond_1a
    const/4 v15, 0x0

    goto/16 :goto_b

    .line 305
    .restart local v15    # "extraPixels":I
    :cond_1b
    move-object/from16 v0, p0

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    .line 306
    .restart local v11    # "child":Landroid/view/View;
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v23

    check-cast v23, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    .line 307
    .restart local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    instance-of v0, v11, Landroid/support/v7/internal/view/menu/ActionMenuItemView;

    move/from16 v38, v0

    if-eqz v38, :cond_1d

    .line 309
    move-object/from16 v0, v23

    iput v15, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->extraPixels:I

    .line 310
    const/16 v38, 0x1

    move/from16 v0, v38

    move-object/from16 v1, v23

    iput-boolean v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->expanded:Z

    .line 311
    if-nez v20, :cond_1c

    move-object/from16 v0, v23

    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->preventEdgeOffset:Z

    move/from16 v38, v0

    if-nez v38, :cond_1c

    .line 314
    neg-int v0, v15

    move/from16 v38, v0

    div-int/lit8 v38, v38, 0x2

    move/from16 v0, v38

    move-object/from16 v1, v23

    iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->leftMargin:I

    .line 316
    :cond_1c
    const/16 v30, 0x1

    goto/16 :goto_d

    .line 317
    :cond_1d
    move-object/from16 v0, v23

    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z

    move/from16 v38, v0

    if-eqz v38, :cond_1e

    .line 318
    move-object/from16 v0, v23

    iput v15, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->extraPixels:I

    .line 319
    const/16 v38, 0x1

    move/from16 v0, v38

    move-object/from16 v1, v23

    iput-boolean v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->expanded:Z

    .line 320
    neg-int v0, v15

    move/from16 v38, v0

    div-int/lit8 v38, v38, 0x2

    move/from16 v0, v38

    move-object/from16 v1, v23

    iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->rightMargin:I

    .line 321
    const/16 v30, 0x1

    goto/16 :goto_d

    .line 326
    :cond_1e
    if-eqz v20, :cond_1f

    .line 327
    div-int/lit8 v38, v15, 0x2

    move/from16 v0, v38

    move-object/from16 v1, v23

    iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->leftMargin:I

    .line 329
    :cond_1f
    add-int/lit8 v38, v12, -0x1

    move/from16 v0, v20

    move/from16 v1, v38

    if-eq v0, v1, :cond_13

    .line 330
    div-int/lit8 v38, v15, 0x2

    move/from16 v0, v38

    move-object/from16 v1, v23

    iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->rightMargin:I

    goto/16 :goto_d

    .line 335
    .end local v11    # "child":Landroid/view/View;
    .end local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    :cond_20
    const/4 v8, 0x0

    .line 339
    .end local v13    # "expandCount":F
    .end local v15    # "extraPixels":I
    :cond_21
    if-eqz v30, :cond_23

    .line 340
    const/16 v20, 0x0

    :goto_10
    move/from16 v0, v20

    if-ge v0, v12, :cond_23

    .line 341
    move-object/from16 v0, p0

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    .line 342
    .restart local v11    # "child":Landroid/view/View;
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v23

    check-cast v23, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    .line 344
    .restart local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    move-object/from16 v0, v23

    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->expanded:Z

    move/from16 v38, v0

    if-nez v38, :cond_22

    .line 340
    :goto_11
    add-int/lit8 v20, v20, 0x1

    goto :goto_10

    .line 348
    :cond_22
    move-object/from16 v0, v23

    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I

    move/from16 v38, v0

    mul-int v38, v38, v5

    move-object/from16 v0, v23

    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->extraPixels:I

    move/from16 v39, v0

    add-int v35, v38, v39

    .line 349
    .local v35, "width":I
    const/high16 v38, 0x40000000    # 2.0f

    move/from16 v0, v35

    move/from16 v1, v38

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v38

    move/from16 v0, v38

    move/from16 v1, v22

    invoke-virtual {v11, v0, v1}, Landroid/view/View;->measure(II)V

    goto :goto_11

    .line 354
    .end local v11    # "child":Landroid/view/View;
    .end local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    .end local v35    # "width":I
    :cond_23
    const/high16 v38, 0x40000000    # 2.0f

    move/from16 v0, v17

    move/from16 v1, v38

    if-eq v0, v1, :cond_24

    .line 355
    move/from16 v19, v25

    .line 358
    :cond_24
    move-object/from16 v0, p0

    move/from16 v1, v37

    move/from16 v2, v19

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/internal/view/menu/ActionMenuView;->setMeasuredDimension(II)V

    .line 359
    mul-int v38, v8, v5

    move/from16 v0, v38

    move-object/from16 v1, p0

    iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMeasuredExtraWidth:I

    goto/16 :goto_1
.end method


# virtual methods
.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1
    .param p1, "p"    # Landroid/view/ViewGroup$LayoutParams;

    .prologue
    .line 534
    if-eqz p1, :cond_0

    instance-of v0, p1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1
    .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;

    .prologue
    .line 569
    const/4 v0, 0x0

    return v0
.end method

.method protected generateDefaultLayoutParams()Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    .locals 2

    .prologue
    const/4 v1, -0x2

    .line 509
    new-instance v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    invoke-direct {v0, v1, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;-><init>(II)V

    .line 511
    .local v0, "params":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    const/16 v1, 0x10

    iput v1, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->gravity:I

    .line 512
    return-object v0
.end method

.method protected bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .prologue
    .line 35
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->generateDefaultLayoutParams()Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic generateDefaultLayoutParams()Landroid/widget/LinearLayout$LayoutParams;
    .locals 1

    .prologue
    .line 35
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->generateDefaultLayoutParams()Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    move-result-object v0

    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    .locals 2
    .param p1, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 517
    new-instance v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    .locals 2
    .param p1, "p"    # Landroid/view/ViewGroup$LayoutParams;

    .prologue
    .line 522
    instance-of v1, p1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    if-eqz v1, :cond_1

    .line 523
    new-instance v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    check-cast p1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    .end local p1    # "p":Landroid/view/ViewGroup$LayoutParams;
    invoke-direct {v0, p1}, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;-><init>(Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;)V

    .line 524
    .local v0, "result":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    iget v1, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->gravity:I

    if-gtz v1, :cond_0

    .line 525
    const/16 v1, 0x10

    iput v1, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->gravity:I

    .line 529
    .end local v0    # "result":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    :cond_0
    :goto_0
    return-object v0

    .restart local p1    # "p":Landroid/view/ViewGroup$LayoutParams;
    :cond_1
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->generateDefaultLayoutParams()Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    move-result-object v0

    goto :goto_0
.end method

.method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1
    .param p1, "x0"    # Landroid/util/AttributeSet;

    .prologue
    .line 35
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->generateLayoutParams(Landroid/util/AttributeSet;)Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1
    .param p1, "x0"    # Landroid/view/ViewGroup$LayoutParams;

    .prologue
    .line 35
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/widget/LinearLayout$LayoutParams;
    .locals 1
    .param p1, "x0"    # Landroid/util/AttributeSet;

    .prologue
    .line 35
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->generateLayoutParams(Landroid/util/AttributeSet;)Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/widget/LinearLayout$LayoutParams;
    .locals 1
    .param p1, "x0"    # Landroid/view/ViewGroup$LayoutParams;

    .prologue
    .line 35
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    move-result-object v0

    return-object v0
.end method

.method public generateOverflowButtonLayoutParams()Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    .locals 2

    .prologue
    .line 538
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->generateDefaultLayoutParams()Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    move-result-object v0

    .line 539
    .local v0, "result":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    const/4 v1, 0x1

    iput-boolean v1, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z

    .line 540
    return-object v0
.end method

.method public getWindowAnimations()I
    .locals 1

    .prologue
    .line 548
    const/4 v0, 0x0

    return v0
.end method

.method protected hasSupportDividerBeforeChildAt(I)Z
    .locals 4
    .param p1, "childIndex"    # I

    .prologue
    .line 556
    add-int/lit8 v3, p1, -0x1

    invoke-virtual {p0, v3}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 557
    .local v1, "childBefore":Landroid/view/View;
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 558
    .local v0, "child":Landroid/view/View;
    const/4 v2, 0x0

    .line 559
    .local v2, "result":Z
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildCount()I

    move-result v3

    if-ge p1, v3, :cond_0

    instance-of v3, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$ActionMenuChildView;

    if-eqz v3, :cond_0

    .line 560
    check-cast v1, Landroid/support/v7/internal/view/menu/ActionMenuView$ActionMenuChildView;

    .end local v1    # "childBefore":Landroid/view/View;
    invoke-interface {v1}, Landroid/support/v7/internal/view/menu/ActionMenuView$ActionMenuChildView;->needsDividerAfter()Z

    move-result v3

    or-int/2addr v2, v3

    .line 562
    :cond_0
    if-lez p1, :cond_1

    instance-of v3, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$ActionMenuChildView;

    if-eqz v3, :cond_1

    .line 563
    check-cast v0, Landroid/support/v7/internal/view/menu/ActionMenuView$ActionMenuChildView;

    .end local v0    # "child":Landroid/view/View;
    invoke-interface {v0}, Landroid/support/v7/internal/view/menu/ActionMenuView$ActionMenuChildView;->needsDividerBefore()Z

    move-result v3

    or-int/2addr v2, v3

    .line 565
    :cond_1
    return v2
.end method

.method public initialize(Landroid/support/v7/internal/view/menu/MenuBuilder;)V
    .locals 0
    .param p1, "menu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;

    .prologue
    .line 552
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    .line 553
    return-void
.end method

.method public invokeItem(Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z
    .locals 2
    .param p1, "item"    # Landroid/support/v7/internal/view/menu/MenuItemImpl;

    .prologue
    .line 544
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->performItemAction(Landroid/view/MenuItem;I)Z

    move-result v0

    return v0
.end method

.method public isExpandedFormat()Z
    .locals 1

    .prologue
    .line 75
    iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItems:Z

    return v0
.end method

.method public isOverflowReserved()Z
    .locals 1

    .prologue
    .line 500
    iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mReserveOverflow:Z

    return v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2
    .param p1, "newConfig"    # Landroid/content/res/Configuration;

    .prologue
    .line 80
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    if-lt v0, v1, :cond_0

    .line 81
    invoke-super {p0, p1}, Landroid/support/v7/internal/widget/LinearLayoutICS;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 84
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->updateMenuView(Z)V

    .line 86
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->isOverflowMenuShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 87
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->hideOverflowMenu()Z

    .line 88
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->showOverflowMenu()Z

    .line 90
    :cond_1
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 495
    invoke-super {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->onDetachedFromWindow()V

    .line 496
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->dismissPopupMenus()Z

    .line 497
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 30
    .param p1, "changed"    # Z
    .param p2, "left"    # I
    .param p3, "top"    # I
    .param p4, "right"    # I
    .param p5, "bottom"    # I

    .prologue
    .line 416
    move-object/from16 v0, p0

    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItems:Z

    move/from16 v28, v0

    if-nez v28, :cond_1

    .line 417
    invoke-super/range {p0 .. p5}, Landroid/support/v7/internal/widget/LinearLayoutICS;->onLayout(ZIIII)V

    .line 491
    :cond_0
    :goto_0
    return-void

    .line 421
    :cond_1
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildCount()I

    move-result v6

    .line 422
    .local v6, "childCount":I
    add-int v28, p3, p5

    div-int/lit8 v14, v28, 0x2

    .line 423
    .local v14, "midVertical":I
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getSupportDividerWidth()I

    move-result v7

    .line 424
    .local v7, "dividerWidth":I
    const/16 v17, 0x0

    .line 425
    .local v17, "overflowWidth":I
    const/16 v16, 0x0

    .line 426
    .local v16, "nonOverflowWidth":I
    const/4 v15, 0x0

    .line 427
    .local v15, "nonOverflowCount":I
    sub-int v28, p4, p2

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getPaddingRight()I

    move-result v29

    sub-int v28, v28, v29

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getPaddingLeft()I

    move-result v29

    sub-int v27, v28, v29

    .line 428
    .local v27, "widthRemaining":I
    const/4 v8, 0x0

    .line 429
    .local v8, "hasOverflow":Z
    const/4 v10, 0x0

    .local v10, "i":I
    :goto_1
    if-ge v10, v6, :cond_6

    .line 430
    move-object/from16 v0, p0

    invoke-virtual {v0, v10}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v25

    .line 431
    .local v25, "v":Landroid/view/View;
    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getVisibility()I

    move-result v28

    const/16 v29, 0x8

    move/from16 v0, v28

    move/from16 v1, v29

    if-ne v0, v1, :cond_2

    .line 429
    :goto_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 435
    :cond_2
    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v18

    check-cast v18, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    .line 436
    .local v18, "p":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    move-object/from16 v0, v18

    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z

    move/from16 v28, v0

    if-eqz v28, :cond_4

    .line 437
    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getMeasuredWidth()I

    move-result v17

    .line 438
    move-object/from16 v0, p0

    invoke-virtual {v0, v10}, Landroid/support/v7/internal/view/menu/ActionMenuView;->hasSupportDividerBeforeChildAt(I)Z

    move-result v28

    if-eqz v28, :cond_3

    .line 439
    add-int v17, v17, v7

    .line 441
    :cond_3
    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    .line 442
    .local v9, "height":I
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getWidth()I

    move-result v28

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getPaddingRight()I

    move-result v29

    sub-int v28, v28, v29

    move-object/from16 v0, v18

    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->rightMargin:I

    move/from16 v29, v0

    sub-int v19, v28, v29

    .line 443
    .local v19, "r":I
    sub-int v11, v19, v17

    .line 444
    .local v11, "l":I
    div-int/lit8 v28, v9, 0x2

    sub-int v24, v14, v28

    .line 445
    .local v24, "t":I
    add-int v5, v24, v9

    .line 446
    .local v5, "b":I
    move-object/from16 v0, v25

    move/from16 v1, v24

    move/from16 v2, v19

    invoke-virtual {v0, v11, v1, v2, v5}, Landroid/view/View;->layout(IIII)V

    .line 448
    sub-int v27, v27, v17

    .line 449
    const/4 v8, 0x1

    .line 450
    goto :goto_2

    .line 451
    .end local v5    # "b":I
    .end local v9    # "height":I
    .end local v11    # "l":I
    .end local v19    # "r":I
    .end local v24    # "t":I
    :cond_4
    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getMeasuredWidth()I

    move-result v28

    move-object/from16 v0, v18

    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->leftMargin:I

    move/from16 v29, v0

    add-int v28, v28, v29

    move-object/from16 v0, v18

    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->rightMargin:I

    move/from16 v29, v0

    add-int v20, v28, v29

    .line 452
    .local v20, "size":I
    add-int v16, v16, v20

    .line 453
    sub-int v27, v27, v20

    .line 454
    move-object/from16 v0, p0

    invoke-virtual {v0, v10}, Landroid/support/v7/internal/view/menu/ActionMenuView;->hasSupportDividerBeforeChildAt(I)Z

    move-result v28

    if-eqz v28, :cond_5

    .line 455
    add-int v16, v16, v7

    .line 457
    :cond_5
    add-int/lit8 v15, v15, 0x1

    goto :goto_2

    .line 461
    .end local v18    # "p":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    .end local v20    # "size":I
    .end local v25    # "v":Landroid/view/View;
    :cond_6
    const/16 v28, 0x1

    move/from16 v0, v28

    if-ne v6, v0, :cond_7

    if-nez v8, :cond_7

    .line 463
    const/16 v28, 0x0

    move-object/from16 v0, p0

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v25

    .line 464
    .restart local v25    # "v":Landroid/view/View;
    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getMeasuredWidth()I

    move-result v26

    .line 465
    .local v26, "width":I
    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    .line 466
    .restart local v9    # "height":I
    sub-int v28, p4, p2

    div-int/lit8 v13, v28, 0x2

    .line 467
    .local v13, "midHorizontal":I
    div-int/lit8 v28, v26, 0x2

    sub-int v11, v13, v28

    .line 468
    .restart local v11    # "l":I
    div-int/lit8 v28, v9, 0x2

    sub-int v24, v14, v28

    .line 469
    .restart local v24    # "t":I
    add-int v28, v11, v26

    add-int v29, v24, v9

    move-object/from16 v0, v25

    move/from16 v1, v24

    move/from16 v2, v28

    move/from16 v3, v29

    invoke-virtual {v0, v11, v1, v2, v3}, Landroid/view/View;->layout(IIII)V

    goto/16 :goto_0

    .line 473
    .end local v9    # "height":I
    .end local v11    # "l":I
    .end local v13    # "midHorizontal":I
    .end local v24    # "t":I
    .end local v25    # "v":Landroid/view/View;
    .end local v26    # "width":I
    :cond_7
    if-eqz v8, :cond_9

    const/16 v28, 0x0

    :goto_3
    sub-int v21, v15, v28

    .line 474
    .local v21, "spacerCount":I
    const/16 v29, 0x0

    if-lez v21, :cond_a

    div-int v28, v27, v21

    :goto_4
    move/from16 v0, v29

    move/from16 v1, v28

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v22

    .line 476
    .local v22, "spacerSize":I
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getPaddingLeft()I

    move-result v23

    .line 477
    .local v23, "startLeft":I
    const/4 v10, 0x0

    :goto_5
    if-ge v10, v6, :cond_0

    .line 478
    move-object/from16 v0, p0

    invoke-virtual {v0, v10}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v25

    .line 479
    .restart local v25    # "v":Landroid/view/View;
    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v12

    check-cast v12, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    .line 480
    .local v12, "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getVisibility()I

    move-result v28

    const/16 v29, 0x8

    move/from16 v0, v28

    move/from16 v1, v29

    if-eq v0, v1, :cond_8

    iget-boolean v0, v12, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z

    move/from16 v28, v0

    if-eqz v28, :cond_b

    .line 477
    :cond_8
    :goto_6
    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    .line 473
    .end local v12    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    .end local v21    # "spacerCount":I
    .end local v22    # "spacerSize":I
    .end local v23    # "startLeft":I
    .end local v25    # "v":Landroid/view/View;
    :cond_9
    const/16 v28, 0x1

    goto :goto_3

    .line 474
    .restart local v21    # "spacerCount":I
    :cond_a
    const/16 v28, 0x0

    goto :goto_4

    .line 484
    .restart local v12    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    .restart local v22    # "spacerSize":I
    .restart local v23    # "startLeft":I
    .restart local v25    # "v":Landroid/view/View;
    :cond_b
    iget v0, v12, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->leftMargin:I

    move/from16 v28, v0

    add-int v23, v23, v28

    .line 485
    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getMeasuredWidth()I

    move-result v26

    .line 486
    .restart local v26    # "width":I
    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    .line 487
    .restart local v9    # "height":I
    div-int/lit8 v28, v9, 0x2

    sub-int v24, v14, v28

    .line 488
    .restart local v24    # "t":I
    add-int v28, v23, v26

    add-int v29, v24, v9

    move-object/from16 v0, v25

    move/from16 v1, v23

    move/from16 v2, v24

    move/from16 v3, v28

    move/from16 v4, v29

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->layout(IIII)V

    .line 489
    iget v0, v12, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->rightMargin:I

    move/from16 v28, v0

    add-int v28, v28, v26

    add-int v28, v28, v22

    add-int v23, v23, v28

    goto :goto_6
.end method

.method protected onMeasure(II)V
    .locals 10
    .param p1, "widthMeasureSpec"    # I
    .param p2, "heightMeasureSpec"    # I

    .prologue
    const/4 v7, 0x1

    const/4 v8, 0x0

    .line 95
    iget-boolean v4, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItems:Z

    .line 96
    .local v4, "wasFormatted":Z
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v6

    const/high16 v9, 0x40000000    # 2.0f

    if-ne v6, v9, :cond_2

    move v6, v7

    :goto_0
    iput-boolean v6, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItems:Z

    .line 98
    iget-boolean v6, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItems:Z

    if-eq v4, v6, :cond_0

    .line 99
    iput v8, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItemsWidth:I

    .line 104
    :cond_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v5

    .line 105
    .local v5, "widthSize":I
    iget-boolean v6, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItems:Z

    if-eqz v6, :cond_1

    iget-object v6, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    if-eqz v6, :cond_1

    iget v6, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItemsWidth:I

    if-eq v5, v6, :cond_1

    .line 106
    iput v5, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItemsWidth:I

    .line 107
    iget-object v6, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v6, v7}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V

    .line 110
    :cond_1
    iget-boolean v6, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItems:Z

    if-eqz v6, :cond_3

    .line 111
    invoke-direct {p0, p1, p2}, Landroid/support/v7/internal/view/menu/ActionMenuView;->onMeasureExactFormat(II)V

    .line 122
    :goto_1
    return-void

    .end local v5    # "widthSize":I
    :cond_2
    move v6, v8

    .line 96
    goto :goto_0

    .line 114
    .restart local v5    # "widthSize":I
    :cond_3
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildCount()I

    move-result v1

    .line 115
    .local v1, "childCount":I
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_2
    if-ge v2, v1, :cond_4

    .line 116
    invoke-virtual {p0, v2}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 117
    .local v0, "child":Landroid/view/View;
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    .line 118
    .local v3, "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    iput v8, v3, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->rightMargin:I

    iput v8, v3, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->leftMargin:I

    .line 115
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 120
    .end local v0    # "child":Landroid/view/View;
    .end local v3    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    :cond_4
    invoke-super {p0, p1, p2}, Landroid/support/v7/internal/widget/LinearLayoutICS;->onMeasure(II)V

    goto :goto_1
.end method

.method public setOverflowReserved(Z)V
    .locals 0
    .param p1, "reserveOverflow"    # Z

    .prologue
    .line 504
    iput-boolean p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mReserveOverflow:Z

    .line 505
    return-void
.end method

.method public setPresenter(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;)V
    .locals 0
    .param p1, "presenter"    # Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    .prologue
    .line 71
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    .line 72
    return-void
.end method
