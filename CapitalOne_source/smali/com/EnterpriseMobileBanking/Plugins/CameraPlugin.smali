.class public Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;
.super Lorg/apache/cordova/api/Plugin;
.source "CameraPlugin.java"


# static fields
.field private static final COF_REQUEST_CODE:I = 0x7cf

.field private static final FORCE_MANUAL_CAPTURE_AFTER_PREVEW:Ljava/lang/String; = "ForceManualCaptureAfterPreview"

.field private static final MEGAPIXEL_MIN:I = 0x2

.field private static final MISNAP_AUTO_CAPTURE_MODE:Ljava/lang/String; = "2"

.field private static final MISNAP_AUTO_CAPTURE_MODE_INT:I = 0x2

.field private static final MISNAP_MANUAL_CAPTURE_MODE:Ljava/lang/String; = "1"

.field private static final PREVIEW_REQUEST_CODE:I = 0x54bc4a

.field private static final REQUEST_CODE:I = 0x3e7

.field private static final TAG:Ljava/lang/String; = "CameraPlugin"

.field private static lastArgs:Lorg/json/JSONArray;


# instance fields
.field private callbackId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 53
    const/4 v0, 0x0

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->lastArgs:Lorg/json/JSONArray;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Lorg/apache/cordova/api/Plugin;-><init>()V

    return-void
.end method

.method private checkForceManualCaptureOnImageRetake(Lorg/json/JSONObject;Lorg/json/JSONObject;)V
    .locals 2
    .param p1, "readFrom"    # Lorg/json/JSONObject;
    .param p2, "writeTo"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 459
    const-string v0, "ForceManualCaptureAfterPreview"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 461
    const-string v0, "CaptureMode"

    const-string v1, "1"

    invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 463
    :cond_0
    return-void
.end method

.method private customizeUI(Lorg/json/JSONObject;)V
    .locals 2
    .param p1, "intentData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 439
    const-string v0, "AnimationRectangleColor"

    const-string v1, "BA1223"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 440
    const-string v0, "AnimationRectangleCornerRadius"

    const-string v1, "7"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 441
    const-string v0, "TutorialBackgroundColor"

    const-string v1, "000000"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 442
    const-string v0, "TutorialBackgroundColorFailoverToStillCamera"

    const-string v1, "000000"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 443
    const-string v0, "TutorialBackgroundColorFirstTimeUser"

    const-string v1, "000000"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 444
    const-string v0, "TutorialBackgroundColorStillCamera"

    const-string v1, "000000"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 445
    const-string v0, "TutorialBackgroundColorStillCameraFirstTimeUser"

    const-string v1, "000000"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 446
    const-string v0, "ButtonFirstTimeTutorialContinue"

    const-string v1, "Continue"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 447
    return-void
.end method

.method private defaultParamsFromMiSnap(Lorg/json/JSONObject;)V
    .locals 2
    .param p1, "intentData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 428
    const-string v0, "CameraMaxTimeouts"

    const-string v1, "0"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 429
    const-string v0, "RequiredCompressionLevel"

    const-string v1, "50"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 430
    const-string v0, "CaptureMode"

    const-string v1, "2"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 431
    const-string v0, "CameraInitialTimeoutInSeconds"

    const-string v1, "20"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 432
    const-string v0, "TutorialBrandNewUserDuration"

    const-string v1, "3000"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 433
    const-string v0, "CameraTimeoutInSeconds"

    const-string v1, "30"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 434
    return-void
.end method

