.class public abstract Lorg/bouncycastle/asn1/ASN1Set;
.super Lorg/bouncycastle/asn1/ASN1Object;


# instance fields
.field protected a:Ljava/util/Vector;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Object;-><init>()V

    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    return-void
.end method

.method public static a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Set;
    .locals 3

    if-eqz p0, :cond_0

    instance-of v0, p0, Lorg/bouncycastle/asn1/ASN1Set;

    if-eqz v0, :cond_1

    :cond_0
    check-cast p0, Lorg/bouncycastle/asn1/ASN1Set;

    return-object p0

    :cond_1
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

.method public static a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/ASN1Set;
    .locals 3

    iget-boolean v0, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Lorg/bouncycastle/asn1/DERSet;

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->i()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/DEREncodable;)V

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->i()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    instance-of v0, v0, Lorg/bouncycastle/asn1/ASN1Set;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->i()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Set;

    goto :goto_0

    :cond_1
    new-instance v1, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->i()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    instance-of v0, v0, Lorg/bouncycastle/asn1/ASN1Sequence;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->i()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->e()Ljava/util/Enumeration;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DEREncodable;

    invoke-virtual {v1, v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    goto :goto_1

    :cond_2
    new-instance v0, Lorg/bouncycastle/asn1/DERSet;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;Z)V

    goto :goto_0

    :cond_3
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

.method private static a(Ljava/util/Enumeration;)Lorg/bouncycastle/asn1/DEREncodable;
    .locals 1

    invoke-interface {p0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DEREncodable;

    if-nez v0, :cond_0

    sget-object v0, Lorg/bouncycastle/asn1/DERNull;->b:Lorg/bouncycastle/asn1/DERNull;

    :cond_0
    return-object v0
.end method

.method private static b(Lorg/bouncycastle/asn1/DEREncodable;)[B
    .locals 2

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v1, Lorg/bouncycastle/asn1/ASN1OutputStream;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/ASN1OutputStream;-><init>(Ljava/io/OutputStream;)V

    :try_start_0
    invoke-virtual {v1, p0}, Lorg/bouncycastle/asn1/ASN1OutputStream;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "cannot encode object added to SET"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a(I)Lorg/bouncycastle/asn1/DEREncodable;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DEREncodable;

    return-object v0
.end method

.method protected final a(Lorg/bouncycastle/asn1/DEREncodable;)V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    return-void
.end method

.method abstract a(Lorg/bouncycastle/asn1/DEROutputStream;)V
.end method

.method final a(Lorg/bouncycastle/asn1/DERObject;)Z
    .locals 5

    const/4 v0, 0x0

    instance-of v1, p1, Lorg/bouncycastle/asn1/ASN1Set;

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    check-cast p1, Lorg/bouncycastle/asn1/ASN1Set;

    iget-object v1, p0, Lorg/bouncycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    move-result v1

    iget-object v2, p1, Lorg/bouncycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v2

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v1}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;

    move-result-object v1

    iget-object v2, p1, Lorg/bouncycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v2}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;

    move-result-object v2

    :cond_2
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {v1}, Lorg/bouncycastle/asn1/ASN1Set;->a(Ljava/util/Enumeration;)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v3

    invoke-static {v2}, Lorg/bouncycastle/asn1/ASN1Set;->a(Ljava/util/Enumeration;)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v4

    invoke-interface {v3}, Lorg/bouncycastle/asn1/DEREncodable;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v3

    invoke-interface {v4}, Lorg/bouncycastle/asn1/DEREncodable;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v4

    if-eq v3, v4, :cond_2

    invoke-virtual {v3, v4}, Lorg/bouncycastle/asn1/DERObject;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_3
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final e()Ljava/util/Enumeration;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;

    move-result-object v0

    return-object v0
.end method

.method public final f()I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    return v0
.end method

.method protected final g()V
    .locals 12

    const/4 v5, 0x1

    const/4 v7, 0x0

    iget-object v0, p0, Lorg/bouncycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-le v0, v5, :cond_6

    iget-object v0, p0, Lorg/bouncycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    add-int/lit8 v2, v0, -0x1

    move v8, v2

    move v4, v5

    :goto_0
    if-eqz v4, :cond_6

    iget-object v0, p0, Lorg/bouncycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v0, v7}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DEREncodable;

    invoke-static {v0}, Lorg/bouncycastle/asn1/ASN1Set;->b(Lorg/bouncycastle/asn1/DEREncodable;)[B

    move-result-object v1

    move v2, v7

    move v3, v7

    move v4, v7

    :goto_1
    if-eq v3, v8, :cond_5

    iget-object v0, p0, Lorg/bouncycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    add-int/lit8 v6, v3, 0x1

    invoke-virtual {v0, v6}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DEREncodable;

    invoke-static {v0}, Lorg/bouncycastle/asn1/ASN1Set;->b(Lorg/bouncycastle/asn1/DEREncodable;)[B

    move-result-object v0

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

    :goto_4
    add-int/lit8 v3, v3, 0x1

    move v4, v2

    move v2, v1

    move-object v1, v0

    goto :goto_1

    :cond_0
    move v6, v7

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

    :cond_4
    iget-object v0, p0, Lorg/bouncycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v0, v3}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Lorg/bouncycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    iget-object v4, p0, Lorg/bouncycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    add-int/lit8 v6, v3, 0x1

    invoke-virtual {v4, v6}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v4, v3}, Ljava/util/Vector;->setElementAt(Ljava/lang/Object;I)V

    iget-object v2, p0, Lorg/bouncycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    add-int/lit8 v4, v3, 0x1

    invoke-virtual {v2, v0, v4}, Ljava/util/Vector;->setElementAt(Ljava/lang/Object;I)V

    move-object v0, v1

    move v2, v5

    move v1, v3

    goto :goto_4

    :cond_5
    move v8, v2

    goto :goto_0

    :cond_6
    return-void
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lorg/bouncycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;

    move-result-object v1

    iget-object v0, p0, Lorg/bouncycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    :goto_0
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Lorg/bouncycastle/asn1/ASN1Set;->a(Ljava/util/Enumeration;)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v2

    mul-int/lit8 v0, v0, 0x11

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    goto :goto_0

    :cond_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/ASN1Set;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
