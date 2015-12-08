.class public Lorg/spongycastle/x509/X509V2AttributeCertificate;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/x509/X509AttributeCertificate;


# instance fields
.field private a:Lorg/spongycastle/asn1/x509/AttributeCertificate;

.field private b:Ljava/util/Date;

.field private c:Ljava/util/Date;


# direct methods
.method private constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    .prologue
    .line 67
    invoke-static {p1}, Lorg/spongycastle/x509/X509V2AttributeCertificate;->a(Ljava/io/InputStream;)Lorg/spongycastle/asn1/x509/AttributeCertificate;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/spongycastle/x509/X509V2AttributeCertificate;-><init>(Lorg/spongycastle/asn1/x509/AttributeCertificate;)V

    .line 68
    return-void
.end method

.method private constructor <init>(Lorg/spongycastle/asn1/x509/AttributeCertificate;)V
    .locals 2

    .prologue
    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    iput-object p1, p0, Lorg/spongycastle/x509/X509V2AttributeCertificate;->a:Lorg/spongycastle/asn1/x509/AttributeCertificate;

    .line 85
    :try_start_0
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x509/AttributeCertificate;->c()Lorg/spongycastle/asn1/x509/AttributeCertificateInfo;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/AttributeCertificateInfo;->f()Lorg/spongycastle/asn1/x509/AttCertValidityPeriod;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/AttCertValidityPeriod;->d()Lorg/spongycastle/asn1/DERGeneralizedTime;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERGeneralizedTime;->d()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/x509/X509V2AttributeCertificate;->c:Ljava/util/Date;

    .line 86
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x509/AttributeCertificate;->c()Lorg/spongycastle/asn1/x509/AttributeCertificateInfo;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/AttributeCertificateInfo;->f()Lorg/spongycastle/asn1/x509/AttCertValidityPeriod;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/AttCertValidityPeriod;->c()Lorg/spongycastle/asn1/DERGeneralizedTime;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERGeneralizedTime;->d()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/x509/X509V2AttributeCertificate;->b:Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    return-void

    .line 90
    :catch_0
    move-exception v0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "invalid data structure in certificate!"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>([B)V
    .locals 1

    .prologue
    .line 74
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {p0, v0}, Lorg/spongycastle/x509/X509V2AttributeCertificate;-><init>(Ljava/io/InputStream;)V

    .line 75
    return-void
.end method

.method private a(Z)Ljava/util/Set;
    .locals 5

    .prologue
    .line 235
    iget-object v0, p0, Lorg/spongycastle/x509/X509V2AttributeCertificate;->a:Lorg/spongycastle/asn1/x509/AttributeCertificate;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/AttributeCertificate;->c()Lorg/spongycastle/asn1/x509/AttributeCertificateInfo;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/AttributeCertificateInfo;->h()Lorg/spongycastle/asn1/x509/Extensions;

    move-result-object v2

    .line 237
    if-eqz v2, :cond_2

    .line 239
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 240
    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/Extensions;->c()Ljava/util/Enumeration;

    move-result-object v3

    .line 242
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 244
    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 245
    invoke-virtual {v2, v0}, Lorg/spongycastle/asn1/x509/Extensions;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)Lorg/spongycastle/asn1/x509/Extension;

    move-result-object v4

    .line 247
    invoke-virtual {v4}, Lorg/spongycastle/asn1/x509/Extension;->a()Z

    move-result v4

    if-ne v4, p1, :cond_0

    .line 249
    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    move-object v0, v1

    .line 256
    :goto_1
    return-object v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private static a(Ljava/io/InputStream;)Lorg/spongycastle/asn1/x509/AttributeCertificate;
    .locals 4

    .prologue
    .line 51
    :try_start_0
    new-instance v0, Lorg/spongycastle/asn1/ASN1InputStream;

    invoke-direct {v0, p0}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/AttributeCertificate;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/AttributeCertificate;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    .line 53
    :catch_0
    move-exception v0

    throw v0

    .line 57
    :catch_1
    move-exception v0

    .line 59
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "exception decoding certificate structure: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final a()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lorg/spongycastle/x509/X509V2AttributeCertificate;->a:Lorg/spongycastle/asn1/x509/AttributeCertificate;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/AttributeCertificate;->c()Lorg/spongycastle/asn1/x509/AttributeCertificateInfo;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/AttributeCertificateInfo;->e()Lorg/spongycastle/asn1/ASN1Integer;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Integer;->c()Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/util/Date;)V
    .locals 3

    .prologue
    .line 154
    iget-object v0, p0, Lorg/spongycastle/x509/X509V2AttributeCertificate;->c:Ljava/util/Date;

    invoke-virtual {p1, v0}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 156
    new-instance v0, Ljava/security/cert/CertificateExpiredException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "certificate expired on "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lorg/spongycastle/x509/X509V2AttributeCertificate;->c:Ljava/util/Date;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/cert/CertificateExpiredException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 159
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/x509/X509V2AttributeCertificate;->b:Ljava/util/Date;

    invoke-virtual {p1, v0}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 161
    new-instance v0, Ljava/security/cert/CertificateNotYetValidException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "certificate not valid till "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lorg/spongycastle/x509/X509V2AttributeCertificate;->b:Ljava/util/Date;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/cert/CertificateNotYetValidException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 163
    :cond_1
    return-void
