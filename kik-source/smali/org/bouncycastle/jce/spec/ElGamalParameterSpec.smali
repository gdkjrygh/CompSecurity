.class public Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/security/spec/AlgorithmParameterSpec;


# instance fields
.field private a:Ljava/math/BigInteger;

.field private b:Ljava/math/BigInteger;


# direct methods
.method public constructor <init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;->a:Ljava/math/BigInteger;

    iput-object p2, p0, Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;->b:Ljava/math/BigInteger;

    return-void
.end method


# virtual methods
.method public final a()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;->a:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final b()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;->b:Ljava/math/BigInteger;

    return-object v0
.end method
