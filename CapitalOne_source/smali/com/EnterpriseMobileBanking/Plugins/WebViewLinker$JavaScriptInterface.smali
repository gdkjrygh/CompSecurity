.class final Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$JavaScriptInterface;
.super Ljava/lang/Object;
.source "WebViewLinker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "JavaScriptInterface"
.end annotation


# instance fields
.field private maxSearches:I

.field private statusLength:I

.field private statusString:Ljava/lang/String;

.field final synthetic this$0:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;


# direct methods
.method public constructor <init>(Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V
    .locals 1

    .prologue
    .line 43
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$JavaScriptInterface;->this$0:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    const-string v0, "http status"

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$JavaScriptInterface;->statusString:Ljava/lang/String;

    .line 39
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$JavaScriptInterface;->statusString:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iput v0, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$JavaScriptInterface;->statusLength:I

    .line 41
    const/16 v0, 0xa

    iput v0, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$JavaScriptInterface;->maxSearches:I

    .line 44
    return-void
.end method


# virtual methods
.method public backButtonActive(Z)V
    .locals 2
    .param p1, "enabled"    # Z

    .prologue
    .line 77
    if-eqz p1, :cond_0

    .line 80
    const/4 v0, 0x1

    # setter for: Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->innerViewCanGoBack:Z
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->access$002(Z)Z

    .line 81
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$JavaScriptInterface;->this$0:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    const-string v1, "INGDirectApp.showBackButton();"

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendJavascript(Ljava/lang/String;)V

    .line 86
    :goto_0
    return-void

    .line 83
    :cond_0
    const/4 v0, 0x0

    # setter for: Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->innerViewCanGoBack:Z
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->access$002(Z)Z

    .line 84
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$JavaScriptInterface;->this$0:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    const-string v1, "INGDirectApp.hideBackButton();"

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendJavascript(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public handleAlerts(Ljava/lang/String;)V
    .locals 3
    .param p1, "alerts"    # Ljava/lang/String;

    .prologue
    .line 47
    const-string v0, "INGDirectAppConnection.redirectContForReqTimeout();"

    .line 49
    .local v0, "url":Ljava/lang/String;
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 50
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Ext.dispatch({controller:\'LoginController\',action:\'postLoginError\',error:\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\'})"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 53
    :cond_0
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$JavaScriptInterface;->this$0:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    invoke-virtual {v1, v0}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendJavascript(Ljava/lang/String;)V

    .line 55
    return-void
.end method

.method public handleErrorCodes(Ljava/lang/String;)V
    .locals 6
    .param p1, "content"    # Ljava/lang/String;

    .prologue
    .line 58
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    iget v1, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$JavaScriptInterface;->statusLength:I

    if-lt v0, v1, :cond_1

    .line 59
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$JavaScriptInterface;->maxSearches:I

    if-gt v2, v0, :cond_1

    .line 60
    const/4 v1, 0x1

    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$JavaScriptInterface;->statusString:Ljava/lang/String;

    const/4 v4, 0x0

    iget v5, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$JavaScriptInterface;->statusLength:I

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 62
    const-string v0, "WebViewLinker.JavaScriptInterface"

    const-string v1, "Found Match!"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$JavaScriptInterface;->this$0:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    const-string v1, "INGDirectApp.updateLastAccessed();"

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendJavascript(Ljava/lang/String;)V

    .line 65
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$JavaScriptInterface;->this$0:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    const-string v1, "INGDirectApp.hideBusyIndicator();"

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendJavascript(Ljava/lang/String;)V

    .line 67
    iget v2, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$JavaScriptInterface;->maxSearches:I

    .line 59
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 71
    .end local v2    # "i":I
    :cond_1
    return-void
.end method

.method public userNameTransiteForm(Ljava/lang/String;)V
    .locals 2
    .param p1, "username"    # Ljava/lang/String;

    .prologue
    .line 90
    const-string v0, "cif"

    invoke-static {v0}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticRead(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 91
    const-string v0, "cif"

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 92
    const-string v0, "maskedCif"

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 94
    :cond_0
    return-void
.end method
