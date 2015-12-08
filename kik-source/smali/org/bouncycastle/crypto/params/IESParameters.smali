.class public Lorg/bouncycastle/crypto/params/IESParameters;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/CipherParameters;


# instance fields
.field private a:[B

.field private b:[B

.field private c:I


# direct methods
.method public constructor <init>([B[BI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/params/IESParameters;->a:[B

    iput-object p2, p0, Lorg/bouncycastle/crypto/params/IESParameters;->b:[B

    iput p3, p0, Lorg/bouncycastle/crypto/params/IESParameters;->c:I

    return-void
.end method


# virtual methods
.method public getDerivationV()[B
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/params/IESParameters;->a:[B

    return-object v0
.end method

.method public getEncodingV()[B
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/params/IESParameters;->b:[B

    return-object v0
.end method

.method public getMacKeySize()I
    .locals 1

    iget v0, p0, Lorg/bouncycastle/crypto/params/IESParameters;->c:I

    return v0
.end method
