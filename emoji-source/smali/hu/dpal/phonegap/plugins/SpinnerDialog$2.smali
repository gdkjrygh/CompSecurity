.class Lhu/dpal/phonegap/plugins/SpinnerDialog$2;
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


# direct methods
.method constructor <init>(Lhu/dpal/phonegap/plugins/SpinnerDialog;)V
    .locals 0
    .param p1, "this$0"    # Lhu/dpal/phonegap/plugins/SpinnerDialog;

    .prologue
    .line 63
    iput-object p1, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog$2;->this$0:Lhu/dpal/phonegap/plugins/SpinnerDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog$2;->this$0:Lhu/dpal/phonegap/plugins/SpinnerDialog;

    iget-object v0, v0, Lhu/dpal/phonegap/plugins/SpinnerDialog;->spinnerDialogStack:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->empty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 67
    iget-object v0, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog$2;->this$0:Lhu/dpal/phonegap/plugins/SpinnerDialog;

    iget-object v0, v0, Lhu/dpal/phonegap/plugins/SpinnerDialog;->spinnerDialogStack:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 70
    :cond_0
    return-void
.end method
