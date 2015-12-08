.class public abstract Lorg/spongycastle/asn1/ASN1Sequence;
.super Lorg/spongycastle/asn1/ASN1Primitive;
.source "SourceFile"


# instance fields
.field protected a:Ljava/util/Vector;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .prologue
    .line 116
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Primitive;-><init>()V

    .line 10
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/asn1/ASN1Sequence;->a:Ljava/util/Vector;

    .line 117
    return-void
.end method

.method protected constructor <init>(Lorg/spongycastle/asn1/ASN1Encodable;)V
    .locals 1

    .prologue
    .line 124
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Primitive;-><init>()V

    .line 10
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/asn1/ASN1Sequence;->a:Ljava/util/Vector;

    .line 125
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1Sequence;->a:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 126
    return-void
.end method

.method protected constructor <init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V
    .locals 3

    .prologue
    .line 133
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Primitive;-><init>()V

    .line 10
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/asn1/ASN1Sequence;->a:Ljava/util/Vector;

    .line 134
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p1, Lorg/spongycastle/asn1/ASN1EncodableVector;->a:Ljava/util/Vector;

    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 136
    iget-object v1, p0, Lorg/spongycastle/asn1/ASN1Sequence;->a:Ljava/util/Vector;

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 134
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 138
    :cond_0
    return-void
.end method

