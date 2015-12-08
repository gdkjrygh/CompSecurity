.class public Lme/grantland/twitter/TwitterDialog;
.super Landroid/app/Dialog;
.source "TwitterDialog.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lme/grantland/twitter/TwitterDialog$H;,
        Lme/grantland/twitter/TwitterDialog$TwitterWebViewClient;
    }
.end annotation


# static fields
.field private static final BORDER_ALPHA:I = 0x7e

.field private static final BORDER_RADIUS:I = 0xa

.field private static final DEBUG:Z = false

.field private static final ERROR:I = -0x1

.field private static final KEY_ACCESS_SECRET:Ljava/lang/String; = "access_secret"

.field private static final KEY_ACCESS_TOKEN:Ljava/lang/String; = "access_token"

.field private static final KEY_ERROR:Ljava/lang/String; = "error"

.field private static final KEY_URL:Ljava/lang/String; = "url"

.field private static final PADDING:I = 0xa

.field private static final RETRIEVE_ACCESS_TOKEN:I = 0x2

.field private static final RETRIEVE_REQUEST_TOKEN:I = 0x1

.field private static final TAG:Ljava/lang/String; = "me.grantland.twitter"


# instance fields
.field private mConsumer:Loauth/signpost/OAuthConsumer;

.field private mContent:Landroid/widget/FrameLayout;

.field private mFrame:Landroid/widget/FrameLayout;

.field private final mListener:Lme/grantland/twitter/Twitter$DialogListener;

.field private mMainThreadHandler:Lme/grantland/twitter/TwitterDialog$H;

.field private mProvider:Loauth/signpost/OAuthProvider;

.field private mSpinner:Landroid/app/ProgressDialog;

.field private mUrl:Ljava/lang/String;

