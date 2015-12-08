.class public Lorg/bouncycastle/crypto/params/DSAValidationParameters;
.super Ljava/lang/Object;


# instance fields
.field private a:[B

.field private b:I


# direct methods
.method public constructor <init>([BI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/params/DSAValidationParameters;->a:[B

    iput p2, p0, Lorg/bouncycastle/crypto/params/DSAValidationParameters;->b:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    instance-of v1, p1, Lorg/bouncycastle/crypto/params/DSAValidationParameters;

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    check-cast p1, Lorg/bouncycastle/crypto/params/DSAValidationParameters;

    iget v1, p1, Lorg/bouncycastle/crypto/params/DSAValidationParameters;->b:I

    iget v2, p0, Lorg/bouncycastle/crypto/params/DSAValidationParameters;->b:I

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/crypto/params/DSAValidationParameters;->a:[B

    iget-object v1, p1, Lorg/bouncycastle/crypto/params/DSAValidationParameters;->a:[B

    invoke-static {v0, v1}, Lorg/bouncycastle/util/Arrays;->a([B[B)Z

    move-result v0

    goto :goto_0
.end method

.method public getCounter()I
    .locals 1

    iget v0, p0, Lorg/bouncycastle/crypto/params/DSAValidationParameters;->b:I

    return v0
.end method

.method public getSeed()[B
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/params/DSAValidationParameters;->a:[B

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lorg/bouncycastle/crypto/params/DSAValidationParameters;->b:I

    iget-object v1, p0, Lorg/bouncycastle/crypto/params/DSAValidationParameters;->a:[B

    invoke-static {v1}, Lorg/bouncycastle/util/Arrays;->b([B)I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method
