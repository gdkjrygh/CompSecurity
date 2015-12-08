.class Lorg/apache/cordova/api/Plugin$1;
.super Ljava/lang/Object;
.source "Plugin.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/api/Plugin;->execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/api/CallbackContext;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/api/Plugin;

.field final synthetic val$action:Ljava/lang/String;

.field final synthetic val$args:Lorg/json/JSONArray;

.field final synthetic val$callbackId:Ljava/lang/String;


# direct methods
.method constructor <init>(Lorg/apache/cordova/api/Plugin;Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 74
    iput-object p1, p0, Lorg/apache/cordova/api/Plugin$1;->this$0:Lorg/apache/cordova/api/Plugin;

    iput-object p2, p0, Lorg/apache/cordova/api/Plugin$1;->val$action:Ljava/lang/String;

    iput-object p3, p0, Lorg/apache/cordova/api/Plugin$1;->val$args:Lorg/json/JSONArray;

    iput-object p4, p0, Lorg/apache/cordova/api/Plugin$1;->val$callbackId:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    .line 78
    :try_start_0
    iget-object v2, p0, Lorg/apache/cordova/api/Plugin$1;->this$0:Lorg/apache/cordova/api/Plugin;

    iget-object v3, p0, Lorg/apache/cordova/api/Plugin$1;->val$action:Ljava/lang/String;

    iget-object v4, p0, Lorg/apache/cordova/api/Plugin$1;->val$args:Lorg/json/JSONArray;

    iget-object v5, p0, Lorg/apache/cordova/api/Plugin$1;->val$callbackId:Ljava/lang/String;

    invoke-virtual {v2, v3, v4, v5}, Lorg/apache/cordova/api/Plugin;->execute(Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)Lorg/apache/cordova/api/PluginResult;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 82
    .local v0, "cr":Lorg/apache/cordova/api/PluginResult;
    :goto_0
    iget-object v2, p0, Lorg/apache/cordova/api/Plugin$1;->this$0:Lorg/apache/cordova/api/Plugin;

    iget-object v3, p0, Lorg/apache/cordova/api/Plugin$1;->val$callbackId:Ljava/lang/String;

    invoke-virtual {v2, v0, v3}, Lorg/apache/cordova/api/Plugin;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V

    .line 83
    return-void

    .line 79
    .end local v0    # "cr":Lorg/apache/cordova/api/PluginResult;
    :catch_0
    move-exception v1

    .line 80
    .local v1, "e":Ljava/lang/Throwable;
    new-instance v0, Lorg/apache/cordova/api/PluginResult;

    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    .restart local v0    # "cr":Lorg/apache/cordova/api/PluginResult;
    goto :goto_0
.end method