.field private mWebView:Landroid/webkit/WebView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Loauth/signpost/OAuthConsumer;Ljava/lang/String;Lme/grantland/twitter/Twitter$DialogListener;)V
    .locals 6
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "consumer"    # Loauth/signpost/OAuthConsumer;
    .param p3, "authorizeParams"    # Ljava/lang/String;
    .param p4, "listener"    # Lme/grantland/twitter/Twitter$DialogListener;

    .prologue
    .line 94
    const v1, 0x1030010

    invoke-direct {p0, p1, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 95
    iput-object p2, p0, Lme/grantland/twitter/TwitterDialog;->mConsumer:Loauth/signpost/OAuthConsumer;

    .line 96
    iput-object p4, p0, Lme/grantland/twitter/TwitterDialog;->mListener:Lme/grantland/twitter/Twitter$DialogListener;

    .line 98
    new-instance v1, Lme/grantland/twitter/TwitterDialog$H;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lme/grantland/twitter/TwitterDialog$H;-><init>(Lme/grantland/twitter/TwitterDialog;Lme/grantland/twitter/TwitterDialog$H;)V

    iput-object v1, p0, Lme/grantland/twitter/TwitterDialog;->mMainThreadHandler:Lme/grantland/twitter/TwitterDialog$H;

    .line 100
    new-instance v1, Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;

    const-string v2, "https://twitter.com/oauth/request_token"

    .line 101
    const-string v3, "https://twitter.com/oauth/access_token"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "https://twitter.com/oauth/authorize"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    iput-object v1, p0, Lme/grantland/twitter/TwitterDialog;->mProvider:Loauth/signpost/OAuthProvider;

    .line 102
    iget-object v1, p0, Lme/grantland/twitter/TwitterDialog;->mProvider:Loauth/signpost/OAuthProvider;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Loauth/signpost/OAuthProvider;->setOAuth10a(Z)V

    .line 105
    new-instance v0, Lme/grantland/twitter/TwitterDialog$1;

    invoke-direct {v0, p0}, Lme/grantland/twitter/TwitterDialog$1;-><init>(Lme/grantland/twitter/TwitterDialog;)V

    .line 122
    .local v0, "thread":Ljava/lang/Thread;
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 123
    return-void
.end method

.method static synthetic access$0(Lme/grantland/twitter/TwitterDialog;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 168
    invoke-direct {p0, p1}, Lme/grantland/twitter/TwitterDialog;->error(Ljava/lang/Throwable;)V

    return-void
.end method

.method static synthetic access$1(Lme/grantland/twitter/TwitterDialog;)Landroid/webkit/WebView;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lme/grantland/twitter/TwitterDialog;->mWebView:Landroid/webkit/WebView;

    return-object v0
.end method

.method static synthetic access$2(Lme/grantland/twitter/TwitterDialog;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 163
    invoke-direct {p0, p1, p2}, Lme/grantland/twitter/TwitterDialog;->complete(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$3(Lme/grantland/twitter/TwitterDialog;Landroid/net/Uri;)V
    .locals 0

    .prologue
    .line 196
    invoke-direct {p0, p1}, Lme/grantland/twitter/TwitterDialog;->retrieveAccessToken(Landroid/net/Uri;)V

    return-void
.end method

.method static synthetic access$4(Lme/grantland/twitter/TwitterDialog;)Landroid/app/ProgressDialog;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lme/grantland/twitter/TwitterDialog;->mSpinner:Landroid/app/ProgressDialog;

    return-object v0
.end method

.method static synthetic access$5(Lme/grantland/twitter/TwitterDialog;)Landroid/widget/FrameLayout;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lme/grantland/twitter/TwitterDialog;->mFrame:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method static synthetic access$6(Lme/grantland/twitter/TwitterDialog;)Lme/grantland/twitter/Twitter$DialogListener;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lme/grantland/twitter/TwitterDialog;->mListener:Lme/grantland/twitter/Twitter$DialogListener;

    return-object v0
.end method

.method static synthetic access$7(Lme/grantland/twitter/TwitterDialog;)Loauth/signpost/OAuthProvider;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lme/grantland/twitter/TwitterDialog;->mProvider:Loauth/signpost/OAuthProvider;

    return-object v0
.end method

.method static synthetic access$8(Lme/grantland/twitter/TwitterDialog;)Loauth/signpost/OAuthConsumer;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lme/grantland/twitter/TwitterDialog;->mConsumer:Loauth/signpost/OAuthConsumer;

    return-object v0
.end method

.method static synthetic access$9(Lme/grantland/twitter/TwitterDialog;)Lme/grantland/twitter/TwitterDialog$H;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lme/grantland/twitter/TwitterDialog;->mMainThreadHandler:Lme/grantland/twitter/TwitterDialog$H;

    return-object v0
.end method

.method private complete(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "accessKey"    # Ljava/lang/String;
    .param p2, "accessSecret"    # Ljava/lang/String;

    .prologue
    .line 164
    iget-object v0, p0, Lme/grantland/twitter/TwitterDialog;->mListener:Lme/grantland/twitter/Twitter$DialogListener;

    invoke-interface {v0, p1, p2}, Lme/grantland/twitter/Twitter$DialogListener;->onComplete(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    invoke-virtual {p0}, Lme/grantland/twitter/TwitterDialog;->dismiss()V

    .line 166
    return-void
.end method

.method private error(Ljava/lang/Throwable;)V
    .locals 3
    .param p1, "error"    # Ljava/lang/Throwable;

    .prologue
    .line 169
    iget-object v0, p0, Lme/grantland/twitter/TwitterDialog;->mListener:Lme/grantland/twitter/Twitter$DialogListener;

    new-instance v1, Lme/grantland/twitter/TwitterError;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lme/grantland/twitter/TwitterError;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lme/grantland/twitter/Twitter$DialogListener;->onError(Lme/grantland/twitter/TwitterError;)V

    .line 170
    invoke-virtual {p0}, Lme/grantland/twitter/TwitterDialog;->dismiss()V

    .line 171
    return-void
.end method

.method private retrieveAccessToken(Landroid/net/Uri;)V
    .locals 1
    .param p1, "uri"    # Landroid/net/Uri;

    .prologue
    .line 197
    new-instance v0, Lme/grantland/twitter/TwitterDialog$4;

    invoke-direct {v0, p0, p1}, Lme/grantland/twitter/TwitterDialog$4;-><init>(Lme/grantland/twitter/TwitterDialog;Landroid/net/Uri;)V

    .line 230
    .local v0, "thread":Ljava/lang/Thread;
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 231
    return-void
.end method

.method private setUpWebView()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x0

    .line 186
    invoke-virtual {p0}, Lme/grantland/twitter/TwitterDialog;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 187
    .local v0, "inflater":Landroid/view/LayoutInflater;
    sget v1, Lme/grantland/twitter/R$layout;->twitter_layout:I

    invoke-virtual {v0, v1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/webkit/WebView;

    iput-object v1, p0, Lme/grantland/twitter/TwitterDialog;->mWebView:Landroid/webkit/WebView;

    .line 188
    iget-object v1, p0, Lme/grantland/twitter/TwitterDialog;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 189
    iget-object v1, p0, Lme/grantland/twitter/TwitterDialog;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/webkit/WebSettings;->setSaveFormData(Z)V

    .line 190
    iget-object v1, p0, Lme/grantland/twitter/TwitterDialog;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 191
    iget-object v1, p0, Lme/grantland/twitter/TwitterDialog;->mWebView:Landroid/webkit/WebView;

    new-instance v2, Lme/grantland/twitter/TwitterDialog$TwitterWebViewClient;

    invoke-direct {v2, p0, v4}, Lme/grantland/twitter/TwitterDialog$TwitterWebViewClient;-><init>(Lme/grantland/twitter/TwitterDialog;Lme/grantland/twitter/TwitterDialog$TwitterWebViewClient;)V

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 192
    iget-object v1, p0, Lme/grantland/twitter/TwitterDialog;->mWebView:Landroid/webkit/WebView;

    iget-object v2, p0, Lme/grantland/twitter/TwitterDialog;->mUrl:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 193
    iget-object v1, p0, Lme/grantland/twitter/TwitterDialog;->mContent:Landroid/widget/FrameLayout;

    iget-object v2, p0, Lme/grantland/twitter/TwitterDialog;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 194
    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 0

    .prologue
    .line 181
    invoke-super {p0}, Landroid/app/Dialog;->cancel()V

    .line 183
    return-void
.end method

.method public dismiss()V
    .locals 0

    .prologue
    .line 175
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    .line 177
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/16 v3, 0xa

    .line 127
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 128
    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lme/grantland/twitter/TwitterDialog;->requestWindowFeature(I)Z

    .line 130
    new-instance v1, Landroid/app/ProgressDialog;

    invoke-virtual {p0}, Lme/grantland/twitter/TwitterDialog;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lme/grantland/twitter/TwitterDialog;->mSpinner:Landroid/app/ProgressDialog;

    .line 131
    iget-object v1, p0, Lme/grantland/twitter/TwitterDialog;->mSpinner:Landroid/app/ProgressDialog;

    const-string v2, "Loading..."

    invoke-virtual {v1, v2}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 132
    iget-object v1, p0, Lme/grantland/twitter/TwitterDialog;->mSpinner:Landroid/app/ProgressDialog;

    new-instance v2, Lme/grantland/twitter/TwitterDialog$2;

    invoke-direct {v2, p0}, Lme/grantland/twitter/TwitterDialog$2;-><init>(Lme/grantland/twitter/TwitterDialog;)V

    invoke-virtual {v1, v2}, Landroid/app/ProgressDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 139
    new-instance v1, Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Lme/grantland/twitter/TwitterDialog;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lme/grantland/twitter/TwitterDialog;->mFrame:Landroid/widget/FrameLayout;

    .line 140
    iget-object v1, p0, Lme/grantland/twitter/TwitterDialog;->mFrame:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v3, v3, v3, v3}, Landroid/widget/FrameLayout;->setPadding(IIII)V

    .line 141
    iget-object v1, p0, Lme/grantland/twitter/TwitterDialog;->mFrame:Landroid/widget/FrameLayout;

    invoke-virtual {p0, v1}, Lme/grantland/twitter/TwitterDialog;->setContentView(Landroid/view/View;)V

    .line 142
    iget-object v1, p0, Lme/grantland/twitter/TwitterDialog;->mFrame:Landroid/widget/FrameLayout;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 144
    new-instance v1, Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Lme/grantland/twitter/TwitterDialog;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lme/grantland/twitter/TwitterDialog;->mContent:Landroid/widget/FrameLayout;

    .line 145
    iget-object v1, p0, Lme/grantland/twitter/TwitterDialog;->mContent:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v3, v3, v3, v3}, Landroid/widget/FrameLayout;->setPadding(IIII)V

    .line 146
    iget-object v1, p0, Lme/grantland/twitter/TwitterDialog;->mFrame:Landroid/widget/FrameLayout;

    iget-object v2, p0, Lme/grantland/twitter/TwitterDialog;->mContent:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 148
    new-instance v0, Landroid/graphics/drawable/PaintDrawable;

    const/high16 v1, -0x1000000

    invoke-direct {v0, v1}, Landroid/graphics/drawable/PaintDrawable;-><init>(I)V

    .line 149
    .local v0, "background":Landroid/graphics/drawable/PaintDrawable;
    const/16 v1, 0x7e

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/PaintDrawable;->setAlpha(I)V

    .line 150
    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/PaintDrawable;->setCornerRadius(F)V

    .line 151
    iget-object v1, p0, Lme/grantland/twitter/TwitterDialog;->mContent:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 153
    invoke-direct {p0}, Lme/grantland/twitter/TwitterDialog;->setUpWebView()V

    .line 155
    new-instance v1, Lme/grantland/twitter/TwitterDialog$3;

    invoke-direct {v1, p0}, Lme/grantland/twitter/TwitterDialog$3;-><init>(Lme/grantland/twitter/TwitterDialog;)V

    invoke-virtual {p0, v1}, Lme/grantland/twitter/TwitterDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 161
    return-void
.end method
