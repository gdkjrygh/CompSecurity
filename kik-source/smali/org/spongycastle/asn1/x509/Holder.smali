.class public Lorg/spongycastle/asn1/x509/Holder;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field a:Lorg/spongycastle/asn1/x509/IssuerSerial;

.field b:Lorg/spongycastle/asn1/x509/GeneralNames;

.field c:Lorg/spongycastle/asn1/x509/ObjectDigestInfo;

.field private d:I


# direct methods
.method private constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 99
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 52
    iput v3, p0, Lorg/spongycastle/asn1/x509/Holder;->d:I

    .line 100
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v0

    const/4 v1, 0x3

    if-le v0, v1, :cond_0

    .line 102
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

    .line 106
    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 108
    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/ASN1TaggedObject;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1TaggedObject;

    move-result-object v1

    .line 111
    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1TaggedObject;->c()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    .line 123
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unknown tag in Holder"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 114
    :pswitch_0
    invoke-static {v1}, Lorg/spongycastle/asn1/x509/IssuerSerial;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/x509/IssuerSerial;

    move-result-object v1

    iput-object v1, p0, Lorg/spongycastle/asn1/x509/Holder;->a:Lorg/spongycastle/asn1/x509/IssuerSerial;

    .line 106
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 117
    :pswitch_1
    invoke-static {v1}, Lorg/spongycastle/asn1/x509/GeneralNames;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v1

    iput-object v1, p0, Lorg/spongycastle/asn1/x509/Holder;->b:Lorg/spongycastle/asn1/x509/GeneralNames;

    goto :goto_1

    .line 120
    :pswitch_2
    invoke-static {v1}, Lorg/spongycastle/asn1/x509/ObjectDigestInfo;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/x509/ObjectDigestInfo;

    move-result-object v1

    iput-object v1, p0, Lorg/spongycastle/asn1/x509/Holder;->c:Lorg/spongycastle/asn1/x509/ObjectDigestInfo;

    goto :goto_1

    .line 126
    :cond_1
    iput v3, p0, Lorg/spongycastle/asn1/x509/Holder;->d:I

    .line 127
    return-void

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private constructor <init>(Lorg/spongycastle/asn1/ASN1TaggedObject;)V
    .locals 2

    .prologue
    .line 78
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 52
    const/4 v0, 0x1

    iput v0, p0, Lorg/spongycastle/asn1/x509/Holder;->d:I

    .line 79
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1TaggedObject;->c()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 88
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unknown tag in Holder"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 82
    :pswitch_0
    invoke-static {p1}, Lorg/spongycastle/asn1/x509/IssuerSerial;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/x509/IssuerSerial;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/Holder;->a:Lorg/spongycastle/asn1/x509/IssuerSerial;

    .line 90
    :goto_0
    const/4 v0, 0x0

    iput v0, p0, Lorg/spongycastle/asn1/x509/Holder;->d:I

    .line 91
    return-void

    .line 85
    :pswitch_1
    invoke-static {p1}, Lorg/spongycastle/asn1/x509/GeneralNames;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/Holder;->b:Lorg/spongycastle/asn1/x509/GeneralNames;

    goto :goto_0

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/Holder;
    .locals 2

    .prologue
    .line 56
    instance-of v0, p0, Lorg/spongycastle/asn1/x509/Holder;

    if-eqz v0, :cond_0

    .line 58
    check-cast p0, Lorg/spongycastle/asn1/x509/Holder;

    .line 69
    :goto_0
    return-object p0

    .line 60
    :cond_0
    instance-of v0, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;

    if-eqz v0, :cond_1

    .line 62
    new-instance v0, Lorg/spongycastle/asn1/x509/Holder;

    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1TaggedObject;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/Holder;-><init>(Lorg/spongycastle/asn1/ASN1TaggedObject;)V

    move-object p0, v0

    goto :goto_0

    .line 64
    :cond_1
    if-eqz p0, :cond_2

    .line 66
    new-instance v0, Lorg/spongycastle/asn1/x509/Holder;

    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/Holder;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    .line 69
    :cond_2
    const/4 p0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 5

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 212
    iget v0, p0, Lorg/spongycastle/asn1/x509/Holder;->d:I

    if-ne v0, v3, :cond_3

    .line 214
    new-instance v1, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 216
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/Holder;->a:Lorg/spongycastle/asn1/x509/IssuerSerial;

    if-eqz v0, :cond_0

    .line 218
    new-instance v0, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v2, p0, Lorg/spongycastle/asn1/x509/Holder;->a:Lorg/spongycastle/asn1/x509/IssuerSerial;

    invoke-direct {v0, v4, v4, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v1, v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 221
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/Holder;->b:Lorg/spongycastle/asn1/x509/GeneralNames;

    if-eqz v0, :cond_1

    .line 223
    new-instance v0, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v2, p0, Lorg/spongycastle/asn1/x509/Holder;->b:Lorg/spongycastle/asn1/x509/GeneralNames;

    invoke-direct {v0, v4, v3, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v1, v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 226
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/Holder;->c:Lorg/spongycastle/asn1/x509/ObjectDigestInfo;

    if-eqz v0, :cond_2

    .line 228
    new-instance v0, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v2, 0x2

    iget-object v3, p0, Lorg/spongycastle/asn1/x509/Holder;->c:Lorg/spongycastle/asn1/x509/ObjectDigestInfo;

    invoke-direct {v0, v4, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v1, v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 231
    :cond_2
    new-instance v0, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    .line 241
    :goto_0
    return-object v0

    .line 235
    :cond_3
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/Holder;->b:Lorg/spongycastle/asn1/x509/GeneralNames;

    if-eqz v0, :cond_4

    .line 237
    new-instance v0, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v1, p0, Lorg/spongycastle/asn1/x509/Holder;->b:Lorg/spongycastle/asn1/x509/GeneralNames;

    invoke-direct {v0, v4, v3, v1}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0

    .line 241
    :cond_4
    new-instance v0, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v1, p0, Lorg/spongycastle/asn1/x509/Holder;->a:Lorg/spongycastle/asn1/x509/IssuerSerial;

    invoke-direct {v0, v4, v4, v1}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0
.end method

.method public final c()Lorg/spongycastle/asn1/x509/IssuerSerial;
    .locals 1

    .prologue
    .line 191
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/Holder;->a:Lorg/spongycastle/asn1/x509/IssuerSerial;

    return-object v0
.end method

.method public final d()Lorg/spongycastle/asn1/x509/GeneralNames;
    .locals 1

    .prologue
    .line 202
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/Holder;->b:Lorg/spongycastle/asn1/x509/GeneralNames;

    return-object v0
.end method

.method public final e()Lorg/spongycastle/asn1/x509/ObjectDigestInfo;
    .locals 1

    .prologue
    .line 207
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/Holder;->c:Lorg/spongycastle/asn1/x509/ObjectDigestInfo;

    return-object v0
.end method
