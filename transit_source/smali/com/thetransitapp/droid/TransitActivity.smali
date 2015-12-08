.class public Lcom/thetransitapp/droid/TransitActivity;
.super Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;
.source "TransitActivity.java"

# interfaces
.implements Lcom/google/android/gms/location/LocationListener;
.implements Lcom/actionbarsherlock/app/ActionBar$OnNavigationListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/thetransitapp/droid/TransitActivity$TransitScreen;
    }
.end annotation


# static fields
.field private static synthetic $SWITCH_TABLE$com$thetransitapp$droid$TransitActivity$TransitScreen:[I = null

.field public static final LENGTH_SYSTEM_PREF_KEY:Ljava/lang/String; = "useImperialSystem"

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private connectionCallbacks:Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;

.field private connectionFailedListener:Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;

.field private container:Landroid/widget/LinearLayout;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f05003a
    .end annotation
.end field

.field private databaseHelper:Lcom/thetransitapp/droid/data/TransitDatabaseHelper;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field

.field private errorView:Lcom/thetransitapp/droid/widget/ErrorView;
    .annotation runtime Lroboguice/inject/InjectFragment;
        value = 0x7f050039
    .end annotation
.end field

.field private isClosing:Z

.field private lastLocation:Landroid/location/Location;

.field private locationClient:Lcom/google/android/gms/location/LocationClient;

.field private locationManager:Landroid/location/LocationManager;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field

.field private map:Lcom/google/android/gms/maps/GoogleMap;

.field private popoverView:Lcom/thetransitapp/droid/widget/PopoverView;

.field private preferences:Landroid/content/SharedPreferences;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field

.field private routeScreen:Lcom/thetransitapp/droid/RoutesScreen;

.field private routeViewController:Lcom/thetransitapp/droid/controller/RouteViewController;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field

.field private screenList:Landroid/widget/ArrayAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/widget/ArrayAdapter",
            "<",
            "Ljava/lang/CharSequence;",
            ">;"
        }
    .end annotation
.end field

.field private searchLocationMenuItem:Lcom/actionbarsherlock/view/MenuItem;

.field private statsManager:Lcom/thetransitapp/droid/model/stats/StatsManager;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field


