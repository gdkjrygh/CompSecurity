.class public Lcom/thetransitapp/droid/RoutesScreen;
.super Lcom/thetransitapp/droid/BaseMapScreen;
.source "RoutesScreen.java"

# interfaces
.implements Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;
.implements Lcom/thetransitapp/droid/controller/RouteViewController$ErrorHandler;


# static fields
.field private static synthetic $SWITCH_TABLE$com$thetransitapp$droid$model$NearbyRoutesRequest$ErrorType:[I = null

.field public static final MENU_PRESS_PREFERENCE_KEY:Ljava/lang/String; = "menuPressed"


# instance fields
.field private databaseHelper:Lcom/thetransitapp/droid/data/TransitDatabaseHelper;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field

.field private favoriteAlertShown:Z

.field private lastError:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

.field private lastErrorMessage:Ljava/lang/String;

.field private lastErrorTitle:Ljava/lang/String;

.field private locationMenuItem:Lcom/actionbarsherlock/view/SubMenu;

.field private preferences:Landroid/content/SharedPreferences;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field

.field private routes:Landroid/widget/ListView;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f05008e
    .end annotation
.end field

.field private viewController:Lcom/thetransitapp/droid/controller/RouteViewController;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field


# direct methods
.method static synthetic $SWITCH_TABLE$com$thetransitapp$droid$model$NearbyRoutesRequest$ErrorType()[I
    .locals 3

    .prologue
    .line 49
    sget-object v0, Lcom/thetransitapp/droid/RoutesScreen;->$SWITCH_TABLE$com$thetransitapp$droid$model$NearbyRoutesRequest$ErrorType:[I

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->values()[Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->LINES_INACTIVE:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_9

    :goto_1
    :try_start_1
    sget-object v1, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->MESSAGE:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_8

    :goto_2
    :try_start_2
    sget-object v1, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->NO_INTERNET:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->ordinal()I

    move-result v1

    const/16 v2, 0x9

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_7

    :goto_3
    :try_start_3
    sget-object v1, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->NO_NEARBY_STOPS:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_6

    :goto_4
    :try_start_4
    sget-object v1, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->OUT_OF_SERVICE:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_5

    :goto_5
    :try_start_5
    sget-object v1, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->REGION_IN_MAINTENANCE:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_4

    :goto_6
    :try_start_6
    sget-object v1, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->REGION_UNSUPPORTED:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_3

    :goto_7
    :try_start_7
    sget-object v1, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->TIMEOUT:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->ordinal()I

    move-result v1

    const/16 v2, 0x8

    aput v2, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_2

    :goto_8
    :try_start_8
    sget-object v1, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->TIME_DELTA_OUT:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->ordinal()I

    move-result v1

    const/16 v2, 0xa

    aput v2, v0, v1
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_1

    :goto_9
    :try_start_9
    sget-object v1, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->UNAUTHORIZED:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_0

    :goto_a
    sput-object v0, Lcom/thetransitapp/droid/RoutesScreen;->$SWITCH_TABLE$com$thetransitapp$droid$model$NearbyRoutesRequest$ErrorType:[I

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_a

    :catch_1
    move-exception v1

    goto :goto_9

    :catch_2
    move-exception v1

    goto :goto_8

    :catch_3
    move-exception v1

    goto :goto_7

    :catch_4
    move-exception v1

    goto :goto_6

    :catch_5
    move-exception v1

    goto :goto_5

    :catch_6
    move-exception v1

    goto :goto_4

    :catch_7
    move-exception v1

    goto :goto_3

    :catch_8
    move-exception v1

    goto :goto_2

    :catch_9
    move-exception v1

    goto :goto_1
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 69
    sget-object v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->NEARBY_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-direct {p0, v0}, Lcom/thetransitapp/droid/BaseMapScreen;-><init>(Lcom/thetransitapp/droid/TransitActivity$TransitScreen;)V

    .line 71
    const/4 v0, 0x1

    invoke-super {p0, v0}, Lcom/thetransitapp/droid/BaseMapScreen;->setHasOptionsMenu(Z)V

    .line 72
    return-void
.end method

.method static synthetic access$0(Lcom/thetransitapp/droid/RoutesScreen;Landroid/location/Location;)V
    .locals 0

    .prologue
    .line 1
    invoke-super {p0, p1}, Lcom/thetransitapp/droid/BaseMapScreen;->onMyLocationChange(Landroid/location/Location;)V

    return-void
.end method

.method static synthetic access$1(Lcom/thetransitapp/droid/RoutesScreen;)Landroid/location/Location;
    .locals 1

    .prologue
    .line 1
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getRealLocation()Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$3(Lcom/thetransitapp/droid/RoutesScreen;)Lcom/thetransitapp/droid/controller/RouteViewController;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/thetransitapp/droid/RoutesScreen;->viewController:Lcom/thetransitapp/droid/controller/RouteViewController;

    return-object v0
.end method

.method private calculateMinInterval(Ljava/util/List;)I
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/ScheduleItem;",
            ">;)I"
        }
    .end annotation

    .prologue
    .line 327
    .local p1, "items":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    const v2, 0x7fffffff

    .line 329
    .local v2, "minTimeInterval":I
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_1

    .line 338
    return v2

    .line 329
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/ScheduleItem;

    .line 330
    .local v0, "item":Lcom/thetransitapp/droid/model/ScheduleItem;
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thetransitapp/droid/model/ScheduleItem;

    .line 331
    .local v1, "item2":Lcom/thetransitapp/droid/model/ScheduleItem;
    if-eq v0, v1, :cond_2

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getStopTime()Ljava/util/Date;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/ScheduleItem;->getStopTime()Ljava/util/Date;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 333
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getStopTime()Ljava/util/Date;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/ScheduleItem;->getStopTime()Ljava/util/Date;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v7

    sub-long/2addr v5, v7

    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    move-result-wide v5

    int-to-long v7, v2

    .line 332
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    long-to-int v2, v5

    goto :goto_0
.end method

.method private displayScreen(Landroid/support/v4/app/Fragment;Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;Lcom/thetransitapp/droid/TransitActivity$TransitScreen;)V
    .locals 4
    .param p1, "fragment"    # Landroid/support/v4/app/Fragment;
    .param p2, "route"    # Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    .param p3, "screen"    # Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    .prologue
    .line 342
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 343
    .local v0, "data":Landroid/os/Bundle;
    const-string v2, "route"

    invoke-virtual {v0, v2, p2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 345
    invoke-virtual {p1, v0}, Landroid/support/v4/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 347
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    .line 348
    .local v1, "transaction":Landroid/support/v4/app/FragmentTransaction;
    const v2, 0x7f05003a

    invoke-virtual {p3}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, p1, v3}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 349
    invoke-virtual {p3}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentTransaction;->addToBackStack(Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 350
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 351
    return-void
.end method


# virtual methods
.method public clearError()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 224
    iput-object v0, p0, Lcom/thetransitapp/droid/RoutesScreen;->lastError:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    .line 225
    iput-object v0, p0, Lcom/thetransitapp/droid/RoutesScreen;->lastErrorTitle:Ljava/lang/String;

    .line 226
    iput-object v0, p0, Lcom/thetransitapp/droid/RoutesScreen;->lastErrorMessage:Ljava/lang/String;

    .line 227
    return-void
.end method

.method public menuExpanded(Lcom/thetransitapp/droid/widget/route/RouteItem;)V
    .locals 4
    .param p1, "routeItem"    # Lcom/thetransitapp/droid/widget/route/RouteItem;

    .prologue
    .line 205
    invoke-virtual {p1}, Lcom/thetransitapp/droid/widget/route/RouteItem;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v1

    add-int/lit8 v0, v1, 0xa

    .line 207
    .local v0, "desiredX":I
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutesScreen;->routes:Landroid/widget/ListView;

    invoke-virtual {v1}, Landroid/widget/ListView;->getScrollY()I

    move-result v1

    iget-object v2, p0, Lcom/thetransitapp/droid/RoutesScreen;->routes:Landroid/widget/ListView;

    invoke-virtual {v2}, Landroid/widget/ListView;->getHeight()I

    move-result v2

    add-int/2addr v1, v2

    if-le v0, v1, :cond_0

    .line 208
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutesScreen;->routes:Landroid/widget/ListView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setOverScrollMode(I)V

    .line 209
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutesScreen;->routes:Landroid/widget/ListView;

    iget-object v2, p0, Lcom/thetransitapp/droid/RoutesScreen;->routes:Landroid/widget/ListView;

    invoke-virtual {v2}, Landroid/widget/ListView;->getScrollX()I

    move-result v2

    sub-int v2, v0, v2

    iget-object v3, p0, Lcom/thetransitapp/droid/RoutesScreen;->routes:Landroid/widget/ListView;

    invoke-virtual {v3}, Landroid/widget/ListView;->getHeight()I

    move-result v3

    sub-int/2addr v2, v3

    const/16 v3, 0x1f4

    invoke-virtual {v1, v2, v3}, Landroid/widget/ListView;->smoothScrollBy(II)V

    .line 211
    :cond_0
    return-void
.end method

.method public onCreateOptionsMenu(Lcom/actionbarsherlock/view/Menu;Lcom/actionbarsherlock/view/MenuInflater;)V
    .locals 4
    .param p1, "menu"    # Lcom/actionbarsherlock/view/Menu;
    .param p2, "inflater"    # Lcom/actionbarsherlock/view/MenuInflater;

    .prologue
    const v2, 0x7f0200a1

    .line 104
    invoke-super {p0, p1, p2}, Lcom/thetransitapp/droid/BaseMapScreen;->onCreateOptionsMenu(Lcom/actionbarsherlock/view/Menu;Lcom/actionbarsherlock/view/MenuInflater;)V

    .line 106
    const v1, 0x7f0a0040

    invoke-interface {p1, v1}, Lcom/actionbarsherlock/view/Menu;->addSubMenu(I)Lcom/actionbarsherlock/view/SubMenu;

    move-result-object v3

    .line 107
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->isCurrentLocation()Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    .line 106
    :goto_0
    invoke-interface {v3, v1}, Lcom/actionbarsherlock/view/SubMenu;->setIcon(I)Lcom/actionbarsherlock/view/SubMenu;

    move-result-object v1

    iput-object v1, p0, Lcom/thetransitapp/droid/RoutesScreen;->locationMenuItem:Lcom/actionbarsherlock/view/SubMenu;

    .line 108
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutesScreen;->locationMenuItem:Lcom/actionbarsherlock/view/SubMenu;

    const v3, 0x7f0a0041

    invoke-interface {v1, v3}, Lcom/actionbarsherlock/view/SubMenu;->add(I)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v1

    const v3, 0x7f020070

    invoke-interface {v1, v3}, Lcom/actionbarsherlock/view/MenuItem;->setIcon(I)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v1

    .line 109
    new-instance v3, Lcom/thetransitapp/droid/RoutesScreen$2;

    invoke-direct {v3, p0}, Lcom/thetransitapp/droid/RoutesScreen$2;-><init>(Lcom/thetransitapp/droid/RoutesScreen;)V

    invoke-interface {v1, v3}, Lcom/actionbarsherlock/view/MenuItem;->setOnMenuItemClickListener(Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;)Lcom/actionbarsherlock/view/MenuItem;

    .line 131
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 132
    .local v0, "current":Landroid/content/Intent;
    const-string v1, "current"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 133
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutesScreen;->locationMenuItem:Lcom/actionbarsherlock/view/SubMenu;

    const v3, 0x7f0a0042

    invoke-interface {v1, v3}, Lcom/actionbarsherlock/view/SubMenu;->add(I)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/actionbarsherlock/view/MenuItem;->setIntent(Landroid/content/Intent;)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v1

    invoke-interface {v1, v2}, Lcom/actionbarsherlock/view/MenuItem;->setIcon(I)Lcom/actionbarsherlock/view/MenuItem;

    .line 135
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutesScreen;->locationMenuItem:Lcom/actionbarsherlock/view/SubMenu;

    invoke-interface {v1}, Lcom/actionbarsherlock/view/SubMenu;->getItem()Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lcom/actionbarsherlock/view/MenuItem;->setShowAsAction(I)V

    .line 136
    return-void

    .line 107
    .end local v0    # "current":Landroid/content/Intent;
    :cond_0
    const v1, 0x7f0200a2

    goto :goto_0
.end method

.method public onError(Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;Ljava/lang/String;Ljava/lang/String;)V
    .locals 11
    .param p1, "type"    # Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;
    .param p2, "title"    # Ljava/lang/String;
    .param p3, "message"    # Ljava/lang/String;

    .prologue
    const/4 v10, -0x1

    const/4 v9, 0x0

    .line 371
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->isVisible()Z

    move-result v7

    if-nez v7, :cond_0

    .line 503
    :goto_0
    return-void

    .line 375
    :cond_0
    if-nez p1, :cond_2

    .line 376
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getView()Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    move-result v7

    if-eqz v7, :cond_1

    .line 377
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getView()Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7, v9}, Landroid/view/View;->setVisibility(I)V

    .line 378
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->hideError()V

    .line 381
    :cond_1
    invoke-virtual {p0}, Lcom/thetransitapp/droid/RoutesScreen;->clearError()V

    goto :goto_0

    .line 386
    :cond_2
    iput-object p1, p0, Lcom/thetransitapp/droid/RoutesScreen;->lastError:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    .line 387
    iput-object p2, p0, Lcom/thetransitapp/droid/RoutesScreen;->lastErrorTitle:Ljava/lang/String;

    .line 388
    iput-object p3, p0, Lcom/thetransitapp/droid/RoutesScreen;->lastErrorMessage:Ljava/lang/String;

    .line 390
    const/4 v6, -0x1

    .line 391
    .local v6, "titleId":I
    const/4 v4, -0x1

    .line 393
    .local v4, "messageId":I
    invoke-static {}, Lcom/thetransitapp/droid/RoutesScreen;->$SWITCH_TABLE$com$thetransitapp$droid$model$NearbyRoutesRequest$ErrorType()[I

    move-result-object v7

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->ordinal()I

    move-result v8

    aget v7, v7, v8

    packed-switch v7, :pswitch_data_0

    .line 430
    :pswitch_0
    if-nez p2, :cond_3

    .line 431
    const v6, 0x7f0a0076

    .line 434
    :cond_3
    if-nez p3, :cond_4

    .line 435
    const v4, 0x7f0a0079

    .line 440
    :cond_4
    :goto_1
    if-eq v6, v10, :cond_5

    .line 441
    invoke-super {p0, v6}, Lcom/thetransitapp/droid/BaseMapScreen;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 444
    :cond_5
    if-eq v4, v10, :cond_6

    .line 445
    sget-object v7, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->TIME_DELTA_OUT:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    if-ne p1, v7, :cond_7

    .line 446
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v7

    invoke-virtual {v7, v9, v9}, Ljava/util/TimeZone;->getDisplayName(ZI)Ljava/lang/String;

    move-result-object v5

    .line 447
    .local v5, "timezone":Ljava/lang/String;
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 449
    .local v1, "date":Ljava/util/Date;
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    invoke-static {v8}, Landroid/text/format/DateFormat;->getDateFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v8

    invoke-virtual {v8, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 450
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    invoke-static {v8}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v8

    invoke-virtual {v8, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    .line 449
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 451
    .local v3, "localTime":Ljava/lang/String;
    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v3, v7, v9

    const/4 v8, 0x1

    aput-object p3, v7, v8

    invoke-super {p0, v4, v7}, Lcom/thetransitapp/droid/BaseMapScreen;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    .line 457
    .end local v1    # "date":Ljava/util/Date;
    .end local v3    # "localTime":Ljava/lang/String;
    .end local v5    # "timezone":Ljava/lang/String;
    :cond_6
    :goto_2
    const/4 v0, 0x0

    .line 458
    .local v0, "button":Ljava/lang/String;
    const/4 v2, 0x0

    .line 460
    .local v2, "listener":Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;
    invoke-static {}, Lcom/thetransitapp/droid/RoutesScreen;->$SWITCH_TABLE$com$thetransitapp$droid$model$NearbyRoutesRequest$ErrorType()[I

    move-result-object v7

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->ordinal()I

    move-result v8

    aget v7, v7, v8

    packed-switch v7, :pswitch_data_1

    .line 502
    :goto_3
    :pswitch_1
    invoke-super {p0, p2, p3, v0, v2}, Lcom/thetransitapp/droid/BaseMapScreen;->displayError(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;)V

    goto/16 :goto_0

    .line 395
    .end local v0    # "button":Ljava/lang/String;
    .end local v2    # "listener":Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;
    :pswitch_2
    const v6, 0x7f0a007a

    .line 396
    const v4, 0x7f0a007b

    .line 397
    goto :goto_1

    .line 400
    :pswitch_3
    const v6, 0x7f0a007c

    .line 401
    const v4, 0x7f0a007d

    .line 402
    goto :goto_1

    .line 405
    :pswitch_4
    const v6, 0x7f0a0080

    .line 406
    const v4, 0x7f0a0081

    .line 407
    goto :goto_1

    .line 410
    :pswitch_5
    const v6, 0x7f0a007e

    .line 411
    const v4, 0x7f0a007f

    .line 412
    goto/16 :goto_1

    .line 415
    :pswitch_6
    const v6, 0x7f0a0072

    .line 416
    const v4, 0x7f0a0073

    .line 417
    goto/16 :goto_1

    .line 420
    :pswitch_7
    const v6, 0x7f0a0074

    .line 421
    const v4, 0x7f0a0075

    .line 422
    goto/16 :goto_1

    .line 425
    :pswitch_8
    const v6, 0x7f0a0089

    .line 426
    const v4, 0x7f0a008a

    .line 427
    goto/16 :goto_1

    .line 453
    :cond_7
    invoke-super {p0, v4}, Lcom/thetransitapp/droid/BaseMapScreen;->getString(I)Ljava/lang/String;

    move-result-object p3

    goto :goto_2

    .line 465
    .restart local v0    # "button":Ljava/lang/String;
    .restart local v2    # "listener":Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;
    :pswitch_9
    const v7, 0x7f0a0071

    invoke-super {p0, v7}, Lcom/thetransitapp/droid/BaseMapScreen;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 466
    new-instance v2, Lcom/thetransitapp/droid/RoutesScreen$4;

    .end local v2    # "listener":Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;
    invoke-direct {v2, p0}, Lcom/thetransitapp/droid/RoutesScreen$4;-><init>(Lcom/thetransitapp/droid/RoutesScreen;)V

    .line 474
    .restart local v2    # "listener":Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;
    goto :goto_3

    .line 477
    :pswitch_a
    const v7, 0x7f0a0096

    invoke-super {p0, v7}, Lcom/thetransitapp/droid/BaseMapScreen;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 478
    new-instance v2, Lcom/thetransitapp/droid/RoutesScreen$5;

    .end local v2    # "listener":Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;
    invoke-direct {v2, p0}, Lcom/thetransitapp/droid/RoutesScreen$5;-><init>(Lcom/thetransitapp/droid/RoutesScreen;)V

    .line 485
    .restart local v2    # "listener":Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;
    goto :goto_3

    .line 488
    :pswitch_b
    const v7, 0x7f0a009a

    invoke-super {p0, v7}, Lcom/thetransitapp/droid/BaseMapScreen;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 489
    new-instance v2, Lcom/thetransitapp/droid/RoutesScreen$6;

    .end local v2    # "listener":Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;
    invoke-direct {v2, p0}, Lcom/thetransitapp/droid/RoutesScreen$6;-><init>(Lcom/thetransitapp/droid/RoutesScreen;)V

    .line 496
    .restart local v2    # "listener":Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;
    goto :goto_3

    .line 393
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_8
    .end packed-switch

    .line 460
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_a
        :pswitch_1
        :pswitch_b
        :pswitch_9
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_9
        :pswitch_9
        :pswitch_9
    .end packed-switch
.end method

.method public onPause()V
    .locals 2

    .prologue
    .line 187
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->onPause()V

    .line 189
    iget-object v0, p0, Lcom/thetransitapp/droid/RoutesScreen;->viewController:Lcom/thetransitapp/droid/controller/RouteViewController;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/controller/RouteViewController;->setPaused(Z)V

    .line 190
    const/4 v0, 0x0

    invoke-super {p0, v0}, Lcom/thetransitapp/droid/BaseMapScreen;->hidePopover(Z)V

    .line 191
    return-void
.end method

.method public onPrepareOptionsMenu(Lcom/actionbarsherlock/view/Menu;)V
    .locals 7
    .param p1, "menu"    # Lcom/actionbarsherlock/view/Menu;

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 140
    invoke-super {p0, p1}, Lcom/thetransitapp/droid/BaseMapScreen;->onPrepareOptionsMenu(Lcom/actionbarsherlock/view/Menu;)V

    .line 141
    invoke-super {p0, p1}, Lcom/thetransitapp/droid/BaseMapScreen;->onPrepareOptionsMenu(Lcom/actionbarsherlock/view/Menu;)V

    .line 143
    iget-object v2, p0, Lcom/thetransitapp/droid/RoutesScreen;->locationMenuItem:Lcom/actionbarsherlock/view/SubMenu;

    invoke-interface {v2, v6}, Lcom/actionbarsherlock/view/SubMenu;->removeGroup(I)V

    .line 145
    iget-object v2, p0, Lcom/thetransitapp/droid/RoutesScreen;->databaseHelper:Lcom/thetransitapp/droid/data/TransitDatabaseHelper;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/data/TransitDatabaseHelper;->getLocationFavorites()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    .line 156
    :goto_0
    return-void

    .line 145
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thetransitapp/droid/model/SimplePlacemark;

    .line 146
    .local v1, "place":Lcom/thetransitapp/droid/model/SimplePlacemark;
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 147
    .local v0, "data":Landroid/content/Intent;
    const-string v3, "place"

    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 149
    iget-object v3, p0, Lcom/thetransitapp/droid/RoutesScreen;->locationMenuItem:Lcom/actionbarsherlock/view/SubMenu;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v6, v5, v5, v4}, Lcom/actionbarsherlock/view/SubMenu;->add(IIILjava/lang/CharSequence;)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v3

    const v4, 0x7f0200a2

    invoke-interface {v3, v4}, Lcom/actionbarsherlock/view/MenuItem;->setIcon(I)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v3

    .line 150
    invoke-interface {v3, v0}, Lcom/actionbarsherlock/view/MenuItem;->setIntent(Landroid/content/Intent;)Lcom/actionbarsherlock/view/MenuItem;

    .line 152
    iget-object v3, p0, Lcom/thetransitapp/droid/RoutesScreen;->locationMenuItem:Lcom/actionbarsherlock/view/SubMenu;

    invoke-interface {v3}, Lcom/actionbarsherlock/view/SubMenu;->size()I

    move-result v3

    const/4 v4, 0x4

    if-le v3, v4, :cond_0

    goto :goto_0
.end method

.method public onResume()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 160
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->onResume()V

    .line 162
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutesScreen;->lastError:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    if-eqz v1, :cond_0

    .line 163
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutesScreen;->lastError:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    iget-object v2, p0, Lcom/thetransitapp/droid/RoutesScreen;->lastErrorTitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/thetransitapp/droid/RoutesScreen;->lastErrorMessage:Ljava/lang/String;

    invoke-virtual {p0, v1, v2, v3}, Lcom/thetransitapp/droid/RoutesScreen;->onError(Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    :cond_0
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 167
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getLastLocation()Landroid/location/Location;

    move-result-object v0

    .line 168
    .local v0, "location":Landroid/location/Location;
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutesScreen;->viewController:Lcom/thetransitapp/droid/controller/RouteViewController;

    invoke-virtual {v1, v4}, Lcom/thetransitapp/droid/controller/RouteViewController;->setPaused(Z)V

    .line 170
    if-eqz v0, :cond_3

    .line 171
    invoke-super {p0, v0}, Lcom/thetransitapp/droid/BaseMapScreen;->centerMap(Landroid/location/Location;)V

    .line 173
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutesScreen;->viewController:Lcom/thetransitapp/droid/controller/RouteViewController;

    invoke-virtual {v1, v0, v4}, Lcom/thetransitapp/droid/controller/RouteViewController;->refresh(Landroid/location/Location;Z)V

    .line 175
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutesScreen;->locationMenuItem:Lcom/actionbarsherlock/view/SubMenu;

    if-eqz v1, :cond_1

    .line 176
    iget-object v2, p0, Lcom/thetransitapp/droid/RoutesScreen;->locationMenuItem:Lcom/actionbarsherlock/view/SubMenu;

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->isCurrentLocation()Z

    move-result v1

    if-eqz v1, :cond_2

    const v1, 0x7f0200a1

    :goto_0
    invoke-interface {v2, v1}, Lcom/actionbarsherlock/view/SubMenu;->setIcon(I)Lcom/actionbarsherlock/view/SubMenu;

    .line 183
    .end local v0    # "location":Landroid/location/Location;
    :cond_1
    :goto_1
    return-void

    .line 177
    .restart local v0    # "location":Landroid/location/Location;
    :cond_2
    const v1, 0x7f0200a2

    goto :goto_0

    .line 180
    :cond_3
    invoke-virtual {p0}, Lcom/thetransitapp/droid/RoutesScreen;->showLocationServiceError()V

    goto :goto_1
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2
    .param p1, "view"    # Landroid/view/View;
    .param p2, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 76
    invoke-super {p0, p1, p2}, Lcom/thetransitapp/droid/BaseMapScreen;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 78
    iget-object v0, p0, Lcom/thetransitapp/droid/RoutesScreen;->viewController:Lcom/thetransitapp/droid/controller/RouteViewController;

    invoke-virtual {v0, p0}, Lcom/thetransitapp/droid/controller/RouteViewController;->setCallback(Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;)V

    .line 79
    iget-object v0, p0, Lcom/thetransitapp/droid/RoutesScreen;->viewController:Lcom/thetransitapp/droid/controller/RouteViewController;

    invoke-virtual {v0, p0}, Lcom/thetransitapp/droid/controller/RouteViewController;->setErrorHandler(Lcom/thetransitapp/droid/controller/RouteViewController$ErrorHandler;)V

    .line 80
    iget-object v0, p0, Lcom/thetransitapp/droid/RoutesScreen;->viewController:Lcom/thetransitapp/droid/controller/RouteViewController;

    iget-object v1, p0, Lcom/thetransitapp/droid/RoutesScreen;->routes:Landroid/widget/ListView;

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/controller/RouteViewController;->setListView(Landroid/widget/AbsListView;)V

    .line 82
    iget-object v0, p0, Lcom/thetransitapp/droid/RoutesScreen;->routes:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/thetransitapp/droid/RoutesScreen;->viewController:Lcom/thetransitapp/droid/controller/RouteViewController;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/controller/RouteViewController;->getDataSource()Lcom/thetransitapp/droid/widget/route/RouteAdapter;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 83
    iget-object v0, p0, Lcom/thetransitapp/droid/RoutesScreen;->routes:Landroid/widget/ListView;

    new-instance v1, Lcom/thetransitapp/droid/RoutesScreen$1;

    invoke-direct {v1, p0}, Lcom/thetransitapp/droid/RoutesScreen$1;-><init>(Lcom/thetransitapp/droid/RoutesScreen;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 100
    return-void
.end method

.method public showDirectionPopover(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;Landroid/view/View;)V
    .locals 11
    .param p1, "route"    # Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    .param p2, "relativeTo"    # Landroid/view/View;

    .prologue
    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v9, -0x2

    .line 231
    invoke-super {p0, v8}, Lcom/thetransitapp/droid/BaseMapScreen;->getLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v6

    const v7, 0x7f03001c

    invoke-virtual {v6, v7, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    .line 232
    .local v1, "content":Landroid/widget/LinearLayout;
    const v6, 0x7f05004c

    invoke-virtual {v1, v6}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 234
    .local v4, "distance":Landroid/widget/TextView;
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getRealLocation()Landroid/location/Location;

    move-result-object v6

    if-eqz v6, :cond_0

    .line 235
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v6

    invoke-virtual {v6}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getClosestStop()Lcom/thetransitapp/droid/model/Stop;

    move-result-object v6

    .line 236
    new-instance v7, Lcom/thetransitapp/droid/model/SimplePlacemark;

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getRealLocation()Landroid/location/Location;

    move-result-object v8

    invoke-direct {v7, v8}, Lcom/thetransitapp/droid/model/SimplePlacemark;-><init>(Landroid/location/Location;)V

    invoke-virtual {v6, v7}, Lcom/thetransitapp/droid/model/Stop;->getDistance(Lcom/thetransitapp/droid/model/SimplePlacemark;)F

    move-result v6

    float-to-double v2, v6

    .line 238
    .local v2, "dist":D
    iget-object v6, p0, Lcom/thetransitapp/droid/RoutesScreen;->preferences:Landroid/content/SharedPreferences;

    const-string v7, "useImperialSystem"

    invoke-interface {v6, v7, v10}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v6

    .line 237
    invoke-static {v2, v3, v6}, Lcom/thetransitapp/droid/util/DistanceUtility;->getDistanceString(DZ)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 240
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v5, v9, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 241
    .local v5, "params":Landroid/widget/LinearLayout$LayoutParams;
    const/16 v6, 0x10

    iput v6, v5, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 243
    new-instance v0, Lcom/thetransitapp/droid/ui/CompassView;

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    invoke-direct {v0, v6}, Lcom/thetransitapp/droid/ui/CompassView;-><init>(Landroid/content/Context;)V

    .line 244
    .local v0, "compass":Lcom/thetransitapp/droid/ui/CompassView;
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v6

    invoke-virtual {v6}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLocation()Landroid/location/Location;

    move-result-object v6

    invoke-virtual {v0, v6}, Lcom/thetransitapp/droid/ui/CompassView;->setTarget(Landroid/location/Location;)V

    .line 245
    invoke-virtual {p0}, Lcom/thetransitapp/droid/RoutesScreen;->getRealLocation()Landroid/location/Location;

    move-result-object v6

    invoke-virtual {v0, v6}, Lcom/thetransitapp/droid/ui/CompassView;->setCurrent(Landroid/location/Location;)V

    .line 246
    invoke-virtual {v1, v0, v10, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 248
    const/4 v6, 0x6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-super {p0, v1, p2, v6}, Lcom/thetransitapp/droid/BaseMapScreen;->showPopover(Landroid/view/View;Landroid/view/View;Ljava/lang/Integer;)V

    .line 251
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v6

    new-instance v7, Lcom/thetransitapp/droid/RoutesScreen$3;

    invoke-direct {v7, p0, v0, p1, v4}, Lcom/thetransitapp/droid/RoutesScreen$3;-><init>(Lcom/thetransitapp/droid/RoutesScreen;Lcom/thetransitapp/droid/ui/CompassView;Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;Landroid/widget/TextView;)V

    invoke-virtual {v6, v7}, Lcom/google/android/gms/maps/GoogleMap;->setOnMyLocationChangeListener(Lcom/google/android/gms/maps/GoogleMap$OnMyLocationChangeListener;)V

    .line 264
    .end local v0    # "compass":Lcom/thetransitapp/droid/ui/CompassView;
    .end local v2    # "dist":D
    .end local v5    # "params":Landroid/widget/LinearLayout$LayoutParams;
    :cond_0
    return-void
.end method

.method public showItinerary(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)V
    .locals 2
    .param p1, "route"    # Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    .prologue
    .line 195
    new-instance v0, Lcom/thetransitapp/droid/ItineraryScreen;

    invoke-direct {v0}, Lcom/thetransitapp/droid/ItineraryScreen;-><init>()V

    sget-object v1, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->SCHEDULE_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-direct {p0, v0, p1, v1}, Lcom/thetransitapp/droid/RoutesScreen;->displayScreen(Landroid/support/v4/app/Fragment;Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;Lcom/thetransitapp/droid/TransitActivity$TransitScreen;)V

    .line 196
    return-void
.end method

.method public showSchedules(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)V
    .locals 2
    .param p1, "route"    # Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    .prologue
    .line 200
    new-instance v0, Lcom/thetransitapp/droid/SchedulesScreen;

    invoke-direct {v0}, Lcom/thetransitapp/droid/SchedulesScreen;-><init>()V

    sget-object v1, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->SCHEDULE_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-direct {p0, v0, p1, v1}, Lcom/thetransitapp/droid/RoutesScreen;->displayScreen(Landroid/support/v4/app/Fragment;Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;Lcom/thetransitapp/droid/TransitActivity$TransitScreen;)V

    .line 201
    return-void
.end method

.method public showTimePopover(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;Landroid/view/View;)V
    .locals 15
    .param p1, "route"    # Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    .param p2, "relativeTo"    # Landroid/view/View;

    .prologue
    .line 268
    const/4 v10, 0x0

    invoke-super {p0, v10}, Lcom/thetransitapp/droid/BaseMapScreen;->getLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v10

    const v11, 0x7f03001d

    const/4 v12, 0x0

    invoke-virtual {v10, v11, v12}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout;

    .line 269
    .local v2, "content":Landroid/widget/LinearLayout;
    const/4 v10, 0x3

    new-array v9, v10, [Landroid/widget/TextView;

    const/4 v11, 0x0

    const v10, 0x7f05004d

    invoke-virtual {v2, v10}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/TextView;

    aput-object v10, v9, v11

    const/4 v11, 0x1

    .line 270
    const v10, 0x7f05004e

    invoke-virtual {v2, v10}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/TextView;

    aput-object v10, v9, v11

    const/4 v11, 0x2

    const v10, 0x7f05004f

    invoke-virtual {v2, v10}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/TextView;

    aput-object v10, v9, v11

    .line 272
    .local v9, "times":[Landroid/widget/TextView;
    new-instance v10, Ljava/util/Date;

    invoke-direct {v10}, Ljava/util/Date;-><init>()V

    invoke-virtual {v10}, Ljava/util/Date;->getTime()J

    move-result-wide v7

    .line 273
    .local v7, "now":J
    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v10

    invoke-virtual {v10}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getOngoingScheduleItems()Ljava/util/List;

    move-result-object v5

    .line 275
    .local v5, "items":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    const/4 v3, 0x0

    .line 276
    .local v3, "i":I
    invoke-direct {p0, v5}, Lcom/thetransitapp/droid/RoutesScreen;->calculateMinInterval(Ljava/util/List;)I

    move-result v6

    .line 277
    .local v6, "minInterval":I
    const/4 v1, 0x0

    .line 279
    .local v1, "boldSet":Z
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_0
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-nez v11, :cond_2

    .line 322
    :cond_1
    const/16 v10, 0xa

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    move-object/from16 v0, p2

    invoke-super {p0, v2, v0, v10}, Lcom/thetransitapp/droid/BaseMapScreen;->showPopover(Landroid/view/View;Landroid/view/View;Ljava/lang/Integer;)V

    .line 324
    return-void

    .line 279
    :cond_2
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/thetransitapp/droid/model/ScheduleItem;

    .line 280
    .local v4, "item":Lcom/thetransitapp/droid/model/ScheduleItem;
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/ScheduleItem;->isPastItem()Z

    move-result v11

    if-eqz v11, :cond_8

    .line 281
    if-lez v3, :cond_3

    .line 282
    const/4 v3, 0x0

    .line 285
    :cond_3
    aget-object v11, v9, v3

    const v12, -0x4e4e4f

    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 295
    :cond_4
    :goto_1
    const v11, 0x927c0

    if-gt v6, v11, :cond_9

    .line 296
    aget-object v11, v9, v3

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/ScheduleItem;->getMinutesRemaining()I

    move-result v13

    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v13

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v13, " min"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 301
    :goto_2
    aget-object v11, v9, v3

    const/4 v12, 0x0

    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setVisibility(I)V

    .line 303
    if-lez v3, :cond_5

    .line 304
    add-int/lit8 v11, v3, -0x1

    aget-object v11, v9, v11

    invoke-virtual {v11}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v11

    if-eqz v11, :cond_a

    add-int/lit8 v11, v3, -0x1

    aget-object v11, v9, v11

    invoke-virtual {v11}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v11

    invoke-virtual {v11}, Landroid/graphics/Typeface;->isBold()Z

    move-result v11

    if-eqz v11, :cond_a

    .line 305
    aget-object v11, v9, v3

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, ", "

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v13, v9, v3

    invoke-virtual {v13}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 311
    :cond_5
    :goto_3
    add-int/lit8 v3, v3, 0x1

    const/4 v11, 0x2

    if-gt v3, v11, :cond_1

    .line 315
    const v11, 0x927c0

    if-ge v6, v11, :cond_6

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/ScheduleItem;->isPastItem()Z

    move-result v11

    if-nez v11, :cond_7

    .line 316
    :cond_6
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/ScheduleItem;->isPastItem()Z

    move-result v11

    if-eqz v11, :cond_0

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/ScheduleItem;->getStopTime()Ljava/util/Date;

    move-result-object v11

    invoke-virtual {v11}, Ljava/util/Date;->getTime()J

    move-result-wide v11

    const-wide/32 v13, 0x493e0

    add-long/2addr v11, v13

    cmp-long v11, v11, v7

    if-gez v11, :cond_0

    .line 317
    :cond_7
    const/4 v3, 0x0

    goto/16 :goto_0

    .line 286
    :cond_8
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/ScheduleItem;->getStopTime()Ljava/util/Date;

    move-result-object v11

    invoke-virtual {v11}, Ljava/util/Date;->getTime()J

    move-result-wide v11

    cmp-long v11, v11, v7

    if-lez v11, :cond_4

    .line 287
    aget-object v11, v9, v3

    const v12, -0xe0e0f

    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 289
    if-nez v1, :cond_4

    .line 290
    aget-object v11, v9, v3

    const/4 v12, 0x1

    invoke-static {v12}, Landroid/graphics/Typeface;->defaultFromStyle(I)Landroid/graphics/Typeface;

    move-result-object v12

    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 291
    const/4 v1, 0x1

    goto/16 :goto_1

    .line 298
    :cond_9
    aget-object v11, v9, v3

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v12

    invoke-static {v12}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v12

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/ScheduleItem;->getStopTime()Ljava/util/Date;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    .line 307
    :cond_a
    add-int/lit8 v11, v3, -0x1

    aget-object v11, v9, v11

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 v13, v3, -0x1

    aget-object v13, v9, v13

    invoke-virtual {v13}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, ", "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_3
.end method

.method public toggleFavorite(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)V
    .locals 4
    .param p1, "route"    # Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    .prologue
    .line 355
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutesScreen;->databaseHelper:Lcom/thetransitapp/droid/data/TransitDatabaseHelper;

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getRoute()Lcom/thetransitapp/droid/model/Route;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/thetransitapp/droid/data/TransitDatabaseHelper;->toggleFavorite(Lcom/thetransitapp/droid/model/Route;)V

    .line 357
    iget-boolean v1, p0, Lcom/thetransitapp/droid/RoutesScreen;->favoriteAlertShown:Z

    if-nez v1, :cond_0

    .line 358
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 359
    .local v0, "dialog":Landroid/app/AlertDialog;
    const v1, 0x7f0a005b

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setTitle(I)V

    .line 360
    const v1, 0x7f0a005c

    invoke-virtual {p0, v1}, Lcom/thetransitapp/droid/RoutesScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 361
    const/4 v1, -0x1

    const v2, 0x7f0a002f

    invoke-virtual {p0, v2}, Lcom/thetransitapp/droid/RoutesScreen;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    .line 362
    const/4 v3, 0x0

    .line 361
    invoke-virtual {v0, v1, v2, v3}, Landroid/app/AlertDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 363
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 365
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/thetransitapp/droid/RoutesScreen;->favoriteAlertShown:Z

    .line 367
    .end local v0    # "dialog":Landroid/app/AlertDialog;
    :cond_0
    return-void
.end method

.method public toggleInactiveRoute()V
    .locals 1

    .prologue
    .line 220
    iget-object v0, p0, Lcom/thetransitapp/droid/RoutesScreen;->viewController:Lcom/thetransitapp/droid/controller/RouteViewController;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/controller/RouteViewController;->toggleInactiveRoute()V

    .line 221
    return-void
.end method

.method public viewMovedSideway()V
    .locals 1

    .prologue
    .line 215
    const/4 v0, 0x1

    invoke-super {p0, v0}, Lcom/thetransitapp/droid/BaseMapScreen;->hidePopover(Z)V

    .line 216
    return-void
.end method
