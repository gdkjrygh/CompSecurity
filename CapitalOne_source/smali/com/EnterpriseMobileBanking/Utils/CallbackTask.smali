.class public abstract Lcom/EnterpriseMobileBanking/Utils/CallbackTask;
.super Ljava/lang/Object;
.source "CallbackTask.java"


# static fields
.field public static final TAG:Ljava/lang/String; = "CallbackTask"


# instance fields
.field protected appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

.field protected callbackId:Ljava/lang/String;

.field protected complete:Z

.field protected parameters:Lorg/json/JSONArray;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;->callbackId:Ljava/lang/String;

    .line 27
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;->parameters:Lorg/json/JSONArray;

    .line 29
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    .line 31
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;->complete:Z

    .line 34
    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V
    .locals 4
    .param p1, "callbackId"    # Ljava/lang/String;
    .param p2, "parameters"    # Lorg/json/JSONArray;
    .param p3, "appLink"    # Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    .prologue
    const/4 v3, 0x0

    const/4 v0, 0x0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;->callbackId:Ljava/lang/String;

    .line 27
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;->parameters:Lorg/json/JSONArray;

    .line 29
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    .line 31
    iput-boolean v3, p0, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;->complete:Z

    .line 39
    const-string v0, "CallbackTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CBId: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    const-string v0, "CallbackTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Params: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;->callbackId:Ljava/lang/String;

    .line 43
    iput-object p2, p0, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;->parameters:Lorg/json/JSONArray;

    .line 44
    iput-object p3, p0, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    .line 45
    iput-boolean v3, p0, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;->complete:Z

    .line 46
    return-void
.end method

.method public static load()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    .prologue
    .line 21
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Create a load function for your CallbackTask"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public abstract create(Ljava/lang/String;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)Lcom/EnterpriseMobileBanking/Utils/CallbackTask;
.end method

.method public abstract execute(Landroid/webkit/WebView;)V
.end method

.method public getCallbackId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;->callbackId:Ljava/lang/String;

    return-object v0
.end method

.method public isComplete()Z
    .locals 1

    .prologue
    .line 59
    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;->complete:Z

    return v0
.end method

.method public setComplete()V
    .locals 1

    .prologue
    .line 55
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;->complete:Z

    .line 56
    return-void
.end method
