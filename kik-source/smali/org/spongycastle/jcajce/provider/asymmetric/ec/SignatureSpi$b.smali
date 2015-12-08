.class final Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/jcajce/provider/asymmetric/util/DSAEncoder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 241
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 241
    invoke-direct {p0}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/math/BigInteger;Ljava/math/BigInteger;)[B
    .locals 2

    .prologue
    .line 249
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 251
    new-instance v1, Lorg/spongycastle/asn1/DERInteger;

    invoke-direct {v1, p1}, Lorg/spongycastle/asn1/DERInteger;-><init>(Ljava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 252
    new-instance v1, Lorg/spongycastle/asn1/DERInteger;

    invoke-direct {v1, p2}, Lorg/spongycastle/asn1/DERInteger;-><init>(Ljava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 254
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    const-string v0, "DER"

    invoke-virtual {v1, v0}, Lorg/spongycastle/asn1/DERSequence;->a(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method public final a([B)[Ljava/math/BigInteger;
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 261
    invoke-static {p1}, Lorg/spongycastle/asn1/ASN1Primitive;->a([B)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Sequence;

    .line 262
    const/4 v1, 0x2

    new-array v2, v1, [Ljava/math/BigInteger;

    .line 264
    invoke-virtual {v0, v3}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/DERInteger;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/DERInteger;->c()Ljava/math/BigInteger;

    move-result-object v1

    aput-object v1, v2, v3

    .line 265
    invoke-virtual {v0, v4}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/DERInteger;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERInteger;->c()Ljava/math/BigInteger;

    move-result-object v0

    aput-object v0, v2, v4

    .line 267
    return-object v2
.end method
