.class public Lcom/localytics/android/LocalyticsAmpSession;
.super Lcom/localytics/android/LocalyticsSession;
.source "LocalyticsAmpSession.java"


# static fields
.field private static final PUSH_API_URL_TEMPLATE:Ljava/lang/String; = "http://pushapi.localytics.com/push_test?platform=android&type=prod&campaign=%s&creative=%s&token=%s&install_id=%s"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 52
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/localytics/android/LocalyticsAmpSession;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 53
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "key"    # Ljava/lang/String;

    .prologue
    .line 67
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/localytics/android/LocalyticsAmpSession;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    return-void
.end method

.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "key"    # Ljava/lang/String;
    .param p3, "referrerID"    # Ljava/lang/String;

    .prologue
    .line 83
    invoke-direct {p0, p1, p2, p3}, Lcom/localytics/android/LocalyticsSession;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    sget-object v0, Lcom/localytics/android/LocalyticsAmpSession;->sSessionHandlerThread:Landroid/os/HandlerThread;

    const-class v1, Lcom/localytics/android/AmpSessionHandler;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/HandlerThread;->setName(Ljava/lang/String;)V

    .line 89
    invoke-direct {p0, p1}, Lcom/localytics/android/LocalyticsAmpSession;->createLocalyticsDirectory(Landroid/content/Context;)Z

    .line 90
    return-void
.end method

.method private createLocalyticsDirectory(Landroid/content/Context;)Z
    .locals 3
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 327
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 335
    .local v0, "builder":Ljava/lang/StringBuilder;
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    const-string v2, ".localytics"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    new-instance v1, Ljava/io/File;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 342
    .local v1, "dir":Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-nez v2, :cond_0

    .line 344
    const/4 v2, 0x0

    .line 347
    :goto_0
    return v2

    :cond_0
    const/4 v2, 0x1

    goto :goto_0
.end method

.method public static isTestModeEnabled()Z
    .locals 1

    .prologue
    .line 303
    invoke-static {}, Lcom/localytics/android/AmpConstants;->isTestModeEnabled()Z

    move-result v0

    return v0
.end method

