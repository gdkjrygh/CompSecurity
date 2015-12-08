.class public Lorg/bouncycastle/jce/spec/IESParameterSpec;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/security/spec/AlgorithmParameterSpec;


# instance fields
.field private a:[B

.field private b:[B

.field private c:I


# direct methods
.method public constructor <init>([B[BI)V
    .locals 3

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length v0, p1

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/jce/spec/IESParameterSpec;->a:[B

    iget-object v0, p0, Lorg/bouncycastle/jce/spec/IESParameterSpec;->a:[B

    array-length v1, p1

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v0, p2

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/jce/spec/IESParameterSpec;->b:[B

    iget-object v0, p0, Lorg/bouncycastle/jce/spec/IESParameterSpec;->b:[B

    array-length v1, p2

    invoke-static {p2, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput p3, p0, Lorg/bouncycastle/jce/spec/IESParameterSpec;->c:I

    return-void
.end method


# virtual methods
.method public final a()[B
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/spec/IESParameterSpec;->a:[B

    return-object v0
.end method

.method public final b()[B
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/spec/IESParameterSpec;->b:[B

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lorg/bouncycastle/jce/spec/IESParameterSpec;->c:I

    return v0
.end method
