.class public Lcom/QRBS/activity/StartActivity;
.super Lcom/actionbarsherlock/app/SherlockFragmentActivity;
.source "StartActivity.java"


# instance fields
.field private adView:Lcom/google/android/gms/ads/AdView;

.field private alert:Landroid/app/AlertDialog;

.field fc:Lcom/scannerfire/fragment/FragmentCronology;

.field private firstTime:Z

.field private flag:Z

.field private mInterstitialAd:Lcom/google/android/gms/ads/InterstitialAd;

.field private mTabHost:Landroid/widget/TabHost;

.field private mTabsAdapter:Lcom/scannerfire/fragment/TabsAdapter;

.field private mViewPager:Landroid/support/v4/view/ViewPager;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 63
    invoke-direct {p0}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;-><init>()V

    .line 72
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/QRBS/activity/StartActivity;->firstTime:Z

    .line 73
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/QRBS/activity/StartActivity;->flag:Z

    .line 63
    return-void
.end method

.method static synthetic access$0(Lcom/QRBS/activity/StartActivity;)V
    .locals 0

    .prologue
    .line 557
    invoke-direct {p0}, Lcom/QRBS/activity/StartActivity;->loadInterstitial()V

    return-void
.end method

.method static synthetic access$1(Lcom/QRBS/activity/StartActivity;)Landroid/widget/TabHost;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/QRBS/activity/StartActivity;->mTabHost:Landroid/widget/TabHost;

    return-object v0
.end method

.method static synthetic access$2(Lcom/QRBS/activity/StartActivity;)Landroid/support/v4/view/ViewPager;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/QRBS/activity/StartActivity;->mViewPager:Landroid/support/v4/view/ViewPager;

    return-object v0
.end method

.method static synthetic access$3(Lcom/QRBS/activity/StartActivity;)Lcom/google/android/gms/ads/InterstitialAd;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/QRBS/activity/StartActivity;->mInterstitialAd:Lcom/google/android/gms/ads/InterstitialAd;

    return-object v0
.end method

.method static synthetic access$4(Lcom/QRBS/activity/StartActivity;Z)V
    .locals 0

    .prologue
    .line 72
    iput-boolean p1, p0, Lcom/QRBS/activity/StartActivity;->firstTime:Z

    return-void
.end method

.method static synthetic access$5(Lcom/QRBS/activity/StartActivity;)Landroid/app/AlertDialog;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/QRBS/activity/StartActivity;->alert:Landroid/app/AlertDialog;

    return-object v0
.end method

.method static synthetic access$6(Lcom/QRBS/activity/StartActivity;Z)V
    .locals 0

    .prologue
    .line 73
    iput-boolean p1, p0, Lcom/QRBS/activity/StartActivity;->flag:Z

    return-void
.end method