# direct methods
.method static synthetic $SWITCH_TABLE$com$thetransitapp$droid$TransitActivity$TransitScreen()[I
    .locals 3

    .prologue
    .line 66
    sget-object v0, Lcom/thetransitapp/droid/TransitActivity;->$SWITCH_TABLE$com$thetransitapp$droid$TransitActivity$TransitScreen:[I

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->values()[Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ABOUT_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_8

    :goto_1
    :try_start_1
    sget-object v1, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ITINERARY_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_7

    :goto_2
    :try_start_2
    sget-object v1, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->LEGAL_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ordinal()I

    move-result v1

    const/16 v2, 0x8

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_6

    :goto_3
    :try_start_3
    sget-object v1, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->LOCATION_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_5

    :goto_4
    :try_start_4
    sget-object v1, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->NEARBY_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :goto_5
    :try_start_5
    sget-object v1, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->OPTION_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_3

    :goto_6
    :try_start_6
    sget-object v1, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ROUTING_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_2

    :goto_7
    :try_start_7
    sget-object v1, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ROUTING_SCREEN_DETAILS:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ordinal()I

    move-result v1

    const/16 v2, 0x9

    aput v2, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_1

    :goto_8
    :try_start_8
    sget-object v1, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->SCHEDULE_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_0

    :goto_9
    sput-object v0, Lcom/thetransitapp/droid/TransitActivity;->$SWITCH_TABLE$com$thetransitapp$droid$TransitActivity$TransitScreen:[I

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_9

    :catch_1
    move-exception v1

    goto :goto_8

    :catch_2
    move-exception v1

    goto :goto_7

    :catch_3
    move-exception v1

    goto :goto_6

    :catch_4
    move-exception v1

    goto :goto_5

    :catch_5
    move-exception v1

    goto :goto_4

    :catch_6
    move-exception v1

    goto :goto_3

    :catch_7
    move-exception v1

    goto :goto_2

    :catch_8
    move-exception v1

    goto :goto_1
.end method

.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 69
    const-class v0, Lcom/thetransitapp/droid/TransitActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/thetransitapp/droid/TransitActivity;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 66
    invoke-direct {p0}, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;-><init>()V

    .line 98
    new-instance v0, Lcom/thetransitapp/droid/RoutesScreen;

    invoke-direct {v0}, Lcom/thetransitapp/droid/RoutesScreen;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->routeScreen:Lcom/thetransitapp/droid/RoutesScreen;

    .line 100
    new-instance v0, Lcom/thetransitapp/droid/TransitActivity$1;

    invoke-direct {v0, p0}, Lcom/thetransitapp/droid/TransitActivity$1;-><init>(Lcom/thetransitapp/droid/TransitActivity;)V

    iput-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->connectionCallbacks:Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;

    .line 115
    new-instance v0, Lcom/thetransitapp/droid/TransitActivity$2;

    invoke-direct {v0, p0}, Lcom/thetransitapp/droid/TransitActivity$2;-><init>(Lcom/thetransitapp/droid/TransitActivity;)V

    iput-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->connectionFailedListener:Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;

    .line 66
    return-void
.end method

.method static synthetic access$0(Lcom/thetransitapp/droid/TransitActivity;)Lcom/google/android/gms/location/LocationClient;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->locationClient:Lcom/google/android/gms/location/LocationClient;

    return-object v0
.end method

.method static synthetic access$1(Lcom/thetransitapp/droid/TransitActivity;)Lcom/google/android/gms/location/LocationRequest;
    .locals 1

    .prologue
    .line 220
    invoke-direct {p0}, Lcom/thetransitapp/droid/TransitActivity;->getLocationRequest()Lcom/google/android/gms/location/LocationRequest;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$2(Lcom/thetransitapp/droid/TransitActivity;)Lcom/thetransitapp/droid/RoutesScreen;
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->routeScreen:Lcom/thetransitapp/droid/RoutesScreen;

    return-object v0
.end method

.method static synthetic access$3()Ljava/lang/String;
    .locals 1

    .prologue
    .line 69
    sget-object v0, Lcom/thetransitapp/droid/TransitActivity;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$5(Lcom/thetransitapp/droid/TransitActivity;Landroid/support/v4/app/Fragment;Lcom/thetransitapp/droid/TransitActivity$TransitScreen;Z)V
    .locals 0

    .prologue
    .line 515
    invoke-direct {p0, p1, p2, p3}, Lcom/thetransitapp/droid/TransitActivity;->updateScreen(Landroid/support/v4/app/Fragment;Lcom/thetransitapp/droid/TransitActivity$TransitScreen;Z)V

    return-void
.end method

.method private getLocationRequest()Lcom/google/android/gms/location/LocationRequest;
    .locals 3

    .prologue
    .line 221
    invoke-static {}, Lcom/google/android/gms/location/LocationRequest;->create()Lcom/google/android/gms/location/LocationRequest;

    move-result-object v0

    .line 222
    .local v0, "locationRequest":Lcom/google/android/gms/location/LocationRequest;
    const-wide/16 v1, 0x1d4c

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest;->setInterval(J)Lcom/google/android/gms/location/LocationRequest;

    move-result-object v1

    const/16 v2, 0x64

    invoke-virtual {v1, v2}, Lcom/google/android/gms/location/LocationRequest;->setPriority(I)Lcom/google/android/gms/location/LocationRequest;

    .line 223
    const/high16 v1, 0x43160000    # 150.0f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/LocationRequest;->setSmallestDisplacement(F)Lcom/google/android/gms/location/LocationRequest;

    .line 224
    return-object v0
.end method

.method private setUpMapIfNeeded()V
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v5, 0x0

    .line 566
    iget-object v3, p0, Lcom/thetransitapp/droid/TransitActivity;->map:Lcom/google/android/gms/maps/GoogleMap;

    if-nez v3, :cond_0

    .line 567
    invoke-virtual {p0}, Lcom/thetransitapp/droid/TransitActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v3

    const v4, 0x7f050038

    invoke-virtual {v3, v4}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/maps/SupportMapFragment;

    invoke-virtual {v3}, Lcom/google/android/gms/maps/SupportMapFragment;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v3

    iput-object v3, p0, Lcom/thetransitapp/droid/TransitActivity;->map:Lcom/google/android/gms/maps/GoogleMap;

    .line 569
    iget-object v3, p0, Lcom/thetransitapp/droid/TransitActivity;->map:Lcom/google/android/gms/maps/GoogleMap;

    if-eqz v3, :cond_1

    .line 570
    iget-object v3, p0, Lcom/thetransitapp/droid/TransitActivity;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v3}, Lcom/google/android/gms/maps/GoogleMap;->getUiSettings()Lcom/google/android/gms/maps/UiSettings;

    move-result-object v3

    invoke-virtual {v3, v5}, Lcom/google/android/gms/maps/UiSettings;->setZoomControlsEnabled(Z)V

    .line 571
    iget-object v3, p0, Lcom/thetransitapp/droid/TransitActivity;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v3}, Lcom/google/android/gms/maps/GoogleMap;->getUiSettings()Lcom/google/android/gms/maps/UiSettings;

    move-result-object v3

    invoke-virtual {v3, v5}, Lcom/google/android/gms/maps/UiSettings;->setMyLocationButtonEnabled(Z)V

    .line 572
    iget-object v3, p0, Lcom/thetransitapp/droid/TransitActivity;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v3}, Lcom/google/android/gms/maps/GoogleMap;->getUiSettings()Lcom/google/android/gms/maps/UiSettings;

    move-result-object v3

    invoke-virtual {v3, v5}, Lcom/google/android/gms/maps/UiSettings;->setRotateGesturesEnabled(Z)V

    .line 574
    iget-object v3, p0, Lcom/thetransitapp/droid/TransitActivity;->map:Lcom/google/android/gms/maps/GoogleMap;

    new-instance v4, Lcom/thetransitapp/droid/ui/TransitInfoWindow;

    invoke-direct {v4, p0}, Lcom/thetransitapp/droid/ui/TransitInfoWindow;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v3, v4}, Lcom/google/android/gms/maps/GoogleMap;->setInfoWindowAdapter(Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;)V

    .line 576
    iget-object v3, p0, Lcom/thetransitapp/droid/TransitActivity;->locationClient:Lcom/google/android/gms/location/LocationClient;

    if-eqz v3, :cond_0

    .line 577
    invoke-virtual {p0}, Lcom/thetransitapp/droid/TransitActivity;->getLastLocation()Landroid/location/Location;

    move-result-object v0

    .line 579
    .local v0, "location":Landroid/location/Location;
    if-eqz v0, :cond_0

    .line 580
    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v5

    invoke-direct {v1, v3, v4, v5, v6}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 581
    .local v1, "position":Lcom/google/android/gms/maps/model/LatLng;
    new-instance v3, Lcom/google/android/gms/maps/model/CameraPosition;

    const/high16 v4, 0x41800000    # 16.0f

    invoke-direct {v3, v1, v4, v7, v7}, Lcom/google/android/gms/maps/model/CameraPosition;-><init>(Lcom/google/android/gms/maps/model/LatLng;FFF)V

    invoke-static {v3}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newCameraPosition(Lcom/google/android/gms/maps/model/CameraPosition;)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v2

    .line 584
    .local v2, "update":Lcom/google/android/gms/maps/CameraUpdate;
    iget-object v3, p0, Lcom/thetransitapp/droid/TransitActivity;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v3, v2}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 592
    .end local v0    # "location":Landroid/location/Location;
    .end local v1    # "position":Lcom/google/android/gms/maps/model/LatLng;
    .end local v2    # "update":Lcom/google/android/gms/maps/CameraUpdate;
    :cond_0
    :goto_0
    return-void

    .line 588
    :cond_1
    invoke-static {p0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v3

    if-eqz v3, :cond_0

    .line 589
    iget-object v3, p0, Lcom/thetransitapp/droid/TransitActivity;->container:Landroid/widget/LinearLayout;

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0
.end method

.method private updateScreen(Landroid/support/v4/app/Fragment;Lcom/thetransitapp/droid/TransitActivity$TransitScreen;Z)V
    .locals 3
    .param p1, "fragment"    # Landroid/support/v4/app/Fragment;
    .param p2, "screen"    # Lcom/thetransitapp/droid/TransitActivity$TransitScreen;
    .param p3, "addToBackStack"    # Z

    .prologue
    .line 516
    if-eqz p1, :cond_1

    .line 517
    invoke-virtual {p0}, Lcom/thetransitapp/droid/TransitActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 518
    .local v0, "transaction":Landroid/support/v4/app/FragmentTransaction;
    const v1, 0x7f05003a

    invoke-virtual {p2}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, p1, v2}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 520
    if-eqz p3, :cond_0

    .line 521
    invoke-virtual {p2}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->addToBackStack(Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 524
    :cond_0
    const/16 v1, 0x1003

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->setTransition(I)Landroid/support/v4/app/FragmentTransaction;

    .line 525
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 527
    .end local v0    # "transaction":Landroid/support/v4/app/FragmentTransaction;
    :cond_1
    return-void
.end method


# virtual methods
.method public displayError(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;)V
    .locals 2
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "message"    # Ljava/lang/String;
    .param p3, "button"    # Ljava/lang/String;
    .param p4, "listener"    # Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;

    .prologue
    .line 360
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->errorView:Lcom/thetransitapp/droid/widget/ErrorView;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/thetransitapp/droid/widget/ErrorView;->displayError(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;)V

    .line 361
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->container:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 362
    return-void
.end method

.method public getDisplayedScreen()Lcom/thetransitapp/droid/TransitActivity$TransitScreen;
    .locals 6

    .prologue
    .line 530
    invoke-super {p0}, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v4

    .line 531
    .local v4, "manager":Landroid/support/v4/app/FragmentManager;
    invoke-virtual {v4}, Landroid/support/v4/app/FragmentManager;->getBackStackEntryCount()I

    move-result v0

    .line 533
    .local v0, "count":I
    if-lez v0, :cond_3

    .line 534
    add-int/lit8 v3, v0, -0x1

    .local v3, "i":I
    :goto_0
    if-gez v3, :cond_1

    .line 548
    .end local v3    # "i":I
    :cond_0
    sget-object v5, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->NEARBY_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    :goto_1
    return-object v5

    .line 535
    .restart local v3    # "i":I
    :cond_1
    invoke-virtual {v4, v3}, Landroid/support/v4/app/FragmentManager;->getBackStackEntryAt(I)Landroid/support/v4/app/FragmentManager$BackStackEntry;

    move-result-object v1

    .line 537
    .local v1, "entry":Landroid/support/v4/app/FragmentManager$BackStackEntry;
    invoke-interface {v1}, Landroid/support/v4/app/FragmentManager$BackStackEntry;->getName()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 538
    invoke-interface {v1}, Landroid/support/v4/app/FragmentManager$BackStackEntry;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->valueOf(Ljava/lang/String;)Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    move-result-object v5

    goto :goto_1

    .line 534
    :cond_2
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    .line 542
    .end local v1    # "entry":Landroid/support/v4/app/FragmentManager$BackStackEntry;
    .end local v3    # "i":I
    :cond_3
    sget-object v5, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ROUTING_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v5}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v2

    .line 543
    .local v2, "fragment":Landroid/support/v4/app/Fragment;
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/support/v4/app/Fragment;->isInLayout()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 544
    sget-object v5, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ROUTING_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    goto :goto_1
