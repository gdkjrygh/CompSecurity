.class public Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field a:Lorg/spongycastle/asn1/ASN1Integer;

.field b:Lorg/spongycastle/asn1/ASN1OctetString;


# direct methods
.method public constructor <init>(I[B)V
    .locals 1

    .prologue
    .line 45
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 46
    new-instance v0, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-direct {v0, p1}, Lorg/spongycastle/asn1/ASN1Integer;-><init>(I)V

    iput-object v0, p0, Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;->a:Lorg/spongycastle/asn1/ASN1Integer;

    .line 47
    new-instance v0, Lorg/spongycastle/asn1/DEROctetString;

    invoke-direct {v0, p2}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    iput-object v0, p0, Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;->b:Lorg/spongycastle/asn1/ASN1OctetString;

    .line 48
    return-void
.end method

.method private constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 52
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 53
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v0

    if-ne v0, v2, :cond_0

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;->a:Lorg/spongycastle/asn1/ASN1Integer;

    .line 56
    invoke-virtual {p1, v1}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1OctetString;

    iput-object v0, p0, Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;->b:Lorg/spongycastle/asn1/ASN1OctetString;

    .line 63
    :goto_0
    return-void

    .line 60
    :cond_0
    invoke-virtual {p1, v1}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Integer;

    iput-object v0, p0, Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;->a:Lorg/spongycastle/asn1/ASN1Integer;

    .line 61
    invoke-virtual {p1, v2}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1OctetString;

    iput-object v0, p0, Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;->b:Lorg/spongycastle/asn1/ASN1OctetString;

    goto :goto_0
.end method

.method public constructor <init>([B)V
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;->a:Lorg/spongycastle/asn1/ASN1Integer;

    .line 39
    new-instance v0, Lorg/spongycastle/asn1/DEROctetString;

    invoke-direct {v0, p1}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    iput-object v0, p0, Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;->b:Lorg/spongycastle/asn1/ASN1OctetString;

    .line 40
    return-void
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;
    .locals 2

    .prologue
    .line 23
    instance-of v0, p0, Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;

    if-eqz v0, :cond_0

    .line 25
    check-cast p0, Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;

    .line 32
    :goto_0
    return-object p0

    .line 27
    :cond_0
    if-eqz p0, :cond_1

    .line 29
    new-instance v0, Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;

    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    .line 32
    :cond_1
    const/4 p0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 82
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 84
    iget-object v1, p0, Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;->a:Lorg/spongycastle/asn1/ASN1Integer;

    if-eqz v1, :cond_0

    .line 86
    iget-object v1, p0, Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;->a:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 89
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;->b:Lorg/spongycastle/asn1/ASN1OctetString;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 91
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public final c()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;->a:Lorg/spongycastle/asn1/ASN1Integer;

    if-nez v0, :cond_0

    .line 69
    const/4 v0, 0x0

    .line 72
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;->a:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Integer;->c()Ljava/math/BigInteger;

    move-result-object v0

    goto :goto_0
.end method

.method public final d()[B
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lorg/spongycastle/asn1/pkcs/RC2CBCParameter;->b:Lorg/spongycastle/asn1/ASN1OctetString;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v0

    return-object v0
.end method
