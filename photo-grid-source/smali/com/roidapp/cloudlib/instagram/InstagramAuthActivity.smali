.class public Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Landroid/widget/RelativeLayout;

.field private c:Landroid/webkit/WebView;

.field private d:Landroid/app/ProgressDialog;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Landroid/os/Handler;

.field private h:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 47
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 48
    const-string v0, "InstagramAuth"

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->a:Ljava/lang/String;

    .line 232
    new-instance v0, Lcom/roidapp/cloudlib/instagram/f;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/instagram/f;-><init>(Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->h:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;)Landroid/app/ProgressDialog;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->d:Landroid/app/ProgressDialog;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->f:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->h:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;)V
    .locals 6

    .prologue
    .line 2247
    invoke-static {}, Lcom/roidapp/baselib/e/l;->a()V

    .line 2248
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    const-string v1, "Instagram"

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/al;->b(Ljava/lang/String;)Lcom/roidapp/cloudlib/ak;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/instagram/h;

    .line 2249
    const-string v1, "https://api.instagram.com/oauth/access_token"

    .line 2251
    new-instance v2, Lorg/apache/http/client/methods/HttpPost;

    invoke-direct {v2, v1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 2253
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2254
    new-instance v3, Lorg/apache/http/message/BasicNameValuePair;

    const-string v4, "client_id"

    iget-object v5, v0, Lcom/roidapp/cloudlib/instagram/h;->f:Ljava/lang/String;

    invoke-direct {v3, v4, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2255
    new-instance v3, Lorg/apache/http/message/BasicNameValuePair;

    const-string v4, "client_secret"

    iget-object v0, v0, Lcom/roidapp/cloudlib/instagram/h;->g:Ljava/lang/String;

    invoke-direct {v3, v4, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2256
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "grant_type"

    const-string v4, "authorization_code"

    invoke-direct {v0, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2257
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "redirect_uri"

    iget-object v4, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->e:Ljava/lang/String;

    invoke-direct {v0, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2258
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "code"

    iget-object v4, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->f:Ljava/lang/String;

    invoke-direct {v0, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2262
    :try_start_0
    new-instance v0, Lorg/apache/http/client/entity/UrlEncodedFormEntity;

    const-string v3, "UTF-8"

    invoke-direct {v0, v1, v3}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 2263
    new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    invoke-virtual {v0, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v0

    .line 2265
    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_0

    .line 2267
    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;)Ljava/lang/String;

    move-result-object v0

    .line 2269
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 2270
    const-string v0, "user"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v2, "id"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2271
    const-string v2, "access_token"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2272
    const-string v3, "user"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "username"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 2273
    const-string v4, "user"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v4, "profile_picture"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2274
    invoke-static {p0, v3, v0, v2, v1}, Lcom/roidapp/cloudlib/common/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2275
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->g:Landroid/os/Handler;

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2294
    :cond_0
    :goto_0
    return-void

    .line 2277
    :catch_0
    move-exception v0

    .line 2278
    :try_start_1
    invoke-virtual {v0}, Lorg/apache/http/client/ClientProtocolException;->printStackTrace()V

    .line 2279
    iget-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->g:Landroid/os/Handler;

    const/16 v2, 0x20

    invoke-virtual {v0}, Lorg/apache/http/client/ClientProtocolException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 2280
    iget-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->g:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 2293
    :catchall_0
    move-exception v0

    throw v0

    .line 2281
    :catch_1
    move-exception v0

    .line 2282
    :try_start_2
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 2283
    iget-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->g:Landroid/os/Handler;

    const/16 v2, 0x20

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 2284
    iget-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->g:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 2285
    :catch_2
    move-exception v0

    .line 2286
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    .line 2287
    iget-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->g:Landroid/os/Handler;

    const/16 v2, 0x20

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 2288
    iget-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->g:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 2289
    :catch_3
    move-exception v0

    .line 2290
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 2291
    iget-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->g:Landroid/os/Handler;

    const/16 v2, 0x20

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 2292
    iget-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->g:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .prologue
    .line 185
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 186
    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->setResult(ILandroid/content/Intent;)V

    .line 187
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->finish()V

    .line 189
    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    const/4 v0, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 93
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 94
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->requestWindowFeature(I)Z

    .line 95
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->setResult(ILandroid/content/Intent;)V

    .line 96
    sget v0, Lcom/roidapp/cloudlib/as;->I:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->setContentView(I)V

    .line 98
    new-instance v0, Lcom/roidapp/cloudlib/instagram/g;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/instagram/g;-><init>(Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->g:Landroid/os/Handler;

    .line 99
    sget v0, Lcom/roidapp/cloudlib/ar;->k:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->b:Landroid/widget/RelativeLayout;

    .line 100
    sget v0, Lcom/roidapp/cloudlib/ar;->bm:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->c:Landroid/webkit/WebView;

    .line 101
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->c:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setSaveFormData(Z)V

    .line 103
    invoke-static {p0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 104
    new-instance v0, Lcom/roidapp/cloudlib/instagram/a;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/instagram/a;-><init>(Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;)V

    new-instance v1, Lcom/roidapp/cloudlib/instagram/b;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/instagram/b;-><init>(Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;)V

    new-instance v2, Lcom/roidapp/cloudlib/instagram/c;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/instagram/c;-><init>(Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;)V

    invoke-static {p0, v0, v1, v2}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnKeyListener;)V

    .line 180
    :goto_0
    return-void

    .line 130
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 131
    const-string v1, "logoutFlag"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    .line 132
    if-eqz v0, :cond_1

    .line 1302
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "\u6e05\u9664COOKIE...BEGIN"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 1303
    invoke-static {p0}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;

    .line 1304
    invoke-static {}, Landroid/webkit/CookieSyncManager;->getInstance()Landroid/webkit/CookieSyncManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/CookieSyncManager;->startSync()V

    .line 1305
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/CookieManager;->removeSessionCookie()V

    .line 1306
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/CookieManager;->removeAllCookie()V

    .line 1307
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->c:Landroid/webkit/WebView;

    invoke-virtual {v0, v3}, Landroid/webkit/WebView;->clearCache(Z)V

    .line 1308
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->c:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->clearHistory()V

    .line 1310
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "\u6e05\u9664COOKIE...END"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 136
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->c:Landroid/webkit/WebView;

    new-instance v1, Lcom/roidapp/cloudlib/instagram/d;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/instagram/d;-><init>(Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 145
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    const-string v1, "Instagram"

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/al;->b(Ljava/lang/String;)Lcom/roidapp/cloudlib/ak;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/instagram/h;

    .line 146
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v0, Lcom/roidapp/cloudlib/instagram/h;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "://callback"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->e:Ljava/lang/String;

    .line 147
    iget-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->c:Landroid/webkit/WebView;

    new-instance v2, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity$AuthWebViewClient;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity$AuthWebViewClient;-><init>(Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;Lcom/roidapp/cloudlib/instagram/a;)V

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 150
    :try_start_0
    iget-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->c:Landroid/webkit/WebView;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->clearCache(Z)V

    .line 151
    invoke-static {p0}, Lcom/roidapp/baselib/e/l;->d(Landroid/content/Context;)V

    .line 154
    iget-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->c:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteDiskIOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 156
    const/4 v2, 0x1

    :try_start_1
    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Landroid/database/sqlite/SQLiteDiskIOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 161
    :goto_1
    :try_start_2
    const-string v1, ""

    sget v2, Lcom/roidapp/cloudlib/at;->R:I

    invoke-virtual {p0, v2}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v1, v2}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/app/ProgressDialog;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->d:Landroid/app/ProgressDialog;

    .line 163
    iget-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->d:Landroid/app/ProgressDialog;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/app/ProgressDialog;->setCanceledOnTouchOutside(Z)V

    .line 164
    iget-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->d:Landroid/app/ProgressDialog;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 165
    iget-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->d:Landroid/app/ProgressDialog;

    new-instance v2, Lcom/roidapp/cloudlib/instagram/e;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/instagram/e;-><init>(Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;)V

    invoke-virtual {v1, v2}, Landroid/app/ProgressDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 172
    iget-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->c:Landroid/webkit/WebView;

    const-string v2, "https://api.instagram.com/oauth/authorize/?client_id=%s&redirect_uri=%s&response_type=code&scope=likes+relationships+comments"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v0, v0, Lcom/roidapp/cloudlib/instagram/h;->f:Ljava/lang/String;

    aput-object v0, v3, v4

    const/4 v0, 0x1

    iget-object v4, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->e:Ljava/lang/String;

    aput-object v4, v3, v0

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteDiskIOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 179
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->c:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->clearFormData()V

    goto/16 :goto_0

    .line 177
    :catch_0
    move-exception v0

    :try_start_3
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDiskIOException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 179
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->c:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->clearFormData()V

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->c:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->clearFormData()V

    throw v0

    :catch_1
    move-exception v1

    goto :goto_1
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 193
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->c:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 194
    iput-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->c:Landroid/webkit/WebView;

    .line 195
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->b:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->removeAllViews()V

    .line 196
    iput-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->b:Landroid/widget/RelativeLayout;

    .line 197
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->d:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    .line 198
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->d:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 200
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 201
    return-void
.end method
