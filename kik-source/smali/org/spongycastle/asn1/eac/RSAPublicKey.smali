.class public Lorg/spongycastle/asn1/eac/RSAPublicKey;
.super Lorg/spongycastle/asn1/eac/PublicKeyDataObject;
.source "SourceFile"


# static fields
.field private static d:I

.field private static e:I


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field private b:Ljava/math/BigInteger;

.field private c:Ljava/math/BigInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    const/4 v0, 0x1

    sput v0, Lorg/spongycastle/asn1/eac/RSAPublicKey;->d:I

    .line 33
    const/4 v0, 0x2

    sput v0, Lorg/spongycastle/asn1/eac/RSAPublicKey;->e:I

    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 4

    .prologue
    .line 113
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 115
    iget-object v1, p0, Lorg/spongycastle/asn1/eac/RSAPublicKey;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 116
    new-instance v1, Lorg/spongycastle/asn1/eac/UnsignedInteger;

    const/4 v2, 0x1

    iget-object v3, p0, Lorg/spongycastle/asn1/eac/RSAPublicKey;->b:Ljava/math/BigInteger;

    invoke-direct {v1, v2, v3}, Lorg/spongycastle/asn1/eac/UnsignedInteger;-><init>(ILjava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 117
    new-instance v1, Lorg/spongycastle/asn1/eac/UnsignedInteger;

    const/4 v2, 0x2

    iget-object v3, p0, Lorg/spongycastle/asn1/eac/RSAPublicKey;->c:Ljava/math/BigInteger;

    invoke-direct {v1, v2, v3}, Lorg/spongycastle/asn1/eac/UnsignedInteger;-><init>(ILjava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 119
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