.method private loadInterstitial()V
    .locals 6

    .prologue
    .line 558
    new-instance v0, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    .line 559
    .local v0, "adRequestBuilder":Lcom/google/android/gms/ads/AdRequest$Builder;
    invoke-virtual {p0}, Lcom/QRBS/activity/StartActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    const-string v4, "android_id"

    invoke-static {v3, v4}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 560
    .local v1, "android_id":Ljava/lang/String;
    invoke-static {v1}, Lcom/scannerfire/utils/Utils;->md5(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    .line 562
    .local v2, "deviceId":Ljava/lang/String;
    const-string v3, ""

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "DEVICE ID -> "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 564
    iget-object v3, p0, Lcom/QRBS/activity/StartActivity;->mInterstitialAd:Lcom/google/android/gms/ads/InterstitialAd;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/ads/InterstitialAd;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    .line 566
    return-void
.end method

.method private saveToCsv()V
    .locals 11

    .prologue
    .line 478
    invoke-virtual {p0}, Lcom/QRBS/activity/StartActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v7

    .line 479
    .local v7, "inflater":Landroid/view/LayoutInflater;
    const v9, 0x7f030028

    const/4 v10, 0x0

    invoke-virtual {v7, v9, v10}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 480
    .local v5, "dialoglayout":Landroid/view/View;
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 481
    .local v1, "builder":Landroid/app/AlertDialog$Builder;
    invoke-virtual {v1, v5}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 482
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 483
    .local v0, "a":Landroid/app/AlertDialog;
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 485
    const v9, 0x7f0d0091

    invoke-virtual {v5, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/EditText;

    .line 486
    .local v6, "editName":Landroid/widget/EditText;
    const v9, 0x7f0d0092

    invoke-virtual {v5, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    .line 487
    .local v2, "button":Landroid/widget/Button;
    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    .line 488
    .local v3, "d":Ljava/util/Date;
    new-instance v8, Ljava/text/SimpleDateFormat;

    const-string v9, "yyyyMMdd_HHmmss"

    invoke-direct {v8, v9}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 489
    .local v8, "sdf":Ljava/text/SimpleDateFormat;
    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "qrbs_database"

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, ".csv"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 490
    .local v4, "default_name":Ljava/lang/String;
    invoke-virtual {v6, v4}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 492
    new-instance v9, Lcom/QRBS/activity/StartActivity$11;

    invoke-direct {v9, p0, v6, v0}, Lcom/QRBS/activity/StartActivity$11;-><init>(Lcom/QRBS/activity/StartActivity;Landroid/widget/EditText;Landroid/app/AlertDialog;)V

    invoke-virtual {v2, v9}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 549
    return-void
.end method

.method private showBackDialog()V
    .locals 3

    .prologue
    .line 220
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 221
    .local v0, "build":Landroid/app/AlertDialog$Builder;
    invoke-virtual {p0}, Lcom/QRBS/activity/StartActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0800b6

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 222
    invoke-virtual {p0}, Lcom/QRBS/activity/StartActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0800b5

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 223
    invoke-virtual {p0}, Lcom/QRBS/activity/StartActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0800b8

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 224
    new-instance v2, Lcom/QRBS/activity/StartActivity$3;

    invoke-direct {v2, p0}, Lcom/QRBS/activity/StartActivity$3;-><init>(Lcom/QRBS/activity/StartActivity;)V

    .line 223
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 258
    invoke-virtual {p0}, Lcom/QRBS/activity/StartActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0800b7

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 259
    new-instance v2, Lcom/QRBS/activity/StartActivity$4;

    invoke-direct {v2, p0}, Lcom/QRBS/activity/StartActivity$4;-><init>(Lcom/QRBS/activity/StartActivity;)V

    .line 258
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 267
    invoke-virtual {p0}, Lcom/QRBS/activity/StartActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f080146

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 268
    new-instance v2, Lcom/QRBS/activity/StartActivity$5;

    invoke-direct {v2, p0}, Lcom/QRBS/activity/StartActivity$5;-><init>(Lcom/QRBS/activity/StartActivity;)V

    .line 267
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 283
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    iput-object v1, p0, Lcom/QRBS/activity/StartActivity;->alert:Landroid/app/AlertDialog;

    .line 284
    iget-object v1, p0, Lcom/QRBS/activity/StartActivity;->alert:Landroid/app/AlertDialog;

    invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V

    .line 285
    return-void
.end method

.method private showDeleteDialog()V
    .locals 3

    .prologue
    .line 445
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 446
    .local v0, "build":Landroid/app/AlertDialog$Builder;
    invoke-virtual {p0}, Lcom/QRBS/activity/StartActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f080142

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 447
    invoke-virtual {p0}, Lcom/QRBS/activity/StartActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f080143

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 448
    invoke-virtual {p0}, Lcom/QRBS/activity/StartActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0800b8

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 449
    new-instance v2, Lcom/QRBS/activity/StartActivity$9;

    invoke-direct {v2, p0}, Lcom/QRBS/activity/StartActivity$9;-><init>(Lcom/QRBS/activity/StartActivity;)V

    .line 448
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 462
    invoke-virtual {p0}, Lcom/QRBS/activity/StartActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0800b7

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 463
    new-instance v2, Lcom/QRBS/activity/StartActivity$10;

    invoke-direct {v2, p0}, Lcom/QRBS/activity/StartActivity$10;-><init>(Lcom/QRBS/activity/StartActivity;)V

    .line 462
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 471
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    iput-object v1, p0, Lcom/QRBS/activity/StartActivity;->alert:Landroid/app/AlertDialog;

    .line 472
    iget-object v1, p0, Lcom/QRBS/activity/StartActivity;->alert:Landroid/app/AlertDialog;

    invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V

    .line 474
    return-void
.end method


# virtual methods
.method public onAttachFragment(Landroid/support/v4/app/Fragment;)V
    .locals 0
    .param p1, "fragment"    # Landroid/support/v4/app/Fragment;

    .prologue
    .line 554
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->onAttachFragment(Landroid/support/v4/app/Fragment;)V

    .line 555
    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .prologue
    .line 208
    iget-object v0, p0, Lcom/QRBS/activity/StartActivity;->mTabHost:Landroid/widget/TabHost;

    invoke-virtual {v0}, Landroid/widget/TabHost;->getCurrentTab()I

    move-result v0

    if-eqz v0, :cond_0

    .line 209
    iget-object v0, p0, Lcom/QRBS/activity/StartActivity;->mTabHost:Landroid/widget/TabHost;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TabHost;->setCurrentTab(I)V

    .line 214
    :goto_0
    return-void

    .line 212
    :cond_0
    invoke-direct {p0}, Lcom/QRBS/activity/StartActivity;->showBackDialog()V

    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 17
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 82
    invoke-super/range {p0 .. p1}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 84
    const-string v12, "a0716322"

    move-object/from16 v0, p0

    invoke-static {v0, v12}, Lcom/splunk/mint/Mint;->initAndStartSession(Landroid/content/Context;Ljava/lang/String;)V

    .line 88
    const v12, 0x7f030019

    move-object/from16 v0, p0

    invoke-virtual {v0, v12}, Lcom/QRBS/activity/StartActivity;->setContentView(I)V

    .line 90
    invoke-virtual/range {p0 .. p0}, Lcom/QRBS/activity/StartActivity;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v1

    .line 91
    .local v1, "ab":Lcom/actionbarsherlock/app/ActionBar;
    const v12, 0x7f0200d4

    invoke-virtual {v1, v12}, Lcom/actionbarsherlock/app/ActionBar;->setIcon(I)V

    .line 92
    const v12, 0x7f0800b1

    invoke-virtual {v1, v12}, Lcom/actionbarsherlock/app/ActionBar;->setTitle(I)V

    .line 93
    const/4 v12, 0x1

    invoke-virtual {v1, v12}, Lcom/actionbarsherlock/app/ActionBar;->setHomeButtonEnabled(Z)V

    .line 94
    const/4 v12, 0x0

    invoke-virtual {v1, v12}, Lcom/actionbarsherlock/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 98
    new-instance v12, Lcom/google/android/gms/ads/InterstitialAd;

    move-object/from16 v0, p0

    invoke-direct {v12, v0}, Lcom/google/android/gms/ads/InterstitialAd;-><init>(Landroid/content/Context;)V

    move-object/from16 v0, p0

    iput-object v12, v0, Lcom/QRBS/activity/StartActivity;->mInterstitialAd:Lcom/google/android/gms/ads/InterstitialAd;

    .line 99
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/QRBS/activity/StartActivity;->mInterstitialAd:Lcom/google/android/gms/ads/InterstitialAd;

    const-string v13, "ca-app-pub-7846213809650520/7044404290"

    invoke-virtual {v12, v13}, Lcom/google/android/gms/ads/InterstitialAd;->setAdUnitId(Ljava/lang/String;)V

    .line 103
    const v12, 0x7f0d0061

    move-object/from16 v0, p0

    invoke-virtual {v0, v12}, Lcom/QRBS/activity/StartActivity;->findViewById(I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Lcom/google/android/gms/ads/AdView;

    move-object/from16 v0, p0

    iput-object v12, v0, Lcom/QRBS/activity/StartActivity;->adView:Lcom/google/android/gms/ads/AdView;

    .line 104
    new-instance v12, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v12}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    invoke-virtual {v12}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v2

    .line 105
    .local v2, "adRequest":Lcom/google/android/gms/ads/AdRequest;
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/QRBS/activity/StartActivity;->adView:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v12, v2}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    .line 106
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/QRBS/activity/StartActivity;->adView:Lcom/google/android/gms/ads/AdView;

    new-instance v13, Lcom/QRBS/activity/StartActivity$1;

    move-object/from16 v0, p0

    invoke-direct {v13, v0}, Lcom/QRBS/activity/StartActivity$1;-><init>(Lcom/QRBS/activity/StartActivity;)V

    invoke-virtual {v12, v13}, Lcom/google/android/gms/ads/AdView;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V

    .line 121
    const v12, 0x1020012

    move-object/from16 v0, p0

    invoke-virtual {v0, v12}, Lcom/QRBS/activity/StartActivity;->findViewById(I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Landroid/widget/TabHost;

    move-object/from16 v0, p0

    iput-object v12, v0, Lcom/QRBS/activity/StartActivity;->mTabHost:Landroid/widget/TabHost;

    .line 122
    const v12, 0x7f0d0062

    move-object/from16 v0, p0

    invoke-virtual {v0, v12}, Lcom/QRBS/activity/StartActivity;->findViewById(I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Landroid/support/v4/view/ViewPager;

    move-object/from16 v0, p0

    iput-object v12, v0, Lcom/QRBS/activity/StartActivity;->mViewPager:Landroid/support/v4/view/ViewPager;

    .line 123
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/QRBS/activity/StartActivity;->mTabHost:Landroid/widget/TabHost;

    invoke-virtual {v12}, Landroid/widget/TabHost;->setup()V

    .line 124
    new-instance v12, Lcom/scannerfire/fragment/TabsAdapter;

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/QRBS/activity/StartActivity;->mTabHost:Landroid/widget/TabHost;

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/QRBS/activity/StartActivity;->mViewPager:Landroid/support/v4/view/ViewPager;

    move-object/from16 v0, p0

    invoke-direct {v12, v0, v13, v14}, Lcom/scannerfire/fragment/TabsAdapter;-><init>(Landroid/support/v4/app/FragmentActivity;Landroid/widget/TabHost;Landroid/support/v4/view/ViewPager;)V

    move-object/from16 v0, p0

    iput-object v12, v0, Lcom/QRBS/activity/StartActivity;->mTabsAdapter:Lcom/scannerfire/fragment/TabsAdapter;

    .line 127
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/QRBS/activity/StartActivity;->mTabHost:Landroid/widget/TabHost;

    const-string v13, "Scan"

    invoke-virtual {v12, v13}, Landroid/widget/TabHost;->newTabSpec(Ljava/lang/String;)Landroid/widget/TabHost$TabSpec;

    move-result-object v5

    .line 128
    .local v5, "spec":Landroid/widget/TabHost$TabSpec;
    invoke-virtual/range {p0 .. p0}, Lcom/QRBS/activity/StartActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v12

    invoke-interface {v12}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v3

    .line 130
    .local v3, "display":Landroid/view/Display;
    invoke-virtual {v3}, Landroid/view/Display;->getWidth()I

    move-result v11

    .line 131
    .local v11, "width":I
    invoke-virtual {v3}, Landroid/view/Display;->getHeight()I

    move-result v4

    .line 133
    .local v4, "height":I
    invoke-static/range {p0 .. p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v12

    const v13, 0x7f030040

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/QRBS/activity/StartActivity;->mTabHost:Landroid/widget/TabHost;

    invoke-virtual {v14}, Landroid/widget/TabHost;->getTabWidget()Landroid/widget/TabWidget;

    move-result-object v14

    const/4 v15, 0x0

    invoke-virtual {v12, v13, v14, v15}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v8

    .line 134
    .local v8, "tabIndicator":Landroid/view/View;
    const v12, 0x7f0d00e4

    invoke-virtual {v8, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Landroid/widget/TextView;

    const v13, 0x7f0800b9

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setText(I)V

    .line 135
    const v12, 0x7f0d00e3

    invoke-virtual {v8, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Landroid/widget/ImageView;

    const v13, 0x7f0200c7

    invoke-virtual {v12, v13}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 136
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/QRBS/activity/StartActivity;->mTabsAdapter:Lcom/scannerfire/fragment/TabsAdapter;

    invoke-virtual {v5, v8}, Landroid/widget/TabHost$TabSpec;->setIndicator(Landroid/view/View;)Landroid/widget/TabHost$TabSpec;

    move-result-object v13

    const-class v14, Lcom/scannerfire/fragment/FragmentProva;

    const/4 v15, 0x0

    const-string v16, "Scan"

    invoke-virtual/range {v12 .. v16}, Lcom/scannerfire/fragment/TabsAdapter;->addTab(Landroid/widget/TabHost$TabSpec;Ljava/lang/Class;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 138
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/QRBS/activity/StartActivity;->mTabHost:Landroid/widget/TabHost;

    const-string v13, "History"

    invoke-virtual {v12, v13}, Landroid/widget/TabHost;->newTabSpec(Ljava/lang/String;)Landroid/widget/TabHost$TabSpec;

    move-result-object v6

    .line 139
    .local v6, "spec2":Landroid/widget/TabHost$TabSpec;
    invoke-static/range {p0 .. p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v12

    const v13, 0x7f030040

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/QRBS/activity/StartActivity;->mTabHost:Landroid/widget/TabHost;

    invoke-virtual {v14}, Landroid/widget/TabHost;->getTabWidget()Landroid/widget/TabWidget;

    move-result-object v14

    const/4 v15, 0x0

    invoke-virtual {v12, v13, v14, v15}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v9

    .line 140
    .local v9, "tabIndicator2":Landroid/view/View;
    const v12, 0x7f0d00e4

    invoke-virtual {v9, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Landroid/widget/TextView;

    const v13, 0x7f0800ba

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setText(I)V

    .line 141
    const v12, 0x7f0d00e3

    invoke-virtual {v9, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Landroid/widget/ImageView;

    const v13, 0x7f0200d1

    invoke-virtual {v12, v13}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 142
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/QRBS/activity/StartActivity;->mTabsAdapter:Lcom/scannerfire/fragment/TabsAdapter;

    invoke-virtual {v6, v9}, Landroid/widget/TabHost$TabSpec;->setIndicator(Landroid/view/View;)Landroid/widget/TabHost$TabSpec;

    move-result-object v13

    const-class v14, Lcom/scannerfire/fragment/FragmentCronology;

    const/4 v15, 0x0

    const-string v16, "History"

    invoke-virtual/range {v12 .. v16}, Lcom/scannerfire/fragment/TabsAdapter;->addTab(Landroid/widget/TabHost$TabSpec;Ljava/lang/Class;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 144
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/QRBS/activity/StartActivity;->mTabHost:Landroid/widget/TabHost;

    const-string v13, "Create"

    invoke-virtual {v12, v13}, Landroid/widget/TabHost;->newTabSpec(Ljava/lang/String;)Landroid/widget/TabHost$TabSpec;

    move-result-object v7

    .line 145
    .local v7, "spec3":Landroid/widget/TabHost$TabSpec;
    invoke-static/range {p0 .. p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v12

    const v13, 0x7f030040

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/QRBS/activity/StartActivity;->mTabHost:Landroid/widget/TabHost;

    invoke-virtual {v14}, Landroid/widget/TabHost;->getTabWidget()Landroid/widget/TabWidget;

    move-result-object v14

    const/4 v15, 0x0

    invoke-virtual {v12, v13, v14, v15}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v10

    .line 146
    .local v10, "tabIndicator3":Landroid/view/View;
    const v12, 0x7f0d00e4

    invoke-virtual {v10, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Landroid/widget/TextView;

    const v13, 0x7f0800bb

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setText(I)V

    .line 147
    const v12, 0x7f0d00e3

    invoke-virtual {v10, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Landroid/widget/ImageView;

    const v13, 0x7f0200ca

    invoke-virtual {v12, v13}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 148
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/QRBS/activity/StartActivity;->mTabsAdapter:Lcom/scannerfire/fragment/TabsAdapter;

    invoke-virtual {v7, v10}, Landroid/widget/TabHost$TabSpec;->setIndicator(Landroid/view/View;)Landroid/widget/TabHost$TabSpec;

    move-result-object v13

    const-class v14, Lcom/scannerfire/fragment/FragmentCrea;

    const/4 v15, 0x0

    const-string v16, "Create"

    invoke-virtual/range {v12 .. v16}, Lcom/scannerfire/fragment/TabsAdapter;->addTab(Landroid/widget/TabHost$TabSpec;Ljava/lang/Class;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 151
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/QRBS/activity/StartActivity;->mTabHost:Landroid/widget/TabHost;

    invoke-virtual {v12}, Landroid/widget/TabHost;->getTabWidget()Landroid/widget/TabWidget;

    move-result-object v12

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Landroid/widget/TabWidget;->getChildAt(I)Landroid/view/View;

    move-result-object v12

    .line 152
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    div-int/lit8 v14, v11, 0x3

    div-int/lit8 v15, v4, 0xa

    .line 151
    invoke-direct {v13, v14, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v12, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 153
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/QRBS/activity/StartActivity;->mTabHost:Landroid/widget/TabHost;

    invoke-virtual {v12}, Landroid/widget/TabHost;->getTabWidget()Landroid/widget/TabWidget;

    move-result-object v12

    const/4 v13, 0x1

    invoke-virtual {v12, v13}, Landroid/widget/TabWidget;->getChildAt(I)Landroid/view/View;

    move-result-object v12

    .line 154
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    div-int/lit8 v14, v11, 0x3

    div-int/lit8 v15, v4, 0xa

    .line 153
    invoke-direct {v13, v14, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v12, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 155
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/QRBS/activity/StartActivity;->mTabHost:Landroid/widget/TabHost;

    invoke-virtual {v12}, Landroid/widget/TabHost;->getTabWidget()Landroid/widget/TabWidget;

    move-result-object v12

    const/4 v13, 0x2

    invoke-virtual {v12, v13}, Landroid/widget/TabWidget;->getChildAt(I)Landroid/view/View;

    move-result-object v12

    .line 156
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    div-int/lit8 v14, v11, 0x3

    div-int/lit8 v15, v4, 0xa

    .line 155
    invoke-direct {v13, v14, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v12, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 164
    if-eqz p1, :cond_0

    .line 165
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/QRBS/activity/StartActivity;->mTabHost:Landroid/widget/TabHost;

    const-string v13, "tab"

    move-object/from16 v0, p1

    invoke-virtual {v0, v13}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Landroid/widget/TabHost;->setCurrentTabByTag(Ljava/lang/String;)V

    .line 167
    :cond_0
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/QRBS/activity/StartActivity;->mTabsAdapter:Lcom/scannerfire/fragment/TabsAdapter;

    const/4 v13, 0x1

    invoke-virtual {v12, v13}, Lcom/scannerfire/fragment/TabsAdapter;->getItem(I)Landroid/support/v4/app/Fragment;

    move-result-object v12

    check-cast v12, Lcom/scannerfire/fragment/FragmentCronology;

    move-object/from16 v0, p0

    iput-object v12, v0, Lcom/QRBS/activity/StartActivity;->fc:Lcom/scannerfire/fragment/FragmentCronology;

    .line 169
    move-object/from16 v0, p0

    iget-boolean v12, v0, Lcom/QRBS/activity/StartActivity;->firstTime:Z

    if-eqz v12, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/QRBS/activity/StartActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v12

    invoke-static {v12}, Lcom/scannerfire/utils/Utils;->getStartScanPref(Landroid/content/Context;)Z

    move-result v12

    if-eqz v12, :cond_1

    .line 170
    const/4 v12, 0x0

    move-object/from16 v0, p0

    iput-boolean v12, v0, Lcom/QRBS/activity/StartActivity;->firstTime:Z

    .line 171
    new-instance v12, Landroid/content/Intent;

    const-class v13, Lcom/QRBS/activity/QrActivity;

    move-object/from16 v0, p0

    invoke-direct {v12, v0, v13}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v12}, Lcom/QRBS/activity/StartActivity;->startActivity(Landroid/content/Intent;)V

    .line 191
    :goto_0
    return-void

    .line 175
    :cond_1
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/QRBS/activity/StartActivity;->mTabHost:Landroid/widget/TabHost;

    new-instance v13, Lcom/QRBS/activity/StartActivity$2;

    move-object/from16 v0, p0

    invoke-direct {v13, v0}, Lcom/QRBS/activity/StartActivity$2;-><init>(Lcom/QRBS/activity/StartActivity;)V

    invoke-virtual {v12, v13}, Landroid/widget/TabHost;->setOnTabChangedListener(Landroid/widget/TabHost$OnTabChangeListener;)V

    goto :goto_0
.end method

.method public onCreateOptionsMenu(Lcom/actionbarsherlock/view/Menu;)Z
    .locals 11
    .param p1, "menu"    # Lcom/actionbarsherlock/view/Menu;

    .prologue
    const v9, 0x7f0d0087

    const/4 v10, 0x0

    const/4 v7, 0x1

    .line 290
    iget-object v8, p0, Lcom/QRBS/activity/StartActivity;->mTabHost:Landroid/widget/TabHost;

    invoke-virtual {v8}, Landroid/widget/TabHost;->getCurrentTab()I

    move-result v1

    .line 291
    .local v1, "i":I
    if-ne v1, v7, :cond_1

    .line 293
    invoke-virtual {p0}, Lcom/QRBS/activity/StartActivity;->getSupportMenuInflater()Lcom/actionbarsherlock/view/MenuInflater;

    move-result-object v7

    const v8, 0x7f0f0001

    invoke-virtual {v7, v8, p1}, Lcom/actionbarsherlock/view/MenuInflater;->inflate(ILcom/actionbarsherlock/view/Menu;)V

    .line 294
    const-string v7, "search"

    invoke-virtual {p0, v7}, Lcom/QRBS/activity/StartActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/SearchManager;

    .line 295
    .local v3, "searchManager":Landroid/app/SearchManager;
    invoke-interface {p1, v9}, Lcom/actionbarsherlock/view/Menu;->findItem(I)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v7

    invoke-interface {v7}, Lcom/actionbarsherlock/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/actionbarsherlock/widget/SearchView;

    .line 296
    .local v4, "searchView":Lcom/actionbarsherlock/widget/SearchView;
    invoke-interface {p1, v9}, Lcom/actionbarsherlock/view/Menu;->findItem(I)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v5

    .line 298
    .local v5, "searchViewItem":Lcom/actionbarsherlock/view/MenuItem;
    invoke-virtual {p0}, Lcom/QRBS/activity/StartActivity;->getComponentName()Landroid/content/ComponentName;

    move-result-object v7

    invoke-virtual {v3, v7}, Landroid/app/SearchManager;->getSearchableInfo(Landroid/content/ComponentName;)Landroid/app/SearchableInfo;

    move-result-object v7

    invoke-virtual {v4, v7}, Lcom/actionbarsherlock/widget/SearchView;->setSearchableInfo(Landroid/app/SearchableInfo;)V

    .line 299
    invoke-virtual {v4, v10}, Lcom/actionbarsherlock/widget/SearchView;->setIconifiedByDefault(Z)V

    .line 301
    new-instance v7, Lcom/QRBS/activity/StartActivity$6;

    invoke-direct {v7, p0}, Lcom/QRBS/activity/StartActivity$6;-><init>(Lcom/QRBS/activity/StartActivity;)V

    invoke-virtual {v4, v7}, Lcom/actionbarsherlock/widget/SearchView;->setOnCloseListener(Lcom/actionbarsherlock/widget/SearchView$OnCloseListener;)V

    .line 312
    new-instance v0, Lcom/QRBS/activity/StartActivity$7;

    invoke-direct {v0, p0}, Lcom/QRBS/activity/StartActivity$7;-><init>(Lcom/QRBS/activity/StartActivity;)V

    .line 330
    .local v0, "expandListener":Lcom/actionbarsherlock/view/MenuItem$OnActionExpandListener;
    invoke-interface {v5, v0}, Lcom/actionbarsherlock/view/MenuItem;->setOnActionExpandListener(Lcom/actionbarsherlock/view/MenuItem$OnActionExpandListener;)Lcom/actionbarsherlock/view/MenuItem;

    .line 333
    new-instance v2, Lcom/QRBS/activity/StartActivity$8;

    invoke-direct {v2, p0}, Lcom/QRBS/activity/StartActivity$8;-><init>(Lcom/QRBS/activity/StartActivity;)V

    .line 354
    .local v2, "queryTextListener":Lcom/actionbarsherlock/widget/SearchView$OnQueryTextListener;
    invoke-virtual {v4, v2}, Lcom/actionbarsherlock/widget/SearchView;->setOnQueryTextListener(Lcom/actionbarsherlock/widget/SearchView$OnQueryTextListener;)V

    .line 356
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->onCreateOptionsMenu(Lcom/actionbarsherlock/view/Menu;)Z

    move-result v7

    .line 368
    .end local v0    # "expandListener":Lcom/actionbarsherlock/view/MenuItem$OnActionExpandListener;
    .end local v2    # "queryTextListener":Lcom/actionbarsherlock/widget/SearchView$OnQueryTextListener;
    .end local v3    # "searchManager":Landroid/app/SearchManager;
    .end local v4    # "searchView":Lcom/actionbarsherlock/widget/SearchView;
    .end local v5    # "searchViewItem":Lcom/actionbarsherlock/view/MenuItem;
    :cond_0
    :goto_0
    return v7

    .line 360
    :cond_1
    invoke-virtual {p0}, Lcom/QRBS/activity/StartActivity;->getSupportMenuInflater()Lcom/actionbarsherlock/view/MenuInflater;

    move-result-object v8

    const/high16 v9, 0x7f0f0000

    invoke-virtual {v8, v9, p1}, Lcom/actionbarsherlock/view/MenuInflater;->inflate(ILcom/actionbarsherlock/view/Menu;)V

    .line 362
    iget-boolean v8, p0, Lcom/QRBS/activity/StartActivity;->flag:Z

    if-eqz v8, :cond_0

    .line 363
    invoke-virtual {p0}, Lcom/QRBS/activity/StartActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v8

    invoke-virtual {v8}, Landroid/support/v4/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/scannerfire/fragment/FragmentCronology;

    .line 364
    .local v6, "thisCron":Lcom/scannerfire/fragment/FragmentCronology;
    invoke-virtual {v6}, Lcom/scannerfire/fragment/FragmentCronology;->getAdapter()Lcom/scannerfire/model/CustomListAdapter;

    move-result-object v8

    invoke-virtual {v8}, Lcom/scannerfire/model/CustomListAdapter;->getFilter()Landroid/widget/Filter;

    move-result-object v8

    const-string v9, ""

    invoke-virtual {v8, v9}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;)V

    .line 365
    iput-boolean v10, p0, Lcom/QRBS/activity/StartActivity;->flag:Z

    goto :goto_0
.end method

.method public onOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z
    .locals 4
    .param p1, "item"    # Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    const/4 v1, 0x1

    .line 415
    const-string v0, ""

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "CLICK ON "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 418
    invoke-virtual {p0}, Lcom/QRBS/activity/StartActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/scannerfire/fragment/FragmentCronology;

    invoke-virtual {v0}, Lcom/scannerfire/fragment/FragmentCronology;->clearCronology()V

    .line 419
    const/4 v0, -0x1

    invoke-static {v0}, Lcom/scannerfire/utils/Utils;->setLastElem(I)V

    .line 421
    invoke-interface {p1}, Lcom/actionbarsherlock/view/MenuItem;->getItemId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 439
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->onOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z

    move-result v0

    :goto_0
    return v0

    .line 424
    :sswitch_0
    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/QRBS/activity/About;

    invoke-direct {v0, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/QRBS/activity/StartActivity;->startActivity(Landroid/content/Intent;)V

    move v0, v1

    .line 425
    goto :goto_0

    .line 427
    :sswitch_1
    invoke-direct {p0}, Lcom/QRBS/activity/StartActivity;->showDeleteDialog()V

    move v0, v1

    .line 428
    goto :goto_0

    .line 430
    :sswitch_2
    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/QRBS/activity/Opzioni;

    invoke-direct {v0, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/QRBS/activity/StartActivity;->startActivity(Landroid/content/Intent;)V

    move v0, v1

    .line 431
    goto :goto_0

    .line 433
    :sswitch_3
    iget-object v0, p0, Lcom/QRBS/activity/StartActivity;->mTabHost:Landroid/widget/TabHost;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/TabHost;->setCurrentTab(I)V

    move v0, v1

    .line 434
    goto :goto_0

    .line 436
    :sswitch_4
    invoke-direct {p0}, Lcom/QRBS/activity/StartActivity;->saveToCsv()V

    move v0, v1

    .line 437
    goto :goto_0

    .line 421
    :sswitch_data_0
    .sparse-switch
        0x102002c -> :sswitch_3
        0x7f0d00ea -> :sswitch_0
        0x7f0d00eb -> :sswitch_2
        0x7f0d00ec -> :sswitch_1
        0x7f0d00ed -> :sswitch_4
    .end sparse-switch
.end method

.method public onResume()V
    .locals 0

    .prologue
    .line 403
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->onResume()V

    .line 410
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "outState"    # Landroid/os/Bundle;

    .prologue
    .line 201
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 202
    if-eqz p1, :cond_0

    .line 203
    const-string v0, "tab"

    iget-object v1, p0, Lcom/QRBS/activity/StartActivity;->mTabHost:Landroid/widget/TabHost;

    invoke-virtual {v1}, Landroid/widget/TabHost;->getCurrentTabTag()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    :cond_0
    return-void
.end method

.method public onStart()V
    .locals 0

    .prologue
    .line 195
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->onStart()V

    .line 197
    return-void
.end method

.method public onTabSelected(Lcom/actionbarsherlock/app/ActionBar$Tab;Landroid/support/v4/app/FragmentTransaction;)V
    .locals 0
    .param p1, "tab"    # Lcom/actionbarsherlock/app/ActionBar$Tab;
    .param p2, "fragmenttransaction"    # Landroid/support/v4/app/FragmentTransaction;

    .prologue
    .line 397
    return-void
.end method
