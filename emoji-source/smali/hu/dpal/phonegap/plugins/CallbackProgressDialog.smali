.class public Lhu/dpal/phonegap/plugins/CallbackProgressDialog;
.super Landroid/app/ProgressDialog;
.source "CallbackProgressDialog.java"


# static fields
.field public static callbackContext:Lorg/apache/cordova/CallbackContext;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 15
    invoke-direct {p0, p1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 16
    return-void
.end method

.method private sendCallback()V
    .locals 2

    .prologue
    .line 34
    new-instance v0, Lorg/apache/cordova/PluginResult;

    sget-object v1, Lorg/apache/cordova/PluginResult$Status;->OK:Lorg/apache/cordova/PluginResult$Status;

    invoke-direct {v0, v1}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;)V

    .line 35
    .local v0, "pluginResult":Lorg/apache/cordova/PluginResult;
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lorg/apache/cordova/PluginResult;->setKeepCallback(Z)V

    .line 36
    sget-object v1, Lhu/dpal/phonegap/plugins/CallbackProgressDialog;->callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {v1, v0}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V

    .line 37
    return-void
.end method

.method public static show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZLandroid/content/DialogInterface$OnCancelListener;Lorg/apache/cordova/CallbackContext;)Lhu/dpal/phonegap/plugins/CallbackProgressDialog;
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "title"    # Ljava/lang/CharSequence;
    .param p2, "message"    # Ljava/lang/CharSequence;
    .param p3, "indeterminate"    # Z
    .param p4, "cancelable"    # Z
    .param p5, "cancelListener"    # Landroid/content/DialogInterface$OnCancelListener;
    .param p6, "callbackContext"    # Lorg/apache/cordova/CallbackContext;

    .prologue
    .line 22
    sput-object p6, Lhu/dpal/phonegap/plugins/CallbackProgressDialog;->callbackContext:Lorg/apache/cordova/CallbackContext;

    .line 23
    new-instance v0, Lhu/dpal/phonegap/plugins/CallbackProgressDialog;

    invoke-direct {v0, p0}, Lhu/dpal/phonegap/plugins/CallbackProgressDialog;-><init>(Landroid/content/Context;)V

    .line 24
    .local v0, "dialog":Lhu/dpal/phonegap/plugins/CallbackProgressDialog;
    invoke-virtual {v0, p1}, Lhu/dpal/phonegap/plugins/CallbackProgressDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 25
    invoke-virtual {v0, p2}, Lhu/dpal/phonegap/plugins/CallbackProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 26
    invoke-virtual {v0, p3}, Lhu/dpal/phonegap/plugins/CallbackProgressDialog;->setIndeterminate(Z)V

    .line 27
    invoke-virtual {v0, p4}, Lhu/dpal/phonegap/plugins/CallbackProgressDialog;->setCancelable(Z)V

    .line 28
    invoke-virtual {v0, p5}, Lhu/dpal/phonegap/plugins/CallbackProgressDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 29
    invoke-virtual {v0}, Lhu/dpal/phonegap/plugins/CallbackProgressDialog;->show()V

    .line 30
    return-object v0
.end method


# virtual methods
.method public onBackPressed()V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Lhu/dpal/phonegap/plugins/CallbackProgressDialog;->sendCallback()V

    .line 42
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1, "event"    # Landroid/view/MotionEvent;

    .prologue
    .line 46
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 47
    invoke-direct {p0}, Lhu/dpal/phonegap/plugins/CallbackProgressDialog;->sendCallback()V

    .line 48
    const/4 v0, 0x1

    .line 50
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
