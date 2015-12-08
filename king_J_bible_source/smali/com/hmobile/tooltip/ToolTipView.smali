.class public Lcom/hmobile/tooltip/ToolTipView;
.super Landroid/widget/LinearLayout;
.source "ToolTipView.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/hmobile/tooltip/ToolTipView$OnToolTipViewClickedListener;
    }
.end annotation


# instance fields
.field private mBottomFrame:Landroid/view/View;

.field private mBottomPointerView:Landroid/widget/ImageView;

.field private mContentHolder:Landroid/view/ViewGroup;

.field private mDimensionsKnown:Z

.field private mListener:Lcom/hmobile/tooltip/ToolTipView$OnToolTipViewClickedListener;

.field private mRelativeMasterViewX:I

.field private mRelativeMasterViewY:I

.field private mShadowView:Landroid/view/View;

.field private mToolTip:Lcom/hmobile/tooltip/ToolTip;

.field private mToolTipTV:Landroid/widget/TextView;

.field private mTopFrame:Landroid/view/View;

.field private mTopPointerView:Landroid/widget/ImageView;

.field private mView:Landroid/view/View;

.field private mWidth:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 67
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 68
    invoke-direct {p0}, Lcom/hmobile/tooltip/ToolTipView;->init()V

    .line 69
    return-void
.end method

