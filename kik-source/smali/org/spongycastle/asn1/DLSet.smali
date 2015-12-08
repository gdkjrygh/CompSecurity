.class public Lorg/spongycastle/asn1/DLSet;
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

    iput v0, p0, Lorg/spongycastle/asn1/DLSet;->a:I

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

    iput v0, p0, Lorg/spongycastle/asn1/DLSet;->a:I

    .line 28
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V
    .locals 1

    .prologue
    .line 36
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/spongycastle/asn1/ASN1Set;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;Z)V

    .line 12
    const/4 v0, -0x1

    iput v0, p0, Lorg/spongycastle/asn1/DLSet;->a:I

    .line 37
    return-void
.end method

.method public constructor <init>([Lorg/spongycastle/asn1/ASN1Encodable;)V
    .locals 1

    .prologue
    .line 45
    invoke-direct {p0, p1}, Lorg/spongycastle/asn1/ASN1Set;-><init>([Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 12
    const/4 v0, -0x1

    iput v0, p0, Lorg/spongycastle/asn1/DLSet;->a:I

    .line 46
    return-void
.end method

.method private e()I
    .locals 3

    .prologue
    .line 51
    iget v0, p0, Lorg/spongycastle/asn1/DLSet;->a:I

    if-gez v0, :cond_1

    .line 53
    const/4 v0, 0x0

    .line 55
    invoke-virtual {p0}, Lorg/spongycastle/asn1/DLSet;->c()Ljava/util/Enumeration;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 57
    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    .line 59
    check-cast v0, Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-interface {v0}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Primitive;->g()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Primitive;->i()I

    move-result v0

    add-int/2addr v0, v1

    move v1, v0

    .line 60
    goto :goto_0

    .line 62
    :cond_0
    iput v1, p0, Lorg/spongycastle/asn1/DLSet;->a:I

    .line 65
    :cond_1
    iget v0, p0, Lorg/spongycastle/asn1/DLSet;->a:I

    return v0
.end method


# virtual methods
.method final a(Lorg/spongycastle/asn1/ASN1OutputStream;)V
    .locals 3

    .prologue
    .line 88
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1OutputStream;->b()Lorg/spongycastle/asn1/ASN1OutputStream;

    move-result-object v1

    .line 89
    invoke-direct {p0}, Lorg/spongycastle/asn1/DLSet;->e()I

    move-result v0

    .line 91
    const/16 v2, 0x31

    invoke-virtual {p1, v2}, Lorg/spongycastle/asn1/ASN1OutputStream;->b(I)V

    .line 92
    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1OutputStream;->a(I)V

    .line 94
    invoke-virtual {p0}, Lorg/spongycastle/asn1/DLSet;->c()Ljava/util/Enumeration;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 96
    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    .line 98
    check-cast v0, Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-virtual {v1, v0}, Lorg/spongycastle/asn1/ASN1OutputStream;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0

    .line 100
    :cond_0
    return-void
.end method

.method final i()I
    .locals 2

    .prologue
    .line 71
    invoke-direct {p0}, Lorg/spongycastle/asn1/DLSet;->e()I

    move-result v0

    .line 73
    invoke-static {v0}, Lorg/spongycastle/asn1/j;->a(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    return v0
.end method
