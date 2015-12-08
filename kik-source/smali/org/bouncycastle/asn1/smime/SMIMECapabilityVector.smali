.class public Lorg/bouncycastle/asn1/smime/SMIMECapabilityVector;
.super Ljava/lang/Object;


# instance fields
.field private a:Lorg/bouncycastle/asn1/ASN1EncodableVector;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/asn1/smime/SMIMECapabilityVector;->a:Lorg/bouncycastle/asn1/ASN1EncodableVector;

    return-void
.end method
