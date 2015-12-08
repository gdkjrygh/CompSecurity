.class public Lorg/spongycastle/asn1/x509/qualified/TypeOfBiometricData;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/ASN1Choice;


# instance fields
.field a:Lorg/spongycastle/asn1/ASN1Encodable;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/qualified/TypeOfBiometricData;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-interface {v0}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    return-object v0
.end method
