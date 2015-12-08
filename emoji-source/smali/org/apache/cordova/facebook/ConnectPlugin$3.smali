.class Lorg/apache/cordova/facebook/ConnectPlugin$3;
.super Ljava/lang/Object;
.source "ConnectPlugin.java"

# interfaces
.implements Lcom/facebook/widget/FacebookDialog$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/facebook/ConnectPlugin;->onActivityResult(IILandroid/content/Intent;)V
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
    .line 139
    iput-object p1, p0, Lorg/apache/cordova/facebook/ConnectPlugin$3;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Lcom/facebook/widget/FacebookDialog$PendingCall;Landroid/os/Bundle;)V
    .locals 2
    .param p1, "pendingCall"    # Lcom/facebook/widget/FacebookDialog$PendingCall;
    .param p2, "data"    # Landroid/os/Bundle;

    .prologue
    .line 148
    const-string v0, "Activity"

    const-string v1, "Success!"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 149
    iget-object v0, p0, Lorg/apache/cordova/facebook/ConnectPlugin$3;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    # invokes: Lorg/apache/cordova/facebook/ConnectPlugin;->handleSuccess(Landroid/os/Bundle;)V
    invoke-static {v0, p2}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$300(Lorg/apache/cordova/facebook/ConnectPlugin;Landroid/os/Bundle;)V

    .line 150
    return-void
.end method

.method public onError(Lcom/facebook/widget/FacebookDialog$PendingCall;Ljava/lang/Exception;Landroid/os/Bundle;)V
    .locals 5
    .param p1, "pendingCall"    # Lcom/facebook/widget/FacebookDialog$PendingCall;
    .param p2, "error"    # Ljava/lang/Exception;
    .param p3, "data"    # Landroid/os/Bundle;

    .prologue
    .line 142
    const-string v0, "Activity"

    const-string v1, "Error: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 143
    iget-object v0, p0, Lorg/apache/cordova/facebook/ConnectPlugin$3;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    iget-object v1, p0, Lorg/apache/cordova/facebook/ConnectPlugin$3;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    # getter for: Lorg/apache/cordova/facebook/ConnectPlugin;->showDialogContext:Lorg/apache/cordova/CallbackContext;
    invoke-static {v1}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$100(Lorg/apache/cordova/facebook/ConnectPlugin;)Lorg/apache/cordova/CallbackContext;

    move-result-object v1

    # invokes: Lorg/apache/cordova/facebook/ConnectPlugin;->handleError(Ljava/lang/Exception;Lorg/apache/cordova/CallbackContext;)V
    invoke-static {v0, p2, v1}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$200(Lorg/apache/cordova/facebook/ConnectPlugin;Ljava/lang/Exception;Lorg/apache/cordova/CallbackContext;)V

    .line 144
    return-void
.end method
