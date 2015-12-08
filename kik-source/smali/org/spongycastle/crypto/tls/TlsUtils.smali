.class public Lorg/spongycastle/crypto/tls/TlsUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:[B

.field static final b:[B

.field static final c:[[B


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/16 v4, 0xa

    const/4 v1, 0x4

    .line 420
    new-array v0, v1, [B

    fill-array-data v0, :array_0

    sput-object v0, Lorg/spongycastle/crypto/tls/TlsUtils;->a:[B

    .line 421
    new-array v0, v1, [B

    fill-array-data v0, :array_1

    sput-object v0, Lorg/spongycastle/crypto/tls/TlsUtils;->b:[B

    .line 424
    new-array v1, v4, [[B

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v4, :cond_0

    add-int/lit8 v2, v0, 0x1

    new-array v2, v2, [B

    add-int/lit8 v3, v0, 0x41

    int-to-byte v3, v3

    invoke-static {v2, v3}, Lorg/spongycastle/util/Arrays;->a([BB)V

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    sput-object v1, Lorg/spongycastle/crypto/tls/TlsUtils;->c:[[B

    return-void

    .line 420
    :array_0
    .array-data 1
        0x43t
        0x4ct
        0x4et
        0x54t
    .end array-data

    .line 421
    :array_1
    .array-data 1
        0x53t
        0x52t
        0x56t
        0x52t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
