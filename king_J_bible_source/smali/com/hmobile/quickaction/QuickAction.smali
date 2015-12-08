.class public Lcom/hmobile/quickaction/QuickAction;
.super Lcom/hmobile/quickaction/CustomPopupWindow;
.source "QuickAction.java"


# static fields
.field protected static final ANIM_AUTO:I = 0x5

.field protected static final ANIM_GROW_FROM_CENTER:I = 0x3

.field protected static final ANIM_GROW_FROM_LEFT:I = 0x1

.field protected static final ANIM_GROW_FROM_RIGHT:I = 0x2

.field protected static final ANIM_REFLECT:I = 0x4


# instance fields
.field private actionList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/quickaction/ActionItem;",
            ">;"
        }
    .end annotation
.end field

.field private animStyle:I

.field private final context:Landroid/content/Context;

.field private final inflater:Landroid/view/LayoutInflater;

.field private final mArrowDown:Landroid/widget/ImageView;

.field private final mArrowUp:Landroid/widget/ImageView;

.field private mTrack:Landroid/view/ViewGroup;

.field private final root:Landroid/view/View;

.field private scroller:Landroid/widget/ScrollView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 3
    .param p1, "anchor"    # Landroid/view/View;

    .prologue
    .line 58
    invoke-direct {p0, p1}, Lcom/hmobile/quickaction/CustomPopupWindow;-><init>(Landroid/view/View;)V

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/hmobile/quickaction/QuickAction;->actionList:Ljava/util/ArrayList;

    .line 61
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/hmobile/quickaction/QuickAction;->context:Landroid/content/Context;

    .line 62
    iget-object v0, p0, Lcom/hmobile/quickaction/QuickAction;->context:Landroid/content/Context;

    .line 63
    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 62
    iput-object v0, p0, Lcom/hmobile/quickaction/QuickAction;->inflater:Landroid/view/LayoutInflater;

    .line 65
    iget-object v0, p0, Lcom/hmobile/quickaction/QuickAction;->inflater:Landroid/view/LayoutInflater;

    const v1, 0x7f030028

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/hmobile/quickaction/QuickAction;->root:Landroid/view/View;

    .line 66
    iget-object v0, p0, Lcom/hmobile/quickaction/QuickAction;->root:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/hmobile/quickaction/QuickAction;->setContentView(Landroid/view/View;)V

    .line 68
    iget-object v0, p0, Lcom/hmobile/quickaction/QuickAction;->root:Landroid/view/View;

    const v1, 0x7f0e00c2

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/hmobile/quickaction/QuickAction;->mArrowDown:Landroid/widget/ImageView;

    .line 69
    iget-object v0, p0, Lcom/hmobile/quickaction/QuickAction;->root:Landroid/view/View;

    const v1, 0x7f0e00c1

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/hmobile/quickaction/QuickAction;->mArrowUp:Landroid/widget/ImageView;

    .line 72
    iget-object v0, p0, Lcom/hmobile/quickaction/QuickAction;->root:Landroid/view/View;

    const v1, 0x7f0e00c0

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/hmobile/quickaction/QuickAction;->mTrack:Landroid/view/ViewGroup;

    .line 73
    iget-object v0, p0, Lcom/hmobile/quickaction/QuickAction;->root:Landroid/view/View;

    const v1, 0x7f0e00bf

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    iput-object v0, p0, Lcom/hmobile/quickaction/QuickAction;->scroller:Landroid/widget/ScrollView;

    .line 74
    const/4 v0, 0x5

    iput v0, p0, Lcom/hmobile/quickaction/QuickAction;->animStyle:I

    .line 75
    return-void
.end method

