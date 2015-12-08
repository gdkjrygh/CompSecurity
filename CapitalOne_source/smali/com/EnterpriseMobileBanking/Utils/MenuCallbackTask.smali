.class public Lcom/EnterpriseMobileBanking/Utils/MenuCallbackTask;
.super Lcom/EnterpriseMobileBanking/Utils/CallbackTask;
.source "MenuCallbackTask.java"


# static fields
.field public static final TAG:Ljava/lang/String; = "MenuCBT"

.field public static final actions:[Ljava/lang/String;

.field private static lastMenuArray:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 15
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "updateMenu"

    aput-object v2, v0, v1

    sput-object v0, Lcom/EnterpriseMobileBanking/Utils/MenuCallbackTask;->actions:[Ljava/lang/String;

    .line 19
    const-string v0, ""

    sput-object v0, Lcom/EnterpriseMobileBanking/Utils/MenuCallbackTask;->lastMenuArray:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;-><init>()V

    .line 23
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V
    .locals 0
    .param p1, "callbackId"    # Ljava/lang/String;
    .param p2, "parameters"    # Lorg/json/JSONArray;
    .param p3, "appLink"    # Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    .prologue
    .line 27
    invoke-direct {p0, p1, p2, p3}, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;-><init>(Ljava/lang/String;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V

    .line 28
    return-void
.end method

.method public static clearLastMenu()V
    .locals 1

    .prologue
    .line 72
    const-string v0, ""

    sput-object v0, Lcom/EnterpriseMobileBanking/Utils/MenuCallbackTask;->lastMenuArray:Ljava/lang/String;

    .line 73
    return-void
.end method

.method public static load()V
    .locals 2

    .prologue
    .line 76
    const-string v0, "MenuCBT"

    const-string v1, "Loading"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    new-instance v0, Lcom/EnterpriseMobileBanking/Utils/MenuCallbackTask;

    invoke-direct {v0}, Lcom/EnterpriseMobileBanking/Utils/MenuCallbackTask;-><init>()V

    sget-object v1, Lcom/EnterpriseMobileBanking/Utils/MenuCallbackTask;->actions:[Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/CallbackTaskFactory;->addCallbackTask(Lcom/EnterpriseMobileBanking/Utils/CallbackTask;[Ljava/lang/String;)V

    .line 78
    return-void
.end method

.method private parseArgs()V
    .locals 6

    .prologue
    .line 44
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Utils/MenuCallbackTask;->parameters:Lorg/json/JSONArray;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->optJSONArray(I)Lorg/json/JSONArray;

    move-result-object v2

    .line 45
    .local v2, "menuItems":Lorg/json/JSONArray;
    if-eqz v2, :cond_1

    .line 47
    sget-object v3, Lcom/EnterpriseMobileBanking/Utils/MenuCallbackTask;->lastMenuArray:Ljava/lang/String;

    invoke-virtual {v2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 48
    const-string v3, "MenuCBT"

    const-string v4, "Updating Menu Contents!"

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    invoke-virtual {v2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v3

    sput-object v3, Lcom/EnterpriseMobileBanking/Utils/MenuCallbackTask;->lastMenuArray:Ljava/lang/String;

    .line 50
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->clearAllMenuItems()V

    .line 51
    invoke-static {}, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;->getInstance()Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;

    move-result-object v3

    invoke-virtual {v3}, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;->clear()V

    .line 52
    const-string v3, "MenuCBT"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "JSON Size: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    const/4 v1, 0x0

    .local v1, "loc":I
    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v1, v3, :cond_2

    .line 54
    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    .line 55
    .local v0, "job":Lorg/json/JSONObject;
    if-eqz v0, :cond_0

    .line 57
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->addMenuItem(Lorg/json/JSONObject;)V

    .line 53
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 64
    .end local v0    # "job":Lorg/json/JSONObject;
    .end local v1    # "loc":I
    :cond_1
    const-string v3, "MenuCBT"

    const-string v4, "Did not find a menu - possibly clearing"

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->clearAllMenuItems()V

    .line 66
    invoke-static {}, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;->getInstance()Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;

    move-result-object v3

    invoke-virtual {v3}, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;->clear()V

    .line 67
    const-string v3, ""

    sput-object v3, Lcom/EnterpriseMobileBanking/Utils/MenuCallbackTask;->lastMenuArray:Ljava/lang/String;

    .line 69
    :cond_2
    return-void
.end method


# virtual methods
.method public create(Ljava/lang/String;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)Lcom/EnterpriseMobileBanking/Utils/CallbackTask;
    .locals 1
    .param p1, "callbackId"    # Ljava/lang/String;
    .param p2, "parameters"    # Lorg/json/JSONArray;
    .param p3, "appLink"    # Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    .prologue
    .line 33
    new-instance v0, Lcom/EnterpriseMobileBanking/Utils/MenuCallbackTask;

    invoke-direct {v0, p1, p2, p3}, Lcom/EnterpriseMobileBanking/Utils/MenuCallbackTask;-><init>(Ljava/lang/String;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V

    return-object v0
.end method

.method public execute(Landroid/webkit/WebView;)V
    .locals 2
    .param p1, "view"    # Landroid/webkit/WebView;

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/Utils/MenuCallbackTask;->parseArgs()V

    .line 39
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/MenuCallbackTask;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    sget-object v1, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-virtual {v0, v1, p0}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendPluginResult(Lorg/apache/cordova/api/PluginResult$Status;Lcom/EnterpriseMobileBanking/Utils/CallbackTask;)V

    .line 40
    return-void
.end method
