.class public Lcom/EnterpriseMobileBanking/AppRelContainer;
.super Landroid/widget/RelativeLayout;
.source "AppRelContainer.java"


# static fields
.field private static TAG:Ljava/lang/String;


# instance fields
.field private animating:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 13
    const-string v0, "AppRelContainer"

    sput-object v0, Lcom/EnterpriseMobileBanking/AppRelContainer;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 18
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 15
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/EnterpriseMobileBanking/AppRelContainer;->animating:Z

    .line 19
    const v0, 0x7f02000f

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/AppRelContainer;->setBackgroundResource(I)V

    .line 20
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 23
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 15
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/EnterpriseMobileBanking/AppRelContainer;->animating:Z

    .line 24
    const v0, 0x7f02000f

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/AppRelContainer;->setBackgroundResource(I)V

    .line 25
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    .line 28
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 15
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/EnterpriseMobileBanking/AppRelContainer;->animating:Z

    .line 29
    const v0, 0x7f02000f

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/AppRelContainer;->setBackgroundResource(I)V

    .line 30
    return-void
.end method


# virtual methods
.method public isAnimating()Z
    .locals 1

    .prologue
    .line 44
    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/AppRelContainer;->animating:Z

    return v0
.end method

.method public isEnabled()Z
    .locals 1

    .prologue
    .line 40
    invoke-super {p0}, Landroid/widget/RelativeLayout;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/AppRelContainer;->animating:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected onAnimationEnd()V
    .locals 8

    .prologue
    const/4 v4, 0x0

    .line 49
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onAnimationEnd()V

    .line 50
    sget-object v5, Lcom/EnterpriseMobileBanking/AppRelContainer;->TAG:Ljava/lang/String;

    const-string v6, "Animation End!"

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/AppRelContainer;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    invoke-direct {v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 55
    .local v3, "params":Landroid/widget/RelativeLayout$LayoutParams;
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getLastMovement()I

    move-result v5

    int-to-float v5, v5

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getDensity()F

    move-result v6

    mul-float/2addr v5, v6

    float-to-int v2, v5

    .line 57
    .local v2, "offset":I
    neg-int v5, v2

    invoke-virtual {v3, v2, v4, v5, v4}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 59
    invoke-virtual {p0, v3}, Lcom/EnterpriseMobileBanking/AppRelContainer;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 61
    monitor-enter p0

    .line 62
    :try_start_0
    sget-object v5, Lcom/EnterpriseMobileBanking/AppRelContainer;->TAG:Ljava/lang/String;

    const-string v6, "Notifying All!"

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 64
    const/4 v5, 0x0

    invoke-virtual {p0, v5}, Lcom/EnterpriseMobileBanking/AppRelContainer;->setTag(Ljava/lang/Object;)V

    .line 65
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getLastMovement()I

    move-result v5

    if-eqz v5, :cond_3

    const/4 v5, 0x1

    :goto_0
    invoke-static {v5}, Lcom/EnterpriseMobileBanking/AppHelper;->setSignOut(Z)V

    .line 66
    const/4 v5, 0x0

    iput-boolean v5, p0, Lcom/EnterpriseMobileBanking/AppRelContainer;->animating:Z

    .line 69
    const v5, 0x7f080023

    invoke-static {v5}, Lcom/EnterpriseMobileBanking/AppHelper;->findAppViewById(I)Landroid/view/View;

    move-result-object v5

    if-nez v2, :cond_0

    const/4 v4, 0x4

    :cond_0
    invoke-virtual {v5, v4}, Landroid/view/View;->setVisibility(I)V

    .line 72
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/AppRelContainer;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f090128

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 73
    .local v1, "menuOpenString":Ljava/lang/String;
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/AppRelContainer;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f090129

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 74
    .local v0, "menuCloseString":Ljava/lang/String;
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x10

    if-ge v4, v5, :cond_1

    .line 75
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/AppRelContainer;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f09012e

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 76
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/AppRelContainer;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f09012e

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 79
    :cond_1
    const v4, 0x7f080020

    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/AppRelContainer;->findViewById(I)Landroid/view/View;

    move-result-object v4

    if-nez v2, :cond_4

    .end local v1    # "menuOpenString":Ljava/lang/String;
    :goto_1
    invoke-virtual {v4, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 82
    if-eqz v2, :cond_2

    .line 84
    new-instance v4, Lcom/EnterpriseMobileBanking/AppRelContainer$1;

    invoke-direct {v4, p0}, Lcom/EnterpriseMobileBanking/AppRelContainer$1;-><init>(Lcom/EnterpriseMobileBanking/AppRelContainer;)V

    const-wide/16 v6, 0xfa

    invoke-virtual {p0, v4, v6, v7}, Lcom/EnterpriseMobileBanking/AppRelContainer;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 97
    :cond_2
    new-instance v4, Lcom/EnterpriseMobileBanking/AppRelContainer$2;

    invoke-direct {v4, p0}, Lcom/EnterpriseMobileBanking/AppRelContainer$2;-><init>(Lcom/EnterpriseMobileBanking/AppRelContainer;)V

    const-wide/16 v6, 0xbb8

    invoke-virtual {p0, v4, v6, v7}, Lcom/EnterpriseMobileBanking/AppRelContainer;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 107
    monitor-exit p0

    .line 110
    return-void

    .end local v0    # "menuCloseString":Ljava/lang/String;
    :cond_3
    move v5, v4

    .line 65
    goto/16 :goto_0

    .restart local v0    # "menuCloseString":Ljava/lang/String;
    .restart local v1    # "menuOpenString":Ljava/lang/String;
    :cond_4
    move-object v1, v0

    .line 79
    goto :goto_1

    .line 107
    .end local v0    # "menuCloseString":Ljava/lang/String;
    .end local v1    # "menuOpenString":Ljava/lang/String;
    :catchall_0
    move-exception v4

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v4
.end method

.method public startAnimation(Landroid/view/animation/Animation;)V
    .locals 1
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 34
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/EnterpriseMobileBanking/AppRelContainer;->animating:Z

    .line 35
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 36
    return-void
.end method
