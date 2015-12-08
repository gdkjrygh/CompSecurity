.class public Lcom/thetransitapp/droid/controller/RouteViewController;
.super Ljava/lang/Object;
.source "RouteViewController.java"

# interfaces
.implements Lcom/thetransitapp/droid/service/ServiceCallback;
.implements Lcom/thetransitapp/droid/controller/FeedManager$FeedManagerCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/thetransitapp/droid/controller/RouteViewController$ErrorHandler;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/thetransitapp/droid/service/ServiceCallback",
        "<",
        "Lcom/thetransitapp/droid/model/NearbyRoutesRequest;",
        ">;",
        "Lcom/thetransitapp/droid/controller/FeedManager$FeedManagerCallback;"
    }
.end annotation

.annotation runtime Lroboguice/inject/ContextSingleton;
.end annotation


# static fields
.field private static final REFRESH_DELAY:J = 0x124f80L

.field private static firstOpen:Z


# instance fields
.field private final context:Landroid/content/Context;

.field private final dataSource:Lcom/thetransitapp/droid/widget/route/RouteAdapter;

.field private final databaseHelper:Lcom/thetransitapp/droid/data/TransitDatabaseHelper;

.field private errorHandler:Lcom/thetransitapp/droid/controller/RouteViewController$ErrorHandler;

.field private final feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

.field private final handler:Landroid/os/Handler;

.field private lastInactiveRoutes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Route;",
            ">;"
        }
    .end annotation
.end field

.field private lastRefreshTime:J

.field private lastRoutes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Route;",
            ">;"
        }
    .end annotation
.end field

.field private listView:Landroid/widget/AbsListView;

.field private loading:Z

.field private paused:Z

.field private placemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

.field private final preferences:Landroid/content/SharedPreferences;

.field private refreshStarted:Z

.field private showInactivesRoutes:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 41
    const/4 v0, 0x1

    sput-boolean v0, Lcom/thetransitapp/droid/controller/RouteViewController;->firstOpen:Z

    return-void
.end method

.method public constructor <init>(Lcom/thetransitapp/droid/widget/route/RouteAdapter;Landroid/os/Handler;Landroid/content/Context;Lcom/thetransitapp/droid/controller/FeedManager;Landroid/content/SharedPreferences;Lcom/thetransitapp/droid/data/TransitDatabaseHelper;)V
    .locals 2
    .param p1, "dataSource"    # Lcom/thetransitapp/droid/widget/route/RouteAdapter;
    .param p2, "handler"    # Landroid/os/Handler;
    .param p3, "context"    # Landroid/content/Context;
    .param p4, "feedManager"    # Lcom/thetransitapp/droid/controller/FeedManager;
    .param p5, "preferences"    # Landroid/content/SharedPreferences;
    .param p6, "databaseHelper"    # Lcom/thetransitapp/droid/data/TransitDatabaseHelper;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation

    .prologue
    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    iput-object p1, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->dataSource:Lcom/thetransitapp/droid/widget/route/RouteAdapter;

    .line 71
    iput-object p3, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->context:Landroid/content/Context;

    .line 72
    iput-object p2, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->handler:Landroid/os/Handler;

    .line 73
    iput-object p4, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    .line 74
    iput-object p5, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->preferences:Landroid/content/SharedPreferences;

    .line 75
    iput-object p6, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->databaseHelper:Lcom/thetransitapp/droid/data/TransitDatabaseHelper;

    .line 77
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v0, p0}, Lcom/thetransitapp/droid/controller/FeedManager;->addFeedManagerCallback(Lcom/thetransitapp/droid/controller/FeedManager$FeedManagerCallback;)V

    .line 78
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->lastRefreshTime:J

    .line 79
    return-void
.end method

.method static synthetic access$1(Lcom/thetransitapp/droid/controller/RouteViewController;)Z
    .locals 1

    .prologue
    .line 60
    iget-boolean v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->loading:Z

    return v0
.end method

