.class public Lcom/aetn/history/android/historyhere/MainNavigationActivity;
.super Landroid/support/v4/app/FragmentActivity;
.source "MainNavigationActivity.java"

# interfaces
.implements Lcom/aetn/history/android/historyhere/model/InitializationManager$OnInitializationListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aetn/history/android/historyhere/MainNavigationActivity$SearchTask;
    }
.end annotation


# static fields
.field private static final CONNECTION_FAILURE_RESOLUTION_REQUEST:I = 0x2328

.field private static final DEEPLINK:Ljava/lang/String; = "DEEPLINK"

.field public static final MAP_TYPE_FAVORITES:I = 0x2

.field public static final MAP_TYPE_PLACES:I = 0x0

.field public static final MAP_TYPE_TOUR:I = 0x1

.field public static final TAG_BACK_STACK:Ljava/lang/String; = "back_stack"

.field public static final TAG_MAP:Ljava/lang/String; = "map"

.field public static final TAG_MAP_OVERLAY:Ljava/lang/String; = "map_overlay"

.field public static final TAG_MENU:Ljava/lang/String; = "menu"

.field public static fragmentManager:Landroid/support/v4/app/FragmentManager;

.field private static mMapType:I


# instance fields
.field private final TAG:Ljava/lang/String;

.field private currentSearchString:Ljava/lang/String;

.field private deeplinkData:Landroid/net/Uri;

.field private listFragment:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

.field private listOverlayDetailFragment:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

.field private localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

.field private mAnalyticsTourElapsedTime:I

.field private mAnalyticsTourEndTime:J

.field private mAnalyticsTourPoiSelectCount:I

.field private mAnalyticsTourPoiViewedCount:I

.field private mAnalyticsTourStartTime:J

.field private mAnalyticsTourViewedLength:J

.field private mAnalyticsTourViewedName:Ljava/lang/String;

.field private mApp:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

.field public mAppInited:Z

.field private mContext:Landroid/content/Context;

.field public mCurrentLocation:Landroid/location/Location;

.field private mDeepLinkActive:Z

.field private mInitLocationTest:Z

.field public mListDetailActive:Z

.field public mMapDetailActive:Z

.field public mMapInited:Z

.field private mapFragment:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

.field private mapOverlayDetailFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

.field private mapOverlayFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

.field private menuFragment:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

.field private tourDetailFragment:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

.field private tourHomeListFragment:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

.field private updateData:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 96
    const/4 v0, 0x0

    sput v0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mMapType:I

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    const/4 v1, 0x0

    .line 57
    invoke-direct {p0}, Landroid/support/v4/app/FragmentActivity;-><init>()V

    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    .line 86
    iput-boolean v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mMapInited:Z

    .line 87
    iput-boolean v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAppInited:Z

    .line 94
    iput-boolean v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mInitLocationTest:Z

    .line 98
    iput-boolean v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mDeepLinkActive:Z

    .line 99
    iput-boolean v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mMapDetailActive:Z

    .line 100
    iput-boolean v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mListDetailActive:Z

    .line 102
    const/4 v0, 0x1

    iput v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourPoiSelectCount:I

    .line 103
    iput v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourPoiViewedCount:I

    .line 104
    iput-wide v2, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourViewedLength:J

    .line 105
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourViewedName:Ljava/lang/String;

    .line 106
    iput-wide v2, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourStartTime:J

    .line 107
    iput-wide v2, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourEndTime:J

    .line 108
    iput v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourElapsedTime:I

    .line 1002
    return-void
.end method

