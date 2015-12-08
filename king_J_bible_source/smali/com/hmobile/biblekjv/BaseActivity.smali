.class public Lcom/hmobile/biblekjv/BaseActivity;
.super Landroid/app/Activity;
.source "BaseActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/hmobile/biblekjv/BaseActivity$SaveShareData;
    }
.end annotation


# static fields
.field private static final BUTTON_NEGATIVE:I = 0x2

.field private static final BUTTON_NEUTRAL:I = 0x1

.field private static final BUTTON_POSITIVE:I

.field private static fbid:Ljava/lang/String;


# instance fields
.field CONSUMER_KEY:Ljava/lang/String;

.field CONSUMER_SECRET:Ljava/lang/String;

.field adView:Lcom/google/android/gms/ads/AdView;

.field private aiEmailUpdates:Lcom/hmobile/quickaction/ActionItem;

.field private aiFeedback:Lcom/hmobile/quickaction/ActionItem;

.field private aiMoreApps:Lcom/hmobile/quickaction/ActionItem;

.field private aiRate:Lcom/hmobile/quickaction/ActionItem;

.field private aiRemoveAds:Lcom/hmobile/quickaction/ActionItem;

.field private aiSurvey:Lcom/hmobile/quickaction/ActionItem;

.field applicationId:Ljava/lang/String;

.field imgActionMenu:Landroid/widget/ImageView;

.field is_finished:Z

.field private mTwitter:Lme/grantland/twitter/Twitter;

.field m_pd:Landroid/app/ProgressDialog;

.field screenHeight:I

.field screenWidth:I

.field session:Lcom/facebook/Session;

.field share_text:Ljava/lang/String;

.field tweet:Lme/grantland/twitter/Tweeter;

.field private uiHelper:Lcom/facebook/UiLifecycleHelper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 80
    const-string v0, ""

    sput-object v0, Lcom/hmobile/biblekjv/BaseActivity;->fbid:Ljava/lang/String;

    .line 88
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 74
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 76
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->m_pd:Landroid/app/ProgressDialog;

    .line 77
    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->applicationId:Ljava/lang/String;

    .line 78
    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->share_text:Ljava/lang/String;

    .line 91
    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->CONSUMER_KEY:Ljava/lang/String;

    .line 92
    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->CONSUMER_SECRET:Ljava/lang/String;

    .line 74
    return-void
.end method

