.class public Lcom/bricolsoftconsulting/geocoderplus/Area;
.super Ljava/lang/Object;
.source "Area.java"


# instance fields
.field mNorthEast:Lcom/bricolsoftconsulting/geocoderplus/Position;

.field mSouthWest:Lcom/bricolsoftconsulting/geocoderplus/Position;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    return-void
.end method

.method public constructor <init>(Lcom/bricolsoftconsulting/geocoderplus/Position;Lcom/bricolsoftconsulting/geocoderplus/Position;)V
    .locals 0
    .param p1, "northEast"    # Lcom/bricolsoftconsulting/geocoderplus/Position;
    .param p2, "southWest"    # Lcom/bricolsoftconsulting/geocoderplus/Position;

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Area;->mNorthEast:Lcom/bricolsoftconsulting/geocoderplus/Position;

    .line 33
    iput-object p2, p0, Lcom/bricolsoftconsulting/geocoderplus/Area;->mSouthWest:Lcom/bricolsoftconsulting/geocoderplus/Position;

    .line 34
    return-void
.end method


# virtual methods
.method public getLatitudeSpan()D
    .locals 6

    .prologue
    .line 59
    iget-object v4, p0, Lcom/bricolsoftconsulting/geocoderplus/Area;->mNorthEast:Lcom/bricolsoftconsulting/geocoderplus/Position;

    invoke-virtual {v4}, Lcom/bricolsoftconsulting/geocoderplus/Position;->getLatitude()D

    move-result-wide v0

    .line 60
    .local v0, "maxLatitude":D
    iget-object v4, p0, Lcom/bricolsoftconsulting/geocoderplus/Area;->mSouthWest:Lcom/bricolsoftconsulting/geocoderplus/Position;

    invoke-virtual {v4}, Lcom/bricolsoftconsulting/geocoderplus/Position;->getLatitude()D

    move-result-wide v2

    .line 61
    .local v2, "minLatitude":D
    sub-double v4, v0, v2

    return-wide v4
.end method

.method public getLatitudeSpanE6()I
    .locals 4

    .prologue
    .line 73
    invoke-virtual {p0}, Lcom/bricolsoftconsulting/geocoderplus/Area;->getLatitudeSpan()D

    move-result-wide v0

    const-wide v2, 0x412e848000000000L    # 1000000.0

    mul-double/2addr v0, v2

    double-to-int v0, v0

    return v0
.end method

.method public getLongitudeSpan()D
    .locals 6

    .prologue
    .line 66
    iget-object v4, p0, Lcom/bricolsoftconsulting/geocoderplus/Area;->mNorthEast:Lcom/bricolsoftconsulting/geocoderplus/Position;

    invoke-virtual {v4}, Lcom/bricolsoftconsulting/geocoderplus/Position;->getLongitude()D

    move-result-wide v0

    .line 67
    .local v0, "maxLongitude":D
    iget-object v4, p0, Lcom/bricolsoftconsulting/geocoderplus/Area;->mSouthWest:Lcom/bricolsoftconsulting/geocoderplus/Position;

    invoke-virtual {v4}, Lcom/bricolsoftconsulting/geocoderplus/Position;->getLongitude()D

    move-result-wide v2

    .line 68
    .local v2, "minLongitude":D
    sub-double v4, v0, v2

    return-wide v4
.end method

.method public getLongitudeSpanE6()I
    .locals 4

    .prologue
    .line 78
    invoke-virtual {p0}, Lcom/bricolsoftconsulting/geocoderplus/Area;->getLongitudeSpan()D

    move-result-wide v0

    const-wide v2, 0x412e848000000000L    # 1000000.0

    mul-double/2addr v0, v2

    double-to-int v0, v0

    return v0
.end method

.method public getNorthEast()Lcom/bricolsoftconsulting/geocoderplus/Position;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Area;->mNorthEast:Lcom/bricolsoftconsulting/geocoderplus/Position;

    return-object v0
.end method

.method public getSouthWest()Lcom/bricolsoftconsulting/geocoderplus/Position;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Area;->mSouthWest:Lcom/bricolsoftconsulting/geocoderplus/Position;

    return-object v0
.end method

.method public setNorthEast(Lcom/bricolsoftconsulting/geocoderplus/Position;)V
    .locals 0
    .param p1, "northEast"    # Lcom/bricolsoftconsulting/geocoderplus/Position;

    .prologue
    .line 44
    iput-object p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Area;->mNorthEast:Lcom/bricolsoftconsulting/geocoderplus/Position;

    .line 45
    return-void
.end method

.method public setSouthWest(Lcom/bricolsoftconsulting/geocoderplus/Position;)V
    .locals 0
    .param p1, "southWest"    # Lcom/bricolsoftconsulting/geocoderplus/Position;

    .prologue
    .line 54
    iput-object p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Area;->mSouthWest:Lcom/bricolsoftconsulting/geocoderplus/Position;

    .line 55
    return-void
.end method
