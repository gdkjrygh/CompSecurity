.class public Lcom/qihoo/security/json/c;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field private final a:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    const/16 v0, 0x200

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/qihoo/security/json/c;->a:[Ljava/lang/String;

    return-void
.end method

.method private static a(Ljava/lang/String;[CII)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-eq v1, p3, :cond_1

    .line 17
    :cond_0
    :goto_0
    return v0

    :cond_1
    move v1, v0

    .line 12
    :goto_1
    if-ge v1, p3, :cond_2

    .line 13
    add-int v2, p2, v1

    aget-char v2, p1, v2

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-ne v2, v3, :cond_0

    .line 12
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 17
    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public a([CII)Ljava/lang/String;
    .locals 3

    .prologue
    .line 25
    const/4 v0, 0x0

    move v1, v0

    move v0, p2

    .line 26
    :goto_0
    add-int v2, p2, p3

    if-ge v0, v2, :cond_0

    .line 27
    mul-int/lit8 v1, v1, 0x1f

    aget-char v2, p1, v0

    add-int/2addr v1, v2

    .line 26
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 31
    :cond_0
    ushr-int/lit8 v0, v1, 0x14

    ushr-int/lit8 v2, v1, 0xc

    xor-int/2addr v0, v2

    xor-int/2addr v0, v1

    .line 32
    ushr-int/lit8 v1, v0, 0x7

    ushr-int/lit8 v2, v0, 0x4

    xor-int/2addr v1, v2

    xor-int/2addr v0, v1

    .line 33
    iget-object v1, p0, Lcom/qihoo/security/json/c;->a:[Ljava/lang/String;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    and-int/2addr v1, v0

    .line 35
    iget-object v0, p0, Lcom/qihoo/security/json/c;->a:[Ljava/lang/String;

    aget-object v0, v0, v1

    .line 36
    if-eqz v0, :cond_1

    invoke-static {v0, p1, p2, p3}, Lcom/qihoo/security/json/c;->a(Ljava/lang/String;[CII)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 42
    :goto_1
    return-object v0

    .line 40
    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 41
    iget-object v2, p0, Lcom/qihoo/security/json/c;->a:[Ljava/lang/String;

    aput-object v0, v2, v1

    goto :goto_1
.end method
