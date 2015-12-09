.class Lorg/apache/cordova/Notification$4;
.super Ljava/lang/Object;
.source "Notification.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/Notification;->progressStart(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/Notification;

.field final synthetic val$cordova:Lorg/apache/cordova/api/CordovaInterface;

.field final synthetic val$message:Ljava/lang/String;

.field final synthetic val$notification:Lorg/apache/cordova/Notification;

.field final synthetic val$title:Ljava/lang/String;


# direct methods
.method constructor <init>(Lorg/apache/cordova/Notification;Lorg/apache/cordova/Notification;Lorg/apache/cordova/api/CordovaInterface;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 299
    iput-object p1, p0, Lorg/apache/cordova/Notification$4;->this$0:Lorg/apache/cordova/Notification;

    iput-object p2, p0, Lorg/apache/cordova/Notification$4;->val$notification:Lorg/apache/cordova/Notification;

    iput-object p3, p0, Lorg/apache/cordova/Notification$4;->val$cordova:Lorg/apache/cordova/api/CordovaInterface;

    iput-object p4, p0, Lorg/apache/cordova/Notification$4;->val$title:Ljava/lang/String;

    iput-object p5, p0, Lorg/apache/cordova/Notification$4;->val$message:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 301
    iget-object v0, p0, Lorg/apache/cordova/Notification$4;->val$notification:Lorg/apache/cordova/Notification;

    new-instance v1, Landroid/app/ProgressDialog;

    iget-object v2, p0, Lorg/apache/cordova/Notification$4;->val$cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v2}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lorg/apache/cordova/Notification;->progressDialog:Landroid/app/ProgressDialog;

    .line 302
    iget-object v0, p0, Lorg/apache/cordova/Notification$4;->val$notification:Lorg/apache/cordova/Notification;

    iget-object v0, v0, Lorg/apache/cordova/Notification;->progressDialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0, v3}, Landroid/app/ProgressDialog;->setProgressStyle(I)V

    .line 303
    iget-object v0, p0, Lorg/apache/cordova/Notification$4;->val$notification:Lorg/apache/cordova/Notification;

    iget-object v0, v0, Lorg/apache/cordova/Notification;->progressDialog:Landroid/app/ProgressDialog;

    iget-object v1, p0, Lorg/apache/cordova/Notification$4;->val$title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 304
    iget-object v0, p0, Lorg/apache/cordova/Notification$4;->val$notification:Lorg/apache/cordova/Notification;

    iget-object v0, v0, Lorg/apache/cordova/Notification;->progressDialog:Landroid/app/ProgressDialog;

    iget-object v1, p0, Lorg/apache/cordova/Notification$4;->val$message:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 305
    iget-object v0, p0, Lorg/apache/cordova/Notification$4;->val$notification:Lorg/apache/cordova/Notification;

    iget-object v0, v0, Lorg/apache/cordova/Notification;->progressDialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0, v3}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 306
    iget-object v0, p0, Lorg/apache/cordova/Notification$4;->val$notification:Lorg/apache/cordova/Notification;

    iget-object v0, v0, Lorg/apache/cordova/Notification;->progressDialog:Landroid/app/ProgressDialog;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMax(I)V

    .line 307
    iget-object v0, p0, Lorg/apache/cordova/Notification$4;->val$notification:Lorg/apache/cordova/Notification;

    iget-object v0, v0, Lorg/apache/cordova/Notification;->progressDialog:Landroid/app/ProgressDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setProgress(I)V

    .line 308
    iget-object v0, p0, Lorg/apache/cordova/Notification$4;->val$notification:Lorg/apache/cordova/Notification;

    iget-object v0, v0, Lorg/apache/cordova/Notification;->progressDialog:Landroid/app/ProgressDialog;

    new-instance v1, Lorg/apache/cordova/Notification$4$1;

    invoke-direct {v1, p0}, Lorg/apache/cordova/Notification$4$1;-><init>(Lorg/apache/cordova/Notification$4;)V

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 314
    iget-object v0, p0, Lorg/apache/cordova/Notification$4;->val$notification:Lorg/apache/cordova/Notification;

    iget-object v0, v0, Lorg/apache/cordova/Notification;->progressDialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 315
    return-void
.end method
