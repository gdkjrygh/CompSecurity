.class public Lcom/aetn/history/android/historyhere/model/LocationManager;
.super Ljava/lang/Object;
.source "LocationManager.java"

# interfaces
.implements Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;
.implements Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;
.implements Lcom/google/android/gms/location/LocationListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aetn/history/android/historyhere/model/LocationManager$OnPlayServiceInstalledListener;
    }
.end annotation


# static fields
.field private static final CONNECTION_FAILURE_RESOLUTION_REQUEST:I = 0x2328

.field static final REQUEST_CODE_RECOVER_PLAY_SERVICES:I = 0x3e9

.field private static final TAG:Ljava/lang/String; = "LocationManager"

.field private static mContext:Landroid/content/Context;

.field public static mInstance:Lcom/aetn/history/android/historyhere/model/LocationManager;


# instance fields
.field public mCurrentLocation:Landroid/location/Location;

.field private mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

.field private mInitLocationTest:Z

.field private mLocationRequest:Lcom/google/android/gms/location/LocationRequest;

.field private mOnPlayServiceInstalledListener:Lcom/aetn/history/android/historyhere/model/LocationManager$OnPlayServiceInstalledListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mInitLocationTest:Z

    .line 52
    sput-object p1, Lcom/aetn/history/android/historyhere/model/LocationManager;->mContext:Landroid/content/Context;

    .line 53
    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/LocationManager;
    .locals 1
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 57
    sput-object p0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mContext:Landroid/content/Context;

    .line 58
    sget-object v0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mInstance:Lcom/aetn/history/android/historyhere/model/LocationManager;

    if-nez v0, :cond_0

    .line 59
    new-instance v0, Lcom/aetn/history/android/historyhere/model/LocationManager;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/model/LocationManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mInstance:Lcom/aetn/history/android/historyhere/model/LocationManager;

    .line 60
    :cond_0
    sget-object v0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mInstance:Lcom/aetn/history/android/historyhere/model/LocationManager;

    return-object v0
.end method


# virtual methods
.method public getUsersAddress()Landroid/location/Address;
    .locals 9

    .prologue
    .line 235
    new-instance v0, Landroid/location/Geocoder;

    sget-object v1, Lcom/aetn/history/android/historyhere/model/LocationManager;->mContext:Landroid/content/Context;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/location/Geocoder;-><init>(Landroid/content/Context;Ljava/util/Locale;)V

    .line 237
    .local v0, "g":Landroid/location/Geocoder;
    :try_start_0
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getUsersLocation()Landroid/location/Location;

    move-result-object v1

    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getUsersLocation()Landroid/location/Location;

    move-result-object v3

    invoke-virtual {v3}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Landroid/location/Geocoder;->getFromLocation(DDI)Ljava/util/List;

    move-result-object v7

    .line 238
    .local v7, "address":Ljava/util/List;, "Ljava/util/List<Landroid/location/Address;>;"
    const/4 v1, 0x0

    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/location/Address;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 242
    .end local v7    # "address":Ljava/util/List;, "Ljava/util/List<Landroid/location/Address;>;"
    :goto_0
    return-object v6

    .line 240
    :catch_0
    move-exception v8

    .line 241
    .local v8, "e":Ljava/io/IOException;
    invoke-virtual {v8}, Ljava/io/IOException;->printStackTrace()V

    .line 242
    const/4 v6, 0x0

    goto :goto_0
.end method

