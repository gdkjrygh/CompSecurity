.class final Lorg/bouncycastle/asn1/a;
.super Ljava/lang/Object;


# static fields
.field static final a:Lorg/bouncycastle/asn1/BERSequence;

.field static final b:Lorg/bouncycastle/asn1/BERSet;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/bouncycastle/asn1/BERSequence;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/BERSequence;-><init>()V

    sput-object v0, Lorg/bouncycastle/asn1/a;->a:Lorg/bouncycastle/asn1/BERSequence;

    new-instance v0, Lorg/bouncycastle/asn1/BERSet;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/BERSet;-><init>()V

    sput-object v0, Lorg/bouncycastle/asn1/a;->b:Lorg/bouncycastle/asn1/BERSet;

    return-void
.end method

.method static a(Lorg/bouncycastle/asn1/ASN1EncodableVector;)Lorg/bouncycastle/asn1/BERSequence;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Lorg/bouncycastle/asn1/a;->a:Lorg/bouncycastle/asn1/BERSequence;

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lorg/bouncycastle/asn1/BERSequence;

    invoke-direct {v0, p0}, Lorg/bouncycastle/asn1/BERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    goto :goto_0
.end method
