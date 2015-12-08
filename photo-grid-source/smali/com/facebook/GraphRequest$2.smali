.class final Lcom/facebook/GraphRequest$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/GraphRequest$Callback;


# instance fields
.field final synthetic val$callback:Lcom/facebook/GraphRequest$GraphJSONArrayCallback;


# direct methods
.method constructor <init>(Lcom/facebook/GraphRequest$GraphJSONArrayCallback;)V
    .locals 0

    .prologue
    .line 342
    iput-object p1, p0, Lcom/facebook/GraphRequest$2;->val$callback:Lcom/facebook/GraphRequest$GraphJSONArrayCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCompleted(Lcom/facebook/GraphResponse;)V
    .locals 2

    .prologue
    .line 345
    iget-object v0, p0, Lcom/facebook/GraphRequest$2;->val$callback:Lcom/facebook/GraphRequest$GraphJSONArrayCallback;

    if-eqz v0, :cond_0

    .line 346
    invoke-virtual {p1}, Lcom/facebook/GraphResponse;->getJSONObject()Lorg/json/JSONObject;

    move-result-object v0

    .line 347
    if-eqz v0, :cond_1

    const-string v1, "data"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 348
    :goto_0
    iget-object v1, p0, Lcom/facebook/GraphRequest$2;->val$callback:Lcom/facebook/GraphRequest$GraphJSONArrayCallback;

    invoke-interface {v1, v0, p1}, Lcom/facebook/GraphRequest$GraphJSONArrayCallback;->onCompleted(Lorg/json/JSONArray;Lcom/facebook/GraphResponse;)V

    .line 350
    :cond_0
    return-void

    .line 347
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
