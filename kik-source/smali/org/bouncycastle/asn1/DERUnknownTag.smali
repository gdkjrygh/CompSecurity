.class public Lorg/bouncycastle/asn1/DERUnknownTag;
.super Lorg/bouncycastle/asn1/DERObject;


# instance fields
.field private a:Z

.field private b:I

.field private c:[B


# direct methods
.method public constructor <init>(ZI[B)V
    .locals 0

    invoke-direct {p0}, Lorg/bouncycastle/asn1/DERObject;-><init>()V

    iput-boolean p1, p0, Lorg/bouncycastle/asn1/DERUnknownTag;->a:Z

    iput p2, p0, Lorg/bouncycastle/asn1/DERUnknownTag;->b:I

    iput-object p3, p0, Lorg/bouncycastle/asn1/DERUnknownTag;->c:[B

    return-void
.end method


# virtual methods
.method final a(Lorg/bouncycastle/asn1/DEROutputStream;)V
    .locals 3

    iget-boolean v0, p0, Lorg/bouncycastle/asn1/DERUnknownTag;->a:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x20

    :goto_0
    iget v1, p0, Lorg/bouncycastle/asn1/DERUnknownTag;->b:I

    iget-object v2, p0, Lorg/bouncycastle/asn1/DERUnknownTag;->c:[B

    invoke-virtual {p1, v0, v1, v2}, Lorg/bouncycastle/asn1/DEROutputStream;->a(II[B)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lorg/bouncycastle/asn1/DERUnknownTag;->b:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    instance-of v1, p1, Lorg/bouncycastle/asn1/DERUnknownTag;

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    check-cast p1, Lorg/bouncycastle/asn1/DERUnknownTag;

    iget-boolean v1, p0, Lorg/bouncycastle/asn1/DERUnknownTag;->a:Z

    iget-boolean v2, p1, Lorg/bouncycastle/asn1/DERUnknownTag;->a:Z

    if-ne v1, v2, :cond_0

    iget v1, p0, Lorg/bouncycastle/asn1/DERUnknownTag;->b:I

    iget v2, p1, Lorg/bouncycastle/asn1/DERUnknownTag;->b:I

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/asn1/DERUnknownTag;->c:[B

    iget-object v2, p1, Lorg/bouncycastle/asn1/DERUnknownTag;->c:[B

    invoke-static {v1, v2}, Lorg/bouncycastle/util/Arrays;->a([B[B)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final f()[B
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/DERUnknownTag;->c:[B

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lorg/bouncycastle/asn1/DERUnknownTag;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    :goto_0
    iget v1, p0, Lorg/bouncycastle/asn1/DERUnknownTag;->b:I

    xor-int/2addr v0, v1

    iget-object v1, p0, Lorg/bouncycastle/asn1/DERUnknownTag;->c:[B

    invoke-static {v1}, Lorg/bouncycastle/util/Arrays;->b([B)I

    move-result v1

    xor-int/2addr v0, v1

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
