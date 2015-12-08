.class Lorg/apache/cordova/facebook/ConnectPlugin$4;
.super Ljava/lang/Object;
.source "ConnectPlugin.java"

# interfaces
.implements Lcom/facebook/Session$StatusCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/facebook/ConnectPlugin;->execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/facebook/ConnectPlugin;


# direct methods
.method constructor <init>(Lorg/apache/cordova/facebook/ConnectPlugin;)V
    .locals 0
    .param p1, "this$0"    # Lorg/apache/cordova/facebook/ConnectPlugin;

    .prologue
    .line 239
    iput-object p1, p0, Lorg/apache/cordova/facebook/ConnectPlugin$4;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call(Lcom/facebook/Session;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    .locals 1
    .param p1, "session"    # Lcom/facebook/Session;
    .param p2, "state"    # Lcom/facebook/SessionState;
    .param p3, "exception"    # Ljava/lang/Exception;

    .prologue
    .line 242
    iget-object v0, p0, Lorg/apache/cordova/facebook/ConnectPlugin$4;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    # invokes: Lorg/apache/cordova/facebook/ConnectPlugin;->onSessionStateChange(Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    invoke-static {v0, p2, p3}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$000(Lorg/apache/cordova/facebook/ConnectPlugin;Lcom/facebook/SessionState;Ljava/lang/Exception;)V

    .line 243
    return-void
.end method
