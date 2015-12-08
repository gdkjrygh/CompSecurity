.class public Lcom/QRBS/QuickAction/QuickAction;
.super Lcom/QRBS/QuickAction/PopupWindows;
.source "QuickAction.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/QRBS/QuickAction/QuickAction$OnActionItemClickListener;
    }
.end annotation


# static fields
.field public static final ANIM_AUTO:I = 0x4

.field public static final ANIM_GROW_FROM_CENTER:I = 0x3

.field public static final ANIM_GROW_FROM_LEFT:I = 0x1

.field public static final ANIM_GROW_FROM_RIGHT:I = 0x2


# instance fields
.field private animStyle:I

.field private animateTrack:Z

.field private inflater:Landroid/view/LayoutInflater;

.field private mArrowDown:Landroid/widget/ImageView;

.field private mArrowUp:Landroid/widget/ImageView;

.field private mChildPos:I

.field private mListener:Lcom/QRBS/QuickAction/QuickAction$OnActionItemClickListener;

.field private mTrack:Landroid/view/ViewGroup;

.field private mTrackAnim:Landroid/view/animation/Animation;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 38
    invoke-direct {p0, p1}, Lcom/QRBS/QuickAction/PopupWindows;-><init>(Landroid/content/Context;)V

    .line 40
    const-string v0, "layout_inflater"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Lcom/QRBS/QuickAction/QuickAction;->inflater:Landroid/view/LayoutInflater;

    .line 42
    const v0, 0x7f040006

    invoke-static {p1, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    iput-object v0, p0, Lcom/QRBS/QuickAction/QuickAction;->mTrackAnim:Landroid/view/animation/Animation;

    .line 44
    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickAction;->mTrackAnim:Landroid/view/animation/Animation;

    new-instance v1, Lcom/QRBS/QuickAction/QuickAction$1;

    invoke-direct {v1, p0}, Lcom/QRBS/QuickAction/QuickAction$1;-><init>(Lcom/QRBS/QuickAction/QuickAction;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 52
    const v0, 0x7f030036

    invoke-virtual {p0, v0}, Lcom/QRBS/QuickAction/QuickAction;->setRootViewId(I)V

    .line 54
    const/4 v0, 0x4

    iput v0, p0, Lcom/QRBS/QuickAction/QuickAction;->animStyle:I

    .line 55
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/QRBS/QuickAction/QuickAction;->animateTrack:Z

    .line 56
    const/4 v0, 0x0

    iput v0, p0, Lcom/QRBS/QuickAction/QuickAction;->mChildPos:I

    .line 57
    return-void
.end method

.method static synthetic access$0(Lcom/QRBS/QuickAction/QuickAction;)Lcom/QRBS/QuickAction/QuickAction$OnActionItemClickListener;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickAction;->mListener:Lcom/QRBS/QuickAction/QuickAction$OnActionItemClickListener;

    return-object v0
.end method

.method private setAnimationStyle(IIZ)V
    .locals 7
    .param p1, "screenWidth"    # I
    .param p2, "requestedX"    # I
    .param p3, "onTop"    # Z

    .prologue
    const v4, 0x7f07006a

    const v1, 0x7f070068

    const v5, 0x7f070066

    const v2, 0x7f070064

    const v3, 0x7f070065

    .line 155
    iget-object v6, p0, Lcom/QRBS/QuickAction/QuickAction;->mArrowUp:Landroid/widget/ImageView;

    invoke-virtual {v6}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v6

    div-int/lit8 v6, v6, 0x2

    sub-int v0, p2, v6

    .line 157
    .local v0, "arrowPos":I
    iget v6, p0, Lcom/QRBS/QuickAction/QuickAction;->animStyle:I

    packed-switch v6, :pswitch_data_0

    .line 181
    :goto_0
    return-void

    .line 159
    :pswitch_0
    iget-object v3, p0, Lcom/QRBS/QuickAction/QuickAction;->mWindow:Landroid/widget/PopupWindow;

    if-eqz p3, :cond_0

    :goto_1
    invoke-virtual {v3, v1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    goto :goto_0

    :cond_0
    move v1, v2

    goto :goto_1

    .line 163
    :pswitch_1
    iget-object v2, p0, Lcom/QRBS/QuickAction/QuickAction;->mWindow:Landroid/widget/PopupWindow;

    if-eqz p3, :cond_1

    const v1, 0x7f070069

    :goto_2
    invoke-virtual {v2, v1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    goto :goto_0

    :cond_1
    move v1, v3

    goto :goto_2

    .line 167
    :pswitch_2
    iget-object v2, p0, Lcom/QRBS/QuickAction/QuickAction;->mWindow:Landroid/widget/PopupWindow;

    if-eqz p3, :cond_2

    move v1, v4

    :goto_3
    invoke-virtual {v2, v1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    goto :goto_0

    :cond_2
    move v1, v5

    goto :goto_3

    .line 171
    :pswitch_3
    div-int/lit8 v6, p1, 0x4

    if-gt v0, v6, :cond_4

    .line 172
    iget-object v3, p0, Lcom/QRBS/QuickAction/QuickAction;->mWindow:Landroid/widget/PopupWindow;

    if-eqz p3, :cond_3

    :goto_4
    invoke-virtual {v3, v1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    goto :goto_0

    :cond_3
    move v1, v2

    goto :goto_4

    .line 173
    :cond_4
    div-int/lit8 v1, p1, 0x4

    if-le v0, v1, :cond_6

    div-int/lit8 v1, p1, 0x4

    mul-int/lit8 v1, v1, 0x3

    if-ge v0, v1, :cond_6

    .line 174
    iget-object v1, p0, Lcom/QRBS/QuickAction/QuickAction;->mWindow:Landroid/widget/PopupWindow;

    if-eqz p3, :cond_5

    :goto_5
    invoke-virtual {v1, v4}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    goto :goto_0

    :cond_5
    move v4, v5

    goto :goto_5

    .line 176
    :cond_6
    iget-object v1, p0, Lcom/QRBS/QuickAction/QuickAction;->mWindow:Landroid/widget/PopupWindow;

    if-eqz p3, :cond_7

    :cond_7
    invoke-virtual {v1, v3}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    goto :goto_0

    .line 157
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private showArrow(II)V
    .locals 5
    .param p1, "whichArrow"    # I
    .param p2, "requestedX"    # I

    .prologue
    const v4, 0x7f0d00b7

    .line 183
    if-ne p1, v4, :cond_0

    iget-object v3, p0, Lcom/QRBS/QuickAction/QuickAction;->mArrowUp:Landroid/widget/ImageView;

    .line 184
    .local v3, "showArrow":Landroid/view/View;
    :goto_0
    if-ne p1, v4, :cond_1

    iget-object v1, p0, Lcom/QRBS/QuickAction/QuickAction;->mArrowDown:Landroid/widget/ImageView;

    .line 186
    .local v1, "hideArrow":Landroid/view/View;
    :goto_1
    iget-object v4, p0, Lcom/QRBS/QuickAction/QuickAction;->mArrowUp:Landroid/widget/ImageView;

    invoke-virtual {v4}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v0

    .line 188
    .local v0, "arrowWidth":I
    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 190
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 192
    .local v2, "param":Landroid/view/ViewGroup$MarginLayoutParams;
    div-int/lit8 v4, v0, 0x2

    sub-int v4, p2, v4

    iput v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 194
    const/4 v4, 0x4

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 195
    return-void

    .line 183
    .end local v0    # "arrowWidth":I
    .end local v1    # "hideArrow":Landroid/view/View;
    .end local v2    # "param":Landroid/view/ViewGroup$MarginLayoutParams;
    .end local v3    # "showArrow":Landroid/view/View;
    :cond_0
    iget-object v3, p0, Lcom/QRBS/QuickAction/QuickAction;->mArrowDown:Landroid/widget/ImageView;

    goto :goto_0

    .line 184
    .restart local v3    # "showArrow":Landroid/view/View;
    :cond_1
    iget-object v1, p0, Lcom/QRBS/QuickAction/QuickAction;->mArrowUp:Landroid/widget/ImageView;

    goto :goto_1
.end method


# virtual methods
.method public addActionItem(Lcom/QRBS/QuickAction/ActionItem;)V
    .locals 11
    .param p1, "action"    # Lcom/QRBS/QuickAction/ActionItem;

    .prologue
    const/16 v10, 0x8

    const/4 v9, 0x1

    .line 76
    invoke-virtual {p1}, Lcom/QRBS/QuickAction/ActionItem;->getTitle()Ljava/lang/String;

    move-result-object v5

    .line 77
    .local v5, "title":Ljava/lang/String;
    invoke-virtual {p1}, Lcom/QRBS/QuickAction/ActionItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 79
    .local v1, "icon":Landroid/graphics/drawable/Drawable;
    iget-object v6, p0, Lcom/QRBS/QuickAction/QuickAction;->inflater:Landroid/view/LayoutInflater;

    const v7, 0x7f030015

    const/4 v8, 0x0

    invoke-virtual {v6, v7, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 81
    .local v0, "container":Landroid/view/View;
    const v6, 0x7f0d004b

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 82
    .local v2, "img":Landroid/widget/ImageView;
    const v6, 0x7f0d004c

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 84
    .local v4, "text":Landroid/widget/TextView;
    if-eqz v1, :cond_0

    .line 85
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 89
    :goto_0
    if-eqz v5, :cond_1

    .line 90
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    :goto_1
    iget v3, p0, Lcom/QRBS/QuickAction/QuickAction;->mChildPos:I

    .line 96
    .local v3, "pos":I
    new-instance v6, Lcom/QRBS/QuickAction/QuickAction$2;

    invoke-direct {v6, p0, v3}, Lcom/QRBS/QuickAction/QuickAction$2;-><init>(Lcom/QRBS/QuickAction/QuickAction;I)V

    invoke-virtual {v0, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 105
    invoke-virtual {v0, v9}, Landroid/view/View;->setFocusable(Z)V

    .line 106
    invoke-virtual {v0, v9}, Landroid/view/View;->setClickable(Z)V

    .line 108
    iget-object v6, p0, Lcom/QRBS/QuickAction/QuickAction;->mTrack:Landroid/view/ViewGroup;

    iget v7, p0, Lcom/QRBS/QuickAction/QuickAction;->mChildPos:I

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v6, v0, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 110
    iget v6, p0, Lcom/QRBS/QuickAction/QuickAction;->mChildPos:I

    add-int/lit8 v6, v6, 0x1

    iput v6, p0, Lcom/QRBS/QuickAction/QuickAction;->mChildPos:I

    .line 111
    return-void

    .line 87
    .end local v3    # "pos":I
    :cond_0
    invoke-virtual {v2, v10}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 92
    :cond_1
    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1
.end method

.method public animateTrack(Z)V
    .locals 0
    .param p1, "animateTrack"    # Z

    .prologue
    .line 68
    iput-boolean p1, p0, Lcom/QRBS/QuickAction/QuickAction;->animateTrack:Z

    .line 69
    return-void
.end method

.method public setAnimStyle(I)V
    .locals 0
    .param p1, "animStyle"    # I

    .prologue
    .line 71
    iput p1, p0, Lcom/QRBS/QuickAction/QuickAction;->animStyle:I

    .line 72
    return-void
.end method

.method public setOnActionItemClickListener(Lcom/QRBS/QuickAction/QuickAction$OnActionItemClickListener;)V
    .locals 0
    .param p1, "listener"    # Lcom/QRBS/QuickAction/QuickAction$OnActionItemClickListener;

    .prologue
    .line 114
    iput-object p1, p0, Lcom/QRBS/QuickAction/QuickAction;->mListener:Lcom/QRBS/QuickAction/QuickAction$OnActionItemClickListener;

    .line 115
    return-void
.end method

.method public setRootViewId(I)V
    .locals 2
    .param p1, "id"    # I

    .prologue
    .line 59
    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickAction;->inflater:Landroid/view/LayoutInflater;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/QRBS/QuickAction/QuickAction;->mRootView:Landroid/view/View;

    .line 60
    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickAction;->mRootView:Landroid/view/View;

    const v1, 0x7f0d00b6

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/QRBS/QuickAction/QuickAction;->mTrack:Landroid/view/ViewGroup;

    .line 62
    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickAction;->mRootView:Landroid/view/View;

    const v1, 0x7f0d00b8

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/QRBS/QuickAction/QuickAction;->mArrowDown:Landroid/widget/ImageView;

    .line 63
    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickAction;->mRootView:Landroid/view/View;

    const v1, 0x7f0d00b7

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/QRBS/QuickAction/QuickAction;->mArrowUp:Landroid/widget/ImageView;

    .line 65
    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickAction;->mRootView:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/QRBS/QuickAction/QuickAction;->setContentView(Landroid/view/View;)V

    .line 66
    return-void
.end method

.method public show(Landroid/view/View;)V
    .locals 13
    .param p1, "anchor"    # Landroid/view/View;

    .prologue
    .line 118
    invoke-virtual {p0}, Lcom/QRBS/QuickAction/QuickAction;->preShow()V

    .line 120
    const/4 v8, 0x2

    new-array v1, v8, [I

    .line 122
    .local v1, "location":[I
    invoke-virtual {p1, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 124
    new-instance v0, Landroid/graphics/Rect;

    const/4 v8, 0x0

    aget v8, v1, v8

    const/4 v9, 0x1

    aget v9, v1, v9

    const/4 v10, 0x0

    aget v10, v1, v10

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v11

    add-int/2addr v10, v11

    const/4 v11, 0x1

    aget v11, v1, v11

    .line 125
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v12

    add-int/2addr v11, v12

    .line 124
    invoke-direct {v0, v8, v9, v10, v11}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 127
    .local v0, "anchorRect":Landroid/graphics/Rect;
    iget-object v8, p0, Lcom/QRBS/QuickAction/QuickAction;->mRootView:Landroid/view/View;

    new-instance v9, Landroid/view/ViewGroup$LayoutParams;

    const/4 v10, -0x2

    const/4 v11, -0x2

    invoke-direct {v9, v10, v11}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v8, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 128
    iget-object v8, p0, Lcom/QRBS/QuickAction/QuickAction;->mRootView:Landroid/view/View;

    const/4 v9, -0x2

    const/4 v10, -0x2

    invoke-virtual {v8, v9, v10}, Landroid/view/View;->measure(II)V

    .line 130
    iget-object v8, p0, Lcom/QRBS/QuickAction/QuickAction;->mRootView:Landroid/view/View;

    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    .line 131
    .local v4, "rootWidth":I
    iget-object v8, p0, Lcom/QRBS/QuickAction/QuickAction;->mRootView:Landroid/view/View;

    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    .line 133
    .local v3, "rootHeight":I
    iget-object v8, p0, Lcom/QRBS/QuickAction/QuickAction;->mWindowManager:Landroid/view/WindowManager;

    invoke-interface {v8}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v8

    invoke-virtual {v8}, Landroid/view/Display;->getWidth()I

    move-result v5

    .line 135
    .local v5, "screenWidth":I
    sub-int v8, v5, v4

    div-int/lit8 v6, v8, 0x2

    .line 136
    .local v6, "xPos":I
    iget v8, v0, Landroid/graphics/Rect;->top:I

    sub-int v7, v8, v3

    .line 138
    .local v7, "yPos":I
    const/4 v2, 0x1

    .line 140
    .local v2, "onTop":Z
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v8

    if-le v3, v8, :cond_0

    .line 141
    iget v7, v0, Landroid/graphics/Rect;->bottom:I

    .line 142
    const/4 v2, 0x0

    .line 145
    :cond_0
    if-eqz v2, :cond_2

    const v8, 0x7f0d00b8

    :goto_0
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v9

    invoke-direct {p0, v8, v9}, Lcom/QRBS/QuickAction/QuickAction;->showArrow(II)V

    .line 147
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v8

    invoke-direct {p0, v5, v8, v2}, Lcom/QRBS/QuickAction/QuickAction;->setAnimationStyle(IIZ)V

    .line 149
    iget-object v8, p0, Lcom/QRBS/QuickAction/QuickAction;->mWindow:Landroid/widget/PopupWindow;

    const/4 v9, 0x0

    invoke-virtual {v8, p1, v9, v6, v7}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 151
    iget-boolean v8, p0, Lcom/QRBS/QuickAction/QuickAction;->animateTrack:Z

    if-eqz v8, :cond_1

    iget-object v8, p0, Lcom/QRBS/QuickAction/QuickAction;->mTrack:Landroid/view/ViewGroup;

    iget-object v9, p0, Lcom/QRBS/QuickAction/QuickAction;->mTrackAnim:Landroid/view/animation/Animation;

    invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->startAnimation(Landroid/view/animation/Animation;)V

    .line 152
    :cond_1
    return-void

    .line 145
    :cond_2
    const v8, 0x7f0d00b7

    goto :goto_0
.end method
