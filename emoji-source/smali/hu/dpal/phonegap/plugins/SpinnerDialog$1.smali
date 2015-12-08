.class Lhu/dpal/phonegap/plugins/SpinnerDialog$1;
.super Ljava/lang/Object;
.source "SpinnerDialog.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhu/dpal/phonegap/plugins/SpinnerDialog;->execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lhu/dpal/phonegap/plugins/SpinnerDialog;

.field final synthetic val$callbackContext:Lorg/apache/cordova/CallbackContext;

.field final synthetic val$cordova:Lorg/apache/cordova/CordovaInterface;

.field final synthetic val$isFixed:Z

.field final synthetic val$message:Ljava/lang/String;

.field final synthetic val$title:Ljava/lang/String;


# direct methods
.method constructor <init>(Lhu/dpal/phonegap/plugins/SpinnerDialog;ZLorg/apache/cordova/CallbackContext;Lorg/apache/cordova/CordovaInterface;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "this$0"    # Lhu/dpal/phonegap/plugins/SpinnerDialog;

    .prologue
    .line 30
    iput-object p1, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog$1;->this$0:Lhu/dpal/phonegap/plugins/SpinnerDialog;

    iput-boolean p2, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog$1;->val$isFixed:Z

    iput-object p3, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog$1;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    iput-object p4, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog$1;->val$cordova:Lorg/apache/cordova/CordovaInterface;

    iput-object p5, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog$1;->val$title:Ljava/lang/String;

    iput-object p6, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog$1;->val$message:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .prologue
    const/4 v3, 0x1

    .line 33
    new-instance v5, Lhu/dpal/phonegap/plugins/SpinnerDialog$1$1;

    invoke-direct {v5, p0}, Lhu/dpal/phonegap/plugins/SpinnerDialog$1$1;-><init>(Lhu/dpal/phonegap/plugins/SpinnerDialog$1;)V

    .line 45
    .local v5, "onCancelListener":Landroid/content/DialogInterface$OnCancelListener;
    iget-boolean v0, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog$1;->val$isFixed:Z

    if-eqz v0, :cond_1

    .line 46
    iget-object v0, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog$1;->val$cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog$1;->val$title:Ljava/lang/String;

    iget-object v2, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog$1;->val$message:Ljava/lang/String;

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v6, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog$1;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    .end local v5    # "onCancelListener":Landroid/content/DialogInterface$OnCancelListener;
    invoke-static/range {v0 .. v6}, Lhu/dpal/phonegap/plugins/CallbackProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZLandroid/content/DialogInterface$OnCancelListener;Lorg/apache/cordova/CallbackContext;)Lhu/dpal/phonegap/plugins/CallbackProgressDialog;

    move-result-object v7

    .line 51
    .local v7, "dialog":Landroid/app/ProgressDialog;
    :goto_0
    iget-object v0, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog$1;->val$title:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog$1;->val$message:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 52
    new-instance v0, Landroid/widget/ProgressBar;

    iget-object v1, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog$1;->val$cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v1}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V

    invoke-virtual {v7, v0}, Landroid/app/ProgressDialog;->setContentView(Landroid/view/View;)V

    .line 55
    :cond_0
    iget-object v0, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog$1;->this$0:Lhu/dpal/phonegap/plugins/SpinnerDialog;

    iget-object v0, v0, Lhu/dpal/phonegap/plugins/SpinnerDialog;->spinnerDialogStack:Ljava/util/Stack;

    invoke-virtual {v0, v7}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    return-void

    .line 48
    .end local v7    # "dialog":Landroid/app/ProgressDialog;
    .restart local v5    # "onCancelListener":Landroid/content/DialogInterface$OnCancelListener;
    :cond_1
    iget-object v0, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog$1;->val$cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog$1;->val$title:Ljava/lang/String;

    iget-object v2, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog$1;->val$message:Ljava/lang/String;

    move v4, v3

    invoke-static/range {v0 .. v5}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZLandroid/content/DialogInterface$OnCancelListener;)Landroid/app/ProgressDialog;

    move-result-object v7

    .restart local v7    # "dialog":Landroid/app/ProgressDialog;
    goto :goto_0
.end method