.end method

.method public getLastLocation()Landroid/location/Location;
    .locals 1

    .prologue
    .line 228
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->lastLocation:Landroid/location/Location;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->locationClient:Lcom/google/android/gms/location/LocationClient;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->locationClient:Lcom/google/android/gms/location/LocationClient;

    invoke-virtual {v0}, Lcom/google/android/gms/location/LocationClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 229
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->locationClient:Lcom/google/android/gms/location/LocationClient;

    invoke-virtual {v0}, Lcom/google/android/gms/location/LocationClient;->getLastLocation()Landroid/location/Location;

    move-result-object v0

    .line 232
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->lastLocation:Landroid/location/Location;

    goto :goto_0
.end method

.method public getMap()Lcom/google/android/gms/maps/GoogleMap;
    .locals 1

    .prologue
    .line 252
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->map:Lcom/google/android/gms/maps/GoogleMap;

    return-object v0
.end method

.method public getRealLocation()Landroid/location/Location;
    .locals 1

    .prologue
    .line 236
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->locationClient:Lcom/google/android/gms/location/LocationClient;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->locationClient:Lcom/google/android/gms/location/LocationClient;

    invoke-virtual {v0}, Lcom/google/android/gms/location/LocationClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 237
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->locationClient:Lcom/google/android/gms/location/LocationClient;

    invoke-virtual {v0}, Lcom/google/android/gms/location/LocationClient;->getLastLocation()Landroid/location/Location;

    move-result-object v0

    .line 240
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hideError()V
    .locals 2

    .prologue
    .line 365
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->errorView:Lcom/thetransitapp/droid/widget/ErrorView;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/ErrorView;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 366
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->errorView:Lcom/thetransitapp/droid/widget/ErrorView;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/ErrorView;->hideError()V

    .line 367
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->container:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 369
    :cond_0
    return-void
.end method

.method public hidePopover(Z)V
    .locals 1
    .param p1, "animated"    # Z

    .prologue
    .line 383
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->popoverView:Lcom/thetransitapp/droid/widget/PopoverView;

    if-eqz v0, :cond_0

    .line 384
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->popoverView:Lcom/thetransitapp/droid/widget/PopoverView;

    invoke-virtual {v0, p1}, Lcom/thetransitapp/droid/widget/PopoverView;->dissmissPopover(Z)V

    .line 386
    :cond_0
    return-void
.end method

.method public isCurrentLocation()Z
    .locals 1

    .prologue
    .line 244
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->lastLocation:Landroid/location/Location;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isDebuggable()Z
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 552
    const/4 v1, 0x0

    .line 554
    .local v1, "debuggable":Z
    invoke-super {p0}, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 557
    .local v2, "pm":Landroid/content/pm/PackageManager;
    :try_start_0
    invoke-super {p0}, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v2, v4, v5}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    .line 558
    .local v0, "appinfo":Landroid/content/pm/ApplicationInfo;
    iget v4, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 v4, v4, 0x2

    iput v4, v0, Landroid/content/pm/ApplicationInfo;->flags:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v4, :cond_0

    const/4 v1, 0x1

    .line 562
    .end local v0    # "appinfo":Landroid/content/pm/ApplicationInfo;
    :goto_0
    return v1

    .restart local v0    # "appinfo":Landroid/content/pm/ApplicationInfo;
    :cond_0
    move v1, v3

    .line 558
    goto :goto_0

    .line 559
    .end local v0    # "appinfo":Landroid/content/pm/ApplicationInfo;
    :catch_0
    move-exception v3

    goto :goto_0
