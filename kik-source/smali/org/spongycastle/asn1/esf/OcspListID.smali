.class public Lorg/spongycastle/asn1/esf/OcspListID;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1Sequence;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 70
    new-instance v0, Lorg/spongycastle/asn1/DERSequence;

    iget-object v1, p0, Lorg/spongycastle/asn1/esf/OcspListID;->a:Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1Encodable;)V

    return-object v0
.end method
