.class public Lcom/thetransitapp/droid/model/RouteDirection;
.super Ljava/lang/Object;
.source "RouteDirection.java"


# instance fields
.field private direction:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

.field private directionIndex:I


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
    instance-of v0, p1, Lcom/thetransitapp/droid/model/RouteDirection;

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
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
    instance-of v5, p1, Lcom/thetransitapp/droid/model/RouteDirection;

    if-nez v5, :cond_2

    move v3, v4

    goto :goto_0

    :cond_2
    move-object v0, p1

    check-cast v0, Lcom/thetransitapp/droid/model/RouteDirection;

    .local v0, "other":Lcom/thetransitapp/droid/model/RouteDirection;
    invoke-virtual {v0, p0}, Lcom/thetransitapp/droid/model/RouteDirection;->canEqual(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    move v3, v4

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RouteDirection;->getDirection()Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    move-result-object v2

    .local v2, "this$direction":Lcom/thetransitapp/droid/model/Itinerary$DirectionType;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/RouteDirection;->getDirection()Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    move-result-object v1

    .local v1, "other$direction":Lcom/thetransitapp/droid/model/Itinerary$DirectionType;
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
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RouteDirection;->getDirectionIndex()I

    move-result v5

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/RouteDirection;->getDirectionIndex()I

    move-result v6

    if-eq v5, v6, :cond_0

    move v3, v4

    goto :goto_0
.end method

.method public getDirection()Lcom/thetransitapp/droid/model/Itinerary$DirectionType;
    .locals 1

    .prologue
    .line 7
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RouteDirection;->direction:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    return-object v0
.end method

.method public getDirectionIndex()I
    .locals 1

    .prologue
    .line 7
    iget v0, p0, Lcom/thetransitapp/droid/model/RouteDirection;->directionIndex:I

    return v0
.end method

.method public hashCode()I
    .locals 5

    .prologue
    .line 7
    const/16 v1, 0x1f

    .local v1, "PRIME":I
    const/4 v2, 0x1

    .local v2, "result":I
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RouteDirection;->getDirection()Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    move-result-object v0

    .local v0, "$direction":Lcom/thetransitapp/droid/model/Itinerary$DirectionType;
    if-nez v0, :cond_0

    const/4 v3, 0x0

    :goto_0
    add-int/lit8 v2, v3, 0x1f

    mul-int/lit8 v3, v2, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RouteDirection;->getDirectionIndex()I

    move-result v4

    add-int v2, v3, v4

    return v2

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_0
.end method

.method public setDirection(Lcom/thetransitapp/droid/model/Itinerary$DirectionType;)V
    .locals 0
    .param p1, "direction"    # Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    .prologue
    .line 7
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RouteDirection;->direction:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    return-void
.end method

.method public setDirectionIndex(I)V
    .locals 0
    .param p1, "directionIndex"    # I

    .prologue
    .line 7
    iput p1, p0, Lcom/thetransitapp/droid/model/RouteDirection;->directionIndex:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RouteDirection(direction="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RouteDirection;->getDirection()Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", directionIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RouteDirection;->getDirectionIndex()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
