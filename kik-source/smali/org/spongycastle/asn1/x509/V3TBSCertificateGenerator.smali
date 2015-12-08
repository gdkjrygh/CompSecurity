.class public Lorg/spongycastle/asn1/x509/V3TBSCertificateGenerator;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Lorg/spongycastle/asn1/DERTaggedObject;


# direct methods
.method public constructor <init>()V
    .locals 5

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v1, 0x1

    const/4 v2, 0x0

    new-instance v3, Lorg/spongycastle/asn1/ASN1Integer;

    const/4 v4, 0x2

    invoke-direct {v3, v4}, Lorg/spongycastle/asn1/ASN1Integer;-><init>(I)V

    invoke-direct {v0, v1, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/V3TBSCertificateGenerator;->a:Lorg/spongycastle/asn1/DERTaggedObject;

    .line 47
    return-void
.end method
