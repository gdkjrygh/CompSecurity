.class Lorg/apache/cordova/Notification$1$2;
.super Ljava/lang/Object;
.source "Notification.java"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/Notification$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lorg/apache/cordova/Notification$1;


# direct methods
.method constructor <init>(Lorg/apache/cordova/Notification$1;)V
    .locals 0

    .prologue
    .line 166
    iput-object p1, p0, Lorg/apache/cordova/Notification$1$2;->this$1:Lorg/apache/cordova/Notification$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 4
    .param p1, "dialog"    # Landroid/content/DialogInterface;

    .prologue
    .line 169
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 170
    iget-object v0, p0, Lorg/apache/cordova/Notification$1$2;->this$1:Lorg/apache/cordova/Notification$1;

    iget-object v0, v0, Lorg/apache/cordova/Notification$1;->val$callbackContext:Lorg/apache/cordova/api/CallbackContext;

    new-instance v1, Lorg/apache/cordova/api/PluginResult;

    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;I)V

    invoke-virtual {v0, v1}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    .line 171
    return-void
.end method
