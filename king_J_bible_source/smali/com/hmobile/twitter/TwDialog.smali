.class public Lcom/hmobile/twitter/TwDialog;
.super Landroid/app/Dialog;
.source "TwDialog.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/hmobile/twitter/TwDialog$TwWebViewClient;
    }
.end annotation


# static fields
.field static final DIMENSIONS_LANDSCAPE:[F

.field static final DIMENSIONS_PORTRAIT:[F

.field static final FILL:Landroid/widget/FrameLayout$LayoutParams;

.field static final MARGIN:I = 0x4

.field static final PADDING:I = 0x2

.field public static final TAG:Ljava/lang/String; = "twitter"

.field static final TW_BLUE:I = -0x3f2113


# instance fields
.field private mConsumer:Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;

.field private mContent:Landroid/widget/LinearLayout;

.field private mHandler:Landroid/os/Handler;

.field private mIcon:Landroid/graphics/drawable/Drawable;

.field private mListener:Lcom/hmobile/twitter/Twitter$DialogListener;

.field private mProvider:Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;

.field private mSpinner:Landroid/app/ProgressDialog;

.field private mTitle:Landroid/widget/TextView;

.field private mUrl:Ljava/lang/String;

.field private mWebView:Landroid/webkit/WebView;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x2

    const/4 v1, -0x1

    .line 51
    new-array v0, v2, [F

    fill-array-data v0, :array_0

    sput-object v0, Lcom/hmobile/twitter/TwDialog;->DIMENSIONS_LANDSCAPE:[F

    .line 52
    new-array v0, v2, [F

    fill-array-data v0, :array_1

    sput-object v0, Lcom/hmobile/twitter/TwDialog;->DIMENSIONS_PORTRAIT:[F

    .line 53
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    sput-object v0, Lcom/hmobile/twitter/TwDialog;->FILL:Landroid/widget/FrameLayout$LayoutParams;

    .line 57
    return-void

    .line 51
    :array_0
    .array-data 4
        0x43e60000    # 460.0f
        0x43820000    # 260.0f
    .end array-data

    .line 52
    :array_1
    .array-data 4
        0x438c0000    # 280.0f
        0x43d20000    # 420.0f
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;Lcom/hmobile/twitter/Twitter$DialogListener;Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "provider"    # Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;
    .param p3, "consumer"    # Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;
    .param p4, "listener"    # Lcom/hmobile/twitter/Twitter$DialogListener;
    .param p5, "icon"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 74
    invoke-direct {p0, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 75
    iput-object p2, p0, Lcom/hmobile/twitter/TwDialog;->mProvider:Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;

    .line 76
    iput-object p3, p0, Lcom/hmobile/twitter/TwDialog;->mConsumer:Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;

    .line 77
    iput-object p4, p0, Lcom/hmobile/twitter/TwDialog;->mListener:Lcom/hmobile/twitter/Twitter$DialogListener;

    .line 78
    iput-object p5, p0, Lcom/hmobile/twitter/TwDialog;->mIcon:Landroid/graphics/drawable/Drawable;

    .line 79
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mHandler:Landroid/os/Handler;

    .line 80
    return-void
.end method

.method static synthetic access$0(Lcom/hmobile/twitter/TwDialog;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 154
    invoke-direct {p0, p1}, Lcom/hmobile/twitter/TwDialog;->retrieveAccessToken(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$1(Lcom/hmobile/twitter/TwDialog;)Lcom/hmobile/twitter/Twitter$DialogListener;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mListener:Lcom/hmobile/twitter/Twitter$DialogListener;

    return-object v0
.end method

.method static synthetic access$2(Lcom/hmobile/twitter/TwDialog;)Landroid/app/ProgressDialog;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mSpinner:Landroid/app/ProgressDialog;

    return-object v0
.end method

.method static synthetic access$3(Lcom/hmobile/twitter/TwDialog;)Landroid/webkit/WebView;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mWebView:Landroid/webkit/WebView;

    return-object v0
.end method

.method static synthetic access$4(Lcom/hmobile/twitter/TwDialog;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mTitle:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$5(Lcom/hmobile/twitter/TwDialog;)Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mProvider:Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;

    return-object v0
.end method

.method static synthetic access$6(Lcom/hmobile/twitter/TwDialog;)Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mConsumer:Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;

    return-object v0
.end method

.method static synthetic access$7(Lcom/hmobile/twitter/TwDialog;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 60
    iput-object p1, p0, Lcom/hmobile/twitter/TwDialog;->mUrl:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$8(Lcom/hmobile/twitter/TwDialog;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mUrl:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$9(Lcom/hmobile/twitter/TwDialog;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method private retrieveAccessToken(Ljava/lang/String;)V
    .locals 1
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 155
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mSpinner:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 156
    new-instance v0, Lcom/hmobile/twitter/TwDialog$2;

    invoke-direct {v0, p0, p1}, Lcom/hmobile/twitter/TwDialog$2;-><init>(Lcom/hmobile/twitter/TwDialog;Ljava/lang/String;)V

    .line 188
    invoke-virtual {v0}, Lcom/hmobile/twitter/TwDialog$2;->start()V

    .line 189
    return-void
.end method

.method private retrieveRequestToken()V
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mSpinner:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 130
    new-instance v0, Lcom/hmobile/twitter/TwDialog$1;

    invoke-direct {v0, p0}, Lcom/hmobile/twitter/TwDialog$1;-><init>(Lcom/hmobile/twitter/TwDialog;)V

    .line 151
    invoke-virtual {v0}, Lcom/hmobile/twitter/TwDialog$1;->start()V

    .line 152
    return-void
.end method

.method private setUpTitle()V
    .locals 5

    .prologue
    const/4 v4, 0x6

    const/4 v3, 0x0

    const/4 v2, 0x4

    .line 112
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/hmobile/twitter/TwDialog;->requestWindowFeature(I)Z

    .line 114
    new-instance v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/hmobile/twitter/TwDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mTitle:Landroid/widget/TextView;

    .line 115
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mTitle:Landroid/widget/TextView;

    const-string v1, "Twitter"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 116
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mTitle:Landroid/widget/TextView;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 117
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mTitle:Landroid/widget/TextView;

    sget-object v1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 118
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mTitle:Landroid/widget/TextView;

    const v1, -0x3f2113

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 119
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mTitle:Landroid/widget/TextView;

    invoke-virtual {v0, v4, v2, v2, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 120
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mTitle:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    .line 121
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mIcon:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 122
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mTitle:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/hmobile/twitter/TwDialog;->mIcon:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1, v3, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 125
    :cond_0
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mContent:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/hmobile/twitter/TwDialog;->mTitle:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 126
    return-void
.end method

.method private setUpWebView()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 192
    new-instance v0, Landroid/webkit/WebView;

    invoke-virtual {p0}, Lcom/hmobile/twitter/TwDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mWebView:Landroid/webkit/WebView;

    .line 193
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->setVerticalScrollBarEnabled(Z)V

    .line 194
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->setHorizontalScrollBarEnabled(Z)V

    .line 195
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mWebView:Landroid/webkit/WebView;

    new-instance v1, Lcom/hmobile/twitter/TwDialog$TwWebViewClient;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/hmobile/twitter/TwDialog$TwWebViewClient;-><init>(Lcom/hmobile/twitter/TwDialog;Lcom/hmobile/twitter/TwDialog$TwWebViewClient;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 196
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 197
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mWebView:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/hmobile/twitter/TwDialog;->mUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 198
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mWebView:Landroid/webkit/WebView;

    sget-object v1, Lcom/hmobile/twitter/TwDialog;->FILL:Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 199
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mContent:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/hmobile/twitter/TwDialog;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 200
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 8
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/high16 v7, 0x3f000000    # 0.5f

    const/4 v6, 0x1

    .line 84
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 85
    new-instance v3, Landroid/app/ProgressDialog;

    invoke-virtual {p0}, Lcom/hmobile/twitter/TwDialog;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object v3, p0, Lcom/hmobile/twitter/TwDialog;->mSpinner:Landroid/app/ProgressDialog;

    .line 86
    iget-object v3, p0, Lcom/hmobile/twitter/TwDialog;->mSpinner:Landroid/app/ProgressDialog;

    invoke-virtual {v3, v6}, Landroid/app/ProgressDialog;->requestWindowFeature(I)Z

    .line 87
    iget-object v3, p0, Lcom/hmobile/twitter/TwDialog;->mSpinner:Landroid/app/ProgressDialog;

    const-string v4, "Loading..."

    invoke-virtual {v3, v4}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 89
    new-instance v3, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/hmobile/twitter/TwDialog;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v3, p0, Lcom/hmobile/twitter/TwDialog;->mContent:Landroid/widget/LinearLayout;

    .line 90
    iget-object v3, p0, Lcom/hmobile/twitter/TwDialog;->mContent:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 91
    invoke-direct {p0}, Lcom/hmobile/twitter/TwDialog;->setUpTitle()V

    .line 92
    invoke-direct {p0}, Lcom/hmobile/twitter/TwDialog;->setUpWebView()V

    .line 94
    invoke-virtual {p0}, Lcom/hmobile/twitter/TwDialog;->getWindow()Landroid/view/Window;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/Window;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v3

    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    .line 95
    .local v1, "display":Landroid/view/Display;
    invoke-virtual {p0}, Lcom/hmobile/twitter/TwDialog;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v2, v3, Landroid/util/DisplayMetrics;->density:F

    .line 96
    .local v2, "scale":F
    invoke-virtual {v1}, Landroid/view/Display;->getWidth()I

    move-result v3

    invoke-virtual {v1}, Landroid/view/Display;->getHeight()I

    move-result v4

    if-ge v3, v4, :cond_0

    sget-object v0, Lcom/hmobile/twitter/TwDialog;->DIMENSIONS_PORTRAIT:[F

    .line 98
    .local v0, "dimensions":[F
    :goto_0
    iget-object v3, p0, Lcom/hmobile/twitter/TwDialog;->mContent:Landroid/widget/LinearLayout;

    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    .line 99
    const/4 v5, 0x0

    aget v5, v0, v5

    mul-float/2addr v5, v2

    add-float/2addr v5, v7

    float-to-int v5, v5

    aget v6, v0, v6

    .line 100
    mul-float/2addr v6, v2

    add-float/2addr v6, v7

    float-to-int v6, v6

    invoke-direct {v4, v5, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 98
    invoke-virtual {p0, v3, v4}, Lcom/hmobile/twitter/TwDialog;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 102
    invoke-direct {p0}, Lcom/hmobile/twitter/TwDialog;->retrieveRequestToken()V

    .line 103
    return-void

    .line 97
    .end local v0    # "dimensions":[F
    :cond_0
    sget-object v0, Lcom/hmobile/twitter/TwDialog;->DIMENSIONS_LANDSCAPE:[F

    goto :goto_0
.end method

.method public show()V
    .locals 1

    .prologue
    .line 107
    invoke-super {p0}, Landroid/app/Dialog;->show()V

    .line 108
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog;->mSpinner:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 109
    return-void
.end method
