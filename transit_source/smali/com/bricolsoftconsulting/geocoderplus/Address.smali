.class public Lcom/bricolsoftconsulting/geocoderplus/Address;
.super Ljava/lang/Object;
.source "Address.java"


# instance fields
.field mAdminArea:Ljava/lang/String;

.field mBounds:Lcom/bricolsoftconsulting/geocoderplus/Area;

.field mCountryCode:Ljava/lang/String;

.field mCountryName:Ljava/lang/String;

.field mFloor:Ljava/lang/String;

.field mFormattedAddress:Ljava/lang/String;

.field mLatitude:D

.field mLocale:Ljava/util/Locale;

.field mLocality:Ljava/lang/String;

.field mLongitude:D

.field mNeighborhood:Ljava/lang/String;

.field mPostalCode:Ljava/lang/String;

.field mPremise:Ljava/lang/String;

.field mRoom:Ljava/lang/String;

.field mRoute:Ljava/lang/String;

.field mStreetNumber:Ljava/lang/String;

.field mSubAdminArea:Ljava/lang/String;

.field mSubAdminArea2:Ljava/lang/String;

.field mSubLocality:Ljava/lang/String;

.field mSubPremise:Ljava/lang/String;

.field mViewPort:Lcom/bricolsoftconsulting/geocoderplus/Area;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    iput-object v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mLocale:Ljava/util/Locale;

    .line 50
    return-void
.end method

.method public constructor <init>(Ljava/util/Locale;)V
    .locals 0
    .param p1, "locale"    # Ljava/util/Locale;

    .prologue
    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mLocale:Ljava/util/Locale;

    .line 55
    return-void
.end method


# virtual methods
.method public getAdminArea()Ljava/lang/String;
    .locals 1

    .prologue
    .line 160
    iget-object v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mAdminArea:Ljava/lang/String;

    return-object v0
.end method

.method public getBounds()Lcom/bricolsoftconsulting/geocoderplus/Area;
    .locals 1

    .prologue
    .line 239
    iget-object v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mBounds:Lcom/bricolsoftconsulting/geocoderplus/Area;

    return-object v0
.end method

.method public getCountryCode()Ljava/lang/String;
    .locals 1

    .prologue
    .line 200
    iget-object v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mCountryCode:Ljava/lang/String;

    return-object v0
.end method

.method public getCountryName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 190
    iget-object v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mCountryName:Ljava/lang/String;

    return-object v0
.end method

.method public getFloor()Ljava/lang/String;
    .locals 1

    .prologue
    .line 110
    iget-object v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mFloor:Ljava/lang/String;

    return-object v0
.end method

.method public getFormattedAddress()Ljava/lang/String;
    .locals 1

    .prologue
    .line 220
    iget-object v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mFormattedAddress:Ljava/lang/String;

    return-object v0
.end method

.method public getLatitude()D
    .locals 2

    .prologue
    .line 249
    iget-wide v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mLatitude:D

    return-wide v0
.end method

.method public getLatitudeE6()I
    .locals 4

    .prologue
    .line 254
    iget-wide v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mLatitude:D

    const-wide v2, 0x412e848000000000L    # 1000000.0

    mul-double/2addr v0, v2

    double-to-int v0, v0

    return v0
.end method

.method public getLocale()Ljava/util/Locale;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mLocale:Ljava/util/Locale;

    return-object v0
.end method

.method public getLocality()Ljava/lang/String;
    .locals 1

    .prologue
    .line 140
    iget-object v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mLocality:Ljava/lang/String;

    return-object v0
.end method

.method public getLongitude()D
    .locals 2

    .prologue
    .line 264
    iget-wide v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mLongitude:D

    return-wide v0
.end method

.method public getLongitudeE6()I
    .locals 4

    .prologue
    .line 269
    iget-wide v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mLongitude:D

    const-wide v2, 0x412e848000000000L    # 1000000.0

    mul-double/2addr v0, v2

    double-to-int v0, v0

    return v0
.end method

.method public getNeighborhood()Ljava/lang/String;
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mNeighborhood:Ljava/lang/String;

    return-object v0
.end method

.method public getPostalCode()Ljava/lang/String;
    .locals 1

    .prologue
    .line 210
    iget-object v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mPostalCode:Ljava/lang/String;

    return-object v0
.end method

.method public getPremise()Ljava/lang/String;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mPremise:Ljava/lang/String;

    return-object v0
.end method

.method public getRoom()Ljava/lang/String;
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mRoom:Ljava/lang/String;

    return-object v0
.end method

.method public getRoute()Ljava/lang/String;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mRoute:Ljava/lang/String;

    return-object v0
.end method

.method public getStreetNumber()Ljava/lang/String;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mStreetNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getSubAdminArea()Ljava/lang/String;
    .locals 1

    .prologue
    .line 170
    iget-object v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mSubAdminArea:Ljava/lang/String;

    return-object v0
.end method

.method public getSubAdminArea2()Ljava/lang/String;
    .locals 1

    .prologue
    .line 180
    iget-object v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mSubAdminArea2:Ljava/lang/String;

    return-object v0
.end method

.method public getSubLocality()Ljava/lang/String;
    .locals 1

    .prologue
    .line 150
    iget-object v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mSubLocality:Ljava/lang/String;

    return-object v0
.end method

.method public getSubPremise()Ljava/lang/String;
    .locals 1

    .prologue
    .line 100
    iget-object v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mSubPremise:Ljava/lang/String;

    return-object v0
.end method

.method public getViewPort()Lcom/bricolsoftconsulting/geocoderplus/Area;
    .locals 1

    .prologue
    .line 230
    iget-object v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mViewPort:Lcom/bricolsoftconsulting/geocoderplus/Area;

    return-object v0
