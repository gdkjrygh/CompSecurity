.class public Lorg/spongycastle/asn1/DERExternal;
.super Lorg/spongycastle/asn1/ASN1Primitive;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field private b:Lorg/spongycastle/asn1/ASN1Integer;

.field private c:Lorg/spongycastle/asn1/ASN1Primitive;

.field private d:I

.field private e:Lorg/spongycastle/asn1/ASN1Primitive;


# direct methods
.method public constructor <init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 19
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Primitive;-><init>()V

    .line 22
    invoke-static {p1, v2}, Lorg/spongycastle/asn1/DERExternal;->a(Lorg/spongycastle/asn1/ASN1EncodableVector;I)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    .line 23
    instance-of v3, v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    if-eqz v3, :cond_6

    .line 25
    check-cast v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    iput-object v0, p0, Lorg/spongycastle/asn1/DERExternal;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 27
    invoke-static {p1, v1}, Lorg/spongycastle/asn1/DERExternal;->a(Lorg/spongycastle/asn1/ASN1EncodableVector;I)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    .line 29
    :goto_0
    instance-of v2, v0, Lorg/spongycastle/asn1/ASN1Integer;

    if-eqz v2, :cond_0

    .line 31
    check-cast v0, Lorg/spongycastle/asn1/ASN1Integer;

    iput-object v0, p0, Lorg/spongycastle/asn1/DERExternal;->b:Lorg/spongycastle/asn1/ASN1Integer;

    .line 32
    add-int/lit8 v1, v1, 0x1

    .line 33
    invoke-static {p1, v1}, Lorg/spongycastle/asn1/DERExternal;->a(Lorg/spongycastle/asn1/ASN1EncodableVector;I)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    .line 35
    :cond_0
    instance-of v2, v0, Lorg/spongycastle/asn1/DERTaggedObject;

    if-nez v2, :cond_1

    .line 37
    iput-object v0, p0, Lorg/spongycastle/asn1/DERExternal;->c:Lorg/spongycastle/asn1/ASN1Primitive;

    .line 38
    add-int/lit8 v1, v1, 0x1

    .line 39
    invoke-static {p1, v1}, Lorg/spongycastle/asn1/DERExternal;->a(Lorg/spongycastle/asn1/ASN1EncodableVector;I)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    .line 42
    :cond_1
    iget-object v2, p1, Lorg/spongycastle/asn1/ASN1EncodableVector;->a:Ljava/util/Vector;

    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v2

    add-int/lit8 v1, v1, 0x1

    if-eq v2, v1, :cond_2

    .line 44
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "input vector too large"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 47
    :cond_2
    instance-of v1, v0, Lorg/spongycastle/asn1/DERTaggedObject;

    if-nez v1, :cond_3

    .line 49
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No tagged object found in vector. Structure doesn\'t seem to be of type External"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 51
    :cond_3
    check-cast v0, Lorg/spongycastle/asn1/DERTaggedObject;

    .line 52
    iget v1, v0, Lorg/spongycastle/asn1/ASN1TaggedObject;->a:I

    if-ltz v1, :cond_4

    const/4 v2, 0x2

    if-le v1, v2, :cond_5

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "invalid encoding value: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    iput v1, p0, Lorg/spongycastle/asn1/DERExternal;->d:I

    .line 53
    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERTaggedObject;->k()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/DERExternal;->e:Lorg/spongycastle/asn1/ASN1Primitive;

    .line 54
    return-void

    :cond_6
    move v1, v2

    goto :goto_0
.end method

