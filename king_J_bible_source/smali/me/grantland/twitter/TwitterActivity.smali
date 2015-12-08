.class public Lme/grantland/twitter/TwitterActivity;
.super Landroid/app/Activity;
.source "TwitterActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lme/grantland/twitter/TwitterActivity$H;,
        Lme/grantland/twitter/TwitterActivity$TwitterWebViewClient;
    }
.end annotation


# static fields
.field private static final DEBUG:Z = false

.field private static final KEY_URL:Ljava/lang/String; = "url"

.field private static final RETRIEVE_ACCESS_TOKEN:I = 0x2

.field private static final RETRIEVE_REQUEST_TOKEN:I = 0x1

.field private static final TAG:Ljava/lang/String; = "me.grantland.twitter"


# instance fields
.field private mConsumer:Loauth/signpost/OAuthConsumer;

.field private mMainThreadHandler:Lme/grantland/twitter/TwitterActivity$H;

.field private mProvider:Loauth/signpost/OAuthProvider;

.field private mSpinner:Landroid/app/ProgressDialog;

.field private mWebView:Landroid/webkit/WebView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lme/grantland/twitter/TwitterActivity;)Landroid/webkit/WebView;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lme/grantland/twitter/TwitterActivity;->mWebView:Landroid/webkit/WebView;

    return-object v0
.end method

.method static synthetic access$1(Lme/grantland/twitter/TwitterActivity;)V
    .locals 0

    .prologue
    .line 143
    invoke-direct {p0}, Lme/grantland/twitter/TwitterActivity;->cancel()V

    return-void
.end method

.method static synthetic access$2(Lme/grantland/twitter/TwitterActivity;Landroid/net/Uri;)V
    .locals 0

    .prologue
    .line 157
    invoke-direct {p0, p1}, Lme/grantland/twitter/TwitterActivity;->retrieveAccessToken(Landroid/net/Uri;)V

    return-void
.end method

.method static synthetic access$3(Lme/grantland/twitter/TwitterActivity;)Landroid/app/ProgressDialog;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lme/grantland/twitter/TwitterActivity;->mSpinner:Landroid/app/ProgressDialog;

    return-object v0
.end method

