.class public Lorg/apache/cordova/IceCreamCordovaWebViewClient;
.super Lorg/apache/cordova/CordovaWebViewClient;
.source "IceCreamCordovaWebViewClient.java"


# direct methods
.method public constructor <init>(Lorg/apache/cordova/api/CordovaInterface;)V
    .locals 0
    .param p1, "cordova"    # Lorg/apache/cordova/api/CordovaInterface;

    .prologue
    .line 36
    invoke-direct {p0, p1}, Lorg/apache/cordova/CordovaWebViewClient;-><init>(Lorg/apache/cordova/api/CordovaInterface;)V

    .line 37
    return-void
.end method

.method public constructor <init>(Lorg/apache/cordova/api/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V
    .locals 0
    .param p1, "cordova"    # Lorg/apache/cordova/api/CordovaInterface;
    .param p2, "view"    # Lorg/apache/cordova/CordovaWebView;

    .prologue
    .line 40
    invoke-direct {p0, p1, p2}, Lorg/apache/cordova/CordovaWebViewClient;-><init>(Lorg/apache/cordova/api/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V

    .line 41
    return-void
.end method

.method private generateWebResourceResponse(Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 11
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    const/4 v10, 0x0

    .line 53
    const-string v0, "file:///android_asset/"

    .line 54
    .local v0, "ANDROID_ASSET":Ljava/lang/String;
    const-string v8, "file:///android_asset/"

    invoke-virtual {p1, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 55
    move-object v4, p1

    .line 56
    .local v4, "niceUrl":Ljava/lang/String;
    const-string v8, "file:///android_asset/"

    const-string v9, ""

    invoke-virtual {p1, v8, v9}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 57
    const-string v8, "?"

    invoke-virtual {v4, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 58
    const-string v8, "\\?"

    invoke-virtual {v4, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    aget-object v4, v8, v10

    .line 65
    :cond_0
    :goto_0
    const/4 v3, 0x0

    .line 66
    .local v3, "mimetype":Ljava/lang/String;
    const-string v8, ".html"

    invoke-virtual {v4, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 67
    const-string v3, "text/html"

    .line 71
    :cond_1
    :try_start_0
    iget-object v8, p0, Lorg/apache/cordova/IceCreamCordovaWebViewClient;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v8}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v8

    invoke-virtual {v8}, Landroid/app/Activity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    .line 72
    .local v1, "assets":Landroid/content/res/AssetManager;
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v7

    .line 73
    .local v7, "uri":Landroid/net/Uri;
    invoke-virtual {v7}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x2

    invoke-virtual {v1, v8, v9}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;I)Ljava/io/InputStream;

    move-result-object v6

    .line 74
    .local v6, "stream":Ljava/io/InputStream;
    new-instance v5, Landroid/webkit/WebResourceResponse;

    const-string v8, "UTF-8"

    invoke-direct {v5, v3, v8, v6}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    .end local v1    # "assets":Landroid/content/res/AssetManager;
    .end local v3    # "mimetype":Ljava/lang/String;
    .end local v4    # "niceUrl":Ljava/lang/String;
    .end local v6    # "stream":Ljava/io/InputStream;
    .end local v7    # "uri":Landroid/net/Uri;
    :goto_1
    return-object v5

    .line 60
    .restart local v4    # "niceUrl":Ljava/lang/String;
    :cond_2
    const-string v8, "#"

    invoke-virtual {v4, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 62
    const-string v8, "#"

    invoke-virtual {v4, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    aget-object v4, v8, v10

    goto :goto_0

    .line 76
    .restart local v3    # "mimetype":Ljava/lang/String;
    :catch_0
    move-exception v2

    .line 77
    .local v2, "e":Ljava/io/IOException;
    const-string v8, "generateWebResourceResponse"

    invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9, v2}, Lorg/apache/cordova/api/LOG;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 80
    .end local v2    # "e":Ljava/io/IOException;
    .end local v3    # "mimetype":Ljava/lang/String;
    .end local v4    # "niceUrl":Ljava/lang/String;
    :cond_3
    const/4 v5, 0x0

    goto :goto_1
.end method


# virtual methods
.method public shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 1
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 45
    const-string v0, "?"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "#"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 46
    :cond_0
    invoke-direct {p0, p2}, Lorg/apache/cordova/IceCreamCordovaWebViewClient;->generateWebResourceResponse(Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object v0

    .line 48
    :goto_0
    return-object v0

    :cond_1
    invoke-super {p0, p1, p2}, Lorg/apache/cordova/CordovaWebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object v0

    goto :goto_0
.end method
