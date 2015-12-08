.class public Lcom/aetn/history/android/historyhere/fragment/MenuFragment;
.super Landroid/support/v4/app/Fragment;
.source "MenuFragment.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "MenuFragment"


# instance fields
.field public hasNotSelectedPlaces:Z

.field private mBtnFavorites:Landroid/widget/Button;

.field private mBtnMore:Landroid/widget/Button;

.field private mBtnPlaces:Landroid/widget/Button;

.field private mBtnSurpriseMe:Landroid/widget/Button;

.field private mBtnTourOK:Landroid/widget/Button;

.field private mBtnTours:Landroid/widget/Button;

.field private mFavoritesIntro:Landroid/view/ViewGroup;

.field private mMenu:Landroid/view/ViewGroup;

.field private mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

.field private mSplashView:Landroid/view/ViewGroup;

.field private mSponsorImage:Lcom/android/volley/toolbox/NetworkImageView;

.field private mSponsorView:Landroid/view/ViewGroup;

.field private mTourIntro:Landroid/view/ViewGroup;

.field private mView:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 30
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 47
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->hasNotSelectedPlaces:Z

    return-void
.end method

.method static synthetic access$000(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->animateSplashOut()V

    return-void
.end method

.method static synthetic access$100(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->closeTourIntro()V

    return-void
.end method

.method static synthetic access$1000(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)Landroid/widget/Button;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    .prologue
    .line 30
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnTours:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic access$1100(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)Landroid/widget/Button;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    .prologue
    .line 30
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnSurpriseMe:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic access$1200(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)Landroid/view/ViewGroup;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    .prologue
    .line 30
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mTourIntro:Landroid/view/ViewGroup;

    return-object v0
.end method

.method static synthetic access$1300(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->setListeners()V

    return-void
.end method

.method static synthetic access$1400(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->hideSponsorImage()V

    return-void
.end method

.method static synthetic access$1500(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->initMenu()V

    return-void
.end method

.method static synthetic access$1600(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)Landroid/view/ViewGroup;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    .prologue
    .line 30
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mSponsorView:Landroid/view/ViewGroup;

    return-object v0
.end method

.method static synthetic access$1700(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->animateSponsorImageOut()V

    return-void
.end method

.method static synthetic access$1800(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)Landroid/view/ViewGroup;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    .prologue
    .line 30
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mSplashView:Landroid/view/ViewGroup;

    return-object v0
.end method

.method static synthetic access$1900(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->animateSponsorImageIn()V

    return-void
.end method

.method static synthetic access$200(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)Lcom/aetn/history/android/historyhere/MainNavigationActivity;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    .prologue
    .line 30
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    return-object v0
.end method

.method static synthetic access$300(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->showFavoritesIntro()V

    return-void
.end method

.method static synthetic access$400(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->getRandomPoi()V

    return-void
.end method

.method static synthetic access$500(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->hideFavoritesIntro()V

    return-void
.end method

.method static synthetic access$600(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)Landroid/view/ViewGroup;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    .prologue
    .line 30
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mFavoritesIntro:Landroid/view/ViewGroup;

    return-object v0
.end method

.method static synthetic access$700(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)Landroid/widget/Button;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    .prologue
    .line 30
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnPlaces:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic access$800(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)Landroid/widget/Button;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    .prologue
    .line 30
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnFavorites:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic access$900(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)Landroid/widget/Button;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    .prologue
    .line 30
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnMore:Landroid/widget/Button;

    return-object v0
.end method

.method private animateSplashOut()V
    .locals 4

    .prologue
    .line 410
    const-string v1, "MenuFragment"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "animateSplashOut1"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 412
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const v2, 0x7f04000b

    invoke-static {v1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 413
    .local v0, "anim":Landroid/view/animation/Animation;
    const-string v1, "MenuFragment"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "animateSplashOut2"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 415
    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$15;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$15;-><init>(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 439
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mSplashView:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->startAnimation(Landroid/view/animation/Animation;)V

    .line 440
    return-void
.end method

.method private animateSponsorImageIn()V
    .locals 4

    .prologue
    .line 374
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mSponsorImage:Lcom/android/volley/toolbox/NetworkImageView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/android/volley/toolbox/NetworkImageView;->setVisibility(I)V

    .line 375
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const v3, 0x7f04000a

    invoke-static {v2, v3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 376
    .local v0, "anim":Landroid/view/animation/Animation;
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getConfiguration()Lcom/aetn/history/android/historyhere/model/Configuration;

    move-result-object v2

    iget v2, v2, Lcom/aetn/history/android/historyhere/model/Configuration;->sponsorImageDisplaySecs:I

    mul-int/lit16 v1, v2, 0x3e8

    .line 377
    .local v1, "sponsorDuration":I
    new-instance v2, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$14;

    invoke-direct {v2, p0, v1}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$14;-><init>(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;I)V

    invoke-virtual {v0, v2}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 401
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mSponsorView:Landroid/view/ViewGroup;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->startAnimation(Landroid/view/animation/Animation;)V

    .line 402
    return-void
.end method

.method private animateSponsorImageOut()V
    .locals 3

    .prologue
    .line 348
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const v2, 0x7f04000b

    invoke-static {v1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 349
    .local v0, "anim":Landroid/view/animation/Animation;
    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$13;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$13;-><init>(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 368
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mSponsorView:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->startAnimation(Landroid/view/animation/Animation;)V

    .line 369
    return-void
.end method

.method private closeTourIntro()V
    .locals 3

    .prologue
    .line 308
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const v2, 0x7f040009

    invoke-static {v1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 309
    .local v0, "anim":Landroid/view/animation/Animation;
    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$12;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$12;-><init>(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 329
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mTourIntro:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->startAnimation(Landroid/view/animation/Animation;)V

    .line 331
    return-void
.end method

.method private getRandomPoi()V
    .locals 4

    .prologue
    .line 446
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->setMapTypePlaces()V

    .line 447
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiDbManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->getRandomPoi()Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v0

    .line 448
    .local v0, "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    const-string v1, "MenuFragment"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getRandomPoi(): title:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 449
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v1, v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->showSurpriseMePoi(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 450
    return-void
.end method

.method private hideFavoritesIntro()V
    .locals 3

    .prologue
    .line 255
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const v2, 0x7f040009

    invoke-static {v1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 256
    .local v0, "anim":Landroid/view/animation/Animation;
    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$10;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$10;-><init>(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 274
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mFavoritesIntro:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->startAnimation(Landroid/view/animation/Animation;)V

    .line 276
    return-void
.end method

.method private hideSponsorImage()V
    .locals 2

    .prologue
    .line 406
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mSponsorView:Landroid/view/ViewGroup;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 407
    return-void
.end method

.method private initMenu()V
    .locals 3

    .prologue
    .line 101
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->showMenu()V

    .line 102
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->hasShownTourIntro(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 103
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mView:Landroid/view/View;

    const v2, 0x7f0a007b

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mTourIntro:Landroid/view/ViewGroup;

    .line 104
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mView:Landroid/view/View;

    const v2, 0x7f0a00e8

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnTourOK:Landroid/widget/Button;

    .line 105
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnTourOK:Landroid/widget/Button;

    new-instance v2, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$2;

    invoke-direct {v2, p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$2;-><init>(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 111
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->openTourIntro()V

    .line 112
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->setHasShownTourIntro(Landroid/content/Context;)V

    .line 117
    :goto_0
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->handleUpdateIfRequired()Z

    move-result v0

    .line 120
    .local v0, "updateNeeded":Z
    if-nez v0, :cond_0

    .line 121
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->handleDeeplink()V

    .line 124
    :cond_0
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/LocationManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getUsersLocation()Landroid/location/Location;

    move-result-object v1

    if-nez v1, :cond_2

    .line 125
    const-string v1, "MenuFragment"

    const-string v2, "the location services must be off!!!"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->showInitialLocationServicesDialog()V

    .line 130
    :goto_1
    return-void

    .line 114
    .end local v0    # "updateNeeded":Z
    :cond_1
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->setListeners()V

    goto :goto_0

    .line 128
    .restart local v0    # "updateNeeded":Z
    :cond_2
    const-string v1, "MenuFragment"

    const-string v2, "the location services must be ON!!!"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method private openTourIntro()V
    .locals 4

    .prologue
    const v2, 0x3e99999a    # 0.3f

    .line 283
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnPlaces:Landroid/widget/Button;

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setAlpha(F)V

    .line 284
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnFavorites:Landroid/widget/Button;

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setAlpha(F)V

    .line 285
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnMore:Landroid/widget/Button;

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setAlpha(F)V

    .line 286
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnTours:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0200d1

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 287
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const v2, 0x7f040007

    invoke-static {v1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 288
    .local v0, "anim":Landroid/view/animation/Animation;
    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$11;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$11;-><init>(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 303
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mTourIntro:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->startAnimation(Landroid/view/animation/Animation;)V

    .line 305
    return-void
.end method

.method private setListeners()V
    .locals 2

    .prologue
    .line 135
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnPlaces:Landroid/widget/Button;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$3;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$3;-><init>(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 166
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnTours:Landroid/widget/Button;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$4;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$4;-><init>(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 179
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnFavorites:Landroid/widget/Button;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$5;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$5;-><init>(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 197
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnMore:Landroid/widget/Button;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$6;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$6;-><init>(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 208
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnSurpriseMe:Landroid/widget/Button;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$7;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$7;-><init>(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 220
    return-void
.end method

.method private showFavoritesIntro()V
    .locals 4

    .prologue
    const v3, 0x3e99999a    # 0.3f

    .line 223
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnPlaces:Landroid/widget/Button;

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setAlpha(F)V

    .line 224
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnFavorites:Landroid/widget/Button;

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setAlpha(F)V

    .line 225
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnMore:Landroid/widget/Button;

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setAlpha(F)V

    .line 226
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnTours:Landroid/widget/Button;

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setAlpha(F)V

    .line 227
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnSurpriseMe:Landroid/widget/Button;

    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setVisibility(I)V

    .line 228
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mFavoritesIntro:Landroid/view/ViewGroup;

    const v3, 0x7f0a007c

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    .line 229
    .local v1, "ok":Landroid/widget/Button;
    new-instance v2, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$8;

    invoke-direct {v2, p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$8;-><init>(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 235
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const v3, 0x7f040007

    invoke-static {v2, v3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 236
    .local v0, "anim":Landroid/view/animation/Animation;
    new-instance v2, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$9;

    invoke-direct {v2, p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$9;-><init>(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V

    invoke-virtual {v0, v2}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 251
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mFavoritesIntro:Landroid/view/ViewGroup;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->startAnimation(Landroid/view/animation/Animation;)V

    .line 252
    return-void
.end method

.method private showMenu()V
    .locals 3

    .prologue
    .line 341
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const v2, 0x7f04000a

    invoke-static {v1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 342
    .local v0, "zoomIn":Landroid/view/animation/Animation;
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mMenu:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->startAnimation(Landroid/view/animation/Animation;)V

    .line 343
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mMenu:Landroid/view/ViewGroup;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 345
    return-void
.end method

.method private tagLocalyticsEvent(Ljava/lang/String;Ljava/util/Map;)V
    .locals 3
    .param p1, "event"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 336
    .local p2, "extras":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v0, "MenuFragment"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "tagLocalyticsEvent():"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 338
    return-void
.end method


# virtual methods
.method public init()V
    .locals 6

    .prologue
    .line 78
    const-string v2, "MenuFragment"

    const-string v3, "init()"

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getConfiguration()Lcom/aetn/history/android/historyhere/model/Configuration;

    move-result-object v1

    .line 80
    .local v1, "config":Lcom/aetn/history/android/historyhere/model/Configuration;
    const-string v0, ""

    .line 81
    .local v0, "appSponsorImage":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 82
    const-string v2, "MenuFragment"

    const-string v3, "config was not null"

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    iget-object v0, v1, Lcom/aetn/history/android/historyhere/model/Configuration;->sponsorImageURL:Ljava/lang/String;

    .line 84
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mSponsorImage:Lcom/android/volley/toolbox/NetworkImageView;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-static {v3}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/HttpRequestManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getImageLoader()Lcom/android/volley/toolbox/ImageLoader;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lcom/android/volley/toolbox/NetworkImageView;->setImageUrl(Ljava/lang/String;Lcom/android/volley/toolbox/ImageLoader;)V

    .line 86
    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    new-instance v3, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$1;

    invoke-direct {v3, p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$1;-><init>(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V

    const-wide/16 v4, 0xfa0

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 95
    :goto_0
    return-void

    .line 93
    :cond_0
    const-string v2, "MenuFragment"

    const-string v3, "config was null"

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "container"    # Landroid/view/ViewGroup;
    .param p3, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 52
    const v1, 0x7f030042

    const/4 v2, 0x0

    invoke-virtual {p1, v1, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 53
    .local v0, "view":Landroid/view/View;
    return-object v0
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2
    .param p1, "view"    # Landroid/view/View;
    .param p2, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 58
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 59
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mView:Landroid/view/View;

    .line 60
    const v0, 0x7f0a00ba

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnPlaces:Landroid/widget/Button;

    .line 61
    const v0, 0x7f0a00bb

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnTours:Landroid/widget/Button;

    .line 62
    const v0, 0x7f0a00bd

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnFavorites:Landroid/widget/Button;

    .line 63
    const v0, 0x7f0a00bf

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnMore:Landroid/widget/Button;

    .line 64
    const v0, 0x7f0a00be

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnSurpriseMe:Landroid/widget/Button;

    .line 65
    const v0, 0x7f0a00c3

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/android/volley/toolbox/NetworkImageView;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mSponsorImage:Lcom/android/volley/toolbox/NetworkImageView;

    .line 66
    const v0, 0x7f0a00b8

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mMenu:Landroid/view/ViewGroup;

    .line 67
    const v0, 0x7f0a00c1

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mSplashView:Landroid/view/ViewGroup;

    .line 68
    const v0, 0x7f0a00c2

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mSponsorView:Landroid/view/ViewGroup;

    .line 69
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mView:Landroid/view/View;

    const v1, 0x7f0a00c0

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mFavoritesIntro:Landroid/view/ViewGroup;

    .line 70
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    .line 72
    return-void
.end method
