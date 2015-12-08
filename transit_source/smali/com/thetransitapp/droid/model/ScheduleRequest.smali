.class public Lcom/thetransitapp/droid/model/ScheduleRequest;
.super Ljava/lang/Object;
.source "ScheduleRequest.java"


# instance fields
.field private route:Lcom/thetransitapp/droid/model/Route;

.field private serviceDay:Lcom/thetransitapp/droid/model/ServiceDay;

.field private stop:Lcom/thetransitapp/droid/model/Stop;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public canEqual(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "other"    # Ljava/lang/Object;

    .prologue
    .line 5
    instance-of v0, p1, Lcom/thetransitapp/droid/model/ScheduleRequest;

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 10
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v7, 0x1

    const/4 v8, 0x0

    .line 5
    if-ne p1, p0, :cond_1

    :cond_0
    :goto_0
    return v7

    :cond_1
    instance-of v9, p1, Lcom/thetransitapp/droid/model/ScheduleRequest;

    if-nez v9, :cond_2

    move v7, v8

    goto :goto_0

    :cond_2
    move-object v0, p1

    check-cast v0, Lcom/thetransitapp/droid/model/ScheduleRequest;

    .local v0, "other":Lcom/thetransitapp/droid/model/ScheduleRequest;
    invoke-virtual {v0, p0}, Lcom/thetransitapp/droid/model/ScheduleRequest;->canEqual(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    move v7, v8

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleRequest;->getRoute()Lcom/thetransitapp/droid/model/Route;

    move-result-object v4

    .local v4, "this$route":Lcom/thetransitapp/droid/model/Route;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/ScheduleRequest;->getRoute()Lcom/thetransitapp/droid/model/Route;

    move-result-object v1

    .local v1, "other$route":Lcom/thetransitapp/droid/model/Route;
    if-nez v4, :cond_5

    if-eqz v1, :cond_6

    :cond_4
    move v7, v8

    goto :goto_0

    :cond_5
    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    :cond_6
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleRequest;->getStop()Lcom/thetransitapp/droid/model/Stop;

    move-result-object v6

    .local v6, "this$stop":Lcom/thetransitapp/droid/model/Stop;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/ScheduleRequest;->getStop()Lcom/thetransitapp/droid/model/Stop;

    move-result-object v3

    .local v3, "other$stop":Lcom/thetransitapp/droid/model/Stop;
    if-nez v6, :cond_8

    if-eqz v3, :cond_9

    :cond_7
    move v7, v8

    goto :goto_0

    :cond_8
    invoke-virtual {v6, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    :cond_9
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleRequest;->getServiceDay()Lcom/thetransitapp/droid/model/ServiceDay;

    move-result-object v5

    .local v5, "this$serviceDay":Lcom/thetransitapp/droid/model/ServiceDay;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/ScheduleRequest;->getServiceDay()Lcom/thetransitapp/droid/model/ServiceDay;

    move-result-object v2

    .local v2, "other$serviceDay":Lcom/thetransitapp/droid/model/ServiceDay;
    if-nez v5, :cond_a

    if-eqz v2, :cond_0

    :goto_1
    move v7, v8

    goto :goto_0

    :cond_a
    invoke-virtual {v5, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_0

    goto :goto_1
.end method

.method public getRoute()Lcom/thetransitapp/droid/model/Route;
    .locals 1

    .prologue
    .line 5
    iget-object v0, p0, Lcom/thetransitapp/droid/model/ScheduleRequest;->route:Lcom/thetransitapp/droid/model/Route;

    return-object v0
.end method

.method public getServiceDay()Lcom/thetransitapp/droid/model/ServiceDay;
    .locals 1

    .prologue
    .line 5
    iget-object v0, p0, Lcom/thetransitapp/droid/model/ScheduleRequest;->serviceDay:Lcom/thetransitapp/droid/model/ServiceDay;

    return-object v0
.end method

.method public getStop()Lcom/thetransitapp/droid/model/Stop;
    .locals 1

    .prologue
    .line 5
    iget-object v0, p0, Lcom/thetransitapp/droid/model/ScheduleRequest;->stop:Lcom/thetransitapp/droid/model/Stop;

    return-object v0
.end method

.method public hashCode()I
    .locals 8

    .prologue
    const/4 v6, 0x0

    .line 5
    const/16 v3, 0x1f

    .local v3, "PRIME":I
    const/4 v4, 0x1

    .local v4, "result":I
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleRequest;->getRoute()Lcom/thetransitapp/droid/model/Route;

    move-result-object v0

    .local v0, "$route":Lcom/thetransitapp/droid/model/Route;
    if-nez v0, :cond_0

    move v5, v6

    :goto_0
    add-int/lit8 v4, v5, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleRequest;->getStop()Lcom/thetransitapp/droid/model/Stop;

    move-result-object v2

    .local v2, "$stop":Lcom/thetransitapp/droid/model/Stop;
    mul-int/lit8 v7, v4, 0x1f

    if-nez v2, :cond_1

    move v5, v6

    :goto_1
    add-int v4, v7, v5

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleRequest;->getServiceDay()Lcom/thetransitapp/droid/model/ServiceDay;

    move-result-object v1

    .local v1, "$serviceDay":Lcom/thetransitapp/droid/model/ServiceDay;
    mul-int/lit8 v5, v4, 0x1f

    if-nez v1, :cond_2

    :goto_2
    add-int v4, v5, v6

    return v4

    .end local v1    # "$serviceDay":Lcom/thetransitapp/droid/model/ServiceDay;
    .end local v2    # "$stop":Lcom/thetransitapp/droid/model/Stop;
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v5

    goto :goto_0

    .restart local v2    # "$stop":Lcom/thetransitapp/droid/model/Stop;
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v5

    goto :goto_1

    .restart local v1    # "$serviceDay":Lcom/thetransitapp/droid/model/ServiceDay;
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v6

    goto :goto_2
.end method

.method public setRoute(Lcom/thetransitapp/droid/model/Route;)V
    .locals 0
    .param p1, "route"    # Lcom/thetransitapp/droid/model/Route;

    .prologue
    .line 5
    iput-object p1, p0, Lcom/thetransitapp/droid/model/ScheduleRequest;->route:Lcom/thetransitapp/droid/model/Route;

    return-void
.end method

.method public setServiceDay(Lcom/thetransitapp/droid/model/ServiceDay;)V
    .locals 0
    .param p1, "serviceDay"    # Lcom/thetransitapp/droid/model/ServiceDay;

    .prologue
    .line 5
    iput-object p1, p0, Lcom/thetransitapp/droid/model/ScheduleRequest;->serviceDay:Lcom/thetransitapp/droid/model/ServiceDay;

    return-void
.end method

.method public setStop(Lcom/thetransitapp/droid/model/Stop;)V
    .locals 0
    .param p1, "stop"    # Lcom/thetransitapp/droid/model/Stop;

    .prologue
    .line 5
    iput-object p1, p0, Lcom/thetransitapp/droid/model/ScheduleRequest;->stop:Lcom/thetransitapp/droid/model/Stop;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ScheduleRequest(route="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleRequest;->getRoute()Lcom/thetransitapp/droid/model/Route;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", stop="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleRequest;->getStop()Lcom/thetransitapp/droid/model/Stop;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", serviceDay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleRequest;->getServiceDay()Lcom/thetransitapp/droid/model/ServiceDay;

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
