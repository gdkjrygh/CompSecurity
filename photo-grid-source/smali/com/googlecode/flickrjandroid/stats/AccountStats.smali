.class public Lcom/googlecode/flickrjandroid/stats/AccountStats;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private collectionsViews:I

.field private galleriesViews:I

.field private photosViews:I

.field private photostreamViews:I

.field private setsViews:I

.field private totalViews:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 131
    if-ne p0, p1, :cond_1

    .line 150
    :cond_0
    :goto_0
    return v0

    .line 133
    :cond_1
    if-nez p1, :cond_2

    move v0, v1

    .line 134
    goto :goto_0

    .line 135
    :cond_2
    instance-of v2, p1, Lcom/googlecode/flickrjandroid/stats/AccountStats;

    if-nez v2, :cond_3

    move v0, v1

    .line 136
    goto :goto_0

    .line 137
    :cond_3
    check-cast p1, Lcom/googlecode/flickrjandroid/stats/AccountStats;

    .line 138
    iget v2, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->collectionsViews:I

    iget v3, p1, Lcom/googlecode/flickrjandroid/stats/AccountStats;->collectionsViews:I

    if-eq v2, v3, :cond_4

    move v0, v1

    .line 139
    goto :goto_0

    .line 140
    :cond_4
    iget v2, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->galleriesViews:I

    iget v3, p1, Lcom/googlecode/flickrjandroid/stats/AccountStats;->galleriesViews:I

    if-eq v2, v3, :cond_5

    move v0, v1

    .line 141
    goto :goto_0

    .line 142
    :cond_5
    iget v2, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->photosViews:I

    iget v3, p1, Lcom/googlecode/flickrjandroid/stats/AccountStats;->photosViews:I

    if-eq v2, v3, :cond_6

    move v0, v1

    .line 143
    goto :goto_0

    .line 144
    :cond_6
    iget v2, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->photostreamViews:I

    iget v3, p1, Lcom/googlecode/flickrjandroid/stats/AccountStats;->photostreamViews:I

    if-eq v2, v3, :cond_7

    move v0, v1

    .line 145
    goto :goto_0

    .line 146
    :cond_7
    iget v2, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->setsViews:I

    iget v3, p1, Lcom/googlecode/flickrjandroid/stats/AccountStats;->setsViews:I

    if-eq v2, v3, :cond_8

    move v0, v1

    .line 147
    goto :goto_0

    .line 148
    :cond_8
    iget v2, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->totalViews:I

    iget v3, p1, Lcom/googlecode/flickrjandroid/stats/AccountStats;->totalViews:I

    if-eq v2, v3, :cond_0

    move v0, v1

    .line 149
    goto :goto_0
.end method

.method public getCollectionsViews()I
    .locals 1

    .prologue
    .line 86
    iget v0, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->collectionsViews:I

    return v0
.end method

.method public getGalleriesViews()I
    .locals 1

    .prologue
    .line 100
    iget v0, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->galleriesViews:I

    return v0
.end method

.method public getPhotosViews()I
    .locals 1

    .prologue
    .line 44
    iget v0, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->photosViews:I

    return v0
.end method

.method public getPhotostreamViews()I
    .locals 1

    .prologue
    .line 58
    iget v0, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->photostreamViews:I

    return v0
.end method

.method public getSetsViews()I
    .locals 1

    .prologue
    .line 72
    iget v0, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->setsViews:I

    return v0
.end method

.method public getTotalViews()I
    .locals 1

    .prologue
    .line 30
    iget v0, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->totalViews:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 117
    iget v0, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->collectionsViews:I

    add-int/lit8 v0, v0, 0x1f

    .line 118
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->galleriesViews:I

    add-int/2addr v0, v1

    .line 119
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->photosViews:I

    add-int/2addr v0, v1

    .line 120
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->photostreamViews:I

    add-int/2addr v0, v1

    .line 121
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->setsViews:I

    add-int/2addr v0, v1

    .line 122
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->totalViews:I

    add-int/2addr v0, v1

    .line 123
    return v0
.end method

.method public setCollectionsViews(I)V
    .locals 0

    .prologue
    .line 93
    iput p1, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->collectionsViews:I

    .line 94
    return-void
.end method

.method public setGalleriesViews(I)V
    .locals 0

    .prologue
    .line 107
    iput p1, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->galleriesViews:I

    .line 108
    return-void
.end method

.method public setPhotosViews(I)V
    .locals 0

    .prologue
    .line 51
    iput p1, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->photosViews:I

    .line 52
    return-void
.end method

.method public setPhotostreamViews(I)V
    .locals 0

    .prologue
    .line 65
    iput p1, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->photostreamViews:I

    .line 66
    return-void
.end method

.method public setSetsViews(I)V
    .locals 0

    .prologue
    .line 79
    iput p1, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->setsViews:I

    .line 80
    return-void
.end method

.method public setTotalViews(I)V
    .locals 0

    .prologue
    .line 37
    iput p1, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->totalViews:I

    .line 38
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 158
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AccountStats [totalViews="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->totalViews:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", photosViews="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 159
    iget v1, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->photosViews:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", photostreamViews="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->photostreamViews:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 160
    const-string v1, ", setsViews="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->setsViews:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", collectionsViews="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 161
    iget v1, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->collectionsViews:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", galleriesViews="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/flickrjandroid/stats/AccountStats;->galleriesViews:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 158
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
