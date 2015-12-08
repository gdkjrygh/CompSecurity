.class Lorg/apache/cordova/facebook/ConnectPlugin$12;
.super Ljava/lang/Object;
.source "ConnectPlugin.java"

# interfaces
.implements Lcom/facebook/Request$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/facebook/ConnectPlugin;->makeGraphCall()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/facebook/ConnectPlugin;


# direct methods
.method constructor <init>(Lorg/apache/cordova/facebook/ConnectPlugin;)V
    .locals 0
    .param p1, "this$0"    # Lorg/apache/cordova/facebook/ConnectPlugin;

    .prologue
    .line 631
    iput-object p1, p0, Lorg/apache/cordova/facebook/ConnectPlugin$12;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompleted(Lcom/facebook/Response;)V
    .locals 5
    .param p1, "response"    # Lcom/facebook/Response;

    .prologue
    const/4 v4, 0x0

    .line 635
    iget-object v1, p0, Lorg/apache/cordova/facebook/ConnectPlugin$12;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    # getter for: Lorg/apache/cordova/facebook/ConnectPlugin;->graphContext:Lorg/apache/cordova/CallbackContext;
    invoke-static {v1}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$800(Lorg/apache/cordova/facebook/ConnectPlugin;)Lorg/apache/cordova/CallbackContext;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 636
    invoke-virtual {p1}, Lcom/facebook/Response;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 637
    iget-object v1, p0, Lorg/apache/cordova/facebook/ConnectPlugin$12;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    # getter for: Lorg/apache/cordova/facebook/ConnectPlugin;->graphContext:Lorg/apache/cordova/CallbackContext;
    invoke-static {v1}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$800(Lorg/apache/cordova/facebook/ConnectPlugin;)Lorg/apache/cordova/CallbackContext;

    move-result-object v1

    iget-object v2, p0, Lorg/apache/cordova/facebook/ConnectPlugin$12;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    invoke-virtual {p1}, Lcom/facebook/Response;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/apache/cordova/facebook/ConnectPlugin;->getFacebookRequestErrorResponse(Lcom/facebook/FacebookRequestError;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/apache/cordova/CallbackContext;->error(Lorg/json/JSONObject;)V

    .line 642
    :goto_0
    iget-object v1, p0, Lorg/apache/cordova/facebook/ConnectPlugin$12;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    # setter for: Lorg/apache/cordova/facebook/ConnectPlugin;->graphPath:Ljava/lang/String;
    invoke-static {v1, v4}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$902(Lorg/apache/cordova/facebook/ConnectPlugin;Ljava/lang/String;)Ljava/lang/String;

    .line 643
    iget-object v1, p0, Lorg/apache/cordova/facebook/ConnectPlugin$12;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    # setter for: Lorg/apache/cordova/facebook/ConnectPlugin;->graphContext:Lorg/apache/cordova/CallbackContext;
    invoke-static {v1, v4}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$802(Lorg/apache/cordova/facebook/ConnectPlugin;Lorg/apache/cordova/CallbackContext;)Lorg/apache/cordova/CallbackContext;

    .line 645
    :cond_0
    return-void

    .line 639
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/Response;->getGraphObject()Lcom/facebook/model/GraphObject;

    move-result-object v0

    .line 640
    .local v0, "graphObject":Lcom/facebook/model/GraphObject;
    iget-object v1, p0, Lorg/apache/cordova/facebook/ConnectPlugin$12;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    # getter for: Lorg/apache/cordova/facebook/ConnectPlugin;->graphContext:Lorg/apache/cordova/CallbackContext;
    invoke-static {v1}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$800(Lorg/apache/cordova/facebook/ConnectPlugin;)Lorg/apache/cordova/CallbackContext;

    move-result-object v1

    invoke-interface {v0}, Lcom/facebook/model/GraphObject;->getInnerJSONObject()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/apache/cordova/CallbackContext;->success(Lorg/json/JSONObject;)V

    goto :goto_0
.end method
