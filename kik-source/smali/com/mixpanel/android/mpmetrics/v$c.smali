.class Lcom/mixpanel/android/mpmetrics/v$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mixpanel/android/mpmetrics/v$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/mpmetrics/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lcom/mixpanel/android/mpmetrics/v;


# direct methods
.method private constructor <init>(Lcom/mixpanel/android/mpmetrics/v;)V
    .locals 0

    .prologue
    .line 1000
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/v$c;->a:Lcom/mixpanel/android/mpmetrics/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/mixpanel/android/mpmetrics/v;B)V
    .locals 0

    .prologue
    .line 1000
    invoke-direct {p0, p1}, Lcom/mixpanel/android/mpmetrics/v$c;-><init>(Lcom/mixpanel/android/mpmetrics/v;)V

    return-void
.end method

.method private a(Lorg/json/JSONObject;)V
    .locals 4

    .prologue
    .line 1019
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 1020
    const-string v0, "$android_lib_version"

    const-string v2, "4.4.1"

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1021
    const-string v0, "$android_os"

    const-string v2, "Android"

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1022
    const-string v2, "$android_os_version"

    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "UNKNOWN"

    :goto_0
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1024
    :try_start_1
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v$c;->a:Lcom/mixpanel/android/mpmetrics/v;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/v;->d(Lcom/mixpanel/android/mpmetrics/v;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 1025
    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/v$c;->a:Lcom/mixpanel/android/mpmetrics/v;

    invoke-static {v2}, Lcom/mixpanel/android/mpmetrics/v;->d(Lcom/mixpanel/android/mpmetrics/v;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    .line 1026
    const-string v2, "$android_app_version"

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 1030
    :goto_1
    :try_start_2
    const-string v2, "$android_manufacturer"

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    if-nez v0, :cond_1

    const-string v0, "UNKNOWN"

    :goto_2
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1031
    const-string v2, "$android_brand"

    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    if-nez v0, :cond_2

    const-string v0, "UNKNOWN"

    :goto_3
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1032
    const-string v2, "$android_model"

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    if-nez v0, :cond_3

    const-string v0, "UNKNOWN"

    :goto_4
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1034
    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1035
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1036
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_5

    .line 1041
    :catch_0
    move-exception v0

    .line 1042
    const-string v1, "MixpanelAPI"

    const-string v2, "Exception setting people properties"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1044
    :goto_6
    return-void

    .line 1022
    :cond_0
    :try_start_3
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    goto :goto_0

    .line 1027
    :catch_1
    move-exception v0

    .line 1028
    const-string v2, "MixpanelAPI"

    const-string v3, "Exception getting app version name"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    .line 1030
    :cond_1
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    goto :goto_2

    .line 1031
    :cond_2
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    goto :goto_3

    .line 1032
    :cond_3
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    goto :goto_4

    .line 1039
    :cond_4
    const-string v0, "$set"

    invoke-direct {p0, v0, v1}, Lcom/mixpanel/android/mpmetrics/v$c;->b(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    .line 1040
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/v$c;->a:Lcom/mixpanel/android/mpmetrics/v;

    invoke-static {v1, v0}, Lcom/mixpanel/android/mpmetrics/v;->a(Lcom/mixpanel/android/mpmetrics/v;Lorg/json/JSONObject;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_6
.end method

.method private b(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    .locals 6

    .prologue
    .line 1339
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 1340
    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/v$c;->b()Ljava/lang/String;

    move-result-object v1

    .line 1342
    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1343
    const-string v2, "$token"

    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/v$c;->a:Lcom/mixpanel/android/mpmetrics/v;

    invoke-static {v3}, Lcom/mixpanel/android/mpmetrics/v;->c(Lcom/mixpanel/android/mpmetrics/v;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1344
    const-string v2, "$time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v0, v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 1346
    if-eqz v1, :cond_0

    .line 1347
    const-string v2, "$distinct_id"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1350
    :cond_0
    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 1274
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v$c;->a:Lcom/mixpanel/android/mpmetrics/v;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/v;->a(Lcom/mixpanel/android/mpmetrics/v;)Lcom/mixpanel/android/mpmetrics/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/ac;->e()V

    .line 1275
    const-string v0, "$android_devices"

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mixpanel/android/mpmetrics/v$c;->a(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1276
    :goto_0
    return-void

    .line 1275
    :catch_0
    move-exception v0

    const-string v1, "MixpanelAPI"

    const-string v2, "set"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public final a(Landroid/app/Activity;)V
    .locals 4

    .prologue
    const/16 v1, 0xe

    .line 1173
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v0, v1, :cond_1

    .line 1178
    :cond_0
    :goto_0
    return-void

    .line 1177
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/f;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->a()Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    invoke-static {}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->b()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_0

    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v$c;->a:Lcom/mixpanel/android/mpmetrics/v;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/v;->d()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_4

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_0

    :cond_3
    :try_start_2
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v$c;->a:Lcom/mixpanel/android/mpmetrics/v;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/v;->b(Lcom/mixpanel/android/mpmetrics/v;)Lcom/mixpanel/android/mpmetrics/h;

    move-result-object v0

    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/v$c;->a:Lcom/mixpanel/android/mpmetrics/v;

    invoke-static {v2}, Lcom/mixpanel/android/mpmetrics/v;->e(Lcom/mixpanel/android/mpmetrics/v;)Lcom/mixpanel/android/mpmetrics/t;

    move-result-object v2

    invoke-virtual {v2}, Lcom/mixpanel/android/mpmetrics/t;->e()Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/mixpanel/android/mpmetrics/h;->a(Z)Lcom/mixpanel/android/mpmetrics/Survey;

    move-result-object v0

    goto :goto_1

    :cond_4
    new-instance v2, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;

    invoke-direct {v2, v0}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;-><init>(Lcom/mixpanel/android/mpmetrics/Survey;)V

    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/v$c;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/v$c;->a:Lcom/mixpanel/android/mpmetrics/v;

    invoke-static {v3}, Lcom/mixpanel/android/mpmetrics/v;->c(Lcom/mixpanel/android/mpmetrics/v;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v0, v3}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->a(Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-gtz v0, :cond_5

    const-string v0, "MixpanelAPI"

    const-string v2, "DisplayState Lock is in an inconsistent state! Please report this issue to Mixpanel"

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_0

    :cond_5
    :try_start_3
    new-instance v3, Lcom/mixpanel/android/mpmetrics/z;

    invoke-direct {v3, p0, v2, p1, v0}, Lcom/mixpanel/android/mpmetrics/z;-><init>(Lcom/mixpanel/android/mpmetrics/v$c;Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;Landroid/app/Activity;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    invoke-static {p1, v3}, Lcom/mixpanel/android/mpmetrics/c;->a(Landroid/app/Activity;Lcom/mixpanel/android/mpmetrics/c$b;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 1258
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v$c;->a:Lcom/mixpanel/android/mpmetrics/v;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/v;->a(Lcom/mixpanel/android/mpmetrics/v;)Lcom/mixpanel/android/mpmetrics/ac;

    move-result-object v1

    monitor-enter v1

    .line 1259
    :try_start_0
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v$c;->a:Lcom/mixpanel/android/mpmetrics/v;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/v;->a(Lcom/mixpanel/android/mpmetrics/v;)Lcom/mixpanel/android/mpmetrics/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/ac;->d()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 1260
    monitor-exit v1

    .line 1269
    :goto_0
    return-void

    .line 1263
    :cond_0
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v$c;->a:Lcom/mixpanel/android/mpmetrics/v;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/v;->a(Lcom/mixpanel/android/mpmetrics/v;)Lcom/mixpanel/android/mpmetrics/ac;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mixpanel/android/mpmetrics/ac;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1265
    :try_start_1
    const-string v0, "$android_devices"

    new-instance v2, Lorg/json/JSONArray;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "["

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "]"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v3, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "$union"

    invoke-direct {p0, v0, v3}, Lcom/mixpanel/android/mpmetrics/v$c;->b(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/v$c;->a:Lcom/mixpanel/android/mpmetrics/v;

    invoke-static {v2, v0}, Lcom/mixpanel/android/mpmetrics/v;->a(Lcom/mixpanel/android/mpmetrics/v;Lorg/json/JSONObject;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1269
    :goto_1
    :try_start_3
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    .line 1265
    :catch_0
    move-exception v0

    :try_start_4
    const-string v0, "MixpanelAPI"

    const-string v2, "Exception unioning a property"

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_1

    .line 1266
    :catch_1
    move-exception v0

    .line 1267
    :try_start_5
    const-string v2, "MixpanelAPI"

    const-string v3, "set push registration id error"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_1
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 1095
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 1096
    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1097
    const-string v1, "$append"

    invoke-direct {p0, v1, v0}, Lcom/mixpanel/android/mpmetrics/v$c;->b(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    .line 1098
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/v$c;->a:Lcom/mixpanel/android/mpmetrics/v;

    invoke-static {v1, v0}, Lcom/mixpanel/android/mpmetrics/v;->a(Lcom/mixpanel/android/mpmetrics/v;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1102
    :goto_0
    return-void

    .line 1099
    :catch_0
    move-exception v0

    .line 1100
    const-string v1, "MixpanelAPI"

    const-string v2, "Exception appending a property"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public final b(Ljava/lang/String;)Lcom/mixpanel/android/mpmetrics/v$b;
    .locals 1

    .prologue
    .line 1311
    if-nez p1, :cond_0

    .line 1312
    const/4 v0, 0x0

    .line 1314
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/mixpanel/android/mpmetrics/y;

    invoke-direct {v0, p0, p1}, Lcom/mixpanel/android/mpmetrics/y;-><init>(Lcom/mixpanel/android/mpmetrics/v$c;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1306
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/v$c;->a:Lcom/mixpanel/android/mpmetrics/v;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/v;->a(Lcom/mixpanel/android/mpmetrics/v;)Lcom/mixpanel/android/mpmetrics/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/ac;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b(Landroid/app/Activity;)V
    .locals 2

    .prologue
    const/16 v1, 0xe

    .line 1194
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v0, v1, :cond_1

    .line 1199
    :cond_0
    :goto_0
    return-void

    .line 1198
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v1, :cond_0

    new-instance v0, Lcom/mixpanel/android/mpmetrics/aa;

    invoke-direct {v0, p0, p1}, Lcom/mixpanel/android/mpmetrics/aa;-><init>(Lcom/mixpanel/android/mpmetrics/v$c;Landroid/app/Activity;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0
.end method
