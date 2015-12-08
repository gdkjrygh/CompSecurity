.class public Lcom/worklight/wlclient/api/WLProcedureInvocationData;
.super Ljava/lang/Object;
.source "WLProcedureInvocationData.java"


# instance fields
.field private adapter:Ljava/lang/String;

.field private parameters:[Ljava/lang/Object;

.field private procedure:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "adapter"    # Ljava/lang/String;
    .param p2, "procedure"    # Ljava/lang/String;

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/worklight/wlclient/api/WLProcedureInvocationData;->adapter:Ljava/lang/String;

    .line 38
    iput-object p2, p0, Lcom/worklight/wlclient/api/WLProcedureInvocationData;->procedure:Ljava/lang/String;

    .line 39
    return-void
.end method


# virtual methods
.method public getInvocationDataMap()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 54
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 56
    .local v2, "invocationData":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 57
    .local v3, "jsonParams":Lorg/json/JSONArray;
    iget-object v4, p0, Lcom/worklight/wlclient/api/WLProcedureInvocationData;->parameters:[Ljava/lang/Object;

    if-eqz v4, :cond_0

    .line 58
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    iget-object v4, p0, Lcom/worklight/wlclient/api/WLProcedureInvocationData;->parameters:[Ljava/lang/Object;

    array-length v4, v4

    if-lt v1, v4, :cond_1

    .line 66
    .end local v1    # "i":I
    :cond_0
    const-string v4, "adapter"

    iget-object v5, p0, Lcom/worklight/wlclient/api/WLProcedureInvocationData;->adapter:Ljava/lang/String;

    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    const-string v4, "procedure"

    iget-object v5, p0, Lcom/worklight/wlclient/api/WLProcedureInvocationData;->procedure:Ljava/lang/String;

    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    const-string v4, "parameters"

    invoke-virtual {v3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    return-object v2

    .line 60
    .restart local v1    # "i":I
    :cond_1
    :try_start_0
    iget-object v4, p0, Lcom/worklight/wlclient/api/WLProcedureInvocationData;->parameters:[Ljava/lang/Object;

    aget-object v4, v4, v1

    invoke-virtual {v3, v1, v4}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 61
    :catch_0
    move-exception v0

    .line 62
    .local v0, "e":Lorg/json/JSONException;
    new-instance v4, Ljava/lang/RuntimeException;

    invoke-direct {v4, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v4
.end method

.method public setParameters([Ljava/lang/Object;)V
    .locals 0
    .param p1, "parameters"    # [Ljava/lang/Object;

    .prologue
    .line 47
    iput-object p1, p0, Lcom/worklight/wlclient/api/WLProcedureInvocationData;->parameters:[Ljava/lang/Object;

    .line 48
    return-void
.end method
