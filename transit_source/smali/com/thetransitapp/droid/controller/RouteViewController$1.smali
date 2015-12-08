.class Lcom/thetransitapp/droid/controller/RouteViewController$1;
.super Ljava/lang/Object;
.source "RouteViewController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/controller/RouteViewController;->onResult(Lcom/thetransitapp/droid/model/NearbyRoutesRequest;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/controller/RouteViewController;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/controller/RouteViewController;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/controller/RouteViewController$1;->this$0:Lcom/thetransitapp/droid/controller/RouteViewController;

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 133
    iget-object v3, p0, Lcom/thetransitapp/droid/controller/RouteViewController$1;->this$0:Lcom/thetransitapp/droid/controller/RouteViewController;

    # getter for: Lcom/thetransitapp/droid/controller/RouteViewController;->loading:Z
    invoke-static {v3}, Lcom/thetransitapp/droid/controller/RouteViewController;->access$1(Lcom/thetransitapp/droid/controller/RouteViewController;)Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v3, p0, Lcom/thetransitapp/droid/controller/RouteViewController$1;->this$0:Lcom/thetransitapp/droid/controller/RouteViewController;

    # getter for: Lcom/thetransitapp/droid/controller/RouteViewController;->listView:Landroid/widget/AbsListView;
    invoke-static {v3}, Lcom/thetransitapp/droid/controller/RouteViewController;->access$2(Lcom/thetransitapp/droid/controller/RouteViewController;)Landroid/widget/AbsListView;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/thetransitapp/droid/controller/RouteViewController$1;->this$0:Lcom/thetransitapp/droid/controller/RouteViewController;

    # getter for: Lcom/thetransitapp/droid/controller/RouteViewController;->listView:Landroid/widget/AbsListView;
    invoke-static {v3}, Lcom/thetransitapp/droid/controller/RouteViewController;->access$2(Lcom/thetransitapp/droid/controller/RouteViewController;)Landroid/widget/AbsListView;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/AbsListView;->isShown()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 134
    iget-object v3, p0, Lcom/thetransitapp/droid/controller/RouteViewController$1;->this$0:Lcom/thetransitapp/droid/controller/RouteViewController;

    # getter for: Lcom/thetransitapp/droid/controller/RouteViewController;->listView:Landroid/widget/AbsListView;
    invoke-static {v3}, Lcom/thetransitapp/droid/controller/RouteViewController;->access$2(Lcom/thetransitapp/droid/controller/RouteViewController;)Landroid/widget/AbsListView;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/AbsListView;->getFirstVisiblePosition()I

    move-result v0

    .line 136
    .local v0, "firstPosition":I
    move v2, v0

    .local v2, "position":I
    :goto_0
    iget-object v3, p0, Lcom/thetransitapp/droid/controller/RouteViewController$1;->this$0:Lcom/thetransitapp/droid/controller/RouteViewController;

    # getter for: Lcom/thetransitapp/droid/controller/RouteViewController;->listView:Landroid/widget/AbsListView;
    invoke-static {v3}, Lcom/thetransitapp/droid/controller/RouteViewController;->access$2(Lcom/thetransitapp/droid/controller/RouteViewController;)Landroid/widget/AbsListView;

    move-result-object v3

    .line 137
    invoke-virtual {v3}, Landroid/widget/AbsListView;->getLastVisiblePosition()I

    move-result v3

    .line 136
    if-lt v2, v3, :cond_1

    .line 153
    iget-object v3, p0, Lcom/thetransitapp/droid/controller/RouteViewController$1;->this$0:Lcom/thetransitapp/droid/controller/RouteViewController;

    # getter for: Lcom/thetransitapp/droid/controller/RouteViewController;->placemark:Lcom/thetransitapp/droid/model/SimplePlacemark;
    invoke-static {v3}, Lcom/thetransitapp/droid/controller/RouteViewController;->access$7(Lcom/thetransitapp/droid/controller/RouteViewController;)Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 154
    iget-object v3, p0, Lcom/thetransitapp/droid/controller/RouteViewController$1;->this$0:Lcom/thetransitapp/droid/controller/RouteViewController;

    iget-object v4, p0, Lcom/thetransitapp/droid/controller/RouteViewController$1;->this$0:Lcom/thetransitapp/droid/controller/RouteViewController;

    # getter for: Lcom/thetransitapp/droid/controller/RouteViewController;->placemark:Lcom/thetransitapp/droid/model/SimplePlacemark;
    invoke-static {v4}, Lcom/thetransitapp/droid/controller/RouteViewController;->access$7(Lcom/thetransitapp/droid/controller/RouteViewController;)Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v4

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLocation()Landroid/location/Location;

    move-result-object v4

    invoke-virtual {v3, v4, v5}, Lcom/thetransitapp/droid/controller/RouteViewController;->refresh(Landroid/location/Location;Z)V

    .line 158
    .end local v0    # "firstPosition":I
    .end local v2    # "position":I
    :cond_0
    iget-object v3, p0, Lcom/thetransitapp/droid/controller/RouteViewController$1;->this$0:Lcom/thetransitapp/droid/controller/RouteViewController;

    # getter for: Lcom/thetransitapp/droid/controller/RouteViewController;->handler:Landroid/os/Handler;
    invoke-static {v3}, Lcom/thetransitapp/droid/controller/RouteViewController;->access$8(Lcom/thetransitapp/droid/controller/RouteViewController;)Landroid/os/Handler;

    move-result-object v3

    const-wide/16 v4, 0x1388

    invoke-virtual {v3, p0, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 159
    return-void

    .line 138
    .restart local v0    # "firstPosition":I
    .restart local v2    # "position":I
    :cond_1
    iget-object v3, p0, Lcom/thetransitapp/droid/controller/RouteViewController$1;->this$0:Lcom/thetransitapp/droid/controller/RouteViewController;

    # getter for: Lcom/thetransitapp/droid/controller/RouteViewController;->dataSource:Lcom/thetransitapp/droid/widget/route/RouteAdapter;
    invoke-static {v3}, Lcom/thetransitapp/droid/controller/RouteViewController;->access$3(Lcom/thetransitapp/droid/controller/RouteViewController;)Lcom/thetransitapp/droid/widget/route/RouteAdapter;

    move-result-object v3

    invoke-virtual {v3}, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->getCount()I

    move-result v3

    if-lt v2, v3, :cond_3

    .line 137
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 142
    :cond_3
    iget-object v3, p0, Lcom/thetransitapp/droid/controller/RouteViewController$1;->this$0:Lcom/thetransitapp/droid/controller/RouteViewController;

    # getter for: Lcom/thetransitapp/droid/controller/RouteViewController;->dataSource:Lcom/thetransitapp/droid/widget/route/RouteAdapter;
    invoke-static {v3}, Lcom/thetransitapp/droid/controller/RouteViewController;->access$3(Lcom/thetransitapp/droid/controller/RouteViewController;)Lcom/thetransitapp/droid/widget/route/RouteAdapter;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thetransitapp/droid/widget/route/RouteItem;

    .line 143
    .local v1, "item":Lcom/thetransitapp/droid/widget/route/RouteItem;
    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/route/RouteItem;->refreshView()V

    .line 145
    # getter for: Lcom/thetransitapp/droid/controller/RouteViewController;->firstOpen:Z
    invoke-static {}, Lcom/thetransitapp/droid/controller/RouteViewController;->access$4()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, 0x1

    if-lt v2, v3, :cond_2

    .line 146
    iget-object v3, p0, Lcom/thetransitapp/droid/controller/RouteViewController$1;->this$0:Lcom/thetransitapp/droid/controller/RouteViewController;

    # getter for: Lcom/thetransitapp/droid/controller/RouteViewController;->preferences:Landroid/content/SharedPreferences;
    invoke-static {v3}, Lcom/thetransitapp/droid/controller/RouteViewController;->access$5(Lcom/thetransitapp/droid/controller/RouteViewController;)Landroid/content/SharedPreferences;

    move-result-object v3

    const-string v4, "menuPressed"

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    if-nez v3, :cond_2

    .line 147
    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/route/RouteItem;->animateMenu()V

    .line 148
    iget-object v3, p0, Lcom/thetransitapp/droid/controller/RouteViewController$1;->this$0:Lcom/thetransitapp/droid/controller/RouteViewController;

    # getter for: Lcom/thetransitapp/droid/controller/RouteViewController;->dataSource:Lcom/thetransitapp/droid/widget/route/RouteAdapter;
    invoke-static {v3}, Lcom/thetransitapp/droid/controller/RouteViewController;->access$3(Lcom/thetransitapp/droid/controller/RouteViewController;)Lcom/thetransitapp/droid/widget/route/RouteAdapter;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/thetransitapp/droid/widget/route/RouteAdapter;->setLastOpen(Lcom/thetransitapp/droid/widget/route/RouteItem;)V

    .line 149
    invoke-static {v5}, Lcom/thetransitapp/droid/controller/RouteViewController;->access$6(Z)V

    goto :goto_1
.end method
