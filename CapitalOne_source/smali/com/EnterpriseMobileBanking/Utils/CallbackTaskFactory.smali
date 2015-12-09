.class public Lcom/EnterpriseMobileBanking/Utils/CallbackTaskFactory;
.super Ljava/lang/Object;
.source "CallbackTaskFactory.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "CallbackTaskFactory"

.field private static taskList:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/EnterpriseMobileBanking/Utils/CallbackTask;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 17
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/EnterpriseMobileBanking/Utils/CallbackTaskFactory;->taskList:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    return-void
.end method

.method public static varargs addCallbackTask(Lcom/EnterpriseMobileBanking/Utils/CallbackTask;[Ljava/lang/String;)V
    .locals 7
    .param p0, "task"    # Lcom/EnterpriseMobileBanking/Utils/CallbackTask;
    .param p1, "actions"    # [Ljava/lang/String;

    .prologue
    .line 26
    move-object v1, p1

    .local v1, "arr$":[Ljava/lang/String;
    array-length v3, v1

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_0
    if-ge v2, v3, :cond_0

    aget-object v0, v1, v2

    .line 28
    .local v0, "action":Ljava/lang/String;
    const-string v4, "CallbackTaskFactory"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Adding action: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    sget-object v4, Lcom/EnterpriseMobileBanking/Utils/CallbackTaskFactory;->taskList:Ljava/util/Map;

    invoke-interface {v4, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 32
    .end local v0    # "action":Ljava/lang/String;
    :cond_0
    return-void
.end method

.method public static getCallbackTask(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)Lcom/EnterpriseMobileBanking/Utils/CallbackTask;
    .locals 2
    .param p0, "action"    # Ljava/lang/String;
    .param p1, "callbackId"    # Ljava/lang/String;
    .param p2, "parameters"    # Lorg/json/JSONArray;
    .param p3, "appLink"    # Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    .prologue
    .line 41
    sget-object v1, Lcom/EnterpriseMobileBanking/Utils/CallbackTaskFactory;->taskList:Ljava/util/Map;

    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;

    .line 43
    .local v0, "task":Lcom/EnterpriseMobileBanking/Utils/CallbackTask;
    if-eqz v0, :cond_0

    .line 45
    invoke-virtual {v0, p1, p2, p3}, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;->create(Ljava/lang/String;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)Lcom/EnterpriseMobileBanking/Utils/CallbackTask;

    move-result-object v0

    .line 48
    :cond_0
    return-object v0
.end method

.method public static hasAction(Ljava/lang/String;)Z
    .locals 1
    .param p0, "action"    # Ljava/lang/String;

    .prologue
    .line 36
    sget-object v0, Lcom/EnterpriseMobileBanking/Utils/CallbackTaskFactory;->taskList:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
