.class public Lorg/apache/cordova/CompassListener;
.super Lorg/apache/cordova/api/CordovaPlugin;
.source "CompassListener.java"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# static fields
.field public static ERROR_FAILED_TO_START:I

.field public static RUNNING:I

.field public static STARTING:I

.field public static STOPPED:I


# instance fields
.field public TIMEOUT:J

.field accuracy:I

.field private callbackContext:Lorg/apache/cordova/api/CallbackContext;

.field heading:F

.field lastAccessTime:J

.field mSensor:Landroid/hardware/Sensor;

.field private sensorManager:Landroid/hardware/SensorManager;

.field status:I

.field timeStamp:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 45
    const/4 v0, 0x0

    sput v0, Lorg/apache/cordova/CompassListener;->STOPPED:I

    .line 46
    const/4 v0, 0x1

    sput v0, Lorg/apache/cordova/CompassListener;->STARTING:I

    .line 47
    const/4 v0, 0x2

    sput v0, Lorg/apache/cordova/CompassListener;->RUNNING:I

    .line 48
    const/4 v0, 0x3

    sput v0, Lorg/apache/cordova/CompassListener;->ERROR_FAILED_TO_START:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 66
    invoke-direct {p0}, Lorg/apache/cordova/api/CordovaPlugin;-><init>()V

    .line 50
    const-wide/16 v0, 0x7530

    iput-wide v0, p0, Lorg/apache/cordova/CompassListener;->TIMEOUT:J

    .line 67
    const/4 v0, 0x0

    iput v0, p0, Lorg/apache/cordova/CompassListener;->heading:F

    .line 68
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/apache/cordova/CompassListener;->timeStamp:J

    .line 69
    sget v0, Lorg/apache/cordova/CompassListener;->STOPPED:I

    invoke-direct {p0, v0}, Lorg/apache/cordova/CompassListener;->setStatus(I)V

    .line 70
    return-void
.end method

.method static synthetic access$000(Lorg/apache/cordova/CompassListener;)V
    .locals 0
    .param p0, "x0"    # Lorg/apache/cordova/CompassListener;

    .prologue
    .line 43
    invoke-direct {p0}, Lorg/apache/cordova/CompassListener;->timeout()V

    return-void
.end method

.method private getCompassHeading()Lorg/json/JSONObject;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 283
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 285
    .local v0, "obj":Lorg/json/JSONObject;
    const-string v1, "magneticHeading"

    invoke-virtual {p0}, Lorg/apache/cordova/CompassListener;->getHeading()F

    move-result v2

    float-to-double v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 286
    const-string v1, "trueHeading"

    invoke-virtual {p0}, Lorg/apache/cordova/CompassListener;->getHeading()F

    move-result v2

    float-to-double v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 289
    const-string v1, "headingAccuracy"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 290
    const-string v1, "timestamp"

    iget-wide v2, p0, Lorg/apache/cordova/CompassListener;->timeStamp:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 292
    return-object v0
.end method

.method private setStatus(I)V
    .locals 0
    .param p1, "status"    # I

    .prologue
    .line 274
    iput p1, p0, Lorg/apache/cordova/CompassListener;->status:I

    .line 275
    return-void
.end method