.method protected constructor <init>([Lorg/spongycastle/asn1/ASN1Encodable;)V
    .locals 3

    .prologue
    .line 145
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Primitive;-><init>()V

    .line 10
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/asn1/ASN1Sequence;->a:Ljava/util/Vector;

    .line 146
    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-eq v0, v1, :cond_0

    .line 148
    iget-object v1, p0, Lorg/spongycastle/asn1/ASN1Sequence;->a:Ljava/util/Vector;

    aget-object v2, p1, v0

    invoke-virtual {v1, v2}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 146
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 150
    :cond_0
    return-void
.end method

.method private static a(Ljava/util/Enumeration;)Lorg/spongycastle/asn1/ASN1Encodable;
    .locals 1

    .prologue
    .line 288
    invoke-interface {p0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Encodable;

    .line 290
    return-object v0
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;
    .locals 4

    .prologue
    .line 21
    move-object v0, p0

    :goto_0
    if-eqz v0, :cond_0

    instance-of v1, v0, Lorg/spongycastle/asn1/ASN1Sequence;

    if-eqz v1, :cond_1

    .line 23
    :cond_0
    check-cast v0, Lorg/spongycastle/asn1/ASN1Sequence;

    .line 46
    :goto_1
    return-object v0

    .line 25
    :cond_1
    instance-of v1, v0, Lorg/spongycastle/asn1/ASN1SequenceParser;

    if-eqz v1, :cond_2

    .line 27
    check-cast v0, Lorg/spongycastle/asn1/ASN1SequenceParser;

    invoke-interface {v0}, Lorg/spongycastle/asn1/ASN1SequenceParser;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    goto :goto_0

    .line 29
    :cond_2
    instance-of v1, v0, [B

    if-eqz v1, :cond_3

    .line 33
    :try_start_0
    check-cast v0, [B

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a([B)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_1

    .line 35
    :catch_0
    move-exception v0

    .line 37
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "failed to construct sequence from byte[]: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 40
    :cond_3
    instance-of v1, v0, Lorg/spongycastle/asn1/ASN1Encodable;

    if-eqz v1, :cond_4

    move-object v1, v0

    .line 42
    check-cast v1, Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-interface {v1}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    .line 44
    instance-of v2, v1, Lorg/spongycastle/asn1/ASN1Sequence;

    if-eqz v2, :cond_4

    move-object v0, v1

    .line 46
    check-cast v0, Lorg/spongycastle/asn1/ASN1Sequence;

    goto :goto_1

    .line 50
    :cond_4
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "unknown object in getInstance: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static a(Lorg/spongycastle/asn1/ASN1TaggedObject;Z)Lorg/spongycastle/asn1/ASN1Sequence;
    .locals 3

    .prologue
    .line 73
    if-eqz p1, :cond_1

    .line 75
    iget-boolean v0, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->c:Z

    if-nez v0, :cond_0

    .line 77
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "object implicit - explicit expected."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 80
    :cond_0
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->k()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Primitive;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v0

    .line 104
    :goto_0
    return-object v0

    .line 89
    :cond_1
    iget-boolean v0, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->c:Z

    if-eqz v0, :cond_3

    .line 91
    instance-of v0, p0, Lorg/spongycastle/asn1/BERTaggedObject;

    if-eqz v0, :cond_2

    .line 93
    new-instance v0, Lorg/spongycastle/asn1/BERSequence;

    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->k()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/BERSequence;-><init>(Lorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0

    .line 97
    :cond_2
    new-instance v0, Lorg/spongycastle/asn1/DLSequence;

    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->k()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/DLSequence;-><init>(Lorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0

    .line 102
    :cond_3
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->k()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    instance-of v0, v0, Lorg/spongycastle/asn1/ASN1Sequence;

    if-eqz v0, :cond_4

    .line 104
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->k()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Sequence;

    goto :goto_0

    .line 109
    :cond_4
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
.end method


# virtual methods
.method public a(I)Lorg/spongycastle/asn1/ASN1Encodable;
    .locals 1

    .prologue
    .line 220
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1Sequence;->a:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Encodable;

    return-object v0
.end method

.method abstract a(Lorg/spongycastle/asn1/ASN1OutputStream;)V
.end method

.method final a(Lorg/spongycastle/asn1/ASN1Primitive;)Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 252
    instance-of v1, p1, Lorg/spongycastle/asn1/ASN1Sequence;

    if-nez v1, :cond_1

    .line 283
    :cond_0
    :goto_0
    return v0

    .line 257
    :cond_1
    check-cast p1, Lorg/spongycastle/asn1/ASN1Sequence;

    .line 259
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v1

    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v2

    if-ne v1, v2, :cond_0

    .line 264
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->d()Ljava/util/Enumeration;

    move-result-object v1

    .line 265
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->d()Ljava/util/Enumeration;

    move-result-object v2

    .line 267
    :cond_2
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 269
    invoke-static {v1}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/util/Enumeration;)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v3

    .line 270
    invoke-static {v2}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/util/Enumeration;)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v4

    .line 272
    invoke-interface {v3}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v3

    .line 273
    invoke-interface {v4}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v4

    .line 275
    if-eq v3, v4, :cond_2

    invoke-virtual {v3, v4}, Lorg/spongycastle/asn1/ASN1Primitive;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    .line 283
    :cond_3
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final c()[Lorg/spongycastle/asn1/ASN1Encodable;
    .locals 3

    .prologue
    .line 154
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v0

    new-array v1, v0, [Lorg/spongycastle/asn1/ASN1Encodable;

    .line 156
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v2

    if-eq v0, v2, :cond_0

    .line 158
    invoke-virtual {p0, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    aput-object v2, v1, v0

    .line 156
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 161
    :cond_0
    return-object v1
.end method

.method public d()Ljava/util/Enumeration;
    .locals 1

    .prologue
    .line 166
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1Sequence;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;

    move-result-object v0

    return-object v0
.end method

.method public e()I
    .locals 1

    .prologue
    .line 230
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1Sequence;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    return v0
.end method

.method f()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 295
    new-instance v0, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v0}, Lorg/spongycastle/asn1/DERSequence;-><init>()V

    .line 297
    iget-object v1, p0, Lorg/spongycastle/asn1/ASN1Sequence;->a:Ljava/util/Vector;

    iput-object v1, v0, Lorg/spongycastle/asn1/ASN1Sequence;->a:Ljava/util/Vector;

    .line 299
    return-object v0
.end method

.method g()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 304
    new-instance v0, Lorg/spongycastle/asn1/DLSequence;

    invoke-direct {v0}, Lorg/spongycastle/asn1/DLSequence;-><init>()V

    .line 306
    iget-object v1, p0, Lorg/spongycastle/asn1/ASN1Sequence;->a:Ljava/util/Vector;

    iput-object v1, v0, Lorg/spongycastle/asn1/ASN1Sequence;->a:Ljava/util/Vector;

    .line 308
    return-object v0
.end method

.method final h()Z
    .locals 1

    .prologue
    .line 313
    const/4 v0, 0x1

    return v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 235
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->d()Ljava/util/Enumeration;

    move-result-object v1

    .line 236
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v0

    .line 238
    :goto_0
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 240
    invoke-static {v1}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/util/Enumeration;)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    .line 241
    mul-int/lit8 v0, v0, 0x11

    .line 243
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    .line 244
    goto :goto_0

    .line 246
    :cond_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 321
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1Sequence;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