.end method

.method public final a(Ljava/lang/String;)[Lorg/spongycastle/x509/X509Attribute;
    .locals 5

    .prologue
    .line 291
    iget-object v0, p0, Lorg/spongycastle/x509/X509V2AttributeCertificate;->a:Lorg/spongycastle/asn1/x509/AttributeCertificate;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/AttributeCertificate;->c()Lorg/spongycastle/asn1/x509/AttributeCertificateInfo;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/AttributeCertificateInfo;->g()Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    .line 292
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 294
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v3

    if-eq v0, v3, :cond_1

    .line 296
    new-instance v3, Lorg/spongycastle/x509/X509Attribute;

    invoke-virtual {v1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v4

    invoke-direct {v3, v4}, Lorg/spongycastle/x509/X509Attribute;-><init>(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 297
    iget-object v4, v3, Lorg/spongycastle/x509/X509Attribute;->a:Lorg/spongycastle/asn1/x509/Attribute;

    invoke-virtual {v4}, Lorg/spongycastle/asn1/x509/Attribute;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v4

    invoke-virtual {v4}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 299
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 294
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 303
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 305
    const/4 v0, 0x0

    .line 308
    :goto_1
    return-object v0

    :cond_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lorg/spongycastle/x509/X509Attribute;

    invoke-interface {v2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/spongycastle/x509/X509Attribute;

    goto :goto_1
.end method

.method public final b()Ljava/util/Date;
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lorg/spongycastle/x509/X509V2AttributeCertificate;->c:Ljava/util/Date;

    return-object v0
.end method

.method public final c()Lorg/spongycastle/x509/AttributeCertificateHolder;
    .locals 2

    .prologue
    .line 106
    new-instance v1, Lorg/spongycastle/x509/AttributeCertificateHolder;

    iget-object v0, p0, Lorg/spongycastle/x509/X509V2AttributeCertificate;->a:Lorg/spongycastle/asn1/x509/AttributeCertificate;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/AttributeCertificate;->c()Lorg/spongycastle/asn1/x509/AttributeCertificateInfo;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/AttributeCertificateInfo;->c()Lorg/spongycastle/asn1/x509/Holder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Object;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/x509/AttributeCertificateHolder;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    return-object v1
.end method

.method public final d()Lorg/spongycastle/x509/AttributeCertificateIssuer;
    .locals 2

    .prologue
    .line 111
    new-instance v0, Lorg/spongycastle/x509/AttributeCertificateIssuer;

    iget-object v1, p0, Lorg/spongycastle/x509/X509V2AttributeCertificate;->a:Lorg/spongycastle/asn1/x509/AttributeCertificate;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x509/AttributeCertificate;->c()Lorg/spongycastle/asn1/x509/AttributeCertificateInfo;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x509/AttributeCertificateInfo;->d()Lorg/spongycastle/asn1/x509/AttCertIssuer;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/x509/AttributeCertificateIssuer;-><init>(Lorg/spongycastle/asn1/x509/AttCertIssuer;)V

    return-object v0
.end method

.method public final e()[B
    .locals 1

    .prologue
    .line 205
    iget-object v0, p0, Lorg/spongycastle/x509/X509V2AttributeCertificate;->a:Lorg/spongycastle/asn1/x509/AttributeCertificate;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/AttributeCertificate;->b()[B

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 314
    if-ne p1, p0, :cond_1

    .line 316
    const/4 v0, 0x1

    .line 335
    :cond_0
    :goto_0
    return v0

    .line 319
    :cond_1
    instance-of v1, p1, Lorg/spongycastle/x509/X509AttributeCertificate;

    if-eqz v1, :cond_0

    .line 324
    check-cast p1, Lorg/spongycastle/x509/X509AttributeCertificate;

    .line 328
    :try_start_0
    iget-object v1, p0, Lorg/spongycastle/x509/X509V2AttributeCertificate;->a:Lorg/spongycastle/asn1/x509/AttributeCertificate;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x509/AttributeCertificate;->b()[B

    move-result-object v1

    .line 329
    invoke-interface {p1}, Lorg/spongycastle/x509/X509AttributeCertificate;->e()[B

    move-result-object v2

    .line 331
    invoke-static {v1, v2}, Lorg/spongycastle/util/Arrays;->a([B[B)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    .line 335
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public getCriticalExtensionOIDs()Ljava/util/Set;
    .locals 1

    .prologue
    .line 266
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lorg/spongycastle/x509/X509V2AttributeCertificate;->a(Z)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getExtensionValue(Ljava/lang/String;)[B
    .locals 4

    .prologue
    .line 210
    iget-object v0, p0, Lorg/spongycastle/x509/X509V2AttributeCertificate;->a:Lorg/spongycastle/asn1/x509/AttributeCertificate;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/AttributeCertificate;->c()Lorg/spongycastle/asn1/x509/AttributeCertificateInfo;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/AttributeCertificateInfo;->h()Lorg/spongycastle/asn1/x509/Extensions;

    move-result-object v0

    .line 212
    if-eqz v0, :cond_0

    .line 214
    new-instance v1, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v1, p1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/x509/Extensions;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)Lorg/spongycastle/asn1/x509/Extension;

    move-result-object v0

    .line 216
    if-eqz v0, :cond_0

    .line 220
    :try_start_0
    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/Extension;->b()Lorg/spongycastle/asn1/ASN1OctetString;

    move-result-object v0

    const-string v1, "DER"

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1OctetString;->a(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 229
    :goto_0
    return-object v0

    .line 222
    :catch_0
    move-exception v0

    .line 224
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "error encoding "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 229
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getNonCriticalExtensionOIDs()Ljava/util/Set;
    .locals 1

    .prologue
    .line 261
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/spongycastle/x509/X509V2AttributeCertificate;->a(Z)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public hasUnsupportedCriticalExtension()Z
    .locals 1

    .prologue
    .line 271
    invoke-virtual {p0}, Lorg/spongycastle/x509/X509V2AttributeCertificate;->getCriticalExtensionOIDs()Ljava/util/Set;

    move-result-object v0

    .line 273
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 343
    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/x509/X509V2AttributeCertificate;->a:Lorg/spongycastle/asn1/x509/AttributeCertificate;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/AttributeCertificate;->b()[B

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/util/Arrays;->a([B)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 347
    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method
