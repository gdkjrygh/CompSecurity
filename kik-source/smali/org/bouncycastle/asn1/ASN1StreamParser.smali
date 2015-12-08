.class public Lorg/bouncycastle/asn1/ASN1StreamParser;
.super Ljava/lang/Object;


# instance fields
.field private final a:Ljava/io/InputStream;

.field private final b:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    invoke-static {p1}, Lorg/bouncycastle/asn1/ASN1InputStream;->a(Ljava/io/InputStream;)I

    move-result v0

    invoke-direct {p0, p1, v0}, Lorg/bouncycastle/asn1/ASN1StreamParser;-><init>(Ljava/io/InputStream;I)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/asn1/ASN1StreamParser;->a:Ljava/io/InputStream;

    iput p2, p0, Lorg/bouncycastle/asn1/ASN1StreamParser;->b:I

    return-void
.end method


# virtual methods
.method public final a()Lorg/bouncycastle/asn1/DEREncodable;
    .locals 7

    const/4 v2, 0x0

    const/4 v1, 0x1

    iget-object v0, p0, Lorg/bouncycastle/asn1/ASN1StreamParser;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v3

    const/4 v0, -0x1

    if-ne v3, v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/asn1/ASN1StreamParser;->a:Ljava/io/InputStream;

    instance-of v0, v0, Lorg/bouncycastle/asn1/e;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lorg/bouncycastle/asn1/ASN1StreamParser;->a:Ljava/io/InputStream;

    check-cast v0, Lorg/bouncycastle/asn1/e;

    invoke-virtual {v0, v2}, Lorg/bouncycastle/asn1/e;->a(Z)V

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/asn1/ASN1StreamParser;->a:Ljava/io/InputStream;

    invoke-static {v0, v3}, Lorg/bouncycastle/asn1/ASN1InputStream;->a(Ljava/io/InputStream;I)I

    move-result v4

    and-int/lit8 v0, v3, 0x20

    if-eqz v0, :cond_2

    move v0, v1

    :goto_1
    iget-object v2, p0, Lorg/bouncycastle/asn1/ASN1StreamParser;->a:Ljava/io/InputStream;

    iget v5, p0, Lorg/bouncycastle/asn1/ASN1StreamParser;->b:I

    invoke-static {v2, v5}, Lorg/bouncycastle/asn1/ASN1InputStream;->b(Ljava/io/InputStream;I)I

    move-result v2

    if-gez v2, :cond_6

    if-nez v0, :cond_3

    new-instance v0, Ljava/io/IOException;

    const-string v1, "indefinite length primitive encoding encountered"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    move v0, v2

    goto :goto_1

    :cond_3
    new-instance v0, Lorg/bouncycastle/asn1/e;

    iget-object v2, p0, Lorg/bouncycastle/asn1/ASN1StreamParser;->a:Ljava/io/InputStream;

    iget v5, p0, Lorg/bouncycastle/asn1/ASN1StreamParser;->b:I

    invoke-direct {v0, v2, v5}, Lorg/bouncycastle/asn1/e;-><init>(Ljava/io/InputStream;I)V

    new-instance v2, Lorg/bouncycastle/asn1/ASN1StreamParser;

    iget v5, p0, Lorg/bouncycastle/asn1/ASN1StreamParser;->b:I

    invoke-direct {v2, v0, v5}, Lorg/bouncycastle/asn1/ASN1StreamParser;-><init>(Ljava/io/InputStream;I)V

    and-int/lit8 v0, v3, 0x40

    if-eqz v0, :cond_4

    new-instance v0, Lorg/bouncycastle/asn1/BERApplicationSpecificParser;

    invoke-direct {v0, v4, v2}, Lorg/bouncycastle/asn1/BERApplicationSpecificParser;-><init>(ILorg/bouncycastle/asn1/ASN1StreamParser;)V

    goto :goto_0

    :cond_4
    and-int/lit16 v0, v3, 0x80

    if-eqz v0, :cond_5

    new-instance v0, Lorg/bouncycastle/asn1/BERTaggedObjectParser;

    invoke-direct {v0, v1, v4, v2}, Lorg/bouncycastle/asn1/BERTaggedObjectParser;-><init>(ZILorg/bouncycastle/asn1/ASN1StreamParser;)V

    goto :goto_0

    :cond_5
    sparse-switch v4, :sswitch_data_0

    new-instance v0, Lorg/bouncycastle/asn1/ASN1Exception;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unknown BER object encountered: 0x"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_0
    new-instance v0, Lorg/bouncycastle/asn1/DERExternalParser;

    invoke-direct {v0, v2}, Lorg/bouncycastle/asn1/DERExternalParser;-><init>(Lorg/bouncycastle/asn1/ASN1StreamParser;)V

    goto :goto_0

    :sswitch_1
    new-instance v0, Lorg/bouncycastle/asn1/BEROctetStringParser;

    invoke-direct {v0, v2}, Lorg/bouncycastle/asn1/BEROctetStringParser;-><init>(Lorg/bouncycastle/asn1/ASN1StreamParser;)V

    goto :goto_0

    :sswitch_2
    new-instance v0, Lorg/bouncycastle/asn1/BERSequenceParser;

    invoke-direct {v0, v2}, Lorg/bouncycastle/asn1/BERSequenceParser;-><init>(Lorg/bouncycastle/asn1/ASN1StreamParser;)V

    goto :goto_0

    :sswitch_3
    new-instance v0, Lorg/bouncycastle/asn1/BERSetParser;

    invoke-direct {v0, v2}, Lorg/bouncycastle/asn1/BERSetParser;-><init>(Lorg/bouncycastle/asn1/ASN1StreamParser;)V

    goto/16 :goto_0

    :cond_6
    new-instance v5, Lorg/bouncycastle/asn1/d;

    iget-object v6, p0, Lorg/bouncycastle/asn1/ASN1StreamParser;->a:Ljava/io/InputStream;

    invoke-direct {v5, v6, v2}, Lorg/bouncycastle/asn1/d;-><init>(Ljava/io/InputStream;I)V

    and-int/lit8 v2, v3, 0x40

    if-eqz v2, :cond_7

    new-instance v1, Lorg/bouncycastle/asn1/DERApplicationSpecific;

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/d;->b()[B

    move-result-object v2

    invoke-direct {v1, v0, v4, v2}, Lorg/bouncycastle/asn1/DERApplicationSpecific;-><init>(ZI[B)V

    move-object v0, v1

    goto/16 :goto_0

    :cond_7
    and-int/lit16 v2, v3, 0x80

    if-eqz v2, :cond_8

    new-instance v1, Lorg/bouncycastle/asn1/BERTaggedObjectParser;

    new-instance v2, Lorg/bouncycastle/asn1/ASN1StreamParser;

    invoke-direct {v2, v5}, Lorg/bouncycastle/asn1/ASN1StreamParser;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v1, v0, v4, v2}, Lorg/bouncycastle/asn1/BERTaggedObjectParser;-><init>(ZILorg/bouncycastle/asn1/ASN1StreamParser;)V

    move-object v0, v1

    goto/16 :goto_0

    :cond_8
    if-eqz v0, :cond_9

    sparse-switch v4, :sswitch_data_1

    new-instance v0, Lorg/bouncycastle/asn1/DERUnknownTag;

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/d;->b()[B

    move-result-object v2

    invoke-direct {v0, v1, v4, v2}, Lorg/bouncycastle/asn1/DERUnknownTag;-><init>(ZI[B)V

    goto/16 :goto_0

    :sswitch_4
    new-instance v0, Lorg/bouncycastle/asn1/BEROctetStringParser;

    new-instance v1, Lorg/bouncycastle/asn1/ASN1StreamParser;

    invoke-direct {v1, v5}, Lorg/bouncycastle/asn1/ASN1StreamParser;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/BEROctetStringParser;-><init>(Lorg/bouncycastle/asn1/ASN1StreamParser;)V

    goto/16 :goto_0

    :sswitch_5
    new-instance v0, Lorg/bouncycastle/asn1/DERSequenceParser;

    new-instance v1, Lorg/bouncycastle/asn1/ASN1StreamParser;

    invoke-direct {v1, v5}, Lorg/bouncycastle/asn1/ASN1StreamParser;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERSequenceParser;-><init>(Lorg/bouncycastle/asn1/ASN1StreamParser;)V

    goto/16 :goto_0

    :sswitch_6
    new-instance v0, Lorg/bouncycastle/asn1/DERSetParser;

    new-instance v1, Lorg/bouncycastle/asn1/ASN1StreamParser;

    invoke-direct {v1, v5}, Lorg/bouncycastle/asn1/ASN1StreamParser;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERSetParser;-><init>(Lorg/bouncycastle/asn1/ASN1StreamParser;)V

    goto/16 :goto_0

    :sswitch_7
    new-instance v0, Lorg/bouncycastle/asn1/DERExternalParser;

    new-instance v1, Lorg/bouncycastle/asn1/ASN1StreamParser;

    invoke-direct {v1, v5}, Lorg/bouncycastle/asn1/ASN1StreamParser;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERExternalParser;-><init>(Lorg/bouncycastle/asn1/ASN1StreamParser;)V

    goto/16 :goto_0

    :cond_9
    packed-switch v4, :pswitch_data_0

    :try_start_0
    invoke-virtual {v5}, Lorg/bouncycastle/asn1/d;->b()[B

    move-result-object v0

    invoke-static {v4, v0}, Lorg/bouncycastle/asn1/ASN1InputStream;->a(I[B)Lorg/bouncycastle/asn1/DERObject;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto/16 :goto_0

    :pswitch_0
    new-instance v0, Lorg/bouncycastle/asn1/DEROctetStringParser;

    invoke-direct {v0, v5}, Lorg/bouncycastle/asn1/DEROctetStringParser;-><init>(Lorg/bouncycastle/asn1/d;)V

    goto/16 :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/asn1/ASN1Exception;

    const-string v2, "corrupted stream detected"

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/asn1/ASN1Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_1
        0x8 -> :sswitch_0
        0x10 -> :sswitch_2
        0x11 -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x4 -> :sswitch_4
        0x8 -> :sswitch_7
        0x10 -> :sswitch_5
        0x11 -> :sswitch_6
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method final a(ZI)Lorg/bouncycastle/asn1/DERObject;
    .locals 4

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez p1, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/asn1/ASN1StreamParser;->a:Ljava/io/InputStream;

    check-cast v0, Lorg/bouncycastle/asn1/d;

    new-instance v1, Lorg/bouncycastle/asn1/DERTaggedObject;

    new-instance v2, Lorg/bouncycastle/asn1/DEROctetString;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/d;->b()[B

    move-result-object v0

    invoke-direct {v2, v0}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v1, v3, p2, v2}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    move-object v0, v1

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1StreamParser;->b()Lorg/bouncycastle/asn1/ASN1EncodableVector;

    move-result-object v1

    iget-object v0, p0, Lorg/bouncycastle/asn1/ASN1StreamParser;->a:Ljava/io/InputStream;

    instance-of v0, v0, Lorg/bouncycastle/asn1/e;

    if-eqz v0, :cond_2

    iget-object v0, v1, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-ne v0, v2, :cond_1

    new-instance v0, Lorg/bouncycastle/asn1/BERTaggedObject;

    invoke-virtual {v1, v3}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    invoke-direct {v0, v2, p2, v1}, Lorg/bouncycastle/asn1/BERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lorg/bouncycastle/asn1/BERTaggedObject;

    invoke-static {v1}, Lorg/bouncycastle/asn1/a;->a(Lorg/bouncycastle/asn1/ASN1EncodableVector;)Lorg/bouncycastle/asn1/BERSequence;

    move-result-object v1

    invoke-direct {v0, v3, p2, v1}, Lorg/bouncycastle/asn1/BERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    goto :goto_0

    :cond_2
    iget-object v0, v1, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-ne v0, v2, :cond_3

    new-instance v0, Lorg/bouncycastle/asn1/DERTaggedObject;

    invoke-virtual {v1, v3}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    invoke-direct {v0, v2, p2, v1}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    goto :goto_0

    :cond_3
    new-instance v0, Lorg/bouncycastle/asn1/DERTaggedObject;

    invoke-static {v1}, Lorg/bouncycastle/asn1/c;->a(Lorg/bouncycastle/asn1/ASN1EncodableVector;)Lorg/bouncycastle/asn1/DERSequence;

    move-result-object v1

    invoke-direct {v0, v3, p2, v1}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    goto :goto_0
.end method

.method final b()Lorg/bouncycastle/asn1/ASN1EncodableVector;
    .locals 3

    new-instance v1, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    :goto_0
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1StreamParser;->a()Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    if-eqz v0, :cond_1

    instance-of v2, v0, Lorg/bouncycastle/asn1/InMemoryRepresentable;

    if-eqz v2, :cond_0

    check-cast v0, Lorg/bouncycastle/asn1/InMemoryRepresentable;

    invoke-interface {v0}, Lorg/bouncycastle/asn1/InMemoryRepresentable;->g()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lorg/bouncycastle/asn1/DEREncodable;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    goto :goto_0

    :cond_1
    return-object v1
.end method
