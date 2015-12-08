.class public Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/crypto/engines/IndexGenerator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BitString"
.end annotation


# instance fields
.field a:[B

.field b:I

.field c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 126
    const/4 v0, 0x4

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->a:[B

    return-void
.end method


# virtual methods
.method final a([B)V
    .locals 10

    .prologue
    const/16 v9, 0x8

    const/4 v1, 0x0

    .line 137
    move v0, v1

    :goto_0
    array-length v2, p1

    if-eq v0, v2, :cond_3

    .line 139
    aget-byte v2, p1, v0

    iget v3, p0, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->b:I

    iget-object v4, p0, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->a:[B

    array-length v4, v4

    if-ne v3, v4, :cond_0

    iget-object v3, p0, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->a:[B

    iget-object v4, p0, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->a:[B

    array-length v4, v4

    mul-int/lit8 v4, v4, 0x2

    invoke-static {v3, v4}, Lorg/spongycastle/crypto/engines/IndexGenerator;->a([BI)[B

    move-result-object v3

    iput-object v3, p0, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->a:[B

    :cond_0
    iget v3, p0, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->b:I

    if-nez v3, :cond_1

    const/4 v3, 0x1

    iput v3, p0, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->b:I

    iget-object v3, p0, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->a:[B

    aput-byte v2, v3, v1

    iput v9, p0, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->c:I

    .line 137
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 139
    :cond_1
    iget v3, p0, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->c:I

    if-ne v3, v9, :cond_2

    iget-object v3, p0, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->a:[B

    iget v4, p0, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->b:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->b:I

    aput-byte v2, v3, v4

    goto :goto_1

    :cond_2
    iget v3, p0, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->c:I

    rsub-int/lit8 v3, v3, 0x8

    iget-object v4, p0, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->a:[B

    iget v5, p0, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->b:I

    add-int/lit8 v5, v5, -0x1

    aget-byte v6, v4, v5

    and-int/lit16 v7, v2, 0xff

    iget v8, p0, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->c:I

    shl-int/2addr v7, v8

    or-int/2addr v6, v7

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    iget-object v4, p0, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->a:[B

    iget v5, p0, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->b:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lorg/spongycastle/crypto/engines/IndexGenerator$BitString;->b:I

    and-int/lit16 v2, v2, 0xff

    shr-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, v4, v5

    goto :goto_1

    .line 141
    :cond_3
    return-void
.end method
