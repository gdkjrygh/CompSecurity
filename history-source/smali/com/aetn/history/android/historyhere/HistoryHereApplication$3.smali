.class Lcom/aetn/history/android/historyhere/HistoryHereApplication$3;
.super Ljava/lang/Object;
.source "HistoryHereApplication.java"

# interfaces
.implements Lcom/android/volley/Response$ErrorListener;


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
    .line 464
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication$3;->this$0:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onErrorResponse(Lcom/android/volley/VolleyError;)V
    .locals 3
    .param p1, "error"    # Lcom/android/volley/VolleyError;

    .prologue
    .line 467
    iget-object v0, p1, Lcom/android/volley/VolleyError;->networkResponse:Lcom/android/volley/NetworkResponse;

    if-eqz v0, :cond_0

    .line 468
    # getter for: Lcom/aetn/history/android/historyhere/HistoryHereApplication;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->access$100()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error Response code: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p1, Lcom/android/volley/VolleyError;->networkResponse:Lcom/android/volley/NetworkResponse;

    iget v2, v2, Lcom/android/volley/NetworkResponse;->statusCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 470
    :cond_0
    return-void
.end method
