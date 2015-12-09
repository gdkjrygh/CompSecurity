.class public Lorg/apache/cordova/ContactManager;
.super Lorg/apache/cordova/api/CordovaPlugin;
.source "ContactManager.java"


# static fields
.field public static final INVALID_ARGUMENT_ERROR:I = 0x1

.field public static final IO_ERROR:I = 0x4

.field private static final LOG_TAG:Ljava/lang/String; = "Contact Query"

.field public static final NOT_SUPPORTED_ERROR:I = 0x5

.field public static final PENDING_OPERATION_ERROR:I = 0x3

.field public static final PERMISSION_DENIED_ERROR:I = 0x14

.field public static final TIMEOUT_ERROR:I = 0x2

.field public static final UNKNOWN_ERROR:I


# instance fields
.field private contactAccessor:Lorg/apache/cordova/ContactAccessor;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Lorg/apache/cordova/api/CordovaPlugin;-><init>()V

    .line 46
    return-void
.end method

.method static synthetic access$000(Lorg/apache/cordova/ContactManager;)Lorg/apache/cordova/ContactAccessor;
    .locals 1
    .param p0, "x0"    # Lorg/apache/cordova/ContactManager;

    .prologue
    .line 29
    iget-object v0, p0, Lorg/apache/cordova/ContactManager;->contactAccessor:Lorg/apache/cordova/ContactAccessor;

    return-object v0
.end method


# virtual methods
.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/api/CallbackContext;)Z
    .locals 9
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "args"    # Lorg/json/JSONArray;
    .param p3, "callbackContext"    # Lorg/apache/cordova/api/CallbackContext;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 61
    sget-object v6, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    const-string v7, "1."

    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 62
    new-instance v5, Lorg/apache/cordova/api/PluginResult;

    sget-object v6, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;I)V

    invoke-virtual {p3, v5}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    .line 120
    :goto_0
    return v4

    .line 70
    :cond_0
    iget-object v6, p0, Lorg/apache/cordova/ContactManager;->contactAccessor:Lorg/apache/cordova/ContactAccessor;

    if-nez v6, :cond_1

    .line 71
    new-instance v6, Lorg/apache/cordova/ContactAccessorSdk5;

    iget-object v7, p0, Lorg/apache/cordova/ContactManager;->webView:Lorg/apache/cordova/CordovaWebView;

    iget-object v8, p0, Lorg/apache/cordova/ContactManager;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-direct {v6, v7, v8}, Lorg/apache/cordova/ContactAccessorSdk5;-><init>(Landroid/webkit/WebView;Lorg/apache/cordova/api/CordovaInterface;)V

    iput-object v6, p0, Lorg/apache/cordova/ContactManager;->contactAccessor:Lorg/apache/cordova/ContactAccessor;

    .line 74
    :cond_1
    const-string v6, "search"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 75
    invoke-virtual {p2, v5}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    move-result-object v2

    .line 76
    .local v2, "filter":Lorg/json/JSONArray;
    invoke-virtual {p2, v4}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 77
    .local v3, "options":Lorg/json/JSONObject;
    iget-object v5, p0, Lorg/apache/cordova/ContactManager;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v5}, Lorg/apache/cordova/api/CordovaInterface;->getThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v5

    new-instance v6, Lorg/apache/cordova/ContactManager$1;

    invoke-direct {v6, p0, v2, v3, p3}, Lorg/apache/cordova/ContactManager$1;-><init>(Lorg/apache/cordova/ContactManager;Lorg/json/JSONArray;Lorg/json/JSONObject;Lorg/apache/cordova/api/CallbackContext;)V

    invoke-interface {v5, v6}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 84
    .end local v2    # "filter":Lorg/json/JSONArray;
    .end local v3    # "options":Lorg/json/JSONObject;
    :cond_2
    const-string v6, "save"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 85
    invoke-virtual {p2, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    .line 86
    .local v0, "contact":Lorg/json/JSONObject;
    iget-object v5, p0, Lorg/apache/cordova/ContactManager;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v5}, Lorg/apache/cordova/api/CordovaInterface;->getThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v5

    new-instance v6, Lorg/apache/cordova/ContactManager$2;

    invoke-direct {v6, p0, v0, p3}, Lorg/apache/cordova/ContactManager$2;-><init>(Lorg/apache/cordova/ContactManager;Lorg/json/JSONObject;Lorg/apache/cordova/api/CallbackContext;)V

    invoke-interface {v5, v6}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 105
    .end local v0    # "contact":Lorg/json/JSONObject;
    :cond_3
    const-string v6, "remove"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 106
    invoke-virtual {p2, v5}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 107
    .local v1, "contactId":Ljava/lang/String;
    iget-object v5, p0, Lorg/apache/cordova/ContactManager;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v5}, Lorg/apache/cordova/api/CordovaInterface;->getThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v5

    new-instance v6, Lorg/apache/cordova/ContactManager$3;

    invoke-direct {v6, p0, v1, p3}, Lorg/apache/cordova/ContactManager$3;-><init>(Lorg/apache/cordova/ContactManager;Ljava/lang/String;Lorg/apache/cordova/api/CallbackContext;)V

    invoke-interface {v5, v6}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .end local v1    # "contactId":Ljava/lang/String;
    :cond_4
    move v4, v5

    .line 118
    goto :goto_0
.end method
