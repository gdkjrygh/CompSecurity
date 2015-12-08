.class public Lorg/apache/cordova/CordovaChromeClient;
.super Lorg/xwalk/core/XWalkUIClient;
.source "CordovaChromeClient.java"


# static fields
.field static final synthetic $assertionsDisabled:Z

.field public static final FILECHOOSER_RESULTCODE:I = 0x1435


# instance fields
.field protected appView:Lorg/apache/cordova/CordovaWebView;

.field protected cordova:Lorg/apache/cordova/CordovaInterface;

.field private doClearHistory:Z

.field isCurrentlyLoading:Z

.field public mUploadMessage:Landroid/webkit/ValueCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/webkit/ValueCallback",
            "<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 55
    const-class v0, Lorg/apache/cordova/CordovaChromeClient;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/apache/cordova/CordovaChromeClient;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lorg/apache/cordova/CordovaInterface;)V
    .locals 1
    .param p1, "cordova"    # Lorg/apache/cordova/CordovaInterface;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 69
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/xwalk/core/XWalkUIClient;-><init>(Lorg/xwalk/core/XWalkView;)V

    .line 65
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/apache/cordova/CordovaChromeClient;->doClearHistory:Z

    .line 70
    iput-object p1, p0, Lorg/apache/cordova/CordovaChromeClient;->cordova:Lorg/apache/cordova/CordovaInterface;

    .line 71
    return-void
.end method

