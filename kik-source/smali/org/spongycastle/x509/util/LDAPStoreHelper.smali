.class public Lorg/spongycastle/x509/util/LDAPStoreHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Ljava/lang/String;

.field private static c:Ljava/lang/String;

.field private static e:I

.field private static f:J


# instance fields
.field private a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

.field private d:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 79
    const-string v0, "com.sun.jndi.ldap.LdapCtxFactory"

    sput-object v0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->b:Ljava/lang/String;

    .line 84
    const-string v0, "ignore"

    sput-object v0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->c:Ljava/lang/String;

    .line 1031
    const/16 v0, 0x20

    sput v0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->e:I

    .line 1033
    const-wide/32 v0, 0xea60

    sput-wide v0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->f:J

    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/jce/X509LDAPCertStoreParameters;)V
    .locals 2

    .prologue
    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1029
    new-instance v0, Ljava/util/HashMap;

    sget v1, Lorg/spongycastle/x509/util/LDAPStoreHelper;->e:I

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->d:Ljava/util/Map;

    .line 73
    iput-object p1, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    .line 74
    return-void
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .prologue
    const/16 v7, 0x2c

    const/4 v6, 0x1

    const/4 v5, 0x0

    const/4 v4, -0x1

    .line 114
    .line 115
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

    .line 117
    if-ne v0, v4, :cond_1

    .line 119
    const-string v0, ""

    .line 150
    :cond_0
    :goto_0
    return-object v0

    .line 121
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 122
    invoke-virtual {v1, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    .line 123
    if-ne v0, v4, :cond_2

    .line 125
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    .line 127
    :cond_2
    :goto_1
    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x5c

    if-ne v2, v3, :cond_3

    .line 129
    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v1, v7, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    .line 130
    if-ne v0, v4, :cond_2

    .line 132
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    goto :goto_1

    .line 135
    :cond_3
    invoke-virtual {v1, v5, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 136
    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    .line 137
    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 138
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x20

    if-ne v1, v2, :cond_4

    .line 140
    invoke-virtual {v0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 142
    :cond_4
    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 144
    invoke-virtual {v0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 146
    :cond_5
    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 148
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v5, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private a(Lorg/spongycastle/x509/X509AttributeCertStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
    .locals 7

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 325
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 332
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 336
    invoke-virtual {p1}, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->b()Lorg/spongycastle/x509/AttributeCertificateHolder;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 339
    invoke-virtual {p1}, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->b()Lorg/spongycastle/x509/AttributeCertificateHolder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/x509/AttributeCertificateHolder;->c()Ljava/math/BigInteger;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 341
    invoke-virtual {p1}, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->b()Lorg/spongycastle/x509/AttributeCertificateHolder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/x509/AttributeCertificateHolder;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 345
    :cond_0
    invoke-virtual {p1}, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->b()Lorg/spongycastle/x509/AttributeCertificateHolder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/x509/AttributeCertificateHolder;->a()[Ljava/security/Principal;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 347
    invoke-virtual {p1}, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->b()Lorg/spongycastle/x509/AttributeCertificateHolder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/x509/AttributeCertificateHolder;->a()[Ljava/security/Principal;

    move-result-object v0

    .line 351
    :goto_0
    invoke-virtual {p1}, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->a()Lorg/spongycastle/x509/X509AttributeCertificate;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 353
    invoke-virtual {p1}, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->a()Lorg/spongycastle/x509/X509AttributeCertificate;

    move-result-object v5

    invoke-interface {v5}, Lorg/spongycastle/x509/X509AttributeCertificate;->c()Lorg/spongycastle/x509/AttributeCertificateHolder;

    move-result-object v5

    invoke-virtual {v5}, Lorg/spongycastle/x509/AttributeCertificateHolder;->a()[Ljava/security/Principal;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 355
    invoke-virtual {p1}, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->a()Lorg/spongycastle/x509/X509AttributeCertificate;

    move-result-object v0

    invoke-interface {v0}, Lorg/spongycastle/x509/X509AttributeCertificate;->c()Lorg/spongycastle/x509/AttributeCertificateHolder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/x509/AttributeCertificateHolder;->a()[Ljava/security/Principal;

    move-result-object v0

    .line 359
    :cond_1
    invoke-virtual {p1}, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->a()Lorg/spongycastle/x509/X509AttributeCertificate;

    move-result-object v5

    invoke-interface {v5}, Lorg/spongycastle/x509/X509AttributeCertificate;->a()Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v5}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 362
    :cond_2
    if-eqz v0, :cond_3

    .line 365
    aget-object v1, v0, v2

    instance-of v1, v1, Ljavax/security/auth/x500/X500Principal;

    if-eqz v1, :cond_5

    .line 367
    aget-object v0, v0, v2

    check-cast v0, Ljavax/security/auth/x500/X500Principal;

    const-string v1, "RFC1779"

    invoke-virtual {v0, v1}, Ljavax/security/auth/x500/X500Principal;->getName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 376
    :cond_3
    :goto_1
    invoke-virtual {p1}, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->c()Ljava/math/BigInteger;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 378
    invoke-virtual {p1}, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 381
    :cond_4
    if-eqz v1, :cond_6

    move v0, v2

    .line 384
    :goto_2
    array-length v2, p4

    if-ge v0, v2, :cond_6

    .line 386
    aget-object v2, p4, v0

    invoke-static {v1, v2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 387
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

    invoke-direct {p0, p3, v2, p2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 384
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 373
    :cond_5
    aget-object v0, v0, v2

    invoke-interface {v0}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 392
    :cond_6
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v0

    if-lez v0, :cond_7

    iget-object v0, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v0}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->H()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 395
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 396
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 398
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 399
    iget-object v5, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v5}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->H()Ljava/lang/String;

    move-result-object v5

    const-string v6, "\\s+"

    invoke-virtual {v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    invoke-direct {p0, v5, v0, p2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_3

    .line 402
    :cond_7
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v0

    if-nez v0, :cond_8

    if-nez v1, :cond_8

    .line 404
    const-string v0, "*"

    invoke-direct {p0, p3, v0, p2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 407
    :cond_8
    return-object v3

    :cond_9
    move-object v0, v1

    goto/16 :goto_0
.end method

.method private a(Lorg/spongycastle/x509/X509CRLStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 427
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 429
    const/4 v2, 0x0

    .line 430
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 431
    invoke-virtual {p1}, Lorg/spongycastle/x509/X509CRLStoreSelector;->getIssuers()Ljava/util/Collection;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 433
    invoke-virtual {p1}, Lorg/spongycastle/x509/X509CRLStoreSelector;->getIssuers()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 435
    :cond_0
    invoke-virtual {p1}, Lorg/spongycastle/x509/X509CRLStoreSelector;->getCertificateChecking()Ljava/security/cert/X509Certificate;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 437
    invoke-virtual {p1}, Lorg/spongycastle/x509/X509CRLStoreSelector;->getCertificateChecking()Ljava/security/cert/X509Certificate;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 439
    :cond_1
    invoke-virtual {p1}, Lorg/spongycastle/x509/X509CRLStoreSelector;->b()Lorg/spongycastle/x509/X509AttributeCertificate;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 441
    invoke-virtual {p1}, Lorg/spongycastle/x509/X509CRLStoreSelector;->b()Lorg/spongycastle/x509/X509AttributeCertificate;

    move-result-object v0

    invoke-interface {v0}, Lorg/spongycastle/x509/X509AttributeCertificate;->d()Lorg/spongycastle/x509/AttributeCertificateIssuer;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/x509/AttributeCertificateIssuer;->a()[Ljava/security/Principal;

    move-result-object v5

    move v0, v1

    .line 442
    :goto_0
    array-length v6, v5

    if-ge v0, v6, :cond_3

    .line 444
    aget-object v6, v5, v0

    instance-of v6, v6, Ljavax/security/auth/x500/X500Principal;

    if-eqz v6, :cond_2

    .line 446
    aget-object v6, v5, v0

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 442
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 450
    :cond_3
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move-object v0, v2

    .line 451
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 453
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/security/auth/x500/X500Principal;

    const-string v2, "RFC1779"

    invoke-virtual {v0, v2}, Ljavax/security/auth/x500/X500Principal;->getName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move v0, v1

    .line 454
    :goto_2
    array-length v5, p4

    if-ge v0, v5, :cond_4

    .line 458
    aget-object v5, p4, v0

    invoke-static {v2, v5}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 459
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

    invoke-direct {p0, p3, v5, p2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 456
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_4
    move-object v0, v2

    .line 463
    goto :goto_1

    .line 464
    :cond_5
    if-nez v0, :cond_6

    .line 466
    const-string v0, "*"

    invoke-direct {p0, p3, v0, p2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 469
    :cond_6
    return-object v3
.end method

.method private a(Lorg/spongycastle/x509/X509CertPairStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
    .locals 6

    .prologue
    .line 269
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 272
    const/4 v0, 0x0

    .line 274
    invoke-virtual {p1}, Lorg/spongycastle/x509/X509CertPairStoreSelector;->b()Lorg/spongycastle/x509/X509CertStoreSelector;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 276
    invoke-virtual {p1}, Lorg/spongycastle/x509/X509CertPairStoreSelector;->b()Lorg/spongycastle/x509/X509CertStoreSelector;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->c(Lorg/spongycastle/x509/X509CertStoreSelector;)Ljava/lang/String;

    move-result-object v0

    .line 278
    :cond_0
    invoke-virtual {p1}, Lorg/spongycastle/x509/X509CertPairStoreSelector;->a()Lorg/spongycastle/x509/X509CertificatePair;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 280
    invoke-virtual {p1}, Lorg/spongycastle/x509/X509CertPairStoreSelector;->a()Lorg/spongycastle/x509/X509CertificatePair;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/x509/X509CertificatePair;->a()Ljava/security/cert/X509Certificate;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 282
    invoke-virtual {p1}, Lorg/spongycastle/x509/X509CertPairStoreSelector;->a()Lorg/spongycastle/x509/X509CertificatePair;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/x509/X509CertificatePair;->a()Ljava/security/cert/X509Certificate;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    const-string v1, "RFC1779"

    invoke-virtual {v0, v1}, Ljavax/security/auth/x500/X500Principal;->getName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    .line 286
    :goto_0
    if-eqz v1, :cond_1

    .line 289
    const/4 v0, 0x0

    :goto_1
    array-length v3, p4

    if-ge v0, v3, :cond_1

    .line 291
    aget-object v3, p4, v0

    invoke-static {v1, v3}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 292
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

    invoke-direct {p0, p3, v3, p2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 289
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 297
    :cond_1
    if-nez v1, :cond_2

    .line 299
    const-string v0, "*"

    invoke-direct {p0, p3, v0, p2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 302
    :cond_2
    return-object v2

    :cond_3
    move-object v1, v0

    goto :goto_0
.end method

.method private a(Lorg/spongycastle/x509/X509CertStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
    .locals 7

    .prologue
    .line 203
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 205
    const/4 v0, 0x0

    .line 208
    invoke-static {p1}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->c(Lorg/spongycastle/x509/X509CertStoreSelector;)Ljava/lang/String;

    move-result-object v1

    .line 210
    invoke-virtual {p1}, Lorg/spongycastle/x509/X509CertStoreSelector;->getSerialNumber()Ljava/math/BigInteger;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 212
    invoke-virtual {p1}, Lorg/spongycastle/x509/X509CertStoreSelector;->getSerialNumber()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object v0

    .line 214
    :cond_0
    invoke-virtual {p1}, Lorg/spongycastle/x509/X509CertStoreSelector;->getCertificate()Ljava/security/cert/X509Certificate;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 216
    invoke-virtual {p1}, Lorg/spongycastle/x509/X509CertStoreSelector;->getCertificate()Ljava/security/cert/X509Certificate;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    const-string v1, "RFC1779"

    invoke-virtual {v0, v1}, Ljavax/security/auth/x500/X500Principal;->getName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 217
    invoke-virtual {p1}, Lorg/spongycastle/x509/X509CertStoreSelector;->getCertificate()Ljava/security/cert/X509Certificate;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSerialNumber()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v2, v1

    move-object v1, v0

    .line 220
    :goto_0
    if-eqz v2, :cond_1

    .line 223
    const/4 v0, 0x0

    :goto_1
    array-length v4, p4

    if-ge v0, v4, :cond_1

    .line 225
    aget-object v4, p4, v0

    invoke-static {v2, v4}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 226
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

    invoke-direct {p0, p3, v4, p2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 223
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 231
    :cond_1
    if-eqz v1, :cond_2

    iget-object v0, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v0}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->H()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 234
    iget-object v0, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v0}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->H()Ljava/lang/String;

    move-result-object v0

    const-string v4, "\\s+"

    invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v1, p2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 238
    :cond_2
    if-nez v1, :cond_3

    if-nez v2, :cond_3

    .line 240
    const-string v0, "*"

    invoke-direct {p0, p3, v0, p2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 243
    :cond_3
    return-object v3

    :cond_4
    move-object v2, v1

    move-object v1, v0

    goto :goto_0
.end method

.method private a([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
    .locals 10

    .prologue
    const/4 v3, 0x0

    const/4 v1, 0x0

    .line 488
    if-nez p1, :cond_0

    move-object v0, v3

    .line 506
    :goto_0
    const-string v2, ""

    move v4, v1

    .line 507
    :goto_1
    array-length v5, p3

    if-ge v4, v5, :cond_3

    .line 509
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

    .line 507
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 495
    :cond_0
    const-string v0, ""

    .line 496
    const-string v2, "**"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 498
    const-string p2, "*"

    :cond_1
    move-object v2, v0

    move v0, v1

    .line 500
    :goto_2
    array-length v4, p1

    if-ge v0, v4, :cond_2

    .line 502
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

    .line 500
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 504
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

    .line 511
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

    .line 513
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

    .line 514
    if-nez v0, :cond_a

    .line 519
    :goto_3
    iget-object v0, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->d:Ljava/util/Map;

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

    sget-wide v8, Lorg/spongycastle/x509/util/LDAPStoreHelper;->f:J

    sub-long/2addr v4, v8

    cmp-long v1, v6, v4

    if-ltz v1, :cond_4

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 520
    :goto_4
    if-eqz v0, :cond_5

    .line 568
    :goto_5
    return-object v0

    :cond_4
    move-object v0, v3

    .line 519
    goto :goto_4

    .line 525
    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 529
    :try_start_0
    new-instance v0, Ljava/util/Properties;

    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    const-string v4, "java.naming.factory.initial"

    sget-object v5, Lorg/spongycastle/x509/util/LDAPStoreHelper;->b:Ljava/lang/String;

    invoke-virtual {v0, v4, v5}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    const-string v4, "java.naming.batchsize"

    const-string v5, "0"

    invoke-virtual {v0, v4, v5}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    const-string v4, "java.naming.provider.url"

    iget-object v5, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v5}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->F()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    const-string v4, "java.naming.factory.url.pkgs"

    const-string v5, "com.sun.jndi.url"

    invoke-virtual {v0, v4, v5}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    const-string v4, "java.naming.referral"

    sget-object v5, Lorg/spongycastle/x509/util/LDAPStoreHelper;->c:Ljava/lang/String;

    invoke-virtual {v0, v4, v5}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    const-string v4, "java.naming.security.authentication"

    const-string v5, "none"

    invoke-virtual {v0, v4, v5}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v4, Ljavax/naming/directory/InitialDirContext;

    invoke-direct {v4, v0}, Ljavax/naming/directory/InitialDirContext;-><init>(Ljava/util/Hashtable;)V
    :try_end_0
    .catch Ljavax/naming/NamingException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 531
    :try_start_1
    new-instance v0, Ljavax/naming/directory/SearchControls;

    invoke-direct {v0}, Ljavax/naming/directory/SearchControls;-><init>()V

    .line 532
    const/4 v3, 0x2

    invoke-virtual {v0, v3}, Ljavax/naming/directory/SearchControls;->setSearchScope(I)V

    .line 533
    const-wide/16 v6, 0x0

    invoke-virtual {v0, v6, v7}, Ljavax/naming/directory/SearchControls;->setCountLimit(J)V

    .line 534
    invoke-virtual {v0, p3}, Ljavax/naming/directory/SearchControls;->setReturningAttributes([Ljava/lang/String;)V

    .line 535
    iget-object v3, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v3}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->m()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, v3, v2, v0}, Ljavax/naming/directory/DirContext;->search(Ljava/lang/String;Ljava/lang/String;Ljavax/naming/directory/SearchControls;)Ljavax/naming/NamingEnumeration;

    move-result-object v3

    .line 537
    :cond_6
    invoke-interface {v3}, Ljavax/naming/NamingEnumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 539
    invoke-interface {v3}, Ljavax/naming/NamingEnumeration;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/naming/directory/SearchResult;

    .line 540
    invoke-virtual {v0}, Ljavax/naming/directory/SearchResult;->getAttributes()Ljavax/naming/directory/Attributes;

    move-result-object v0

    invoke-interface {v0}, Ljavax/naming/directory/Attributes;->getAll()Ljavax/naming/NamingEnumeration;

    move-result-object v0

    invoke-interface {v0}, Ljavax/naming/NamingEnumeration;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/naming/directory/Attribute;

    invoke-interface {v0}, Ljavax/naming/directory/Attribute;->getAll()Ljavax/naming/NamingEnumeration;

    move-result-object v0

    .line 542
    :goto_6
    invoke-interface {v0}, Ljavax/naming/NamingEnumeration;->hasMore()Z

    move-result v5

    if-eqz v5, :cond_6

    .line 544
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

    .line 559
    :goto_7
    if-eqz v3, :cond_7

    .line 561
    :try_start_2
    invoke-interface {v3}, Ljavax/naming/directory/DirContext;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :cond_7
    :goto_8
    move-object v0, v1

    .line 568
    goto/16 :goto_5

    .line 547
    :cond_8
    :try_start_3
    invoke-direct {p0, v2, v1}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Ljava/lang/String;Ljava/util/List;)V
    :try_end_3
    .catch Ljavax/naming/NamingException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 559
    :try_start_4
    invoke-interface {v4}, Ljavax/naming/directory/DirContext;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_8

    .line 567
    :catch_1
    move-exception v0

    goto :goto_8

    .line 557
    :catchall_0
    move-exception v0

    .line 559
    :goto_9
    if-eqz v3, :cond_9

    .line 561
    :try_start_5
    invoke-interface {v3}, Ljavax/naming/directory/DirContext;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 566
    :cond_9
    :goto_a
    throw v0

    .line 567
    :catch_2
    move-exception v0

    goto :goto_8

    :catch_3
    move-exception v1

    goto :goto_a

    .line 557
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

.method private static a(Ljava/util/List;Lorg/spongycastle/x509/X509AttributeCertStoreSelector;)Ljava/util/Set;
    .locals 5

    .prologue
    .line 655
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 657
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 658
    new-instance v3, Lorg/spongycastle/jce/provider/X509AttrCertParser;

    invoke-direct {v3}, Lorg/spongycastle/jce/provider/X509AttrCertParser;-><init>()V

    .line 659
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 663
    :try_start_0
    new-instance v4, Ljava/io/ByteArrayInputStream;

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-direct {v4, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v3, v4}, Lorg/spongycastle/jce/provider/X509AttrCertParser;->a(Ljava/io/InputStream;)V

    .line 665
    invoke-virtual {v3}, Lorg/spongycastle/jce/provider/X509AttrCertParser;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/x509/X509AttributeCertificate;

    .line 667
    invoke-virtual {p1, v0}, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->a(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 669
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/spongycastle/x509/util/StreamParsingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 675
    :catch_0
    move-exception v0

    goto :goto_0

    .line 678
    :cond_1
    return-object v1
.end method

.method private static a(Ljava/util/List;Lorg/spongycastle/x509/X509CRLStoreSelector;)Ljava/util/Set;
    .locals 5

    .prologue
    .line 574
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 576
    new-instance v2, Lorg/spongycastle/jce/provider/X509CRLParser;

    invoke-direct {v2}, Lorg/spongycastle/jce/provider/X509CRLParser;-><init>()V

    .line 577
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 578
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 582
    :try_start_0
    new-instance v4, Ljava/io/ByteArrayInputStream;

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-direct {v4, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v2, v4}, Lorg/spongycastle/jce/provider/X509CRLParser;->a(Ljava/io/InputStream;)V

    .line 584
    invoke-virtual {v2}, Lorg/spongycastle/jce/provider/X509CRLParser;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509CRL;

    .line 585
    invoke-virtual {p1, v0}, Lorg/spongycastle/x509/X509CRLStoreSelector;->a(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 587
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/spongycastle/x509/util/StreamParsingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 593
    :catch_0
    move-exception v0

    goto :goto_0

    .line 596
    :cond_1
    return-object v1
.end method

.method private static a(Ljava/util/List;Lorg/spongycastle/x509/X509CertPairStoreSelector;)Ljava/util/Set;
    .locals 7

    .prologue
    .line 602
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 604
    const/4 v0, 0x0

    move v2, v0

    .line 605
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 613
    :try_start_0
    new-instance v1, Lorg/spongycastle/jce/provider/X509CertPairParser;

    invoke-direct {v1}, Lorg/spongycastle/jce/provider/X509CertPairParser;-><init>()V

    .line 614
    new-instance v3, Ljava/io/ByteArrayInputStream;

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-direct {v3, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v1, v3}, Lorg/spongycastle/jce/provider/X509CertPairParser;->a(Ljava/io/InputStream;)V

    .line 616
    invoke-virtual {v1}, Lorg/spongycastle/jce/provider/X509CertPairParser;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/x509/X509CertificatePair;
    :try_end_0
    .catch Lorg/spongycastle/x509/util/StreamParsingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/cert/CertificateParsingException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-object v1, v0

    move v0, v2

    .line 633
    :goto_1
    :try_start_1
    invoke-virtual {p1, v1}, Lorg/spongycastle/x509/X509CertPairStoreSelector;->a(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 635
    invoke-interface {v4, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/security/cert/CertificateParsingException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    .line 646
    :cond_0
    :goto_2
    add-int/lit8 v0, v0, 0x1

    move v2, v0

    .line 647
    goto :goto_0

    .line 622
    :catch_0
    move-exception v0

    :try_start_2
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 623
    add-int/lit8 v1, v2, 0x1

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    .line 624
    new-instance v3, Lorg/spongycastle/x509/X509CertificatePair;

    new-instance v5, Lorg/spongycastle/asn1/x509/CertificatePair;

    new-instance v6, Lorg/spongycastle/asn1/ASN1InputStream;

    invoke-direct {v6, v0}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>([B)V

    invoke-virtual {v6}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    move-result-object v0

    new-instance v6, Lorg/spongycastle/asn1/ASN1InputStream;

    invoke-direct {v6, v1}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>([B)V

    invoke-virtual {v6}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    move-result-object v1

    invoke-direct {v5, v0, v1}, Lorg/spongycastle/asn1/x509/CertificatePair;-><init>(Lorg/spongycastle/asn1/x509/X509CertificateStructure;Lorg/spongycastle/asn1/x509/X509CertificateStructure;)V

    invoke-direct {v3, v5}, Lorg/spongycastle/x509/X509CertificatePair;-><init>(Lorg/spongycastle/asn1/x509/CertificatePair;)V
    :try_end_2
    .catch Ljava/security/cert/CertificateParsingException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 631
    add-int/lit8 v0, v2, 0x1

    move-object v1, v3

    goto :goto_1

    .line 649
    :cond_1
    return-object v4

    :catch_1
    move-exception v0

    move v0, v2

    goto :goto_2

    :catch_2
    move-exception v1

    goto :goto_2

    .line 645
    :catch_3
    move-exception v0

    move v0, v2

    goto :goto_2

    :catch_4
    move-exception v1

    goto :goto_2
.end method

.method private static a(Ljava/util/List;Lorg/spongycastle/x509/X509CertStoreSelector;)Ljava/util/Set;
    .locals 5

    .prologue
    .line 156
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 158
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 159
    new-instance v3, Lorg/spongycastle/jce/provider/X509CertParser;

    invoke-direct {v3}, Lorg/spongycastle/jce/provider/X509CertParser;-><init>()V

    .line 160
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 164
    :try_start_0
    new-instance v4, Ljava/io/ByteArrayInputStream;

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-direct {v4, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v3, v4}, Lorg/spongycastle/jce/provider/X509CertParser;->a(Ljava/io/InputStream;)V

    .line 166
    invoke-virtual {v3}, Lorg/spongycastle/jce/provider/X509CertParser;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 168
    invoke-virtual {p1, v0}, Lorg/spongycastle/x509/X509CertStoreSelector;->a(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 170
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 177
    :catch_0
    move-exception v0

    goto :goto_0

    .line 180
    :cond_1
    return-object v1
.end method

.method private declared-synchronized a(Ljava/lang/String;Ljava/util/List;)V
    .locals 11

    .prologue
    .line 1037
    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/sql/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-direct {v0, v2, v3}, Ljava/sql/Date;-><init>(J)V

    .line 1038
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1039
    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1040
    invoke-interface {v7, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1041
    iget-object v1, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->d:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1043
    iget-object v0, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->d:Ljava/util/Map;

    invoke-interface {v0, p1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1068
    :goto_0
    monitor-exit p0

    return-void

    .line 1047
    :cond_0
    :try_start_1
    iget-object v1, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->d:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    sget v2, Lorg/spongycastle/x509/util/LDAPStoreHelper;->e:I

    if-lt v1, v2, :cond_2

    .line 1050
    iget-object v1, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->d:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    .line 1051
    invoke-virtual {v0}, Ljava/sql/Date;->getTime()J

    move-result-wide v4

    .line 1052
    const/4 v6, 0x0

    .line 1053
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1055
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 1056
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/sql/Date;

    invoke-virtual {v1}, Ljava/sql/Date;->getTime()J

    move-result-wide v2

    .line 1058
    cmp-long v1, v2, v4

    if-gez v1, :cond_3

    .line 1061
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-wide v9, v2

    move-object v2, v0

    move-wide v0, v9

    :goto_2
    move-wide v4, v0

    move-object v6, v2

    .line 1063
    goto :goto_1

    .line 1064
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->d:Ljava/util/Map;

    invoke-interface {v0, v6}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1066
    :cond_2
    iget-object v0, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->d:Ljava/util/Map;

    invoke-interface {v0, p1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 1037
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_3
    move-wide v0, v4

    move-object v2, v6

    goto :goto_2
.end method

.method private static c(Lorg/spongycastle/x509/X509CertStoreSelector;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 1098
    :try_start_0
    invoke-virtual {p0}, Lorg/spongycastle/x509/X509CertStoreSelector;->getSubjectAsBytes()[B

    move-result-object v0

    .line 1099
    if-eqz v0, :cond_0

    .line 1101
    new-instance v1, Ljavax/security/auth/x500/X500Principal;

    invoke-direct {v1, v0}, Ljavax/security/auth/x500/X500Principal;-><init>([B)V

    const-string v0, "RFC1779"

    invoke-virtual {v1, v0}, Ljavax/security/auth/x500/X500Principal;->getName(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 1108
    :goto_0
    return-object v0

    .line 1104
    :catch_0
    move-exception v0

    .line 1106
    new-instance v1, Lorg/spongycastle/util/StoreException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "exception processing name: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/util/StoreException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 1108
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a(Lorg/spongycastle/x509/X509AttributeCertStoreSelector;)Ljava/util/Collection;
    .locals 5

    .prologue
    .line 858
    iget-object v0, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v0}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\s+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 859
    iget-object v1, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v1}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->v()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\\s+"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 860
    iget-object v2, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v2}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->b()Ljava/lang/String;

    move-result-object v2

    const-string v3, "\\s+"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 862
    invoke-direct {p0, p1, v0, v1, v2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Lorg/spongycastle/x509/X509AttributeCertStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 864
    invoke-static {v3, p1}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/spongycastle/x509/X509AttributeCertStoreSelector;)Ljava/util/Set;

    move-result-object v3

    .line 865
    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    if-nez v4, :cond_0

    .line 867
    new-instance v4, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;

    invoke-direct {v4}, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;-><init>()V

    .line 868
    invoke-direct {p0, v4, v0, v1, v2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Lorg/spongycastle/x509/X509AttributeCertStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 870
    invoke-static {v0, p1}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/spongycastle/x509/X509AttributeCertStoreSelector;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 873
    :cond_0
    return-object v3
.end method

.method public final a(Lorg/spongycastle/x509/X509CRLStoreSelector;)Ljava/util/Collection;
    .locals 5

    .prologue
    .line 694
    iget-object v0, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v0}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->k()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\s+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 695
    iget-object v1, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v1}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->A()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\\s+"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 697
    iget-object v2, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v2}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->l()Ljava/lang/String;

    move-result-object v2

    const-string v3, "\\s+"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 700
    invoke-direct {p0, p1, v0, v1, v2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Lorg/spongycastle/x509/X509CRLStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 702
    invoke-static {v3, p1}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/spongycastle/x509/X509CRLStoreSelector;)Ljava/util/Set;

    move-result-object v3

    .line 703
    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    if-nez v4, :cond_0

    .line 705
    new-instance v4, Lorg/spongycastle/x509/X509CRLStoreSelector;

    invoke-direct {v4}, Lorg/spongycastle/x509/X509CRLStoreSelector;-><init>()V

    .line 706
    invoke-direct {p0, v4, v0, v1, v2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Lorg/spongycastle/x509/X509CRLStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 709
    invoke-static {v0, p1}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/spongycastle/x509/X509CRLStoreSelector;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 711
    :cond_0
    return-object v3
.end method

.method public final a(Lorg/spongycastle/x509/X509CertPairStoreSelector;)Ljava/util/Collection;
    .locals 6

    .prologue
    .line 792
    iget-object v0, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v0}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->r()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\s+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 793
    iget-object v1, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v1}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->D()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\\s+"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 794
    iget-object v2, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v2}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->s()Ljava/lang/String;

    move-result-object v2

    const-string v3, "\\s+"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 796
    invoke-direct {p0, p1, v0, v1, v2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Lorg/spongycastle/x509/X509CertPairStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 798
    invoke-static {v3, p1}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/spongycastle/x509/X509CertPairStoreSelector;)Ljava/util/Set;

    move-result-object v3

    .line 799
    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    if-nez v4, :cond_0

    .line 801
    new-instance v4, Lorg/spongycastle/x509/X509CertStoreSelector;

    invoke-direct {v4}, Lorg/spongycastle/x509/X509CertStoreSelector;-><init>()V

    .line 802
    new-instance v5, Lorg/spongycastle/x509/X509CertPairStoreSelector;

    invoke-direct {v5}, Lorg/spongycastle/x509/X509CertPairStoreSelector;-><init>()V

    .line 804
    invoke-virtual {v5, v4}, Lorg/spongycastle/x509/X509CertPairStoreSelector;->a(Lorg/spongycastle/x509/X509CertStoreSelector;)V

    .line 805
    invoke-virtual {v5, v4}, Lorg/spongycastle/x509/X509CertPairStoreSelector;->b(Lorg/spongycastle/x509/X509CertStoreSelector;)V

    .line 806
    invoke-direct {p0, v5, v0, v1, v2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Lorg/spongycastle/x509/X509CertPairStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 808
    invoke-static {v0, p1}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/spongycastle/x509/X509CertPairStoreSelector;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 810
    :cond_0
    return-object v3
.end method

.method public final a(Lorg/spongycastle/x509/X509CertStoreSelector;)Ljava/util/Collection;
    .locals 5

    .prologue
    .line 827
    iget-object v0, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v0}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->I()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\s+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 828
    iget-object v1, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v1}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->G()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\\s+"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 829
    iget-object v2, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v2}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->J()Ljava/lang/String;

    move-result-object v2

    const-string v3, "\\s+"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 832
    invoke-direct {p0, p1, v0, v1, v2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Lorg/spongycastle/x509/X509CertStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 834
    invoke-static {v3, p1}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/spongycastle/x509/X509CertStoreSelector;)Ljava/util/Set;

    move-result-object v3

    .line 835
    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    if-nez v4, :cond_0

    .line 837
    new-instance v4, Lorg/spongycastle/x509/X509CertStoreSelector;

    invoke-direct {v4}, Lorg/spongycastle/x509/X509CertStoreSelector;-><init>()V

    .line 838
    invoke-direct {p0, v4, v0, v1, v2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Lorg/spongycastle/x509/X509CertStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 840
    invoke-static {v0, p1}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/spongycastle/x509/X509CertStoreSelector;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 843
    :cond_0
    return-object v3
.end method

.method public final b(Lorg/spongycastle/x509/X509AttributeCertStoreSelector;)Ljava/util/Collection;
    .locals 5

    .prologue
    .line 890
    iget-object v0, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v0}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->i()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\s+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 891
    iget-object v1, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v1}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->z()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\\s+"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 893
    iget-object v2, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v2}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->j()Ljava/lang/String;

    move-result-object v2

    const-string v3, "\\s+"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 896
    invoke-direct {p0, p1, v0, v1, v2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Lorg/spongycastle/x509/X509AttributeCertStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 898
    invoke-static {v3, p1}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/spongycastle/x509/X509AttributeCertStoreSelector;)Ljava/util/Set;

    move-result-object v3

    .line 899
    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    if-nez v4, :cond_0

    .line 901
    new-instance v4, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;

    invoke-direct {v4}, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;-><init>()V

    .line 902
    invoke-direct {p0, v4, v0, v1, v2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Lorg/spongycastle/x509/X509AttributeCertStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 904
    invoke-static {v0, p1}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/spongycastle/x509/X509AttributeCertStoreSelector;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 907
    :cond_0
    return-object v3
.end method

.method public final b(Lorg/spongycastle/x509/X509CRLStoreSelector;)Ljava/util/Collection;
    .locals 5

    .prologue
    .line 727
    iget-object v0, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v0}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\s+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 729
    iget-object v1, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v1}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->y()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\\s+"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 731
    iget-object v2, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v2}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->h()Ljava/lang/String;

    move-result-object v2

    const-string v3, "\\s+"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 734
    invoke-direct {p0, p1, v0, v1, v2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Lorg/spongycastle/x509/X509CRLStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 736
    invoke-static {v3, p1}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/spongycastle/x509/X509CRLStoreSelector;)Ljava/util/Set;

    move-result-object v3

    .line 737
    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    if-nez v4, :cond_0

    .line 739
    new-instance v4, Lorg/spongycastle/x509/X509CRLStoreSelector;

    invoke-direct {v4}, Lorg/spongycastle/x509/X509CRLStoreSelector;-><init>()V

    .line 740
    invoke-direct {p0, v4, v0, v1, v2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Lorg/spongycastle/x509/X509CRLStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 743
    invoke-static {v0, p1}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/spongycastle/x509/X509CRLStoreSelector;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 745
    :cond_0
    return-object v3
.end method

.method public final b(Lorg/spongycastle/x509/X509CertStoreSelector;)Ljava/util/Collection;
    .locals 5

    .prologue
    .line 924
    iget-object v0, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v0}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->n()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\s+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 925
    iget-object v1, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v1}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->B()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\\s+"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 926
    iget-object v2, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v2}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->o()Ljava/lang/String;

    move-result-object v2

    const-string v3, "\\s+"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 928
    invoke-direct {p0, p1, v0, v1, v2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Lorg/spongycastle/x509/X509CertStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 930
    invoke-static {v3, p1}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/spongycastle/x509/X509CertStoreSelector;)Ljava/util/Set;

    move-result-object v3

    .line 931
    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    if-nez v4, :cond_0

    .line 933
    new-instance v4, Lorg/spongycastle/x509/X509CertStoreSelector;

    invoke-direct {v4}, Lorg/spongycastle/x509/X509CertStoreSelector;-><init>()V

    .line 934
    invoke-direct {p0, v4, v0, v1, v2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Lorg/spongycastle/x509/X509CertStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 936
    invoke-static {v0, p1}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/spongycastle/x509/X509CertStoreSelector;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 938
    :cond_0
    return-object v3
.end method

.method public final c(Lorg/spongycastle/x509/X509AttributeCertStoreSelector;)Ljava/util/Collection;
    .locals 5

    .prologue
    .line 981
    iget-object v0, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v0}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\s+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 982
    iget-object v1, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v1}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->x()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\\s+"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 984
    iget-object v2, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v2}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->f()Ljava/lang/String;

    move-result-object v2

    const-string v3, "\\s+"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 986
    invoke-direct {p0, p1, v0, v1, v2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Lorg/spongycastle/x509/X509AttributeCertStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 988
    invoke-static {v3, p1}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/spongycastle/x509/X509AttributeCertStoreSelector;)Ljava/util/Set;

    move-result-object v3

    .line 989
    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    if-nez v4, :cond_0

    .line 991
    new-instance v4, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;

    invoke-direct {v4}, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;-><init>()V

    .line 992
    invoke-direct {p0, v4, v0, v1, v2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Lorg/spongycastle/x509/X509AttributeCertStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 994
    invoke-static {v0, p1}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/spongycastle/x509/X509AttributeCertStoreSelector;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 997
    :cond_0
    return-object v3
.end method

.method public final c(Lorg/spongycastle/x509/X509CRLStoreSelector;)Ljava/util/Collection;
    .locals 5

    .prologue
    .line 762
    iget-object v0, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v0}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\s+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 763
    iget-object v1, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v1}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->w()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\\s+"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 765
    iget-object v2, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v2}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->d()Ljava/lang/String;

    move-result-object v2

    const-string v3, "\\s+"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 768
    invoke-direct {p0, p1, v0, v1, v2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Lorg/spongycastle/x509/X509CRLStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 770
    invoke-static {v3, p1}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/spongycastle/x509/X509CRLStoreSelector;)Ljava/util/Set;

    move-result-object v3

    .line 771
    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    if-nez v4, :cond_0

    .line 773
    new-instance v4, Lorg/spongycastle/x509/X509CRLStoreSelector;

    invoke-direct {v4}, Lorg/spongycastle/x509/X509CRLStoreSelector;-><init>()V

    .line 774
    invoke-direct {p0, v4, v0, v1, v2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Lorg/spongycastle/x509/X509CRLStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 777
    invoke-static {v0, p1}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/spongycastle/x509/X509CRLStoreSelector;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 779
    :cond_0
    return-object v3
.end method

.method public final d(Lorg/spongycastle/x509/X509CRLStoreSelector;)Ljava/util/Collection;
    .locals 5

    .prologue
    .line 951
    iget-object v0, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v0}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->t()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\s+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 952
    iget-object v1, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v1}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->E()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\\s+"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 953
    iget-object v2, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v2}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->u()Ljava/lang/String;

    move-result-object v2

    const-string v3, "\\s+"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 955
    invoke-direct {p0, p1, v0, v1, v2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Lorg/spongycastle/x509/X509CRLStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 957
    invoke-static {v3, p1}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/spongycastle/x509/X509CRLStoreSelector;)Ljava/util/Set;

    move-result-object v3

    .line 958
    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    if-nez v4, :cond_0

    .line 960
    new-instance v4, Lorg/spongycastle/x509/X509CRLStoreSelector;

    invoke-direct {v4}, Lorg/spongycastle/x509/X509CRLStoreSelector;-><init>()V

    .line 961
    invoke-direct {p0, v4, v0, v1, v2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Lorg/spongycastle/x509/X509CRLStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 964
    invoke-static {v0, p1}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/spongycastle/x509/X509CRLStoreSelector;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 966
    :cond_0
    return-object v3
.end method

.method public final e(Lorg/spongycastle/x509/X509CRLStoreSelector;)Ljava/util/Collection;
    .locals 5

    .prologue
    .line 1010
    iget-object v0, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v0}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->p()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\s+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 1011
    iget-object v1, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v1}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->C()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\\s+"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 1013
    iget-object v2, p0, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v2}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->q()Ljava/lang/String;

    move-result-object v2

    const-string v3, "\\s+"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 1015
    invoke-direct {p0, p1, v0, v1, v2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Lorg/spongycastle/x509/X509CRLStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 1017
    invoke-static {v3, p1}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/spongycastle/x509/X509CRLStoreSelector;)Ljava/util/Set;

    move-result-object v3

    .line 1018
    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    if-nez v4, :cond_0

    .line 1020
    new-instance v4, Lorg/spongycastle/x509/X509CRLStoreSelector;

    invoke-direct {v4}, Lorg/spongycastle/x509/X509CRLStoreSelector;-><init>()V

    .line 1021
    invoke-direct {p0, v4, v0, v1, v2}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Lorg/spongycastle/x509/X509CRLStoreSelector;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 1024
    invoke-static {v0, p1}, Lorg/spongycastle/x509/util/LDAPStoreHelper;->a(Ljava/util/List;Lorg/spongycastle/x509/X509CRLStoreSelector;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 1026
    :cond_0
    return-object v3
.end method
