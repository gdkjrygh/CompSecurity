.class public Lcom/thetransitapp/droid/widget/OptionItem;
.super Ljava/lang/Object;
.source "OptionItem.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x13bc59cac8c9eda5L


# instance fields
.field private bundle:Lcom/thetransitapp/droid/model/TransitBundle;

.field private currentRegion:Lcom/thetransitapp/droid/model/TransitBundle;

.field private mode:Lcom/thetransitapp/droid/model/TransitMode;


# direct methods
.method public constructor <init>(Lcom/thetransitapp/droid/model/TransitBundle;Z)V
    .locals 0
    .param p1, "bundle"    # Lcom/thetransitapp/droid/model/TransitBundle;
    .param p2, "isCurrent"    # Z

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    if-eqz p2, :cond_0

    .line 24
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/OptionItem;->currentRegion:Lcom/thetransitapp/droid/model/TransitBundle;

    .line 28
    :goto_0
    return-void

    .line 26
    :cond_0
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/OptionItem;->bundle:Lcom/thetransitapp/droid/model/TransitBundle;

    goto :goto_0
.end method

.method public constructor <init>(Lcom/thetransitapp/droid/model/TransitMode;)V
    .locals 0
    .param p1, "mode"    # Lcom/thetransitapp/droid/model/TransitMode;

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/OptionItem;->mode:Lcom/thetransitapp/droid/model/TransitMode;

    .line 20
    return-void
.end method


# virtual methods
.method public canEqual(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "other"    # Ljava/lang/Object;

    .prologue
    .line 10
    instance-of v0, p1, Lcom/thetransitapp/droid/widget/OptionItem;

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 10
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v7, 0x1

    const/4 v8, 0x0

    .line 10
    if-ne p1, p0, :cond_1

    :cond_0
    :goto_0
    return v7

    :cond_1
    instance-of v9, p1, Lcom/thetransitapp/droid/widget/OptionItem;

    if-nez v9, :cond_2

    move v7, v8

    goto :goto_0

    :cond_2
    move-object v0, p1

    check-cast v0, Lcom/thetransitapp/droid/widget/OptionItem;

    .local v0, "other":Lcom/thetransitapp/droid/widget/OptionItem;
    invoke-virtual {v0, p0}, Lcom/thetransitapp/droid/widget/OptionItem;->canEqual(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    move v7, v8

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v6

    .local v6, "this$mode":Lcom/thetransitapp/droid/model/TransitMode;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v3

    .local v3, "other$mode":Lcom/thetransitapp/droid/model/TransitMode;
    if-nez v6, :cond_5

    if-eqz v3, :cond_6

    :cond_4
    move v7, v8

    goto :goto_0

    :cond_5
    invoke-virtual {v6, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    :cond_6
    invoke-virtual {p0}, Lcom/thetransitapp/droid/widget/OptionItem;->getBundle()Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v4

    .local v4, "this$bundle":Lcom/thetransitapp/droid/model/TransitBundle;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/OptionItem;->getBundle()Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v1

    .local v1, "other$bundle":Lcom/thetransitapp/droid/model/TransitBundle;
    if-nez v4, :cond_8

    if-eqz v1, :cond_9

    :cond_7
    move v7, v8

    goto :goto_0

    :cond_8
    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    :cond_9
    invoke-virtual {p0}, Lcom/thetransitapp/droid/widget/OptionItem;->getCurrentRegion()Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v5

    .local v5, "this$currentRegion":Lcom/thetransitapp/droid/model/TransitBundle;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/OptionItem;->getCurrentRegion()Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v2

    .local v2, "other$currentRegion":Lcom/thetransitapp/droid/model/TransitBundle;
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

.method public getBundle()Lcom/thetransitapp/droid/model/TransitBundle;
    .locals 1

    .prologue
    .line 10
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/OptionItem;->bundle:Lcom/thetransitapp/droid/model/TransitBundle;

    return-object v0
.end method

.method public getCurrentRegion()Lcom/thetransitapp/droid/model/TransitBundle;
    .locals 1

    .prologue
    .line 10
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/OptionItem;->currentRegion:Lcom/thetransitapp/droid/model/TransitBundle;

    return-object v0
.end method

.method public getMode()Lcom/thetransitapp/droid/model/TransitMode;
    .locals 1

    .prologue
    .line 10
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/OptionItem;->mode:Lcom/thetransitapp/droid/model/TransitMode;

    return-object v0
.end method

.method public hashCode()I
    .locals 8

    .prologue
    const/4 v6, 0x0

    .line 10
    const/16 v3, 0x1f

    .local v3, "PRIME":I
    const/4 v4, 0x1

    .local v4, "result":I
    invoke-virtual {p0}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v2

    .local v2, "$mode":Lcom/thetransitapp/droid/model/TransitMode;
    if-nez v2, :cond_0

    move v5, v6

    :goto_0
    add-int/lit8 v4, v5, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/widget/OptionItem;->getBundle()Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v0

    .local v0, "$bundle":Lcom/thetransitapp/droid/model/TransitBundle;
    mul-int/lit8 v7, v4, 0x1f

    if-nez v0, :cond_1

    move v5, v6

    :goto_1
    add-int v4, v7, v5

    invoke-virtual {p0}, Lcom/thetransitapp/droid/widget/OptionItem;->getCurrentRegion()Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v1

    .local v1, "$currentRegion":Lcom/thetransitapp/droid/model/TransitBundle;
    mul-int/lit8 v5, v4, 0x1f

    if-nez v1, :cond_2

    :goto_2
    add-int v4, v5, v6

    return v4

    .end local v0    # "$bundle":Lcom/thetransitapp/droid/model/TransitBundle;
    .end local v1    # "$currentRegion":Lcom/thetransitapp/droid/model/TransitBundle;
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v5

    goto :goto_0

    .restart local v0    # "$bundle":Lcom/thetransitapp/droid/model/TransitBundle;
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v5

    goto :goto_1

    .restart local v1    # "$currentRegion":Lcom/thetransitapp/droid/model/TransitBundle;
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v6

    goto :goto_2
.end method

.method public setBundle(Lcom/thetransitapp/droid/model/TransitBundle;)V
    .locals 0
    .param p1, "bundle"    # Lcom/thetransitapp/droid/model/TransitBundle;

    .prologue
    .line 10
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/OptionItem;->bundle:Lcom/thetransitapp/droid/model/TransitBundle;

    return-void
.end method

.method public setCurrentRegion(Lcom/thetransitapp/droid/model/TransitBundle;)V
    .locals 0
    .param p1, "currentRegion"    # Lcom/thetransitapp/droid/model/TransitBundle;

    .prologue
    .line 10
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/OptionItem;->currentRegion:Lcom/thetransitapp/droid/model/TransitBundle;

    return-void
.end method

.method public setMode(Lcom/thetransitapp/droid/model/TransitMode;)V
    .locals 0
    .param p1, "mode"    # Lcom/thetransitapp/droid/model/TransitMode;

    .prologue
    .line 10
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/OptionItem;->mode:Lcom/thetransitapp/droid/model/TransitMode;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "OptionItem(mode="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", bundle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/widget/OptionItem;->getBundle()Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", currentRegion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/widget/OptionItem;->getCurrentRegion()Lcom/thetransitapp/droid/model/TransitBundle;

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
