.class public Lorg/spongycastle/x509/PKIXCertPathReviewer;
.super Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;
.source "SourceFile"


# static fields
.field private static final q:Ljava/lang/String;

.field private static final r:Ljava/lang/String;

.field private static final s:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 87
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->B:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/x509/PKIXCertPathReviewer;->q:Ljava/lang/String;

    .line 88
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->p:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/x509/PKIXCertPathReviewer;->r:Ljava/lang/String;

    .line 89
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->x:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/x509/PKIXCertPathReviewer;->s:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 189
    invoke-direct {p0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;-><init>()V

    .line 191
    return-void
.end method
