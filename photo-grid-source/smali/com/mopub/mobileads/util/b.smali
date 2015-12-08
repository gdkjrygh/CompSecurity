.class final Lcom/mopub/mobileads/util/b;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 57
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 1

    .prologue
    .line 60
    invoke-static {p3}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 61
    invoke-virtual {p4}, Landroid/webkit/JsResult;->confirm()V

    .line 62
    const/4 v0, 0x1

    return v0
.end method

.method public final onJsBeforeUnload(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 1

    .prologue
    .line 81
    invoke-static {p3}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 82
    invoke-virtual {p4}, Landroid/webkit/JsResult;->confirm()V

    .line 83
    const/4 v0, 0x1

    return v0
.end method

.method public final onJsConfirm(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 1

    .prologue
    .line 67
    invoke-static {p3}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 68
    invoke-virtual {p4}, Landroid/webkit/JsResult;->confirm()V

    .line 69
    const/4 v0, 0x1

    return v0
.end method

.method public final onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z
    .locals 1

    .prologue
    .line 74
    invoke-static {p3}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 75
    invoke-virtual {p5}, Landroid/webkit/JsPromptResult;->confirm()V

    .line 76
    const/4 v0, 0x1

    return v0
.end method
