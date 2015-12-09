.class Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1$3;
.super Ljava/lang/Object;
.source "NotificationPlugin.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;

.field final synthetic val$hasNeutralButton:Z


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;Z)V
    .locals 0

    .prologue
    .line 150
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1$3;->this$1:Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;

    iput-boolean p2, p0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1$3;->val$hasNeutralButton:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    .line 152
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 153
    # getter for: Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin;->dialogs:Ljava/util/List;
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin;->access$000()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 156
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1$3;->this$1:Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;

    iget-object v1, v0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1;->val$callbackContext:Lorg/apache/cordova/api/CallbackContext;

    new-instance v2, Lorg/apache/cordova/api/PluginResult;

    sget-object v3, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin$1$3;->val$hasNeutralButton:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    :goto_0
    invoke-direct {v2, v3, v0}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;I)V

    invoke-virtual {v1, v2}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    .line 157
    return-void

    .line 156
    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method
