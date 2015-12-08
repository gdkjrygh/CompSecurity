.class public abstract Lorg/spongycastle/crypto/PBEParametersGenerator;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:[B

.field protected b:[B

.field protected c:I


# direct methods
.method protected constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    return-void
.end method

.method public static a([C)[B
    .locals 3

    .prologue
    .line 106
    array-length v0, p0

    new-array v1, v0, [B

    .line 108
    const/4 v0, 0x0

    :goto_0
    array-length v2, v1

    if-eq v0, v2, :cond_0

    .line 110
    aget-char v2, p0, v0

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    .line 108
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 113
    :cond_0
    return-object v1
.end method

.method public static b([C)[B
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 139
    array-length v1, p0

    if-lez v1, :cond_1

    .line 142
    array-length v1, p0

    add-int/lit8 v1, v1, 0x1

    mul-int/lit8 v1, v1, 0x2

    new-array v1, v1, [B

    .line 144
    :goto_0
    array-length v2, p0

    if-eq v0, v2, :cond_0

    .line 146
    mul-int/lit8 v2, v0, 0x2

    aget-char v3, p0, v0

    ushr-int/lit8 v3, v3, 0x8

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    .line 147
    mul-int/lit8 v2, v0, 0x2

    add-int/lit8 v2, v2, 0x1

    aget-char v3, p0, v0

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    .line 144
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 154
    :goto_1
    return-object v0

    :cond_1
    new-array v0, v0, [B

    goto :goto_1
.end method


# virtual methods
.method public abstract a(I)Lorg/spongycastle/crypto/CipherParameters;
.end method

.method public abstract a(II)Lorg/spongycastle/crypto/CipherParameters;
.end method

.method public final a([B[BI)V
    .locals 0

    .prologue
    .line 34
    iput-object p1, p0, Lorg/spongycastle/crypto/PBEParametersGenerator;->a:[B

    .line 35
    iput-object p2, p0, Lorg/spongycastle/crypto/PBEParametersGenerator;->b:[B

    .line 36
    iput p3, p0, Lorg/spongycastle/crypto/PBEParametersGenerator;->c:I

    .line 37
    return-void
.end method

.method public abstract b(I)Lorg/spongycastle/crypto/CipherParameters;
.end method
