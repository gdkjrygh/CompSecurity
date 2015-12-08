.class Lorg/apache/cordova/facebook/ConnectPlugin$6;
.super Ljava/lang/Object;
.source "ConnectPlugin.java"

# interfaces
.implements Lcom/facebook/widget/WebDialog$OnCompleteListener;


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
    .line 413
    iput-object p1, p0, Lorg/apache/cordova/facebook/ConnectPlugin$6;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Landroid/os/Bundle;Lcom/facebook/FacebookException;)V
    .locals 2
    .param p1, "values"    # Landroid/os/Bundle;
    .param p2, "exception"    # Lcom/facebook/FacebookException;

    .prologue
    .line 417
    if-eqz p2, :cond_0

    .line 418
    iget-object v0, p0, Lorg/apache/cordova/facebook/ConnectPlugin$6;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    iget-object v1, p0, Lorg/apache/cordova/facebook/ConnectPlugin$6;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    # getter for: Lorg/apache/cordova/facebook/ConnectPlugin;->showDialogContext:Lorg/apache/cordova/CallbackContext;
    invoke-static {v1}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$100(Lorg/apache/cordova/facebook/ConnectPlugin;)Lorg/apache/cordova/CallbackContext;

    move-result-object v1

    # invokes: Lorg/apache/cordova/facebook/ConnectPlugin;->handleError(Ljava/lang/Exception;Lorg/apache/cordova/CallbackContext;)V
    invoke-static {v0, p2, v1}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$200(Lorg/apache/cordova/facebook/ConnectPlugin;Ljava/lang/Exception;Lorg/apache/cordova/CallbackContext;)V

    .line 422
    :goto_0
    return-void

    .line 420
    :cond_0
    iget-object v0, p0, Lorg/apache/cordova/facebook/ConnectPlugin$6;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    # invokes: Lorg/apache/cordova/facebook/ConnectPlugin;->handleSuccess(Landroid/os/Bundle;)V
    invoke-static {v0, p1}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$300(Lorg/apache/cordova/facebook/ConnectPlugin;Landroid/os/Bundle;)V

    goto :goto_0
.end method
