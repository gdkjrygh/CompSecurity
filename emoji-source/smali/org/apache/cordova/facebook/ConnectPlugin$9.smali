.class Lorg/apache/cordova/facebook/ConnectPlugin$9;
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

.field final synthetic val$me:Lorg/apache/cordova/facebook/ConnectPlugin;


# direct methods
.method constructor <init>(Lorg/apache/cordova/facebook/ConnectPlugin;Lorg/apache/cordova/facebook/ConnectPlugin;)V
    .locals 0
    .param p1, "this$0"    # Lorg/apache/cordova/facebook/ConnectPlugin;

    .prologue
    .line 444
    iput-object p1, p0, Lorg/apache/cordova/facebook/ConnectPlugin$9;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    iput-object p2, p0, Lorg/apache/cordova/facebook/ConnectPlugin$9;->val$me:Lorg/apache/cordova/facebook/ConnectPlugin;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 447
    new-instance v1, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilder;

    iget-object v2, p0, Lorg/apache/cordova/facebook/ConnectPlugin$9;->val$me:Lorg/apache/cordova/facebook/ConnectPlugin;

    iget-object v2, v2, Lorg/apache/cordova/facebook/ConnectPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v2}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilder;-><init>(Landroid/app/Activity;)V

    iget-object v2, p0, Lorg/apache/cordova/facebook/ConnectPlugin$9;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    .line 448
    # getter for: Lorg/apache/cordova/facebook/ConnectPlugin;->paramBundle:Landroid/os/Bundle;
    invoke-static {v2}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$500(Lorg/apache/cordova/facebook/ConnectPlugin;)Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "name"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilder;->setName(Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;

    move-result-object v1

    check-cast v1, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilder;

    iget-object v2, p0, Lorg/apache/cordova/facebook/ConnectPlugin$9;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    .line 449
    # getter for: Lorg/apache/cordova/facebook/ConnectPlugin;->paramBundle:Landroid/os/Bundle;
    invoke-static {v2}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$500(Lorg/apache/cordova/facebook/ConnectPlugin;)Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "caption"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilder;->setCaption(Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;

    move-result-object v1

    check-cast v1, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilder;

    iget-object v2, p0, Lorg/apache/cordova/facebook/ConnectPlugin$9;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    .line 450
    # getter for: Lorg/apache/cordova/facebook/ConnectPlugin;->paramBundle:Landroid/os/Bundle;
    invoke-static {v2}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$500(Lorg/apache/cordova/facebook/ConnectPlugin;)Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "description"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilder;->setDescription(Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;

    move-result-object v1

    check-cast v1, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilder;

    iget-object v2, p0, Lorg/apache/cordova/facebook/ConnectPlugin$9;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    .line 451
    # getter for: Lorg/apache/cordova/facebook/ConnectPlugin;->paramBundle:Landroid/os/Bundle;
    invoke-static {v2}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$500(Lorg/apache/cordova/facebook/ConnectPlugin;)Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "href"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilder;->setLink(Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;

    move-result-object v1

    check-cast v1, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilder;

    iget-object v2, p0, Lorg/apache/cordova/facebook/ConnectPlugin$9;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    .line 452
    # getter for: Lorg/apache/cordova/facebook/ConnectPlugin;->paramBundle:Landroid/os/Bundle;
    invoke-static {v2}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$500(Lorg/apache/cordova/facebook/ConnectPlugin;)Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "picture"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilder;->setPicture(Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;

    move-result-object v1

    check-cast v1, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilder;

    .line 453
    invoke-virtual {v1}, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilder;->build()Lcom/facebook/widget/FacebookDialog;

    move-result-object v0

    .line 454
    .local v0, "shareDialog":Lcom/facebook/widget/FacebookDialog;
    iget-object v1, p0, Lorg/apache/cordova/facebook/ConnectPlugin$9;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    # getter for: Lorg/apache/cordova/facebook/ConnectPlugin;->uiHelper:Lcom/facebook/UiLifecycleHelper;
    invoke-static {v1}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$600(Lorg/apache/cordova/facebook/ConnectPlugin;)Lcom/facebook/UiLifecycleHelper;

    move-result-object v1

    invoke-virtual {v0}, Lcom/facebook/widget/FacebookDialog;->present()Lcom/facebook/widget/FacebookDialog$PendingCall;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/UiLifecycleHelper;->trackPendingDialogCall(Lcom/facebook/widget/FacebookDialog$PendingCall;)V

    .line 455
    return-void
.end method
