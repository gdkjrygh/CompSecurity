.class final Lorg/bouncycastle/asn1/c;
.super Ljava/lang/Object;


# static fields
.field static final a:Lorg/bouncycastle/asn1/DERSequence;

.field static final b:Lorg/bouncycastle/asn1/DERSet;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/DERSequence;-><init>()V

    sput-object v0, Lorg/bouncycastle/asn1/c;->a:Lorg/bouncycastle/asn1/DERSequence;

    new-instance v0, Lorg/bouncycastle/asn1/DERSet;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/DERSet;-><init>()V

    sput-object v0, Lorg/bouncycastle/asn1/c;->b:Lorg/bouncycastle/asn1/DERSet;

    return-void
.end method

.method static a(Lorg/bouncycastle/asn1/ASN1EncodableVector;)Lorg/bouncycastle/asn1/DERSequence;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Lorg/bouncycastle/asn1/c;->a:Lorg/bouncycastle/asn1/DERSequence;

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v0, p0}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    goto :goto_0
.end method

.method static b(Lorg/bouncycastle/asn1/ASN1EncodableVector;)Lorg/bouncycastle/asn1/DERSet;
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Lorg/bouncycastle/asn1/c;->b:Lorg/bouncycastle/asn1/DERSet;

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lorg/bouncycastle/asn1/DERSet;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;Z)V

    goto :goto_0
.end method
