.class Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;
.super Ljava/lang/Object;
.source "DeviceInfo.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rsa/mobilesdk/sdk/DeviceInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "GeoLocationInfo"
.end annotation


# instance fields
.field public Altitude:D

.field public AltitudeAccuracy:D

.field public AltitudeAccuracyAvailable:Z

.field public AltitudeAvailable:Z

.field public Heading:D

.field public HeadingAvailable:Z

.field public HorizontalAccuracy:D

.field public HorizontalAccuracyAvailable:Z

.field public Latitude:D

.field public LatitudeAvailable:Z

.field public LocationDataStatus:I

.field public Longitude:D

.field public LongitudeAvailable:Z

.field public Speed:D

.field public SpeedAvailable:Z

.field public Timestamp:J

.field final synthetic this$0:Lcom/rsa/mobilesdk/sdk/DeviceInfo;


# direct methods
.method constructor <init>(Lcom/rsa/mobilesdk/sdk/DeviceInfo;)V
    .locals 0

    .prologue
    .line 197
    iput-object p1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->this$0:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method invalidate()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 268
    iput-boolean v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->LongitudeAvailable:Z

    .line 269
    iput-boolean v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->LatitudeAvailable:Z

    .line 270
    iput-boolean v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->HorizontalAccuracyAvailable:Z

    .line 271
    iput-boolean v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->AltitudeAvailable:Z

    .line 272
    iput-boolean v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->AltitudeAccuracyAvailable:Z

    .line 273
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->Timestamp:J

    .line 274
    iput-boolean v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->HeadingAvailable:Z

    .line 275
    iput-boolean v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->SpeedAvailable:Z

    .line 276
    return-void
.end method

