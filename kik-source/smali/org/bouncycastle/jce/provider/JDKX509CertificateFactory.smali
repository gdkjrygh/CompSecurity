.class public Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;
.super Ljava/security/cert/CertificateFactorySpi;


# static fields
.field private static final a:Lorg/bouncycastle/jce/provider/PEMUtil;

.field private static final b:Lorg/bouncycastle/jce/provider/PEMUtil;


# instance fields
.field private c:Lorg/bouncycastle/asn1/ASN1Set;

.field private d:I

.field private e:Ljava/io/InputStream;

.field private f:Lorg/bouncycastle/asn1/ASN1Set;

.field private g:I

.field private h:Ljava/io/InputStream;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/bouncycastle/jce/provider/PEMUtil;

    const-string v1, "CERTIFICATE"

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/PEMUtil;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->a:Lorg/bouncycastle/jce/provider/PEMUtil;

    new-instance v0, Lorg/bouncycastle/jce/provider/PEMUtil;

    const-string v1, "CRL"

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/PEMUtil;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->b:Lorg/bouncycastle/jce/provider/PEMUtil;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/security/cert/CertificateFactorySpi;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->c:Lorg/bouncycastle/asn1/ASN1Set;

    iput v1, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->d:I

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->e:Ljava/io/InputStream;

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->f:Lorg/bouncycastle/asn1/ASN1Set;

    iput v1, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->g:I

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->h:Ljava/io/InputStream;

    return-void
.end method

.method private static a(Lorg/bouncycastle/asn1/x509/CertificateList;)Ljava/security/cert/CRL;
    .locals 1

    new-instance v0, Lorg/bouncycastle/jce/provider/X509CRLObject;

    invoke-direct {v0, p0}, Lorg/bouncycastle/jce/provider/X509CRLObject;-><init>(Lorg/bouncycastle/asn1/x509/CertificateList;)V

    return-object v0
.end method

