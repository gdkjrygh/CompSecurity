.class Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient;
.super Lorg/apache/http/impl/client/DefaultHttpClient;
.source "AsyncServiceCallTask.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/EnterpriseMobileBanking/AsyncServiceCallTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "MyHttpClient"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient$MySSLSocketFactory;
    }
.end annotation


# instance fields
.field final context:Landroid/content/Context;

.field easyTrustManager:Ljavax/net/ssl/TrustManager;

.field final synthetic this$0:Lcom/EnterpriseMobileBanking/AsyncServiceCallTask;


# direct methods
.method public constructor <init>(Lcom/EnterpriseMobileBanking/AsyncServiceCallTask;Landroid/content/Context;)V
    .locals 1
    .param p2, "context"    # Landroid/content/Context;

    .prologue
    .line 284
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient;->this$0:Lcom/EnterpriseMobileBanking/AsyncServiceCallTask;

    invoke-direct {p0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    .line 266
    new-instance v0, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient$1;

    invoke-direct {v0, p0}, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient$1;-><init>(Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient;)V

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient;->easyTrustManager:Ljavax/net/ssl/TrustManager;

    .line 285
    iput-object p2, p0, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient;->context:Landroid/content/Context;

    .line 286
    return-void
.end method

.method private newSslSocketFactory()Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient$MySSLSocketFactory;
    .locals 5

    .prologue
    .line 299
    :try_start_0
    const-string v3, "BKS"

    invoke-static {v3}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 301
    .local v2, "trusted":Ljava/security/KeyStore;
    const/4 v3, 0x0

    const/4 v4, 0x0

    :try_start_1
    invoke-virtual {v2, v3, v4}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 306
    :try_start_2
    new-instance v1, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient$MySSLSocketFactory;

    invoke-direct {v1, p0, v2}, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient$MySSLSocketFactory;-><init>(Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient;Ljava/security/KeyStore;)V

    .line 307
    .local v1, "sslfactory":Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient$MySSLSocketFactory;
    sget-object v3, Lorg/apache/http/conn/ssl/SSLSocketFactory;->ALLOW_ALL_HOSTNAME_VERIFIER:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    invoke-virtual {v1, v3}, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient$MySSLSocketFactory;->setHostnameVerifier(Lorg/apache/http/conn/ssl/X509HostnameVerifier;)V

    .line 308
    return-object v1

    .line 303
    .end local v1    # "sslfactory":Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient$MySSLSocketFactory;
    :catchall_0
    move-exception v3

    throw v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 309
    .end local v2    # "trusted":Ljava/security/KeyStore;
    :catch_0
    move-exception v0

    .line 310
    .local v0, "e":Ljava/lang/Exception;
    new-instance v3, Ljava/lang/AssertionError;

    invoke-direct {v3, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v3
.end method


# virtual methods
.method protected createClientConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
    .locals 5

    .prologue
    .line 289
    new-instance v0, Lorg/apache/http/conn/scheme/SchemeRegistry;

    invoke-direct {v0}, Lorg/apache/http/conn/scheme/SchemeRegistry;-><init>()V

    .line 290
    .local v0, "registry":Lorg/apache/http/conn/scheme/SchemeRegistry;
    new-instance v1, Lorg/apache/http/conn/scheme/Scheme;

    const-string v2, "http"

    invoke-static {}, Lorg/apache/http/conn/scheme/PlainSocketFactory;->getSocketFactory()Lorg/apache/http/conn/scheme/PlainSocketFactory;

    move-result-object v3

    const/16 v4, 0x50

    invoke-direct {v1, v2, v3, v4}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    invoke-virtual {v0, v1}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    .line 292
    new-instance v1, Lorg/apache/http/conn/scheme/Scheme;

    const-string v2, "https"

    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient;->newSslSocketFactory()Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient$MySSLSocketFactory;

    move-result-object v3

    const/16 v4, 0x1bb

    invoke-direct {v1, v2, v3, v4}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    invoke-virtual {v0, v1}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    .line 293
    new-instance v1, Lorg/apache/http/impl/conn/SingleClientConnManager;

    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/apache/http/impl/conn/SingleClientConnManager;-><init>(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V

    return-object v1
.end method
