.class public Lorg/spongycastle/crypto/params/AEADParameters;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/CipherParameters;


# instance fields
.field private a:[B

.field private b:[B

.field private c:Lorg/spongycastle/crypto/params/KeyParameter;

.field private d:I


# virtual methods
.method public final a()Lorg/spongycastle/crypto/params/KeyParameter;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lorg/spongycastle/crypto/params/AEADParameters;->c:Lorg/spongycastle/crypto/params/KeyParameter;

    return-object v0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 36
    iget v0, p0, Lorg/spongycastle/crypto/params/AEADParameters;->d:I

    return v0
.end method

.method public final c()[B
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lorg/spongycastle/crypto/params/AEADParameters;->a:[B

    return-object v0
.end method

.method public final d()[B
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lorg/spongycastle/crypto/params/AEADParameters;->b:[B

    return-object v0
.end method
