.class Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoLookupRequestReceiver;
.super Landroid/content/BroadcastReceiver;
.source "HistoryHereApplication.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/HistoryHereApplication;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "GeoLookupRequestReceiver"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/HistoryHereApplication;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/HistoryHereApplication;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    .prologue
    .line 306
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoLookupRequestReceiver;->this$0:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 309
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoLookupRequestReceiver;->this$0:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoLookupRequestReceiver;->this$0:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    # getter for: Lcom/aetn/history/android/historyhere/HistoryHereApplication;->geoLookupRequestReceiver:Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoLookupRequestReceiver;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->access$000(Lcom/aetn/history/android/historyhere/HistoryHereApplication;)Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoLookupRequestReceiver;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 311
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoLookupRequestReceiver;->this$0:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->clearPreviousSearchValues()V

    .line 312
    # getter for: Lcom/aetn/history/android/historyhere/HistoryHereApplication;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->access$100()Ljava/lang/String;

    move-result-object v1

    const-string v2, "GeoLookupRequestReceiver: received"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 314
    .local v0, "extras":Landroid/os/Bundle;
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoLookupRequestReceiver;->this$0:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    const-string v2, "searchString"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    # setter for: Lcom/aetn/history/android/historyhere/HistoryHereApplication;->currentSearchString:Ljava/lang/String;
    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->access$202(Lcom/aetn/history/android/historyhere/HistoryHereApplication;Ljava/lang/String;)Ljava/lang/String;

    .line 315
    # getter for: Lcom/aetn/history/android/historyhere/HistoryHereApplication;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->access$100()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "The search string is: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoLookupRequestReceiver;->this$0:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    # getter for: Lcom/aetn/history/android/historyhere/HistoryHereApplication;->currentSearchString:Ljava/lang/String;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->access$200(Lcom/aetn/history/android/historyhere/HistoryHereApplication;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 317
    new-instance v1, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoAddressLookup;

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoLookupRequestReceiver;->this$0:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-direct {v1, v2}, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoAddressLookup;-><init>(Lcom/aetn/history/android/historyhere/HistoryHereApplication;)V

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoLookupRequestReceiver;->this$0:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    # getter for: Lcom/aetn/history/android/historyhere/HistoryHereApplication;->currentSearchString:Ljava/lang/String;
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->access$200(Lcom/aetn/history/android/historyhere/HistoryHereApplication;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {v1, v2}, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoAddressLookup;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 318
    return-void
.end method
