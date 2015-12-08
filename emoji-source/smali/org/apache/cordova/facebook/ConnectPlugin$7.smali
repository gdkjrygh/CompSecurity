.class Lorg/apache/cordova/facebook/ConnectPlugin$7;
.super Ljava/lang/Object;
.source "ConnectPlugin.java"

# interfaces
.implements Ljava/lang/Runnable;


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

.field final synthetic val$dialogCallback:Lcom/facebook/widget/WebDialog$OnCompleteListener;

.field final synthetic val$me:Lorg/apache/cordova/facebook/ConnectPlugin;


# direct methods
.method constructor <init>(Lorg/apache/cordova/facebook/ConnectPlugin;Lorg/apache/cordova/facebook/ConnectPlugin;Lcom/facebook/widget/WebDialog$OnCompleteListener;)V
    .locals 0
    .param p1, "this$0"    # Lorg/apache/cordova/facebook/ConnectPlugin;

    .prologue
    .line 426
    iput-object p1, p0, Lorg/apache/cordova/facebook/ConnectPlugin$7;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    iput-object p2, p0, Lorg/apache/cordova/facebook/ConnectPlugin$7;->val$me:Lorg/apache/cordova/facebook/ConnectPlugin;

    iput-object p3, p0, Lorg/apache/cordova/facebook/ConnectPlugin$7;->val$dialogCallback:Lcom/facebook/widget/WebDialog$OnCompleteListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 428
    new-instance v1, Lcom/facebook/widget/WebDialog$FeedDialogBuilder;

    iget-object v2, p0, Lorg/apache/cordova/facebook/ConnectPlugin$7;->val$me:Lorg/apache/cordova/facebook/ConnectPlugin;

    iget-object v2, v2, Lorg/apache/cordova/facebook/ConnectPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v2}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v3

    iget-object v4, p0, Lorg/apache/cordova/facebook/ConnectPlugin$7;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    # getter for: Lorg/apache/cordova/facebook/ConnectPlugin;->paramBundle:Landroid/os/Bundle;
    invoke-static {v4}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$500(Lorg/apache/cordova/facebook/ConnectPlugin;)Landroid/os/Bundle;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lcom/facebook/widget/WebDialog$FeedDialogBuilder;-><init>(Landroid/content/Context;Lcom/facebook/Session;Landroid/os/Bundle;)V

    iget-object v2, p0, Lorg/apache/cordova/facebook/ConnectPlugin$7;->val$dialogCallback:Lcom/facebook/widget/WebDialog$OnCompleteListener;

    invoke-virtual {v1, v2}, Lcom/facebook/widget/WebDialog$FeedDialogBuilder;->setOnCompleteListener(Lcom/facebook/widget/WebDialog$OnCompleteListener;)Lcom/facebook/widget/WebDialog$BuilderBase;

    move-result-object v1

    check-cast v1, Lcom/facebook/widget/WebDialog$FeedDialogBuilder;

    invoke-virtual {v1}, Lcom/facebook/widget/WebDialog$FeedDialogBuilder;->build()Lcom/facebook/widget/WebDialog;

    move-result-object v0

    .line 429
    .local v0, "feedDialog":Lcom/facebook/widget/WebDialog;
    invoke-virtual {v0}, Lcom/facebook/widget/WebDialog;->show()V

    .line 430
    return-void
.end method
