.class public Lcom/thetransitapp/droid/model/RouteImage;
.super Ljava/lang/Object;
.source "RouteImage.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final baseURL:Ljava/lang/String; = "http://api.thetransitapp.com/route_image?height="

.field private static final serialVersionUID:J = -0x5ff0062f4770478L


# instance fields
.field private id:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private replaceName:Z

.field private routeIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private updatedAt:Ljava/util/Date;

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/model/RouteImage;->routeIds:Ljava/util/List;

    .line 25
    return-void
.end method


# virtual methods
.method public canEqual(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "other"    # Ljava/lang/Object;

    .prologue
    .line 11
    instance-of v0, p1, Lcom/thetransitapp/droid/model/RouteImage;

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 13
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    .line 11
    if-ne p1, p0, :cond_0

    const/4 v11, 0x1

    :goto_0
    return v11

    :cond_0
    instance-of v11, p1, Lcom/thetransitapp/droid/model/RouteImage;

    if-nez v11, :cond_1

    const/4 v11, 0x0

    goto :goto_0

    :cond_1
    move-object v0, p1

    check-cast v0, Lcom/thetransitapp/droid/model/RouteImage;

    .local v0, "other":Lcom/thetransitapp/droid/model/RouteImage;
    invoke-virtual {v0, p0}, Lcom/thetransitapp/droid/model/RouteImage;->canEqual(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_2

    const/4 v11, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RouteImage;->getId()Ljava/lang/String;

    move-result-object v6

    .local v6, "this$id":Ljava/lang/String;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/RouteImage;->getId()Ljava/lang/String;

    move-result-object v1

    .local v1, "other$id":Ljava/lang/String;
    if-nez v6, :cond_4

    if-eqz v1, :cond_5

    :cond_3
    const/4 v11, 0x0

    goto :goto_0

    :cond_4
    invoke-virtual {v6, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3

    :cond_5
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RouteImage;->getName()Ljava/lang/String;

    move-result-object v7

    .local v7, "this$name":Ljava/lang/String;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/RouteImage;->getName()Ljava/lang/String;

    move-result-object v2

    .local v2, "other$name":Ljava/lang/String;
    if-nez v7, :cond_7

    if-eqz v2, :cond_8

    :cond_6
    const/4 v11, 0x0

    goto :goto_0

    :cond_7
    invoke-virtual {v7, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    :cond_8
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RouteImage;->getRouteIds()Ljava/util/List;

    move-result-object v8

    .local v8, "this$routeIds":Ljava/util/List;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/RouteImage;->getRouteIds()Ljava/util/List;

    move-result-object v3

    .local v3, "other$routeIds":Ljava/util/List;
    if-nez v8, :cond_a

    if-eqz v3, :cond_b

    :cond_9
    const/4 v11, 0x0

    goto :goto_0

    :cond_a
    invoke-virtual {v8, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    :cond_b
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RouteImage;->isReplaceName()Z

    move-result v11

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/RouteImage;->isReplaceName()Z

    move-result v12

    if-eq v11, v12, :cond_c

    const/4 v11, 0x0

    goto :goto_0

    :cond_c
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RouteImage;->getUpdatedAt()Ljava/util/Date;

    move-result-object v9

    .local v9, "this$updatedAt":Ljava/util/Date;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/RouteImage;->getUpdatedAt()Ljava/util/Date;

    move-result-object v4

    .local v4, "other$updatedAt":Ljava/util/Date;
    if-nez v9, :cond_e

    if-eqz v4, :cond_f

    :cond_d
    const/4 v11, 0x0

    goto :goto_0

    :cond_e
    invoke-virtual {v9, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_d

    :cond_f
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RouteImage;->getUrl()Ljava/lang/String;

    move-result-object v10

    .local v10, "this$url":Ljava/lang/String;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/RouteImage;->getUrl()Ljava/lang/String;

    move-result-object v5

    .local v5, "other$url":Ljava/lang/String;
    if-nez v10, :cond_11

    if-eqz v5, :cond_12

    :cond_10
    const/4 v11, 0x0

    goto :goto_0

    :cond_11
    invoke-virtual {v10, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_10

    :cond_12
    const/4 v11, 0x1

    goto/16 :goto_0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 11
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RouteImage;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 11
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RouteImage;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getRouteIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 11
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RouteImage;->routeIds:Ljava/util/List;

    return-object v0
.end method

.method public getUpdatedAt()Ljava/util/Date;
    .locals 1

    .prologue
    .line 11
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RouteImage;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 11
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RouteImage;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getUrlWithScreenMetrics(Landroid/util/DisplayMetrics;Z)Ljava/lang/String;
    .locals 4
    .param p1, "metrics"    # Landroid/util/DisplayMetrics;
    .param p2, "small"    # Z

    .prologue
    .line 30
    iget-object v1, p0, Lcom/thetransitapp/droid/model/RouteImage;->name:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 31
    iget-object v1, p0, Lcom/thetransitapp/droid/model/RouteImage;->url:Ljava/lang/String;

    .line 53
    :goto_0
    return-object v1

    .line 34
    :cond_0
    iget v1, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    sparse-switch v1, :sswitch_data_0

    .line 49
    if-eqz p2, :cond_4

    const-string v0, "28"

    .line 53
    .local v0, "size":Ljava/lang/String;
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "http://api.thetransitapp.com/route_image?height="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "&name="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/thetransitapp/droid/model/RouteImage;->name:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "&date="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/thetransitapp/droid/model/RouteImage;->updatedAt:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 36
    .end local v0    # "size":Ljava/lang/String;
    :sswitch_0
    if-eqz p2, :cond_1

    const-string v0, "14"

    .line 37
    .restart local v0    # "size":Ljava/lang/String;
    :goto_2
    goto :goto_1

    .line 36
    .end local v0    # "size":Ljava/lang/String;
    :cond_1
    const-string v0, "42"

    goto :goto_2

    .line 41
    :sswitch_1
    if-eqz p2, :cond_2

    const-string v0, "21"

    .line 42
    .restart local v0    # "size":Ljava/lang/String;
    :goto_3
    goto :goto_1

    .line 41
    .end local v0    # "size":Ljava/lang/String;
    :cond_2
    const-string v0, "63"

    goto :goto_3

    .line 45
    :sswitch_2
    if-eqz p2, :cond_3

    const-string v0, "42"

    .line 46
    .restart local v0    # "size":Ljava/lang/String;
    :goto_4
    goto :goto_1

    .line 45
    .end local v0    # "size":Ljava/lang/String;
    :cond_3
    const-string v0, "126"

    goto :goto_4

    .line 49
    :cond_4
    const-string v0, "84"

    goto :goto_1

    .line 34
    nop

    :sswitch_data_0
    .sparse-switch
        0xa0 -> :sswitch_0
        0xd5 -> :sswitch_1
        0xf0 -> :sswitch_1
        0x1e0 -> :sswitch_2
    .end sparse-switch
.end method

.method public hashCode()I
    .locals 10

    .prologue
    const/4 v8, 0x0

    .line 11
    const/16 v5, 0x1f

    .local v5, "PRIME":I
    const/4 v6, 0x1

    .local v6, "result":I
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RouteImage;->getId()Ljava/lang/String;

    move-result-object v0

    .local v0, "$id":Ljava/lang/String;
    if-nez v0, :cond_0

    move v7, v8

    :goto_0
    add-int/lit8 v6, v7, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RouteImage;->getName()Ljava/lang/String;

    move-result-object v1

    .local v1, "$name":Ljava/lang/String;
    mul-int/lit8 v9, v6, 0x1f

    if-nez v1, :cond_1

    move v7, v8

    :goto_1
    add-int v6, v9, v7

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RouteImage;->getRouteIds()Ljava/util/List;

    move-result-object v2

    .local v2, "$routeIds":Ljava/util/List;
    mul-int/lit8 v9, v6, 0x1f

    if-nez v2, :cond_2

    move v7, v8

    :goto_2
    add-int v6, v9, v7

    mul-int/lit8 v9, v6, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RouteImage;->isReplaceName()Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x4cf

    :goto_3
    add-int v6, v9, v7

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RouteImage;->getUpdatedAt()Ljava/util/Date;

    move-result-object v3

    .local v3, "$updatedAt":Ljava/util/Date;
    mul-int/lit8 v9, v6, 0x1f

    if-nez v3, :cond_4

    move v7, v8

    :goto_4
    add-int v6, v9, v7

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RouteImage;->getUrl()Ljava/lang/String;

    move-result-object v4

    .local v4, "$url":Ljava/lang/String;
    mul-int/lit8 v7, v6, 0x1f

    if-nez v4, :cond_5

    :goto_5
    add-int v6, v7, v8

    return v6

    .end local v1    # "$name":Ljava/lang/String;
    .end local v2    # "$routeIds":Ljava/util/List;
    .end local v3    # "$updatedAt":Ljava/util/Date;
    .end local v4    # "$url":Ljava/lang/String;
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v7

    goto :goto_0

    .restart local v1    # "$name":Ljava/lang/String;
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v7

    goto :goto_1

    .restart local v2    # "$routeIds":Ljava/util/List;
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v7

    goto :goto_2

    :cond_3
    const/16 v7, 0x4d5

    goto :goto_3

    .restart local v3    # "$updatedAt":Ljava/util/Date;
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v7

    goto :goto_4

    .restart local v4    # "$url":Ljava/lang/String;
    :cond_5
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v8

    goto :goto_5
.end method

.method public isReplaceName()Z
    .locals 1

    .prologue
    .line 11
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/RouteImage;->replaceName:Z

    return v0
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 11
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RouteImage;->id:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 11
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RouteImage;->name:Ljava/lang/String;

    return-void
.end method

.method public setReplaceName(Z)V
    .locals 0
    .param p1, "replaceName"    # Z

    .prologue
    .line 11
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/RouteImage;->replaceName:Z

    return-void
.end method

.method public setRouteIds(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 11
    .local p1, "routeIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RouteImage;->routeIds:Ljava/util/List;

    return-void
.end method

.method public setUpdatedAt(Ljava/util/Date;)V
    .locals 0
    .param p1, "updatedAt"    # Ljava/util/Date;

    .prologue
    .line 11
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RouteImage;->updatedAt:Ljava/util/Date;

    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 11
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RouteImage;->url:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RouteImage(id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RouteImage;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RouteImage;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", routeIds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RouteImage;->getRouteIds()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", replaceName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RouteImage;->isReplaceName()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", updatedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RouteImage;->getUpdatedAt()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RouteImage;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
