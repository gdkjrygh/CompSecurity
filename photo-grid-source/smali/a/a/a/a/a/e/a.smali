.class final La/a/a/a/a/e/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(Ljava/security/cert/X509Certificate;Ljava/security/cert/X509Certificate;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 77
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v1

    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljavax/security/auth/x500/X500Principal;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 87
    :goto_0
    return v0

    .line 82
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/security/cert/X509Certificate;->verify(Ljava/security/PublicKey;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    const/4 v0, 0x1

    goto :goto_0

    .line 84
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static a([Ljava/security/cert/X509Certificate;La/a/a/a/a/e/p;)[Ljava/security/cert/X509Certificate;
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 40
    new-instance v3, Ljava/util/LinkedList;

    invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V

    .line 44
    aget-object v0, p0, v2

    invoke-virtual {p1, v0}, La/a/a/a/a/e/p;->a(Ljava/security/cert/X509Certificate;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v1

    .line 48
    :goto_0
    aget-object v2, p0, v2

    invoke-virtual {v3, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    move v2, v0

    move v0, v1

    .line 50
    :goto_1
    array-length v4, p0

    if-ge v0, v4, :cond_1

    .line 51
    aget-object v4, p0, v0

    invoke-virtual {p1, v4}, La/a/a/a/a/e/p;->a(Ljava/security/cert/X509Certificate;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v2, v1

    .line 55
    :cond_0
    aget-object v4, p0, v0

    add-int/lit8 v5, v0, -0x1

    aget-object v5, p0, v5

    invoke-static {v4, v5}, La/a/a/a/a/e/a;->a(Ljava/security/cert/X509Certificate;Ljava/security/cert/X509Certificate;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 56
    aget-object v4, p0, v0

    invoke-virtual {v3, v4}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 50
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 62
    :cond_1
    add-int/lit8 v0, v0, -0x1

    aget-object v0, p0, v0

    invoke-virtual {p1, v0}, La/a/a/a/a/e/p;->b(Ljava/security/cert/X509Certificate;)Ljava/security/cert/X509Certificate;

    move-result-object v0

    .line 64
    if-eqz v0, :cond_3

    .line 65
    invoke-virtual {v3, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 69
    :goto_2
    if-eqz v1, :cond_2

    .line 70
    invoke-virtual {v3}, Ljava/util/LinkedList;->size()I

    move-result v0

    new-array v0, v0, [Ljava/security/cert/X509Certificate;

    invoke-virtual {v3, v0}, Ljava/util/LinkedList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/security/cert/X509Certificate;

    return-object v0

    .line 72
    :cond_2
    new-instance v0, Ljava/security/cert/CertificateException;

    const-string v1, "Didn\'t find a trust anchor in chain cleanup!"

    invoke-direct {v0, v1}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    move v1, v2

    goto :goto_2

    :cond_4
    move v0, v2

    goto :goto_0
.end method
