.class public Lorg/spongycastle/jce/spec/GOST28147ParameterSpec;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/security/spec/AlgorithmParameterSpec;


# instance fields
.field private a:[B

.field private b:[B


# virtual methods
.method public final a()[B
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lorg/spongycastle/jce/spec/GOST28147ParameterSpec;->b:[B

    return-object v0
.end method

.method public final b()[B
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 62
    iget-object v0, p0, Lorg/spongycastle/jce/spec/GOST28147ParameterSpec;->a:[B

    if-nez v0, :cond_0

    .line 64
    const/4 v0, 0x0

    .line 71
    :goto_0
    return-object v0

    .line 67
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jce/spec/GOST28147ParameterSpec;->a:[B

    array-length v0, v0

    new-array v0, v0, [B

    .line 69
    iget-object v1, p0, Lorg/spongycastle/jce/spec/GOST28147ParameterSpec;->a:[B

    array-length v2, v0

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0
.end method
