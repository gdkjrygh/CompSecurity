.class public Lorg/spongycastle/asn1/esf/OtherHash;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/ASN1Choice;


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1OctetString;

.field private b:Lorg/spongycastle/asn1/esf/OtherHashAlgAndValue;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lorg/spongycastle/asn1/esf/OtherHash;->b:Lorg/spongycastle/asn1/esf/OtherHashAlgAndValue;

    if-nez v0, :cond_0

    .line 77
    iget-object v0, p0, Lorg/spongycastle/asn1/esf/OtherHash;->a:Lorg/spongycastle/asn1/ASN1OctetString;

    .line 79
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/spongycastle/asn1/esf/OtherHash;->b:Lorg/spongycastle/asn1/esf/OtherHashAlgAndValue;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/esf/OtherHashAlgAndValue;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    goto :goto_0
.end method
