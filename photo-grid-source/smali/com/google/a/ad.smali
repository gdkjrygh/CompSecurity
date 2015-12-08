.class public final Lcom/google/a/ad;
.super Lcom/google/a/x;
.source "SourceFile"


# static fields
.field private static final a:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 35
    const/16 v0, 0x10

    new-array v0, v0, [Ljava/lang/Class;

    const/4 v1, 0x0

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-class v2, Ljava/lang/Integer;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-class v2, Ljava/lang/Long;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-class v2, Ljava/lang/Short;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-class v2, Ljava/lang/Float;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-class v2, Ljava/lang/Double;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-class v2, Ljava/lang/Byte;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    const-class v2, Ljava/lang/Boolean;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    const-class v2, Ljava/lang/Character;

    aput-object v2, v0, v1

    sput-object v0, Lcom/google/a/ad;->a:[Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Boolean;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/google/a/x;-><init>()V

    .line 47
    invoke-direct {p0, p1}, Lcom/google/a/ad;->a(Ljava/lang/Object;)V

    .line 48
    return-void
.end method

.method public constructor <init>(Ljava/lang/Number;)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0}, Lcom/google/a/x;-><init>()V

    .line 56
    invoke-direct {p0, p1}, Lcom/google/a/ad;->a(Ljava/lang/Object;)V

    .line 57
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 64
    invoke-direct {p0}, Lcom/google/a/x;-><init>()V

    .line 65
    invoke-direct {p0, p1}, Lcom/google/a/ad;->a(Ljava/lang/Object;)V

    .line 66
    return-void
.end method

.method private a(Ljava/lang/Object;)V
    .locals 7

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 89
    instance-of v2, p1, Ljava/lang/Character;

    if-eqz v2, :cond_0

    .line 92
    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result v0

    .line 93
    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/a/ad;->b:Ljava/lang/Object;

    .line 99
    :goto_0
    return-void

    .line 95
    :cond_0
    instance-of v2, p1, Ljava/lang/Number;

    if-nez v2, :cond_1

    .line 1269
    instance-of v2, p1, Ljava/lang/String;

    if-eqz v2, :cond_3

    move v2, v1

    .line 95
    :goto_1
    if-eqz v2, :cond_2

    :cond_1
    move v0, v1

    :cond_2
    invoke-static {v0}, Lcom/google/a/b/a;->a(Z)V

    .line 97
    iput-object p1, p0, Lcom/google/a/ad;->b:Ljava/lang/Object;

    goto :goto_0

    .line 1273
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    .line 1274
    sget-object v4, Lcom/google/a/ad;->a:[Ljava/lang/Class;

    array-length v5, v4

    move v2, v0

    :goto_2
    if-ge v2, v5, :cond_5

    aget-object v6, v4, v2

    .line 1275
    invoke-virtual {v6, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_4

    move v2, v1

    .line 1276
    goto :goto_1

    .line 1274
    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    move v2, v0

    .line 1279
    goto :goto_1
.end method

.method private static a(Lcom/google/a/ad;)Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 329
    iget-object v0, p0, Lcom/google/a/ad;->b:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/Number;

    if-eqz v0, :cond_2

    .line 330
    iget-object v0, p0, Lcom/google/a/ad;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    .line 331
    instance-of v2, v0, Ljava/math/BigInteger;

    if-nez v2, :cond_0

    instance-of v2, v0, Ljava/lang/Long;

    if-nez v2, :cond_0

    instance-of v2, v0, Ljava/lang/Integer;

    if-nez v2, :cond_0

    instance-of v2, v0, Ljava/lang/Short;

    if-nez v2, :cond_0

    instance-of v0, v0, Ljava/lang/Byte;

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    .line 334
    :goto_0
    return v0

    :cond_1
    move v0, v1

    .line 331
    goto :goto_0

    :cond_2
    move v0, v1

    .line 334
    goto :goto_0
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .prologue
    .line 107
    iget-object v0, p0, Lcom/google/a/ad;->b:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/Boolean;

    return v0
.end method

.method public final b()Ljava/lang/Number;
    .locals 2

    .prologue
    .line 152
    iget-object v0, p0, Lcom/google/a/ad;->b:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/a/b/r;

    iget-object v0, p0, Lcom/google/a/ad;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-direct {v1, v0}, Lcom/google/a/b/r;-><init>(Ljava/lang/String;)V

    move-object v0, v1

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/a/ad;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    goto :goto_0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 171
    .line 2141
    iget-object v0, p0, Lcom/google/a/ad;->b:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/Number;

    .line 171
    if-eqz v0, :cond_0

    .line 172
    invoke-virtual {p0}, Lcom/google/a/ad;->b()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 176
    :goto_0
    return-object v0

    .line 3107
    :cond_0
    iget-object v0, p0, Lcom/google/a/ad;->b:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/Boolean;

    .line 173
    if-eqz v0, :cond_1

    .line 3117
    iget-object v0, p0, Lcom/google/a/ad;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    .line 174
    invoke-virtual {v0}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 176
    :cond_1
    iget-object v0, p0, Lcom/google/a/ad;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    goto :goto_0
.end method

.method public final d()D
    .locals 2

    .prologue
    .line 188
    .line 3141
    iget-object v0, p0, Lcom/google/a/ad;->b:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/Number;

    .line 188
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/a/ad;->b()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/a/ad;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    goto :goto_0
.end method

.method public final e()F
    .locals 1

    .prologue
    .line 222
    .line 4141
    iget-object v0, p0, Lcom/google/a/ad;->b:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/Number;

    .line 222
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/a/ad;->b()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/a/ad;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    goto :goto_0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 301
    if-ne p0, p1, :cond_1

    .line 321
    :cond_0
    :goto_0
    return v0

    .line 304
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    .line 305
    goto :goto_0

    .line 307
    :cond_3
    check-cast p1, Lcom/google/a/ad;

    .line 308
    iget-object v2, p0, Lcom/google/a/ad;->b:Ljava/lang/Object;

    if-nez v2, :cond_4

    .line 309
    iget-object v2, p1, Lcom/google/a/ad;->b:Ljava/lang/Object;

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0

    .line 311
    :cond_4
    invoke-static {p0}, Lcom/google/a/ad;->a(Lcom/google/a/ad;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-static {p1}, Lcom/google/a/ad;->a(Lcom/google/a/ad;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 312
    invoke-virtual {p0}, Lcom/google/a/ad;->b()Ljava/lang/Number;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    invoke-virtual {p1}, Lcom/google/a/ad;->b()Ljava/lang/Number;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0

    .line 314
    :cond_5
    iget-object v2, p0, Lcom/google/a/ad;->b:Ljava/lang/Object;

    instance-of v2, v2, Ljava/lang/Number;

    if-eqz v2, :cond_7

    iget-object v2, p1, Lcom/google/a/ad;->b:Ljava/lang/Object;

    instance-of v2, v2, Ljava/lang/Number;

    if-eqz v2, :cond_7

    .line 315
    invoke-virtual {p0}, Lcom/google/a/ad;->b()Ljava/lang/Number;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    .line 318
    invoke-virtual {p1}, Lcom/google/a/ad;->b()Ljava/lang/Number;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    .line 319
    cmpl-double v6, v2, v4

    if-eqz v6, :cond_0

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_6
    move v0, v1

    goto :goto_0

    .line 321
    :cond_7
    iget-object v0, p0, Lcom/google/a/ad;->b:Ljava/lang/Object;

    iget-object v1, p1, Lcom/google/a/ad;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public final f()J
    .locals 2

    .prologue
    .line 233
    .line 5141
    iget-object v0, p0, Lcom/google/a/ad;->b:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/Number;

    .line 233
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/a/ad;->b()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/a/ad;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    goto :goto_0
.end method

.method public final g()I
    .locals 1

    .prologue
    .line 255
    .line 6141
    iget-object v0, p0, Lcom/google/a/ad;->b:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/Number;

    .line 255
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/a/ad;->b()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/a/ad;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    goto :goto_0
.end method

.method public final h()Z
    .locals 1

    .prologue
    .line 127
    .line 2107
    iget-object v0, p0, Lcom/google/a/ad;->b:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/Boolean;

    .line 127
    if-eqz v0, :cond_0

    .line 2117
    iget-object v0, p0, Lcom/google/a/ad;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    .line 128
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 131
    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/a/ad;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 4

    .prologue
    const/16 v2, 0x20

    .line 284
    iget-object v0, p0, Lcom/google/a/ad;->b:Ljava/lang/Object;

    if-nez v0, :cond_0

    .line 285
    const/16 v0, 0x1f

    .line 296
    :goto_0
    return v0

    .line 288
    :cond_0
    invoke-static {p0}, Lcom/google/a/ad;->a(Lcom/google/a/ad;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 289
    invoke-virtual {p0}, Lcom/google/a/ad;->b()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    .line 290
    ushr-long v2, v0, v2

    xor-long/2addr v0, v2

    long-to-int v0, v0

    goto :goto_0

    .line 292
    :cond_1
    iget-object v0, p0, Lcom/google/a/ad;->b:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/Number;

    if-eqz v0, :cond_2

    .line 293
    invoke-virtual {p0}, Lcom/google/a/ad;->b()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    .line 294
    ushr-long v2, v0, v2

    xor-long/2addr v0, v2

    long-to-int v0, v0

    goto :goto_0

    .line 296
    :cond_2
    iget-object v0, p0, Lcom/google/a/ad;->b:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0
.end method

.method public final l()Z
    .locals 1

    .prologue
    .line 141
    iget-object v0, p0, Lcom/google/a/ad;->b:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/Number;

    return v0
.end method

.method public final m()Z
    .locals 1

    .prologue
    .line 161
    iget-object v0, p0, Lcom/google/a/ad;->b:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/String;

    return v0
.end method
