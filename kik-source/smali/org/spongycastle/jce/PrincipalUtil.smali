.class public Lorg/spongycastle/jce/PrincipalUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/security/cert/X509Certificate;)Lorg/spongycastle/jce/X509Principal;
    .locals 2

    .prologue
    .line 32
    :try_start_0
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getTBSCertificate()[B

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Primitive;->a([B)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/TBSCertificateStructure;

    move-result-object v0

    .line 35
    new-instance v1, Lorg/spongycastle/jce/X509Principal;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->d()Lorg/spongycastle/asn1/x500/X500Name;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/X509Name;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/X509Name;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/spongycastle/jce/X509Principal;-><init>(Lorg/spongycastle/asn1/x509/X509Name;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 37
    :catch_0
    move-exception v0

    .line 39
    new-instance v1, Ljava/security/cert/CertificateEncodingException;

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/cert/CertificateEncodingException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static b(Ljava/security/cert/X509Certificate;)Lorg/spongycastle/jce/X509Principal;
    .locals 2

    .prologue
    .line 52
    :try_start_0
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getTBSCertificate()[B

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Primitive;->a([B)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/TBSCertificateStructure;

    move-result-object v0

    .line 54
    new-instance v1, Lorg/spongycastle/jce/X509Principal;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->e()Lorg/spongycastle/asn1/x500/X500Name;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/X509Name;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/X509Name;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/spongycastle/jce/X509Principal;-><init>(Lorg/spongycastle/asn1/x509/X509Name;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 56
    :catch_0
    move-exception v0

    .line 58
    new-instance v1, Ljava/security/cert/CertificateEncodingException;

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/cert/CertificateEncodingException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
