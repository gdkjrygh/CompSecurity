.class public Lorg/spongycastle/crypto/params/DSAValidationParameters;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:[B

.field private b:I


# direct methods
.method public constructor <init>([BI)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lorg/spongycastle/crypto/params/DSAValidationParameters;->a:[B

    .line 15
    iput p2, p0, Lorg/spongycastle/crypto/params/DSAValidationParameters;->b:I

    .line 16
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 36
    instance-of v1, p1, Lorg/spongycastle/crypto/params/DSAValidationParameters;

    if-nez v1, :cond_1

    .line 48
    :cond_0
    :goto_0
    return v0

    .line 41
    :cond_1
    check-cast p1, Lorg/spongycastle/crypto/params/DSAValidationParameters;

    .line 43
    iget v1, p1, Lorg/spongycastle/crypto/params/DSAValidationParameters;->b:I

    iget v2, p0, Lorg/spongycastle/crypto/params/DSAValidationParameters;->b:I

    if-ne v1, v2, :cond_0

    .line 48
    iget-object v0, p0, Lorg/spongycastle/crypto/params/DSAValidationParameters;->a:[B

    iget-object v1, p1, Lorg/spongycastle/crypto/params/DSAValidationParameters;->a:[B

    invoke-static {v0, v1}, Lorg/spongycastle/util/Arrays;->a([B[B)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 30
    iget v0, p0, Lorg/spongycastle/crypto/params/DSAValidationParameters;->b:I

    iget-object v1, p0, Lorg/spongycastle/crypto/params/DSAValidationParameters;->a:[B

    invoke-static {v1}, Lorg/spongycastle/util/Arrays;->a([B)I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method