.method private createActionList()V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 229
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    iget-object v5, p0, Lcom/hmobile/quickaction/QuickAction;->actionList:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-lt v0, v5, :cond_0

    .line 242
    return-void

    .line 230
    :cond_0
    iget-object v5, p0, Lcom/hmobile/quickaction/QuickAction;->actionList:Ljava/util/ArrayList;

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/hmobile/quickaction/ActionItem;

    invoke-virtual {v5}, Lcom/hmobile/quickaction/ActionItem;->getTitle()Ljava/lang/String;

    move-result-object v3

    .line 231
    .local v3, "title":Ljava/lang/String;
    iget-object v5, p0, Lcom/hmobile/quickaction/QuickAction;->actionList:Ljava/util/ArrayList;

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/hmobile/quickaction/ActionItem;

    invoke-virtual {v5}, Lcom/hmobile/quickaction/ActionItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 232
    .local v1, "icon":Landroid/graphics/drawable/Drawable;
    iget-object v5, p0, Lcom/hmobile/quickaction/QuickAction;->actionList:Ljava/util/ArrayList;

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/hmobile/quickaction/ActionItem;

    invoke-virtual {v5}, Lcom/hmobile/quickaction/ActionItem;->getListener()Landroid/view/View$OnClickListener;

    move-result-object v2

    .line 234
    .local v2, "listener":Landroid/view/View$OnClickListener;
    invoke-direct {p0, v3, v1, v2}, Lcom/hmobile/quickaction/QuickAction;->getActionItem(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)Landroid/view/View;

    move-result-object v4

    .line 235
    .local v4, "view":Landroid/view/View;
    invoke-virtual {v4, v6, v6, v6, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 237
    invoke-virtual {v4, v7}, Landroid/view/View;->setFocusable(Z)V

    .line 238
    invoke-virtual {v4, v7}, Landroid/view/View;->setClickable(Z)V

    .line 240
    iget-object v5, p0, Lcom/hmobile/quickaction/QuickAction;->mTrack:Landroid/view/ViewGroup;

    invoke-virtual {v5, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 229
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private getActionItem(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)Landroid/view/View;
    .locals 6
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "icon"    # Landroid/graphics/drawable/Drawable;
    .param p3, "listener"    # Landroid/view/View$OnClickListener;

    .prologue
    .line 257
    iget-object v3, p0, Lcom/hmobile/quickaction/QuickAction;->inflater:Landroid/view/LayoutInflater;

    .line 258
    const/high16 v4, 0x7f030000

    const/4 v5, 0x0

    .line 257
    invoke-virtual {v3, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 260
    .local v0, "container":Landroid/widget/RelativeLayout;
    const v3, 0x7f0e001f

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 261
    .local v1, "img":Landroid/widget/ImageView;
    const v3, 0x7f0e0020

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 267
    .local v2, "text":Landroid/widget/TextView;
    if-eqz p1, :cond_0

    .line 268
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 271
    :cond_0
    if-eqz p3, :cond_1

    .line 272
    invoke-virtual {v0, p3}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 275
    :cond_1
    return-object v0
.end method

.method private setAnimationStyle(IIZ)V
    .locals 7
    .param p1, "screenWidth"    # I
    .param p2, "requestedX"    # I
    .param p3, "onTop"    # Z

    .prologue
    const v1, 0x7f0a0031

    const v4, 0x7f0a0030

    const v3, 0x7f0a002d

    const v2, 0x7f0a002c

    const v5, 0x7f0a002b

    .line 180
    iget-object v6, p0, Lcom/hmobile/quickaction/QuickAction;->mArrowUp:Landroid/widget/ImageView;

    invoke-virtual {v6}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v6

    div-int/lit8 v6, v6, 0x2

    sub-int v0, p2, v6

    .line 182
    .local v0, "arrowPos":I
    iget v6, p0, Lcom/hmobile/quickaction/QuickAction;->animStyle:I

    packed-switch v6, :pswitch_data_0

    .line 218
    :goto_0
    return-void

    .line 184
    :pswitch_0
    iget-object v3, p0, Lcom/hmobile/quickaction/QuickAction;->window:Landroid/widget/PopupWindow;

    if-eqz p3, :cond_0

    :goto_1
    invoke-virtual {v3, v1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    goto :goto_0

    :cond_0
    move v1, v2

    .line 185
    goto :goto_1

    .line 189
    :pswitch_1
    iget-object v2, p0, Lcom/hmobile/quickaction/QuickAction;->window:Landroid/widget/PopupWindow;

    if-eqz p3, :cond_1

    const v1, 0x7f0a0032

    :goto_2
    invoke-virtual {v2, v1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    goto :goto_0

    :cond_1
    move v1, v3

    .line 190
    goto :goto_2

    .line 194
    :pswitch_2
    iget-object v2, p0, Lcom/hmobile/quickaction/QuickAction;->window:Landroid/widget/PopupWindow;

    if-eqz p3, :cond_2

    move v1, v4

    :goto_3
    invoke-virtual {v2, v1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    goto :goto_0

    :cond_2
    move v1, v5

    .line 195
    goto :goto_3

    .line 199
    :pswitch_3
    iget-object v2, p0, Lcom/hmobile/quickaction/QuickAction;->window:Landroid/widget/PopupWindow;

    if-eqz p3, :cond_3

    const v1, 0x7f0a0033

    :goto_4
    invoke-virtual {v2, v1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    goto :goto_0

    .line 200
    :cond_3
    const v1, 0x7f0a002e

    goto :goto_4

    .line 204
    :pswitch_4
    div-int/lit8 v6, p1, 0x4

    if-gt v0, v6, :cond_5

    .line 205
    iget-object v3, p0, Lcom/hmobile/quickaction/QuickAction;->window:Landroid/widget/PopupWindow;

    if-eqz p3, :cond_4

    :goto_5
    invoke-virtual {v3, v1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    goto :goto_0

    :cond_4
    move v1, v2

    .line 206
    goto :goto_5

    .line 207
    :cond_5
    div-int/lit8 v1, p1, 0x4

    if-le v0, v1, :cond_7

    .line 208
    div-int/lit8 v1, p1, 0x4

    mul-int/lit8 v1, v1, 0x3

    if-ge v0, v1, :cond_7

    .line 209
    iget-object v1, p0, Lcom/hmobile/quickaction/QuickAction;->window:Landroid/widget/PopupWindow;

    if-eqz p3, :cond_6

    :goto_6
    invoke-virtual {v1, v4}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    goto :goto_0

    :cond_6
    move v4, v5

    .line 210
    goto :goto_6

    .line 212
    :cond_7
    iget-object v1, p0, Lcom/hmobile/quickaction/QuickAction;->window:Landroid/widget/PopupWindow;

    if-eqz p3, :cond_8

    const v3, 0x7f0a0032

    :cond_8
    invoke-virtual {v1, v3}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    goto :goto_0

    .line 182
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private showArrow(II)V
    .locals 5
    .param p1, "whichArrow"    # I
    .param p2, "requestedX"    # I

    .prologue
    const v4, 0x7f0e00c1

    .line 287
    if-ne p1, v4, :cond_0

    iget-object v3, p0, Lcom/hmobile/quickaction/QuickAction;->mArrowUp:Landroid/widget/ImageView;

    .line 289
    .local v3, "showArrow":Landroid/view/View;
    :goto_0
    if-ne p1, v4, :cond_1

    iget-object v1, p0, Lcom/hmobile/quickaction/QuickAction;->mArrowDown:Landroid/widget/ImageView;

    .line 292
    .local v1, "hideArrow":Landroid/view/View;
    :goto_1
    iget-object v4, p0, Lcom/hmobile/quickaction/QuickAction;->mArrowUp:Landroid/widget/ImageView;

    invoke-virtual {v4}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v0

    .line 294
    .local v0, "arrowWidth":I
    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 297
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    .line 296
    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 299
    .local v2, "param":Landroid/view/ViewGroup$MarginLayoutParams;
    div-int/lit8 v4, v0, 0x2

    sub-int v4, p2, v4

    iput v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 301
    const/4 v4, 0x4

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 302
    return-void

    .line 288
    .end local v0    # "arrowWidth":I
    .end local v1    # "hideArrow":Landroid/view/View;
    .end local v2    # "param":Landroid/view/ViewGroup$MarginLayoutParams;
    .end local v3    # "showArrow":Landroid/view/View;
    :cond_0
    iget-object v3, p0, Lcom/hmobile/quickaction/QuickAction;->mArrowDown:Landroid/widget/ImageView;

    goto :goto_0

    .line 290
    .restart local v3    # "showArrow":Landroid/view/View;
    :cond_1
    iget-object v1, p0, Lcom/hmobile/quickaction/QuickAction;->mArrowUp:Landroid/widget/ImageView;

    goto :goto_1
.end method


# virtual methods
.method public addActionItem(Lcom/hmobile/quickaction/ActionItem;)V
    .locals 1
    .param p1, "action"    # Lcom/hmobile/quickaction/ActionItem;

    .prologue
    .line 94
    iget-object v0, p0, Lcom/hmobile/quickaction/QuickAction;->actionList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    return-void
.end method

.method public setAnimStyle(I)V
    .locals 0
    .param p1, "animStyle"    # I

    .prologue
    .line 84
    iput p1, p0, Lcom/hmobile/quickaction/QuickAction;->animStyle:I

    .line 85
    return-void
.end method

.method public show()V
    .locals 18

    .prologue
    .line 102
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/quickaction/QuickAction;->preShow()V

    .line 106
    const/4 v13, 0x2

    new-array v5, v13, [I

    .line 108
    .local v5, "location":[I
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/hmobile/quickaction/QuickAction;->anchor:Landroid/view/View;

    invoke-virtual {v13, v5}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 110
    new-instance v1, Landroid/graphics/Rect;

    const/4 v13, 0x0

    aget v13, v5, v13

    const/4 v14, 0x1

    aget v14, v5, v14

    const/4 v15, 0x0

    aget v15, v5, v15

    .line 111
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/quickaction/QuickAction;->anchor:Landroid/view/View;

    move-object/from16 v16, v0

    invoke-virtual/range {v16 .. v16}, Landroid/view/View;->getWidth()I

    move-result v16

    add-int v15, v15, v16

    const/16 v16, 0x1

    aget v16, v5, v16

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/quickaction/QuickAction;->anchor:Landroid/view/View;

    move-object/from16 v17, v0

    invoke-virtual/range {v17 .. v17}, Landroid/view/View;->getHeight()I

    move-result v17

    add-int v16, v16, v17

    .line 110
    move/from16 v0, v16

    invoke-direct {v1, v13, v14, v15, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 113
    .local v1, "anchorRect":Landroid/graphics/Rect;
    invoke-direct/range {p0 .. p0}, Lcom/hmobile/quickaction/QuickAction;->createActionList()V

    .line 115
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/hmobile/quickaction/QuickAction;->root:Landroid/view/View;

    new-instance v14, Landroid/view/ViewGroup$LayoutParams;

    const/4 v15, -0x2

    .line 116
    const/16 v16, -0x2

    invoke-direct/range {v14 .. v16}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 115
    invoke-virtual {v13, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 117
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/hmobile/quickaction/QuickAction;->root:Landroid/view/View;

    const/4 v14, -0x2

    const/4 v15, -0x2

    invoke-virtual {v13, v14, v15}, Landroid/view/View;->measure(II)V

    .line 119
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/hmobile/quickaction/QuickAction;->root:Landroid/view/View;

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v7

    .line 120
    .local v7, "rootHeight":I
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/hmobile/quickaction/QuickAction;->root:Landroid/view/View;

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    .line 122
    .local v8, "rootWidth":I
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/hmobile/quickaction/QuickAction;->windowManager:Landroid/view/WindowManager;

    invoke-interface {v13}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v13

    invoke-virtual {v13}, Landroid/view/Display;->getWidth()I

    move-result v10

    .line 123
    .local v10, "screenWidth":I
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/hmobile/quickaction/QuickAction;->windowManager:Landroid/view/WindowManager;

    invoke-interface {v13}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v13

    invoke-virtual {v13}, Landroid/view/Display;->getHeight()I

    move-result v9

    .line 126
    .local v9, "screenHeight":I
    iget v13, v1, Landroid/graphics/Rect;->left:I

    add-int/2addr v13, v8

    if-le v13, v10, :cond_1

    .line 127
    iget v13, v1, Landroid/graphics/Rect;->left:I

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/hmobile/quickaction/QuickAction;->anchor:Landroid/view/View;

    invoke-virtual {v14}, Landroid/view/View;->getWidth()I

    move-result v14

    sub-int v14, v8, v14

    sub-int v11, v13, v14

    .line 136
    .local v11, "xPos":I
    :goto_0
    iget v3, v1, Landroid/graphics/Rect;->top:I

    .line 137
    .local v3, "dyTop":I
    iget v13, v1, Landroid/graphics/Rect;->bottom:I

    sub-int v2, v9, v13

    .line 139
    .local v2, "dyBottom":I
    if-le v3, v2, :cond_3

    const/4 v6, 0x1

    .line 141
    .local v6, "onTop":Z
    :goto_1
    if-eqz v6, :cond_5

    .line 142
    if-le v7, v3, :cond_4

    .line 143
    const/16 v12, 0xf

    .line 144
    .local v12, "yPos":I
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/hmobile/quickaction/QuickAction;->scroller:Landroid/widget/ScrollView;

    invoke-virtual {v13}, Landroid/widget/ScrollView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    .line 145
    .local v4, "l":Landroid/view/ViewGroup$LayoutParams;
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/hmobile/quickaction/QuickAction;->anchor:Landroid/view/View;

    invoke-virtual {v13}, Landroid/view/View;->getHeight()I

    move-result v13

    sub-int v13, v3, v13

    iput v13, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 158
    .end local v4    # "l":Landroid/view/ViewGroup$LayoutParams;
    :cond_0
    :goto_2
    if-eqz v6, :cond_6

    const v13, 0x7f0e00c2

    .line 159
    :goto_3
    invoke-virtual {v1}, Landroid/graphics/Rect;->centerX()I

    move-result v14

    sub-int/2addr v14, v11

    .line 158
    move-object/from16 v0, p0

    invoke-direct {v0, v13, v14}, Lcom/hmobile/quickaction/QuickAction;->showArrow(II)V

    .line 161
    invoke-virtual {v1}, Landroid/graphics/Rect;->centerX()I

    move-result v13

    move-object/from16 v0, p0

    invoke-direct {v0, v10, v13, v6}, Lcom/hmobile/quickaction/QuickAction;->setAnimationStyle(IIZ)V

    .line 163
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/hmobile/quickaction/QuickAction;->window:Landroid/widget/PopupWindow;

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/hmobile/quickaction/QuickAction;->anchor:Landroid/view/View;

    const/4 v15, 0x0

    invoke-virtual {v13, v14, v15, v11, v12}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 164
    return-void

    .line 129
    .end local v2    # "dyBottom":I
    .end local v3    # "dyTop":I
    .end local v6    # "onTop":Z
    .end local v11    # "xPos":I
    .end local v12    # "yPos":I
    :cond_1
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/hmobile/quickaction/QuickAction;->anchor:Landroid/view/View;

    invoke-virtual {v13}, Landroid/view/View;->getWidth()I

    move-result v13

    if-le v13, v8, :cond_2

    .line 130
    invoke-virtual {v1}, Landroid/graphics/Rect;->centerX()I

    move-result v13

    div-int/lit8 v14, v8, 0x2

    sub-int v11, v13, v14

    .line 131
    .restart local v11    # "xPos":I
    goto :goto_0

    .line 132
    .end local v11    # "xPos":I
    :cond_2
    iget v11, v1, Landroid/graphics/Rect;->left:I

    .restart local v11    # "xPos":I
    goto :goto_0

    .line 139
    .restart local v2    # "dyBottom":I
    .restart local v3    # "dyTop":I
    :cond_3
    const/4 v6, 0x0

    goto :goto_1

    .line 147
    .restart local v6    # "onTop":Z
    :cond_4
    iget v13, v1, Landroid/graphics/Rect;->top:I

    sub-int/2addr v13, v7

    add-int/lit8 v12, v13, 0xf

    .line 149
    .restart local v12    # "yPos":I
    goto :goto_2

    .line 150
    .end local v12    # "yPos":I
    :cond_5
    iget v13, v1, Landroid/graphics/Rect;->bottom:I

    add-int/lit8 v12, v13, -0xa

    .line 152
    .restart local v12    # "yPos":I
    if-le v7, v2, :cond_0

    .line 153
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/hmobile/quickaction/QuickAction;->scroller:Landroid/widget/ScrollView;

    invoke-virtual {v13}, Landroid/widget/ScrollView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    .line 154
    .restart local v4    # "l":Landroid/view/ViewGroup$LayoutParams;
    iput v2, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    goto :goto_2

    .line 158
    .end local v4    # "l":Landroid/view/ViewGroup$LayoutParams;
    :cond_6
    const v13, 0x7f0e00c1

    goto :goto_3
.end method