.method public getUsersLocation()Landroid/location/Location;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 200
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 201
    sget-object v1, Lcom/google/android/gms/location/LocationServices;->FusedLocationApi:Lcom/google/android/gms/location/FusedLocationProviderApi;

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v1, v2}, Lcom/google/android/gms/location/FusedLocationProviderApi;->getLastLocation(Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/location/Location;

    move-result-object v1

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mCurrentLocation:Landroid/location/Location;

    .line 202
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mCurrentLocation:Landroid/location/Location;

    if-nez v1, :cond_0

    .line 203
    const-string v1, "LocationManager"

    const-string v2, "isLocationKnown(): The users location is: NULL"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/LocationManager;->turnOnLocationServices()V

    .line 214
    :goto_0
    return-object v0

    .line 208
    :cond_0
    const-string v0, "LocationManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isLocationKnown(): The users location is: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mCurrentLocation:Landroid/location/Location;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mCurrentLocation:Landroid/location/Location;

    goto :goto_0

    .line 213
    :cond_1
    const-string v1, "LocationManager"

    const-string v2, "isLocationKnown(): We are not connected so return false: "

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public init()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 86
    sget-object v1, Lcom/aetn/history/android/historyhere/model/LocationManager;->mContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v0

    .line 87
    .local v0, "playServicesResult":I
    if-nez v0, :cond_0

    .line 89
    new-instance v1, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    sget-object v2, Lcom/aetn/history/android/historyhere/model/LocationManager;->mContext:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;-><init>(Landroid/content/Context;)V

    sget-object v2, Lcom/google/android/gms/location/LocationServices;->API:Lcom/google/android/gms/common/api/Api;

    .line 90
    invoke-virtual {v1, v2}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v1

    .line 91
    invoke-virtual {v1, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v1

    .line 92
    invoke-virtual {v1, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addOnConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v1

    .line 93
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->build()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 95
    iput-boolean v3, p0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mInitLocationTest:Z

    .line 96
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/LocationManager;->turnOnLocationServices()V

    .line 97
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/LocationManager;->notifyPlayServiceSucceeded()V

    .line 105
    :goto_0
    return-void

    .line 99
    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isUserRecoverableError(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 100
    invoke-virtual {p0, v0}, Lcom/aetn/history/android/historyhere/model/LocationManager;->showErrorDialog(I)V

    goto :goto_0

    .line 102
    :cond_1
    sget-object v1, Lcom/aetn/history/android/historyhere/model/LocationManager;->mContext:Landroid/content/Context;

    const-string v2, "This device is not supported."

    invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method

.method public isUserInUs()Z
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 180
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/LocationManager;->isUsersLocationKnown()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 181
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getUsersAddress()Landroid/location/Address;

    move-result-object v0

    .line 182
    .local v0, "a":Landroid/location/Address;
    if-eqz v0, :cond_0

    .line 183
    const-string v3, "LocationManager"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "isUserInUs: a.getCountryCode():"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v0}, Landroid/location/Address;->getCountryCode()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    invoke-virtual {v0}, Landroid/location/Address;->getCountryCode()Ljava/lang/String;

    move-result-object v3

    const-string v4, "US"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 194
    .end local v0    # "a":Landroid/location/Address;
    :cond_0
    :goto_0
    return v1

    .restart local v0    # "a":Landroid/location/Address;
    :cond_1
    move v1, v2

    .line 187
    goto :goto_0

    .line 193
    .end local v0    # "a":Landroid/location/Address;
    :cond_2
    const-string v1, "LocationManager"

    const-string v3, "isUserInUs: location not known return false:"

    invoke-static {v1, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    move v1, v2

    .line 194
    goto :goto_0
.end method

.method public isUsersLocationKnown()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 142
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 143
    sget-object v1, Lcom/google/android/gms/location/LocationServices;->FusedLocationApi:Lcom/google/android/gms/location/FusedLocationProviderApi;

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v1, v2}, Lcom/google/android/gms/location/FusedLocationProviderApi;->getLastLocation(Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/location/Location;

    move-result-object v1

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mCurrentLocation:Landroid/location/Location;

    .line 144
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mCurrentLocation:Landroid/location/Location;

    if-nez v1, :cond_0

    .line 145
    const-string v1, "LocationManager"

    const-string v2, "isLocationKnown(): The users location is: NULL"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/LocationManager;->turnOnLocationServices()V

    .line 156
    :goto_0
    return v0

    .line 150
    :cond_0
    const-string v0, "LocationManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isLocationKnown(): The users location is: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mCurrentLocation:Landroid/location/Location;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    const/4 v0, 0x1

    goto :goto_0

    .line 155
    :cond_1
    const-string v1, "LocationManager"

    const-string v2, "isLocationKnown(): We are not connected so return false: "

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public notifyPlayServiceFailed()V
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mOnPlayServiceInstalledListener:Lcom/aetn/history/android/historyhere/model/LocationManager$OnPlayServiceInstalledListener;

    invoke-interface {v0}, Lcom/aetn/history/android/historyhere/model/LocationManager$OnPlayServiceInstalledListener;->onFailed()V

    .line 70
    return-void
.end method

.method public notifyPlayServiceSucceeded()V
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mOnPlayServiceInstalledListener:Lcom/aetn/history/android/historyhere/model/LocationManager$OnPlayServiceInstalledListener;

    invoke-interface {v0}, Lcom/aetn/history/android/historyhere/model/LocationManager$OnPlayServiceInstalledListener;->onSuccess()V

    .line 74
    return-void
.end method

.method public onConnected(Landroid/os/Bundle;)V
    .locals 3
    .param p1, "arg0"    # Landroid/os/Bundle;

    .prologue
    .line 280
    const-string v0, "LocationManager"

    const-string v1, "Connected"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    invoke-static {}, Lcom/google/android/gms/location/LocationRequest;->create()Lcom/google/android/gms/location/LocationRequest;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mLocationRequest:Lcom/google/android/gms/location/LocationRequest;

    .line 287
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mLocationRequest:Lcom/google/android/gms/location/LocationRequest;

    const/16 v1, 0x68

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/LocationRequest;->setPriority(I)Lcom/google/android/gms/location/LocationRequest;

    .line 288
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mLocationRequest:Lcom/google/android/gms/location/LocationRequest;

    const-wide/32 v1, 0xea6a

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest;->setInterval(J)Lcom/google/android/gms/location/LocationRequest;

    .line 290
    sget-object v0, Lcom/google/android/gms/location/LocationServices;->FusedLocationApi:Lcom/google/android/gms/location/FusedLocationProviderApi;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mLocationRequest:Lcom/google/android/gms/location/LocationRequest;

    invoke-interface {v0, v1, v2, p0}, Lcom/google/android/gms/location/FusedLocationProviderApi;->requestLocationUpdates(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;)Lcom/google/android/gms/common/api/PendingResult;

    .line 292
    return-void
.end method

.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 4
    .param p1, "connectionResult"    # Lcom/google/android/gms/common/ConnectionResult;

    .prologue
    .line 250
    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->hasResolution()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 252
    :try_start_0
    const-string v1, "LocationManager"

    const-string v2, "Connection succeeded:"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    sget-object v1, Lcom/aetn/history/android/historyhere/model/LocationManager;->mContext:Landroid/content/Context;

    check-cast v1, Landroid/app/Activity;

    const/16 v2, 0x2328

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/common/ConnectionResult;->startResolutionForResult(Landroid/app/Activity;I)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 269
    :goto_0
    return-void

    .line 256
    :catch_0
    move-exception v0

    .line 258
    .local v0, "e":Landroid/content/IntentSender$SendIntentException;
    const-string v1, "LocationManager"

    const-string v2, "Connection intent exception"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    invoke-virtual {v0}, Landroid/content/IntentSender$SendIntentException;->printStackTrace()V

    goto :goto_0

    .line 266
    .end local v0    # "e":Landroid/content/IntentSender$SendIntentException;
    :cond_0
    const-string v1, "LocationManager"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Connection failed:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->getErrorCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onConnectionSuspended(I)V
    .locals 2
    .param p1, "i"    # I

    .prologue
    .line 273
    const-string v0, "LocationManager"

    const-string v1, "GoogleApiClient connection has been suspend"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 274
    return-void
.end method

.method public onLocationChanged(Landroid/location/Location;)V
    .locals 0
    .param p1, "location"    # Landroid/location/Location;

    .prologue
    .line 297
    return-void
.end method

.method public setOnPlayServiceInstalledListener(Lcom/aetn/history/android/historyhere/model/LocationManager$OnPlayServiceInstalledListener;)V
    .locals 0
    .param p1, "listener"    # Lcom/aetn/history/android/historyhere/model/LocationManager$OnPlayServiceInstalledListener;

    .prologue
    .line 64
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mOnPlayServiceInstalledListener:Lcom/aetn/history/android/historyhere/model/LocationManager$OnPlayServiceInstalledListener;

    .line 65
    return-void
.end method

.method showErrorDialog(I)V
    .locals 3
    .param p1, "code"    # I

    .prologue
    .line 108
    sget-object v1, Lcom/aetn/history/android/historyhere/model/LocationManager;->mContext:Landroid/content/Context;

    check-cast v1, Landroid/app/Activity;

    const/16 v2, 0x3e9

    invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->getErrorDialog(ILandroid/app/Activity;I)Landroid/app/Dialog;

    move-result-object v0

    .line 109
    .local v0, "d":Landroid/app/Dialog;
    new-instance v1, Lcom/aetn/history/android/historyhere/model/LocationManager$1;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/model/LocationManager$1;-><init>(Lcom/aetn/history/android/historyhere/model/LocationManager;)V

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 115
    new-instance v1, Lcom/aetn/history/android/historyhere/model/LocationManager$2;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/model/LocationManager$2;-><init>(Lcom/aetn/history/android/historyhere/model/LocationManager;)V

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 121
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 122
    return-void
.end method

.method public turnOffLocationServices()V
    .locals 1

    .prologue
    .line 136
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v0, :cond_0

    .line 137
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    .line 139
    :cond_0
    return-void
.end method

.method public turnOnLocationServices()V
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v0, :cond_0

    .line 131
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/LocationManager;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    .line 133
    :cond_0
    return-void
.end method
