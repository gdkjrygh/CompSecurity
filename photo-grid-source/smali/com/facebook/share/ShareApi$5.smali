.class Lcom/facebook/share/ShareApi$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/GraphRequest$Callback;


# instance fields
.field final synthetic this$0:Lcom/facebook/share/ShareApi;

.field final synthetic val$callback:Lcom/facebook/FacebookCallback;


# direct methods
.method constructor <init>(Lcom/facebook/share/ShareApi;Lcom/facebook/FacebookCallback;)V
    .locals 0

    .prologue
    .line 319
    iput-object p1, p0, Lcom/facebook/share/ShareApi$5;->this$0:Lcom/facebook/share/ShareApi;

    iput-object p2, p0, Lcom/facebook/share/ShareApi$5;->val$callback:Lcom/facebook/FacebookCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompleted(Lcom/facebook/GraphResponse;)V
    .locals 2

    .prologue
    .line 322
    const/4 v0, 0x0

    .line 323
    if-eqz p1, :cond_0

    .line 324
    invoke-virtual {p1}, Lcom/facebook/GraphResponse;->getJSONObject()Lorg/json/JSONObject;

    move-result-object v1

    .line 325
    if-eqz v1, :cond_0

    .line 326
    const-string v0, "id"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 329
    :cond_0
    iget-object v1, p0, Lcom/facebook/share/ShareApi$5;->val$callback:Lcom/facebook/FacebookCallback;

    invoke-static {v1, v0, p1}, Lcom/facebook/share/internal/ShareInternalUtility;->invokeCallbackWithResults(Lcom/facebook/FacebookCallback;Ljava/lang/String;Lcom/facebook/GraphResponse;)V

    .line 330
    return-void
.end method
