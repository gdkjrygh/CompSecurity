.class public Lcom/thetransitapp/droid/model/realtime/FeedRealTimeDataSource;
.super Ljava/lang/Object;
.source "FeedRealTimeDataSource.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private dataSources:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 14
    .local p1, "dataSources":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/FeedRealTimeDataSource;->dataSources:Ljava/util/ArrayList;

    .line 16
    return-void
.end method


# virtual methods
.method public dataSourceForRoute(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;
    .locals 5
    .param p1, "route"    # Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    .prologue
    .line 19
    iget-object v3, p0, Lcom/thetransitapp/droid/model/realtime/FeedRealTimeDataSource;->dataSources:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    .line 20
    iget-object v3, p0, Lcom/thetransitapp/droid/model/realtime/FeedRealTimeDataSource;->dataSources:Ljava/util/ArrayList;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;

    .line 30
    :goto_0
    return-object v3

    .line 22
    :cond_0
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getType()Lcom/thetransitapp/droid/model/Route$RouteType;

    move-result-object v2

    .line 23
    .local v2, "type":Lcom/thetransitapp/droid/model/Route$RouteType;
    iget-object v3, p0, Lcom/thetransitapp/droid/model/realtime/FeedRealTimeDataSource;->dataSources:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_2

    .line 30
    const/4 v3, 0x0

    goto :goto_0

    .line 23
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;

    .line 24
    .local v0, "dataSource":Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/Route$RouteType;->ordinal()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 25
    .local v1, "integerType":Ljava/lang/Integer;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getRouteTypes()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    move-object v3, v0

    .line 26
    goto :goto_0
.end method
