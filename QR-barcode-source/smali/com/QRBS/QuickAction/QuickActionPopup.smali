.class public Lcom/QRBS/QuickAction/QuickActionPopup;
.super Lcom/QRBS/QuickAction/MyPopupWindow;
.source "QuickActionPopup.java"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/QRBS/QuickAction/QuickActionPopup$OnActionItemClickListener;,
        Lcom/QRBS/QuickAction/QuickActionPopup$OnDismissListener;
    }
.end annotation


# static fields
.field public static final ANIM_GROW_FROM_LEFT:I = 0x1

.field public static final HORIZONTAL:I = 0x0

.field public static final VERTICAL:I = 0x1


# instance fields
.field private actionItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/QRBS/QuickAction/QuickActionItem;",
            ">;"
        }
    .end annotation
.end field

.field private mAnimStyle:I

.field private mArrowDown:Landroid/widget/ImageView;

.field private mArrowUp:Landroid/widget/ImageView;

.field private mChildPos:I

.field private mDidAction:Z

.field private mDismissListener:Lcom/QRBS/QuickAction/QuickActionPopup$OnDismissListener;

.field private mInflater:Landroid/view/LayoutInflater;

.field private mInsertPos:I

.field private mItemClickListener:Lcom/QRBS/QuickAction/QuickActionPopup$OnActionItemClickListener;

.field private mOrientation:I

.field private mRootView:Landroid/view/View;

.field private mScroller:Landroid/widget/ScrollView;

.field private mTrack:Landroid/view/ViewGroup;

.field private reverseOrientationItem:Z

.field private rootWidth:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 57
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/QRBS/QuickAction/QuickActionPopup;-><init>(Landroid/content/Context;I)V

    .line 58
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "orientation"    # I

    .prologue
    const/4 v1, 0x0

    .line 72
    invoke-direct {p0, p1}, Lcom/QRBS/QuickAction/MyPopupWindow;-><init>(Landroid/content/Context;)V

    .line 33
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->actionItems:Ljava/util/List;

    .line 36
    iput-boolean v1, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->reverseOrientationItem:Z

    .line 42
    iput v1, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->rootWidth:I

    .line 74
    iput p2, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mOrientation:I

    .line 76
    const-string v0, "layout_inflater"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mInflater:Landroid/view/LayoutInflater;

    .line 78
    iget v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mOrientation:I

    if-nez v0, :cond_0

    .line 79
    const v0, 0x7f030034

    invoke-direct {p0, v0}, Lcom/QRBS/QuickAction/QuickActionPopup;->setRootViewId(I)V

    .line 84
    :goto_0
    const/4 v0, 0x1

    iput v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mAnimStyle:I

    .line 85
    iput v1, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mChildPos:I

    .line 86
    return-void

    .line 81
    :cond_0
    const v0, 0x7f030035

    invoke-direct {p0, v0}, Lcom/QRBS/QuickAction/QuickActionPopup;->setRootViewId(I)V

    goto :goto_0
.end method

.method static synthetic access$0(Lcom/QRBS/QuickAction/QuickActionPopup;)Lcom/QRBS/QuickAction/QuickActionPopup$OnActionItemClickListener;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mItemClickListener:Lcom/QRBS/QuickAction/QuickActionPopup$OnActionItemClickListener;

    return-object v0
.end method

.method static synthetic access$1(Lcom/QRBS/QuickAction/QuickActionPopup;Z)V
    .locals 0

    .prologue
    .line 35
    iput-boolean p1, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mDidAction:Z

    return-void
.end method

