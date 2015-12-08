.class Lorg/apache/cordova/facebook/ConnectPlugin$5;
.super Ljava/lang/Object;
.source "ConnectPlugin.java"

# interfaces
.implements Lcom/facebook/Request$GraphUserCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/facebook/ConnectPlugin;->execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

.field final synthetic val$_callbackContext:Lorg/apache/cordova/CallbackContext;


# direct methods
.method constructor <init>(Lorg/apache/cordova/facebook/ConnectPlugin;Lorg/apache/cordova/CallbackContext;)V
    .locals 0
    .param p1, "this$0"    # Lorg/apache/cordova/facebook/ConnectPlugin;

    .prologue
    .line 272
    iput-object p1, p0, Lorg/apache/cordova/facebook/ConnectPlugin$5;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    iput-object p2, p0, Lorg/apache/cordova/facebook/ConnectPlugin$5;->val$_callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompleted(Lcom/facebook/model/GraphUser;Lcom/facebook/Response;)V
    .locals 3
    .param p1, "user"    # Lcom/facebook/model/GraphUser;
    .param p2, "response"    # Lcom/facebook/Response;

    .prologue
    .line 277
    invoke-virtual {p2}, Lcom/facebook/Response;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 278
    iget-object v0, p0, Lorg/apache/cordova/facebook/ConnectPlugin$5;->val$_callbackContext:Lorg/apache/cordova/CallbackContext;

    iget-object v1, p0, Lorg/apache/cordova/facebook/ConnectPlugin$5;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    invoke-virtual {p2}, Lcom/facebook/Response;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/apache/cordova/facebook/ConnectPlugin;->getFacebookRequestErrorResponse(Lcom/facebook/FacebookRequestError;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/cordova/CallbackContext;->error(Lorg/json/JSONObject;)V

    .line 283
    :goto_0
    return-void

    .line 280
    :cond_0
    iget-object v0, p0, Lorg/apache/cordova/facebook/ConnectPlugin$5;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    invoke-interface {p1}, Lcom/facebook/model/GraphUser;->getId()Ljava/lang/String;

    move-result-object v1

    # setter for: Lorg/apache/cordova/facebook/ConnectPlugin;->userID:Ljava/lang/String;
    invoke-static {v0, v1}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$402(Lorg/apache/cordova/facebook/ConnectPlugin;Ljava/lang/String;)Ljava/lang/String;

    .line 281
    iget-object v0, p0, Lorg/apache/cordova/facebook/ConnectPlugin$5;->val$_callbackContext:Lorg/apache/cordova/CallbackContext;

    iget-object v1, p0, Lorg/apache/cordova/facebook/ConnectPlugin$5;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    invoke-virtual {v1}, Lorg/apache/cordova/facebook/ConnectPlugin;->getResponse()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/cordova/CallbackContext;->success(Lorg/json/JSONObject;)V

    goto :goto_0
.end method
