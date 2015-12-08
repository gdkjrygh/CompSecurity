.class Lcom/mopub/mobileads/HtmlWebViewClient;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Lcom/mopub/mobileads/HtmlWebViewListener;

.field private c:Lcom/mopub/mobileads/BaseHtmlWebView;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/HtmlWebViewListener;Lcom/mopub/mobileads/BaseHtmlWebView;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->b:Lcom/mopub/mobileads/HtmlWebViewListener;

    .line 34
    iput-object p2, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->c:Lcom/mopub/mobileads/BaseHtmlWebView;

    .line 35
    iput-object p3, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->d:Ljava/lang/String;

    .line 36
    iput-object p4, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->e:Ljava/lang/String;

    .line 37
    invoke-virtual {p2}, Lcom/mopub/mobileads/BaseHtmlWebView;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->a:Landroid/content/Context;

    .line 38
    return-void
.end method

.method private handleCustomIntentFromUri(Landroid/net/Uri;)V
    .locals 4

    .prologue
    .line 174
    :try_start_0
    const-string v0, "fnc"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 175
    const-string v1, "data"

    invoke-virtual {p1, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 181
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 182
    const/high16 v3, 0x10000000

    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 183
    const-string v3, "com.mopub.intent.extra.AD_CLICK_DATA"

    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 185
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Could not handle custom intent: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ". Is your intent spelled correctly?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 188
    iget-object v1, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->a:Landroid/content/Context;

    invoke-virtual {p0, v1, v2, v0}, Lcom/mopub/mobileads/HtmlWebViewClient;->launchIntentForUserClick(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)Z

    .line 189
    :goto_0
    return-void

    .line 177
    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Could not handle custom intent with uri: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->w(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private handlePhoneScheme(Ljava/lang/String;)Z
    .locals 3

    .prologue
    .line 130
    invoke-direct {p0, p1}, Lcom/mopub/mobileads/HtmlWebViewClient;->isPhoneScheme(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 131
    const/4 v0, 0x0

    .line 141
    :goto_0
    return v0

    .line 133
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 134
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 136
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Could not handle intent with URI: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ". Is this intent supported on your phone?"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 139
    iget-object v2, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->a:Landroid/content/Context;

    invoke-virtual {p0, v2, v0, v1}, Lcom/mopub/mobileads/HtmlWebViewClient;->launchIntentForUserClick(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)Z

    .line 141
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private handleSpecialMoPubScheme(Ljava/lang/String;)Z
    .locals 3

    .prologue
    .line 104
    invoke-direct {p0, p1}, Lcom/mopub/mobileads/HtmlWebViewClient;->isSpecialMoPubScheme(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 105
    const/4 v0, 0x0

    .line 120
    :goto_0
    return v0

    .line 107
    :cond_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 108
    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v1

    .line 110
    const-string v2, "finishLoad"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 111
    iget-object v0, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->b:Lcom/mopub/mobileads/HtmlWebViewListener;

    iget-object v1, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->c:Lcom/mopub/mobileads/BaseHtmlWebView;

    invoke-interface {v0, v1}, Lcom/mopub/mobileads/HtmlWebViewListener;->onLoaded(Lcom/mopub/mobileads/BaseHtmlWebView;)V

    .line 120
    :cond_1
    :goto_1
    const/4 v0, 0x1

    goto :goto_0

    .line 112
    :cond_2
    const-string v2, "close"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 113
    iget-object v0, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->b:Lcom/mopub/mobileads/HtmlWebViewListener;

    invoke-interface {v0}, Lcom/mopub/mobileads/HtmlWebViewListener;->onCollapsed()V

    goto :goto_1

    .line 114
    :cond_3
    const-string v2, "failLoad"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 115
    iget-object v0, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->b:Lcom/mopub/mobileads/HtmlWebViewListener;

    sget-object v1, Lcom/mopub/mobileads/MoPubErrorCode;->UNSPECIFIED:Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-interface {v0, v1}, Lcom/mopub/mobileads/HtmlWebViewListener;->onFailed(Lcom/mopub/mobileads/MoPubErrorCode;)V

    goto :goto_1

    .line 116
    :cond_4
    const-string v2, "custom"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 117
    invoke-direct {p0, v0}, Lcom/mopub/mobileads/HtmlWebViewClient;->handleCustomIntentFromUri(Landroid/net/Uri;)V

    goto :goto_1
.end method

.method private isPhoneScheme(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 124
    const-string v0, "tel:"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "voicemail:"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "sms:"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "mailto:"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "geo:"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "google.streetview:"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private isSpecialMoPubScheme(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 100
    const-string v0, "mopub://"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private launchApplicationUrl(Ljava/lang/String;)Z
    .locals 3

    .prologue
    .line 145
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 146
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 148
    const-string v1, "Unable to open intent."

    .line 150
    iget-object v2, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->a:Landroid/content/Context;

    invoke-virtual {p0, v2, v0, v1}, Lcom/mopub/mobileads/HtmlWebViewClient;->launchIntentForUserClick(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private showMoPubBrowserForUrl(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 154
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 155
    :cond_0
    const-string p1, "about:blank"

    .line 157
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Final URI to show in browser: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 159
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 160
    const-string v1, "URL"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    iget-object v1, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->a:Landroid/content/Context;

    const-class v2, Lcom/mopub/common/MoPubBrowser;

    invoke-static {v1, v2, v0}, Lcom/mopub/common/util/Intents;->getStartActivityIntent(Landroid/content/Context;Ljava/lang/Class;Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v0

    .line 163
    const-string v1, "Could not handle intent action. . Perhaps you forgot to declare com.mopub.common.MoPubBrowser in your Android manifest file."

    .line 167
    iget-object v2, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->a:Landroid/content/Context;

    invoke-virtual {p0, v2, v0, v1}, Lcom/mopub/mobileads/HtmlWebViewClient;->launchIntentForUserClick(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)Z

    .line 168
    return-void
.end method


# virtual methods
.method launchIntentForUserClick(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 193
    invoke-static {p2}, Lcom/mopub/common/Preconditions$NoThrow;->checkNotNull(Ljava/lang/Object;)Z

    .line 195
    if-nez p1, :cond_1

    .line 196
    invoke-static {p3}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 211
    :cond_0
    :goto_0
    return v0

    .line 200
    :cond_1
    iget-object v1, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->c:Lcom/mopub/mobileads/BaseHtmlWebView;

    invoke-virtual {v1}, Lcom/mopub/mobileads/BaseHtmlWebView;->wasClicked()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 205
    :try_start_0
    invoke-static {p1, p2}, Lcom/mopub/common/util/Intents;->startActivity(Landroid/content/Context;Landroid/content/Intent;)V

    .line 206
    iget-object v1, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->b:Lcom/mopub/mobileads/HtmlWebViewListener;

    invoke-interface {v1}, Lcom/mopub/mobileads/HtmlWebViewListener;->onClicked()V

    .line 207
    iget-object v1, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->c:Lcom/mopub/mobileads/BaseHtmlWebView;

    invoke-virtual {v1}, Lcom/mopub/mobileads/BaseHtmlWebView;->onResetUserClick()V
    :try_end_0
    .catch Lcom/mopub/exceptions/IntentNotResolvableException; {:try_start_0 .. :try_end_0} :catch_0

    .line 208
    const/4 v0, 0x1

    goto :goto_0

    .line 210
    :catch_0
    move-exception v1

    invoke-static {p3}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->e:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->e:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 94
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    .line 95
    invoke-direct {p0, p2}, Lcom/mopub/mobileads/HtmlWebViewClient;->showMoPubBrowserForUrl(Ljava/lang/String;)V

    .line 97
    :cond_0
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Ad event URL: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 49
    invoke-direct {p0, p2}, Lcom/mopub/mobileads/HtmlWebViewClient;->handleSpecialMoPubScheme(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 87
    :cond_0
    :goto_0
    return v3

    .line 53
    :cond_1
    invoke-static {p2}, Lcom/mopub/common/util/Intents;->isAboutScheme(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 54
    const-string v0, "Link to about page ignored."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 58
    :cond_2
    invoke-direct {p0, p2}, Lcom/mopub/mobileads/HtmlWebViewClient;->handlePhoneScheme(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 63
    invoke-static {p2}, Lcom/mopub/common/util/Intents;->isNativeBrowserScheme(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unable to load mopub native browser url: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 66
    :try_start_0
    invoke-static {p2}, Lcom/mopub/common/util/Intents;->intentForNativeBrowserScheme(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 67
    iget-object v2, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->a:Landroid/content/Context;

    invoke-virtual {p0, v2, v0, v1}, Lcom/mopub/mobileads/HtmlWebViewClient;->launchIntentForUserClick(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)Z
    :try_end_0
    .catch Lcom/mopub/exceptions/UrlParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 68
    :catch_0
    move-exception v0

    .line 69
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ". "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Lcom/mopub/exceptions/UrlParseException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 75
    :cond_3
    invoke-static {p2}, Lcom/mopub/common/util/Intents;->isHttpUrl(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 76
    invoke-direct {p0, p2}, Lcom/mopub/mobileads/HtmlWebViewClient;->showMoPubBrowserForUrl(Ljava/lang/String;)V

    goto :goto_0

    .line 81
    :cond_4
    iget-object v0, p0, Lcom/mopub/mobileads/HtmlWebViewClient;->a:Landroid/content/Context;

    invoke-static {v0, p2}, Lcom/mopub/common/util/Intents;->canHandleApplicationUrl(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 82
    invoke-direct {p0, p2}, Lcom/mopub/mobileads/HtmlWebViewClient;->launchApplicationUrl(Ljava/lang/String;)Z

    goto :goto_0

    .line 86
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Link ignored. Unable to handle url: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    goto :goto_0
.end method
