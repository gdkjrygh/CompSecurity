.class public Lorg/spongycastle/crypto/AsymmetricCipherKeyPair;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/crypto/CipherParameters;

.field private b:Lorg/spongycastle/crypto/CipherParameters;


# direct methods
.method public constructor <init>(Lorg/spongycastle/crypto/CipherParameters;Lorg/spongycastle/crypto/CipherParameters;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lorg/spongycastle/crypto/AsymmetricCipherKeyPair;->a:Lorg/spongycastle/crypto/CipherParameters;

    .line 22
    iput-object p2, p0, Lorg/spongycastle/crypto/AsymmetricCipherKeyPair;->b:Lorg/spongycastle/crypto/CipherParameters;

    .line 23
    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/crypto/CipherParameters;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lorg/spongycastle/crypto/AsymmetricCipherKeyPair;->a:Lorg/spongycastle/crypto/CipherParameters;

    return-object v0
.end method

.method public final b()Lorg/spongycastle/crypto/CipherParameters;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lorg/spongycastle/crypto/AsymmetricCipherKeyPair;->b:Lorg/spongycastle/crypto/CipherParameters;

    return-object v0
.end method
