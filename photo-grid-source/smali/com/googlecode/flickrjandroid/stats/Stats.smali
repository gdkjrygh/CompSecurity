.class public Lcom/googlecode/flickrjandroid/stats/Stats;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private comments:I

.field private favorites:I

.field private views:I


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

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 84
    if-ne p0, p1, :cond_1

    .line 97
    :cond_0
    :goto_0
    return v0

    .line 86
    :cond_1
    if-nez p1, :cond_2

    move v0, v1

    .line 87
    goto :goto_0

    .line 88
    :cond_2
    instance-of v2, p1, Lcom/googlecode/flickrjandroid/stats/Stats;

    if-nez v2, :cond_3

    move v0, v1

    .line 89
    goto :goto_0

    .line 90
    :cond_3
    check-cast p1, Lcom/googlecode/flickrjandroid/stats/Stats;

    .line 91
    iget v2, p0, Lcom/googlecode/flickrjandroid/stats/Stats;->comments:I

    iget v3, p1, Lcom/googlecode/flickrjandroid/stats/Stats;->comments:I

    if-eq v2, v3, :cond_4

    move v0, v1

    .line 92
    goto :goto_0

    .line 93
    :cond_4
    iget v2, p0, Lcom/googlecode/flickrjandroid/stats/Stats;->favorites:I

    iget v3, p1, Lcom/googlecode/flickrjandroid/stats/Stats;->favorites:I

    if-eq v2, v3, :cond_5

    move v0, v1

    .line 94
    goto :goto_0

    .line 95
    :cond_5
    iget v2, p0, Lcom/googlecode/flickrjandroid/stats/Stats;->views:I

    iget v3, p1, Lcom/googlecode/flickrjandroid/stats/Stats;->views:I

    if-eq v2, v3, :cond_0

    move v0, v1

    .line 96
    goto :goto_0
.end method

.method public getComments()I
    .locals 1

    .prologue
    .line 26
    iget v0, p0, Lcom/googlecode/flickrjandroid/stats/Stats;->comments:I

    return v0
.end method

.method public getFavorites()I
    .locals 1

    .prologue
    .line 54
    iget v0, p0, Lcom/googlecode/flickrjandroid/stats/Stats;->favorites:I

    return v0
.end method

.method public getViews()I
    .locals 1

    .prologue
    .line 40
    iget v0, p0, Lcom/googlecode/flickrjandroid/stats/Stats;->views:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 73
    iget v0, p0, Lcom/googlecode/flickrjandroid/stats/Stats;->comments:I

    add-int/lit8 v0, v0, 0x1f

    .line 74
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/googlecode/flickrjandroid/stats/Stats;->favorites:I

    add-int/2addr v0, v1

    .line 75
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/googlecode/flickrjandroid/stats/Stats;->views:I

    add-int/2addr v0, v1

    .line 76
    return v0
.end method

.method public setComments(I)V
    .locals 0

    .prologue
    .line 33
    iput p1, p0, Lcom/googlecode/flickrjandroid/stats/Stats;->comments:I

    .line 34
    return-void
.end method

.method public setFavorites(I)V
    .locals 0

    .prologue
    .line 61
    iput p1, p0, Lcom/googlecode/flickrjandroid/stats/Stats;->favorites:I

    .line 62
    return-void
.end method

.method public setViews(I)V
    .locals 0

    .prologue
    .line 47
    iput p1, p0, Lcom/googlecode/flickrjandroid/stats/Stats;->views:I

    .line 48
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 105
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Stats [comments="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/googlecode/flickrjandroid/stats/Stats;->comments:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", views="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/flickrjandroid/stats/Stats;->views:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 106
    const-string v1, ", favorites="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/flickrjandroid/stats/Stats;->favorites:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 105
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