.method private timeout()V
    .locals 2

    .prologue
    .line 203
    iget v0, p0, Lorg/apache/cordova/CompassListener;->status:I

    sget v1, Lorg/apache/cordova/CompassListener;->STARTING:I

    if-ne v0, v1, :cond_0

    .line 204
    sget v0, Lorg/apache/cordova/CompassListener;->ERROR_FAILED_TO_START:I

    invoke-direct {p0, v0}, Lorg/apache/cordova/CompassListener;->setStatus(I)V

    .line 205
    iget-object v0, p0, Lorg/apache/cordova/CompassListener;->callbackContext:Lorg/apache/cordova/api/CallbackContext;

    if-eqz v0, :cond_0

    .line 206
    iget-object v0, p0, Lorg/apache/cordova/CompassListener;->callbackContext:Lorg/apache/cordova/api/CallbackContext;

    const-string v1, "Compass listener failed to start."

    invoke-virtual {v0, v1}, Lorg/apache/cordova/api/CallbackContext;->error(Ljava/lang/String;)V

    .line 209
    :cond_0
    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/api/CallbackContext;)Z
    .locals 10
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "args"    # Lorg/json/JSONArray;
    .param p3, "callbackContext"    # Lorg/apache/cordova/api/CallbackContext;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    const/4 v5, 0x1

    const/4 v6, 0x0

    .line 94
    const-string v7, "start"

    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 95
    invoke-virtual {p0}, Lorg/apache/cordova/CompassListener;->start()I

    .line 132
    :goto_0
    return v5

    .line 97
    :cond_0
    const-string v7, "stop"

    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 98
    invoke-virtual {p0}, Lorg/apache/cordova/CompassListener;->stop()V

    goto :goto_0

    .line 100
    :cond_1
    const-string v7, "getStatus"

    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 101
    invoke-virtual {p0}, Lorg/apache/cordova/CompassListener;->getStatus()I

    move-result v1

    .line 102
    .local v1, "i":I
    new-instance v6, Lorg/apache/cordova/api/PluginResult;

    sget-object v7, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v6, v7, v1}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;I)V

    invoke-virtual {p3, v6}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    goto :goto_0

    .line 104
    .end local v1    # "i":I
    :cond_2
    const-string v7, "getHeading"

    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    .line 106
    iget v6, p0, Lorg/apache/cordova/CompassListener;->status:I

    sget v7, Lorg/apache/cordova/CompassListener;->RUNNING:I

    if-eq v6, v7, :cond_4

    .line 107
    invoke-virtual {p0}, Lorg/apache/cordova/CompassListener;->start()I

    move-result v4

    .line 108
    .local v4, "r":I
    sget v6, Lorg/apache/cordova/CompassListener;->ERROR_FAILED_TO_START:I

    if-ne v4, v6, :cond_3

    .line 109
    new-instance v6, Lorg/apache/cordova/api/PluginResult;

    sget-object v7, Lorg/apache/cordova/api/PluginResult$Status;->IO_EXCEPTION:Lorg/apache/cordova/api/PluginResult$Status;

    sget v8, Lorg/apache/cordova/CompassListener;->ERROR_FAILED_TO_START:I

    invoke-direct {v6, v7, v8}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;I)V

    invoke-virtual {p3, v6}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    goto :goto_0

    .line 113
    :cond_3
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v6

    invoke-direct {v0, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 114
    .local v0, "handler":Landroid/os/Handler;
    new-instance v6, Lorg/apache/cordova/CompassListener$1;

    invoke-direct {v6, p0}, Lorg/apache/cordova/CompassListener$1;-><init>(Lorg/apache/cordova/CompassListener;)V

    const-wide/16 v8, 0x7d0

    invoke-virtual {v0, v6, v8, v9}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 120
    .end local v0    # "handler":Landroid/os/Handler;
    .end local v4    # "r":I
    :cond_4
    new-instance v6, Lorg/apache/cordova/api/PluginResult;

    sget-object v7, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {p0}, Lorg/apache/cordova/CompassListener;->getCompassHeading()Lorg/json/JSONObject;

    move-result-object v8

    invoke-direct {v6, v7, v8}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Lorg/json/JSONObject;)V

    invoke-virtual {p3, v6}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    goto :goto_0

    .line 122
    :cond_5
    const-string v7, "setTimeout"

    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 123
    invoke-virtual {p2, v6}, Lorg/json/JSONArray;->getLong(I)J

    move-result-wide v6

    invoke-virtual {p0, v6, v7}, Lorg/apache/cordova/CompassListener;->setTimeout(J)V

    goto :goto_0

    .line 125
    :cond_6
    const-string v7, "getTimeout"

    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    .line 126
    invoke-virtual {p0}, Lorg/apache/cordova/CompassListener;->getTimeout()J

    move-result-wide v2

    .line 127
    .local v2, "l":J
    new-instance v6, Lorg/apache/cordova/api/PluginResult;

    sget-object v7, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    long-to-float v8, v2

    invoke-direct {v6, v7, v8}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;F)V

    invoke-virtual {p3, v6}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    goto/16 :goto_0

    .end local v2    # "l":J
    :cond_7
    move v5, v6

    .line 130
    goto/16 :goto_0
.end method

.method public getHeading()F
    .locals 2

    .prologue
    .line 247
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lorg/apache/cordova/CompassListener;->lastAccessTime:J

    .line 248
    iget v0, p0, Lorg/apache/cordova/CompassListener;->heading:F

    return v0
.end method

.method public getStatus()I
    .locals 1

    .prologue
    .line 238
    iget v0, p0, Lorg/apache/cordova/CompassListener;->status:I

    return v0
.end method

.method public getTimeout()J
    .locals 2

    .prologue
    .line 266
    iget-wide v0, p0, Lorg/apache/cordova/CompassListener;->TIMEOUT:J

    return-wide v0
.end method

