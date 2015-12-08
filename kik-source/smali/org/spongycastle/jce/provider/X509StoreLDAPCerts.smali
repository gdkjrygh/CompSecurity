.class public Lorg/spongycastle/jce/provider/X509StoreLDAPCerts;
.super Lorg/spongycastle/x509/X509StoreSpi;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/x509/util/LDAPStoreHelper;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Lorg/spongycastle/x509/X509StoreSpi;-><init>()V

    .line 33
    return-void
.end method

.method private a(Lorg/spongycastle/x509/X509CertStoreSelector;)Ljava/util/Collection;
    .locals 6

    .prologue
    .line 102
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 103
    new-instance v0, Lorg/spongycastle/x509/X509CertPairStoreSelector;

    invoke-direct {v0}, Lorg/spongycastle/x509/X509CertPairStoreSelector;-><init>()V

    .line 105
    invoke-virtual {v0, p1}, Lorg/spongycastle/x509/X509CertPairStoreSelector;->a(Lorg/spongycastle/x509/X509CertStoreSelector;)V

    .line 106
    new-instance v2, Lorg/spongycastle/x509/X509CertStoreSelector;

    invoke-direct {v2}, Lorg/spongycastle/x509/X509CertStoreSelector;-><init>()V

    invoke-virtual {v0, v2}, Lorg/spongycastle/x509/X509CertPairStoreSelector;->b(Lorg/spongycastle/x509/X509CertStoreSelector;)V

    .line 108
    new-instance v2, Ljava/util/HashSet;

    iget-object v3, p0, Lorg/spongycastle/jce/provider/X509StoreLDAPCerts;->a:Lorg/spongycastle/x509/util/LDAPStoreHelper;

    invoke-virtual {v3, v0}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Lorg/spongycastle/x509/X509CertPairStoreSelector;)Ljava/util/Collection;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 109
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 110
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 111
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 112
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 114
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/x509/X509CertificatePair;

    .line 115
    invoke-virtual {v0}, Lorg/spongycastle/x509/X509CertificatePair;->a()Ljava/security/cert/X509Certificate;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 117
    invoke-virtual {v0}, Lorg/spongycastle/x509/X509CertificatePair;->a()Ljava/security/cert/X509Certificate;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 119
    :cond_1
    invoke-virtual {v0}, Lorg/spongycastle/x509/X509CertificatePair;->b()Ljava/security/cert/X509Certificate;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 121
    invoke-virtual {v0}, Lorg/spongycastle/x509/X509CertificatePair;->b()Ljava/security/cert/X509Certificate;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 124
    :cond_2
    invoke-interface {v1, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 125
    invoke-interface {v1, v4}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 126
    return-object v1
.end method


# virtual methods
.method public final a(Lorg/spongycastle/util/Selector;)Ljava/util/Collection;
    .locals 3

    .prologue
    .line 72
    instance-of v0, p1, Lorg/spongycastle/x509/X509CertStoreSelector;

    if-nez v0, :cond_0

    .line 74
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 96
    :goto_0
    return-object v0

    .line 76
    :cond_0
    check-cast p1, Lorg/spongycastle/x509/X509CertStoreSelector;

    .line 77
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 79
    invoke-virtual {p1}, Lorg/spongycastle/x509/X509CertStoreSelector;->getBasicConstraints()I

    move-result v1

    if-lez v1, :cond_1

    .line 81
    iget-object v1, p0, Lorg/spongycastle/jce/provider/X509StoreLDAPCerts;->a:Lorg/spongycastle/x509/util/LDAPStoreHelper;

    invoke-virtual {v1, p1}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->b(Lorg/spongycastle/x509/X509CertStoreSelector;)Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 82
    invoke-direct {p0, p1}, Lorg/spongycastle/jce/provider/X509StoreLDAPCerts;->a(Lorg/spongycastle/x509/X509CertStoreSelector;)Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 85
    :cond_1
    invoke-virtual {p1}, Lorg/spongycastle/x509/X509CertStoreSelector;->getBasicConstraints()I

    move-result v1

    const/4 v2, -0x2

    if-ne v1, v2, :cond_2

    .line 87
    iget-object v1, p0, Lorg/spongycastle/jce/provider/X509StoreLDAPCerts;->a:Lorg/spongycastle/x509/util/LDAPStoreHelper;

    invoke-virtual {v1, p1}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Lorg/spongycastle/x509/X509CertStoreSelector;)Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 92
    :cond_2
    iget-object v1, p0, Lorg/spongycastle/jce/provider/X509StoreLDAPCerts;->a:Lorg/spongycastle/x509/util/LDAPStoreHelper;

    invoke-virtual {v1, p1}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Lorg/spongycastle/x509/X509CertStoreSelector;)Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 93
    iget-object v1, p0, Lorg/spongycastle/jce/provider/X509StoreLDAPCerts;->a:Lorg/spongycastle/x509/util/LDAPStoreHelper;

    invoke-virtual {v1, p1}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->b(Lorg/spongycastle/x509/X509CertStoreSelector;)Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 94
    invoke-direct {p0, p1}, Lorg/spongycastle/jce/provider/X509StoreLDAPCerts;->a(Lorg/spongycastle/x509/X509CertStoreSelector;)Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_0
.end method

.method public final a(Lorg/spongycastle/x509/X509StoreParameters;)V
    .locals 3

    .prologue
    .line 44
    instance-of v0, p1, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    if-nez v0, :cond_0

    .line 46
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Initialization parameters must be an instance of "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v2, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 50
    :cond_0
    new-instance v0, Lorg/spongycastle/x509/util/LDAPStoreHelper;

    check-cast p1, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-direct {v0, p1}, Lorg/spongycastle/x509/util/LDAPStoreHelper;-><init>(Lorg/spongycastle/jce/X509LDAPCertStoreParameters;)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/X509StoreLDAPCerts;->a:Lorg/spongycastle/x509/util/LDAPStoreHelper;

    .line 51
    return-void
.end method
