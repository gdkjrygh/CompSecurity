.class Lcom/aetn/history/android/historyhere/model/InitializationManager$7;
.super Ljava/lang/Object;
.source "InitializationManager.java"

# interfaces
.implements Lcom/aetn/history/android/historyhere/model/PoiManager$AllToursDataLoadedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/model/InitializationManager;->loadAllTours()V
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
    .line 272
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/InitializationManager$7;->this$0:Lcom/aetn/history/android/historyhere/model/InitializationManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDataLoadFailed()V
    .locals 2

    .prologue
    .line 280
    const-string v0, "InitializationManager"

    const-string v1, "loadAllTours: onDataLoadFailed"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/InitializationManager$7;->this$0:Lcom/aetn/history/android/historyhere/model/InitializationManager;

    # invokes: Lcom/aetn/history/android/historyhere/model/InitializationManager;->hasFinishedInitialization()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/InitializationManager;->access$700(Lcom/aetn/history/android/historyhere/model/InitializationManager;)V

    .line 282
    return-void
.end method

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
    .line 275
    .local p1, "newList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    const-string v0, "InitializationManager"

    const-string v1, "loadAllTours.AllToursDataLoadedListener: onDataLoaded: successfully loaded the tours - we\'re inited!"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/InitializationManager$7;->this$0:Lcom/aetn/history/android/historyhere/model/InitializationManager;

    # invokes: Lcom/aetn/history/android/historyhere/model/InitializationManager;->hasFinishedInitialization()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/InitializationManager;->access$700(Lcom/aetn/history/android/historyhere/model/InitializationManager;)V

    .line 277
    return-void
.end method
