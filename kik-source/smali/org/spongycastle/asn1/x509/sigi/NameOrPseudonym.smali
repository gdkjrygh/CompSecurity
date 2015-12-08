.class public Lorg/spongycastle/asn1/x509/sigi/NameOrPseudonym;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/ASN1Choice;


# instance fields
.field private a:Lorg/spongycastle/asn1/x500/DirectoryString;

.field private b:Lorg/spongycastle/asn1/x500/DirectoryString;

.field private c:Lorg/spongycastle/asn1/ASN1Sequence;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 179
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/sigi/NameOrPseudonym;->a:Lorg/spongycastle/asn1/x500/DirectoryString;

    if-eqz v0, :cond_0

    .line 181
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/sigi/NameOrPseudonym;->a:Lorg/spongycastle/asn1/x500/DirectoryString;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x500/DirectoryString;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    .line 188
    :goto_0
    return-object v0

    .line 185
    :cond_0
    new-instance v1, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 186
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/sigi/NameOrPseudonym;->b:Lorg/spongycastle/asn1/x500/DirectoryString;

    invoke-virtual {v1, v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 187
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/sigi/NameOrPseudonym;->c:Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-virtual {v1, v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 188
    new-instance v0, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    goto :goto_0
.end method
