.class Lcom/aetn/history/android/historyhere/HistoryHereApplication$1;
.super Lcom/android/volley/toolbox/StringRequest;
.source "HistoryHereApplication.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/HistoryHereApplication;->loadConfig(Lcom/aetn/history/android/historyhere/HistoryHereApplication$OnConfigLoadedListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/HistoryHereApplication;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/HistoryHereApplication;ILjava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/HistoryHereApplication;
    .param p2, "x0"    # I
    .param p3, "x1"    # Ljava/lang/String;
    .param p5, "x3"    # Lcom/android/volley/Response$ErrorListener;

    .prologue
    .line 415
    .local p4, "x2":Lcom/android/volley/Response$Listener;, "Lcom/android/volley/Response$Listener<Ljava/lang/String;>;"
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication$1;->this$0:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-direct {p0, p2, p3, p4, p5}, Lcom/android/volley/toolbox/StringRequest;-><init>(ILjava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V

    return-void
.end method


# virtual methods
.method public getHeaders()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/volley/AuthFailureError;
        }
    .end annotation

    .prologue
    .line 419
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication$1;->this$0:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    const-string v1, "historyhereiosuser"

    const-string v2, ":}O/Wa}%"

    invoke-virtual {v0, v1, v2}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->createBasicAuthHeader(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