.method static synthetic access$4(Lme/grantland/twitter/TwitterActivity;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 136
    invoke-direct {p0, p1}, Lme/grantland/twitter/TwitterActivity;->error(Ljava/lang/Throwable;)V

    return-void
.end method

.method static synthetic access$5(Lme/grantland/twitter/TwitterActivity;)Loauth/signpost/OAuthProvider;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lme/grantland/twitter/TwitterActivity;->mProvider:Loauth/signpost/OAuthProvider;

    return-object v0
.end method

.method static synthetic access$6(Lme/grantland/twitter/TwitterActivity;)Loauth/signpost/OAuthConsumer;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lme/grantland/twitter/TwitterActivity;->mConsumer:Loauth/signpost/OAuthConsumer;

    return-object v0
.end method

.method static synthetic access$7(Lme/grantland/twitter/TwitterActivity;)Lme/grantland/twitter/TwitterActivity$H;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lme/grantland/twitter/TwitterActivity;->mMainThreadHandler:Lme/grantland/twitter/TwitterActivity$H;

    return-object v0
.end method

.method static synthetic access$8(Lme/grantland/twitter/TwitterActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 149
    invoke-direct {p0, p1, p2}, Lme/grantland/twitter/TwitterActivity;->complete(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private cancel()V
    .locals 2

    .prologue
    .line 144
    invoke-virtual {p0}, Lme/grantland/twitter/TwitterActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 145
    .local v0, "intent":Landroid/content/Intent;
    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lme/grantland/twitter/TwitterActivity;->setResult(ILandroid/content/Intent;)V

    .line 146
    invoke-virtual {p0}, Lme/grantland/twitter/TwitterActivity;->finish()V

    .line 147
    return-void
.end method

.method private complete(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "accessKey"    # Ljava/lang/String;
    .param p2, "accessSecret"    # Ljava/lang/String;

    .prologue
    .line 150
    invoke-virtual {p0}, Lme/grantland/twitter/TwitterActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 151
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "access_key"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 152
    const-string v1, "access_secret"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 153
    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0}, Lme/grantland/twitter/TwitterActivity;->setResult(ILandroid/content/Intent;)V

    .line 154
    invoke-virtual {p0}, Lme/grantland/twitter/TwitterActivity;->finish()V

    .line 155
    return-void
.end method

.method private error(Ljava/lang/Throwable;)V
    .locals 3
    .param p1, "error"    # Ljava/lang/Throwable;

    .prologue
    .line 137
    invoke-virtual {p0}, Lme/grantland/twitter/TwitterActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 138
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "error"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 139
    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0}, Lme/grantland/twitter/TwitterActivity;->setResult(ILandroid/content/Intent;)V

    .line 140
    invoke-virtual {p0}, Lme/grantland/twitter/TwitterActivity;->finish()V

    .line 141
    return-void
.end method

.method private retrieveAccessToken(Landroid/net/Uri;)V
    .locals 1
    .param p1, "uri"    # Landroid/net/Uri;

    .prologue
    .line 158
    new-instance v0, Lme/grantland/twitter/TwitterActivity$3;

    invoke-direct {v0, p0, p1}, Lme/grantland/twitter/TwitterActivity$3;-><init>(Lme/grantland/twitter/TwitterActivity;Landroid/net/Uri;)V

    .line 183
    .local v0, "thread":Ljava/lang/Thread;
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 184
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 11
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/4 v10, 0x0

    const/4 v9, 0x0

    const/4 v8, 0x1

    .line 70
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 71
    invoke-virtual {p0, v8}, Lme/grantland/twitter/TwitterActivity;->requestWindowFeature(I)Z

    .line 72
    sget v3, Lme/grantland/twitter/R$layout;->twitter_layout:I

    invoke-virtual {p0, v3}, Lme/grantland/twitter/TwitterActivity;->setContentView(I)V

    .line 74
    invoke-virtual {p0}, Lme/grantland/twitter/TwitterActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 76
    .local v1, "intent":Landroid/content/Intent;
    const-string v3, "consumer"

    invoke-virtual {v1, v3}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v3

    check-cast v3, Loauth/signpost/OAuthConsumer;

    .line 75
    iput-object v3, p0, Lme/grantland/twitter/TwitterActivity;->mConsumer:Loauth/signpost/OAuthConsumer;

    .line 78
    const-string v3, "params"

    invoke-virtual {v1, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 80
    .local v0, "authorizeParams":Ljava/lang/String;
    new-instance v3, Lme/grantland/twitter/TwitterActivity$H;

    invoke-direct {v3, p0, v10}, Lme/grantland/twitter/TwitterActivity$H;-><init>(Lme/grantland/twitter/TwitterActivity;Lme/grantland/twitter/TwitterActivity$H;)V

    iput-object v3, p0, Lme/grantland/twitter/TwitterActivity;->mMainThreadHandler:Lme/grantland/twitter/TwitterActivity$H;

    .line 82
    new-instance v3, Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;

    const-string v4, "https://twitter.com/oauth/request_token"

    .line 83
    const-string v5, "https://twitter.com/oauth/access_token"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "https://twitter.com/oauth/authorize"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v4, v5, v6}, Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    iput-object v3, p0, Lme/grantland/twitter/TwitterActivity;->mProvider:Loauth/signpost/OAuthProvider;

    .line 84
    iget-object v3, p0, Lme/grantland/twitter/TwitterActivity;->mProvider:Loauth/signpost/OAuthProvider;

    invoke-interface {v3, v8}, Loauth/signpost/OAuthProvider;->setOAuth10a(Z)V

    .line 86
    new-instance v3, Landroid/app/ProgressDialog;

    invoke-direct {v3, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object v3, p0, Lme/grantland/twitter/TwitterActivity;->mSpinner:Landroid/app/ProgressDialog;

    .line 87
    iget-object v3, p0, Lme/grantland/twitter/TwitterActivity;->mSpinner:Landroid/app/ProgressDialog;

    invoke-virtual {p0}, Lme/grantland/twitter/TwitterActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lme/grantland/twitter/R$string;->loading_loading:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 88
    iget-object v3, p0, Lme/grantland/twitter/TwitterActivity;->mSpinner:Landroid/app/ProgressDialog;

    new-instance v4, Lme/grantland/twitter/TwitterActivity$1;

    invoke-direct {v4, p0}, Lme/grantland/twitter/TwitterActivity$1;-><init>(Lme/grantland/twitter/TwitterActivity;)V

    invoke-virtual {v3, v4}, Landroid/app/ProgressDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 95
    sget v3, Lme/grantland/twitter/R$id;->twitter_webview:I

    invoke-virtual {p0, v3}, Lme/grantland/twitter/TwitterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/webkit/WebView;

    iput-object v3, p0, Lme/grantland/twitter/TwitterActivity;->mWebView:Landroid/webkit/WebView;

    .line 96
    iget-object v3, p0, Lme/grantland/twitter/TwitterActivity;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v3}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v3

    invoke-virtual {v3, v8}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 97
    iget-object v3, p0, Lme/grantland/twitter/TwitterActivity;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v3}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v3

    invoke-virtual {v3, v9}, Landroid/webkit/WebSettings;->setSaveFormData(Z)V

    .line 98
    iget-object v3, p0, Lme/grantland/twitter/TwitterActivity;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v3}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v3

    invoke-virtual {v3, v9}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 99
    iget-object v3, p0, Lme/grantland/twitter/TwitterActivity;->mWebView:Landroid/webkit/WebView;

    const/high16 v4, 0x2000000

    invoke-virtual {v3, v4}, Landroid/webkit/WebView;->setScrollBarStyle(I)V

    .line 100
    iget-object v3, p0, Lme/grantland/twitter/TwitterActivity;->mWebView:Landroid/webkit/WebView;

    new-instance v4, Lme/grantland/twitter/TwitterActivity$TwitterWebViewClient;

    invoke-direct {v4, p0, v10}, Lme/grantland/twitter/TwitterActivity$TwitterWebViewClient;-><init>(Lme/grantland/twitter/TwitterActivity;Lme/grantland/twitter/TwitterActivity$TwitterWebViewClient;)V

    invoke-virtual {v3, v4}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 103
    new-instance v2, Lme/grantland/twitter/TwitterActivity$2;

    invoke-direct {v2, p0}, Lme/grantland/twitter/TwitterActivity$2;-><init>(Lme/grantland/twitter/TwitterActivity;)V

    .line 123
    .local v2, "thread":Ljava/lang/Thread;
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 124
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1
    .param p1, "keyCode"    # I
    .param p2, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 128
    const/4 v0, 0x4

    if-ne v0, p1, :cond_0

    .line 129
    invoke-direct {p0}, Lme/grantland/twitter/TwitterActivity;->cancel()V

    .line 130
    const/4 v0, 0x1

    .line 133
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
