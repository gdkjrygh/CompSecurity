.class public Lorg/spongycastle/asn1/ocsp/TBSRequest;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# static fields
.field private static final f:Lorg/spongycastle/asn1/ASN1Integer;


# instance fields
.field a:Lorg/spongycastle/asn1/ASN1Integer;

.field b:Lorg/spongycastle/asn1/x509/GeneralName;

.field c:Lorg/spongycastle/asn1/ASN1Sequence;

.field d:Lorg/spongycastle/asn1/x509/Extensions;

.field e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 18
    new-instance v0, Lorg/spongycastle/asn1/ASN1Integer;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1Integer;-><init>(I)V

    sput-object v0, Lorg/spongycastle/asn1/ocsp/TBSRequest;->f:Lorg/spongycastle/asn1/ASN1Integer;

    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 147
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 153
    iget-object v1, p0, Lorg/spongycastle/asn1/ocsp/TBSRequest;->a:Lorg/spongycastle/asn1/ASN1Integer;

    sget-object v2, Lorg/spongycastle/asn1/ocsp/TBSRequest;->f:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/ASN1Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lorg/spongycastle/asn1/ocsp/TBSRequest;->e:Z

    if-eqz v1, :cond_1

    .line 155
    :cond_0
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v2, 0x0

    iget-object v3, p0, Lorg/spongycastle/asn1/ocsp/TBSRequest;->a:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-direct {v1, v4, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 158
    :cond_1
    iget-object v1, p0, Lorg/spongycastle/asn1/ocsp/TBSRequest;->b:Lorg/spongycastle/asn1/x509/GeneralName;

    if-eqz v1, :cond_2

    .line 160
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v2, p0, Lorg/spongycastle/asn1/ocsp/TBSRequest;->b:Lorg/spongycastle/asn1/x509/GeneralName;

    invoke-direct {v1, v4, v4, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 163
    :cond_2
    iget-object v1, p0, Lorg/spongycastle/asn1/ocsp/TBSRequest;->c:Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 165
    iget-object v1, p0, Lorg/spongycastle/asn1/ocsp/TBSRequest;->d:Lorg/spongycastle/asn1/x509/Extensions;

    if-eqz v1, :cond_3

    .line 167
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v2, 0x2

    iget-object v3, p0, Lorg/spongycastle/asn1/ocsp/TBSRequest;->d:Lorg/spongycastle/asn1/x509/Extensions;

    invoke-direct {v1, v4, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 170
    :cond_3
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public final c()Lorg/spongycastle/asn1/x509/Extensions;
    .locals 1

    .prologue
    .line 132
    iget-object v0, p0, Lorg/spongycastle/asn1/ocsp/TBSRequest;->d:Lorg/spongycastle/asn1/x509/Extensions;

    return-object v0
.end method