.method static synthetic access$2(Lcom/thetransitapp/droid/controller/RouteViewController;)Landroid/widget/AbsListView;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->listView:Landroid/widget/AbsListView;

    return-object v0
.end method

.method static synthetic access$3(Lcom/thetransitapp/droid/controller/RouteViewController;)Lcom/thetransitapp/droid/widget/route/RouteAdapter;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->dataSource:Lcom/thetransitapp/droid/widget/route/RouteAdapter;

    return-object v0
.end method

.method static synthetic access$4()Z
    .locals 1

    .prologue
    .line 41
    sget-boolean v0, Lcom/thetransitapp/droid/controller/RouteViewController;->firstOpen:Z

    return v0
.end method

.method static synthetic access$5(Lcom/thetransitapp/droid/controller/RouteViewController;)Landroid/content/SharedPreferences;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->preferences:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method static synthetic access$6(Z)V
    .locals 0

    .prologue
    .line 41
    sput-boolean p0, Lcom/thetransitapp/droid/controller/RouteViewController;->firstOpen:Z

    return-void
.end method

.method static synthetic access$7(Lcom/thetransitapp/droid/controller/RouteViewController;)Lcom/thetransitapp/droid/model/SimplePlacemark;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->placemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

    return-object v0
.end method

.method static synthetic access$8(Lcom/thetransitapp/droid/controller/RouteViewController;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->handler:Landroid/os/Handler;

    return-object v0
.end method

.method private insertRoutes()V
    .locals 8

    .prologue
    .line 241
    iget-object v4, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->dataSource:Lcom/thetransitapp/droid/widget/route/RouteAdapter;

    invoke-virtual {v4}, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->clear()V

    .line 243
    iget-object v4, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->lastRoutes:Ljava/util/List;

    if-eqz v4, :cond_1

    .line 244
    iget-object v4, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->lastRoutes:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_4

    .line 258
    iget-object v4, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->dataSource:Lcom/thetransitapp/droid/widget/route/RouteAdapter;

    new-instance v5, Lcom/thetransitapp/droid/controller/RouteViewController$2;

    invoke-direct {v5, p0}, Lcom/thetransitapp/droid/controller/RouteViewController$2;-><init>(Lcom/thetransitapp/droid/controller/RouteViewController;)V

    invoke-virtual {v4, v5}, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->sort(Ljava/util/Comparator;)V

    .line 274
    :cond_1
    iget-object v4, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->dataSource:Lcom/thetransitapp/droid/widget/route/RouteAdapter;

    new-instance v5, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-direct {v5}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;-><init>()V

    invoke-virtual {v4, v5}, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->addRoute(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)V

    .line 276
    iget-boolean v4, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->showInactivesRoutes:Z

    if-eqz v4, :cond_3

    iget-object v4, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->lastInactiveRoutes:Ljava/util/List;

    if-eqz v4, :cond_3

    iget-object v4, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->lastInactiveRoutes:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_3

    .line 277
    new-instance v0, Ljava/util/ArrayList;

    .line 278
    iget-object v4, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->lastInactiveRoutes:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    .line 277
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 280
    .local v0, "inactiveViewModel":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;>;"
    iget-object v4, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->lastInactiveRoutes:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_6

    .line 292
    new-instance v4, Lcom/thetransitapp/droid/controller/RouteViewController$3;

    invoke-direct {v4, p0}, Lcom/thetransitapp/droid/controller/RouteViewController$3;-><init>(Lcom/thetransitapp/droid/controller/RouteViewController;)V

    invoke-static {v0, v4}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 299
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_8

    .line 303
    iget-object v4, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->listView:Landroid/widget/AbsListView;

    iget-object v5, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->lastRoutes:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    invoke-virtual {v4, v5}, Landroid/widget/AbsListView;->setSelection(I)V

    .line 305
    .end local v0    # "inactiveViewModel":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;>;"
    :cond_3
    return-void

    .line 244
    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/thetransitapp/droid/model/Route;

    .line 245
    .local v2, "route":Lcom/thetransitapp/droid/model/Route;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/Route;->getItineraries()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_0

    .line 246
    new-instance v3, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    iget-object v5, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->placemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

    const/4 v6, 0x0

    iget-object v7, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->databaseHelper:Lcom/thetransitapp/droid/data/TransitDatabaseHelper;

    invoke-direct {v3, v2, v5, v6, v7}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;-><init>(Lcom/thetransitapp/droid/model/Route;Lcom/thetransitapp/droid/model/SimplePlacemark;ZLcom/thetransitapp/droid/data/TransitDatabaseHelper;)V

    .line 248
    .local v3, "viewModel":Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    iget-object v5, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v5}, Lcom/thetransitapp/droid/controller/FeedManager;->isReady()Z

    move-result v5

    if-eqz v5, :cond_5

    .line 249
    iget-object v5, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getRoute()Lcom/thetransitapp/droid/model/Route;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/thetransitapp/droid/controller/FeedManager;->getFeed(Lcom/thetransitapp/droid/model/Route;)Lcom/thetransitapp/droid/model/Feed;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->setFeed(Lcom/thetransitapp/droid/model/Feed;)V

    .line 252
    :cond_5
    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->isActive()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 253
    iget-object v5, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->dataSource:Lcom/thetransitapp/droid/widget/route/RouteAdapter;

    invoke-virtual {v5, v3}, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->addRoute(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)V

    goto/16 :goto_0

    .line 280
    .end local v2    # "route":Lcom/thetransitapp/droid/model/Route;
    .end local v3    # "viewModel":Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    .restart local v0    # "inactiveViewModel":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;>;"
    :cond_6
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/thetransitapp/droid/model/Route;

    .line 281
    .restart local v2    # "route":Lcom/thetransitapp/droid/model/Route;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/Route;->getItineraries()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_2

    .line 282
    new-instance v3, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    iget-object v5, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->placemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

    const/4 v6, 0x1

    iget-object v7, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->databaseHelper:Lcom/thetransitapp/droid/data/TransitDatabaseHelper;

    invoke-direct {v3, v2, v5, v6, v7}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;-><init>(Lcom/thetransitapp/droid/model/Route;Lcom/thetransitapp/droid/model/SimplePlacemark;ZLcom/thetransitapp/droid/data/TransitDatabaseHelper;)V

    .line 284
    .restart local v3    # "viewModel":Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    iget-object v5, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v5}, Lcom/thetransitapp/droid/controller/FeedManager;->isReady()Z

    move-result v5

    if-eqz v5, :cond_7

    .line 285
    iget-object v5, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getRoute()Lcom/thetransitapp/droid/model/Route;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/thetransitapp/droid/controller/FeedManager;->getFeed(Lcom/thetransitapp/droid/model/Route;)Lcom/thetransitapp/droid/model/Feed;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->setFeed(Lcom/thetransitapp/droid/model/Feed;)V

    .line 288
    :cond_7
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 299
    .end local v2    # "route":Lcom/thetransitapp/droid/model/Route;
    .end local v3    # "viewModel":Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    :cond_8
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    .line 300
    .local v1, "model":Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    iget-object v5, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->dataSource:Lcom/thetransitapp/droid/widget/route/RouteAdapter;

    invoke-virtual {v5, v1}, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->addRoute(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)V

    goto/16 :goto_2
