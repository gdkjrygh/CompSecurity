.class public Lorg/spongycastle/asn1/pkcs/SignedData;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;


# instance fields
.field private bA:Lorg/spongycastle/asn1/ASN1Set;

.field private bB:Lorg/spongycastle/asn1/pkcs/ContentInfo;

.field private bC:Lorg/spongycastle/asn1/ASN1Set;

.field private bD:Lorg/spongycastle/asn1/ASN1Set;

.field private bE:Lorg/spongycastle/asn1/ASN1Set;

.field private bz:Lorg/spongycastle/asn1/ASN1Integer;


# direct methods
.method public constructor <init>(Lorg/spongycastle/asn1/ASN1Integer;Lorg/spongycastle/asn1/ASN1Set;Lorg/spongycastle/asn1/pkcs/ContentInfo;Lorg/spongycastle/asn1/ASN1Set;Lorg/spongycastle/asn1/ASN1Set;)V
    .locals 1

    .prologue
    .line 50
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 51
    iput-object p1, p0, Lorg/spongycastle/asn1/pkcs/SignedData;->bz:Lorg/spongycastle/asn1/ASN1Integer;

    .line 52
    iput-object p2, p0, Lorg/spongycastle/asn1/pkcs/SignedData;->bA:Lorg/spongycastle/asn1/ASN1Set;

    .line 53
    iput-object p3, p0, Lorg/spongycastle/asn1/pkcs/SignedData;->bB:Lorg/spongycastle/asn1/pkcs/ContentInfo;

    .line 54
    iput-object p4, p0, Lorg/spongycastle/asn1/pkcs/SignedData;->bC:Lorg/spongycastle/asn1/ASN1Set;

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/asn1/pkcs/SignedData;->bD:Lorg/spongycastle/asn1/ASN1Set;

    .line 56
    iput-object p5, p0, Lorg/spongycastle/asn1/pkcs/SignedData;->bE:Lorg/spongycastle/asn1/ASN1Set;

    .line 57
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 4

    .prologue
    .line 61
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 62
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->d()Ljava/util/Enumeration;

    move-result-object v1

    .line 64
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Integer;

    iput-object v0, p0, Lorg/spongycastle/asn1/pkcs/SignedData;->bz:Lorg/spongycastle/asn1/ASN1Integer;

    .line 65
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Set;

    iput-object v0, p0, Lorg/spongycastle/asn1/pkcs/SignedData;->bA:Lorg/spongycastle/asn1/ASN1Set;

    .line 66
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/pkcs/ContentInfo;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/pkcs/ContentInfo;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/pkcs/SignedData;->bB:Lorg/spongycastle/asn1/pkcs/ContentInfo;

    .line 68
    :goto_0
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 70
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Primitive;

    .line 76
    instance-of v2, v0, Lorg/spongycastle/asn1/DERTaggedObject;

    if-eqz v2, :cond_0

    .line 78
    check-cast v0, Lorg/spongycastle/asn1/DERTaggedObject;

    .line 80
    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERTaggedObject;->c()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    .line 89
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "unknown tag value "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERTaggedObject;->c()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 83
    :pswitch_0
    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Set;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/ASN1Set;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/pkcs/SignedData;->bC:Lorg/spongycastle/asn1/ASN1Set;

    goto :goto_0

    .line 86
    :pswitch_1
    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Set;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/ASN1Set;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/pkcs/SignedData;->bD:Lorg/spongycastle/asn1/ASN1Set;

    goto :goto_0

    .line 91
    :cond_0
    check-cast v0, Lorg/spongycastle/asn1/ASN1Set;

    iput-object v0, p0, Lorg/spongycastle/asn1/pkcs/SignedData;->bE:Lorg/spongycastle/asn1/ASN1Set;

    goto :goto_0

    .line 97
    :cond_1
    return-void

    .line 80
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/pkcs/SignedData;
    .locals 2

    .prologue
    .line 31
    instance-of v0, p0, Lorg/spongycastle/asn1/pkcs/SignedData;

    if-eqz v0, :cond_0

    .line 33
    check-cast p0, Lorg/spongycastle/asn1/pkcs/SignedData;

    .line 40
    :goto_0
    return-object p0

    .line 35
    :cond_0
    if-eqz p0, :cond_1

    .line 37
    new-instance v0, Lorg/spongycastle/asn1/pkcs/SignedData;

    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/pkcs/SignedData;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    .line 40
    :cond_1
    const/4 p0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 146
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 148
    iget-object v1, p0, Lorg/spongycastle/asn1/pkcs/SignedData;->bz:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 149
    iget-object v1, p0, Lorg/spongycastle/asn1/pkcs/SignedData;->bA:Lorg/spongycastle/asn1/ASN1Set;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 150
    iget-object v1, p0, Lorg/spongycastle/asn1/pkcs/SignedData;->bB:Lorg/spongycastle/asn1/pkcs/ContentInfo;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 152
    iget-object v1, p0, Lorg/spongycastle/asn1/pkcs/SignedData;->bC:Lorg/spongycastle/asn1/ASN1Set;

    if-eqz v1, :cond_0

    .line 154
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v2, p0, Lorg/spongycastle/asn1/pkcs/SignedData;->bC:Lorg/spongycastle/asn1/ASN1Set;

    invoke-direct {v1, v4, v4, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 157
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/asn1/pkcs/SignedData;->bD:Lorg/spongycastle/asn1/ASN1Set;

    if-eqz v1, :cond_1

    .line 159
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v2, 0x1

    iget-object v3, p0, Lorg/spongycastle/asn1/pkcs/SignedData;->bD:Lorg/spongycastle/asn1/ASN1Set;

    invoke-direct {v1, v4, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 162
    :cond_1
    iget-object v1, p0, Lorg/spongycastle/asn1/pkcs/SignedData;->bE:Lorg/spongycastle/asn1/ASN1Set;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 164
    new-instance v1, Lorg/spongycastle/asn1/BERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/BERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public final c()Lorg/spongycastle/asn1/ASN1Set;
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lorg/spongycastle/asn1/pkcs/SignedData;->bC:Lorg/spongycastle/asn1/ASN1Set;

    return-object v0
.end method

.method public final d()Lorg/spongycastle/asn1/ASN1Set;
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lorg/spongycastle/asn1/pkcs/SignedData;->bD:Lorg/spongycastle/asn1/ASN1Set;

    return-object v0
.end method
