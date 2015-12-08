.class public abstract Lorg/spongycastle/asn1/ASN1OctetString;
.super Lorg/spongycastle/asn1/ASN1Primitive;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/ASN1OctetStringParser;


# instance fields
.field a:[B


# direct methods
.method public constructor <init>([B)V
    .locals 2

    .prologue
    .line 83
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Primitive;-><init>()V

    .line 84
    if-nez p1, :cond_0

    .line 86
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "string cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 88
    :cond_0
    iput-object p1, p0, Lorg/spongycastle/asn1/ASN1OctetString;->a:[B

    .line 89
    return-void
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1OctetString;
    .locals 4

    .prologue
    .line 50
    if-eqz p0, :cond_0

    instance-of v0, p0, Lorg/spongycastle/asn1/ASN1OctetString;

    if-eqz v0, :cond_1

    .line 52
    :cond_0
    check-cast p0, Lorg/spongycastle/asn1/ASN1OctetString;

    move-object v0, p0

    .line 71
    :goto_0
    return-object v0

    .line 54
    :cond_1
    instance-of v0, p0, [B

    if-eqz v0, :cond_2

    .line 58
    :try_start_0
    check-cast p0, [B

    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1Primitive;->a([B)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1OctetString;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1OctetString;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 60
    :catch_0
    move-exception v0

    .line 62
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "failed to construct OCTET STRING from byte[]: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 65
    :cond_2
    instance-of v0, p0, Lorg/spongycastle/asn1/ASN1Encodable;

    if-eqz v0, :cond_3

    move-object v0, p0

    .line 67
    check-cast v0, Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-interface {v0}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    .line 69
    instance-of v1, v0, Lorg/spongycastle/asn1/ASN1OctetString;

    if-eqz v1, :cond_3

    .line 71
    check-cast v0, Lorg/spongycastle/asn1/ASN1OctetString;

    goto :goto_0

    .line 75
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "illegal object in getInstance: "

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

.method public static a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/ASN1OctetString;
    .locals 2

    .prologue
    .line 29
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->k()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    .line 31
    instance-of v1, v0, Lorg/spongycastle/asn1/ASN1OctetString;

    if-eqz v1, :cond_0

    .line 33
    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1OctetString;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1OctetString;

    move-result-object v0

    .line 37
    :goto_0
    return-object v0

    :cond_0
    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/BEROctetString;->a(Lorg/spongycastle/asn1/ASN1Sequence;)Lorg/spongycastle/asn1/BEROctetString;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method abstract a(Lorg/spongycastle/asn1/ASN1OutputStream;)V
.end method

.method final a(Lorg/spongycastle/asn1/ASN1Primitive;)Z
    .locals 2

    .prologue
    .line 114
    instance-of v0, p1, Lorg/spongycastle/asn1/ASN1OctetString;

    if-nez v0, :cond_0

    .line 116
    const/4 v0, 0x0

    .line 121
    :goto_0
    return v0

    .line 119
    :cond_0
    check-cast p1, Lorg/spongycastle/asn1/ASN1OctetString;

    .line 121
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1OctetString;->a:[B

    iget-object v1, p1, Lorg/spongycastle/asn1/ASN1OctetString;->a:[B

    invoke-static {v0, v1}, Lorg/spongycastle/util/Arrays;->a([B[B)Z

    move-result v0

    goto :goto_0
.end method

.method public final c()Ljava/io/InputStream;
    .locals 2

    .prologue
    .line 93
    new-instance v0, Ljava/io/ByteArrayInputStream;

    iget-object v1, p0, Lorg/spongycastle/asn1/ASN1OctetString;->a:[B

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object v0
.end method

.method public d()[B
    .locals 1

    .prologue
    .line 103
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1OctetString;->a:[B

    return-object v0
.end method

.method public final e()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 1

    .prologue
    .line 126
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1OctetString;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    return-object v0
.end method

.method final f()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 131
    new-instance v0, Lorg/spongycastle/asn1/DEROctetString;

    iget-object v1, p0, Lorg/spongycastle/asn1/ASN1OctetString;->a:[B

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    return-object v0
.end method

.method final g()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 136
    new-instance v0, Lorg/spongycastle/asn1/DEROctetString;

    iget-object v1, p0, Lorg/spongycastle/asn1/ASN1OctetString;->a:[B

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 108
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/util/Arrays;->a([B)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 144
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "#"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/String;

    iget-object v2, p0, Lorg/spongycastle/asn1/ASN1OctetString;->a:[B

    invoke-static {v2}, Lorg/spongycastle/util/encoders/Hex;->a([B)[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
