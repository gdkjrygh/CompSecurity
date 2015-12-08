.class Lcom/facebook/GraphRequest$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/GraphRequest$Callback;


# instance fields
.field final synthetic this$0:Lcom/facebook/GraphRequest;

.field final synthetic val$callback:Lcom/facebook/GraphRequest$Callback;


# direct methods
.method constructor <init>(Lcom/facebook/GraphRequest;Lcom/facebook/GraphRequest$Callback;)V
    .locals 0

    .prologue
    .line 780
    iput-object p1, p0, Lcom/facebook/GraphRequest$4;->this$0:Lcom/facebook/GraphRequest;

    iput-object p2, p0, Lcom/facebook/GraphRequest$4;->val$callback:Lcom/facebook/GraphRequest$Callback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompleted(Lcom/facebook/GraphResponse;)V
    .locals 8

    .prologue
    const/4 v4, 0x0

    .line 783
    invoke-virtual {p1}, Lcom/facebook/GraphResponse;->getJSONObject()Lorg/json/JSONObject;

    move-result-object v0

    .line 784
    if-eqz v0, :cond_3

    const-string v1, "__debug__"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 786
    :goto_0
    if-eqz v0, :cond_4

    const-string v1, "messages"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    move-object v6, v0

    .line 788
    :goto_1
    if-eqz v6, :cond_8

    .line 789
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_8

    .line 790
    invoke-virtual {v6, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 791
    if-eqz v3, :cond_5

    const-string v1, "message"

    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 794
    :goto_3
    if-eqz v3, :cond_6

    const-string v1, "type"

    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object v5, v1

    .line 797
    :goto_4
    if-eqz v3, :cond_7

    const-string v1, "link"

    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object v3, v1

    .line 800
    :goto_5
    if-eqz v2, :cond_2

    if-eqz v5, :cond_2

    .line 801
    sget-object v1, Lcom/facebook/LoggingBehavior;->GRAPH_API_DEBUG_INFO:Lcom/facebook/LoggingBehavior;

    .line 802
    const-string v7, "warning"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 803
    sget-object v1, Lcom/facebook/LoggingBehavior;->GRAPH_API_DEBUG_WARNING:Lcom/facebook/LoggingBehavior;

    .line 805
    :cond_0
    invoke-static {v3}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 806
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v5, " Link: "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 808
    :cond_1
    sget-object v3, Lcom/facebook/GraphRequest;->TAG:Ljava/lang/String;

    invoke-static {v1, v3, v2}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;)V

    .line 789
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    move-object v0, v4

    .line 784
    goto :goto_0

    :cond_4
    move-object v6, v4

    .line 786
    goto :goto_1

    :cond_5
    move-object v2, v4

    .line 791
    goto :goto_3

    :cond_6
    move-object v5, v4

    .line 794
    goto :goto_4

    :cond_7
    move-object v3, v4

    .line 797
    goto :goto_5

    .line 812
    :cond_8
    iget-object v0, p0, Lcom/facebook/GraphRequest$4;->val$callback:Lcom/facebook/GraphRequest$Callback;

    if-eqz v0, :cond_9

    .line 813
    iget-object v0, p0, Lcom/facebook/GraphRequest$4;->val$callback:Lcom/facebook/GraphRequest$Callback;

    invoke-interface {v0, p1}, Lcom/facebook/GraphRequest$Callback;->onCompleted(Lcom/facebook/GraphResponse;)V

    .line 815
    :cond_9
    return-void
.end method
