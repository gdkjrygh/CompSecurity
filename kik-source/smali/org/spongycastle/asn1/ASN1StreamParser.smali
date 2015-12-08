.class public Lorg/spongycastle/asn1/ASN1StreamParser;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/io/InputStream;

.field private final b:I

.field private final c:[[B


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    .prologue
    .line 16
    invoke-static {p1}, Lorg/spongycastle/asn1/j;->a(Ljava/io/InputStream;)I

    move-result v0

    invoke-direct {p0, p1, v0}, Lorg/spongycastle/asn1/ASN1StreamParser;-><init>(Ljava/io/InputStream;I)V

    .line 17
    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 1

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lorg/spongycastle/asn1/ASN1StreamParser;->a:Ljava/io/InputStream;

    .line 24
    iput p2, p0, Lorg/spongycastle/asn1/ASN1StreamParser;->b:I

    .line 26
    const/16 v0, 0xb

    new-array v0, v0, [[B

    iput-object v0, p0, Lorg/spongycastle/asn1/ASN1StreamParser;->c:[[B

    .line 27
    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Encodable;
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 122
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1StreamParser;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v3

    .line 123
    const/4 v0, -0x1

    if-ne v3, v0, :cond_0

    .line 125
    const/4 v0, 0x0

    .line 211
    :goto_0
    return-object v0

    .line 131
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1StreamParser;->a:Ljava/io/InputStream;

    instance-of v0, v0, Lorg/spongycastle/asn1/f;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1StreamParser;->a:Ljava/io/InputStream;

    check-cast v0, Lorg/spongycastle/asn1/f;

    invoke-virtual {v0, v2}, Lorg/spongycastle/asn1/f;->a(Z)V

    .line 136
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1StreamParser;->a:Ljava/io/InputStream;

    invoke-static {v0, v3}, Lorg/spongycastle/asn1/ASN1InputStream;->a(Ljava/io/InputStream;I)I

    move-result v4

    .line 138
    and-int/lit8 v0, v3, 0x20

    if-eqz v0, :cond_2

    move v0, v1

    .line 143
    :goto_1
    iget-object v2, p0, Lorg/spongycastle/asn1/ASN1StreamParser;->a:Ljava/io/InputStream;

    iget v5, p0, Lorg/spongycastle/asn1/ASN1StreamParser;->b:I

    invoke-static {v2, v5}, Lorg/spongycastle/asn1/ASN1InputStream;->b(Ljava/io/InputStream;I)I

    move-result v2

    .line 145
    if-gez v2, :cond_6

    .line 147
    if-nez v0, :cond_3

    .line 149
    new-instance v0, Ljava/io/IOException;

    const-string v1, "indefinite length primitive encoding encountered"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    move v0, v2

    .line 138
    goto :goto_1

    .line 152
    :cond_3
    new-instance v0, Lorg/spongycastle/asn1/f;

    iget-object v2, p0, Lorg/spongycastle/asn1/ASN1StreamParser;->a:Ljava/io/InputStream;

    iget v5, p0, Lorg/spongycastle/asn1/ASN1StreamParser;->b:I

    invoke-direct {v0, v2, v5}, Lorg/spongycastle/asn1/f;-><init>(Ljava/io/InputStream;I)V

    .line 153
    new-instance v2, Lorg/spongycastle/asn1/ASN1StreamParser;

    iget v5, p0, Lorg/spongycastle/asn1/ASN1StreamParser;->b:I

    invoke-direct {v2, v0, v5}, Lorg/spongycastle/asn1/ASN1StreamParser;-><init>(Ljava/io/InputStream;I)V

    .line 155
    and-int/lit8 v0, v3, 0x40

    if-eqz v0, :cond_4

    .line 157
    new-instance v0, Lorg/spongycastle/asn1/BERApplicationSpecificParser;

    invoke-direct {v0, v4, v2}, Lorg/spongycastle/asn1/BERApplicationSpecificParser;-><init>(ILorg/spongycastle/asn1/ASN1StreamParser;)V

    goto :goto_0

    .line 160
    :cond_4
    and-int/lit16 v0, v3, 0x80

    if-eqz v0, :cond_5

    .line 162
    new-instance v0, Lorg/spongycastle/asn1/BERTaggedObjectParser;

    invoke-direct {v0, v1, v4, v2}, Lorg/spongycastle/asn1/BERTaggedObjectParser;-><init>(ZILorg/spongycastle/asn1/ASN1StreamParser;)V

    goto :goto_0

    .line 165
    :cond_5
    sparse-switch v4, :sswitch_data_0

    new-instance v0, Lorg/spongycastle/asn1/ASN1Exception;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unknown BER object encountered: 0x"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_0
    new-instance v0, Lorg/spongycastle/asn1/DERExternalParser;

    invoke-direct {v0, v2}, Lorg/spongycastle/asn1/DERExternalParser;-><init>(Lorg/spongycastle/asn1/ASN1StreamParser;)V

    goto :goto_0

    :sswitch_1
    new-instance v0, Lorg/spongycastle/asn1/BEROctetStringParser;

    invoke-direct {v0, v2}, Lorg/spongycastle/asn1/BEROctetStringParser;-><init>(Lorg/spongycastle/asn1/ASN1StreamParser;)V

    goto :goto_0

    :sswitch_2
    new-instance v0, Lorg/spongycastle/asn1/BERSequenceParser;

    invoke-direct {v0, v2}, Lorg/spongycastle/asn1/BERSequenceParser;-><init>(Lorg/spongycastle/asn1/ASN1StreamParser;)V

    goto :goto_0

    :sswitch_3
    new-instance v0, Lorg/spongycastle/asn1/BERSetParser;

    invoke-direct {v0, v2}, Lorg/spongycastle/asn1/BERSetParser;-><init>(Lorg/spongycastle/asn1/ASN1StreamParser;)V

    goto/16 :goto_0

    .line 169
    :cond_6
    new-instance v5, Lorg/spongycastle/asn1/e;

    iget-object v1, p0, Lorg/spongycastle/asn1/ASN1StreamParser;->a:Ljava/io/InputStream;

    invoke-direct {v5, v1, v2}, Lorg/spongycastle/asn1/e;-><init>(Ljava/io/InputStream;I)V

    .line 171
    and-int/lit8 v1, v3, 0x40

    if-eqz v1, :cond_7

    .line 173
    new-instance v1, Lorg/spongycastle/asn1/DERApplicationSpecific;

    invoke-virtual {v5}, Lorg/spongycastle/asn1/e;->b()[B

    move-result-object v2

    invoke-direct {v1, v0, v4, v2}, Lorg/spongycastle/asn1/DERApplicationSpecific;-><init>(ZI[B)V

    move-object v0, v1

    goto/16 :goto_0

    .line 176
    :cond_7
    and-int/lit16 v1, v3, 0x80

    if-eqz v1, :cond_8

    .line 178
    new-instance v1, Lorg/spongycastle/asn1/BERTaggedObjectParser;

    new-instance v2, Lorg/spongycastle/asn1/ASN1StreamParser;

    invoke-direct {v2, v5}, Lorg/spongycastle/asn1/ASN1StreamParser;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v1, v0, v4, v2}, Lorg/spongycastle/asn1/BERTaggedObjectParser;-><init>(ZILorg/spongycastle/asn1/ASN1StreamParser;)V

    move-object v0, v1

    goto/16 :goto_0

    .line 181
    :cond_8
    if-eqz v0, :cond_9

    .line 184
    sparse-switch v4, :sswitch_data_1

    .line 198
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unknown tag "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " encountered"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 190
    :sswitch_4
    new-instance v0, Lorg/spongycastle/asn1/BEROctetStringParser;

    new-instance v1, Lorg/spongycastle/asn1/ASN1StreamParser;

    invoke-direct {v1, v5}, Lorg/spongycastle/asn1/ASN1StreamParser;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/BEROctetStringParser;-><init>(Lorg/spongycastle/asn1/ASN1StreamParser;)V

    goto/16 :goto_0

    .line 192
    :sswitch_5
    new-instance v0, Lorg/spongycastle/asn1/DERSequenceParser;

    new-instance v1, Lorg/spongycastle/asn1/ASN1StreamParser;

    invoke-direct {v1, v5}, Lorg/spongycastle/asn1/ASN1StreamParser;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/DERSequenceParser;-><init>(Lorg/spongycastle/asn1/ASN1StreamParser;)V

    goto/16 :goto_0

    .line 194
    :sswitch_6
    new-instance v0, Lorg/spongycastle/asn1/DERSetParser;

    new-instance v1, Lorg/spongycastle/asn1/ASN1StreamParser;

    invoke-direct {v1, v5}, Lorg/spongycastle/asn1/ASN1StreamParser;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/DERSetParser;-><init>(Lorg/spongycastle/asn1/ASN1StreamParser;)V

    goto/16 :goto_0

    .line 196
    :sswitch_7
    new-instance v0, Lorg/spongycastle/asn1/DERExternalParser;

    new-instance v1, Lorg/spongycastle/asn1/ASN1StreamParser;

    invoke-direct {v1, v5}, Lorg/spongycastle/asn1/ASN1StreamParser;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/DERExternalParser;-><init>(Lorg/spongycastle/asn1/ASN1StreamParser;)V

    goto/16 :goto_0

    .line 203
    :cond_9
    packed-switch v4, :pswitch_data_0

    .line 211
    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1StreamParser;->c:[[B

    invoke-static {v4, v5, v0}, Lorg/spongycastle/asn1/ASN1InputStream;->a(ILorg/spongycastle/asn1/e;[[B)Lorg/spongycastle/asn1/ASN1Primitive;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto/16 :goto_0

    .line 206
    :pswitch_0
    new-instance v0, Lorg/spongycastle/asn1/DEROctetStringParser;

    invoke-direct {v0, v5}, Lorg/spongycastle/asn1/DEROctetStringParser;-><init>(Lorg/spongycastle/asn1/e;)V

    goto/16 :goto_0

    .line 213
    :catch_0
    move-exception v0

    .line 215
    new-instance v1, Lorg/spongycastle/asn1/ASN1Exception;

    const-string v2, "corrupted stream detected"

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/asn1/ASN1Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 165
    nop

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_1
        0x8 -> :sswitch_0
        0x10 -> :sswitch_2
        0x11 -> :sswitch_3
    .end sparse-switch

    .line 184
    :sswitch_data_1
    .sparse-switch
        0x4 -> :sswitch_4
        0x8 -> :sswitch_7
        0x10 -> :sswitch_5
        0x11 -> :sswitch_6
    .end sparse-switch

    .line 203
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method final a(ZI)Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 98
    if-nez p1, :cond_0

    .line 101
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1StreamParser;->a:Ljava/io/InputStream;

    check-cast v0, Lorg/spongycastle/asn1/e;

    .line 102
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    new-instance v2, Lorg/spongycastle/asn1/DEROctetString;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/e;->b()[B

    move-result-object v0

    invoke-direct {v2, v0}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v1, v3, p2, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    move-object v0, v1

    .line 114
    :goto_0
    return-object v0

    .line 105
    :cond_0
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1StreamParser;->b()Lorg/spongycastle/asn1/ASN1EncodableVector;

    move-result-object v1

    .line 107
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1StreamParser;->a:Ljava/io/InputStream;

    instance-of v0, v0, Lorg/spongycastle/asn1/f;

    if-eqz v0, :cond_2

    .line 109
    iget-object v0, v1, Lorg/spongycastle/asn1/ASN1EncodableVector;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-ne v0, v2, :cond_1

    new-instance v0, Lorg/spongycastle/asn1/BERTaggedObject;

    invoke-virtual {v1, v3}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-direct {v0, v2, p2, v1}, Lorg/spongycastle/asn1/BERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lorg/spongycastle/asn1/BERTaggedObject;

    invoke-static {v1}, Lorg/spongycastle/asn1/a;->a(Lorg/spongycastle/asn1/ASN1EncodableVector;)Lorg/spongycastle/asn1/BERSequence;

    move-result-object v1

    invoke-direct {v0, v3, p2, v1}, Lorg/spongycastle/asn1/BERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0

    .line 114
    :cond_2
    iget-object v0, v1, Lorg/spongycastle/asn1/ASN1EncodableVector;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-ne v0, v2, :cond_3

    new-instance v0, Lorg/spongycastle/asn1/DERTaggedObject;

    invoke-virtual {v1, v3}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-direct {v0, v2, p2, v1}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0

    :cond_3
    new-instance v0, Lorg/spongycastle/asn1/DERTaggedObject;

    invoke-static {v1}, Lorg/spongycastle/asn1/d;->a(Lorg/spongycastle/asn1/ASN1EncodableVector;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-direct {v0, v3, p2, v1}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0
.end method

.method final b()Lorg/spongycastle/asn1/ASN1EncodableVector;
    .locals 3

    .prologue
    .line 230
    new-instance v1, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 233
    :goto_0
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1StreamParser;->a()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 235
    instance-of v2, v0, Lorg/spongycastle/asn1/InMemoryRepresentable;

    if-eqz v2, :cond_0

    .line 237
    check-cast v0, Lorg/spongycastle/asn1/InMemoryRepresentable;

    invoke-interface {v0}, Lorg/spongycastle/asn1/InMemoryRepresentable;->e()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0

    .line 241
    :cond_0
    invoke-interface {v0}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0

    .line 245
    :cond_1
    return-object v1
.end method
