.class public Lorg/bouncycastle/asn1/x509/GeneralName;
.super Lorg/bouncycastle/asn1/ASN1Encodable;

# interfaces
.implements Lorg/bouncycastle/asn1/ASN1Choice;


# instance fields
.field a:Lorg/bouncycastle/asn1/DEREncodable;

.field b:I


# direct methods
.method public constructor <init>(ILorg/bouncycastle/asn1/ASN1Encodable;)V
    .locals 0

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    iput-object p2, p0, Lorg/bouncycastle/asn1/x509/GeneralName;->a:Lorg/bouncycastle/asn1/DEREncodable;

    iput p1, p0, Lorg/bouncycastle/asn1/x509/GeneralName;->b:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lorg/bouncycastle/asn1/x509/GeneralName;->b:I

    new-instance v0, Lorg/bouncycastle/asn1/DERIA5String;

    invoke-direct {v0, p1}, Lorg/bouncycastle/asn1/DERIA5String;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/GeneralName;->a:Lorg/bouncycastle/asn1/DEREncodable;

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/asn1/x500/X500Name;)V
    .locals 1

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/asn1/x509/GeneralName;->a:Lorg/bouncycastle/asn1/DEREncodable;

    const/4 v0, 0x4

    iput v0, p0, Lorg/bouncycastle/asn1/x509/GeneralName;->b:I

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/asn1/x509/X509Name;)V
    .locals 1

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/asn1/x509/GeneralName;->a:Lorg/bouncycastle/asn1/DEREncodable;

    const/4 v0, 0x4

    iput v0, p0, Lorg/bouncycastle/asn1/x509/GeneralName;->b:I

    return-void
.end method

.method public static a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/GeneralName;
    .locals 4

    const/4 v2, 0x0

    if-eqz p0, :cond_0

    instance-of v0, p0, Lorg/bouncycastle/asn1/x509/GeneralName;

    if-eqz v0, :cond_1

    :cond_0
    check-cast p0, Lorg/bouncycastle/asn1/x509/GeneralName;

    :goto_0
    return-object p0

    :cond_1
    instance-of v0, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;

    if-eqz v0, :cond_2

    move-object v0, p0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1TaggedObject;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->e()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unknown object in getInstance: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    new-instance p0, Lorg/bouncycastle/asn1/x509/GeneralName;

    invoke-static {v0, v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lorg/bouncycastle/asn1/x509/GeneralName;-><init>(ILorg/bouncycastle/asn1/ASN1Encodable;)V

    goto :goto_0

    :pswitch_1
    new-instance p0, Lorg/bouncycastle/asn1/x509/GeneralName;

    invoke-static {v0}, Lorg/bouncycastle/asn1/DERIA5String;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/DERIA5String;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lorg/bouncycastle/asn1/x509/GeneralName;-><init>(ILorg/bouncycastle/asn1/ASN1Encodable;)V

    goto :goto_0

    :pswitch_2
    new-instance p0, Lorg/bouncycastle/asn1/x509/GeneralName;

    invoke-static {v0}, Lorg/bouncycastle/asn1/DERIA5String;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/DERIA5String;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lorg/bouncycastle/asn1/x509/GeneralName;-><init>(ILorg/bouncycastle/asn1/ASN1Encodable;)V

    goto :goto_0

    :pswitch_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "unknown tag: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_4
    new-instance p0, Lorg/bouncycastle/asn1/x509/GeneralName;

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/X509Name;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/x509/X509Name;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lorg/bouncycastle/asn1/x509/GeneralName;-><init>(ILorg/bouncycastle/asn1/ASN1Encodable;)V

    goto :goto_0

    :pswitch_5
    new-instance p0, Lorg/bouncycastle/asn1/x509/GeneralName;

    invoke-static {v0, v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lorg/bouncycastle/asn1/x509/GeneralName;-><init>(ILorg/bouncycastle/asn1/ASN1Encodable;)V

    goto :goto_0

    :pswitch_6
    new-instance p0, Lorg/bouncycastle/asn1/x509/GeneralName;

    invoke-static {v0}, Lorg/bouncycastle/asn1/DERIA5String;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/DERIA5String;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lorg/bouncycastle/asn1/x509/GeneralName;-><init>(ILorg/bouncycastle/asn1/ASN1Encodable;)V

    goto :goto_0

    :pswitch_7
    new-instance p0, Lorg/bouncycastle/asn1/x509/GeneralName;

    invoke-static {v0}, Lorg/bouncycastle/asn1/ASN1OctetString;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/ASN1OctetString;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lorg/bouncycastle/asn1/x509/GeneralName;-><init>(ILorg/bouncycastle/asn1/ASN1Encodable;)V

    goto/16 :goto_0

    :pswitch_8
    new-instance p0, Lorg/bouncycastle/asn1/x509/GeneralName;

    invoke-static {v0}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lorg/bouncycastle/asn1/x509/GeneralName;-><init>(ILorg/bouncycastle/asn1/ASN1Encodable;)V

    goto/16 :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method

.method public static a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/x509/GeneralName;
    .locals 1

    invoke-static {p0}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/ASN1TaggedObject;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/GeneralName;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/GeneralName;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 4

    iget v0, p0, Lorg/bouncycastle/asn1/x509/GeneralName;->b:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    new-instance v0, Lorg/bouncycastle/asn1/DERTaggedObject;

    const/4 v1, 0x1

    iget v2, p0, Lorg/bouncycastle/asn1/x509/GeneralName;->b:I

    iget-object v3, p0, Lorg/bouncycastle/asn1/x509/GeneralName;->a:Lorg/bouncycastle/asn1/DEREncodable;

    invoke-direct {v0, v1, v2, v3}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lorg/bouncycastle/asn1/DERTaggedObject;

    const/4 v1, 0x0

    iget v2, p0, Lorg/bouncycastle/asn1/x509/GeneralName;->b:I

    iget-object v3, p0, Lorg/bouncycastle/asn1/x509/GeneralName;->a:Lorg/bouncycastle/asn1/DEREncodable;

    invoke-direct {v0, v1, v2, v3}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    goto :goto_0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lorg/bouncycastle/asn1/x509/GeneralName;->b:I

    return v0
.end method

.method public final f()Lorg/bouncycastle/asn1/DEREncodable;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/GeneralName;->a:Lorg/bouncycastle/asn1/DEREncodable;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    iget v1, p0, Lorg/bouncycastle/asn1/x509/GeneralName;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v1, p0, Lorg/bouncycastle/asn1/x509/GeneralName;->b:I

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/GeneralName;->a:Lorg/bouncycastle/asn1/DEREncodable;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/GeneralName;->a:Lorg/bouncycastle/asn1/DEREncodable;

    invoke-static {v1}, Lorg/bouncycastle/asn1/DERIA5String;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/DERIA5String;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DERIA5String;->n_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    :pswitch_2
    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/GeneralName;->a:Lorg/bouncycastle/asn1/DEREncodable;

    invoke-static {v1}, Lorg/bouncycastle/asn1/x509/X509Name;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/X509Name;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x509/X509Name;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
