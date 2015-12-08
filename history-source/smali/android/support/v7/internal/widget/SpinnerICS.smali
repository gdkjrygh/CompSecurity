.class Landroid/support/v7/internal/widget/SpinnerICS;
.super Landroid/support/v7/internal/widget/AbsSpinnerICS;
.source "SpinnerICS.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/widget/SpinnerICS$1;,
        Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;,
        Landroid/support/v7/internal/widget/SpinnerICS$DialogPopup;,
        Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;,
        Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;
    }
.end annotation


# static fields
.field private static final MAX_ITEMS_MEASURED:I = 0xf

.field static final MODE_DIALOG:I = 0x0

.field static final MODE_DROPDOWN:I = 0x1

.field private static final MODE_THEME:I = -0x1

.field private static final TAG:Ljava/lang/String; = "Spinner"


# instance fields
.field mDropDownWidth:I

.field private mGravity:I

.field private mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;

.field private mTempAdapter:Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;

.field private mTempRect:Landroid/graphics/Rect;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 84
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroid/support/v7/internal/widget/SpinnerICS;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 85
    return-void
.end method

.method constructor <init>(Landroid/content/Context;I)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "mode"    # I

    .prologue
    .line 100
    const/4 v0, 0x0

    sget v1, Landroid/support/v7/appcompat/R$attr;->spinnerStyle:I

    invoke-direct {p0, p1, v0, v1, p2}, Landroid/support/v7/internal/widget/SpinnerICS;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 101
    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 111
    sget v0, Landroid/support/v7/appcompat/R$attr;->spinnerStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/internal/widget/SpinnerICS;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 112
    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    .line 127
    const/4 v0, -0x1

    invoke-direct {p0, p1, p2, p3, v0}, Landroid/support/v7/internal/widget/SpinnerICS;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 128
    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 8
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I
    .param p4, "mode"    # I

    .prologue
    const/4 v7, 0x0

    const/4 v6, 0x0

    .line 148
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/internal/widget/AbsSpinnerICS;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 75
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    iput-object v4, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mTempRect:Landroid/graphics/Rect;

    .line 150
    sget-object v4, Landroid/support/v7/appcompat/R$styleable;->Spinner:[I

    invoke-virtual {p1, p2, v4, p3, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 153
    .local v0, "a":Landroid/content/res/TypedArray;
    const/4 v4, -0x1

    if-ne p4, v4, :cond_0

    .line 154
    const/4 v4, 0x7

    invoke-virtual {v0, v4, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p4

    .line 157
    :cond_0
    packed-switch p4, :pswitch_data_0

    .line 189
    :goto_0
    const/16 v4, 0x11

    invoke-virtual {v0, v6, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    iput v4, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mGravity:I

    .line 191
    iget-object v4, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;

    const/4 v5, 0x6

    invoke-virtual {v0, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;->setPromptText(Ljava/lang/CharSequence;)V

    .line 193
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 197
    iget-object v4, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mTempAdapter:Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;

    if-eqz v4, :cond_1

    .line 198
    iget-object v4, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;

    iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mTempAdapter:Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;

    invoke-interface {v4, v5}, Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 199
    iput-object v7, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mTempAdapter:Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;

    .line 201
    :cond_1
    return-void

    .line 159
    :pswitch_0
    new-instance v4, Landroid/support/v7/internal/widget/SpinnerICS$DialogPopup;

    invoke-direct {v4, p0, v7}, Landroid/support/v7/internal/widget/SpinnerICS$DialogPopup;-><init>(Landroid/support/v7/internal/widget/SpinnerICS;Landroid/support/v7/internal/widget/SpinnerICS$1;)V

    iput-object v4, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;

    goto :goto_0

    .line 164
    :pswitch_1
    new-instance v2, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;

    invoke-direct {v2, p0, p1, p2, p3}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;-><init>(Landroid/support/v7/internal/widget/SpinnerICS;Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 166
    .local v2, "popup":Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;
    const/4 v4, 0x3

    const/4 v5, -0x2

    invoke-virtual {v0, v4, v5}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v4

    iput v4, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mDropDownWidth:I

    .line 169
    const/4 v4, 0x2

    invoke-virtual {v0, v4}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 172
    const/4 v4, 0x5

    invoke-virtual {v0, v4, v6}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    .line 174
    .local v3, "verticalOffset":I
    if-eqz v3, :cond_2

    .line 175
    invoke-virtual {v2, v3}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->setVerticalOffset(I)V

    .line 178
    :cond_2
    const/4 v4, 0x4

    invoke-virtual {v0, v4, v6}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v1

    .line 180
    .local v1, "horizontalOffset":I
    if-eqz v1, :cond_3

    .line 181
    invoke-virtual {v2, v1}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->setHorizontalOffset(I)V

    .line 184
    :cond_3
    iput-object v2, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;

    goto :goto_0

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method static synthetic access$200(Landroid/support/v7/internal/widget/SpinnerICS;)Landroid/graphics/Rect;
    .locals 1
    .param p0, "x0"    # Landroid/support/v7/internal/widget/SpinnerICS;

    .prologue
    .line 48
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mTempRect:Landroid/graphics/Rect;

    return-object v0
.end method

.method private makeAndAddView(I)Landroid/view/View;
    .locals 4
    .param p1, "position"    # I

    .prologue
    .line 372
    iget-boolean v2, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mDataChanged:Z

    if-nez v2, :cond_0

    .line 373
    iget-object v2, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mRecycler:Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;

    invoke-virtual {v2, p1}, Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;->get(I)Landroid/view/View;

    move-result-object v0

    .line 374
    .local v0, "child":Landroid/view/View;
    if-eqz v0, :cond_0

    .line 376
    invoke-direct {p0, v0}, Landroid/support/v7/internal/widget/SpinnerICS;->setUpChild(Landroid/view/View;)V

    move-object v1, v0

    .line 388
    .end local v0    # "child":Landroid/view/View;
    .local v1, "child":Landroid/view/View;
    :goto_0
    return-object v1

    .line 383
    .end local v1    # "child":Landroid/view/View;
    :cond_0
    iget-object v2, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mAdapter:Landroid/widget/SpinnerAdapter;

    const/4 v3, 0x0

    invoke-interface {v2, p1, v3, p0}, Landroid/widget/SpinnerAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 386
    .restart local v0    # "child":Landroid/view/View;
    invoke-direct {p0, v0}, Landroid/support/v7/internal/widget/SpinnerICS;->setUpChild(Landroid/view/View;)V

    move-object v1, v0

    .line 388
    .end local v0    # "child":Landroid/view/View;
    .restart local v1    # "child":Landroid/view/View;
    goto :goto_0
.end method

.method private setUpChild(Landroid/view/View;)V
    .locals 11
    .param p1, "child"    # Landroid/view/View;

    .prologue
    .line 401
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    .line 402
    .local v6, "lp":Landroid/view/ViewGroup$LayoutParams;
    if-nez v6, :cond_0

    .line 403
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    .line 406
    :cond_0
    const/4 v8, 0x0

    invoke-virtual {p0, p1, v8, v6}, Landroid/support/v7/internal/widget/SpinnerICS;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z

    .line 408
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->hasFocus()Z

    move-result v8

    invoke-virtual {p1, v8}, Landroid/view/View;->setSelected(Z)V

    .line 411
    iget v8, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mHeightMeasureSpec:I

    iget-object v9, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;

    iget v9, v9, Landroid/graphics/Rect;->top:I

    iget-object v10, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;

    iget v10, v10, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v9, v10

    iget v10, v6, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v8, v9, v10}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v1

    .line 413
    .local v1, "childHeightSpec":I
    iget v8, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mWidthMeasureSpec:I

    iget-object v9, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;

    iget v9, v9, Landroid/graphics/Rect;->left:I

    iget-object v10, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;

    iget v10, v10, Landroid/graphics/Rect;->right:I

    add-int/2addr v9, v10

    iget v10, v6, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {v8, v9, v10}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v5

    .line 417
    .local v5, "childWidthSpec":I
    invoke-virtual {p1, v5, v1}, Landroid/view/View;->measure(II)V

    .line 423
    iget-object v8, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;

    iget v8, v8, Landroid/graphics/Rect;->top:I

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->getMeasuredHeight()I

    move-result v9

    iget-object v10, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;

    iget v10, v10, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v9, v10

    iget-object v10, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;

    iget v10, v10, Landroid/graphics/Rect;->top:I

    sub-int/2addr v9, v10

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v10

    sub-int/2addr v9, v10

    div-int/lit8 v9, v9, 0x2

    add-int v4, v8, v9

    .line 426
    .local v4, "childTop":I
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v8

    add-int v0, v4, v8

    .line 428
    .local v0, "childBottom":I
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    .line 429
    .local v7, "width":I
    const/4 v2, 0x0

    .line 430
    .local v2, "childLeft":I
    add-int v3, v2, v7

    .line 432
    .local v3, "childRight":I
    invoke-virtual {p1, v2, v4, v3, v0}, Landroid/view/View;->layout(IIII)V

    .line 433
    return-void
.end method


# virtual methods
.method public getBaseline()I
    .locals 5

    .prologue
    const/4 v2, -0x1

    const/4 v4, 0x0

    .line 234
    const/4 v0, 0x0

    .line 236
    .local v0, "child":Landroid/view/View;
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->getChildCount()I

    move-result v3

    if-lez v3, :cond_2

    .line 237
    invoke-virtual {p0, v4}, Landroid/support/v7/internal/widget/SpinnerICS;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 244
    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    .line 245
    invoke-virtual {v0}, Landroid/view/View;->getBaseline()I

    move-result v1

    .line 246
    .local v1, "childBaseline":I
    if-ltz v1, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v2

    add-int/2addr v2, v1

    .line 248
    .end local v1    # "childBaseline":I
    :cond_1
    return v2

    .line 238
    :cond_2
    iget-object v3, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mAdapter:Landroid/widget/SpinnerAdapter;

    if-eqz v3, :cond_0

    iget-object v3, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mAdapter:Landroid/widget/SpinnerAdapter;

    invoke-interface {v3}, Landroid/widget/SpinnerAdapter;->getCount()I

    move-result v3

    if-lez v3, :cond_0

    .line 239
    invoke-direct {p0, v4}, Landroid/support/v7/internal/widget/SpinnerICS;->makeAndAddView(I)Landroid/view/View;

    move-result-object v0

    .line 240
    iget-object v3, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mRecycler:Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;

    invoke-virtual {v3, v4, v0}, Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;->put(ILandroid/view/View;)V

    .line 241
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->removeAllViewsInLayout()V

    goto :goto_0
.end method

.method public getPrompt()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 475
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;

    invoke-interface {v0}, Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;->getHintText()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method layout(IZ)V
    .locals 8
    .param p1, "delta"    # I
    .param p2, "animate"    # Z

    .prologue
    const/4 v7, 0x0

    .line 310
    iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;

    iget v0, v5, Landroid/graphics/Rect;->left:I

    .line 311
    .local v0, "childrenLeft":I
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->getRight()I

    move-result v5

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->getLeft()I

    move-result v6

    sub-int/2addr v5, v6

    iget-object v6, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->left:I

    sub-int/2addr v5, v6

    iget-object v6, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->right:I

    sub-int v1, v5, v6

    .line 313
    .local v1, "childrenWidth":I
    iget-boolean v5, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mDataChanged:Z

    if-eqz v5, :cond_0

    .line 314
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->handleDataChanged()V

    .line 318
    :cond_0
    iget v5, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mItemCount:I

    if-nez v5, :cond_1

    .line 319
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->resetList()V

    .line 357
    :goto_0
    return-void

    .line 323
    :cond_1
    iget v5, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mNextSelectedPosition:I

    if-ltz v5, :cond_2

    .line 324
    iget v5, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mNextSelectedPosition:I

    invoke-virtual {p0, v5}, Landroid/support/v7/internal/widget/SpinnerICS;->setSelectedPositionInt(I)V

    .line 327
    :cond_2
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->recycleAllViews()V

    .line 330
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->removeAllViewsInLayout()V

    .line 333
    iget v5, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mSelectedPosition:I

    iput v5, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mFirstPosition:I

    .line 334
    iget v5, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mSelectedPosition:I

    invoke-direct {p0, v5}, Landroid/support/v7/internal/widget/SpinnerICS;->makeAndAddView(I)Landroid/view/View;

    move-result-object v2

    .line 335
    .local v2, "sel":Landroid/view/View;
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    .line 336
    .local v4, "width":I
    move v3, v0

    .line 337
    .local v3, "selectedOffset":I
    iget v5, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mGravity:I

    and-int/lit8 v5, v5, 0x7

    sparse-switch v5, :sswitch_data_0

    .line 345
    :goto_1
    invoke-virtual {v2, v3}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 348
    iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mRecycler:Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;

    invoke-virtual {v5}, Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;->clear()V

    .line 350
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->invalidate()V

    .line 352
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->checkSelectionChanged()V

    .line 354
    iput-boolean v7, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mDataChanged:Z

    .line 355
    iput-boolean v7, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mNeedSync:Z

    .line 356
    iget v5, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mSelectedPosition:I

    invoke-virtual {p0, v5}, Landroid/support/v7/internal/widget/SpinnerICS;->setNextSelectedPositionInt(I)V

    goto :goto_0

    .line 339
    :sswitch_0
    div-int/lit8 v5, v1, 0x2

    add-int/2addr v5, v0

    div-int/lit8 v6, v4, 0x2

    sub-int v3, v5, v6

    .line 340
    goto :goto_1

    .line 342
    :sswitch_1
    add-int v5, v0, v1

    sub-int v3, v5, v4

    goto :goto_1

    .line 337
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x5 -> :sswitch_1
    .end sparse-switch
.end method

.method measureContentWidth(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I
    .locals 13
    .param p1, "adapter"    # Landroid/widget/SpinnerAdapter;
    .param p2, "background"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 479
    if-nez p1, :cond_1

    .line 480
    const/4 v8, 0x0

    .line 519
    :cond_0
    :goto_0
    return v8

    .line 483
    :cond_1
    const/4 v8, 0x0

    .line 484
    .local v8, "width":I
    const/4 v5, 0x0

    .line 485
    .local v5, "itemView":Landroid/view/View;
    const/4 v4, 0x0

    .line 486
    .local v4, "itemType":I
    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static {v10, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v9

    .line 488
    .local v9, "widthMeasureSpec":I
    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static {v10, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 493
    .local v2, "heightMeasureSpec":I
    const/4 v10, 0x0

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->getSelectedItemPosition()I

    move-result v11

    invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 494
    .local v7, "start":I
    invoke-interface {p1}, Landroid/widget/SpinnerAdapter;->getCount()I

    move-result v10

    add-int/lit8 v11, v7, 0xf

    invoke-static {v10, v11}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 495
    .local v1, "end":I
    sub-int v0, v1, v7

    .line 496
    .local v0, "count":I
    const/4 v10, 0x0

    rsub-int/lit8 v11, v0, 0xf

    sub-int v11, v7, v11

    invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 497
    move v3, v7

    .local v3, "i":I
    :goto_1
    if-ge v3, v1, :cond_4

    .line 498
    invoke-interface {p1, v3}, Landroid/widget/SpinnerAdapter;->getItemViewType(I)I

    move-result v6

    .line 499
    .local v6, "positionType":I
    if-eq v6, v4, :cond_2

    .line 500
    move v4, v6

    .line 501
    const/4 v5, 0x0

    .line 503
    :cond_2
    invoke-interface {p1, v3, v5, p0}, Landroid/widget/SpinnerAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 504
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    if-nez v10, :cond_3

    .line 505
    new-instance v10, Landroid/view/ViewGroup$LayoutParams;

    const/4 v11, -0x2

    const/4 v12, -0x2

    invoke-direct {v10, v11, v12}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v5, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 509
    :cond_3
    invoke-virtual {v5, v9, v2}, Landroid/view/View;->measure(II)V

    .line 510
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v10

    invoke-static {v8, v10}, Ljava/lang/Math;->max(II)I

    move-result v8

    .line 497
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 514
    .end local v6    # "positionType":I
    :cond_4
    if-eqz p2, :cond_0

    .line 515
    iget-object v10, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mTempRect:Landroid/graphics/Rect;

    invoke-virtual {p2, v10}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 516
    iget-object v10, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mTempRect:Landroid/graphics/Rect;

    iget v10, v10, Landroid/graphics/Rect;->left:I

    iget-object v11, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mTempRect:Landroid/graphics/Rect;

    iget v11, v11, Landroid/graphics/Rect;->right:I

    add-int/2addr v10, v11

    add-int/2addr v8, v10

    goto :goto_0
.end method

.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    .line 451
    invoke-virtual {p0, p2}, Landroid/support/v7/internal/widget/SpinnerICS;->setSelection(I)V

    .line 452
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 453
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 254
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->onDetachedFromWindow()V

    .line 256
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;

    invoke-interface {v0}, Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 257
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;

    invoke-interface {v0}, Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;->dismiss()V

    .line 259
    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 2
    .param p1, "changed"    # Z
    .param p2, "l"    # I
    .param p3, "t"    # I
    .param p4, "r"    # I
    .param p5, "b"    # I

    .prologue
    const/4 v1, 0x0

    .line 296
    invoke-super/range {p0 .. p5}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->onLayout(ZIIII)V

    .line 297
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mInLayout:Z

    .line 298
    invoke-virtual {p0, v1, v1}, Landroid/support/v7/internal/widget/SpinnerICS;->layout(IZ)V

    .line 299
    iput-boolean v1, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mInLayout:Z

    .line 300
    return-void
.end method

.method protected onMeasure(II)V
    .locals 3
    .param p1, "widthMeasureSpec"    # I
    .param p2, "heightMeasureSpec"    # I

    .prologue
    .line 278
    invoke-super {p0, p1, p2}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->onMeasure(II)V

    .line 279
    iget-object v1, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;

    if-eqz v1, :cond_0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    const/high16 v2, -0x80000000

    if-ne v1, v2, :cond_0

    .line 280
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->getMeasuredWidth()I

    move-result v0

    .line 281
    .local v0, "measuredWidth":I
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v1

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Landroid/support/v7/internal/widget/SpinnerICS;->measureContentWidth(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {p0, v1, v2}, Landroid/support/v7/internal/widget/SpinnerICS;->setMeasuredDimension(II)V

    .line 286
    .end local v0    # "measuredWidth":I
    :cond_0
    return-void
.end method

.method public performClick()Z
    .locals 2

    .prologue
    .line 437
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->performClick()Z

    move-result v0

    .line 439
    .local v0, "handled":Z
    if-nez v0, :cond_0

    .line 440
    const/4 v0, 0x1

    .line 442
    iget-object v1, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;

    invoke-interface {v1}, Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;->isShowing()Z

    move-result v1

    if-nez v1, :cond_0

    .line 443
    iget-object v1, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;

    invoke-interface {v1}, Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;->show()V

    .line 447
    :cond_0
    return v0
.end method

.method public bridge synthetic setAdapter(Landroid/widget/Adapter;)V
    .locals 0
    .param p1, "x0"    # Landroid/widget/Adapter;

    .prologue
    .line 48
    check-cast p1, Landroid/widget/SpinnerAdapter;

    .end local p1    # "x0":Landroid/widget/Adapter;
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/SpinnerICS;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    return-void
.end method

.method public setAdapter(Landroid/widget/SpinnerAdapter;)V
    .locals 2
    .param p1, "adapter"    # Landroid/widget/SpinnerAdapter;

    .prologue
    .line 223
    invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 225
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;

    if-eqz v0, :cond_0

    .line 226
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;

    new-instance v1, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;

    invoke-direct {v1, p1}, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;-><init>(Landroid/widget/SpinnerAdapter;)V

    invoke-interface {v0, v1}, Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 230
    :goto_0
    return-void

    .line 228
    :cond_0
    new-instance v0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;

    invoke-direct {v0, p1}, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;-><init>(Landroid/widget/SpinnerAdapter;)V

    iput-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mTempAdapter:Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;

    goto :goto_0
.end method

.method public setGravity(I)V
    .locals 1
    .param p1, "gravity"    # I

    .prologue
    .line 212
    iget v0, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mGravity:I

    if-eq v0, p1, :cond_1

    .line 213
    and-int/lit8 v0, p1, 0x7

    if-nez v0, :cond_0

    .line 214
    or-int/lit8 p1, p1, 0x3

    .line 216
    :cond_0
    iput p1, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mGravity:I

    .line 217
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->requestLayout()V

    .line 219
    :cond_1
    return-void
.end method

.method public setOnItemClickListener(Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;)V
    .locals 2
    .param p1, "l"    # Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;

    .prologue
    .line 269
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "setOnItemClickListener cannot be used with a spinner."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method setOnItemClickListenerInt(Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;)V
    .locals 0
    .param p1, "l"    # Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;

    .prologue
    .line 273
    invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->setOnItemClickListener(Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;)V

    .line 274
    return-void
.end method

.method public setPrompt(Ljava/lang/CharSequence;)V
    .locals 1
    .param p1, "prompt"    # Ljava/lang/CharSequence;

    .prologue
    .line 460
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;

    invoke-interface {v0, p1}, Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;->setPromptText(Ljava/lang/CharSequence;)V

    .line 461
    return-void
.end method

.method public setPromptId(I)V
    .locals 1
    .param p1, "promptId"    # I

    .prologue
    .line 468
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/SpinnerICS;->setPrompt(Ljava/lang/CharSequence;)V

    .line 469
    return-void
.end method
