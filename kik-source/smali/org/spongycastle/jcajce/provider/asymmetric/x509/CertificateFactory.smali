.class public Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;
.super Ljava/security/cert/CertificateFactorySpi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory$a;
    }
.end annotation


# static fields
.field private static final a:Lorg/spongycastle/jcajce/provider/asymmetric/x509/PEMUtil;

.field private static final b:Lorg/spongycastle/jcajce/provider/asymmetric/x509/PEMUtil;


# instance fields
.field private c:Lorg/spongycastle/asn1/ASN1Set;

.field private d:I

.field private e:Ljava/io/InputStream;

.field private f:Lorg/spongycastle/asn1/ASN1Set;

.field private g:I

.field private h:Ljava/io/InputStream;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 40
    new-instance v0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/PEMUtil;

    const-string v1, "CERTIFICATE"

    invoke-direct {v0, v1}, Lorg/spongycastle/jcajce/provider/asymmetric/x509/PEMUtil;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->a:Lorg/spongycastle/jcajce/provider/asymmetric/x509/PEMUtil;

    .line 41
    new-instance v0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/PEMUtil;

    const-string v1, "CRL"

    invoke-direct {v0, v1}, Lorg/spongycastle/jcajce/provider/asymmetric/x509/PEMUtil;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->b:Lorg/spongycastle/jcajce/provider/asymmetric/x509/PEMUtil;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 37
    invoke-direct {p0}, Ljava/security/cert/CertificateFactorySpi;-><init>()V

    .line 43
    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->c:Lorg/spongycastle/asn1/ASN1Set;

    .line 44
    iput v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->d:I

    .line 45
    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->e:Ljava/io/InputStream;

    .line 47
    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->f:Lorg/spongycastle/asn1/ASN1Set;

    .line 48
    iput v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->g:I

    .line 49
    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->h:Ljava/io/InputStream;

    .line 375
    return-void
.end method

.method private static a(Lorg/spongycastle/asn1/x509/CertificateList;)Ljava/security/cert/CRL;
    .locals 1

    .prologue
    .line 111
    new-instance v0, Lorg/spongycastle/jce/provider/X509CRLObject;

    invoke-direct {v0, p0}, Lorg/spongycastle/jce/provider/X509CRLObject;-><init>(Lorg/spongycastle/asn1/x509/CertificateList;)V

    return-object v0
.end method

.method private a()Ljava/security/cert/Certificate;
    .locals 3

    .prologue
    .line 76
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->c:Lorg/spongycastle/asn1/ASN1Set;

    if-eqz v0, :cond_1

    .line 78
    :cond_0
    iget v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->d:I

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->c:Lorg/spongycastle/asn1/ASN1Set;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1Set;->d()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 80
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->c:Lorg/spongycastle/asn1/ASN1Set;

    iget v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->d:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->d:I

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1Set;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    .line 82
    instance-of v0, v1, Lorg/spongycastle/asn1/ASN1Sequence;

    if-eqz v0, :cond_0

    .line 84
    new-instance v0, Lorg/spongycastle/jce/provider/X509CertificateObject;

    invoke-static {v1}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/X509CertificateObject;-><init>(Lorg/spongycastle/asn1/x509/X509CertificateStructure;)V

    .line 90
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Lorg/spongycastle/asn1/ASN1InputStream;)Ljava/security/cert/Certificate;
    .locals 4

    .prologue
    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 55
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Sequence;

    .line 57
    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v1

    if-le v1, v3, :cond_0

    invoke-virtual {v0, v2}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    instance-of v1, v1, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    if-eqz v1, :cond_0

    .line 60
    invoke-virtual {v0, v2}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->N:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 62
    invoke-virtual {v0, v3}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1TaggedObject;

    invoke-static {v0, v3}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;Z)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/pkcs/SignedData;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/pkcs/SignedData;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/pkcs/SignedData;->c()Lorg/spongycastle/asn1/ASN1Set;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->c:Lorg/spongycastle/asn1/ASN1Set;

    .line 65
    invoke-direct {p0}, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->a()Ljava/security/cert/Certificate;

    move-result-object v0

    .line 69
    :goto_0
    return-object v0

    :cond_0
    new-instance v1, Lorg/spongycastle/jce/provider/X509CertificateObject;

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/spongycastle/jce/provider/X509CertificateObject;-><init>(Lorg/spongycastle/asn1/x509/X509CertificateStructure;)V

    move-object v0, v1

    goto :goto_0
.end method