.method private encodeAndSendSuccess(Landroid/content/Intent;)V
    .locals 4
    .param p1, "data"    # Landroid/content/Intent;

    .prologue
    .line 271
    const-string v2, "com.miteksystems.misnap.PICTURE"

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    move-result-object v1

    .line 272
    .local v1, "rawImageData":[B
    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    .line 273
    .local v0, "encodedData":Ljava/lang/String;
    const-string v2, "CameraPlugin"

    invoke-static {v2, v0}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    new-instance v2, Lorg/apache/cordova/api/PluginResult;

    sget-object v3, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v2, v3, v0}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->callbackId:Ljava/lang/String;

    invoke-virtual {p0, v2, v3}, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->success(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V

    .line 275
    return-void
.end method

.method private useMiSnapCamera(Ljava/lang/String;Lorg/json/JSONArray;)Z
    .locals 21
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "args"    # Lorg/json/JSONArray;

    .prologue
    .line 322
    if-nez p1, :cond_0

    .line 324
    const/16 v18, 0x0

    .line 422
    :goto_0
    return v18

    .line 327
    :cond_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    .line 328
    .local v6, "featureToggle":Ljava/lang/String;
    const-string v18, "misnap"

    move-object/from16 v0, v18

    invoke-static {v0, v6}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v18

    if-eqz v18, :cond_e

    .line 330
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 333
    .local v8, "intentData":Lorg/json/JSONObject;
    const/16 v18, 0x0

    :try_start_0
    move-object/from16 v0, p2

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v11

    .line 334
    .local v11, "jsonObj":Lorg/json/JSONObject;
    if-eqz v11, :cond_b

    .line 336
    const-string v18, "label"

    move-object/from16 v0, v18

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 337
    .local v13, "label":Ljava/lang/String;
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v18

    if-eqz v18, :cond_1

    .line 338
    const-string v18, "orient"

    move-object/from16 v0, v18

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 340
    :cond_1
    const/4 v15, 0x0

    .line 341
    .local v15, "options":Lorg/json/JSONObject;
    const-string v18, "options"

    move-object/from16 v0, v18

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 342
    .local v16, "optionsString":Ljava/lang/String;
    invoke-static/range {v16 .. v16}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v18

    if-nez v18, :cond_2

    .line 343
    new-instance v15, Lorg/json/JSONObject;

    .end local v15    # "options":Lorg/json/JSONObject;
    invoke-direct/range {v15 .. v16}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 345
    .restart local v15    # "options":Lorg/json/JSONObject;
    :cond_2
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v18

    if-nez v18, :cond_3

    .line 348
    invoke-virtual {v13}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v13

    .line 349
    const-string v18, "front"

    move-object/from16 v0, v18

    invoke-virtual {v13, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v18

    if-eqz v18, :cond_5

    .line 351
    const-string v18, "Name"

    const-string v19, "CheckFront"

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 352
    const-string v18, "TextCheckFrontPrompt"

    const-string v19, ""

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 353
    if-nez v15, :cond_3

    .line 354
    const-string v18, "CameraSharpness"

    const-string v19, "600"

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 368
    :cond_3
    :goto_1
    if-eqz v15, :cond_c

    .line 370
    invoke-virtual {v15}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v9

    .line 371
    .local v9, "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    :cond_4
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_6

    .line 373
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    .line 374
    .local v12, "key":Ljava/lang/String;
    const-string v18, "exceptions"

    move-object/from16 v0, v18

    invoke-virtual {v12, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v18

    if-nez v18, :cond_4

    .line 375
    invoke-virtual {v15, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-virtual {v8, v12, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_2

    .line 411
    .end local v9    # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    .end local v11    # "jsonObj":Lorg/json/JSONObject;
    .end local v12    # "key":Ljava/lang/String;
    .end local v13    # "label":Ljava/lang/String;
    .end local v15    # "options":Lorg/json/JSONObject;
    .end local v16    # "optionsString":Ljava/lang/String;
    :catch_0
    move-exception v10

    .line 413
    .local v10, "je":Lorg/json/JSONException;
    const/16 v18, 0x0

    goto/16 :goto_0

    .line 357
    .end local v10    # "je":Lorg/json/JSONException;
    .restart local v11    # "jsonObj":Lorg/json/JSONObject;
    .restart local v13    # "label":Ljava/lang/String;
    .restart local v15    # "options":Lorg/json/JSONObject;
    .restart local v16    # "optionsString":Ljava/lang/String;
    :cond_5
    const-string v18, "back"

    move-object/from16 v0, v18

    invoke-virtual {v13, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v18

    if-eqz v18, :cond_3

    .line 359
    const-string v18, "Name"

    const-string v19, "CheckBack"

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 360
    const-string v18, "TextCheckBackPrompt"

    const-string v19, ""

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 361
    if-nez v15, :cond_3

    .line 362
    const-string v18, "CameraSharpness"

    const-string v19, "100"

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    .line 379
    .restart local v9    # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    :cond_6
    const-string v18, "exceptions"

    move-object/from16 v0, v18

    invoke-virtual {v15, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    .line 380
    .local v5, "exceptions":Lorg/json/JSONArray;
    const/16 v17, 0x1

    .line 381
    .local v17, "videoModeOn":Z
    const/4 v7, 0x0

    .local v7, "i":I
    :goto_3
    if-eqz v5, :cond_8

    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v18

    :goto_4
    move/from16 v0, v18

    if-ge v7, v0, :cond_9

    .line 385
    :try_start_1
    invoke-virtual {v5, v7}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 386
    .local v4, "exception":Ljava/lang/String;
    sget-object v18, Landroid/os/Build;->MODEL:Ljava/lang/String;

    move-object/from16 v0, v18

    invoke-virtual {v0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v18

    if-eqz v18, :cond_7

    .line 388
    const-string v18, "CaptureMode"

    const-string v19, "1"

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 389
    const/16 v17, 0x0

    .line 381
    .end local v4    # "exception":Ljava/lang/String;
    :cond_7
    :goto_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_8
    const/16 v18, 0x0

    goto :goto_4

    .line 391
    :catch_1
    move-exception v3

    .line 392
    .local v3, "e":Lorg/json/JSONException;
    :try_start_2
    const-string v18, "CameraPlugin"

    new-instance v19, Ljava/lang/StringBuilder;

    invoke-direct/range {v19 .. v19}, Ljava/lang/StringBuilder;-><init>()V

    const-string v20, "Can\'t get JSONObeject from exception item: "

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    move-object/from16 v0, v19

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v18 .. v19}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    .line 395
    .end local v3    # "e":Lorg/json/JSONException;
    :cond_9
    if-eqz v17, :cond_a

    .line 396
    const-string v18, "CaptureMode"

    const-string v19, "2"

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 406
    .end local v5    # "exceptions":Lorg/json/JSONArray;
    .end local v7    # "i":I
    .end local v9    # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    .end local v17    # "videoModeOn":Z
    :cond_a
    :goto_6
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->customizeUI(Lorg/json/JSONObject;)V

    .line 407
    move-object/from16 v0, p0

    invoke-direct {v0, v11, v8}, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->checkForceManualCaptureOnImageRetake(Lorg/json/JSONObject;Lorg/json/JSONObject;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 415
    .end local v13    # "label":Ljava/lang/String;
    .end local v15    # "options":Lorg/json/JSONObject;
    .end local v16    # "optionsString":Ljava/lang/String;
    :cond_b
    const-string v18, "CameraPlugin"

    const-string v19, "Starting MiSnap Activity."

    invoke-static/range {v18 .. v19}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 416
    new-instance v14, Landroid/content/Intent;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->ctx:Lorg/apache/cordova/api/LegacyContext;

    move-object/from16 v18, v0

    invoke-virtual/range {v18 .. v18}, Lorg/apache/cordova/api/LegacyContext;->getApplicationContext()Landroid/content/Context;

    move-result-object v18

    const-class v19, Lcom/miteksystems/misnap/MiSnap;

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-direct {v14, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 417
    .local v14, "miSnapIntent":Landroid/content/Intent;
    const-string v18, "com.miteksystems.misnap.JobSettings"

    invoke-virtual {v8}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v19

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-virtual {v14, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 418
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->ctx:Lorg/apache/cordova/api/LegacyContext;

    move-object/from16 v18, v0

    const/16 v19, 0x3

    move-object/from16 v0, v18

    move-object/from16 v1, p0

    move/from16 v2, v19

    invoke-virtual {v0, v1, v14, v2}, Lorg/apache/cordova/api/LegacyContext;->startActivityForResult(Lorg/apache/cordova/api/CordovaPlugin;Landroid/content/Intent;I)V

    .line 419
    const/16 v18, 0x1

    goto/16 :goto_0

    .line 399
    .end local v14    # "miSnapIntent":Landroid/content/Intent;
    .restart local v13    # "label":Ljava/lang/String;
    .restart local v15    # "options":Lorg/json/JSONObject;
    .restart local v16    # "optionsString":Ljava/lang/String;
    :cond_c
    :try_start_3
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->defaultParamsFromMiSnap(Lorg/json/JSONObject;)V

    .line 401
    sget-object v18, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v19, "Nexus 4"

    invoke-virtual/range {v18 .. v19}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v18

    if-nez v18, :cond_d

    sget-object v18, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v19, "XT1032"

    invoke-virtual/range {v18 .. v19}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v18

    if-eqz v18, :cond_a

    .line 403
    :cond_d
    const-string v18, "CaptureMode"

    const-string v19, "1"

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_6

    .line 422
    .end local v8    # "intentData":Lorg/json/JSONObject;
    .end local v11    # "jsonObj":Lorg/json/JSONObject;
    .end local v13    # "label":Ljava/lang/String;
    .end local v15    # "options":Lorg/json/JSONObject;
    .end local v16    # "optionsString":Ljava/lang/String;
    :cond_e
    const/16 v18, 0x0

    goto/16 :goto_0
.end method


# virtual methods
.method public checkCamera(Ljava/lang/String;)Lorg/apache/cordova/api/PluginResult;
    .locals 12
    .param p1, "cbId"    # Ljava/lang/String;

    .prologue
    .line 283
    new-instance v8, Lorg/apache/cordova/api/PluginResult;

    sget-object v9, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v8, v9}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    .line 285
    .local v8, "result":Lorg/apache/cordova/api/PluginResult;
    invoke-static {}, Landroid/hardware/Camera;->open()Landroid/hardware/Camera;

    move-result-object v1

    .line 286
    .local v1, "cam":Landroid/hardware/Camera;
    if-eqz v1, :cond_3

    .line 287
    invoke-virtual {v1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v7

    .line 288
    .local v7, "parameters":Landroid/hardware/Camera$Parameters;
    invoke-virtual {v7}, Landroid/hardware/Camera$Parameters;->getSupportedPictureSizes()Ljava/util/List;

    move-result-object v6

    .line 289
    .local v6, "pList":Ljava/util/List;, "Ljava/util/List<Landroid/hardware/Camera$Size;>;"
    const/4 v0, 0x0

    .line 290
    .local v0, "bMeetsCriteria":Z
    const/4 v3, 0x0

    .local v3, "i":I
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v5

    .local v5, "n":I
    :goto_0
    if-ge v3, v5, :cond_0

    .line 291
    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/hardware/Camera$Size;

    .line 292
    .local v2, "cs":Landroid/hardware/Camera$Size;
    iget v9, v2, Landroid/hardware/Camera$Size;->height:I

    iget v10, v2, Landroid/hardware/Camera$Size;->width:I

    mul-int/2addr v9, v10

    const v10, 0xfa000

    div-int v4, v9, v10

    .line 293
    .local v4, "megPixel":I
    const-string v9, "CameraPlugin"

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Megapixel="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 294
    const/4 v9, 0x2

    if-lt v4, v9, :cond_1

    .line 295
    const/4 v0, 0x1

    .line 299
    .end local v2    # "cs":Landroid/hardware/Camera$Size;
    .end local v4    # "megPixel":I
    :cond_0
    invoke-virtual {v1}, Landroid/hardware/Camera;->release()V

    .line 300
    if-eqz v0, :cond_2

    .line 301
    invoke-virtual {p0, v8, p1}, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->success(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V

    .line 310
    .end local v0    # "bMeetsCriteria":Z
    .end local v3    # "i":I
    .end local v5    # "n":I
    .end local v6    # "pList":Ljava/util/List;, "Ljava/util/List<Landroid/hardware/Camera$Size;>;"
    .end local v7    # "parameters":Landroid/hardware/Camera$Parameters;
    :goto_1
    return-object v8

    .line 290
    .restart local v0    # "bMeetsCriteria":Z
    .restart local v2    # "cs":Landroid/hardware/Camera$Size;
    .restart local v3    # "i":I
    .restart local v4    # "megPixel":I
    .restart local v5    # "n":I
    .restart local v6    # "pList":Ljava/util/List;, "Ljava/util/List<Landroid/hardware/Camera$Size;>;"
    .restart local v7    # "parameters":Landroid/hardware/Camera$Parameters;
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 303
    .end local v2    # "cs":Landroid/hardware/Camera$Size;
    .end local v4    # "megPixel":I
    :cond_2
    new-instance v8, Lorg/apache/cordova/api/PluginResult;

    .end local v8    # "result":Lorg/apache/cordova/api/PluginResult;
    sget-object v9, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    const-string v10, "megapixel too low"

    invoke-direct {v8, v9, v10}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    .line 304
    .restart local v8    # "result":Lorg/apache/cordova/api/PluginResult;
    invoke-virtual {p0, v8, p1}, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->error(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V

    goto :goto_1

    .line 307
    .end local v0    # "bMeetsCriteria":Z
    .end local v3    # "i":I
    .end local v5    # "n":I
    .end local v6    # "pList":Ljava/util/List;, "Ljava/util/List<Landroid/hardware/Camera$Size;>;"
    .end local v7    # "parameters":Landroid/hardware/Camera$Parameters;
    :cond_3
    new-instance v8, Lorg/apache/cordova/api/PluginResult;

    .end local v8    # "result":Lorg/apache/cordova/api/PluginResult;
    sget-object v9, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v8, v9}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    .line 308
    .restart local v8    # "result":Lorg/apache/cordova/api/PluginResult;
    invoke-virtual {p0, v8, p1}, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->error(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V

    goto :goto_1
.end method

.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)Lorg/apache/cordova/api/PluginResult;
    .locals 8
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "args"    # Lorg/json/JSONArray;
    .param p3, "callbackId"    # Ljava/lang/String;

    .prologue
    .line 57
    const-string v5, "CameraPlugin"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Action: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    iput-object p3, p0, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->callbackId:Ljava/lang/String;

    .line 61
    sput-object p2, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->lastArgs:Lorg/json/JSONArray;

    .line 63
    const-string v5, "checkCamera"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 65
    invoke-virtual {p0, p3}, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->checkCamera(Ljava/lang/String;)Lorg/apache/cordova/api/PluginResult;

    move-result-object v4

    .line 101
    :goto_0
    return-object v4

    .line 69
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->useMiSnapCamera(Ljava/lang/String;Lorg/json/JSONArray;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 71
    new-instance v1, Landroid/content/Intent;

    iget-object v5, p0, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->ctx:Lorg/apache/cordova/api/LegacyContext;

    invoke-virtual {v5}, Lorg/apache/cordova/api/LegacyContext;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    const-class v6, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    invoke-direct {v1, v5, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 74
    .local v1, "cameraIntent":Landroid/content/Intent;
    :try_start_0
    const-string v5, "label"

    const/4 v6, 0x0

    invoke-virtual {p2, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    const-string v7, "label"

    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    :goto_1
    const/4 v0, 0x0

    .line 84
    .local v0, "bLob":Z
    const/4 v5, 0x0

    :try_start_1
    invoke-virtual {p2, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    const-string v6, "lob"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    const-string v6, "bank"

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v5

    if-eqz v5, :cond_1

    .line 85
    const/4 v0, 0x1

    .line 90
    :cond_1
    :goto_2
    if-eqz v0, :cond_3

    .line 91
    const/16 v3, 0x7cf

    .line 96
    .local v3, "reqCode":I
    :goto_3
    iget-object v5, p0, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->ctx:Lorg/apache/cordova/api/LegacyContext;

    invoke-virtual {v5, p0, v1, v3}, Lorg/apache/cordova/api/LegacyContext;->startActivityForResult(Lorg/apache/cordova/api/CordovaPlugin;Landroid/content/Intent;I)V

    .line 99
    .end local v0    # "bLob":Z
    .end local v1    # "cameraIntent":Landroid/content/Intent;
    .end local v3    # "reqCode":I
    :cond_2
    new-instance v4, Lorg/apache/cordova/api/PluginResult;

    sget-object v5, Lorg/apache/cordova/api/PluginResult$Status;->NO_RESULT:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v4, v5}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    .line 100
    .local v4, "result":Lorg/apache/cordova/api/PluginResult;
    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Lorg/apache/cordova/api/PluginResult;->setKeepCallback(Z)V

    goto :goto_0

    .line 75
    .end local v4    # "result":Lorg/apache/cordova/api/PluginResult;
    .restart local v1    # "cameraIntent":Landroid/content/Intent;
    :catch_0
    move-exception v2

    .line 76
    .local v2, "e":Lorg/json/JSONException;
    const-string v5, "CameraPlugin"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Error getting label: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v2}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    const-string v5, "label"

    const-string v6, ""

    invoke-virtual {v1, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_1

    .line 93
    .end local v2    # "e":Lorg/json/JSONException;
    .restart local v0    # "bLob":Z
    :cond_3
    const/16 v3, 0x3e7

    .restart local v3    # "reqCode":I
    goto :goto_3

    .line 87
    .end local v3    # "reqCode":I
    :catch_1
    move-exception v5

    goto :goto_2
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 15
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    .line 106
    invoke-super/range {p0 .. p3}, Lorg/apache/cordova/api/Plugin;->onActivityResult(IILandroid/content/Intent;)V

    .line 108
    const-string v12, "CameraPlugin"

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "onActivityResult(requestCode="

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    move/from16 v0, p1

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, ", resultCode="

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    move/from16 v0, p2

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, ")"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    const v12, 0x54bc4a

    move/from16 v0, p1

    if-ne v0, v12, :cond_3

    .line 112
    const v12, 0x631198

    move/from16 v0, p2

    if-ne v0, v12, :cond_1

    .line 115
    move-object/from16 v0, p3

    invoke-direct {p0, v0}, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->encodeAndSendSuccess(Landroid/content/Intent;)V

    .line 262
    :cond_0
    :goto_0
    return-void

    .line 125
    :cond_1
    sget-object v12, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->lastArgs:Lorg/json/JSONArray;

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v9

    .line 126
    .local v9, "obj":Lorg/json/JSONObject;
    if-eqz v9, :cond_2

    .line 131
    :try_start_0
    const-string v12, "ForceManualCaptureAfterPreview"

    const/4 v13, 0x1

    invoke-virtual {v9, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 138
    :cond_2
    :goto_1
    const-string v12, "misnap"

    sget-object v13, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->lastArgs:Lorg/json/JSONArray;

    invoke-direct {p0, v12, v13}, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->useMiSnapCamera(Ljava/lang/String;Lorg/json/JSONArray;)Z

    goto :goto_0

    .line 141
    .end local v9    # "obj":Lorg/json/JSONObject;
    :cond_3
    const/4 v12, 0x3

    move/from16 v0, p1

    if-ne v0, v12, :cond_d

    .line 143
    const/4 v12, -0x1

    move/from16 v0, p2

    if-ne v0, v12, :cond_8

    .line 145
    if-eqz p3, :cond_7

    .line 147
    const-string v12, "com.miteksystems.misnap.ResultCode"

    move-object/from16 v0, p3

    invoke-virtual {v0, v12}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 148
    .local v6, "miSnapResultCode":Ljava/lang/String;
    const-string v12, "SuccessVideo"

    invoke-virtual {v12, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    const-string v12, "SuccessStillCamera"

    invoke-virtual {v12, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_0

    .line 151
    :cond_4
    const-string v12, "CameraPlugin"

    const-string v13, "MiSnap acquired an image successfully."

    invoke-static {v12, v13}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    const-string v12, "com.miteksystems.misnap.MIBI_DATA"

    move-object/from16 v0, p3

    invoke-virtual {v0, v12}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 153
    .local v7, "mibiDataString":Ljava/lang/String;
    const-string v12, "CameraPlugin"

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "MIBI Data:  "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    const/4 v2, 0x0

    .line 158
    .local v2, "autocapture":Z
    :try_start_1
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 159
    .local v8, "mibiJson":Lorg/json/JSONObject;
    const-string v12, "CaptureMode"

    invoke-virtual {v8, v12}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    move-result v12

    const/4 v13, 0x2

    if-ne v12, v13, :cond_5

    const/4 v2, 0x1

    .line 166
    .end local v8    # "mibiJson":Lorg/json/JSONObject;
    :goto_2
    const-string v12, "CameraPlugin"

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Autocapture:  "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    if-nez v2, :cond_6

    .line 170
    new-instance v10, Landroid/content/Intent;

    iget-object v12, p0, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->ctx:Lorg/apache/cordova/api/LegacyContext;

    invoke-virtual {v12}, Lorg/apache/cordova/api/LegacyContext;->getApplicationContext()Landroid/content/Context;

    move-result-object v12

    const-class v13, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;

    invoke-direct {v10, v12, v13}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 171
    .local v10, "previewIntent":Landroid/content/Intent;
    move-object/from16 v0, p3

    invoke-virtual {v10, v0}, Landroid/content/Intent;->putExtras(Landroid/content/Intent;)Landroid/content/Intent;

    .line 172
    iget-object v12, p0, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->ctx:Lorg/apache/cordova/api/LegacyContext;

    const v13, 0x54bc4a

    invoke-virtual {v12, p0, v10, v13}, Lorg/apache/cordova/api/LegacyContext;->startActivityForResult(Lorg/apache/cordova/api/CordovaPlugin;Landroid/content/Intent;I)V

    goto/16 :goto_0

    .line 159
    .end local v10    # "previewIntent":Landroid/content/Intent;
    .restart local v8    # "mibiJson":Lorg/json/JSONObject;
    :cond_5
    const/4 v2, 0x0

    goto :goto_2

    .line 161
    .end local v8    # "mibiJson":Lorg/json/JSONObject;
    :catch_0
    move-exception v3

    .line 163
    .local v3, "e":Lorg/json/JSONException;
    const-string v12, "CameraPlugin"

    const-string v13, "Unable to parse JSON object from MIBI data."

    invoke-static {v12, v13}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 177
    .end local v3    # "e":Lorg/json/JSONException;
    :cond_6
    move-object/from16 v0, p3

    invoke-direct {p0, v0}, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->encodeAndSendSuccess(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 183
    .end local v2    # "autocapture":Z
    .end local v6    # "miSnapResultCode":Ljava/lang/String;
    .end local v7    # "mibiDataString":Ljava/lang/String;
    :cond_7
    const-string v12, "CameraPlugin"

    const-string v13, "MiSnap activity canceled by user."

    invoke-static {v12, v13}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 186
    :cond_8
    if-nez p2, :cond_0

    .line 189
    if-nez p3, :cond_9

    const/4 v11, 0x0

    .line 190
    .local v11, "result":Ljava/lang/String;
    :goto_3
    const-string v12, "CameraPlugin"

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "In RESULT_CANCELED block with result = "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lcom/EnterpriseMobileBanking/Utils/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    const-string v12, "CameraNotSufficient"

    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    .line 194
    const-string v12, "CameraPlugin"

    const-string v13, "Camera not sufficient for use with MiSnap."

    invoke-static {v12, v13}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    new-instance v12, Lorg/apache/cordova/api/PluginResult;

    sget-object v13, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    const v14, 0x7f090152

    invoke-static {v14}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v14

    invoke-direct {v12, v13, v14}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    iget-object v13, p0, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->callbackId:Ljava/lang/String;

    invoke-virtual {p0, v12, v13}, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->error(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 189
    .end local v11    # "result":Ljava/lang/String;
    :cond_9
    const-string v12, "com.miteksystems.misnap.ResultCode"

    move-object/from16 v0, p3

    invoke-virtual {v0, v12}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    goto :goto_3

    .line 197
    .restart local v11    # "result":Ljava/lang/String;
    :cond_a
    const-string v12, "VideoCaptureFailed"

    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    .line 200
    const-string v12, "CameraPlugin"

    const-string v13, "MiSnap failed to capture video."

    invoke-static {v12, v13}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    new-instance v12, Lorg/apache/cordova/api/PluginResult;

    sget-object v13, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    const v14, 0x7f090153

    invoke-static {v14}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v14

    invoke-direct {v12, v13, v14}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    iget-object v13, p0, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->callbackId:Ljava/lang/String;

    invoke-virtual {p0, v12, v13}, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->error(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 203
    :cond_b
    const-string v12, "Cancelled"

    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_c

    .line 206
    const-string v12, "CameraPlugin"

    const-string v13, "MiSnap canceled.  This can happen if the user hits the back button."

    invoke-static {v12, v13}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 211
    :cond_c
    const-string v12, "CameraPlugin"

    const-string v13, "MiSnap has crashed and/or stopped working."

    invoke-static {v12, v13}, Lcom/EnterpriseMobileBanking/Utils/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 215
    .end local v11    # "result":Ljava/lang/String;
    :cond_d
    const/16 v12, 0x3e7

    move/from16 v0, p1

    if-eq v0, v12, :cond_e

    const/16 v12, 0x7cf

    move/from16 v0, p1

    if-ne v0, v12, :cond_0

    .line 218
    :cond_e
    const/16 v12, 0x7cf

    move/from16 v0, p1

    if-ne v0, v12, :cond_f

    .line 219
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getApplicationLink()Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    move-result-object v12

    const/4 v13, 0x1

    invoke-virtual {v12, v13}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setSplashSuppress(Z)V

    .line 221
    :cond_f
    if-eqz p3, :cond_13

    .line 223
    const-string v12, "errorCode"

    const/4 v13, 0x0

    move-object/from16 v0, p3

    invoke-virtual {v0, v12, v13}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    .line 224
    .local v4, "errorCode":I
    if-eqz v4, :cond_11

    .line 226
    const/16 v12, 0x7cf

    move/from16 v0, p1

    if-ne v0, v12, :cond_10

    .line 229
    new-instance v11, Lorg/apache/cordova/api/PluginResult;

    sget-object v12, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "RDC Error: "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-direct {v11, v12, v13}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    .line 236
    .local v11, "result":Lorg/apache/cordova/api/PluginResult;
    :goto_4
    iget-object v12, p0, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->callbackId:Ljava/lang/String;

    invoke-virtual {p0, v11, v12}, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->error(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 234
    .end local v11    # "result":Lorg/apache/cordova/api/PluginResult;
    :cond_10
    new-instance v11, Lorg/apache/cordova/api/PluginResult;

    sget-object v12, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    const-string v13, "no camera available"

    invoke-direct {v11, v12, v13}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    .restart local v11    # "result":Lorg/apache/cordova/api/PluginResult;
    goto :goto_4

    .line 239
    .end local v11    # "result":Lorg/apache/cordova/api/PluginResult;
    :cond_11
    const-string v12, "RDCImage"

    move-object/from16 v0, p3

    invoke-virtual {v0, v12}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    move-result-object v1

    .line 240
    .local v1, "arr":[B
    if-nez v1, :cond_12

    .line 242
    new-instance v11, Lorg/apache/cordova/api/PluginResult;

    sget-object v12, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    const v13, 0x7f09014d

    invoke-static {v13}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v13

    invoke-direct {v11, v12, v13}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    .line 243
    .restart local v11    # "result":Lorg/apache/cordova/api/PluginResult;
    iget-object v12, p0, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->callbackId:Ljava/lang/String;

    invoke-virtual {p0, v11, v12}, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->error(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 247
    .end local v11    # "result":Lorg/apache/cordova/api/PluginResult;
    :cond_12
    const/4 v12, 0x2

    invoke-static {v1, v12}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v5

    .line 249
    .local v5, "jsOutput":Ljava/lang/String;
    const-string v12, "CameraPlugin"

    invoke-static {v12, v5}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    new-instance v12, Lorg/apache/cordova/api/PluginResult;

    sget-object v13, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v12, v13, v5}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    iget-object v13, p0, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->callbackId:Ljava/lang/String;

    invoke-virtual {p0, v12, v13}, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->success(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 259
    .end local v1    # "arr":[B
    .end local v4    # "errorCode":I
    .end local v5    # "jsOutput":Ljava/lang/String;
    :cond_13
    const-string v12, "INGDirectApp.hideBusyIndicator();"

    invoke-virtual {p0, v12}, Lcom/EnterpriseMobileBanking/Plugins/CameraPlugin;->sendJavascript(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 133
    .restart local v9    # "obj":Lorg/json/JSONObject;
    :catch_1
    move-exception v12

    goto/16 :goto_1
.end method
