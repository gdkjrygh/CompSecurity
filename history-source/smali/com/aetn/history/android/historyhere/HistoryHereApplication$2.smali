.class Lcom/aetn/history/android/historyhere/HistoryHereApplication$2;
.super Ljava/lang/Object;
.source "HistoryHereApplication.java"

# interfaces
.implements Lcom/android/volley/Response$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/HistoryHereApplication;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/HistoryHereApplication;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/HistoryHereApplication;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    .prologue
    .line 444
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication$2;->this$0:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(Ljava/lang/Object;)V
    .locals 5
    .param p1, "response"    # Ljava/lang/Object;

    .prologue
    .line 447
    # getter for: Lcom/aetn/history/android/historyhere/HistoryHereApplication;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->access$100()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "loadConfig(): we have the response:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 449
    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    .line 452
    .local v1, "gson":Lcom/google/gson/Gson;
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const-class v3, Lcom/aetn/history/android/historyhere/model/Configuration;

    invoke-virtual {v1, v2, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/aetn/history/android/historyhere/model/Configuration;

    # setter for: Lcom/aetn/history/android/historyhere/HistoryHereApplication;->mConfiguration:Lcom/aetn/history/android/historyhere/model/Configuration;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->access$302(Lcom/aetn/history/android/historyhere/model/Configuration;)Lcom/aetn/history/android/historyhere/model/Configuration;

    .line 453
    # getter for: Lcom/aetn/history/android/historyhere/HistoryHereApplication;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->access$100()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "loadConfig():the class is parsed:version: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    # getter for: Lcom/aetn/history/android/historyhere/HistoryHereApplication;->mConfiguration:Lcom/aetn/history/android/historyhere/model/Configuration;
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->access$300()Lcom/aetn/history/android/historyhere/model/Configuration;

    move-result-object v4

    iget-object v4, v4, Lcom/aetn/history/android/historyhere/model/Configuration;->version:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 454
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication$2;->this$0:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    # getter for: Lcom/aetn/history/android/historyhere/HistoryHereApplication;->mConfigLoadedListener:Lcom/aetn/history/android/historyhere/HistoryHereApplication$OnConfigLoadedListener;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->access$400(Lcom/aetn/history/android/historyhere/HistoryHereApplication;)Lcom/aetn/history/android/historyhere/HistoryHereApplication$OnConfigLoadedListener;

    move-result-object v2

    invoke-interface {v2}, Lcom/aetn/history/android/historyhere/HistoryHereApplication$OnConfigLoadedListener;->onConfigLoaded()V
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 461
    :goto_0
    return-void

    .line 456
    :catch_0
    move-exception v0

    .line 458
    .local v0, "e":Lcom/google/gson/JsonSyntaxException;
    invoke-virtual {v0}, Lcom/google/gson/JsonSyntaxException;->printStackTrace()V

    .line 459
    # getter for: Lcom/aetn/history/android/historyhere/HistoryHereApplication;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->access$100()Ljava/lang/String;

    move-result-object v2

    const-string v3, "loadConfig():Parse error "

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method