.method private static scaleDownBitmap(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;
    .locals 7
    .param p0, "source"    # Landroid/graphics/Bitmap;
    .param p1, "maxSide"    # F

    .prologue
    const/4 v6, 0x1

    const/high16 v5, 0x3f000000    # 0.5f

    .line 265
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 266
    .local v1, "largerSide":I
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    int-to-float v4, v4

    div-float v0, v3, v4

    .line 269
    .local v0, "aspectRatio":F
    int-to-float v3, v1

    cmpl-float v3, v3, p1

    if-lez v3, :cond_2

    .line 271
    const/4 v2, 0x0

    .line 272
    .local v2, "scaledDown":Landroid/graphics/Bitmap;
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    if-lt v3, v4, :cond_1

    .line 274
    float-to-int v3, p1

    div-float v4, p1, v0

    add-float/2addr v4, v5

    float-to-int v4, v4

    invoke-static {p0, v3, v4, v6}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 281
    :goto_0
    if-nez v2, :cond_0

    .line 283
    sget-boolean v3, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v3, :cond_0

    .line 285
    const-string v3, "Localytics"

    const-string v4, "Cannot scale down the new dismiss button image."

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 293
    .end local v2    # "scaledDown":Landroid/graphics/Bitmap;
    :cond_0
    :goto_1
    return-object v2

    .line 278
    .restart local v2    # "scaledDown":Landroid/graphics/Bitmap;
    :cond_1
    mul-float v3, p1, v0

    add-float/2addr v3, v5

    float-to-int v3, v3

    float-to-int v4, p1

    invoke-static {p0, v3, v4, v6}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v2

    goto :goto_0

    .end local v2    # "scaledDown":Landroid/graphics/Bitmap;
    :cond_2
    move-object v2, p0

    .line 293
    goto :goto_1
.end method

.method public static setDismissButtonImage(Landroid/content/res/Resources;I)V
    .locals 7
    .param p0, "resources"    # Landroid/content/res/Resources;
    .param p1, "id"    # I

    .prologue
    const/4 v6, 0x1

    .line 197
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 198
    .local v2, "options":Landroid/graphics/BitmapFactory$Options;
    iput-boolean v6, v2, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    .line 199
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v4, v2, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 200
    invoke-static {p0, p1, v2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 201
    .local v3, "source":Landroid/graphics/Bitmap;
    if-nez v3, :cond_1

    .line 203
    sget-boolean v4, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v4, :cond_0

    .line 205
    const-string v4, "Localytics"

    const-string v5, "Cannot load the new dismiss button image. Is the resource id corrected?"

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 207
    :cond_0
    const/4 v4, 0x0

    invoke-static {v4}, Lcom/localytics/android/AmpDialogFragment;->setDismissButtonImage(Landroid/graphics/Bitmap;)V

    .line 223
    :goto_0
    return-void

    .line 212
    :cond_1
    const/high16 v4, 0x42200000    # 40.0f

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    invoke-static {v6, v4, v5}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    .line 213
    .local v0, "maxSide":F
    invoke-static {v3, v0}, Lcom/localytics/android/LocalyticsAmpSession;->scaleDownBitmap(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 216
    .local v1, "newImage":Landroid/graphics/Bitmap;
    if-eq v1, v3, :cond_2

    .line 218
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    .line 219
    const/4 v3, 0x0

    .line 222
    :cond_2
    invoke-static {v1}, Lcom/localytics/android/AmpDialogFragment;->setDismissButtonImage(Landroid/graphics/Bitmap;)V

    goto :goto_0
.end method

.method public static setDismissButtonImage(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    .locals 5
    .param p0, "resources"    # Landroid/content/res/Resources;
    .param p1, "image"    # Landroid/graphics/Bitmap;

    .prologue
    .line 233
    const/4 v1, 0x0

    .line 235
    .local v1, "newImage":Landroid/graphics/Bitmap;
    if-eqz p1, :cond_0

    .line 238
    const/4 v2, 0x1

    const/high16 v3, 0x42200000    # 40.0f

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    invoke-static {v2, v3, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    .line 239
    .local v0, "maxSide":F
    invoke-static {p1, v0}, Lcom/localytics/android/LocalyticsAmpSession;->scaleDownBitmap(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 242
    if-ne v1, p1, :cond_0

    .line 244
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 248
    .end local v0    # "maxSide":F
    :cond_0
    invoke-static {v1}, Lcom/localytics/android/AmpDialogFragment;->setDismissButtonImage(Landroid/graphics/Bitmap;)V

    .line 249
    return-void
.end method

.method public static setTestModeEnabled(Z)V
    .locals 0
    .param p0, "enabled"    # Z

    .prologue
    .line 316
    invoke-static {p0}, Lcom/localytics/android/AmpConstants;->setTestModeEnabled(Z)V

    .line 317
    return-void
.end method


# virtual methods
.method public ampTrigger(Ljava/lang/String;)V
    .locals 1
    .param p1, "eventName"    # Ljava/lang/String;

    .prologue
    .line 116
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/localytics/android/LocalyticsAmpSession;->ampTrigger(Ljava/lang/String;Ljava/util/Map;)V

    .line 117
    return-void
.end method

.method public ampTrigger(Ljava/lang/String;Ljava/util/Map;)V
    .locals 12
    .param p1, "eventName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p2, "attributes":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const/4 v11, 0x2

    const/4 v10, 0x1

    const/4 v9, 0x0

    .line 131
    const-string v0, "%s:%s"

    new-array v1, v11, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/localytics/android/LocalyticsAmpSession;->mContext:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v9

    aput-object p1, v1, v10

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 133
    .local v3, "eventString":Ljava/lang/String;
    new-instance v5, Ljava/util/TreeMap;

    invoke-direct {v5}, Ljava/util/TreeMap;-><init>()V

    .line 135
    .local v5, "remappedAttributes":Ljava/util/TreeMap;, "Ljava/util/TreeMap<Ljava/lang/String;Ljava/lang/String;>;"
    if-eqz p2, :cond_0

    .line 137
    iget-object v0, p0, Lcom/localytics/android/LocalyticsAmpSession;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v8

    .line 138
    .local v8, "packageName":Ljava/lang/String;
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    .local v7, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 140
    .local v6, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v0, "%s:%s"

    new-array v1, v11, [Ljava/lang/Object;

    aput-object v8, v1, v9

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v1, v10

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 144
    .end local v6    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v7    # "i$":Ljava/util/Iterator;
    .end local v8    # "packageName":Ljava/lang/String;
    :cond_0
    invoke-virtual {p0}, Lcom/localytics/android/LocalyticsAmpSession;->getSessionHandler()Lcom/localytics/android/SessionHandler;

    move-result-object v2

    check-cast v2, Lcom/localytics/android/AmpSessionHandler;

    .line 145
    .local v2, "handler":Lcom/localytics/android/AmpSessionHandler;
    const/4 v9, 0x4

    new-instance v0, Lcom/localytics/android/LocalyticsAmpSession$2;

    move-object v1, p0

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/localytics/android/LocalyticsAmpSession$2;-><init>(Lcom/localytics/android/LocalyticsAmpSession;Lcom/localytics/android/AmpSessionHandler;Ljava/lang/String;Ljava/util/Map;Ljava/util/TreeMap;)V

    invoke-virtual {v2, v9, v0}, Lcom/localytics/android/AmpSessionHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/localytics/android/AmpSessionHandler;->sendMessage(Landroid/os/Message;)Z

    .line 152
    return-void
.end method

.method public attach(Landroid/support/v4/app/FragmentActivity;)V
    .locals 3
    .param p1, "activity"    # Landroid/support/v4/app/FragmentActivity;

    .prologue
    .line 163
    if-nez p1, :cond_0

    .line 165
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "attached activity cannot be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 168
    :cond_0
    invoke-virtual {p0}, Lcom/localytics/android/LocalyticsAmpSession;->getSessionHandler()Lcom/localytics/android/SessionHandler;

    move-result-object v0

    check-cast v0, Lcom/localytics/android/AmpSessionHandler;

    .line 169
    .local v0, "handler":Lcom/localytics/android/AmpSessionHandler;
    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/localytics/android/AmpSessionHandler;->setFragmentManager(Landroid/support/v4/app/FragmentManager;)V

    .line 171
    invoke-static {}, Lcom/localytics/android/LocalyticsAmpSession;->isTestModeEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 173
    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Lcom/localytics/android/AmpSessionHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/localytics/android/AmpSessionHandler;->sendMessage(Landroid/os/Message;)Z

    .line 175
    :cond_1
    return-void
.end method

.method protected createSessionHandler(Landroid/content/Context;Ljava/lang/String;Landroid/os/Looper;)Lcom/localytics/android/SessionHandler;
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "key"    # Ljava/lang/String;
    .param p3, "looper"    # Landroid/os/Looper;

    .prologue
    .line 531
    new-instance v0, Lcom/localytics/android/AmpSessionHandler;

    invoke-direct {v0, p1, p2, p3}, Lcom/localytics/android/AmpSessionHandler;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Looper;)V

    return-object v0
.end method

.method public detach()V
    .locals 2

    .prologue
    .line 182
    invoke-virtual {p0}, Lcom/localytics/android/LocalyticsAmpSession;->getSessionHandler()Lcom/localytics/android/SessionHandler;

    move-result-object v0

    check-cast v0, Lcom/localytics/android/AmpSessionHandler;

    .line 183
    .local v0, "handler":Lcom/localytics/android/AmpSessionHandler;
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/localytics/android/AmpSessionHandler;->setFragmentManager(Landroid/support/v4/app/FragmentManager;)V

    .line 184
    return-void
.end method

.method public handleIntent(Landroid/content/Intent;)V
    .locals 1
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 360
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/localytics/android/LocalyticsAmpSession;->handleIntent(Landroid/content/Intent;Ljava/lang/String;)V

    .line 361
    return-void
.end method

.method public handleIntent(Landroid/content/Intent;Ljava/lang/String;)V
    .locals 12
    .param p1, "intent"    # Landroid/content/Intent;
    .param p2, "key"    # Ljava/lang/String;

    .prologue
    .line 374
    move-object v6, p2

    .line 376
    .local v6, "appKey":Ljava/lang/String;
    if-nez p1, :cond_0

    .line 378
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "intent cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 381
    :cond_0
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 383
    iget-object v0, p0, Lcom/localytics/android/LocalyticsAmpSession;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/localytics/android/DatapointHelper;->getLocalyticsAppKeyOrNull(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 385
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 387
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "key cannot be null or empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 391
    :cond_1
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v10

    .line 393
    .local v10, "uri":Landroid/net/Uri;
    if-eqz v10, :cond_2

    invoke-virtual {v10}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v10}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "amp"

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 519
    :cond_2
    :goto_0
    return-void

    .line 398
    :cond_3
    invoke-virtual {v10}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    .line 399
    .local v9, "path":Ljava/lang/String;
    invoke-virtual {v10}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v8

    .line 400
    .local v8, "host":Ljava/lang/String;
    const-string v0, "[/]"

    invoke-virtual {v9, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    .line 402
    .local v7, "components":[Ljava/lang/String;
    if-eqz v7, :cond_2

    array-length v0, v7

    if-eqz v0, :cond_2

    .line 407
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "testMode"

    invoke-virtual {v8, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 409
    const/4 v0, 0x0

    aget-object v0, v7, v0

    const-string v1, "enabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 411
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/localytics/android/LocalyticsAmpSession;->setTestModeEnabled(Z)V

    goto :goto_0

    .line 413
    :cond_4
    const/4 v0, 0x0

    aget-object v0, v7, v0

    const-string v1, "launch"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    aget-object v0, v7, v0

    const-string v1, "push"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 415
    const/4 v0, 0x2

    aget-object v4, v7, v0

    .line 416
    .local v4, "campaign":Ljava/lang/String;
    const/4 v0, 0x3

    aget-object v5, v7, v0

    .line 417
    .local v5, "creative":Ljava/lang/String;
    iget-object v0, p0, Lcom/localytics/android/LocalyticsAmpSession;->mContext:Landroid/content/Context;

    invoke-static {v0, v6}, Lcom/localytics/android/LocalyticsProvider;->getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/localytics/android/LocalyticsProvider;

    move-result-object v2

    .line 418
    .local v2, "provider":Lcom/localytics/android/LocalyticsProvider;
    move-object v3, v6

    .line 420
    .local v3, "apiKey":Ljava/lang/String;
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 422
    new-instance v0, Lcom/localytics/android/LocalyticsAmpSession$3;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/localytics/android/LocalyticsAmpSession$3;-><init>(Lcom/localytics/android/LocalyticsAmpSession;Lcom/localytics/android/LocalyticsProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/localytics/android/LocalyticsAmpSession$3;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0
.end method

.method protected uploadAnalytics()V
    .locals 3

    .prologue
    .line 98
    invoke-virtual {p0}, Lcom/localytics/android/LocalyticsAmpSession;->getSessionHandler()Lcom/localytics/android/SessionHandler;

    move-result-object v0

    check-cast v0, Lcom/localytics/android/AmpSessionHandler;

    .line 99
    .local v0, "handler":Lcom/localytics/android/AmpSessionHandler;
    const/4 v1, 0x4

    new-instance v2, Lcom/localytics/android/LocalyticsAmpSession$1;

    invoke-direct {v2, p0, v0}, Lcom/localytics/android/LocalyticsAmpSession$1;-><init>(Lcom/localytics/android/LocalyticsAmpSession;Lcom/localytics/android/AmpSessionHandler;)V

    invoke-virtual {v0, v1, v2}, Lcom/localytics/android/AmpSessionHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/localytics/android/AmpSessionHandler;->sendMessage(Landroid/os/Message;)Z

    .line 106
    return-void
.end method
