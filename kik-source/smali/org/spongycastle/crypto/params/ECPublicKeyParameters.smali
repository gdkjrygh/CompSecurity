.class public Lorg/spongycastle/crypto/params/ECPublicKeyParameters;
.super Lorg/spongycastle/crypto/params/ECKeyParameters;
.source "SourceFile"


# instance fields
.field c:Lorg/spongycastle/math/ec/ECPoint;


# direct methods
.method public constructor <init>(Lorg/spongycastle/math/ec/ECPoint;Lorg/spongycastle/crypto/params/ECDomainParameters;)V
    .locals 1

    .prologue
    .line 14
    const/4 v0, 0x0

    invoke-direct {p0, v0, p2}, Lorg/spongycastle/crypto/params/ECKeyParameters;-><init>(ZLorg/spongycastle/crypto/params/ECDomainParameters;)V

    .line 15
    iput-object p1, p0, Lorg/spongycastle/crypto/params/ECPublicKeyParameters;->c:Lorg/spongycastle/math/ec/ECPoint;

    .line 16
    return-void
.end method


# virtual methods
.method public final c()Lorg/spongycastle/math/ec/ECPoint;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lorg/spongycastle/crypto/params/ECPublicKeyParameters;->c:Lorg/spongycastle/math/ec/ECPoint;

    return-object v0
.end method