.method private setAnimationStyle(IIZ)V
    .locals 3
    .param p1, "screenWidth"    # I
    .param p2, "requestedX"    # I
    .param p3, "onTop"    # Z

    .prologue
    .line 302
    iget-object v1, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mArrowUp:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    sub-int v0, p2, v1

    .line 304
    .local v0, "arrowPos":I
    iget v1, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mAnimStyle:I

    packed-switch v1, :pswitch_data_0

    .line 310
    :goto_0
    return-void

    .line 306
    :pswitch_0
    iget-object v2, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mWindow:Landroid/widget/PopupWindow;

    if-eqz p3, :cond_0

    const v1, 0x7f070068

    :goto_1
    invoke-virtual {v2, v1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    goto :goto_0

    :cond_0
    const v1, 0x7f070064

    goto :goto_1

    .line 304
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method private setRootViewId(I)V
    .locals 3
    .param p1, "id"    # I

    .prologue
    const/4 v2, -0x2

    .line 123
    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mInflater:Landroid/view/LayoutInflater;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mRootView:Landroid/view/View;

    .line 124
    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mRootView:Landroid/view/View;

    const v1, 0x7f0d00b6

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mTrack:Landroid/view/ViewGroup;

    .line 126
    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mRootView:Landroid/view/View;

    const v1, 0x7f0d00b8

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mArrowDown:Landroid/widget/ImageView;

    .line 127
    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mRootView:Landroid/view/View;

    const v1, 0x7f0d00b7

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mArrowUp:Landroid/widget/ImageView;

    .line 128
    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mRootView:Landroid/view/View;

    const v1, 0x7f0d00b5

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    iput-object v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mScroller:Landroid/widget/ScrollView;

    .line 130
    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mRootView:Landroid/view/View;

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 132
    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mRootView:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/QRBS/QuickAction/QuickActionPopup;->setContentView(Landroid/view/View;)V

    .line 133
    return-void
.end method

.method private showArrow(II)V
    .locals 5
    .param p1, "whichArrow"    # I
    .param p2, "requestedX"    # I

    .prologue
    const v4, 0x7f0d00b7

    .line 315
    if-ne p1, v4, :cond_0

    iget-object v3, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mArrowUp:Landroid/widget/ImageView;

    .line 316
    .local v3, "showArrow":Landroid/view/View;
    :goto_0
    if-ne p1, v4, :cond_1

    iget-object v1, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mArrowDown:Landroid/widget/ImageView;

    .line 318
    .local v1, "hideArrow":Landroid/view/View;
    :goto_1
    iget-object v4, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mArrowUp:Landroid/widget/ImageView;

    invoke-virtual {v4}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v0

    .line 320
    .local v0, "arrowWidth":I
    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 322
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 324
    .local v2, "param":Landroid/view/ViewGroup$MarginLayoutParams;
    div-int/lit8 v4, v0, 0x2

    sub-int v4, p2, v4

    iput v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 326
    const/4 v4, 0x4

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 327
    return-void

    .line 315
    .end local v0    # "arrowWidth":I
    .end local v1    # "hideArrow":Landroid/view/View;
    .end local v2    # "param":Landroid/view/ViewGroup$MarginLayoutParams;
    .end local v3    # "showArrow":Landroid/view/View;
    :cond_0
    iget-object v3, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mArrowDown:Landroid/widget/ImageView;

    goto :goto_0

    .line 316
    .restart local v3    # "showArrow":Landroid/view/View;
    :cond_1
    iget-object v1, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mArrowUp:Landroid/widget/ImageView;

    goto :goto_1
.end method


# virtual methods
.method public addActionItem(Lcom/QRBS/QuickAction/QuickActionItem;)V
    .locals 12
    .param p1, "action"    # Lcom/QRBS/QuickAction/QuickActionItem;

    .prologue
    const/4 v11, 0x0

    const/16 v10, 0x8

    const/4 v9, 0x1

    .line 159
    iget-object v7, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->actionItems:Ljava/util/List;

    invoke-interface {v7, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 161
    invoke-virtual {p1}, Lcom/QRBS/QuickAction/QuickActionItem;->getTitle()Ljava/lang/String;

    move-result-object v6

    .line 162
    .local v6, "title":Ljava/lang/String;
    invoke-virtual {p1}, Lcom/QRBS/QuickAction/QuickActionItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 167
    .local v2, "icon":Landroid/graphics/drawable/Drawable;
    iget v7, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mOrientation:I

    if-nez v7, :cond_0

    iget-boolean v7, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->reverseOrientationItem:Z

    if-nez v7, :cond_0

    .line 168
    iget-object v7, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mInflater:Landroid/view/LayoutInflater;

    const v8, 0x7f030016

    invoke-virtual {v7, v8, v11}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 173
    .local v1, "container":Landroid/view/View;
    :goto_0
    const v7, 0x7f0d004b

    invoke-virtual {v1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    .line 174
    .local v3, "img":Landroid/widget/ImageView;
    const v7, 0x7f0d004c

    invoke-virtual {v1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 176
    .local v5, "text":Landroid/widget/TextView;
    if-eqz v2, :cond_1

    .line 177
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 182
    :goto_1
    if-eqz v6, :cond_2

    .line 183
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 188
    :goto_2
    iget v4, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mChildPos:I

    .line 189
    .local v4, "pos":I
    invoke-virtual {p1}, Lcom/QRBS/QuickAction/QuickActionItem;->getActionId()I

    move-result v0

    .line 191
    .local v0, "actionId":I
    new-instance v7, Lcom/QRBS/QuickAction/QuickActionPopup$1;

    invoke-direct {v7, p0, v4, v0}, Lcom/QRBS/QuickAction/QuickActionPopup$1;-><init>(Lcom/QRBS/QuickAction/QuickActionPopup;II)V

    invoke-virtual {v1, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 206
    invoke-virtual {v1, v9}, Landroid/view/View;->setFocusable(Z)V

    .line 207
    invoke-virtual {v1, v9}, Landroid/view/View;->setClickable(Z)V

    .line 209
    iget-object v7, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mTrack:Landroid/view/ViewGroup;

    iget v8, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mInsertPos:I

    invoke-virtual {v7, v1, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 211
    iget v7, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mChildPos:I

    add-int/lit8 v7, v7, 0x1

    iput v7, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mChildPos:I

    .line 212
    iget v7, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mInsertPos:I

    add-int/lit8 v7, v7, 0x1

    iput v7, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mInsertPos:I

    .line 213
    return-void

    .line 170
    .end local v0    # "actionId":I
    .end local v1    # "container":Landroid/view/View;
    .end local v3    # "img":Landroid/widget/ImageView;
    .end local v4    # "pos":I
    .end local v5    # "text":Landroid/widget/TextView;
    :cond_0
    iget-object v7, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mInflater:Landroid/view/LayoutInflater;

    const v8, 0x7f030017

    invoke-virtual {v7, v8, v11}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .restart local v1    # "container":Landroid/view/View;
    goto :goto_0

    .line 179
    .restart local v3    # "img":Landroid/widget/ImageView;
    .restart local v5    # "text":Landroid/widget/TextView;
    :cond_1
    invoke-virtual {v3, v10}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 185
    :cond_2
    invoke-virtual {v5, v10}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2
.end method

.method public getActionItem(I)Lcom/QRBS/QuickAction/QuickActionItem;
    .locals 1
    .param p1, "index"    # I

    .prologue
    .line 114
    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->actionItems:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/QRBS/QuickAction/QuickActionItem;

    return-object v0
.end method

.method public isReverseOrientationItem()Z
    .locals 1

    .prologue
    .line 351
    iget-boolean v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->reverseOrientationItem:Z

    return v0
.end method

.method public onDismiss()V
    .locals 1

    .prologue
    .line 341
    iget-boolean v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mDidAction:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mDismissListener:Lcom/QRBS/QuickAction/QuickActionPopup$OnDismissListener;

    if-eqz v0, :cond_0

    .line 342
    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mDismissListener:Lcom/QRBS/QuickAction/QuickActionPopup$OnDismissListener;

    invoke-interface {v0}, Lcom/QRBS/QuickAction/QuickActionPopup$OnDismissListener;->onDismiss()V

    .line 344
    :cond_0
    return-void
.end method

.method public setAnimStyle(I)V
    .locals 0
    .param p1, "mAnimStyle"    # I

    .prologue
    .line 141
    iput p1, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mAnimStyle:I

    .line 142
    return-void
.end method

.method public setBackgroundResources(III)V
    .locals 1
    .param p1, "popup"    # I
    .param p2, "arrowUp"    # I
    .param p3, "arrowDown"    # I

    .prologue
    .line 96
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    .line 98
    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mScroller:Landroid/widget/ScrollView;

    invoke-virtual {v0, p1}, Landroid/widget/ScrollView;->setBackgroundResource(I)V

    .line 99
    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mArrowDown:Landroid/widget/ImageView;

    invoke-virtual {v0, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 100
    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mArrowUp:Landroid/widget/ImageView;

    invoke-virtual {v0, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 103
    :cond_0
    return-void
.end method

.method public setOnActionItemClickListener(Lcom/QRBS/QuickAction/QuickActionPopup$OnActionItemClickListener;)V
    .locals 0
    .param p1, "listener"    # Lcom/QRBS/QuickAction/QuickActionPopup$OnActionItemClickListener;

    .prologue
    .line 150
    iput-object p1, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mItemClickListener:Lcom/QRBS/QuickAction/QuickActionPopup$OnActionItemClickListener;

    .line 151
    return-void
.end method

.method public setOnDismissListener(Lcom/QRBS/QuickAction/QuickActionPopup$OnDismissListener;)V
    .locals 0
    .param p1, "listener"    # Lcom/QRBS/QuickAction/QuickActionPopup$OnDismissListener;

    .prologue
    .line 334
    invoke-virtual {p0, p0}, Lcom/QRBS/QuickAction/QuickActionPopup;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 336
    iput-object p1, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->mDismissListener:Lcom/QRBS/QuickAction/QuickActionPopup$OnDismissListener;

    .line 337
    return-void
.end method

.method public setReverseOrientationItem(Z)V
    .locals 0
    .param p1, "reverseOrientationItem"    # Z

    .prologue
    .line 355
    iput-boolean p1, p0, Lcom/QRBS/QuickAction/QuickActionPopup;->reverseOrientationItem:Z

    .line 356
    return-void
.end method

.method public show(Landroid/view/View;)V
    .locals 18
    .param p1, "anchor"    # Landroid/view/View;

    .prologue
    .line 220
    invoke-virtual/range {p0 .. p0}, Lcom/QRBS/QuickAction/QuickActionPopup;->preShow()V

    .line 224
    const/4 v13, 0x0

    move-object/from16 v0, p0

    iput-boolean v13, v0, Lcom/QRBS/QuickAction/QuickActionPopup;->mDidAction:Z

    .line 226
    const/4 v13, 0x2

    new-array v6, v13, [I

    .line 228
    .local v6, "location":[I
    move-object/from16 v0, p1

    invoke-virtual {v0, v6}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 230
    new-instance v1, Landroid/graphics/Rect;

    const/4 v13, 0x0

    aget v13, v6, v13

    const/4 v14, 0x1

    aget v14, v6, v14

    const/4 v15, 0x0

    aget v15, v6, v15

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getWidth()I

    move-result v16

    add-int v15, v15, v16

    const/16 v16, 0x1

    aget v16, v6, v16

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getHeight()I

    move-result v17

    add-int v16, v16, v17

    move/from16 v0, v16

    invoke-direct {v1, v13, v14, v15, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 232
    .local v1, "anchorRect":Landroid/graphics/Rect;
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/QRBS/QuickAction/QuickActionPopup;->mRootView:Landroid/view/View;

    const/4 v14, -0x2

    const/4 v15, -0x2

    invoke-virtual {v13, v14, v15}, Landroid/view/View;->measure(II)V

    .line 234
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/QRBS/QuickAction/QuickActionPopup;->mRootView:Landroid/view/View;

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v8

    .line 236
    .local v8, "rootHeight":I
    move-object/from16 v0, p0

    iget v13, v0, Lcom/QRBS/QuickAction/QuickActionPopup;->rootWidth:I

    if-nez v13, :cond_0

    .line 238
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/QRBS/QuickAction/QuickActionPopup;->mRootView:Landroid/view/View;

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v13

    move-object/from16 v0, p0

    iput v13, v0, Lcom/QRBS/QuickAction/QuickActionPopup;->rootWidth:I

    .line 241
    :cond_0
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/QRBS/QuickAction/QuickActionPopup;->mWindowManager:Landroid/view/WindowManager;

    invoke-interface {v13}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v13

    invoke-virtual {v13}, Landroid/view/Display;->getWidth()I

    move-result v10

    .line 242
    .local v10, "screenWidth":I
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/QRBS/QuickAction/QuickActionPopup;->mWindowManager:Landroid/view/WindowManager;

    invoke-interface {v13}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v13

    invoke-virtual {v13}, Landroid/view/Display;->getHeight()I

    move-result v9

    .line 244
    .local v9, "screenHeight":I
    iget v13, v1, Landroid/graphics/Rect;->left:I

    move-object/from16 v0, p0

    iget v14, v0, Lcom/QRBS/QuickAction/QuickActionPopup;->rootWidth:I

    add-int/2addr v13, v14

    if-le v13, v10, :cond_3

    .line 247
    iget v13, v1, Landroid/graphics/Rect;->left:I

    move-object/from16 v0, p0

    iget v14, v0, Lcom/QRBS/QuickAction/QuickActionPopup;->rootWidth:I

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getWidth()I

    move-result v15

    sub-int/2addr v14, v15

    sub-int v11, v13, v14

    .line 248
    .local v11, "xPos":I
    if-gez v11, :cond_1

    const/4 v11, 0x0

    .line 250
    :cond_1
    invoke-virtual {v1}, Landroid/graphics/Rect;->centerX()I

    move-result v13

    sub-int v2, v13, v11

    .line 264
    .local v2, "arrowPos":I
    :goto_0
    iget v4, v1, Landroid/graphics/Rect;->top:I

    .line 265
    .local v4, "dyTop":I
    iget v13, v1, Landroid/graphics/Rect;->bottom:I

    sub-int v3, v9, v13

    .line 267
    .local v3, "dyBottom":I
    if-le v4, v3, :cond_5

    const/4 v7, 0x1

    .line 269
    .local v7, "onTop":Z
    :goto_1
    if-eqz v7, :cond_7

    .line 270
    if-le v8, v4, :cond_6

    .line 271
    const/16 v12, 0xf

    .line 272
    .local v12, "yPos":I
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/QRBS/QuickAction/QuickActionPopup;->mScroller:Landroid/widget/ScrollView;

    invoke-virtual {v13}, Landroid/widget/ScrollView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    .line 273
    .local v5, "l":Landroid/view/ViewGroup$LayoutParams;
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getHeight()I

    move-result v13

    sub-int v13, v4, v13

    iput v13, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 286
    .end local v5    # "l":Landroid/view/ViewGroup$LayoutParams;
    :cond_2
    :goto_2
    if-eqz v7, :cond_8

    const v13, 0x7f0d00b8

    :goto_3
    move-object/from16 v0, p0

    invoke-direct {v0, v13, v2}, Lcom/QRBS/QuickAction/QuickActionPopup;->showArrow(II)V

    .line 288
    invoke-virtual {v1}, Landroid/graphics/Rect;->centerX()I

    move-result v13

    move-object/from16 v0, p0

    invoke-direct {v0, v10, v13, v7}, Lcom/QRBS/QuickAction/QuickActionPopup;->setAnimationStyle(IIZ)V

    .line 290
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/QRBS/QuickAction/QuickActionPopup;->mWindow:Landroid/widget/PopupWindow;

    const/4 v14, 0x0

    move-object/from16 v0, p1

    invoke-virtual {v13, v0, v14, v11, v12}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 291
    return-void

    .line 253
    .end local v2    # "arrowPos":I
    .end local v3    # "dyBottom":I
    .end local v4    # "dyTop":I
    .end local v7    # "onTop":Z
    .end local v11    # "xPos":I
    .end local v12    # "yPos":I
    :cond_3
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getWidth()I

    move-result v13

    move-object/from16 v0, p0

    iget v14, v0, Lcom/QRBS/QuickAction/QuickActionPopup;->rootWidth:I

    if-le v13, v14, :cond_4

    .line 254
    invoke-virtual {v1}, Landroid/graphics/Rect;->centerX()I

    move-result v13

    move-object/from16 v0, p0

    iget v14, v0, Lcom/QRBS/QuickAction/QuickActionPopup;->rootWidth:I

    div-int/lit8 v14, v14, 0x2

    sub-int v11, v13, v14

    .line 261
    .restart local v11    # "xPos":I
    :goto_4
    invoke-virtual {v1}, Landroid/graphics/Rect;->centerX()I

    move-result v13

    sub-int v2, v13, v11

    .restart local v2    # "arrowPos":I
    goto :goto_0

    .line 258
    .end local v2    # "arrowPos":I
    .end local v11    # "xPos":I
    :cond_4
    iget v11, v1, Landroid/graphics/Rect;->left:I

    .restart local v11    # "xPos":I
    goto :goto_4

    .line 267
    .restart local v2    # "arrowPos":I
    .restart local v3    # "dyBottom":I
    .restart local v4    # "dyTop":I
    :cond_5
    const/4 v7, 0x0

    goto :goto_1

    .line 275
    .restart local v7    # "onTop":Z
    :cond_6
    iget v13, v1, Landroid/graphics/Rect;->top:I

    sub-int v12, v13, v8

    .line 277
    .restart local v12    # "yPos":I
    goto :goto_2

    .line 278
    .end local v12    # "yPos":I
    :cond_7
    iget v12, v1, Landroid/graphics/Rect;->bottom:I

    .line 280
    .restart local v12    # "yPos":I
    if-le v8, v3, :cond_2

    .line 281
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/QRBS/QuickAction/QuickActionPopup;->mScroller:Landroid/widget/ScrollView;

    invoke-virtual {v13}, Landroid/widget/ScrollView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    .line 282
    .restart local v5    # "l":Landroid/view/ViewGroup$LayoutParams;
    iput v3, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    goto :goto_2

    .line 286
    .end local v5    # "l":Landroid/view/ViewGroup$LayoutParams;
    :cond_8
    const v13, 0x7f0d00b7

    goto :goto_3
.end method
