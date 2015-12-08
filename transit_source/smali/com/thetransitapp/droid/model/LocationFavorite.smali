.class public Lcom/thetransitapp/droid/model/LocationFavorite;
.super Ljava/lang/Object;
.source "LocationFavorite.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x20c123e1f96a766L


# instance fields
.field private latitude:D

.field private longitude:D

.field private name:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public canEqual(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "other"    # Ljava/lang/Object;

    .prologue
    .line 7
    instance-of v0, p1, Lcom/thetransitapp/droid/model/LocationFavorite;

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 9
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 7
    if-ne p1, p0, :cond_1

    :cond_0
    :goto_0
    return v3

    :cond_1
    instance-of v5, p1, Lcom/thetransitapp/droid/model/LocationFavorite;

    if-nez v5, :cond_2

    move v3, v4

    goto :goto_0

    :cond_2
    move-object v0, p1

    check-cast v0, Lcom/thetransitapp/droid/model/LocationFavorite;

    .local v0, "other":Lcom/thetransitapp/droid/model/LocationFavorite;
    invoke-virtual {v0, p0}, Lcom/thetransitapp/droid/model/LocationFavorite;->canEqual(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    move v3, v4

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/LocationFavorite;->getName()Ljava/lang/String;

    move-result-object v2

    .local v2, "this$name":Ljava/lang/String;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/LocationFavorite;->getName()Ljava/lang/String;

    move-result-object v1

    .local v1, "other$name":Ljava/lang/String;
    if-nez v2, :cond_5

    if-eqz v1, :cond_6

    :cond_4
    move v3, v4

    goto :goto_0

    :cond_5
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    :cond_6
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/LocationFavorite;->getLatitude()D

    move-result-wide v5

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/LocationFavorite;->getLatitude()D

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Double;->compare(DD)I

    move-result v5

    if-eqz v5, :cond_7

    move v3, v4

    goto :goto_0

    :cond_7
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/LocationFavorite;->getLongitude()D

    move-result-wide v5

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/LocationFavorite;->getLongitude()D

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Double;->compare(DD)I

    move-result v5

    if-eqz v5, :cond_0

    move v3, v4

    goto :goto_0
.end method

.method public getLatitude()D
    .locals 2

    .prologue
    .line 7
    iget-wide v0, p0, Lcom/thetransitapp/droid/model/LocationFavorite;->latitude:D

    return-wide v0
.end method

.method public getLongitude()D
    .locals 2

    .prologue
    .line 7
    iget-wide v0, p0, Lcom/thetransitapp/droid/model/LocationFavorite;->longitude:D

    return-wide v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 7
    iget-object v0, p0, Lcom/thetransitapp/droid/model/LocationFavorite;->name:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 11

    .prologue
    const/16 v10, 0x20

    .line 7
    const/16 v5, 0x1f

    .local v5, "PRIME":I
    const/4 v6, 0x1

    .local v6, "result":I
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/LocationFavorite;->getName()Ljava/lang/String;

    move-result-object v4

    .local v4, "$name":Ljava/lang/String;
    if-nez v4, :cond_0

    const/4 v7, 0x0

    :goto_0
    add-int/lit8 v6, v7, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/LocationFavorite;->getLatitude()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    .local v0, "$latitude":J
    mul-int/lit8 v7, v6, 0x1f

    ushr-long v8, v0, v10

    xor-long/2addr v8, v0

    long-to-int v8, v8

    add-int v6, v7, v8

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/LocationFavorite;->getLongitude()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    .local v2, "$longitude":J
    mul-int/lit8 v7, v6, 0x1f

    ushr-long v8, v2, v10

    xor-long/2addr v8, v2

    long-to-int v8, v8

    add-int v6, v7, v8

    return v6

    .end local v0    # "$latitude":J
    .end local v2    # "$longitude":J
    :cond_0
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v7

    goto :goto_0
.end method

.method public setLatitude(D)V
    .locals 0
    .param p1, "latitude"    # D

    .prologue
    .line 7
    iput-wide p1, p0, Lcom/thetransitapp/droid/model/LocationFavorite;->latitude:D

    return-void
.end method

.method public setLongitude(D)V
    .locals 0
    .param p1, "longitude"    # D

    .prologue
    .line 7
    iput-wide p1, p0, Lcom/thetransitapp/droid/model/LocationFavorite;->longitude:D

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 7
    iput-object p1, p0, Lcom/thetransitapp/droid/model/LocationFavorite;->name:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "LocationFavorite(name="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/LocationFavorite;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", latitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/LocationFavorite;->getLatitude()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", longitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/LocationFavorite;->getLongitude()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
