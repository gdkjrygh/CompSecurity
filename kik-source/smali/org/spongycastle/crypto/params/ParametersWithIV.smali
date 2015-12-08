.class public Lorg/spongycastle/crypto/params/ParametersWithIV;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/CipherParameters;


# instance fields
.field private a:[B

.field private b:Lorg/spongycastle/crypto/CipherParameters;


# direct methods
.method public constructor <init>(Lorg/spongycastle/crypto/CipherParameters;[B)V
    .locals 2

    .prologue
    .line 15
    const/4 v0, 0x0

    array-length v1, p2

    invoke-direct {p0, p1, p2, v0, v1}, Lorg/spongycastle/crypto/params/ParametersWithIV;-><init>(Lorg/spongycastle/crypto/CipherParameters;[BII)V

    .line 16
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/crypto/CipherParameters;[BII)V
    .locals 2

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-array v0, p4, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/params/ParametersWithIV;->a:[B

    .line 25
    iput-object p1, p0, Lorg/spongycastle/crypto/params/ParametersWithIV;->b:Lorg/spongycastle/crypto/CipherParameters;

    .line 27
    iget-object v0, p0, Lorg/spongycastle/crypto/params/ParametersWithIV;->a:[B

    const/4 v1, 0x0

    invoke-static {p2, p3, v0, v1, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 28
    return-void
.end method


# virtual methods
.method public final a()[B
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lorg/spongycastle/crypto/params/ParametersWithIV;->a:[B

    return-object v0
.end method

.method public final b()Lorg/spongycastle/crypto/CipherParameters;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lorg/spongycastle/crypto/params/ParametersWithIV;->b:Lorg/spongycastle/crypto/CipherParameters;

    return-object v0
.end method