.end method

.method public setAdminArea(Ljava/lang/String;)V
    .locals 0
    .param p1, "adminArea"    # Ljava/lang/String;

    .prologue
    .line 165
    iput-object p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mAdminArea:Ljava/lang/String;

    .line 166
    return-void
.end method

.method public setBounds(Lcom/bricolsoftconsulting/geocoderplus/Area;)V
    .locals 0
    .param p1, "bounds"    # Lcom/bricolsoftconsulting/geocoderplus/Area;

    .prologue
    .line 244
    iput-object p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mBounds:Lcom/bricolsoftconsulting/geocoderplus/Area;

    .line 245
    return-void
.end method

.method public setCountryCode(Ljava/lang/String;)V
    .locals 0
    .param p1, "countryCode"    # Ljava/lang/String;

    .prologue
    .line 205
    iput-object p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mCountryCode:Ljava/lang/String;

    .line 206
    return-void
.end method

.method public setCountryName(Ljava/lang/String;)V
    .locals 0
    .param p1, "countryName"    # Ljava/lang/String;

    .prologue
    .line 195
    iput-object p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mCountryName:Ljava/lang/String;

    .line 196
    return-void
.end method

.method public setFloor(Ljava/lang/String;)V
    .locals 0
    .param p1, "floor"    # Ljava/lang/String;

    .prologue
    .line 115
    iput-object p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mFloor:Ljava/lang/String;

    .line 116
    return-void
.end method

.method public setFormattedAddress(Ljava/lang/String;)V
    .locals 0
    .param p1, "formattedAddress"    # Ljava/lang/String;

    .prologue
    .line 225
    iput-object p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mFormattedAddress:Ljava/lang/String;

    .line 226
    return-void
.end method

.method public setLatitude(D)V
    .locals 0
    .param p1, "latitude"    # D

    .prologue
    .line 259
    iput-wide p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mLatitude:D

    .line 260
    return-void
.end method

.method public setLocale(Ljava/util/Locale;)V
    .locals 0
    .param p1, "locale"    # Ljava/util/Locale;

    .prologue
    .line 65
    iput-object p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mLocale:Ljava/util/Locale;

    .line 66
    return-void
.end method

.method public setLocality(Ljava/lang/String;)V
    .locals 0
    .param p1, "locality"    # Ljava/lang/String;

    .prologue
    .line 145
    iput-object p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mLocality:Ljava/lang/String;

    .line 146
    return-void
.end method

.method public setLongitude(D)V
    .locals 0
    .param p1, "longitude"    # D

    .prologue
    .line 274
    iput-wide p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mLongitude:D

    .line 275
    return-void
.end method

.method public setNeighborhood(Ljava/lang/String;)V
    .locals 0
    .param p1, "neighborhood"    # Ljava/lang/String;

    .prologue
    .line 135
    iput-object p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mNeighborhood:Ljava/lang/String;

    .line 136
    return-void
.end method

.method public setPostalCode(Ljava/lang/String;)V
    .locals 0
    .param p1, "postalCode"    # Ljava/lang/String;

    .prologue
    .line 215
    iput-object p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mPostalCode:Ljava/lang/String;

    .line 216
    return-void
.end method

.method public setPremise(Ljava/lang/String;)V
    .locals 0
    .param p1, "premise"    # Ljava/lang/String;

    .prologue
    .line 95
    iput-object p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mPremise:Ljava/lang/String;

    .line 96
    return-void
.end method

.method public setRoom(Ljava/lang/String;)V
    .locals 0
    .param p1, "room"    # Ljava/lang/String;

    .prologue
    .line 125
    iput-object p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mRoom:Ljava/lang/String;

    .line 126
    return-void
.end method

.method public setRoute(Ljava/lang/String;)V
    .locals 0
    .param p1, "route"    # Ljava/lang/String;

    .prologue
    .line 85
    iput-object p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mRoute:Ljava/lang/String;

    .line 86
    return-void
.end method

.method public setStreetNumber(Ljava/lang/String;)V
    .locals 0
    .param p1, "streetNumber"    # Ljava/lang/String;

    .prologue
    .line 75
    iput-object p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mStreetNumber:Ljava/lang/String;

    .line 76
    return-void
.end method

.method public setSubAdminArea(Ljava/lang/String;)V
    .locals 0
    .param p1, "subAdminArea"    # Ljava/lang/String;

    .prologue
    .line 175
    iput-object p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mSubAdminArea:Ljava/lang/String;

    .line 176
    return-void
.end method

.method public setSubAdminArea2(Ljava/lang/String;)V
    .locals 0
    .param p1, "subAdminArea2"    # Ljava/lang/String;

    .prologue
    .line 185
    iput-object p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mSubAdminArea:Ljava/lang/String;

    .line 186
    return-void
.end method

.method public setSubLocality(Ljava/lang/String;)V
    .locals 0
    .param p1, "sublocality"    # Ljava/lang/String;

    .prologue
    .line 155
    iput-object p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mSubLocality:Ljava/lang/String;

    .line 156
    return-void
.end method

.method public setSubPremise(Ljava/lang/String;)V
    .locals 0
    .param p1, "subPremise"    # Ljava/lang/String;

    .prologue
    .line 105
    iput-object p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mSubPremise:Ljava/lang/String;

    .line 106
    return-void
.end method

.method public setViewPort(Lcom/bricolsoftconsulting/geocoderplus/Area;)V
    .locals 0
    .param p1, "viewPort"    # Lcom/bricolsoftconsulting/geocoderplus/Area;

    .prologue
    .line 235
    iput-object p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Address;->mViewPort:Lcom/bricolsoftconsulting/geocoderplus/Area;

    .line 236
    return-void
.end method
