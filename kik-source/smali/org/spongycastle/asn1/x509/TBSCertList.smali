.class public Lorg/spongycastle/asn1/x509/TBSCertList;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/spongycastle/asn1/x509/TBSCertList$a;,
        Lorg/spongycastle/asn1/x509/TBSCertList$b;,
        Lorg/spongycastle/asn1/x509/TBSCertList$CRLEntry;
    }
.end annotation


# instance fields
.field a:Lorg/spongycastle/asn1/ASN1Integer;

.field b:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

.field c:Lorg/spongycastle/asn1/x500/X500Name;

.field d:Lorg/spongycastle/asn1/x509/Time;

.field e:Lorg/spongycastle/asn1/x509/Time;

.field f:Lorg/spongycastle/asn1/ASN1Sequence;

.field g:Lorg/spongycastle/asn1/x509/Extensions;


# direct methods
.method private constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 171
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 172
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v2

    const/4 v3, 0x3

    if-lt v2, v3, :cond_0

    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v2

    const/4 v3, 0x7

    if-le v2, v3, :cond_1

    .line 174
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Bad sequence size: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 179
    :cond_1
    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    instance-of v2, v2, Lorg/spongycastle/asn1/ASN1Integer;

    if-eqz v2, :cond_6

    .line 181
    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Integer;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Integer;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertList;->a:Lorg/spongycastle/asn1/ASN1Integer;

    move v0, v1

    .line 188
    :goto_0
    add-int/lit8 v2, v0, 0x1

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertList;->b:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    .line 189
    add-int/lit8 v3, v2, 0x1

    invoke-virtual {p1, v2}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x500/X500Name;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x500/X500Name;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertList;->c:Lorg/spongycastle/asn1/x500/X500Name;

    .line 190
    add-int/lit8 v0, v3, 0x1

    invoke-virtual {p1, v3}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    invoke-static {v2}, Lorg/spongycastle/asn1/x509/Time;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/Time;

    move-result-object v2

    iput-object v2, p0, Lorg/spongycastle/asn1/x509/TBSCertList;->d:Lorg/spongycastle/asn1/x509/Time;

    .line 192
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v2

    if-ge v0, v2, :cond_3

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    instance-of v2, v2, Lorg/spongycastle/asn1/DERUTCTime;

    if-nez v2, :cond_2

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    instance-of v2, v2, Lorg/spongycastle/asn1/DERGeneralizedTime;

    if-nez v2, :cond_2

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    instance-of v2, v2, Lorg/spongycastle/asn1/x509/Time;

    if-eqz v2, :cond_3

    .line 197
    :cond_2
    add-int/lit8 v2, v0, 0x1

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/Time;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/Time;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertList;->e:Lorg/spongycastle/asn1/x509/Time;

    move v0, v2

    .line 200
    :cond_3
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v2

    if-ge v0, v2, :cond_4

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    instance-of v2, v2, Lorg/spongycastle/asn1/DERTaggedObject;

    if-nez v2, :cond_4

    .line 203
    add-int/lit8 v2, v0, 0x1

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertList;->f:Lorg/spongycastle/asn1/ASN1Sequence;

    move v0, v2

    .line 206
    :cond_4
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v2

    if-ge v0, v2, :cond_5

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    instance-of v2, v2, Lorg/spongycastle/asn1/DERTaggedObject;

    if-eqz v2, :cond_5

    .line 209
    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1TaggedObject;

    invoke-static {v0, v1}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;Z)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/Extensions;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/Extensions;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertList;->g:Lorg/spongycastle/asn1/x509/Extensions;

    .line 211
    :cond_5
    return-void

    .line 185
    :cond_6
    const/4 v2, 0x0

    iput-object v2, p0, Lorg/spongycastle/asn1/x509/TBSCertList;->a:Lorg/spongycastle/asn1/ASN1Integer;

    goto/16 :goto_0
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/TBSCertList;
    .locals 2

    .prologue
    .line 157
    instance-of v0, p0, Lorg/spongycastle/asn1/x509/TBSCertList;

    if-eqz v0, :cond_0

    .line 159
    check-cast p0, Lorg/spongycastle/asn1/x509/TBSCertList;

    .line 166
    :goto_0
    return-object p0

    .line 161
    :cond_0
    if-eqz p0, :cond_1

    .line 163
    new-instance v0, Lorg/spongycastle/asn1/x509/TBSCertList;

    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/TBSCertList;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    .line 166
    :cond_1
    const/4 p0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 4

    .prologue
    .line 281
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 283
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/TBSCertList;->a:Lorg/spongycastle/asn1/ASN1Integer;

    if-eqz v1, :cond_0

    .line 285
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/TBSCertList;->a:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 287
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/TBSCertList;->b:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 288
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/TBSCertList;->c:Lorg/spongycastle/asn1/x500/X500Name;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 290
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/TBSCertList;->d:Lorg/spongycastle/asn1/x509/Time;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 291
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/TBSCertList;->e:Lorg/spongycastle/asn1/x509/Time;

    if-eqz v1, :cond_1

    .line 293
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/TBSCertList;->e:Lorg/spongycastle/asn1/x509/Time;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 297
    :cond_1
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/TBSCertList;->f:Lorg/spongycastle/asn1/ASN1Sequence;

    if-eqz v1, :cond_2

    .line 299
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/TBSCertList;->f:Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 302
    :cond_2
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/TBSCertList;->g:Lorg/spongycastle/asn1/x509/Extensions;

    if-eqz v1, :cond_3

    .line 304
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v2, 0x0

    iget-object v3, p0, Lorg/spongycastle/asn1/x509/TBSCertList;->g:Lorg/spongycastle/asn1/x509/Extensions;

    invoke-direct {v1, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 307
    :cond_3
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public final c()Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;
    .locals 1

    .prologue
    .line 229
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertList;->b:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    return-object v0
.end method

.method public final d()Lorg/spongycastle/asn1/x509/Extensions;
    .locals 1

    .prologue
    .line 276
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/TBSCertList;->g:Lorg/spongycastle/asn1/x509/Extensions;

    return-object v0
.end method
