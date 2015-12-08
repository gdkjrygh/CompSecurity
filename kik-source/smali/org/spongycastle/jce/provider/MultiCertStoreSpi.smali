.class public Lorg/spongycastle/jce/provider/MultiCertStoreSpi;
.super Ljava/security/cert/CertStoreSpi;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/jce/MultiCertStoreParameters;


# virtual methods
.method public engineGetCRLs(Ljava/security/cert/CRLSelector;)Ljava/util/Collection;
    .locals 5

    .prologue
    .line 64
    iget-object v0, p0, Lorg/spongycastle/jce/provider/MultiCertStoreSpi;->a:Lorg/spongycastle/jce/MultiCertStoreParameters;

    invoke-virtual {v0}, Lorg/spongycastle/jce/MultiCertStoreParameters;->b()Z

    move-result v2

    .line 65
    iget-object v0, p0, Lorg/spongycastle/jce/provider/MultiCertStoreSpi;->a:Lorg/spongycastle/jce/MultiCertStoreParameters;

    invoke-virtual {v0}, Lorg/spongycastle/jce/MultiCertStoreParameters;->a()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 66
    if-eqz v2, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v1, v0

    .line 68
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 70
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/CertStore;

    .line 71
    invoke-virtual {v0, p1}, Ljava/security/cert/CertStore;->getCRLs(Ljava/security/cert/CRLSelector;)Ljava/util/Collection;

    move-result-object v0

    .line 73
    if-eqz v2, :cond_2

    .line 75
    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 66
    :cond_1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    move-object v1, v0

    goto :goto_0

    .line 77
    :cond_2
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    move-object v1, v0

    .line 83
    :cond_3
    return-object v1
.end method

.method public engineGetCertificates(Ljava/security/cert/CertSelector;)Ljava/util/Collection;
    .locals 5

    .prologue
    .line 39
    iget-object v0, p0, Lorg/spongycastle/jce/provider/MultiCertStoreSpi;->a:Lorg/spongycastle/jce/MultiCertStoreParameters;

    invoke-virtual {v0}, Lorg/spongycastle/jce/MultiCertStoreParameters;->b()Z

    move-result v2

    .line 40
    iget-object v0, p0, Lorg/spongycastle/jce/provider/MultiCertStoreSpi;->a:Lorg/spongycastle/jce/MultiCertStoreParameters;

    invoke-virtual {v0}, Lorg/spongycastle/jce/MultiCertStoreParameters;->a()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 41
    if-eqz v2, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v1, v0

    .line 43
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 45
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/CertStore;

    .line 46
    invoke-virtual {v0, p1}, Ljava/security/cert/CertStore;->getCertificates(Ljava/security/cert/CertSelector;)Ljava/util/Collection;

    move-result-object v0

    .line 48
    if-eqz v2, :cond_2

    .line 50
    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 41
    :cond_1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    move-object v1, v0

    goto :goto_0

    .line 52
    :cond_2
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    move-object v1, v0

    .line 58
    :cond_3
    return-object v1
.end method
