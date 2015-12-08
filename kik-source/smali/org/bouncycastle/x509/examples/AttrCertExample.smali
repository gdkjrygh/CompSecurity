.class public Lorg/bouncycastle/x509/examples/AttrCertExample;
.super Ljava/lang/Object;


# static fields
.field static a:Lorg/bouncycastle/x509/X509V1CertificateGenerator;

.field static b:Lorg/bouncycastle/x509/X509V3CertificateGenerator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/bouncycastle/x509/X509V1CertificateGenerator;

    invoke-direct {v0}, Lorg/bouncycastle/x509/X509V1CertificateGenerator;-><init>()V

    sput-object v0, Lorg/bouncycastle/x509/examples/AttrCertExample;->a:Lorg/bouncycastle/x509/X509V1CertificateGenerator;

    new-instance v0, Lorg/bouncycastle/x509/X509V3CertificateGenerator;

    invoke-direct {v0}, Lorg/bouncycastle/x509/X509V3CertificateGenerator;-><init>()V

    sput-object v0, Lorg/bouncycastle/x509/examples/AttrCertExample;->b:Lorg/bouncycastle/x509/X509V3CertificateGenerator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
