.class public Lorg/spongycastle/asn1/BEROctetString;
.super Lorg/spongycastle/asn1/ASN1OctetString;
.source "SourceFile"


# instance fields
.field private b:[Lorg/spongycastle/asn1/ASN1OctetString;


# direct methods
.method public constructor <init>([B)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0, p1}, Lorg/spongycastle/asn1/ASN1OctetString;-><init>([B)V

    .line 51
    return-void
.end method

.method public constructor <init>([Lorg/spongycastle/asn1/ASN1OctetString;)V
    .locals 1

    .prologue
    .line 56
    invoke-static {p1}, Lorg/spongycastle/asn1/BEROctetString;->a([Lorg/spongycastle/asn1/ASN1OctetString;)[B

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/spongycastle/asn1/ASN1OctetString;-><init>([B)V

    .line 58
    iput-object p1, p0, Lorg/spongycastle/asn1/BEROctetString;->b:[Lorg/spongycastle/asn1/ASN1OctetString;

    .line 59
    return-void
.end method

.method static a(Lorg/spongycastle/asn1/ASN1Sequence;)Lorg/spongycastle/asn1/BEROctetString;
    .locals 5

    .prologue
    .line 157
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v0

    new-array v3, v0, [Lorg/spongycastle/asn1/ASN1OctetString;

    .line 158
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->d()Ljava/util/Enumeration;

    move-result-object v4

    .line 159
    const/4 v0, 0x0

    move v1, v0

    .line 161
    :goto_0
    invoke-interface {v4}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 163
    add-int/lit8 v2, v1, 0x1

    invoke-interface {v4}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1OctetString;

    aput-object v0, v3, v1

    move v1, v2

    goto :goto_0

    .line 166
    :cond_0
    new-instance v0, Lorg/spongycastle/asn1/BEROctetString;

    invoke-direct {v0, v3}, Lorg/spongycastle/asn1/BEROctetString;-><init>([Lorg/spongycastle/asn1/ASN1OctetString;)V

    return-object v0
.end method

.method private static a([Lorg/spongycastle/asn1/ASN1OctetString;)[B
    .locals 4

    .prologue
    .line 21
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 23
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v0, p0

    if-eq v1, v0, :cond_0

    .line 27
    :try_start_0
    aget-object v0, p0, v1

    check-cast v0, Lorg/spongycastle/asn1/DEROctetString;

    .line 29
    invoke-virtual {v0}, Lorg/spongycastle/asn1/DEROctetString;->d()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 23
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 33
    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v1, p0, v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " found in input should only contain DEROctetString"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 35
    :catch_1
    move-exception v0

    .line 37
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "exception converting octets "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 41
    :cond_0
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lorg/spongycastle/asn1/BEROctetString;)[Lorg/spongycastle/asn1/ASN1OctetString;
    .locals 1

    .prologue
    .line 8
    iget-object v0, p0, Lorg/spongycastle/asn1/BEROctetString;->b:[Lorg/spongycastle/asn1/ASN1OctetString;

    return-object v0
.end method


# virtual methods
.method public final a(Lorg/spongycastle/asn1/ASN1OutputStream;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 139
    const/16 v0, 0x24

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1OutputStream;->b(I)V

    .line 141
    const/16 v0, 0x80

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1OutputStream;->b(I)V

    .line 146
    invoke-virtual {p0}, Lorg/spongycastle/asn1/BEROctetString;->j()Ljava/util/Enumeration;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 148
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1OutputStream;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0

    .line 151
    :cond_0
    invoke-virtual {p1, v2}, Lorg/spongycastle/asn1/ASN1OutputStream;->b(I)V

    .line 152
    invoke-virtual {p1, v2}, Lorg/spongycastle/asn1/ASN1OutputStream;->b(I)V

    .line 153
    return-void
.end method

.method public d()[B
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lorg/spongycastle/asn1/BEROctetString;->a:[B

    return-object v0
.end method

.method final h()Z
    .locals 1

    .prologue
    .line 120
    const/4 v0, 0x1

    return v0
.end method

.method final i()I
    .locals 3

    .prologue
    .line 126
    const/4 v0, 0x0

    .line 127
    invoke-virtual {p0}, Lorg/spongycastle/asn1/BEROctetString;->j()Ljava/util/Enumeration;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 129
    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-interface {v0}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Primitive;->i()I

    move-result v0

    add-int/2addr v0, v1

    move v1, v0

    goto :goto_0

    .line 132
    :cond_0
    add-int/lit8 v0, v1, 0x2

    add-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public j()Ljava/util/Enumeration;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 71
    iget-object v0, p0, Lorg/spongycastle/asn1/BEROctetString;->b:[Lorg/spongycastle/asn1/ASN1OctetString;

    if-nez v0, :cond_2

    .line 73
    new-instance v3, Ljava/util/Vector;

    invoke-direct {v3}, Ljava/util/Vector;-><init>()V

    move v0, v1

    :goto_0
    iget-object v2, p0, Lorg/spongycastle/asn1/BEROctetString;->a:[B

    array-length v2, v2

    if-ge v0, v2, :cond_1

    add-int/lit16 v2, v0, 0x3e8

    iget-object v4, p0, Lorg/spongycastle/asn1/BEROctetString;->a:[B

    array-length v4, v4

    if-le v2, v4, :cond_0

    iget-object v2, p0, Lorg/spongycastle/asn1/BEROctetString;->a:[B

    array-length v2, v2

    :goto_1
    sub-int/2addr v2, v0

    new-array v2, v2, [B

    iget-object v4, p0, Lorg/spongycastle/asn1/BEROctetString;->a:[B

    array-length v5, v2

    invoke-static {v4, v0, v2, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v4, Lorg/spongycastle/asn1/DEROctetString;

    invoke-direct {v4, v2}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    invoke-virtual {v3, v4}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    add-int/lit16 v0, v0, 0x3e8

    goto :goto_0

    :cond_0
    add-int/lit16 v2, v0, 0x3e8

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;

    move-result-object v0

    .line 76
    :goto_2
    return-object v0

    :cond_2
    new-instance v0, Lorg/spongycastle/asn1/b;

    invoke-direct {v0, p0}, Lorg/spongycastle/asn1/b;-><init>(Lorg/spongycastle/asn1/BEROctetString;)V

    goto :goto_2
.end method
