.class Lorg/apache/cordova/facebook/ConnectPlugin$13;
.super Ljava/lang/Object;
.source "ConnectPlugin.java"

# interfaces
.implements Lcom/facebook/Request$GraphUserCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/facebook/ConnectPlugin;->onSessionStateChange(Lcom/facebook/SessionState;Ljava/lang/Exception;)V
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
    .line 694
    iput-object p1, p0, Lorg/apache/cordova/facebook/ConnectPlugin$13;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompleted(Lcom/facebook/model/GraphUser;Lcom/facebook/Response;)V
    .locals 4
    .param p1, "user"    # Lcom/facebook/model/GraphUser;
    .param p2, "response"    # Lcom/facebook/Response;

    .prologue
    .line 698
    iget-object v1, p0, Lorg/apache/cordova/facebook/ConnectPlugin$13;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    # getter for: Lorg/apache/cordova/facebook/ConnectPlugin;->loginContext:Lorg/apache/cordova/CallbackContext;
    invoke-static {v1}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$1000(Lorg/apache/cordova/facebook/ConnectPlugin;)Lorg/apache/cordova/CallbackContext;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 699
    invoke-virtual {p2}, Lcom/facebook/Response;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 700
    iget-object v1, p0, Lorg/apache/cordova/facebook/ConnectPlugin$13;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    # getter for: Lorg/apache/cordova/facebook/ConnectPlugin;->loginContext:Lorg/apache/cordova/CallbackContext;
    invoke-static {v1}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$1000(Lorg/apache/cordova/facebook/ConnectPlugin;)Lorg/apache/cordova/CallbackContext;

    move-result-object v1

    iget-object v2, p0, Lorg/apache/cordova/facebook/ConnectPlugin$13;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    invoke-virtual {p2}, Lcom/facebook/Response;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/apache/cordova/facebook/ConnectPlugin;->getFacebookRequestErrorResponse(Lcom/facebook/FacebookRequestError;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/apache/cordova/CallbackContext;->error(Lorg/json/JSONObject;)V

    .line 712
    :goto_0
    return-void

    .line 702
    :cond_0
    invoke-virtual {p2}, Lcom/facebook/Response;->getGraphObject()Lcom/facebook/model/GraphObject;

    move-result-object v0

    .line 703
    .local v0, "graphObject":Lcom/facebook/model/GraphObject;
    const-string v1, "ConnectPlugin"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "returning login object "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v0}, Lcom/facebook/model/GraphObject;->getInnerJSONObject()Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 704
    iget-object v1, p0, Lorg/apache/cordova/facebook/ConnectPlugin$13;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    invoke-interface {p1}, Lcom/facebook/model/GraphUser;->getId()Ljava/lang/String;

    move-result-object v2

    # setter for: Lorg/apache/cordova/facebook/ConnectPlugin;->userID:Ljava/lang/String;
    invoke-static {v1, v2}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$402(Lorg/apache/cordova/facebook/ConnectPlugin;Ljava/lang/String;)Ljava/lang/String;

    .line 705
    iget-object v1, p0, Lorg/apache/cordova/facebook/ConnectPlugin$13;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    # getter for: Lorg/apache/cordova/facebook/ConnectPlugin;->loginContext:Lorg/apache/cordova/CallbackContext;
    invoke-static {v1}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$1000(Lorg/apache/cordova/facebook/ConnectPlugin;)Lorg/apache/cordova/CallbackContext;

    move-result-object v1

    iget-object v2, p0, Lorg/apache/cordova/facebook/ConnectPlugin$13;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    invoke-virtual {v2}, Lorg/apache/cordova/facebook/ConnectPlugin;->getResponse()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/apache/cordova/CallbackContext;->success(Lorg/json/JSONObject;)V

    .line 706
    iget-object v1, p0, Lorg/apache/cordova/facebook/ConnectPlugin$13;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    const/4 v2, 0x0

    # setter for: Lorg/apache/cordova/facebook/ConnectPlugin;->loginContext:Lorg/apache/cordova/CallbackContext;
    invoke-static {v1, v2}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$1002(Lorg/apache/cordova/facebook/ConnectPlugin;Lorg/apache/cordova/CallbackContext;)Lorg/apache/cordova/CallbackContext;

    goto :goto_0

    .line 710
    .end local v0    # "graphObject":Lcom/facebook/model/GraphObject;
    :cond_1
    iget-object v1, p0, Lorg/apache/cordova/facebook/ConnectPlugin$13;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    invoke-interface {p1}, Lcom/facebook/model/GraphUser;->getId()Ljava/lang/String;

    move-result-object v2

    # setter for: Lorg/apache/cordova/facebook/ConnectPlugin;->userID:Ljava/lang/String;
    invoke-static {v1, v2}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$402(Lorg/apache/cordova/facebook/ConnectPlugin;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0
.end method
