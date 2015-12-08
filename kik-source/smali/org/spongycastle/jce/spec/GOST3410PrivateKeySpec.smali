.class public Lorg/spongycastle/jce/spec/GOST3410PrivateKeySpec;
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
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lorg/spongycastle/jce/spec/GOST3410PrivateKeySpec;->a:Ljava/math/BigInteger;

    .line 30
    iput-object p2, p0, Lorg/spongycastle/jce/spec/GOST3410PrivateKeySpec;->b:Ljava/math/BigInteger;

    .line 31
    iput-object p3, p0, Lorg/spongycastle/jce/spec/GOST3410PrivateKeySpec;->c:Ljava/math/BigInteger;

    .line 32
    iput-object p4, p0, Lorg/spongycastle/jce/spec/GOST3410PrivateKeySpec;->d:Ljava/math/BigInteger;

    .line 33
    return-void
.end method


# virtual methods
.method public final a()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lorg/spongycastle/jce/spec/GOST3410PrivateKeySpec;->a:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final b()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lorg/spongycastle/jce/spec/GOST3410PrivateKeySpec;->b:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final c()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lorg/spongycastle/jce/spec/GOST3410PrivateKeySpec;->c:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final d()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lorg/spongycastle/jce/spec/GOST3410PrivateKeySpec;->d:Ljava/math/BigInteger;

    return-object v0
.end method
