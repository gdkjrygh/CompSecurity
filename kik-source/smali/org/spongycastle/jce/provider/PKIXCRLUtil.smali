.class public Lorg/spongycastle/jce/provider/PKIXCRLUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Lorg/spongycastle/x509/X509CRLStoreSelector;Ljava/util/List;)Ljava/util/Collection;
    .locals 7

    .prologue
    const/4 v2, 0x1

    .line 107
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 108
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 110
    const/4 v1, 0x0

    .line 111
    const/4 v0, 0x0

    move-object v3, v1

    move v1, v0

    .line 113
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 115
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 117
    instance-of v6, v0, Lorg/spongycastle/x509/X509Store;

    if-eqz v6, :cond_0

    .line 119
    check-cast v0, Lorg/spongycastle/x509/X509Store;

    .line 123
    :try_start_0
    invoke-virtual {v0, p0}, Lorg/spongycastle/x509/X509Store;->a(Lorg/spongycastle/util/Selector;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Lorg/spongycastle/util/StoreException; {:try_start_0 .. :try_end_0} :catch_0

    move v1, v2

    .line 130
    goto :goto_0

    .line 126
    :catch_0
    move-exception v0

    move-object v3, v0

    .line 128
    new-instance v0, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v6, "Exception searching in X.509 CRL store."

    invoke-direct {v0, v6, v3}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v3, v0

    .line 131
    goto :goto_0

    .line 134
    :cond_0
    check-cast v0, Ljava/security/cert/CertStore;

    .line 138
    :try_start_1
    invoke-virtual {v0, p0}, Ljava/security/cert/CertStore;->getCRLs(Ljava/security/cert/CRLSelector;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z
    :try_end_1
    .catch Ljava/security/cert/CertStoreException; {:try_start_1 .. :try_end_1} :catch_1

    move v1, v2

    .line 145
    goto :goto_0

    .line 141
    :catch_1
    move-exception v0

    move-object v3, v0

    .line 143
    new-instance v0, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v6, "Exception searching in X.509 CRL store."

    invoke-direct {v0, v6, v3}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v3, v0

    .line 147
    goto :goto_0

    .line 148
    :cond_1
    if-nez v1, :cond_2

    if-eqz v3, :cond_2

    .line 150
    throw v3

    .line 152
    :cond_2
    return-object v4
.end method

.method public static a(Lorg/spongycastle/x509/X509CRLStoreSelector;Lorg/spongycastle/x509/ExtendedPKIXParameters;Ljava/util/Date;)Ljava/util/Set;
    .locals 5

    .prologue
    .line 25
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 30
    :try_start_0
    invoke-virtual {p1}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->e()Ljava/util/List;

    move-result-object v1

    invoke-static {p0, v1}, Lorg/spongycastle/jce/provider/PKIXCRLUtil;->a(Lorg/spongycastle/x509/X509CRLStoreSelector;Ljava/util/List;)Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 31
    invoke-virtual {p1}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->f()Ljava/util/List;

    move-result-object v1

    invoke-static {p0, v1}, Lorg/spongycastle/jce/provider/PKIXCRLUtil;->a(Lorg/spongycastle/x509/X509CRLStoreSelector;Ljava/util/List;)Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 32
    invoke-virtual {p1}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->getCertStores()Ljava/util/List;

    move-result-object v1

    invoke-static {p0, v1}, Lorg/spongycastle/jce/provider/PKIXCRLUtil;->a(Lorg/spongycastle/x509/X509CRLStoreSelector;Ljava/util/List;)Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 40
    invoke-virtual {p1}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->getDate()Ljava/util/Date;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 44
    invoke-virtual {p1}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->getDate()Ljava/util/Date;

    move-result-object p2

    .line 48
    :cond_0
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 50
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509CRL;

    .line 52
    invoke-virtual {v0}, Ljava/security/cert/X509CRL;->getNextUpdate()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 54
    invoke-virtual {p0}, Lorg/spongycastle/x509/X509CRLStoreSelector;->getCertificateChecking()Ljava/security/cert/X509Certificate;

    move-result-object v3

    .line 56
    if-eqz v3, :cond_2

    .line 58
    invoke-virtual {v0}, Ljava/security/cert/X509CRL;->getThisUpdate()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v3}, Ljava/security/cert/X509Certificate;->getNotAfter()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 60
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 34
    :catch_0
    move-exception v0

    .line 36
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "Exception obtaining complete CRLs."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 65
    :cond_2
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 70
    :cond_3
    return-object v1
.end method
