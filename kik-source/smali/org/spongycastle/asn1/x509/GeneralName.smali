.class public Lorg/spongycastle/asn1/x509/GeneralName;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/ASN1Choice;


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1Encodable;

.field private b:I


# direct methods
.method public constructor <init>(ILorg/spongycastle/asn1/ASN1Encodable;)V
    .locals 0

    .prologue
    .line 110
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 111
    iput-object p2, p0, Lorg/spongycastle/asn1/x509/GeneralName;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    .line 112
    iput p1, p0, Lorg/spongycastle/asn1/x509/GeneralName;->b:I

    .line 113
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 141
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 142
    const/4 v0, 0x1

    iput v0, p0, Lorg/spongycastle/asn1/x509/GeneralName;->b:I

    .line 144
    new-instance v0, Lorg/spongycastle/asn1/DERIA5String;

    invoke-direct {v0, p1}, Lorg/spongycastle/asn1/DERIA5String;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/GeneralName;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    .line 148
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/asn1/x500/X500Name;)V
    .locals 1

    .prologue
    .line 75
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 76
    iput-object p1, p0, Lorg/spongycastle/asn1/x509/GeneralName;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    .line 77
    const/4 v0, 0x4

    iput v0, p0, Lorg/spongycastle/asn1/x509/GeneralName;->b:I

    .line 78
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/asn1/x509/X509Name;)V
    .locals 1

    .prologue
    .line 68
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 69
    invoke-static {p1}, Lorg/spongycastle/asn1/x500/X500Name;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x500/X500Name;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/GeneralName;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    .line 70
    const/4 v0, 0x4

    iput v0, p0, Lorg/spongycastle/asn1/x509/GeneralName;->b:I

    .line 71
    return-void
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/GeneralName;
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 177
    if-eqz p0, :cond_0

    instance-of v0, p0, Lorg/spongycastle/asn1/x509/GeneralName;

    if-eqz v0, :cond_1

    .line 179
    :cond_0
    check-cast p0, Lorg/spongycastle/asn1/x509/GeneralName;

    .line 206
    :goto_0
    return-object p0

    .line 182
    :cond_1
    instance-of v0, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;

    if-eqz v0, :cond_2

    move-object v0, p0

    .line 184
    check-cast v0, Lorg/spongycastle/asn1/ASN1TaggedObject;

    .line 185
    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->c()I

    move-result v1

    .line 187
    packed-switch v1, :pswitch_data_0

    .line 210
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

    .line 190
    :pswitch_0
    new-instance p0, Lorg/spongycastle/asn1/x509/GeneralName;

    invoke-static {v0, v2}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;Z)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lorg/spongycastle/asn1/x509/GeneralName;-><init>(ILorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0

    .line 192
    :pswitch_1
    new-instance p0, Lorg/spongycastle/asn1/x509/GeneralName;

    invoke-static {v0}, Lorg/spongycastle/asn1/DERIA5String;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/DERIA5String;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lorg/spongycastle/asn1/x509/GeneralName;-><init>(ILorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0

    .line 194
    :pswitch_2
    new-instance p0, Lorg/spongycastle/asn1/x509/GeneralName;

    invoke-static {v0}, Lorg/spongycastle/asn1/DERIA5String;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/DERIA5String;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lorg/spongycastle/asn1/x509/GeneralName;-><init>(ILorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0

    .line 196
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

    .line 198
    :pswitch_4
    new-instance p0, Lorg/spongycastle/asn1/x509/GeneralName;

    invoke-static {v0}, Lorg/spongycastle/asn1/x500/X500Name;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/x500/X500Name;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lorg/spongycastle/asn1/x509/GeneralName;-><init>(ILorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0

    .line 200
    :pswitch_5
    new-instance p0, Lorg/spongycastle/asn1/x509/GeneralName;

    invoke-static {v0, v2}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;Z)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lorg/spongycastle/asn1/x509/GeneralName;-><init>(ILorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0

    .line 202
    :pswitch_6
    new-instance p0, Lorg/spongycastle/asn1/x509/GeneralName;

    invoke-static {v0}, Lorg/spongycastle/asn1/DERIA5String;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/DERIA5String;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lorg/spongycastle/asn1/x509/GeneralName;-><init>(ILorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0

    .line 204
    :pswitch_7
    new-instance p0, Lorg/spongycastle/asn1/x509/GeneralName;

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1OctetString;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/ASN1OctetString;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lorg/spongycastle/asn1/x509/GeneralName;-><init>(ILorg/spongycastle/asn1/ASN1Encodable;)V

    goto/16 :goto_0

    .line 206
    :pswitch_8
    new-instance p0, Lorg/spongycastle/asn1/x509/GeneralName;

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lorg/spongycastle/asn1/x509/GeneralName;-><init>(ILorg/spongycastle/asn1/ASN1Encodable;)V

    goto/16 :goto_0

    .line 187
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

.method public static a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/x509/GeneralName;
    .locals 1

    .prologue
    .line 229
    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/ASN1TaggedObject;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/GeneralName;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/GeneralName;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 4

    .prologue
    .line 430
    iget v0, p0, Lorg/spongycastle/asn1/x509/GeneralName;->b:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 432
    new-instance v0, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v1, 0x1

    iget v2, p0, Lorg/spongycastle/asn1/x509/GeneralName;->b:I

    iget-object v3, p0, Lorg/spongycastle/asn1/x509/GeneralName;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-direct {v0, v1, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    .line 436
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v1, 0x0

    iget v2, p0, Lorg/spongycastle/asn1/x509/GeneralName;->b:I

    iget-object v3, p0, Lorg/spongycastle/asn1/x509/GeneralName;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-direct {v0, v1, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 234
    iget v0, p0, Lorg/spongycastle/asn1/x509/GeneralName;->b:I

    return v0
.end method

.method public final d()Lorg/spongycastle/asn1/ASN1Encodable;
    .locals 1

    .prologue
    .line 239
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/GeneralName;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 244
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 246
    iget v1, p0, Lorg/spongycastle/asn1/x509/GeneralName;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 247
    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 248
    iget v1, p0, Lorg/spongycastle/asn1/x509/GeneralName;->b:I

    packed-switch v1, :pswitch_data_0

    .line 259
    :pswitch_0
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/GeneralName;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 261
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 253
    :pswitch_1
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/GeneralName;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-static {v1}, Lorg/spongycastle/asn1/DERIA5String;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/DERIA5String;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/DERIA5String;->o_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 256
    :pswitch_2
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/GeneralName;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-static {v1}, Lorg/spongycastle/asn1/x500/X500Name;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x500/X500Name;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x500/X500Name;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 248
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
