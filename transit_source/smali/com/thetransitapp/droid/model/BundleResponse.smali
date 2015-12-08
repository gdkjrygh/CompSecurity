.class public Lcom/thetransitapp/droid/model/BundleResponse;
.super Ljava/lang/Object;
.source "BundleResponse.java"


# instance fields
.field private bundles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/TransitBundle;",
            ">;"
        }
    .end annotation
.end field

.field private shareMessage:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/model/BundleResponse;->bundles:Ljava/util/List;

    .line 17
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/model/BundleResponse;->shareMessage:Ljava/util/Map;

    .line 18
    return-void
.end method


# virtual methods
.method public canEqual(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "other"    # Ljava/lang/Object;

    .prologue
    .line 10
    instance-of v0, p1, Lcom/thetransitapp/droid/model/BundleResponse;

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 8
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v5, 0x1

    const/4 v6, 0x0

    .line 10
    if-ne p1, p0, :cond_1

    :cond_0
    :goto_0
    return v5

    :cond_1
    instance-of v7, p1, Lcom/thetransitapp/droid/model/BundleResponse;

    if-nez v7, :cond_2

    move v5, v6

    goto :goto_0

    :cond_2
    move-object v0, p1

    check-cast v0, Lcom/thetransitapp/droid/model/BundleResponse;

    .local v0, "other":Lcom/thetransitapp/droid/model/BundleResponse;
    invoke-virtual {v0, p0}, Lcom/thetransitapp/droid/model/BundleResponse;->canEqual(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    move v5, v6

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/BundleResponse;->getBundles()Ljava/util/List;

    move-result-object v3

    .local v3, "this$bundles":Ljava/util/List;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/BundleResponse;->getBundles()Ljava/util/List;

    move-result-object v1

    .local v1, "other$bundles":Ljava/util/List;
    if-nez v3, :cond_5

    if-eqz v1, :cond_6

    :cond_4
    move v5, v6

    goto :goto_0

    :cond_5
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    :cond_6
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/BundleResponse;->getShareMessage()Ljava/util/Map;

    move-result-object v4

    .local v4, "this$shareMessage":Ljava/util/Map;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/BundleResponse;->getShareMessage()Ljava/util/Map;

    move-result-object v2

    .local v2, "other$shareMessage":Ljava/util/Map;
    if-nez v4, :cond_7

    if-eqz v2, :cond_0

    :goto_1
    move v5, v6

    goto :goto_0

    :cond_7
    invoke-virtual {v4, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    goto :goto_1
.end method

.method public getBundles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/TransitBundle;",
            ">;"
        }
    .end annotation

    .prologue
    .line 10
    iget-object v0, p0, Lcom/thetransitapp/droid/model/BundleResponse;->bundles:Ljava/util/List;

    return-object v0
.end method

.method public getShareMessage()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 10
    iget-object v0, p0, Lcom/thetransitapp/droid/model/BundleResponse;->shareMessage:Ljava/util/Map;

    return-object v0
.end method

.method public hashCode()I
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 10
    const/16 v2, 0x1f

    .local v2, "PRIME":I
    const/4 v3, 0x1

    .local v3, "result":I
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/BundleResponse;->getBundles()Ljava/util/List;

    move-result-object v0

    .local v0, "$bundles":Ljava/util/List;
    if-nez v0, :cond_0

    move v4, v5

    :goto_0
    add-int/lit8 v3, v4, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/BundleResponse;->getShareMessage()Ljava/util/Map;

    move-result-object v1

    .local v1, "$shareMessage":Ljava/util/Map;
    mul-int/lit8 v4, v3, 0x1f

    if-nez v1, :cond_1

    :goto_1
    add-int v3, v4, v5

    return v3

    .end local v1    # "$shareMessage":Ljava/util/Map;
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto :goto_0

    .restart local v1    # "$shareMessage":Ljava/util/Map;
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v5

    goto :goto_1
.end method

.method public setBundles(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/TransitBundle;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 10
    .local p1, "bundles":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/TransitBundle;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/BundleResponse;->bundles:Ljava/util/List;

    return-void
.end method

.method public setShareMessage(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 10
    .local p1, "shareMessage":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/BundleResponse;->shareMessage:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BundleResponse(bundles="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/BundleResponse;->getBundles()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shareMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/BundleResponse;->getShareMessage()Ljava/util/Map;

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
