.class public Lcom/qihoo/security/ui/result/b;
.super Landroid/webkit/WebViewClient;
.source "360Security"


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/ui/result/b;->b:I

    .line 30
    iput-object p1, p0, Lcom/qihoo/security/ui/result/b;->a:Ljava/lang/String;

    .line 31
    iput-object p2, p0, Lcom/qihoo/security/ui/result/b;->c:Ljava/lang/String;

    .line 32
    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 125
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 129
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    .prologue
    .line 117
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 121
    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 133
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    .line 139
    const/16 v0, 0x61b3

    iget-object v1, p0, Lcom/qihoo/security/ui/result/b;->a:Ljava/lang/String;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2, p3}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    if-eqz p1, :cond_0

    .line 143
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    .line 144
    invoke-virtual {p1}, Landroid/webkit/WebView;->destroy()V

    .line 146
    :cond_0
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 9

    .prologue
    const/4 v0, 0x0

    const/4 v7, 0x1

    .line 39
    if-nez p2, :cond_1

    .line 112
    :cond_0
    :goto_0
    return v7

    .line 42
    :cond_1
    iget v1, p0, Lcom/qihoo/security/ui/result/b;->b:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/qihoo/security/ui/result/b;->b:I

    .line 45
    :try_start_0
    invoke-static {}, Lcom/qihoo/security/ui/result/a;->a()Lcom/qihoo/security/ui/result/a;

    move-result-object v1

    invoke-virtual {v1, p2}, Lcom/qihoo/security/ui/result/a;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 46
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->getEncodedQuery()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "&"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 47
    if-eqz v3, :cond_0

    .line 50
    const-string/jumbo v2, ""

    .line 51
    const-string/jumbo v1, ""

    move v8, v0

    move-object v0, v1

    move-object v1, v2

    move v2, v8

    .line 52
    :goto_1
    array-length v4, v3

    if-ge v2, v4, :cond_4

    .line 53
    aget-object v4, v3, v2

    const-string/jumbo v5, "="

    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 54
    if-eqz v4, :cond_0

    .line 57
    array-length v5, v4

    if-le v5, v7, :cond_3

    .line 58
    const/4 v5, 0x0

    aget-object v5, v4, v5

    .line 59
    const-string/jumbo v6, "id"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 60
    const/4 v1, 0x1

    aget-object v1, v4, v1

    .line 61
    :cond_2
    const-string/jumbo v6, "referrer"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 62
    const/4 v0, 0x1

    aget-object v0, v4, v0

    .line 52
    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 66
    :cond_4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    if-nez v2, :cond_7

    .line 68
    :try_start_1
    const-string/jumbo v2, "utf-8"

    invoke-static {v0, v2}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 73
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 78
    :goto_2
    const-string/jumbo v2, "sp_name_adv_referrer"

    invoke-static {v2, v1, v0}, Lcom/qihoo360/mobilesafe/share/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 85
    :goto_3
    :try_start_2
    iget v0, p0, Lcom/qihoo/security/ui/result/b;->b:I

    const/4 v1, 0x3

    if-le v0, v1, :cond_5

    .line 90
    :cond_5
    if-eqz p1, :cond_0

    .line 91
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    .line 92
    invoke-virtual {p1}, Landroid/webkit/WebView;->destroy()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_0

    .line 106
    :catch_0
    move-exception v0

    goto/16 :goto_0

    .line 76
    :cond_6
    :try_start_3
    iget-object v1, p0, Lcom/qihoo/security/ui/result/b;->c:Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_2

    .line 96
    :cond_7
    :try_start_4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 102
    :cond_8
    if-eqz p1, :cond_0

    .line 103
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto/16 :goto_0

    .line 80
    :catch_1
    move-exception v0

    goto :goto_3
.end method