.method set(Landroid/location/Location;I)V
    .locals 3
    .param p1, "location"    # Landroid/location/Location;
    .param p2, "status"    # I

    .prologue
    const/4 v2, 0x1

    .line 283
    invoke-virtual {p0}, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->invalidate()V

    .line 284
    iput p2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->LocationDataStatus:I

    .line 286
    if-eqz p1, :cond_4

    .line 287
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->Latitude:D

    .line 288
    iput-boolean v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->LatitudeAvailable:Z

    .line 289
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->Longitude:D

    .line 290
    iput-boolean v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->LongitudeAvailable:Z

    .line 291
    invoke-virtual {p1}, Landroid/location/Location;->hasAccuracy()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 292
    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v0

    float-to-double v0, v0

    iput-wide v0, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->HorizontalAccuracy:D

    .line 293
    iput-boolean v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->HorizontalAccuracyAvailable:Z

    .line 295
    :cond_0
    invoke-virtual {p1}, Landroid/location/Location;->hasAltitude()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 296
    invoke-virtual {p1}, Landroid/location/Location;->getAltitude()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->Altitude:D

    .line 297
    iput-boolean v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->AltitudeAvailable:Z

    .line 298
    invoke-virtual {p1}, Landroid/location/Location;->hasAccuracy()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 299
    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v0

    float-to-double v0, v0

    iput-wide v0, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->AltitudeAccuracy:D

    .line 300
    iput-boolean v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->AltitudeAccuracyAvailable:Z

    .line 304
    :cond_1
    invoke-virtual {p1}, Landroid/location/Location;->hasBearing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 305
    invoke-virtual {p1}, Landroid/location/Location;->getBearing()F

    move-result v0

    float-to-double v0, v0

    iput-wide v0, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->Heading:D

    .line 306
    iput-boolean v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->HeadingAvailable:Z

    .line 309
    :cond_2
    invoke-virtual {p1}, Landroid/location/Location;->hasSpeed()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 310
    invoke-virtual {p1}, Landroid/location/Location;->getSpeed()F

    move-result v0

    float-to-double v0, v0

    iput-wide v0, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->Speed:D

    .line 311
    iput-boolean v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->SpeedAvailable:Z

    .line 313
    :cond_3
    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->Timestamp:J

    .line 315
    :cond_4
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 322
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 323
    .local v0, "buffer":Ljava/lang/StringBuffer;
    const-string v2, "Latitude: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 324
    iget-boolean v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->LatitudeAvailable:Z

    if-eqz v2, :cond_0

    .line 325
    iget-wide v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->Latitude:D

    invoke-static {v2, v3}, Lcom/rsa/mobilesdk/sdk/Utils;->getDoubleString(D)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 329
    :goto_0
    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 331
    const-string v2, "Longitude: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 332
    iget-boolean v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->LongitudeAvailable:Z

    if-eqz v2, :cond_1

    .line 333
    iget-wide v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->Longitude:D

    invoke-static {v2, v3}, Lcom/rsa/mobilesdk/sdk/Utils;->getDoubleString(D)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 337
    :goto_1
    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 339
    const-string v2, "Horizontal Accuracy: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 340
    iget-boolean v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->HorizontalAccuracyAvailable:Z

    if-eqz v2, :cond_2

    .line 341
    iget-wide v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->HorizontalAccuracy:D

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 345
    :goto_2
    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 347
    const-string v2, "Altitude: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 348
    iget-boolean v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->AltitudeAvailable:Z

    if-eqz v2, :cond_3

    .line 349
    iget-wide v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->Altitude:D

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 354
    :goto_3
    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 356
    const-string v2, "Altitude Accuracy: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 357
    iget-boolean v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->AltitudeAccuracyAvailable:Z

    if-eqz v2, :cond_4

    .line 358
    iget-wide v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->AltitudeAccuracy:D

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 362
    :goto_4
    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 364
    const-string v2, "Heading: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 365
    iget-boolean v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->HeadingAvailable:Z

    if-eqz v2, :cond_5

    .line 366
    iget-wide v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->Heading:D

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 370
    :goto_5
    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 372
    const-string v2, "Speed: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 373
    iget-boolean v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->SpeedAvailable:Z

    if-eqz v2, :cond_6

    .line 374
    iget-wide v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->Speed:D

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 378
    :goto_6
    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 380
    new-instance v1, Landroid/text/format/Time;

    invoke-direct {v1}, Landroid/text/format/Time;-><init>()V

    .line 381
    .local v1, "t":Landroid/text/format/Time;
    iget-wide v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->Timestamp:J

    invoke-virtual {v1, v2, v3}, Landroid/text/format/Time;->set(J)V

    .line 382
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Time: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Landroid/text/format/Time;->format2445()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 383
    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 385
    const-string v2, "STATUS:\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 387
    iget v2, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$GeoLocationInfo;->LocationDataStatus:I

    packed-switch v2, :pswitch_data_0

    .line 404
    :goto_7
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    return-object v2

    .line 327
    .end local v1    # "t":Landroid/text/format/Time;
    :cond_0
    const-string v2, "unavailable"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto/16 :goto_0

    .line 335
    :cond_1
    const-string v2, "unavailable"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto/16 :goto_1

    .line 343
    :cond_2
    const-string v2, "unavailable"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto/16 :goto_2

    .line 352
    :cond_3
    const-string v2, "unavailable"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto/16 :goto_3

    .line 360
    :cond_4
    const-string v2, "unavailable"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto/16 :goto_4

    .line 368
    :cond_5
    const-string v2, "unavailable"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_5

    .line 376
    :cond_6
    const-string v2, "unavailable"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_6

    .line 389
    .restart local v1    # "t":Landroid/text/format/Time;
    :pswitch_0
    const-string v2, "Success\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_7

    .line 392
    :pswitch_1
    const-string v2, "Permission denied\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_7

    .line 395
    :pswitch_2
    const-string v2, "Not Available"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_7

    .line 398
    :pswitch_3
    const-string v2, "Timeout\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_7

    .line 401
    :pswitch_4
    const-string v2, "Not Supported\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_7

    .line 387
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
