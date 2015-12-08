.class public Lorg/spongycastle/jce/spec/GOST3410PublicKeySpec;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/security/spec/KeySpec;


# instance fields
.field private a:Ljava/math/BigInteger;

.field private b:Ljava/math/BigInteger;

.field private c:Ljava/math/BigInteger;

.field private d:Ljava/math/BigInteger;


# direct methods
.method public constructor <init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lorg/spongycastle/jce/spec/GOST3410PublicKeySpec;->a:Ljava/math/BigInteger;

    .line 34
    iput-object p2, p0, Lorg/spongycastle/jce/spec/GOST3410PublicKeySpec;->b:Ljava/math/BigInteger;

    .line 35
    iput-object p3, p0, Lorg/spongycastle/jce/spec/GOST3410PublicKeySpec;->c:Ljava/math/BigInteger;

    .line 36
    iput-object p4, p0, Lorg/spongycastle/jce/spec/GOST3410PublicKeySpec;->d:Ljava/math/BigInteger;

    .line 37
    return-void
.end method


# virtual methods
.method public final a()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lorg/spongycastle/jce/spec/GOST3410PublicKeySpec;->a:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final b()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lorg/spongycastle/jce/spec/GOST3410PublicKeySpec;->b:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final c()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lorg/spongycastle/jce/spec/GOST3410PublicKeySpec;->c:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final d()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lorg/spongycastle/jce/spec/GOST3410PublicKeySpec;->d:Ljava/math/BigInteger;

    return-object v0
.end method
