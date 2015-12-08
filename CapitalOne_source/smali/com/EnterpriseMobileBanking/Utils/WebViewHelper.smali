.class public Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;
.super Ljava/lang/Object;
.source "WebViewHelper.java"


# static fields
.field private static final MSG_TIMEOUT:I = 0x1

.field public static final PRODUCTS360_MODE_TAG:Ljava/lang/String; = "products_360"

.field public static final QUIET_MODE_TAG:Ljava/lang/String; = "quiet"

.field public static final REWARDS_MODE_TAG:Ljava/lang/String; = "rewards"

.field public static final REWARDS_TIMEOUT:I = 0xfde8

.field private static final TAG:Ljava/lang/String; = "WebViewHelper"


# instance fields
.field private _appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

.field private _started:Z

.field private handler:Landroid/os/Handler;

.field private mMode:Ljava/lang/String;

.field private mTimeOutValue:I

.field private mView:Landroid/webkit/WebView;

.field private timeoutFlag:Z


# direct methods
.method public constructor <init>(Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V
    .locals 2
    .param p1, "appLink"    # Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    .prologue
    const/4 v1, 0x0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->_appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    .line 50
    iput-boolean v1, p0, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->_started:Z

    .line 51
    iput v1, p0, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->mTimeOutValue:I

    .line 52
    const-string v0, ""

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->mMode:Ljava/lang/String;

    .line 53
    iput-boolean v1, p0, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->timeoutFlag:Z

    .line 57
    new-instance v0, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper$1;

    invoke-direct {v0, p0}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper$1;-><init>(Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;)V

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->handler:Landroid/os/Handler;

    .line 78
    return-void
.end method

.method static synthetic access$000(Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;)Z
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;

    .prologue
    .line 15
    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->timeoutFlag:Z

    return v0
.end method

.method static synthetic access$002(Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;Z)Z
    .locals 0
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;
    .param p1, "x1"    # Z

    .prologue
    .line 15
    iput-boolean p1, p0, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->timeoutFlag:Z

    return p1
.end method

.method static synthetic access$100(Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;)Landroid/webkit/WebView;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;

    .prologue
    .line 15
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->mView:Landroid/webkit/WebView;

    return-object v0
.end method


# virtual methods
.method public cancelTimer()V
    .locals 2

    .prologue
    .line 113
    const-string v0, "WebViewHelper"

    const-string v1, "*** Timer cancelled..."

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->handler:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 115
    return-void
.end method

.method public getMode()Ljava/lang/String;
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->mMode:Ljava/lang/String;

    return-object v0
.end method

.method public getTimeOutValue()I
    .locals 1

    .prologue
    .line 82
    iget v0, p0, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->mTimeOutValue:I

    return v0
.end method

.method public handleError()V
    .locals 2

    .prologue
    .line 119
    const-string v0, "WebViewHelper"

    const-string v1, "handleError()"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->_appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    const-string v1, "PAGE.showError(Messages.ERR_GENERIC_SERVICE_UNAVAILABLE); jq(\"#hang-on\").hide();"

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendJavascript(Ljava/lang/String;)V

    .line 122
    return-void
.end method

.method public isTimeout()Z
    .locals 1

    .prologue
    .line 126
    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->timeoutFlag:Z

    return v0
.end method

.method public setMode(Ljava/lang/String;)V
    .locals 0
    .param p1, "sMode"    # Ljava/lang/String;

    .prologue
    .line 92
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->mMode:Ljava/lang/String;

    .line 93
    return-void
.end method

.method public setTimeOutValue(I)V
    .locals 0
    .param p1, "val"    # I

    .prologue
    .line 87
    iput p1, p0, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->mTimeOutValue:I

    .line 88
    return-void
.end method

.method public setTimedOut(Z)V
    .locals 0
    .param p1, "b"    # Z

    .prologue
    .line 131
    iput-boolean p1, p0, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->timeoutFlag:Z

    .line 132
    return-void
.end method

.method public setView(Landroid/webkit/WebView;)V
    .locals 0
    .param p1, "v"    # Landroid/webkit/WebView;

    .prologue
    .line 44
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->mView:Landroid/webkit/WebView;

    .line 45
    return-void
.end method

.method public startTimer()V
    .locals 4

    .prologue
    const/4 v2, 0x1

    .line 102
    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->_started:Z

    if-nez v0, :cond_0

    .line 104
    const-string v0, "WebViewHelper"

    const-string v1, "*** Timer started..."

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    iput-boolean v2, p0, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->_started:Z

    .line 106
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->handler:Landroid/os/Handler;

    invoke-virtual {v1, v2, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    iget v2, p0, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->mTimeOutValue:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 109
    :cond_0
    return-void
.end method
