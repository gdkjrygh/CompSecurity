.class public Lorg/spongycastle/asn1/cmp/RevRepContent;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1Sequence;

.field private b:Lorg/spongycastle/asn1/ASN1Sequence;

.field private c:Lorg/spongycastle/asn1/ASN1Sequence;


# direct methods
.method private static a(Lorg/spongycastle/asn1/ASN1EncodableVector;ILorg/spongycastle/asn1/ASN1Encodable;)V
    .locals 2

    .prologue
    .line 132
    if-eqz p2, :cond_0

    .line 134
    new-instance v0, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1, p2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {p0, v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 136
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 3

    .prologue
    .line 120
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 122
    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/RevRepContent;->a:Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 124
    const/4 v1, 0x0

    iget-object v2, p0, Lorg/spongycastle/asn1/cmp/RevRepContent;->b:Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-static {v0, v1, v2}, Lorg/spongycastle/asn1/cmp/RevRepContent;->a(Lorg/spongycastle/asn1/ASN1EncodableVector;ILorg/spongycastle/asn1/ASN1Encodable;)V

    .line 125
    const/4 v1, 0x1

    iget-object v2, p0, Lorg/spongycastle/asn1/cmp/RevRepContent;->c:Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-static {v0, v1, v2}, Lorg/spongycastle/asn1/cmp/RevRepContent;->a(Lorg/spongycastle/asn1/ASN1EncodableVector;ILorg/spongycastle/asn1/ASN1Encodable;)V

    .line 127
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
