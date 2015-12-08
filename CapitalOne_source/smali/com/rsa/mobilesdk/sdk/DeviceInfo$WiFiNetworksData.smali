.class public Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;
.super Ljava/lang/Object;
.source "DeviceInfo.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rsa/mobilesdk/sdk/DeviceInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "WiFiNetworksData"
.end annotation


# instance fields
.field public BBSID:Ljava/lang/String;

.field public Channel:Ljava/lang/String;

.field public SSID:Ljava/lang/String;

.field public SignalStrength:I

.field public StationName:Ljava/lang/String;

.field final synthetic this$0:Lcom/rsa/mobilesdk/sdk/DeviceInfo;


# direct methods
.method public constructor <init>(Lcom/rsa/mobilesdk/sdk/DeviceInfo;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 412
    iput-object p1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->this$0:Lcom/rsa/mobilesdk/sdk/DeviceInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 413
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->StationName:Ljava/lang/String;

    .line 414
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->BBSID:Ljava/lang/String;

    .line 415
    const/4 v0, 0x0

    iput v0, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->SignalStrength:I

    .line 416
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->Channel:Ljava/lang/String;

    .line 417
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->SSID:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public reset()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 436
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->StationName:Ljava/lang/String;

    .line 437
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->BBSID:Ljava/lang/String;

    .line 438
    const/4 v0, 0x0

    iput v0, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->SignalStrength:I

    .line 439
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->Channel:Ljava/lang/String;

    .line 440
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->SSID:Ljava/lang/String;

    .line 441
    return-void
.end method

.method public set(Landroid/net/wifi/WifiInfo;)V
    .locals 2
    .param p1, "info"    # Landroid/net/wifi/WifiInfo;

    .prologue
    const/4 v1, 0x0

    .line 420
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->StationName:Ljava/lang/String;

    .line 421
    invoke-virtual {p1}, Landroid/net/wifi/WifiInfo;->getBSSID()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->BBSID:Ljava/lang/String;

    .line 422
    invoke-virtual {p1}, Landroid/net/wifi/WifiInfo;->getRssi()I

    move-result v0

    iput v0, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->SignalStrength:I

    .line 423
    iput-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->Channel:Ljava/lang/String;

    .line 424
    invoke-virtual {p1}, Landroid/net/wifi/WifiInfo;->getSSID()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->SSID:Ljava/lang/String;

    .line 425
    return-void
.end method

.method public setNoPermission()V
    .locals 1

    .prologue
    .line 428
    const-string v0, "-1"

    iput-object v0, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->StationName:Ljava/lang/String;

    .line 429
    const-string v0, "-1"

    iput-object v0, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->BBSID:Ljava/lang/String;

    .line 430
    const/4 v0, -0x1

    iput v0, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->SignalStrength:I

    .line 431
    const-string v0, "-1"

    iput-object v0, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->Channel:Ljava/lang/String;

    .line 432
    const-string v0, "-1"

    iput-object v0, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->SSID:Ljava/lang/String;

    .line 433
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 444
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 445
    .local v0, "buffer":Ljava/lang/StringBuffer;
    const-string v1, "Station Name: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 446
    iget-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->StationName:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 447
    iget-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->StationName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 452
    :goto_0
    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 453
    const-string v1, "BBSID: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 454
    iget-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->BBSID:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 455
    iget-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->BBSID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 460
    :goto_1
    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 461
    const-string v1, "Signal Strength: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 462
    iget v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->SignalStrength:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 463
    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 464
    const-string v1, "Channel: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 465
    iget-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->Channel:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 466
    iget-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->Channel:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 471
    :goto_2
    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 472
    const-string v1, "SSID: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 473
    iget-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->SSID:Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 474
    iget-object v1, p0, Lcom/rsa/mobilesdk/sdk/DeviceInfo$WiFiNetworksData;->SSID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 479
    :goto_3
    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 481
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1

    .line 450
    :cond_0
    const-string v1, "unavailable"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 458
    :cond_1
    const-string v1, "unavailable"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_1

    .line 469
    :cond_2
    const-string v1, "unavailable"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_2

    .line 477
    :cond_3
    const-string v1, "unavailable"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_3
.end method
