.class public Lcom/bricolsoftconsulting/geocoderplus/Position;
.super Ljava/lang/Object;
.source "Position.java"


# instance fields
.field mLatitude:D

.field mLongitude:D


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    return-void
.end method

.method public constructor <init>(DD)V
    .locals 0
    .param p1, "latitude"    # D
    .param p3, "longitude"    # D

    .prologue
    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-wide p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Position;->mLatitude:D

    .line 55
    iput-wide p3, p0, Lcom/bricolsoftconsulting/geocoderplus/Position;->mLongitude:D

    .line 56
    return-void
.end method


# virtual methods
.method public getLatitude()D
    .locals 2

    .prologue
    .line 28
    iget-wide v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Position;->mLatitude:D

    return-wide v0
.end method

.method public getLongitude()D
    .locals 2

    .prologue
    .line 38
    iget-wide v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Position;->mLongitude:D

    return-wide v0
.end method

.method public setLatitude(D)V
    .locals 0
    .param p1, "latitude"    # D

    .prologue
    .line 33
    iput-wide p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Position;->mLatitude:D

    .line 34
    return-void
.end method

.method public setLongitude(D)V
    .locals 0
    .param p1, "longitude"    # D

    .prologue
    .line 43
    iput-wide p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Position;->mLongitude:D

    .line 44
    return-void
.end method
