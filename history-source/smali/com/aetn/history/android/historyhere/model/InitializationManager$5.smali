.class Lcom/aetn/history/android/historyhere/model/InitializationManager$5;
.super Ljava/lang/Object;
.source "InitializationManager.java"

# interfaces
.implements Lcom/aetn/history/android/historyhere/model/PoiManager$LimitedDataLoadedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/model/InitializationManager;->checkForLatestRecords()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/model/InitializationManager;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/model/InitializationManager;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/model/InitializationManager;

    .prologue
    .line 220
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/InitializationManager$5;->this$0:Lcom/aetn/history/android/historyhere/model/InitializationManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDataLoaded(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 223
    .local p1, "data":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    const-string v0, "InitializationManager"

    const-string v1, "checkForLatestRecords.onDataLoaded()"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 226
    const-string v0, "InitializationManager"

    const-string v1, "checkForLatestRecords.onDataLoaded(): we have data so update it"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/InitializationManager$5;->this$0:Lcom/aetn/history/android/historyhere/model/InitializationManager;

    # invokes: Lcom/aetn/history/android/historyhere/model/InitializationManager;->updateLimitedData(Ljava/util/ArrayList;)V
    invoke-static {v0, p1}, Lcom/aetn/history/android/historyhere/model/InitializationManager;->access$600(Lcom/aetn/history/android/historyhere/model/InitializationManager;Ljava/util/ArrayList;)V

    .line 232
    :goto_0
    return-void

    .line 229
    :cond_0
    const-string v0, "InitializationManager"

    const-string v1, "checkForLatestRecords.onDataLoaded(): we have NO NEW data so load tours"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/InitializationManager$5;->this$0:Lcom/aetn/history/android/historyhere/model/InitializationManager;

    # invokes: Lcom/aetn/history/android/historyhere/model/InitializationManager;->loadAllTours()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/InitializationManager;->access$500(Lcom/aetn/history/android/historyhere/model/InitializationManager;)V

    goto :goto_0
.end method
