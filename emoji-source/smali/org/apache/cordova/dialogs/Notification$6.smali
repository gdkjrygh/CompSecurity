.class Lorg/apache/cordova/dialogs/Notification$6;
.super Ljava/lang/Object;
.source "Notification.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/dialogs/Notification;->progressStart(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/dialogs/Notification;

.field final synthetic val$cordova:Lorg/apache/cordova/CordovaInterface;

.field final synthetic val$message:Ljava/lang/String;

.field final synthetic val$notification:Lorg/apache/cordova/dialogs/Notification;

.field final synthetic val$title:Ljava/lang/String;


# direct methods
.method constructor <init>(Lorg/apache/cordova/dialogs/Notification;Lorg/apache/cordova/dialogs/Notification;Lorg/apache/cordova/CordovaInterface;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "this$0"    # Lorg/apache/cordova/dialogs/Notification;

    .prologue
    .line 411
    iput-object p1, p0, Lorg/apache/cordova/dialogs/Notification$6;->this$0:Lorg/apache/cordova/dialogs/Notification;

    iput-object p2, p0, Lorg/apache/cordova/dialogs/Notification$6;->val$notification:Lorg/apache/cordova/dialogs/Notification;

    iput-object p3, p0, Lorg/apache/cordova/dialogs/Notification$6;->val$cordova:Lorg/apache/cordova/CordovaInterface;

    iput-object p4, p0, Lorg/apache/cordova/dialogs/Notification$6;->val$title:Ljava/lang/String;

    iput-object p5, p0, Lorg/apache/cordova/dialogs/Notification$6;->val$message:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 413
    iget-object v0, p0, Lorg/apache/cordova/dialogs/Notification$6;->val$notification:Lorg/apache/cordova/dialogs/Notification;

    iget-object v1, p0, Lorg/apache/cordova/dialogs/Notification$6;->this$0:Lorg/apache/cordova/dialogs/Notification;

    iget-object v2, p0, Lorg/apache/cordova/dialogs/Notification$6;->val$cordova:Lorg/apache/cordova/CordovaInterface;

    # invokes: Lorg/apache/cordova/dialogs/Notification;->createProgressDialog(Lorg/apache/cordova/CordovaInterface;)Landroid/app/ProgressDialog;
    invoke-static {v1, v2}, Lorg/apache/cordova/dialogs/Notification;->access$200(Lorg/apache/cordova/dialogs/Notification;Lorg/apache/cordova/CordovaInterface;)Landroid/app/ProgressDialog;

    move-result-object v1

    iput-object v1, v0, Lorg/apache/cordova/dialogs/Notification;->progressDialog:Landroid/app/ProgressDialog;

    .line 414
    iget-object v0, p0, Lorg/apache/cordova/dialogs/Notification$6;->val$notification:Lorg/apache/cordova/dialogs/Notification;

    iget-object v0, v0, Lorg/apache/cordova/dialogs/Notification;->progressDialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0, v3}, Landroid/app/ProgressDialog;->setProgressStyle(I)V

    .line 415
    iget-object v0, p0, Lorg/apache/cordova/dialogs/Notification$6;->val$notification:Lorg/apache/cordova/dialogs/Notification;

    iget-object v0, v0, Lorg/apache/cordova/dialogs/Notification;->progressDialog:Landroid/app/ProgressDialog;

    iget-object v1, p0, Lorg/apache/cordova/dialogs/Notification$6;->val$title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 416
    iget-object v0, p0, Lorg/apache/cordova/dialogs/Notification$6;->val$notification:Lorg/apache/cordova/dialogs/Notification;

    iget-object v0, v0, Lorg/apache/cordova/dialogs/Notification;->progressDialog:Landroid/app/ProgressDialog;

    iget-object v1, p0, Lorg/apache/cordova/dialogs/Notification$6;->val$message:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 417
    iget-object v0, p0, Lorg/apache/cordova/dialogs/Notification$6;->val$notification:Lorg/apache/cordova/dialogs/Notification;

    iget-object v0, v0, Lorg/apache/cordova/dialogs/Notification;->progressDialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0, v3}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 418
    iget-object v0, p0, Lorg/apache/cordova/dialogs/Notification$6;->val$notification:Lorg/apache/cordova/dialogs/Notification;

    iget-object v0, v0, Lorg/apache/cordova/dialogs/Notification;->progressDialog:Landroid/app/ProgressDialog;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMax(I)V

    .line 419
    iget-object v0, p0, Lorg/apache/cordova/dialogs/Notification$6;->val$notification:Lorg/apache/cordova/dialogs/Notification;

    iget-object v0, v0, Lorg/apache/cordova/dialogs/Notification;->progressDialog:Landroid/app/ProgressDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setProgress(I)V

    .line 420
    iget-object v0, p0, Lorg/apache/cordova/dialogs/Notification$6;->val$notification:Lorg/apache/cordova/dialogs/Notification;

    iget-object v0, v0, Lorg/apache/cordova/dialogs/Notification;->progressDialog:Landroid/app/ProgressDialog;

    new-instance v1, Lorg/apache/cordova/dialogs/Notification$6$1;

    invoke-direct {v1, p0}, Lorg/apache/cordova/dialogs/Notification$6$1;-><init>(Lorg/apache/cordova/dialogs/Notification$6;)V

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 426
    iget-object v0, p0, Lorg/apache/cordova/dialogs/Notification$6;->val$notification:Lorg/apache/cordova/dialogs/Notification;

    iget-object v0, v0, Lorg/apache/cordova/dialogs/Notification;->progressDialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 427
    return-void
.end method
