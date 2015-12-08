.class Lorg/apache/cordova/facebook/ConnectPlugin$11;
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
    .line 470
    iput-object p1, p0, Lorg/apache/cordova/facebook/ConnectPlugin$11;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    iput-object p2, p0, Lorg/apache/cordova/facebook/ConnectPlugin$11;->val$me:Lorg/apache/cordova/facebook/ConnectPlugin;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 472
    new-instance v0, Lcom/facebook/widget/FacebookDialog$MessageDialogBuilder;

    iget-object v3, p0, Lorg/apache/cordova/facebook/ConnectPlugin$11;->val$me:Lorg/apache/cordova/facebook/ConnectPlugin;

    iget-object v3, v3, Lorg/apache/cordova/facebook/ConnectPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v3}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-direct {v0, v3}, Lcom/facebook/widget/FacebookDialog$MessageDialogBuilder;-><init>(Landroid/app/Activity;)V

    .line 473
    .local v0, "builder":Lcom/facebook/widget/FacebookDialog$MessageDialogBuilder;
    iget-object v3, p0, Lorg/apache/cordova/facebook/ConnectPlugin$11;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    # getter for: Lorg/apache/cordova/facebook/ConnectPlugin;->paramBundle:Landroid/os/Bundle;
    invoke-static {v3}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$500(Lorg/apache/cordova/facebook/ConnectPlugin;)Landroid/os/Bundle;

    move-result-object v3

    const-string v4, "link"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 474
    iget-object v3, p0, Lorg/apache/cordova/facebook/ConnectPlugin$11;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    # getter for: Lorg/apache/cordova/facebook/ConnectPlugin;->paramBundle:Landroid/os/Bundle;
    invoke-static {v3}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$500(Lorg/apache/cordova/facebook/ConnectPlugin;)Landroid/os/Bundle;

    move-result-object v3

    const-string v4, "link"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/widget/FacebookDialog$MessageDialogBuilder;->setLink(Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;

    .line 475
    :cond_0
    iget-object v3, p0, Lorg/apache/cordova/facebook/ConnectPlugin$11;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    # getter for: Lorg/apache/cordova/facebook/ConnectPlugin;->paramBundle:Landroid/os/Bundle;
    invoke-static {v3}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$500(Lorg/apache/cordova/facebook/ConnectPlugin;)Landroid/os/Bundle;

    move-result-object v3

    const-string v4, "caption"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 476
    iget-object v3, p0, Lorg/apache/cordova/facebook/ConnectPlugin$11;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    # getter for: Lorg/apache/cordova/facebook/ConnectPlugin;->paramBundle:Landroid/os/Bundle;
    invoke-static {v3}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$500(Lorg/apache/cordova/facebook/ConnectPlugin;)Landroid/os/Bundle;

    move-result-object v3

    const-string v4, "caption"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/widget/FacebookDialog$MessageDialogBuilder;->setCaption(Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;

    .line 477
    :cond_1
    iget-object v3, p0, Lorg/apache/cordova/facebook/ConnectPlugin$11;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    # getter for: Lorg/apache/cordova/facebook/ConnectPlugin;->paramBundle:Landroid/os/Bundle;
    invoke-static {v3}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$500(Lorg/apache/cordova/facebook/ConnectPlugin;)Landroid/os/Bundle;

    move-result-object v3

    const-string v4, "name"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 478
    iget-object v3, p0, Lorg/apache/cordova/facebook/ConnectPlugin$11;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    # getter for: Lorg/apache/cordova/facebook/ConnectPlugin;->paramBundle:Landroid/os/Bundle;
    invoke-static {v3}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$500(Lorg/apache/cordova/facebook/ConnectPlugin;)Landroid/os/Bundle;

    move-result-object v3

    const-string v4, "name"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/widget/FacebookDialog$MessageDialogBuilder;->setName(Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;

    .line 479
    :cond_2
    iget-object v3, p0, Lorg/apache/cordova/facebook/ConnectPlugin$11;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    # getter for: Lorg/apache/cordova/facebook/ConnectPlugin;->paramBundle:Landroid/os/Bundle;
    invoke-static {v3}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$500(Lorg/apache/cordova/facebook/ConnectPlugin;)Landroid/os/Bundle;

    move-result-object v3

    const-string v4, "picture"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 480
    iget-object v3, p0, Lorg/apache/cordova/facebook/ConnectPlugin$11;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    # getter for: Lorg/apache/cordova/facebook/ConnectPlugin;->paramBundle:Landroid/os/Bundle;
    invoke-static {v3}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$500(Lorg/apache/cordova/facebook/ConnectPlugin;)Landroid/os/Bundle;

    move-result-object v3

    const-string v4, "picture"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/widget/FacebookDialog$MessageDialogBuilder;->setPicture(Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;

    .line 481
    :cond_3
    iget-object v3, p0, Lorg/apache/cordova/facebook/ConnectPlugin$11;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    # getter for: Lorg/apache/cordova/facebook/ConnectPlugin;->paramBundle:Landroid/os/Bundle;
    invoke-static {v3}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$500(Lorg/apache/cordova/facebook/ConnectPlugin;)Landroid/os/Bundle;

    move-result-object v3

    const-string v4, "description"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 482
    iget-object v3, p0, Lorg/apache/cordova/facebook/ConnectPlugin$11;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    # getter for: Lorg/apache/cordova/facebook/ConnectPlugin;->paramBundle:Landroid/os/Bundle;
    invoke-static {v3}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$500(Lorg/apache/cordova/facebook/ConnectPlugin;)Landroid/os/Bundle;

    move-result-object v3

    const-string v4, "description"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/widget/FacebookDialog$MessageDialogBuilder;->setDescription(Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;

    .line 484
    :cond_4
    invoke-virtual {v0}, Lcom/facebook/widget/FacebookDialog$MessageDialogBuilder;->canPresent()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 485
    invoke-virtual {v0}, Lcom/facebook/widget/FacebookDialog$MessageDialogBuilder;->build()Lcom/facebook/widget/FacebookDialog;

    move-result-object v1

    .line 486
    .local v1, "dialog":Lcom/facebook/widget/FacebookDialog;
    invoke-virtual {v1}, Lcom/facebook/widget/FacebookDialog;->present()Lcom/facebook/widget/FacebookDialog$PendingCall;

    .line 494
    .end local v1    # "dialog":Lcom/facebook/widget/FacebookDialog;
    :goto_0
    return-void

    .line 489
    :cond_5
    iget-object v3, p0, Lorg/apache/cordova/facebook/ConnectPlugin$11;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    const/4 v4, 0x0

    # setter for: Lorg/apache/cordova/facebook/ConnectPlugin;->trackingPendingCall:Z
    invoke-static {v3, v4}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$702(Lorg/apache/cordova/facebook/ConnectPlugin;Z)Z

    .line 490
    const-string v2, "Messaging unavailable."

    .line 491
    .local v2, "errMsg":Ljava/lang/String;
    const-string v3, "ConnectPlugin"

    invoke-static {v3, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 492
    iget-object v3, p0, Lorg/apache/cordova/facebook/ConnectPlugin$11;->this$0:Lorg/apache/cordova/facebook/ConnectPlugin;

    # getter for: Lorg/apache/cordova/facebook/ConnectPlugin;->showDialogContext:Lorg/apache/cordova/CallbackContext;
    invoke-static {v3}, Lorg/apache/cordova/facebook/ConnectPlugin;->access$100(Lorg/apache/cordova/facebook/ConnectPlugin;)Lorg/apache/cordova/CallbackContext;

    move-result-object v3

    invoke-virtual {v3, v2}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    goto :goto_0
.end method
