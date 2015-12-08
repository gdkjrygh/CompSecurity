.class Lcom/aetn/history/android/historyhere/model/PoiManager$12;
.super Ljava/lang/Object;
.source "PoiManager.java"

# interfaces
.implements Lcom/android/volley/Response$ErrorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/model/PoiManager;->getPOIDetailFromService(Landroid/content/Context;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/model/PoiManager;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/model/PoiManager;

    .prologue
    .line 788
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$12;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onErrorResponse(Lcom/android/volley/VolleyError;)V
    .locals 1
    .param p1, "error"    # Lcom/android/volley/VolleyError;

    .prologue
    .line 792
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$12;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # invokes: Lcom/aetn/history/android/historyhere/model/PoiManager;->notifyDetailFailedListener()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$1500(Lcom/aetn/history/android/historyhere/model/PoiManager;)V

    .line 793
    return-void
.end method
