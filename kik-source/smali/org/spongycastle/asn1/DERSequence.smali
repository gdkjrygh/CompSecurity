.class public Lorg/spongycastle/asn1/DERSequence;
.super Lorg/spongycastle/asn1/ASN1Sequence;
.source "SourceFile"


# instance fields
.field private b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 15
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Sequence;-><init>()V

    .line 9
    const/4 v0, -0x1

    iput v0, p0, Lorg/spongycastle/asn1/DERSequence;->b:I

    .line 16
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/asn1/ASN1Encodable;)V
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0, p1}, Lorg/spongycastle/asn1/ASN1Sequence;-><init>(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 9
    const/4 v0, -0x1

    iput v0, p0, Lorg/spongycastle/asn1/DERSequence;->b:I

    .line 25
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0, p1}, Lorg/spongycastle/asn1/ASN1Sequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    .line 9
    const/4 v0, -0x1

    iput v0, p0, Lorg/spongycastle/asn1/DERSequence;->b:I

    .line 34
    return-void
.end method

.method public constructor <init>([Lorg/spongycastle/asn1/ASN1Encodable;)V
    .locals 1

    .prologue
    .line 42
    invoke-direct {p0, p1}, Lorg/spongycastle/asn1/ASN1Sequence;-><init>([Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 9
    const/4 v0, -0x1

    iput v0, p0, Lorg/spongycastle/asn1/DERSequence;->b:I

    .line 43
    return-void
.end method

.method private j()I
    .locals 3

    .prologue
    .line 48
    iget v0, p0, Lorg/spongycastle/asn1/DERSequence;->b:I

    if-gez v0, :cond_1

    .line 50
    const/4 v0, 0x0

    .line 52
    invoke-virtual {p0}, Lorg/spongycastle/asn1/DERSequence;->d()Ljava/util/Enumeration;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 54
    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    .line 56
    check-cast v0, Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-interface {v0}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Primitive;->f()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Primitive;->i()I

    move-result v0

    add-int/2addr v0, v1

    move v1, v0

    .line 57
    goto :goto_0

    .line 59
    :cond_0
    iput v1, p0, Lorg/spongycastle/asn1/DERSequence;->b:I

    .line 62
    :cond_1
    iget v0, p0, Lorg/spongycastle/asn1/DERSequence;->b:I

    return v0
.end method


# virtual methods
.method final a(Lorg/spongycastle/asn1/ASN1OutputStream;)V
    .locals 3

    .prologue
    .line 85
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1OutputStream;->a()Lorg/spongycastle/asn1/ASN1OutputStream;

    move-result-object v1

    .line 86
    invoke-direct {p0}, Lorg/spongycastle/asn1/DERSequence;->j()I

    move-result v0

    .line 88
    const/16 v2, 0x30

    invoke-virtual {p1, v2}, Lorg/spongycastle/asn1/ASN1OutputStream;->b(I)V

    .line 89
    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1OutputStream;->a(I)V

    .line 91
    invoke-virtual {p0}, Lorg/spongycastle/asn1/DERSequence;->d()Ljava/util/Enumeration;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 93
    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    .line 95
    check-cast v0, Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-virtual {v1, v0}, Lorg/spongycastle/asn1/ASN1OutputStream;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0

    .line 97
    :cond_0
    return-void
.end method

.method final i()I
    .locals 2

    .prologue
    .line 68
    invoke-direct {p0}, Lorg/spongycastle/asn1/DERSequence;->j()I

    move-result v0

    .line 70
    invoke-static {v0}, Lorg/spongycastle/asn1/j;->a(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    return v0
.end method
