.class public Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;
.super Ljava/security/cert/CertStoreSpi;
.source "SourceFile"


# static fields
.field private static b:Ljava/lang/String;

.field private static c:Ljava/lang/String;


# instance fields
.field private a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 73
    const-string v0, "com.sun.jndi.ldap.LdapCtxFactory"

    sput-object v0, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->b:Ljava/lang/String;

    .line 78
    const-string v0, "ignore"

    sput-object v0, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->c:Ljava/lang/String;

    return-void
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .prologue
    const/16 v7, 0x2c

    const/4 v6, 0x1

    const/4 v5, -0x1

    const/4 v4, 0x0

    .line 108
    .line 109
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    .line 111
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 112
    invoke-virtual {v1, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    .line 113
    if-ne v0, v5, :cond_0

    .line 115
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    .line 117
    :cond_0
    :goto_0
    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x5c

    if-ne v2, v3, :cond_1

    .line 119
    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v1, v7, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    .line 120
    if-ne v0, v5, :cond_0

    .line 122
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    goto :goto_0

    .line 125
    :cond_1
    invoke-virtual {v1, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 126
    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    .line 127
    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 128
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x20

    if-ne v1, v2, :cond_2

    .line 130
    invoke-virtual {v0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 132
    :cond_2
    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 134
    invoke-virtual {v0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 136
    :cond_3
    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 138
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 140
    :cond_4
    return-object v0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/Set;
    .locals 9

    .prologue
    const/4 v0, 0x0

    const/4 v3, 0x0

    .line 411
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 412
    if-nez p1, :cond_0

    move-object v1, v0

    .line 417
    :cond_0
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 421
    :try_start_0
    new-instance v5, Ljava/util/Properties;

    invoke-direct {v5}, Ljava/util/Properties;-><init>()V

    const-string v2, "java.naming.factory.initial"

    sget-object v6, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->b:Ljava/lang/String;

    invoke-virtual {v5, v2, v6}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    const-string v2, "java.naming.batchsize"

    const-string v6, "0"

    invoke-virtual {v5, v2, v6}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    const-string v2, "java.naming.provider.url"

    iget-object v6, p0, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v6}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->F()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v2, v6}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    const-string v2, "java.naming.factory.url.pkgs"

    const-string v6, "com.sun.jndi.url"

    invoke-virtual {v5, v2, v6}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    const-string v2, "java.naming.referral"

    sget-object v6, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->c:Ljava/lang/String;

    invoke-virtual {v5, v2, v6}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    const-string v2, "java.naming.security.authentication"

    const-string v6, "none"

    invoke-virtual {v5, v2, v6}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v2, Ljavax/naming/directory/InitialDirContext;

    invoke-direct {v2, v5}, Ljavax/naming/directory/InitialDirContext;-><init>(Ljava/util/Hashtable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 423
    :try_start_1
    new-instance v5, Ljavax/naming/directory/SearchControls;

    invoke-direct {v5}, Ljavax/naming/directory/SearchControls;-><init>()V

    .line 424
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Ljavax/naming/directory/SearchControls;->setSearchScope(I)V

    .line 425
    const-wide/16 v6, 0x0

    invoke-virtual {v5, v6, v7}, Ljavax/naming/directory/SearchControls;->setCountLimit(J)V

    .line 426
    :goto_0
    array-length v0, p3

    if-ge v3, v0, :cond_5

    .line 428
    const/4 v0, 0x1

    new-array v6, v0, [Ljava/lang/String;

    .line 429
    const/4 v0, 0x0

    aget-object v7, p3, v3

    aput-object v7, v6, v0

    .line 430
    invoke-virtual {v5, v6}, Ljavax/naming/directory/SearchControls;->setReturningAttributes([Ljava/lang/String;)V

    .line 432
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v7, "(&("

    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v7, ")("

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v7, 0x0

    aget-object v7, v6, v7

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v7, "=*))"

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 433
    if-nez v1, :cond_1

    .line 435
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v7, "("

    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v7, 0x0

    aget-object v6, v6, v7

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, "=*)"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 437
    :cond_1
    iget-object v6, p0, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v6}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->m()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2, v6, v0, v5}, Ljavax/naming/directory/DirContext;->search(Ljava/lang/String;Ljava/lang/String;Ljavax/naming/directory/SearchControls;)Ljavax/naming/NamingEnumeration;

    move-result-object v6

    .line 439
    :cond_2
    invoke-interface {v6}, Ljavax/naming/NamingEnumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 441
    invoke-interface {v6}, Ljavax/naming/NamingEnumeration;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/naming/directory/SearchResult;

    .line 445
    invoke-virtual {v0}, Ljavax/naming/directory/SearchResult;->getAttributes()Ljavax/naming/directory/Attributes;

    move-result-object v0

    invoke-interface {v0}, Ljavax/naming/directory/Attributes;->getAll()Ljavax/naming/NamingEnumeration;

    move-result-object v0

    invoke-interface {v0}, Ljavax/naming/NamingEnumeration;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/naming/directory/Attribute;

    invoke-interface {v0}, Ljavax/naming/directory/Attribute;->getAll()Ljavax/naming/NamingEnumeration;

    move-result-object v0

    .line 447
    :goto_1
    invoke-interface {v0}, Ljavax/naming/NamingEnumeration;->hasMore()Z

    move-result v7

    if-eqz v7, :cond_2

    .line 449
    invoke-interface {v0}, Ljavax/naming/NamingEnumeration;->next()Ljava/lang/Object;

    move-result-object v7

    .line 450
    invoke-interface {v4, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    goto :goto_1

    .line 455
    :catch_0
    move-exception v0

    move-object v1, v2

    .line 457
    :goto_2
    :try_start_2
    new-instance v2, Ljava/security/cert/CertStoreException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Error getting results from LDAP directory "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/security/cert/CertStoreException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 463
    :catchall_0
    move-exception v0

    move-object v2, v1

    .line 465
    :goto_3
    if-eqz v2, :cond_3

    .line 467
    :try_start_3
    invoke-interface {v2}, Ljavax/naming/directory/DirContext;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 472
    :cond_3
    :goto_4
    throw v0

    .line 426
    :cond_4
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto/16 :goto_0

    .line 465
    :cond_5
    :try_start_4
    invoke-interface {v2}, Ljavax/naming/directory/DirContext;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 474
    :goto_5
    return-object v4

    .line 473
    :catch_1
    move-exception v0

    goto :goto_5

    :catch_2
    move-exception v1

    goto :goto_4

    .line 463
    :catchall_1
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    goto :goto_3

    :catchall_2
    move-exception v0

    goto :goto_3

    .line 455
    :catch_3
    move-exception v1

    move-object v8, v1

    move-object v1, v0

    move-object v0, v8

    goto :goto_2
.end method

.method private a(Ljava/security/cert/X509CertSelector;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Set;
    .locals 5

    .prologue
    .line 232
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 235
    :try_start_0
    invoke-virtual {p1}, Ljava/security/cert/X509CertSelector;->getSubjectAsBytes()[B

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/security/cert/X509CertSelector;->getSubjectAsString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/security/cert/X509CertSelector;->getCertificate()Ljava/security/cert/X509Certificate;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 239
    :cond_0
    const/4 v0, 0x0

    .line 241
    invoke-virtual {p1}, Ljava/security/cert/X509CertSelector;->getCertificate()Ljava/security/cert/X509Certificate;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 243
    invoke-virtual {p1}, Ljava/security/cert/X509CertSelector;->getCertificate()Ljava/security/cert/X509Certificate;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    const-string v1, "RFC1779"

    invoke-virtual {v0, v1}, Ljavax/security/auth/x500/X500Principal;->getName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 245
    invoke-virtual {p1}, Ljava/security/cert/X509CertSelector;->getCertificate()Ljava/security/cert/X509Certificate;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSerialNumber()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object v0

    .line 260
    :goto_0
    invoke-static {v1, p4}, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 261
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "*"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "*"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p3, v1, p2}, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/Set;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 262
    if-eqz v0, :cond_1

    iget-object v1, p0, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v1}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->H()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 266
    iget-object v1, p0, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v1}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->H()Ljava/lang/String;

    move-result-object v1

    .line 267
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "*"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "*"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v0, p2}, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 280
    :cond_1
    :goto_1
    return-object v2

    .line 250
    :cond_2
    invoke-virtual {p1}, Ljava/security/cert/X509CertSelector;->getSubjectAsBytes()[B

    move-result-object v1

    if-eqz v1, :cond_3

    .line 252
    new-instance v1, Ljavax/security/auth/x500/X500Principal;

    invoke-virtual {p1}, Ljava/security/cert/X509CertSelector;->getSubjectAsBytes()[B

    move-result-object v3

    invoke-direct {v1, v3}, Ljavax/security/auth/x500/X500Principal;-><init>([B)V

    const-string v3, "RFC1779"

    invoke-virtual {v1, v3}, Ljavax/security/auth/x500/X500Principal;->getName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 257
    :cond_3
    invoke-virtual {p1}, Ljava/security/cert/X509CertSelector;->getSubjectAsString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 272
    :cond_4
    const-string v0, "*"

    invoke-direct {p0, p3, v0, p2}, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 275
    :catch_0
    move-exception v0

    .line 277
    new-instance v1, Ljava/security/cert/CertStoreException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "exception processing selector: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/cert/CertStoreException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public engineGetCRLs(Ljava/security/cert/CRLSelector;)Ljava/util/Collection;
    .locals 8

    .prologue
    .line 334
    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    iget-object v2, p0, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v2}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->p()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v0

    .line 335
    instance-of v0, p1, Ljava/security/cert/X509CRLSelector;

    if-nez v0, :cond_0

    .line 337
    new-instance v0, Ljava/security/cert/CertStoreException;

    const-string v1, "selector is not a X509CRLSelector"

    invoke-direct {v0, v1}, Ljava/security/cert/CertStoreException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 339
    :cond_0
    check-cast p1, Ljava/security/cert/X509CRLSelector;

    .line 341
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 343
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v0}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->C()Ljava/lang/String;

    move-result-object v3

    .line 344
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 346
    invoke-virtual {p1}, Ljava/security/cert/X509CRLSelector;->getIssuerNames()Ljava/util/Collection;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 348
    invoke-virtual {p1}, Ljava/security/cert/X509CRLSelector;->getIssuerNames()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 349
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 351
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 352
    instance-of v6, v0, Ljava/lang/String;

    if-eqz v6, :cond_1

    .line 355
    iget-object v6, p0, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v6}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->q()Ljava/lang/String;

    move-result-object v6

    .line 357
    check-cast v0, Ljava/lang/String;

    invoke-static {v0, v6}, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 366
    :goto_1
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "*"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, "*"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v3, v0, v1}, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 361
    :cond_1
    iget-object v6, p0, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v6}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->q()Ljava/lang/String;

    move-result-object v6

    .line 363
    new-instance v7, Ljavax/security/auth/x500/X500Principal;

    check-cast v0, [B

    invoke-direct {v7, v0}, Ljavax/security/auth/x500/X500Principal;-><init>([B)V

    const-string v0, "RFC1779"

    invoke-virtual {v7, v0}, Ljavax/security/auth/x500/X500Principal;->getName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 371
    :cond_2
    const-string v0, "*"

    invoke-direct {p0, v3, v0, v1}, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 373
    :cond_3
    const/4 v0, 0x0

    const-string v3, "*"

    invoke-direct {p0, v0, v3, v1}, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 374
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 378
    :try_start_0
    const-string v0, "X.509"

    sget-object v3, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v0, v3}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v3

    .line 380
    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 382
    new-instance v4, Ljava/io/ByteArrayInputStream;

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-direct {v4, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v3, v4}, Ljava/security/cert/CertificateFactory;->generateCRL(Ljava/io/InputStream;)Ljava/security/cert/CRL;

    move-result-object v0

    .line 384
    invoke-virtual {p1, v0}, Ljava/security/cert/X509CRLSelector;->match(Ljava/security/cert/CRL;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 386
    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 390
    :catch_0
    move-exception v0

    .line 392
    new-instance v1, Ljava/security/cert/CertStoreException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "CRL cannot be constructed from LDAP result "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/cert/CertStoreException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 396
    :cond_5
    return-object v2
.end method

.method public engineGetCertificates(Ljava/security/cert/CertSelector;)Ljava/util/Collection;
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 146
    instance-of v0, p1, Ljava/security/cert/X509CertSelector;

    if-nez v0, :cond_0

    .line 148
    new-instance v0, Ljava/security/cert/CertStoreException;

    const-string v1, "selector is not a X509CertSelector"

    invoke-direct {v0, v1}, Ljava/security/cert/CertStoreException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 150
    :cond_0
    check-cast p1, Ljava/security/cert/X509CertSelector;

    .line 152
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 154
    new-array v0, v6, [Ljava/lang/String;

    iget-object v2, p0, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v2}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->I()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v5

    iget-object v2, p0, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v2}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->G()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v3}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->J()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, p1, v0, v2, v3}, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a(Ljava/security/cert/X509CertSelector;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    .line 155
    new-array v2, v6, [Ljava/lang/String;

    iget-object v3, p0, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v3}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->n()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v5

    iget-object v3, p0, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v3}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->B()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v4}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->o()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, p1, v2, v3, v4}, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a(Ljava/security/cert/X509CertSelector;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "*"

    invoke-direct {p0, v7, v4, v2}, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_1
    invoke-interface {v0, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 156
    new-array v2, v6, [Ljava/lang/String;

    iget-object v3, p0, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v3}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->r()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v5

    iget-object v3, p0, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v3}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->D()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a:Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    invoke-virtual {v4}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;->s()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, p1, v2, v3, v4}, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a(Ljava/security/cert/X509CertSelector;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    const-string v4, "*"

    invoke-direct {p0, v7, v4, v2}, Lorg/spongycastle/jce/provider/X509LDAPCertStoreSpi;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_2
    invoke-interface {v0, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 158
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 162
    :try_start_0
    const-string v0, "X.509"

    sget-object v3, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v0, v3}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v3

    .line 164
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 166
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 167
    if-eqz v0, :cond_3

    array-length v4, v0

    if-eqz v4, :cond_3

    .line 169
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 173
    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 177
    :try_start_1
    new-instance v5, Lorg/spongycastle/asn1/ASN1InputStream;

    invoke-direct {v5, v0}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>([B)V

    invoke-virtual {v5}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/CertificatePair;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/CertificatePair;

    move-result-object v0

    .line 180
    invoke-interface {v4}, Ljava/util/List;->clear()V

    .line 181
    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/CertificatePair;->c()Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    move-result-object v5

    if-eqz v5, :cond_4

    .line 183
    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/CertificatePair;->c()Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    move-result-object v5

    invoke-virtual {v5}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->b()[B

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 185
    :cond_4
    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/CertificatePair;->d()Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    move-result-object v5

    if-eqz v5, :cond_5

    .line 187
    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/CertificatePair;->d()Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->b()[B

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 198
    :cond_5
    :goto_0
    :try_start_2
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_6
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 200
    new-instance v5, Ljava/io/ByteArrayInputStream;

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-direct {v5, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 204
    :try_start_3
    invoke-virtual {v3, v5}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v0

    .line 207
    invoke-virtual {p1, v0}, Ljava/security/cert/X509CertSelector;->match(Ljava/security/cert/Certificate;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 209
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1

    .line 216
    :catch_0
    move-exception v0

    goto :goto_1

    .line 219
    :catch_1
    move-exception v0

    .line 221
    new-instance v1, Ljava/security/cert/CertStoreException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "certificate cannot be constructed from LDAP result: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/cert/CertStoreException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 225
    :cond_7
    return-object v1

    :catch_2
    move-exception v0

    goto :goto_0

    .line 197
    :catch_3
    move-exception v0

    goto :goto_0
.end method