.end method

.method private launchRequest(Z)V
    .locals 3
    .param p1, "loadInactive"    # Z

    .prologue
    const/4 v2, 0x1

    .line 217
    new-instance v0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;

    invoke-direct {v0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;-><init>()V

    .line 218
    .local v0, "request":Lcom/thetransitapp/droid/model/NearbyRoutesRequest;
    iget-object v1, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->placemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->setPlacemark(Lcom/thetransitapp/droid/model/SimplePlacemark;)V

    .line 219
    invoke-virtual {v0, p1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->setLoadInactives(Z)V

    .line 221
    iget-object v1, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/controller/FeedManager;->getClosestBundle()Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 222
    iget-object v1, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/controller/FeedManager;->getClosestBundle()Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/thetransitapp/droid/model/TransitBundle;->getBannedTransitParameters(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->setBannedModesParameter(Ljava/lang/String;)V

    .line 225
    :cond_0
    iput-boolean v2, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->loading:Z

    .line 226
    new-instance v1, Lcom/thetransitapp/droid/service/NearbyRoutesTask;

    iget-object v2, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->context:Landroid/content/Context;

    invoke-direct {v1, v2, v0, p0}, Lcom/thetransitapp/droid/service/NearbyRoutesTask;-><init>(Landroid/content/Context;Lcom/thetransitapp/droid/model/NearbyRoutesRequest;Lcom/thetransitapp/droid/service/ServiceCallback;)V

    invoke-virtual {v1}, Lcom/thetransitapp/droid/service/NearbyRoutesTask;->execute()V

    .line 227
    return-void
.end method

.method private shouldRefresh(Landroid/location/Location;)Z
    .locals 9
    .param p1, "location"    # Landroid/location/Location;

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 230
    iget-object v5, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v5}, Lcom/thetransitapp/droid/controller/FeedManager;->isSelectionChanged()Z

    move-result v0

    .line 231
    .local v0, "changed":Z
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    iget-wide v7, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->lastRefreshTime:J

    sub-long/2addr v5, v7

    const-wide/32 v7, 0x124f80

    cmp-long v5, v5, v7

    if-lez v5, :cond_0

    move v2, v3

    .line 233
    .local v2, "oldEnough":Z
    :goto_0
    const/high16 v6, 0x43160000    # 150.0f

    invoke-virtual {p1}, Landroid/location/Location;->hasSpeed()Z

    move-result v5

    if-eqz v5, :cond_1

    const/high16 v5, 0x41200000    # 10.0f

    invoke-virtual {p1}, Landroid/location/Location;->getSpeed()F

    move-result v7

    mul-float/2addr v5, v7

    :goto_1
    add-float v1, v6, v5

    .line 235
    .local v1, "distanceRequiredToUpdate":F
    if-nez v0, :cond_2

    if-nez v2, :cond_2

    iget-object v5, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->placemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

    if-eqz v5, :cond_2

    .line 236
    iget-object v5, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->placemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

    invoke-virtual {v5, p1}, Lcom/thetransitapp/droid/model/SimplePlacemark;->distanceTo(Landroid/location/Location;)F

    move-result v5

    .line 235
    cmpl-float v5, v5, v1

    if-gtz v5, :cond_2

    :goto_2
    return v4

    .end local v1    # "distanceRequiredToUpdate":F
    .end local v2    # "oldEnough":Z
    :cond_0
    move v2, v4

    .line 231
    goto :goto_0

    .line 233
    .restart local v2    # "oldEnough":Z
    :cond_1
    const/4 v5, 0x0

    goto :goto_1

    .restart local v1    # "distanceRequiredToUpdate":F
    :cond_2
    move v4, v3

    .line 235
    goto :goto_2
.end method


# virtual methods
.method public feedUpdated()V
    .locals 1

    .prologue
    .line 191
    iget-boolean v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->paused:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->loading:Z

    if-nez v0, :cond_0

    .line 192
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->lastRoutes:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->lastRoutes:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 194
    invoke-direct {p0}, Lcom/thetransitapp/droid/controller/RouteViewController;->insertRoutes()V

    .line 199
    :cond_0
    :goto_0
    return-void

    .line 196
    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/thetransitapp/droid/controller/RouteViewController;->launchRequest(Z)V

    goto :goto_0
.end method

.method public getDataSource()Lcom/thetransitapp/droid/widget/route/RouteAdapter;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->dataSource:Lcom/thetransitapp/droid/widget/route/RouteAdapter;

    return-object v0
.end method

.method public getDisplayedRoute()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;",
            ">;"
        }
    .end annotation

    .prologue
    .line 202
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 203
    .local v0, "displayed":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;>;"
    iget-object v3, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->listView:Landroid/widget/AbsListView;

    invoke-virtual {v3}, Landroid/widget/AbsListView;->getFirstVisiblePosition()I

    move-result v1

    .line 205
    .local v1, "firstPosition":I
    move v2, v1

    .local v2, "position":I
    :goto_0
    iget-object v3, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->listView:Landroid/widget/AbsListView;

    invoke-virtual {v3}, Landroid/widget/AbsListView;->getLastVisiblePosition()I

    move-result v3

    if-lt v2, v3, :cond_0

    .line 213
    return-object v0

    .line 206
    :cond_0
    iget-object v3, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->dataSource:Lcom/thetransitapp/droid/widget/route/RouteAdapter;

    invoke-virtual {v3}, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->getCount()I

    move-result v3

    if-lt v2, v3, :cond_1

    .line 205
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 210
    :cond_1
    iget-object v3, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->dataSource:Lcom/thetransitapp/droid/widget/route/RouteAdapter;

    invoke-virtual {v3, v2}, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/thetransitapp/droid/widget/route/RouteItem;

    invoke-virtual {v3}, Lcom/thetransitapp/droid/widget/route/RouteItem;->getViewModel()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1
.end method

.method public onError(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 2
    .param p1, "message"    # Ljava/lang/String;
    .param p2, "exception"    # Ljava/lang/Exception;

    .prologue
    .line 168
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->context:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 169
    return-void
.end method

.method public onResult(Lcom/thetransitapp/droid/model/NearbyRoutesRequest;)V
    .locals 5
    .param p1, "result"    # Lcom/thetransitapp/droid/model/NearbyRoutesRequest;

    .prologue
    const/4 v4, 0x1

    const/4 v1, 0x0

    .line 99
    iget-boolean v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->paused:Z

    if-eqz v0, :cond_1

    .line 164
    :cond_0
    :goto_0
    return-void

    .line 103
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->loading:Z

    .line 105
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isLoadInactives()Z

    move-result v0

    if-nez v0, :cond_4

    .line 106
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->errorHandler:Lcom/thetransitapp/droid/controller/RouteViewController$ErrorHandler;

    if-eqz v0, :cond_2

    .line 107
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->errorHandler:Lcom/thetransitapp/droid/controller/RouteViewController$ErrorHandler;

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getError()Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    move-result-object v1

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getErrorTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getErrorMessage()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lcom/thetransitapp/droid/controller/RouteViewController$ErrorHandler;->onError(Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    :cond_2
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getError()Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 111
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->dataSource:Lcom/thetransitapp/droid/widget/route/RouteAdapter;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->clear()V

    goto :goto_0

    .line 115
    :cond_3
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getRoutes()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->lastRoutes:Ljava/util/List;

    .line 126
    :goto_1
    invoke-direct {p0}, Lcom/thetransitapp/droid/controller/RouteViewController;->insertRoutes()V

    .line 128
    iget-boolean v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->refreshStarted:Z

    if-nez v0, :cond_0

    .line 130
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/thetransitapp/droid/controller/RouteViewController$1;

    invoke-direct {v1, p0}, Lcom/thetransitapp/droid/controller/RouteViewController$1;-><init>(Lcom/thetransitapp/droid/controller/RouteViewController;)V

    .line 160
    const-wide/16 v2, 0x3e8

    .line 130
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 162
    iput-boolean v4, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->refreshStarted:Z

    goto :goto_0

    .line 117
    :cond_4
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getInactiveRoutes()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->lastInactiveRoutes:Ljava/util/List;

    .line 119
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getError()Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    move-result-object v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->lastInactiveRoutes:Ljava/util/List;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->lastInactiveRoutes:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 120
    :cond_5
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->dataSource:Lcom/thetransitapp/droid/widget/route/RouteAdapter;

    invoke-virtual {v0, v4}, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->setEmptyInactiveRoute(Z)V

    goto :goto_1

    .line 122
    :cond_6
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->errorHandler:Lcom/thetransitapp/droid/controller/RouteViewController$ErrorHandler;

    invoke-interface {v0, v1, v1, v1}, Lcom/thetransitapp/droid/controller/RouteViewController$ErrorHandler;->onError(Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;

    invoke-virtual {p0, p1}, Lcom/thetransitapp/droid/controller/RouteViewController;->onResult(Lcom/thetransitapp/droid/model/NearbyRoutesRequest;)V

    return-void
.end method

.method public refresh(Landroid/location/Location;Z)V
    .locals 1
    .param p1, "location"    # Landroid/location/Location;
    .param p2, "force"    # Z

    .prologue
    .line 82
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/thetransitapp/droid/controller/RouteViewController;->refresh(Landroid/location/Location;ZZ)V

    .line 83
    return-void
.end method

.method public refresh(Landroid/location/Location;ZZ)V
    .locals 2
    .param p1, "location"    # Landroid/location/Location;
    .param p2, "force"    # Z
    .param p3, "loadInactive"    # Z

    .prologue
    .line 86
    iget-boolean v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->paused:Z

    if-nez v0, :cond_1

    if-nez p2, :cond_0

    invoke-direct {p0, p1}, Lcom/thetransitapp/droid/controller/RouteViewController;->shouldRefresh(Landroid/location/Location;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 87
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->lastRefreshTime:J

    .line 88
    new-instance v0, Lcom/thetransitapp/droid/model/SimplePlacemark;

    invoke-direct {v0, p1}, Lcom/thetransitapp/droid/model/SimplePlacemark;-><init>(Landroid/location/Location;)V

    iput-object v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->placemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

    .line 89
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    iget-object v1, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->context:Landroid/content/Context;

    invoke-virtual {v0, p1, v1}, Lcom/thetransitapp/droid/controller/FeedManager;->refresh(Landroid/location/Location;Landroid/content/Context;)V

    .line 91
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/controller/FeedManager;->isReady()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 92
    invoke-direct {p0, p3}, Lcom/thetransitapp/droid/controller/RouteViewController;->launchRequest(Z)V

    .line 95
    :cond_1
    return-void
.end method

.method public setCallback(Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;)V
    .locals 1
    .param p1, "callback"    # Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;

    .prologue
    .line 172
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->dataSource:Lcom/thetransitapp/droid/widget/route/RouteAdapter;

    invoke-virtual {v0, p1}, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->setCallback(Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;)V

    .line 173
    return-void
.end method

.method public setErrorHandler(Lcom/thetransitapp/droid/controller/RouteViewController$ErrorHandler;)V
    .locals 0
    .param p1, "errorHandler"    # Lcom/thetransitapp/droid/controller/RouteViewController$ErrorHandler;

    .prologue
    .line 54
    iput-object p1, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->errorHandler:Lcom/thetransitapp/droid/controller/RouteViewController$ErrorHandler;

    return-void
.end method

.method public setListView(Landroid/widget/AbsListView;)V
    .locals 0
    .param p1, "listView"    # Landroid/widget/AbsListView;

    .prologue
    .line 56
    iput-object p1, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->listView:Landroid/widget/AbsListView;

    return-void
.end method

.method public setPaused(Z)V
    .locals 0
    .param p1, "paused"    # Z

    .prologue
    .line 63
    iput-boolean p1, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->paused:Z

    return-void
.end method

.method public toggleInactiveRoute()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 176
    iget-boolean v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->showInactivesRoutes:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->showInactivesRoutes:Z

    .line 178
    iget-boolean v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->showInactivesRoutes:Z

    if-eqz v0, :cond_1

    .line 179
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->placemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLocation()Landroid/location/Location;

    move-result-object v0

    invoke-virtual {p0, v0, v1, v1}, Lcom/thetransitapp/droid/controller/RouteViewController;->refresh(Landroid/location/Location;ZZ)V

    .line 187
    :goto_1
    return-void

    :cond_0
    move v0, v1

    .line 176
    goto :goto_0

    .line 181
    :cond_1
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->lastInactiveRoutes:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 182
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/RouteViewController;->lastInactiveRoutes:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 185
    :cond_2
    invoke-direct {p0}, Lcom/thetransitapp/droid/controller/RouteViewController;->insertRoutes()V

    goto :goto_1
.end method
