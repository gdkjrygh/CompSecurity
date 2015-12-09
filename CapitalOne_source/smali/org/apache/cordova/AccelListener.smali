.class public Lorg/apache/cordova/AccelListener;
.super Lorg/apache/cordova/api/CordovaPlugin;
.source "AccelListener.java"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# static fields
.field public static ERROR_FAILED_TO_START:I

.field public static RUNNING:I

.field public static STARTING:I

.field public static STOPPED:I


# instance fields
.field private accuracy:I

.field private callbackContext:Lorg/apache/cordova/api/CallbackContext;

.field private mSensor:Landroid/hardware/Sensor;

.field private sensorManager:Landroid/hardware/SensorManager;

.field private status:I

.field private timestamp:J

.field private x:F

.field private y:F

.field private z:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 46
    const/4 v0, 0x0

    sput v0, Lorg/apache/cordova/AccelListener;->STOPPED:I

    .line 47
    const/4 v0, 0x1

    sput v0, Lorg/apache/cordova/AccelListener;->STARTING:I

    .line 48
    const/4 v0, 0x2

    sput v0, Lorg/apache/cordova/AccelListener;->RUNNING:I

    .line 49
    const/4 v0, 0x3

    sput v0, Lorg/apache/cordova/AccelListener;->ERROR_FAILED_TO_START:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 64
    invoke-direct {p0}, Lorg/apache/cordova/api/CordovaPlugin;-><init>()V

    .line 54
    const/4 v0, 0x0

    iput v0, p0, Lorg/apache/cordova/AccelListener;->accuracy:I

    .line 65
    iput v1, p0, Lorg/apache/cordova/AccelListener;->x:F

    .line 66
    iput v1, p0, Lorg/apache/cordova/AccelListener;->y:F

    .line 67
    iput v1, p0, Lorg/apache/cordova/AccelListener;->z:F

    .line 68
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/apache/cordova/AccelListener;->timestamp:J

    .line 69
    sget v0, Lorg/apache/cordova/AccelListener;->STOPPED:I

    invoke-direct {p0, v0}, Lorg/apache/cordova/AccelListener;->setStatus(I)V

    .line 70
    return-void
.end method

.method static synthetic access$000(Lorg/apache/cordova/AccelListener;)V
    .locals 0
    .param p0, "x0"    # Lorg/apache/cordova/AccelListener;

    .prologue
    .line 44
    invoke-direct {p0}, Lorg/apache/cordova/AccelListener;->timeout()V

    return-void
.end method

.method private fail(ILjava/lang/String;)V
    .locals 4
    .param p1, "code"    # I
    .param p2, "message"    # Ljava/lang/String;

    .prologue
    .line 251
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 253
    .local v2, "errorObj":Lorg/json/JSONObject;
    :try_start_0
    const-string v3, "code"

    invoke-virtual {v2, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 254
    const-string v3, "message"

    invoke-virtual {v2, v3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 258
    :goto_0
    new-instance v1, Lorg/apache/cordova/api/PluginResult;

    sget-object v3, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v1, v3, v2}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Lorg/json/JSONObject;)V

    .line 259
    .local v1, "err":Lorg/apache/cordova/api/PluginResult;
    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Lorg/apache/cordova/api/PluginResult;->setKeepCallback(Z)V

    .line 260
    iget-object v3, p0, Lorg/apache/cordova/AccelListener;->callbackContext:Lorg/apache/cordova/api/CallbackContext;

    invoke-virtual {v3, v1}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    .line 261
    return-void

    .line 255
    .end local v1    # "err":Lorg/apache/cordova/api/PluginResult;
    :catch_0
    move-exception v0

    .line 256
    .local v0, "e":Lorg/json/JSONException;
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method

