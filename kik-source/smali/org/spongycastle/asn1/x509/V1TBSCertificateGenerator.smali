.class public Lorg/spongycastle/asn1/x509/V1TBSCertificateGenerator;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Lorg/spongycastle/asn1/DERTaggedObject;


# direct methods
.method public constructor <init>()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v1, 0x1

    new-instance v2, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-direct {v2, v3}, Lorg/spongycastle/asn1/ASN1Integer;-><init>(I)V

    invoke-direct {v0, v1, v3, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/V1TBSCertificateGenerator;->a:Lorg/spongycastle/asn1/DERTaggedObject;

    .line 38
    return-void
.end method
