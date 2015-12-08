.class public Lorg/spongycastle/asn1/eac/UnsignedInteger;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Ljava/math/BigInteger;


# direct methods
.method public constructor <init>(ILjava/math/BigInteger;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 20
    iput p1, p0, Lorg/spongycastle/asn1/eac/UnsignedInteger;->a:I

    .line 21
    iput-object p2, p0, Lorg/spongycastle/asn1/eac/UnsignedInteger;->b:Ljava/math/BigInteger;

    .line 22
    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 72
    new-instance v2, Lorg/spongycastle/asn1/DERTaggedObject;

    iget v3, p0, Lorg/spongycastle/asn1/eac/UnsignedInteger;->a:I

    new-instance v4, Lorg/spongycastle/asn1/DEROctetString;

    iget-object v0, p0, Lorg/spongycastle/asn1/eac/UnsignedInteger;->b:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v1

    aget-byte v0, v1, v7

    if-nez v0, :cond_0

    array-length v0, v1

    add-int/lit8 v0, v0, -0x1

    new-array v0, v0, [B

    const/4 v5, 0x1

    array-length v6, v0

    invoke-static {v1, v5, v0, v7, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_0
    invoke-direct {v4, v0}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v2, v7, v3, v4}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    return-object v2

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method
