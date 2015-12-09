.class public Lcom/capitalone/mobile/banking/security/LockPatternActivity;
.super Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;
.source "LockPatternActivity.java"

# interfaces
.implements Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton$ChangeListener;


# static fields
.field private static final EXPRESS_SIGN_IN_HELP_REQUEST_CODE:I = 0x4c2ac11

.field private static TAG:Ljava/lang/String;

.field private static anims:[Landroid/view/animation/Animation;


# instance fields
.field protected MenuContainer:Landroid/view/View;

.field private MenuList:Landroid/view/View;

.field private adapter:Lcom/EnterpriseMobileBanking/Plugins/Components/MenuBuilder;

.field private appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

.field private isSlideUpOffer:Ljava/lang/String;

.field private lclResultCode:I

.field private final mBtnConfirmOnClickListener:Landroid/view/View$OnClickListener;

.field private final mBtnPasswordSignInOnClickListener:Landroid/view/View$OnClickListener;

.field private final mBtnPatternHelpOnClickListener:Landroid/view/View$OnClickListener;

.field private patternMode:Ljava/lang/String;

.field protected relContainer:Landroid/view/View;

.field private strMode:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 43
    const-string v0, "LockPatternActivity"

    sput-object v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->TAG:Ljava/lang/String;

    .line 47
    const/4 v0, 0x2

    new-array v0, v0, [Landroid/view/animation/Animation;

    sput-object v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->anims:[Landroid/view/animation/Animation;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 40
    invoke-direct {p0}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;-><init>()V

    .line 663
    new-instance v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$19;

    invoke-direct {v0, p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity$19;-><init>(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)V

    iput-object v0, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->mBtnConfirmOnClickListener:Landroid/view/View$OnClickListener;

    .line 692
    new-instance v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$20;

    invoke-direct {v0, p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity$20;-><init>(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)V

    iput-object v0, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->mBtnPasswordSignInOnClickListener:Landroid/view/View$OnClickListener;

    .line 699
    new-instance v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity$21;

    invoke-direct {v0, p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity$21;-><init>(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)V

    iput-object v0, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->mBtnPatternHelpOnClickListener:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic access$000(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;
    .locals 1
    .param p0, "x0"    # Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    .prologue
    .line 40
    iget-object v0, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    return-object v0
.end method

.method static synthetic access$100(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    .prologue
    .line 40
    iget-object v0, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->strMode:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$200(Lcom/capitalone/mobile/banking/security/LockPatternActivity;Landroid/view/View;)V
    .locals 0
    .param p0, "x0"    # Lcom/capitalone/mobile/banking/security/LockPatternActivity;
    .param p1, "x1"    # Landroid/view/View;

    .prologue
    .line 40
    invoke-direct {p0, p1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->handleNavigationSideMenu(Landroid/view/View;)V

    return-void
.end method

.method static synthetic access$300(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)V
    .locals 0
    .param p0, "x0"    # Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    .prologue
    .line 40
    invoke-virtual {p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->initConfirmPattern()V

    return-void
.end method

.method static synthetic access$400(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)Ljava/util/List;
    .locals 1
    .param p0, "x0"    # Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    .prologue
    .line 40
    iget-object v0, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->mLastPattern:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$500()Ljava/lang/String;
    .locals 1

    .prologue
    .line 40
    sget-object v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$600(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    .prologue
    .line 40
    iget-object v0, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->isSlideUpOffer:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$700(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)Landroid/view/View;
    .locals 1
    .param p0, "x0"    # Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    .prologue
    .line 40
    iget-object v0, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->MenuList:Landroid/view/View;

    return-object v0
.end method

.method private handleNavigationSideMenu(Landroid/view/View;)V
    .locals 7
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 711
    sget-object v4, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "AAA contentContainer getLeft = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v6, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->relContainer:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 713
    iget-object v4, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->relContainer:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    move-result v4

    if-nez v4, :cond_2

    move v1, v2

    .line 714
    .local v1, "opening":Z
    :goto_0
    sget-object v4, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->anims:[Landroid/view/animation/Animation;

    if-eqz v1, :cond_0

    move v2, v3

    :cond_0
    aget-object v0, v4, v2

    .line 715
    .local v0, "as":Landroid/view/animation/Animation;
    if-eqz v1, :cond_3

    const/16 v2, 0xf0

    :goto_1
    invoke-static {v2}, Lcom/EnterpriseMobileBanking/AppHelper;->setLastMovement(I)V

    .line 716
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/AppHelper;->supressClick(Z)V

    .line 718
    invoke-virtual {p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getCurrentFocus()Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 719
    invoke-virtual {p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getCurrentFocus()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->clearFocus()V

    .line 722
    :cond_1
    iget-object v2, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->MenuContainer:Landroid/view/View;

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 724
    new-instance v2, Lcom/capitalone/mobile/banking/security/LockPatternActivity$22;

    invoke-direct {v2, p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity$22;-><init>(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)V

    invoke-virtual {v0, v2}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 797
    iget-object v2, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->relContainer:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 798
    return-void

    .end local v0    # "as":Landroid/view/animation/Animation;
    .end local v1    # "opening":Z
    :cond_2
    move v1, v3

    .line 713
    goto :goto_0

    .restart local v0    # "as":Landroid/view/animation/Animation;
    .restart local v1    # "opening":Z
    :cond_3
    move v2, v3

    .line 715
    goto :goto_1
.end method

.method private setupMenuList()V
    .locals 5

    .prologue
    .line 801
    const v1, 0x7f0800b0

    invoke-virtual {p0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    .line 802
    .local v0, "menuList":Landroid/widget/ListView;
    new-instance v1, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuBuilder;

    invoke-virtual {p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getBaseContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v3

    invoke-static {}, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;->getInstance()Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;

    move-result-object v4

    invoke-virtual {v4}, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;->getItems()Ljava/util/List;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuBuilder;-><init>(Landroid/content/Context;Landroid/view/LayoutInflater;Ljava/util/List;)V

    iput-object v1, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->adapter:Lcom/EnterpriseMobileBanking/Plugins/Components/MenuBuilder;

    .line 805
    iget-object v1, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->adapter:Lcom/EnterpriseMobileBanking/Plugins/Components/MenuBuilder;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 807
    new-instance v1, Lcom/capitalone/mobile/banking/security/LockPatternActivity$23;

    invoke-direct {v1, p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity$23;-><init>(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 850
    return-void
.end method


# virtual methods
.method public dataChanged()V
    .locals 1

    .prologue
    .line 854
    iget-object v0, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->adapter:Lcom/EnterpriseMobileBanking/Plugins/Components/MenuBuilder;

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuBuilder;->notifyDataSetChanged()V

    .line 855
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8
    .param p1, "ev"    # Landroid/view/MotionEvent;

    .prologue
    const/4 v3, 0x0

    const/high16 v7, 0x43700000    # 240.0f

    const/4 v4, 0x1

    .line 74
    iget-object v5, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->relContainer:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    move-result v5

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getDensity()F

    move-result v6

    mul-float/2addr v6, v7

    float-to-int v6, v6

    if-lt v5, v6, :cond_0

    move v1, v4

    .line 75
    .local v1, "menuOpen":Z
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getDensity()F

    move-result v6

    mul-float/2addr v6, v7

    cmpl-float v5, v5, v6

    if-ltz v5, :cond_1

    move v2, v4

    .line 76
    .local v2, "touchedLock":Z
    :goto_1
    iget-object v3, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->relContainer:Landroid/view/View;

    check-cast v3, Lcom/EnterpriseMobileBanking/AppRelContainer;

    invoke-virtual {v3}, Lcom/EnterpriseMobileBanking/AppRelContainer;->isAnimating()Z

    move-result v0

    .line 77
    .local v0, "animating":Z
    if-eqz v1, :cond_2

    if-eqz v2, :cond_2

    if-nez v0, :cond_2

    .line 79
    const/4 v3, 0x0

    invoke-direct {p0, v3}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->handleNavigationSideMenu(Landroid/view/View;)V

    .line 83
    :goto_2
    return v4

    .end local v0    # "animating":Z
    .end local v1    # "menuOpen":Z
    .end local v2    # "touchedLock":Z
    :cond_0
    move v1, v3

    .line 74
    goto :goto_0

    .restart local v1    # "menuOpen":Z
    :cond_1
    move v2, v3

    .line 75
    goto :goto_1

    .line 83
    .restart local v0    # "animating":Z
    .restart local v2    # "touchedLock":Z
    :cond_2
    invoke-super {p0, p1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v4

    goto :goto_2
.end method

.method public finish()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 590
    invoke-super {p0}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->finish()V

    .line 591
    invoke-virtual {p0, v0, v0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->overridePendingTransition(II)V

    .line 596
    return-void
.end method

.method public getELI_LockImage(Landroid/view/View;)Landroid/view/View;
    .locals 2
    .param p1, "LockImage"    # Landroid/view/View;

    .prologue
    .line 865
    const v1, 0x7f080028

    invoke-virtual {p0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 866
    .local v0, "ELI_LockImage":Landroid/view/View;
    return-object v0
.end method

.method public getHeaderContainer(Landroid/view/View;)Landroid/view/View;
    .locals 2
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 859
    const v1, 0x7f080027

    invoke-virtual {p0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 860
    .local v0, "headerContainer":Landroid/view/View;
    return-object v0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 10
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    const/16 v9, 0x8

    const/4 v8, 0x0

    .line 600
    invoke-super {p0, p1, p2, p3}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 601
    sget-object v5, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "LP onActivityResult(requestCode="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ", resultCode="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ")"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 604
    const v5, 0x4c2ac11

    if-ne p1, v5, :cond_0

    const v5, -0x21524111

    if-ne p2, v5, :cond_0

    .line 612
    invoke-virtual {p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 613
    .local v1, "intent":Landroid/content/Intent;
    const-string v5, "signInMessageType"

    const-string v6, "NONE"

    invoke-virtual {v1, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 614
    const-string v5, "signInMessage"

    const-string v6, ""

    invoke-virtual {v1, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 615
    const v5, 0x7f080027

    invoke-virtual {p0, v5}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v5

    iput-object v5, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->headerContainer:Landroid/view/View;

    .line 616
    iget-object v5, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->headerContainer:Landroid/view/View;

    invoke-virtual {v5, v8}, Landroid/view/View;->setVisibility(I)V

    .line 617
    const v5, 0x7f080015

    invoke-virtual {p0, v5}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 618
    .local v0, "DynamInfo":Landroid/widget/TextView;
    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setVisibility(I)V

    .line 619
    const v5, 0x7f08002c

    invoke-virtual {p0, v5}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 620
    .local v2, "logoutContainer":Landroid/view/View;
    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    .line 621
    const v5, 0x7f080029

    invoke-virtual {p0, v5}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    .line 622
    .local v4, "timeoutContainer":Landroid/view/View;
    invoke-virtual {v4, v9}, Landroid/view/View;->setVisibility(I)V

    .line 623
    const v5, 0x7f08002e

    invoke-virtual {p0, v5}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 624
    .local v3, "logoutTextView":Landroid/widget/TextView;
    invoke-virtual {p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getIntent()Landroid/content/Intent;

    move-result-object v5

    const-string v6, "signInMessage"

    invoke-virtual {v5, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 626
    .end local v0    # "DynamInfo":Landroid/widget/TextView;
    .end local v1    # "intent":Landroid/content/Intent;
    .end local v2    # "logoutContainer":Landroid/view/View;
    .end local v3    # "logoutTextView":Landroid/widget/TextView;
    .end local v4    # "timeoutContainer":Landroid/view/View;
    :cond_0
    iput p1, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->lclResultCode:I

    .line 627
    const/4 v5, -0x1

    if-eq p2, v5, :cond_1

    const/16 v5, 0x7d0

    if-ne p2, v5, :cond_2

    .line 628
    :cond_1
    invoke-virtual {p0, p2, p3}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->setResult(ILandroid/content/Intent;)V

    .line 629
    invoke-virtual {p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->finish()V

    .line 631
    :cond_2
    return-void
.end method

.method public onBackPressed()V
    .locals 3

    .prologue
    .line 641
    iget-object v1, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->patternMode:Ljava/lang/String;

    const-string v2, "compare"

    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 642
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 643
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "LockPatternAction"

    const-string v2, "ReturnToHome"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 644
    const/16 v1, 0x7d0

    invoke-virtual {p0, v1, v0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->setResult(ILandroid/content/Intent;)V

    .line 645
    invoke-virtual {p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->finish()V

    .line 651
    .end local v0    # "intent":Landroid/content/Intent;
    :goto_0
    return-void

    .line 649
    :cond_0
    invoke-super {p0}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->onBackPressed()V

    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 28
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 88
    invoke-super/range {p0 .. p1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->onCreate(Landroid/os/Bundle;)V

    .line 90
    const v24, 0x7f030003

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->setContentView(I)V

    .line 91
    invoke-virtual/range {p0 .. p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getIntent()Landroid/content/Intent;

    move-result-object v24

    const-string v25, "lockpattern_mode"

    invoke-virtual/range {v24 .. v25}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 92
    .local v17, "ptmode":Ljava/lang/String;
    if-eqz v17, :cond_0

    .line 94
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v24

    move-object/from16 v0, v24

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->patternMode:Ljava/lang/String;

    .line 96
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getIntent()Landroid/content/Intent;

    move-result-object v24

    const-string v25, "isSlideUpOffer"

    invoke-virtual/range {v24 .. v25}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v24

    move-object/from16 v0, v24

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->isSlideUpOffer:Ljava/lang/String;

    .line 97
    const v24, 0x7f080024

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v24

    move-object/from16 v0, v24

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->relContainer:Landroid/view/View;

    .line 98
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->relContainer:Landroid/view/View;

    move-object/from16 v24, v0

    const/16 v25, 0x0

    invoke-virtual/range {v24 .. v25}, Landroid/view/View;->setEnabled(Z)V

    .line 99
    const v24, 0x7f080026

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v24

    check-cast v24, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    move-object/from16 v0, v24

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    .line 102
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->patternMode:Ljava/lang/String;

    move-object/from16 v24, v0

    const-string v25, "compare"

    invoke-static/range {v24 .. v25}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v24

    if-eqz v24, :cond_1

    .line 103
    const v24, 0x7f08001f

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v24

    check-cast v24, Landroid/widget/TextView;

    invoke-virtual/range {p0 .. p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v25

    const v26, 0x7f0900a3

    invoke-virtual/range {v25 .. v26}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v25

    invoke-virtual/range {v24 .. v25}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 105
    :cond_1
    invoke-direct/range {p0 .. p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->setupMenuList()V

    .line 107
    const v24, 0x7f080023

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v24

    move-object/from16 v0, v24

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->MenuContainer:Landroid/view/View;

    .line 108
    const v24, 0x7f0800b0

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v24

    move-object/from16 v0, v24

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->MenuList:Landroid/view/View;

    .line 111
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->MenuContainer:Landroid/view/View;

    move-object/from16 v24, v0

    invoke-virtual/range {v24 .. v24}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v16

    .line 112
    .local v16, "params":Landroid/view/ViewGroup$LayoutParams;
    const/high16 v24, 0x43700000    # 240.0f

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getDensity()F

    move-result v25

    mul-float v24, v24, v25

    move/from16 v0, v24

    float-to-int v0, v0

    move/from16 v24, v0

    move/from16 v0, v24

    move-object/from16 v1, v16

    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 113
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->MenuContainer:Landroid/view/View;

    move-object/from16 v24, v0

    invoke-virtual/range {v24 .. v24}, Landroid/view/View;->requestLayout()V

    .line 115
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->MenuContainer:Landroid/view/View;

    move-object/from16 v24, v0

    invoke-virtual/range {v24 .. v24}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v23

    .line 116
    .local v23, "vto":Landroid/view/ViewTreeObserver;
    new-instance v24, Lcom/capitalone/mobile/banking/security/LockPatternActivity$1;

    move-object/from16 v0, v24

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity$1;-><init>(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)V

    invoke-virtual/range {v23 .. v24}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 129
    invoke-virtual/range {p0 .. p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->init()V

    .line 130
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->mBtnConfirm:Landroid/widget/Button;

    move-object/from16 v24, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->mBtnConfirmOnClickListener:Landroid/view/View$OnClickListener;

    move-object/from16 v25, v0

    invoke-virtual/range {v24 .. v25}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 131
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->mBtnPasswordSignIn:Landroid/widget/Button;

    move-object/from16 v24, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->mBtnPasswordSignInOnClickListener:Landroid/view/View$OnClickListener;

    move-object/from16 v25, v0

    invoke-virtual/range {v24 .. v25}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 132
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->mBtnPatternHelp:Landroid/widget/Button;

    move-object/from16 v24, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->mBtnPatternHelpOnClickListener:Landroid/view/View$OnClickListener;

    move-object/from16 v25, v0

    invoke-virtual/range {v24 .. v25}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 135
    invoke-virtual/range {p0 .. p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getIntent()Landroid/content/Intent;

    move-result-object v24

    const-string v25, "AppHeaderNavOption"

    invoke-virtual/range {v24 .. v25}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v24

    move-object/from16 v0, v24

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->strMode:Ljava/lang/String;

    .line 137
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->strMode:Ljava/lang/String;

    move-object/from16 v24, v0

    const-string v25, "CLOSE"

    invoke-static/range {v24 .. v25}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v24

    if-eqz v24, :cond_5

    .line 138
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    move-object/from16 v24, v0

    const/16 v25, 0x2

    invoke-virtual/range {v24 .. v25}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setNavOption(I)V

    .line 139
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    move-object/from16 v24, v0

    invoke-virtual/range {v24 .. v24}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->hideGlobalButton()V

    .line 145
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    move-object/from16 v24, v0

    new-instance v25, Lcom/capitalone/mobile/banking/security/LockPatternActivity$2;

    move-object/from16 v0, v25

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity$2;-><init>(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)V

    invoke-virtual/range {v24 .. v25}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setOnGlobalButtonClick(Landroid/view/View$OnClickListener;)V

    .line 156
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    move-object/from16 v24, v0

    new-instance v25, Lcom/capitalone/mobile/banking/security/LockPatternActivity$3;

    move-object/from16 v0, v25

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity$3;-><init>(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)V

    invoke-virtual/range {v24 .. v25}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setOnNavOptionClick(Landroid/view/View$OnClickListener;)V

    .line 172
    sget-object v24, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->anims:[Landroid/view/animation/Animation;

    const/16 v25, 0x0

    const v26, 0x7f040005

    move-object/from16 v0, p0

    move/from16 v1, v26

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v26

    aput-object v26, v24, v25

    .line 173
    sget-object v24, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->anims:[Landroid/view/animation/Animation;

    const/16 v25, 0x1

    const v26, 0x7f040006

    move-object/from16 v0, p0

    move/from16 v1, v26

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v26

    aput-object v26, v24, v25

    .line 180
    new-instance v8, Landroid/app/AlertDialog$Builder;

    move-object/from16 v0, p0

    invoke-direct {v8, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 182
    .local v8, "builder":Landroid/app/AlertDialog$Builder;
    const/16 v24, 0x0

    move/from16 v0, v24

    invoke-virtual {v8, v0}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 184
    new-instance v22, Landroid/widget/TextView;

    move-object/from16 v0, v22

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 185
    .local v22, "title":Landroid/widget/TextView;
    const/high16 v24, 0x41b00000    # 22.0f

    move-object/from16 v0, v22

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 186
    const/16 v24, 0xa

    const/16 v25, 0xa

    const/16 v26, 0xa

    const/16 v27, 0x5

    move-object/from16 v0, v22

    move/from16 v1, v24

    move/from16 v2, v25

    move/from16 v3, v26

    move/from16 v4, v27

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 187
    const/16 v24, 0x11

    move-object/from16 v0, v22

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 189
    new-instance v13, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v13, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 190
    .local v13, "message":Landroid/widget/TextView;
    const/16 v24, 0x11

    move/from16 v0, v24

    invoke-virtual {v13, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 191
    const/high16 v24, 0x41800000    # 16.0f

    move/from16 v0, v24

    invoke-virtual {v13, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 192
    const/16 v24, 0x14

    const/16 v25, 0x5

    const/16 v26, 0x14

    const/16 v27, 0x14

    move/from16 v0, v24

    move/from16 v1, v25

    move/from16 v2, v26

    move/from16 v3, v27

    invoke-virtual {v13, v0, v1, v2, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 193
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->patternMode:Ljava/lang/String;

    move-object/from16 v24, v0

    const-string v25, "compare"

    invoke-static/range {v24 .. v25}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v24

    if-eqz v24, :cond_c

    .line 195
    invoke-virtual/range {p0 .. p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getIntent()Landroid/content/Intent;

    move-result-object v24

    const-string v25, "errorcode"

    invoke-virtual/range {v24 .. v25}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v24

    if-eqz v24, :cond_2

    .line 197
    const/4 v10, 0x0

    .line 200
    .local v10, "errorCode":I
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getIntent()Landroid/content/Intent;

    move-result-object v24

    const-string v25, "errorcode"

    invoke-virtual/range {v24 .. v25}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v24

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v10

    .line 208
    :goto_1
    sget-object v24, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->TAG:Ljava/lang/String;

    new-instance v25, Ljava/lang/StringBuilder;

    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    const-string v26, "LockPattern has errorcode = "

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    move-object/from16 v0, v25

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    invoke-static/range {v24 .. v25}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    sparse-switch v10, :sswitch_data_0

    .line 408
    sget-object v24, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->TAG:Ljava/lang/String;

    const-string v25, "LockPattern error Unknown"

    invoke-static/range {v24 .. v25}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 410
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mTxtInfo:Landroid/widget/TextView;

    move-object/from16 v24, v0

    const v25, 0x7f09007f

    invoke-virtual/range {v24 .. v25}, Landroid/widget/TextView;->setText(I)V

    .line 411
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    move-object/from16 v24, v0

    new-instance v25, Ljava/lang/StringBuilder;

    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    const v26, 0x7f090071

    move-object/from16 v0, p0

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v26

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    const/16 v26, 0x20

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v25

    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->userName:Ljava/lang/String;

    move-object/from16 v26, v0

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    invoke-virtual/range {v24 .. v25}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 413
    const v24, 0x7f0900e1

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v24

    move-object/from16 v0, v22

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 414
    move-object/from16 v0, v22

    invoke-virtual {v8, v0}, Landroid/app/AlertDialog$Builder;->setCustomTitle(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 416
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->errorMessage:Ljava/lang/String;

    move-object/from16 v24, v0

    if-eqz v24, :cond_9

    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->errorMessage:Ljava/lang/String;

    move-object/from16 v24, v0

    const-string v25, ""

    move-object/from16 v0, v24

    move-object/from16 v1, v25

    if-eq v0, v1, :cond_9

    .line 417
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->errorMessage:Ljava/lang/String;

    move-object/from16 v24, v0

    move-object/from16 v0, v24

    invoke-virtual {v13, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 421
    :goto_2
    invoke-virtual {v8, v13}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v24

    const-string v25, "Continue"

    new-instance v26, Lcom/capitalone/mobile/banking/security/LockPatternActivity$13;

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity$13;-><init>(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)V

    invoke-virtual/range {v24 .. v26}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 430
    invoke-virtual {v8}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v7

    .line 431
    .local v7, "alertDialog":Landroid/app/AlertDialog;
    const/16 v24, 0x0

    move/from16 v0, v24

    invoke-virtual {v7, v0}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 433
    invoke-virtual {v7}, Landroid/app/AlertDialog;->show()V

    .line 445
    .end local v7    # "alertDialog":Landroid/app/AlertDialog;
    .end local v10    # "errorCode":I
    :cond_2
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getIntent()Landroid/content/Intent;

    move-result-object v24

    const-string v25, "signInMessageType"

    invoke-virtual/range {v24 .. v25}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v24

    if-eqz v24, :cond_4

    .line 446
    invoke-virtual/range {p0 .. p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getIntent()Landroid/content/Intent;

    move-result-object v24

    const-string v25, "signInMessageType"

    invoke-virtual/range {v24 .. v25}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    .line 447
    .local v19, "signInMessageType":Ljava/lang/String;
    invoke-virtual/range {p0 .. p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getIntent()Landroid/content/Intent;

    move-result-object v24

    const-string v25, "signInMessage"

    invoke-virtual/range {v24 .. v25}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    .line 448
    .local v18, "signInMessage":Ljava/lang/String;
    if-nez v18, :cond_3

    .line 450
    const-string v18, ""

    .line 453
    :cond_3
    sget-object v24, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->TAG:Ljava/lang/String;

    new-instance v25, Ljava/lang/StringBuilder;

    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    const-string v26, "LP this.getIntent().getStringExtra(signInMessageType) = "

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    move-object/from16 v0, v25

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    invoke-static/range {v24 .. v25}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 455
    const-string v24, "ERROR"

    move-object/from16 v0, v19

    move-object/from16 v1, v24

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v24

    if-eqz v24, :cond_a

    .line 456
    const v24, 0x7f080027

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v24

    move-object/from16 v0, v24

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->headerContainer:Landroid/view/View;

    .line 457
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->headerContainer:Landroid/view/View;

    move-object/from16 v24, v0

    const/16 v25, 0x8

    invoke-virtual/range {v24 .. v25}, Landroid/view/View;->setVisibility(I)V

    .line 458
    const v24, 0x7f080015

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    .line 459
    .local v6, "DynamInfo":Landroid/widget/TextView;
    const/16 v24, 0x8

    move/from16 v0, v24

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 460
    const v24, 0x7f080029

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v20

    .line 461
    .local v20, "timeoutContainer":Landroid/view/View;
    const/16 v24, 0x0

    move-object/from16 v0, v20

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 462
    const v24, 0x7f08002b

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v21

    check-cast v21, Landroid/widget/TextView;

    .line 463
    .local v21, "timeoutTextView":Landroid/widget/TextView;
    move-object/from16 v0, v21

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 552
    .end local v6    # "DynamInfo":Landroid/widget/TextView;
    .end local v18    # "signInMessage":Ljava/lang/String;
    .end local v19    # "signInMessageType":Ljava/lang/String;
    .end local v20    # "timeoutContainer":Landroid/view/View;
    .end local v21    # "timeoutTextView":Landroid/widget/TextView;
    :cond_4
    :goto_4
    return-void

    .line 141
    .end local v8    # "builder":Landroid/app/AlertDialog$Builder;
    .end local v13    # "message":Landroid/widget/TextView;
    .end local v22    # "title":Landroid/widget/TextView;
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    move-object/from16 v24, v0

    const/16 v25, 0x0

    invoke-virtual/range {v24 .. v25}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setNavOption(I)V

    goto/16 :goto_0

    .line 202
    .restart local v8    # "builder":Landroid/app/AlertDialog$Builder;
    .restart local v10    # "errorCode":I
    .restart local v13    # "message":Landroid/widget/TextView;
    .restart local v22    # "title":Landroid/widget/TextView;
    :catch_0
    move-exception v14

    .line 204
    .local v14, "nfe":Ljava/lang/NumberFormatException;
    sget-object v24, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->TAG:Ljava/lang/String;

    const-string v25, "Unable to parse int from errorcode extra."

    invoke-static/range {v24 .. v25}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    const v10, 0x7fffffff

    goto/16 :goto_1

    .line 212
    .end local v14    # "nfe":Ljava/lang/NumberFormatException;
    :sswitch_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    move-object/from16 v24, v0

    const/16 v25, 0x0

    invoke-virtual/range {v24 .. v25}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->setEnabled(Z)V

    .line 213
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mTxtInfo:Landroid/widget/TextView;

    move-object/from16 v24, v0

    const v25, 0x7f090081

    invoke-virtual/range {v24 .. v25}, Landroid/widget/TextView;->setText(I)V

    .line 214
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    move-object/from16 v24, v0

    const v25, 0x7f09007e

    invoke-virtual/range {v24 .. v25}, Landroid/widget/TextView;->setText(I)V

    .line 215
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    move-object/from16 v24, v0

    invoke-virtual/range {v24 .. v24}, Landroid/widget/TextView;->getPaddingLeft()I

    move-result v15

    .line 216
    .local v15, "padding_in_px":I
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->mTxtInfo:Landroid/widget/TextView;

    move-object/from16 v24, v0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v0, v24

    move/from16 v1, v25

    move/from16 v2, v26

    move/from16 v3, v27

    invoke-virtual {v0, v15, v1, v2, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 217
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->ELI_LockImage:Landroid/view/View;

    move-object/from16 v24, v0

    const/16 v25, 0x8

    invoke-virtual/range {v24 .. v25}, Landroid/view/View;->setVisibility(I)V

    .line 218
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->headerContainer:Landroid/view/View;

    move-object/from16 v24, v0

    const-string v25, "#A12830"

    invoke-static/range {v25 .. v25}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v25

    invoke-virtual/range {v24 .. v25}, Landroid/view/View;->setBackgroundColor(I)V

    .line 219
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    move-object/from16 v24, v0

    const-string v25, "#A12830"

    invoke-static/range {v25 .. v25}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v25

    invoke-virtual/range {v24 .. v25}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 221
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    move-object/from16 v24, v0

    sget-object v25, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;->Wrong:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->errorPattern:Ljava/lang/String;

    move-object/from16 v26, v0

    invoke-static/range {v26 .. v26}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternUtils;->stringToPattern(Ljava/lang/String;)Ljava/util/List;

    move-result-object v26

    invoke-virtual/range {v24 .. v26}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->setPattern(Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;Ljava/util/List;)V

    .line 222
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    move-object/from16 v24, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->mLockPatternViewReloader:Ljava/lang/Runnable;

    move-object/from16 v25, v0

    const-wide/16 v26, 0xbb8

    invoke-virtual/range {v24 .. v27}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_3

    .line 226
    .end local v15    # "padding_in_px":I
    :sswitch_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mTxtInfo:Landroid/widget/TextView;

    move-object/from16 v24, v0

    const v25, 0x7f09007f

    invoke-virtual/range {v24 .. v25}, Landroid/widget/TextView;->setText(I)V

    .line 227
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    move-object/from16 v24, v0

    new-instance v25, Ljava/lang/StringBuilder;

    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    const v26, 0x7f090071

    move-object/from16 v0, p0

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v26

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    const/16 v26, 0x20

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v25

    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->userName:Ljava/lang/String;

    move-object/from16 v26, v0

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    invoke-virtual/range {v24 .. v25}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 229
    const v24, 0x7f0900de

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v24

    move-object/from16 v0, v22

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 230
    move-object/from16 v0, v22

    invoke-virtual {v8, v0}, Landroid/app/AlertDialog$Builder;->setCustomTitle(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 232
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->errorMessage:Ljava/lang/String;

    move-object/from16 v24, v0

    move-object/from16 v0, v24

    invoke-virtual {v13, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 233
    invoke-virtual {v8, v13}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v24

    const-string v25, "Cancel"

    new-instance v26, Lcom/capitalone/mobile/banking/security/LockPatternActivity$4;

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity$4;-><init>(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)V

    invoke-virtual/range {v24 .. v26}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 240
    invoke-virtual/range {p0 .. p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getIntent()Landroid/content/Intent;

    move-result-object v24

    const-string v25, "errorMessage"

    invoke-virtual/range {v24 .. v25}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 241
    .local v9, "errmsg":Ljava/lang/String;
    if-eqz v9, :cond_6

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v24

    if-lez v24, :cond_6

    .line 242
    const-string v24, "1-8"

    move-object/from16 v0, v24

    invoke-virtual {v9, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v24

    if-lez v24, :cond_6

    .line 243
    const-string v24, "Call"

    new-instance v25, Lcom/capitalone/mobile/banking/security/LockPatternActivity$5;

    move-object/from16 v0, v25

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v9}, Lcom/capitalone/mobile/banking/security/LockPatternActivity$5;-><init>(Lcom/capitalone/mobile/banking/security/LockPatternActivity;Ljava/lang/String;)V

    move-object/from16 v0, v24

    move-object/from16 v1, v25

    invoke-virtual {v8, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 254
    :cond_6
    invoke-virtual {v8}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v7

    .line 255
    .restart local v7    # "alertDialog":Landroid/app/AlertDialog;
    const/16 v24, 0x0

    move/from16 v0, v24

    invoke-virtual {v7, v0}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 257
    invoke-virtual {v7}, Landroid/app/AlertDialog;->show()V

    goto/16 :goto_3

    .line 261
    .end local v7    # "alertDialog":Landroid/app/AlertDialog;
    .end local v9    # "errmsg":Ljava/lang/String;
    :sswitch_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mTxtInfo:Landroid/widget/TextView;

    move-object/from16 v24, v0

    const v25, 0x7f090080

    invoke-virtual/range {v24 .. v25}, Landroid/widget/TextView;->setText(I)V

    .line 262
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    move-object/from16 v24, v0

    const-string v25, ""

    invoke-virtual/range {v24 .. v25}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 263
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    move-object/from16 v24, v0

    invoke-virtual/range {v24 .. v24}, Landroid/widget/TextView;->getPaddingLeft()I

    move-result v15

    .line 264
    .restart local v15    # "padding_in_px":I
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->mTxtInfo:Landroid/widget/TextView;

    move-object/from16 v24, v0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v0, v24

    move/from16 v1, v25

    move/from16 v2, v26

    move/from16 v3, v27

    invoke-virtual {v0, v15, v1, v2, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 265
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->ELI_LockImage:Landroid/view/View;

    move-object/from16 v24, v0

    const/16 v25, 0x8

    invoke-virtual/range {v24 .. v25}, Landroid/view/View;->setVisibility(I)V

    .line 266
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->headerContainer:Landroid/view/View;

    move-object/from16 v24, v0

    const-string v25, "#A12830"

    invoke-static/range {v25 .. v25}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v25

    invoke-virtual/range {v24 .. v25}, Landroid/view/View;->setBackgroundColor(I)V

    .line 267
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    move-object/from16 v24, v0

    const-string v25, "#A12830"

    invoke-static/range {v25 .. v25}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v25

    invoke-virtual/range {v24 .. v25}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 268
    const v24, 0x7f0900df

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v24

    move-object/from16 v0, v22

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 269
    move-object/from16 v0, v22

    invoke-virtual {v8, v0}, Landroid/app/AlertDialog$Builder;->setCustomTitle(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 270
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->errorMessage:Ljava/lang/String;

    move-object/from16 v24, v0

    move-object/from16 v0, v24

    invoke-virtual {v13, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 271
    invoke-virtual {v8, v13}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v24

    const-string v25, "Continue"

    new-instance v26, Lcom/capitalone/mobile/banking/security/LockPatternActivity$6;

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity$6;-><init>(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)V

    invoke-virtual/range {v24 .. v26}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 282
    invoke-virtual {v8}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v7

    .line 283
    .restart local v7    # "alertDialog":Landroid/app/AlertDialog;
    const/16 v24, 0x0

    move/from16 v0, v24

    invoke-virtual {v7, v0}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 285
    invoke-virtual {v7}, Landroid/app/AlertDialog;->show()V

    goto/16 :goto_3

    .line 289
    .end local v7    # "alertDialog":Landroid/app/AlertDialog;
    .end local v15    # "padding_in_px":I
    :sswitch_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mTxtInfo:Landroid/widget/TextView;

    move-object/from16 v24, v0

    const v25, 0x7f09007f

    invoke-virtual/range {v24 .. v25}, Landroid/widget/TextView;->setText(I)V

    .line 290
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    move-object/from16 v24, v0

    new-instance v25, Ljava/lang/StringBuilder;

    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    const v26, 0x7f090071

    move-object/from16 v0, p0

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v26

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    const/16 v26, 0x20

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v25

    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->userName:Ljava/lang/String;

    move-object/from16 v26, v0

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    invoke-virtual/range {v24 .. v25}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 292
    const v24, 0x7f0900e0

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v24

    move-object/from16 v0, v22

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 293
    move-object/from16 v0, v22

    invoke-virtual {v8, v0}, Landroid/app/AlertDialog$Builder;->setCustomTitle(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 295
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->errorMessage:Ljava/lang/String;

    move-object/from16 v24, v0

    move-object/from16 v0, v24

    invoke-virtual {v13, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 297
    invoke-virtual {v8, v13}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v24

    const-string v25, "Cancel"

    new-instance v26, Lcom/capitalone/mobile/banking/security/LockPatternActivity$7;

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity$7;-><init>(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)V

    invoke-virtual/range {v24 .. v26}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 304
    invoke-virtual/range {p0 .. p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getIntent()Landroid/content/Intent;

    move-result-object v24

    const-string v25, "errorMessage"

    invoke-virtual/range {v24 .. v25}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 305
    .restart local v9    # "errmsg":Ljava/lang/String;
    if-eqz v9, :cond_7

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v24

    if-lez v24, :cond_7

    .line 306
    const-string v24, "1-8"

    move-object/from16 v0, v24

    invoke-virtual {v9, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v24

    if-lez v24, :cond_7

    .line 307
    const-string v24, "Call"

    new-instance v25, Lcom/capitalone/mobile/banking/security/LockPatternActivity$8;

    move-object/from16 v0, v25

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v9}, Lcom/capitalone/mobile/banking/security/LockPatternActivity$8;-><init>(Lcom/capitalone/mobile/banking/security/LockPatternActivity;Ljava/lang/String;)V

    move-object/from16 v0, v24

    move-object/from16 v1, v25

    invoke-virtual {v8, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 318
    :cond_7
    invoke-virtual {v8}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v7

    .line 319
    .restart local v7    # "alertDialog":Landroid/app/AlertDialog;
    const/16 v24, 0x0

    move/from16 v0, v24

    invoke-virtual {v7, v0}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 321
    invoke-virtual {v7}, Landroid/app/AlertDialog;->show()V

    goto/16 :goto_3

    .line 325
    .end local v7    # "alertDialog":Landroid/app/AlertDialog;
    .end local v9    # "errmsg":Ljava/lang/String;
    :sswitch_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mTxtInfo:Landroid/widget/TextView;

    move-object/from16 v24, v0

    const v25, 0x7f09007f

    invoke-virtual/range {v24 .. v25}, Landroid/widget/TextView;->setText(I)V

    .line 326
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    move-object/from16 v24, v0

    new-instance v25, Ljava/lang/StringBuilder;

    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    const v26, 0x7f090071

    move-object/from16 v0, p0

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v26

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    const/16 v26, 0x20

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v25

    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->userName:Ljava/lang/String;

    move-object/from16 v26, v0

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    invoke-virtual/range {v24 .. v25}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 328
    const v24, 0x7f0900e0

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v24

    move-object/from16 v0, v22

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 329
    move-object/from16 v0, v22

    invoke-virtual {v8, v0}, Landroid/app/AlertDialog$Builder;->setCustomTitle(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 331
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->errorMessage:Ljava/lang/String;

    move-object/from16 v24, v0

    move-object/from16 v0, v24

    invoke-virtual {v13, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 332
    invoke-virtual {v8, v13}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v24

    const-string v25, "OK"

    new-instance v26, Lcom/capitalone/mobile/banking/security/LockPatternActivity$9;

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity$9;-><init>(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)V

    invoke-virtual/range {v24 .. v26}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 341
    invoke-virtual {v8}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v7

    .line 342
    .restart local v7    # "alertDialog":Landroid/app/AlertDialog;
    const/16 v24, 0x0

    move/from16 v0, v24

    invoke-virtual {v7, v0}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 344
    invoke-virtual {v7}, Landroid/app/AlertDialog;->show()V

    goto/16 :goto_3

    .line 348
    .end local v7    # "alertDialog":Landroid/app/AlertDialog;
    :sswitch_5
    sget-object v24, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->TAG:Ljava/lang/String;

    const-string v25, "LockPattern error in case 120710: case 120711: case 120712: case 120715: case 120716: case 100196"

    invoke-static/range {v24 .. v25}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 350
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mTxtInfo:Landroid/widget/TextView;

    move-object/from16 v24, v0

    const v25, 0x7f09007f

    invoke-virtual/range {v24 .. v25}, Landroid/widget/TextView;->setText(I)V

    .line 351
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    move-object/from16 v24, v0

    new-instance v25, Ljava/lang/StringBuilder;

    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    const v26, 0x7f090071

    move-object/from16 v0, p0

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v26

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    const/16 v26, 0x20

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v25

    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->userName:Ljava/lang/String;

    move-object/from16 v26, v0

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    invoke-virtual/range {v24 .. v25}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 353
    const v24, 0x7f0900e1

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v24

    move-object/from16 v0, v22

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 354
    move-object/from16 v0, v22

    invoke-virtual {v8, v0}, Landroid/app/AlertDialog$Builder;->setCustomTitle(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 356
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->errorMessage:Ljava/lang/String;

    move-object/from16 v24, v0

    move-object/from16 v0, v24

    invoke-virtual {v13, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 357
    invoke-virtual {v8, v13}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v24

    const-string v25, "Continue"

    new-instance v26, Lcom/capitalone/mobile/banking/security/LockPatternActivity$10;

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity$10;-><init>(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)V

    invoke-virtual/range {v24 .. v26}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 366
    invoke-virtual {v8}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v7

    .line 367
    .restart local v7    # "alertDialog":Landroid/app/AlertDialog;
    const/16 v24, 0x0

    move/from16 v0, v24

    invoke-virtual {v7, v0}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 369
    invoke-virtual {v7}, Landroid/app/AlertDialog;->show()V

    goto/16 :goto_3

    .line 373
    .end local v7    # "alertDialog":Landroid/app/AlertDialog;
    :sswitch_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mTxtInfo:Landroid/widget/TextView;

    move-object/from16 v24, v0

    const v25, 0x7f09007f

    invoke-virtual/range {v24 .. v25}, Landroid/widget/TextView;->setText(I)V

    .line 374
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    move-object/from16 v24, v0

    new-instance v25, Ljava/lang/StringBuilder;

    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    const v26, 0x7f090071

    move-object/from16 v0, p0

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v26

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    const/16 v26, 0x20

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v25

    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->userName:Ljava/lang/String;

    move-object/from16 v26, v0

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    invoke-virtual/range {v24 .. v25}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 376
    const v24, 0x7f0900e1

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v24

    move-object/from16 v0, v22

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 377
    move-object/from16 v0, v22

    invoke-virtual {v8, v0}, Landroid/app/AlertDialog$Builder;->setCustomTitle(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 379
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->errorMessage:Ljava/lang/String;

    move-object/from16 v24, v0

    move-object/from16 v0, v24

    invoke-virtual {v13, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 380
    invoke-virtual {v8, v13}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v24

    const-string v25, "Cancel"

    new-instance v26, Lcom/capitalone/mobile/banking/security/LockPatternActivity$11;

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity$11;-><init>(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)V

    invoke-virtual/range {v24 .. v26}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 387
    invoke-virtual/range {p0 .. p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getIntent()Landroid/content/Intent;

    move-result-object v24

    const-string v25, "errorMessage"

    invoke-virtual/range {v24 .. v25}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 388
    .restart local v9    # "errmsg":Ljava/lang/String;
    if-eqz v9, :cond_8

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v24

    if-lez v24, :cond_8

    .line 389
    const-string v24, "1-8"

    move-object/from16 v0, v24

    invoke-virtual {v9, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v24

    if-lez v24, :cond_8

    .line 390
    const-string v24, "Call"

    new-instance v25, Lcom/capitalone/mobile/banking/security/LockPatternActivity$12;

    move-object/from16 v0, v25

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v9}, Lcom/capitalone/mobile/banking/security/LockPatternActivity$12;-><init>(Lcom/capitalone/mobile/banking/security/LockPatternActivity;Ljava/lang/String;)V

    move-object/from16 v0, v24

    move-object/from16 v1, v25

    invoke-virtual {v8, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 401
    :cond_8
    invoke-virtual {v8}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v7

    .line 402
    .restart local v7    # "alertDialog":Landroid/app/AlertDialog;
    const/16 v24, 0x0

    move/from16 v0, v24

    invoke-virtual {v7, v0}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 404
    invoke-virtual {v7}, Landroid/app/AlertDialog;->show()V

    goto/16 :goto_3

    .line 419
    .end local v7    # "alertDialog":Landroid/app/AlertDialog;
    .end local v9    # "errmsg":Ljava/lang/String;
    :cond_9
    const v24, 0x7f0900e2

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v24

    move-object/from16 v0, v24

    invoke-virtual {v13, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    .line 465
    .end local v10    # "errorCode":I
    .restart local v18    # "signInMessage":Ljava/lang/String;
    .restart local v19    # "signInMessageType":Ljava/lang/String;
    :cond_a
    const-string v24, "SUCCESS"

    move-object/from16 v0, v19

    move-object/from16 v1, v24

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v24

    if-eqz v24, :cond_b

    .line 466
    const v24, 0x7f080027

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v24

    move-object/from16 v0, v24

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->headerContainer:Landroid/view/View;

    .line 467
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->headerContainer:Landroid/view/View;

    move-object/from16 v24, v0

    const/16 v25, 0x8

    invoke-virtual/range {v24 .. v25}, Landroid/view/View;->setVisibility(I)V

    .line 468
    const v24, 0x7f080015

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    .line 469
    .restart local v6    # "DynamInfo":Landroid/widget/TextView;
    const/16 v24, 0x8

    move/from16 v0, v24

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 470
    const v24, 0x7f08002c

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v11

    .line 471
    .local v11, "logoutContainer":Landroid/view/View;
    const/16 v24, 0x0

    move/from16 v0, v24

    invoke-virtual {v11, v0}, Landroid/view/View;->setVisibility(I)V

    .line 472
    const v24, 0x7f08002e

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Landroid/widget/TextView;

    .line 473
    .local v12, "logoutTextView":Landroid/widget/TextView;
    move-object/from16 v0, v18

    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    .line 475
    .end local v6    # "DynamInfo":Landroid/widget/TextView;
    .end local v11    # "logoutContainer":Landroid/view/View;
    .end local v12    # "logoutTextView":Landroid/widget/TextView;
    :cond_b
    const-string v24, "FATAL"

    move-object/from16 v0, v19

    move-object/from16 v1, v24

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v24

    if-eqz v24, :cond_4

    .line 476
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mTxtInfo:Landroid/widget/TextView;

    move-object/from16 v24, v0

    const v25, 0x7f0900de

    move-object/from16 v0, p0

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v25

    invoke-virtual/range {v24 .. v25}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 477
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    move-object/from16 v24, v0

    move-object/from16 v0, v24

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 478
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    move-object/from16 v24, v0

    invoke-virtual/range {v24 .. v24}, Landroid/widget/TextView;->getPaddingLeft()I

    move-result v15

    .line 479
    .restart local v15    # "padding_in_px":I
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->mTxtInfo:Landroid/widget/TextView;

    move-object/from16 v24, v0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v0, v24

    move/from16 v1, v25

    move/from16 v2, v26

    move/from16 v3, v27

    invoke-virtual {v0, v15, v1, v2, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 480
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->ELI_LockImage:Landroid/view/View;

    move-object/from16 v24, v0

    const/16 v25, 0x8

    invoke-virtual/range {v24 .. v25}, Landroid/view/View;->setVisibility(I)V

    .line 481
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->headerContainer:Landroid/view/View;

    move-object/from16 v24, v0

    const-string v25, "#A12830"

    invoke-static/range {v25 .. v25}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v25

    invoke-virtual/range {v24 .. v25}, Landroid/view/View;->setBackgroundColor(I)V

    .line 482
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    move-object/from16 v24, v0

    const-string v25, "#A12830"

    invoke-static/range {v25 .. v25}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v25

    invoke-virtual/range {v24 .. v25}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 484
    const v24, 0x7f0900de

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v24

    move-object/from16 v0, v22

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 485
    move-object/from16 v0, v22

    invoke-virtual {v8, v0}, Landroid/app/AlertDialog$Builder;->setCustomTitle(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 487
    const v24, 0x7f0900e4

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v24

    move-object/from16 v0, v24

    invoke-virtual {v13, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 488
    invoke-virtual {v8, v13}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v24

    const-string v25, "Cancel"

    new-instance v26, Lcom/capitalone/mobile/banking/security/LockPatternActivity$15;

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity$15;-><init>(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)V

    invoke-virtual/range {v24 .. v26}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v24

    const-string v25, "Call"

    new-instance v26, Lcom/capitalone/mobile/banking/security/LockPatternActivity$14;

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity$14;-><init>(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)V

    invoke-virtual/range {v24 .. v26}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 502
    invoke-virtual {v8}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v7

    .line 503
    .restart local v7    # "alertDialog":Landroid/app/AlertDialog;
    const/16 v24, 0x0

    move/from16 v0, v24

    invoke-virtual {v7, v0}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 505
    invoke-virtual {v7}, Landroid/app/AlertDialog;->show()V

    goto/16 :goto_4

    .line 508
    .end local v7    # "alertDialog":Landroid/app/AlertDialog;
    .end local v15    # "padding_in_px":I
    .end local v18    # "signInMessage":Ljava/lang/String;
    .end local v19    # "signInMessageType":Ljava/lang/String;
    :cond_c
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->patternMode:Ljava/lang/String;

    move-object/from16 v24, v0

    const-string v25, "create"

    invoke-static/range {v24 .. v25}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v24

    if-eqz v24, :cond_4

    .line 509
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->errorCode:Ljava/lang/String;

    move-object/from16 v24, v0

    if-eqz v24, :cond_4

    .line 510
    const v24, 0x7f0900e1

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v24

    move-object/from16 v0, v22

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 511
    move-object/from16 v0, v22

    invoke-virtual {v8, v0}, Landroid/app/AlertDialog$Builder;->setCustomTitle(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 513
    sget-object v24, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->TAG:Ljava/lang/String;

    new-instance v25, Ljava/lang/StringBuilder;

    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    const-string v26, "super.errorMessage = ["

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->errorMessage:Ljava/lang/String;

    move-object/from16 v26, v0

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    const-string v26, "]"

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    invoke-static/range {v24 .. v25}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 515
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->errorMessage:Ljava/lang/String;

    move-object/from16 v24, v0

    if-eqz v24, :cond_d

    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->errorMessage:Ljava/lang/String;

    move-object/from16 v24, v0

    const-string v25, "null"

    invoke-static/range {v24 .. v25}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v24

    if-nez v24, :cond_d

    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->errorMessage:Ljava/lang/String;

    move-object/from16 v24, v0

    const-string v25, ""

    invoke-static/range {v24 .. v25}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v24

    if-eqz v24, :cond_f

    .line 516
    :cond_d
    sget-object v24, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->TAG:Ljava/lang/String;

    const-string v25, "Enrollment super.errorMessage is empty, null or \'null\'"

    invoke-static/range {v24 .. v25}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 518
    const v24, 0x7f0900e3

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v24

    move-object/from16 v0, v24

    invoke-virtual {v13, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 522
    :goto_5
    invoke-virtual {v8, v13}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v24

    const-string v25, "Cancel"

    new-instance v26, Lcom/capitalone/mobile/banking/security/LockPatternActivity$16;

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity$16;-><init>(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)V

    invoke-virtual/range {v24 .. v26}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 529
    invoke-virtual/range {p0 .. p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->getIntent()Landroid/content/Intent;

    move-result-object v24

    const-string v25, "errorMessage"

    invoke-virtual/range {v24 .. v25}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 530
    .restart local v9    # "errmsg":Ljava/lang/String;
    if-eqz v9, :cond_e

    const-string v24, "1-8"

    move-object/from16 v0, v24

    invoke-virtual {v9, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v24

    if-lez v24, :cond_e

    .line 531
    const-string v24, "Call"

    new-instance v25, Lcom/capitalone/mobile/banking/security/LockPatternActivity$17;

    move-object/from16 v0, v25

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v9}, Lcom/capitalone/mobile/banking/security/LockPatternActivity$17;-><init>(Lcom/capitalone/mobile/banking/security/LockPatternActivity;Ljava/lang/String;)V

    move-object/from16 v0, v24

    move-object/from16 v1, v25

    invoke-virtual {v8, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 546
    :cond_e
    invoke-virtual {v8}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v7

    .line 547
    .restart local v7    # "alertDialog":Landroid/app/AlertDialog;
    const/16 v24, 0x0

    move/from16 v0, v24

    invoke-virtual {v7, v0}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 549
    invoke-virtual {v7}, Landroid/app/AlertDialog;->show()V

    goto/16 :goto_4

    .line 520
    .end local v7    # "alertDialog":Landroid/app/AlertDialog;
    .end local v9    # "errmsg":Ljava/lang/String;
    :cond_f
    move-object/from16 v0, p0

    iget-object v0, v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->errorMessage:Ljava/lang/String;

    move-object/from16 v24, v0

    move-object/from16 v0, v24

    invoke-virtual {v13, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    .line 210
    :sswitch_data_0
    .sparse-switch
        0x15 -> :sswitch_6
        0x18764 -> :sswitch_5
        0x1add7 -> :sswitch_1
        0x1d784 -> :sswitch_2
        0x1d785 -> :sswitch_0
        0x1d786 -> :sswitch_5
        0x1d787 -> :sswitch_5
        0x1d788 -> :sswitch_5
        0x1d78b -> :sswitch_5
        0x1d78c -> :sswitch_5
        0x1d795 -> :sswitch_4
        0x1d796 -> :sswitch_3
    .end sparse-switch
.end method

.method protected onPause()V
    .locals 2

    .prologue
    .line 556
    invoke-super {p0}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->onPause()V

    .line 557
    invoke-static {}, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;->getInstance()Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;->registerListener(Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton$ChangeListener;)V

    .line 558
    return-void
.end method

.method protected onResume()V
    .locals 4

    .prologue
    .line 574
    invoke-super {p0}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->onResume()V

    .line 576
    const-string v2, "create"

    iget-object v3, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->patternMode:Ljava/lang/String;

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->isAuthenticated()Z

    move-result v2

    if-nez v2, :cond_0

    .line 577
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 578
    .local v1, "timeout":Landroid/content/Intent;
    invoke-virtual {p0, v1}, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->sendBroadcast(Landroid/content/Intent;)V

    .line 580
    .end local v1    # "timeout":Landroid/content/Intent;
    :cond_0
    invoke-static {}, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;->getInstance()Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;

    move-result-object v2

    invoke-virtual {v2, p0}, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;->registerListener(Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton$ChangeListener;)V

    .line 582
    iget v2, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->lclResultCode:I

    const/16 v3, 0x16

    if-ne v2, v3, :cond_1

    .line 583
    new-instance v0, Ljava/lang/Thread;

    iget-object v2, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternViewReloader:Ljava/lang/Runnable;

    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 584
    .local v0, "t":Ljava/lang/Thread;
    invoke-virtual {v0}, Ljava/lang/Thread;->run()V

    .line 586
    .end local v0    # "t":Ljava/lang/Thread;
    :cond_1
    return-void
.end method

.method protected onStart()V
    .locals 4

    .prologue
    .line 562
    invoke-super {p0}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->onStart()V

    .line 563
    iget-object v0, p0, Lcom/capitalone/mobile/banking/security/LockPatternActivity;->relContainer:Landroid/view/View;

    new-instance v1, Lcom/capitalone/mobile/banking/security/LockPatternActivity$18;

    invoke-direct {v1, p0}, Lcom/capitalone/mobile/banking/security/LockPatternActivity$18;-><init>(Lcom/capitalone/mobile/banking/security/LockPatternActivity;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 570
    return-void
.end method
