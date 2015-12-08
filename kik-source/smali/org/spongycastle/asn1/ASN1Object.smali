.class public abstract Lorg/spongycastle/asn1/ASN1Object;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/ASN1Encodable;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Lorg/spongycastle/asn1/ASN1Primitive;
.end method

.method public final a(Ljava/lang/String;)[B
    .locals 2

    .prologue
    .line 37
    const-string v0, "DER"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 39
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 40
    new-instance v1, Lorg/spongycastle/asn1/DEROutputStream;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DEROutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 42
    invoke-virtual {v1, p0}, Lorg/spongycastle/asn1/DEROutputStream;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 44
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 56
    :goto_0
    return-object v0

    .line 46
    :cond_0
    const-string v0, "DL"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 48
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 49
    new-instance v1, Lorg/spongycastle/asn1/DLOutputStream;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DLOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 51
    invoke-virtual {v1, p0}, Lorg/spongycastle/asn1/DLOutputStream;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 53
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    goto :goto_0

    .line 56
    :cond_1
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1Object;->b()[B

    move-result-object v0

    goto :goto_0
.end method

.method public b()[B
    .locals 2

    .prologue
    .line 18
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 19
    new-instance v1, Lorg/spongycastle/asn1/ASN1OutputStream;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/ASN1OutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 21
    invoke-virtual {v1, p0}, Lorg/spongycastle/asn1/ASN1OutputStream;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 23
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 67
    if-ne p0, p1, :cond_0

    .line 69
    const/4 v0, 0x1

    .line 79
    :goto_0
    return v0

    .line 72
    :cond_0
    instance-of v0, p1, Lorg/spongycastle/asn1/ASN1Encodable;

    if-nez v0, :cond_1

    .line 74
    const/4 v0, 0x0

    goto :goto_0

    .line 77
    :cond_1
    check-cast p1, Lorg/spongycastle/asn1/ASN1Encodable;

    .line 79
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1Object;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-interface {p1}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1Primitive;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 61
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1Object;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Primitive;->hashCode()I

    move-result v0

    return v0
.end method
