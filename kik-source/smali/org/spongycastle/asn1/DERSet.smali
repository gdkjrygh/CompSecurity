.class public Lorg/spongycastle/asn1/DERSet;
.super Lorg/spongycastle/asn1/ASN1Set;
.source "SourceFile"


# instance fields
.field private a:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Set;-><init>()V

    .line 12
    const/4 v0, -0x1

    iput v0, p0, Lorg/spongycastle/asn1/DERSet;->a:I

    .line 19
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/asn1/ASN1Encodable;)V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0, p1}, Lorg/spongycastle/asn1/ASN1Set;-><init>(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 12
    const/4 v0, -0x1

    iput v0, p0, Lorg/spongycastle/asn1/DERSet;->a:I

    .line 28
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V
    .locals 1

    .prologue
    .line 36
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lorg/spongycastle/asn1/ASN1Set;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;Z)V

    .line 12
    const/4 v0, -0x1

    iput v0, p0, Lorg/spongycastle/asn1/DERSet;->a:I

    .line 37
    return-void
.end method

.method constructor <init>(Lorg/spongycastle/asn1/ASN1EncodableVector;B)V
    .locals 1

    .prologue
    .line 52
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/spongycastle/asn1/ASN1Set;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;Z)V

    .line 12
    const/4 v0, -0x1

    iput v0, p0, Lorg/spongycastle/asn1/DERSet;->a:I

    .line 53
    return-void
.end method

.method private e()I
    .locals 3

    .prologue
    .line 58
    iget v0, p0, Lorg/spongycastle/asn1/DERSet;->a:I

    if-gez v0, :cond_1

    .line 60
    const/4 v0, 0x0

    .line 62
    invoke-virtual {p0}, Lorg/spongycastle/asn1/DERSet;->c()Ljava/util/Enumeration;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 64
    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    .line 66
    check-cast v0, Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-interface {v0}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Primitive;->f()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Primitive;->i()I

    move-result v0

    add-int/2addr v0, v1

    move v1, v0

    .line 67
    goto :goto_0

    .line 69
    :cond_0
    iput v1, p0, Lorg/spongycastle/asn1/DERSet;->a:I

    .line 72
    :cond_1
    iget v0, p0, Lorg/spongycastle/asn1/DERSet;->a:I

    return v0
.end method


# virtual methods
.method final a(Lorg/spongycastle/asn1/ASN1OutputStream;)V
    .locals 3

    .prologue
    .line 95
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1OutputStream;->a()Lorg/spongycastle/asn1/ASN1OutputStream;

    move-result-object v1

    .line 96
    invoke-direct {p0}, Lorg/spongycastle/asn1/DERSet;->e()I

    move-result v0

    .line 98
    const/16 v2, 0x31

    invoke-virtual {p1, v2}, Lorg/spongycastle/asn1/ASN1OutputStream;->b(I)V

    .line 99
    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1OutputStream;->a(I)V

    .line 101
    invoke-virtual {p0}, Lorg/spongycastle/asn1/DERSet;->c()Ljava/util/Enumeration;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 103
    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    .line 105
    check-cast v0, Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-virtual {v1, v0}, Lorg/spongycastle/asn1/ASN1OutputStream;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0

    .line 107
    :cond_0
    return-void
.end method

.method final i()I
    .locals 2

    .prologue
    .line 78
    invoke-direct {p0}, Lorg/spongycastle/asn1/DERSet;->e()I

    move-result v0

    .line 80
    invoke-static {v0}, Lorg/spongycastle/asn1/j;->a(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    return v0
.end method