.method private a()Ljava/security/cert/Certificate;
    .locals 3

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->c:Lorg/bouncycastle/asn1/ASN1Set;

    if-eqz v0, :cond_1

    :cond_0
    iget v0, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->d:I

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->c:Lorg/bouncycastle/asn1/ASN1Set;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1Set;->f()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->c:Lorg/bouncycastle/asn1/ASN1Set;

    iget v1, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->d:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->d:I

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1Set;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    instance-of v0, v1, Lorg/bouncycastle/asn1/ASN1Sequence;

    if-eqz v0, :cond_0

    new-instance v0, Lorg/bouncycastle/jce/provider/X509CertificateObject;

    invoke-static {v1}, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/X509CertificateObject;-><init>(Lorg/bouncycastle/asn1/x509/X509CertificateStructure;)V

    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Lorg/bouncycastle/asn1/ASN1InputStream;)Ljava/security/cert/Certificate;
    .locals 4

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1InputStream;->a()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->f()I

    move-result v1

    if-le v1, v3, :cond_0

    invoke-virtual {v0, v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    instance-of v1, v1, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    sget-object v2, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->N:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lorg/bouncycastle/asn1/pkcs/SignedData;

    invoke-virtual {v0, v3}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1TaggedObject;

    invoke-static {v0, v3}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/pkcs/SignedData;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/pkcs/SignedData;->e()Lorg/bouncycastle/asn1/ASN1Set;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->c:Lorg/bouncycastle/asn1/ASN1Set;

    invoke-direct {p0}, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->a()Ljava/security/cert/Certificate;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-instance v1, Lorg/bouncycastle/jce/provider/X509CertificateObject;

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/bouncycastle/jce/provider/X509CertificateObject;-><init>(Lorg/bouncycastle/asn1/x509/X509CertificateStructure;)V

    move-object v0, v1

    goto :goto_0
.end method

.method private b()Ljava/security/cert/CRL;
    .locals 3

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->f:Lorg/bouncycastle/asn1/ASN1Set;

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->g:I

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->f:Lorg/bouncycastle/asn1/ASN1Set;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1Set;->f()I

    move-result v1

    if-lt v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->f:Lorg/bouncycastle/asn1/ASN1Set;

    iget v1, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->g:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->g:I

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1Set;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/CertificateList;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/CertificateList;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->a(Lorg/bouncycastle/asn1/x509/CertificateList;)Ljava/security/cert/CRL;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public engineGenerateCRL(Ljava/io/InputStream;)Ljava/security/cert/CRL;
    .locals 6

    const/4 v5, 0x1

    const/4 v2, 0x0

    const/4 v0, 0x0

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->h:Ljava/io/InputStream;

    if-nez v1, :cond_2

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->h:Ljava/io/InputStream;

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->f:Lorg/bouncycastle/asn1/ASN1Set;

    iput v2, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->g:I

    :cond_0
    :goto_0
    :try_start_0
    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->f:Lorg/bouncycastle/asn1/ASN1Set;

    if-eqz v1, :cond_4

    iget v1, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->g:I

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->f:Lorg/bouncycastle/asn1/ASN1Set;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1Set;->f()I

    move-result v2

    if-eq v1, v2, :cond_3

    invoke-direct {p0}, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->b()Ljava/security/cert/CRL;
    :try_end_0
    .catch Ljava/security/cert/CRLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    :cond_1
    :goto_1
    return-object v0

    :cond_2
    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->h:Ljava/io/InputStream;

    if-eq v1, p1, :cond_0

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->h:Ljava/io/InputStream;

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->f:Lorg/bouncycastle/asn1/ASN1Set;

    iput v2, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->g:I

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :try_start_1
    iput-object v1, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->f:Lorg/bouncycastle/asn1/ASN1Set;

    const/4 v1, 0x0

    iput v1, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->g:I
    :try_end_1
    .catch Ljava/security/cert/CRLException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_0
    move-exception v0

    throw v0

    :cond_4
    :try_start_2
    invoke-static {p1}, Lorg/bouncycastle/jce/provider/ProviderUtil;->a(Ljava/io/InputStream;)I

    move-result v1

    new-instance v2, Ljava/io/PushbackInputStream;

    invoke-direct {v2, p1}, Ljava/io/PushbackInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v2}, Ljava/io/PushbackInputStream;->read()I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_1

    invoke-virtual {v2, v3}, Ljava/io/PushbackInputStream;->unread(I)V

    const/16 v4, 0x30

    if-eq v3, v4, :cond_5

    sget-object v1, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->b:Lorg/bouncycastle/jce/provider/PEMUtil;

    invoke-virtual {v1, v2}, Lorg/bouncycastle/jce/provider/PEMUtil;->a(Ljava/io/InputStream;)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lorg/bouncycastle/asn1/x509/CertificateList;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/CertificateList;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->a(Lorg/bouncycastle/asn1/x509/CertificateList;)Ljava/security/cert/CRL;

    move-result-object v0

    goto :goto_1

    :cond_5
    new-instance v0, Lorg/bouncycastle/asn1/ASN1InputStream;

    const/4 v3, 0x1

    invoke-direct {v0, v2, v1, v3}, Lorg/bouncycastle/asn1/ASN1InputStream;-><init>(Ljava/io/InputStream;IZ)V

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1InputStream;->a()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->f()I

    move-result v1

    if-le v1, v5, :cond_6

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    instance-of v1, v1, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    if-eqz v1, :cond_6

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    sget-object v2, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->N:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v1, Lorg/bouncycastle/asn1/pkcs/SignedData;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1TaggedObject;

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/pkcs/SignedData;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/pkcs/SignedData;->f()Lorg/bouncycastle/asn1/ASN1Set;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->f:Lorg/bouncycastle/asn1/ASN1Set;

    invoke-direct {p0}, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->b()Ljava/security/cert/CRL;

    move-result-object v0

    goto :goto_1

    :cond_6
    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/CertificateList;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/CertificateList;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->a(Lorg/bouncycastle/asn1/x509/CertificateList;)Ljava/security/cert/CRL;
    :try_end_2
    .catch Ljava/security/cert/CRLException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v0

    goto/16 :goto_1

    :catch_1
    move-exception v0

    new-instance v1, Ljava/security/cert/CRLException;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/cert/CRLException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public engineGenerateCRLs(Ljava/io/InputStream;)Ljava/util/Collection;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-virtual {p0, p1}, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->engineGenerateCRL(Ljava/io/InputStream;)Ljava/security/cert/CRL;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public engineGenerateCertPath(Ljava/io/InputStream;)Ljava/security/cert/CertPath;
    .locals 1

    const-string v0, "PkiPath"

    invoke-virtual {p0, p1, v0}, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->engineGenerateCertPath(Ljava/io/InputStream;Ljava/lang/String;)Ljava/security/cert/CertPath;

    move-result-object v0

    return-object v0
