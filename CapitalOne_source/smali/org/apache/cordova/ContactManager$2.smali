.class Lorg/apache/cordova/ContactManager$2;
.super Ljava/lang/Object;
.source "ContactManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/ContactManager;->execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/api/CallbackContext;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/ContactManager;

.field final synthetic val$callbackContext:Lorg/apache/cordova/api/CallbackContext;

.field final synthetic val$contact:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Lorg/apache/cordova/ContactManager;Lorg/json/JSONObject;Lorg/apache/cordova/api/CallbackContext;)V
    .locals 0

    .prologue
    .line 86
    iput-object p1, p0, Lorg/apache/cordova/ContactManager$2;->this$0:Lorg/apache/cordova/ContactManager;

    iput-object p2, p0, Lorg/apache/cordova/ContactManager$2;->val$contact:Lorg/json/JSONObject;

    iput-object p3, p0, Lorg/apache/cordova/ContactManager$2;->val$callbackContext:Lorg/apache/cordova/api/CallbackContext;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .prologue
    .line 88
    const/4 v2, 0x0

    .line 89
    .local v2, "res":Lorg/json/JSONObject;
    iget-object v3, p0, Lorg/apache/cordova/ContactManager$2;->this$0:Lorg/apache/cordova/ContactManager;

    # getter for: Lorg/apache/cordova/ContactManager;->contactAccessor:Lorg/apache/cordova/ContactAccessor;
    invoke-static {v3}, Lorg/apache/cordova/ContactManager;->access$000(Lorg/apache/cordova/ContactManager;)Lorg/apache/cordova/ContactAccessor;

    move-result-object v3

    iget-object v4, p0, Lorg/apache/cordova/ContactManager$2;->val$contact:Lorg/json/JSONObject;

    invoke-virtual {v3, v4}, Lorg/apache/cordova/ContactAccessor;->save(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    .line 90
    .local v1, "id":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 92
    :try_start_0
    iget-object v3, p0, Lorg/apache/cordova/ContactManager$2;->this$0:Lorg/apache/cordova/ContactManager;

    # getter for: Lorg/apache/cordova/ContactManager;->contactAccessor:Lorg/apache/cordova/ContactAccessor;
    invoke-static {v3}, Lorg/apache/cordova/ContactManager;->access$000(Lorg/apache/cordova/ContactManager;)Lorg/apache/cordova/ContactAccessor;

    move-result-object v3

    invoke-virtual {v3, v1}, Lorg/apache/cordova/ContactAccessor;->getContactById(Ljava/lang/String;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 97
    :cond_0
    :goto_0
    if-eqz v2, :cond_1

    .line 98
    iget-object v3, p0, Lorg/apache/cordova/ContactManager$2;->val$callbackContext:Lorg/apache/cordova/api/CallbackContext;

    invoke-virtual {v3, v2}, Lorg/apache/cordova/api/CallbackContext;->success(Lorg/json/JSONObject;)V

    .line 102
    :goto_1
    return-void

    .line 93
    :catch_0
    move-exception v0

    .line 94
    .local v0, "e":Lorg/json/JSONException;
    const-string v3, "Contact Query"

    const-string v4, "JSON fail."

    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 100
    .end local v0    # "e":Lorg/json/JSONException;
    :cond_1
    iget-object v3, p0, Lorg/apache/cordova/ContactManager$2;->val$callbackContext:Lorg/apache/cordova/api/CallbackContext;

    new-instance v4, Lorg/apache/cordova/api/PluginResult;

    sget-object v5, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    const/4 v6, 0x0

    invoke-direct {v4, v5, v6}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;I)V

    invoke-virtual {v3, v4}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    goto :goto_1
.end method
