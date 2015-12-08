.class public Lcom/localytics/android/LocalyticsSession;
.super Ljava/lang/Object;
.source "LocalyticsSession.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/localytics/android/LocalyticsSession$ProfileDbAction;
    }
.end annotation


# static fields
.field static final CAMPAIGN_ID_ATTRIBUTE:Ljava/lang/String; = "Campaign ID"

.field static final CREATIVE_ID_ATTRIBUTE:Ljava/lang/String; = "Creative ID"

.field static final PUSH_OPENED_EVENT:Ljava/lang/String; = "Localytics Push Opened"

.field private static final sLocalyticsSessionHandlerMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/localytics/android/SessionHandler;",
            ">;"
        }
    .end annotation
.end field

.field private static final sLocalyticsSessionIntrinsicLock:[Ljava/lang/Object;

.field protected static final sSessionHandlerThread:Landroid/os/HandlerThread;


# instance fields
.field protected final mContext:Landroid/content/Context;

.field private final mSessionHandler:Lcom/localytics/android/SessionHandler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 148
    const-class v0, Lcom/localytics/android/SessionHandler;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/localytics/android/LocalyticsSession;->getHandlerThread(Ljava/lang/String;)Landroid/os/HandlerThread;

    move-result-object v0

    sput-object v0, Lcom/localytics/android/LocalyticsSession;->sSessionHandlerThread:Landroid/os/HandlerThread;

    .line 174
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/localytics/android/LocalyticsSession;->sLocalyticsSessionHandlerMap:Ljava/util/Map;

    .line 179
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    sput-object v0, Lcom/localytics/android/LocalyticsSession;->sLocalyticsSessionIntrinsicLock:[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 248
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/localytics/android/LocalyticsSession;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 249
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "key"    # Ljava/lang/String;

    .prologue
    .line 263
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/localytics/android/LocalyticsSession;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    return-void
.end method

.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "key"    # Ljava/lang/String;
    .param p3, "referrerID"    # Ljava/lang/String;

    .prologue
    const/4 v6, 0x0

    .line 278
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 279
    if-nez p1, :cond_0

    .line 281
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "context cannot be null"

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 284
    :cond_0
    move-object v0, p2

    .line 285
    .local v0, "appKey":Ljava/lang/String;
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 287
    invoke-static {p1}, Lcom/localytics/android/DatapointHelper;->getLocalyticsAppKeyOrNull(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 290
    :cond_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 292
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "key cannot be null or empty"

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 301
    :cond_2
    const-string v2, "com.localytics.android"

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "android.test.IsolatedContext"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "android.test.RenamingDelegatingContext"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 304
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "context.getPackageName() returned %s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 318
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "android.test.RenamingDelegatingContext"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    sget v2, Lcom/localytics/android/Constants;->CURRENT_API_LEVEL:I

    const/16 v3, 0x8

    if-lt v2, v3, :cond_4

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    .end local p1    # "context":Landroid/content/Context;
    :cond_4
    iput-object p1, p0, Lcom/localytics/android/LocalyticsSession;->mContext:Landroid/content/Context;

    .line 320
    sget-object v3, Lcom/localytics/android/LocalyticsSession;->sLocalyticsSessionIntrinsicLock:[Ljava/lang/Object;

    monitor-enter v3

    .line 322
    :try_start_0
    sget-object v2, Lcom/localytics/android/LocalyticsSession;->sLocalyticsSessionHandlerMap:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/localytics/android/SessionHandler;

    .line 324
    .local v1, "handler":Lcom/localytics/android/SessionHandler;
    if-nez v1, :cond_5

    .line 326
    iget-object v2, p0, Lcom/localytics/android/LocalyticsSession;->mContext:Landroid/content/Context;

    sget-object v4, Lcom/localytics/android/LocalyticsSession;->sSessionHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v4}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-virtual {p0, v2, v0, v4}, Lcom/localytics/android/LocalyticsSession;->createSessionHandler(Landroid/content/Context;Ljava/lang/String;Landroid/os/Looper;)Lcom/localytics/android/SessionHandler;

    move-result-object v1

    .line 327
    sget-object v2, Lcom/localytics/android/LocalyticsSession;->sLocalyticsSessionHandlerMap:Ljava/util/Map;

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 335
    :cond_5
    const/4 v2, 0x0

    invoke-virtual {v1, v2, p3}, Lcom/localytics/android/SessionHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/localytics/android/SessionHandler;->sendMessage(Landroid/os/Message;)Z

    .line 337
    iput-object v1, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    .line 338
    monitor-exit v3

    .line 339
    return-void

    .line 338
    .end local v1    # "handler":Lcom/localytics/android/SessionHandler;
    :catchall_0
    move-exception v2

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2
.end method

.method private static convertDimensionsToAttributes(Ljava/util/List;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1274
    .local p0, "customDimensions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 1276
    .local v0, "attributes":Ljava/util/TreeMap;, "Ljava/util/TreeMap<Ljava/lang/String;Ljava/lang/String;>;"
    if-eqz p0, :cond_a

    .line 1278
    const/4 v3, 0x0

    .line 1279
    .local v3, "index":I
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 1281
    .local v1, "element":Ljava/lang/String;
    if-nez v3, :cond_1

    .line 1283
    sget-object v4, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_1:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1322
    :cond_0
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 1323
    goto :goto_0

    .line 1285
    :cond_1
    const/4 v4, 0x1

    if-ne v4, v3, :cond_2

    .line 1287
    sget-object v4, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_2:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 1289
    :cond_2
    const/4 v4, 0x2

    if-ne v4, v3, :cond_3

    .line 1291
    sget-object v4, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_3:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 1293
    :cond_3
    const/4 v4, 0x3

    if-ne v4, v3, :cond_4

    .line 1295
    sget-object v4, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_4:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 1297
    :cond_4
    const/4 v4, 0x4

    if-ne v4, v3, :cond_5

    .line 1299
    sget-object v4, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_5:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 1301
    :cond_5
    const/4 v4, 0x5

    if-ne v4, v3, :cond_6

    .line 1303
    sget-object v4, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_6:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 1305
    :cond_6
    const/4 v4, 0x6

    if-ne v4, v3, :cond_7

    .line 1307
    sget-object v4, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_7:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 1309
    :cond_7
    const/4 v4, 0x7

    if-ne v4, v3, :cond_8

    .line 1311
    sget-object v4, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_8:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 1313
    :cond_8
    const/16 v4, 0x8

    if-ne v4, v3, :cond_9

    .line 1315
    sget-object v4, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_9:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 1317
    :cond_9
    const/16 v4, 0x9

    if-ne v4, v3, :cond_0

    .line 1319
    sget-object v4, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_10:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 1326
    .end local v1    # "element":Ljava/lang/String;
    .end local v2    # "i$":Ljava/util/Iterator;
    .end local v3    # "index":I
    :cond_a
    return-object v0
.end method

.method public static createRangedAttribute(IIII)Ljava/lang/String;
    .locals 6
    .param p0, "actualValue"    # I
    .param p1, "minValue"    # I
    .param p2, "maxValue"    # I
    .param p3, "step"    # I

    .prologue
    const/4 v3, 0x0

    .line 1178
    const/4 v4, 0x1

    if-ge p3, v4, :cond_1

    .line 1180
    sget-boolean v4, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v4, :cond_0

    .line 1182
    const-string v4, "Localytics"

    const-string v5, "Step must not be less than zero.  Returning null."

    invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1202
    :cond_0
    :goto_0
    return-object v3

    .line 1186
    :cond_1
    if-lt p1, p2, :cond_2

    .line 1188
    sget-boolean v4, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v4, :cond_0

    .line 1190
    const-string v4, "Localytics"

    const-string v5, "maxValue must not be less than minValue.  Returning null."

    invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 1196
    :cond_2
    sub-int v3, p2, p1

    add-int/2addr v3, p3

    div-int v1, v3, p3

    .line 1197
    .local v1, "stepQuantity":I
    add-int/lit8 v3, v1, 0x1

    new-array v2, v3, [I

    .line 1198
    .local v2, "steps":[I
    const/4 v0, 0x0

    .local v0, "currentStep":I
    :goto_1
    if-gt v0, v1, :cond_3

    .line 1200
    mul-int v3, v0, p3

    add-int/2addr v3, p1

    aput v3, v2, v0

    .line 1198
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 1202
    :cond_3
    invoke-static {p0, v2}, Lcom/localytics/android/LocalyticsSession;->createRangedAttribute(I[I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0
.end method

.method public static createRangedAttribute(I[I)Ljava/lang/String;
    .locals 5
    .param p0, "actualValue"    # I
    .param p1, "steps"    # [I

    .prologue
    const/4 v4, 0x0

    .line 1219
    if-nez p1, :cond_0

    .line 1221
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "steps cannot be null"

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 1224
    :cond_0
    array-length v2, p1

    if-nez v2, :cond_1

    .line 1226
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "steps length must be greater than 0"

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 1229
    :cond_1
    const/4 v0, 0x0

    .line 1232
    .local v0, "bucket":Ljava/lang/String;
    aget v2, p1, v4

    if-ge p0, v2, :cond_2

    .line 1234
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "less than "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    aget v3, p1, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1260
    :goto_0
    return-object v0

    .line 1237
    :cond_2
    array-length v2, p1

    add-int/lit8 v2, v2, -0x1

    aget v2, p1, v2

    if-lt p0, v2, :cond_3

    .line 1239
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    array-length v3, p1

    add-int/lit8 v3, v3, -0x1

    aget v3, p1, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " and above"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1244
    :cond_3
    invoke-static {p1, p0}, Ljava/util/Arrays;->binarySearch([II)I

    move-result v1

    .line 1245
    .local v1, "bucketIndex":I
    if-gez v1, :cond_4

    .line 1249
    neg-int v2, v1

    add-int/lit8 v1, v2, -0x2

    .line 1251
    :cond_4
    aget v2, p1, v1

    add-int/lit8 v3, v1, 0x1

    aget v3, p1, v3

    add-int/lit8 v3, v3, -0x1

    if-ne v2, v3, :cond_5

    .line 1253
    aget v2, p1, v1

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1257
    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    aget v3, p1, v1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    aget v3, p1, v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static getAnalyticsURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1396
    sget-object v0, Lcom/localytics/android/Constants;->ANALYTICS_URL:Ljava/lang/String;

    return-object v0
.end method

.method private static getHandlerThread(Ljava/lang/String;)Landroid/os/HandlerThread;
    .locals 2
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 158
    new-instance v0, Landroid/os/HandlerThread;

    const/16 v1, 0xa

    invoke-direct {v0, p0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 160
    .local v0, "thread":Landroid/os/HandlerThread;
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 167
    return-object v0
.end method

.method public static getProfilesURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1416
    sget-object v0, Lcom/localytics/android/Constants;->PROFILES_URL:Ljava/lang/String;

    return-object v0
.end method

.method public static getSessionExpiration()J
    .locals 2

    .prologue
    .line 1386
    sget-wide v0, Lcom/localytics/android/Constants;->SESSION_EXPIRATION:J

    return-wide v0
.end method

.method public static isLoggingEnabled()Z
    .locals 1

    .prologue
    .line 1346
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    return v0
.end method

.method public static isUsingHttps()Z
    .locals 1

    .prologue
    .line 1366
    sget-boolean v0, Lcom/localytics/android/Constants;->USE_HTTPS:Z

    return v0
.end method

.method public static setAnalyticsURL(Ljava/lang/String;)V
    .locals 0
    .param p0, "url"    # Ljava/lang/String;

    .prologue
    .line 1406
    sput-object p0, Lcom/localytics/android/Constants;->ANALYTICS_URL:Ljava/lang/String;

    .line 1407
    return-void
.end method

.method public static setHttpsEnabled(Z)V
    .locals 0
    .param p0, "enabled"    # Z

    .prologue
    .line 1356
    sput-boolean p0, Lcom/localytics/android/Constants;->USE_HTTPS:Z

    .line 1357
    return-void
.end method

.method public static setLoggingEnabled(Z)V
    .locals 0
    .param p0, "enabled"    # Z

    .prologue
    .line 1336
    sput-boolean p0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    .line 1337
    return-void
.end method

.method public static setProfilesURL(Ljava/lang/String;)V
    .locals 0
    .param p0, "url"    # Ljava/lang/String;

    .prologue
    .line 1426
    sput-object p0, Lcom/localytics/android/Constants;->PROFILES_URL:Ljava/lang/String;

    .line 1427
    return-void
.end method

.method public static setSessionExpiration(J)V
    .locals 0
    .param p0, "expiration"    # J

    .prologue
    .line 1376
    sput-wide p0, Lcom/localytics/android/Constants;->SESSION_EXPIRATION:J

    .line 1377
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .prologue
    .line 447
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/localytics/android/LocalyticsSession;->close(Ljava/util/List;)V

    .line 448
    return-void
.end method

.method public close(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p1, "customDimensions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/16 v8, 0xa

    const/4 v7, 0x2

    .line 469
    if-eqz p1, :cond_4

    .line 475
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 477
    sget-boolean v2, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v2, :cond_0

    .line 479
    const-string v2, "Localytics"

    const-string v3, "customDimensions is empty.  Did the caller make an error?"

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 483
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-le v2, v8, :cond_1

    .line 485
    sget-boolean v2, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v2, :cond_1

    .line 487
    const-string v2, "Localytics"

    const-string v3, "customDimensions size is %d, exceeding the maximum size of %d.  Did the caller make an error?"

    new-array v4, v7, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 491
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 493
    .local v0, "element":Ljava/lang/String;
    if-nez v0, :cond_3

    .line 495
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "customDimensions cannot contain null elements"

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 497
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_2

    .line 499
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "customDimensions cannot contain empty elements"

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 505
    .end local v0    # "element":Ljava/lang/String;
    .end local v1    # "i$":Ljava/util/Iterator;
    :cond_4
    if-eqz p1, :cond_5

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 507
    :cond_5
    iget-object v2, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    invoke-virtual {v2, v7}, Lcom/localytics/android/SessionHandler;->sendEmptyMessage(I)Z

    .line 513
    :goto_0
    return-void

    .line 511
    :cond_6
    iget-object v2, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    iget-object v3, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    new-instance v4, Ljava/util/TreeMap;

    invoke-static {p1}, Lcom/localytics/android/LocalyticsSession;->convertDimensionsToAttributes(Ljava/util/List;)Ljava/util/Map;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v3, v7, v4}, Lcom/localytics/android/SessionHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/localytics/android/SessionHandler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0
.end method

.method protected createSessionHandler(Landroid/content/Context;Ljava/lang/String;Landroid/os/Looper;)Lcom/localytics/android/SessionHandler;
    .locals 8
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "appKey"    # Ljava/lang/String;
    .param p3, "looper"    # Landroid/os/Looper;

    .prologue
    .line 199
    const/4 v2, 0x0

    .line 202
    .local v2, "handler":Lcom/localytics/android/SessionHandler;
    :try_start_0
    const-string v4, "com.localytics.android.AmpSessionHandler"

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Class;

    const/4 v6, 0x0

    const-class v7, Landroid/content/Context;

    aput-object v7, v5, v6

    const/4 v6, 0x1

    const-class v7, Ljava/lang/String;

    aput-object v7, v5, v6

    const/4 v6, 0x2

    const-class v7, Landroid/os/Looper;

    aput-object v7, v5, v6

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object p1, v6, v7

    const/4 v7, 0x1

    aput-object p2, v6, v7

    const/4 v7, 0x2

    aput-object p3, v6, v7

    invoke-static {v4, v5, v6}, Lcom/localytics/android/ReflectionUtils;->tryInvokeConstructor(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v0, v4

    check-cast v0, Lcom/localytics/android/SessionHandler;

    move-object v2, v0

    .line 207
    if-nez v2, :cond_0

    .line 209
    new-instance v4, Ljava/lang/Exception;

    invoke-direct {v4}, Ljava/lang/Exception;-><init>()V

    throw v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 212
    :catch_0
    move-exception v1

    move-object v3, v2

    .line 214
    .end local v2    # "handler":Lcom/localytics/android/SessionHandler;
    .local v1, "e":Ljava/lang/Exception;
    .local v3, "handler":Lcom/localytics/android/SessionHandler;
    :try_start_1
    new-instance v2, Lcom/localytics/android/SessionHandler;

    invoke-direct {v2, p1, p2, p3}, Lcom/localytics/android/SessionHandler;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Looper;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .end local v3    # "handler":Lcom/localytics/android/SessionHandler;
    .restart local v2    # "handler":Lcom/localytics/android/SessionHandler;
    move-object v3, v2

    .line 218
    .end local v1    # "e":Ljava/lang/Exception;
    .end local v2    # "handler":Lcom/localytics/android/SessionHandler;
    .local v3, "handler":Ljava/lang/Object;
    :goto_0
    return-object v3

    .end local v3    # "handler":Ljava/lang/Object;
    .restart local v2    # "handler":Lcom/localytics/android/SessionHandler;
    :cond_0
    move-object v3, v2

    .restart local v3    # "handler":Ljava/lang/Object;
    goto :goto_0

    .end local v3    # "handler":Ljava/lang/Object;
    :catchall_0
    move-exception v4

    :goto_1
    move-object v3, v2

    .restart local v3    # "handler":Ljava/lang/Object;
    goto :goto_0

    .end local v2    # "handler":Lcom/localytics/android/SessionHandler;
    .restart local v1    # "e":Ljava/lang/Exception;
    .local v3, "handler":Lcom/localytics/android/SessionHandler;
    :catchall_1
    move-exception v4

    move-object v2, v3

    .end local v3    # "handler":Lcom/localytics/android/SessionHandler;
    .restart local v2    # "handler":Lcom/localytics/android/SessionHandler;
    goto :goto_1
.end method

.method getSessionHandler()Lcom/localytics/android/SessionHandler;
    .locals 1

    .prologue
    .line 229
    iget-object v0, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    return-object v0
.end method

.method public handleNotificationReceived(Landroid/content/Intent;)V
    .locals 3
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 924
    iget-object v0, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    iget-object v1, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    const/16 v2, 0x15

    invoke-virtual {v1, v2, p1}, Lcom/localytics/android/SessionHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/localytics/android/SessionHandler;->sendMessage(Landroid/os/Message;)Z

    .line 925
    return-void
.end method

.method public handlePushReceived(Landroid/content/Intent;)V
    .locals 1
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 864
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/localytics/android/LocalyticsSession;->handlePushReceived(Landroid/content/Intent;Ljava/util/List;)V

    .line 865
    return-void
.end method

.method public handlePushReceived(Landroid/content/Intent;Ljava/util/List;)V
    .locals 8
    .param p1, "intent"    # Landroid/content/Intent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 869
    .local p2, "customDimensions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v6

    if-nez v6, :cond_1

    .line 900
    :cond_0
    :goto_0
    return-void

    .line 872
    :cond_1
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v6

    const-string v7, "ll"

    invoke-virtual {v6, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 873
    .local v5, "llString":Ljava/lang/String;
    if-eqz v5, :cond_0

    .line 877
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 878
    .local v4, "llObject":Lorg/json/JSONObject;
    const-string v6, "ca"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 879
    .local v1, "campaignId":Ljava/lang/String;
    const-string v6, "cr"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 881
    .local v2, "creativeId":Ljava/lang/String;
    if-eqz v1, :cond_2

    if-eqz v2, :cond_2

    .line 883
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 884
    .local v0, "attributes":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v6, "Campaign ID"

    invoke-virtual {v0, v6, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 885
    const-string v6, "Creative ID"

    invoke-virtual {v0, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 886
    const-string v6, "Localytics Push Opened"

    invoke-virtual {p0, v6, v0, p2}, Lcom/localytics/android/LocalyticsSession;->tagEvent(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V

    .line 890
    .end local v0    # "attributes":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    :cond_2
    const-string v6, "ll"

    invoke-virtual {p1, v6}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 892
    .end local v1    # "campaignId":Ljava/lang/String;
    .end local v2    # "creativeId":Ljava/lang/String;
    .end local v4    # "llObject":Lorg/json/JSONObject;
    :catch_0
    move-exception v3

    .line 894
    .local v3, "e":Lorg/json/JSONException;
    sget-boolean v6, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v6, :cond_0

    .line 896
    const-string v6, "Localytics"

    const-string v7, "Failed to get campaign id or creative id from payload"

    invoke-static {v6, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public handleRegistration(Landroid/content/Intent;)V
    .locals 3
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 919
    iget-object v0, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    iget-object v1, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    const/16 v2, 0x14

    invoke-virtual {v1, v2, p1}, Lcom/localytics/android/SessionHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/localytics/android/SessionHandler;->sendMessage(Landroid/os/Message;)Z

    .line 920
    return-void
.end method

.method public open()V
    .locals 1

    .prologue
    .line 367
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/localytics/android/LocalyticsSession;->open(Ljava/util/List;)V

    .line 368
    return-void
.end method

.method public open(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p1, "customDimensions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/16 v8, 0xa

    const/4 v7, 0x1

    .line 394
    if-eqz p1, :cond_4

    .line 400
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 402
    sget-boolean v2, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v2, :cond_0

    .line 404
    const-string v2, "Localytics"

    const-string v3, "customDimensions is empty.  Did the caller make an error?"

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 408
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-le v2, v8, :cond_1

    .line 410
    sget-boolean v2, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v2, :cond_1

    .line 412
    const-string v2, "Localytics"

    const-string v3, "customDimensions size is %d, exceeding the maximum size of %d.  Did the caller make an error?"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v7

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 416
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 418
    .local v0, "element":Ljava/lang/String;
    if-nez v0, :cond_3

    .line 420
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "customDimensions cannot contain null elements"

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 422
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_2

    .line 424
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "customDimensions cannot contain empty elements"

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 430
    .end local v0    # "element":Ljava/lang/String;
    .end local v1    # "i$":Ljava/util/Iterator;
    :cond_4
    if-eqz p1, :cond_5

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 432
    :cond_5
    iget-object v2, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    invoke-virtual {v2, v7}, Lcom/localytics/android/SessionHandler;->sendEmptyMessage(I)Z

    .line 438
    :goto_0
    return-void

    .line 436
    :cond_6
    iget-object v2, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    iget-object v3, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    new-instance v4, Ljava/util/TreeMap;

    invoke-static {p1}, Lcom/localytics/android/LocalyticsSession;->convertDimensionsToAttributes(Ljava/util/List;)Ljava/util/Map;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v3, v7, v4}, Lcom/localytics/android/SessionHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/localytics/android/SessionHandler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0
.end method

.method public registerPush(Ljava/lang/String;)V
    .locals 4
    .param p1, "senderId"    # Ljava/lang/String;

    .prologue
    .line 851
    invoke-static {}, Lcom/localytics/android/DatapointHelper;->getApiLevel()I

    move-result v0

    const/16 v1, 0x8

    if-ge v0, v1, :cond_0

    .line 853
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 855
    const-string v0, "Localytics"

    const-string v1, "GCM requires API level 8 or higher"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 859
    :cond_0
    iget-object v0, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    iget-object v1, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    const/16 v2, 0x9

    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2, v3}, Lcom/localytics/android/SessionHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/localytics/android/SessionHandler;->sendMessage(Landroid/os/Message;)Z

    .line 860
    return-void
.end method

.method public setCustomDimension(ILjava/lang/String;)V
    .locals 6
    .param p1, "dimension"    # I
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 830
    if-ltz p1, :cond_0

    const/16 v0, 0x9

    if-le p1, v0, :cond_1

    .line 832
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Only valid dimensions are 0 - 9"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 835
    :cond_1
    iget-object v1, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    iget-object v2, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    const/16 v3, 0xc

    const/4 v0, 0x2

    new-array v4, v0, [Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v0

    const/4 v5, 0x1

    if-nez p2, :cond_2

    const/4 v0, 0x0

    :goto_0
    aput-object v0, v4, v5

    invoke-virtual {v2, v3, v4}, Lcom/localytics/android/SessionHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/localytics/android/SessionHandler;->sendMessage(Landroid/os/Message;)Z

    .line 836
    return-void

    .line 835
    :cond_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public setCustomerData(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 808
    if-nez p1, :cond_0

    .line 810
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "key cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 813
    :cond_0
    iget-object v0, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    iget-object v1, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    const/16 v2, 0x8

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 v4, 0x1

    aput-object p2, v3, v4

    invoke-virtual {v1, v2, v3}, Lcom/localytics/android/SessionHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/localytics/android/SessionHandler;->sendMessage(Landroid/os/Message;)Z

    .line 814
    return-void
.end method

.method public setCustomerEmail(Ljava/lang/String;)V
    .locals 1
    .param p1, "email"    # Ljava/lang/String;

    .prologue
    .line 779
    const-string v0, "email"

    invoke-virtual {p0, v0, p1}, Lcom/localytics/android/LocalyticsSession;->setCustomerData(Ljava/lang/String;Ljava/lang/String;)V

    .line 780
    return-void
.end method

.method public setCustomerId(Ljava/lang/String;)V
    .locals 1
    .param p1, "customerId"    # Ljava/lang/String;

    .prologue
    .line 803
    const-string v0, "customer_id"

    invoke-virtual {p0, v0, p1}, Lcom/localytics/android/LocalyticsSession;->setCustomerData(Ljava/lang/String;Ljava/lang/String;)V

    .line 804
    return-void
.end method

.method public setCustomerName(Ljava/lang/String;)V
    .locals 1
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 791
    const-string v0, "customer_name"

    invoke-virtual {p0, v0, p1}, Lcom/localytics/android/LocalyticsSession;->setCustomerData(Ljava/lang/String;Ljava/lang/String;)V

    .line 792
    return-void
.end method

.method public setLocation(Landroid/location/Location;)V
    .locals 4
    .param p1, "location"    # Landroid/location/Location;

    .prologue
    .line 909
    iget-object v0, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    iget-object v1, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    const/16 v2, 0xb

    new-instance v3, Landroid/location/Location;

    invoke-direct {v3, p1}, Landroid/location/Location;-><init>(Landroid/location/Location;)V

    invoke-virtual {v1, v2, v3}, Lcom/localytics/android/SessionHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/localytics/android/SessionHandler;->sendMessage(Landroid/os/Message;)Z

    .line 910
    return-void
.end method

.method public setOptOut(Z)V
    .locals 5
    .param p1, "isOptedOut"    # Z

    .prologue
    const/4 v1, 0x0

    .line 357
    iget-object v2, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    iget-object v3, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    const/4 v4, 0x6

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v3, v4, v0, v1}, Lcom/localytics/android/SessionHandler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/localytics/android/SessionHandler;->sendMessage(Landroid/os/Message;)Z

    .line 358
    return-void

    :cond_0
    move v0, v1

    .line 357
    goto :goto_0
.end method

.method public setProfileAttribute(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 22
    .param p1, "attributeName"    # Ljava/lang/String;
    .param p2, "attributeValue"    # Ljava/lang/Object;

    .prologue
    .line 937
    if-nez p1, :cond_1

    .line 939
    :try_start_0
    sget-boolean v15, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v15, :cond_0

    .line 941
    const-string v15, "Localytics"

    const-string v16, "attribute name cannot be null"

    invoke-static/range {v15 .. v16}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1114
    .end local p2    # "attributeValue":Ljava/lang/Object;
    :cond_0
    :goto_0
    return-void

    .line 945
    .restart local p2    # "attributeValue":Ljava/lang/Object;
    :cond_1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 946
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v15

    if-nez v15, :cond_2

    .line 948
    sget-boolean v15, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v15, :cond_0

    .line 950
    const-string v15, "Localytics"

    const-string v16, "attribute name cannot be empty"

    invoke-static/range {v15 .. v16}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1107
    .end local p2    # "attributeValue":Ljava/lang/Object;
    :catch_0
    move-exception v4

    .line 1109
    .local v4, "e":Lorg/json/JSONException;
    sget-boolean v15, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v15, :cond_0

    .line 1111
    const-string v15, "Localytics"

    const-string v16, "Caught JSON exception"

    move-object/from16 v0, v16

    invoke-static {v15, v0, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 954
    .end local v4    # "e":Lorg/json/JSONException;
    .restart local p2    # "attributeValue":Ljava/lang/Object;
    :cond_2
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v15

    array-length v15, v15

    const/16 v16, 0x80

    move/from16 v0, v16

    if-le v15, v0, :cond_3

    .line 956
    sget-boolean v15, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v15, :cond_0

    .line 958
    const-string v15, "Localytics"

    const-string v16, "attribute name cannot be longer than %s characters"

    const/16 v17, 0x1

    move/from16 v0, v17

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v17, v0

    const/16 v18, 0x0

    const/16 v19, 0x80

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v19

    aput-object v19, v17, v18

    invoke-static/range {v16 .. v17}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v15 .. v16}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 962
    :cond_3
    const-string v15, "_"

    move-object/from16 v0, p1

    invoke-virtual {v0, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_4

    .line 964
    sget-boolean v15, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v15, :cond_0

    .line 966
    const-string v15, "Localytics"

    const-string v16, "attribute name cannot start with \"_\""

    invoke-static/range {v15 .. v16}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 981
    :cond_4
    if-eqz p2, :cond_5

    move-object/from16 v0, p2

    instance-of v15, v0, Ljava/lang/String;

    if-nez v15, :cond_5

    move-object/from16 v0, p2

    instance-of v15, v0, [Ljava/lang/String;

    if-nez v15, :cond_5

    move-object/from16 v0, p2

    instance-of v15, v0, Ljava/util/Date;

    if-nez v15, :cond_5

    move-object/from16 v0, p2

    instance-of v15, v0, [Ljava/util/Date;

    if-nez v15, :cond_5

    move-object/from16 v0, p2

    instance-of v15, v0, Ljava/lang/Integer;

    if-nez v15, :cond_5

    move-object/from16 v0, p2

    instance-of v15, v0, [I

    if-nez v15, :cond_5

    move-object/from16 v0, p2

    instance-of v15, v0, [Ljava/lang/Integer;

    if-nez v15, :cond_5

    move-object/from16 v0, p2

    instance-of v15, v0, Ljava/lang/Long;

    if-nez v15, :cond_5

    move-object/from16 v0, p2

    instance-of v15, v0, [J

    if-nez v15, :cond_5

    move-object/from16 v0, p2

    instance-of v15, v0, [Ljava/lang/Long;

    if-nez v15, :cond_5

    .line 993
    sget-boolean v15, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v15, :cond_0

    .line 995
    const-string v15, "Localytics"

    const-string v16, "Profile property value can only be one of the following data types: String, String[], Date, Date[], int/Integer, int[]/Integer[], long/Long, long[]/Long[], or null"

    invoke-static/range {v15 .. v16}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 1000
    :cond_5
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 1002
    .local v8, "json":Lorg/json/JSONObject;
    if-nez p2, :cond_7

    .line 1004
    sget-object p2, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 1062
    .end local p2    # "attributeValue":Ljava/lang/Object;
    :cond_6
    :goto_1
    move-object/from16 v0, p2

    instance-of v15, v0, [Ljava/lang/Object;

    if-eqz v15, :cond_14

    .line 1064
    check-cast p2, [Ljava/lang/Object;

    move-object/from16 v0, p2

    check-cast v0, [Ljava/lang/Object;

    move-object v14, v0

    .line 1065
    .local v14, "values":[Ljava/lang/Object;
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 1066
    .local v9, "list":Ljava/util/List;
    const/4 v5, 0x0

    .local v5, "i":I
    :goto_2
    array-length v15, v14

    if-ge v5, v15, :cond_12

    .line 1068
    aget-object v7, v14, v5

    .line 1069
    .local v7, "item":Ljava/lang/Object;
    if-eqz v7, :cond_11

    const-string v15, ""

    invoke-virtual {v15, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_11

    .line 1071
    instance-of v15, v7, Ljava/lang/String;

    if-eqz v15, :cond_10

    check-cast v7, Ljava/lang/String;

    .end local v7    # "item":Ljava/lang/Object;
    invoke-virtual {v7}, Ljava/lang/String;->getBytes()[B

    move-result-object v15

    array-length v15, v15

    const/16 v16, 0xff

    move/from16 v0, v16

    if-le v15, v0, :cond_10

    .line 1073
    sget-boolean v15, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v15, :cond_0

    .line 1075
    const-string v15, "Localytics"

    const-string v16, "attribute set cannot contain values longer than %s characters"

    const/16 v17, 0x1

    move/from16 v0, v17

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v17, v0

    const/16 v18, 0x0

    const/16 v19, 0xff

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v19

    aput-object v19, v17, v18

    invoke-static/range {v16 .. v17}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v15 .. v16}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 1007
    .end local v5    # "i":I
    .end local v9    # "list":Ljava/util/List;
    .end local v14    # "values":[Ljava/lang/Object;
    .restart local p2    # "attributeValue":Ljava/lang/Object;
    :cond_7
    move-object/from16 v0, p2

    instance-of v15, v0, Ljava/util/Date;

    if-eqz v15, :cond_8

    .line 1009
    new-instance v13, Ljava/text/SimpleDateFormat;

    const-string v15, "yyyy-MM-dd"

    invoke-direct {v13, v15}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1010
    .local v13, "simpleDateFormat":Ljava/text/SimpleDateFormat;
    move-object/from16 v0, p2

    invoke-virtual {v13, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 1011
    .local p2, "attributeValue":Ljava/lang/String;
    goto :goto_1

    .line 1013
    .end local v13    # "simpleDateFormat":Ljava/text/SimpleDateFormat;
    .local p2, "attributeValue":Ljava/lang/Object;
    :cond_8
    move-object/from16 v0, p2

    instance-of v15, v0, [I

    if-eqz v15, :cond_a

    .line 1015
    check-cast p2, [I

    .end local p2    # "attributeValue":Ljava/lang/Object;
    move-object/from16 v0, p2

    check-cast v0, [I

    move-object v12, v0

    .line 1016
    .local v12, "oldValue":[I
    array-length v15, v12

    new-array v10, v15, [Ljava/lang/Integer;

    .line 1017
    .local v10, "newValue":[Ljava/lang/Integer;
    const/4 v5, 0x0

    .restart local v5    # "i":I
    :goto_3
    array-length v15, v12

    if-ge v5, v15, :cond_9

    .line 1019
    aget v15, v12, v5

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    aput-object v15, v10, v5

    .line 1017
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 1021
    :cond_9
    move-object/from16 p2, v10

    .line 1022
    .local p2, "attributeValue":[Ljava/lang/Integer;
    goto/16 :goto_1

    .line 1024
    .end local v5    # "i":I
    .end local v10    # "newValue":[Ljava/lang/Integer;
    .end local v12    # "oldValue":[I
    .local p2, "attributeValue":Ljava/lang/Object;
    :cond_a
    move-object/from16 v0, p2

    instance-of v15, v0, [J

    if-eqz v15, :cond_c

    .line 1026
    check-cast p2, [J

    .end local p2    # "attributeValue":Ljava/lang/Object;
    move-object/from16 v0, p2

    check-cast v0, [J

    move-object v12, v0

    .line 1027
    .local v12, "oldValue":[J
    array-length v15, v12

    new-array v10, v15, [Ljava/lang/Long;

    .line 1028
    .local v10, "newValue":[Ljava/lang/Long;
    const/4 v5, 0x0

    .restart local v5    # "i":I
    :goto_4
    array-length v15, v12

    if-ge v5, v15, :cond_b

    .line 1030
    aget-wide v15, v12, v5

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15

    aput-object v15, v10, v5

    .line 1028
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 1032
    :cond_b
    move-object/from16 p2, v10

    .line 1033
    .local p2, "attributeValue":[Ljava/lang/Long;
    goto/16 :goto_1

    .line 1035
    .end local v5    # "i":I
    .end local v10    # "newValue":[Ljava/lang/Long;
    .end local v12    # "oldValue":[J
    .local p2, "attributeValue":Ljava/lang/Object;
    :cond_c
    move-object/from16 v0, p2

    instance-of v15, v0, [Ljava/util/Date;

    if-eqz v15, :cond_f

    .line 1037
    check-cast p2, [Ljava/util/Date;

    .end local p2    # "attributeValue":Ljava/lang/Object;
    move-object/from16 v0, p2

    check-cast v0, [Ljava/util/Date;

    move-object v12, v0

    .line 1038
    .local v12, "oldValue":[Ljava/util/Date;
    array-length v15, v12

    new-array v10, v15, [Ljava/lang/String;

    .line 1039
    .local v10, "newValue":[Ljava/lang/String;
    new-instance v13, Ljava/text/SimpleDateFormat;

    const-string v15, "yyyy-MM-dd"

    invoke-direct {v13, v15}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1040
    .restart local v13    # "simpleDateFormat":Ljava/text/SimpleDateFormat;
    const/4 v5, 0x0

    .restart local v5    # "i":I
    :goto_5
    array-length v15, v12

    if-ge v5, v15, :cond_e

    .line 1042
    aget-object v15, v12, v5

    if-eqz v15, :cond_d

    .line 1044
    aget-object v15, v12, v5

    invoke-virtual {v13, v15}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    .line 1045
    .local v3, "date":Ljava/lang/String;
    aput-object v3, v10, v5

    .line 1040
    .end local v3    # "date":Ljava/lang/String;
    :cond_d
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    .line 1048
    :cond_e
    move-object/from16 p2, v10

    .line 1049
    .local p2, "attributeValue":[Ljava/lang/String;
    goto/16 :goto_1

    .line 1050
    .end local v5    # "i":I
    .end local v10    # "newValue":[Ljava/lang/String;
    .end local v12    # "oldValue":[Ljava/util/Date;
    .end local v13    # "simpleDateFormat":Ljava/text/SimpleDateFormat;
    .local p2, "attributeValue":Ljava/lang/Object;
    :cond_f
    move-object/from16 v0, p2

    instance-of v15, v0, Ljava/lang/String;

    if-eqz v15, :cond_6

    .line 1052
    move-object/from16 v0, p2

    check-cast v0, Ljava/lang/String;

    move-object v15, v0

    invoke-virtual {v15}, Ljava/lang/String;->getBytes()[B

    move-result-object v15

    array-length v15, v15

    const/16 v16, 0xff

    move/from16 v0, v16

    if-le v15, v0, :cond_6

    .line 1054
    sget-boolean v15, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v15, :cond_0

    .line 1056
    const-string v15, "Localytics"

    const-string v16, "attribute value cannot be longer than %s characters"

    const/16 v17, 0x1

    move/from16 v0, v17

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v17, v0

    const/16 v18, 0x0

    const/16 v19, 0xff

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v19

    aput-object v19, v17, v18

    invoke-static/range {v16 .. v17}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v15 .. v16}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 1079
    .end local p2    # "attributeValue":Ljava/lang/Object;
    .restart local v5    # "i":I
    .restart local v9    # "list":Ljava/util/List;
    .restart local v14    # "values":[Ljava/lang/Object;
    :cond_10
    aget-object v15, v14, v5

    invoke-interface {v9, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1066
    :cond_11
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_2

    .line 1082
    :cond_12
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v15

    if-eqz v15, :cond_0

    .line 1084
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 1085
    .local v2, "array":Lorg/json/JSONArray;
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .local v6, "i$":Ljava/util/Iterator;
    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_13

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 1087
    .local v11, "o":Ljava/lang/Object;
    invoke-virtual {v2, v11}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_6

    .line 1089
    .end local v11    # "o":Ljava/lang/Object;
    :cond_13
    move-object/from16 v0, p1

    invoke-virtual {v8, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1105
    .end local v2    # "array":Lorg/json/JSONArray;
    .end local v5    # "i":I
    .end local v6    # "i$":Ljava/util/Iterator;
    .end local v9    # "list":Ljava/util/List;
    .end local v14    # "values":[Ljava/lang/Object;
    :goto_7
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    move-object/from16 v16, v0

    const/16 v17, 0x10

    const/16 v18, 0x2

    move/from16 v0, v18

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v18, v0

    const/16 v19, 0x0

    aput-object v8, v18, v19

    const/16 v19, 0x1

    new-instance v20, Ljava/lang/Integer;

    sget-object v21, Lcom/localytics/android/LocalyticsSession$ProfileDbAction;->SET_ATTRIBUTE:Lcom/localytics/android/LocalyticsSession$ProfileDbAction;

    invoke-virtual/range {v21 .. v21}, Lcom/localytics/android/LocalyticsSession$ProfileDbAction;->ordinal()I

    move-result v21

    invoke-direct/range {v20 .. v21}, Ljava/lang/Integer;-><init>(I)V

    aput-object v20, v18, v19

    invoke-virtual/range {v16 .. v18}, Lcom/localytics/android/SessionHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v16

    invoke-virtual/range {v15 .. v16}, Lcom/localytics/android/SessionHandler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_0

    .line 1096
    :cond_14
    const-string v15, ""

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v15 .. v16}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_0

    .line 1098
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_7
.end method

.method public setPushDisabled(Z)V
    .locals 5
    .param p1, "disable"    # Z

    .prologue
    const/4 v1, 0x0

    .line 914
    iget-object v2, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    iget-object v3, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    const/16 v4, 0xe

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v3, v4, v0, v1}, Lcom/localytics/android/SessionHandler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/localytics/android/SessionHandler;->sendMessage(Landroid/os/Message;)Z

    .line 915
    return-void

    :cond_0
    move v0, v1

    .line 914
    goto :goto_0
.end method

.method public setPushRegistrationId(Ljava/lang/String;)V
    .locals 3
    .param p1, "pushRegId"    # Ljava/lang/String;

    .prologue
    .line 904
    iget-object v0, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    iget-object v1, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    const/16 v2, 0xa

    invoke-virtual {v1, v2, p1}, Lcom/localytics/android/SessionHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/localytics/android/SessionHandler;->sendMessage(Landroid/os/Message;)Z

    .line 905
    return-void
.end method

.method public tagEvent(Ljava/lang/String;)V
    .locals 1
    .param p1, "event"    # Ljava/lang/String;

    .prologue
    .line 525
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/localytics/android/LocalyticsSession;->tagEvent(Ljava/lang/String;Ljava/util/Map;)V

    .line 526
    return-void
.end method

.method public tagEvent(Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .param p1, "event"    # Ljava/lang/String;
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
    .line 542
    .local p2, "attributes":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/localytics/android/LocalyticsSession;->tagEvent(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V

    .line 543
    return-void
.end method

.method public tagEvent(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V
    .locals 6
    .param p1, "event"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 566
    .local p2, "attributes":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    .local p3, "customDimensions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const-wide/16 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsSession;->tagEvent(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;J)V

    .line 567
    return-void
.end method

.method public tagEvent(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;J)V
    .locals 14
    .param p1, "event"    # Ljava/lang/String;
    .param p4, "customerValueIncrease"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;J)V"
        }
    .end annotation

    .prologue
    .line 615
    .local p2, "attributes":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    .local p3, "customDimensions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    if-nez p1, :cond_0

    .line 617
    new-instance v8, Ljava/lang/IllegalArgumentException;

    const-string v9, "event cannot be null"

    invoke-direct {v8, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v8

    .line 620
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_1

    .line 622
    new-instance v8, Ljava/lang/IllegalArgumentException;

    const-string v9, "event cannot be empty"

    invoke-direct {v8, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v8

    .line 625
    :cond_1
    if-eqz p2, :cond_8

    .line 631
    invoke-interface/range {p2 .. p2}, Ljava/util/Map;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_2

    .line 633
    sget-boolean v8, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v8, :cond_2

    .line 635
    const-string v8, "Localytics"

    const-string v9, "attributes is empty.  Did the caller make an error?"

    invoke-static {v8, v9}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 639
    :cond_2
    invoke-interface/range {p2 .. p2}, Ljava/util/Map;->size()I

    move-result v8

    const/16 v9, 0x32

    if-le v8, v9, :cond_3

    .line 641
    sget-boolean v8, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v8, :cond_3

    .line 643
    const-string v8, "Localytics"

    const-string v9, "attributes size is %d, exceeding the maximum size of %d.  Did the caller make an error?"

    const/4 v10, 0x2

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    invoke-interface/range {p2 .. p2}, Ljava/util/Map;->size()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    aput-object v12, v10, v11

    const/4 v11, 0x1

    const/16 v12, 0x32

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    aput-object v12, v10, v11

    invoke-static {v9, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 647
    :cond_3
    invoke-interface/range {p2 .. p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .local v3, "i$":Ljava/util/Iterator;
    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 649
    .local v1, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 650
    .local v4, "key":Ljava/lang/String;
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 652
    .local v7, "value":Ljava/lang/String;
    if-nez v4, :cond_5

    .line 654
    new-instance v8, Ljava/lang/IllegalArgumentException;

    const-string v9, "attributes cannot contain null keys"

    invoke-direct {v8, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v8

    .line 656
    :cond_5
    if-nez v7, :cond_6

    .line 658
    new-instance v8, Ljava/lang/IllegalArgumentException;

    const-string v9, "attributes cannot contain null values"

    invoke-direct {v8, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v8

    .line 660
    :cond_6
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_7

    .line 662
    new-instance v8, Ljava/lang/IllegalArgumentException;

    const-string v9, "attributes cannot contain empty keys"

    invoke-direct {v8, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v8

    .line 664
    :cond_7
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_4

    .line 666
    new-instance v8, Ljava/lang/IllegalArgumentException;

    const-string v9, "attributes cannot contain empty values"

    invoke-direct {v8, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v8

    .line 671
    .end local v1    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v3    # "i$":Ljava/util/Iterator;
    .end local v4    # "key":Ljava/lang/String;
    .end local v7    # "value":Ljava/lang/String;
    :cond_8
    if-eqz p3, :cond_d

    .line 677
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_9

    .line 679
    sget-boolean v8, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v8, :cond_9

    .line 681
    const-string v8, "Localytics"

    const-string v9, "customDimensions is empty.  Did the caller make an error?"

    invoke-static {v8, v9}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 685
    :cond_9
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v8

    const/16 v9, 0xa

    if-le v8, v9, :cond_a

    .line 687
    sget-boolean v8, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v8, :cond_a

    .line 689
    const-string v8, "Localytics"

    const-string v9, "customDimensions size is %d, exceeding the maximum size of %d.  Did the caller make an error?"

    const/4 v10, 0x2

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    aput-object v12, v10, v11

    const/4 v11, 0x1

    const/16 v12, 0xa

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    aput-object v12, v10, v11

    invoke-static {v9, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 693
    :cond_a
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .restart local v3    # "i$":Ljava/util/Iterator;
    :cond_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 695
    .local v0, "element":Ljava/lang/String;
    if-nez v0, :cond_c

    .line 697
    new-instance v8, Ljava/lang/IllegalArgumentException;

    const-string v9, "customDimensions cannot contain null elements"

    invoke-direct {v8, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v8

    .line 699
    :cond_c
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_b

    .line 701
    new-instance v8, Ljava/lang/IllegalArgumentException;

    const-string v9, "customDimensions cannot contain empty elements"

    invoke-direct {v8, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v8

    .line 707
    .end local v0    # "element":Ljava/lang/String;
    .end local v3    # "i$":Ljava/util/Iterator;
    :cond_d
    const-string v8, "%s:%s"

    const/4 v9, 0x2

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    iget-object v11, p0, Lcom/localytics/android/LocalyticsSession;->mContext:Landroid/content/Context;

    invoke-virtual {v11}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v11

    aput-object v11, v9, v10

    const/4 v10, 0x1

    aput-object p1, v9, v10

    invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 709
    .local v2, "eventString":Ljava/lang/String;
    if-nez p2, :cond_e

    if-nez p3, :cond_e

    .line 711
    iget-object v8, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    iget-object v9, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    const/4 v10, 0x3

    const/4 v11, 0x3

    new-array v11, v11, [Ljava/lang/Object;

    const/4 v12, 0x0

    aput-object v2, v11, v12

    const/4 v12, 0x1

    const/4 v13, 0x0

    aput-object v13, v11, v12

    const/4 v12, 0x2

    invoke-static/range {p4 .. p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    aput-object v13, v11, v12

    invoke-virtual {v9, v10, v11}, Lcom/localytics/android/SessionHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/localytics/android/SessionHandler;->sendMessage(Landroid/os/Message;)Z

    .line 744
    :goto_0
    return-void

    .line 718
    :cond_e
    new-instance v6, Ljava/util/TreeMap;

    invoke-direct {v6}, Ljava/util/TreeMap;-><init>()V

    .line 720
    .local v6, "remappedAttributes":Ljava/util/TreeMap;, "Ljava/util/TreeMap<Ljava/lang/String;Ljava/lang/String;>;"
    if-eqz p2, :cond_f

    .line 722
    iget-object v8, p0, Lcom/localytics/android/LocalyticsSession;->mContext:Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    .line 723
    .local v5, "packageName":Ljava/lang/String;
    invoke-interface/range {p2 .. p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .restart local v3    # "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 725
    .restart local v1    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v8, "%s:%s"

    const/4 v9, 0x2

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object v5, v9, v10

    const/4 v10, 0x1

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    aput-object v11, v9, v10

    invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v6, v8, v9}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 729
    .end local v1    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v3    # "i$":Ljava/util/Iterator;
    .end local v5    # "packageName":Ljava/lang/String;
    :cond_f
    if-eqz p3, :cond_10

    .line 731
    invoke-static/range {p3 .. p3}, Lcom/localytics/android/LocalyticsSession;->convertDimensionsToAttributes(Ljava/util/List;)Ljava/util/Map;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/util/TreeMap;->putAll(Ljava/util/Map;)V

    .line 742
    :cond_10
    iget-object v8, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    iget-object v9, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    const/4 v10, 0x3

    const/4 v11, 0x3

    new-array v11, v11, [Ljava/lang/Object;

    const/4 v12, 0x0

    aput-object v2, v11, v12

    const/4 v12, 0x1

    new-instance v13, Ljava/util/TreeMap;

    invoke-direct {v13, v6}, Ljava/util/TreeMap;-><init>(Ljava/util/SortedMap;)V

    aput-object v13, v11, v12

    const/4 v12, 0x2

    invoke-static/range {p4 .. p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    aput-object v13, v11, v12

    invoke-virtual {v9, v10, v11}, Lcom/localytics/android/SessionHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/localytics/android/SessionHandler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0
.end method

.method public tagScreen(Ljava/lang/String;)V
    .locals 3
    .param p1, "screen"    # Ljava/lang/String;

    .prologue
    .line 757
    if-nez p1, :cond_0

    .line 759
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "event cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 762
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 764
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "event cannot be empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 767
    :cond_1
    iget-object v0, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    iget-object v1, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    const/4 v2, 0x7

    invoke-virtual {v1, v2, p1}, Lcom/localytics/android/SessionHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/localytics/android/SessionHandler;->sendMessage(Landroid/os/Message;)Z

    .line 768
    return-void
.end method

.method public upload()V
    .locals 0

    .prologue
    .line 1123
    invoke-virtual {p0}, Lcom/localytics/android/LocalyticsSession;->uploadAnalytics()V

    .line 1124
    invoke-virtual {p0}, Lcom/localytics/android/LocalyticsSession;->uploadProfile()V

    .line 1125
    return-void
.end method

.method protected uploadAnalytics()V
    .locals 4

    .prologue
    .line 1132
    iget-object v0, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    iget-object v1, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lcom/localytics/android/SessionHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/localytics/android/SessionHandler;->sendMessage(Landroid/os/Message;)Z

    .line 1133
    return-void
.end method

.method protected uploadProfile()V
    .locals 4

    .prologue
    .line 1140
    iget-object v0, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    iget-object v1, p0, Lcom/localytics/android/LocalyticsSession;->mSessionHandler:Lcom/localytics/android/SessionHandler;

    const/16 v2, 0x11

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lcom/localytics/android/SessionHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/localytics/android/SessionHandler;->sendMessage(Landroid/os/Message;)Z

    .line 1141
    return-void
.end method