.method private b()Ljava/security/cert/CRL;
    .locals 3

    .prologue
    .line 154
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->f:Lorg/spongycastle/asn1/ASN1Set;

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->g:I

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->f:Lorg/spongycastle/asn1/ASN1Set;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1Set;->d()I

    move-result v1

    if-lt v0, v1, :cond_1

    .line 156
    :cond_0
    const/4 v0, 0x0

    .line 159
    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->f:Lorg/spongycastle/asn1/ASN1Set;

    iget v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->g:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->g:I

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1Set;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/CertificateList;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/CertificateList;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->a(Lorg/spongycastle/asn1/x509/CertificateList;)Ljava/security/cert/CRL;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public engineGenerateCRL(Ljava/io/InputStream;)Ljava/security/cert/CRL;
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 253
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->h:Ljava/io/InputStream;

    if-nez v1, :cond_2

    .line 255
    iput-object p1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->h:Ljava/io/InputStream;

    .line 256
    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->f:Lorg/spongycastle/asn1/ASN1Set;

    .line 257
    iput v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->g:I

    .line 268
    :cond_0
    :goto_0
    :try_start_0
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->f:Lorg/spongycastle/asn1/ASN1Set;

    if-eqz v1, :cond_4

    .line 270
    iget v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->g:I

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->f:Lorg/spongycastle/asn1/ASN1Set;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/ASN1Set;->d()I

    move-result v2

    if-eq v1, v2, :cond_3

    .line 272
    invoke-direct {p0}, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->b()Ljava/security/cert/CRL;
    :try_end_0
    .catch Ljava/security/cert/CRLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 298
    :cond_1
    :goto_1
    return-object v0

    .line 259
    :cond_2
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->h:Ljava/io/InputStream;

    if-eq v1, p1, :cond_0

    .line 261
    iput-object p1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->h:Ljava/io/InputStream;

    .line 262
    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->f:Lorg/spongycastle/asn1/ASN1Set;

    .line 263
    iput v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->g:I

    goto :goto_0

    .line 276
    :cond_3
    const/4 v1, 0x0

    :try_start_1
    iput-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->f:Lorg/spongycastle/asn1/ASN1Set;

    .line 277
    const/4 v1, 0x0

    iput v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->g:I
    :try_end_1
    .catch Ljava/security/cert/CRLException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    .line 301
    :catch_0
    move-exception v0

    throw v0

    .line 282
    :cond_4
    :try_start_2
    new-instance v1, Ljava/io/PushbackInputStream;

    invoke-direct {v1, p1}, Ljava/io/PushbackInputStream;-><init>(Ljava/io/InputStream;)V

    .line 283
    invoke-virtual {v1}, Ljava/io/PushbackInputStream;->read()I

    move-result v2

    .line 285
    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    .line 290
    invoke-virtual {v1, v2}, Ljava/io/PushbackInputStream;->unread(I)V

    .line 292
    const/16 v3, 0x30

    if-eq v2, v3, :cond_5

    .line 294
    sget-object v2, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->b:Lorg/spongycastle/jcajce/provider/asymmetric/x509/PEMUtil;

    invoke-virtual {v2, v1}, Lorg/spongycastle/jcajce/provider/asymmetric/x509/PEMUtil;->a(Ljava/io/InputStream;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lorg/spongycastle/asn1/x509/CertificateList;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/CertificateList;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->a(Lorg/spongycastle/asn1/x509/CertificateList;)Ljava/security/cert/CRL;

    move-result-object v0

    goto :goto_1

    .line 298
    :cond_5
    new-instance v0, Lorg/spongycastle/asn1/ASN1InputStream;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>(Ljava/io/InputStream;B)V

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v1

    if-le v1, v4, :cond_6

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    instance-of v1, v1, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    if-eqz v1, :cond_6

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->N:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1TaggedObject;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;Z)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/pkcs/SignedData;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/pkcs/SignedData;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/pkcs/SignedData;->d()Lorg/spongycastle/asn1/ASN1Set;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->f:Lorg/spongycastle/asn1/ASN1Set;

    invoke-direct {p0}, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->b()Ljava/security/cert/CRL;

    move-result-object v0

    goto :goto_1

    :cond_6
    invoke-static {v0}, Lorg/spongycastle/asn1/x509/CertificateList;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/CertificateList;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->a(Lorg/spongycastle/asn1/x509/CertificateList;)Ljava/security/cert/CRL;
    :try_end_2
    .catch Ljava/security/cert/CRLException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v0

    goto/16 :goto_1

    .line 305
    :catch_1
    move-exception v0

    .line 307
    new-instance v1, Ljava/security/cert/CRLException;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/cert/CRLException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public engineGenerateCRLs(Ljava/io/InputStream;)Ljava/util/Collection;
    .locals 2

    .prologue
    .line 325
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 327
    :goto_0
    invoke-virtual {p0, p1}, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->engineGenerateCRL(Ljava/io/InputStream;)Ljava/security/cert/CRL;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 329
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 332
    :cond_0
    return-object v0
.end method

.method public engineGenerateCertPath(Ljava/io/InputStream;)Ljava/security/cert/CertPath;
    .locals 1

    .prologue
    .line 344
    const-string v0, "PkiPath"

    invoke-virtual {p0, p1, v0}, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->engineGenerateCertPath(Ljava/io/InputStream;Ljava/lang/String;)Ljava/security/cert/CertPath;

    move-result-object v0

    return-object v0
