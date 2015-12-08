.class Lorg/xwalk/core/internal/SslUtil;
.super Ljava/lang/Object;
.source "SslUtil.java"


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final TAG:Ljava/lang/String; = "SslUtil"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 19
    const-class v0, Lorg/xwalk/core/internal/SslUtil;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/xwalk/core/internal/SslUtil;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getCertificateFromDerBytes([B)Landroid/net/http/SslCertificate;
    .locals 6
    .param p0, "derBytes"    # [B

    .prologue
    const/4 v2, 0x0

    .line 42
    if-nez p0, :cond_0

    .line 60
    :goto_0
    return-object v2

    .line 47
    :cond_0
    :try_start_0
    invoke-static {p0}, Lorg/chromium/net/X509Util;->createCertificateFromBytes([B)Ljava/security/cert/X509Certificate;

    move-result-object v1

    .line 49
    .local v1, "x509Certificate":Ljava/security/cert/X509Certificate;
    new-instance v3, Landroid/net/http/SslCertificate;

    invoke-direct {v3, v1}, Landroid/net/http/SslCertificate;-><init>(Ljava/security/cert/X509Certificate;)V
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_2

    move-object v2, v3

    goto :goto_0

    .line 50
    .end local v1    # "x509Certificate":Ljava/security/cert/X509Certificate;
    :catch_0
    move-exception v0

    .line 52
    .local v0, "e":Ljava/security/cert/CertificateException;
    const-string v3, "SslUtil"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Could not read certificate: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 53
    .end local v0    # "e":Ljava/security/cert/CertificateException;
    :catch_1
    move-exception v0

    .line 55
    .local v0, "e":Ljava/security/KeyStoreException;
    const-string v3, "SslUtil"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Could not read certificate: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 56
    .end local v0    # "e":Ljava/security/KeyStoreException;
    :catch_2
    move-exception v0

    .line 58
    .local v0, "e":Ljava/security/NoSuchAlgorithmException;
    const-string v3, "SslUtil"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Could not read certificate: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static sslErrorFromNetErrorCode(ILandroid/net/http/SslCertificate;Ljava/lang/String;)Landroid/net/http/SslError;
    .locals 2
    .param p0, "error"    # I
    .param p1, "cert"    # Landroid/net/http/SslCertificate;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 26
    sget-boolean v0, Lorg/xwalk/core/internal/SslUtil;->$assertionsDisabled:Z

    if-nez v0, :cond_1

    const/16 v0, -0xd5

    if-lt p0, v0, :cond_0

    const/16 v0, -0xc8

    if-le p0, v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 27
    :cond_1
    packed-switch p0, :pswitch_data_0

    .line 38
    new-instance v0, Landroid/net/http/SslError;

    const/4 v1, 0x5

    invoke-direct {v0, v1, p1, p2}, Landroid/net/http/SslError;-><init>(ILandroid/net/http/SslCertificate;Ljava/lang/String;)V

    :goto_0
    return-object v0

    .line 29
    :pswitch_0
    new-instance v0, Landroid/net/http/SslError;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p1, p2}, Landroid/net/http/SslError;-><init>(ILandroid/net/http/SslCertificate;Ljava/lang/String;)V

    goto :goto_0

    .line 31
    :pswitch_1
    new-instance v0, Landroid/net/http/SslError;

    const/4 v1, 0x4

    invoke-direct {v0, v1, p1, p2}, Landroid/net/http/SslError;-><init>(ILandroid/net/http/SslCertificate;Ljava/lang/String;)V

    goto :goto_0

    .line 33
    :pswitch_2
    new-instance v0, Landroid/net/http/SslError;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p1, p2}, Landroid/net/http/SslError;-><init>(ILandroid/net/http/SslCertificate;Ljava/lang/String;)V

    goto :goto_0

    .line 27
    nop

    :pswitch_data_0
    .packed-switch -0xca
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