.method private applyToolTipPosition()V
    .locals 23

    .prologue
    .line 134
    const/16 v18, 0x2

    move/from16 v0, v18

    new-array v8, v0, [I

    .line 135
    .local v8, "masterViewScreenPosition":[I
    const/16 v18, 0x2

    move/from16 v0, v18

    new-array v10, v0, [I

    .line 137
    .local v10, "parentViewScreenPosition":[I
    new-instance v17, Landroid/graphics/Rect;

    invoke-direct/range {v17 .. v17}, Landroid/graphics/Rect;-><init>()V

    .line 139
    .local v17, "viewDisplayFrame":Landroid/graphics/Rect;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/tooltip/ToolTipView;->mView:Landroid/view/View;

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    invoke-virtual {v0, v8}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 140
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/tooltip/ToolTipView;->mView:Landroid/view/View;

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 141
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/tooltip/ToolTipView;->getParent()Landroid/view/ViewParent;

    move-result-object v18

    check-cast v18, Landroid/view/View;

    move-object/from16 v0, v18

    invoke-virtual {v0, v10}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 143
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/tooltip/ToolTipView;->mView:Landroid/view/View;

    move-object/from16 v18, v0

    invoke-virtual/range {v18 .. v18}, Landroid/view/View;->getWidth()I

    move-result v9

    .line 144
    .local v9, "masterViewWidth":I
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/tooltip/ToolTipView;->mView:Landroid/view/View;

    move-object/from16 v18, v0

    invoke-virtual/range {v18 .. v18}, Landroid/view/View;->getHeight()I

    move-result v7

    .line 146
    .local v7, "masterViewHeight":I
    const/16 v18, 0x0

    aget v18, v8, v18

    .line 147
    const/16 v19, 0x0

    aget v19, v10, v19

    sub-int v18, v18, v19

    .line 146
    move/from16 v0, v18

    move-object/from16 v1, p0

    iput v0, v1, Lcom/hmobile/tooltip/ToolTipView;->mRelativeMasterViewX:I

    .line 148
    const/16 v18, 0x1

    aget v18, v8, v18

    .line 149
    const/16 v19, 0x1

    aget v19, v10, v19

    sub-int v18, v18, v19

    .line 148
    move/from16 v0, v18

    move-object/from16 v1, p0

    iput v0, v1, Lcom/hmobile/tooltip/ToolTipView;->mRelativeMasterViewY:I

    .line 150
    move-object/from16 v0, p0

    iget v0, v0, Lcom/hmobile/tooltip/ToolTipView;->mRelativeMasterViewX:I

    move/from16 v18, v0

    .line 151
    div-int/lit8 v19, v9, 0x2

    .line 150
    add-int v11, v18, v19

    .line 153
    .local v11, "relativeMasterViewCenterX":I
    move-object/from16 v0, p0

    iget v0, v0, Lcom/hmobile/tooltip/ToolTipView;->mRelativeMasterViewY:I

    move/from16 v18, v0

    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/tooltip/ToolTipView;->getHeight()I

    move-result v19

    sub-int v18, v18, v19

    move/from16 v0, v18

    int-to-float v13, v0

    .line 154
    .local v13, "toolTipViewAboveY":F
    move-object/from16 v0, p0

    iget v0, v0, Lcom/hmobile/tooltip/ToolTipView;->mRelativeMasterViewY:I

    move/from16 v18, v0

    add-int v18, v18, v7

    move/from16 v0, v18

    int-to-float v14, v0

    .line 158
    .local v14, "toolTipViewBelowY":F
    const/16 v18, 0x0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/hmobile/tooltip/ToolTipView;->mWidth:I

    move/from16 v19, v0

    div-int/lit8 v19, v19, 0x2

    sub-int v19, v11, v19

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->max(II)I

    move-result v18

    move/from16 v0, v18

    int-to-float v15, v0

    .line 159
    .local v15, "toolTipViewX":F
    move-object/from16 v0, p0

    iget v0, v0, Lcom/hmobile/tooltip/ToolTipView;->mWidth:I

    move/from16 v18, v0

    move/from16 v0, v18

    int-to-float v0, v0

    move/from16 v18, v0

    add-float v18, v18, v15

    move-object/from16 v0, v17

    iget v0, v0, Landroid/graphics/Rect;->right:I

    move/from16 v19, v0

    move/from16 v0, v19

    int-to-float v0, v0

    move/from16 v19, v0

    cmpl-float v18, v18, v19

    if-lez v18, :cond_0

    .line 160
    move-object/from16 v0, v17

    iget v0, v0, Landroid/graphics/Rect;->right:I

    move/from16 v18, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/hmobile/tooltip/ToolTipView;->mWidth:I

    move/from16 v19, v0

    sub-int v18, v18, v19

    move/from16 v0, v18

    int-to-float v15, v0

    .line 163
    :cond_0
    move-object/from16 v0, p0

    invoke-virtual {v0, v15}, Lcom/hmobile/tooltip/ToolTipView;->setX(F)V

    .line 164
    move-object/from16 v0, p0

    invoke-virtual {v0, v11}, Lcom/hmobile/tooltip/ToolTipView;->setPointerCenterX(I)V

    .line 166
    const/16 v18, 0x0

    cmpg-float v18, v13, v18

    if-gez v18, :cond_3

    const/4 v12, 0x1

    .line 168
    .local v12, "showBelow":Z
    :goto_0
    sget v18, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v19, 0xb

    move/from16 v0, v18

    move/from16 v1, v19

    if-ge v0, v1, :cond_6

    .line 169
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/tooltip/ToolTipView;->mTopPointerView:Landroid/widget/ImageView;

    move-object/from16 v19, v0

    if-eqz v12, :cond_4

    const/16 v18, 0x1

    :goto_1
    move/from16 v0, v18

    int-to-float v0, v0

    move/from16 v18, v0

    move-object/from16 v0, v19

    move/from16 v1, v18

    invoke-static {v0, v1}, Lcom/nineoldandroids/view/ViewHelper;->setAlpha(Landroid/view/View;F)V

    .line 170
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/tooltip/ToolTipView;->mBottomPointerView:Landroid/widget/ImageView;

    move-object/from16 v19, v0

    if-eqz v12, :cond_5

    const/16 v18, 0x0

    :goto_2
    move/from16 v0, v18

    int-to-float v0, v0

    move/from16 v18, v0

    move-object/from16 v0, v19

    move/from16 v1, v18

    invoke-static {v0, v1}, Lcom/nineoldandroids/view/ViewHelper;->setAlpha(Landroid/view/View;F)V

    .line 176
    :goto_3
    if-eqz v12, :cond_9

    .line 177
    move/from16 v16, v14

    .line 182
    .local v16, "toolTipViewY":F
    :goto_4
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 184
    .local v4, "animators":Ljava/util/List;, "Ljava/util/List<Lcom/nineoldandroids/animation/Animator;>;"
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/tooltip/ToolTipView;->mToolTip:Lcom/hmobile/tooltip/ToolTip;

    move-object/from16 v18, v0

    invoke-virtual/range {v18 .. v18}, Lcom/hmobile/tooltip/ToolTip;->getAnimationType()I

    move-result v18

    const/16 v19, 0x65

    move/from16 v0, v18

    move/from16 v1, v19

    if-ne v0, v1, :cond_a

    .line 185
    const-string v18, "translationY"

    const/16 v19, 0x2

    move/from16 v0, v19

    new-array v0, v0, [F

    move-object/from16 v19, v0

    const/16 v20, 0x0

    .line 186
    move-object/from16 v0, p0

    iget v0, v0, Lcom/hmobile/tooltip/ToolTipView;->mRelativeMasterViewY:I

    move/from16 v21, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/tooltip/ToolTipView;->mView:Landroid/view/View;

    move-object/from16 v22, v0

    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getHeight()I

    move-result v22

    div-int/lit8 v22, v22, 0x2

    add-int v21, v21, v22

    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/tooltip/ToolTipView;->getHeight()I

    move-result v22

    .line 187
    div-int/lit8 v22, v22, 0x2

    .line 186
    sub-int v21, v21, v22

    move/from16 v0, v21

    int-to-float v0, v0

    move/from16 v21, v0

    aput v21, v19, v20

    const/16 v20, 0x1

    .line 187
    aput v16, v19, v20

    .line 185
    move-object/from16 v0, p0

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-static {v0, v1, v2}, Lcom/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/animation/ObjectAnimator;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 188
    const-string v18, "translationX"

    const/16 v19, 0x2

    move/from16 v0, v19

    new-array v0, v0, [F

    move-object/from16 v19, v0

    const/16 v20, 0x0

    .line 189
    move-object/from16 v0, p0

    iget v0, v0, Lcom/hmobile/tooltip/ToolTipView;->mRelativeMasterViewX:I

    move/from16 v21, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/tooltip/ToolTipView;->mView:Landroid/view/View;

    move-object/from16 v22, v0

    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getWidth()I

    move-result v22

    div-int/lit8 v22, v22, 0x2

    add-int v21, v21, v22

    move-object/from16 v0, p0

    iget v0, v0, Lcom/hmobile/tooltip/ToolTipView;->mWidth:I

    move/from16 v22, v0

    div-int/lit8 v22, v22, 0x2

    sub-int v21, v21, v22

    move/from16 v0, v21

    int-to-float v0, v0

    move/from16 v21, v0

    aput v21, v19, v20

    const/16 v20, 0x1

    .line 190
    aput v15, v19, v20

    .line 188
    move-object/from16 v0, p0

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-static {v0, v1, v2}, Lcom/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/animation/ObjectAnimator;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 196
    :cond_1
    :goto_5
    const-string v18, "scaleX"

    const/16 v19, 0x2

    move/from16 v0, v19

    new-array v0, v0, [F

    move-object/from16 v19, v0

    fill-array-data v19, :array_0

    move-object/from16 v0, p0

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-static {v0, v1, v2}, Lcom/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/animation/ObjectAnimator;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 197
    const-string v18, "scaleY"

    const/16 v19, 0x2

    move/from16 v0, v19

    new-array v0, v0, [F

    move-object/from16 v19, v0

    fill-array-data v19, :array_1

    move-object/from16 v0, p0

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-static {v0, v1, v2}, Lcom/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/animation/ObjectAnimator;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 199
    const-string v18, "alpha"

    const/16 v19, 0x2

    move/from16 v0, v19

    new-array v0, v0, [F

    move-object/from16 v19, v0

    fill-array-data v19, :array_2

    move-object/from16 v0, p0

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-static {v0, v1, v2}, Lcom/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/animation/ObjectAnimator;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 201
    new-instance v3, Lcom/nineoldandroids/animation/AnimatorSet;

    invoke-direct {v3}, Lcom/nineoldandroids/animation/AnimatorSet;-><init>()V

    .line 202
    .local v3, "animatorSet":Lcom/nineoldandroids/animation/AnimatorSet;
    invoke-virtual {v3, v4}, Lcom/nineoldandroids/animation/AnimatorSet;->playTogether(Ljava/util/Collection;)V

    .line 204
    sget v18, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v19, 0xb

    move/from16 v0, v18

    move/from16 v1, v19

    if-ge v0, v1, :cond_2

    .line 205
    move v5, v15

    .line 206
    .local v5, "fToolTipViewX":F
    move/from16 v6, v16

    .line 207
    .local v6, "fToolTipViewY":F
    new-instance v18, Lcom/hmobile/tooltip/ToolTipView$1;

    move-object/from16 v0, v18

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v5, v6}, Lcom/hmobile/tooltip/ToolTipView$1;-><init>(Lcom/hmobile/tooltip/ToolTipView;FF)V

    move-object/from16 v0, v18

    invoke-virtual {v3, v0}, Lcom/nineoldandroids/animation/AnimatorSet;->addListener(Lcom/nineoldandroids/animation/Animator$AnimatorListener;)V

    .line 234
    .end local v5    # "fToolTipViewX":F
    .end local v6    # "fToolTipViewY":F
    :cond_2
    invoke-virtual {v3}, Lcom/nineoldandroids/animation/AnimatorSet;->start()V

    .line 235
    return-void

    .line 166
    .end local v3    # "animatorSet":Lcom/nineoldandroids/animation/AnimatorSet;
    .end local v4    # "animators":Ljava/util/List;, "Ljava/util/List<Lcom/nineoldandroids/animation/Animator;>;"
    .end local v12    # "showBelow":Z
    .end local v16    # "toolTipViewY":F
    :cond_3
    const/4 v12, 0x0

    goto/16 :goto_0

    .line 169
    .restart local v12    # "showBelow":Z
    :cond_4
    const/16 v18, 0x0

    goto/16 :goto_1

    .line 170
    :cond_5
    const/16 v18, 0x1

    goto/16 :goto_2

    .line 172
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/tooltip/ToolTipView;->mTopPointerView:Landroid/widget/ImageView;

    move-object/from16 v19, v0

    if-eqz v12, :cond_7

    const/16 v18, 0x0

    :goto_6
    move-object/from16 v0, v19

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 173
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/tooltip/ToolTipView;->mBottomPointerView:Landroid/widget/ImageView;

    move-object/from16 v19, v0

    if-eqz v12, :cond_8

    const/16 v18, 0x8

    :goto_7
    move-object/from16 v0, v19

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_3

    .line 172
    :cond_7
    const/16 v18, 0x8

    goto :goto_6

    .line 173
    :cond_8
    const/16 v18, 0x0

    goto :goto_7

    .line 179
    :cond_9
    move/from16 v16, v13

    .restart local v16    # "toolTipViewY":F
    goto/16 :goto_4

    .line 191
    .restart local v4    # "animators":Ljava/util/List;, "Ljava/util/List<Lcom/nineoldandroids/animation/Animator;>;"
    :cond_a
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/tooltip/ToolTipView;->mToolTip:Lcom/hmobile/tooltip/ToolTip;

    move-object/from16 v18, v0

    invoke-virtual/range {v18 .. v18}, Lcom/hmobile/tooltip/ToolTip;->getAnimationType()I

    move-result v18

    const/16 v19, 0x66

    move/from16 v0, v18

    move/from16 v1, v19

    if-ne v0, v1, :cond_1

    .line 192
    const-string v18, "translationY"

    const/16 v19, 0x2

    move/from16 v0, v19

    new-array v0, v0, [F

    move-object/from16 v19, v0

    const/16 v20, 0x0

    const/16 v21, 0x0

    aput v21, v19, v20

    const/16 v20, 0x1

    .line 193
    aput v16, v19, v20

    .line 192
    move-object/from16 v0, p0

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-static {v0, v1, v2}, Lcom/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/animation/ObjectAnimator;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_5

    .line 196
    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 197
    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 199
    :array_2
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private init()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, -0x2

    .line 72
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 73
    invoke-direct {v0, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 72
    invoke-virtual {p0, v0}, Lcom/hmobile/tooltip/ToolTipView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 74
    invoke-virtual {p0, v2}, Lcom/hmobile/tooltip/ToolTipView;->setOrientation(I)V

    .line 75
    invoke-virtual {p0}, Lcom/hmobile/tooltip/ToolTipView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030034

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 77
    const v0, 0x7f0e012f

    invoke-virtual {p0, v0}, Lcom/hmobile/tooltip/ToolTipView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/hmobile/tooltip/ToolTipView;->mTopPointerView:Landroid/widget/ImageView;

    .line 78
    const v0, 0x7f0e012e

    invoke-virtual {p0, v0}, Lcom/hmobile/tooltip/ToolTipView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/hmobile/tooltip/ToolTipView;->mTopFrame:Landroid/view/View;

    .line 79
    const v0, 0x7f0e0130

    invoke-virtual {p0, v0}, Lcom/hmobile/tooltip/ToolTipView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/hmobile/tooltip/ToolTipView;->mContentHolder:Landroid/view/ViewGroup;

    .line 80
    const v0, 0x7f0e0131

    invoke-virtual {p0, v0}, Lcom/hmobile/tooltip/ToolTipView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/hmobile/tooltip/ToolTipView;->mToolTipTV:Landroid/widget/TextView;

    .line 81
    const v0, 0x7f0e0133

    invoke-virtual {p0, v0}, Lcom/hmobile/tooltip/ToolTipView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/hmobile/tooltip/ToolTipView;->mBottomFrame:Landroid/view/View;

    .line 82
    const v0, 0x7f0e0134

    invoke-virtual {p0, v0}, Lcom/hmobile/tooltip/ToolTipView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/hmobile/tooltip/ToolTipView;->mBottomPointerView:Landroid/widget/ImageView;

    .line 83
    const v0, 0x7f0e0132

    invoke-virtual {p0, v0}, Lcom/hmobile/tooltip/ToolTipView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/hmobile/tooltip/ToolTipView;->mShadowView:Landroid/view/View;

    .line 85
    invoke-virtual {p0, p0}, Lcom/hmobile/tooltip/ToolTipView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 86
    invoke-virtual {p0}, Lcom/hmobile/tooltip/ToolTipView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 87
    return-void
.end method

.method private setContentView(Landroid/view/View;)V
    .locals 1
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 263
    iget-object v0, p0, Lcom/hmobile/tooltip/ToolTipView;->mContentHolder:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 264
    iget-object v0, p0, Lcom/hmobile/tooltip/ToolTipView;->mContentHolder:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 265
    return-void
.end method


# virtual methods
.method public getX()F
    .locals 2

    .prologue
    .line 334
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 335
    invoke-super {p0}, Landroid/widget/LinearLayout;->getX()F

    move-result v0

    .line 337
    :goto_0
    return v0

    :cond_0
    invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper;->getX(Landroid/view/View;)F

    move-result v0

    goto :goto_0
.end method

.method public getY()F
    .locals 2

    .prologue
    .line 358
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 359
    invoke-super {p0}, Landroid/widget/LinearLayout;->getY()F

    move-result v0

    .line 361
    :goto_0
    return v0

    :cond_0
    invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper;->getY(Landroid/view/View;)F

    move-result v0

    goto :goto_0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 323
    iget-object v0, p0, Lcom/hmobile/tooltip/ToolTipView;->mListener:Lcom/hmobile/tooltip/ToolTipView$OnToolTipViewClickedListener;

    if-eqz v0, :cond_0

    .line 324
    iget-object v0, p0, Lcom/hmobile/tooltip/ToolTipView;->mListener:Lcom/hmobile/tooltip/ToolTipView$OnToolTipViewClickedListener;

    invoke-interface {v0, p0}, Lcom/hmobile/tooltip/ToolTipView$OnToolTipViewClickedListener;->onToolTipViewClicked(Lcom/hmobile/tooltip/ToolTipView;)V

    .line 326
    :cond_0
    return-void
.end method

.method public onPreDraw()Z
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 91
    invoke-virtual {p0}, Lcom/hmobile/tooltip/ToolTipView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 92
    iput-boolean v2, p0, Lcom/hmobile/tooltip/ToolTipView;->mDimensionsKnown:Z

    .line 94
    iget-object v1, p0, Lcom/hmobile/tooltip/ToolTipView;->mContentHolder:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getWidth()I

    move-result v1

    iput v1, p0, Lcom/hmobile/tooltip/ToolTipView;->mWidth:I

    .line 96
    invoke-virtual {p0}, Lcom/hmobile/tooltip/ToolTipView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 97
    .local v0, "layoutParams":Landroid/widget/RelativeLayout$LayoutParams;
    iget v1, p0, Lcom/hmobile/tooltip/ToolTipView;->mWidth:I

    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 98
    invoke-virtual {p0, v0}, Lcom/hmobile/tooltip/ToolTipView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 100
    iget-object v1, p0, Lcom/hmobile/tooltip/ToolTipView;->mToolTip:Lcom/hmobile/tooltip/ToolTip;

    if-eqz v1, :cond_0

    .line 101
    invoke-direct {p0}, Lcom/hmobile/tooltip/ToolTipView;->applyToolTipPosition()V

    .line 103
    :cond_0
    return v2
.end method

.method public remove()V
    .locals 10

    .prologue
    const/4 v9, 0x1

    const/4 v8, 0x0

    const/4 v7, 0x2

    .line 268
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0xb

    if-ge v3, v4, :cond_0

    .line 269
    invoke-virtual {p0}, Lcom/hmobile/tooltip/ToolTipView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 270
    .local v2, "params":Landroid/widget/RelativeLayout$LayoutParams;
    iget v3, v2, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    int-to-float v3, v3

    invoke-virtual {p0, v3}, Lcom/hmobile/tooltip/ToolTipView;->setX(F)V

    .line 271
    iget v3, v2, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    int-to-float v3, v3

    invoke-virtual {p0, v3}, Lcom/hmobile/tooltip/ToolTipView;->setY(F)V

    .line 272
    iput v8, v2, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 273
    iput v8, v2, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 274
    invoke-virtual {p0, v2}, Lcom/hmobile/tooltip/ToolTipView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 277
    .end local v2    # "params":Landroid/widget/RelativeLayout$LayoutParams;
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 278
    .local v1, "animators":Ljava/util/List;, "Ljava/util/List<Lcom/nineoldandroids/animation/Animator;>;"
    iget-object v3, p0, Lcom/hmobile/tooltip/ToolTipView;->mToolTip:Lcom/hmobile/tooltip/ToolTip;

    invoke-virtual {v3}, Lcom/hmobile/tooltip/ToolTip;->getAnimationType()I

    move-result v3

    const/16 v4, 0x65

    if-ne v3, v4, :cond_1

    .line 279
    const-string v3, "translationY"

    new-array v4, v7, [F

    invoke-virtual {p0}, Lcom/hmobile/tooltip/ToolTipView;->getY()F

    move-result v5

    aput v5, v4, v8

    .line 280
    iget v5, p0, Lcom/hmobile/tooltip/ToolTipView;->mRelativeMasterViewY:I

    iget-object v6, p0, Lcom/hmobile/tooltip/ToolTipView;->mView:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    move-result v6

    div-int/lit8 v6, v6, 0x2

    add-int/2addr v5, v6

    invoke-virtual {p0}, Lcom/hmobile/tooltip/ToolTipView;->getHeight()I

    move-result v6

    .line 281
    div-int/lit8 v6, v6, 0x2

    .line 280
    sub-int/2addr v5, v6

    int-to-float v5, v5

    aput v5, v4, v9

    .line 279
    invoke-static {p0, v3, v4}, Lcom/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/animation/ObjectAnimator;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 282
    const-string v3, "translationX"

    new-array v4, v7, [F

    invoke-virtual {p0}, Lcom/hmobile/tooltip/ToolTipView;->getX()F

    move-result v5

    aput v5, v4, v8

    .line 283
    iget v5, p0, Lcom/hmobile/tooltip/ToolTipView;->mRelativeMasterViewX:I

    iget-object v6, p0, Lcom/hmobile/tooltip/ToolTipView;->mView:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    move-result v6

    div-int/lit8 v6, v6, 0x2

    add-int/2addr v5, v6

    iget v6, p0, Lcom/hmobile/tooltip/ToolTipView;->mWidth:I

    div-int/lit8 v6, v6, 0x2

    sub-int/2addr v5, v6

    int-to-float v5, v5

    aput v5, v4, v9

    .line 282
    invoke-static {p0, v3, v4}, Lcom/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/animation/ObjectAnimator;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 289
    :goto_0
    const-string v3, "scaleX"

    new-array v4, v7, [F

    fill-array-data v4, :array_0

    invoke-static {p0, v3, v4}, Lcom/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/animation/ObjectAnimator;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 290
    const-string v3, "scaleY"

    new-array v4, v7, [F

    fill-array-data v4, :array_1

    invoke-static {p0, v3, v4}, Lcom/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/animation/ObjectAnimator;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 292
    const-string v3, "alpha"

    new-array v4, v7, [F

    fill-array-data v4, :array_2

    invoke-static {p0, v3, v4}, Lcom/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/animation/ObjectAnimator;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 294
    new-instance v0, Lcom/nineoldandroids/animation/AnimatorSet;

    invoke-direct {v0}, Lcom/nineoldandroids/animation/AnimatorSet;-><init>()V

    .line 295
    .local v0, "animatorSet":Lcom/nineoldandroids/animation/AnimatorSet;
    invoke-virtual {v0, v1}, Lcom/nineoldandroids/animation/AnimatorSet;->playTogether(Ljava/util/Collection;)V

    .line 296
    new-instance v3, Lcom/hmobile/tooltip/ToolTipView$2;

    invoke-direct {v3, p0}, Lcom/hmobile/tooltip/ToolTipView$2;-><init>(Lcom/hmobile/tooltip/ToolTipView;)V

    invoke-virtual {v0, v3}, Lcom/nineoldandroids/animation/AnimatorSet;->addListener(Lcom/nineoldandroids/animation/Animator$AnimatorListener;)V

    .line 316
    invoke-virtual {v0}, Lcom/nineoldandroids/animation/AnimatorSet;->start()V

    .line 317
    return-void

    .line 285
    .end local v0    # "animatorSet":Lcom/nineoldandroids/animation/AnimatorSet;
    :cond_1
    const-string v3, "translationY"

    new-array v4, v7, [F

    invoke-virtual {p0}, Lcom/hmobile/tooltip/ToolTipView;->getY()F

    move-result v5

    aput v5, v4, v8

    .line 286
    const/4 v5, 0x0

    aput v5, v4, v9

    .line 285
    invoke-static {p0, v3, v4}, Lcom/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/animation/ObjectAnimator;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 289
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    .line 290
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    .line 292
    :array_2
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public setColor(I)V
    .locals 2
    .param p1, "color"    # I

    .prologue
    .line 253
    iget-object v0, p0, Lcom/hmobile/tooltip/ToolTipView;->mTopPointerView:Landroid/widget/ImageView;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, p1, v1}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 254
    iget-object v0, p0, Lcom/hmobile/tooltip/ToolTipView;->mTopFrame:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 255
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    .line 254
    invoke-virtual {v0, p1, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 256
    iget-object v0, p0, Lcom/hmobile/tooltip/ToolTipView;->mBottomPointerView:Landroid/widget/ImageView;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, p1, v1}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 257
    iget-object v0, p0, Lcom/hmobile/tooltip/ToolTipView;->mBottomFrame:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 258
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    .line 257
    invoke-virtual {v0, p1, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 259
    iget-object v0, p0, Lcom/hmobile/tooltip/ToolTipView;->mContentHolder:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    .line 260
    return-void
.end method

.method public setOnToolTipViewClickedListener(Lcom/hmobile/tooltip/ToolTipView$OnToolTipViewClickedListener;)V
    .locals 0
    .param p1, "listener"    # Lcom/hmobile/tooltip/ToolTipView$OnToolTipViewClickedListener;

    .prologue
    .line 249
    iput-object p1, p0, Lcom/hmobile/tooltip/ToolTipView;->mListener:Lcom/hmobile/tooltip/ToolTipView$OnToolTipViewClickedListener;

    .line 250
    return-void
.end method

.method public setPointerCenterX(I)V
    .locals 4
    .param p1, "pointerCenterX"    # I

    .prologue
    .line 238
    iget-object v1, p0, Lcom/hmobile/tooltip/ToolTipView;->mTopPointerView:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v1

    .line 239
    iget-object v2, p0, Lcom/hmobile/tooltip/ToolTipView;->mBottomPointerView:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v2

    .line 238
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 241
    .local v0, "pointerWidth":I
    iget-object v1, p0, Lcom/hmobile/tooltip/ToolTipView;->mTopPointerView:Landroid/widget/ImageView;

    div-int/lit8 v2, v0, 0x2

    sub-int v2, p1, v2

    int-to-float v2, v2

    .line 242
    invoke-virtual {p0}, Lcom/hmobile/tooltip/ToolTipView;->getX()F

    move-result v3

    sub-float/2addr v2, v3

    .line 241
    invoke-static {v1, v2}, Lcom/nineoldandroids/view/ViewHelper;->setX(Landroid/view/View;F)V

    .line 243
    iget-object v1, p0, Lcom/hmobile/tooltip/ToolTipView;->mBottomPointerView:Landroid/widget/ImageView;

    div-int/lit8 v2, v0, 0x2

    sub-int v2, p1, v2

    int-to-float v2, v2

    .line 244
    invoke-virtual {p0}, Lcom/hmobile/tooltip/ToolTipView;->getX()F

    move-result v3

    sub-float/2addr v2, v3

    .line 243
    invoke-static {v1, v2}, Lcom/nineoldandroids/view/ViewHelper;->setX(Landroid/view/View;F)V

    .line 245
    return-void
.end method

.method public setToolTip(Lcom/hmobile/tooltip/ToolTip;Landroid/view/View;)V
    .locals 2
    .param p1, "toolTip"    # Lcom/hmobile/tooltip/ToolTip;
    .param p2, "view"    # Landroid/view/View;

    .prologue
    .line 107
    iput-object p1, p0, Lcom/hmobile/tooltip/ToolTipView;->mToolTip:Lcom/hmobile/tooltip/ToolTip;

    .line 108
    iput-object p2, p0, Lcom/hmobile/tooltip/ToolTipView;->mView:Landroid/view/View;

    .line 110
    iget-object v0, p0, Lcom/hmobile/tooltip/ToolTipView;->mToolTip:Lcom/hmobile/tooltip/ToolTip;

    invoke-virtual {v0}, Lcom/hmobile/tooltip/ToolTip;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 111
    iget-object v0, p0, Lcom/hmobile/tooltip/ToolTipView;->mToolTipTV:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/hmobile/tooltip/ToolTipView;->mToolTip:Lcom/hmobile/tooltip/ToolTip;

    invoke-virtual {v1}, Lcom/hmobile/tooltip/ToolTip;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 116
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/hmobile/tooltip/ToolTipView;->mToolTip:Lcom/hmobile/tooltip/ToolTip;

    invoke-virtual {v0}, Lcom/hmobile/tooltip/ToolTip;->getColor()I

    move-result v0

    if-eqz v0, :cond_1

    .line 117
    iget-object v0, p0, Lcom/hmobile/tooltip/ToolTipView;->mToolTip:Lcom/hmobile/tooltip/ToolTip;

    invoke-virtual {v0}, Lcom/hmobile/tooltip/ToolTip;->getColor()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/hmobile/tooltip/ToolTipView;->setColor(I)V

    .line 120
    :cond_1
    iget-object v0, p0, Lcom/hmobile/tooltip/ToolTipView;->mToolTip:Lcom/hmobile/tooltip/ToolTip;

    invoke-virtual {v0}, Lcom/hmobile/tooltip/ToolTip;->getContentView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 121
    iget-object v0, p0, Lcom/hmobile/tooltip/ToolTipView;->mToolTip:Lcom/hmobile/tooltip/ToolTip;

    invoke-virtual {v0}, Lcom/hmobile/tooltip/ToolTip;->getContentView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/hmobile/tooltip/ToolTipView;->setContentView(Landroid/view/View;)V

    .line 124
    :cond_2
    iget-object v0, p0, Lcom/hmobile/tooltip/ToolTipView;->mToolTip:Lcom/hmobile/tooltip/ToolTip;

    invoke-virtual {v0}, Lcom/hmobile/tooltip/ToolTip;->getShadow()Z

    move-result v0

    if-nez v0, :cond_3

    .line 125
    iget-object v0, p0, Lcom/hmobile/tooltip/ToolTipView;->mShadowView:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 128
    :cond_3
    iget-boolean v0, p0, Lcom/hmobile/tooltip/ToolTipView;->mDimensionsKnown:Z

    if-eqz v0, :cond_4

    .line 129
    invoke-direct {p0}, Lcom/hmobile/tooltip/ToolTipView;->applyToolTipPosition()V

    .line 131
    :cond_4
    return-void

    .line 112
    :cond_5
    iget-object v0, p0, Lcom/hmobile/tooltip/ToolTipView;->mToolTip:Lcom/hmobile/tooltip/ToolTip;

    invoke-virtual {v0}, Lcom/hmobile/tooltip/ToolTip;->getTextResId()I

    move-result v0

    if-eqz v0, :cond_0

    .line 113
    iget-object v0, p0, Lcom/hmobile/tooltip/ToolTipView;->mToolTipTV:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/hmobile/tooltip/ToolTipView;->mToolTip:Lcom/hmobile/tooltip/ToolTip;

    invoke-virtual {v1}, Lcom/hmobile/tooltip/ToolTip;->getTextResId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0
.end method

.method public setX(F)V
    .locals 2
    .param p1, "x"    # F

    .prologue
    .line 346
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 347
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->setX(F)V

    .line 351
    :goto_0
    return-void

    .line 349
    :cond_0
    invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper;->setX(Landroid/view/View;F)V

    goto :goto_0
.end method

.method public setY(F)V
    .locals 2
    .param p1, "y"    # F

    .prologue
    .line 370
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 371
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->setY(F)V

    .line 375
    :goto_0
    return-void

    .line 373
    :cond_0
    invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper;->setY(Landroid/view/View;F)V

    goto :goto_0
.end method
