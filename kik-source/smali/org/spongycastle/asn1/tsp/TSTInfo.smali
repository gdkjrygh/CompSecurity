.class public Lorg/spongycastle/asn1/tsp/TSTInfo;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1Integer;

.field private b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field private c:Lorg/spongycastle/asn1/tsp/MessageImprint;

.field private d:Lorg/spongycastle/asn1/ASN1Integer;

.field private e:Lorg/spongycastle/asn1/ASN1GeneralizedTime;

.field private f:Lorg/spongycastle/asn1/tsp/Accuracy;

.field private g:Lorg/spongycastle/asn1/ASN1Boolean;

.field private h:Lorg/spongycastle/asn1/ASN1Integer;

.field private i:Lorg/spongycastle/asn1/x509/GeneralName;

.field private j:Lorg/spongycastle/asn1/x509/Extensions;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 198
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 199
    iget-object v1, p0, Lorg/spongycastle/asn1/tsp/TSTInfo;->a:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 201
    iget-object v1, p0, Lorg/spongycastle/asn1/tsp/TSTInfo;->b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 202
    iget-object v1, p0, Lorg/spongycastle/asn1/tsp/TSTInfo;->c:Lorg/spongycastle/asn1/tsp/MessageImprint;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 203
    iget-object v1, p0, Lorg/spongycastle/asn1/tsp/TSTInfo;->d:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 204
    iget-object v1, p0, Lorg/spongycastle/asn1/tsp/TSTInfo;->e:Lorg/spongycastle/asn1/ASN1GeneralizedTime;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 206
    iget-object v1, p0, Lorg/spongycastle/asn1/tsp/TSTInfo;->f:Lorg/spongycastle/asn1/tsp/Accuracy;

    if-eqz v1, :cond_0

    .line 208
    iget-object v1, p0, Lorg/spongycastle/asn1/tsp/TSTInfo;->f:Lorg/spongycastle/asn1/tsp/Accuracy;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 211
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/asn1/tsp/TSTInfo;->g:Lorg/spongycastle/asn1/ASN1Boolean;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lorg/spongycastle/asn1/tsp/TSTInfo;->g:Lorg/spongycastle/asn1/ASN1Boolean;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1Boolean;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 213
    iget-object v1, p0, Lorg/spongycastle/asn1/tsp/TSTInfo;->g:Lorg/spongycastle/asn1/ASN1Boolean;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 216
    :cond_1
    iget-object v1, p0, Lorg/spongycastle/asn1/tsp/TSTInfo;->h:Lorg/spongycastle/asn1/ASN1Integer;

    if-eqz v1, :cond_2

    .line 218
    iget-object v1, p0, Lorg/spongycastle/asn1/tsp/TSTInfo;->h:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 221
    :cond_2
    iget-object v1, p0, Lorg/spongycastle/asn1/tsp/TSTInfo;->i:Lorg/spongycastle/asn1/x509/GeneralName;

    if-eqz v1, :cond_3

    .line 223
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v2, p0, Lorg/spongycastle/asn1/tsp/TSTInfo;->i:Lorg/spongycastle/asn1/x509/GeneralName;

    invoke-direct {v1, v4, v3, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 226
    :cond_3
    iget-object v1, p0, Lorg/spongycastle/asn1/tsp/TSTInfo;->j:Lorg/spongycastle/asn1/x509/Extensions;

    if-eqz v1, :cond_4

    .line 228
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v2, p0, Lorg/spongycastle/asn1/tsp/TSTInfo;->j:Lorg/spongycastle/asn1/x509/Extensions;

    invoke-direct {v1, v3, v4, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 231
    :cond_4
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
