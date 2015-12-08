.class public Lorg/bouncycastle/x509/ExtendedPKIXParameters;
.super Ljava/security/cert/PKIXParameters;


# instance fields
.field private a:Ljava/util/List;

.field private b:Lorg/bouncycastle/util/Selector;

.field private c:Z

.field private d:Ljava/util/List;

.field private e:Ljava/util/Set;

.field private f:Ljava/util/Set;

.field private g:Ljava/util/Set;

.field private h:Ljava/util/Set;

.field private i:I

.field private j:Z


# direct methods
.method public constructor <init>(Ljava/util/Set;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1}, Ljava/security/cert/PKIXParameters;-><init>(Ljava/util/Set;)V

    iput v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->i:I

    iput-boolean v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->j:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->a:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->d:Ljava/util/List;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->e:Ljava/util/Set;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->f:Ljava/util/Set;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->g:Ljava/util/Set;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->h:Ljava/util/Set;

    return-void
.end method

.method public static c(Ljava/security/cert/PKIXParameters;)Lorg/bouncycastle/x509/ExtendedPKIXParameters;
    .locals 2

    :try_start_0
    new-instance v0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;

    invoke-virtual {p0}, Ljava/security/cert/PKIXParameters;->getTrustAnchors()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;-><init>(Ljava/util/Set;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0, p0}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->a(Ljava/security/cert/PKIXParameters;)V

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method protected a(Ljava/security/cert/PKIXParameters;)V
    .locals 2

    invoke-virtual {p1}, Ljava/security/cert/PKIXParameters;->getDate()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->setDate(Ljava/util/Date;)V

    invoke-virtual {p1}, Ljava/security/cert/PKIXParameters;->getCertPathCheckers()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->setCertPathCheckers(Ljava/util/List;)V

    invoke-virtual {p1}, Ljava/security/cert/PKIXParameters;->getCertStores()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->setCertStores(Ljava/util/List;)V

    invoke-virtual {p1}, Ljava/security/cert/PKIXParameters;->isAnyPolicyInhibited()Z

    move-result v0

    invoke-virtual {p0, v0}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->setAnyPolicyInhibited(Z)V

    invoke-virtual {p1}, Ljava/security/cert/PKIXParameters;->isExplicitPolicyRequired()Z

    move-result v0

    invoke-virtual {p0, v0}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->setExplicitPolicyRequired(Z)V

    invoke-virtual {p1}, Ljava/security/cert/PKIXParameters;->isPolicyMappingInhibited()Z

    move-result v0

    invoke-virtual {p0, v0}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->setPolicyMappingInhibited(Z)V

    invoke-virtual {p1}, Ljava/security/cert/PKIXParameters;->isRevocationEnabled()Z

    move-result v0

    invoke-virtual {p0, v0}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->setRevocationEnabled(Z)V

    invoke-virtual {p1}, Ljava/security/cert/PKIXParameters;->getInitialPolicies()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->setInitialPolicies(Ljava/util/Set;)V

    invoke-virtual {p1}, Ljava/security/cert/PKIXParameters;->getPolicyQualifiersRejected()Z

    move-result v0

    invoke-virtual {p0, v0}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->setPolicyQualifiersRejected(Z)V

    invoke-virtual {p1}, Ljava/security/cert/PKIXParameters;->getSigProvider()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->setSigProvider(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/security/cert/PKIXParameters;->getTargetCertConstraints()Ljava/security/cert/CertSelector;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->setTargetCertConstraints(Ljava/security/cert/CertSelector;)V

    :try_start_0
    invoke-virtual {p1}, Ljava/security/cert/PKIXParameters;->getTrustAnchors()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->setTrustAnchors(Ljava/util/Set;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    instance-of v0, p1, Lorg/bouncycastle/x509/ExtendedPKIXParameters;

    if-eqz v0, :cond_0

    check-cast p1, Lorg/bouncycastle/x509/ExtendedPKIXParameters;

    iget v0, p1, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->i:I

    iput v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->i:I

    iget-boolean v0, p1, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->j:Z

    iput-boolean v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->j:Z

    iget-boolean v0, p1, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->c:Z

    iput-boolean v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->c:Z

    iget-object v0, p1, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->b:Lorg/bouncycastle/util/Selector;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->b:Lorg/bouncycastle/util/Selector;

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->a:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->a:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->d:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->d:Ljava/util/List;

    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p1, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->e:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->e:Ljava/util/Set;

    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p1, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->g:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->g:Ljava/util/Set;

    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p1, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->f:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->f:Ljava/util/Set;

    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p1, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->h:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->h:Ljava/util/Set;

    :cond_0
    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v0, p1, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->b:Lorg/bouncycastle/util/Selector;

    invoke-interface {v0}, Lorg/bouncycastle/util/Selector;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/util/Selector;

    goto :goto_0
.end method

.method public final a(Lorg/bouncycastle/util/Selector;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lorg/bouncycastle/util/Selector;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/util/Selector;

    iput-object v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->b:Lorg/bouncycastle/util/Selector;

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->b:Lorg/bouncycastle/util/Selector;

    goto :goto_0
.end method

.method public final a(Lorg/bouncycastle/util/Store;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->j:Z

    return v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 2

    :try_start_0
    new-instance v0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;

    invoke-virtual {p0}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->getTrustAnchors()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;-><init>(Ljava/util/Set;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0, p0}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->a(Ljava/security/cert/PKIXParameters;)V

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->i:I

    return v0
.end method

.method public final e()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->d:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final f()Ljava/util/List;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->a:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->c:Z

    return v0
.end method

.method public final h()Lorg/bouncycastle/util/Selector;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->b:Lorg/bouncycastle/util/Selector;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->b:Lorg/bouncycastle/util/Selector;

    invoke-interface {v0}, Lorg/bouncycastle/util/Selector;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/util/Selector;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final i()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->e:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final j()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->f:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final k()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->g:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final l()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->h:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public setCertStores(Ljava/util/List;)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/CertStore;

    invoke-virtual {p0, v0}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->addCertStore(Ljava/security/cert/CertStore;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setTargetCertConstraints(Ljava/security/cert/CertSelector;)V
    .locals 1

    invoke-super {p0, p1}, Ljava/security/cert/PKIXParameters;->setTargetCertConstraints(Ljava/security/cert/CertSelector;)V

    if-eqz p1, :cond_0

    check-cast p1, Ljava/security/cert/X509CertSelector;

    invoke-static {p1}, Lorg/bouncycastle/x509/X509CertStoreSelector;->a(Ljava/security/cert/X509CertSelector;)Lorg/bouncycastle/x509/X509CertStoreSelector;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->b:Lorg/bouncycastle/util/Selector;

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->b:Lorg/bouncycastle/util/Selector;

    goto :goto_0
.end method
