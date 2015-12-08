.class Lorg/apache/cordova/dialogs/Notification$3$2;
.super Ljava/lang/Object;
.source "Notification.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


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
    .line 225
    iput-object p1, p0, Lorg/apache/cordova/dialogs/Notification$3$2;->this$1:Lorg/apache/cordova/dialogs/Notification$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    .line 227
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 228
    iget-object v0, p0, Lorg/apache/cordova/dialogs/Notification$3$2;->this$1:Lorg/apache/cordova/dialogs/Notification$3;

    iget-object v0, v0, Lorg/apache/cordova/dialogs/Notification$3;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    new-instance v1, Lorg/apache/cordova/PluginResult;

    sget-object v2, Lorg/apache/cordova/PluginResult$Status;->OK:Lorg/apache/cordova/PluginResult$Status;

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;I)V

    invoke-virtual {v0, v1}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V

    .line 229
    return-void
.end method
