.class public Lorg/spongycastle/asn1/x9/X9FieldElement;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# static fields
.field private static b:Lorg/spongycastle/asn1/x9/X9IntegerConverter;


# instance fields
.field protected a:Lorg/spongycastle/math/ec/ECFieldElement;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 19
    new-instance v0, Lorg/spongycastle/asn1/x9/X9IntegerConverter;

    invoke-direct {v0}, Lorg/spongycastle/asn1/x9/X9IntegerConverter;-><init>()V

    sput-object v0, Lorg/spongycastle/asn1/x9/X9FieldElement;->b:Lorg/spongycastle/asn1/x9/X9IntegerConverter;

    return-void
.end method

.method public constructor <init>(IIIILorg/spongycastle/asn1/ASN1OctetString;)V
    .locals 6

    .prologue
    .line 33
    new-instance v0, Lorg/spongycastle/math/ec/ECFieldElement$F2m;

    new-instance v5, Ljava/math/BigInteger;

    const/4 v1, 0x1

    invoke-virtual {p5}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v2

    invoke-direct {v5, v1, v2}, Ljava/math/BigInteger;-><init>(I[B)V

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lorg/spongycastle/math/ec/ECFieldElement$F2m;-><init>(IIIILjava/math/BigInteger;)V

    invoke-direct {p0, v0}, Lorg/spongycastle/asn1/x9/X9FieldElement;-><init>(Lorg/spongycastle/math/ec/ECFieldElement;)V

    .line 34
    return-void
.end method

.method public constructor <init>(Ljava/math/BigInteger;Lorg/spongycastle/asn1/ASN1OctetString;)V
    .locals 4

    .prologue
    .line 28
    new-instance v0, Lorg/spongycastle/math/ec/ECFieldElement$Fp;

    new-instance v1, Ljava/math/BigInteger;

    const/4 v2, 0x1

    invoke-virtual {p2}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/math/BigInteger;-><init>(I[B)V

    invoke-direct {v0, p1, v1}, Lorg/spongycastle/math/ec/ECFieldElement$Fp;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-direct {p0, v0}, Lorg/spongycastle/asn1/x9/X9FieldElement;-><init>(Lorg/spongycastle/math/ec/ECFieldElement;)V

    .line 29
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/math/ec/ECFieldElement;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 23
    iput-object p1, p0, Lorg/spongycastle/asn1/x9/X9FieldElement;->a:Lorg/spongycastle/math/ec/ECFieldElement;

    .line 24
    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 59
    iget-object v0, p0, Lorg/spongycastle/asn1/x9/X9FieldElement;->a:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-static {v0}, Lorg/spongycastle/asn1/x9/X9IntegerConverter;->a(Lorg/spongycastle/math/ec/ECFieldElement;)I

    move-result v0

    .line 60
    iget-object v1, p0, Lorg/spongycastle/asn1/x9/X9FieldElement;->a:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v1}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {v1, v0}, Lorg/spongycastle/asn1/x9/X9IntegerConverter;->a(Ljava/math/BigInteger;I)[B

    move-result-object v0

    .line 62
    new-instance v1, Lorg/spongycastle/asn1/DEROctetString;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    return-object v1
.end method

.method public final c()Lorg/spongycastle/math/ec/ECFieldElement;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lorg/spongycastle/asn1/x9/X9FieldElement;->a:Lorg/spongycastle/math/ec/ECFieldElement;

    return-object v0
.end method