.method public constructor <init>(Lorg/apache/cordova/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V
    .locals 1
    .param p1, "ctx"    # Lorg/apache/cordova/CordovaInterface;
    .param p2, "app"    # Lorg/apache/cordova/CordovaWebView;

    .prologue
    .line 74
    invoke-direct {p0, p2}, Lorg/xwalk/core/XWalkUIClient;-><init>(Lorg/xwalk/core/XWalkView;)V

    .line 65
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/apache/cordova/CordovaChromeClient;->doClearHistory:Z

    .line 75
    iput-object p1, p0, Lorg/apache/cordova/CordovaChromeClient;->cordova:Lorg/apache/cordova/CordovaInterface;

    .line 76
    iput-object p2, p0, Lorg/apache/cordova/CordovaChromeClient;->appView:Lorg/apache/cordova/CordovaWebView;

    .line 77
    return-void
.end method

.method private onJsAlert(Lorg/xwalk/core/XWalkView;Ljava/lang/String;Ljava/lang/String;Lorg/xwalk/core/XWalkJavascriptResult;)Z
    .locals 4
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "message"    # Ljava/lang/String;
    .param p4, "result"    # Lorg/xwalk/core/XWalkJavascriptResult;

    .prologue
    const/4 v3, 0x1

    .line 115
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lorg/apache/cordova/CordovaChromeClient;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v1}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 116
    .local v0, "dlg":Landroid/app/AlertDialog$Builder;
    invoke-virtual {v0, p3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 117
    const-string v1, "Alert"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 119
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 120
    const v1, 0x104000a

    new-instance v2, Lorg/apache/cordova/CordovaChromeClient$1;

    invoke-direct {v2, p0, p4}, Lorg/apache/cordova/CordovaChromeClient$1;-><init>(Lorg/apache/cordova/CordovaChromeClient;Lorg/xwalk/core/XWalkJavascriptResult;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 126
    new-instance v1, Lorg/apache/cordova/CordovaChromeClient$2;

    invoke-direct {v1, p0, p4}, Lorg/apache/cordova/CordovaChromeClient$2;-><init>(Lorg/apache/cordova/CordovaChromeClient;Lorg/xwalk/core/XWalkJavascriptResult;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 132
    new-instance v1, Lorg/apache/cordova/CordovaChromeClient$3;

    invoke-direct {v1, p0, p4}, Lorg/apache/cordova/CordovaChromeClient$3;-><init>(Lorg/apache/cordova/CordovaChromeClient;Lorg/xwalk/core/XWalkJavascriptResult;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)Landroid/app/AlertDialog$Builder;

    .line 144
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 145
    return v3
.end method

.method private onJsConfirm(Lorg/xwalk/core/XWalkView;Ljava/lang/String;Ljava/lang/String;Lorg/xwalk/core/XWalkJavascriptResult;)Z
    .locals 4
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "message"    # Ljava/lang/String;
    .param p4, "result"    # Lorg/xwalk/core/XWalkJavascriptResult;

    .prologue
    const/4 v3, 0x1

    .line 159
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lorg/apache/cordova/CordovaChromeClient;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v1}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 160
    .local v0, "dlg":Landroid/app/AlertDialog$Builder;
    invoke-virtual {v0, p3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 161
    const-string v1, "Confirm"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 162
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 163
    const v1, 0x104000a

    new-instance v2, Lorg/apache/cordova/CordovaChromeClient$4;

    invoke-direct {v2, p0, p4}, Lorg/apache/cordova/CordovaChromeClient$4;-><init>(Lorg/apache/cordova/CordovaChromeClient;Lorg/xwalk/core/XWalkJavascriptResult;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 169
    const/high16 v1, 0x1040000

    new-instance v2, Lorg/apache/cordova/CordovaChromeClient$5;

    invoke-direct {v2, p0, p4}, Lorg/apache/cordova/CordovaChromeClient$5;-><init>(Lorg/apache/cordova/CordovaChromeClient;Lorg/xwalk/core/XWalkJavascriptResult;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 175
    new-instance v1, Lorg/apache/cordova/CordovaChromeClient$6;

    invoke-direct {v1, p0, p4}, Lorg/apache/cordova/CordovaChromeClient$6;-><init>(Lorg/apache/cordova/CordovaChromeClient;Lorg/xwalk/core/XWalkJavascriptResult;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 181
    new-instance v1, Lorg/apache/cordova/CordovaChromeClient$7;

    invoke-direct {v1, p0, p4}, Lorg/apache/cordova/CordovaChromeClient$7;-><init>(Lorg/apache/cordova/CordovaChromeClient;Lorg/xwalk/core/XWalkJavascriptResult;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)Landroid/app/AlertDialog$Builder;

    .line 193
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 194
    return v3
.end method

.method private onJsPrompt(Lorg/xwalk/core/XWalkView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xwalk/core/XWalkJavascriptResult;)Z
    .locals 6
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;
    .param p2, "origin"    # Ljava/lang/String;
    .param p3, "message"    # Ljava/lang/String;
    .param p4, "defaultValue"    # Ljava/lang/String;
    .param p5, "result"    # Lorg/xwalk/core/XWalkJavascriptResult;

    .prologue
    .line 209
    iget-object v4, p0, Lorg/apache/cordova/CordovaChromeClient;->appView:Lorg/apache/cordova/CordovaWebView;

    iget-object v4, v4, Lorg/apache/cordova/CordovaWebView;->bridge:Lorg/apache/cordova/CordovaBridge;

    invoke-virtual {v4, p2, p3, p4}, Lorg/apache/cordova/CordovaBridge;->promptOnJsPrompt(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 210
    .local v1, "handledRet":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 211
    invoke-interface {p5, v1}, Lorg/xwalk/core/XWalkJavascriptResult;->confirmWithResult(Ljava/lang/String;)V

    .line 238
    :goto_0
    const/4 v4, 0x1

    return v4

    .line 214
    :cond_0
    move-object v3, p5

    .line 215
    .local v3, "res":Lorg/xwalk/core/XWalkJavascriptResult;
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v4, p0, Lorg/apache/cordova/CordovaChromeClient;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v4}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v4

    invoke-direct {v0, v4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 216
    .local v0, "dlg":Landroid/app/AlertDialog$Builder;
    invoke-virtual {v0, p3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 217
    new-instance v2, Landroid/widget/EditText;

    iget-object v4, p0, Lorg/apache/cordova/CordovaChromeClient;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v4}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v4

    invoke-direct {v2, v4}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 218
    .local v2, "input":Landroid/widget/EditText;
    if-eqz p4, :cond_1

    .line 219
    invoke-virtual {v2, p4}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 221
    :cond_1
    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 222
    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 223
    const v4, 0x104000a

    new-instance v5, Lorg/apache/cordova/CordovaChromeClient$8;

    invoke-direct {v5, p0, v2, v3}, Lorg/apache/cordova/CordovaChromeClient$8;-><init>(Lorg/apache/cordova/CordovaChromeClient;Landroid/widget/EditText;Lorg/xwalk/core/XWalkJavascriptResult;)V

    invoke-virtual {v0, v4, v5}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 230
    const/high16 v4, 0x1040000

    new-instance v5, Lorg/apache/cordova/CordovaChromeClient$9;

    invoke-direct {v5, p0, v3}, Lorg/apache/cordova/CordovaChromeClient$9;-><init>(Lorg/apache/cordova/CordovaChromeClient;Lorg/xwalk/core/XWalkJavascriptResult;)V

    invoke-virtual {v0, v4, v5}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 236
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto :goto_0
.end method


# virtual methods
.method public getValueCallback()Landroid/webkit/ValueCallback;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/webkit/ValueCallback",
            "<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    .prologue
    .line 331
    iget-object v0, p0, Lorg/apache/cordova/CordovaChromeClient;->mUploadMessage:Landroid/webkit/ValueCallback;

    return-object v0
.end method

.method public onJavascriptModalDialog(Lorg/xwalk/core/XWalkView;Lorg/xwalk/core/XWalkUIClient$JavascriptMessageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xwalk/core/XWalkJavascriptResult;)Z
    .locals 6
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;
    .param p2, "type"    # Lorg/xwalk/core/XWalkUIClient$JavascriptMessageType;
    .param p3, "url"    # Ljava/lang/String;
    .param p4, "message"    # Ljava/lang/String;
    .param p5, "defaultValue"    # Ljava/lang/String;
    .param p6, "result"    # Lorg/xwalk/core/XWalkJavascriptResult;

    .prologue
    .line 87
    sget-object v0, Lorg/apache/cordova/CordovaChromeClient$11;->$SwitchMap$org$xwalk$core$XWalkUIClient$JavascriptMessageType:[I

    invoke-virtual {p2}, Lorg/xwalk/core/XWalkUIClient$JavascriptMessageType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 100
    sget-boolean v0, Lorg/apache/cordova/CordovaChromeClient;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 89
    :pswitch_0
    invoke-direct {p0, p1, p3, p4, p6}, Lorg/apache/cordova/CordovaChromeClient;->onJsAlert(Lorg/xwalk/core/XWalkView;Ljava/lang/String;Ljava/lang/String;Lorg/xwalk/core/XWalkJavascriptResult;)Z

    move-result v0

    .line 101
    :goto_0
    return v0

    .line 91
    :pswitch_1
    invoke-direct {p0, p1, p3, p4, p6}, Lorg/apache/cordova/CordovaChromeClient;->onJsConfirm(Lorg/xwalk/core/XWalkView;Ljava/lang/String;Ljava/lang/String;Lorg/xwalk/core/XWalkJavascriptResult;)Z

    move-result v0

    goto :goto_0

    :pswitch_2
    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    .line 93
    invoke-direct/range {v0 .. v5}, Lorg/apache/cordova/CordovaChromeClient;->onJsPrompt(Lorg/xwalk/core/XWalkView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xwalk/core/XWalkJavascriptResult;)Z

    move-result v0

    goto :goto_0

    .line 96
    :pswitch_3
    invoke-direct {p0, p1, p3, p4, p6}, Lorg/apache/cordova/CordovaChromeClient;->onJsConfirm(Lorg/xwalk/core/XWalkView;Ljava/lang/String;Ljava/lang/String;Lorg/xwalk/core/XWalkJavascriptResult;)Z

    move-result v0

    goto :goto_0

    .line 101
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 87
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public onPageLoadStarted(Lorg/xwalk/core/XWalkView;Ljava/lang/String;)V
    .locals 2
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 252
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/apache/cordova/CordovaChromeClient;->isCurrentlyLoading:Z

    .line 255
    iget-object v0, p0, Lorg/apache/cordova/CordovaChromeClient;->appView:Lorg/apache/cordova/CordovaWebView;

    iget-object v0, v0, Lorg/apache/cordova/CordovaWebView;->bridge:Lorg/apache/cordova/CordovaBridge;

    invoke-virtual {v0, p2}, Lorg/apache/cordova/CordovaBridge;->reset(Ljava/lang/String;)V

    .line 258
    iget-object v0, p0, Lorg/apache/cordova/CordovaChromeClient;->appView:Lorg/apache/cordova/CordovaWebView;

    const-string v1, "onPageStarted"

    invoke-virtual {v0, v1, p2}, Lorg/apache/cordova/CordovaWebView;->postMessage(Ljava/lang/String;Ljava/lang/Object;)V

    .line 261
    iget-object v0, p0, Lorg/apache/cordova/CordovaChromeClient;->appView:Lorg/apache/cordova/CordovaWebView;

    iget-object v0, v0, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/PluginManager;

    if-eqz v0, :cond_0

    .line 262
    iget-object v0, p0, Lorg/apache/cordova/CordovaChromeClient;->appView:Lorg/apache/cordova/CordovaWebView;

    iget-object v0, v0, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/PluginManager;

    invoke-virtual {v0}, Lorg/apache/cordova/PluginManager;->onReset()V

    .line 264
    :cond_0
    return-void
.end method

.method public onPageLoadStopped(Lorg/xwalk/core/XWalkView;Ljava/lang/String;Lorg/xwalk/core/XWalkUIClient$LoadStatus;)V
    .locals 4
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "status"    # Lorg/xwalk/core/XWalkUIClient$LoadStatus;

    .prologue
    const/4 v2, 0x0

    .line 278
    iget-boolean v1, p0, Lorg/apache/cordova/CordovaChromeClient;->isCurrentlyLoading:Z

    if-nez v1, :cond_1

    .line 322
    :cond_0
    :goto_0
    return-void

    .line 281
    :cond_1
    iput-boolean v2, p0, Lorg/apache/cordova/CordovaChromeClient;->isCurrentlyLoading:Z

    .line 289
    iget-boolean v1, p0, Lorg/apache/cordova/CordovaChromeClient;->doClearHistory:Z

    if-eqz v1, :cond_2

    .line 290
    invoke-virtual {p1}, Lorg/xwalk/core/XWalkView;->getNavigationHistory()Lorg/xwalk/core/XWalkNavigationHistory;

    move-result-object v1

    invoke-virtual {v1}, Lorg/xwalk/core/XWalkNavigationHistory;->clear()V

    .line 291
    iput-boolean v2, p0, Lorg/apache/cordova/CordovaChromeClient;->doClearHistory:Z

    .line 295
    :cond_2
    iget-object v1, p0, Lorg/apache/cordova/CordovaChromeClient;->appView:Lorg/apache/cordova/CordovaWebView;

    iget v2, v1, Lorg/apache/cordova/CordovaWebView;->loadUrlTimeout:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lorg/apache/cordova/CordovaWebView;->loadUrlTimeout:I

    .line 298
    iget-object v1, p0, Lorg/apache/cordova/CordovaChromeClient;->appView:Lorg/apache/cordova/CordovaWebView;

    const-string v2, "onPageFinished"

    invoke-virtual {v1, v2, p2}, Lorg/apache/cordova/CordovaWebView;->postMessage(Ljava/lang/String;Ljava/lang/Object;)V

    .line 301
    iget-object v1, p0, Lorg/apache/cordova/CordovaChromeClient;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v1}, Lorg/apache/cordova/CordovaWebView;->getVisibility()I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_3

    .line 302
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lorg/apache/cordova/CordovaChromeClient$10;

    invoke-direct {v1, p0}, Lorg/apache/cordova/CordovaChromeClient$10;-><init>(Lorg/apache/cordova/CordovaChromeClient;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 315
    .local v0, "t":Ljava/lang/Thread;
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 319
    .end local v0    # "t":Ljava/lang/Thread;
    :cond_3
    const-string v1, "about:blank"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 320
    iget-object v1, p0, Lorg/apache/cordova/CordovaChromeClient;->appView:Lorg/apache/cordova/CordovaWebView;

    const-string v2, "exit"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lorg/apache/cordova/CordovaWebView;->postMessage(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public openFileChooser(Lorg/xwalk/core/XWalkView;Landroid/webkit/ValueCallback;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;
    .param p3, "acceptType"    # Ljava/lang/String;
    .param p4, "capture"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xwalk/core/XWalkView;",
            "Landroid/webkit/ValueCallback",
            "<",
            "Landroid/net/Uri;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 327
    .local p2, "uploadMsg":Landroid/webkit/ValueCallback;, "Landroid/webkit/ValueCallback<Landroid/net/Uri;>;"
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 328
    return-void
.end method

.method public setWebView(Lorg/apache/cordova/CordovaWebView;)V
    .locals 0
    .param p1, "view"    # Lorg/apache/cordova/CordovaWebView;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 81
    iput-object p1, p0, Lorg/apache/cordova/CordovaChromeClient;->appView:Lorg/apache/cordova/CordovaWebView;

    .line 82
    return-void
.end method