.method private static a(Lorg/spongycastle/asn1/ASN1EncodableVector;I)Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 58
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1EncodableVector;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-gt v0, p1, :cond_0

    .line 60
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "too few objects in input vector"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 63
    :cond_0
    invoke-virtual {p0, p1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-interface {v0}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method final a(Lorg/spongycastle/asn1/ASN1OutputStream;)V
    .locals 5

    .prologue
    .line 135
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 136
    iget-object v1, p0, Lorg/spongycastle/asn1/DERExternal;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    if-eqz v1, :cond_0

    .line 138
    iget-object v1, p0, Lorg/spongycastle/asn1/DERExternal;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "DER"

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->a(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 140
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/asn1/DERExternal;->b:Lorg/spongycastle/asn1/ASN1Integer;

    if-eqz v1, :cond_1

    .line 142
    iget-object v1, p0, Lorg/spongycastle/asn1/DERExternal;->b:Lorg/spongycastle/asn1/ASN1Integer;

    const-string v2, "DER"

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/ASN1Integer;->a(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 144
    :cond_1
    iget-object v1, p0, Lorg/spongycastle/asn1/DERExternal;->c:Lorg/spongycastle/asn1/ASN1Primitive;

    if-eqz v1, :cond_2

    .line 146
    iget-object v1, p0, Lorg/spongycastle/asn1/DERExternal;->c:Lorg/spongycastle/asn1/ASN1Primitive;

    const-string v2, "DER"

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/ASN1Primitive;->a(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 148
    :cond_2
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v2, 0x1

    iget v3, p0, Lorg/spongycastle/asn1/DERExternal;->d:I

    iget-object v4, p0, Lorg/spongycastle/asn1/DERExternal;->e:Lorg/spongycastle/asn1/ASN1Primitive;

    invoke-direct {v1, v2, v3, v4}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    .line 149
    const-string v2, "DER"

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/DERTaggedObject;->a(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 150
    const/16 v1, 0x20

    const/16 v2, 0x8

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-virtual {p1, v1, v2, v0}, Lorg/spongycastle/asn1/ASN1OutputStream;->a(II[B)V

    .line 151
    return-void
.end method

.method final a(Lorg/spongycastle/asn1/ASN1Primitive;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 158
    instance-of v1, p1, Lorg/spongycastle/asn1/DERExternal;

    if-nez v1, :cond_1

    .line 188
    :cond_0
    :goto_0
    return v0

    .line 162
    :cond_1
    if-ne p0, p1, :cond_2

    .line 164
    const/4 v0, 0x1

    goto :goto_0

    .line 166
    :cond_2
    check-cast p1, Lorg/spongycastle/asn1/DERExternal;

    .line 167
    iget-object v1, p0, Lorg/spongycastle/asn1/DERExternal;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    if-eqz v1, :cond_3

    .line 169
    iget-object v1, p1, Lorg/spongycastle/asn1/DERExternal;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    if-eqz v1, :cond_0

    iget-object v1, p1, Lorg/spongycastle/asn1/DERExternal;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    iget-object v2, p0, Lorg/spongycastle/asn1/DERExternal;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 174
    :cond_3
    iget-object v1, p0, Lorg/spongycastle/asn1/DERExternal;->b:Lorg/spongycastle/asn1/ASN1Integer;

    if-eqz v1, :cond_4

    .line 176
    iget-object v1, p1, Lorg/spongycastle/asn1/DERExternal;->b:Lorg/spongycastle/asn1/ASN1Integer;

    if-eqz v1, :cond_0

    iget-object v1, p1, Lorg/spongycastle/asn1/DERExternal;->b:Lorg/spongycastle/asn1/ASN1Integer;

    iget-object v2, p0, Lorg/spongycastle/asn1/DERExternal;->b:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/ASN1Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 181
    :cond_4
    iget-object v1, p0, Lorg/spongycastle/asn1/DERExternal;->c:Lorg/spongycastle/asn1/ASN1Primitive;

    if-eqz v1, :cond_5

    .line 183
    iget-object v1, p1, Lorg/spongycastle/asn1/DERExternal;->c:Lorg/spongycastle/asn1/ASN1Primitive;

    if-eqz v1, :cond_0

    iget-object v1, p1, Lorg/spongycastle/asn1/DERExternal;->c:Lorg/spongycastle/asn1/ASN1Primitive;

    iget-object v2, p0, Lorg/spongycastle/asn1/DERExternal;->c:Lorg/spongycastle/asn1/ASN1Primitive;

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/ASN1Primitive;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 188
    :cond_5
    iget-object v0, p0, Lorg/spongycastle/asn1/DERExternal;->e:Lorg/spongycastle/asn1/ASN1Primitive;

    iget-object v1, p1, Lorg/spongycastle/asn1/DERExternal;->e:Lorg/spongycastle/asn1/ASN1Primitive;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1Primitive;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public final c()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 1

    .prologue
    .line 197
    iget-object v0, p0, Lorg/spongycastle/asn1/DERExternal;->c:Lorg/spongycastle/asn1/ASN1Primitive;

    return-object v0
.end method

.method public final d()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .prologue
    .line 206
    iget-object v0, p0, Lorg/spongycastle/asn1/DERExternal;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    return-object v0
.end method

.method public final e()I
    .locals 1

    .prologue
    .line 220
    iget v0, p0, Lorg/spongycastle/asn1/DERExternal;->d:I

    return v0
.end method

.method final h()Z
    .locals 1

    .prologue
    .line 120
    const/4 v0, 0x1

    return v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 101
    const/4 v0, 0x0

    .line 102
    iget-object v1, p0, Lorg/spongycastle/asn1/DERExternal;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    if-eqz v1, :cond_0

    .line 104
    iget-object v0, p0, Lorg/spongycastle/asn1/DERExternal;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->hashCode()I

    move-result v0

    .line 106
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/asn1/DERExternal;->b:Lorg/spongycastle/asn1/ASN1Integer;

    if-eqz v1, :cond_1

    .line 108
    iget-object v1, p0, Lorg/spongycastle/asn1/DERExternal;->b:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1Integer;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    .line 110
    :cond_1
    iget-object v1, p0, Lorg/spongycastle/asn1/DERExternal;->c:Lorg/spongycastle/asn1/ASN1Primitive;

    if-eqz v1, :cond_2

    .line 112
    iget-object v1, p0, Lorg/spongycastle/asn1/DERExternal;->c:Lorg/spongycastle/asn1/ASN1Primitive;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1Primitive;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    .line 114
    :cond_2
    iget-object v1, p0, Lorg/spongycastle/asn1/DERExternal;->e:Lorg/spongycastle/asn1/ASN1Primitive;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1Primitive;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    .line 115
    return v0
.end method

.method final i()I
    .locals 1

    .prologue
    .line 126
    invoke-virtual {p0}, Lorg/spongycastle/asn1/DERExternal;->b()[B

    move-result-object v0

    array-length v0, v0

    return v0
.end method

.method public final j()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 1

    .prologue
    .line 229
    iget-object v0, p0, Lorg/spongycastle/asn1/DERExternal;->e:Lorg/spongycastle/asn1/ASN1Primitive;

    return-object v0
.end method

.method public final k()Lorg/spongycastle/asn1/ASN1Integer;
    .locals 1

    .prologue
    .line 238
    iget-object v0, p0, Lorg/spongycastle/asn1/DERExternal;->b:Lorg/spongycastle/asn1/ASN1Integer;

    return-object v0
.end method
