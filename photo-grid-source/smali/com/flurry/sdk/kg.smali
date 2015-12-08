.class public Lcom/flurry/sdk/kg;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ObjectType:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;

.field private static final b:[B


# instance fields
.field private c:Ljava/lang/String;

.field private d:Lcom/flurry/sdk/kx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/flurry/sdk/kx",
            "<TObjectType;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 18
    const-class v0, Lcom/flurry/sdk/kg;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/kg;->a:Ljava/lang/String;

    .line 22
    const/16 v0, 0x20

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/flurry/sdk/kg;->b:[B

    return-void

    :array_0
    .array-data 1
        0x71t
        -0x5ct
        -0x8t
        0x7dt
        0x79t
        0x6bt
        -0x41t
        -0x3dt
        -0x4at
        -0x72t
        -0x20t
        0x0t
        -0x39t
        -0x57t
        -0x23t
        -0x38t
        -0x6t
        -0x34t
        0x33t
        0x7et
        -0x68t
        0x31t
        0x4ft
        -0x34t
        0x76t
        -0x54t
        0x63t
        -0x34t
        -0xet
        -0x7et
        -0x1bt
        -0x40t
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/flurry/sdk/kx;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/flurry/sdk/kx",
            "<TObjectType;>;)V"
        }
    .end annotation

    .prologue
    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, Lcom/flurry/sdk/kg;->c:Ljava/lang/String;

    .line 63
    iput-object p2, p0, Lcom/flurry/sdk/kg;->d:Lcom/flurry/sdk/kx;

    .line 64
    return-void
.end method

.method public static a([B)V
    .locals 6

    .prologue
    .line 30
    if-nez p0, :cond_1

    .line 39
    :cond_0
    return-void

    .line 34
    :cond_1
    array-length v1, p0

    .line 35
    sget-object v0, Lcom/flurry/sdk/kg;->b:[B

    array-length v2, v0

    .line 36
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 37
    aget-byte v3, p0, v0

    sget-object v4, Lcom/flurry/sdk/kg;->b:[B

    rem-int v5, v0, v2

    aget-byte v4, v4, v5

    xor-int/2addr v3, v4

    mul-int/lit8 v4, v0, 0x1f

    rem-int/lit16 v4, v4, 0xfb

    xor-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, p0, v0

    .line 36
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public static b([B)V
    .locals 0

    .prologue
    .line 43
    invoke-static {p0}, Lcom/flurry/sdk/kg;->a([B)V

    .line 44
    return-void
.end method

.method public static c([B)I
    .locals 1

    .prologue
    .line 49
    if-nez p0, :cond_0

    .line 50
    const/4 v0, 0x0

    .line 55
    :goto_0
    return v0

    .line 53
    :cond_0
    new-instance v0, Lcom/flurry/sdk/ju;

    invoke-direct {v0}, Lcom/flurry/sdk/ju;-><init>()V

    .line 54
    invoke-virtual {v0, p0}, Lcom/flurry/sdk/ju;->update([B)V

    .line 55
    invoke-virtual {v0}, Lcom/flurry/sdk/ju;->b()I

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)[B
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TObjectType;)[B"
        }
    .end annotation

    .prologue
    .line 67
    if-nez p1, :cond_0

    .line 68
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Encoding: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/flurry/sdk/kg;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": Nothing to encode"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 72
    :cond_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 74
    iget-object v1, p0, Lcom/flurry/sdk/kg;->d:Lcom/flurry/sdk/kx;

    invoke-interface {v1, v0, p1}, Lcom/flurry/sdk/kx;->a(Ljava/io/OutputStream;Ljava/lang/Object;)V

    .line 75
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 77
    const/4 v1, 0x3

    sget-object v2, Lcom/flurry/sdk/kg;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Encoding "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/flurry/sdk/kg;->c:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v0}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 80
    new-instance v1, Lcom/flurry/sdk/kv;

    new-instance v2, Lcom/flurry/sdk/kt;

    invoke-direct {v2}, Lcom/flurry/sdk/kt;-><init>()V

    invoke-direct {v1, v2}, Lcom/flurry/sdk/kv;-><init>(Lcom/flurry/sdk/kx;)V

    .line 81
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 83
    invoke-interface {v1, v2, v0}, Lcom/flurry/sdk/kx;->a(Ljava/io/OutputStream;Ljava/lang/Object;)V

    .line 84
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 85
    invoke-static {v0}, Lcom/flurry/sdk/kg;->a([B)V

    .line 87
    return-object v0
.end method

.method public d([B)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)TObjectType;"
        }
    .end annotation

    .prologue
    .line 94
    if-nez p1, :cond_0

    .line 95
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Decoding: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/flurry/sdk/kg;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": Nothing to decode"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 99
    :cond_0
    invoke-static {p1}, Lcom/flurry/sdk/kg;->b([B)V

    .line 101
    new-instance v0, Lcom/flurry/sdk/kv;

    new-instance v1, Lcom/flurry/sdk/kt;

    invoke-direct {v1}, Lcom/flurry/sdk/kt;-><init>()V

    invoke-direct {v0, v1}, Lcom/flurry/sdk/kv;-><init>(Lcom/flurry/sdk/kx;)V

    .line 102
    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 103
    invoke-interface {v0, v1}, Lcom/flurry/sdk/kx;->b(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 105
    const/4 v1, 0x3

    sget-object v2, Lcom/flurry/sdk/kg;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Decoding: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/flurry/sdk/kg;->c:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v0}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 108
    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 109
    iget-object v0, p0, Lcom/flurry/sdk/kg;->d:Lcom/flurry/sdk/kx;

    invoke-interface {v0, v1}, Lcom/flurry/sdk/kx;->b(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
