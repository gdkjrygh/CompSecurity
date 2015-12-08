.class public Lorg/spongycastle/asn1/x509/AuthorityKeyIdentifier;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field a:Lorg/spongycastle/asn1/ASN1OctetString;

.field b:Lorg/spongycastle/asn1/x509/GeneralNames;

.field c:Lorg/spongycastle/asn1/ASN1Integer;


# direct methods
.method private constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 64
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 36
    iput-object v0, p0, Lorg/spongycastle/asn1/x509/AuthorityKeyIdentifier;->a:Lorg/spongycastle/asn1/ASN1OctetString;

    .line 37
    iput-object v0, p0, Lorg/spongycastle/asn1/x509/AuthorityKeyIdentifier;->b:Lorg/spongycastle/asn1/x509/GeneralNames;

    .line 38
    iput-object v0, p0, Lorg/spongycastle/asn1/x509/AuthorityKeyIdentifier;->c:Lorg/spongycastle/asn1/ASN1Integer;

    .line 65
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->d()Ljava/util/Enumeration;

    move-result-object v0

    .line 67
    :goto_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 69
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/DERTaggedObject;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1TaggedObject;

    move-result-object v1

    .line 71
    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1TaggedObject;->c()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    .line 83
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "illegal tag"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 74
    :pswitch_0
    invoke-static {v1}, Lorg/spongycastle/asn1/ASN1OctetString;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/ASN1OctetString;

    move-result-object v1

    iput-object v1, p0, Lorg/spongycastle/asn1/x509/AuthorityKeyIdentifier;->a:Lorg/spongycastle/asn1/ASN1OctetString;

    goto :goto_0

    .line 77
    :pswitch_1
    invoke-static {v1}, Lorg/spongycastle/asn1/x509/GeneralNames;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v1

    iput-object v1, p0, Lorg/spongycastle/asn1/x509/AuthorityKeyIdentifier;->b:Lorg/spongycastle/asn1/x509/GeneralNames;

    goto :goto_0

    .line 80
    :pswitch_2
    const/4 v2, 0x0

    invoke-static {v1, v2}, Lorg/spongycastle/asn1/ASN1Integer;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;Z)Lorg/spongycastle/asn1/ASN1Integer;

    move-result-object v1

    iput-object v1, p0, Lorg/spongycastle/asn1/x509/AuthorityKeyIdentifier;->c:Lorg/spongycastle/asn1/ASN1Integer;

    goto :goto_0

    .line 85
    :cond_0
    return-void

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/AuthorityKeyIdentifier;
    .locals 2

    .prologue
    .line 50
    instance-of v0, p0, Lorg/spongycastle/asn1/x509/AuthorityKeyIdentifier;

    if-eqz v0, :cond_0

    .line 52
    check-cast p0, Lorg/spongycastle/asn1/x509/AuthorityKeyIdentifier;

    .line 59
    :goto_0
    return-object p0

    .line 54
    :cond_0
    if-eqz p0, :cond_1

    .line 56
    new-instance v0, Lorg/spongycastle/asn1/x509/AuthorityKeyIdentifier;

    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/AuthorityKeyIdentifier;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    .line 59
    :cond_1
    const/4 p0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 202
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 204
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/AuthorityKeyIdentifier;->a:Lorg/spongycastle/asn1/ASN1OctetString;

    if-eqz v1, :cond_0

    .line 206
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v2, p0, Lorg/spongycastle/asn1/x509/AuthorityKeyIdentifier;->a:Lorg/spongycastle/asn1/ASN1OctetString;

    invoke-direct {v1, v4, v4, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 209
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/AuthorityKeyIdentifier;->b:Lorg/spongycastle/asn1/x509/GeneralNames;

    if-eqz v1, :cond_1

    .line 211
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v2, 0x1

    iget-object v3, p0, Lorg/spongycastle/asn1/x509/AuthorityKeyIdentifier;->b:Lorg/spongycastle/asn1/x509/GeneralNames;

    invoke-direct {v1, v4, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 214
    :cond_1
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/AuthorityKeyIdentifier;->c:Lorg/spongycastle/asn1/ASN1Integer;

    if-eqz v1, :cond_2

    .line 216
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v2, 0x2

    iget-object v3, p0, Lorg/spongycastle/asn1/x509/AuthorityKeyIdentifier;->c:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-direct {v1, v4, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 220
    :cond_2
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public final c()[B
    .locals 1

    .prologue
    .line 174
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/AuthorityKeyIdentifier;->a:Lorg/spongycastle/asn1/ASN1OctetString;

    if-eqz v0, :cond_0

    .line 176
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/AuthorityKeyIdentifier;->a:Lorg/spongycastle/asn1/ASN1OctetString;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v0

    .line 179
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 225
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AuthorityKeyIdentifier: KeyID("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lorg/spongycastle/asn1/x509/AuthorityKeyIdentifier;->a:Lorg/spongycastle/asn1/ASN1OctetString;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