.method static synthetic access$000(Lcom/aetn/history/android/historyhere/MainNavigationActivity;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    .prologue
    .line 57
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$102(Lcom/aetn/history/android/historyhere/MainNavigationActivity;Z)Z
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/MainNavigationActivity;
    .param p1, "x1"    # Z

    .prologue
    .line 57
    iput-boolean p1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mDeepLinkActive:Z

    return p1
.end method

.method static synthetic access$200(Lcom/aetn/history/android/historyhere/MainNavigationActivity;)Landroid/content/Context;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    .prologue
    .line 57
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$300(Lcom/aetn/history/android/historyhere/MainNavigationActivity;)Lcom/aetn/history/android/historyhere/HistoryHereApplication;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    .prologue
    .line 57
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mApp:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    return-object v0
.end method

.method static synthetic access$400(Lcom/aetn/history/android/historyhere/MainNavigationActivity;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    .prologue
    .line 57
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->currentSearchString:Ljava/lang/String;

    return-object v0
.end method

.method private addFragments()V
    .locals 4

    .prologue
    const v3, 0x7f0a00a2

    .line 567
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v2, "addFragments()"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 569
    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-direct {v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;-><init>()V

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapFragment:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .line 570
    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    invoke-direct {v1}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;-><init>()V

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->listFragment:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    .line 571
    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-direct {v1}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;-><init>()V

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tourHomeListFragment:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    .line 572
    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    invoke-direct {v1}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;-><init>()V

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tourDetailFragment:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    .line 574
    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-direct {v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;-><init>()V

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapOverlayFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    .line 577
    sget-object v1, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->fragmentManager:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 578
    .local v0, "ft":Landroid/support/v4/app/FragmentTransaction;
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapFragment:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    const-string v2, "map"

    invoke-virtual {v0, v3, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 580
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapOverlayFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    const-string v2, "map_overlay"

    invoke-virtual {v0, v3, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 581
    const v1, 0x7f0a00a3

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->listFragment:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 582
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->listFragment:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 583
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapOverlayFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 584
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 586
    return-void
.end method

.method private addMenuFragment()V
    .locals 4

    .prologue
    .line 559
    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    invoke-direct {v1}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;-><init>()V

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->menuFragment:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    .line 560
    sget-object v1, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->fragmentManager:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 561
    .local v0, "ft":Landroid/support/v4/app/FragmentTransaction;
    const v1, 0x7f0a00a5

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->menuFragment:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    const-string v3, "menu"

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 562
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 563
    return-void
.end method

.method private clearBackstack()V
    .locals 3

    .prologue
    .line 963
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 964
    .local v0, "fm":Landroid/support/v4/app/FragmentManager;
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->getBackStackEntryCount()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 965
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->popBackStack()V

    .line 964
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 967
    :cond_0
    return-void
.end method

.method public static getMapType()I
    .locals 1

    .prologue
    .line 925
    sget v0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mMapType:I

    return v0
.end method

.method private initCrashReporting()V
    .locals 4

    .prologue
    .line 1087
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getConfiguration()Lcom/aetn/history/android/historyhere/model/Configuration;

    move-result-object v1

    iget-object v1, v1, Lcom/aetn/history/android/historyhere/model/Configuration;->crittercisms:Lcom/aetn/history/android/historyhere/model/Configuration$Crittercisms;

    iget-object v1, v1, Lcom/aetn/history/android/historyhere/model/Configuration$Crittercisms;->prod:Lcom/aetn/history/android/historyhere/model/Configuration$Values;

    iget-object v0, v1, Lcom/aetn/history/android/historyhere/model/Configuration$Values;->key:Ljava/lang/String;

    .line 1088
    .local v0, "key":Ljava/lang/String;
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "init crittercism: key:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1089
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mApp:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-static {v1, v0}, Lcom/crittercism/app/Crittercism;->initialize(Landroid/content/Context;Ljava/lang/String;)V

    .line 1091
    return-void
.end method

.method private initLocalytics()V
    .locals 3

    .prologue
    .line 452
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "initLocalytics():key:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mApp:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getLocalyticsKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 453
    new-instance v0, Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mApp:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getLocalyticsKey()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/localytics/android/LocalyticsAmpSession;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    .line 454
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    const-string v1, "639943061345"

    invoke-virtual {v0, v1}, Lcom/localytics/android/LocalyticsAmpSession;->registerPush(Ljava/lang/String;)V

    .line 455
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->open()V

    .line 456
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/localytics/android/LocalyticsAmpSession;->handlePushReceived(Landroid/content/Intent;)V

    .line 457
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->upload()V

    .line 458
    return-void
.end method

.method public static isMapTypeFavorites()Z
    .locals 2

    .prologue
    .line 933
    sget v0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mMapType:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static isMapTypePlaces()Z
    .locals 1

    .prologue
    .line 929
    sget v0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mMapType:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static isMapTypeTours()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 937
    sget v1, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mMapType:I

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private restartWithDeeplinkIntent(Landroid/content/Intent;)V
    .locals 9
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 164
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v5, "restartWithDeeplinkIntent():called"

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    new-instance v2, Landroid/content/Intent;

    const-class v4, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-direct {v2, p0, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 166
    .local v2, "mStartActivity":Landroid/content/Intent;
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 167
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 168
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v5, "restartWithDeeplinkIntent(): intent.getData()!=null: call setData() on the intent"

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 171
    :cond_0
    const-string v4, "DEEPLINK"

    invoke-virtual {p1, v4}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 172
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "restartWithDeeplinkIntent(): intent.hasExtra(DEEPLINK): call putExtra() on the intent with: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "DEEPLINK"

    invoke-virtual {p1, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    const-string v4, "DEEPLINK"

    const-string v5, "DEEPLINK"

    invoke-virtual {p1, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 175
    :cond_1
    const v1, 0x1e240

    .line 176
    .local v1, "mPendingIntentId":I
    const/high16 v4, 0x10000000

    invoke-static {p0, v1, v2, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    .line 177
    .local v0, "mPendingIntent":Landroid/app/PendingIntent;
    const-string v4, "alarm"

    invoke-virtual {p0, v4}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/AlarmManager;

    .line 178
    .local v3, "mgr":Landroid/app/AlarmManager;
    const/4 v4, 0x1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const-wide/16 v7, 0x2710

    add-long/2addr v5, v7

    invoke-virtual {v3, v4, v5, v6, v0}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    .line 179
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->forceCloseApp()V

    .line 180
    return-void
.end method

.method public static setMapType(I)V
    .locals 4
    .param p0, "mapType"    # I

    .prologue
    .line 941
    sput p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mMapType:I

    .line 942
    sget-object v2, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->fragmentManager:Landroid/support/v4/app/FragmentManager;

    const-string v3, "map"

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .line 943
    .local v0, "mapFrag":Lcom/aetn/history/android/historyhere/fragment/MapFragment;
    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setMapType()V

    .line 944
    sget-object v2, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->fragmentManager:Landroid/support/v4/app/FragmentManager;

    const-string v3, "map_overlay"

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    .line 945
    .local v1, "overlayFrag":Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;
    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->setMapSettingsMenu()V

    .line 946
    return-void
.end method

.method public static setMapTypePlaces()V
    .locals 1

    .prologue
    .line 950
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->setMapType(I)V

    .line 951
    return-void
.end method

.method public static setMapTypeTours()V
    .locals 1

    .prologue
    .line 954
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->setMapType(I)V

    .line 955
    return-void
.end method


# virtual methods
.method public animateCloseListDetail()V
    .locals 2

    .prologue
    .line 752
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 753
    .local v0, "fm":Landroid/support/v4/app/FragmentManager;
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->popBackStack()V

    .line 754
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mListDetailActive:Z

    .line 755
    return-void
.end method

.method public animateCloseMapDetail()V
    .locals 1

    .prologue
    .line 730
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapOverlayFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->animateCloseDetail()V

    .line 731
    return-void
.end method

.method public animateOpenMapDetail()V
    .locals 1

    .prologue
    .line 759
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapOverlayFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->animateInDetail()V

    .line 760
    return-void
.end method

.method public checkForRateReminder()V
    .locals 8

    .prologue
    .line 850
    invoke-static {p0}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->getShouldShowRateReminder(Landroid/content/Context;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 873
    :cond_0
    :goto_0
    return-void

    .line 851
    :cond_1
    invoke-static {p0}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->getRateReminderDate(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->getDateFromString(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v3

    .line 852
    .local v3, "rateReminderDate":Ljava/util/Date;
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "checkForRateReminder():PreferenceManager.getRateReminderDate(this):"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {p0}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->getRateReminderDate(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 853
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "checkForRateReminder():rateReminderDate:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 854
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    new-instance v6, Ljava/util/Date;

    invoke-direct {v6}, Ljava/util/Date;-><init>()V

    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    sub-long/2addr v4, v6

    const-wide/32 v6, 0x5265c00

    div-long/2addr v4, v6

    long-to-int v0, v4

    .line 855
    .local v0, "daysApart":I
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "checkForRateReminder():the days are apart:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 856
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v4

    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getConfiguration()Lcom/aetn/history/android/historyhere/model/Configuration;

    move-result-object v5

    iget-object v5, v5, Lcom/aetn/history/android/historyhere/model/Configuration;->rateAppPrompting:Lcom/aetn/history/android/historyhere/model/Configuration$RateViewPrompting;

    iget v5, v5, Lcom/aetn/history/android/historyhere/model/Configuration$RateViewPrompting;->daysBetweenPrompts:I

    if-lt v4, v5, :cond_0

    .line 858
    invoke-static {p0}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->getRateReminderCount(Landroid/content/Context;)I

    move-result v2

    .line 859
    .local v2, "rateCount":I
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "checkForRateReminder():check rate reminder: rateCount:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 860
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getConfiguration()Lcom/aetn/history/android/historyhere/model/Configuration;

    move-result-object v4

    iget-object v4, v4, Lcom/aetn/history/android/historyhere/model/Configuration;->rateAppPrompting:Lcom/aetn/history/android/historyhere/model/Configuration$RateViewPrompting;

    iget v4, v4, Lcom/aetn/history/android/historyhere/model/Configuration$RateViewPrompting;->POIViewCount:I

    if-lt v2, v4, :cond_2

    .line 861
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v5, "checkForRateReminder(): show Dialog: reset count"

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 863
    new-instance v1, Lcom/aetn/history/android/historyhere/dialogs/RateMeDialogFragment;

    invoke-direct {v1}, Lcom/aetn/history/android/historyhere/dialogs/RateMeDialogFragment;-><init>()V

    .line 864
    .local v1, "dialog":Landroid/support/v4/app/DialogFragment;
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v4

    const-string v5, "RateMeDialogFragment"

    invoke-virtual {v1, v4, v5}, Landroid/support/v4/app/DialogFragment;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    .line 865
    const/4 v4, 0x0

    invoke-static {p0, v4}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->setRateReminderCount(Landroid/content/Context;I)V

    .line 866
    invoke-static {}, Lcom/aetn/history/android/historyhere/utils/Utils;->getTodaysDateString()Ljava/lang/String;

    move-result-object v4

    invoke-static {p0, v4}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->setRateReminderDate(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 868
    .end local v1    # "dialog":Landroid/support/v4/app/DialogFragment;
    :cond_2
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v5, "checkForRateReminder(): dont show Dialog: add count"

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 869
    add-int/lit8 v2, v2, 0x1

    .line 870
    invoke-static {p0, v2}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->setRateReminderCount(Landroid/content/Context;I)V

    goto/16 :goto_0
.end method

.method public doMapSearch(Ljava/lang/String;)V
    .locals 5
    .param p1, "searchString"    # Ljava/lang/String;

    .prologue
    .line 906
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->currentSearchString:Ljava/lang/String;

    .line 907
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mApp:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->isOnline()Z

    move-result v1

    if-nez v1, :cond_0

    .line 908
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v2, "searchButtonOnClickListener -- NOT online: "

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 909
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mApp:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->manageConnectionNotAvailable()V

    .line 918
    :goto_0
    return-void

    .line 911
    :cond_0
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mApp:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mContext:Landroid/content/Context;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0d0066

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->showMessageBox(Landroid/content/Context;Ljava/lang/String;)V

    .line 912
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v2, "searchButtonOnClickListener -- IS online: "

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 913
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 914
    .local v0, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v1, "search_term"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 915
    const-string v1, "home:search"

    invoke-virtual {p0, v1, v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tagLocalyticsEvent(Ljava/lang/String;Ljava/util/Map;)V

    .line 916
    new-instance v1, Lcom/aetn/history/android/historyhere/MainNavigationActivity$SearchTask;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity$SearchTask;-><init>(Lcom/aetn/history/android/historyhere/MainNavigationActivity;)V

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v1, v2}, Lcom/aetn/history/android/historyhere/MainNavigationActivity$SearchTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0
.end method

.method public executeDeeplink(Ljava/lang/String;)V
    .locals 15
    .param p1, "deeplinkStr"    # Ljava/lang/String;

    .prologue
    .line 339
    const-string v0, "poi"

    .line 340
    .local v0, "TAG_POI":Ljava/lang/String;
    move-object/from16 v11, p1

    .line 341
    .local v11, "uriToString":Ljava/lang/String;
    const-string v12, "//"

    invoke-virtual {v11, v12}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v12

    add-int/lit8 v12, v12, 0x2

    invoke-virtual {v11, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v10

    .line 342
    .local v10, "uriPath":Ljava/lang/String;
    iget-object v12, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "executeDeeplink(): Deeplink data--: uriPath: "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 343
    const-string v12, "/"

    invoke-virtual {v10, v12}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 346
    .local v6, "segments":[Ljava/lang/String;
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    array-length v12, v6

    if-ge v1, v12, :cond_0

    .line 347
    iget-object v12, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "onCreate(): Deeplink data segment: "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    aget-object v14, v6, v1

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 346
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 350
    :cond_0
    array-length v12, v6

    const/4 v13, 0x1

    if-ne v12, v13, :cond_2

    .line 353
    iget-object v12, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v13, "handleDeeplink(): Deeplink go to tour homepage "

    invoke-static {v12, v13}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 355
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->showTourHomeList()V

    .line 356
    iget-object v12, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->menuFragment:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    if-eqz v12, :cond_1

    .line 357
    iget-object v12, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->menuFragment:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    const/4 v13, 0x1

    iput-boolean v13, v12, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->hasNotSelectedPlaces:Z

    .line 444
    :cond_1
    :goto_1
    return-void

    .line 358
    :cond_2
    array-length v12, v6

    const/4 v13, 0x2

    if-ne v12, v13, :cond_6

    .line 359
    iget-object v12, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v13, "handleDeeplink(): Deeplink go to tour detail view "

    invoke-static {v12, v13}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 363
    const/4 v4, 0x0

    .line 364
    .local v4, "pd":Lcom/aetn/history/android/historyhere/model/POIDetail;
    const/4 v12, 0x1

    aget-object v2, v6, v12

    .line 365
    .local v2, "id":Ljava/lang/String;
    iget-object v12, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mContext:Landroid/content/Context;

    invoke-static {v12}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v12

    invoke-virtual {v12}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getAllToursList()Ljava/util/ArrayList;

    move-result-object v9

    .line 367
    .local v9, "tours":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_4

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 368
    .local v3, "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_3

    .line 370
    move-object v4, v3

    .line 375
    .end local v3    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_4
    if-eqz v4, :cond_5

    .line 376
    const/4 v12, 0x1

    invoke-static {v12}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->setMapType(I)V

    .line 377
    invoke-virtual {p0, v4}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->showTourDetail(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 378
    iget-object v12, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->menuFragment:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    if-eqz v12, :cond_1

    .line 379
    iget-object v12, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->menuFragment:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    const/4 v13, 0x1

    iput-boolean v13, v12, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->hasNotSelectedPlaces:Z

    goto :goto_1

    .line 381
    :cond_5
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->showTourHomeList()V

    .line 382
    iget-object v12, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->menuFragment:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    if-eqz v12, :cond_1

    .line 383
    iget-object v12, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->menuFragment:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    const/4 v13, 0x1

    iput-boolean v13, v12, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->hasNotSelectedPlaces:Z

    goto :goto_1

    .line 385
    .end local v2    # "id":Ljava/lang/String;
    .end local v4    # "pd":Lcom/aetn/history/android/historyhere/model/POIDetail;
    .end local v9    # "tours":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    :cond_6
    array-length v12, v6

    const/4 v13, 0x3

    if-ne v12, v13, :cond_9

    .line 386
    const/4 v12, 0x1

    aget-object v12, v6, v12

    const-string v13, "poi"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_7

    .line 388
    iget-object v12, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v13, "handleDeeplink(): Deeplink go to map and highlight poi "

    invoke-static {v12, v13}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 389
    const/4 v12, 0x2

    aget-object v2, v6, v12

    .line 391
    .restart local v2    # "id":Ljava/lang/String;
    invoke-static {p0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v12

    invoke-virtual {v12, v2}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getPoiById(Ljava/lang/String;)Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v3

    .line 394
    .restart local v3    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    if-eqz v3, :cond_1

    .line 395
    iget-object v12, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "handleDeeplink(): Deeplink go to map and highlight poi: "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 396
    const/4 v12, 0x0

    invoke-static {v12}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->setMapType(I)V

    .line 397
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->showMap()V

    .line 398
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getMapFragment()Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    move-result-object v12

    invoke-virtual {v12, v3}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->displayTargetedPOI(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 399
    iget-object v12, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->menuFragment:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    if-eqz v12, :cond_1

    .line 400
    iget-object v12, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->menuFragment:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    const/4 v13, 0x1

    iput-boolean v13, v12, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->hasNotSelectedPlaces:Z

    goto/16 :goto_1

    .line 407
    .end local v2    # "id":Ljava/lang/String;
    .end local v3    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_7
    const/4 v12, 0x1

    iput-boolean v12, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mDeepLinkActive:Z

    .line 409
    iget-object v12, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v13, "handleDeeplink(): Deeplink go to tour map and show poi "

    invoke-static {v12, v13}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 411
    const/4 v12, 0x1

    aget-object v8, v6, v12

    .line 412
    .local v8, "tourId":Ljava/lang/String;
    const/4 v12, 0x2

    aget-object v5, v6, v12

    .line 414
    .local v5, "poiId":Ljava/lang/String;
    invoke-static {p0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v12

    invoke-virtual {v12, v8}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getTourItemFromToursListById(Ljava/lang/String;)Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v7

    .line 415
    .local v7, "tourDetail":Lcom/aetn/history/android/historyhere/model/POIDetail;
    if-eqz v7, :cond_8

    .line 416
    invoke-static {p0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v12

    new-instance v13, Lcom/aetn/history/android/historyhere/MainNavigationActivity$2;

    invoke-direct {v13, p0, v5}, Lcom/aetn/history/android/historyhere/MainNavigationActivity$2;-><init>(Lcom/aetn/history/android/historyhere/MainNavigationActivity;Ljava/lang/String;)V

    invoke-virtual {v12, v13}, Lcom/aetn/history/android/historyhere/model/PoiManager;->setOnTourDetailLoadedListener(Lcom/aetn/history/android/historyhere/model/PoiManager$TourDetailLoadedListener;)V

    .line 431
    invoke-virtual {p0, v7}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->showTourDetail(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 432
    iget-object v12, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->menuFragment:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    if-eqz v12, :cond_1

    .line 433
    iget-object v12, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->menuFragment:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    const/4 v13, 0x1

    iput-boolean v13, v12, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->hasNotSelectedPlaces:Z

    goto/16 :goto_1

    .line 436
    :cond_8
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->showTourHomeList()V

    .line 437
    iget-object v12, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->menuFragment:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    if-eqz v12, :cond_1

    .line 438
    iget-object v12, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->menuFragment:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    const/4 v13, 0x1

    iput-boolean v13, v12, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->hasNotSelectedPlaces:Z

    goto/16 :goto_1

    .line 442
    .end local v5    # "poiId":Ljava/lang/String;
    .end local v7    # "tourDetail":Lcom/aetn/history/android/historyhere/model/POIDetail;
    .end local v8    # "tourId":Ljava/lang/String;
    :cond_9
    iget-object v12, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v13, "handleDeeplink(): Deeplink -- no conditions were met "

    invoke-static {v12, v13}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1
.end method

.method public forceCloseApp()V
    .locals 1

    .prologue
    .line 184
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    .line 185
    return-void
.end method

.method public getMapFragment()Lcom/aetn/history/android/historyhere/fragment/MapFragment;
    .locals 1

    .prologue
    .line 893
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapFragment:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    return-object v0
.end method

.method public getMapOverlayFragment()Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;
    .locals 1

    .prologue
    .line 897
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapOverlayFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    return-object v0
.end method

.method public goToLocationSettings()V
    .locals 2

    .prologue
    .line 994
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.settings.LOCATION_SOURCE_SETTINGS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 995
    .local v0, "intent":Landroid/content/Intent;
    invoke-virtual {p0, v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->startActivity(Landroid/content/Intent;)V

    .line 996
    return-void
.end method

.method public handleDeeplink()V
    .locals 5

    .prologue
    .line 314
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v2, "handleDeeplink(): "

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 317
    .local v0, "intent":Landroid/content/Intent;
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->showMenu()V

    .line 318
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    new-instance v2, Lcom/aetn/history/android/historyhere/MainNavigationActivity$1;

    invoke-direct {v2, p0, v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity$1;-><init>(Lcom/aetn/history/android/historyhere/MainNavigationActivity;Landroid/content/Intent;)V

    const-wide/16 v3, 0x3e8

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 335
    return-void
.end method

.method public handleUpdateIfRequired()Z
    .locals 12

    .prologue
    const/4 v11, 0x1

    const/4 v10, 0x0

    .line 262
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getConfiguration()Lcom/aetn/history/android/historyhere/model/Configuration;

    move-result-object v7

    iget-object v7, v7, Lcom/aetn/history/android/historyhere/model/Configuration;->minimumVersion:Ljava/lang/String;

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 263
    .local v2, "minVersionNumber":I
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getConfiguration()Lcom/aetn/history/android/historyhere/model/Configuration;

    move-result-object v7

    iget-object v7, v7, Lcom/aetn/history/android/historyhere/model/Configuration;->notificationVersion:Ljava/lang/String;

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    .line 264
    .local v3, "notificationVersionNumber":I
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getConfiguration()Lcom/aetn/history/android/historyhere/model/Configuration;

    move-result-object v7

    iget-boolean v4, v7, Lcom/aetn/history/android/historyhere/model/Configuration;->requiredToNotify:Z

    .line 265
    .local v4, "requiredToNotify":Z
    invoke-static {p0}, Lcom/aetn/history/android/historyhere/utils/Utils;->getVersionCode(Landroid/content/Context;)I

    move-result v5

    .line 266
    .local v5, "thisVersionCode":I
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "handleUpdateIfRequired(): thisVersionCode:"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 267
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "handleUpdateIfRequired(): minVersionNumber:"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "handleUpdateIfRequired(): notificationVersionNumber:"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 269
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "handleUpdateIfRequired(): requiredToNotify:"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    if-eqz v4, :cond_0

    if-lt v5, v3, :cond_2

    .line 271
    :cond_0
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v8, "handleUpdateIfRequired():not required to notify or we have a newer version - return false:"

    invoke-static {v7, v8}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    if-lt v5, v3, :cond_1

    .line 274
    invoke-static {p0, v11}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->setUpdateReminderTF(Landroid/content/Context;Z)V

    .line 308
    :cond_1
    :goto_0
    return v10

    .line 277
    :cond_2
    if-ge v5, v2, :cond_3

    .line 278
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v8, "handleUpdateIfRequired(): we are older than the notification version- force update"

    invoke-static {v7, v8}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    new-instance v1, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;

    invoke-direct {v1}, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;-><init>()V

    .line 281
    .local v1, "dialog":Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;
    iput-boolean v11, v1, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;->requiredUpdate:Z

    .line 282
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v7

    const-string v8, "UpdateDialogFragment"

    invoke-virtual {v1, v7, v8}, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    goto :goto_0

    .line 285
    .end local v1    # "dialog":Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;
    :cond_3
    invoke-static {p0}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->getUpdateReminderCount(Landroid/content/Context;)I

    move-result v6

    .line 286
    .local v6, "updateCount":I
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "handleUpdateIfRequired(): suggest update : PreferenceManager.getUpdateReminderTF(this): "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-static {p0}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->getUpdateReminderTF(Landroid/content/Context;)Z

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "handleUpdateIfRequired(): suggest update : PreferenceManager.getUpdateReminderCount(this): "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getConfiguration()Lcom/aetn/history/android/historyhere/model/Configuration;

    move-result-object v7

    iget v0, v7, Lcom/aetn/history/android/historyhere/model/Configuration;->daysBetweenUpdateReminder:I

    .line 289
    .local v0, "dayBetweenPrompts":I
    invoke-static {p0}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->getUpdateReminderTF(Landroid/content/Context;)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 290
    if-lt v6, v11, :cond_4

    if-ge v6, v0, :cond_4

    .line 292
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v8, "handleUpdateIfRequired(): user wants to be reminded but the count is not up - increment"

    invoke-static {v7, v8}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    add-int/lit8 v6, v6, 0x1

    .line 294
    invoke-static {p0, v6}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->setUpdateReminderCount(Landroid/content/Context;I)V

    goto :goto_0

    .line 296
    :cond_4
    if-ge v6, v0, :cond_5

    if-nez v6, :cond_1

    .line 297
    :cond_5
    invoke-static {p0}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->incrementUpdateReminderCount(Landroid/content/Context;)V

    .line 298
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v8, "handleUpdateIfRequired(): user wants to be reminded and the count is up "

    invoke-static {v7, v8}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 299
    new-instance v1, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;

    invoke-direct {v1}, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;-><init>()V

    .line 300
    .restart local v1    # "dialog":Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;
    iput-boolean v10, v1, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;->requiredUpdate:Z

    .line 301
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v7

    const-string v8, "UpdateDialogFragment"

    invoke-virtual {v1, v7, v8}, Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 304
    .end local v1    # "dialog":Lcom/aetn/history/android/historyhere/dialogs/UpdateDialogFragment;
    :cond_6
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v8, "handleUpdateIfRequired(): suggest update : doesnt want to be reminded: "

    invoke-static {v7, v8}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method public hideDetailPager()V
    .locals 3

    .prologue
    .line 820
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapOverlayFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    iget-boolean v1, v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mIsDetailVisible:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapOverlayFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    if-eqz v1, :cond_0

    .line 821
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapOverlayFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->animateHideDetailPager()V

    .line 823
    sget-object v1, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->fragmentManager:Landroid/support/v4/app/FragmentManager;

    const-string v2, "map"

    invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .line 824
    .local v0, "mapFrag":Lcom/aetn/history/android/historyhere/fragment/MapFragment;
    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->handleOnDetailHide()V

    .line 826
    .end local v0    # "mapFrag":Lcom/aetn/history/android/historyhere/fragment/MapFragment;
    :cond_0
    return-void
.end method

.method public hideMapOverlay()V
    .locals 1

    .prologue
    .line 836
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapOverlayFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    if-eqz v0, :cond_0

    .line 837
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapOverlayFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->hideDetailPager()V

    .line 838
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapOverlayFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->hideMenu()V

    .line 839
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapOverlayFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->hideSettingsMenu()V

    .line 841
    :cond_0
    return-void
.end method

.method public hidePlacesList()V
    .locals 5

    .prologue
    .line 685
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v4, "showPlacesList"

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 686
    sget-object v3, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->fragmentManager:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v3}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    .line 687
    .local v1, "ft":Landroid/support/v4/app/FragmentTransaction;
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->listFragment:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    invoke-virtual {v1, v3}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 688
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 689
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypePlaces()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 690
    const-string v3, "HH:Places:List"

    invoke-virtual {p0, v3}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tagLocalyticsScreen(Ljava/lang/String;)V

    .line 699
    :cond_0
    :goto_0
    return-void

    .line 691
    :cond_1
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypeTours()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 693
    invoke-static {p0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getCurrentTourDetailPOI()Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v0

    .line 694
    .local v0, "currTourDetail":Lcom/aetn/history/android/historyhere/model/POI;
    const-string v3, "HH:Tours:*:List"

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/POI;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->getFormattedLocalyticsTag(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 695
    .local v2, "tag":Ljava/lang/String;
    invoke-virtual {p0, v2}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tagLocalyticsScreen(Ljava/lang/String;)V

    goto :goto_0

    .line 696
    .end local v0    # "currTourDetail":Lcom/aetn/history/android/historyhere/model/POI;
    .end local v2    # "tag":Ljava/lang/String;
    :cond_2
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypeFavorites()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 697
    const-string v3, "HH:Favorites:List"

    invoke-virtual {p0, v3}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tagLocalyticsScreen(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public initMapToUsersLocation(Landroid/location/Location;)V
    .locals 1
    .param p1, "loc"    # Landroid/location/Location;

    .prologue
    .line 764
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->showMap()V

    .line 765
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getMapFragment()Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->initToUsersLocation(Landroid/location/Location;)V

    .line 766
    return-void
.end method

.method public localyticsIncrementTourPoiSelectCount()V
    .locals 2

    .prologue
    .line 500
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v1, "localyticsIncrementTourPoiSelectCount: "

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 501
    iget v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourPoiSelectCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourPoiSelectCount:I

    .line 502
    return-void
.end method

.method public localyticsIncrementTourPoiViewedCount()V
    .locals 2

    .prologue
    .line 505
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v1, "localyticsIncrementTourPoiViewedCount: "

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 506
    iget v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourPoiViewedCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourPoiViewedCount:I

    .line 507
    return-void
.end method

.method public localyticsResetTourData()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const-wide/16 v1, 0x0

    .line 483
    const/4 v0, 0x1

    iput v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourPoiSelectCount:I

    .line 484
    iput v3, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourPoiViewedCount:I

    .line 485
    iput-wide v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourViewedLength:J

    .line 486
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourViewedName:Ljava/lang/String;

    .line 487
    iput-wide v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourStartTime:J

    .line 488
    iput-wide v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourEndTime:J

    .line 489
    iput v3, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourElapsedTime:I

    .line 490
    return-void
.end method

.method public localyticsSetTourViewedName(Ljava/lang/String;)V
    .locals 3
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 493
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "localyticsSetTourViewedName: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 494
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourViewedName:Ljava/lang/String;

    .line 496
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->localyticsTagTourTimerStart()V

    .line 497
    return-void
.end method

.method public localyticsTagTourTimerStart()V
    .locals 2

    .prologue
    .line 512
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v1, "localyticsTagTourTimerStart: "

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 514
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourStartTime:J

    .line 515
    return-void
.end method

.method public localyticsTagTourTimerStop()V
    .locals 4

    .prologue
    .line 518
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v1, "localyticsTagTourTimerStop: "

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 520
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourEndTime:J

    .line 521
    iget-wide v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourEndTime:J

    iget-wide v2, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourStartTime:J

    sub-long/2addr v0, v2

    long-to-int v0, v0

    div-int/lit16 v0, v0, 0x3e8

    iput v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourElapsedTime:I

    .line 522
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "localyticsTagTourTimerStop: elapsed time:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourElapsedTime:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 523
    return-void
.end method

.method public localyticsTagTourViewedEvent()V
    .locals 4

    .prologue
    .line 530
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->localyticsTagTourTimerStop()V

    .line 531
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "localyticsTagTourViewedEvent:mAnalyticsTourViewedName: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourViewedName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 532
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "localyticsTagTourViewedEvent: mAnalyticsTourPoiViewedCount:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourPoiViewedCount:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 533
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "localyticsTagTourViewedEvent: mAnalyticsTourPoiSelectCount:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourPoiSelectCount:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 534
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "localyticsTagTourViewedEvent: mAnalyticsTourElapsedTime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourElapsedTime:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 536
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourViewedName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 537
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v2, "localyticsTagTourViewedEvent: there is data so send the event"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 538
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 539
    .local v0, "data":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v1, "Tour Name"

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourViewedName:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 540
    const-string v1, "POI Views"

    iget v2, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourPoiViewedCount:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 541
    const-string v1, "POI Swipes"

    iget v2, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourPoiSelectCount:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 542
    const-string v1, "Time Spent"

    iget v2, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAnalyticsTourElapsedTime:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 543
    const-string v1, "Tour Stats"

    invoke-virtual {p0, v1, v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tagLocalyticsEvent(Ljava/lang/String;Ljava/util/Map;)V

    .line 544
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->localyticsResetTourData()V

    .line 549
    .end local v0    # "data":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    :goto_0
    return-void

    .line 546
    :cond_0
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v2, "localyticsTagTourViewedEvent: there is no data so DO NOT send the event"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public manageDetailNotLoaded(Ljava/lang/String;)V
    .locals 3
    .param p1, "msg"    # Ljava/lang/String;

    .prologue
    .line 1132
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v2, "manageDetailNotLoaded()"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1133
    new-instance v0, Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;

    invoke-direct {v0}, Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;-><init>()V

    .line 1134
    .local v0, "dialog":Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0d0039

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;->setTitleText(Ljava/lang/String;Ljava/lang/String;)V

    .line 1135
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    const-string v2, "manageDetailNotLoaded"

    invoke-virtual {v0, v1, v2}, Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    .line 1136
    return-void
.end method

.method public onBackPressed()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 141
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->getBackStackEntryCount()I

    move-result v0

    .line 142
    .local v0, "backStackEntryCount":I
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onBackPressed:backStackEntryCount:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    if-nez v0, :cond_0

    .line 144
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v2, "onBackPressed: 0 so force close"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->forceCloseApp()V

    .line 159
    :goto_0
    return-void

    .line 149
    :cond_0
    iget-boolean v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mMapDetailActive:Z

    if-eqz v1, :cond_1

    .line 150
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->animateCloseMapDetail()V

    .line 151
    iput-boolean v4, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mMapDetailActive:Z

    goto :goto_0

    .line 152
    :cond_1
    iget-boolean v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mListDetailActive:Z

    if-eqz v1, :cond_2

    .line 153
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->animateCloseListDetail()V

    .line 154
    iput-boolean v4, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mListDetailActive:Z

    goto :goto_0

    .line 156
    :cond_2
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v2, "onBackPressed: not 0 - so call super"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onBackPressed()V

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "state"    # Landroid/os/Bundle;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    .line 115
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v2, "onCreate():"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 118
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    sput-object v1, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->fragmentManager:Landroid/support/v4/app/FragmentManager;

    .line 119
    const v1, 0x7f03003c

    invoke-virtual {p0, v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->setContentView(I)V

    .line 120
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getApplication()Landroid/app/Application;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mApp:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    .line 121
    iput-object p0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mContext:Landroid/content/Context;

    .line 125
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 126
    .local v0, "intent":Landroid/content/Intent;
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->deeplinkData:Landroid/net/Uri;

    .line 127
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onCreate(): intent: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onCreate(): intent.getAction(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onCreate(): intent.getExtras(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onCreate():intent.hasExtra(DEEPLINK): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "DEEPLINK"

    invoke-virtual {v0, v3}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onCreate(): intent.getData(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    invoke-virtual {p0, v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->setIntent(Landroid/content/Intent;)V

    .line 134
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->addMenuFragment()V

    .line 135
    invoke-static {p0}, Lcom/aetn/history/android/historyhere/model/InitializationManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/InitializationManager;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/aetn/history/android/historyhere/model/InitializationManager;->setOnInitializationListener(Lcom/aetn/history/android/historyhere/model/InitializationManager$OnInitializationListener;)V

    .line 136
    invoke-static {p0}, Lcom/aetn/history/android/historyhere/model/InitializationManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/InitializationManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/InitializationManager;->init()V

    .line 137
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 251
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v1, "onDestroy()"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAppInited:Z

    .line 253
    invoke-static {p0}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/LocationManager;->turnOffLocationServices()V

    .line 254
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onDestroy()V

    .line 255
    return-void
.end method

.method public onFailedToGetLatestPlayServices()V
    .locals 2

    .prologue
    .line 1113
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v1, "onFailedToGetLatestPlayServices(): failed to load the playservices"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1115
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->finish()V

    .line 1116
    return-void
.end method

.method public onInitialization()V
    .locals 2

    .prologue
    .line 1097
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v1, "onInitialization(): LOADED = go ahead"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1099
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAppInited:Z

    if-nez v0, :cond_0

    .line 1100
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v1, "onInitialization(): not inited: go ahead"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1101
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mAppInited:Z

    .line 1102
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->addFragments()V

    .line 1104
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->menuFragment:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->init()V

    .line 1105
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->initLocalytics()V

    .line 1106
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->initCrashReporting()V

    .line 1110
    :goto_0
    return-void

    .line 1108
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v1, "onInitialization(): this fired twice so DO NOT go ahead"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 3
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 189
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onNewIntent(): intent: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onNewIntent(): intent.getAction(): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onNewIntent(): intent.getExtras(): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onNewIntent():intent.hasExtra(DEEPLINK): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "DEEPLINK"

    invoke-virtual {p1, v2}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onNewIntent(): intent.getData(): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 195
    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->setIntent(Landroid/content/Intent;)V

    .line 196
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->handleDeeplink()V

    .line 197
    return-void
.end method

.method public onNoNetworkConnection()V
    .locals 5

    .prologue
    .line 1119
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v2, "onNoNetworkConnection(): close"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1120
    new-instance v0, Lcom/aetn/history/android/historyhere/dialogs/NoInternetOnStartDialogFragment;

    invoke-direct {v0}, Lcom/aetn/history/android/historyhere/dialogs/NoInternetOnStartDialogFragment;-><init>()V

    .line 1121
    .local v0, "dialog":Lcom/aetn/history/android/historyhere/dialogs/NoInternetOnStartDialogFragment;
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    const-string v2, "NoInternetOnStartDialogFragment"

    invoke-virtual {v0, v1, v2}, Lcom/aetn/history/android/historyhere/dialogs/NoInternetOnStartDialogFragment;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    .line 1122
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    new-instance v2, Lcom/aetn/history/android/historyhere/MainNavigationActivity$3;

    invoke-direct {v2, p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity$3;-><init>(Lcom/aetn/history/android/historyhere/MainNavigationActivity;)V

    const-wide/16 v3, 0x1388

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1128
    return-void
.end method

.method public onPause()V
    .locals 2

    .prologue
    .line 239
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v1, "onPause()"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 240
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->localyticsTagTourViewedEvent()V

    .line 241
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    if-eqz v0, :cond_0

    .line 242
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->detach()V

    .line 243
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->close()V

    .line 244
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->upload()V

    .line 246
    :cond_0
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onPause()V

    .line 247
    return-void
.end method

.method public onResume()V
    .locals 3

    .prologue
    .line 217
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v2, "onResume()"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 218
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onResume()V

    .line 219
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    if-eqz v1, :cond_0

    .line 220
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v1}, Lcom/localytics/android/LocalyticsAmpSession;->open()V

    .line 221
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/localytics/android/LocalyticsAmpSession;->handlePushReceived(Landroid/content/Intent;)V

    .line 223
    :cond_0
    invoke-static {p0}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/LocationManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/LocationManager;->turnOnLocationServices()V

    .line 226
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypeTours()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 227
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getCurrentTourDetailPOI()Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v0

    .line 228
    .local v0, "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->localyticsSetTourViewedName(Ljava/lang/String;)V

    .line 230
    .end local v0    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_1
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapOverlayFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    if-eqz v1, :cond_2

    .line 231
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapOverlayFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->setMapSettingsMenu()V

    .line 235
    :cond_2
    return-void
.end method

.method protected onStart()V
    .locals 2

    .prologue
    .line 201
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v1, "onStart()"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 202
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onStart()V

    .line 203
    return-void
.end method

.method protected onStop()V
    .locals 2

    .prologue
    .line 207
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v1, "onStop()"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 211
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onStop()V

    .line 212
    return-void
.end method

.method public removeTourFragment()V
    .locals 2

    .prologue
    .line 604
    sget-object v1, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->fragmentManager:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 605
    .local v0, "ft":Landroid/support/v4/app/FragmentTransaction;
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tourDetailFragment:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->isAdded()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 606
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tourDetailFragment:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 608
    :cond_0
    const-string v1, "back_stack"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->addToBackStack(Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 609
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 610
    return-void
.end method

.method public showDetailPager(Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    .locals 3
    .param p1, "poi"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 808
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapOverlayFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    iget-boolean v1, v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mIsDetailVisible:Z

    if-nez v1, :cond_0

    .line 809
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapOverlayFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-virtual {v1, p1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->setTargetPoi(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 810
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapOverlayFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->showDetailPager()V

    .line 811
    sget-object v1, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->fragmentManager:Landroid/support/v4/app/FragmentManager;

    const-string v2, "map"

    invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .line 812
    .local v0, "mapFrag":Lcom/aetn/history/android/historyhere/fragment/MapFragment;
    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->handleOnDetailShow()V

    .line 816
    .end local v0    # "mapFrag":Lcom/aetn/history/android/historyhere/fragment/MapFragment;
    :goto_0
    return-void

    .line 814
    :cond_0
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapOverlayFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-virtual {v1, p1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->setPoiInList(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    goto :goto_0
.end method

.method public showFavorites()V
    .locals 1

    .prologue
    .line 878
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->setMapType(I)V

    .line 879
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->showMap()V

    .line 880
    return-void
.end method

.method public showInitLocationServicesOrSearchDialog()V
    .locals 3

    .prologue
    .line 980
    const v1, 0x7f0d007f

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog;->newInstance(I)Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog;

    move-result-object v0

    .line 982
    .local v0, "newFragment":Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog;
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v1

    const-string v2, "dialog"

    invoke-virtual {v0, v1, v2}, Lcom/aetn/history/android/historyhere/dialogs/InitLocationServicesOrSearchDialog;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    .line 983
    return-void
.end method

.method public showInitialLocationServicesDialog()V
    .locals 3

    .prologue
    .line 974
    const v1, 0x7f0d0082

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/dialogs/InitialLocationServicesDialog;->newInstance(I)Lcom/aetn/history/android/historyhere/dialogs/InitialLocationServicesDialog;

    move-result-object v0

    .line 976
    .local v0, "newFragment":Lcom/aetn/history/android/historyhere/dialogs/InitialLocationServicesDialog;
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v1

    const-string v2, "dialog"

    invoke-virtual {v0, v1, v2}, Lcom/aetn/history/android/historyhere/dialogs/InitialLocationServicesDialog;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    .line 977
    return-void
.end method

.method public showListDetail(Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    .locals 3
    .param p1, "poi"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 735
    sget-object v1, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->fragmentManager:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 736
    .local v0, "ft":Landroid/support/v4/app/FragmentTransaction;
    invoke-static {p1}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->newInstance(Lcom/aetn/history/android/historyhere/model/POIDetail;)Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    move-result-object v1

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->listOverlayDetailFragment:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    .line 738
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->menuFragment:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->isVisible()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 739
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->menuFragment:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 741
    :cond_0
    const v1, 0x7f0a00a3

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->listOverlayDetailFragment:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 742
    const-string v1, "back_stack"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->addToBackStack(Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 743
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 746
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->checkForRateReminder()V

    .line 747
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mListDetailActive:Z

    .line 748
    return-void
.end method

.method public showMap()V
    .locals 5

    .prologue
    .line 615
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getMapFragment()Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->showUI()V

    .line 616
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypePlaces()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypeFavorites()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 617
    :cond_0
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getMapFragment()Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->refreshPlacesMap()V

    .line 618
    :cond_1
    sget-object v3, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->fragmentManager:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v3}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    .line 619
    .local v1, "ft":Landroid/support/v4/app/FragmentTransaction;
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tourHomeListFragment:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->isAdded()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 620
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tourHomeListFragment:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-virtual {v1, v3}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 622
    :cond_2
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapOverlayDetailFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    if-eqz v3, :cond_3

    .line 623
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapOverlayDetailFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->isAdded()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 624
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapOverlayDetailFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    invoke-virtual {v1, v3}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 627
    :cond_3
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->listOverlayDetailFragment:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    if-eqz v3, :cond_4

    .line 628
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->listOverlayDetailFragment:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->isAdded()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 629
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->listOverlayDetailFragment:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    invoke-virtual {v1, v3}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 632
    :cond_4
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->menuFragment:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->isVisible()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 633
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->menuFragment:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    invoke-virtual {v1, v3}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 635
    :cond_5
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tourDetailFragment:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->isAdded()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 636
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tourDetailFragment:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    invoke-virtual {v1, v3}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 638
    :cond_6
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapOverlayFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->isHidden()Z

    move-result v3

    if-eqz v3, :cond_7

    .line 639
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapOverlayFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-virtual {v1, v3}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 641
    :cond_7
    const-string v3, "back_stack"

    invoke-virtual {v1, v3}, Landroid/support/v4/app/FragmentTransaction;->addToBackStack(Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 642
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 643
    const/4 v3, 0x1

    iput-boolean v3, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mMapInited:Z

    .line 644
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapOverlayFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->setUI()V

    .line 645
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->hidePlacesList()V

    .line 646
    const-string v2, ""

    .line 647
    .local v2, "tag":Ljava/lang/String;
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypePlaces()Z

    move-result v3

    if-eqz v3, :cond_9

    .line 648
    const-string v2, "HH:Places:Map"

    .line 658
    :cond_8
    :goto_0
    invoke-virtual {p0, v2}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tagLocalyticsScreen(Ljava/lang/String;)V

    .line 659
    return-void

    .line 649
    :cond_9
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypeTours()Z

    move-result v3

    if-eqz v3, :cond_a

    .line 651
    invoke-static {p0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getCurrentTourDetailPOI()Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v0

    .line 652
    .local v0, "currTourDetail":Lcom/aetn/history/android/historyhere/model/POI;
    const-string v3, "HH:Tours:*:Map"

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/POI;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->getFormattedLocalyticsTag(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 653
    goto :goto_0

    .end local v0    # "currTourDetail":Lcom/aetn/history/android/historyhere/model/POI;
    :cond_a
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypeFavorites()Z

    move-result v3

    if-eqz v3, :cond_8

    .line 654
    const-string v2, "HH:Favorites:Map"

    goto :goto_0
.end method

.method public showMap(Landroid/location/Location;)V
    .locals 1
    .param p1, "loc"    # Landroid/location/Location;

    .prologue
    .line 662
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->showMap()V

    .line 663
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getMapFragment()Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->zoomToMapLocation(Landroid/location/Location;)V

    .line 664
    return-void
.end method

.method public showMap(Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    .locals 3
    .param p1, "poi"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 773
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->showMap()V

    .line 774
    sget-object v1, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->fragmentManager:Landroid/support/v4/app/FragmentManager;

    const-string v2, "map"

    invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .line 775
    .local v0, "mapFrag":Lcom/aetn/history/android/historyhere/fragment/MapFragment;
    invoke-virtual {v0, p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->displayPOI(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 776
    return-void
.end method

.method public showMapOverlay()V
    .locals 1

    .prologue
    .line 829
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapOverlayFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    if-eqz v0, :cond_0

    .line 830
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapOverlayFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->showMenu()V

    .line 831
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapOverlayFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->showSettingsMenu()V

    .line 833
    :cond_0
    return-void
.end method

.method public showMapSearch()V
    .locals 1

    .prologue
    .line 779
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->setMapTypePlaces()V

    .line 780
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->showMap()V

    .line 781
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getMapFragment()Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->showSearch()V

    .line 782
    return-void
.end method

.method public showMenu()V
    .locals 2

    .prologue
    .line 592
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->clearBackstack()V

    .line 593
    sget-object v1, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->fragmentManager:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 594
    .local v0, "ft":Landroid/support/v4/app/FragmentTransaction;
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->menuFragment:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->isHidden()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 595
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->menuFragment:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 597
    :cond_0
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 598
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapFragment:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->clearSelectedMarkerIcon()V

    .line 599
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->hideDetailPager()V

    .line 600
    const-string v1, "HH:Home"

    invoke-virtual {p0, v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tagLocalyticsScreen(Ljava/lang/String;)V

    .line 601
    return-void
.end method

.method public showMore()V
    .locals 2

    .prologue
    .line 885
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->setMapTypePlaces()V

    .line 886
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/aetn/history/android/historyhere/view/MoreActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 887
    .local v0, "aboutIntent":Landroid/content/Intent;
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 888
    const/high16 v1, 0x10000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 889
    invoke-virtual {p0, v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->startActivity(Landroid/content/Intent;)V

    .line 890
    return-void
.end method

.method public showNotInUSDialog()V
    .locals 4

    .prologue
    .line 986
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0d0045

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 987
    .local v1, "msg":Ljava/lang/String;
    new-instance v0, Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;

    invoke-direct {v0}, Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;-><init>()V

    .line 988
    .local v0, "dialog":Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;
    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;->setTitleText(Ljava/lang/String;Ljava/lang/String;)V

    .line 989
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0d0013

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;->setOKBtnText(Ljava/lang/String;)V

    .line 990
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    const-string v3, "GenericDialogFragment"

    invoke-virtual {v0, v2, v3}, Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    .line 991
    return-void
.end method

.method public showPlacesList()V
    .locals 5

    .prologue
    .line 667
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v4, "showPlacesList"

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 668
    sget-object v3, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->fragmentManager:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v3}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    .line 669
    .local v1, "ft":Landroid/support/v4/app/FragmentTransaction;
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->listFragment:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    invoke-virtual {v1, v3}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 670
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->listFragment:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->loadCurrentData()V

    .line 671
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 672
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypePlaces()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 673
    const-string v3, "HH:Places:List"

    invoke-virtual {p0, v3}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tagLocalyticsScreen(Ljava/lang/String;)V

    .line 682
    :cond_0
    :goto_0
    return-void

    .line 674
    :cond_1
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypeTours()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 676
    invoke-static {p0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getCurrentTourDetailPOI()Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v0

    .line 677
    .local v0, "currTourDetail":Lcom/aetn/history/android/historyhere/model/POI;
    const-string v3, "HH:Tours:*:List"

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/POI;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->getFormattedLocalyticsTag(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 678
    .local v2, "tag":Ljava/lang/String;
    invoke-virtual {p0, v2}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tagLocalyticsScreen(Ljava/lang/String;)V

    goto :goto_0

    .line 679
    .end local v0    # "currTourDetail":Lcom/aetn/history/android/historyhere/model/POI;
    .end local v2    # "tag":Ljava/lang/String;
    :cond_2
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypeFavorites()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 680
    const-string v3, "HH:Favorites:List"

    invoke-virtual {p0, v3}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tagLocalyticsScreen(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public showSurpriseMePoi(Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    .locals 4
    .param p1, "poi"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    const/4 v3, 0x1

    .line 789
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->setMapTypePlaces()V

    .line 790
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->showMap()V

    .line 791
    sget-object v1, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->fragmentManager:Landroid/support/v4/app/FragmentManager;

    const-string v2, "map"

    invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .line 792
    .local v0, "mapFrag":Lcom/aetn/history/android/historyhere/fragment/MapFragment;
    invoke-virtual {v0, p1, v3, v3}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->showSurpriseMePoi(Lcom/aetn/history/android/historyhere/model/POIDetail;ZZ)V

    .line 793
    return-void
.end method

.method public showTourDetail(Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    .locals 4
    .param p1, "poi"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 717
    sget-object v1, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->fragmentManager:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 718
    .local v0, "ft":Landroid/support/v4/app/FragmentTransaction;
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->menuFragment:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->isVisible()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 719
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->menuFragment:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 721
    :cond_0
    invoke-static {p1}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->newInstance(Lcom/aetn/history/android/historyhere/model/POIDetail;)Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    move-result-object v1

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tourDetailFragment:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    .line 722
    const v1, 0x7f0a00a4

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tourDetailFragment:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    const-string v3, "tourdetail"

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 723
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getMapFragment()Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->hideUI()V

    .line 724
    const-string v1, "back_stack"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->addToBackStack(Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 725
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 726
    return-void
.end method

.method public showTourHomeList()V
    .locals 3

    .prologue
    .line 702
    const/4 v1, 0x1

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->setMapType(I)V

    .line 703
    sget-object v1, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->fragmentManager:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 704
    .local v0, "ft":Landroid/support/v4/app/FragmentTransaction;
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->menuFragment:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->isVisible()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 705
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->menuFragment:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 707
    :cond_0
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tourHomeListFragment:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->isAdded()Z

    move-result v1

    if-nez v1, :cond_1

    .line 708
    const v1, 0x7f0a00a3

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tourHomeListFragment:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 710
    :cond_1
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getMapFragment()Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->hideUI()V

    .line 711
    const-string v1, "back_stack"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->addToBackStack(Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 712
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 713
    const-string v1, "HH:Tours:List"

    invoke-virtual {p0, v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tagLocalyticsScreen(Ljava/lang/String;)V

    .line 714
    return-void
.end method

.method public showTourInMap(Ljava/lang/String;)V
    .locals 3
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 798
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    const-string v2, "showTourInMap(id)"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 799
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->showMap()V

    .line 800
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mMapInited:Z

    .line 801
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getMapFragment()Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->showCurrentTourInMap(Ljava/lang/String;)V

    .line 802
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mapOverlayFragment:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->showTourHeader()V

    .line 803
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getCurrentTourDetailPOI()Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v0

    .line 804
    .local v0, "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->localyticsSetTourViewedName(Ljava/lang/String;)V

    .line 805
    return-void
.end method

.method public tagLocalyticsEvent(Ljava/lang/String;Ljava/util/Map;)V
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
    .line 468
    .local p2, "extras":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    if-nez p2, :cond_0

    .line 469
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

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

    .line 470
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0, p1}, Lcom/localytics/android/LocalyticsAmpSession;->tagEvent(Ljava/lang/String;)V

    .line 475
    :goto_0
    return-void

    .line 472
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "tagLocalyticsEvent():"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " | extras: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 473
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0, p1, p2}, Lcom/localytics/android/LocalyticsAmpSession;->tagEvent(Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_0
.end method

.method public tagLocalyticsScreen(Ljava/lang/String;)V
    .locals 3
    .param p1, "tag"    # Ljava/lang/String;

    .prologue
    .line 461
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "tagLocalyticsScreen():"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 462
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->open()V

    .line 463
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0, p1}, Lcom/localytics/android/LocalyticsAmpSession;->tagScreen(Ljava/lang/String;)V

    .line 464
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->upload()V

    .line 465
    return-void
.end method
