.class public Lorg/bouncycastle/jce/provider/MultiCertStoreSpi;
.super Ljava/security/cert/CertStoreSpi;


# instance fields
.field private a:Lorg/bouncycastle/jce/MultiCertStoreParameters;


# virtual methods
.method public engineGetCRLs(Ljava/security/cert/CRLSelector;)Ljava/util/Collection;
    .locals 5

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/MultiCertStoreSpi;->a:Lorg/bouncycastle/jce/MultiCertStoreParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/MultiCertStoreParameters;->b()Z

    move-result v2

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/MultiCertStoreSpi;->a:Lorg/bouncycastle/jce/MultiCertStoreParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/MultiCertStoreParameters;->a()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    if-eqz v2, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v1, v0

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/CertStore;

    invoke-virtual {v0, p1}, Ljava/security/cert/CertStore;->getCRLs(Ljava/security/cert/CRLSelector;)Ljava/util/Collection;

    move-result-object v0

    if-eqz v2, :cond_2

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    move-object v1, v0

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    move-object v1, v0

    :cond_3
    return-object v1
.end method

.method public engineGetCertificates(Ljava/security/cert/CertSelector;)Ljava/util/Collection;
    .locals 5

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/MultiCertStoreSpi;->a:Lorg/bouncycastle/jce/MultiCertStoreParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/MultiCertStoreParameters;->b()Z

    move-result v2

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/MultiCertStoreSpi;->a:Lorg/bouncycastle/jce/MultiCertStoreParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/MultiCertStoreParameters;->a()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    if-eqz v2, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v1, v0

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/CertStore;

    invoke-virtual {v0, p1}, Ljava/security/cert/CertStore;->getCertificates(Ljava/security/cert/CertSelector;)Ljava/util/Collection;

    move-result-object v0

    if-eqz v2, :cond_2

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    move-object v1, v0

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    move-object v1, v0

    :cond_3
    return-object v1
.end method
