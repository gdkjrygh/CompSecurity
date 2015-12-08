.class Lcom/aetn/history/android/historyhere/model/InitializationManager$4;
.super Ljava/lang/Object;
.source "InitializationManager.java"

# interfaces
.implements Lcom/aetn/history/android/historyhere/model/PoiManager$InitialDataLoadedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/model/InitializationManager;->loadDataFromDataDump()V
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
    .line 199
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/InitializationManager$4;->this$0:Lcom/aetn/history/android/historyhere/model/InitializationManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDataLoaded()V
    .locals 2

    .prologue
    .line 202
    const-string v0, "InitializationManager"

    const-string v1, "loadDataFromDisk.onDataLoaded()"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    # getter for: Lcom/aetn/history/android/historyhere/model/InitializationManager;->mContext:Landroid/content/Context;
    invoke-static {}, Lcom/aetn/history/android/historyhere/model/InitializationManager;->access$300()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->setFirstRun(Landroid/content/Context;)V

    .line 206
    # getter for: Lcom/aetn/history/android/historyhere/model/InitializationManager;->mContext:Landroid/content/Context;
    invoke-static {}, Lcom/aetn/history/android/historyhere/model/InitializationManager;->access$300()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lcom/aetn/history/android/historyhere/utils/Utils;->getDateAsISO8601String()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->setFullDatabaseRefreshDate(Landroid/content/Context;Ljava/lang/String;)V

    .line 207
    # getter for: Lcom/aetn/history/android/historyhere/model/InitializationManager;->mContext:Landroid/content/Context;
    invoke-static {}, Lcom/aetn/history/android/historyhere/model/InitializationManager;->access$300()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lcom/aetn/history/android/historyhere/utils/Utils;->getDateAsISO8601String()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->setLimitedDatabaseUpdateDate(Landroid/content/Context;Ljava/lang/String;)V

    .line 209
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/InitializationManager$4;->this$0:Lcom/aetn/history/android/historyhere/model/InitializationManager;

    # invokes: Lcom/aetn/history/android/historyhere/model/InitializationManager;->loadAllTours()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/InitializationManager;->access$500(Lcom/aetn/history/android/historyhere/model/InitializationManager;)V

    .line 210
    return-void
.end method
