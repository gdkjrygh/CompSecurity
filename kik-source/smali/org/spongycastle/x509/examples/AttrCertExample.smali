.class public Lorg/spongycastle/x509/examples/AttrCertExample;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static a:Lorg/spongycastle/x509/X509V1CertificateGenerator;

.field static b:Lorg/spongycastle/x509/X509V3CertificateGenerator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 35
    new-instance v0, Lorg/spongycastle/x509/X509V1CertificateGenerator;

    invoke-direct {v0}, Lorg/spongycastle/x509/X509V1CertificateGenerator;-><init>()V

    sput-object v0, Lorg/spongycastle/x509/examples/AttrCertExample;->a:Lorg/spongycastle/x509/X509V1CertificateGenerator;

    .line 36
    new-instance v0, Lorg/spongycastle/x509/X509V3CertificateGenerator;

    invoke-direct {v0}, Lorg/spongycastle/x509/X509V3CertificateGenerator;-><init>()V

    sput-object v0, Lorg/spongycastle/x509/examples/AttrCertExample;->b:Lorg/spongycastle/x509/X509V3CertificateGenerator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
