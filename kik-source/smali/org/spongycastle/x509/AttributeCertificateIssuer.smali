.class public Lorg/spongycastle/x509/AttributeCertificateIssuer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/security/cert/CertSelector;
.implements Lorg/spongycastle/util/Selector;


# instance fields
.field final a:Lorg/spongycastle/asn1/ASN1Encodable;


# direct methods
.method public constructor <init>(Lorg/spongycastle/asn1/x509/AttCertIssuer;)V
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x509/AttCertIssuer;->c()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/x509/AttributeCertificateIssuer;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    .line 39
    return-void
.end method

.method private static a(Ljavax/security/auth/x500/X500Principal;Lorg/spongycastle/asn1/x509/GeneralNames;)Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 112
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x509/GeneralNames;->c()[Lorg/spongycastle/asn1/x509/GeneralName;

    move-result-object v2

    move v0, v1

    .line 114
    :goto_0
    array-length v3, v2

    if-eq v0, v3, :cond_0

    .line 116
    aget-object v3, v2, v0

    .line 118
    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/GeneralName;->c()I

    move-result v4

    const/4 v5, 0x4

    if-ne v4, v5, :cond_1

    .line 122
    :try_start_0
    new-instance v4, Ljavax/security/auth/x500/X500Principal;

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/GeneralName;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v3

    invoke-interface {v3}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v3

    invoke-virtual {v3}, Lorg/spongycastle/asn1/ASN1Primitive;->b()[B

    move-result-object v3

    invoke-direct {v4, v3}, Ljavax/security/auth/x500/X500Principal;-><init>([B)V

    invoke-virtual {v4, p0}, Ljavax/security/auth/x500/X500Principal;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v3

    if-eqz v3, :cond_1

    .line 124
    const/4 v1, 0x1

    .line 133
    :cond_0
    return v1

    :catch_0
    move-exception v3

    .line 114
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private b()[Ljava/lang/Object;
    .locals 5

    .prologue
    .line 56
    iget-object v0, p0, Lorg/spongycastle/x509/AttributeCertificateIssuer;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    instance-of v0, v0, Lorg/spongycastle/asn1/x509/V2Form;

    if-eqz v0, :cond_1

    .line 58
    iget-object v0, p0, Lorg/spongycastle/x509/AttributeCertificateIssuer;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    check-cast v0, Lorg/spongycastle/asn1/x509/V2Form;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/V2Form;->c()Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v0

    .line 65
    :goto_0
    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/GeneralNames;->c()[Lorg/spongycastle/asn1/x509/GeneralName;

    move-result-object v1

    .line 67
    new-instance v2, Ljava/util/ArrayList;

    array-length v0, v1

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 69
    const/4 v0, 0x0

    :goto_1
    array-length v3, v1

    if-eq v0, v3, :cond_2

    .line 71
    aget-object v3, v1, v0

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/GeneralName;->c()I

    move-result v3

    const/4 v4, 0x4

    if-ne v3, v4, :cond_0

    .line 75
    :try_start_0
    new-instance v3, Ljavax/security/auth/x500/X500Principal;

    aget-object v4, v1, v0

    invoke-virtual {v4}, Lorg/spongycastle/asn1/x509/GeneralName;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v4

    invoke-interface {v4}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v4

    invoke-virtual {v4}, Lorg/spongycastle/asn1/ASN1Primitive;->b()[B

    move-result-object v4

    invoke-direct {v3, v4}, Ljavax/security/auth/x500/X500Principal;-><init>([B)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 62
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/x509/AttributeCertificateIssuer;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    check-cast v0, Lorg/spongycastle/asn1/x509/GeneralNames;

    goto :goto_0

    .line 80
    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "badly formed Name object"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 85
    :cond_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-interface {v2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 201
    instance-of v0, p1, Ljava/security/cert/X509Certificate;

    if-nez v0, :cond_0

    .line 203
    const/4 v0, 0x0

    .line 206
    :goto_0
    return v0

    :cond_0
    check-cast p1, Ljava/security/cert/Certificate;

    invoke-virtual {p0, p1}, Lorg/spongycastle/x509/AttributeCertificateIssuer;->match(Ljava/security/cert/Certificate;)Z

    move-result v0

    goto :goto_0
.end method

.method public final a()[Ljava/security/Principal;
    .locals 4

    .prologue
    .line 96
    invoke-direct {p0}, Lorg/spongycastle/x509/AttributeCertificateIssuer;->b()[Ljava/lang/Object;

    move-result-object v1

    .line 97
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 99
    const/4 v0, 0x0

    :goto_0
    array-length v3, v1

    if-eq v0, v3, :cond_1

    .line 101
    aget-object v3, v1, v0

    instance-of v3, v3, Ljava/security/Principal;

    if-eqz v3, :cond_0

    .line 103
    aget-object v3, v1, v0

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 107
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/security/Principal;

    invoke-interface {v2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/security/Principal;

    return-object v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 138
    new-instance v0, Lorg/spongycastle/x509/AttributeCertificateIssuer;

    iget-object v1, p0, Lorg/spongycastle/x509/AttributeCertificateIssuer;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-static {v1}, Lorg/spongycastle/asn1/x509/AttCertIssuer;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/AttCertIssuer;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/x509/AttributeCertificateIssuer;-><init>(Lorg/spongycastle/asn1/x509/AttCertIssuer;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 179
    if-ne p1, p0, :cond_0

    .line 181
    const/4 v0, 0x1

    .line 191
    :goto_0
    return v0

    .line 184
    :cond_0
    instance-of v0, p1, Lorg/spongycastle/x509/AttributeCertificateIssuer;

    if-nez v0, :cond_1

    .line 186
    const/4 v0, 0x0

    goto :goto_0

    .line 189
    :cond_1
    check-cast p1, Lorg/spongycastle/x509/AttributeCertificateIssuer;

    .line 191
    iget-object v0, p0, Lorg/spongycastle/x509/AttributeCertificateIssuer;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    iget-object v1, p1, Lorg/spongycastle/x509/AttributeCertificateIssuer;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 196
    iget-object v0, p0, Lorg/spongycastle/x509/AttributeCertificateIssuer;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public match(Ljava/security/cert/Certificate;)Z
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 143
    instance-of v0, p1, Ljava/security/cert/X509Certificate;

    if-nez v0, :cond_0

    move v0, v1

    .line 174
    :goto_0
    return v0

    .line 148
    :cond_0
    check-cast p1, Ljava/security/cert/X509Certificate;

    .line 150
    iget-object v0, p0, Lorg/spongycastle/x509/AttributeCertificateIssuer;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    instance-of v0, v0, Lorg/spongycastle/asn1/x509/V2Form;

    if-eqz v0, :cond_3

    .line 152
    iget-object v0, p0, Lorg/spongycastle/x509/AttributeCertificateIssuer;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    check-cast v0, Lorg/spongycastle/asn1/x509/V2Form;

    .line 153
    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/V2Form;->d()Lorg/spongycastle/asn1/x509/IssuerSerial;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 155
    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/V2Form;->d()Lorg/spongycastle/asn1/x509/IssuerSerial;

    move-result-object v3

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/IssuerSerial;->d()Lorg/spongycastle/asn1/ASN1Integer;

    move-result-object v3

    invoke-virtual {v3}, Lorg/spongycastle/asn1/ASN1Integer;->c()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSerialNumber()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v3

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/V2Form;->d()Lorg/spongycastle/asn1/x509/IssuerSerial;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/IssuerSerial;->c()Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v0

    invoke-static {v3, v0}, Lorg/spongycastle/x509/AttributeCertificateIssuer;->a(Ljavax/security/auth/x500/X500Principal;Lorg/spongycastle/asn1/x509/GeneralNames;)Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_0

    .line 159
    :cond_2
    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/V2Form;->c()Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v0

    .line 160
    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v3

    invoke-static {v3, v0}, Lorg/spongycastle/x509/AttributeCertificateIssuer;->a(Ljavax/security/auth/x500/X500Principal;Lorg/spongycastle/asn1/x509/GeneralNames;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v2

    .line 162
    goto :goto_0

    .line 167
    :cond_3
    iget-object v0, p0, Lorg/spongycastle/x509/AttributeCertificateIssuer;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    check-cast v0, Lorg/spongycastle/asn1/x509/GeneralNames;

    .line 168
    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v3

    invoke-static {v3, v0}, Lorg/spongycastle/x509/AttributeCertificateIssuer;->a(Ljavax/security/auth/x500/X500Principal;Lorg/spongycastle/asn1/x509/GeneralNames;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v2

    .line 170
    goto :goto_0

    :cond_4
    move v0, v1

    .line 174
    goto :goto_0
.end method
