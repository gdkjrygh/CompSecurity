.class Lcom/localytics/android/LocalyticsAmpSession$3$2;
.super Ljava/lang/Object;
.source "LocalyticsAmpSession.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/localytics/android/LocalyticsAmpSession$3;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/localytics/android/LocalyticsAmpSession$3;


# direct methods
.method constructor <init>(Lcom/localytics/android/LocalyticsAmpSession$3;)V
    .locals 0

    .prologue
    .line 478
    iput-object p1, p0, Lcom/localytics/android/LocalyticsAmpSession$3$2;->this$1:Lcom/localytics/android/LocalyticsAmpSession$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .prologue
    .line 481
    iget-object v7, p0, Lcom/localytics/android/LocalyticsAmpSession$3$2;->this$1:Lcom/localytics/android/LocalyticsAmpSession$3;

    iget-object v7, v7, Lcom/localytics/android/LocalyticsAmpSession$3;->pushRegID:Ljava/lang/String;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_0

    .line 483
    iget-object v7, p0, Lcom/localytics/android/LocalyticsAmpSession$3$2;->this$1:Lcom/localytics/android/LocalyticsAmpSession$3;

    iget-object v7, v7, Lcom/localytics/android/LocalyticsAmpSession$3;->val$provider:Lcom/localytics/android/LocalyticsProvider;

    iget-object v8, p0, Lcom/localytics/android/LocalyticsAmpSession$3$2;->this$1:Lcom/localytics/android/LocalyticsAmpSession$3;

    iget-object v8, v8, Lcom/localytics/android/LocalyticsAmpSession$3;->val$apiKey:Ljava/lang/String;

    invoke-static {v7, v8}, Lcom/localytics/android/SessionHandler;->getInstallationId(Lcom/localytics/android/LocalyticsProvider;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 484
    .local v4, "installID":Ljava/lang/String;
    iget-object v7, p0, Lcom/localytics/android/LocalyticsAmpSession$3$2;->this$1:Lcom/localytics/android/LocalyticsAmpSession$3;

    iget-object v7, v7, Lcom/localytics/android/LocalyticsAmpSession$3;->val$provider:Lcom/localytics/android/LocalyticsProvider;

    invoke-virtual {v7}, Lcom/localytics/android/LocalyticsProvider;->getUserIdAndType()Ljava/util/Map;

    move-result-object v7

    const-string v8, "id"

    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 485
    .local v1, "customerID":Ljava/lang/String;
    const-string v7, "http://pushapi.localytics.com/push_test?platform=android&type=prod&campaign=%s&creative=%s&token=%s&install_id=%s"

    const/4 v8, 0x4

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    iget-object v10, p0, Lcom/localytics/android/LocalyticsAmpSession$3$2;->this$1:Lcom/localytics/android/LocalyticsAmpSession$3;

    iget-object v10, v10, Lcom/localytics/android/LocalyticsAmpSession$3;->val$campaign:Ljava/lang/String;

    aput-object v10, v8, v9

    const/4 v9, 0x1

    iget-object v10, p0, Lcom/localytics/android/LocalyticsAmpSession$3$2;->this$1:Lcom/localytics/android/LocalyticsAmpSession$3;

    iget-object v10, v10, Lcom/localytics/android/LocalyticsAmpSession$3;->val$creative:Ljava/lang/String;

    aput-object v10, v8, v9

    const/4 v9, 0x2

    iget-object v10, p0, Lcom/localytics/android/LocalyticsAmpSession$3$2;->this$1:Lcom/localytics/android/LocalyticsAmpSession$3;

    iget-object v10, v10, Lcom/localytics/android/LocalyticsAmpSession$3;->pushRegID:Ljava/lang/String;

    aput-object v10, v8, v9

    const/4 v9, 0x3

    aput-object v4, v8, v9

    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 488
    .local v6, "url":Ljava/lang/String;
    :try_start_0
    new-instance v3, Lorg/apache/http/params/BasicHttpParams;

    invoke-direct {v3}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    .line 490
    .local v3, "httpParameters":Lorg/apache/http/params/HttpParams;
    const/16 v7, 0x1388

    invoke-static {v3, v7}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 493
    const/16 v7, 0x1388

    invoke-static {v3, v7}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 495
    new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v0, v3}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V

    .line 496
    .local v0, "client":Lorg/apache/http/client/HttpClient;
    new-instance v5, Lorg/apache/http/client/methods/HttpGet;

    invoke-direct {v5, v6}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 497
    .local v5, "request":Lorg/apache/http/client/methods/HttpGet;
    const-string v7, "x-install-id"

    invoke-virtual {v5, v7, v4}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 498
    const-string v7, "x-app-id"

    iget-object v8, p0, Lcom/localytics/android/LocalyticsAmpSession$3$2;->this$1:Lcom/localytics/android/LocalyticsAmpSession$3;

    iget-object v8, v8, Lcom/localytics/android/LocalyticsAmpSession$3;->val$apiKey:Ljava/lang/String;

    invoke-virtual {v5, v7, v8}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 499
    const-string v7, "x-client-version"

    const-string v8, "androida_2.72"

    invoke-virtual {v5, v7, v8}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 500
    const-string v7, "x-app-version"

    iget-object v8, p0, Lcom/localytics/android/LocalyticsAmpSession$3$2;->this$1:Lcom/localytics/android/LocalyticsAmpSession$3;

    iget-object v8, v8, Lcom/localytics/android/LocalyticsAmpSession$3;->this$0:Lcom/localytics/android/LocalyticsAmpSession;

    iget-object v8, v8, Lcom/localytics/android/LocalyticsAmpSession;->mContext:Landroid/content/Context;

    invoke-static {v8}, Lcom/localytics/android/DatapointHelper;->getAppVersion(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v7, v8}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 501
    const-string v7, "x-customer-id"

    invoke-virtual {v5, v7, v1}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 502
    invoke-interface {v0, v5}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 509
    .end local v0    # "client":Lorg/apache/http/client/HttpClient;
    .end local v1    # "customerID":Ljava/lang/String;
    .end local v3    # "httpParameters":Lorg/apache/http/params/HttpParams;
    .end local v4    # "installID":Ljava/lang/String;
    .end local v5    # "request":Lorg/apache/http/client/methods/HttpGet;
    .end local v6    # "url":Ljava/lang/String;
    :cond_0
    :goto_0
    return-void

    .line 504
    .restart local v1    # "customerID":Ljava/lang/String;
    .restart local v4    # "installID":Ljava/lang/String;
    .restart local v6    # "url":Ljava/lang/String;
    :catch_0
    move-exception v2

    .line 506
    .local v2, "e":Ljava/io/IOException;
    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method
