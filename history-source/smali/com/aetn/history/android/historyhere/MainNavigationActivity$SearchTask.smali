.class Lcom/aetn/history/android/historyhere/MainNavigationActivity$SearchTask;
.super Landroid/os/AsyncTask;
.source "MainNavigationActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/MainNavigationActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "SearchTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Integer;",
        "Ljava/util/List",
        "<",
        "Landroid/location/Address;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/MainNavigationActivity;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    .prologue
    .line 1002
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$SearchTask;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1002
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity$SearchTask;->doInBackground([Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/String;)Ljava/util/List;
    .locals 7
    .param p1, "searchString"    # [Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Landroid/location/Address;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1005
    const/4 v0, 0x0

    .line 1007
    .local v0, "addressFromSearch":Ljava/util/List;, "Ljava/util/List<Landroid/location/Address;>;"
    const/4 v3, 0x0

    .line 1008
    .local v3, "requestNumber":I
    :try_start_0
    new-instance v2, Landroid/location/Geocoder;

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$SearchTask;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    # getter for: Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mContext:Landroid/content/Context;
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->access$200(Lcom/aetn/history/android/historyhere/MainNavigationActivity;)Landroid/content/Context;

    move-result-object v4

    invoke-direct {v2, v4}, Landroid/location/Geocoder;-><init>(Landroid/content/Context;)V

    .line 1009
    .local v2, "geocoder":Landroid/location/Geocoder;
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$SearchTask;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    # getter for: Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->access$000(Lcom/aetn/history/android/historyhere/MainNavigationActivity;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "the geocoder: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1010
    const/4 v4, 0x0

    aget-object v4, p1, v4

    const/4 v5, 0x1

    invoke-virtual {v2, v4, v5}, Landroid/location/Geocoder;->getFromLocationName(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v0

    .line 1011
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$SearchTask;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    # getter for: Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->access$000(Lcom/aetn/history/android/historyhere/MainNavigationActivity;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "addressFromSearch: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1012
    :cond_0
    if-nez v0, :cond_1

    .line 1013
    const/4 v4, 0x0

    aget-object v4, p1, v4

    const/4 v5, 0x1

    invoke-virtual {v2, v4, v5}, Landroid/location/Geocoder;->getFromLocationName(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v0

    .line 1014
    add-int/lit8 v3, v3, 0x1

    .line 1016
    const/16 v4, 0xa

    if-ne v3, v4, :cond_0

    .line 1018
    :cond_1
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$SearchTask;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    # getter for: Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->access$000(Lcom/aetn/history/android/historyhere/MainNavigationActivity;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "SearchTask -- the address is: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const/4 v6, 0x0

    aget-object v6, p1, v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1019
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$SearchTask;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    # getter for: Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->access$000(Lcom/aetn/history/android/historyhere/MainNavigationActivity;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "SearchTask -- request #: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 1028
    .end local v2    # "geocoder":Landroid/location/Geocoder;
    :goto_0
    return-object v0

    .line 1020
    :catch_0
    move-exception v1

    .line 1021
    .local v1, "e":Ljava/io/IOException;
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$SearchTask;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    # getter for: Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->access$000(Lcom/aetn/history/android/historyhere/MainNavigationActivity;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "IOException: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1022
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    .line 1023
    const/4 v0, 0x0

    .line 1027
    goto :goto_0

    .line 1024
    .end local v1    # "e":Ljava/io/IOException;
    :catch_1
    move-exception v1

    .line 1025
    .local v1, "e":Ljava/lang/Exception;
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$SearchTask;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    # getter for: Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->access$000(Lcom/aetn/history/android/historyhere/MainNavigationActivity;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "SearchTask -- exception: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1026
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1002
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity$SearchTask;->onPostExecute(Ljava/util/List;)V

    return-void
.end method

.method protected onPostExecute(Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Landroid/location/Address;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1039
    .local p1, "addressFromSearch":Ljava/util/List;, "Ljava/util/List<Landroid/location/Address;>;"
    iget-object v8, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$SearchTask;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    # getter for: Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mApp:Lcom/aetn/history/android/historyhere/HistoryHereApplication;
    invoke-static {v8}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->access$300(Lcom/aetn/history/android/historyhere/MainNavigationActivity;)Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    move-result-object v8

    invoke-virtual {v8}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->hideMessageBox()V

    .line 1042
    iget-object v8, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$SearchTask;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    # getter for: Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;
    invoke-static {v8}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->access$000(Lcom/aetn/history/android/historyhere/MainNavigationActivity;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "SearchTask:onPostExecute()"

    invoke-static {v8, v9}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1043
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v8

    const/4 v9, 0x1

    if-ge v8, v9, :cond_1

    .line 1044
    :cond_0
    iget-object v8, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$SearchTask;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    # getter for: Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;
    invoke-static {v8}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->access$000(Lcom/aetn/history/android/historyhere/MainNavigationActivity;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "error in search, try doGeoLookup: "

    invoke-static {v8, v9}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1045
    iget-object v8, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$SearchTask;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    # getter for: Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mApp:Lcom/aetn/history/android/historyhere/HistoryHereApplication;
    invoke-static {v8}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->access$300(Lcom/aetn/history/android/historyhere/MainNavigationActivity;)Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    move-result-object v8

    iget-object v9, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$SearchTask;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    # getter for: Lcom/aetn/history/android/historyhere/MainNavigationActivity;->currentSearchString:Ljava/lang/String;
    invoke-static {v9}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->access$400(Lcom/aetn/history/android/historyhere/MainNavigationActivity;)Ljava/lang/String;

    move-result-object v9

    iget-object v10, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$SearchTask;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    # getter for: Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mContext:Landroid/content/Context;
    invoke-static {v10}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->access$200(Lcom/aetn/history/android/historyhere/MainNavigationActivity;)Landroid/content/Context;

    move-result-object v10

    invoke-virtual {v8, v9, v10}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->doGeoLookup(Ljava/lang/String;Landroid/content/Context;)V

    .line 1047
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 1048
    .local v6, "params2":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v8, "lookup_type"

    const-string v9, "location_from_address"

    invoke-interface {v6, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1049
    const-string v8, "search_term"

    iget-object v9, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$SearchTask;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    # getter for: Lcom/aetn/history/android/historyhere/MainNavigationActivity;->currentSearchString:Ljava/lang/String;
    invoke-static {v9}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->access$400(Lcom/aetn/history/android/historyhere/MainNavigationActivity;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v6, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1051
    iget-object v8, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$SearchTask;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    const-string v9, "GmapLimitedApi"

    invoke-virtual {v8, v9, v6}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tagLocalyticsEvent(Ljava/lang/String;Ljava/util/Map;)V

    .line 1081
    .end local v6    # "params2":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    :goto_0
    return-void

    .line 1055
    :cond_1
    const/4 v8, 0x0

    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/location/Address;

    .line 1057
    .local v2, "firstAddress":Landroid/location/Address;
    iget-object v8, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$SearchTask;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    # getter for: Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;
    invoke-static {v8}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->access$000(Lcom/aetn/history/android/historyhere/MainNavigationActivity;)Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "SearchTask:onPostExecute: firstAddress: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1059
    invoke-virtual {v2}, Landroid/location/Address;->getLatitude()D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    .line 1060
    .local v3, "lat":Ljava/lang/Double;
    invoke-virtual {v2}, Landroid/location/Address;->getLongitude()D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    .line 1061
    .local v4, "lng":Ljava/lang/Double;
    const/4 v7, 0x0

    .line 1062
    .local v7, "searchError":Z
    invoke-virtual {v2}, Landroid/location/Address;->getCountryCode()Ljava/lang/String;

    move-result-object v0

    .line 1063
    .local v0, "country":Ljava/lang/String;
    if-nez v0, :cond_3

    .line 1064
    const/4 v7, 0x1

    .line 1068
    :cond_2
    :goto_1
    if-eqz v7, :cond_4

    .line 1070
    new-instance v1, Lcom/aetn/history/android/historyhere/dialogs/NoResultsDialogFragment;

    invoke-direct {v1}, Lcom/aetn/history/android/historyhere/dialogs/NoResultsDialogFragment;-><init>()V

    .line 1071
    .local v1, "dialog":Lcom/aetn/history/android/historyhere/dialogs/NoResultsDialogFragment;
    iget-object v8, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$SearchTask;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v8}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v8

    const-string v9, "NoResultsDialogFragment"

    invoke-virtual {v1, v8, v9}, Lcom/aetn/history/android/historyhere/dialogs/NoResultsDialogFragment;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    goto :goto_0

    .line 1065
    .end local v1    # "dialog":Lcom/aetn/history/android/historyhere/dialogs/NoResultsDialogFragment;
    :cond_3
    const-string v8, "US"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_2

    .line 1066
    const/4 v7, 0x1

    goto :goto_1

    .line 1075
    :cond_4
    new-instance v5, Landroid/location/Location;

    const-string v8, "searchResults"

    invoke-direct {v5, v8}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    .line 1076
    .local v5, "loc":Landroid/location/Location;
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v8

    invoke-virtual {v5, v8, v9}, Landroid/location/Location;->setLatitude(D)V

    .line 1077
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v8

    invoke-virtual {v5, v8, v9}, Landroid/location/Location;->setLongitude(D)V

    .line 1078
    iget-object v8, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$SearchTask;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v8, v5}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->showMap(Landroid/location/Location;)V

    goto :goto_0
.end method

.method protected varargs onProgressUpdate([Ljava/lang/Integer;)V
    .locals 0
    .param p1, "values"    # [Ljava/lang/Integer;

    .prologue
    .line 1033
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onProgressUpdate([Ljava/lang/Object;)V

    .line 1035
    return-void
.end method

.method protected bridge synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1002
    check-cast p1, [Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity$SearchTask;->onProgressUpdate([Ljava/lang/Integer;)V

    return-void
.end method
