.class public Ltwitter4j/GeoLocation;
.super Ljava/lang/Object;
.source "GeoLocation.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x434604a578b0df0fL


# instance fields
.field protected latitude:D

.field protected longitude:D


# direct methods
.method public constructor <init>(DD)V
    .locals 1
    .param p1, "latitude"    # D
    .param p3, "longitude"    # D

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-wide p1, p0, Ltwitter4j/GeoLocation;->latitude:D

    .line 38
    iput-wide p3, p0, Ltwitter4j/GeoLocation;->longitude:D

    .line 39
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 8
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 61
    if-ne p0, p1, :cond_1

    .line 69
    :cond_0
    :goto_0
    return v1

    .line 62
    :cond_1
    instance-of v3, p1, Ltwitter4j/GeoLocation;

    if-nez v3, :cond_2

    move v1, v2

    goto :goto_0

    :cond_2
    move-object v0, p1

    .line 64
    check-cast v0, Ltwitter4j/GeoLocation;

    .line 66
    .local v0, "that":Ltwitter4j/GeoLocation;
    invoke-virtual {v0}, Ltwitter4j/GeoLocation;->getLatitude()D

    move-result-wide v4

    iget-wide v6, p0, Ltwitter4j/GeoLocation;->latitude:D

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Double;->compare(DD)I

    move-result v3

    if-eqz v3, :cond_3

    move v1, v2

    goto :goto_0

    .line 67
    :cond_3
    invoke-virtual {v0}, Ltwitter4j/GeoLocation;->getLongitude()D

    move-result-wide v4

    iget-wide v6, p0, Ltwitter4j/GeoLocation;->longitude:D

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Double;->compare(DD)I

    move-result v3

    if-eqz v3, :cond_0

    move v1, v2

    goto :goto_0
.end method

.method public getLatitude()D
    .locals 2

    .prologue
    .line 47
    iget-wide v0, p0, Ltwitter4j/GeoLocation;->latitude:D

    return-wide v0
.end method

.method public getLongitude()D
    .locals 2

    .prologue
    .line 56
    iget-wide v0, p0, Ltwitter4j/GeoLocation;->longitude:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 11

    .prologue
    const-wide/16 v4, 0x0

    const/16 v10, 0x20

    const-wide/16 v8, 0x0

    .line 76
    iget-wide v6, p0, Ltwitter4j/GeoLocation;->latitude:D

    cmpl-double v1, v6, v8

    if-eqz v1, :cond_0

    iget-wide v6, p0, Ltwitter4j/GeoLocation;->latitude:D

    invoke-static {v6, v7}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    .line 77
    .local v2, "temp":J
    :goto_0
    ushr-long v6, v2, v10

    xor-long/2addr v6, v2

    long-to-int v0, v6

    .line 78
    .local v0, "result":I
    iget-wide v6, p0, Ltwitter4j/GeoLocation;->longitude:D

    cmpl-double v1, v6, v8

    if-eqz v1, :cond_1

    iget-wide v4, p0, Ltwitter4j/GeoLocation;->longitude:D

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    .line 79
    :goto_1
    mul-int/lit8 v1, v0, 0x1f

    ushr-long v4, v2, v10

    xor-long/2addr v4, v2

    long-to-int v4, v4

    add-int v0, v1, v4

    .line 80
    return v0

    .end local v0    # "result":I
    .end local v2    # "temp":J
    :cond_0
    move-wide v2, v4

    .line 76
    goto :goto_0

    .restart local v0    # "result":I
    .restart local v2    # "temp":J
    :cond_1
    move-wide v2, v4

    .line 78
    goto :goto_1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 85
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "GeoLocation{latitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v2, p0, Ltwitter4j/GeoLocation;->latitude:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuffer;->append(D)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ", longitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v2, p0, Ltwitter4j/GeoLocation;->longitude:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuffer;->append(D)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