.method static synthetic access$0(Lcom/hmobile/biblekjv/BaseActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 382
    invoke-direct {p0, p1, p2}, Lcom/hmobile/biblekjv/BaseActivity;->publishFeedDialog(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$1(Landroid/app/Activity;ZLjava/util/List;Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session;
    .locals 1

    .prologue
    .line 366
    invoke-static {p0, p1, p2, p3}, Lcom/hmobile/biblekjv/BaseActivity;->openActiveSession(Landroid/app/Activity;ZLjava/util/List;Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$2(Lcom/hmobile/biblekjv/BaseActivity;)Lcom/hmobile/quickaction/ActionItem;
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiRemoveAds:Lcom/hmobile/quickaction/ActionItem;

    return-object v0
.end method

.method static synthetic access$3(Lcom/hmobile/biblekjv/BaseActivity;)Lcom/hmobile/quickaction/ActionItem;
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiEmailUpdates:Lcom/hmobile/quickaction/ActionItem;

    return-object v0
.end method

.method static synthetic access$4(Lcom/hmobile/biblekjv/BaseActivity;)Lcom/hmobile/quickaction/ActionItem;
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiSurvey:Lcom/hmobile/quickaction/ActionItem;

    return-object v0
.end method

.method static synthetic access$5(Lcom/hmobile/biblekjv/BaseActivity;)Lcom/hmobile/quickaction/ActionItem;
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiFeedback:Lcom/hmobile/quickaction/ActionItem;

    return-object v0
.end method

.method static synthetic access$6(Lcom/hmobile/biblekjv/BaseActivity;)Lcom/hmobile/quickaction/ActionItem;
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiMoreApps:Lcom/hmobile/quickaction/ActionItem;

    return-object v0
.end method

.method static synthetic access$7(Lcom/hmobile/biblekjv/BaseActivity;)Lcom/hmobile/quickaction/ActionItem;
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiRate:Lcom/hmobile/quickaction/ActionItem;

    return-object v0
.end method

.method private static openActiveSession(Landroid/app/Activity;ZLjava/util/List;Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session;
    .locals 4
    .param p0, "activity"    # Landroid/app/Activity;
    .param p1, "allowLoginUI"    # Z
    .param p2, "permissions"    # Ljava/util/List;
    .param p3, "callback"    # Lcom/facebook/Session$StatusCallback;

    .prologue
    .line 368
    new-instance v2, Lcom/facebook/Session$OpenRequest;

    invoke-direct {v2, p0}, Lcom/facebook/Session$OpenRequest;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v2, p2}, Lcom/facebook/Session$OpenRequest;->setPermissions(Ljava/util/List;)Lcom/facebook/Session$OpenRequest;

    move-result-object v2

    .line 369
    invoke-virtual {v2, p3}, Lcom/facebook/Session$OpenRequest;->setCallback(Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session$OpenRequest;

    move-result-object v0

    .line 371
    .local v0, "openRequest":Lcom/facebook/Session$OpenRequest;
    new-instance v2, Lcom/facebook/Session$Builder;

    invoke-direct {v2, p0}, Lcom/facebook/Session$Builder;-><init>(Landroid/content/Context;)V

    sget-object v3, Lcom/hmobile/biblekjv/BaseActivity;->fbid:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/facebook/Session$Builder;->setApplicationId(Ljava/lang/String;)Lcom/facebook/Session$Builder;

    move-result-object v2

    .line 372
    invoke-virtual {v2}, Lcom/facebook/Session$Builder;->build()Lcom/facebook/Session;

    move-result-object v1

    .line 373
    .local v1, "session":Lcom/facebook/Session;
    sget-object v2, Lcom/facebook/SessionState;->CREATED_TOKEN_LOADED:Lcom/facebook/SessionState;

    invoke-virtual {v1}, Lcom/facebook/Session;->getState()Lcom/facebook/SessionState;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/SessionState;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 374
    if-eqz p1, :cond_1

    .line 375
    :cond_0
    invoke-static {v1}, Lcom/facebook/Session;->setActiveSession(Lcom/facebook/Session;)V

    .line 376
    invoke-virtual {v1, v0}, Lcom/facebook/Session;->openForPublish(Lcom/facebook/Session$OpenRequest;)V

    .line 379
    .end local v1    # "session":Lcom/facebook/Session;
    :goto_0
    return-object v1

    .restart local v1    # "session":Lcom/facebook/Session;
    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method

.method private publishFeedDialog(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "desc"    # Ljava/lang/String;

    .prologue
    const/4 v6, 0x1

    .line 383
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BaseActivity;->showProgress()V

    .line 384
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v2

    .line 386
    .local v2, "session":Lcom/facebook/Session;
    if-eqz v2, :cond_0

    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/Session;->isOpened()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 387
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 388
    .local v1, "params1":Landroid/os/Bundle;
    const-string v3, "name"

    invoke-virtual {v1, v3, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 390
    const-string v3, "description"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 391
    const-string v5, " \nhttps://bit.ly/kjvbibleapp"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 390
    invoke-virtual {v1, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 399
    const-string v3, "picture"

    .line 400
    const-string v4, "https://lh6.ggpht.com/YLfaM2iuhlHKMQPkNq9AvCkO3wo8qPQdZnl_2lk-NXUeUEElpzAfWY3qQgGHjmxjNbjx=w300"

    .line 398
    invoke-virtual {v1, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 404
    new-instance v3, Lcom/facebook/widget/WebDialog$FeedDialogBuilder;

    .line 405
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v4

    .line 404
    invoke-direct {v3, p0, v4, v1}, Lcom/facebook/widget/WebDialog$FeedDialogBuilder;-><init>(Landroid/content/Context;Lcom/facebook/Session;Landroid/os/Bundle;)V

    .line 406
    new-instance v4, Lcom/hmobile/biblekjv/BaseActivity$5;

    invoke-direct {v4, p0}, Lcom/hmobile/biblekjv/BaseActivity$5;-><init>(Lcom/hmobile/biblekjv/BaseActivity;)V

    invoke-virtual {v3, v4}, Lcom/facebook/widget/WebDialog$FeedDialogBuilder;->setOnCompleteListener(Lcom/facebook/widget/WebDialog$OnCompleteListener;)Lcom/facebook/widget/WebDialog$BuilderBase;

    move-result-object v3

    check-cast v3, Lcom/facebook/widget/WebDialog$FeedDialogBuilder;

    .line 475
    invoke-virtual {v3}, Lcom/facebook/widget/WebDialog$FeedDialogBuilder;->build()Lcom/facebook/widget/WebDialog;

    move-result-object v0

    .line 476
    .local v0, "feedDialog":Lcom/facebook/widget/WebDialog;
    invoke-virtual {v0}, Lcom/facebook/widget/WebDialog;->show()V

    .line 491
    .end local v0    # "feedDialog":Lcom/facebook/widget/WebDialog;
    .end local v1    # "params1":Landroid/os/Bundle;
    :goto_0
    return-void

    .line 479
    :cond_0
    const/4 v3, 0x5

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "email"

    aput-object v5, v3, v4

    .line 480
    const-string v4, "user_birthday"

    aput-object v4, v3, v6

    const/4 v4, 0x2

    const-string v5, "user_hometown"

    aput-object v5, v3, v4

    const/4 v4, 0x3

    const-string v5, "user_location"

    aput-object v5, v3, v4

    const/4 v4, 0x4

    .line 481
    const-string v5, "publish_actions"

    aput-object v5, v3, v4

    .line 479
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    .line 481
    new-instance v4, Lcom/hmobile/biblekjv/BaseActivity$6;

    invoke-direct {v4, p0}, Lcom/hmobile/biblekjv/BaseActivity$6;-><init>(Lcom/hmobile/biblekjv/BaseActivity;)V

    .line 479
    invoke-static {p0, v6, v3, v4}, Lcom/hmobile/biblekjv/BaseActivity;->openActiveSession(Landroid/app/Activity;ZLjava/util/List;Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session;

    goto :goto_0
.end method


# virtual methods
.method public PostShare(Ljava/util/ArrayList;II)V
    .locals 0
    .param p2, "bookno"    # I
    .param p3, "chap_no"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;II)V"
        }
    .end annotation

    .prologue
    .line 784
    .local p1, "m_verse_number_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
    return-void
.end method

.method public addAdView()V
    .locals 3

    .prologue
    .line 1082
    const v1, 0x7f0e0022

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/BaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/ads/AdView;

    iput-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity;->adView:Lcom/google/android/gms/ads/AdView;

    .line 1083
    new-instance v1, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v1}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    invoke-virtual {v1}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v0

    .line 1084
    .local v0, "adRequest":Lcom/google/android/gms/ads/AdRequest;
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity;->adView:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    .line 1085
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity;->adView:Lcom/google/android/gms/ads/AdView;

    new-instance v2, Lcom/hmobile/biblekjv/BaseActivity$21;

    invoke-direct {v2, p0}, Lcom/hmobile/biblekjv/BaseActivity$21;-><init>(Lcom/hmobile/biblekjv/BaseActivity;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/AdView;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V

    .line 1098
    return-void
.end method

.method public addQuickActionMenu()V
    .locals 2

    .prologue
    .line 943
    const v0, 0x7f0e002e

    invoke-virtual {p0, v0}, Lcom/hmobile/biblekjv/BaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->imgActionMenu:Landroid/widget/ImageView;

    .line 944
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->imgActionMenu:Landroid/widget/ImageView;

    new-instance v1, Lcom/hmobile/biblekjv/BaseActivity$14;

    invoke-direct {v1, p0}, Lcom/hmobile/biblekjv/BaseActivity$14;-><init>(Lcom/hmobile/biblekjv/BaseActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 961
    return-void
.end method

.method public hideActionMenuIcon()V
    .locals 2

    .prologue
    .line 968
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->imgActionMenu:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 969
    return-void
.end method

.method public hideAdView()V
    .locals 2

    .prologue
    .line 1101
    const v0, 0x7f0e0022

    invoke-virtual {p0, v0}, Lcom/hmobile/biblekjv/BaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/ads/AdView;

    iput-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->adView:Lcom/google/android/gms/ads/AdView;

    .line 1102
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->adView:Lcom/google/android/gms/ads/AdView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->setVisibility(I)V

    .line 1103
    return-void
.end method

.method public hideProgress()V
    .locals 2

    .prologue
    .line 571
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity;->m_pd:Landroid/app/ProgressDialog;

    if-eqz v1, :cond_0

    .line 573
    :try_start_0
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity;->m_pd:Landroid/app/ProgressDialog;

    invoke-virtual {v1}, Landroid/app/ProgressDialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 578
    :cond_0
    :goto_0
    return-void

    .line 574
    :catch_0
    move-exception v0

    .line 575
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public isTwitterLogedin()Z
    .locals 7

    .prologue
    const/4 v6, 0x1

    .line 764
    const/4 v2, 0x0

    .line 766
    .local v2, "isLogin":Z
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 767
    .local v3, "settings":Landroid/content/SharedPreferences;
    const-string v4, "accessKey"

    const-string v5, ""

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 768
    .local v0, "accessKey":Ljava/lang/String;
    const-string v4, "accessSecret"

    .line 769
    const-string v5, ""

    .line 768
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 771
    .local v1, "accessSecret":Ljava/lang/String;
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-le v4, v6, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-le v4, v6, :cond_0

    .line 772
    const/4 v2, 0x1

    .line 774
    :cond_0
    return v2
.end method

.method public loadData(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "desc"    # Ljava/lang/String;

    .prologue
    const/4 v2, 0x0

    .line 333
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BaseActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 334
    new-instance v1, Lcom/hmobile/biblekjv/BaseActivity$4;

    invoke-direct {v1, p0, p1, p2}, Lcom/hmobile/biblekjv/BaseActivity$4;-><init>(Lcom/hmobile/biblekjv/BaseActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 333
    invoke-static {v0, v2, v1, v2}, Lcom/facebook/Session;->restoreSession(Landroid/content/Context;Lcom/facebook/TokenCachingStrategy;Lcom/facebook/Session$StatusCallback;Landroid/os/Bundle;)Lcom/facebook/Session;

    .line 364
    return-void
.end method

.method public menuDialogDisplay()V
    .locals 3

    .prologue
    const v2, 0x7f020065

    .line 972
    new-instance v0, Lcom/hmobile/quickaction/ActionItem;

    invoke-direct {v0}, Lcom/hmobile/quickaction/ActionItem;-><init>()V

    iput-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiRemoveAds:Lcom/hmobile/quickaction/ActionItem;

    .line 973
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiRemoveAds:Lcom/hmobile/quickaction/ActionItem;

    const v1, 0x7f0700a6

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/hmobile/quickaction/ActionItem;->setTitle(Ljava/lang/String;)V

    .line 974
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiRemoveAds:Lcom/hmobile/quickaction/ActionItem;

    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/hmobile/quickaction/ActionItem;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 976
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiRemoveAds:Lcom/hmobile/quickaction/ActionItem;

    new-instance v1, Lcom/hmobile/biblekjv/BaseActivity$15;

    invoke-direct {v1, p0}, Lcom/hmobile/biblekjv/BaseActivity$15;-><init>(Lcom/hmobile/biblekjv/BaseActivity;)V

    invoke-virtual {v0, v1}, Lcom/hmobile/quickaction/ActionItem;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 993
    new-instance v0, Lcom/hmobile/quickaction/ActionItem;

    invoke-direct {v0}, Lcom/hmobile/quickaction/ActionItem;-><init>()V

    iput-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiEmailUpdates:Lcom/hmobile/quickaction/ActionItem;

    .line 994
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiEmailUpdates:Lcom/hmobile/quickaction/ActionItem;

    const v1, 0x7f0700a7

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/hmobile/quickaction/ActionItem;->setTitle(Ljava/lang/String;)V

    .line 995
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiEmailUpdates:Lcom/hmobile/quickaction/ActionItem;

    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/hmobile/quickaction/ActionItem;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 998
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiEmailUpdates:Lcom/hmobile/quickaction/ActionItem;

    new-instance v1, Lcom/hmobile/biblekjv/BaseActivity$16;

    invoke-direct {v1, p0}, Lcom/hmobile/biblekjv/BaseActivity$16;-><init>(Lcom/hmobile/biblekjv/BaseActivity;)V

    invoke-virtual {v0, v1}, Lcom/hmobile/quickaction/ActionItem;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1008
    new-instance v0, Lcom/hmobile/quickaction/ActionItem;

    invoke-direct {v0}, Lcom/hmobile/quickaction/ActionItem;-><init>()V

    iput-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiSurvey:Lcom/hmobile/quickaction/ActionItem;

    .line 1009
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiSurvey:Lcom/hmobile/quickaction/ActionItem;

    const v1, 0x7f0700a8

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/hmobile/quickaction/ActionItem;->setTitle(Ljava/lang/String;)V

    .line 1010
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiSurvey:Lcom/hmobile/quickaction/ActionItem;

    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/hmobile/quickaction/ActionItem;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 1012
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiSurvey:Lcom/hmobile/quickaction/ActionItem;

    new-instance v1, Lcom/hmobile/biblekjv/BaseActivity$17;

    invoke-direct {v1, p0}, Lcom/hmobile/biblekjv/BaseActivity$17;-><init>(Lcom/hmobile/biblekjv/BaseActivity;)V

    invoke-virtual {v0, v1}, Lcom/hmobile/quickaction/ActionItem;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1035
    new-instance v0, Lcom/hmobile/quickaction/ActionItem;

    invoke-direct {v0}, Lcom/hmobile/quickaction/ActionItem;-><init>()V

    iput-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiFeedback:Lcom/hmobile/quickaction/ActionItem;

    .line 1036
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiFeedback:Lcom/hmobile/quickaction/ActionItem;

    const v1, 0x7f0700a9

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/hmobile/quickaction/ActionItem;->setTitle(Ljava/lang/String;)V

    .line 1037
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiFeedback:Lcom/hmobile/quickaction/ActionItem;

    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/hmobile/quickaction/ActionItem;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 1039
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiFeedback:Lcom/hmobile/quickaction/ActionItem;

    new-instance v1, Lcom/hmobile/biblekjv/BaseActivity$18;

    invoke-direct {v1, p0}, Lcom/hmobile/biblekjv/BaseActivity$18;-><init>(Lcom/hmobile/biblekjv/BaseActivity;)V

    invoke-virtual {v0, v1}, Lcom/hmobile/quickaction/ActionItem;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1048
    new-instance v0, Lcom/hmobile/quickaction/ActionItem;

    invoke-direct {v0}, Lcom/hmobile/quickaction/ActionItem;-><init>()V

    iput-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiMoreApps:Lcom/hmobile/quickaction/ActionItem;

    .line 1049
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiMoreApps:Lcom/hmobile/quickaction/ActionItem;

    const v1, 0x7f0700aa

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/hmobile/quickaction/ActionItem;->setTitle(Ljava/lang/String;)V

    .line 1050
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiMoreApps:Lcom/hmobile/quickaction/ActionItem;

    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/hmobile/quickaction/ActionItem;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 1052
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiMoreApps:Lcom/hmobile/quickaction/ActionItem;

    new-instance v1, Lcom/hmobile/biblekjv/BaseActivity$19;

    invoke-direct {v1, p0}, Lcom/hmobile/biblekjv/BaseActivity$19;-><init>(Lcom/hmobile/biblekjv/BaseActivity;)V

    invoke-virtual {v0, v1}, Lcom/hmobile/quickaction/ActionItem;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1062
    new-instance v0, Lcom/hmobile/quickaction/ActionItem;

    invoke-direct {v0}, Lcom/hmobile/quickaction/ActionItem;-><init>()V

    iput-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiRate:Lcom/hmobile/quickaction/ActionItem;

    .line 1063
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiRate:Lcom/hmobile/quickaction/ActionItem;

    const v1, 0x7f0700ab

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/hmobile/quickaction/ActionItem;->setTitle(Ljava/lang/String;)V

    .line 1064
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiRate:Lcom/hmobile/quickaction/ActionItem;

    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/hmobile/quickaction/ActionItem;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 1066
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->aiRate:Lcom/hmobile/quickaction/ActionItem;

    new-instance v1, Lcom/hmobile/biblekjv/BaseActivity$20;

    invoke-direct {v1, p0}, Lcom/hmobile/biblekjv/BaseActivity$20;-><init>(Lcom/hmobile/biblekjv/BaseActivity;)V

    invoke-virtual {v0, v1}, Lcom/hmobile/quickaction/ActionItem;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1076
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 9
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    const/4 v8, 0x1

    .line 495
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 496
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v5

    invoke-virtual {v5, p0, p1, p2, p3}, Lcom/facebook/Session;->onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)Z

    .line 503
    const/16 v5, 0x3e9

    if-ne p1, v5, :cond_0

    .line 504
    const/4 v5, -0x1

    if-ne p2, v5, :cond_0

    .line 505
    const-string v5, "RESPONSE_CODE"

    const/4 v6, 0x0

    invoke-virtual {p3, v5, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    .line 507
    .local v3, "responseCode":I
    const-string v5, "INAPP_PURCHASE_DATA"

    invoke-virtual {p3, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 508
    .local v2, "purchaseData":Ljava/lang/String;
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->isItemPurchased()Z

    .line 510
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 511
    .local v1, "jo":Lorg/json/JSONObject;
    const-string v5, "productId"

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 512
    .local v4, "sku":Ljava/lang/String;
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BaseActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    .line 513
    new-instance v6, Ljava/lang/StringBuilder;

    const v7, 0x7f0700c8

    invoke-virtual {p0, v7}, Lcom/hmobile/biblekjv/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 514
    const/4 v7, 0x1

    .line 512
    invoke-static {v5, v6, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v5

    .line 514
    invoke-virtual {v5}, Landroid/widget/Toast;->show()V

    .line 515
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BaseActivity;->hideAdView()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 524
    .end local v1    # "jo":Lorg/json/JSONObject;
    .end local v2    # "purchaseData":Ljava/lang/String;
    .end local v3    # "responseCode":I
    .end local v4    # "sku":Ljava/lang/String;
    :cond_0
    :goto_0
    iget-object v5, p0, Lcom/hmobile/biblekjv/BaseActivity;->mTwitter:Lme/grantland/twitter/Twitter;

    invoke-virtual {v5, p1, p2, p3}, Lme/grantland/twitter/Twitter;->authorizeCallback(IILandroid/content/Intent;)V

    .line 525
    return-void

    .line 516
    .restart local v2    # "purchaseData":Ljava/lang/String;
    .restart local v3    # "responseCode":I
    :catch_0
    move-exception v0

    .line 517
    .local v0, "e":Lorg/json/JSONException;
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BaseActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    .line 518
    const v6, 0x7f0700c9

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 517
    invoke-static {v5, v6, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v5

    .line 519
    invoke-virtual {v5}, Landroid/widget/Toast;->show()V

    .line 520
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method

.method public onBackPressed()V
    .locals 26

    .prologue
    .line 616
    const-string v24, "activity"

    move-object/from16 v0, p0

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/hmobile/biblekjv/BaseActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/app/ActivityManager;

    .line 617
    .local v14, "m":Landroid/app/ActivityManager;
    const/16 v24, 0xa

    move/from16 v0, v24

    invoke-virtual {v14, v0}, Landroid/app/ActivityManager;->getRunningTasks(I)Ljava/util/List;

    move-result-object v19

    .line 618
    .local v19, "runningTaskInfoList":Ljava/util/List;, "Ljava/util/List<Landroid/app/ActivityManager$RunningTaskInfo;>;"
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    .line 619
    .local v13, "itr":Ljava/util/Iterator;, "Ljava/util/Iterator<Landroid/app/ActivityManager$RunningTaskInfo;>;"
    const/4 v15, 0x0

    .line 620
    .local v15, "numOfActivities":I
    :cond_0
    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v24

    if-nez v24, :cond_1

    .line 629
    const/16 v24, 0x1

    move/from16 v0, v24

    if-le v15, v0, :cond_2

    .line 630
    invoke-super/range {p0 .. p0}, Landroid/app/Activity;->onBackPressed()V

    .line 735
    :goto_1
    return-void

    .line 621
    :cond_1
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Landroid/app/ActivityManager$RunningTaskInfo;

    .line 622
    .local v18, "runningTaskInfo":Landroid/app/ActivityManager$RunningTaskInfo;
    move-object/from16 v0, v18

    iget v11, v0, Landroid/app/ActivityManager$RunningTaskInfo;->id:I

    .line 623
    .local v11, "id":I
    move-object/from16 v0, v18

    iget-object v0, v0, Landroid/app/ActivityManager$RunningTaskInfo;->baseActivity:Landroid/content/ComponentName;

    move-object/from16 v24, v0

    invoke-virtual/range {v24 .. v24}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v24

    .line 624
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/BaseActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v25

    .line 623
    invoke-virtual/range {v24 .. v25}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v24

    .line 624
    if-eqz v24, :cond_0

    .line 625
    move-object/from16 v0, v18

    iget v15, v0, Landroid/app/ActivityManager$RunningTaskInfo;->numActivities:I

    goto :goto_0

    .line 638
    .end local v11    # "id":I
    .end local v18    # "runningTaskInfo":Landroid/app/ActivityManager$RunningTaskInfo;
    :cond_2
    invoke-static {}, Lcom/hmobile/model/LikeShareList;->Instance()Lcom/hmobile/model/LikeShareList;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Lcom/hmobile/model/LikeShareList;->clearList()V

    .line 642
    invoke-static/range {p0 .. p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v20

    .line 643
    .local v20, "settings":Landroid/content/SharedPreferences;
    invoke-interface/range {v20 .. v20}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v10

    .line 645
    .local v10, "editor":Landroid/content/SharedPreferences$Editor;
    new-instance v3, Landroid/app/AlertDialog$Builder;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 647
    .local v3, "alertDialog":Landroid/app/AlertDialog$Builder;
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/BaseActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v12

    .line 648
    .local v12, "inflater":Landroid/view/LayoutInflater;
    const v24, 0x7f03001a

    const/16 v25, 0x0

    move/from16 v0, v24

    move-object/from16 v1, v25

    invoke-virtual {v12, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v23

    .line 649
    .local v23, "v":Landroid/view/View;
    move-object/from16 v0, v23

    invoke-virtual {v3, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 650
    const v24, 0x7f07009a

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/hmobile/biblekjv/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v24

    move-object/from16 v0, v24

    invoke-virtual {v3, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 651
    invoke-virtual {v3}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v9

    .line 653
    .local v9, "dialog":Landroid/app/AlertDialog;
    const v24, 0x7f0e008f

    invoke-virtual/range {v23 .. v24}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v22

    check-cast v22, Landroid/widget/TextView;

    .line 654
    .local v22, "txtTitle":Landroid/widget/TextView;
    const v24, 0x7f0e0094

    invoke-virtual/range {v23 .. v24}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v21

    check-cast v21, Landroid/widget/TextView;

    .line 656
    .local v21, "txtRateTitle":Landroid/widget/TextView;
    const v24, 0x7f0700a3

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/hmobile/biblekjv/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v24

    move-object/from16 v0, v22

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 657
    const v24, 0x7f07009d

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/hmobile/biblekjv/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v24

    move-object/from16 v0, v21

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 659
    const v24, 0x7f0e0091

    invoke-virtual/range {v23 .. v24}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/Button;

    .line 660
    .local v7, "btnOkay":Landroid/widget/Button;
    const v24, 0x7f0e0092

    invoke-virtual/range {v23 .. v24}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    .line 662
    .local v4, "btnCancel":Landroid/widget/Button;
    const v24, 0x7f0e0095

    invoke-virtual/range {v23 .. v24}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/Button;

    .line 663
    .local v8, "btnRate":Landroid/widget/Button;
    const v24, 0x7f0e0096

    invoke-virtual/range {v23 .. v24}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/Button;

    .line 664
    .local v6, "btnNotNow":Landroid/widget/Button;
    const v24, 0x7f0e0097

    invoke-virtual/range {v23 .. v24}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/Button;

    .line 667
    .local v5, "btnNever":Landroid/widget/Button;
    const v24, 0x7f0e0093

    invoke-virtual/range {v23 .. v24}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v17

    .line 666
    check-cast v17, Landroid/widget/RelativeLayout;

    .line 669
    .local v17, "rlRate":Landroid/widget/RelativeLayout;
    const v24, 0x7f0e0090

    invoke-virtual/range {v23 .. v24}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v16

    .line 668
    check-cast v16, Landroid/widget/RelativeLayout;

    .line 671
    .local v16, "rlContent":Landroid/widget/RelativeLayout;
    new-instance v24, Lcom/hmobile/biblekjv/BaseActivity$7;

    move-object/from16 v0, v24

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v9}, Lcom/hmobile/biblekjv/BaseActivity$7;-><init>(Lcom/hmobile/biblekjv/BaseActivity;Landroid/app/AlertDialog;)V

    move-object/from16 v0, v24

    invoke-virtual {v4, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 678
    new-instance v24, Lcom/hmobile/biblekjv/BaseActivity$8;

    move-object/from16 v0, v24

    move-object/from16 v1, p0

    move-object/from16 v2, v17

    invoke-direct {v0, v1, v2, v9}, Lcom/hmobile/biblekjv/BaseActivity$8;-><init>(Lcom/hmobile/biblekjv/BaseActivity;Landroid/widget/RelativeLayout;Landroid/app/AlertDialog;)V

    move-object/from16 v0, v24

    invoke-virtual {v7, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 697
    new-instance v24, Lcom/hmobile/biblekjv/BaseActivity$9;

    move-object/from16 v0, v24

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v10}, Lcom/hmobile/biblekjv/BaseActivity$9;-><init>(Lcom/hmobile/biblekjv/BaseActivity;Landroid/content/SharedPreferences$Editor;)V

    move-object/from16 v0, v24

    invoke-virtual {v8, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 712
    new-instance v24, Lcom/hmobile/biblekjv/BaseActivity$10;

    move-object/from16 v0, v24

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v10}, Lcom/hmobile/biblekjv/BaseActivity$10;-><init>(Lcom/hmobile/biblekjv/BaseActivity;Landroid/content/SharedPreferences$Editor;)V

    move-object/from16 v0, v24

    invoke-virtual {v6, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 723
    new-instance v24, Lcom/hmobile/biblekjv/BaseActivity$11;

    move-object/from16 v0, v24

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v10}, Lcom/hmobile/biblekjv/BaseActivity$11;-><init>(Lcom/hmobile/biblekjv/BaseActivity;Landroid/content/SharedPreferences$Editor;)V

    move-object/from16 v0, v24

    invoke-virtual {v5, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 733
    invoke-virtual {v9}, Landroid/app/AlertDialog;->show()V

    goto/16 :goto_1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const v3, 0x7f070094

    .line 102
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 103
    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/BaseActivity;->requestWindowFeature(I)Z

    .line 104
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity;->applicationId:Ljava/lang/String;

    .line 105
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070095

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity;->CONSUMER_KEY:Ljava/lang/String;

    .line 106
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 107
    const v2, 0x7f070096

    .line 106
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity;->CONSUMER_SECRET:Ljava/lang/String;

    .line 109
    invoke-static {}, Lcom/google/analytics/tracking/android/EasyTracker;->getInstance()Lcom/google/analytics/tracking/android/EasyTracker;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/google/analytics/tracking/android/EasyTracker;->activityStart(Landroid/app/Activity;)V

    .line 110
    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/hmobile/biblekjv/BaseActivity;->fbid:Ljava/lang/String;

    .line 111
    new-instance v1, Lcom/facebook/UiLifecycleHelper;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/facebook/UiLifecycleHelper;-><init>(Landroid/app/Activity;Lcom/facebook/Session$StatusCallback;)V

    iput-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity;->uiHelper:Lcom/facebook/UiLifecycleHelper;

    .line 112
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity;->uiHelper:Lcom/facebook/UiLifecycleHelper;

    invoke-virtual {v1, p1}, Lcom/facebook/UiLifecycleHelper;->onCreate(Landroid/os/Bundle;)V

    .line 113
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BaseActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 114
    .local v0, "display":Landroid/view/Display;
    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v1

    iput v1, p0, Lcom/hmobile/biblekjv/BaseActivity;->screenWidth:I

    .line 115
    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v1

    iput v1, p0, Lcom/hmobile/biblekjv/BaseActivity;->screenHeight:I

    .line 117
    new-instance v1, Landroid/app/ProgressDialog;

    const v2, 0x7f0a0008

    invoke-direct {v1, p0, v2}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;I)V

    iput-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity;->m_pd:Landroid/app/ProgressDialog;

    .line 118
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity;->m_pd:Landroid/app/ProgressDialog;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "<font color=\'white\'>"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 119
    const v3, 0x7f0700c7

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "</font>"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 118
    invoke-static {v2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 121
    new-instance v1, Lme/grantland/twitter/Twitter;

    iget-object v2, p0, Lcom/hmobile/biblekjv/BaseActivity;->CONSUMER_KEY:Ljava/lang/String;

    iget-object v3, p0, Lcom/hmobile/biblekjv/BaseActivity;->CONSUMER_SECRET:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lme/grantland/twitter/Twitter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity;->mTwitter:Lme/grantland/twitter/Twitter;

    .line 122
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 5
    .param p1, "menu"    # Landroid/view/Menu;

    .prologue
    const/4 v4, 0x4

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 856
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    .line 857
    sget-boolean v0, Lcom/hmobile/biblekjv/HolyBibleApplication;->isPurchased:Z

    if-nez v0, :cond_0

    .line 859
    const v0, 0x7f0700a6

    invoke-virtual {p0, v0}, Lcom/hmobile/biblekjv/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 858
    invoke-interface {p1, v2, v3, v2, v0}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    .line 860
    const v1, 0x1080038

    .line 859
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 862
    :cond_0
    const/4 v0, 0x2

    .line 863
    const v1, 0x7f0700a7

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 862
    invoke-interface {p1, v3, v0, v2, v1}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    .line 864
    const v1, 0x108008f

    .line 863
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 868
    const/4 v0, 0x3

    .line 869
    const v1, 0x7f0700a9

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 868
    invoke-interface {p1, v0, v4, v2, v1}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    .line 870
    const v1, 0x108003e

    .line 869
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 871
    const/4 v0, 0x5

    .line 872
    const v1, 0x7f0700ad

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 871
    invoke-interface {p1, v4, v0, v2, v1}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    .line 873
    const v1, 0x1080049

    .line 872
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 874
    return v3
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 602
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 604
    invoke-static {}, Lcom/google/analytics/tracking/android/EasyTracker;->getInstance()Lcom/google/analytics/tracking/android/EasyTracker;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/analytics/tracking/android/EasyTracker;->activityStop(Landroid/app/Activity;)V

    .line 606
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 4
    .param p1, "item"    # Landroid/view/MenuItem;

    .prologue
    const/4 v2, 0x1

    .line 879
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v3

    packed-switch v3, :pswitch_data_0

    .line 920
    const/4 v2, 0x0

    :goto_0
    return v2

    .line 890
    :pswitch_0
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BaseActivity;->removeAds()V

    goto :goto_0

    .line 894
    :pswitch_1
    new-instance v1, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 896
    .local v1, "intent":Landroid/content/Intent;
    const v3, 0x7f07008c

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    .line 895
    invoke-virtual {v1, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 897
    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/BaseActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 901
    .end local v1    # "intent":Landroid/content/Intent;
    :pswitch_2
    new-instance v1, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 902
    .restart local v1    # "intent":Landroid/content/Intent;
    const v3, 0x7f07008e

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 903
    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/BaseActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 907
    .end local v1    # "intent":Landroid/content/Intent;
    :pswitch_3
    new-instance v1, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 908
    .restart local v1    # "intent":Landroid/content/Intent;
    const v3, 0x7f07008f

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 909
    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/BaseActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 913
    .end local v1    # "intent":Landroid/content/Intent;
    :pswitch_4
    new-instance v0, Landroid/content/Intent;

    .line 914
    const-class v3, Lcom/hmobile/biblekjv/WidgetSelectorActivity;

    .line 913
    invoke-direct {v0, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 915
    .local v0, "i":Landroid/content/Intent;
    const-string v3, "FromApp"

    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 916
    invoke-virtual {p0, v0}, Lcom/hmobile/biblekjv/BaseActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 879
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

.method public onPause()V
    .locals 0

    .prologue
    .line 610
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 611
    return-void
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 140
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BaseActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 141
    const v1, 0x7f070094

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 140
    invoke-static {v0, v1}, Lcom/facebook/AppEventsLogger;->activateApp(Landroid/content/Context;Ljava/lang/String;)V

    .line 142
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 143
    return-void
.end method

.method protected onStop()V
    .locals 1

    .prologue
    .line 147
    invoke-static {}, Lcom/google/analytics/tracking/android/EasyTracker;->getInstance()Lcom/google/analytics/tracking/android/EasyTracker;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/analytics/tracking/android/EasyTracker;->activityStop(Landroid/app/Activity;)V

    .line 148
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 149
    return-void
.end method

.method public removeAds()V
    .locals 10

    .prologue
    .line 927
    :try_start_0
    sget-object v0, Lcom/hmobile/biblekjv/HolyBibleApplication;->mService:Lcom/android/vending/billing/IInAppBillingService;

    const/4 v1, 0x3

    .line 928
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BaseActivity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f0700b9

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 929
    const-string v4, "inapp"

    const-string v5, ""

    .line 927
    invoke-interface/range {v0 .. v5}, Lcom/android/vending/billing/IInAppBillingService;->getBuyIntent(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v7

    .line 931
    .local v7, "buyIntentBundle":Landroid/os/Bundle;
    const-string v0, "BUY_INTENT"

    invoke-virtual {v7, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v9

    check-cast v9, Landroid/app/PendingIntent;

    .line 932
    .local v9, "pendingIntent":Landroid/app/PendingIntent;
    invoke-virtual {v9}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object v1

    const/16 v2, 0x3e9

    .line 933
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 934
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    move-object v0, p0

    .line 932
    invoke-virtual/range {v0 .. v6}, Lcom/hmobile/biblekjv/BaseActivity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 938
    .end local v7    # "buyIntentBundle":Landroid/os/Bundle;
    .end local v9    # "pendingIntent":Landroid/app/PendingIntent;
    :goto_0
    return-void

    .line 935
    :catch_0
    move-exception v8

    .line 936
    .local v8, "e":Ljava/lang/Exception;
    invoke-virtual {v8}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public sendAnalyticsevent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1, "cat"    # Ljava/lang/String;
    .param p2, "action"    # Ljava/lang/String;
    .param p3, "text"    # Ljava/lang/String;

    .prologue
    .line 1137
    invoke-static {}, Lcom/google/analytics/tracking/android/EasyTracker;->getTracker()Lcom/google/analytics/tracking/android/Tracker;

    move-result-object v0

    const-wide/16 v2, 0xa

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/google/analytics/tracking/android/Tracker;->sendEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 1138
    return-void
.end method

.method public setFontStyleRoboto(Landroid/widget/Button;Ljava/lang/String;)V
    .locals 2
    .param p1, "btn"    # Landroid/widget/Button;
    .param p2, "filename"    # Ljava/lang/String;

    .prologue
    .line 586
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BaseActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    invoke-static {v1, p2}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    .line 587
    .local v0, "roboto":Landroid/graphics/Typeface;
    invoke-virtual {p1, v0}, Landroid/widget/Button;->setTypeface(Landroid/graphics/Typeface;)V

    .line 588
    return-void
.end method

.method public setFontStyleRoboto(Landroid/widget/TextView;Ljava/lang/String;)V
    .locals 2
    .param p1, "txt"    # Landroid/widget/TextView;
    .param p2, "filename"    # Ljava/lang/String;

    .prologue
    .line 581
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BaseActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    invoke-static {v1, p2}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    .line 582
    .local v0, "roboto":Landroid/graphics/Typeface;
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 583
    return-void
.end method

.method public showActionMenuIcon()V
    .locals 2

    .prologue
    .line 964
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity;->imgActionMenu:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 965
    return-void
.end method

.method public showAlertForTwitterShare(Ljava/lang/String;Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;)V
    .locals 5
    .param p1, "sharetext"    # Ljava/lang/String;
    .param p2, "delegate"    # Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;

    .prologue
    .line 739
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 740
    .local v1, "builder":Landroid/app/AlertDialog$Builder;
    const-string v2, "Alert"

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 741
    const v3, 0x7f07008b

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 742
    const-string v3, "OK"

    new-instance v4, Lcom/hmobile/biblekjv/BaseActivity$12;

    invoke-direct {v4, p0, p1, p2}, Lcom/hmobile/biblekjv/BaseActivity$12;-><init>(Lcom/hmobile/biblekjv/BaseActivity;Ljava/lang/String;Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;)V

    invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 751
    const-string v3, "Cancel"

    new-instance v4, Lcom/hmobile/biblekjv/BaseActivity$13;

    invoke-direct {v4, p0}, Lcom/hmobile/biblekjv/BaseActivity$13;-><init>(Lcom/hmobile/biblekjv/BaseActivity;)V

    invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 759
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 760
    .local v0, "alert":Landroid/app/AlertDialog;
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 761
    return-void
.end method

.method public showProgress()V
    .locals 2

    .prologue
    .line 550
    :try_start_0
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity;->m_pd:Landroid/app/ProgressDialog;

    if-eqz v1, :cond_0

    .line 551
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity;->m_pd:Landroid/app/ProgressDialog;

    invoke-virtual {v1}, Landroid/app/ProgressDialog;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 556
    :cond_0
    :goto_0
    return-void

    .line 553
    :catch_0
    move-exception v0

    .line 554
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public showProgress(Ljava/lang/String;)V
    .locals 2
    .param p1, "msg"    # Ljava/lang/String;

    .prologue
    .line 560
    :try_start_0
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity;->m_pd:Landroid/app/ProgressDialog;

    if-eqz v1, :cond_0

    .line 561
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity;->m_pd:Landroid/app/ProgressDialog;

    invoke-virtual {v1, p1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 562
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity;->m_pd:Landroid/app/ProgressDialog;

    invoke-virtual {v1}, Landroid/app/ProgressDialog;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 568
    :cond_0
    :goto_0
    return-void

    .line 565
    :catch_0
    move-exception v0

    .line 566
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public showToast(Ljava/lang/String;)V
    .locals 4
    .param p1, "msg"    # Ljava/lang/String;

    .prologue
    .line 1141
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BaseActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    .line 1142
    const/4 v2, 0x1

    .line 1141
    invoke-static {v1, p1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 1143
    .local v0, "t":Landroid/widget/Toast;
    const/16 v1, 0x51

    const/4 v2, 0x0

    .line 1144
    iget v3, p0, Lcom/hmobile/biblekjv/BaseActivity;->screenHeight:I

    div-int/lit8 v3, v3, 0x2

    .line 1143
    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/Toast;->setGravity(III)V

    .line 1145
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1146
    return-void
.end method

.method public signInWithFb(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 7
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "desc"    # Ljava/lang/String;
    .param p3, "is_finished"    # Z

    .prologue
    .line 270
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 271
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/Session;->isOpened()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 272
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BaseActivity;->showProgress()V

    .line 273
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v1

    .line 274
    .local v1, "session":Lcom/facebook/Session;
    invoke-virtual {v1}, Lcom/facebook/Session;->getAccessToken()Ljava/lang/String;

    move-result-object v2

    .line 275
    .local v2, "tokan":Ljava/lang/String;
    iput-boolean p3, p0, Lcom/hmobile/biblekjv/BaseActivity;->is_finished:Z

    .line 295
    invoke-direct {p0, p1, p2}, Lcom/hmobile/biblekjv/BaseActivity;->publishFeedDialog(Ljava/lang/String;Ljava/lang/String;)V

    .line 330
    .end local v1    # "session":Lcom/facebook/Session;
    .end local v2    # "tokan":Ljava/lang/String;
    :goto_0
    return-void

    .line 298
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v3

    iput-object v3, p0, Lcom/hmobile/biblekjv/BaseActivity;->session:Lcom/facebook/Session;

    .line 300
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BaseActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/Session;->openActiveSessionFromCache(Landroid/content/Context;)Lcom/facebook/Session;

    move-result-object v3

    .line 299
    iput-object v3, p0, Lcom/hmobile/biblekjv/BaseActivity;->session:Lcom/facebook/Session;

    .line 301
    iget-object v3, p0, Lcom/hmobile/biblekjv/BaseActivity;->session:Lcom/facebook/Session;

    if-eqz v3, :cond_1

    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 302
    iget-object v3, p0, Lcom/hmobile/biblekjv/BaseActivity;->session:Lcom/facebook/Session;

    invoke-virtual {v3}, Lcom/facebook/Session;->isOpened()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 303
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BaseActivity;->showProgress()V

    .line 304
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v1

    .line 305
    .restart local v1    # "session":Lcom/facebook/Session;
    invoke-virtual {v1}, Lcom/facebook/Session;->getAccessToken()Ljava/lang/String;

    move-result-object v2

    .line 306
    .restart local v2    # "tokan":Ljava/lang/String;
    iput-boolean p3, p0, Lcom/hmobile/biblekjv/BaseActivity;->is_finished:Z

    .line 307
    invoke-direct {p0, p1, p2}, Lcom/hmobile/biblekjv/BaseActivity;->publishFeedDialog(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 326
    .end local v1    # "session":Lcom/facebook/Session;
    .end local v2    # "tokan":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 327
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 309
    .end local v0    # "e":Ljava/lang/Exception;
    :cond_1
    const/4 v3, 0x1

    const/4 v4, 0x5

    :try_start_1
    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    .line 310
    const-string v6, "email"

    aput-object v6, v4, v5

    const/4 v5, 0x1

    const-string v6, "user_birthday"

    aput-object v6, v4, v5

    const/4 v5, 0x2

    const-string v6, "user_hometown"

    aput-object v6, v4, v5

    const/4 v5, 0x3

    .line 311
    const-string v6, "user_location"

    aput-object v6, v4, v5

    const/4 v5, 0x4

    const-string v6, "publish_actions"

    aput-object v6, v4, v5

    .line 309
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 312
    new-instance v5, Lcom/hmobile/biblekjv/BaseActivity$3;

    invoke-direct {v5, p0, p1, p2}, Lcom/hmobile/biblekjv/BaseActivity$3;-><init>(Lcom/hmobile/biblekjv/BaseActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 309
    invoke-static {p0, v3, v4, v5}, Lcom/hmobile/biblekjv/BaseActivity;->openActiveSession(Landroid/app/Activity;ZLjava/util/List;Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method

.method public signInwithTwitter(Ljava/lang/String;Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;)V
    .locals 7
    .param p1, "share_text"    # Ljava/lang/String;
    .param p2, "delegate"    # Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;

    .prologue
    .line 153
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BaseActivity;->isTwitterLogedin()Z

    move-result v4

    if-nez v4, :cond_0

    .line 154
    iget-object v4, p0, Lcom/hmobile/biblekjv/BaseActivity;->mTwitter:Lme/grantland/twitter/Twitter;

    new-instance v5, Lcom/hmobile/biblekjv/BaseActivity$1;

    invoke-direct {v5, p0, p1, p2}, Lcom/hmobile/biblekjv/BaseActivity$1;-><init>(Lcom/hmobile/biblekjv/BaseActivity;Ljava/lang/String;Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;)V

    invoke-virtual {v4, p0, v5}, Lme/grantland/twitter/Twitter;->authorize(Landroid/app/Activity;Lme/grantland/twitter/Twitter$DialogListener;)Z

    .line 264
    :goto_0
    return-void

    .line 226
    :cond_0
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BaseActivity;->showProgress()V

    .line 228
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 229
    .local v3, "settings":Landroid/content/SharedPreferences;
    const-string v4, "accessKey"

    const-string v5, ""

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 231
    .local v0, "accessKey":Ljava/lang/String;
    const-string v4, "accessSecret"

    const-string v5, ""

    .line 230
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 232
    .local v1, "accessSecret":Ljava/lang/String;
    new-instance v4, Lme/grantland/twitter/Tweeter;

    iget-object v5, p0, Lcom/hmobile/biblekjv/BaseActivity;->CONSUMER_KEY:Ljava/lang/String;

    .line 233
    iget-object v6, p0, Lcom/hmobile/biblekjv/BaseActivity;->CONSUMER_SECRET:Ljava/lang/String;

    invoke-direct {v4, v0, v1, v5, v6}, Lme/grantland/twitter/Tweeter;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    iput-object v4, p0, Lcom/hmobile/biblekjv/BaseActivity;->tweet:Lme/grantland/twitter/Tweeter;

    .line 235
    :try_start_0
    iget-object v4, p0, Lcom/hmobile/biblekjv/BaseActivity;->tweet:Lme/grantland/twitter/Tweeter;

    const/4 v5, 0x0

    new-instance v6, Lcom/hmobile/biblekjv/BaseActivity$2;

    invoke-direct {v6, p0, p2}, Lcom/hmobile/biblekjv/BaseActivity$2;-><init>(Lcom/hmobile/biblekjv/BaseActivity;Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;)V

    invoke-virtual {v4, p1, v5, v6}, Lme/grantland/twitter/Tweeter;->upload(Ljava/lang/String;ZLme/grantland/twitter/Tweeter$TwitterUploadDelegate;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 259
    :catch_0
    move-exception v2

    .line 260
    .local v2, "e":Ljava/lang/Exception;
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BaseActivity;->hideProgress()V

    .line 261
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public startIntent(Landroid/app/Activity;Ljava/lang/Class;)V
    .locals 3
    .param p1, "act"    # Landroid/app/Activity;
    .param p2, "c"    # Ljava/lang/Class;

    .prologue
    .line 591
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p1, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 592
    .local v0, "i":Landroid/content/Intent;
    invoke-virtual {p0, v0}, Lcom/hmobile/biblekjv/BaseActivity;->startActivity(Landroid/content/Intent;)V

    .line 593
    const v1, 0x7f040001

    const v2, 0x7f040002

    invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 594
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BaseActivity;->finish()V

    .line 597
    invoke-static {}, Lcom/google/analytics/tracking/android/EasyTracker;->getInstance()Lcom/google/analytics/tracking/android/EasyTracker;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/google/analytics/tracking/android/EasyTracker;->activityStart(Landroid/app/Activity;)V

    .line 598
    return-void
.end method
