.class public Lcom/thetransitapp/droid/model/TransitMode;
.super Ljava/lang/Object;
.source "TransitMode.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x237fea0e86943bfcL


# instance fields
.field private feedIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private id:Ljava/lang/String;

.field private name:Ljava/lang/String;

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

.field private routeTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Route$RouteType;",
            ">;"
        }
    .end annotation
.end field

.field private selected:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/thetransitapp/droid/model/TransitMode;->selected:Z

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/model/TransitMode;->feedIds:Ljava/util/List;

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/model/TransitMode;->routeTypes:Ljava/util/List;

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/model/TransitMode;->routeIds:Ljava/util/List;

    .line 26
    return-void
.end method


# virtual methods
.method public canEqual(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "other"    # Ljava/lang/Object;

    .prologue
    .line 11
    instance-of v0, p1, Lcom/thetransitapp/droid/model/TransitMode;

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
    instance-of v11, p1, Lcom/thetransitapp/droid/model/TransitMode;

    if-nez v11, :cond_1

    const/4 v11, 0x0

    goto :goto_0

    :cond_1
    move-object v0, p1

    check-cast v0, Lcom/thetransitapp/droid/model/TransitMode;

    .local v0, "other":Lcom/thetransitapp/droid/model/TransitMode;
    invoke-virtual {v0, p0}, Lcom/thetransitapp/droid/model/TransitMode;->canEqual(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_2

    const/4 v11, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/TransitMode;->getId()Ljava/lang/String;

    move-result-object v7

    .local v7, "this$id":Ljava/lang/String;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/TransitMode;->getId()Ljava/lang/String;

    move-result-object v2

    .local v2, "other$id":Ljava/lang/String;
    if-nez v7, :cond_4

    if-eqz v2, :cond_5

    :cond_3
    const/4 v11, 0x0

    goto :goto_0

    :cond_4
    invoke-virtual {v7, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3

    :cond_5
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/TransitMode;->getName()Ljava/lang/String;

    move-result-object v8

    .local v8, "this$name":Ljava/lang/String;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/TransitMode;->getName()Ljava/lang/String;

    move-result-object v3

    .local v3, "other$name":Ljava/lang/String;
    if-nez v8, :cond_7

    if-eqz v3, :cond_8

    :cond_6
    const/4 v11, 0x0

    goto :goto_0

    :cond_7
    invoke-virtual {v8, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    :cond_8
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/TransitMode;->getFeedIds()Ljava/util/List;

    move-result-object v6

    .local v6, "this$feedIds":Ljava/util/List;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/TransitMode;->getFeedIds()Ljava/util/List;

    move-result-object v1

    .local v1, "other$feedIds":Ljava/util/List;
    if-nez v6, :cond_a

    if-eqz v1, :cond_b

    :cond_9
    const/4 v11, 0x0

    goto :goto_0

    :cond_a
    invoke-virtual {v6, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    :cond_b
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/TransitMode;->getRouteTypes()Ljava/util/List;

    move-result-object v10

    .local v10, "this$routeTypes":Ljava/util/List;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/TransitMode;->getRouteTypes()Ljava/util/List;

    move-result-object v5

    .local v5, "other$routeTypes":Ljava/util/List;
    if-nez v10, :cond_d

    if-eqz v5, :cond_e

    :cond_c
    const/4 v11, 0x0

    goto :goto_0

    :cond_d
    invoke-virtual {v10, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    :cond_e
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/TransitMode;->getRouteIds()Ljava/util/List;

    move-result-object v9

    .local v9, "this$routeIds":Ljava/util/List;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/TransitMode;->getRouteIds()Ljava/util/List;

    move-result-object v4

    .local v4, "other$routeIds":Ljava/util/List;
    if-nez v9, :cond_10

    if-eqz v4, :cond_11

    :cond_f
    const/4 v11, 0x0

    goto :goto_0

    :cond_10
    invoke-virtual {v9, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_f

    :cond_11
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/TransitMode;->isSelected()Z

    move-result v11

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/TransitMode;->isSelected()Z

    move-result v12

    if-eq v11, v12, :cond_12

    const/4 v11, 0x0

    goto/16 :goto_0

    :cond_12
    const/4 v11, 0x1

    goto/16 :goto_0
.end method

.method public getFeedIds()Ljava/util/List;
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
    iget-object v0, p0, Lcom/thetransitapp/droid/model/TransitMode;->feedIds:Ljava/util/List;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 11
    iget-object v0, p0, Lcom/thetransitapp/droid/model/TransitMode;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 11
    iget-object v0, p0, Lcom/thetransitapp/droid/model/TransitMode;->name:Ljava/lang/String;

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
    iget-object v0, p0, Lcom/thetransitapp/droid/model/TransitMode;->routeIds:Ljava/util/List;

    return-object v0
.end method

.method public getRouteTypes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Route$RouteType;",
            ">;"
        }
    .end annotation

    .prologue
    .line 11
    iget-object v0, p0, Lcom/thetransitapp/droid/model/TransitMode;->routeTypes:Ljava/util/List;

    return-object v0
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
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/TransitMode;->getId()Ljava/lang/String;

    move-result-object v1

    .local v1, "$id":Ljava/lang/String;
    if-nez v1, :cond_0

    move v7, v8

    :goto_0
    add-int/lit8 v6, v7, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/TransitMode;->getName()Ljava/lang/String;

    move-result-object v2

    .local v2, "$name":Ljava/lang/String;
    mul-int/lit8 v9, v6, 0x1f

    if-nez v2, :cond_1

    move v7, v8

    :goto_1
    add-int v6, v9, v7

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/TransitMode;->getFeedIds()Ljava/util/List;

    move-result-object v0

    .local v0, "$feedIds":Ljava/util/List;
    mul-int/lit8 v9, v6, 0x1f

    if-nez v0, :cond_2

    move v7, v8

    :goto_2
    add-int v6, v9, v7

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/TransitMode;->getRouteTypes()Ljava/util/List;

    move-result-object v4

    .local v4, "$routeTypes":Ljava/util/List;
    mul-int/lit8 v9, v6, 0x1f

    if-nez v4, :cond_3

    move v7, v8

    :goto_3
    add-int v6, v9, v7

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/TransitMode;->getRouteIds()Ljava/util/List;

    move-result-object v3

    .local v3, "$routeIds":Ljava/util/List;
    mul-int/lit8 v7, v6, 0x1f

    if-nez v3, :cond_4

    :goto_4
    add-int v6, v7, v8

    mul-int/lit8 v8, v6, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/TransitMode;->isSelected()Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x4cf

    :goto_5
    add-int v6, v8, v7

    return v6

    .end local v0    # "$feedIds":Ljava/util/List;
    .end local v2    # "$name":Ljava/lang/String;
    .end local v3    # "$routeIds":Ljava/util/List;
    .end local v4    # "$routeTypes":Ljava/util/List;
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v7

    goto :goto_0

    .restart local v2    # "$name":Ljava/lang/String;
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v7

    goto :goto_1

    .restart local v0    # "$feedIds":Ljava/util/List;
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v7

    goto :goto_2

    .restart local v4    # "$routeTypes":Ljava/util/List;
    :cond_3
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v7

    goto :goto_3

    .restart local v3    # "$routeIds":Ljava/util/List;
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v8

    goto :goto_4

    :cond_5
    const/16 v7, 0x4d5

    goto :goto_5
.end method

.method public isSelected()Z
    .locals 1

    .prologue
    .line 11
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/TransitMode;->selected:Z

    return v0
.end method

.method public setFeedIds(Ljava/util/List;)V
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
    .local p1, "feedIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/TransitMode;->feedIds:Ljava/util/List;

    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 11
    iput-object p1, p0, Lcom/thetransitapp/droid/model/TransitMode;->id:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 11
    iput-object p1, p0, Lcom/thetransitapp/droid/model/TransitMode;->name:Ljava/lang/String;

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
    iput-object p1, p0, Lcom/thetransitapp/droid/model/TransitMode;->routeIds:Ljava/util/List;

    return-void
.end method

.method public setRouteTypes(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Route$RouteType;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 11
    .local p1, "routeTypes":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Route$RouteType;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/TransitMode;->routeTypes:Ljava/util/List;

    return-void
.end method

.method public setSelected(Z)V
    .locals 0
    .param p1, "selected"    # Z

    .prologue
    .line 11
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/TransitMode;->selected:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TransitMode(id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/TransitMode;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/TransitMode;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", feedIds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/TransitMode;->getFeedIds()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", routeTypes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/TransitMode;->getRouteTypes()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", routeIds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/TransitMode;->getRouteIds()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", selected="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/TransitMode;->isSelected()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
