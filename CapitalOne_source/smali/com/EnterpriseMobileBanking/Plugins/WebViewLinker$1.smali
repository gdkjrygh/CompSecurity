.class Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$1;
.super Ljava/lang/Object;
.source "WebViewLinker.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->execute(Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)Lorg/apache/cordova/api/PluginResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

.field final synthetic val$enabled:Z

.field final synthetic val$me:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;Z)V
    .locals 0

    .prologue
    .line 206
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$1;->this$0:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    iput-object p2, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$1;->val$me:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    iput-boolean p3, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$1;->val$enabled:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 209
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$1;->val$me:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    monitor-enter v1

    .line 210
    :try_start_0
    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$1;->val$enabled:Z

    invoke-static {v0}, Lcom/EnterpriseMobileBanking/AppHelper;->changeButtonImage(Z)V

    .line 211
    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$1;->val$enabled:Z

    invoke-static {v0}, Lcom/EnterpriseMobileBanking/AppHelper;->setNavigationEnabled(Z)V

    .line 212
    monitor-exit v1

    .line 214
    return-void

    .line 212
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
