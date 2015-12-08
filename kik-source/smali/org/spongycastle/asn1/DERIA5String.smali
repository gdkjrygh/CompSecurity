.class public Lorg/spongycastle/asn1/DERIA5String;
.super Lorg/spongycastle/asn1/ASN1Primitive;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/ASN1String;


# instance fields
.field private a:[B


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 73
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/spongycastle/asn1/DERIA5String;-><init>(Ljava/lang/String;Z)V

    .line 74
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 2

    .prologue
    .line 87
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Primitive;-><init>()V

    .line 88
    if-nez p1, :cond_0

    .line 90
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "string cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 92
    :cond_0
    if-eqz p2, :cond_1

    invoke-static {p1}, Lorg/spongycastle/asn1/DERIA5String;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 94
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "string contains illegal characters"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 97
    :cond_1
    invoke-static {p1}, Lorg/spongycastle/util/Strings;->d(Ljava/lang/String;)[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/DERIA5String;->a:[B

    .line 98
    return-void
.end method

.method constructor <init>([B)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Primitive;-><init>()V

    .line 64
    iput-object p1, p0, Lorg/spongycastle/asn1/DERIA5String;->a:[B

    .line 65
    return-void
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/DERIA5String;
    .locals 3

    .prologue
    .line 25
    if-eqz p0, :cond_0

    instance-of v0, p0, Lorg/spongycastle/asn1/DERIA5String;

    if-eqz v0, :cond_1

    .line 27
    :cond_0
    check-cast p0, Lorg/spongycastle/asn1/DERIA5String;

    return-object p0

    .line 30
    :cond_1
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

.method public static a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/DERIA5String;
    .locals 2

    .prologue
    .line 46
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->k()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    .line 48
    instance-of v1, v0, Lorg/spongycastle/asn1/DERIA5String;

    if-eqz v1, :cond_0

    .line 50
    invoke-static {v0}, Lorg/spongycastle/asn1/DERIA5String;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/DERIA5String;

    move-result-object v0

    .line 54
    :goto_0
    return-object v0

    :cond_0
    new-instance v1, Lorg/spongycastle/asn1/DERIA5String;

    check-cast v0, Lorg/spongycastle/asn1/ASN1OctetString;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERIA5String;-><init>([B)V

    move-object v0, v1

    goto :goto_0
.end method

.method private static b(Ljava/lang/String;)Z
    .locals 3

    .prologue
    .line 159
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 161
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 163
    const/16 v2, 0x7f

    if-le v1, v2, :cond_0

    .line 165
    const/4 v0, 0x0

    .line 169
    :goto_1
    return v0

    .line 159
    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 169
    :cond_1
    const/4 v0, 0x1

    goto :goto_1
.end method


# virtual methods
.method final a(Lorg/spongycastle/asn1/ASN1OutputStream;)V
    .locals 2

    .prologue
    .line 129
    const/16 v0, 0x16

    iget-object v1, p0, Lorg/spongycastle/asn1/DERIA5String;->a:[B

    invoke-virtual {p1, v0, v1}, Lorg/spongycastle/asn1/ASN1OutputStream;->a(I[B)V

    .line 130
    return-void
.end method

.method final a(Lorg/spongycastle/asn1/ASN1Primitive;)Z
    .locals 2

    .prologue
    .line 140
    instance-of v0, p1, Lorg/spongycastle/asn1/DERIA5String;

    if-nez v0, :cond_0

    .line 142
    const/4 v0, 0x0

    .line 147
    :goto_0
    return v0

    .line 145
    :cond_0
    check-cast p1, Lorg/spongycastle/asn1/DERIA5String;

    .line 147
    iget-object v0, p0, Lorg/spongycastle/asn1/DERIA5String;->a:[B

    iget-object v1, p1, Lorg/spongycastle/asn1/DERIA5String;->a:[B

    invoke-static {v0, v1}, Lorg/spongycastle/util/Arrays;->a([B[B)Z

    move-result v0

    goto :goto_0
.end method

.method final h()Z
    .locals 1

    .prologue
    .line 117
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lorg/spongycastle/asn1/DERIA5String;->a:[B

    invoke-static {v0}, Lorg/spongycastle/util/Arrays;->a([B)I

    move-result v0

    return v0
.end method

.method final i()I
    .locals 2

    .prologue
    .line 122
    iget-object v0, p0, Lorg/spongycastle/asn1/DERIA5String;->a:[B

    array-length v0, v0

    invoke-static {v0}, Lorg/spongycastle/asn1/j;->a(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lorg/spongycastle/asn1/DERIA5String;->a:[B

    array-length v1, v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final o_()Ljava/lang/String;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lorg/spongycastle/asn1/DERIA5String;->a:[B

    invoke-static {v0}, Lorg/spongycastle/util/Strings;->b([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 107
    invoke-virtual {p0}, Lorg/spongycastle/asn1/DERIA5String;->o_()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
