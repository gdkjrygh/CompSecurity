.class public Lorg/spongycastle/crypto/engines/GOST28147Engine;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/BlockCipher;


# static fields
.field private static d:[B

.field private static e:[B

.field private static f:[B

.field private static g:[B

.field private static h:[B

.field private static i:[B

.field private static j:[B

.field private static k:[B

.field private static l:Ljava/util/Hashtable;


# instance fields
.field private a:[I

.field private b:Z

.field private c:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/16 v1, 0x80

    .line 27
    new-array v0, v1, [B

    fill-array-data v0, :array_0

    sput-object v0, Lorg/spongycastle/crypto/engines/GOST28147Engine;->d:[B

    .line 43
    new-array v0, v1, [B

    fill-array-data v0, :array_1

    sput-object v0, Lorg/spongycastle/crypto/engines/GOST28147Engine;->e:[B

    .line 54
    new-array v0, v1, [B

    fill-array-data v0, :array_2

    sput-object v0, Lorg/spongycastle/crypto/engines/GOST28147Engine;->f:[B

    .line 65
    new-array v0, v1, [B

    fill-array-data v0, :array_3

    sput-object v0, Lorg/spongycastle/crypto/engines/GOST28147Engine;->g:[B

    .line 76
    new-array v0, v1, [B

    fill-array-data v0, :array_4

    sput-object v0, Lorg/spongycastle/crypto/engines/GOST28147Engine;->h:[B

    .line 87
    new-array v0, v1, [B

    fill-array-data v0, :array_5

    sput-object v0, Lorg/spongycastle/crypto/engines/GOST28147Engine;->i:[B

    .line 99
    new-array v0, v1, [B

    fill-array-data v0, :array_6

    sput-object v0, Lorg/spongycastle/crypto/engines/GOST28147Engine;->j:[B

    .line 110
    new-array v0, v1, [B

    fill-array-data v0, :array_7

    sput-object v0, Lorg/spongycastle/crypto/engines/GOST28147Engine;->k:[B

    .line 124
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/spongycastle/crypto/engines/GOST28147Engine;->l:Ljava/util/Hashtable;

    .line 128
    const-string v0, "Default"

    sget-object v1, Lorg/spongycastle/crypto/engines/GOST28147Engine;->d:[B

    invoke-static {v0, v1}, Lorg/spongycastle/crypto/engines/GOST28147Engine;->a(Ljava/lang/String;[B)V

    .line 129
    const-string v0, "E-TEST"

    sget-object v1, Lorg/spongycastle/crypto/engines/GOST28147Engine;->e:[B

    invoke-static {v0, v1}, Lorg/spongycastle/crypto/engines/GOST28147Engine;->a(Ljava/lang/String;[B)V

    .line 130
    const-string v0, "E-A"

    sget-object v1, Lorg/spongycastle/crypto/engines/GOST28147Engine;->f:[B

    invoke-static {v0, v1}, Lorg/spongycastle/crypto/engines/GOST28147Engine;->a(Ljava/lang/String;[B)V

    .line 131
    const-string v0, "E-B"

    sget-object v1, Lorg/spongycastle/crypto/engines/GOST28147Engine;->g:[B

    invoke-static {v0, v1}, Lorg/spongycastle/crypto/engines/GOST28147Engine;->a(Ljava/lang/String;[B)V

    .line 132
    const-string v0, "E-C"

    sget-object v1, Lorg/spongycastle/crypto/engines/GOST28147Engine;->h:[B

    invoke-static {v0, v1}, Lorg/spongycastle/crypto/engines/GOST28147Engine;->a(Ljava/lang/String;[B)V

    .line 133
    const-string v0, "E-D"

    sget-object v1, Lorg/spongycastle/crypto/engines/GOST28147Engine;->i:[B

    invoke-static {v0, v1}, Lorg/spongycastle/crypto/engines/GOST28147Engine;->a(Ljava/lang/String;[B)V

    .line 134
    const-string v0, "D-TEST"

    sget-object v1, Lorg/spongycastle/crypto/engines/GOST28147Engine;->j:[B

    invoke-static {v0, v1}, Lorg/spongycastle/crypto/engines/GOST28147Engine;->a(Ljava/lang/String;[B)V

    .line 135
    const-string v0, "D-A"

    sget-object v1, Lorg/spongycastle/crypto/engines/GOST28147Engine;->k:[B

    invoke-static {v0, v1}, Lorg/spongycastle/crypto/engines/GOST28147Engine;->a(Ljava/lang/String;[B)V

    .line 136
    return-void

    .line 27
    :array_0
    .array-data 1
        0x4t
        0xat
        0x9t
        0x2t
        0xdt
        0x8t
        0x0t
        0xet
        0x6t
        0xbt
        0x1t
        0xct
        0x7t
        0xft
        0x5t
        0x3t
        0xet
        0xbt
        0x4t
        0xct
        0x6t
        0xdt
        0xft
        0xat
        0x2t
        0x3t
        0x8t
        0x1t
        0x0t
        0x7t
        0x5t
        0x9t
        0x5t
        0x8t
        0x1t
        0xdt
        0xat
        0x3t
        0x4t
        0x2t
        0xet
        0xft
        0xct
        0x7t
        0x6t
        0x0t
        0x9t
        0xbt
        0x7t
        0xdt
        0xat
        0x1t
        0x0t
        0x8t
        0x9t
        0xft
        0xet
        0x4t
        0x6t
        0xct
        0xbt
        0x2t
        0x5t
        0x3t
        0x6t
        0xct
        0x7t
        0x1t
        0x5t
        0xft
        0xdt
        0x8t
        0x4t
        0xat
        0x9t
        0xet
        0x0t
        0x3t
        0xbt
        0x2t
        0x4t
        0xbt
        0xat
        0x0t
        0x7t
        0x2t
        0x1t
        0xdt
        0x3t
        0x6t
        0x8t
        0x5t
        0x9t
        0xct
        0xft
        0xet
        0xdt
        0xbt
        0x4t
        0x1t
        0x3t
        0xft
        0x5t
        0x9t
        0x0t
        0xat
        0xet
        0x7t
        0x6t
        0x8t
        0x2t
        0xct
        0x1t
        0xft
        0xdt
        0x0t
        0x5t
        0x7t
        0xat
        0x4t
        0x9t
        0x2t
        0x3t
        0xet
        0x6t
        0xbt
        0x8t
        0xct
    .end array-data

    .line 43
    :array_1
    .array-data 1
        0x4t
        0x2t
        0xft
        0x5t
        0x9t
        0x1t
        0x0t
        0x8t
        0xet
        0x3t
        0xbt
        0xct
        0xdt
        0x7t
        0xat
        0x6t
        0xct
        0x9t
        0xft
        0xet
        0x8t
        0x1t
        0x3t
        0xat
        0x2t
        0x7t
        0x4t
        0xdt
        0x6t
        0x0t
        0xbt
        0x5t
        0xdt
        0x8t
        0xet
        0xct
        0x7t
        0x3t
        0x9t
        0xat
        0x1t
        0x5t
        0x2t
        0x4t
        0x6t
        0xft
        0x0t
        0xbt
        0xet
        0x9t
        0xbt
        0x2t
        0x5t
        0xft
        0x7t
        0x1t
        0x0t
        0xdt
        0xct
        0x6t
        0xat
        0x4t
        0x3t
        0x8t
        0x3t
        0xet
        0x5t
        0x9t
        0x6t
        0x8t
        0x0t
        0xdt
        0xat
        0xbt
        0x7t
        0xct
        0x2t
        0x1t
        0xft
        0x4t
        0x8t
        0xft
        0x6t
        0xbt
        0x1t
        0x9t
        0xct
        0x5t
        0xdt
        0x3t
        0x7t
        0xat
        0x0t
        0xet
        0x2t
        0x4t
        0x9t
        0xbt
        0xct
        0x0t
        0x3t
        0x6t
        0x7t
        0x5t
        0x4t
        0x8t
        0xet
        0xft
        0x1t
        0xat
        0x2t
        0xdt
        0xct
        0x6t
        0x5t
        0x2t
        0xbt
        0x0t
        0x9t
        0xdt
        0x3t
        0xet
        0x7t
        0xat
        0xft
        0x4t
        0x1t
        0x8t
    .end array-data

    .line 54
    :array_2
    .array-data 1
        0x9t
        0x6t
        0x3t
        0x2t
        0x8t
        0xbt
        0x1t
        0x7t
        0xat
        0x4t
        0xet
        0xft
        0xct
        0x0t
        0xdt
        0x5t
        0x3t
        0x7t
        0xet
        0x9t
        0x8t
        0xat
        0xft
        0x0t
        0x5t
        0x2t
        0x6t
        0xct
        0xbt
        0x4t
        0xdt
        0x1t
        0xet
        0x4t
        0x6t
        0x2t
        0xbt
        0x3t
        0xdt
        0x8t
        0xct
        0xft
        0x5t
        0xat
        0x0t
        0x7t
        0x1t
        0x9t
        0xet
        0x7t
        0xat
        0xct
        0xdt
        0x1t
        0x3t
        0x9t
        0x0t
        0x2t
        0xbt
        0x4t
        0xft
        0x8t
        0x5t
        0x6t
        0xbt
        0x5t
        0x1t
        0x9t
        0x8t
        0xdt
        0xft
        0x0t
        0xet
        0x4t
        0x2t
        0x3t
        0xct
        0x7t
        0xat
        0x6t
        0x3t
        0xat
        0xdt
        0xct
        0x1t
        0x2t
        0x0t
        0xbt
        0x7t
        0x5t
        0x9t
        0x4t
        0x8t
        0xft
        0xet
        0x6t
        0x1t
        0xdt
        0x2t
        0x9t
        0x7t
        0xat
        0x6t
        0x0t
        0x8t
        0xct
        0x4t
        0x5t
        0xft
        0x3t
        0xbt
        0xet
        0xbt
        0xat
        0xft
        0x5t
        0x0t
        0xct
        0xet
        0x8t
        0x6t
        0x2t
        0x3t
        0x9t
        0x1t
        0x7t
        0xdt
        0x4t
    .end array-data

    .line 65
    :array_3
    .array-data 1
        0x8t
        0x4t
        0xbt
        0x1t
        0x3t
        0x5t
        0x0t
        0x9t
        0x2t
        0xet
        0xat
        0xct
        0xdt
        0x6t
        0x7t
        0xft
        0x0t
        0x1t
        0x2t
        0xat
        0x4t
        0xdt
        0x5t
        0xct
        0x9t
        0x7t
        0x3t
        0xft
        0xbt
        0x8t
        0x6t
        0xet
        0xet
        0xct
        0x0t
        0xat
        0x9t
        0x2t
        0xdt
        0xbt
        0x7t
        0x5t
        0x8t
        0xft
        0x3t
        0x6t
        0x1t
        0x4t
        0x7t
        0x5t
        0x0t
        0xdt
        0xbt
        0x6t
        0x1t
        0x2t
        0x3t
        0xat
        0xct
        0xft
        0x4t
        0xet
        0x9t
        0x8t
        0x2t
        0x7t
        0xct
        0xft
        0x9t
        0x5t
        0xat
        0xbt
        0x1t
        0x4t
        0x0t
        0xdt
        0x6t
        0x8t
        0xet
        0x3t
        0x8t
        0x3t
        0x2t
        0x6t
        0x4t
        0xdt
        0xet
        0xbt
        0xct
        0x1t
        0x7t
        0xft
        0xat
        0x0t
        0x9t
        0x5t
        0x5t
        0x2t
        0xat
        0xbt
        0x9t
        0x1t
        0xct
        0x3t
        0x7t
        0x4t
        0xdt
        0x0t
        0x6t
        0xft
        0x8t
        0xet
        0x0t
        0x4t
        0xbt
        0xet
        0x8t
        0x3t
        0x7t
        0x1t
        0xat
        0x2t
        0x9t
        0x6t
        0xft
        0xdt
        0x5t
        0xct
    .end array-data

    .line 76
    :array_4
    .array-data 1
        0x1t
        0xbt
        0xct
        0x2t
        0x9t
        0xdt
        0x0t
        0xft
        0x4t
        0x5t
        0x8t
        0xet
        0xat
        0x7t
        0x6t
        0x3t
        0x0t
        0x1t
        0x7t
        0xdt
        0xbt
        0x4t
        0x5t
        0x2t
        0x8t
        0xet
        0xft
        0xct
        0x9t
        0xat
        0x6t
        0x3t
        0x8t
        0x2t
        0x5t
        0x0t
        0x4t
        0x9t
        0xft
        0xat
        0x3t
        0x7t
        0xct
        0xdt
        0x6t
        0xet
        0x1t
        0xbt
        0x3t
        0x6t
        0x0t
        0x1t
        0x5t
        0xdt
        0xat
        0x8t
        0xbt
        0x2t
        0x9t
        0x7t
        0xet
        0xft
        0xct
        0x4t
        0x8t
        0xdt
        0xbt
        0x0t
        0x4t
        0x5t
        0x1t
        0x2t
        0x9t
        0x3t
        0xct
        0xet
        0x6t
        0xft
        0xat
        0x7t
        0xct
        0x9t
        0xbt
        0x1t
        0x8t
        0xet
        0x2t
        0x4t
        0x7t
        0x3t
        0x6t
        0x5t
        0xat
        0x0t
        0xft
        0xdt
        0xat
        0x9t
        0x6t
        0x8t
        0xdt
        0xet
        0x2t
        0x0t
        0xft
        0x3t
        0x5t
        0xbt
        0x4t
        0x1t
        0xct
        0x7t
        0x7t
        0x4t
        0x0t
        0x5t
        0xat
        0x2t
        0xft
        0xet
        0xct
        0x6t
        0x1t
        0xbt
        0xdt
        0x9t
        0x3t
        0x8t
    .end array-data

    .line 87
    :array_5
    .array-data 1
        0xft
        0xct
        0x2t
        0xat
        0x6t
        0x4t
        0x5t
        0x0t
        0x7t
        0x9t
        0xet
        0xdt
        0x1t
        0xbt
        0x8t
        0x3t
        0xbt
        0x6t
        0x3t
        0x4t
        0xct
        0xft
        0xet
        0x2t
        0x7t
        0xdt
        0x8t
        0x0t
        0x5t
        0xat
        0x9t
        0x1t
        0x1t
        0xct
        0xbt
        0x0t
        0xft
        0xet
        0x6t
        0x5t
        0xat
        0xdt
        0x4t
        0x8t
        0x9t
        0x3t
        0x7t
        0x2t
        0x1t
        0x5t
        0xet
        0xct
        0xat
        0x7t
        0x0t
        0xdt
        0x6t
        0x2t
        0xbt
        0x4t
        0x9t
        0x3t
        0xft
        0x8t
        0x0t
        0xct
        0x8t
        0x9t
        0xdt
        0x2t
        0xat
        0xbt
        0x7t
        0x3t
        0x6t
        0x5t
        0x4t
        0xet
        0xft
        0x1t
        0x8t
        0x0t
        0xft
        0x3t
        0x2t
        0x5t
        0xet
        0xbt
        0x1t
        0xat
        0x4t
        0x7t
        0xct
        0x9t
        0xdt
        0x6t
        0x3t
        0x0t
        0x6t
        0xft
        0x1t
        0xet
        0x9t
        0x2t
        0xdt
        0x8t
        0xct
        0x4t
        0xbt
        0xat
        0x5t
        0x7t
        0x1t
        0xat
        0x6t
        0x8t
        0xft
        0xbt
        0x0t
        0x4t
        0xct
        0x3t
        0x5t
        0x9t
        0x7t
        0xdt
        0x2t
        0xet
    .end array-data

    .line 99
    :array_6
    .array-data 1
        0x4t
        0xat
        0x9t
        0x2t
        0xdt
        0x8t
        0x0t
        0xet
        0x6t
        0xbt
        0x1t
        0xct
        0x7t
        0xft
        0x5t
        0x3t
        0xet
        0xbt
        0x4t
        0xct
        0x6t
        0xdt
        0xft
        0xat
        0x2t
        0x3t
        0x8t
        0x1t
        0x0t
        0x7t
        0x5t
        0x9t
        0x5t
        0x8t
        0x1t
        0xdt
        0xat
        0x3t
        0x4t
        0x2t
        0xet
        0xft
        0xct
        0x7t
        0x6t
        0x0t
        0x9t
        0xbt
        0x7t
        0xdt
        0xat
        0x1t
        0x0t
        0x8t
        0x9t
        0xft
        0xet
        0x4t
        0x6t
        0xct
        0xbt
        0x2t
        0x5t
        0x3t
        0x6t
        0xct
        0x7t
        0x1t
        0x5t
        0xft
        0xdt
        0x8t
        0x4t
        0xat
        0x9t
        0xet
        0x0t
        0x3t
        0xbt
        0x2t
        0x4t
        0xbt
        0xat
        0x0t
        0x7t
        0x2t
        0x1t
        0xdt
        0x3t
        0x6t
        0x8t
        0x5t
        0x9t
        0xct
        0xft
        0xet
        0xdt
        0xbt
        0x4t
        0x1t
        0x3t
        0xft
        0x5t
        0x9t
        0x0t
        0xat
        0xet
        0x7t
        0x6t
        0x8t
        0x2t
        0xct
        0x1t
        0xft
        0xdt
        0x0t
        0x5t
        0x7t
        0xat
        0x4t
        0x9t
        0x2t
        0x3t
        0xet
        0x6t
        0xbt
        0x8t
        0xct
    .end array-data

    .line 110
    :array_7
    .array-data 1
        0xat
        0x4t
        0x5t
        0x6t
        0x8t
        0x1t
        0x3t
        0x7t
        0xdt
        0xct
        0xet
        0x0t
        0x9t
        0x2t
        0xbt
        0xft
        0x5t
        0xft
        0x4t
        0x0t
        0x2t
        0xdt
        0xbt
        0x9t
        0x1t
        0x7t
        0x6t
        0x3t
        0xct
        0xet
        0xat
        0x8t
        0x7t
        0xft
        0xct
        0xet
        0x9t
        0x4t
        0x1t
        0x0t
        0x3t
        0xbt
        0x5t
        0x2t
        0x6t
        0xat
        0x8t
        0xdt
        0x4t
        0xat
        0x7t
        0xct
        0x0t
        0xft
        0x2t
        0x8t
        0xet
        0x1t
        0x6t
        0x5t
        0xdt
        0xbt
        0x9t
        0x3t
        0x7t
        0x6t
        0x4t
        0xbt
        0x9t
        0xct
        0x2t
        0xat
        0x1t
        0x8t
        0x0t
        0xet
        0xft
        0xdt
        0x3t
        0x5t
        0x7t
        0x6t
        0x2t
        0x4t
        0xdt
        0x9t
        0xft
        0x0t
        0xat
        0x1t
        0x5t
        0xbt
        0x8t
        0xet
        0xct
        0x3t
        0xdt
        0xet
        0x4t
        0x1t
        0x7t
        0x0t
        0x5t
        0xat
        0x3t
        0xct
        0x8t
        0xft
        0x6t
        0x2t
        0x9t
        0xbt
        0x1t
        0x3t
        0xat
        0x9t
        0x5t
        0xbt
        0x4t
        0xft
        0x8t
        0x6t
        0x7t
        0xet
        0xdt
        0x0t
        0x2t
        0xct
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/GOST28147Engine;->a:[I

    .line 23
    sget-object v0, Lorg/spongycastle/crypto/engines/GOST28147Engine;->d:[B

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/GOST28147Engine;->c:[B

    .line 148
    return-void
.end method

.method private a(II)I
    .locals 4

    .prologue
    .line 258
    add-int v0, p2, p1

    .line 262
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/GOST28147Engine;->c:[B

    shr-int/lit8 v2, v0, 0x0

    and-int/lit8 v2, v2, 0xf

    add-int/lit8 v2, v2, 0x0

    aget-byte v1, v1, v2

    shl-int/lit8 v1, v1, 0x0

    .line 263
    iget-object v2, p0, Lorg/spongycastle/crypto/engines/GOST28147Engine;->c:[B

    shr-int/lit8 v3, v0, 0x4

    and-int/lit8 v3, v3, 0xf

    add-int/lit8 v3, v3, 0x10

    aget-byte v2, v2, v3

    shl-int/lit8 v2, v2, 0x4

    add-int/2addr v1, v2

    .line 264
    iget-object v2, p0, Lorg/spongycastle/crypto/engines/GOST28147Engine;->c:[B

    shr-int/lit8 v3, v0, 0x8

    and-int/lit8 v3, v3, 0xf

    add-int/lit8 v3, v3, 0x20

    aget-byte v2, v2, v3

    shl-int/lit8 v2, v2, 0x8

    add-int/2addr v1, v2

    .line 265
    iget-object v2, p0, Lorg/spongycastle/crypto/engines/GOST28147Engine;->c:[B

    shr-int/lit8 v3, v0, 0xc

    and-int/lit8 v3, v3, 0xf

    add-int/lit8 v3, v3, 0x30

    aget-byte v2, v2, v3

    shl-int/lit8 v2, v2, 0xc

    add-int/2addr v1, v2

    .line 266
    iget-object v2, p0, Lorg/spongycastle/crypto/engines/GOST28147Engine;->c:[B

    shr-int/lit8 v3, v0, 0x10

    and-int/lit8 v3, v3, 0xf

    add-int/lit8 v3, v3, 0x40

    aget-byte v2, v2, v3

    shl-int/lit8 v2, v2, 0x10

    add-int/2addr v1, v2

    .line 267
    iget-object v2, p0, Lorg/spongycastle/crypto/engines/GOST28147Engine;->c:[B

    shr-int/lit8 v3, v0, 0x14

    and-int/lit8 v3, v3, 0xf

    add-int/lit8 v3, v3, 0x50

    aget-byte v2, v2, v3

    shl-int/lit8 v2, v2, 0x14

    add-int/2addr v1, v2

    .line 268
    iget-object v2, p0, Lorg/spongycastle/crypto/engines/GOST28147Engine;->c:[B

    shr-int/lit8 v3, v0, 0x18

    and-int/lit8 v3, v3, 0xf

    add-int/lit8 v3, v3, 0x60

    aget-byte v2, v2, v3

    shl-int/lit8 v2, v2, 0x18

    add-int/2addr v1, v2

    .line 269
    iget-object v2, p0, Lorg/spongycastle/crypto/engines/GOST28147Engine;->c:[B

    shr-int/lit8 v0, v0, 0x1c

    and-int/lit8 v0, v0, 0xf

    add-int/lit8 v0, v0, 0x70

    aget-byte v0, v2, v0

    shl-int/lit8 v0, v0, 0x1c

    add-int/2addr v0, v1

    .line 271
    shl-int/lit8 v1, v0, 0xb

    ushr-int/lit8 v0, v0, 0x15

    or-int/2addr v0, v1

    return v0
.end method

.method private static a([BI)I
    .locals 3

    .prologue
    .line 337
    add-int/lit8 v0, p1, 0x3

    aget-byte v0, p0, v0

    shl-int/lit8 v0, v0, 0x18

    const/high16 v1, -0x1000000

    and-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    aget-byte v1, p0, v1

    shl-int/lit8 v1, v1, 0x10

    const/high16 v2, 0xff0000

    and-int/2addr v1, v2

    add-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    shl-int/lit8 v1, v1, 0x8

    const v2, 0xff00

    and-int/2addr v1, v2

    add-int/2addr v0, v1

    aget-byte v1, p0, p1

    and-int/lit16 v1, v1, 0xff

    add-int/2addr v0, v1

    return v0
.end method

.method private static a(I[BI)V
    .locals 2

    .prologue
    .line 347
    add-int/lit8 v0, p2, 0x3

    ushr-int/lit8 v1, p0, 0x18

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 348
    add-int/lit8 v0, p2, 0x2

    ushr-int/lit8 v1, p0, 0x10

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 349
    add-int/lit8 v0, p2, 0x1

    ushr-int/lit8 v1, p0, 0x8

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 350
    int-to-byte v0, p0

    aput-byte v0, p1, p2

    .line 351
    return-void
.end method

.method private static a(Ljava/lang/String;[B)V
    .locals 2

    .prologue
    .line 140
    sget-object v0, Lorg/spongycastle/crypto/engines/GOST28147Engine;->l:Ljava/util/Hashtable;

    invoke-static {p0}, Lorg/spongycastle/util/Strings;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    return-void
.end method

.method private a([I[BI[BI)V
    .locals 10

    .prologue
    const/16 v8, 0x8

    const/4 v2, 0x7

    const/4 v7, 0x3

    const/4 v5, 0x0

    .line 282
    invoke-static {p2, p3}, Lorg/spongycastle/crypto/engines/GOST28147Engine;->a([BI)I

    move-result v0

    .line 283
    add-int/lit8 v1, p3, 0x4

    invoke-static {p2, v1}, Lorg/spongycastle/crypto/engines/GOST28147Engine;->a([BI)I

    move-result v1

    .line 285
    iget-boolean v3, p0, Lorg/spongycastle/crypto/engines/GOST28147Engine;->b:Z

    if-eqz v3, :cond_2

    move v4, v5

    .line 287
    :goto_0
    if-ge v4, v7, :cond_1

    move v3, v1

    move v1, v0

    move v0, v5

    .line 289
    :goto_1
    if-ge v0, v8, :cond_0

    .line 292
    aget v6, p1, v0

    invoke-direct {p0, v1, v6}, Lorg/spongycastle/crypto/engines/GOST28147Engine;->a(II)I

    move-result v6

    xor-int/2addr v3, v6

    .line 289
    add-int/lit8 v0, v0, 0x1

    move v9, v3

    move v3, v1

    move v1, v9

    goto :goto_1

    .line 287
    :cond_0
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    move v0, v1

    move v1, v3

    goto :goto_0

    .line 296
    :cond_1
    :goto_2
    if-lez v2, :cond_6

    .line 299
    aget v3, p1, v2

    invoke-direct {p0, v0, v3}, Lorg/spongycastle/crypto/engines/GOST28147Engine;->a(II)I

    move-result v3

    xor-int/2addr v1, v3

    .line 296
    add-int/lit8 v2, v2, -0x1

    move v9, v1

    move v1, v0

    move v0, v9

    goto :goto_2

    :cond_2
    move v3, v5

    .line 305
    :goto_3
    if-ge v3, v8, :cond_3

    .line 308
    aget v4, p1, v3

    invoke-direct {p0, v0, v4}, Lorg/spongycastle/crypto/engines/GOST28147Engine;->a(II)I

    move-result v4

    xor-int/2addr v4, v1

    .line 305
    add-int/lit8 v1, v3, 0x1

    move v3, v1

    move v1, v0

    move v0, v4

    goto :goto_3

    :cond_3
    move v4, v5

    .line 311
    :goto_4
    if-ge v4, v7, :cond_6

    move v3, v1

    move v1, v0

    move v0, v2

    .line 313
    :goto_5
    if-ltz v0, :cond_5

    .line 315
    const/4 v6, 0x2

    if-ne v4, v6, :cond_4

    if-eqz v0, :cond_5

    .line 320
    :cond_4
    aget v6, p1, v0

    invoke-direct {p0, v1, v6}, Lorg/spongycastle/crypto/engines/GOST28147Engine;->a(II)I

    move-result v6

    xor-int/2addr v3, v6

    .line 313
    add-int/lit8 v0, v0, -0x1

    move v9, v3

    move v3, v1

    move v1, v9

    goto :goto_5

    .line 311
    :cond_5
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    move v0, v1

    move v1, v3

    goto :goto_4

    .line 326
    :cond_6
    aget v2, p1, v5

    invoke-direct {p0, v0, v2}, Lorg/spongycastle/crypto/engines/GOST28147Engine;->a(II)I

    move-result v2

    xor-int/2addr v1, v2

    .line 328
    invoke-static {v0, p4, p5}, Lorg/spongycastle/crypto/engines/GOST28147Engine;->a(I[BI)V

    .line 329
    add-int/lit8 v0, p5, 0x4

    invoke-static {v1, p4, v0}, Lorg/spongycastle/crypto/engines/GOST28147Engine;->a(I[BI)V

    .line 330
    return-void
.end method

.method public static a(Ljava/lang/String;)[B
    .locals 2

    .prologue
    .line 361
    sget-object v0, Lorg/spongycastle/crypto/engines/GOST28147Engine;->l:Ljava/util/Hashtable;

    invoke-static {p0}, Lorg/spongycastle/util/Strings;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 363
    if-nez v0, :cond_0

    .line 365
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown S-Box - possible types: \"Default\", \"E-Test\", \"E-A\", \"E-B\", \"E-C\", \"E-D\", \"D-Test\", \"D-A\"."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 369
    :cond_0
    invoke-static {v0}, Lorg/spongycastle/util/Arrays;->b([B)[B

    move-result-object v0

    return-object v0
.end method

.method private a(Z[B)[I
    .locals 4

    .prologue
    const/16 v3, 0x8

    .line 240
    iput-boolean p1, p0, Lorg/spongycastle/crypto/engines/GOST28147Engine;->b:Z

    .line 242
    array-length v0, p2

    const/16 v1, 0x20

    if-eq v0, v1, :cond_0

    .line 244
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Key length invalid. Key needs to be 32 byte - 256 bit!!!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 247
    :cond_0
    new-array v1, v3, [I

    .line 248
    const/4 v0, 0x0

    :goto_0
    if-eq v0, v3, :cond_1

    .line 250
    mul-int/lit8 v2, v0, 0x4

    invoke-static {p2, v2}, Lorg/spongycastle/crypto/engines/GOST28147Engine;->a([BI)I

    move-result v2

    aput v2, v1, v0

    .line 248
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 253
    :cond_1
    return-object v1
.end method


# virtual methods
.method public final a([BI[BI)I
    .locals 6

    .prologue
    .line 212
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/GOST28147Engine;->a:[I

    if-nez v0, :cond_0

    .line 214
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "GOST28147 engine not initialised"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 217
    :cond_0
    add-int/lit8 v0, p2, 0x8

    array-length v1, p1

    if-le v0, v1, :cond_1

    .line 219
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "input buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 222
    :cond_1
    add-int/lit8 v0, p4, 0x8

    array-length v1, p3

    if-le v0, v1, :cond_2

    .line 224
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "output buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 227
    :cond_2
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/GOST28147Engine;->a:[I

    move-object v0, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lorg/spongycastle/crypto/engines/GOST28147Engine;->a([I[BI[BI)V

    .line 229
    const/16 v0, 0x8

    return v0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 198
    const-string v0, "GOST28147"

    return-object v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 3

    .prologue
    .line 162
    instance-of v0, p2, Lorg/spongycastle/crypto/params/ParametersWithSBox;

    if-eqz v0, :cond_2

    .line 164
    check-cast p2, Lorg/spongycastle/crypto/params/ParametersWithSBox;

    .line 169
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithSBox;->a()[B

    move-result-object v0

    .line 170
    array-length v1, v0

    sget-object v2, Lorg/spongycastle/crypto/engines/GOST28147Engine;->d:[B

    array-length v2, v2

    if-eq v1, v2, :cond_0

    .line 172
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid S-box passed to GOST28147 init"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 174
    :cond_0
    invoke-static {v0}, Lorg/spongycastle/util/Arrays;->b([B)[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/GOST28147Engine;->c:[B

    .line 179
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithSBox;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 181
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithSBox;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/KeyParameter;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/KeyParameter;->a()[B

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lorg/spongycastle/crypto/engines/GOST28147Engine;->a(Z[B)[I

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/GOST28147Engine;->a:[I

    .line 194
    :cond_1
    :goto_0
    return-void

    .line 185
    :cond_2
    instance-of v0, p2, Lorg/spongycastle/crypto/params/KeyParameter;

    if-eqz v0, :cond_3

    .line 187
    check-cast p2, Lorg/spongycastle/crypto/params/KeyParameter;

    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/KeyParameter;->a()[B

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lorg/spongycastle/crypto/engines/GOST28147Engine;->a(Z[B)[I

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/GOST28147Engine;->a:[I

    goto :goto_0

    .line 190
    :cond_3
    if-eqz p2, :cond_1

    .line 192
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "invalid parameter passed to GOST28147 init - "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 203
    const/16 v0, 0x8

    return v0
.end method

.method public final c()V
    .locals 0

    .prologue
    .line 234
    return-void
.end method
