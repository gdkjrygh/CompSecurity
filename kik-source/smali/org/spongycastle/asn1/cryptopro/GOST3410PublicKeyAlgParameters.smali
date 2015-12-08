.class public Lorg/spongycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field private b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field private c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;


# direct methods
.method public constructor <init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V
    .locals 1

    .prologue
    .line 44
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 45
    iput-object p1, p0, Lorg/spongycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 46
    iput-object p2, p0, Lorg/spongycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 48
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 55
    iput-object p1, p0, Lorg/spongycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 56
    iput-object p2, p0, Lorg/spongycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 57
    iput-object p3, p0, Lorg/spongycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 58
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 2

    .prologue
    const/4 v1, 0x2

    .line 62
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 63
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    iput-object v0, p0, Lorg/spongycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 64
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    iput-object v0, p0, Lorg/spongycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 66
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v0

    if-le v0, v1, :cond_0

    .line 68
    invoke-virtual {p1, v1}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    iput-object v0, p0, Lorg/spongycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 70
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 89
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 91
    iget-object v1, p0, Lorg/spongycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 92
    iget-object v1, p0, Lorg/spongycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 94
    iget-object v1, p0, Lorg/spongycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    if-eqz v1, :cond_0

    .line 96
    iget-object v1, p0, Lorg/spongycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 99
    :cond_0
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public final c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lorg/spongycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    return-object v0
.end method

.method public final d()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lorg/spongycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    return-object v0
.end method

.method public final e()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lorg/spongycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    return-object v0
.end method
