.class public Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;
.super Ljava/lang/Object;
.source "AppHeaderTouchHandler.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# static fields
.field private static final TAG:Ljava/lang/String; = "AppHeaderTouchHandler"

.field private static final threshold:I


# instance fields
.field private maxWidth:I

.field private navigationButton:Landroid/view/View;

.field private opening:Z

.field private params:Landroid/widget/RelativeLayout$LayoutParams;

.field private relContainer:Lcom/EnterpriseMobileBanking/AppRelContainer;

.field private xDown:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 22
    const/high16 v0, 0x41200000    # 10.0f

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getDensity()F

    move-result v1

    mul-float/2addr v0, v1

    float-to-int v0, v0

    sput v0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->threshold:I

    return-void
.end method

.method public constructor <init>(ILandroid/view/View;)V
    .locals 2
    .param p1, "width"    # I
    .param p2, "navButton"    # Landroid/view/View;

    .prologue
    const/4 v1, 0x0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    const/high16 v0, -0x31000000

    iput v0, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->xDown:F

    .line 20
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->opening:Z

    .line 24
    const v0, 0x7fffffff

    iput v0, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->maxWidth:I

    .line 26
    iput-object v1, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->relContainer:Lcom/EnterpriseMobileBanking/AppRelContainer;

    .line 27
    iput-object v1, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->params:Landroid/widget/RelativeLayout$LayoutParams;

    .line 28
    iput-object v1, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->navigationButton:Landroid/view/View;

    .line 31
    iput p1, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->maxWidth:I

    .line 32
    iput-object p2, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->navigationButton:Landroid/view/View;

    .line 33
    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 14
    .param p1, "v"    # Landroid/view/View;
    .param p2, "event"    # Landroid/view/MotionEvent;

    .prologue
    .line 37
    const-string v10, "menu"

    iget-object v11, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->navigationButton:Landroid/view/View;

    invoke-virtual {v11}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    iget-object v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->navigationButton:Landroid/view/View;

    invoke-virtual {v10}, Landroid/view/View;->getVisibility()I

    move-result v10

    if-nez v10, :cond_1

    const/4 v4, 0x1

    .line 38
    .local v4, "handled":Z
    :goto_0
    instance-of v10, p1, Lcom/EnterpriseMobileBanking/AppRelContainer;

    if-nez v10, :cond_2

    .line 39
    const-string v10, "AppHeaderTouchHandler"

    const-string v11, "Touch event only works on an AppRelContainer -- please try again"

    invoke-static {v10, v11}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    const/4 v4, 0x0

    .line 126
    .end local p1    # "v":Landroid/view/View;
    :cond_0
    :goto_1
    return v4

    .line 37
    .end local v4    # "handled":Z
    .restart local p1    # "v":Landroid/view/View;
    :cond_1
    const/4 v4, 0x0

    goto :goto_0

    .line 42
    .restart local v4    # "handled":Z
    :cond_2
    if-eqz v4, :cond_0

    .line 44
    iget-object v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->relContainer:Lcom/EnterpriseMobileBanking/AppRelContainer;

    if-nez v10, :cond_3

    .line 45
    check-cast p1, Lcom/EnterpriseMobileBanking/AppRelContainer;

    .end local p1    # "v":Landroid/view/View;
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->relContainer:Lcom/EnterpriseMobileBanking/AppRelContainer;

    .line 46
    iget-object v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->relContainer:Lcom/EnterpriseMobileBanking/AppRelContainer;

    invoke-virtual {v10}, Lcom/EnterpriseMobileBanking/AppRelContainer;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    check-cast v10, Landroid/widget/RelativeLayout$LayoutParams;

    iput-object v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->params:Landroid/widget/RelativeLayout$LayoutParams;

    .line 51
    :cond_3
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v10

    packed-switch v10, :pswitch_data_0

    .line 121
    const/4 v4, 0x0

    goto :goto_1

    .line 53
    :pswitch_0
    iget-object v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->relContainer:Lcom/EnterpriseMobileBanking/AppRelContainer;

    invoke-virtual {v10}, Lcom/EnterpriseMobileBanking/AppRelContainer;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 54
    .local v3, "context":Landroid/content/Context;
    const v10, 0x7f080023

    invoke-static {v3, v10}, Lcom/EnterpriseMobileBanking/AppHelper;->findAppViewById(Landroid/content/Context;I)Landroid/view/View;

    move-result-object v7

    .line 55
    .local v7, "menuContainerView":Landroid/view/View;
    const/4 v10, 0x0

    invoke-virtual {v7, v10}, Landroid/view/View;->setVisibility(I)V

    .line 56
    if-eqz v7, :cond_4

    .line 57
    const/4 v10, 0x0

    invoke-virtual {v7, v10}, Landroid/view/View;->setVisibility(I)V

    .line 59
    :cond_4
    iget-object v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->relContainer:Lcom/EnterpriseMobileBanking/AppRelContainer;

    invoke-virtual {v10}, Lcom/EnterpriseMobileBanking/AppRelContainer;->isAnimating()Z

    move-result v10

    if-nez v10, :cond_0

    .line 60
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getX()F

    move-result v10

    iput v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->xDown:F

    .line 61
    iget-object v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->relContainer:Lcom/EnterpriseMobileBanking/AppRelContainer;

    invoke-virtual {v10}, Lcom/EnterpriseMobileBanking/AppRelContainer;->getLeft()I

    move-result v10

    if-nez v10, :cond_5

    const/4 v10, 0x1

    :goto_2
    iput-boolean v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->opening:Z

    goto :goto_1

    :cond_5
    const/4 v10, 0x0

    goto :goto_2

    .line 65
    .end local v3    # "context":Landroid/content/Context;
    .end local v7    # "menuContainerView":Landroid/view/View;
    :pswitch_1
    iget v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->xDown:F

    const/high16 v11, -0x31000000

    cmpl-float v10, v10, v11

    if-eqz v10, :cond_0

    .line 66
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->hideKeyboard()V

    .line 67
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getX()F

    move-result v10

    iget v11, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->xDown:F

    sub-float/2addr v10, v11

    float-to-int v6, v10

    .line 68
    .local v6, "marginChange":I
    iget-object v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->params:Landroid/widget/RelativeLayout$LayoutParams;

    iget v8, v10, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 70
    .local v8, "newMargin":I
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v10

    sget v11, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->threshold:I

    if-le v10, v11, :cond_6

    .line 71
    add-int/2addr v8, v6

    .line 74
    :cond_6
    const/4 v10, 0x0

    invoke-static {v8, v10}, Ljava/lang/Math;->max(II)I

    move-result v10

    iget v11, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->maxWidth:I

    invoke-static {v10, v11}, Ljava/lang/Math;->min(II)I

    move-result v8

    .line 76
    iget-object v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->params:Landroid/widget/RelativeLayout$LayoutParams;

    iput v8, v10, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 77
    iget-object v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->params:Landroid/widget/RelativeLayout$LayoutParams;

    neg-int v11, v8

    iput v11, v10, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    .line 78
    iget-object v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->relContainer:Lcom/EnterpriseMobileBanking/AppRelContainer;

    invoke-virtual {v10}, Lcom/EnterpriseMobileBanking/AppRelContainer;->requestLayout()V

    goto/16 :goto_1

    .line 82
    .end local v6    # "marginChange":I
    .end local v8    # "newMargin":I
    :pswitch_2
    const-string v10, "AppHeaderTouchHandler"

    const-string v11, "Action Up!"

    invoke-static {v10, v11}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    iget v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->xDown:F

    const/high16 v11, -0x31000000

    cmpl-float v10, v10, v11

    if-eqz v10, :cond_a

    .line 84
    const v10, 0x7f080020

    invoke-static {v10}, Lcom/EnterpriseMobileBanking/AppHelper;->findAppViewById(I)Landroid/view/View;

    move-result-object v10

    invoke-virtual {v10}, Landroid/view/View;->isEnabled()Z

    move-result v5

    .line 85
    .local v5, "lastState":Z
    const/4 v10, 0x0

    invoke-static {v10}, Lcom/EnterpriseMobileBanking/AppHelper;->setNavigationEnabled(Z)V

    .line 86
    const/high16 v10, -0x31000000

    iput v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->xDown:F

    .line 87
    iget v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->maxWidth:I

    div-int/lit8 v1, v10, 0x4

    .line 88
    .local v1, "alterPointOpen":I
    mul-int/lit8 v0, v1, 0x3

    .line 89
    .local v0, "alterPointClose":I
    iget-boolean v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->opening:Z

    if-eqz v10, :cond_7

    iget-object v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->params:Landroid/widget/RelativeLayout$LayoutParams;

    iget v10, v10, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    if-ge v10, v1, :cond_9

    :cond_7
    iget-boolean v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->opening:Z

    if-nez v10, :cond_8

    iget-object v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->params:Landroid/widget/RelativeLayout$LayoutParams;

    iget v10, v10, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    if-le v10, v0, :cond_9

    .line 90
    :cond_8
    iget-boolean v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->opening:Z

    if-nez v10, :cond_b

    const/4 v10, 0x1

    :goto_3
    iput-boolean v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->opening:Z

    .line 92
    :cond_9
    new-instance v2, Landroid/view/animation/AnimationSet;

    const/4 v10, 0x1

    invoke-direct {v2, v10}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 93
    .local v2, "aset":Landroid/view/animation/AnimationSet;
    const/4 v9, 0x0

    .line 94
    .local v9, "trans":Landroid/view/animation/TranslateAnimation;
    iget-boolean v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->opening:Z

    if-eqz v10, :cond_c

    .line 95
    new-instance v9, Landroid/view/animation/TranslateAnimation;

    .end local v9    # "trans":Landroid/view/animation/TranslateAnimation;
    const/4 v10, 0x0

    iget v11, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->maxWidth:I

    iget-object v12, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->params:Landroid/widget/RelativeLayout$LayoutParams;

    iget v12, v12, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    sub-int/2addr v11, v12

    int-to-float v11, v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct {v9, v10, v11, v12, v13}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 99
    .restart local v9    # "trans":Landroid/view/animation/TranslateAnimation;
    :goto_4
    const-wide/16 v10, 0x1f4

    invoke-virtual {v9, v10, v11}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 100
    invoke-virtual {v2, v9}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 101
    iget-boolean v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->opening:Z

    if-eqz v10, :cond_d

    .line 102
    iget v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->maxWidth:I

    int-to-float v10, v10

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getDensity()F

    move-result v11

    div-float/2addr v10, v11

    float-to-int v10, v10

    invoke-static {v10}, Lcom/EnterpriseMobileBanking/AppHelper;->setLastMovement(I)V

    .line 106
    :goto_5
    iget-object v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->relContainer:Lcom/EnterpriseMobileBanking/AppRelContainer;

    new-instance v11, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler$1;

    invoke-direct {v11, p0, v5}, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler$1;-><init>(Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;Z)V

    const-wide/16 v12, 0x2ee

    invoke-virtual {v10, v11, v12, v13}, Lcom/EnterpriseMobileBanking/AppRelContainer;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 113
    iget-object v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->relContainer:Lcom/EnterpriseMobileBanking/AppRelContainer;

    invoke-virtual {v10, v2}, Lcom/EnterpriseMobileBanking/AppRelContainer;->startAnimation(Landroid/view/animation/Animation;)V

    .line 115
    .end local v0    # "alterPointClose":I
    .end local v1    # "alterPointOpen":I
    .end local v2    # "aset":Landroid/view/animation/AnimationSet;
    .end local v5    # "lastState":Z
    .end local v9    # "trans":Landroid/view/animation/TranslateAnimation;
    :cond_a
    const/4 v10, 0x0

    iput-boolean v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->opening:Z

    .line 116
    const/high16 v10, -0x31000000

    iput v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->xDown:F

    .line 117
    const/4 v10, 0x0

    iput-object v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->relContainer:Lcom/EnterpriseMobileBanking/AppRelContainer;

    .line 118
    const/4 v10, 0x0

    iput-object v10, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->params:Landroid/widget/RelativeLayout$LayoutParams;

    goto/16 :goto_1

    .line 90
    .restart local v0    # "alterPointClose":I
    .restart local v1    # "alterPointOpen":I
    .restart local v5    # "lastState":Z
    :cond_b
    const/4 v10, 0x0

    goto :goto_3

    .line 97
    .restart local v2    # "aset":Landroid/view/animation/AnimationSet;
    .restart local v9    # "trans":Landroid/view/animation/TranslateAnimation;
    :cond_c
    new-instance v9, Landroid/view/animation/TranslateAnimation;

    .end local v9    # "trans":Landroid/view/animation/TranslateAnimation;
    const/4 v10, 0x0

    iget-object v11, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->params:Landroid/widget/RelativeLayout$LayoutParams;

    iget v11, v11, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    neg-int v11, v11

    int-to-float v11, v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct {v9, v10, v11, v12, v13}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .restart local v9    # "trans":Landroid/view/animation/TranslateAnimation;
    goto :goto_4

    .line 104
    :cond_d
    const/4 v10, 0x0

    invoke-static {v10}, Lcom/EnterpriseMobileBanking/AppHelper;->setLastMovement(I)V

    goto :goto_5

    .line 51
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
