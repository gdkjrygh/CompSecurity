.class public Lorg/bouncycastle/x509/ExtendedPKIXBuilderParameters;
.super Lorg/bouncycastle/x509/ExtendedPKIXParameters;


# instance fields
.field private a:I

.field private b:Ljava/util/Set;


# direct methods
.method private constructor <init>(Ljava/util/Set;Lorg/bouncycastle/util/Selector;)V
    .locals 1

    invoke-direct {p0, p1}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;-><init>(Ljava/util/Set;)V

    const/4 v0, 0x5

    iput v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXBuilderParameters;->a:I

    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    iput-object v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXBuilderParameters;->b:Ljava/util/Set;

    invoke-virtual {p0, p2}, Lorg/bouncycastle/x509/ExtendedPKIXBuilderParameters;->a(Lorg/bouncycastle/util/Selector;)V

    return-void
.end method

.method public static b(Ljava/security/cert/PKIXParameters;)Lorg/bouncycastle/x509/ExtendedPKIXParameters;
    .locals 3

    :try_start_0
    new-instance v1, Lorg/bouncycastle/x509/ExtendedPKIXBuilderParameters;

    invoke-virtual {p0}, Ljava/security/cert/PKIXParameters;->getTrustAnchors()Ljava/util/Set;

    move-result-object v2

    invoke-virtual {p0}, Ljava/security/cert/PKIXParameters;->getTargetCertConstraints()Ljava/security/cert/CertSelector;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509CertSelector;

    invoke-static {v0}, Lorg/bouncycastle/x509/X509CertStoreSelector;->a(Ljava/security/cert/X509CertSelector;)Lorg/bouncycastle/x509/X509CertStoreSelector;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/x509/ExtendedPKIXBuilderParameters;-><init>(Ljava/util/Set;Lorg/bouncycastle/util/Selector;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v1, p0}, Lorg/bouncycastle/x509/ExtendedPKIXBuilderParameters;->a(Ljava/security/cert/PKIXParameters;)V

    return-object v1

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXBuilderParameters;->b:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method protected final a(Ljava/security/cert/PKIXParameters;)V
    .locals 2

    invoke-super {p0, p1}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->a(Ljava/security/cert/PKIXParameters;)V

    instance-of v0, p1, Lorg/bouncycastle/x509/ExtendedPKIXBuilderParameters;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lorg/bouncycastle/x509/ExtendedPKIXBuilderParameters;

    iget v1, v0, Lorg/bouncycastle/x509/ExtendedPKIXBuilderParameters;->a:I

    iput v1, p0, Lorg/bouncycastle/x509/ExtendedPKIXBuilderParameters;->a:I

    new-instance v1, Ljava/util/HashSet;

    iget-object v0, v0, Lorg/bouncycastle/x509/ExtendedPKIXBuilderParameters;->b:Ljava/util/Set;

    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v1, p0, Lorg/bouncycastle/x509/ExtendedPKIXBuilderParameters;->b:Ljava/util/Set;

    :cond_0
    instance-of v0, p1, Ljava/security/cert/PKIXBuilderParameters;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/security/cert/PKIXBuilderParameters;

    invoke-virtual {p1}, Ljava/security/cert/PKIXBuilderParameters;->getMaxPathLength()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXBuilderParameters;->a:I

    :cond_1
    return-void
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lorg/bouncycastle/x509/ExtendedPKIXBuilderParameters;->a:I

    return v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 3

    :try_start_0
    new-instance v0, Lorg/bouncycastle/x509/ExtendedPKIXBuilderParameters;

    invoke-virtual {p0}, Lorg/bouncycastle/x509/ExtendedPKIXBuilderParameters;->getTrustAnchors()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p0}, Lorg/bouncycastle/x509/ExtendedPKIXBuilderParameters;->h()Lorg/bouncycastle/util/Selector;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/x509/ExtendedPKIXBuilderParameters;-><init>(Ljava/util/Set;Lorg/bouncycastle/util/Selector;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0, p0}, Lorg/bouncycastle/x509/ExtendedPKIXBuilderParameters;->a(Ljava/security/cert/PKIXParameters;)V

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