.method private getAccelerationJSON()Lorg/json/JSONObject;
    .locals 6

    .prologue
    .line 274
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 276
    .local v1, "r":Lorg/json/JSONObject;
    :try_start_0
    const-string v2, "x"

    iget v3, p0, Lorg/apache/cordova/AccelListener;->x:F

    float-to-double v4, v3

    invoke-virtual {v1, v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 277
    const-string v2, "y"

    iget v3, p0, Lorg/apache/cordova/AccelListener;->y:F

    float-to-double v4, v3

    invoke-virtual {v1, v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 278
    const-string v2, "z"

    iget v3, p0, Lorg/apache/cordova/AccelListener;->z:F

    float-to-double v4, v3

    invoke-virtual {v1, v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 279
    const-string v2, "timestamp"

    iget-wide v4, p0, Lorg/apache/cordova/AccelListener;->timestamp:J

    invoke-virtual {v1, v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 283
    :goto_0
    return-object v1

    .line 280
    :catch_0
    move-exception v0

    .line 281
    .local v0, "e":Lorg/json/JSONException;
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method

.method private setStatus(I)V
    .locals 0
    .param p1, "status"    # I

    .prologue
    .line 271
    iput p1, p0, Lorg/apache/cordova/AccelListener;->status:I

    .line 272
    return-void
.end method

.method private start()I
    .locals 6

    .prologue
    .line 136
    iget v2, p0, Lorg/apache/cordova/AccelListener;->status:I

    sget v3, Lorg/apache/cordova/AccelListener;->RUNNING:I

    if-eq v2, v3, :cond_0

    iget v2, p0, Lorg/apache/cordova/AccelListener;->status:I

    sget v3, Lorg/apache/cordova/AccelListener;->STARTING:I

    if-ne v2, v3, :cond_1

    .line 137
    :cond_0
    iget v2, p0, Lorg/apache/cordova/AccelListener;->status:I

    .line 164
    :goto_0
    return v2

    .line 140
    :cond_1
    sget v2, Lorg/apache/cordova/AccelListener;->STARTING:I

    invoke-direct {p0, v2}, Lorg/apache/cordova/AccelListener;->setStatus(I)V

    .line 143
    iget-object v2, p0, Lorg/apache/cordova/AccelListener;->sensorManager:Landroid/hardware/SensorManager;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/hardware/SensorManager;->getSensorList(I)Ljava/util/List;

    move-result-object v1

    .line 146
    .local v1, "list":Ljava/util/List;, "Ljava/util/List<Landroid/hardware/Sensor;>;"
    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_2

    .line 147
    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/hardware/Sensor;

    iput-object v2, p0, Lorg/apache/cordova/AccelListener;->mSensor:Landroid/hardware/Sensor;

    .line 148
    iget-object v2, p0, Lorg/apache/cordova/AccelListener;->sensorManager:Landroid/hardware/SensorManager;

    iget-object v3, p0, Lorg/apache/cordova/AccelListener;->mSensor:Landroid/hardware/Sensor;

    const/4 v4, 0x2

    invoke-virtual {v2, p0, v3, v4}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 149
    sget v2, Lorg/apache/cordova/AccelListener;->STARTING:I

    invoke-direct {p0, v2}, Lorg/apache/cordova/AccelListener;->setStatus(I)V

    .line 157
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 158
    .local v0, "handler":Landroid/os/Handler;
    new-instance v2, Lorg/apache/cordova/AccelListener$1;

    invoke-direct {v2, p0}, Lorg/apache/cordova/AccelListener$1;-><init>(Lorg/apache/cordova/AccelListener;)V

    const-wide/16 v4, 0x7d0

    invoke-virtual {v0, v2, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 164
    iget v2, p0, Lorg/apache/cordova/AccelListener;->status:I

    goto :goto_0

    .line 151
    .end local v0    # "handler":Landroid/os/Handler;
    :cond_2
    sget v2, Lorg/apache/cordova/AccelListener;->ERROR_FAILED_TO_START:I

    invoke-direct {p0, v2}, Lorg/apache/cordova/AccelListener;->setStatus(I)V

    .line 152
    sget v2, Lorg/apache/cordova/AccelListener;->ERROR_FAILED_TO_START:I

    const-string v3, "No sensors found to register accelerometer listening to."

    invoke-direct {p0, v2, v3}, Lorg/apache/cordova/AccelListener;->fail(ILjava/lang/String;)V

    .line 153
    iget v2, p0, Lorg/apache/cordova/AccelListener;->status:I

    goto :goto_0
.end method

.method private stop()V
    .locals 2

    .prologue
    .line 171
    iget v0, p0, Lorg/apache/cordova/AccelListener;->status:I

    sget v1, Lorg/apache/cordova/AccelListener;->STOPPED:I

    if-eq v0, v1, :cond_0

    .line 172
    iget-object v0, p0, Lorg/apache/cordova/AccelListener;->sensorManager:Landroid/hardware/SensorManager;

    invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 174
    :cond_0
    sget v0, Lorg/apache/cordova/AccelListener;->STOPPED:I

    invoke-direct {p0, v0}, Lorg/apache/cordova/AccelListener;->setStatus(I)V

    .line 175
    const/4 v0, 0x0

    iput v0, p0, Lorg/apache/cordova/AccelListener;->accuracy:I

    .line 176
    return-void
.end method

.method private timeout()V
    .locals 2

    .prologue
    .line 184
    iget v0, p0, Lorg/apache/cordova/AccelListener;->status:I

    sget v1, Lorg/apache/cordova/AccelListener;->STARTING:I

    if-ne v0, v1, :cond_0

    .line 185
    sget v0, Lorg/apache/cordova/AccelListener;->ERROR_FAILED_TO_START:I

    invoke-direct {p0, v0}, Lorg/apache/cordova/AccelListener;->setStatus(I)V

    .line 186
    sget v0, Lorg/apache/cordova/AccelListener;->ERROR_FAILED_TO_START:I

    const-string v1, "Accelerometer could not be started."

    invoke-direct {p0, v0, v1}, Lorg/apache/cordova/AccelListener;->fail(ILjava/lang/String;)V

    .line 188
    :cond_0
    return-void
.end method

.method private win()V
    .locals 3

    .prologue
    .line 265
    new-instance v0, Lorg/apache/cordova/api/PluginResult;

    sget-object v1, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {p0}, Lorg/apache/cordova/AccelListener;->getAccelerationJSON()Lorg/json/JSONObject;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Lorg/json/JSONObject;)V

    .line 266
    .local v0, "result":Lorg/apache/cordova/api/PluginResult;
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lorg/apache/cordova/api/PluginResult;->setKeepCallback(Z)V

    .line 267
    iget-object v1, p0, Lorg/apache/cordova/AccelListener;->callbackContext:Lorg/apache/cordova/api/CallbackContext;

    invoke-virtual {v1, v0}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    .line 268
    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/api/CallbackContext;)Z
    .locals 4
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "args"    # Lorg/json/JSONArray;
    .param p3, "callbackContext"    # Lorg/apache/cordova/api/CallbackContext;

    .prologue
    const/4 v1, 0x1

    .line 94
    const-string v2, "start"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 95
    iput-object p3, p0, Lorg/apache/cordova/AccelListener;->callbackContext:Lorg/apache/cordova/api/CallbackContext;

    .line 96
    iget v2, p0, Lorg/apache/cordova/AccelListener;->status:I

    sget v3, Lorg/apache/cordova/AccelListener;->RUNNING:I

    if-eq v2, v3, :cond_0

    .line 99
    invoke-direct {p0}, Lorg/apache/cordova/AccelListener;->start()I

    .line 111
    :cond_0
    :goto_0
    new-instance v0, Lorg/apache/cordova/api/PluginResult;

    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->NO_RESULT:Lorg/apache/cordova/api/PluginResult$Status;

    const-string v3, ""

    invoke-direct {v0, v2, v3}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    .line 112
    .local v0, "result":Lorg/apache/cordova/api/PluginResult;
    invoke-virtual {v0, v1}, Lorg/apache/cordova/api/PluginResult;->setKeepCallback(Z)V

    .line 113
    invoke-virtual {p3, v0}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    .line 114
    .end local v0    # "result":Lorg/apache/cordova/api/PluginResult;
    :goto_1
    return v1

    .line 102
    :cond_1
    const-string v2, "stop"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 103
    iget v2, p0, Lorg/apache/cordova/AccelListener;->status:I

    sget v3, Lorg/apache/cordova/AccelListener;->RUNNING:I

    if-ne v2, v3, :cond_0

    .line 104
    invoke-direct {p0}, Lorg/apache/cordova/AccelListener;->stop()V

    goto :goto_0

    .line 108
    :cond_2
    const/4 v1, 0x0

    goto :goto_1
.end method

.method public initialize(Lorg/apache/cordova/api/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V
    .locals 2
    .param p1, "cordova"    # Lorg/apache/cordova/api/CordovaInterface;
    .param p2, "webView"    # Lorg/apache/cordova/CordovaWebView;

    .prologue
    .line 81
    invoke-super {p0, p1, p2}, Lorg/apache/cordova/api/CordovaPlugin;->initialize(Lorg/apache/cordova/api/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V

    .line 82
    invoke-interface {p1}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "sensor"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/SensorManager;

    iput-object v0, p0, Lorg/apache/cordova/AccelListener;->sensorManager:Landroid/hardware/SensorManager;

    .line 83
    return-void
.end method

.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 2
    .param p1, "sensor"    # Landroid/hardware/Sensor;
    .param p2, "accuracy"    # I

    .prologue
    .line 198
    invoke-virtual {p1}, Landroid/hardware/Sensor;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 207
    :cond_0
    :goto_0
    return-void

    .line 203
    :cond_1
    iget v0, p0, Lorg/apache/cordova/AccelListener;->status:I

    sget v1, Lorg/apache/cordova/AccelListener;->STOPPED:I

    if-eq v0, v1, :cond_0

    .line 206
    iput p2, p0, Lorg/apache/cordova/AccelListener;->accuracy:I

    goto :goto_0
.end method

.method public onDestroy()V
    .locals 0

    .prologue
    .line 122
    invoke-direct {p0}, Lorg/apache/cordova/AccelListener;->stop()V

    .line 123
    return-void
.end method

.method public onReset()V
    .locals 2

    .prologue
    .line 243
    iget v0, p0, Lorg/apache/cordova/AccelListener;->status:I

    sget v1, Lorg/apache/cordova/AccelListener;->RUNNING:I

    if-ne v0, v1, :cond_0

    .line 244
    invoke-direct {p0}, Lorg/apache/cordova/AccelListener;->stop()V

    .line 246
    :cond_0
    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 4
    .param p1, "event"    # Landroid/hardware/SensorEvent;

    .prologue
    const/4 v3, 0x2

    const/4 v2, 0x1

    .line 216
    iget-object v0, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    invoke-virtual {v0}, Landroid/hardware/Sensor;->getType()I

    move-result v0

    if-eq v0, v2, :cond_1

    .line 236
    :cond_0
    :goto_0
    return-void

    .line 221
    :cond_1
    iget v0, p0, Lorg/apache/cordova/AccelListener;->status:I

    sget v1, Lorg/apache/cordova/AccelListener;->STOPPED:I

    if-eq v0, v1, :cond_0

    .line 224
    sget v0, Lorg/apache/cordova/AccelListener;->RUNNING:I

    invoke-direct {p0, v0}, Lorg/apache/cordova/AccelListener;->setStatus(I)V

    .line 226
    iget v0, p0, Lorg/apache/cordova/AccelListener;->accuracy:I

    if-lt v0, v3, :cond_0

    .line 229
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lorg/apache/cordova/AccelListener;->timestamp:J

    .line 230
    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    iput v0, p0, Lorg/apache/cordova/AccelListener;->x:F

    .line 231
    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    aget v0, v0, v2

    iput v0, p0, Lorg/apache/cordova/AccelListener;->y:F

    .line 232
    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    aget v0, v0, v3

    iput v0, p0, Lorg/apache/cordova/AccelListener;->z:F

    .line 234
    invoke-direct {p0}, Lorg/apache/cordova/AccelListener;->win()V

    goto :goto_0
.end method