.end method

.method public engineGenerateCertPath(Ljava/io/InputStream;Ljava/lang/String;)Ljava/security/cert/CertPath;
    .locals 1

    .prologue
    .line 352
    new-instance v0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/PKIXCertPath;

    invoke-direct {v0, p1, p2}, Lorg/spongycastle/jcajce/provider/asymmetric/x509/PKIXCertPath;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    return-object v0
.end method

.method public engineGenerateCertPath(Ljava/util/List;)Ljava/security/cert/CertPath;
    .locals 4

    .prologue
    .line 359
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 361
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 363
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 364
    if-eqz v1, :cond_0

    .line 366
    instance-of v2, v1, Ljava/security/cert/X509Certificate;

    if-nez v2, :cond_0

    .line 368
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

    .line 372
    :cond_1
    new-instance v0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/PKIXCertPath;

    invoke-direct {v0, p1}, Lorg/spongycastle/jcajce/provider/asymmetric/x509/PKIXCertPath;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public engineGenerateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;
    .locals 4

    .prologue
    const/4 v2, 0x0

    const/4 v0, 0x0

    .line 172
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->e:Ljava/io/InputStream;

    if-nez v1, :cond_2

    .line 174
    iput-object p1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->e:Ljava/io/InputStream;

    .line 175
    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->c:Lorg/spongycastle/asn1/ASN1Set;

    .line 176
    iput v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->d:I

    .line 187
    :cond_0
    :goto_0
    :try_start_0
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->c:Lorg/spongycastle/asn1/ASN1Set;

    if-eqz v1, :cond_4

    .line 189
    iget v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->d:I

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->c:Lorg/spongycastle/asn1/ASN1Set;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/ASN1Set;->d()I

    move-result v2

    if-eq v1, v2, :cond_3

    .line 191
    invoke-direct {p0}, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->a()Ljava/security/cert/Certificate;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 217
    :cond_1
    :goto_1
    return-object v0

    .line 178
    :cond_2
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->e:Ljava/io/InputStream;

    if-eq v1, p1, :cond_0

    .line 180
    iput-object p1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->e:Ljava/io/InputStream;

    .line 181
    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->c:Lorg/spongycastle/asn1/ASN1Set;

    .line 182
    iput v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->d:I

    goto :goto_0

    .line 195
    :cond_3
    const/4 v1, 0x0

    :try_start_1
    iput-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->c:Lorg/spongycastle/asn1/ASN1Set;

    .line 196
    const/4 v1, 0x0

    iput v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->d:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 220
    :catch_0
    move-exception v0

    .line 222
    new-instance v1, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory$a;

    invoke-direct {v1, p0, v0}, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory$a;-><init>(Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;Ljava/lang/Throwable;)V

    throw v1

    .line 201
    :cond_4
    :try_start_2
    new-instance v1, Ljava/io/PushbackInputStream;

    invoke-direct {v1, p1}, Ljava/io/PushbackInputStream;-><init>(Ljava/io/InputStream;)V

    .line 202
    invoke-virtual {v1}, Ljava/io/PushbackInputStream;->read()I

    move-result v2

    .line 204
    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    .line 209
    invoke-virtual {v1, v2}, Ljava/io/PushbackInputStream;->unread(I)V

    .line 211
    const/16 v3, 0x30

    if-eq v2, v3, :cond_5

    .line 213
    sget-object v2, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->a:Lorg/spongycastle/jcajce/provider/asymmetric/x509/PEMUtil;

    invoke-virtual {v2, v1}, Lorg/spongycastle/jcajce/provider/asymmetric/x509/PEMUtil;->a(Ljava/io/InputStream;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    if-eqz v1, :cond_1

    new-instance v0, Lorg/spongycastle/jce/provider/X509CertificateObject;

    invoke-static {v1}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/X509CertificateObject;-><init>(Lorg/spongycastle/asn1/x509/X509CertificateStructure;)V

    goto :goto_1

    .line 217
    :cond_5
    new-instance v0, Lorg/spongycastle/asn1/ASN1InputStream;

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>(Ljava/io/InputStream;)V

    invoke-direct {p0, v0}, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->a(Lorg/spongycastle/asn1/ASN1InputStream;)Ljava/security/cert/Certificate;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-result-object v0

    goto :goto_1
.end method

.method public engineGenerateCertificates(Ljava/io/InputStream;)Ljava/util/Collection;
    .locals 2

    .prologue
    .line 235
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 237
    :goto_0
    invoke-virtual {p0, p1}, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;->engineGenerateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 239
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 242
    :cond_0
    return-object v0
.end method

.method public engineGetCertPathEncodings()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 337
    const/4 v0, 0x0

    return-object v0
.end method
