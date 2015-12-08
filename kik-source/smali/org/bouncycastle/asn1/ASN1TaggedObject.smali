.class public abstract Lorg/bouncycastle/asn1/ASN1TaggedObject;
.super Lorg/bouncycastle/asn1/ASN1Object;

# interfaces
.implements Lorg/bouncycastle/asn1/ASN1TaggedObjectParser;


# instance fields
.field a:I

.field b:Z

.field c:Z

.field d:Lorg/bouncycastle/asn1/DEREncodable;


# direct methods
.method public constructor <init>(ILorg/bouncycastle/asn1/DEREncodable;)V
    .locals 2

    const/4 v1, 0x1

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;->b:Z

    iput-boolean v1, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;->c:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;->d:Lorg/bouncycastle/asn1/DEREncodable;

    iput-boolean v1, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;->c:Z

    iput p1, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;->a:I

    iput-object p2, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;->d:Lorg/bouncycastle/asn1/DEREncodable;

    return-void
.end method

.method public constructor <init>(ZILorg/bouncycastle/asn1/DEREncodable;)V
    .locals 2

    const/4 v1, 0x1

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;->b:Z

    iput-boolean v1, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;->c:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;->d:Lorg/bouncycastle/asn1/DEREncodable;

    instance-of v0, p3, Lorg/bouncycastle/asn1/ASN1Choice;

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;->c:Z

    :goto_0
    iput p2, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;->a:I

    iput-object p3, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;->d:Lorg/bouncycastle/asn1/DEREncodable;

    return-void

    :cond_0
    iput-boolean p1, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;->c:Z

    goto :goto_0
.end method

.method public static a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1TaggedObject;
    .locals 3

    if-eqz p0, :cond_0

    instance-of v0, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;

    if-eqz v0, :cond_1

    :cond_0
    check-cast p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;

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

.method public static a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/ASN1TaggedObject;
    .locals 1

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->i()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1TaggedObject;

    return-object v0
.end method


# virtual methods
.method abstract a(Lorg/bouncycastle/asn1/DEROutputStream;)V
.end method

.method final a(Lorg/bouncycastle/asn1/DERObject;)Z
    .locals 3

    const/4 v0, 0x0

    instance-of v1, p1, Lorg/bouncycastle/asn1/ASN1TaggedObject;

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    check-cast p1, Lorg/bouncycastle/asn1/ASN1TaggedObject;

    iget v1, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;->a:I

    iget v2, p1, Lorg/bouncycastle/asn1/ASN1TaggedObject;->a:I

    if-ne v1, v2, :cond_0

    iget-boolean v1, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;->b:Z

    iget-boolean v2, p1, Lorg/bouncycastle/asn1/ASN1TaggedObject;->b:Z

    if-ne v1, v2, :cond_0

    iget-boolean v1, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;->c:Z

    iget-boolean v2, p1, Lorg/bouncycastle/asn1/ASN1TaggedObject;->c:Z

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;->d:Lorg/bouncycastle/asn1/DEREncodable;

    if-nez v1, :cond_3

    iget-object v1, p1, Lorg/bouncycastle/asn1/ASN1TaggedObject;->d:Lorg/bouncycastle/asn1/DEREncodable;

    if-nez v1, :cond_0

    :cond_2
    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;->d:Lorg/bouncycastle/asn1/DEREncodable;

    invoke-interface {v1}, Lorg/bouncycastle/asn1/DEREncodable;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    iget-object v2, p1, Lorg/bouncycastle/asn1/ASN1TaggedObject;->d:Lorg/bouncycastle/asn1/DEREncodable;

    invoke-interface {v2}, Lorg/bouncycastle/asn1/DEREncodable;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/bouncycastle/asn1/DERObject;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;->a:I

    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;->c:Z

    return v0
.end method

.method public final g()Lorg/bouncycastle/asn1/DERObject;
    .locals 1

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    return-object v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;->b:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;->a:I

    iget-object v1, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;->d:Lorg/bouncycastle/asn1/DEREncodable;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;->d:Lorg/bouncycastle/asn1/DEREncodable;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    :cond_0
    return v0
.end method

.method public final i()Lorg/bouncycastle/asn1/DERObject;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;->d:Lorg/bouncycastle/asn1/DEREncodable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;->d:Lorg/bouncycastle/asn1/DEREncodable;

    invoke-interface {v0}, Lorg/bouncycastle/asn1/DEREncodable;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;->d:Lorg/bouncycastle/asn1/DEREncodable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
