.class Lcom/aetn/history/android/historyhere/model/PoiManager$2;
.super Ljava/lang/Object;
.source "PoiManager.java"

# interfaces
.implements Lcom/android/volley/Response$ErrorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/model/PoiManager;->getPoiList(DDJLjava/lang/String;I)V
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
    .line 325
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$2;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onErrorResponse(Lcom/android/volley/VolleyError;)V
    .locals 0
    .param p1, "error"    # Lcom/android/volley/VolleyError;

    .prologue
    .line 329
    return-void
.end method
