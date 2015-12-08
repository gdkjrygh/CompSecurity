.class public Lorg/spongycastle/crypto/tls/Certificate;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lorg/spongycastle/crypto/tls/Certificate;


# instance fields
.field protected b:[Lorg/spongycastle/asn1/x509/X509CertificateStructure;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 19
    new-instance v0, Lorg/spongycastle/crypto/tls/Certificate;

    const/4 v1, 0x0

    new-array v1, v1, [Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/tls/Certificate;-><init>([Lorg/spongycastle/asn1/x509/X509CertificateStructure;)V

    sput-object v0, Lorg/spongycastle/crypto/tls/Certificate;->a:Lorg/spongycastle/crypto/tls/Certificate;

    return-void
.end method

.method private constructor <init>([Lorg/spongycastle/asn1/x509/X509CertificateStructure;)V
    .locals 0

    .prologue
    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    iput-object p1, p0, Lorg/spongycastle/crypto/tls/Certificate;->b:[Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    .line 105
    return-void
.end method
