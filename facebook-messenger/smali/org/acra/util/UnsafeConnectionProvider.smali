.class public Lorg/acra/util/UnsafeConnectionProvider;
.super Ljava/lang/Object;
.source "UnsafeConnectionProvider.java"

# interfaces
.implements Lorg/acra/util/HttpConnectionProvider;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getConnection(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    .locals 6

    .prologue
    .line 25
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v1

    check-cast v1, Ljava/net/HttpURLConnection;

    .line 26
    instance-of v2, v1, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v2, :cond_0

    .line 28
    :try_start_0
    const-string v2, "TLS"

    invoke-static {v2}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v2

    .line 29
    const/4 v3, 0x1

    new-array v3, v3, [Ljavax/net/ssl/TrustManager;

    const/4 v4, 0x0

    new-instance v5, Lorg/acra/util/TrustEveryoneTrustManager;

    invoke-direct {v5}, Lorg/acra/util/TrustEveryoneTrustManager;-><init>()V

    aput-object v5, v3, v4

    .line 30
    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {v2, v4, v3, v5}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 31
    invoke-virtual {v2}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v3

    .line 32
    move-object v0, v1

    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    move-object v2, v0

    .line 33
    invoke-virtual {v2, v3}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 34
    new-instance v3, Lorg/acra/util/UnsafeConnectionProvider$1;

    invoke-direct {v3, p0}, Lorg/acra/util/UnsafeConnectionProvider$1;-><init>(Lorg/acra/util/UnsafeConnectionProvider;)V

    invoke-virtual {v2, v3}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/KeyManagementException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    :cond_0
    :goto_0
    invoke-virtual {p0, v1}, Lorg/acra/util/UnsafeConnectionProvider;->initializeConnectionParameters(Ljava/net/HttpURLConnection;)Ljava/net/HttpURLConnection;

    move-result-object v1

    return-object v1

    .line 42
    :catch_0
    move-exception v2

    goto :goto_0

    .line 40
    :catch_1
    move-exception v2

    goto :goto_0
.end method

.method public initializeConnectionParameters(Ljava/net/HttpURLConnection;)Ljava/net/HttpURLConnection;
    .locals 1

    .prologue
    .line 51
    invoke-static {}, Lorg/acra/ACRA;->getConfig()Lorg/acra/reporter/ReportsCrashes;

    move-result-object v0

    invoke-interface {v0}, Lorg/acra/reporter/ReportsCrashes;->socketTimeout()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 52
    invoke-static {}, Lorg/acra/ACRA;->getConfig()Lorg/acra/reporter/ReportsCrashes;

    move-result-object v0

    invoke-interface {v0}, Lorg/acra/reporter/ReportsCrashes;->socketTimeout()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 53
    return-object p1
.end method
