.class Lorg/apache/cordova/dialogs/Notification$2;
.super Ljava/lang/Object;
.source "Notification.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/dialogs/Notification;->alert(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/apache/cordova/CallbackContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/dialogs/Notification;

.field final synthetic val$buttonLabel:Ljava/lang/String;

.field final synthetic val$callbackContext:Lorg/apache/cordova/CallbackContext;

.field final synthetic val$cordova:Lorg/apache/cordova/CordovaInterface;

.field final synthetic val$message:Ljava/lang/String;

.field final synthetic val$title:Ljava/lang/String;


# direct methods
.method constructor <init>(Lorg/apache/cordova/dialogs/Notification;Lorg/apache/cordova/CordovaInterface;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/apache/cordova/CallbackContext;)V
    .locals 0
    .param p1, "this$0"    # Lorg/apache/cordova/dialogs/Notification;

    .prologue
    .line 160
    iput-object p1, p0, Lorg/apache/cordova/dialogs/Notification$2;->this$0:Lorg/apache/cordova/dialogs/Notification;

    iput-object p2, p0, Lorg/apache/cordova/dialogs/Notification$2;->val$cordova:Lorg/apache/cordova/CordovaInterface;

    iput-object p3, p0, Lorg/apache/cordova/dialogs/Notification$2;->val$message:Ljava/lang/String;

    iput-object p4, p0, Lorg/apache/cordova/dialogs/Notification$2;->val$title:Ljava/lang/String;

    iput-object p5, p0, Lorg/apache/cordova/dialogs/Notification$2;->val$buttonLabel:Ljava/lang/String;

    iput-object p6, p0, Lorg/apache/cordova/dialogs/Notification$2;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 163
    iget-object v1, p0, Lorg/apache/cordova/dialogs/Notification$2;->this$0:Lorg/apache/cordova/dialogs/Notification;

    iget-object v2, p0, Lorg/apache/cordova/dialogs/Notification$2;->val$cordova:Lorg/apache/cordova/CordovaInterface;

    # invokes: Lorg/apache/cordova/dialogs/Notification;->createDialog(Lorg/apache/cordova/CordovaInterface;)Landroid/app/AlertDialog$Builder;
    invoke-static {v1, v2}, Lorg/apache/cordova/dialogs/Notification;->access$000(Lorg/apache/cordova/dialogs/Notification;Lorg/apache/cordova/CordovaInterface;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 164
    .local v0, "dlg":Landroid/app/AlertDialog$Builder;
    iget-object v1, p0, Lorg/apache/cordova/dialogs/Notification$2;->val$message:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 165
    iget-object v1, p0, Lorg/apache/cordova/dialogs/Notification$2;->val$title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 166
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 167
    iget-object v1, p0, Lorg/apache/cordova/dialogs/Notification$2;->val$buttonLabel:Ljava/lang/String;

    new-instance v2, Lorg/apache/cordova/dialogs/Notification$2$1;

    invoke-direct {v2, p0}, Lorg/apache/cordova/dialogs/Notification$2$1;-><init>(Lorg/apache/cordova/dialogs/Notification$2;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 174
    new-instance v1, Lorg/apache/cordova/dialogs/Notification$2$2;

    invoke-direct {v1, p0}, Lorg/apache/cordova/dialogs/Notification$2$2;-><init>(Lorg/apache/cordova/dialogs/Notification$2;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 182
    iget-object v1, p0, Lorg/apache/cordova/dialogs/Notification$2;->this$0:Lorg/apache/cordova/dialogs/Notification;

    # invokes: Lorg/apache/cordova/dialogs/Notification;->changeTextDirection(Landroid/app/AlertDialog$Builder;)V
    invoke-static {v1, v0}, Lorg/apache/cordova/dialogs/Notification;->access$100(Lorg/apache/cordova/dialogs/Notification;Landroid/app/AlertDialog$Builder;)V

    .line 183
    return-void
.end method
