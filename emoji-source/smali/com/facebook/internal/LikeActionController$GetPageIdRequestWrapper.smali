.class Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;
.super Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;
.source "LikeActionController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/internal/LikeActionController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "GetPageIdRequestWrapper"
.end annotation


# instance fields
.field objectIsPage:Z

.field final synthetic this$0:Lcom/facebook/internal/LikeActionController;

.field verifiedObjectId:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V
    .locals 5
    .param p2, "objectId"    # Ljava/lang/String;

    .prologue
    .line 1114
    iput-object p1, p0, Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;->this$0:Lcom/facebook/internal/LikeActionController;

    .line 1115
    invoke-direct {p0, p1, p2}, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;-><init>(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V

    .line 1117
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1118
    .local v0, "pageIdRequestParams":Landroid/os/Bundle;
    const-string v1, "fields"

    const-string v2, "id"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1119
    const-string v1, "ids"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1121
    new-instance v1, Lcom/facebook/Request;

    # getter for: Lcom/facebook/internal/LikeActionController;->session:Lcom/facebook/Session;
    invoke-static {p1}, Lcom/facebook/internal/LikeActionController;->access$2700(Lcom/facebook/internal/LikeActionController;)Lcom/facebook/Session;

    move-result-object v2

    const-string v3, ""

    sget-object v4, Lcom/facebook/HttpMethod;->GET:Lcom/facebook/HttpMethod;

    invoke-direct {v1, v2, v3, v0, v4}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;)V

    invoke-virtual {p0, v1}, Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;->setRequest(Lcom/facebook/Request;)V

    .line 1122
    return-void
.end method


# virtual methods
.method protected processError(Lcom/facebook/FacebookRequestError;)V
    .locals 6
    .param p1, "error"    # Lcom/facebook/FacebookRequestError;

    .prologue
    .line 1135
    sget-object v0, Lcom/facebook/LoggingBehavior;->REQUESTS:Lcom/facebook/LoggingBehavior;

    .line 1136
    # getter for: Lcom/facebook/internal/LikeActionController;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/facebook/internal/LikeActionController;->access$1500()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Error getting the FB id for object \'%s\' : %s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;->objectId:Ljava/lang/String;

    aput-object v5, v3, v4

    const/4 v4, 0x1

    aput-object p1, v3, v4

    .line 1135
    invoke-static {v0, v1, v2, v3}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1138
    return-void
.end method

.method protected processSuccess(Lcom/facebook/Response;)V
    .locals 3
    .param p1, "response"    # Lcom/facebook/Response;

    .prologue
    .line 1126
    invoke-virtual {p1}, Lcom/facebook/Response;->getGraphObject()Lcom/facebook/model/GraphObject;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;->objectId:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/facebook/internal/Utility;->tryGetJSONObjectFromResponse(Lcom/facebook/model/GraphObject;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 1127
    .local v0, "results":Lorg/json/JSONObject;
    if-eqz v0, :cond_0

    .line 1128
    const-string v1, "id"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;->verifiedObjectId:Ljava/lang/String;

    .line 1129
    iget-object v1, p0, Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;->verifiedObjectId:Ljava/lang/String;

    invoke-static {v1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    :goto_0
    iput-boolean v1, p0, Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;->objectIsPage:Z

    .line 1131
    :cond_0
    return-void

    .line 1129
    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method
