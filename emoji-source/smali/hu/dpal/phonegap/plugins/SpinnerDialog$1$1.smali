.class Lhu/dpal/phonegap/plugins/SpinnerDialog$1$1;
.super Ljava/lang/Object;
.source "SpinnerDialog.java"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhu/dpal/phonegap/plugins/SpinnerDialog$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lhu/dpal/phonegap/plugins/SpinnerDialog$1;


# direct methods
.method constructor <init>(Lhu/dpal/phonegap/plugins/SpinnerDialog$1;)V
    .locals 0
    .param p1, "this$1"    # Lhu/dpal/phonegap/plugins/SpinnerDialog$1;

    .prologue
    .line 33
    iput-object p1, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog$1$1;->this$1:Lhu/dpal/phonegap/plugins/SpinnerDialog$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1
    .param p1, "dialog"    # Landroid/content/DialogInterface;

    .prologue
    .line 35
    iget-object v0, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog$1$1;->this$1:Lhu/dpal/phonegap/plugins/SpinnerDialog$1;

    iget-boolean v0, v0, Lhu/dpal/phonegap/plugins/SpinnerDialog$1;->val$isFixed:Z

    if-nez v0, :cond_0

    .line 36
    :goto_0
    iget-object v0, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog$1$1;->this$1:Lhu/dpal/phonegap/plugins/SpinnerDialog$1;

    iget-object v0, v0, Lhu/dpal/phonegap/plugins/SpinnerDialog$1;->this$0:Lhu/dpal/phonegap/plugins/SpinnerDialog;

    iget-object v0, v0, Lhu/dpal/phonegap/plugins/SpinnerDialog;->spinnerDialogStack:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->empty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 37
    iget-object v0, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog$1$1;->this$1:Lhu/dpal/phonegap/plugins/SpinnerDialog$1;

    iget-object v0, v0, Lhu/dpal/phonegap/plugins/SpinnerDialog$1;->this$0:Lhu/dpal/phonegap/plugins/SpinnerDialog;

    iget-object v0, v0, Lhu/dpal/phonegap/plugins/SpinnerDialog;->spinnerDialogStack:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 38
    iget-object v0, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog$1$1;->this$1:Lhu/dpal/phonegap/plugins/SpinnerDialog$1;

    iget-object v0, v0, Lhu/dpal/phonegap/plugins/SpinnerDialog$1;->val$callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v0}, Lorg/apache/cordova/CallbackContext;->success()V

    goto :goto_0

    .line 41
    :cond_0
    return-void
.end method
