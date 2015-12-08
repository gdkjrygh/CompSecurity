.class public Lorg/spongycastle/asn1/x509/NameConstraints;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1Sequence;

.field private b:Lorg/spongycastle/asn1/ASN1Sequence;


# direct methods
.method private constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 34
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 35
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->d()Ljava/util/Enumeration;

    move-result-object v0

    .line 36
    :goto_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 38
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/ASN1TaggedObject;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1TaggedObject;

    move-result-object v1

    .line 39
    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1TaggedObject;->c()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    goto :goto_0

    .line 42
    :pswitch_0
    invoke-static {v1, v3}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;Z)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    iput-object v1, p0, Lorg/spongycastle/asn1/x509/NameConstraints;->a:Lorg/spongycastle/asn1/ASN1Sequence;

    goto :goto_0

    .line 45
    :pswitch_1
    invoke-static {v1, v3}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;Z)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    iput-object v1, p0, Lorg/spongycastle/asn1/x509/NameConstraints;->b:Lorg/spongycastle/asn1/ASN1Sequence;

    goto :goto_0

    .line 49
    :cond_0
    return-void

    .line 39
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/NameConstraints;
    .locals 2

    .prologue
    .line 21
    instance-of v0, p0, Lorg/spongycastle/asn1/x509/NameConstraints;

    if-eqz v0, :cond_0

    .line 23
    check-cast p0, Lorg/spongycastle/asn1/x509/NameConstraints;

    .line 30
    :goto_0
    return-object p0

    .line 25
    :cond_0
    if-eqz p0, :cond_1

    .line 27
    new-instance v0, Lorg/spongycastle/asn1/x509/NameConstraints;

    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/NameConstraints;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    .line 30
    :cond_1
    const/4 p0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 104
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 106
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/NameConstraints;->a:Lorg/spongycastle/asn1/ASN1Sequence;

    if-eqz v1, :cond_0

    .line 108
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v2, p0, Lorg/spongycastle/asn1/x509/NameConstraints;->a:Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-direct {v1, v4, v4, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 111
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/NameConstraints;->b:Lorg/spongycastle/asn1/ASN1Sequence;

    if-eqz v1, :cond_1

    .line 113
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v2, 0x1

    iget-object v3, p0, Lorg/spongycastle/asn1/x509/NameConstraints;->b:Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-direct {v1, v4, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 116
    :cond_1
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public final c()Lorg/spongycastle/asn1/ASN1Sequence;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/NameConstraints;->a:Lorg/spongycastle/asn1/ASN1Sequence;

    return-object v0
.end method

.method public final d()Lorg/spongycastle/asn1/ASN1Sequence;
    .locals 1

    .prologue
    .line 95
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/NameConstraints;->b:Lorg/spongycastle/asn1/ASN1Sequence;

    return-object v0
.end method
