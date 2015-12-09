.class Lcom/capitalone/mobile/banking/security/LockPatternActivity$22;
.super Ljava/lang/Object;
.source "LockPatternActivity.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/capitalone/mobile/banking/security/LockPatternActivity;->handleNavigationSideMenu(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;


# direct methods
.method constructor <init>(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)V
    .locals 0

    .prologue
    .line 724
    iput-object p1, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$22;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 9
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    const v7, 0x7f09012e

    const/4 v5, 0x0

    const/4 v8, 0x0

    .line 736
    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    iget-object v4, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$22;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    iget-object v4, v4, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->relContainer:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 739
    .local v3, "params":Landroid/widget/RelativeLayout$LayoutParams;
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getLastMovement()I

    move-result v4

    int-to-float v4, v4

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getDensity()F

    move-result v6

    mul-float/2addr v4, v6

    float-to-int v2, v4

    .line 742
    .local v2, "offset":I
    iget-object v4, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$22;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    iget-object v6, v4, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->MenuContainer:Landroid/view/View;

    if-nez v2, :cond_2

    const/4 v4, 0x4

    :goto_0
    invoke-virtual {v6, v4}, Landroid/view/View;->setVisibility(I)V

    .line 745
    neg-int v4, v2

    invoke-virtual {v3, v2, v5, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 747
    iget-object v4, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$22;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    iget-object v4, v4, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->relContainer:Landroid/view/View;

    invoke-virtual {v4, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 749
    iget-object v4, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$22;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    iget-object v4, v4, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->relContainer:Landroid/view/View;

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 755
    iget-object v4, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$22;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    invoke-virtual {v4}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f090128

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 757
    .local v1, "menuOpenString":Ljava/lang/String;
    iget-object v4, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$22;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    invoke-virtual {v4}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f090129

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 759
    .local v0, "menuCloseString":Ljava/lang/String;
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x10

    if-ge v4, v5, :cond_0

    .line 760
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$22;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    invoke-virtual {v5}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 762
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$22;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    invoke-virtual {v5}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 766
    :cond_0
    iget-object v4, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$22;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    const v5, 0x7f080020

    invoke-virtual {v4, v5}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    if-nez v2, :cond_3

    .end local v1    # "menuOpenString":Ljava/lang/String;
    :goto_1
    invoke-virtual {v4, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 769
    if-eqz v2, :cond_1

    .line 770
    iget-object v4, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$22;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    iget-object v4, v4, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->relContainer:Landroid/view/View;

    new-instance v5, Lcom/capitalone/mobile/banking/security/LockPatternActivity$22$1;

    invoke-direct {v5, p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity$22$1;-><init>(Lcom/capitalone/mobile/banking/security/LockPatternActivity$22;)V

    const-wide/16 v6, 0xfa

    invoke-virtual {v4, v5, v6, v7}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 783
    :cond_1
    iget-object v4, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$22;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    iget-object v4, v4, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->relContainer:Landroid/view/View;

    new-instance v5, Lcom/capitalone/mobile/banking/security/LockPatternActivity$22$2;

    invoke-direct {v5, p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity$22$2;-><init>(Lcom/capitalone/mobile/banking/security/LockPatternActivity$22;)V

    const-wide/16 v6, 0x12c

    invoke-virtual {v4, v5, v6, v7}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 791
    new-instance p1, Landroid/view/animation/TranslateAnimation;

    .end local p1    # "animation":Landroid/view/animation/Animation;
    invoke-direct {p1, v8, v8, v8, v8}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 792
    .restart local p1    # "animation":Landroid/view/animation/Animation;
    const-wide/16 v4, 0x1

    invoke-virtual {p1, v4, v5}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 793
    iget-object v4, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$22;->this$0:Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    iget-object v4, v4, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->relContainer:Landroid/view/View;

    invoke-virtual {v4, p1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 794
    return-void

    .end local v0    # "menuCloseString":Ljava/lang/String;
    :cond_2
    move v4, v5

    .line 742
    goto/16 :goto_0

    .restart local v0    # "menuCloseString":Ljava/lang/String;
    .restart local v1    # "menuOpenString":Ljava/lang/String;
    :cond_3
    move-object v1, v0

    .line 766
    goto :goto_1
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 732
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 728
    return-void
.end method
