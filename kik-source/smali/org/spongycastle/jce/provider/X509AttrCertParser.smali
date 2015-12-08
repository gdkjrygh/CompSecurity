.class public Lorg/spongycastle/jce/provider/X509AttrCertParser;
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
    .line 25
    new-instance v0, Lorg/spongycastle/jce/provider/PEMUtil;

    const-string v1, "ATTRIBUTE CERTIFICATE"

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/PEMUtil;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/jce/provider/X509AttrCertParser;->a:Lorg/spongycastle/jce/provider/PEMUtil;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 22
    invoke-direct {p0}, Lorg/spongycastle/x509/X509StreamParserSpi;-><init>()V

    .line 27
    iput-object v1, p0, Lorg/spongycastle/jce/provider/X509AttrCertParser;->b:Lorg/spongycastle/asn1/ASN1Set;

    .line 28
    const/4 v0, 0x0

    iput v0, p0, Lorg/spongycastle/jce/provider/X509AttrCertParser;->c:I

    .line 29
    iput-object v1, p0, Lorg/spongycastle/jce/provider/X509AttrCertParser;->d:Ljava/io/InputStream;

    return-void
.end method

.method private b()Lorg/spongycastle/x509/X509AttributeCertificate;
    .locals 3

    .prologue
    .line 56
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509AttrCertParser;->b:Lorg/spongycastle/asn1/ASN1Set;

    if-eqz v0, :cond_1

    .line 58
    :cond_0
    iget v0, p0, Lorg/spongycastle/jce/provider/X509AttrCertParser;->c:I

    iget-object v1, p0, Lorg/spongycastle/jce/provider/X509AttrCertParser;->b:Lorg/spongycastle/asn1/ASN1Set;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1Set;->d()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 60
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509AttrCertParser;->b:Lorg/spongycastle/asn1/ASN1Set;

    iget v1, p0, Lorg/spongycastle/jce/provider/X509AttrCertParser;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/spongycastle/jce/provider/X509AttrCertParser;->c:I

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1Set;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    .line 62
    instance-of v0, v1, Lorg/spongycastle/asn1/ASN1TaggedObject;

    if-eqz v0, :cond_0

    move-object v0, v1

    check-cast v0, Lorg/spongycastle/asn1/ASN1TaggedObject;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->c()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    .line 64
    new-instance v0, Lorg/spongycastle/x509/X509V2AttributeCertificate;

    check-cast v1, Lorg/spongycastle/asn1/ASN1TaggedObject;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;Z)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1Sequence;->b()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/x509/X509V2AttributeCertificate;-><init>([B)V

    .line 70
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v0, 0x0

    .line 104
    :try_start_0
    iget-object v1, p0, Lorg/spongycastle/jce/provider/X509AttrCertParser;->b:Lorg/spongycastle/asn1/ASN1Set;

    if-eqz v1, :cond_2

    .line 106
    iget v1, p0, Lorg/spongycastle/jce/provider/X509AttrCertParser;->c:I

    iget-object v2, p0, Lorg/spongycastle/jce/provider/X509AttrCertParser;->b:Lorg/spongycastle/asn1/ASN1Set;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/ASN1Set;->d()I

    move-result v2

    if-eq v1, v2, :cond_1

    .line 108
    invoke-direct {p0}, Lorg/spongycastle/jce/provider/X509AttrCertParser;->b()Lorg/spongycastle/x509/X509AttributeCertificate;

    move-result-object v0

    .line 134
    :cond_0
    :goto_0
    return-object v0

    .line 112
    :cond_1
    const/4 v1, 0x0

    iput-object v1, p0, Lorg/spongycastle/jce/provider/X509AttrCertParser;->b:Lorg/spongycastle/asn1/ASN1Set;

    .line 113
    const/4 v1, 0x0

    iput v1, p0, Lorg/spongycastle/jce/provider/X509AttrCertParser;->c:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 137
    :catch_0
    move-exception v0

    .line 139
    new-instance v1, Lorg/spongycastle/x509/util/StreamParsingException;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/x509/util/StreamParsingException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 118
    :cond_2
    :try_start_1
    iget-object v1, p0, Lorg/spongycastle/jce/provider/X509AttrCertParser;->d:Ljava/io/InputStream;

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Ljava/io/InputStream;->mark(I)V

    .line 119
    iget-object v1, p0, Lorg/spongycastle/jce/provider/X509AttrCertParser;->d:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    move-result v1

    .line 121
    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    .line 126
    const/16 v2, 0x30

    if-eq v1, v2, :cond_3

    .line 128
    iget-object v1, p0, Lorg/spongycastle/jce/provider/X509AttrCertParser;->d:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->reset()V

    .line 129
    iget-object v1, p0, Lorg/spongycastle/jce/provider/X509AttrCertParser;->d:Ljava/io/InputStream;

    sget-object v2, Lorg/spongycastle/jce/provider/X509AttrCertParser;->a:Lorg/spongycastle/jce/provider/PEMUtil;

    invoke-virtual {v2, v1}, Lorg/spongycastle/jce/provider/PEMUtil;->a(Ljava/io/InputStream;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v0, Lorg/spongycastle/x509/X509V2AttributeCertificate;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1Sequence;->b()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/x509/X509V2AttributeCertificate;-><init>([B)V

    goto :goto_0

    .line 133
    :cond_3
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509AttrCertParser;->d:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V

    .line 134
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509AttrCertParser;->d:Ljava/io/InputStream;

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

    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/SignedData;->c()Lorg/spongycastle/asn1/ASN1Set;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/X509AttrCertParser;->b:Lorg/spongycastle/asn1/ASN1Set;

    invoke-direct {p0}, Lorg/spongycastle/jce/provider/X509AttrCertParser;->b()Lorg/spongycastle/x509/X509AttributeCertificate;

    move-result-object v0

    goto/16 :goto_0

    :cond_4
    new-instance v1, Lorg/spongycastle/x509/X509V2AttributeCertificate;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Sequence;->b()[B

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/spongycastle/x509/X509V2AttributeCertificate;-><init>([B)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object v0, v1

    goto/16 :goto_0
.end method

.method public final a(Ljava/io/InputStream;)V
    .locals 2

    .prologue
    .line 89
    iput-object p1, p0, Lorg/spongycastle/jce/provider/X509AttrCertParser;->d:Ljava/io/InputStream;

    .line 90
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/X509AttrCertParser;->b:Lorg/spongycastle/asn1/ASN1Set;

    .line 91
    const/4 v0, 0x0

    iput v0, p0, Lorg/spongycastle/jce/provider/X509AttrCertParser;->c:I

    .line 93
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509AttrCertParser;->d:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    if-nez v0, :cond_0

    .line 95
    new-instance v0, Ljava/io/BufferedInputStream;

    iget-object v1, p0, Lorg/spongycastle/jce/provider/X509AttrCertParser;->d:Ljava/io/InputStream;

    invoke-direct {v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/X509AttrCertParser;->d:Ljava/io/InputStream;

    .line 97
    :cond_0
    return-void
.end method
