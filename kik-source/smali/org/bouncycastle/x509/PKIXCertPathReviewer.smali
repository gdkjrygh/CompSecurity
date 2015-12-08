.class public Lorg/bouncycastle/x509/PKIXCertPathReviewer;
.super Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;


# static fields
.field private static final q:Ljava/lang/String;

.field private static final r:Ljava/lang/String;

.field private static final s:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->B:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/x509/PKIXCertPathReviewer;->q:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->p:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/x509/PKIXCertPathReviewer;->r:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->x:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/x509/PKIXCertPathReviewer;->s:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;-><init>()V

    return-void
.end method
