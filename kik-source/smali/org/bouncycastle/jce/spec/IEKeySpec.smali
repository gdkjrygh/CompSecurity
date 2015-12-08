.class public Lorg/bouncycastle/jce/spec/IEKeySpec;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/security/spec/KeySpec;
.implements Lorg/bouncycastle/jce/interfaces/IESKey;


# instance fields
.field private a:Ljava/security/PublicKey;

.field private b:Ljava/security/PrivateKey;


# virtual methods
.method public final a()Ljava/security/PublicKey;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/spec/IEKeySpec;->a:Ljava/security/PublicKey;

    return-object v0
.end method

.method public final b()Ljava/security/PrivateKey;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/spec/IEKeySpec;->b:Ljava/security/PrivateKey;

    return-object v0
.end method

.method public getAlgorithm()Ljava/lang/String;
    .locals 1

    const-string v0, "IES"

    return-object v0
.end method

.method public getEncoded()[B
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getFormat()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
