.class public Lorg/bouncycastle/jce/spec/GOST28147ParameterSpec;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/security/spec/AlgorithmParameterSpec;


# instance fields
.field private a:[B

.field private b:[B


# virtual methods
.method public final a()[B
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/spec/GOST28147ParameterSpec;->b:[B

    return-object v0
.end method

.method public final b()[B
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lorg/bouncycastle/jce/spec/GOST28147ParameterSpec;->a:[B

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/jce/spec/GOST28147ParameterSpec;->a:[B

    array-length v0, v0

    new-array v0, v0, [B

    iget-object v1, p0, Lorg/bouncycastle/jce/spec/GOST28147ParameterSpec;->a:[B

    array-length v2, v0

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0
.end method
