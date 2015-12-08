.class public Lhu/dpal/phonegap/plugins/SpinnerDialog;
.super Lorg/apache/cordova/CordovaPlugin;
.source "SpinnerDialog.java"


# instance fields
.field public spinnerDialogStack:Ljava/util/Stack;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Stack",
            "<",
            "Landroid/app/ProgressDialog;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0}, Lorg/apache/cordova/CordovaPlugin;-><init>()V

    .line 17
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog;->spinnerDialogStack:Ljava/util/Stack;

    .line 20
    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)Z
    .locals 10
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "args"    # Lorg/json/JSONArray;
    .param p3, "callbackContext"    # Lorg/apache/cordova/CallbackContext;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    const/4 v9, 0x0

    const/4 v8, 0x1

    .line 23
    const-string v3, "show"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 25
    const-string v3, "null"

    invoke-virtual {p2, v9}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    move-object v5, v1

    .line 26
    .local v5, "title":Ljava/lang/String;
    :goto_0
    const-string v3, "null"

    invoke-virtual {p2, v8}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    move-object v6, v1

    .line 27
    .local v6, "message":Ljava/lang/String;
    :goto_1
    const/4 v1, 0x2

    invoke-virtual {p2, v1}, Lorg/json/JSONArray;->getBoolean(I)Z

    move-result v2

    .line 29
    .local v2, "isFixed":Z
    iget-object v4, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog;->cordova:Lorg/apache/cordova/CordovaInterface;

    .line 30
    .local v4, "cordova":Lorg/apache/cordova/CordovaInterface;
    new-instance v0, Lhu/dpal/phonegap/plugins/SpinnerDialog$1;

    move-object v1, p0

    move-object v3, p3

    invoke-direct/range {v0 .. v6}, Lhu/dpal/phonegap/plugins/SpinnerDialog$1;-><init>(Lhu/dpal/phonegap/plugins/SpinnerDialog;ZLorg/apache/cordova/CallbackContext;Lorg/apache/cordova/CordovaInterface;Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .local v0, "runnable":Ljava/lang/Runnable;
    iget-object v1, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v1}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 75
    .end local v0    # "runnable":Ljava/lang/Runnable;
    .end local v2    # "isFixed":Z
    .end local v4    # "cordova":Lorg/apache/cordova/CordovaInterface;
    .end local v5    # "title":Ljava/lang/String;
    .end local v6    # "message":Ljava/lang/String;
    :cond_0
    :goto_2
    return v8

    .line 25
    :cond_1
    invoke-virtual {p2, v9}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 26
    .restart local v5    # "title":Ljava/lang/String;
    :cond_2
    invoke-virtual {p2, v8}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    .line 61
    .end local v5    # "title":Ljava/lang/String;
    :cond_3
    const-string v1, "hide"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 63
    new-instance v0, Lhu/dpal/phonegap/plugins/SpinnerDialog$2;

    invoke-direct {v0, p0}, Lhu/dpal/phonegap/plugins/SpinnerDialog$2;-><init>(Lhu/dpal/phonegap/plugins/SpinnerDialog;)V

    .line 72
    .restart local v0    # "runnable":Ljava/lang/Runnable;
    iget-object v1, p0, Lhu/dpal/phonegap/plugins/SpinnerDialog;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v1}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_2
.end method
