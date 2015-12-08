.class Lorg/apache/cordova/ContactManager$1;
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

.field final synthetic val$filter:Lorg/json/JSONArray;

.field final synthetic val$options:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Lorg/apache/cordova/ContactManager;Lorg/json/JSONArray;Lorg/json/JSONObject;Lorg/apache/cordova/api/CallbackContext;)V
    .locals 0

    .prologue
    .line 77
    iput-object p1, p0, Lorg/apache/cordova/ContactManager$1;->this$0:Lorg/apache/cordova/ContactManager;

    iput-object p2, p0, Lorg/apache/cordova/ContactManager$1;->val$filter:Lorg/json/JSONArray;

    iput-object p3, p0, Lorg/apache/cordova/ContactManager$1;->val$options:Lorg/json/JSONObject;

    iput-object p4, p0, Lorg/apache/cordova/ContactManager$1;->val$callbackContext:Lorg/apache/cordova/api/CallbackContext;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 79
    iget-object v1, p0, Lorg/apache/cordova/ContactManager$1;->this$0:Lorg/apache/cordova/ContactManager;

    # getter for: Lorg/apache/cordova/ContactManager;->contactAccessor:Lorg/apache/cordova/ContactAccessor;
    invoke-static {v1}, Lorg/apache/cordova/ContactManager;->access$000(Lorg/apache/cordova/ContactManager;)Lorg/apache/cordova/ContactAccessor;

    move-result-object v1

    iget-object v2, p0, Lorg/apache/cordova/ContactManager$1;->val$filter:Lorg/json/JSONArray;

    iget-object v3, p0, Lorg/apache/cordova/ContactManager$1;->val$options:Lorg/json/JSONObject;

    invoke-virtual {v1, v2, v3}, Lorg/apache/cordova/ContactAccessor;->search(Lorg/json/JSONArray;Lorg/json/JSONObject;)Lorg/json/JSONArray;

    move-result-object v0

    .line 80
    .local v0, "res":Lorg/json/JSONArray;
    iget-object v1, p0, Lorg/apache/cordova/ContactManager$1;->val$callbackContext:Lorg/apache/cordova/api/CallbackContext;

    invoke-virtual {v1, v0}, Lorg/apache/cordova/api/CallbackContext;->success(Lorg/json/JSONArray;)V

    .line 81
    return-void
.end method
