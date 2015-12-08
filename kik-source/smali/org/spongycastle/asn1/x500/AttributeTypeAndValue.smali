.class public Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field private b:Lorg/spongycastle/asn1/ASN1Encodable;


# direct methods
.method private constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 19
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    iput-object v0, p0, Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 20
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;->b:Lorg/spongycastle/asn1/ASN1Encodable;

    .line 21
    return-void
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;
    .locals 2

    .prologue
    .line 25
    instance-of v0, p0, Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;

    if-eqz v0, :cond_0

    .line 27
    check-cast p0, Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;

    .line 31
    :goto_0
    return-object p0

    .line 29
    :cond_0
    if-eqz p0, :cond_1

    .line 31
    new-instance v0, Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;

    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    .line 34
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "null value in getInstance()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 65
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 67
    iget-object v1, p0, Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 68
    iget-object v1, p0, Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;->b:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 70
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public final c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    return-object v0
.end method

.method public final d()Lorg/spongycastle/asn1/ASN1Encodable;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;->b:Lorg/spongycastle/asn1/ASN1Encodable;

    return-object v0
.end method
