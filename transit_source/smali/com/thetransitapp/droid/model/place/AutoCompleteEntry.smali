.class public Lcom/thetransitapp/droid/model/place/AutoCompleteEntry;
.super Ljava/lang/Object;
.source "AutoCompleteEntry.java"


# instance fields
.field private description:Ljava/lang/String;

.field private id:Ljava/lang/String;

.field private reference:Ljava/lang/String;


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
    instance-of v0, p1, Lcom/thetransitapp/droid/model/place/AutoCompleteEntry;

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
    instance-of v9, p1, Lcom/thetransitapp/droid/model/place/AutoCompleteEntry;

    if-nez v9, :cond_2

    move v7, v8

    goto :goto_0

    :cond_2
    move-object v0, p1

    check-cast v0, Lcom/thetransitapp/droid/model/place/AutoCompleteEntry;

    .local v0, "other":Lcom/thetransitapp/droid/model/place/AutoCompleteEntry;
    invoke-virtual {v0, p0}, Lcom/thetransitapp/droid/model/place/AutoCompleteEntry;->canEqual(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    move v7, v8

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/place/AutoCompleteEntry;->getId()Ljava/lang/String;

    move-result-object v5

    .local v5, "this$id":Ljava/lang/String;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/place/AutoCompleteEntry;->getId()Ljava/lang/String;

    move-result-object v2

    .local v2, "other$id":Ljava/lang/String;
    if-nez v5, :cond_5

    if-eqz v2, :cond_6

    :cond_4
    move v7, v8

    goto :goto_0

    :cond_5
    invoke-virtual {v5, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    :cond_6
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/place/AutoCompleteEntry;->getDescription()Ljava/lang/String;

    move-result-object v4

    .local v4, "this$description":Ljava/lang/String;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/place/AutoCompleteEntry;->getDescription()Ljava/lang/String;

    move-result-object v1

    .local v1, "other$description":Ljava/lang/String;
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
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/place/AutoCompleteEntry;->getReference()Ljava/lang/String;

    move-result-object v6

    .local v6, "this$reference":Ljava/lang/String;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/place/AutoCompleteEntry;->getReference()Ljava/lang/String;

    move-result-object v3

    .local v3, "other$reference":Ljava/lang/String;
    if-nez v6, :cond_a

    if-eqz v3, :cond_0

    :goto_1
    move v7, v8

    goto :goto_0

    :cond_a
    invoke-virtual {v6, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_0

    goto :goto_1
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .prologue
    .line 5
    iget-object v0, p0, Lcom/thetransitapp/droid/model/place/AutoCompleteEntry;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 5
    iget-object v0, p0, Lcom/thetransitapp/droid/model/place/AutoCompleteEntry;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getReference()Ljava/lang/String;
    .locals 1

    .prologue
    .line 5
    iget-object v0, p0, Lcom/thetransitapp/droid/model/place/AutoCompleteEntry;->reference:Ljava/lang/String;

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
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/place/AutoCompleteEntry;->getId()Ljava/lang/String;

    move-result-object v1

    .local v1, "$id":Ljava/lang/String;
    if-nez v1, :cond_0

    move v5, v6

    :goto_0
    add-int/lit8 v4, v5, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/place/AutoCompleteEntry;->getDescription()Ljava/lang/String;

    move-result-object v0

    .local v0, "$description":Ljava/lang/String;
    mul-int/lit8 v7, v4, 0x1f

    if-nez v0, :cond_1

    move v5, v6

    :goto_1
    add-int v4, v7, v5

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/place/AutoCompleteEntry;->getReference()Ljava/lang/String;

    move-result-object v2

    .local v2, "$reference":Ljava/lang/String;
    mul-int/lit8 v5, v4, 0x1f

    if-nez v2, :cond_2

    :goto_2
    add-int v4, v5, v6

    return v4

    .end local v0    # "$description":Ljava/lang/String;
    .end local v2    # "$reference":Ljava/lang/String;
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v5

    goto :goto_0

    .restart local v0    # "$description":Ljava/lang/String;
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v5

    goto :goto_1

    .restart local v2    # "$reference":Ljava/lang/String;
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v6

    goto :goto_2
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0
    .param p1, "description"    # Ljava/lang/String;

    .prologue
    .line 5
    iput-object p1, p0, Lcom/thetransitapp/droid/model/place/AutoCompleteEntry;->description:Ljava/lang/String;

    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 5
    iput-object p1, p0, Lcom/thetransitapp/droid/model/place/AutoCompleteEntry;->id:Ljava/lang/String;

    return-void
.end method

.method public setReference(Ljava/lang/String;)V
    .locals 0
    .param p1, "reference"    # Ljava/lang/String;

    .prologue
    .line 5
    iput-object p1, p0, Lcom/thetransitapp/droid/model/place/AutoCompleteEntry;->reference:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AutoCompleteEntry(id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/place/AutoCompleteEntry;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/place/AutoCompleteEntry;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", reference="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/place/AutoCompleteEntry;->getReference()Ljava/lang/String;

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
