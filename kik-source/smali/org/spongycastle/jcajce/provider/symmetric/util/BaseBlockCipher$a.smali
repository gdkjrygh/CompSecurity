.class final Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private a:Lorg/spongycastle/crypto/modes/AEADBlockCipher;


# direct methods
.method constructor <init>(Lorg/spongycastle/crypto/modes/AEADBlockCipher;)V
    .locals 0

    .prologue
    .line 835
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 836
    iput-object p1, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$a;->a:Lorg/spongycastle/crypto/modes/AEADBlockCipher;

    .line 837
    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    .prologue
    .line 862
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$a;->a:Lorg/spongycastle/crypto/modes/AEADBlockCipher;

    invoke-interface {v0, p1}, Lorg/spongycastle/crypto/modes/AEADBlockCipher;->b(I)I

    move-result v0

    return v0
.end method

.method public final a([BI)I
    .locals 1

    .prologue
    .line 882
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$a;->a:Lorg/spongycastle/crypto/modes/AEADBlockCipher;

    invoke-interface {v0, p1, p2}, Lorg/spongycastle/crypto/modes/AEADBlockCipher;->a([BI)I

    move-result v0

    return v0
.end method

.method public final a([BII[BI)I
    .locals 6

    .prologue
    .line 877
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$a;->a:Lorg/spongycastle/crypto/modes/AEADBlockCipher;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lorg/spongycastle/crypto/modes/AEADBlockCipher;->a([BII[BI)I

    move-result v0

    return v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 1

    .prologue
    .line 842
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$a;->a:Lorg/spongycastle/crypto/modes/AEADBlockCipher;

    invoke-interface {v0, p1, p2}, Lorg/spongycastle/crypto/modes/AEADBlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 843
    return-void
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 852
    const/4 v0, 0x0

    return v0
.end method

.method public final b(I)I
    .locals 1

    .prologue
    .line 867
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$a;->a:Lorg/spongycastle/crypto/modes/AEADBlockCipher;

    invoke-interface {v0, p1}, Lorg/spongycastle/crypto/modes/AEADBlockCipher;->a(I)I

    move-result v0

    return v0
.end method

.method public final b()Lorg/spongycastle/crypto/BlockCipher;
    .locals 1

    .prologue
    .line 857
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseBlockCipher$a;->a:Lorg/spongycastle/crypto/modes/AEADBlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/modes/AEADBlockCipher;->a()Lorg/spongycastle/crypto/BlockCipher;

    move-result-object v0

    return-object v0
.end method
