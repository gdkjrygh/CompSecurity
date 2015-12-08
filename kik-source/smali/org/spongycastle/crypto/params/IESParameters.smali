.class public Lorg/spongycastle/crypto/params/IESParameters;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/CipherParameters;


# instance fields
.field private a:[B

.field private b:[B

.field private c:I


# direct methods
.method public constructor <init>([B[BI)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lorg/spongycastle/crypto/params/IESParameters;->a:[B

    .line 26
    iput-object p2, p0, Lorg/spongycastle/crypto/params/IESParameters;->b:[B

    .line 27
    iput p3, p0, Lorg/spongycastle/crypto/params/IESParameters;->c:I

    .line 28
    return-void
.end method


# virtual methods
.method public final a()[B
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lorg/spongycastle/crypto/params/IESParameters;->a:[B

    return-object v0
.end method

.method public final b()[B
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lorg/spongycastle/crypto/params/IESParameters;->b:[B

    return-object v0
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 42
    iget v0, p0, Lorg/spongycastle/crypto/params/IESParameters;->c:I

    return v0
.end method
