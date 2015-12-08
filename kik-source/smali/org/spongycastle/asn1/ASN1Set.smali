.class public abstract Lorg/spongycastle/asn1/ASN1Set;
.super Lorg/spongycastle/asn1/ASN1Primitive;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/Vector;

.field private b:Z


# direct methods
.method protected constructor <init>()V
    .locals 1

    .prologue
    .line 137
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Primitive;-><init>()V

    .line 11
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    .line 12
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/spongycastle/asn1/ASN1Set;->b:Z

    .line 138
    return-void
.end method

.method protected constructor <init>(Lorg/spongycastle/asn1/ASN1Encodable;)V
    .locals 1

    .prologue
    .line 145
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Primitive;-><init>()V

    .line 11
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    .line 12
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/spongycastle/asn1/ASN1Set;->b:Z

    .line 146
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 147
    return-void
.end method

.method protected constructor <init>(Lorg/spongycastle/asn1/ASN1EncodableVector;Z)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 155
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Primitive;-><init>()V

    .line 11
    new-instance v1, Ljava/util/Vector;

    invoke-direct {v1}, Ljava/util/Vector;-><init>()V

    iput-object v1, p0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    .line 12
    iput-boolean v0, p0, Lorg/spongycastle/asn1/ASN1Set;->b:Z

    .line 156
    :goto_0
    iget-object v1, p1, Lorg/spongycastle/asn1/ASN1EncodableVector;->a:Ljava/util/Vector;

    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 158
    iget-object v1, p0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 156
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 161
    :cond_0
    if-eqz p2, :cond_1

    .line 163
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Set;->e()V

    .line 165
    :cond_1
    return-void
.end method

