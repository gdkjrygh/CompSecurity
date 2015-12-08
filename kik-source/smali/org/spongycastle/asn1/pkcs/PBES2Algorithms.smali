.class public Lorg/spongycastle/asn1/pkcs/PBES2Algorithms;
.super Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;


# instance fields
.field private bz:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;


# virtual methods
.method public final c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lorg/spongycastle/asn1/pkcs/PBES2Algorithms;->bz:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    return-object v0
.end method
