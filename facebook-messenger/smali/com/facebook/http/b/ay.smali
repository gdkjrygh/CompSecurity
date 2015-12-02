.class public Lcom/facebook/http/b/ay;
.super Lorg/apache/http/conn/ssl/SSLSocketFactory;
.source "TrustNonFacebookSocketFactory.java"


# static fields
.field private static final a:[Ljava/lang/String;

.field private static final b:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

.field private static d:Ljavax/net/ssl/TrustManager;


# instance fields
.field private c:Ljavax/net/ssl/SSLContext;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 30
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "facebook.com"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "beta.facebook.com"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "latest.facebook.com"

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/http/b/ay;->a:[Ljava/lang/String;

    .line 35
    new-instance v0, Lcom/facebook/http/b/ba;

    sget-object v1, Lcom/facebook/http/b/ay;->a:[Ljava/lang/String;

    sget-object v2, Lcom/facebook/http/b/ay;->BROWSER_COMPATIBLE_HOSTNAME_VERIFIER:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    invoke-direct {v0, v1, v2}, Lcom/facebook/http/b/ba;-><init>([Ljava/lang/String;Lorg/apache/http/conn/ssl/X509HostnameVerifier;)V

    sput-object v0, Lcom/facebook/http/b/ay;->b:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    .line 43
    new-instance v0, Lcom/facebook/http/b/az;

    invoke-direct {v0}, Lcom/facebook/http/b/az;-><init>()V

    sput-object v0, Lcom/facebook/http/b/ay;->d:Ljavax/net/ssl/TrustManager;

    return-void
.end method

.method private constructor <init>(Ljava/security/KeyStore;)V
    .locals 5

    .prologue
    .line 72
    invoke-direct {p0, p1}, Lorg/apache/http/conn/ssl/SSLSocketFactory;-><init>(Ljava/security/KeyStore;)V

    .line 73
    const-string v0, "TLS"

    invoke-static {v0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/http/b/ay;->c:Ljavax/net/ssl/SSLContext;

    .line 74
    iget-object v0, p0, Lcom/facebook/http/b/ay;->c:Ljavax/net/ssl/SSLContext;

    const/4 v1, 0x0

    const/4 v2, 0x1

    new-array v2, v2, [Ljavax/net/ssl/TrustManager;

    const/4 v3, 0x0

    sget-object v4, Lcom/facebook/http/b/ay;->d:Ljavax/net/ssl/TrustManager;

    aput-object v4, v2, v3

    new-instance v3, Ljava/security/SecureRandom;

    invoke-direct {v3}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v0, v1, v2, v3}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 75
    return-void
.end method

.method public static a()Lorg/apache/http/conn/ssl/SSLSocketFactory;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 98
    :try_start_0
    invoke-static {}, Ljava/security/KeyStore;->getDefaultType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v2

    .line 99
    const/4 v0, 0x0

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V

    .line 100
    new-instance v0, Lcom/facebook/http/b/ay;

    invoke-direct {v0, v2}, Lcom/facebook/http/b/ay;-><init>(Ljava/security/KeyStore;)V

    .line 101
    sget-object v2, Lcom/facebook/http/b/ay;->b:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    invoke-virtual {v0, v2}, Lorg/apache/http/conn/ssl/SSLSocketFactory;->setHostnameVerifier(Lorg/apache/http/conn/ssl/X509HostnameVerifier;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 104
    :goto_0
    return-object v0

    .line 103
    :catch_0
    move-exception v0

    move-object v0, v1

    .line 104
    goto :goto_0
.end method


# virtual methods
.method public createSocket()Ljava/net/Socket;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lcom/facebook/http/b/ay;->c:Ljavax/net/ssl/SSLContext;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/net/ssl/SSLSocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v0

    return-object v0
.end method

.method public createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;
    .locals 2

    .prologue
    .line 82
    iget-object v0, p0, Lcom/facebook/http/b/ay;->c:Ljavax/net/ssl/SSLContext;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v0

    check-cast v0, Ljavax/net/ssl/SSLSocket;

    .line 85
    invoke-virtual {p0}, Lcom/facebook/http/b/ay;->getHostnameVerifier()Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    move-result-object v1

    invoke-interface {v1, p2, v0}, Lorg/apache/http/conn/ssl/X509HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSocket;)V

    .line 86
    return-object v0
.end method