.method protected constructor <init>([Lorg/spongycastle/asn1/ASN1Encodable;)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 173
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Primitive;-><init>()V

    .line 11
    new-instance v1, Ljava/util/Vector;

    invoke-direct {v1}, Ljava/util/Vector;-><init>()V

    iput-object v1, p0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    .line 12
    iput-boolean v0, p0, Lorg/spongycastle/asn1/ASN1Set;->b:Z

    .line 174
    :goto_0
    array-length v1, p1

    if-eq v0, v1, :cond_0

    .line 176
    iget-object v1, p0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    aget-object v2, p1, v0

    invoke-virtual {v1, v2}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 174
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 179
    :cond_0
    return-void
.end method

.method private static a(Ljava/util/Enumeration;)Lorg/spongycastle/asn1/ASN1Encodable;
    .locals 1

    .prologue
    .line 359
    invoke-interface {p0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Encodable;

    .line 362
    if-nez v0, :cond_0

    .line 364
    sget-object v0, Lorg/spongycastle/asn1/DERNull;->a:Lorg/spongycastle/asn1/DERNull;

    .line 367
    :cond_0
    return-object v0
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Set;
    .locals 4

    .prologue
    .line 23
    move-object v0, p0

    :goto_0
    if-eqz v0, :cond_0

    instance-of v1, v0, Lorg/spongycastle/asn1/ASN1Set;

    if-eqz v1, :cond_1

    .line 25
    :cond_0
    check-cast v0, Lorg/spongycastle/asn1/ASN1Set;

    .line 48
    :goto_1
    return-object v0

    .line 27
    :cond_1
    instance-of v1, v0, Lorg/spongycastle/asn1/ASN1SetParser;

    if-eqz v1, :cond_2

    .line 29
    check-cast v0, Lorg/spongycastle/asn1/ASN1SetParser;

    invoke-interface {v0}, Lorg/spongycastle/asn1/ASN1SetParser;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    goto :goto_0

    .line 31
    :cond_2
    instance-of v1, v0, [B

    if-eqz v1, :cond_3

    .line 35
    :try_start_0
    check-cast v0, [B

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Primitive;->a([B)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Set;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Set;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_1

    .line 37
    :catch_0
    move-exception v0

    .line 39
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "failed to construct set from byte[]: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 42
    :cond_3
    instance-of v1, v0, Lorg/spongycastle/asn1/ASN1Encodable;

    if-eqz v1, :cond_4

    move-object v1, v0

    .line 44
    check-cast v1, Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-interface {v1}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    .line 46
    instance-of v2, v1, Lorg/spongycastle/asn1/ASN1Set;

    if-eqz v2, :cond_4

    move-object v0, v1

    .line 48
    check-cast v0, Lorg/spongycastle/asn1/ASN1Set;

    goto :goto_1

    .line 52
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

.method public static a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/ASN1Set;
    .locals 3

    .prologue
    .line 75
    iget-boolean v0, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->c:Z

    if-eqz v0, :cond_1

    .line 93
    instance-of v0, p0, Lorg/spongycastle/asn1/BERTaggedObject;

    if-eqz v0, :cond_0

    .line 95
    new-instance v0, Lorg/spongycastle/asn1/BERSet;

    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->k()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/BERSet;-><init>(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 127
    :goto_0
    return-object v0

    .line 99
    :cond_0
    new-instance v0, Lorg/spongycastle/asn1/DLSet;

    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->k()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/DLSet;-><init>(Lorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0

    .line 104
    :cond_1
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->k()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    instance-of v0, v0, Lorg/spongycastle/asn1/ASN1Set;

    if-eqz v0, :cond_2

    .line 106
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->k()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Set;

    goto :goto_0

    .line 115
    :cond_2
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 117
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->k()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    instance-of v0, v0, Lorg/spongycastle/asn1/ASN1Sequence;

    if-eqz v0, :cond_4

    .line 119
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->k()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Sequence;

    .line 121
    instance-of v1, p0, Lorg/spongycastle/asn1/BERTaggedObject;

    if-eqz v1, :cond_3

    .line 123
    new-instance v1, Lorg/spongycastle/asn1/BERSet;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Sequence;->c()[Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/BERSet;-><init>([Lorg/spongycastle/asn1/ASN1Encodable;)V

    move-object v0, v1

    goto :goto_0

    .line 127
    :cond_3
    new-instance v1, Lorg/spongycastle/asn1/DLSet;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Sequence;->c()[Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DLSet;-><init>([Lorg/spongycastle/asn1/ASN1Encodable;)V

    move-object v0, v1

    goto :goto_0

    .line 133
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

.method private static a(Lorg/spongycastle/asn1/ASN1Encodable;)[B
    .locals 2

    .prologue
    .line 391
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 392
    new-instance v1, Lorg/spongycastle/asn1/ASN1OutputStream;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/ASN1OutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 396
    :try_start_0
    invoke-virtual {v1, p0}, Lorg/spongycastle/asn1/ASN1OutputStream;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 403
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0

    .line 400
    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "cannot encode object added to SET"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private e()V
    .locals 12

    .prologue
    const/4 v5, 0x1

    const/4 v7, 0x0

    .line 408
    iget-boolean v0, p0, Lorg/spongycastle/asn1/ASN1Set;->b:Z

    if-nez v0, :cond_6

    .line 410
    iput-boolean v5, p0, Lorg/spongycastle/asn1/ASN1Set;->b:Z

    .line 411
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-le v0, v5, :cond_6

    .line 414
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    add-int/lit8 v2, v0, -0x1

    move v8, v2

    move v4, v5

    .line 416
    :goto_0
    if-eqz v4, :cond_6

    .line 420
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v0, v7}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Set;->a(Lorg/spongycastle/asn1/ASN1Encodable;)[B

    move-result-object v1

    move v2, v7

    move v3, v7

    move v4, v7

    .line 424
    :goto_1
    if-eq v3, v8, :cond_5

    .line 426
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    add-int/lit8 v6, v3, 0x1

    invoke-virtual {v0, v6}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Set;->a(Lorg/spongycastle/asn1/ASN1Encodable;)[B

    move-result-object v0

    .line 428
    array-length v6, v1

    array-length v9, v0

    invoke-static {v6, v9}, Ljava/lang/Math;->min(II)I

    move-result v9

    move v6, v7

    :goto_2
    if-eq v6, v9, :cond_2

    aget-byte v10, v1, v6

    aget-byte v11, v0, v6

    if-eq v10, v11, :cond_1

    aget-byte v9, v1, v6

    and-int/lit16 v9, v9, 0xff

    aget-byte v6, v0, v6

    and-int/lit16 v6, v6, 0xff

    if-ge v9, v6, :cond_0

    move v6, v5

    :goto_3
    if-eqz v6, :cond_4

    move v1, v2

    move v2, v4

    .line 443
    :goto_4
    add-int/lit8 v3, v3, 0x1

    move v4, v2

    move v2, v1

    move-object v1, v0

    .line 444
    goto :goto_1

    :cond_0
    move v6, v7

    .line 428
    goto :goto_3

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_2
    array-length v6, v1

    if-ne v9, v6, :cond_3

    move v6, v5

    goto :goto_3

    :cond_3
    move v6, v7

    goto :goto_3

    .line 434
    :cond_4
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v0, v3}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    .line 436
    iget-object v2, p0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    iget-object v4, p0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    add-int/lit8 v6, v3, 0x1

    invoke-virtual {v4, v6}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v4, v3}, Ljava/util/Vector;->setElementAt(Ljava/lang/Object;I)V

    .line 437
    iget-object v2, p0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    add-int/lit8 v4, v3, 0x1

    invoke-virtual {v2, v0, v4}, Ljava/util/Vector;->setElementAt(Ljava/lang/Object;I)V

    move-object v0, v1

    move v2, v5

    move v1, v3

    .line 440
    goto :goto_4

    :cond_5
    move v8, v2

    .line 447
    goto :goto_0

    .line 450
    :cond_6
    return-void
.end method


# virtual methods
.method public final a(I)Lorg/spongycastle/asn1/ASN1Encodable;
    .locals 1

    .prologue
    .line 199
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

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

    .line 323
    instance-of v1, p1, Lorg/spongycastle/asn1/ASN1Set;

    if-nez v1, :cond_1

    .line 354
    :cond_0
    :goto_0
    return v0

    .line 328
    :cond_1
    check-cast p1, Lorg/spongycastle/asn1/ASN1Set;

    .line 330
    iget-object v1, p0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    move-result v1

    iget-object v2, p1, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v2

    if-ne v1, v2, :cond_0

    .line 335
    iget-object v1, p0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v1}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;

    move-result-object v1

    .line 336
    iget-object v2, p1, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v2}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;

    move-result-object v2

    .line 338
    :cond_2
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 340
    invoke-static {v1}, Lorg/spongycastle/asn1/ASN1Set;->a(Ljava/util/Enumeration;)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v3

    .line 341
    invoke-static {v2}, Lorg/spongycastle/asn1/ASN1Set;->a(Ljava/util/Enumeration;)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v4

    .line 343
    invoke-interface {v3}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v3

    .line 344
    invoke-interface {v4}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v4

    .line 346
    if-eq v3, v4, :cond_2

    invoke-virtual {v3, v4}, Lorg/spongycastle/asn1/ASN1Primitive;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    .line 354
    :cond_3
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final c()Ljava/util/Enumeration;
    .locals 1

    .prologue
    .line 187
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;

    move-result-object v0

    return-object v0
.end method

.method public final d()I
    .locals 1

    .prologue
    .line 209
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    return v0
.end method

.method final f()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 3

    .prologue
    .line 284
    iget-boolean v0, p0, Lorg/spongycastle/asn1/ASN1Set;->b:Z

    if-eqz v0, :cond_0

    .line 286
    new-instance v0, Lorg/spongycastle/asn1/DERSet;

    invoke-direct {v0}, Lorg/spongycastle/asn1/DERSet;-><init>()V

    .line 288
    iget-object v1, p0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    iput-object v1, v0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    .line 307
    :goto_0
    return-object v0

    .line 294
    :cond_0
    new-instance v1, Ljava/util/Vector;

    invoke-direct {v1}, Ljava/util/Vector;-><init>()V

    .line 296
    const/4 v0, 0x0

    :goto_1
    iget-object v2, p0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v2

    if-eq v0, v2, :cond_1

    .line 298
    iget-object v2, p0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v2, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 296
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 301
    :cond_1
    new-instance v0, Lorg/spongycastle/asn1/DERSet;

    invoke-direct {v0}, Lorg/spongycastle/asn1/DERSet;-><init>()V

    .line 303
    iput-object v1, v0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    .line 305
    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1Set;->e()V

    goto :goto_0
.end method

.method final g()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 313
    new-instance v0, Lorg/spongycastle/asn1/DLSet;

    invoke-direct {v0}, Lorg/spongycastle/asn1/DLSet;-><init>()V

    .line 315
    iget-object v1, p0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    iput-object v1, v0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    .line 317
    return-object v0
.end method

.method final h()Z
    .locals 1

    .prologue
    .line 454
    const/4 v0, 0x1

    return v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 268
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;

    move-result-object v1

    .line 269
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    .line 271
    :goto_0
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 273
    invoke-static {v1}, Lorg/spongycastle/asn1/ASN1Set;->a(Ljava/util/Enumeration;)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    .line 274
    mul-int/lit8 v0, v0, 0x11

    .line 276
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    .line 277
    goto :goto_0

    .line 279
    :cond_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 462
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
