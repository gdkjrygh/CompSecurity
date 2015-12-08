.class Lorg/apache/cordova/dialogs/Notification$3$4;
.super Ljava/lang/Object;
.source "Notification.java"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/dialogs/Notification$3;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lorg/apache/cordova/dialogs/Notification$3;


# direct methods
.method constructor <init>(Lorg/apache/cordova/dialogs/Notification$3;)V
    .locals 0
    .param p1, "this$1"    # Lorg/apache/cordova/dialogs/Notification$3;

    .prologue
    .line 246
    iput-object p1, p0, Lorg/apache/cordova/dialogs/Notification$3$4;->this$1:Lorg/apache/cordova/dialogs/Notification$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 4
    .param p1, "dialog"    # Landroid/content/DialogInterface;

    .prologue
    .line 249
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 250
    iget-object v0, p0, Lorg/apache/cordova/dialogs/Notification$3$4;->this$1:Lorg/apache/cordova/dialogs/Notification$3;

    iget-object v0, v0, Lorg/apache/cordova/dialogs/Notification$3;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    new-instance v1, Lorg/apache/cordova/PluginResult;

    sget-object v2, Lorg/apache/cordova/PluginResult$Status;->OK:Lorg/apache/cordova/PluginResult$Status;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;I)V

    invoke-virtual {v0, v1}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V

    .line 251
    return-void
.end method
