.class public Lorg/bouncycastle/x509/util/LDAPStoreHelper;
.super Ljava/lang/Object;


# static fields
.field private static b:Ljava/lang/String;

.field private static c:Ljava/lang/String;

.field private static e:I

.field private static f:J


# instance fields
.field private a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

.field private d:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "com.sun.jndi.ldap.LdapCtxFactory"

    sput-object v0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->b:Ljava/lang/String;

    const-string v0, "ignore"

    sput-object v0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->c:Ljava/lang/String;

    const/16 v0, 0x20

    sput v0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->e:I

    const-wide/32 v0, 0xea60

    sput-wide v0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->f:J

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    sget v1, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->e:I

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->d:Ljava/util/Map;

    iput-object p1, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    return-void
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    const/16 v7, 0x2c

    const/4 v6, 0x1

    const/4 v5, 0x0

    const/4 v4, -0x1

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-ne v0, v4, :cond_1

    const-string v0, ""

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-ne v0, v4, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    :cond_2
    :goto_1
    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x5c

    if-ne v2, v3, :cond_3

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v1, v7, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    if-ne v0, v4, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    goto :goto_1

    :cond_3
    invoke-virtual {v1, v5, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x20

    if-ne v1, v2, :cond_4

    invoke-virtual {v0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    :cond_4
    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    :cond_5
    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v5, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private a(Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
    .locals 7

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p1}, Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;->b()Lorg/bouncycastle/x509/AttributeCertificateHolder;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {p1}, Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;->b()Lorg/bouncycastle/x509/AttributeCertificateHolder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/x509/AttributeCertificateHolder;->c()Ljava/math/BigInteger;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;->b()Lorg/bouncycastle/x509/AttributeCertificateHolder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/x509/AttributeCertificateHolder;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p1}, Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;->b()Lorg/bouncycastle/x509/AttributeCertificateHolder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a()[Ljava/security/Principal;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {p1}, Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;->b()Lorg/bouncycastle/x509/AttributeCertificateHolder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a()[Ljava/security/Principal;

    move-result-object v0

    :goto_0
    invoke-virtual {p1}, Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;->a()Lorg/bouncycastle/x509/X509AttributeCertificate;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {p1}, Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;->a()Lorg/bouncycastle/x509/X509AttributeCertificate;

    move-result-object v5

    invoke-interface {v5}, Lorg/bouncycastle/x509/X509AttributeCertificate;->c()Lorg/bouncycastle/x509/AttributeCertificateHolder;

    move-result-object v5

    invoke-virtual {v5}, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a()[Ljava/security/Principal;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {p1}, Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;->a()Lorg/bouncycastle/x509/X509AttributeCertificate;

    move-result-object v0

    invoke-interface {v0}, Lorg/bouncycastle/x509/X509AttributeCertificate;->c()Lorg/bouncycastle/x509/AttributeCertificateHolder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/x509/AttributeCertificateHolder;->a()[Ljava/security/Principal;

    move-result-object v0

    :cond_1
    invoke-virtual {p1}, Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;->a()Lorg/bouncycastle/x509/X509AttributeCertificate;

    move-result-object v5

    invoke-interface {v5}, Lorg/bouncycastle/x509/X509AttributeCertificate;->a()Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v5}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_2
    if-eqz v0, :cond_3

    aget-object v1, v0, v2

    instance-of v1, v1, Ljavax/security/auth/x500/X500Principal;

    if-eqz v1, :cond_5

    aget-object v0, v0, v2

    check-cast v0, Ljavax/security/auth/x500/X500Principal;

    const-string v1, "RFC1779"

    invoke-virtual {v0, v1}, Ljavax/security/auth/x500/X500Principal;->getName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-virtual {p1}, Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;->c()Ljava/math/BigInteger;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_4
    if-eqz v1, :cond_6

    move v0, v2

    :goto_2
    array-length v2, p4

    if-ge v0, v2, :cond_6

    aget-object v2, p4, v0

    invoke-static {v1, v2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "*"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v5, "*"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p3, v2, p2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_5
    aget-object v0, v0, v2

    invoke-interface {v0}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_6
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v0

    if-lez v0, :cond_7

    iget-object v0, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->H()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v5, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v5}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->H()Ljava/lang/String;

    move-result-object v5

    const-string v6, "\\s+"

    invoke-virtual {v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    invoke-direct {p0, v5, v0, p2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_3

    :cond_7
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v0

    if-nez v0, :cond_8

    if-nez v1, :cond_8

    const-string v0, "*"

    invoke-direct {p0, p3, v0, p2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_8
    return-object v3

    :cond_9
    move-object v0, v1

    goto/16 :goto_0
.end method

.method private a(Lorg/bouncycastle/x509/X509CRLStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
    .locals 8

    const/4 v1, 0x0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p1}, Lorg/bouncycastle/x509/X509CRLStoreSelector;->getIssuers()Ljava/util/Collection;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lorg/bouncycastle/x509/X509CRLStoreSelector;->getIssuers()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    :cond_0
    invoke-virtual {p1}, Lorg/bouncycastle/x509/X509CRLStoreSelector;->getCertificateChecking()Ljava/security/cert/X509Certificate;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lorg/bouncycastle/x509/X509CRLStoreSelector;->getCertificateChecking()Ljava/security/cert/X509Certificate;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {p1}, Lorg/bouncycastle/x509/X509CRLStoreSelector;->b()Lorg/bouncycastle/x509/X509AttributeCertificate;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lorg/bouncycastle/x509/X509CRLStoreSelector;->b()Lorg/bouncycastle/x509/X509AttributeCertificate;

    move-result-object v0

    invoke-interface {v0}, Lorg/bouncycastle/x509/X509AttributeCertificate;->d()Lorg/bouncycastle/x509/AttributeCertificateIssuer;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/x509/AttributeCertificateIssuer;->a()[Ljava/security/Principal;

    move-result-object v5

    move v0, v1

    :goto_0
    array-length v6, v5

    if-ge v0, v6, :cond_3

    aget-object v6, v5, v0

    instance-of v6, v6, Ljavax/security/auth/x500/X500Principal;

    if-eqz v6, :cond_2

    aget-object v6, v5, v0

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move-object v0, v2

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/security/auth/x500/X500Principal;

    const-string v2, "RFC1779"

    invoke-virtual {v0, v2}, Ljavax/security/auth/x500/X500Principal;->getName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move v0, v1

    :goto_2
    array-length v5, p4

    if-ge v0, v5, :cond_4

    aget-object v5, p4, v0

    invoke-static {v2, v5}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "*"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "*"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {p0, p3, v5, p2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_4
    move-object v0, v2

    goto :goto_1

    :cond_5
    if-nez v0, :cond_6

    const-string v0, "*"

    invoke-direct {p0, p3, v0, p2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_6
    return-object v3
.end method

.method private a(Lorg/bouncycastle/x509/X509CertPairStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
    .locals 6

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    invoke-virtual {p1}, Lorg/bouncycastle/x509/X509CertPairStoreSelector;->b()Lorg/bouncycastle/x509/X509CertStoreSelector;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lorg/bouncycastle/x509/X509CertPairStoreSelector;->b()Lorg/bouncycastle/x509/X509CertStoreSelector;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->c(Lorg/bouncycastle/x509/X509CertStoreSelector;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-virtual {p1}, Lorg/bouncycastle/x509/X509CertPairStoreSelector;->a()Lorg/bouncycastle/x509/X509CertificatePair;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Lorg/bouncycastle/x509/X509CertPairStoreSelector;->a()Lorg/bouncycastle/x509/X509CertificatePair;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/x509/X509CertificatePair;->a()Ljava/security/cert/X509Certificate;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Lorg/bouncycastle/x509/X509CertPairStoreSelector;->a()Lorg/bouncycastle/x509/X509CertificatePair;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/x509/X509CertificatePair;->a()Ljava/security/cert/X509Certificate;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    const-string v1, "RFC1779"

    invoke-virtual {v0, v1}, Ljavax/security/auth/x500/X500Principal;->getName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_1

    const/4 v0, 0x0

    :goto_1
    array-length v3, p4

    if-ge v0, v3, :cond_1

    aget-object v3, p4, v0

    invoke-static {v1, v3}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "*"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "*"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, p3, v3, p2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    if-nez v1, :cond_2

    const-string v0, "*"

    invoke-direct {p0, p3, v0, p2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2
    return-object v2

    :cond_3
    move-object v1, v0

    goto :goto_0
.end method

.method private a(Lorg/bouncycastle/x509/X509CertStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
    .locals 7

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    invoke-static {p1}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->c(Lorg/bouncycastle/x509/X509CertStoreSelector;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lorg/bouncycastle/x509/X509CertStoreSelector;->getSerialNumber()Ljava/math/BigInteger;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Lorg/bouncycastle/x509/X509CertStoreSelector;->getSerialNumber()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-virtual {p1}, Lorg/bouncycastle/x509/X509CertStoreSelector;->getCertificate()Ljava/security/cert/X509Certificate;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {p1}, Lorg/bouncycastle/x509/X509CertStoreSelector;->getCertificate()Ljava/security/cert/X509Certificate;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    const-string v1, "RFC1779"

    invoke-virtual {v0, v1}, Ljavax/security/auth/x500/X500Principal;->getName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lorg/bouncycastle/x509/X509CertStoreSelector;->getCertificate()Ljava/security/cert/X509Certificate;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSerialNumber()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v2, v1

    move-object v1, v0

    :goto_0
    if-eqz v2, :cond_1

    const/4 v0, 0x0

    :goto_1
    array-length v4, p4

    if-ge v0, v4, :cond_1

    aget-object v4, p4, v0

    invoke-static {v2, v4}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "*"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "*"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, p3, v4, p2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    if-eqz v1, :cond_2

    iget-object v0, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->H()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->H()Ljava/lang/String;

    move-result-object v0

    const-string v4, "\\s+"

    invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v1, p2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2
    if-nez v1, :cond_3

    if-nez v2, :cond_3

    const-string v0, "*"

    invoke-direct {p0, p3, v0, p2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_3
    return-object v3

    :cond_4
    move-object v2, v1

    move-object v1, v0

    goto :goto_0
.end method

.method private a([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
    .locals 10

    const/4 v3, 0x0

    const/4 v1, 0x0

    if-nez p1, :cond_0

    move-object v0, v3

    :goto_0
    const-string v2, ""

    move v4, v1

    :goto_1
    array-length v5, p3

    if-ge v4, v5, :cond_3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v5, "("

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    aget-object v5, p3, v4

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v5, "=*)"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    const-string v0, ""

    const-string v2, "**"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string p2, "*"

    :cond_1
    move-object v2, v0

    move v0, v1

    :goto_2
    array-length v4, p1

    if-ge v0, v4, :cond_2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "("

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    aget-object v4, p1, v0

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, ")"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "(|"

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "(|"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, ")"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "(&"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ")"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    if-nez v0, :cond_a

    :goto_3
    iget-object v0, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->d:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    if-eqz v0, :cond_4

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/sql/Date;

    invoke-virtual {v1}, Ljava/sql/Date;->getTime()J

    move-result-wide v6

    sget-wide v8, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->f:J

    sub-long/2addr v4, v8

    cmp-long v1, v6, v4

    if-ltz v1, :cond_4

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    :goto_4
    if-eqz v0, :cond_5

    :goto_5
    return-object v0

    :cond_4
    move-object v0, v3

    goto :goto_4

    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    new-instance v0, Ljava/util/Properties;

    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    const-string v4, "java.naming.factory.initial"

    sget-object v5, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->b:Ljava/lang/String;

    invoke-virtual {v0, v4, v5}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    const-string v4, "java.naming.batchsize"

    const-string v5, "0"

    invoke-virtual {v0, v4, v5}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    const-string v4, "java.naming.provider.url"

    iget-object v5, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v5}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->F()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    const-string v4, "java.naming.factory.url.pkgs"

    const-string v5, "com.sun.jndi.url"

    invoke-virtual {v0, v4, v5}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    const-string v4, "java.naming.referral"

    sget-object v5, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->c:Ljava/lang/String;

    invoke-virtual {v0, v4, v5}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    const-string v4, "java.naming.security.authentication"

    const-string v5, "none"

    invoke-virtual {v0, v4, v5}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v4, Ljavax/naming/directory/InitialDirContext;

    invoke-direct {v4, v0}, Ljavax/naming/directory/InitialDirContext;-><init>(Ljava/util/Hashtable;)V
    :try_end_0
    .catch Ljavax/naming/NamingException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v0, Ljavax/naming/directory/SearchControls;

    invoke-direct {v0}, Ljavax/naming/directory/SearchControls;-><init>()V

    const/4 v3, 0x2

    invoke-virtual {v0, v3}, Ljavax/naming/directory/SearchControls;->setSearchScope(I)V

    const-wide/16 v6, 0x0

    invoke-virtual {v0, v6, v7}, Ljavax/naming/directory/SearchControls;->setCountLimit(J)V

    invoke-virtual {v0, p3}, Ljavax/naming/directory/SearchControls;->setReturningAttributes([Ljava/lang/String;)V

    iget-object v3, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v3}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->m()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, v3, v2, v0}, Ljavax/naming/directory/DirContext;->search(Ljava/lang/String;Ljava/lang/String;Ljavax/naming/directory/SearchControls;)Ljavax/naming/NamingEnumeration;

    move-result-object v3

    :cond_6
    invoke-interface {v3}, Ljavax/naming/NamingEnumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v3}, Ljavax/naming/NamingEnumeration;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/naming/directory/SearchResult;

    invoke-virtual {v0}, Ljavax/naming/directory/SearchResult;->getAttributes()Ljavax/naming/directory/Attributes;

    move-result-object v0

    invoke-interface {v0}, Ljavax/naming/directory/Attributes;->getAll()Ljavax/naming/NamingEnumeration;

    move-result-object v0

    invoke-interface {v0}, Ljavax/naming/NamingEnumeration;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/naming/directory/Attribute;

    invoke-interface {v0}, Ljavax/naming/directory/Attribute;->getAll()Ljavax/naming/NamingEnumeration;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljavax/naming/NamingEnumeration;->hasMore()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v0}, Ljavax/naming/NamingEnumeration;->next()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljavax/naming/NamingException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_6

    :catch_0
    move-exception v0

    move-object v3, v4

    :goto_7
    if-eqz v3, :cond_7

    :try_start_2
    invoke-interface {v3}, Ljavax/naming/directory/DirContext;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :cond_7
    :goto_8
    move-object v0, v1

    goto/16 :goto_5

    :cond_8
    :try_start_3
    invoke-direct {p0, v2, v1}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Ljava/lang/String;Ljava/util/List;)V
    :try_end_3
    .catch Ljavax/naming/NamingException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-interface {v4}, Ljavax/naming/directory/DirContext;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_8

    :catch_1
    move-exception v0

    goto :goto_8

    :catchall_0
    move-exception v0

    :goto_9
    if-eqz v3, :cond_9

    :try_start_5
    invoke-interface {v3}, Ljavax/naming/directory/DirContext;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    :cond_9
    :goto_a
    throw v0

    :catch_2
    move-exception v0

    goto :goto_8

    :catch_3
    move-exception v1

    goto :goto_a

    :catchall_1
    move-exception v0

    move-object v3, v4

    goto :goto_9

    :catch_4
    move-exception v0

    goto :goto_7

    :cond_a
    move-object v2, v4

    goto/16 :goto_3
.end method

.method private static a(Ljava/util/List;Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;)Ljava/util/Set;
    .locals 5

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    new-instance v3, Lorg/bouncycastle/jce/provider/X509AttrCertParser;

    invoke-direct {v3}, Lorg/bouncycastle/jce/provider/X509AttrCertParser;-><init>()V

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    new-instance v4, Ljava/io/ByteArrayInputStream;

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-direct {v4, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v3, v4}, Lorg/bouncycastle/jce/provider/X509AttrCertParser;->a(Ljava/io/InputStream;)V

    invoke-virtual {v3}, Lorg/bouncycastle/jce/provider/X509AttrCertParser;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/x509/X509AttributeCertificate;

    invoke-virtual {p1, v0}, Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;->a(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/bouncycastle/x509/util/StreamParsingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method private static a(Ljava/util/List;Lorg/bouncycastle/x509/X509CRLStoreSelector;)Ljava/util/Set;
    .locals 5

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    new-instance v2, Lorg/bouncycastle/jce/provider/X509CRLParser;

    invoke-direct {v2}, Lorg/bouncycastle/jce/provider/X509CRLParser;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    new-instance v4, Ljava/io/ByteArrayInputStream;

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-direct {v4, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v2, v4}, Lorg/bouncycastle/jce/provider/X509CRLParser;->a(Ljava/io/InputStream;)V

    invoke-virtual {v2}, Lorg/bouncycastle/jce/provider/X509CRLParser;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509CRL;

    invoke-virtual {p1, v0}, Lorg/bouncycastle/x509/X509CRLStoreSelector;->a(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/bouncycastle/x509/util/StreamParsingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method private static a(Ljava/util/List;Lorg/bouncycastle/x509/X509CertPairStoreSelector;)Ljava/util/Set;
    .locals 7

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    const/4 v0, 0x0

    move v2, v0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    :try_start_0
    new-instance v1, Lorg/bouncycastle/jce/provider/X509CertPairParser;

    invoke-direct {v1}, Lorg/bouncycastle/jce/provider/X509CertPairParser;-><init>()V

    new-instance v3, Ljava/io/ByteArrayInputStream;

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-direct {v3, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v1, v3}, Lorg/bouncycastle/jce/provider/X509CertPairParser;->a(Ljava/io/InputStream;)V

    invoke-virtual {v1}, Lorg/bouncycastle/jce/provider/X509CertPairParser;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/x509/X509CertificatePair;
    :try_end_0
    .catch Lorg/bouncycastle/x509/util/StreamParsingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/cert/CertificateParsingException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-object v1, v0

    move v0, v2

    :goto_1
    :try_start_1
    invoke-virtual {p1, v1}, Lorg/bouncycastle/x509/X509CertPairStoreSelector;->a(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v4, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/security/cert/CertificateParsingException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    :cond_0
    :goto_2
    add-int/lit8 v0, v0, 0x1

    move v2, v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    add-int/lit8 v1, v2, 0x1

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    new-instance v3, Lorg/bouncycastle/x509/X509CertificatePair;

    new-instance v5, Lorg/bouncycastle/asn1/x509/CertificatePair;

    new-instance v6, Lorg/bouncycastle/asn1/ASN1InputStream;

    invoke-direct {v6, v0}, Lorg/bouncycastle/asn1/ASN1InputStream;-><init>([B)V

    invoke-virtual {v6}, Lorg/bouncycastle/asn1/ASN1InputStream;->a()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    move-result-object v0

    new-instance v6, Lorg/bouncycastle/asn1/ASN1InputStream;

    invoke-direct {v6, v1}, Lorg/bouncycastle/asn1/ASN1InputStream;-><init>([B)V

    invoke-virtual {v6}, Lorg/bouncycastle/asn1/ASN1InputStream;->a()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    move-result-object v1

    invoke-direct {v5, v0, v1}, Lorg/bouncycastle/asn1/x509/CertificatePair;-><init>(Lorg/bouncycastle/asn1/x509/X509CertificateStructure;Lorg/bouncycastle/asn1/x509/X509CertificateStructure;)V

    invoke-direct {v3, v5}, Lorg/bouncycastle/x509/X509CertificatePair;-><init>(Lorg/bouncycastle/asn1/x509/CertificatePair;)V
    :try_end_2
    .catch Ljava/security/cert/CertificateParsingException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    add-int/lit8 v0, v2, 0x1

    move-object v1, v3

    goto :goto_1

    :cond_1
    return-object v4

    :catch_1
    move-exception v0

    move v0, v2

    goto :goto_2

    :catch_2
    move-exception v1

    goto :goto_2

    :catch_3
    move-exception v0

    move v0, v2

    goto :goto_2

    :catch_4
    move-exception v1

    goto :goto_2
.end method

.method private static a(Ljava/util/List;Lorg/bouncycastle/x509/X509CertStoreSelector;)Ljava/util/Set;
    .locals 5

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    new-instance v3, Lorg/bouncycastle/jce/provider/X509CertParser;

    invoke-direct {v3}, Lorg/bouncycastle/jce/provider/X509CertParser;-><init>()V

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    new-instance v4, Ljava/io/ByteArrayInputStream;

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-direct {v4, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v3, v4}, Lorg/bouncycastle/jce/provider/X509CertParser;->a(Ljava/io/InputStream;)V

    invoke-virtual {v3}, Lorg/bouncycastle/jce/provider/X509CertParser;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    invoke-virtual {p1, v0}, Lorg/bouncycastle/x509/X509CertStoreSelector;->a(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method private declared-synchronized a(Ljava/lang/String;Ljava/util/List;)V
    .locals 11

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/sql/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-direct {v0, v2, v3}, Ljava/sql/Date;-><init>(J)V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v7, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->d:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->d:Ljava/util/Map;

    invoke-interface {v0, p1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v1, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->d:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    sget v2, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->e:I

    if-lt v1, v2, :cond_2

    iget-object v1, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->d:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    invoke-virtual {v0}, Ljava/sql/Date;->getTime()J

    move-result-wide v4

    const/4 v6, 0x0

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/sql/Date;

    invoke-virtual {v1}, Ljava/sql/Date;->getTime()J

    move-result-wide v2

    cmp-long v1, v2, v4

    if-gez v1, :cond_3

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-wide v9, v2

    move-object v2, v0

    move-wide v0, v9

    :goto_2
    move-wide v4, v0

    move-object v6, v2

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->d:Ljava/util/Map;

    invoke-interface {v0, v6}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object v0, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->d:Ljava/util/Map;

    invoke-interface {v0, p1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_3
    move-wide v0, v4

    move-object v2, v6

    goto :goto_2
.end method

.method private static c(Lorg/bouncycastle/x509/X509CertStoreSelector;)Ljava/lang/String;
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Lorg/bouncycastle/x509/X509CertStoreSelector;->getSubjectAsBytes()[B

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ljavax/security/auth/x500/X500Principal;

    invoke-direct {v1, v0}, Ljavax/security/auth/x500/X500Principal;-><init>([B)V

    const-string v0, "RFC1779"

    invoke-virtual {v1, v0}, Ljavax/security/auth/x500/X500Principal;->getName(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/util/StoreException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "exception processing name: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/util/StoreException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a(Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;)Ljava/util/Collection;
    .locals 5

    iget-object v0, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\s+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->v()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\\s+"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v2}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->b()Ljava/lang/String;

    move-result-object v2

    const-string v3, "\\s+"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p1, v0, v1, v2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-static {v3, p1}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    if-nez v4, :cond_0

    new-instance v4, Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;

    invoke-direct {v4}, Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;-><init>()V

    invoke-direct {p0, v4, v0, v1, v2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p1}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-object v3
.end method

.method public final a(Lorg/bouncycastle/x509/X509CRLStoreSelector;)Ljava/util/Collection;
    .locals 5

    iget-object v0, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->k()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\s+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->A()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\\s+"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v2}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->l()Ljava/lang/String;

    move-result-object v2

    const-string v3, "\\s+"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p1, v0, v1, v2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Lorg/bouncycastle/x509/X509CRLStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-static {v3, p1}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/bouncycastle/x509/X509CRLStoreSelector;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    if-nez v4, :cond_0

    new-instance v4, Lorg/bouncycastle/x509/X509CRLStoreSelector;

    invoke-direct {v4}, Lorg/bouncycastle/x509/X509CRLStoreSelector;-><init>()V

    invoke-direct {p0, v4, v0, v1, v2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Lorg/bouncycastle/x509/X509CRLStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p1}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/bouncycastle/x509/X509CRLStoreSelector;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-object v3
.end method

.method public final a(Lorg/bouncycastle/x509/X509CertPairStoreSelector;)Ljava/util/Collection;
    .locals 6

    iget-object v0, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->r()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\s+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->D()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\\s+"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v2}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->s()Ljava/lang/String;

    move-result-object v2

    const-string v3, "\\s+"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p1, v0, v1, v2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Lorg/bouncycastle/x509/X509CertPairStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-static {v3, p1}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/bouncycastle/x509/X509CertPairStoreSelector;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    if-nez v4, :cond_0

    new-instance v4, Lorg/bouncycastle/x509/X509CertStoreSelector;

    invoke-direct {v4}, Lorg/bouncycastle/x509/X509CertStoreSelector;-><init>()V

    new-instance v5, Lorg/bouncycastle/x509/X509CertPairStoreSelector;

    invoke-direct {v5}, Lorg/bouncycastle/x509/X509CertPairStoreSelector;-><init>()V

    invoke-virtual {v5, v4}, Lorg/bouncycastle/x509/X509CertPairStoreSelector;->a(Lorg/bouncycastle/x509/X509CertStoreSelector;)V

    invoke-virtual {v5, v4}, Lorg/bouncycastle/x509/X509CertPairStoreSelector;->b(Lorg/bouncycastle/x509/X509CertStoreSelector;)V

    invoke-direct {p0, v5, v0, v1, v2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Lorg/bouncycastle/x509/X509CertPairStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p1}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/bouncycastle/x509/X509CertPairStoreSelector;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-object v3
.end method

.method public final a(Lorg/bouncycastle/x509/X509CertStoreSelector;)Ljava/util/Collection;
    .locals 5

    iget-object v0, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->I()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\s+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->G()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\\s+"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v2}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->J()Ljava/lang/String;

    move-result-object v2

    const-string v3, "\\s+"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p1, v0, v1, v2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Lorg/bouncycastle/x509/X509CertStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-static {v3, p1}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/bouncycastle/x509/X509CertStoreSelector;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    if-nez v4, :cond_0

    new-instance v4, Lorg/bouncycastle/x509/X509CertStoreSelector;

    invoke-direct {v4}, Lorg/bouncycastle/x509/X509CertStoreSelector;-><init>()V

    invoke-direct {p0, v4, v0, v1, v2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Lorg/bouncycastle/x509/X509CertStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p1}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/bouncycastle/x509/X509CertStoreSelector;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-object v3
.end method

.method public final b(Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;)Ljava/util/Collection;
    .locals 5

    iget-object v0, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->i()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\s+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->z()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\\s+"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v2}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->j()Ljava/lang/String;

    move-result-object v2

    const-string v3, "\\s+"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p1, v0, v1, v2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-static {v3, p1}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    if-nez v4, :cond_0

    new-instance v4, Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;

    invoke-direct {v4}, Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;-><init>()V

    invoke-direct {p0, v4, v0, v1, v2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p1}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-object v3
.end method

.method public final b(Lorg/bouncycastle/x509/X509CRLStoreSelector;)Ljava/util/Collection;
    .locals 5

    iget-object v0, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\s+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->y()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\\s+"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v2}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->h()Ljava/lang/String;

    move-result-object v2

    const-string v3, "\\s+"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p1, v0, v1, v2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Lorg/bouncycastle/x509/X509CRLStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-static {v3, p1}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/bouncycastle/x509/X509CRLStoreSelector;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    if-nez v4, :cond_0

    new-instance v4, Lorg/bouncycastle/x509/X509CRLStoreSelector;

    invoke-direct {v4}, Lorg/bouncycastle/x509/X509CRLStoreSelector;-><init>()V

    invoke-direct {p0, v4, v0, v1, v2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Lorg/bouncycastle/x509/X509CRLStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p1}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/bouncycastle/x509/X509CRLStoreSelector;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-object v3
.end method

.method public final b(Lorg/bouncycastle/x509/X509CertStoreSelector;)Ljava/util/Collection;
    .locals 5

    iget-object v0, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->n()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\s+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->B()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\\s+"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v2}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->o()Ljava/lang/String;

    move-result-object v2

    const-string v3, "\\s+"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p1, v0, v1, v2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Lorg/bouncycastle/x509/X509CertStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-static {v3, p1}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/bouncycastle/x509/X509CertStoreSelector;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    if-nez v4, :cond_0

    new-instance v4, Lorg/bouncycastle/x509/X509CertStoreSelector;

    invoke-direct {v4}, Lorg/bouncycastle/x509/X509CertStoreSelector;-><init>()V

    invoke-direct {p0, v4, v0, v1, v2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Lorg/bouncycastle/x509/X509CertStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p1}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/bouncycastle/x509/X509CertStoreSelector;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-object v3
.end method

.method public final c(Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;)Ljava/util/Collection;
    .locals 5

    iget-object v0, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\s+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->x()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\\s+"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v2}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->f()Ljava/lang/String;

    move-result-object v2

    const-string v3, "\\s+"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p1, v0, v1, v2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-static {v3, p1}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    if-nez v4, :cond_0

    new-instance v4, Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;

    invoke-direct {v4}, Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;-><init>()V

    invoke-direct {p0, v4, v0, v1, v2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p1}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-object v3
.end method

.method public final c(Lorg/bouncycastle/x509/X509CRLStoreSelector;)Ljava/util/Collection;
    .locals 5

    iget-object v0, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\s+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->w()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\\s+"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v2}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->d()Ljava/lang/String;

    move-result-object v2

    const-string v3, "\\s+"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p1, v0, v1, v2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Lorg/bouncycastle/x509/X509CRLStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-static {v3, p1}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/bouncycastle/x509/X509CRLStoreSelector;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    if-nez v4, :cond_0

    new-instance v4, Lorg/bouncycastle/x509/X509CRLStoreSelector;

    invoke-direct {v4}, Lorg/bouncycastle/x509/X509CRLStoreSelector;-><init>()V

    invoke-direct {p0, v4, v0, v1, v2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Lorg/bouncycastle/x509/X509CRLStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p1}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/bouncycastle/x509/X509CRLStoreSelector;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-object v3
.end method

.method public final d(Lorg/bouncycastle/x509/X509CRLStoreSelector;)Ljava/util/Collection;
    .locals 5

    iget-object v0, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->t()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\s+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->E()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\\s+"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v2}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->u()Ljava/lang/String;

    move-result-object v2

    const-string v3, "\\s+"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p1, v0, v1, v2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Lorg/bouncycastle/x509/X509CRLStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-static {v3, p1}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/bouncycastle/x509/X509CRLStoreSelector;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    if-nez v4, :cond_0

    new-instance v4, Lorg/bouncycastle/x509/X509CRLStoreSelector;

    invoke-direct {v4}, Lorg/bouncycastle/x509/X509CRLStoreSelector;-><init>()V

    invoke-direct {p0, v4, v0, v1, v2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Lorg/bouncycastle/x509/X509CRLStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p1}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/bouncycastle/x509/X509CRLStoreSelector;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-object v3
.end method

.method public final e(Lorg/bouncycastle/x509/X509CRLStoreSelector;)Ljava/util/Collection;
    .locals 5

    iget-object v0, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->p()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\s+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->C()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\\s+"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a:Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v2}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;->q()Ljava/lang/String;

    move-result-object v2

    const-string v3, "\\s+"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p1, v0, v1, v2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Lorg/bouncycastle/x509/X509CRLStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-static {v3, p1}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/bouncycastle/x509/X509CRLStoreSelector;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    if-nez v4, :cond_0

    new-instance v4, Lorg/bouncycastle/x509/X509CRLStoreSelector;

    invoke-direct {v4}, Lorg/bouncycastle/x509/X509CRLStoreSelector;-><init>()V

    invoke-direct {p0, v4, v0, v1, v2}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Lorg/bouncycastle/x509/X509CRLStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p1}, Lorg/bouncycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/bouncycastle/x509/X509CRLStoreSelector;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-object v3
.end method
