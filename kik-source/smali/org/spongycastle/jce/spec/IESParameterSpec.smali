.class public Lorg/spongycastle/jce/spec/IESParameterSpec;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/security/spec/AlgorithmParameterSpec;


# instance fields
.field private a:[B

.field private b:[B

.field private c:I


# direct methods
.method public constructor <init>([B[BI)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    array-length v0, p1

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/jce/spec/IESParameterSpec;->a:[B

    .line 21
    iget-object v0, p0, Lorg/spongycastle/jce/spec/IESParameterSpec;->a:[B

    array-length v1, p1

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 23
    array-length v0, p2

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/jce/spec/IESParameterSpec;->b:[B

    .line 24
    iget-object v0, p0, Lorg/spongycastle/jce/spec/IESParameterSpec;->b:[B

    array-length v1, p2

    invoke-static {p2, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 26
    iput p3, p0, Lorg/spongycastle/jce/spec/IESParameterSpec;->c:I

    .line 27
    return-void
.end method


# virtual methods
.method public final a()[B
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lorg/spongycastle/jce/spec/IESParameterSpec;->a:[B

    return-object v0
.end method

.method public final b()[B
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lorg/spongycastle/jce/spec/IESParameterSpec;->b:[B

    return-object v0
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 50
    iget v0, p0, Lorg/spongycastle/jce/spec/IESParameterSpec;->c:I

    return v0
.end method
