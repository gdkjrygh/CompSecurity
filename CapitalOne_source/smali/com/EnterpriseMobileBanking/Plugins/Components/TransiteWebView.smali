.class public Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;
.super Lcom/EnterpriseMobileBanking/Plugins/Components/StdAppWebView;
.source "TransiteWebView.java"

# interfaces
.implements Landroid/webkit/DownloadListener;


# instance fields
.field private appctx:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 33
    invoke-direct {p0, p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/StdAppWebView;-><init>(Landroid/content/Context;)V

    .line 34
    invoke-direct {p0, p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;->setupValues(Landroid/content/Context;)V

    .line 35
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 38
    invoke-direct {p0, p1, p2}, Lcom/EnterpriseMobileBanking/Plugins/Components/StdAppWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 39
    invoke-direct {p0, p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;->setupValues(Landroid/content/Context;)V

    .line 40
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    .line 43
    invoke-direct {p0, p1, p2, p3}, Lcom/EnterpriseMobileBanking/Plugins/Components/StdAppWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 44
    invoke-direct {p0, p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;->setupValues(Landroid/content/Context;)V

    .line 45
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "appLink"    # Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    .prologue
    .line 48
    invoke-direct {p0, p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/StdAppWebView;-><init>(Landroid/content/Context;)V

    .line 49
    invoke-direct {p0, p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;->setupValues(Landroid/content/Context;)V

    .line 50
    return-void
.end method

.method private setupValues(Landroid/content/Context;)V
    .locals 4
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 53
    const-string v0, "TWV"

    const-string v1, "Setup Values!"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;->appctx:Landroid/content/Context;

    .line 55
    invoke-virtual {p0, v3}, Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;->setAnimationCacheEnabled(Z)V

    .line 56
    invoke-virtual {p0, v2}, Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;->setScrollBarStyle(I)V

    .line 57
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 58
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 59
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setGeolocationEnabled(Z)V

    .line 60
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 61
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    sget-object v1, Landroid/webkit/WebSettings$RenderPriority;->HIGH:Landroid/webkit/WebSettings$RenderPriority;

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setRenderPriority(Landroid/webkit/WebSettings$RenderPriority;)V

    .line 63
    invoke-virtual {p0, v2}, Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;->setHorizontalScrollBarEnabled(Z)V

    .line 65
    invoke-virtual {p0, p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    .line 67
    return-void
.end method


# virtual methods
.method public onDownloadStart(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 19
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "userAgent"    # Ljava/lang/String;
    .param p3, "contentDisposition"    # Ljava/lang/String;
    .param p4, "mimetype"    # Ljava/lang/String;
    .param p5, "contentLength"    # J

    .prologue
    .line 72
    const-string v16, "TWV"

    const-string v17, "On Download Started!"

    invoke-static/range {v16 .. v17}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    sget-object v16, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-static/range {v16 .. v16}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v5

    .line 74
    .local v5, "downloadDir":Ljava/io/File;
    invoke-virtual {v5}, Ljava/io/File;->canWrite()Z

    move-result v16

    if-nez v16, :cond_0

    .line 75
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;->appctx:Landroid/content/Context;

    move-object/from16 v16, v0

    const-string v17, "Disconnect your USB to download eStatements."

    const/16 v18, 0x0

    invoke-static/range {v16 .. v18}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v14

    .line 78
    .local v14, "toast":Landroid/widget/Toast;
    invoke-virtual {v14}, Landroid/widget/Toast;->show()V

    .line 129
    .end local v14    # "toast":Landroid/widget/Toast;
    :goto_0
    return-void

    .line 80
    :cond_0
    new-instance v9, Landroid/content/Intent;

    const-string v16, "android.intent.action.VIEW"

    move-object/from16 v0, v16

    invoke-direct {v9, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 81
    .local v9, "i":Landroid/content/Intent;
    const-string v7, "estatement.pdf"

    .line 82
    .local v7, "fname":Ljava/lang/String;
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v5, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 85
    .local v4, "dl":Ljava/io/File;
    invoke-static {v4}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v16

    const-string v17, "application/pdf"

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 86
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;->appctx:Landroid/content/Context;

    move-object/from16 v16, v0

    invoke-virtual/range {v16 .. v16}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v13

    .line 87
    .local v13, "packageManager":Landroid/content/pm/PackageManager;
    const/high16 v16, 0x10000

    move/from16 v0, v16

    invoke-virtual {v13, v9, v0}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v12

    .line 89
    .local v12, "list":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/ResolveInfo;>;"
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v16

    if-gtz v16, :cond_1

    .line 90
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;->appctx:Landroid/content/Context;

    move-object/from16 v16, v0

    const-string v17, "Download or enable a PDF Reader to view your eStatement."

    const/16 v18, 0x0

    invoke-static/range {v16 .. v18}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v14

    .line 93
    .restart local v14    # "toast":Landroid/widget/Toast;
    invoke-virtual {v14}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 96
    .end local v14    # "toast":Landroid/widget/Toast;
    :cond_1
    const/4 v10, 0x0

    .line 101
    .local v10, "is":Ljava/io/InputStream;
    :try_start_0
    new-instance v15, Ljava/net/URL;

    move-object/from16 v0, p1

    invoke-direct {v15, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 102
    .local v15, "u":Ljava/net/URL;
    invoke-virtual {v15}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v3

    check-cast v3, Ljava/net/HttpURLConnection;

    .line 104
    .local v3, "con":Ljava/net/HttpURLConnection;
    const-string v16, "cookie"

    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v17

    move-object/from16 v0, v17

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Landroid/webkit/CookieManager;->getCookie(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    invoke-virtual {v3, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    const-string v16, "GET"

    move-object/from16 v0, v16

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 107
    const/16 v16, 0x1

    move/from16 v0, v16

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 108
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->connect()V

    .line 109
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v10

    .line 112
    new-instance v8, Ljava/io/FileOutputStream;

    invoke-direct {v8, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 113
    .local v8, "fos":Ljava/io/FileOutputStream;
    const/16 v16, 0x400

    move/from16 v0, v16

    new-array v2, v0, [B

    .line 114
    .local v2, "buffer":[B
    const/4 v11, 0x0

    .line 115
    .local v11, "len":I
    :goto_1
    invoke-virtual {v10, v2}, Ljava/io/InputStream;->read([B)I

    move-result v11

    const/16 v16, -0x1

    move/from16 v0, v16

    if-eq v11, v0, :cond_2

    .line 116
    const/16 v16, 0x0

    move/from16 v0, v16

    invoke-virtual {v8, v2, v0, v11}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 121
    .end local v2    # "buffer":[B
    .end local v3    # "con":Ljava/net/HttpURLConnection;
    .end local v8    # "fos":Ljava/io/FileOutputStream;
    .end local v11    # "len":I
    .end local v15    # "u":Ljava/net/URL;
    :catch_0
    move-exception v6

    .line 122
    .local v6, "e":Ljava/lang/Exception;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;->appctx:Landroid/content/Context;

    move-object/from16 v16, v0

    const-string v17, "There\'s a problem connecting. Check your network or try again in a bit."

    const/16 v18, 0x0

    invoke-static/range {v16 .. v18}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v14

    .line 125
    .restart local v14    # "toast":Landroid/widget/Toast;
    invoke-virtual {v14}, Landroid/widget/Toast;->show()V

    goto/16 :goto_0

    .line 118
    .end local v6    # "e":Ljava/lang/Exception;
    .end local v14    # "toast":Landroid/widget/Toast;
    .restart local v2    # "buffer":[B
    .restart local v3    # "con":Ljava/net/HttpURLConnection;
    .restart local v8    # "fos":Ljava/io/FileOutputStream;
    .restart local v11    # "len":I
    .restart local v15    # "u":Ljava/net/URL;
    :cond_2
    :try_start_1
    invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V

    .line 119
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V

    .line 120
    invoke-static {v9}, Lcom/EnterpriseMobileBanking/AppHelper;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0
.end method
