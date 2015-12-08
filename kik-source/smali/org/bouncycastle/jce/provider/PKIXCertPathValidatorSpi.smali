.class public Lorg/bouncycastle/jce/provider/PKIXCertPathValidatorSpi;
.super Ljava/security/cert/CertPathValidatorSpi;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/security/cert/CertPathValidatorSpi;-><init>()V

    return-void
.end method


# virtual methods
.method public engineValidate(Ljava/security/cert/CertPath;Ljava/security/cert/CertPathParameters;)Ljava/security/cert/CertPathValidatorResult;
    .locals 26

    move-object/from16 v0, p2

    instance-of v2, v0, Ljava/security/cert/PKIXParameters;

    if-nez v2, :cond_0

    new-instance v2, Ljava/security/InvalidAlgorithmParameterException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Parameters must be a "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v4, Ljava/security/cert/PKIXParameters;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " instance."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_0
    move-object/from16 v0, p2

    instance-of v2, v0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;

    if-eqz v2, :cond_1

    check-cast p2, Lorg/bouncycastle/x509/ExtendedPKIXParameters;

    :goto_0
    invoke-virtual/range {p2 .. p2}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->getTrustAnchors()Ljava/util/Set;

    move-result-object v2

    if-nez v2, :cond_2

    new-instance v2, Ljava/security/InvalidAlgorithmParameterException;

    const-string v3, "trustAnchors is null, this is not allowed for certification path validation."

    invoke-direct {v2, v3}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    check-cast p2, Ljava/security/cert/PKIXParameters;

    invoke-static/range {p2 .. p2}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->c(Ljava/security/cert/PKIXParameters;)Lorg/bouncycastle/x509/ExtendedPKIXParameters;

    move-result-object p2

    goto :goto_0

    :cond_2
    invoke-virtual/range {p1 .. p1}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v20

    invoke-interface/range {v20 .. v20}, Ljava/util/List;->size()I

    move-result v19

    invoke-interface/range {v20 .. v20}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance v2, Ljava/security/cert/CertPathValidatorException;

    const-string v3, "Certification path is empty."

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v0, p1

    invoke-direct {v2, v3, v4, v0, v5}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v2

    :cond_3
    invoke-virtual/range {p2 .. p2}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->getInitialPolicies()Ljava/util/Set;

    move-result-object v21

    :try_start_0
    invoke-interface/range {v20 .. v20}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    move-object/from16 v0, v20

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/security/cert/X509Certificate;

    invoke-virtual/range {p2 .. p2}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->getTrustAnchors()Ljava/util/Set;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->getSigProvider()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Certificate;Ljava/util/Set;Ljava/lang/String;)Ljava/security/cert/TrustAnchor;
    :try_end_0
    .catch Lorg/bouncycastle/jce/provider/AnnotatedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v22

    if-nez v22, :cond_4

    new-instance v2, Ljava/security/cert/CertPathValidatorException;

    const-string v3, "Trust anchor for certification path not found."

    const/4 v4, 0x0

    const/4 v5, -0x1

    move-object/from16 v0, p1

    invoke-direct {v2, v3, v4, v0, v5}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v2

    :catch_0
    move-exception v2

    new-instance v3, Ljava/security/cert/CertPathValidatorException;

    invoke-virtual {v2}, Lorg/bouncycastle/jce/provider/AnnotatedException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-interface/range {v20 .. v20}, Ljava/util/List;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    move-object/from16 v0, p1

    invoke-direct {v3, v4, v2, v0, v5}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v3

    :cond_4
    add-int/lit8 v2, v19, 0x1

    new-array v13, v2, [Ljava/util/ArrayList;

    const/4 v2, 0x0

    :goto_1
    array-length v3, v13

    if-ge v2, v3, :cond_5

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    aput-object v3, v13, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    const-string v2, "2.5.29.32.0"

    invoke-interface {v5, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v2, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/4 v4, 0x0

    const/4 v6, 0x0

    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    const-string v8, "2.5.29.32.0"

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v9}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;-><init>(Ljava/util/List;ILjava/util/Set;Ljava/security/cert/PolicyNode;Ljava/util/Set;Ljava/lang/String;Z)V

    const/4 v3, 0x0

    aget-object v3, v13, v3

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v23, Lorg/bouncycastle/jce/provider/PKIXNameConstraintValidator;

    invoke-direct/range {v23 .. v23}, Lorg/bouncycastle/jce/provider/PKIXNameConstraintValidator;-><init>()V

    new-instance v11, Ljava/util/HashSet;

    invoke-direct {v11}, Ljava/util/HashSet;-><init>()V

    invoke-virtual/range {p2 .. p2}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->isExplicitPolicyRequired()Z

    move-result v3

    if-eqz v3, :cond_6

    const/4 v3, 0x0

    move v4, v3

    :goto_2
    invoke-virtual/range {p2 .. p2}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->isAnyPolicyInhibited()Z

    move-result v3

    if-eqz v3, :cond_7

    const/4 v3, 0x0

    move v5, v3

    :goto_3
    invoke-virtual/range {p2 .. p2}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->isPolicyMappingInhibited()Z

    move-result v3

    if-eqz v3, :cond_8

    const/4 v3, 0x0

    move v6, v3

    :goto_4
    invoke-virtual/range {v22 .. v22}, Ljava/security/cert/TrustAnchor;->getTrustedCert()Ljava/security/cert/X509Certificate;

    move-result-object v8

    if-eqz v8, :cond_9

    :try_start_1
    invoke-static {v8}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Certificate;)Ljavax/security/auth/x500/X500Principal;

    move-result-object v7

    invoke-virtual {v8}, Ljava/security/cert/X509Certificate;->getPublicKey()Ljava/security/PublicKey;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v9

    :goto_5
    :try_start_2
    invoke-static {v9}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/PublicKey;)Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;
    :try_end_2
    .catch Ljava/security/cert/CertPathValidatorException; {:try_start_2 .. :try_end_2} :catch_2

    invoke-virtual/range {p2 .. p2}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->h()Lorg/bouncycastle/util/Selector;

    move-result-object v3

    if-eqz v3, :cond_a

    invoke-virtual/range {p2 .. p2}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->h()Lorg/bouncycastle/util/Selector;

    move-result-object v10

    const/4 v3, 0x0

    move-object/from16 v0, v20

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/security/cert/X509Certificate;

    invoke-interface {v10, v3}, Lorg/bouncycastle/util/Selector;->a(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    new-instance v2, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v3, "Target certificate in certification path does not match targetConstraints."

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v0, p1

    invoke-direct {v2, v3, v4, v0, v5}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v2

    :cond_6
    add-int/lit8 v3, v19, 0x1

    move v4, v3

    goto :goto_2

    :cond_7
    add-int/lit8 v3, v19, 0x1

    move v5, v3

    goto :goto_3

    :cond_8
    add-int/lit8 v3, v19, 0x1

    move v6, v3

    goto :goto_4

    :cond_9
    :try_start_3
    new-instance v7, Ljavax/security/auth/x500/X500Principal;

    invoke-virtual/range {v22 .. v22}, Ljava/security/cert/TrustAnchor;->getCAName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v7, v3}, Ljavax/security/auth/x500/X500Principal;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {v22 .. v22}, Ljava/security/cert/TrustAnchor;->getCAPublicKey()Ljava/security/PublicKey;
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_1

    move-result-object v9

    goto :goto_5

    :catch_1
    move-exception v2

    new-instance v3, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v4, "Subject of trust anchor could not be (re)encoded."

    const/4 v5, -0x1

    move-object/from16 v0, p1

    invoke-direct {v3, v4, v2, v0, v5}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v3

    :catch_2
    move-exception v2

    new-instance v3, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v4, "Algorithm identifier of public key of trust anchor could not be read."

    const/4 v5, -0x1

    move-object/from16 v0, p1

    invoke-direct {v3, v4, v2, v0, v5}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v3

    :cond_a
    invoke-virtual/range {p2 .. p2}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->getCertPathCheckers()Ljava/util/List;

    move-result-object v24

    invoke-interface/range {v24 .. v24}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/security/cert/PKIXCertPathChecker;

    const/4 v12, 0x0

    invoke-virtual {v3, v12}, Ljava/security/cert/PKIXCertPathChecker;->init(Z)V

    goto :goto_6

    :cond_b
    const/4 v15, 0x0

    invoke-interface/range {v20 .. v20}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    move/from16 v16, v19

    move/from16 v17, v6

    move v14, v5

    move/from16 v18, v4

    move-object v12, v2

    move-object v5, v9

    move v4, v3

    :goto_7
    if-ltz v4, :cond_f

    sub-int v25, v19, v4

    move-object/from16 v0, v20

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Ljava/security/cert/X509Certificate;

    invoke-interface/range {v20 .. v20}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ne v4, v2, :cond_c

    const/4 v6, 0x1

    :goto_8
    move-object/from16 v2, p1

    move-object/from16 v3, p2

    invoke-static/range {v2 .. v8}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/security/cert/CertPath;Lorg/bouncycastle/x509/ExtendedPKIXParameters;ILjava/security/PublicKey;ZLjavax/security/auth/x500/X500Principal;Ljava/security/cert/X509Certificate;)V

    move-object/from16 v0, p1

    move-object/from16 v1, v23

    invoke-static {v0, v4, v1}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/security/cert/CertPath;ILorg/bouncycastle/jce/provider/PKIXNameConstraintValidator;)V

    move-object/from16 v9, p1

    move v10, v4

    invoke-static/range {v9 .. v14}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/security/cert/CertPath;ILjava/util/Set;Lorg/bouncycastle/jce/provider/PKIXPolicyNode;[Ljava/util/List;I)Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v0, v4, v2}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/security/cert/CertPath;ILorg/bouncycastle/jce/provider/PKIXPolicyNode;)Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    move-result-object v2

    move-object/from16 v0, p1

    move/from16 v1, v18

    invoke-static {v0, v4, v2, v1}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/security/cert/CertPath;ILorg/bouncycastle/jce/provider/PKIXPolicyNode;I)V

    move/from16 v0, v25

    move/from16 v1, v19

    if-eq v0, v1, :cond_13

    if-eqz v15, :cond_d

    invoke-virtual {v15}, Ljava/security/cert/X509Certificate;->getVersion()I

    move-result v3

    const/4 v5, 0x1

    if-ne v3, v5, :cond_d

    new-instance v2, Ljava/security/cert/CertPathValidatorException;

    const-string v3, "Version 1 certificates can\'t be used as CA ones."

    const/4 v5, 0x0

    move-object/from16 v0, p1

    invoke-direct {v2, v3, v5, v0, v4}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v2

    :cond_c
    const/4 v6, 0x0

    goto :goto_8

    :cond_d
    move-object/from16 v0, p1

    invoke-static {v0, v4}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/security/cert/CertPath;I)V

    move-object/from16 v0, p1

    move/from16 v1, v17

    invoke-static {v0, v4, v13, v2, v1}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/security/cert/CertPath;I[Ljava/util/List;Lorg/bouncycastle/jce/provider/PKIXPolicyNode;I)Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    move-result-object v9

    move-object/from16 v0, p1

    move-object/from16 v1, v23

    invoke-static {v0, v4, v1}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->b(Ljava/security/cert/CertPath;ILorg/bouncycastle/jce/provider/PKIXNameConstraintValidator;)V

    move-object/from16 v0, p1

    move/from16 v1, v18

    invoke-static {v0, v4, v1}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->f(Ljava/security/cert/CertPath;II)I

    move-result v2

    move-object/from16 v0, p1

    move/from16 v1, v17

    invoke-static {v0, v4, v1}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->g(Ljava/security/cert/CertPath;II)I

    move-result v3

    move-object/from16 v0, p1

    invoke-static {v0, v4, v14}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->h(Ljava/security/cert/CertPath;II)I

    move-result v5

    move-object/from16 v0, p1

    invoke-static {v0, v4, v2}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/security/cert/CertPath;II)I

    move-result v8

    move-object/from16 v0, p1

    invoke-static {v0, v4, v3}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->b(Ljava/security/cert/CertPath;II)I

    move-result v6

    move-object/from16 v0, p1

    invoke-static {v0, v4, v5}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->c(Ljava/security/cert/CertPath;II)I

    move-result v14

    move-object/from16 v0, p1

    invoke-static {v0, v4}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->b(Ljava/security/cert/CertPath;I)V

    move-object/from16 v0, p1

    move/from16 v1, v16

    invoke-static {v0, v4, v1}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->d(Ljava/security/cert/CertPath;II)I

    move-result v2

    move-object/from16 v0, p1

    invoke-static {v0, v4, v2}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->e(Ljava/security/cert/CertPath;II)I

    move-result v3

    move-object/from16 v0, p1

    invoke-static {v0, v4}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->c(Ljava/security/cert/CertPath;I)V

    invoke-virtual {v15}, Ljava/security/cert/X509Certificate;->getCriticalExtensionOIDs()Ljava/util/Set;

    move-result-object v5

    if-eqz v5, :cond_e

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v5}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sget-object v5, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->m:Ljava/lang/String;

    invoke-interface {v2, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object v5, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a:Ljava/lang/String;

    invoke-interface {v2, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object v5, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->b:Ljava/lang/String;

    invoke-interface {v2, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object v5, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->c:Ljava/lang/String;

    invoke-interface {v2, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object v5, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->d:Ljava/lang/String;

    invoke-interface {v2, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object v5, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->f:Ljava/lang/String;

    invoke-interface {v2, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object v5, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->g:Ljava/lang/String;

    invoke-interface {v2, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object v5, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->h:Ljava/lang/String;

    invoke-interface {v2, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object v5, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->j:Ljava/lang/String;

    invoke-interface {v2, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object v5, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->k:Ljava/lang/String;

    invoke-interface {v2, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    :goto_9
    move-object/from16 v0, p1

    move-object/from16 v1, v24

    invoke-static {v0, v4, v2, v1}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/security/cert/CertPath;ILjava/util/Set;Ljava/util/List;)V

    invoke-static {v15}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Certificate;)Ljavax/security/auth/x500/X500Principal;

    move-result-object v7

    :try_start_4
    invoke-virtual/range {p1 .. p1}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v4}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/util/List;I)Ljava/security/PublicKey;
    :try_end_4
    .catch Ljava/security/cert/CertPathValidatorException; {:try_start_4 .. :try_end_4} :catch_3

    move-result-object v5

    invoke-static {v5}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/PublicKey;)Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move v2, v3

    move v3, v6

    move v6, v8

    move-object v8, v15

    :goto_a
    add-int/lit8 v4, v4, -0x1

    move/from16 v16, v2

    move/from16 v17, v3

    move/from16 v18, v6

    move-object v12, v9

    goto/16 :goto_7

    :cond_e
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    goto :goto_9

    :catch_3
    move-exception v2

    new-instance v3, Ljava/security/cert/CertPathValidatorException;

    const-string v5, "Next working key could not be retrieved."

    move-object/from16 v0, p1

    invoke-direct {v3, v5, v2, v0, v4}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v3

    :cond_f
    move/from16 v0, v18

    invoke-static {v0, v15}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a(ILjava/security/cert/X509Certificate;)I

    move-result v2

    add-int/lit8 v3, v4, 0x1

    move-object/from16 v0, p1

    invoke-static {v0, v3, v2}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->i(Ljava/security/cert/CertPath;II)I

    move-result v3

    invoke-virtual {v15}, Ljava/security/cert/X509Certificate;->getCriticalExtensionOIDs()Ljava/util/Set;

    move-result-object v5

    if-eqz v5, :cond_11

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v5}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sget-object v5, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->m:Ljava/lang/String;

    invoke-interface {v2, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object v5, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a:Ljava/lang/String;

    invoke-interface {v2, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object v5, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->b:Ljava/lang/String;

    invoke-interface {v2, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object v5, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->c:Ljava/lang/String;

    invoke-interface {v2, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object v5, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->d:Ljava/lang/String;

    invoke-interface {v2, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object v5, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->f:Ljava/lang/String;

    invoke-interface {v2, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object v5, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->g:Ljava/lang/String;

    invoke-interface {v2, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object v5, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->h:Ljava/lang/String;

    invoke-interface {v2, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object v5, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->j:Ljava/lang/String;

    invoke-interface {v2, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object v5, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->k:Ljava/lang/String;

    invoke-interface {v2, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object v5, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->i:Ljava/lang/String;

    invoke-interface {v2, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    :goto_b
    add-int/lit8 v5, v4, 0x1

    move-object/from16 v0, p1

    move-object/from16 v1, v24

    invoke-static {v0, v5, v1, v2}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/security/cert/CertPath;ILjava/util/List;Ljava/util/Set;)V

    add-int/lit8 v8, v4, 0x1

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move-object/from16 v7, v21

    move-object v9, v13

    move-object v10, v12

    invoke-static/range {v5 .. v11}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/security/cert/CertPath;Lorg/bouncycastle/x509/ExtendedPKIXParameters;Ljava/util/Set;I[Ljava/util/List;Lorg/bouncycastle/jce/provider/PKIXPolicyNode;Ljava/util/Set;)Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    move-result-object v2

    if-gtz v3, :cond_10

    if-eqz v2, :cond_12

    :cond_10
    new-instance v3, Ljava/security/cert/PKIXCertPathValidatorResult;

    invoke-virtual {v15}, Ljava/security/cert/X509Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v4

    move-object/from16 v0, v22

    invoke-direct {v3, v0, v2, v4}, Ljava/security/cert/PKIXCertPathValidatorResult;-><init>(Ljava/security/cert/TrustAnchor;Ljava/security/cert/PolicyNode;Ljava/security/PublicKey;)V

    return-object v3

    :cond_11
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    goto :goto_b

    :cond_12
    new-instance v2, Ljava/security/cert/CertPathValidatorException;

    const-string v3, "Path processing failed on policy."

    const/4 v5, 0x0

    move-object/from16 v0, p1

    invoke-direct {v2, v3, v5, v0, v4}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v2

    :cond_13
    move/from16 v3, v17

    move/from16 v6, v18

    move-object v9, v2

    move/from16 v2, v16

    goto/16 :goto_a
.end method
