.class public Lorg/spongycastle/asn1/x509/DisplayText;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/ASN1Choice;


# instance fields
.field a:Lorg/spongycastle/asn1/ASN1String;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 1

    .prologue
    .line 153
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/DisplayText;->a:Lorg/spongycastle/asn1/ASN1String;

    check-cast v0, Lorg/spongycastle/asn1/ASN1Primitive;

    return-object v0
.end method
