.class public Lcom/facebook/selfupdate/ai;
.super Ljava/lang/Object;
.source "SignatureUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/pm/Signature;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 30
    if-eqz p1, :cond_0

    .line 31
    invoke-virtual {p1}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v0

    .line 32
    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 34
    :try_start_0
    const-string v0, "X.509"

    invoke-static {v0}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v0

    .line 35
    invoke-virtual {v0, v1}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v0

    .line 36
    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 37
    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getIssuerDN()Ljava/security/Principal;

    move-result-object v0

    invoke-interface {v0}, Ljava/security/Principal;->getName()Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 42
    :goto_0
    return-object v0

    .line 38
    :catch_0
    move-exception v0

    .line 39
    const-string v0, "Unknown"

    goto :goto_0

    .line 42
    :cond_0
    const-string v0, "Unknown"

    goto :goto_0
.end method

.method public a([Ljava/security/cert/Certificate;)[Landroid/content/pm/Signature;
    .locals 8

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 77
    if-eqz p1, :cond_1

    array-length v0, p1

    if-lez v0, :cond_1

    .line 79
    :try_start_0
    array-length v0, p1

    .line 80
    new-array v0, v0, [Landroid/content/pm/Signature;

    .line 82
    array-length v5, p1

    move v3, v2

    :goto_0
    if-ge v2, v5, :cond_0

    aget-object v6, p1, v2

    .line 83
    add-int/lit8 v4, v3, 0x1

    new-instance v7, Landroid/content/pm/Signature;

    invoke-virtual {v6}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v6

    invoke-direct {v7, v6}, Landroid/content/pm/Signature;-><init>([B)V

    aput-object v7, v0, v3
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    add-int/lit8 v2, v2, 0x1

    move v3, v4

    goto :goto_0

    .line 86
    :catch_0
    move-exception v0

    move-object v0, v1

    .line 90
    :cond_0
    :goto_1
    return-object v0

    :cond_1
    move-object v0, v1

    goto :goto_1
.end method

.method public a(Ljava/util/jar/JarFile;Ljava/util/jar/JarEntry;)[Ljava/security/cert/Certificate;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 57
    :try_start_0
    new-instance v1, Ljava/io/BufferedInputStream;

    invoke-virtual {p1, p2}, Ljava/util/jar/JarFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 58
    :cond_0
    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    .line 61
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 62
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/util/jar/JarEntry;->getCertificates()[Ljava/security/cert/Certificate;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 66
    :cond_1
    :goto_0
    return-object v0

    .line 65
    :catch_0
    move-exception v1

    goto :goto_0

    .line 63
    :catch_1
    move-exception v1

    goto :goto_0
.end method
