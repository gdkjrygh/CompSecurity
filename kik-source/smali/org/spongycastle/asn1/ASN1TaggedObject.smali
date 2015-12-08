.class public abstract Lorg/spongycastle/asn1/ASN1TaggedObject;
.super Lorg/spongycastle/asn1/ASN1Primitive;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/ASN1TaggedObjectParser;


# instance fields
.field a:I

.field b:Z

.field c:Z

.field d:Lorg/spongycastle/asn1/ASN1Encodable;


# direct methods
.method public constructor <init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 67
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Primitive;-><init>()V

    .line 15
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->b:Z

    .line 16
    iput-boolean v1, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->c:Z

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->d:Lorg/spongycastle/asn1/ASN1Encodable;

    .line 68
    instance-of v0, p3, Lorg/spongycastle/asn1/ASN1Choice;

    if-eqz v0, :cond_0

    .line 70
    iput-boolean v1, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->c:Z

    .line 77
    :goto_0
    iput p2, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->a:I

    .line 79
    iget-boolean v0, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->c:Z

    if-eqz v0, :cond_1

    .line 81
    iput-object p3, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->d:Lorg/spongycastle/asn1/ASN1Encodable;

    .line 94
    :goto_1
    return-void

    .line 74
    :cond_0
    iput-boolean p1, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->c:Z

    goto :goto_0

    .line 85
    :cond_1
    invoke-interface {p3}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    .line 87
    iput-object p3, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->d:Lorg/spongycastle/asn1/ASN1Encodable;

    goto :goto_1
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1TaggedObject;
    .locals 4

    .prologue
    .line 34
    if-eqz p0, :cond_0

    instance-of v0, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;

    if-eqz v0, :cond_1

    .line 36
    :cond_0
    check-cast p0, Lorg/spongycastle/asn1/ASN1TaggedObject;

    .line 42
    :goto_0
    return-object p0

    .line 38
    :cond_1
    instance-of v0, p0, [B

    if-eqz v0, :cond_2

    .line 42
    :try_start_0
    check-cast p0, [B

    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->a([B)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1TaggedObject;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object p0

    goto :goto_0

    .line 44
    :catch_0
    move-exception v0

    .line 46
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "failed to construct tagged object from byte[]: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 50
    :cond_2
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

.method public static a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/ASN1TaggedObject;
    .locals 1

    .prologue
    .line 23
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->k()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1TaggedObject;

    return-object v0
.end method


# virtual methods
.method abstract a(Lorg/spongycastle/asn1/ASN1OutputStream;)V
.end method

.method final a(Lorg/spongycastle/asn1/ASN1Primitive;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 99
    instance-of v1, p1, Lorg/spongycastle/asn1/ASN1TaggedObject;

    if-nez v1, :cond_1

    .line 126
    :cond_0
    :goto_0
    return v0

    .line 104
    :cond_1
    check-cast p1, Lorg/spongycastle/asn1/ASN1TaggedObject;

    .line 106
    iget v1, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->a:I

    iget v2, p1, Lorg/spongycastle/asn1/ASN1TaggedObject;->a:I

    if-ne v1, v2, :cond_0

    iget-boolean v1, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->b:Z

    iget-boolean v2, p1, Lorg/spongycastle/asn1/ASN1TaggedObject;->b:Z

    if-ne v1, v2, :cond_0

    iget-boolean v1, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->c:Z

    iget-boolean v2, p1, Lorg/spongycastle/asn1/ASN1TaggedObject;->c:Z

    if-ne v1, v2, :cond_0

    .line 111
    iget-object v1, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->d:Lorg/spongycastle/asn1/ASN1Encodable;

    if-nez v1, :cond_3

    .line 113
    iget-object v1, p1, Lorg/spongycastle/asn1/ASN1TaggedObject;->d:Lorg/spongycastle/asn1/ASN1Encodable;

    if-nez v1, :cond_0

    .line 126
    :cond_2
    const/4 v0, 0x1

    goto :goto_0

    .line 120
    :cond_3
    iget-object v1, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->d:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-interface {v1}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    iget-object v2, p1, Lorg/spongycastle/asn1/ASN1TaggedObject;->d:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-interface {v2}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/ASN1Primitive;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 148
    iget v0, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->a:I

    return v0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 162
    iget-boolean v0, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->c:Z

    return v0
.end method

.method public final e()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 1

    .prologue
    .line 216
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    return-object v0
.end method

.method final f()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 4

    .prologue
    .line 221
    new-instance v0, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-boolean v1, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->c:Z

    iget v2, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->a:I

    iget-object v3, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->d:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-direct {v0, v1, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    return-object v0
.end method

.method final g()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 4

    .prologue
    .line 226
    new-instance v0, Lorg/spongycastle/asn1/DLTaggedObject;

    iget-boolean v1, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->c:Z

    iget v2, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->a:I

    iget-object v3, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->d:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-direct {v0, v1, v2, v3}, Lorg/spongycastle/asn1/DLTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 131
    iget v0, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->a:I

    .line 138
    iget-object v1, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->d:Lorg/spongycastle/asn1/ASN1Encodable;

    if-eqz v1, :cond_0

    .line 140
    iget-object v1, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->d:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    .line 143
    :cond_0
    return v0
.end method

.method public final j()Z
    .locals 1

    .prologue
    .line 167
    iget-boolean v0, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->b:Z

    return v0
.end method

.method public final k()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 1

    .prologue
    .line 179
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->d:Lorg/spongycastle/asn1/ASN1Encodable;

    if-eqz v0, :cond_0

    .line 181
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->d:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-interface {v0}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    .line 184
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 234
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/spongycastle/asn1/ASN1TaggedObject;->d:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
