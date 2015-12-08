.class public Lorg/spongycastle/crypto/params/KDFParameters;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/DerivationParameters;


# instance fields
.field a:[B

.field b:[B


# direct methods
.method public constructor <init>([B[B)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lorg/spongycastle/crypto/params/KDFParameters;->b:[B

    .line 19
    iput-object p2, p0, Lorg/spongycastle/crypto/params/KDFParameters;->a:[B

    .line 20
    return-void
.end method


# virtual methods
.method public final a()[B
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lorg/spongycastle/crypto/params/KDFParameters;->b:[B

    return-object v0
.end method

.method public final b()[B
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lorg/spongycastle/crypto/params/KDFParameters;->a:[B

    return-object v0
.end method
