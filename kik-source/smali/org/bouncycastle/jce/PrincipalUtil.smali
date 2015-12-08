.class public Lorg/bouncycastle/jce/PrincipalUtil;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/security/cert/X509Certificate;)Lorg/bouncycastle/jce/X509Principal;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getTBSCertificate()[B

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/ASN1Object;->a([B)Lorg/bouncycastle/asn1/ASN1Object;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;

    move-result-object v0

    new-instance v1, Lorg/bouncycastle/jce/X509Principal;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->f()Lorg/bouncycastle/asn1/x509/X509Name;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/bouncycastle/jce/X509Principal;-><init>(Lorg/bouncycastle/asn1/x509/X509Name;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    new-instance v1, Ljava/security/cert/CertificateEncodingException;

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/cert/CertificateEncodingException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static b(Ljava/security/cert/X509Certificate;)Lorg/bouncycastle/jce/X509Principal;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getTBSCertificate()[B

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/ASN1Object;->a([B)Lorg/bouncycastle/asn1/ASN1Object;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;

    move-result-object v0

    new-instance v1, Lorg/bouncycastle/jce/X509Principal;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;->g()Lorg/bouncycastle/asn1/x509/X509Name;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/bouncycastle/jce/X509Principal;-><init>(Lorg/bouncycastle/asn1/x509/X509Name;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    new-instance v1, Ljava/security/cert/CertificateEncodingException;

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/cert/CertificateEncodingException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
