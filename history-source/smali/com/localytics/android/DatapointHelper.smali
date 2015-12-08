.class final Lcom/localytics/android/DatapointHelper;
.super Ljava/lang/Object;
.source "DatapointHelper.java"


# static fields
.field private static final HARDWARE_TELEPHONY:[Ljava/lang/Object;

.field private static final HARDWARE_WIFI:[Ljava/lang/Object;

.field private static final INVALID_ANDROID_ID:Ljava/lang/String; = "9774d56d682e549c"

.field private static final LEGACY_DEVICE_ID_FILE:Ljava/lang/String; = "/localytics/device_id"

.field private static final STRING_CLASS_ARRAY:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 54
    new-array v0, v3, [Ljava/lang/Class;

    const-class v1, Ljava/lang/String;

    aput-object v1, v0, v2

    sput-object v0, Lcom/localytics/android/DatapointHelper;->STRING_CLASS_ARRAY:[Ljava/lang/Class;

    .line 60
    new-array v0, v3, [Ljava/lang/Object;

    const-string v1, "android.hardware.wifi"

    aput-object v1, v0, v2

    sput-object v0, Lcom/localytics/android/DatapointHelper;->HARDWARE_WIFI:[Ljava/lang/Object;

    .line 66
    new-array v0, v3, [Ljava/lang/Object;

    const-string v1, "android.hardware.telephony"

    aput-object v1, v0, v2

    sput-object v0, Lcom/localytics/android/DatapointHelper;->HARDWARE_TELEPHONY:[Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .prologue
    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This class is non-instantiable"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static getAdvertisingIdOrNull(Landroid/content/Context;)Ljava/lang/String;
    .locals 9
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 198
    const/4 v2, 0x0

    .line 203
    .local v2, "advertisingId":Ljava/lang/String;
    :try_start_0
    const-string v4, "com.google.android.gms.ads.identifier.AdvertisingIdClient"

    const-string v5, "getAdvertisingIdInfo"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Class;

    const/4 v7, 0x0

    const-class v8, Landroid/content/Context;

    aput-object v8, v6, v7

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object p0, v7, v8

    invoke-static {v4, v5, v6, v7}, Lcom/localytics/android/ReflectionUtils;->tryInvokeStatic(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 205
    .local v1, "adInfo":Ljava/lang/Object;
    if-eqz v1, :cond_0

    .line 207
    const-string v4, "getId"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v1, v4, v5, v6}, Lcom/localytics/android/ReflectionUtils;->tryInvokeInstance(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v0, v4

    check-cast v0, Ljava/lang/String;

    move-object v2, v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 218
    .end local v1    # "adInfo":Ljava/lang/Object;
    :cond_0
    :goto_0
    return-object v2

    .line 210
    :catch_0
    move-exception v3

    .line 212
    .local v3, "e":Ljava/lang/Exception;
    sget-boolean v4, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v4, :cond_0

    .line 214
    const-string v4, "Localytics"

    const-string v5, "Localytics library can\'t get the advertising id"

    invoke-static {v4, v5, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public static getAndroidIdHashOrNull(Landroid/content/Context;)Ljava/lang/String;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 125
    invoke-static {p0}, Lcom/localytics/android/DatapointHelper;->getAndroidIdOrNull(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 127
    .local v0, "androidId":Ljava/lang/String;
    if-nez v0, :cond_0

    const/4 v1, 0x0

    :goto_0
    return-object v1

    :cond_0
    invoke-static {v0}, Lcom/localytics/android/DatapointHelper;->getSha256_buggy(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method

.method public static getAndroidIdOrNull(Landroid/content/Context;)Ljava/lang/String;
    .locals 12
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 140
    new-instance v4, Ljava/io/File;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "/localytics/device_id"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v4, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 141
    .local v4, "fp":Ljava/io/File;
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-virtual {v4}, Ljava/io/File;->length()J

    move-result-wide v8

    const-wide/16 v10, 0x0

    cmp-long v8, v8, v10

    if-lez v8, :cond_2

    .line 145
    const/4 v6, 0x0

    .line 148
    .local v6, "reader":Ljava/io/BufferedReader;
    const/16 v8, 0x64

    :try_start_0
    new-array v1, v8, [C

    .line 150
    .local v1, "buf":[C
    new-instance v7, Ljava/io/BufferedReader;

    new-instance v8, Ljava/io/FileReader;

    invoke-direct {v8, v4}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    const/16 v9, 0x80

    invoke-direct {v7, v8, v9}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    .end local v6    # "reader":Ljava/io/BufferedReader;
    .local v7, "reader":Ljava/io/BufferedReader;
    :try_start_1
    invoke-virtual {v7, v1}, Ljava/io/BufferedReader;->read([C)I

    move-result v5

    .line 152
    .local v5, "numRead":I
    const/4 v8, 0x0

    invoke-static {v1, v8, v5}, Ljava/lang/String;->copyValueOf([CII)Ljava/lang/String;

    move-result-object v2

    .line 153
    .local v2, "deviceId":Ljava/lang/String;
    invoke-virtual {v7}, Ljava/io/BufferedReader;->close()V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 165
    if-eqz v7, :cond_0

    .line 167
    :try_start_2
    invoke-virtual {v7}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 186
    .end local v1    # "buf":[C
    .end local v2    # "deviceId":Ljava/lang/String;
    .end local v5    # "numRead":I
    .end local v7    # "reader":Ljava/io/BufferedReader;
    :cond_0
    :goto_0
    return-object v2

    .line 156
    .restart local v6    # "reader":Ljava/io/BufferedReader;
    :catch_0
    move-exception v3

    .line 158
    .local v3, "e":Ljava/io/FileNotFoundException;
    :goto_1
    :try_start_3
    sget-boolean v8, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v8, :cond_1

    .line 160
    const-string v8, "Localytics"

    const-string v9, "Caught exception"

    invoke-static {v8, v9, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 165
    :cond_1
    if-eqz v6, :cond_2

    .line 167
    :try_start_4
    invoke-virtual {v6}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 180
    .end local v3    # "e":Ljava/io/FileNotFoundException;
    .end local v6    # "reader":Ljava/io/BufferedReader;
    :cond_2
    :goto_2
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v8

    const-string v9, "android_id"

    invoke-static {v8, v9}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 181
    .local v0, "androidId":Ljava/lang/String;
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v8

    const-string v9, "9774d56d682e549c"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    .line 183
    :cond_3
    const/4 v2, 0x0

    goto :goto_0

    .line 165
    .end local v0    # "androidId":Ljava/lang/String;
    .restart local v6    # "reader":Ljava/io/BufferedReader;
    :catchall_0
    move-exception v8

    :goto_3
    if-eqz v6, :cond_4

    .line 167
    :try_start_5
    invoke-virtual {v6}, Ljava/io/BufferedReader;->close()V

    :cond_4
    throw v8
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    .line 171
    :catch_1
    move-exception v3

    .line 173
    .local v3, "e":Ljava/io/IOException;
    :goto_4
    sget-boolean v8, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v8, :cond_2

    .line 175
    const-string v8, "Localytics"

    const-string v9, "Caught exception"

    invoke-static {v8, v9, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_2

    .end local v3    # "e":Ljava/io/IOException;
    .end local v6    # "reader":Ljava/io/BufferedReader;
    .restart local v0    # "androidId":Ljava/lang/String;
    :cond_5
    move-object v2, v0

    .line 186
    goto :goto_0

    .line 171
    .end local v0    # "androidId":Ljava/lang/String;
    .restart local v1    # "buf":[C
    .restart local v2    # "deviceId":Ljava/lang/String;
    .restart local v5    # "numRead":I
    .restart local v7    # "reader":Ljava/io/BufferedReader;
    :catch_2
    move-exception v3

    move-object v6, v7

    .end local v7    # "reader":Ljava/io/BufferedReader;
    .restart local v6    # "reader":Ljava/io/BufferedReader;
    goto :goto_4

    .line 165
    .end local v2    # "deviceId":Ljava/lang/String;
    .end local v5    # "numRead":I
    .end local v6    # "reader":Ljava/io/BufferedReader;
    .restart local v7    # "reader":Ljava/io/BufferedReader;
    :catchall_1
    move-exception v8

    move-object v6, v7

    .end local v7    # "reader":Ljava/io/BufferedReader;
    .restart local v6    # "reader":Ljava/io/BufferedReader;
    goto :goto_3

    .line 156
    .end local v6    # "reader":Ljava/io/BufferedReader;
    .restart local v7    # "reader":Ljava/io/BufferedReader;
    :catch_3
    move-exception v3

    move-object v6, v7

    .end local v7    # "reader":Ljava/io/BufferedReader;
    .restart local v6    # "reader":Ljava/io/BufferedReader;
    goto :goto_1
.end method

.method static getApiLevel()I
    .locals 6

    .prologue
    .line 88
    :try_start_0
    const-class v0, Landroid/os/Build$VERSION;

    .line 89
    .local v0, "buildClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v4, "SDK"

    invoke-virtual {v0, v4}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 90
    .local v3, "sdkString":Ljava/lang/String;
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v4

    .line 112
    .end local v3    # "sdkString":Ljava/lang/String;
    :goto_0
    return v4

    .line 92
    :catch_0
    move-exception v1

    .line 94
    .local v1, "e":Ljava/lang/Exception;
    const-string v4, "Localytics"

    const-string v5, "Caught exception"

    invoke-static {v4, v5, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 99
    :try_start_1
    const-class v0, Landroid/os/Build$VERSION;

    .line 100
    const-string v4, "SDK_INT"

    invoke-virtual {v0, v4}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v4

    goto :goto_0

    .line 102
    :catch_1
    move-exception v2

    .line 104
    .local v2, "ignore":Ljava/lang/Exception;
    sget-boolean v4, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v4, :cond_0

    .line 106
    const-string v4, "Localytics"

    const-string v5, "Caught exception"

    invoke-static {v4, v5, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 112
    :cond_0
    const/4 v4, 0x3

    goto :goto_0
.end method

.method public static getAppVersion(Landroid/content/Context;)Ljava/lang/String;
    .locals 5
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 430
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 434
    .local v1, "pm":Landroid/content/pm/PackageManager;
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    iget-object v2, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 439
    .local v2, "versionName":Ljava/lang/String;
    if-nez v2, :cond_1

    .line 441
    sget-boolean v3, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v3, :cond_0

    .line 443
    const-string v3, "Localytics"

    const-string v4, "versionName was null--is a versionName attribute set in the Android Manifest?"

    invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 446
    :cond_0
    const-string v2, "unknown"
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 449
    .end local v2    # "versionName":Ljava/lang/String;
    :cond_1
    return-object v2

    .line 451
    :catch_0
    move-exception v0

    .line 456
    .local v0, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    new-instance v3, Ljava/lang/RuntimeException;

    invoke-direct {v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v3
.end method

.method public static getFBAttribution(Landroid/content/Context;)Ljava/lang/String;
    .locals 10
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 387
    const/4 v9, 0x0

    .line 389
    .local v9, "facebookAttribution":Ljava/lang/String;
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 390
    .local v0, "contentResolver":Landroid/content/ContentResolver;
    const-string v3, "content://com.facebook.katana.provider.AttributionIdProvider"

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 391
    .local v1, "uri":Landroid/net/Uri;
    const-string v6, "aid"

    .line 392
    .local v6, "columnName":Ljava/lang/String;
    const/4 v3, 0x1

    new-array v2, v3, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "aid"

    aput-object v4, v2, v3

    .line 394
    .local v2, "projection":[Ljava/lang/String;
    const/4 v7, 0x0

    .line 397
    .local v7, "cursor":Landroid/database/Cursor;
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :try_start_0
    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 398
    if-eqz v7, :cond_0

    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 400
    const-string v3, "aid"

    invoke-interface {v7, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v7, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v9

    .line 412
    :cond_0
    if-eqz v7, :cond_1

    .line 414
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 415
    const/4 v7, 0x0

    .line 419
    :cond_1
    :goto_0
    return-object v9

    .line 403
    :catch_0
    move-exception v8

    .line 405
    .local v8, "e":Ljava/lang/Exception;
    :try_start_1
    sget-boolean v3, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v3, :cond_2

    .line 407
    const-string v3, "Localytics"

    const-string v4, "Error reading FB attribution"

    invoke-static {v3, v4, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 412
    :cond_2
    if-eqz v7, :cond_1

    .line 414
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 415
    const/4 v7, 0x0

    goto :goto_0

    .line 412
    .end local v8    # "e":Ljava/lang/Exception;
    :catchall_0
    move-exception v3

    if-eqz v7, :cond_3

    .line 414
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 415
    const/4 v7, 0x0

    :cond_3
    throw v3
.end method

.method public static getLocalyticsAppKeyOrNull(Landroid/content/Context;)Ljava/lang/String;
    .locals 8
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 462
    const/4 v1, 0x0

    .line 466
    .local v1, "appKey":Ljava/lang/String;
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0x80

    invoke-virtual {v5, v6, v7}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    .line 467
    .local v2, "applicationInfo":Landroid/content/pm/ApplicationInfo;
    iget-object v5, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v6, "LOCALYTICS_APP_KEY"

    invoke-virtual {v5, v6}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    .line 468
    .local v4, "metaData":Ljava/lang/Object;
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_0

    .line 470
    move-object v0, v4

    check-cast v0, Ljava/lang/String;

    move-object v1, v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 481
    :cond_0
    return-object v1

    .line 473
    .end local v2    # "applicationInfo":Landroid/content/pm/ApplicationInfo;
    .end local v4    # "metaData":Ljava/lang/Object;
    :catch_0
    move-exception v3

    .line 478
    .local v3, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    new-instance v5, Ljava/lang/RuntimeException;

    invoke-direct {v5, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v5
.end method

.method public static getLocalyticsNotificationIcon(Landroid/content/Context;)I
    .locals 6
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 519
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x80

    invoke-virtual {v3, v4, v5}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    .line 520
    .local v0, "applicationInfo":Landroid/content/pm/ApplicationInfo;
    iget-object v3, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz v3, :cond_0

    .line 522
    iget-object v3, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v4, "LOCALYTICS_NOTIFICATION_ICON"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 523
    .local v2, "metaData":Ljava/lang/String;
    if-eqz v2, :cond_0

    .line 525
    const/16 v3, 0x2f

    invoke-virtual {v2, v3}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    const/16 v4, 0x2e

    invoke-virtual {v2, v4}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v4

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 526
    .local v1, "iconName":Ljava/lang/String;
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const-string v4, "drawable"

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v1, v4, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    .line 538
    .end local v0    # "applicationInfo":Landroid/content/pm/ApplicationInfo;
    .end local v1    # "iconName":Ljava/lang/String;
    .end local v2    # "metaData":Ljava/lang/String;
    :goto_0
    return v3

    .line 530
    .restart local v0    # "applicationInfo":Landroid/content/pm/ApplicationInfo;
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    .line 531
    iget v3, v0, Landroid/content/pm/ApplicationInfo;->icon:I

    if-eqz v3, :cond_1

    .line 533
    iget v3, v0, Landroid/content/pm/ApplicationInfo;->icon:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 536
    .end local v0    # "applicationInfo":Landroid/content/pm/ApplicationInfo;
    :catch_0
    move-exception v3

    .line 538
    :cond_1
    const v3, 0x1080093

    goto :goto_0
.end method

.method public static getLocalyticsRollupKeyOrNull(Landroid/content/Context;)Ljava/lang/String;
    .locals 8
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 486
    const/4 v4, 0x0

    .line 490
    .local v4, "rollupKey":Ljava/lang/String;
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0x80

    invoke-virtual {v5, v6, v7}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    .line 491
    .local v1, "applicationInfo":Landroid/content/pm/ApplicationInfo;
    iget-object v5, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz v5, :cond_0

    .line 493
    iget-object v5, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v6, "LOCALYTICS_ROLLUP_KEY"

    invoke-virtual {v5, v6}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 494
    .local v3, "metaData":Ljava/lang/String;
    instance-of v5, v3, Ljava/lang/String;

    if-eqz v5, :cond_0

    .line 496
    move-object v0, v3

    check-cast v0, Ljava/lang/String;

    move-object v4, v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 508
    .end local v3    # "metaData":Ljava/lang/String;
    :cond_0
    return-object v4

    .line 500
    .end local v1    # "applicationInfo":Landroid/content/pm/ApplicationInfo;
    :catch_0
    move-exception v2

    .line 505
    .local v2, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    new-instance v5, Ljava/lang/RuntimeException;

    invoke-direct {v5, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v5
.end method

.method public static getManufacturer()Ljava/lang/String;
    .locals 6

    .prologue
    .line 361
    const-string v3, "unknown"

    .line 362
    .local v3, "mfg":Ljava/lang/String;
    sget v4, Lcom/localytics/android/Constants;->CURRENT_API_LEVEL:I

    const/4 v5, 0x3

    if-le v4, v5, :cond_0

    .line 366
    :try_start_0
    const-class v1, Landroid/os/Build;

    .line 367
    .local v1, "buildClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v4, "MANUFACTURER"

    invoke-virtual {v1, v4}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v0, v4

    check-cast v0, Ljava/lang/String;

    move-object v3, v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 377
    .end local v1    # "buildClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_0
    :goto_0
    return-object v3

    .line 369
    :catch_0
    move-exception v2

    .line 371
    .local v2, "ignore":Ljava/lang/Exception;
    sget-boolean v4, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v4, :cond_0

    .line 373
    const-string v4, "Localytics"

    const-string v5, "Caught exception"

    invoke-static {v4, v5, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public static getNetworkType(Landroid/content/Context;Landroid/telephony/TelephonyManager;)Ljava/lang/String;
    .locals 5
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "telephonyManager"    # Landroid/telephony/TelephonyManager;

    .prologue
    .line 322
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const-string v3, "android.permission.ACCESS_WIFI_STATE"

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_0

    .line 324
    const-string v2, "connectivity"

    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/ConnectivityManager;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v1

    .line 325
    .local v1, "wifiInfo":Landroid/net/NetworkInfo;
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 327
    const-string v2, "wifi"

    .line 350
    .end local v1    # "wifiInfo":Landroid/net/NetworkInfo;
    :goto_0
    return-object v2

    .line 332
    :cond_0
    sget-boolean v2, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v2, :cond_1

    .line 334
    const-string v2, "Localytics"

    const-string v3, "Application does not have one more more of the following permissions: ACCESS_WIFI_STATE. Determining Wi-Fi connectivity is unavailable"

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 350
    :cond_1
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "android_network_type_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Landroid/telephony/TelephonyManager;->getNetworkType()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 338
    :catch_0
    move-exception v0

    .line 344
    .local v0, "e":Ljava/lang/SecurityException;
    sget-boolean v2, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v2, :cond_1

    .line 346
    const-string v2, "Localytics"

    const-string v3, "Application does not have the permission ACCESS_NETWORK_STATE. Determining Wi-Fi connectivity is unavailable"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method

.method public static getSerialNumberHashOrNull()Ljava/lang/String;
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 239
    const/4 v1, 0x0

    .line 240
    .local v1, "serialNumber":Ljava/lang/String;
    sget v3, Lcom/localytics/android/Constants;->CURRENT_API_LEVEL:I

    const/16 v4, 0x9

    if-lt v3, v4, :cond_0

    .line 244
    :try_start_0
    const-class v3, Landroid/os/Build;

    const-string v4, "SERIAL"

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .end local v1    # "serialNumber":Ljava/lang/String;
    check-cast v1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 255
    .restart local v1    # "serialNumber":Ljava/lang/String;
    :cond_0
    if-nez v1, :cond_1

    .line 260
    :goto_0
    return-object v2

    .line 246
    .end local v1    # "serialNumber":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 251
    .local v0, "e":Ljava/lang/Exception;
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    .line 260
    .end local v0    # "e":Ljava/lang/Exception;
    .restart local v1    # "serialNumber":Ljava/lang/String;
    :cond_1
    invoke-static {v1}, Lcom/localytics/android/DatapointHelper;->getSha256_buggy(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0
.end method

.method static getSha256_buggy(Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .param p0, "string"    # Ljava/lang/String;

    .prologue
    .line 555
    if-nez p0, :cond_0

    .line 557
    new-instance v4, Ljava/lang/IllegalArgumentException;

    const-string v5, "string cannot be null"

    invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 563
    :cond_0
    :try_start_0
    const-string v4, "SHA-256"

    invoke-static {v4}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v3

    .line 564
    .local v3, "md":Ljava/security/MessageDigest;
    const-string v4, "UTF-8"

    invoke-virtual {p0, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    .line 565
    .local v0, "digest":[B
    new-instance v2, Ljava/math/BigInteger;

    const/4 v4, 0x1

    invoke-direct {v2, v4, v0}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 566
    .local v2, "hashedNumber":Ljava/math/BigInteger;
    const/16 v4, 0x10

    invoke-virtual {v2, v4}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v4

    return-object v4

    .line 568
    .end local v0    # "digest":[B
    .end local v2    # "hashedNumber":Ljava/math/BigInteger;
    .end local v3    # "md":Ljava/security/MessageDigest;
    :catch_0
    move-exception v1

    .line 570
    .local v1, "e":Ljava/security/NoSuchAlgorithmException;
    new-instance v4, Ljava/lang/RuntimeException;

    invoke-direct {v4, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v4

    .line 572
    .end local v1    # "e":Ljava/security/NoSuchAlgorithmException;
    :catch_1
    move-exception v1

    .line 574
    .local v1, "e":Ljava/io/UnsupportedEncodingException;
    new-instance v4, Ljava/lang/RuntimeException;

    invoke-direct {v4, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v4
.end method

.method public static getTelephonyDeviceIdOrNull(Landroid/content/Context;)Ljava/lang/String;
    .locals 7
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 275
    sget v3, Lcom/localytics/android/Constants;->CURRENT_API_LEVEL:I

    const/4 v4, 0x7

    if-lt v3, v4, :cond_2

    .line 278
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    const-string v4, "hasSystemFeature"

    sget-object v5, Lcom/localytics/android/DatapointHelper;->STRING_CLASS_ARRAY:[Ljava/lang/Class;

    sget-object v6, Lcom/localytics/android/DatapointHelper;->HARDWARE_TELEPHONY:[Ljava/lang/Object;

    invoke-static {v3, v4, v5, v6}, Lcom/localytics/android/ReflectionUtils;->tryInvokeInstance(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    .line 279
    .local v0, "hasTelephony":Ljava/lang/Boolean;
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_2

    .line 281
    sget-boolean v3, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v3, :cond_0

    .line 283
    const-string v3, "Localytics"

    const-string v4, "Device does not have telephony; cannot read telephony id"

    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 286
    :cond_0
    const/4 v1, 0x0

    .line 308
    .end local v0    # "hasTelephony":Ljava/lang/Boolean;
    :cond_1
    :goto_0
    return-object v1

    .line 294
    :cond_2
    const/4 v1, 0x0

    .line 295
    .local v1, "id":Ljava/lang/String;
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    const-string v4, "android.permission.READ_PHONE_STATE"

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    if-nez v3, :cond_3

    .line 297
    const-string v3, "phone"

    invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/telephony/TelephonyManager;

    .line 298
    .local v2, "manager":Landroid/telephony/TelephonyManager;
    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v1

    .line 299
    goto :goto_0

    .line 302
    .end local v2    # "manager":Landroid/telephony/TelephonyManager;
    :cond_3
    sget-boolean v3, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v3, :cond_1

    .line 304
    const-string v3, "Localytics"

    const-string v4, "Application does not have permission READ_PHONE_STATE; determining device id is not possible.  Please consider requesting READ_PHONE_STATE in the AndroidManifest"

    invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method
