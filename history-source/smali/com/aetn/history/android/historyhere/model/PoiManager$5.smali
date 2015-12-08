.class Lcom/aetn/history/android/historyhere/model/PoiManager$5;
.super Ljava/lang/Object;
.source "PoiManager.java"

# interfaces
.implements Lcom/android/volley/Response$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/model/PoiManager;->loadLimitedListFromDataDump(Landroid/content/Context;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/volley/Response$Listener",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/model/PoiManager;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/model/PoiManager;

    .prologue
    .line 460
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$5;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onResponse(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 460
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/model/PoiManager$5;->onResponse(Ljava/lang/String;)V

    return-void
.end method

.method public onResponse(Ljava/lang/String;)V
    .locals 3
    .param p1, "response"    # Ljava/lang/String;

    .prologue
    .line 463
    new-instance v0, Lcom/aetn/history/android/historyhere/model/PoiManager$LoadLimitedDataFromDataDumpTask;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$5;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    invoke-direct {v0, v1}, Lcom/aetn/history/android/historyhere/model/PoiManager$LoadLimitedDataFromDataDumpTask;-><init>(Lcom/aetn/history/android/historyhere/model/PoiManager;)V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/model/PoiManager$LoadLimitedDataFromDataDumpTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 464
    return-void
.end method
