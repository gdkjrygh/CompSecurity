.class public Lcom/EnterpriseMobileBanking/Utils/RemoveSplashCallbackTask;
.super Lcom/EnterpriseMobileBanking/Utils/CallbackTask;
.source "RemoveSplashCallbackTask.java"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final TAG:Ljava/lang/String; = "RemoveSplashCBT"

.field private static final actions:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 13
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "removeSplash"

    aput-object v2, v0, v1

    sput-object v0, Lcom/EnterpriseMobileBanking/Utils/RemoveSplashCallbackTask;->actions:[Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;-><init>()V

    .line 19
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V
    .locals 0
    .param p1, "callbackId"    # Ljava/lang/String;
    .param p2, "parameters"    # Lorg/json/JSONArray;
    .param p3, "appLink"    # Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    .prologue
    .line 23
    invoke-direct {p0, p1, p2, p3}, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;-><init>(Ljava/lang/String;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V

    .line 24
    return-void
.end method

.method public static load()V
    .locals 3

    .prologue
    .line 27
    const-string v0, "RemoveSplashCBT"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Adding "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/EnterpriseMobileBanking/Utils/RemoveSplashCallbackTask;->actions:[Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    new-instance v0, Lcom/EnterpriseMobileBanking/Utils/RemoveSplashCallbackTask;

    invoke-direct {v0}, Lcom/EnterpriseMobileBanking/Utils/RemoveSplashCallbackTask;-><init>()V

    sget-object v1, Lcom/EnterpriseMobileBanking/Utils/RemoveSplashCallbackTask;->actions:[Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/CallbackTaskFactory;->addCallbackTask(Lcom/EnterpriseMobileBanking/Utils/CallbackTask;[Ljava/lang/String;)V

    .line 29
    return-void
.end method


# virtual methods
.method public create(Ljava/lang/String;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)Lcom/EnterpriseMobileBanking/Utils/CallbackTask;
    .locals 3
    .param p1, "callbackId"    # Ljava/lang/String;
    .param p2, "parameters"    # Lorg/json/JSONArray;
    .param p3, "appLink"    # Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    .prologue
    .line 46
    const-string v0, "RemoveSplashCBT"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Create: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    new-instance v0, Lcom/EnterpriseMobileBanking/Utils/RemoveSplashCallbackTask;

    invoke-direct {v0, p1, p2, p3}, Lcom/EnterpriseMobileBanking/Utils/RemoveSplashCallbackTask;-><init>(Ljava/lang/String;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V

    return-object v0
.end method

.method public execute(Landroid/webkit/WebView;)V
    .locals 2
    .param p1, "view"    # Landroid/webkit/WebView;

    .prologue
    .line 38
    const-string v0, "RemoveSplashCBT"

    const-string v1, "Execute Splash screen removal"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    invoke-virtual {p1}, Landroid/webkit/WebView;->getHandler()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 40
    return-void
.end method

.method public run()V
    .locals 2

    .prologue
    .line 32
    const-string v0, "RemoveSplashCBT"

    const-string v1, "Remove the splashscreen"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->removeSplash()V

    .line 34
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/RemoveSplashCallbackTask;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    sget-object v1, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-virtual {v0, v1, p0}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendPluginResult(Lorg/apache/cordova/api/PluginResult$Status;Lcom/EnterpriseMobileBanking/Utils/CallbackTask;)V

    .line 35
    return-void
.end method