.end method

.method public engineGenerateCertPath(Ljava/io/InputStream;Ljava/lang/String;)Ljava/security/cert/CertPath;
    .locals 1

    new-instance v0, Lorg/bouncycastle/jce/provider/PKIXCertPath;

    invoke-direct {v0, p1, p2}, Lorg/bouncycastle/jce/provider/PKIXCertPath;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    return-object v0
.end method

.method public engineGenerateCertPath(Ljava/util/List;)Ljava/security/cert/CertPath;
    .locals 4

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    instance-of v2, v1, Ljava/security/cert/X509Certificate;

    if-nez v2, :cond_0

    new-instance v0, Ljava/security/cert/CertificateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "list contains non X509Certificate object while creating CertPath\n"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Lorg/bouncycastle/jce/provider/PKIXCertPath;

    invoke-direct {v0, p1}, Lorg/bouncycastle/jce/provider/PKIXCertPath;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public engineGenerateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;
    .locals 5

    const/4 v2, 0x0

    const/4 v0, 0x0

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->e:Ljava/io/InputStream;

    if-nez v1, :cond_2

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->e:Ljava/io/InputStream;

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->c:Lorg/bouncycastle/asn1/ASN1Set;

    iput v2, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->d:I

    :cond_0
    :goto_0
    :try_start_0
    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->c:Lorg/bouncycastle/asn1/ASN1Set;

    if-eqz v1, :cond_4

    iget v1, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->d:I

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->c:Lorg/bouncycastle/asn1/ASN1Set;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1Set;->f()I

    move-result v2

    if-eq v1, v2, :cond_3

    invoke-direct {p0}, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->a()Ljava/security/cert/Certificate;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :cond_1
    :goto_1
    return-object v0

    :cond_2
    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->e:Ljava/io/InputStream;

    if-eq v1, p1, :cond_0

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->e:Ljava/io/InputStream;

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->c:Lorg/bouncycastle/asn1/ASN1Set;

    iput v2, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->d:I

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :try_start_1
    iput-object v1, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->c:Lorg/bouncycastle/asn1/ASN1Set;

    const/4 v1, 0x0

    iput v1, p0, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->d:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    new-instance v1, Ljava/security/cert/CertificateException;

    invoke-direct {v1, v0}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_4
    :try_start_2
    invoke-static {p1}, Lorg/bouncycastle/jce/provider/ProviderUtil;->a(Ljava/io/InputStream;)I

    move-result v1

    new-instance v2, Ljava/io/PushbackInputStream;

    invoke-direct {v2, p1}, Ljava/io/PushbackInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v2}, Ljava/io/PushbackInputStream;->read()I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_1

    invoke-virtual {v2, v3}, Ljava/io/PushbackInputStream;->unread(I)V

    const/16 v4, 0x30

    if-eq v3, v4, :cond_5

    sget-object v1, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->a:Lorg/bouncycastle/jce/provider/PEMUtil;

    invoke-virtual {v1, v2}, Lorg/bouncycastle/jce/provider/PEMUtil;->a(Ljava/io/InputStream;)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v1

    if-eqz v1, :cond_1

    new-instance v0, Lorg/bouncycastle/jce/provider/X509CertificateObject;

    invoke-static {v1}, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/X509CertificateObject;-><init>(Lorg/bouncycastle/asn1/x509/X509CertificateStructure;)V

    goto :goto_1

    :cond_5
    new-instance v0, Lorg/bouncycastle/asn1/ASN1InputStream;

    invoke-direct {v0, v2, v1}, Lorg/bouncycastle/asn1/ASN1InputStream;-><init>(Ljava/io/InputStream;I)V

    invoke-direct {p0, v0}, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->a(Lorg/bouncycastle/asn1/ASN1InputStream;)Ljava/security/cert/Certificate;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-result-object v0

    goto :goto_1
.end method

.method public engineGenerateCertificates(Ljava/io/InputStream;)Ljava/util/Collection;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-virtual {p0, p1}, Lorg/bouncycastle/jce/provider/JDKX509CertificateFactory;->engineGenerateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public engineGetCertPathEncodings()Ljava/util/Iterator;
    .locals 1

    sget-object v0, Lorg/bouncycastle/jce/provider/PKIXCertPath;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
