.class public Lorg/spongycastle/asn1/eac/CertificateBody;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/DERApplicationSpecific;

.field private b:Lorg/spongycastle/asn1/DERApplicationSpecific;

.field private c:Lorg/spongycastle/asn1/eac/PublicKeyDataObject;

.field private d:Lorg/spongycastle/asn1/DERApplicationSpecific;

.field private e:Lorg/spongycastle/asn1/eac/CertificateHolderAuthorization;

.field private f:Lorg/spongycastle/asn1/DERApplicationSpecific;

.field private g:Lorg/spongycastle/asn1/DERApplicationSpecific;

.field private h:I


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 270
    :try_start_0
    iget v0, p0, Lorg/spongycastle/asn1/eac/CertificateBody;->h:I

    const/16 v2, 0x7f

    if-ne v0, v2, :cond_0

    .line 272
    new-instance v2, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v2}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    iget-object v0, p0, Lorg/spongycastle/asn1/eac/CertificateBody;->a:Lorg/spongycastle/asn1/DERApplicationSpecific;

    invoke-virtual {v2, v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    iget-object v0, p0, Lorg/spongycastle/asn1/eac/CertificateBody;->b:Lorg/spongycastle/asn1/DERApplicationSpecific;

    invoke-virtual {v2, v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    new-instance v0, Lorg/spongycastle/asn1/DERApplicationSpecific;

    const/16 v3, 0x49

    iget-object v4, p0, Lorg/spongycastle/asn1/eac/CertificateBody;->c:Lorg/spongycastle/asn1/eac/PublicKeyDataObject;

    invoke-direct {v0, v3, v4}, Lorg/spongycastle/asn1/DERApplicationSpecific;-><init>(ILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v2, v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    iget-object v0, p0, Lorg/spongycastle/asn1/eac/CertificateBody;->d:Lorg/spongycastle/asn1/DERApplicationSpecific;

    invoke-virtual {v2, v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    iget-object v0, p0, Lorg/spongycastle/asn1/eac/CertificateBody;->e:Lorg/spongycastle/asn1/eac/CertificateHolderAuthorization;

    invoke-virtual {v2, v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    iget-object v0, p0, Lorg/spongycastle/asn1/eac/CertificateBody;->f:Lorg/spongycastle/asn1/DERApplicationSpecific;

    invoke-virtual {v2, v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    iget-object v0, p0, Lorg/spongycastle/asn1/eac/CertificateBody;->g:Lorg/spongycastle/asn1/DERApplicationSpecific;

    invoke-virtual {v2, v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    new-instance v0, Lorg/spongycastle/asn1/DERApplicationSpecific;

    const/16 v3, 0x4e

    invoke-direct {v0, v3, v2}, Lorg/spongycastle/asn1/DERApplicationSpecific;-><init>(ILorg/spongycastle/asn1/ASN1EncodableVector;)V

    .line 283
    :goto_0
    return-object v0

    .line 274
    :cond_0
    iget v0, p0, Lorg/spongycastle/asn1/eac/CertificateBody;->h:I

    const/16 v2, 0xd

    if-ne v0, v2, :cond_1

    .line 276
    new-instance v2, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v2}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    iget-object v0, p0, Lorg/spongycastle/asn1/eac/CertificateBody;->a:Lorg/spongycastle/asn1/DERApplicationSpecific;

    invoke-virtual {v2, v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    new-instance v0, Lorg/spongycastle/asn1/DERApplicationSpecific;

    const/16 v3, 0x49

    iget-object v4, p0, Lorg/spongycastle/asn1/eac/CertificateBody;->c:Lorg/spongycastle/asn1/eac/PublicKeyDataObject;

    invoke-direct {v0, v3, v4}, Lorg/spongycastle/asn1/DERApplicationSpecific;-><init>(ILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v2, v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    iget-object v0, p0, Lorg/spongycastle/asn1/eac/CertificateBody;->d:Lorg/spongycastle/asn1/DERApplicationSpecific;

    invoke-virtual {v2, v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    new-instance v0, Lorg/spongycastle/asn1/DERApplicationSpecific;

    const/16 v3, 0x4e

    invoke-direct {v0, v3, v2}, Lorg/spongycastle/asn1/DERApplicationSpecific;-><init>(ILorg/spongycastle/asn1/ASN1EncodableVector;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 279
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    move-object v0, v1

    .line 281
    goto :goto_0

    .line 282
    :cond_1
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v2, "returning null"

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    move-object v0, v1

    .line 283
    goto :goto_0
.end method
