.class final Lcom/google/zxing/client/android/camera/CameraConfigurationManager;
.super Ljava/lang/Object;
.source "CameraConfigurationManager.java"


# static fields
.field private static final MAX_PREVIEW_PIXELS:I = 0xfa000

.field private static final MIN_PREVIEW_PIXELS:I = 0x24b80

.field private static final TAG:Ljava/lang/String; = "CameraConfiguration"


# instance fields
.field private cameraResolution:Landroid/graphics/Point;

.field private final context:Landroid/content/Context;

.field private screenResolution:Landroid/graphics/Point;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Lcom/google/zxing/client/android/camera/CameraConfigurationManager;->context:Landroid/content/Context;

    .line 56
    return-void
.end method

.method private doSetTorch(Landroid/hardware/Camera$Parameters;ZZ)V
    .locals 6
    .param p1, "parameters"    # Landroid/hardware/Camera$Parameters;
    .param p2, "newSetting"    # Z
    .param p3, "safeMode"    # Z

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 167
    if-eqz p2, :cond_1

    .line 168
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    .line 169
    const-string v3, "torch"

    aput-object v3, v2, v4

    .line 170
    const-string v3, "on"

    aput-object v3, v2, v5

    .line 168
    invoke-static {v1, v2}, Lcom/google/zxing/client/android/camera/CameraConfigurationManager;->findSettableValue(Ljava/util/Collection;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 175
    .local v0, "flashMode":Ljava/lang/String;
    :goto_0
    if-eqz v0, :cond_0

    .line 176
    invoke-virtual {p1, v0}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    .line 188
    :cond_0
    return-void

    .line 172
    .end local v0    # "flashMode":Ljava/lang/String;
    :cond_1
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;

    move-result-object v1

    new-array v2, v5, [Ljava/lang/String;

    .line 173
    const-string v3, "off"

    aput-object v3, v2, v4

    .line 172
    invoke-static {v1, v2}, Lcom/google/zxing/client/android/camera/CameraConfigurationManager;->findSettableValue(Ljava/util/Collection;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .restart local v0    # "flashMode":Ljava/lang/String;
    goto :goto_0
.end method

.method private findBestPreviewSizeValue(Landroid/hardware/Camera$Parameters;Landroid/graphics/Point;)Landroid/graphics/Point;
    .locals 22
    .param p1, "parameters"    # Landroid/hardware/Camera$Parameters;
    .param p2, "screenResolution"    # Landroid/graphics/Point;

    .prologue
    .line 192
    invoke-virtual/range {p1 .. p1}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewSizes()Ljava/util/List;

    move-result-object v13

    .line 193
    .local v13, "rawSupportedSizes":Ljava/util/List;, "Ljava/util/List<Landroid/hardware/Camera$Size;>;"
    if-nez v13, :cond_0

    .line 194
    const-string v19, "CameraConfiguration"

    const-string v20, "Device returned no supported preview sizes; using default"

    invoke-static/range {v19 .. v20}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 195
    invoke-virtual/range {p1 .. p1}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;

    move-result-object v4

    .line 196
    .local v4, "defaultSize":Landroid/hardware/Camera$Size;
    new-instance v6, Landroid/graphics/Point;

    iget v0, v4, Landroid/hardware/Camera$Size;->width:I

    move/from16 v19, v0

    iget v0, v4, Landroid/hardware/Camera$Size;->height:I

    move/from16 v20, v0

    move/from16 v0, v19

    move/from16 v1, v20

    invoke-direct {v6, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 259
    .end local v4    # "defaultSize":Landroid/hardware/Camera$Size;
    :goto_0
    return-object v6

    .line 200
    :cond_0
    new-instance v18, Ljava/util/ArrayList;

    move-object/from16 v0, v18

    invoke-direct {v0, v13}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 201
    .local v18, "supportedPreviewSizes":Ljava/util/List;, "Ljava/util/List<Landroid/hardware/Camera$Size;>;"
    new-instance v19, Lcom/google/zxing/client/android/camera/CameraConfigurationManager$1;

    move-object/from16 v0, v19

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/google/zxing/client/android/camera/CameraConfigurationManager$1;-><init>(Lcom/google/zxing/client/android/camera/CameraConfigurationManager;)V

    invoke-static/range {v18 .. v19}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 216
    const-string v19, "CameraConfiguration"

    const/16 v20, 0x4

    invoke-static/range {v19 .. v20}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v19

    if-eqz v19, :cond_1

    .line 217
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 218
    .local v12, "previewSizesString":Ljava/lang/StringBuilder;
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_1
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-nez v20, :cond_4

    .line 222
    const-string v19, "CameraConfiguration"

    new-instance v20, Ljava/lang/StringBuilder;

    const-string v21, "Supported preview sizes: "

    invoke-direct/range {v20 .. v21}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v19 .. v20}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 225
    .end local v12    # "previewSizesString":Ljava/lang/StringBuilder;
    :cond_1
    const/4 v3, 0x0

    .line 226
    .local v3, "bestSize":Landroid/graphics/Point;
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/Point;->x:I

    move/from16 v19, v0

    move/from16 v0, v19

    int-to-float v0, v0

    move/from16 v19, v0

    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/Point;->y:I

    move/from16 v20, v0

    move/from16 v0, v20

    int-to-float v0, v0

    move/from16 v20, v0

    div-float v16, v19, v20

    .line 228
    .local v16, "screenAspectRatio":F
    const/high16 v5, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 229
    .local v5, "diff":F
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :cond_2
    :goto_2
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-nez v20, :cond_5

    .line 252
    if-nez v3, :cond_3

    .line 253
    invoke-virtual/range {p1 .. p1}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;

    move-result-object v4

    .line 254
    .restart local v4    # "defaultSize":Landroid/hardware/Camera$Size;
    new-instance v3, Landroid/graphics/Point;

    .end local v3    # "bestSize":Landroid/graphics/Point;
    iget v0, v4, Landroid/hardware/Camera$Size;->width:I

    move/from16 v19, v0

    iget v0, v4, Landroid/hardware/Camera$Size;->height:I

    move/from16 v20, v0

    move/from16 v0, v19

    move/from16 v1, v20

    invoke-direct {v3, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 255
    .restart local v3    # "bestSize":Landroid/graphics/Point;
    const-string v19, "CameraConfiguration"

    new-instance v20, Ljava/lang/StringBuilder;

    const-string v21, "No suitable preview sizes, using default: "

    invoke-direct/range {v20 .. v21}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v19 .. v20}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 258
    .end local v4    # "defaultSize":Landroid/hardware/Camera$Size;
    :cond_3
    const-string v19, "CameraConfiguration"

    new-instance v20, Ljava/lang/StringBuilder;

    const-string v21, "Found best approximate preview size: "

    invoke-direct/range {v20 .. v21}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v19 .. v20}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    move-object v6, v3

    .line 259
    goto/16 :goto_0

    .line 218
    .end local v3    # "bestSize":Landroid/graphics/Point;
    .end local v5    # "diff":F
    .end local v16    # "screenAspectRatio":F
    .restart local v12    # "previewSizesString":Ljava/lang/StringBuilder;
    :cond_4
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Landroid/hardware/Camera$Size;

    .line 219
    .local v17, "supportedPreviewSize":Landroid/hardware/Camera$Size;
    move-object/from16 v0, v17

    iget v0, v0, Landroid/hardware/Camera$Size;->width:I

    move/from16 v20, v0

    move/from16 v0, v20

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v20

    const/16 v21, 0x78

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v20

    .line 220
    move-object/from16 v0, v17

    iget v0, v0, Landroid/hardware/Camera$Size;->height:I

    move/from16 v21, v0

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v20

    const/16 v21, 0x20

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_1

    .line 229
    .end local v12    # "previewSizesString":Ljava/lang/StringBuilder;
    .end local v17    # "supportedPreviewSize":Landroid/hardware/Camera$Size;
    .restart local v3    # "bestSize":Landroid/graphics/Point;
    .restart local v5    # "diff":F
    .restart local v16    # "screenAspectRatio":F
    :cond_5
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Landroid/hardware/Camera$Size;

    .line 230
    .restart local v17    # "supportedPreviewSize":Landroid/hardware/Camera$Size;
    move-object/from16 v0, v17

    iget v15, v0, Landroid/hardware/Camera$Size;->width:I

    .line 231
    .local v15, "realWidth":I
    move-object/from16 v0, v17

    iget v14, v0, Landroid/hardware/Camera$Size;->height:I

    .line 232
    .local v14, "realHeight":I
    mul-int v11, v15, v14

    .line 233
    .local v11, "pixels":I
    const v20, 0x24b80

    move/from16 v0, v20

    if-lt v11, v0, :cond_2

    const v20, 0xfa000

    move/from16 v0, v20

    if-gt v11, v0, :cond_2

    .line 236
    if-ge v15, v14, :cond_6

    const/4 v7, 0x1

    .line 237
    .local v7, "isCandidatePortrait":Z
    :goto_3
    if-eqz v7, :cond_7

    move v9, v14

    .line 238
    .local v9, "maybeFlippedWidth":I
    :goto_4
    if-eqz v7, :cond_8

    move v8, v15

    .line 239
    .local v8, "maybeFlippedHeight":I
    :goto_5
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/Point;->x:I

    move/from16 v20, v0

    move/from16 v0, v20

    if-ne v9, v0, :cond_9

    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/Point;->y:I

    move/from16 v20, v0

    move/from16 v0, v20

    if-ne v8, v0, :cond_9

    .line 240
    new-instance v6, Landroid/graphics/Point;

    invoke-direct {v6, v15, v14}, Landroid/graphics/Point;-><init>(II)V

    .line 241
    .local v6, "exactPoint":Landroid/graphics/Point;
    const-string v19, "CameraConfiguration"

    new-instance v20, Ljava/lang/StringBuilder;

    const-string v21, "Found preview size exactly matching screen size: "

    invoke-direct/range {v20 .. v21}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v19 .. v20}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 236
    .end local v6    # "exactPoint":Landroid/graphics/Point;
    .end local v7    # "isCandidatePortrait":Z
    .end local v8    # "maybeFlippedHeight":I
    .end local v9    # "maybeFlippedWidth":I
    :cond_6
    const/4 v7, 0x0

    goto :goto_3

    .restart local v7    # "isCandidatePortrait":Z
    :cond_7
    move v9, v15

    .line 237
    goto :goto_4

    .restart local v9    # "maybeFlippedWidth":I
    :cond_8
    move v8, v14

    .line 238
    goto :goto_5

    .line 244
    .restart local v8    # "maybeFlippedHeight":I
    :cond_9
    int-to-float v0, v9

    move/from16 v20, v0

    int-to-float v0, v8

    move/from16 v21, v0

    div-float v2, v20, v21

    .line 245
    .local v2, "aspectRatio":F
    sub-float v20, v2, v16

    invoke-static/range {v20 .. v20}, Ljava/lang/Math;->abs(F)F

    move-result v10

    .line 246
    .local v10, "newDiff":F
    cmpg-float v20, v10, v5

    if-gez v20, :cond_2

    .line 247
    new-instance v3, Landroid/graphics/Point;

    .end local v3    # "bestSize":Landroid/graphics/Point;
    invoke-direct {v3, v15, v14}, Landroid/graphics/Point;-><init>(II)V

    .line 248
    .restart local v3    # "bestSize":Landroid/graphics/Point;
    move v5, v10

    goto/16 :goto_2
.end method

.method private static varargs findSettableValue(Ljava/util/Collection;[Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p1, "desiredValues"    # [Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/String;",
            ">;[",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 264
    .local p0, "supportedValues":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    const-string v2, "CameraConfiguration"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Supported values: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 265
    const/4 v1, 0x0

    .line 266
    .local v1, "result":Ljava/lang/String;
    if-eqz p0, :cond_0

    .line 267
    array-length v3, p1

    const/4 v2, 0x0

    :goto_0
    if-lt v2, v3, :cond_1

    .line 274
    :cond_0
    :goto_1
    const-string v2, "CameraConfiguration"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Settable value: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 275
    return-object v1

    .line 267
    :cond_1
    aget-object v0, p1, v2

    .line 268
    .local v0, "desiredValue":Ljava/lang/String;
    invoke-interface {p0, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 269
    move-object v1, v0

    .line 270
    goto :goto_1

    .line 267
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method

.method private initializeTorch(Landroid/hardware/Camera$Parameters;Landroid/content/SharedPreferences;Z)V
    .locals 3
    .param p1, "parameters"    # Landroid/hardware/Camera$Parameters;
    .param p2, "prefs"    # Landroid/content/SharedPreferences;
    .param p3, "safeMode"    # Z

    .prologue
    .line 161
    invoke-static {p2}, Lcom/google/zxing/client/android/camera/FrontLightMode;->readPref(Landroid/content/SharedPreferences;)Lcom/google/zxing/client/android/camera/FrontLightMode;

    move-result-object v1

    sget-object v2, Lcom/google/zxing/client/android/camera/FrontLightMode;->ON:Lcom/google/zxing/client/android/camera/FrontLightMode;

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    .line 162
    .local v0, "currentSetting":Z
    :goto_0
    invoke-direct {p0, p1, v0, p3}, Lcom/google/zxing/client/android/camera/CameraConfigurationManager;->doSetTorch(Landroid/hardware/Camera$Parameters;ZZ)V

    .line 163
    return-void

    .line 161
    .end local v0    # "currentSetting":Z
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method getCameraResolution()Landroid/graphics/Point;
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/google/zxing/client/android/camera/CameraConfigurationManager;->cameraResolution:Landroid/graphics/Point;

    return-object v0
.end method

.method getScreenResolution()Landroid/graphics/Point;
    .locals 1

    .prologue
    .line 138
    iget-object v0, p0, Lcom/google/zxing/client/android/camera/CameraConfigurationManager;->screenResolution:Landroid/graphics/Point;

    return-object v0
.end method

.method getTorchState(Landroid/hardware/Camera;)Z
    .locals 4
    .param p1, "camera"    # Landroid/hardware/Camera;

    .prologue
    const/4 v2, 0x0

    .line 142
    if-eqz p1, :cond_1

    .line 143
    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v1

    .line 144
    .local v1, "parameters":Landroid/hardware/Camera$Parameters;
    if-eqz v1, :cond_1

    .line 145
    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v3

    invoke-virtual {v3}, Landroid/hardware/Camera$Parameters;->getFlashMode()Ljava/lang/String;

    move-result-object v0

    .line 146
    .local v0, "flashMode":Ljava/lang/String;
    if-eqz v0, :cond_1

    .line 147
    const-string v3, "on"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 148
    const-string v3, "torch"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 146
    :cond_0
    const/4 v2, 0x1

    .line 151
    .end local v0    # "flashMode":Ljava/lang/String;
    .end local v1    # "parameters":Landroid/hardware/Camera$Parameters;
    :cond_1
    return v2
.end method

.method initFromCameraParameters(Landroid/hardware/Camera;)V
    .locals 9
    .param p1, "camera"    # Landroid/hardware/Camera;

    .prologue
    .line 62
    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v3

    .line 63
    .local v3, "parameters":Landroid/hardware/Camera$Parameters;
    iget-object v6, p0, Lcom/google/zxing/client/android/camera/CameraConfigurationManager;->context:Landroid/content/Context;

    const-string v7, "window"

    invoke-virtual {v6, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/WindowManager;

    .line 64
    .local v2, "manager":Landroid/view/WindowManager;
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 65
    .local v0, "display":Landroid/view/Display;
    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v5

    .line 66
    .local v5, "width":I
    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v1

    .line 69
    .local v1, "height":I
    if-ge v5, v1, :cond_0

    .line 70
    const-string v6, "CameraConfiguration"

    const-string v7, "Display reports portrait orientation; assuming this is incorrect"

    invoke-static {v6, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    move v4, v5

    .line 72
    .local v4, "temp":I
    move v5, v1

    .line 73
    move v1, v4

    .line 75
    .end local v4    # "temp":I
    :cond_0
    new-instance v6, Landroid/graphics/Point;

    invoke-direct {v6, v5, v1}, Landroid/graphics/Point;-><init>(II)V

    iput-object v6, p0, Lcom/google/zxing/client/android/camera/CameraConfigurationManager;->screenResolution:Landroid/graphics/Point;

    .line 76
    const-string v6, "CameraConfiguration"

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Screen resolution: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v8, p0, Lcom/google/zxing/client/android/camera/CameraConfigurationManager;->screenResolution:Landroid/graphics/Point;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 77
    iget-object v6, p0, Lcom/google/zxing/client/android/camera/CameraConfigurationManager;->screenResolution:Landroid/graphics/Point;

    invoke-direct {p0, v3, v6}, Lcom/google/zxing/client/android/camera/CameraConfigurationManager;->findBestPreviewSizeValue(Landroid/hardware/Camera$Parameters;Landroid/graphics/Point;)Landroid/graphics/Point;

    move-result-object v6

    iput-object v6, p0, Lcom/google/zxing/client/android/camera/CameraConfigurationManager;->cameraResolution:Landroid/graphics/Point;

    .line 78
    const-string v6, "CameraConfiguration"

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Camera resolution: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v8, p0, Lcom/google/zxing/client/android/camera/CameraConfigurationManager;->cameraResolution:Landroid/graphics/Point;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    return-void
.end method

.method setDesiredCameraParameters(Landroid/hardware/Camera;Z)V
    .locals 10
    .param p1, "camera"    # Landroid/hardware/Camera;
    .param p2, "safeMode"    # Z

    .prologue
    const/4 v9, 0x2

    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 82
    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v2

    .line 84
    .local v2, "parameters":Landroid/hardware/Camera$Parameters;
    if-nez v2, :cond_0

    .line 85
    const-string v4, "CameraConfiguration"

    const-string v5, "Device error: no camera parameters are available. Proceeding without configuration."

    invoke-static {v4, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 131
    :goto_0
    return-void

    .line 89
    :cond_0
    const-string v4, "CameraConfiguration"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Initial camera parameters: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->flatten()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 91
    if-eqz p2, :cond_1

    .line 92
    const-string v4, "CameraConfiguration"

    const-string v5, "In camera config safe mode -- most settings will not be honored"

    invoke-static {v4, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 95
    :cond_1
    iget-object v4, p0, Lcom/google/zxing/client/android/camera/CameraConfigurationManager;->context:Landroid/content/Context;

    invoke-static {v4}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 97
    .local v3, "prefs":Landroid/content/SharedPreferences;
    invoke-direct {p0, v2, v3, p2}, Lcom/google/zxing/client/android/camera/CameraConfigurationManager;->initializeTorch(Landroid/hardware/Camera$Parameters;Landroid/content/SharedPreferences;Z)V

    .line 99
    const/4 v1, 0x0

    .line 100
    .local v1, "focusMode":Ljava/lang/String;
    const-string v4, "preferences_auto_focus"

    invoke-interface {v3, v4, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 101
    if-nez p2, :cond_2

    const-string v4, "preferences_disable_continuous_focus"

    invoke-interface {v3, v4, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 102
    :cond_2
    invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getSupportedFocusModes()Ljava/util/List;

    move-result-object v4

    new-array v5, v8, [Ljava/lang/String;

    .line 103
    const-string v6, "auto"

    aput-object v6, v5, v7

    .line 102
    invoke-static {v4, v5}, Lcom/google/zxing/client/android/camera/CameraConfigurationManager;->findSettableValue(Ljava/util/Collection;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 112
    :cond_3
    :goto_1
    if-nez p2, :cond_4

    if-nez v1, :cond_4

    .line 113
    invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getSupportedFocusModes()Ljava/util/List;

    move-result-object v4

    new-array v5, v9, [Ljava/lang/String;

    .line 114
    const-string v6, "macro"

    aput-object v6, v5, v7

    .line 115
    const-string v6, "edof"

    aput-object v6, v5, v8

    .line 113
    invoke-static {v4, v5}, Lcom/google/zxing/client/android/camera/CameraConfigurationManager;->findSettableValue(Ljava/util/Collection;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 117
    :cond_4
    if-eqz v1, :cond_5

    .line 118
    invoke-virtual {v2, v1}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    .line 121
    :cond_5
    const-string v4, "preferences_invert_scan"

    invoke-interface {v3, v4, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 122
    invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getSupportedColorEffects()Ljava/util/List;

    move-result-object v4

    new-array v5, v8, [Ljava/lang/String;

    .line 123
    const-string v6, "negative"

    aput-object v6, v5, v7

    .line 122
    invoke-static {v4, v5}, Lcom/google/zxing/client/android/camera/CameraConfigurationManager;->findSettableValue(Ljava/util/Collection;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 124
    .local v0, "colorMode":Ljava/lang/String;
    if-eqz v0, :cond_6

    .line 125
    invoke-virtual {v2, v0}, Landroid/hardware/Camera$Parameters;->setColorEffect(Ljava/lang/String;)V

    .line 129
    .end local v0    # "colorMode":Ljava/lang/String;
    :cond_6
    iget-object v4, p0, Lcom/google/zxing/client/android/camera/CameraConfigurationManager;->cameraResolution:Landroid/graphics/Point;

    iget v4, v4, Landroid/graphics/Point;->x:I

    iget-object v5, p0, Lcom/google/zxing/client/android/camera/CameraConfigurationManager;->cameraResolution:Landroid/graphics/Point;

    iget v5, v5, Landroid/graphics/Point;->y:I

    invoke-virtual {v2, v4, v5}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V

    .line 130
    invoke-virtual {p1, v2}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    goto/16 :goto_0

    .line 105
    :cond_7
    invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getSupportedFocusModes()Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/String;

    .line 106
    const-string v6, "continuous-picture"

    aput-object v6, v5, v7

    .line 107
    const-string v6, "continuous-video"

    aput-object v6, v5, v8

    .line 108
    const-string v6, "auto"

    aput-object v6, v5, v9

    .line 105
    invoke-static {v4, v5}, Lcom/google/zxing/client/android/camera/CameraConfigurationManager;->findSettableValue(Ljava/util/Collection;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1
.end method

.method setTorch(Landroid/hardware/Camera;Z)V
    .locals 2
    .param p1, "camera"    # Landroid/hardware/Camera;
    .param p2, "newSetting"    # Z

    .prologue
    .line 155
    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    .line 156
    .local v0, "parameters":Landroid/hardware/Camera$Parameters;
    const/4 v1, 0x0

    invoke-direct {p0, v0, p2, v1}, Lcom/google/zxing/client/android/camera/CameraConfigurationManager;->doSetTorch(Landroid/hardware/Camera$Parameters;ZZ)V

    .line 157
    invoke-virtual {p1, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 158
    return-void
.end method