.method public initialize(Lorg/apache/cordova/api/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V
    .locals 2
    .param p1, "cordova"    # Lorg/apache/cordova/api/CordovaInterface;
    .param p2, "webView"    # Lorg/apache/cordova/CordovaWebView;

    .prologue
    .line 80
    invoke-super {p0, p1, p2}, Lorg/apache/cordova/api/CordovaPlugin;->initialize(Lorg/apache/cordova/api/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V

    .line 81
    invoke-interface {p1}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "sensor"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/SensorManager;

    iput-object v0, p0, Lorg/apache/cordova/CompassListener;->sensorManager:Landroid/hardware/SensorManager;

    .line 82
    return-void
.end method

.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0
    .param p1, "sensor"    # Landroid/hardware/Sensor;
    .param p2, "accuracy"    # I

    .prologue
    .line 197
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .prologue
    .line 139
    invoke-virtual {p0}, Lorg/apache/cordova/CompassListener;->stop()V

    .line 140
    return-void
.end method

.method public onReset()V
    .locals 0

    .prologue
    .line 146
    invoke-virtual {p0}, Lorg/apache/cordova/CompassListener;->stop()V

    .line 147
    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 6
    .param p1, "event"    # Landroid/hardware/SensorEvent;

    .prologue
    .line 219
    iget-object v1, p1, Landroid/hardware/SensorEvent;->values:[F

    const/4 v2, 0x0

    aget v0, v1, v2

    .line 222
    .local v0, "heading":F
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lorg/apache/cordova/CompassListener;->timeStamp:J

    .line 223
    iput v0, p0, Lorg/apache/cordova/CompassListener;->heading:F

    .line 224
    sget v1, Lorg/apache/cordova/CompassListener;->RUNNING:I

    invoke-direct {p0, v1}, Lorg/apache/cordova/CompassListener;->setStatus(I)V

    .line 227
    iget-wide v2, p0, Lorg/apache/cordova/CompassListener;->timeStamp:J

    iget-wide v4, p0, Lorg/apache/cordova/CompassListener;->lastAccessTime:J

    sub-long/2addr v2, v4

    iget-wide v4, p0, Lorg/apache/cordova/CompassListener;->TIMEOUT:J

    cmp-long v1, v2, v4

    if-lez v1, :cond_0

    .line 228
    invoke-virtual {p0}, Lorg/apache/cordova/CompassListener;->stop()V

    .line 230
    :cond_0
    return-void
.end method

.method public setTimeout(J)V
    .locals 1
    .param p1, "timeout"    # J

    .prologue
    .line 257
    iput-wide p1, p0, Lorg/apache/cordova/CompassListener;->TIMEOUT:J

    .line 258
    return-void
.end method

.method public start()I
    .locals 4

    .prologue
    const/4 v3, 0x3

    .line 161
    iget v1, p0, Lorg/apache/cordova/CompassListener;->status:I

    sget v2, Lorg/apache/cordova/CompassListener;->RUNNING:I

    if-eq v1, v2, :cond_0

    iget v1, p0, Lorg/apache/cordova/CompassListener;->status:I

    sget v2, Lorg/apache/cordova/CompassListener;->STARTING:I

    if-ne v1, v2, :cond_1

    .line 162
    :cond_0
    iget v1, p0, Lorg/apache/cordova/CompassListener;->status:I

    .line 182
    :goto_0
    return v1

    .line 167
    :cond_1
    iget-object v1, p0, Lorg/apache/cordova/CompassListener;->sensorManager:Landroid/hardware/SensorManager;

    invoke-virtual {v1, v3}, Landroid/hardware/SensorManager;->getSensorList(I)Ljava/util/List;

    move-result-object v0

    .line 170
    .local v0, "list":Ljava/util/List;, "Ljava/util/List<Landroid/hardware/Sensor;>;"
    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_2

    .line 171
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/hardware/Sensor;

    iput-object v1, p0, Lorg/apache/cordova/CompassListener;->mSensor:Landroid/hardware/Sensor;

    .line 172
    iget-object v1, p0, Lorg/apache/cordova/CompassListener;->sensorManager:Landroid/hardware/SensorManager;

    iget-object v2, p0, Lorg/apache/cordova/CompassListener;->mSensor:Landroid/hardware/Sensor;

    invoke-virtual {v1, p0, v2, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 173
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lorg/apache/cordova/CompassListener;->lastAccessTime:J

    .line 174
    sget v1, Lorg/apache/cordova/CompassListener;->STARTING:I

    invoke-direct {p0, v1}, Lorg/apache/cordova/CompassListener;->setStatus(I)V

    .line 182
    :goto_1
    iget v1, p0, Lorg/apache/cordova/CompassListener;->status:I

    goto :goto_0

    .line 179
    :cond_2
    sget v1, Lorg/apache/cordova/CompassListener;->ERROR_FAILED_TO_START:I

    invoke-direct {p0, v1}, Lorg/apache/cordova/CompassListener;->setStatus(I)V

    goto :goto_1
.end method

.method public stop()V
    .locals 2

    .prologue
    .line 189
    iget v0, p0, Lorg/apache/cordova/CompassListener;->status:I

    sget v1, Lorg/apache/cordova/CompassListener;->STOPPED:I

    if-eq v0, v1, :cond_0

    .line 190
    iget-object v0, p0, Lorg/apache/cordova/CompassListener;->sensorManager:Landroid/hardware/SensorManager;

    invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 192
    :cond_0
    sget v0, Lorg/apache/cordova/CompassListener;->STOPPED:I

    invoke-direct {p0, v0}, Lorg/apache/cordova/CompassListener;->setStatus(I)V

    .line 193
    return-void
.end method