.end method

.method public isLocationServiceAvailable()Z
    .locals 1

    .prologue
    .line 248
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->locationClient:Lcom/google/android/gms/location/LocationClient;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->locationClient:Lcom/google/android/gms/location/LocationClient;

    invoke-virtual {v0}, Lcom/google/android/gms/location/LocationClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->locationClient:Lcom/google/android/gms/location/LocationClient;

    invoke-virtual {v0}, Lcom/google/android/gms/location/LocationClient;->isConnecting()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 5
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    const/4 v1, 0x1

    .line 257
    invoke-super {p0, p1, p2, p3}, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 259
    invoke-static {}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->values()[Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    move-result-object v2

    array-length v2, v2

    if-ge p1, v2, :cond_0

    .line 260
    invoke-static {}, Lcom/thetransitapp/droid/TransitActivity;->$SWITCH_TABLE$com$thetransitapp$droid$TransitActivity$TransitScreen()[I

    move-result-object v2

    invoke-static {}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->values()[Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    move-result-object v3

    aget-object v3, v3, p1

    invoke-virtual {v3}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    .line 298
    :cond_0
    :goto_0
    return-void

    .line 262
    :pswitch_0
    iget-object v2, p0, Lcom/thetransitapp/droid/TransitActivity;->routeScreen:Lcom/thetransitapp/droid/RoutesScreen;

    if-eqz v2, :cond_1

    .line 263
    iget-object v2, p0, Lcom/thetransitapp/droid/TransitActivity;->routeScreen:Lcom/thetransitapp/droid/RoutesScreen;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/RoutesScreen;->clearError()V

    .line 266
    :cond_1
    const/4 v2, 0x2

    if-ne p2, v2, :cond_4

    .line 268
    const/4 v2, 0x0

    iput-object v2, p0, Lcom/thetransitapp/droid/TransitActivity;->lastLocation:Landroid/location/Location;

    .line 280
    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/thetransitapp/droid/TransitActivity;->getDisplayedScreen()Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    move-result-object v2

    sget-object v3, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->LOCATION_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    if-ne v2, v3, :cond_5

    .line 281
    invoke-virtual {p0}, Lcom/thetransitapp/droid/TransitActivity;->onBackPressed()V

    .line 286
    :cond_3
    :goto_2
    iget-object v2, p0, Lcom/thetransitapp/droid/TransitActivity;->statsManager:Lcom/thetransitapp/droid/model/stats/StatsManager;

    if-eqz v2, :cond_0

    .line 287
    iget-object v2, p0, Lcom/thetransitapp/droid/TransitActivity;->statsManager:Lcom/thetransitapp/droid/model/stats/StatsManager;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/stats/StatsManager;->endSession()V

    .line 288
    iget-object v2, p0, Lcom/thetransitapp/droid/TransitActivity;->statsManager:Lcom/thetransitapp/droid/model/stats/StatsManager;

    invoke-virtual {p0}, Lcom/thetransitapp/droid/TransitActivity;->getLastLocation()Landroid/location/Location;

    move-result-object v3

    iget-object v4, p0, Lcom/thetransitapp/droid/TransitActivity;->lastLocation:Landroid/location/Location;

    if-eqz v4, :cond_6

    :goto_3
    invoke-virtual {v2, v3, v1}, Lcom/thetransitapp/droid/model/stats/StatsManager;->startSessionWithLocation(Landroid/location/Location;Z)V

    goto :goto_0

    .line 270
    :cond_4
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "place"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/SimplePlacemark;

    .line 272
    .local v0, "place":Lcom/thetransitapp/droid/model/SimplePlacemark;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLocation()Landroid/location/Location;

    move-result-object v2

    iput-object v2, p0, Lcom/thetransitapp/droid/TransitActivity;->lastLocation:Landroid/location/Location;

    .line 273
    invoke-virtual {p0}, Lcom/thetransitapp/droid/TransitActivity;->hideError()V

    .line 275
    if-ne p2, v1, :cond_2

    .line 276
    iget-object v2, p0, Lcom/thetransitapp/droid/TransitActivity;->databaseHelper:Lcom/thetransitapp/droid/data/TransitDatabaseHelper;

    invoke-virtual {v2, v0}, Lcom/thetransitapp/droid/data/TransitDatabaseHelper;->addLocationFavorite(Lcom/thetransitapp/droid/model/SimplePlacemark;)V

    goto :goto_1

    .line 282
    .end local v0    # "place":Lcom/thetransitapp/droid/model/SimplePlacemark;
    :cond_5
    iget-object v2, p0, Lcom/thetransitapp/droid/TransitActivity;->routeScreen:Lcom/thetransitapp/droid/RoutesScreen;

    if-eqz v2, :cond_3

    .line 283
    iget-object v2, p0, Lcom/thetransitapp/droid/TransitActivity;->routeScreen:Lcom/thetransitapp/droid/RoutesScreen;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/RoutesScreen;->onResume()V

    goto :goto_2

    .line 288
    :cond_6
    const/4 v1, 0x0

    goto :goto_3

    .line 260
    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public onBackPressed()V
    .locals 2

    .prologue
    .line 477
    invoke-virtual {p0}, Lcom/thetransitapp/droid/TransitActivity;->getDisplayedScreen()Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    move-result-object v0

    sget-object v1, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ROUTING_SCREEN_DETAILS:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    if-ne v0, v1, :cond_0

    .line 478
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->preferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "lastRouting"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 481
    :cond_0
    invoke-super {p0}, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->onBackPressed()V

    .line 483
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->searchLocationMenuItem:Lcom/actionbarsherlock/view/MenuItem;

    if-eqz v0, :cond_1

    .line 485
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->searchLocationMenuItem:Lcom/actionbarsherlock/view/MenuItem;

    invoke-interface {v0}, Lcom/actionbarsherlock/view/MenuItem;->expandActionView()Z

    .line 486
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->searchLocationMenuItem:Lcom/actionbarsherlock/view/MenuItem;

    invoke-interface {v0}, Lcom/actionbarsherlock/view/MenuItem;->collapseActionView()Z

    .line 488
    :cond_1
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/4 v4, 0x1

    .line 390
    invoke-super {p0, p1}, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 392
    invoke-virtual {p0}, Lcom/thetransitapp/droid/TransitActivity;->isDebuggable()Z

    move-result v2

    if-nez v2, :cond_0

    .line 393
    invoke-static {p0}, Lcom/crashlytics/android/Crashlytics;->start(Landroid/content/Context;)V

    .line 395
    :cond_0
    invoke-static {p0}, Lorg/OpenUDID/OpenUDID_manager;->sync(Landroid/content/Context;)V

    .line 397
    const v2, 0x7f030017

    invoke-virtual {p0, v2}, Lcom/thetransitapp/droid/TransitActivity;->setContentView(I)V

    .line 399
    invoke-virtual {p0}, Lcom/thetransitapp/droid/TransitActivity;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v2

    invoke-virtual {v2}, Lcom/actionbarsherlock/app/ActionBar;->getThemedContext()Landroid/content/Context;

    move-result-object v1

    .line 401
    .local v1, "context":Landroid/content/Context;
    const/high16 v2, 0x7f0c0000

    const v3, 0x7f030033

    invoke-static {v1, v2, v3}, Landroid/widget/ArrayAdapter;->createFromResource(Landroid/content/Context;II)Landroid/widget/ArrayAdapter;

    move-result-object v2

    .line 400
    iput-object v2, p0, Lcom/thetransitapp/droid/TransitActivity;->screenList:Landroid/widget/ArrayAdapter;

    .line 402
    iget-object v2, p0, Lcom/thetransitapp/droid/TransitActivity;->screenList:Landroid/widget/ArrayAdapter;

    const v3, 0x7f030032

    invoke-virtual {v2, v3}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 404
    invoke-virtual {p0}, Lcom/thetransitapp/droid/TransitActivity;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/actionbarsherlock/app/ActionBar;->setNavigationMode(I)V

    .line 405
    invoke-virtual {p0}, Lcom/thetransitapp/droid/TransitActivity;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v2

    iget-object v3, p0, Lcom/thetransitapp/droid/TransitActivity;->screenList:Landroid/widget/ArrayAdapter;

    invoke-virtual {v2, v3, p0}, Lcom/actionbarsherlock/app/ActionBar;->setListNavigationCallbacks(Landroid/widget/SpinnerAdapter;Lcom/actionbarsherlock/app/ActionBar$OnNavigationListener;)V

    .line 407
    invoke-super {p0}, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 408
    .local v0, "bundle":Landroid/os/Bundle;
    if-eqz v0, :cond_1

    .line 409
    const-string v2, "from"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "to"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 410
    invoke-virtual {p0}, Lcom/thetransitapp/droid/TransitActivity;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/actionbarsherlock/app/ActionBar;->setSelectedNavigationItem(I)V

    .line 414
    :cond_1
    invoke-direct {p0}, Lcom/thetransitapp/droid/TransitActivity;->setUpMapIfNeeded()V

    .line 415
    return-void
.end method

.method public onCreateOptionsMenu(Lcom/actionbarsherlock/view/Menu;)Z
    .locals 3
    .param p1, "menu"    # Lcom/actionbarsherlock/view/Menu;

    .prologue
    .line 317
    invoke-super {p0, p1}, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->onCreateOptionsMenu(Lcom/actionbarsherlock/view/Menu;)Z

    .line 320
    invoke-virtual {p0}, Lcom/thetransitapp/droid/TransitActivity;->getDisplayedScreen()Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    move-result-object v1

    sget-object v2, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->OPTION_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    if-eq v1, v2, :cond_0

    .line 321
    invoke-virtual {p0}, Lcom/thetransitapp/droid/TransitActivity;->getDisplayedScreen()Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    move-result-object v1

    sget-object v2, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->LOCATION_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    if-eq v1, v2, :cond_0

    .line 322
    invoke-virtual {p0}, Lcom/thetransitapp/droid/TransitActivity;->getDisplayedScreen()Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    move-result-object v1

    sget-object v2, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ABOUT_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    if-eq v1, v2, :cond_0

    .line 323
    const v1, 0x7f0a0063

    invoke-interface {p1, v1}, Lcom/actionbarsherlock/view/Menu;->add(I)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v0

    .line 324
    .local v0, "item":Lcom/actionbarsherlock/view/MenuItem;
    new-instance v1, Lcom/thetransitapp/droid/TransitActivity$3;

    invoke-direct {v1, p0}, Lcom/thetransitapp/droid/TransitActivity$3;-><init>(Lcom/thetransitapp/droid/TransitActivity;)V

    invoke-interface {v0, v1}, Lcom/actionbarsherlock/view/MenuItem;->setOnMenuItemClickListener(Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;)Lcom/actionbarsherlock/view/MenuItem;

    .line 341
    const v1, 0x7f0a0064

    invoke-interface {p1, v1}, Lcom/actionbarsherlock/view/Menu;->add(I)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v0

    .line 342
    new-instance v1, Lcom/thetransitapp/droid/TransitActivity$4;

    invoke-direct {v1, p0}, Lcom/thetransitapp/droid/TransitActivity$4;-><init>(Lcom/thetransitapp/droid/TransitActivity;)V

    invoke-interface {v0, v1}, Lcom/actionbarsherlock/view/MenuItem;->setOnMenuItemClickListener(Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;)Lcom/actionbarsherlock/view/MenuItem;

    .line 356
    .end local v0    # "item":Lcom/actionbarsherlock/view/MenuItem;
    :cond_0
    const/4 v1, 0x1

    return v1
.end method

.method public onLocationChanged(Landroid/location/Location;)V
    .locals 2
    .param p1, "location"    # Landroid/location/Location;

    .prologue
    .line 209
    if-eqz p1, :cond_1

    .line 210
    invoke-virtual {p0}, Lcom/thetransitapp/droid/TransitActivity;->isCurrentLocation()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 211
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->statsManager:Lcom/thetransitapp/droid/model/stats/StatsManager;

    if-eqz v0, :cond_0

    .line 212
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->statsManager:Lcom/thetransitapp/droid/model/stats/StatsManager;

    invoke-virtual {v0, p1}, Lcom/thetransitapp/droid/model/stats/StatsManager;->recordLocationUpdate(Landroid/location/Location;)V

    .line 215
    :cond_0
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->routeViewController:Lcom/thetransitapp/droid/controller/RouteViewController;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/thetransitapp/droid/controller/RouteViewController;->refresh(Landroid/location/Location;Z)V

    .line 218
    :cond_1
    return-void
.end method

.method public onMenuItemSelected(ILcom/actionbarsherlock/view/MenuItem;)Z
    .locals 3
    .param p1, "featureId"    # I
    .param p2, "item"    # Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    .line 302
    invoke-interface {p2}, Lcom/actionbarsherlock/view/MenuItem;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 303
    invoke-interface {p2}, Lcom/actionbarsherlock/view/MenuItem;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "place"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 304
    sget-object v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->LOCATION_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ordinal()I

    move-result v0

    const/4 v1, 0x3

    invoke-interface {p2}, Lcom/actionbarsherlock/view/MenuItem;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/thetransitapp/droid/TransitActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 309
    :cond_0
    :goto_0
    const/4 v0, 0x1

    .line 312
    :goto_1
    return v0

    .line 305
    :cond_1
    invoke-interface {p2}, Lcom/actionbarsherlock/view/MenuItem;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "current"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasCategory(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 306
    sget-object v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->LOCATION_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ordinal()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/thetransitapp/droid/TransitActivity;->onActivityResult(IILandroid/content/Intent;)V

    goto :goto_0

    .line 312
    :cond_2
    invoke-super {p0, p1, p2}, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->onMenuItemSelected(ILcom/actionbarsherlock/view/MenuItem;)Z

    move-result v0

    goto :goto_1
.end method

.method public onNavigationItemSelected(IJ)Z
    .locals 13
    .param p1, "itemPosition"    # I
    .param p2, "itemId"    # J

    .prologue
    .line 128
    iget-boolean v8, p0, Lcom/thetransitapp/droid/TransitActivity;->isClosing:Z

    if-eqz v8, :cond_0

    .line 129
    const/4 v8, 0x0

    .line 186
    :goto_0
    return v8

    .line 132
    :cond_0
    invoke-static {}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->values()[Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    move-result-object v8

    aget-object v7, v8, p1

    .line 133
    .local v7, "screen":Lcom/thetransitapp/droid/TransitActivity$TransitScreen;
    invoke-super {p0}, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 134
    .local v2, "bundle":Landroid/os/Bundle;
    const/4 v4, 0x0

    .line 136
    .local v4, "fragment":Landroid/support/v4/app/Fragment;
    sget-object v8, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->NEARBY_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    if-ne v7, v8, :cond_4

    .line 137
    iget-object v4, p0, Lcom/thetransitapp/droid/TransitActivity;->routeScreen:Lcom/thetransitapp/droid/RoutesScreen;

    .line 139
    if-eqz v2, :cond_2

    const-string v8, "query"

    invoke-virtual {v2, v8}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 140
    const-string v8, "query"

    invoke-virtual {v2, v8}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 141
    .local v6, "query":Ljava/lang/String;
    const-string v8, ","

    invoke-virtual {v6, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 144
    .local v5, "parts":[Ljava/lang/String;
    :try_start_0
    array-length v8, v5

    const/4 v9, 0x2

    if-ne v8, v9, :cond_3

    .line 145
    new-instance v8, Lcom/thetransitapp/droid/model/SimplePlacemark;

    const/4 v9, 0x0

    aget-object v9, v5, v9

    invoke-static {v9}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v9

    .line 146
    const/4 v11, 0x1

    aget-object v11, v5, v11

    invoke-static {v11}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v11

    invoke-direct {v8, v9, v10, v11, v12}, Lcom/thetransitapp/droid/model/SimplePlacemark;-><init>(DD)V

    invoke-virtual {v8}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLocation()Landroid/location/Location;

    move-result-object v8

    .line 145
    iput-object v8, p0, Lcom/thetransitapp/droid/TransitActivity;->lastLocation:Landroid/location/Location;

    .line 147
    iget-object v8, p0, Lcom/thetransitapp/droid/TransitActivity;->routeViewController:Lcom/thetransitapp/droid/controller/RouteViewController;

    iget-object v9, p0, Lcom/thetransitapp/droid/TransitActivity;->lastLocation:Landroid/location/Location;

    const/4 v10, 0x1

    invoke-virtual {v8, v9, v10}, Lcom/thetransitapp/droid/controller/RouteViewController;->refresh(Landroid/location/Location;Z)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 166
    :cond_1
    :goto_1
    const-string v8, "query"

    invoke-virtual {v2, v8}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 179
    .end local v5    # "parts":[Ljava/lang/String;
    .end local v6    # "query":Ljava/lang/String;
    :cond_2
    :goto_2
    if-eqz v4, :cond_5

    .line 180
    invoke-super {p0}, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x1

    invoke-virtual {v8, v9, v10}, Landroid/support/v4/app/FragmentManager;->popBackStack(Ljava/lang/String;I)V

    .line 181
    const/4 v8, 0x0

    invoke-direct {p0, v4, v7, v8}, Lcom/thetransitapp/droid/TransitActivity;->updateScreen(Landroid/support/v4/app/Fragment;Lcom/thetransitapp/droid/TransitActivity$TransitScreen;Z)V

    .line 183
    const/4 v8, 0x1

    goto :goto_0

    .line 149
    .restart local v5    # "parts":[Ljava/lang/String;
    .restart local v6    # "query":Ljava/lang/String;
    :cond_3
    :try_start_1
    new-instance v8, Ljava/lang/NumberFormatException;

    invoke-direct {v8}, Ljava/lang/NumberFormatException;-><init>()V

    throw v8
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 151
    :catch_0
    move-exception v3

    .line 152
    .local v3, "e":Ljava/lang/NumberFormatException;
    invoke-static {}, Landroid/location/Geocoder;->isPresent()Z

    move-result v8

    if-eqz v8, :cond_1

    .line 154
    :try_start_2
    new-instance v8, Landroid/location/Geocoder;

    invoke-direct {v8, p0}, Landroid/location/Geocoder;-><init>(Landroid/content/Context;)V

    const/4 v9, 0x1

    invoke-virtual {v8, v6, v9}, Landroid/location/Geocoder;->getFromLocationName(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v0

    .line 155
    .local v0, "addreses":Ljava/util/List;, "Ljava/util/List<Landroid/location/Address;>;"
    const/4 v8, 0x0

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/location/Address;

    .line 157
    .local v1, "address":Landroid/location/Address;
    new-instance v8, Lcom/thetransitapp/droid/model/SimplePlacemark;

    invoke-virtual {v1}, Landroid/location/Address;->getLatitude()D

    move-result-wide v9

    invoke-virtual {v1}, Landroid/location/Address;->getLongitude()D

    move-result-wide v11

    invoke-direct {v8, v9, v10, v11, v12}, Lcom/thetransitapp/droid/model/SimplePlacemark;-><init>(DD)V

    .line 158
    invoke-virtual {v8}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLocation()Landroid/location/Location;

    move-result-object v8

    .line 157
    iput-object v8, p0, Lcom/thetransitapp/droid/TransitActivity;->lastLocation:Landroid/location/Location;

    .line 159
    iget-object v8, p0, Lcom/thetransitapp/droid/TransitActivity;->routeViewController:Lcom/thetransitapp/droid/controller/RouteViewController;

    iget-object v9, p0, Lcom/thetransitapp/droid/TransitActivity;->lastLocation:Landroid/location/Location;

    const/4 v10, 0x1

    invoke-virtual {v8, v9, v10}, Lcom/thetransitapp/droid/controller/RouteViewController;->refresh(Landroid/location/Location;Z)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    .line 160
    .end local v0    # "addreses":Ljava/util/List;, "Ljava/util/List<Landroid/location/Address;>;"
    .end local v1    # "address":Landroid/location/Address;
    :catch_1
    move-exception v8

    goto :goto_1

    .line 168
    .end local v3    # "e":Ljava/lang/NumberFormatException;
    .end local v5    # "parts":[Ljava/lang/String;
    .end local v6    # "query":Ljava/lang/String;
    :cond_4
    sget-object v8, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ROUTING_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    if-ne v7, v8, :cond_2

    .line 169
    new-instance v4, Lcom/thetransitapp/droid/RoutingScreen;

    .end local v4    # "fragment":Landroid/support/v4/app/Fragment;
    invoke-direct {v4}, Lcom/thetransitapp/droid/RoutingScreen;-><init>()V

    .line 171
    .restart local v4    # "fragment":Landroid/support/v4/app/Fragment;
    if-eqz v2, :cond_2

    const-string v8, "from"

    invoke-virtual {v2, v8}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_2

    const-string v8, "to"

    invoke-virtual {v2, v8}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 172
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8, v2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {v4, v8}, Landroid/support/v4/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 174
    const-string v8, "from"

    invoke-virtual {v2, v8}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 175
    const-string v8, "to"

    invoke-virtual {v2, v8}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    goto :goto_2

    .line 186
    :cond_5
    const/4 v8, 0x0

    goto/16 :goto_0
.end method

.method public onOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z
    .locals 2
    .param p1, "item"    # Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    .line 191
    invoke-interface {p1}, Lcom/actionbarsherlock/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-ne v0, v1, :cond_0

    .line 192
    invoke-virtual {p0}, Lcom/thetransitapp/droid/TransitActivity;->onBackPressed()V

    .line 194
    const/4 v0, 0x1

    .line 197
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected onPause()V
    .locals 1

    .prologue
    .line 454
    invoke-super {p0}, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->onPause()V

    .line 456
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->locationClient:Lcom/google/android/gms/location/LocationClient;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->locationClient:Lcom/google/android/gms/location/LocationClient;

    invoke-virtual {v0}, Lcom/google/android/gms/location/LocationClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 457
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->locationClient:Lcom/google/android/gms/location/LocationClient;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/location/LocationClient;->removeLocationUpdates(Lcom/google/android/gms/location/LocationListener;)V

    .line 458
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->locationClient:Lcom/google/android/gms/location/LocationClient;

    invoke-virtual {v0}, Lcom/google/android/gms/location/LocationClient;->disconnect()V

    .line 461
    :cond_0
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->statsManager:Lcom/thetransitapp/droid/model/stats/StatsManager;

    if-eqz v0, :cond_1

    .line 462
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->statsManager:Lcom/thetransitapp/droid/model/stats/StatsManager;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/stats/StatsManager;->endSession()V

    .line 464
    :cond_1
    return-void
.end method

.method protected onResume()V
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 428
    invoke-super {p0}, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->onResume()V

    .line 429
    iput-boolean v0, p0, Lcom/thetransitapp/droid/TransitActivity;->isClosing:Z

    .line 431
    invoke-static {p0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v1

    if-nez v1, :cond_5

    .line 432
    iget-object v1, p0, Lcom/thetransitapp/droid/TransitActivity;->container:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 434
    iget-object v1, p0, Lcom/thetransitapp/droid/TransitActivity;->locationClient:Lcom/google/android/gms/location/LocationClient;

    if-nez v1, :cond_0

    .line 435
    new-instance v1, Lcom/google/android/gms/location/LocationClient;

    iget-object v2, p0, Lcom/thetransitapp/droid/TransitActivity;->connectionCallbacks:Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;

    iget-object v3, p0, Lcom/thetransitapp/droid/TransitActivity;->connectionFailedListener:Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;

    invoke-direct {v1, p0, v2, v3}, Lcom/google/android/gms/location/LocationClient;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V

    iput-object v1, p0, Lcom/thetransitapp/droid/TransitActivity;->locationClient:Lcom/google/android/gms/location/LocationClient;

    .line 438
    :cond_0
    iget-object v1, p0, Lcom/thetransitapp/droid/TransitActivity;->locationClient:Lcom/google/android/gms/location/LocationClient;

    invoke-virtual {v1}, Lcom/google/android/gms/location/LocationClient;->isConnected()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 439
    iget-object v1, p0, Lcom/thetransitapp/droid/TransitActivity;->locationClient:Lcom/google/android/gms/location/LocationClient;

    invoke-direct {p0}, Lcom/thetransitapp/droid/TransitActivity;->getLocationRequest()Lcom/google/android/gms/location/LocationRequest;

    move-result-object v2

    invoke-virtual {v1, v2, p0}, Lcom/google/android/gms/location/LocationClient;->requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;)V

    .line 444
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/thetransitapp/droid/TransitActivity;->statsManager:Lcom/thetransitapp/droid/model/stats/StatsManager;

    if-eqz v1, :cond_3

    .line 445
    iget-object v1, p0, Lcom/thetransitapp/droid/TransitActivity;->statsManager:Lcom/thetransitapp/droid/model/stats/StatsManager;

    invoke-virtual {p0}, Lcom/thetransitapp/droid/TransitActivity;->getLastLocation()Landroid/location/Location;

    move-result-object v2

    iget-object v3, p0, Lcom/thetransitapp/droid/TransitActivity;->lastLocation:Landroid/location/Location;

    if-eqz v3, :cond_2

    const/4 v0, 0x1

    :cond_2
    invoke-virtual {v1, v2, v0}, Lcom/thetransitapp/droid/model/stats/StatsManager;->startSessionWithLocation(Landroid/location/Location;Z)V

    .line 450
    :cond_3
    :goto_1
    return-void

    .line 440
    :cond_4
    iget-object v1, p0, Lcom/thetransitapp/droid/TransitActivity;->locationClient:Lcom/google/android/gms/location/LocationClient;

    invoke-virtual {v1}, Lcom/google/android/gms/location/LocationClient;->isConnecting()Z

    move-result v1

    if-nez v1, :cond_1

    .line 441
    iget-object v1, p0, Lcom/thetransitapp/droid/TransitActivity;->locationClient:Lcom/google/android/gms/location/LocationClient;

    invoke-virtual {v1}, Lcom/google/android/gms/location/LocationClient;->connect()V

    goto :goto_0

    .line 448
    :cond_5
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->container:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_1
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1
    .param p1, "outState"    # Landroid/os/Bundle;

    .prologue
    .line 202
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/thetransitapp/droid/TransitActivity;->isClosing:Z

    .line 204
    invoke-super {p0, p1}, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 205
    return-void
.end method

.method protected onStart()V
    .locals 1

    .prologue
    .line 419
    invoke-super {p0}, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->onStart()V

    .line 421
    invoke-virtual {p0}, Lcom/thetransitapp/droid/TransitActivity;->isDebuggable()Z

    move-result v0

    if-nez v0, :cond_0

    .line 422
    invoke-static {}, Lcom/google/analytics/tracking/android/EasyTracker;->getInstance()Lcom/google/analytics/tracking/android/EasyTracker;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/analytics/tracking/android/EasyTracker;->activityStart(Landroid/app/Activity;)V

    .line 424
    :cond_0
    return-void
.end method

.method protected onStop()V
    .locals 1

    .prologue
    .line 468
    invoke-super {p0}, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->onStop()V

    .line 470
    invoke-virtual {p0}, Lcom/thetransitapp/droid/TransitActivity;->isDebuggable()Z

    move-result v0

    if-nez v0, :cond_0

    .line 471
    invoke-static {}, Lcom/google/analytics/tracking/android/EasyTracker;->getInstance()Lcom/google/analytics/tracking/android/EasyTracker;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/analytics/tracking/android/EasyTracker;->activityStop(Landroid/app/Activity;)V

    .line 473
    :cond_0
    return-void
.end method

.method public setSearchLocationMenuItem(Lcom/actionbarsherlock/view/MenuItem;)V
    .locals 0
    .param p1, "searchLocationMenuItem"    # Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    .line 78
    iput-object p1, p0, Lcom/thetransitapp/droid/TransitActivity;->searchLocationMenuItem:Lcom/actionbarsherlock/view/MenuItem;

    return-void
.end method

.method public showLocationServiceError()V
    .locals 4

    .prologue
    .line 491
    iget-object v3, p0, Lcom/thetransitapp/droid/TransitActivity;->locationClient:Lcom/google/android/gms/location/LocationClient;

    invoke-virtual {v3}, Lcom/google/android/gms/location/LocationClient;->isConnecting()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 513
    :goto_0
    return-void

    .line 495
    :cond_0
    const v3, 0x7f0a0040

    invoke-super {p0, v3}, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 496
    .local v2, "title":Ljava/lang/String;
    const v3, 0x7f0a0078

    invoke-super {p0, v3}, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 497
    .local v1, "message":Ljava/lang/String;
    const v3, 0x7f0a0071

    invoke-super {p0, v3}, Lcom/github/rtyley/android/sherlock/roboguice/activity/RoboSherlockFragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 499
    .local v0, "button":Ljava/lang/String;
    new-instance v3, Lcom/thetransitapp/droid/TransitActivity$5;

    invoke-direct {v3, p0}, Lcom/thetransitapp/droid/TransitActivity$5;-><init>(Lcom/thetransitapp/droid/TransitActivity;)V

    invoke-virtual {p0, v2, v1, v0, v3}, Lcom/thetransitapp/droid/TransitActivity;->displayError(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;)V

    goto :goto_0
.end method

.method public showPopover(Landroid/view/View;Landroid/view/View;Ljava/lang/Integer;)V
    .locals 6
    .param p1, "content"    # Landroid/view/View;
    .param p2, "relativeTo"    # Landroid/view/View;
    .param p3, "direction"    # Ljava/lang/Integer;

    .prologue
    const/4 v0, -0x2

    .line 372
    invoke-virtual {p1, v0, v0}, Landroid/view/View;->measure(II)V

    .line 374
    new-instance v0, Lcom/thetransitapp/droid/widget/PopoverView;

    invoke-direct {v0, p0, p1}, Lcom/thetransitapp/droid/widget/PopoverView;-><init>(Landroid/content/Context;Landroid/view/View;)V

    iput-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->popoverView:Lcom/thetransitapp/droid/widget/PopoverView;

    .line 375
    iget-object v0, p0, Lcom/thetransitapp/droid/TransitActivity;->popoverView:Lcom/thetransitapp/droid/widget/PopoverView;

    new-instance v1, Landroid/graphics/Point;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    .line 376
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/graphics/Point;-><init>(II)V

    .line 375
    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/widget/PopoverView;->setContentSizeForViewInPopover(Landroid/graphics/Point;)V

    .line 377
    iget-object v2, p0, Lcom/thetransitapp/droid/TransitActivity;->popoverView:Lcom/thetransitapp/droid/widget/PopoverView;

    const v0, 0x7f050037

    invoke-virtual {p0, v0}, Lcom/thetransitapp/droid/TransitActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 378
    invoke-static {p2}, Lcom/thetransitapp/droid/widget/PopoverView;->getFrameForView(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v3

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 379
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0xb

    if-lt v1, v5, :cond_0

    const/4 v1, 0x1

    .line 377
    :goto_0
    invoke-virtual {v2, v0, v3, v4, v1}, Lcom/thetransitapp/droid/widget/PopoverView;->showPopoverFromRectInViewGroup(Landroid/view/ViewGroup;Landroid/graphics/Rect;IZ)V

    .line 380
    return-void

    .line 379
    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method
