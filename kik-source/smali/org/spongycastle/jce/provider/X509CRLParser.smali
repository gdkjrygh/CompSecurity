.class public Lorg/spongycastle/jce/provider/X509CRLParser;
.super Lorg/spongycastle/x509/X509StreamParserSpi;
.source "SourceFile"


# static fields
.field private static final a:Lorg/spongycastle/jce/provider/PEMUtil;


# instance fields
.field private b:Lorg/spongycastle/asn1/ASN1Set;

.field private c:I

.field private d:Ljava/io/InputStream;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 26
    new-instance v0, Lorg/spongycastle/jce/provider/PEMUtil;

    const-string v1, "CRL"

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/PEMUtil;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/jce/provider/X509CRLParser;->a:Lorg/spongycastle/jce/provider/PEMUtil;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 23
    invoke-direct {p0}, Lorg/spongycastle/x509/X509StreamParserSpi;-><init>()V

    .line 28
    iput-object v1, p0, Lorg/spongycastle/jce/provider/X509CRLParser;->b:Lorg/spongycastle/asn1/ASN1Set;

    .line 29
    const/4 v0, 0x0

    iput v0, p0, Lorg/spongycastle/jce/provider/X509CRLParser;->c:I

    .line 30
    iput-object v1, p0, Lorg/spongycastle/jce/provider/X509CRLParser;->d:Ljava/io/InputStream;

    return-void
.end method

.method private b()Ljava/security/cert/CRL;
    .locals 4

    .prologue
    .line 57
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CRLParser;->b:Lorg/spongycastle/asn1/ASN1Set;

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/spongycastle/jce/provider/X509CRLParser;->c:I

    iget-object v1, p0, Lorg/spongycastle/jce/provider/X509CRLParser;->b:Lorg/spongycastle/asn1/ASN1Set;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1Set;->d()I

    move-result v1

    if-lt v0, v1, :cond_1

    .line 59
    :cond_0
    const/4 v0, 0x0

    .line 62
    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Lorg/spongycastle/jce/provider/X509CRLObject;

    iget-object v1, p0, Lorg/spongycastle/jce/provider/X509CRLParser;->b:Lorg/spongycastle/asn1/ASN1Set;

    iget v2, p0, Lorg/spongycastle/jce/provider/X509CRLParser;->c:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lorg/spongycastle/jce/provider/X509CRLParser;->c:I

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/ASN1Set;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/x509/CertificateList;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/CertificateList;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/X509CRLObject;-><init>(Lorg/spongycastle/asn1/x509/CertificateList;)V

    goto :goto_0
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v0, 0x0

    .line 98
    :try_start_0
    iget-object v1, p0, Lorg/spongycastle/jce/provider/X509CRLParser;->b:Lorg/spongycastle/asn1/ASN1Set;

    if-eqz v1, :cond_2

    .line 100
    iget v1, p0, Lorg/spongycastle/jce/provider/X509CRLParser;->c:I

    iget-object v2, p0, Lorg/spongycastle/jce/provider/X509CRLParser;->b:Lorg/spongycastle/asn1/ASN1Set;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/ASN1Set;->d()I

    move-result v2

    if-eq v1, v2, :cond_1

    .line 102
    invoke-direct {p0}, Lorg/spongycastle/jce/provider/X509CRLParser;->b()Ljava/security/cert/CRL;

    move-result-object v0

    .line 128
    :cond_0
    :goto_0
    return-object v0

    .line 106
    :cond_1
    const/4 v1, 0x0

    iput-object v1, p0, Lorg/spongycastle/jce/provider/X509CRLParser;->b:Lorg/spongycastle/asn1/ASN1Set;

    .line 107
    const/4 v1, 0x0

    iput v1, p0, Lorg/spongycastle/jce/provider/X509CRLParser;->c:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 131
    :catch_0
    move-exception v0

    .line 133
    new-instance v1, Lorg/spongycastle/x509/util/StreamParsingException;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/x509/util/StreamParsingException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 112
    :cond_2
    :try_start_1
    iget-object v1, p0, Lorg/spongycastle/jce/provider/X509CRLParser;->d:Ljava/io/InputStream;

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Ljava/io/InputStream;->mark(I)V

    .line 113
    iget-object v1, p0, Lorg/spongycastle/jce/provider/X509CRLParser;->d:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    move-result v1

    .line 115
    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    .line 120
    const/16 v2, 0x30

    if-eq v1, v2, :cond_3

    .line 122
    iget-object v1, p0, Lorg/spongycastle/jce/provider/X509CRLParser;->d:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->reset()V

    .line 123
    iget-object v1, p0, Lorg/spongycastle/jce/provider/X509CRLParser;->d:Ljava/io/InputStream;

    sget-object v2, Lorg/spongycastle/jce/provider/X509CRLParser;->a:Lorg/spongycastle/jce/provider/PEMUtil;

    invoke-virtual {v2, v1}, Lorg/spongycastle/jce/provider/PEMUtil;->a(Ljava/io/InputStream;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v0, Lorg/spongycastle/jce/provider/X509CRLObject;

    invoke-static {v1}, Lorg/spongycastle/asn1/x509/CertificateList;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/CertificateList;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/X509CRLObject;-><init>(Lorg/spongycastle/asn1/x509/CertificateList;)V

    goto :goto_0

    .line 127
    :cond_3
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CRLParser;->d:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V

    .line 128
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CRLParser;->d:Ljava/io/InputStream;

    new-instance v1, Lorg/spongycastle/asn1/ASN1InputStream;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v1

    if-le v1, v3, :cond_4

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    instance-of v1, v1, Lorg/spongycastle/asn1/DERObjectIdentifier;

    if-eqz v1, :cond_4

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->N:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance v1, Lorg/spongycastle/asn1/pkcs/SignedData;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1TaggedObject;

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;Z)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/pkcs/SignedData;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/SignedData;->d()Lorg/spongycastle/asn1/ASN1Set;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/X509CRLParser;->b:Lorg/spongycastle/asn1/ASN1Set;

    invoke-direct {p0}, Lorg/spongycastle/jce/provider/X509CRLParser;->b()Ljava/security/cert/CRL;

    move-result-object v0

    goto/16 :goto_0

    :cond_4
    new-instance v1, Lorg/spongycastle/jce/provider/X509CRLObject;

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/CertificateList;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/CertificateList;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/spongycastle/jce/provider/X509CRLObject;-><init>(Lorg/spongycastle/asn1/x509/CertificateList;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object v0, v1

    goto/16 :goto_0
.end method

.method public final a(Ljava/io/InputStream;)V
    .locals 2

    .prologue
    .line 83
    iput-object p1, p0, Lorg/spongycastle/jce/provider/X509CRLParser;->d:Ljava/io/InputStream;

    .line 84
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/X509CRLParser;->b:Lorg/spongycastle/asn1/ASN1Set;

    .line 85
    const/4 v0, 0x0

    iput v0, p0, Lorg/spongycastle/jce/provider/X509CRLParser;->c:I

    .line 87
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CRLParser;->d:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    if-nez v0, :cond_0

    .line 89
    new-instance v0, Ljava/io/BufferedInputStream;

    iget-object v1, p0, Lorg/spongycastle/jce/provider/X509CRLParser;->d:Ljava/io/InputStream;

    invoke-direct {v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/X509CRLParser;->d:Ljava/io/InputStream;

    .line 91
    :cond_0
    return-void
.end method
