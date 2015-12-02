.class public Lcom/facebook/location/p;
.super Ljava/lang/Object;
.source "LatitudeLongitude.java"


# instance fields
.field private final a:D

.field private final b:D


# direct methods
.method private constructor <init>(DD)V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-wide p1, p0, Lcom/facebook/location/p;->a:D

    .line 14
    iput-wide p3, p0, Lcom/facebook/location/p;->b:D

    .line 15
    return-void
.end method

.method public static a(Lcom/facebook/location/Coordinates;)Lcom/facebook/location/p;
    .locals 5

    .prologue
    .line 50
    new-instance v0, Lcom/facebook/location/p;

    invoke-virtual {p0}, Lcom/facebook/location/Coordinates;->b()D

    move-result-wide v1

    invoke-virtual {p0}, Lcom/facebook/location/Coordinates;->c()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/facebook/location/p;-><init>(DD)V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 27
    if-ne p0, p1, :cond_1

    .line 35
    :cond_0
    :goto_0
    return v0

    .line 28
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    goto :goto_0

    .line 30
    :cond_3
    check-cast p1, Lcom/facebook/location/p;

    .line 32
    iget-wide v2, p1, Lcom/facebook/location/p;->a:D

    iget-wide v4, p0, Lcom/facebook/location/p;->a:D

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Double;->compare(DD)I

    move-result v2

    if-eqz v2, :cond_4

    move v0, v1

    goto :goto_0

    .line 33
    :cond_4
    iget-wide v2, p1, Lcom/facebook/location/p;->b:D

    iget-wide v4, p0, Lcom/facebook/location/p;->b:D

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Double;->compare(DD)I

    move-result v2

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 9

    .prologue
    const-wide/16 v2, 0x0

    const/16 v8, 0x20

    const-wide/16 v6, 0x0

    .line 42
    iget-wide v0, p0, Lcom/facebook/location/p;->a:D

    cmpl-double v0, v0, v6

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/facebook/location/p;->a:D

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    .line 43
    :goto_0
    ushr-long v4, v0, v8

    xor-long/2addr v0, v4

    long-to-int v0, v0

    .line 44
    iget-wide v4, p0, Lcom/facebook/location/p;->b:D

    cmpl-double v1, v4, v6

    if-eqz v1, :cond_0

    iget-wide v1, p0, Lcom/facebook/location/p;->b:D

    invoke-static {v1, v2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    .line 45
    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    ushr-long v4, v2, v8

    xor-long v1, v2, v4

    long-to-int v1, v1

    add-int/2addr v0, v1

    .line 46
    return v0

    :cond_1
    move-wide v0, v2

    .line 42
    goto :goto_0
.end method
