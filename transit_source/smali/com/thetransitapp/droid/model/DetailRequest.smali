.class public Lcom/thetransitapp/droid/model/DetailRequest;
.super Ljava/lang/Object;
.source "DetailRequest.java"


# instance fields
.field private error:Ljava/lang/Exception;

.field private itineraries:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Itinerary;",
            ">;"
        }
    .end annotation
.end field

.field private scheduleItem:Lcom/thetransitapp/droid/model/ScheduleItem;

.field private warning:Ljava/lang/Exception;


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
    instance-of v0, p1, Lcom/thetransitapp/droid/model/DetailRequest;

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 12
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v9, 0x1

    const/4 v10, 0x0

    .line 7
    if-ne p1, p0, :cond_1

    :cond_0
    :goto_0
    return v9

    :cond_1
    instance-of v11, p1, Lcom/thetransitapp/droid/model/DetailRequest;

    if-nez v11, :cond_2

    move v9, v10

    goto :goto_0

    :cond_2
    move-object v0, p1

    check-cast v0, Lcom/thetransitapp/droid/model/DetailRequest;

    .local v0, "other":Lcom/thetransitapp/droid/model/DetailRequest;
    invoke-virtual {v0, p0}, Lcom/thetransitapp/droid/model/DetailRequest;->canEqual(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_3

    move v9, v10

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/DetailRequest;->getItineraries()Ljava/util/List;

    move-result-object v6

    .local v6, "this$itineraries":Ljava/util/List;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/DetailRequest;->getItineraries()Ljava/util/List;

    move-result-object v2

    .local v2, "other$itineraries":Ljava/util/List;
    if-nez v6, :cond_5

    if-eqz v2, :cond_6

    :cond_4
    move v9, v10

    goto :goto_0

    :cond_5
    invoke-virtual {v6, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    :cond_6
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/DetailRequest;->getScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v7

    .local v7, "this$scheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/DetailRequest;->getScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v3

    .local v3, "other$scheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    if-nez v7, :cond_8

    if-eqz v3, :cond_9

    :cond_7
    move v9, v10

    goto :goto_0

    :cond_8
    invoke-virtual {v7, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    :cond_9
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/DetailRequest;->getError()Ljava/lang/Exception;

    move-result-object v5

    .local v5, "this$error":Ljava/lang/Exception;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/DetailRequest;->getError()Ljava/lang/Exception;

    move-result-object v1

    .local v1, "other$error":Ljava/lang/Exception;
    if-nez v5, :cond_b

    if-eqz v1, :cond_c

    :cond_a
    move v9, v10

    goto :goto_0

    :cond_b
    invoke-virtual {v5, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    :cond_c
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/DetailRequest;->getWarning()Ljava/lang/Exception;

    move-result-object v8

    .local v8, "this$warning":Ljava/lang/Exception;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/DetailRequest;->getWarning()Ljava/lang/Exception;

    move-result-object v4

    .local v4, "other$warning":Ljava/lang/Exception;
    if-nez v8, :cond_d

    if-eqz v4, :cond_0

    :goto_1
    move v9, v10

    goto :goto_0

    :cond_d
    invoke-virtual {v8, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_0

    goto :goto_1
.end method

.method public getError()Ljava/lang/Exception;
    .locals 1

    .prologue
    .line 7
    iget-object v0, p0, Lcom/thetransitapp/droid/model/DetailRequest;->error:Ljava/lang/Exception;

    return-object v0
.end method

.method public getItineraries()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Itinerary;",
            ">;"
        }
    .end annotation

    .prologue
    .line 7
    iget-object v0, p0, Lcom/thetransitapp/droid/model/DetailRequest;->itineraries:Ljava/util/List;

    return-object v0
.end method

.method public getScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;
    .locals 1

    .prologue
    .line 7
    iget-object v0, p0, Lcom/thetransitapp/droid/model/DetailRequest;->scheduleItem:Lcom/thetransitapp/droid/model/ScheduleItem;

    return-object v0
.end method

.method public getWarning()Ljava/lang/Exception;
    .locals 1

    .prologue
    .line 7
    iget-object v0, p0, Lcom/thetransitapp/droid/model/DetailRequest;->warning:Ljava/lang/Exception;

    return-object v0
.end method

.method public hashCode()I
    .locals 9

    .prologue
    const/4 v7, 0x0

    .line 7
    const/16 v4, 0x1f

    .local v4, "PRIME":I
    const/4 v5, 0x1

    .local v5, "result":I
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/DetailRequest;->getItineraries()Ljava/util/List;

    move-result-object v1

    .local v1, "$itineraries":Ljava/util/List;
    if-nez v1, :cond_0

    move v6, v7

    :goto_0
    add-int/lit8 v5, v6, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/DetailRequest;->getScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v2

    .local v2, "$scheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    mul-int/lit8 v8, v5, 0x1f

    if-nez v2, :cond_1

    move v6, v7

    :goto_1
    add-int v5, v8, v6

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/DetailRequest;->getError()Ljava/lang/Exception;

    move-result-object v0

    .local v0, "$error":Ljava/lang/Exception;
    mul-int/lit8 v8, v5, 0x1f

    if-nez v0, :cond_2

    move v6, v7

    :goto_2
    add-int v5, v8, v6

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/DetailRequest;->getWarning()Ljava/lang/Exception;

    move-result-object v3

    .local v3, "$warning":Ljava/lang/Exception;
    mul-int/lit8 v6, v5, 0x1f

    if-nez v3, :cond_3

    :goto_3
    add-int v5, v6, v7

    return v5

    .end local v0    # "$error":Ljava/lang/Exception;
    .end local v2    # "$scheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    .end local v3    # "$warning":Ljava/lang/Exception;
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v6

    goto :goto_0

    .restart local v2    # "$scheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v6

    goto :goto_1

    .restart local v0    # "$error":Ljava/lang/Exception;
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v6

    goto :goto_2

    .restart local v3    # "$warning":Ljava/lang/Exception;
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v7

    goto :goto_3
.end method

.method public setError(Ljava/lang/Exception;)V
    .locals 0
    .param p1, "error"    # Ljava/lang/Exception;

    .prologue
    .line 7
    iput-object p1, p0, Lcom/thetransitapp/droid/model/DetailRequest;->error:Ljava/lang/Exception;

    return-void
.end method

.method public setItineraries(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Itinerary;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 7
    .local p1, "itineraries":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Itinerary;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/DetailRequest;->itineraries:Ljava/util/List;

    return-void
.end method

.method public setScheduleItem(Lcom/thetransitapp/droid/model/ScheduleItem;)V
    .locals 0
    .param p1, "scheduleItem"    # Lcom/thetransitapp/droid/model/ScheduleItem;

    .prologue
    .line 7
    iput-object p1, p0, Lcom/thetransitapp/droid/model/DetailRequest;->scheduleItem:Lcom/thetransitapp/droid/model/ScheduleItem;

    return-void
.end method

.method public setWarning(Ljava/lang/Exception;)V
    .locals 0
    .param p1, "warning"    # Ljava/lang/Exception;

    .prologue
    .line 7
    iput-object p1, p0, Lcom/thetransitapp/droid/model/DetailRequest;->warning:Ljava/lang/Exception;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DetailRequest(itineraries="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/DetailRequest;->getItineraries()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", scheduleItem="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/DetailRequest;->getScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", error="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/DetailRequest;->getError()Ljava/lang/Exception;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", warning="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/DetailRequest;->getWarning()Ljava/lang/Exception;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
