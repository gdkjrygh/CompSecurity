.class public Lcom/thetransitapp/droid/model/Stop;
.super Ljava/lang/Object;
.source "Stop.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x6eec254bff7d5d1L


# instance fields
.field private id:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private placemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

.field private realTimeId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v1, 0x0

    .line 37
    if-eqz p1, :cond_0

    instance-of v2, p1, Lcom/thetransitapp/droid/model/Stop;

    if-nez v2, :cond_1

    .line 42
    :cond_0
    :goto_0
    return v1

    :cond_1
    move-object v0, p1

    .line 41
    check-cast v0, Lcom/thetransitapp/droid/model/Stop;

    .line 42
    .local v0, "stop":Lcom/thetransitapp/droid/model/Stop;
    iget-object v2, p0, Lcom/thetransitapp/droid/model/Stop;->id:Ljava/lang/String;

    iget-object v3, v0, Lcom/thetransitapp/droid/model/Stop;->id:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/thetransitapp/droid/model/Stop;->name:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/Stop;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0
.end method

.method public getDistance(Lcom/thetransitapp/droid/model/SimplePlacemark;)F
    .locals 1
    .param p1, "position"    # Lcom/thetransitapp/droid/model/SimplePlacemark;

    .prologue
    .line 23
    if-nez p1, :cond_0

    .line 24
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 27
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Stop;->placemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

    invoke-virtual {v0, p1}, Lcom/thetransitapp/droid/model/SimplePlacemark;->distanceTo(Lcom/thetransitapp/droid/model/SimplePlacemark;)F

    move-result v0

    goto :goto_0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 8
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Stop;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 8
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Stop;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;
    .locals 1

    .prologue
    .line 8
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Stop;->placemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

    return-object v0
.end method

.method public getRealTimeId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 8
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Stop;->realTimeId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Stop;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 9
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Stop;->id:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 9
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Stop;->name:Ljava/lang/String;

    return-void
.end method

.method public setPlacemark(Lcom/thetransitapp/droid/model/SimplePlacemark;)V
    .locals 0
    .param p1, "placemark"    # Lcom/thetransitapp/droid/model/SimplePlacemark;

    .prologue
    .line 9
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Stop;->placemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

    return-void
.end method

.method public setRealTimeId(Ljava/lang/String;)V
    .locals 0
    .param p1, "realTimeId"    # Ljava/lang/String;

    .prologue
    .line 9
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Stop;->realTimeId:Ljava/lang/String;

    return-void
.end method
