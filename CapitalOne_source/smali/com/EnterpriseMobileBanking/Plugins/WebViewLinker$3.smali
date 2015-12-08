.class Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$3;
.super Ljava/lang/Object;
.source "WebViewLinker.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendPluginResult(Lorg/apache/cordova/api/PluginResult$Status;Lcom/EnterpriseMobileBanking/Utils/CallbackTask;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

.field final synthetic val$cbId:Ljava/lang/String;

.field final synthetic val$status:Lorg/apache/cordova/api/PluginResult$Status;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 380
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$3;->this$0:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    iput-object p2, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$3;->val$status:Lorg/apache/cordova/api/PluginResult$Status;

    iput-object p3, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$3;->val$cbId:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 384
    new-instance v0, Lorg/apache/cordova/api/PluginResult;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$3;->val$status:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v0, v1}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    .line 385
    .local v0, "result":Lorg/apache/cordova/api/PluginResult;
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/apache/cordova/api/PluginResult;->setKeepCallback(Z)V

    .line 386
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$3;->val$status:Lorg/apache/cordova/api/PluginResult$Status;

    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    if-eq v1, v2, :cond_0

    .line 388
    const-string v1, "WebViewLinker"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error Callback for: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$3;->val$cbId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 390
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$3;->this$0:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$3;->val$cbId:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->error(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V

    .line 397
    :goto_0
    return-void

    .line 393
    :cond_0
    const-string v1, "WebViewLinker"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Success Callback for: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$3;->val$cbId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 395
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$3;->this$0:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$3;->val$cbId:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->success(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V

    goto :goto_0
.end method
