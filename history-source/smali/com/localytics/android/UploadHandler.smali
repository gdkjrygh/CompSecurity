.class Lcom/localytics/android/UploadHandler;
.super Landroid/os/Handler;
.source "UploadHandler.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/localytics/android/UploadHandler$ProfileUploadDataPair;,
        Lcom/localytics/android/UploadHandler$UploadType;
    }
.end annotation


# static fields
.field private static final ANALYTICS_URL_HTTP:Ljava/lang/String; = "http://%s/api/v2/applications/%s/uploads"

.field private static final ANALYTICS_URL_HTTPS:Ljava/lang/String; = "https://%s/api/v2/uploads"

.field public static final MESSAGE_RETRY_UPLOAD_PROFILE_REQUEST:I = 0x4

.field public static final MESSAGE_RETRY_UPLOAD_REQUEST:I = 0x2

.field public static final MESSAGE_UPLOAD:I = 0x1

.field public static final MESSAGE_UPLOAD_PROFILE:I = 0x3

.field private static final PROFILE_URL:Ljava/lang/String; = "https://%s/v1/apps/%s/profiles/%s"

.field public static final UPLOAD_CALLBACK_THREAD_NAME:Ljava/lang/String; = "upload_callback"

.field public static final UPLOAD_PROFILE_CALLBACK_THREAD_NAME:Ljava/lang/String; = "upload_profile_callback"


# instance fields
.field protected final mApiKey:Ljava/lang/String;

.field protected final mContext:Landroid/content/Context;

.field private final mInstallId:Ljava/lang/String;

.field protected final mProvider:Lcom/localytics/android/LocalyticsProvider;

.field private final mSessionHandler:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Landroid/os/Looper;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "sessionHandler"    # Landroid/os/Handler;
    .param p3, "apiKey"    # Ljava/lang/String;
    .param p4, "installId"    # Ljava/lang/String;
    .param p5, "looper"    # Landroid/os/Looper;

    .prologue
    .line 158
    invoke-direct {p0, p5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 160
    iput-object p1, p0, Lcom/localytics/android/UploadHandler;->mContext:Landroid/content/Context;

    .line 161
    invoke-static {p1, p3}, Lcom/localytics/android/LocalyticsProvider;->getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/localytics/android/LocalyticsProvider;

    move-result-object v0

    iput-object v0, p0, Lcom/localytics/android/UploadHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    .line 162
    iput-object p2, p0, Lcom/localytics/android/UploadHandler;->mSessionHandler:Landroid/os/Handler;

    .line 163
    iput-object p3, p0, Lcom/localytics/android/UploadHandler;->mApiKey:Ljava/lang/String;

    .line 164
    iput-object p4, p0, Lcom/localytics/android/UploadHandler;->mInstallId:Ljava/lang/String;

    .line 165
    return-void
.end method

.method static convertAttributesToJson(Lcom/localytics/android/LocalyticsProvider;Landroid/content/Context;J)Lorg/json/JSONObject;
    .locals 12
    .param p0, "provider"    # Lcom/localytics/android/LocalyticsProvider;
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "eventId"    # J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    .line 1894
    const/4 v7, 0x0

    .line 1897
    .local v7, "cursor":Landroid/database/Cursor;
    :try_start_0
    const-string v1, "attributes"

    const/4 v2, 0x0

    const-string v0, "%s = ? AND %s != ? AND %s != ? AND %s != ? AND %s != ? AND %s != ? AND %s != ? AND %s != ? AND %s != ? AND %s != ? AND %s != ?"

    const/16 v3, 0xb

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "events_key_ref"

    aput-object v5, v3, v4

    const/4 v4, 0x1

    const-string v5, "attribute_key"

    aput-object v5, v3, v4

    const/4 v4, 0x2

    const-string v5, "attribute_key"

    aput-object v5, v3, v4

    const/4 v4, 0x3

    const-string v5, "attribute_key"

    aput-object v5, v3, v4

    const/4 v4, 0x4

    const-string v5, "attribute_key"

    aput-object v5, v3, v4

    const/4 v4, 0x5

    const-string v5, "attribute_key"

    aput-object v5, v3, v4

    const/4 v4, 0x6

    const-string v5, "attribute_key"

    aput-object v5, v3, v4

    const/4 v4, 0x7

    const-string v5, "attribute_key"

    aput-object v5, v3, v4

    const/16 v4, 0x8

    const-string v5, "attribute_key"

    aput-object v5, v3, v4

    const/16 v4, 0x9

    const-string v5, "attribute_key"

    aput-object v5, v3, v4

    const/16 v4, 0xa

    const-string v5, "attribute_key"

    aput-object v5, v3, v4

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/16 v0, 0xb

    new-array v4, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v0

    const/4 v0, 0x1

    sget-object v5, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_1:Ljava/lang/String;

    aput-object v5, v4, v0

    const/4 v0, 0x2

    sget-object v5, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_2:Ljava/lang/String;

    aput-object v5, v4, v0

    const/4 v0, 0x3

    sget-object v5, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_3:Ljava/lang/String;

    aput-object v5, v4, v0

    const/4 v0, 0x4

    sget-object v5, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_4:Ljava/lang/String;

    aput-object v5, v4, v0

    const/4 v0, 0x5

    sget-object v5, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_5:Ljava/lang/String;

    aput-object v5, v4, v0

    const/4 v0, 0x6

    sget-object v5, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_6:Ljava/lang/String;

    aput-object v5, v4, v0

    const/4 v0, 0x7

    sget-object v5, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_7:Ljava/lang/String;

    aput-object v5, v4, v0

    const/16 v0, 0x8

    sget-object v5, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_8:Ljava/lang/String;

    aput-object v5, v4, v0

    const/16 v0, 0x9

    sget-object v5, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_9:Ljava/lang/String;

    aput-object v5, v4, v0

    const/16 v0, 0xa

    sget-object v5, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_10:Ljava/lang/String;

    aput-object v5, v4, v0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 1899
    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_1

    .line 1920
    if-eqz v7, :cond_0

    .line 1922
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 1923
    const/4 v7, 0x0

    :cond_0
    :goto_0
    return-object v6

    .line 1904
    :cond_1
    :try_start_1
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 1906
    .local v6, "attributes":Lorg/json/JSONObject;
    const-string v0, "attribute_key"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v9

    .line 1907
    .local v9, "keyColumn":I
    const-string v0, "attribute_value"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v11

    .line 1908
    .local v11, "valueColumn":I
    :goto_1
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1910
    invoke-interface {v7, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 1911
    .local v8, "key":Ljava/lang/String;
    invoke-interface {v7, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 1913
    .local v10, "value":Ljava/lang/String;
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v8, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 1920
    .end local v6    # "attributes":Lorg/json/JSONObject;
    .end local v8    # "key":Ljava/lang/String;
    .end local v9    # "keyColumn":I
    .end local v10    # "value":Ljava/lang/String;
    .end local v11    # "valueColumn":I
    :catchall_0
    move-exception v0

    if-eqz v7, :cond_2

    .line 1922
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 1923
    const/4 v7, 0x0

    :cond_2
    throw v0

    .line 1920
    .restart local v6    # "attributes":Lorg/json/JSONObject;
    .restart local v9    # "keyColumn":I
    .restart local v11    # "valueColumn":I
    :cond_3
    if-eqz v7, :cond_0

    .line 1922
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 1923
    const/4 v7, 0x0

    goto :goto_0
.end method

.method static convertDatabaseToJson(Landroid/content/Context;Lcom/localytics/android/LocalyticsProvider;Ljava/lang/String;)Ljava/util/List;
    .locals 20
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "provider"    # Lcom/localytics/android/LocalyticsProvider;
    .param p2, "apiKey"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/localytics/android/LocalyticsProvider;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation

    .prologue
    .line 730
    new-instance v18, Ljava/util/LinkedList;

    invoke-direct/range {v18 .. v18}, Ljava/util/LinkedList;-><init>()V

    .line 731
    .local v18, "result":Ljava/util/List;, "Ljava/util/List<Lorg/json/JSONObject;>;"
    const/4 v13, 0x0

    .line 734
    .local v13, "cursor":Landroid/database/Cursor;
    :try_start_0
    const-string v3, "upload_blobs"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v2, p1

    invoke-virtual/range {v2 .. v7}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v13

    .line 736
    invoke-static/range {p1 .. p2}, Lcom/localytics/android/UploadHandler;->getApiKeyCreationTime(Lcom/localytics/android/LocalyticsProvider;Ljava/lang/String;)J

    move-result-wide v11

    .line 738
    .local v11, "creationTime":J
    const-string v2, "_id"

    invoke-interface {v13, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v16

    .line 739
    .local v16, "idColumn":I
    const-string v2, "uuid"

    invoke-interface {v13, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v19

    .line 740
    .local v19, "uuidColumn":I
    :cond_0
    :goto_0
    invoke-interface {v13}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result v2

    if-eqz v2, :cond_6

    .line 744
    :try_start_1
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 746
    .local v10, "blobHeader":Lorg/json/JSONObject;
    const-string v2, "dt"

    const-string v3, "h"

    invoke-virtual {v10, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 747
    const-string v2, "pa"

    invoke-virtual {v10, v2, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 748
    const-string v2, "seq"

    move/from16 v0, v16

    invoke-interface {v13, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    invoke-virtual {v10, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 749
    const-string v2, "u"

    move/from16 v0, v19

    invoke-interface {v13, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 750
    const-string v2, "attrs"

    move/from16 v0, v16

    invoke-interface {v13, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    move-object/from16 v0, p1

    invoke-static {v0, v3, v4}, Lcom/localytics/android/UploadHandler;->getSessionIdForBlobId(Lcom/localytics/android/LocalyticsProvider;J)J

    move-result-wide v3

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-static {v0, v1, v3, v4}, Lcom/localytics/android/UploadHandler;->getAttributesFromSession(Lcom/localytics/android/LocalyticsProvider;Ljava/lang/String;J)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 752
    invoke-static/range {p1 .. p1}, Lcom/localytics/android/UploadHandler;->getIdentifiers(Lcom/localytics/android/LocalyticsProvider;)Lorg/json/JSONObject;

    move-result-object v17

    .line 753
    .local v17, "identifiers":Lorg/json/JSONObject;
    if-eqz v17, :cond_1

    .line 755
    const-string v2, "ids"

    move-object/from16 v0, v17

    invoke-virtual {v10, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 758
    :cond_1
    move-object/from16 v0, v18

    invoke-interface {v0, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 760
    sget-boolean v2, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v2, :cond_2

    .line 762
    const-string v2, "Localytics"

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 765
    :cond_2
    const/4 v9, 0x0

    .line 768
    .local v9, "blobEvents":Landroid/database/Cursor;
    :try_start_2
    const-string v3, "upload_blob_events"

    const/4 v2, 0x1

    new-array v4, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v5, "events_key_ref"

    aput-object v5, v4, v2

    const-string v2, "%s = ?"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    const-string v7, "upload_blobs_key_ref"

    aput-object v7, v5, v6

    invoke-static {v2, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v2, 0x1

    new-array v6, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    move/from16 v0, v16

    invoke-interface {v13, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v2

    const-string v7, "events_key_ref"

    move-object/from16 v2, p1

    invoke-virtual/range {v2 .. v7}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 772
    const-string v2, "events_key_ref"

    invoke-interface {v9, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v15

    .line 773
    .local v15, "eventIdColumn":I
    :goto_1
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 775
    invoke-interface {v9, v15}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    move/from16 v0, v16

    invoke-interface {v13, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    move-object/from16 v2, p1

    move-object/from16 v3, p0

    move-object/from16 v8, p2

    invoke-static/range {v2 .. v8}, Lcom/localytics/android/UploadHandler;->convertEventToJson(Lcom/localytics/android/LocalyticsProvider;Landroid/content/Context;JJLjava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 780
    .end local v15    # "eventIdColumn":I
    :catchall_0
    move-exception v2

    if-eqz v9, :cond_3

    .line 782
    :try_start_3
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    :cond_3
    throw v2
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 786
    .end local v9    # "blobEvents":Landroid/database/Cursor;
    .end local v10    # "blobHeader":Lorg/json/JSONObject;
    .end local v17    # "identifiers":Lorg/json/JSONObject;
    :catch_0
    move-exception v14

    .line 788
    .local v14, "e":Lorg/json/JSONException;
    :try_start_4
    sget-boolean v2, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v2, :cond_0

    .line 790
    const-string v2, "Localytics"

    const-string v3, "Caught exception"

    invoke-static {v2, v3, v14}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto/16 :goto_0

    .line 797
    .end local v11    # "creationTime":J
    .end local v14    # "e":Lorg/json/JSONException;
    .end local v16    # "idColumn":I
    .end local v19    # "uuidColumn":I
    :catchall_1
    move-exception v2

    if-eqz v13, :cond_4

    .line 799
    invoke-interface {v13}, Landroid/database/Cursor;->close()V

    .line 800
    const/4 v13, 0x0

    :cond_4
    throw v2

    .line 780
    .restart local v9    # "blobEvents":Landroid/database/Cursor;
    .restart local v10    # "blobHeader":Lorg/json/JSONObject;
    .restart local v11    # "creationTime":J
    .restart local v15    # "eventIdColumn":I
    .restart local v16    # "idColumn":I
    .restart local v17    # "identifiers":Lorg/json/JSONObject;
    .restart local v19    # "uuidColumn":I
    :cond_5
    if-eqz v9, :cond_0

    .line 782
    :try_start_5
    invoke-interface {v9}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto/16 :goto_0

    .line 797
    .end local v9    # "blobEvents":Landroid/database/Cursor;
    .end local v10    # "blobHeader":Lorg/json/JSONObject;
    .end local v15    # "eventIdColumn":I
    .end local v17    # "identifiers":Lorg/json/JSONObject;
    :cond_6
    if-eqz v13, :cond_7

    .line 799
    invoke-interface {v13}, Landroid/database/Cursor;->close()V

    .line 800
    const/4 v13, 0x0

    .line 804
    :cond_7
    sget-boolean v2, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v2, :cond_8

    .line 806
    const-string v2, "Localytics"

    const-string v3, "JSON result is %s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 809
    :cond_8
    return-object v18
.end method

.method static convertEventToJson(Lcom/localytics/android/LocalyticsProvider;Landroid/content/Context;JJLjava/lang/String;)Lorg/json/JSONObject;
    .locals 43
    .param p0, "provider"    # Lcom/localytics/android/LocalyticsProvider;
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "eventId"    # J
    .param p4, "blobId"    # J
    .param p6, "apiKey"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 1199
    new-instance v29, Lorg/json/JSONObject;

    invoke-direct/range {v29 .. v29}, Lorg/json/JSONObject;-><init>()V

    .line 1201
    .local v29, "result":Lorg/json/JSONObject;
    const/4 v13, 0x0

    .line 1205
    .local v13, "cursor":Landroid/database/Cursor;
    :try_start_0
    const-string v4, "events"

    const/4 v5, 0x0

    const-string v3, "%s = ?"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    const-string v8, "_id"

    aput-object v8, v6, v7

    invoke-static {v3, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const/4 v3, 0x1

    new-array v7, v3, [Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static/range {p2 .. p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v3

    const-string v8, "_id"

    move-object/from16 v3, p0

    invoke-virtual/range {v3 .. v8}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v13

    .line 1208
    invoke-interface {v13}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_44

    .line 1210
    const-string v3, "event_name"

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v18

    .line 1211
    .local v18, "eventName":Ljava/lang/String;
    move-object/from16 v0, p0

    move-wide/from16 v1, p2

    invoke-static {v0, v1, v2}, Lcom/localytics/android/UploadHandler;->getSessionIdForEventId(Lcom/localytics/android/LocalyticsProvider;J)J

    move-result-wide v32

    .line 1212
    .local v32, "sessionId":J
    move-object/from16 v0, p0

    move-wide/from16 v1, v32

    invoke-static {v0, v1, v2}, Lcom/localytics/android/UploadHandler;->getSessionUuid(Lcom/localytics/android/LocalyticsProvider;J)Ljava/lang/String;

    move-result-object v36

    .line 1213
    .local v36, "sessionUuid":Ljava/lang/String;
    move-object/from16 v0, p0

    move-wide/from16 v1, v32

    invoke-static {v0, v1, v2}, Lcom/localytics/android/UploadHandler;->getSessionStartTime(Lcom/localytics/android/LocalyticsProvider;J)J

    move-result-wide v34

    .line 1215
    .local v34, "sessionStartTime":J
    sget-object v3, Lcom/localytics/android/Constants;->OPEN_EVENT:Ljava/lang/String;

    move-object/from16 v0, v18

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_13

    .line 1217
    const-string v3, "dt"

    const-string v4, "s"

    move-object/from16 v0, v29

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1218
    const-string v3, "ct"

    const-string v4, "wall_time"

    invoke-interface {v13, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v13, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    long-to-double v4, v4

    const-wide v6, 0x408f400000000000L    # 1000.0

    div-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v4

    move-object/from16 v0, v29

    invoke-virtual {v0, v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 1220
    const-string v3, "u"

    move-object/from16 v0, v29

    move-object/from16 v1, v36

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1222
    move-object/from16 v0, p0

    move-wide/from16 v1, v32

    invoke-static {v0, v1, v2}, Lcom/localytics/android/UploadHandler;->getElapsedTimeSinceLastSession(Lcom/localytics/android/LocalyticsProvider;J)J

    move-result-wide v15

    .line 1223
    .local v15, "elapsedTime":J
    const-wide/16 v3, 0x0

    cmp-long v3, v15, v3

    if-lez v3, :cond_0

    .line 1224
    const-string v3, "sl"

    const-wide/16 v4, 0x3e8

    div-long v4, v15, v4

    long-to-float v4, v4

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    move-object/from16 v0, v29

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1230
    :cond_0
    const-string v3, "nth"

    move-object/from16 v0, v29

    move-wide/from16 v1, v32

    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 1235
    const-string v3, "event_lat"

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "event_lng"

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-nez v3, :cond_1

    .line 1238
    const-string v3, "event_lat"

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v22

    .line 1239
    .local v22, "lat":D
    const-string v3, "event_lng"

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v24

    .line 1241
    .local v24, "lng":D
    const-wide/16 v3, 0x0

    cmpl-double v3, v22, v3

    if-eqz v3, :cond_1

    const-wide/16 v3, 0x0

    cmpl-double v3, v24, v3

    if-eqz v3, :cond_1

    .line 1243
    const-string v3, "lat"

    move-object/from16 v0, v29

    move-wide/from16 v1, v22

    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 1244
    const-string v3, "lng"

    move-object/from16 v0, v29

    move-wide/from16 v1, v24

    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 1248
    .end local v22    # "lat":D
    .end local v24    # "lng":D
    :cond_1
    const-string v3, "customer_id"

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-nez v3, :cond_2

    .line 1250
    const-string v3, "customer_id"

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v14

    .line 1251
    .local v14, "customerID":Ljava/lang/String;
    const-string v3, "user_type"

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v38

    .line 1253
    .local v38, "userType":Ljava/lang/String;
    const-string v3, "cid"

    move-object/from16 v0, v29

    invoke-virtual {v0, v3, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1254
    const-string v3, "utp"

    move-object/from16 v0, v29

    move-object/from16 v1, v38

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1257
    .end local v14    # "customerID":Ljava/lang/String;
    .end local v38    # "userType":Ljava/lang/String;
    :cond_2
    const-string v3, "ids"

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-nez v3, :cond_3

    .line 1259
    const-string v3, "ids"

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v19

    .line 1260
    .local v19, "ids":Ljava/lang/String;
    const-string v3, "ids"

    new-instance v4, Lorg/json/JSONObject;

    move-object/from16 v0, v19

    invoke-direct {v4, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v29

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1266
    .end local v19    # "ids":Ljava/lang/String;
    :cond_3
    const/4 v10, 0x0

    .line 1269
    .local v10, "attributesCursor":Landroid/database/Cursor;
    :try_start_1
    const-string v4, "attributes"

    const/4 v5, 0x0

    const-string v3, "%s = ?"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    const-string v8, "events_key_ref"

    aput-object v8, v6, v7

    invoke-static {v3, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const/4 v3, 0x1

    new-array v7, v3, [Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static/range {p2 .. p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v3

    const/4 v8, 0x0

    move-object/from16 v3, p0

    invoke-virtual/range {v3 .. v8}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 1271
    const-string v3, "attribute_key"

    invoke-interface {v10, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v21

    .line 1272
    .local v21, "keyColumn":I
    const-string v3, "attribute_value"

    invoke-interface {v10, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v40

    .line 1273
    .local v40, "valueColumn":I
    :cond_4
    :goto_0
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-eqz v3, :cond_10

    .line 1275
    move/from16 v0, v21

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v20

    .line 1276
    .local v20, "key":Ljava/lang/String;
    move/from16 v0, v40

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v39

    .line 1278
    .local v39, "value":Ljava/lang/String;
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_1:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 1280
    const-string v3, "c0"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 1322
    .end local v20    # "key":Ljava/lang/String;
    .end local v21    # "keyColumn":I
    .end local v39    # "value":Ljava/lang/String;
    .end local v40    # "valueColumn":I
    :catchall_0
    move-exception v3

    if-eqz v10, :cond_5

    .line 1324
    :try_start_2
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 1325
    const/4 v10, 0x0

    :cond_5
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1699
    .end local v10    # "attributesCursor":Landroid/database/Cursor;
    .end local v15    # "elapsedTime":J
    .end local v18    # "eventName":Ljava/lang/String;
    .end local v32    # "sessionId":J
    .end local v34    # "sessionStartTime":J
    .end local v36    # "sessionUuid":Ljava/lang/String;
    :catchall_1
    move-exception v3

    if-eqz v13, :cond_6

    .line 1701
    invoke-interface {v13}, Landroid/database/Cursor;->close()V

    .line 1702
    const/4 v13, 0x0

    :cond_6
    throw v3

    .line 1282
    .restart local v10    # "attributesCursor":Landroid/database/Cursor;
    .restart local v15    # "elapsedTime":J
    .restart local v18    # "eventName":Ljava/lang/String;
    .restart local v20    # "key":Ljava/lang/String;
    .restart local v21    # "keyColumn":I
    .restart local v32    # "sessionId":J
    .restart local v34    # "sessionStartTime":J
    .restart local v36    # "sessionUuid":Ljava/lang/String;
    .restart local v39    # "value":Ljava/lang/String;
    .restart local v40    # "valueColumn":I
    :cond_7
    :try_start_3
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_2:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 1284
    const-string v3, "c1"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 1286
    :cond_8
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_3:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    .line 1288
    const-string v3, "c2"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 1290
    :cond_9
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_4:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    .line 1292
    const-string v3, "c3"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 1294
    :cond_a
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_5:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 1296
    const-string v3, "c4"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_0

    .line 1298
    :cond_b
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_6:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    .line 1300
    const-string v3, "c5"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_0

    .line 1302
    :cond_c
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_7:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    .line 1304
    const-string v3, "c6"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_0

    .line 1306
    :cond_d
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_8:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_e

    .line 1308
    const-string v3, "c7"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_0

    .line 1310
    :cond_e
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_9:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    .line 1312
    const-string v3, "c8"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_0

    .line 1314
    :cond_f
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_10:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 1316
    const-string v3, "c9"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_0

    .line 1322
    .end local v20    # "key":Ljava/lang/String;
    .end local v39    # "value":Ljava/lang/String;
    :cond_10
    if-eqz v10, :cond_11

    .line 1324
    :try_start_4
    invoke-interface {v10}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 1325
    const/4 v10, 0x0

    .line 1699
    .end local v10    # "attributesCursor":Landroid/database/Cursor;
    .end local v15    # "elapsedTime":J
    .end local v21    # "keyColumn":I
    .end local v40    # "valueColumn":I
    :cond_11
    :goto_1
    if-eqz v13, :cond_12

    .line 1701
    invoke-interface {v13}, Landroid/database/Cursor;->close()V

    .line 1702
    const/4 v13, 0x0

    .line 1706
    :cond_12
    return-object v29

    .line 1329
    :cond_13
    :try_start_5
    sget-object v3, Lcom/localytics/android/Constants;->CLOSE_EVENT:Ljava/lang/String;

    move-object/from16 v0, v18

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2a

    .line 1331
    const-string v3, "dt"

    const-string v4, "c"

    move-object/from16 v0, v29

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1332
    const-string v3, "u"

    const-string v4, "uuid"

    invoke-interface {v13, v4}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v13, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v29

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1333
    const-string v3, "su"

    move-object/from16 v0, v29

    move-object/from16 v1, v36

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1334
    const-string v3, "ss"

    move-wide/from16 v0, v34

    long-to-double v4, v0

    const-wide v6, 0x408f400000000000L    # 1000.0

    div-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v4

    move-object/from16 v0, v29

    invoke-virtual {v0, v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 1335
    const-string v3, "ct"

    const-string v4, "wall_time"

    invoke-interface {v13, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v13, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    long-to-double v4, v4

    const-wide v6, 0x408f400000000000L    # 1000.0

    div-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v4

    move-object/from16 v0, v29

    invoke-virtual {v0, v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 1341
    const/16 v31, 0x0

    .line 1344
    .local v31, "sessionCursor":Landroid/database/Cursor;
    :try_start_6
    const-string v4, "sessions"

    const/4 v3, 0x1

    new-array v5, v3, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v6, "session_start_wall_time"

    aput-object v6, v5, v3

    const-string v3, "%s = ?"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    const-string v8, "_id"

    aput-object v8, v6, v7

    invoke-static {v3, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const/4 v3, 0x1

    new-array v7, v3, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v8, "session_key_ref"

    invoke-interface {v13, v8}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v8

    invoke-interface {v13, v8}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v41

    invoke-static/range {v41 .. v42}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v3

    const/4 v8, 0x0

    move-object/from16 v3, p0

    invoke-virtual/range {v3 .. v8}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v31

    .line 1347
    invoke-interface/range {v31 .. v31}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_16

    .line 1349
    const-string v3, "ctl"

    const-string v4, "wall_time"

    invoke-interface {v13, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v13, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    long-to-double v4, v4

    const-wide v6, 0x408f400000000000L    # 1000.0

    div-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v4

    const-string v6, "session_start_wall_time"

    move-object/from16 v0, v31

    invoke-interface {v0, v6}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v6

    move-object/from16 v0, v31

    invoke-interface {v0, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    long-to-double v6, v6

    const-wide v41, 0x408f400000000000L    # 1000.0

    div-double v6, v6, v41

    invoke-static {v6, v7}, Ljava/lang/Math;->round(D)J

    move-result-wide v6

    sub-long/2addr v4, v6

    move-object/from16 v0, v29

    invoke-virtual {v0, v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 1362
    if-eqz v31, :cond_14

    .line 1364
    :try_start_7
    invoke-interface/range {v31 .. v31}, Landroid/database/Cursor;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 1365
    const/16 v31, 0x0

    .line 1372
    :cond_14
    const/16 v17, 0x0

    .line 1375
    .local v17, "eventHistoryCursor":Landroid/database/Cursor;
    :try_start_8
    const-string v4, "event_history"

    const/4 v3, 0x1

    new-array v5, v3, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v6, "name"

    aput-object v6, v5, v3

    const-string v3, "%s = ? AND %s = ?"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    const-string v8, "session_key_ref"

    aput-object v8, v6, v7

    const/4 v7, 0x1

    const-string v8, "type"

    aput-object v8, v6, v7

    invoke-static {v3, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const/4 v3, 0x2

    new-array v7, v3, [Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static/range {v32 .. v33}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v3

    const/4 v3, 0x1

    const/4 v8, 0x1

    invoke-static {v8}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v3

    const-string v8, "_id"

    move-object/from16 v3, p0

    invoke-virtual/range {v3 .. v8}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v17

    .line 1378
    new-instance v30, Lorg/json/JSONArray;

    invoke-direct/range {v30 .. v30}, Lorg/json/JSONArray;-><init>()V

    .line 1379
    .local v30, "screens":Lorg/json/JSONArray;
    :goto_2
    invoke-interface/range {v17 .. v17}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-eqz v3, :cond_18

    .line 1381
    const-string v3, "name"

    move-object/from16 v0, v17

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    move-object/from16 v0, v17

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v30

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    goto :goto_2

    .line 1391
    .end local v30    # "screens":Lorg/json/JSONArray;
    :catchall_2
    move-exception v3

    if-eqz v17, :cond_15

    .line 1393
    :try_start_9
    invoke-interface/range {v17 .. v17}, Landroid/database/Cursor;->close()V

    .line 1394
    const/16 v17, 0x0

    :cond_15
    throw v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 1357
    .end local v17    # "eventHistoryCursor":Landroid/database/Cursor;
    :cond_16
    :try_start_a
    new-instance v3, Ljava/lang/RuntimeException;

    const-string v4, "Session didn\'t exist"

    invoke-direct {v3, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 1362
    :catchall_3
    move-exception v3

    if-eqz v31, :cond_17

    .line 1364
    :try_start_b
    invoke-interface/range {v31 .. v31}, Landroid/database/Cursor;->close()V

    .line 1365
    const/16 v31, 0x0

    :cond_17
    throw v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 1384
    .restart local v17    # "eventHistoryCursor":Landroid/database/Cursor;
    .restart local v30    # "screens":Lorg/json/JSONArray;
    :cond_18
    :try_start_c
    invoke-virtual/range {v30 .. v30}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lez v3, :cond_19

    .line 1386
    const-string v3, "fl"

    move-object/from16 v0, v29

    move-object/from16 v1, v30

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 1391
    :cond_19
    if-eqz v17, :cond_1a

    .line 1393
    :try_start_d
    invoke-interface/range {v17 .. v17}, Landroid/database/Cursor;->close()V

    .line 1394
    const/16 v17, 0x0

    .line 1401
    :cond_1a
    const-string v3, "event_lat"

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-nez v3, :cond_1b

    const-string v3, "event_lng"

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-nez v3, :cond_1b

    .line 1404
    const-string v3, "event_lat"

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v22

    .line 1405
    .restart local v22    # "lat":D
    const-string v3, "event_lng"

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v24

    .line 1407
    .restart local v24    # "lng":D
    const-wide/16 v3, 0x0

    cmpl-double v3, v22, v3

    if-eqz v3, :cond_1b

    const-wide/16 v3, 0x0

    cmpl-double v3, v24, v3

    if-eqz v3, :cond_1b

    .line 1409
    const-string v3, "lat"

    move-object/from16 v0, v29

    move-wide/from16 v1, v22

    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 1410
    const-string v3, "lng"

    move-object/from16 v0, v29

    move-wide/from16 v1, v24

    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 1414
    .end local v22    # "lat":D
    .end local v24    # "lng":D
    :cond_1b
    const-string v3, "customer_id"

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-nez v3, :cond_1c

    .line 1416
    const-string v3, "customer_id"

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v14

    .line 1417
    .restart local v14    # "customerID":Ljava/lang/String;
    const-string v3, "user_type"

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v38

    .line 1419
    .restart local v38    # "userType":Ljava/lang/String;
    const-string v3, "cid"

    move-object/from16 v0, v29

    invoke-virtual {v0, v3, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1420
    const-string v3, "utp"

    move-object/from16 v0, v29

    move-object/from16 v1, v38

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1423
    .end local v14    # "customerID":Ljava/lang/String;
    .end local v38    # "userType":Ljava/lang/String;
    :cond_1c
    const-string v3, "ids"

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-nez v3, :cond_1d

    .line 1425
    const-string v3, "ids"

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v19

    .line 1426
    .restart local v19    # "ids":Ljava/lang/String;
    const-string v3, "ids"

    new-instance v4, Lorg/json/JSONObject;

    move-object/from16 v0, v19

    invoke-direct {v4, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v29

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 1432
    .end local v19    # "ids":Ljava/lang/String;
    :cond_1d
    const/4 v10, 0x0

    .line 1435
    .restart local v10    # "attributesCursor":Landroid/database/Cursor;
    :try_start_e
    const-string v4, "attributes"

    const/4 v5, 0x0

    const-string v3, "%s = ?"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    const-string v8, "events_key_ref"

    aput-object v8, v6, v7

    invoke-static {v3, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const/4 v3, 0x1

    new-array v7, v3, [Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static/range {p2 .. p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v3

    const/4 v8, 0x0

    move-object/from16 v3, p0

    invoke-virtual/range {v3 .. v8}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 1437
    const-string v3, "attribute_key"

    invoke-interface {v10, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v21

    .line 1438
    .restart local v21    # "keyColumn":I
    const-string v3, "attribute_value"

    invoke-interface {v10, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v40

    .line 1439
    .restart local v40    # "valueColumn":I
    :cond_1e
    :goto_3
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-eqz v3, :cond_29

    .line 1441
    move/from16 v0, v21

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v20

    .line 1442
    .restart local v20    # "key":Ljava/lang/String;
    move/from16 v0, v40

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v39

    .line 1444
    .restart local v39    # "value":Ljava/lang/String;
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_1:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_20

    .line 1446
    const-string v3, "c0"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    goto :goto_3

    .line 1488
    .end local v20    # "key":Ljava/lang/String;
    .end local v21    # "keyColumn":I
    .end local v39    # "value":Ljava/lang/String;
    .end local v40    # "valueColumn":I
    :catchall_4
    move-exception v3

    if-eqz v10, :cond_1f

    .line 1490
    :try_start_f
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 1491
    const/4 v10, 0x0

    :cond_1f
    throw v3
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    .line 1448
    .restart local v20    # "key":Ljava/lang/String;
    .restart local v21    # "keyColumn":I
    .restart local v39    # "value":Ljava/lang/String;
    .restart local v40    # "valueColumn":I
    :cond_20
    :try_start_10
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_2:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_21

    .line 1450
    const-string v3, "c1"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_3

    .line 1452
    :cond_21
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_3:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_22

    .line 1454
    const-string v3, "c2"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_3

    .line 1456
    :cond_22
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_4:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_23

    .line 1458
    const-string v3, "c3"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_3

    .line 1460
    :cond_23
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_5:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_24

    .line 1462
    const-string v3, "c4"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_3

    .line 1464
    :cond_24
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_6:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_25

    .line 1466
    const-string v3, "c5"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_3

    .line 1468
    :cond_25
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_7:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_26

    .line 1470
    const-string v3, "c6"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_3

    .line 1472
    :cond_26
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_8:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_27

    .line 1474
    const-string v3, "c7"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_3

    .line 1476
    :cond_27
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_9:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_28

    .line 1478
    const-string v3, "c8"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_3

    .line 1480
    :cond_28
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_10:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1e

    .line 1482
    const-string v3, "c9"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    goto/16 :goto_3

    .line 1488
    .end local v20    # "key":Ljava/lang/String;
    .end local v39    # "value":Ljava/lang/String;
    :cond_29
    if-eqz v10, :cond_11

    .line 1490
    :try_start_11
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 1491
    const/4 v10, 0x0

    goto/16 :goto_1

    .line 1495
    .end local v10    # "attributesCursor":Landroid/database/Cursor;
    .end local v17    # "eventHistoryCursor":Landroid/database/Cursor;
    .end local v21    # "keyColumn":I
    .end local v30    # "screens":Lorg/json/JSONArray;
    .end local v31    # "sessionCursor":Landroid/database/Cursor;
    .end local v40    # "valueColumn":I
    :cond_2a
    sget-object v3, Lcom/localytics/android/Constants;->OPT_IN_EVENT:Ljava/lang/String;

    move-object/from16 v0, v18

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2b

    sget-object v3, Lcom/localytics/android/Constants;->OPT_OUT_EVENT:Ljava/lang/String;

    move-object/from16 v0, v18

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2d

    .line 1497
    :cond_2b
    const-string v3, "dt"

    const-string v4, "o"

    move-object/from16 v0, v29

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1498
    const-string v3, "u"

    move-object/from16 v0, v29

    move-object/from16 v1, p6

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1499
    const-string v4, "out"

    sget-object v3, Lcom/localytics/android/Constants;->OPT_OUT_EVENT:Ljava/lang/String;

    move-object/from16 v0, v18

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2c

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_4
    move-object/from16 v0, v29

    invoke-virtual {v0, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1500
    const-string v3, "ct"

    const-string v4, "wall_time"

    invoke-interface {v13, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v13, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    long-to-double v4, v4

    const-wide v6, 0x408f400000000000L    # 1000.0

    div-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v4

    move-object/from16 v0, v29

    invoke-virtual {v0, v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    goto/16 :goto_1

    .line 1499
    :cond_2c
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_4

    .line 1503
    :cond_2d
    sget-object v3, Lcom/localytics/android/Constants;->FLOW_EVENT:Ljava/lang/String;

    move-object/from16 v0, v18

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_32

    .line 1505
    const-string v3, "dt"

    const-string v4, "f"

    move-object/from16 v0, v29

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1506
    const-string v3, "u"

    const-string v4, "uuid"

    invoke-interface {v13, v4}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v13, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v29

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1507
    const-string v3, "ss"

    move-wide/from16 v0, v34

    long-to-double v4, v0

    const-wide v6, 0x408f400000000000L    # 1000.0

    div-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v4

    move-object/from16 v0, v29

    invoke-virtual {v0, v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    .line 1516
    const/16 v17, 0x0

    .line 1519
    .restart local v17    # "eventHistoryCursor":Landroid/database/Cursor;
    :try_start_12
    const-string v4, "event_history"

    const/4 v3, 0x3

    new-array v5, v3, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v6, "type"

    aput-object v6, v5, v3

    const/4 v3, 0x1

    const-string v6, "processed_in_blob"

    aput-object v6, v5, v3

    const/4 v3, 0x2

    const-string v6, "name"

    aput-object v6, v5, v3

    const-string v3, "%s = ? AND %s <= ?"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    const-string v8, "session_key_ref"

    aput-object v8, v6, v7

    const/4 v7, 0x1

    const-string v8, "processed_in_blob"

    aput-object v8, v6, v7

    invoke-static {v3, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const/4 v3, 0x2

    new-array v7, v3, [Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static/range {v32 .. v33}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v3

    const/4 v3, 0x1

    invoke-static/range {p4 .. p5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v3

    const-string v8, "_id"

    move-object/from16 v3, p0

    invoke-virtual/range {v3 .. v8}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v17

    .line 1525
    new-instance v27, Lorg/json/JSONArray;

    invoke-direct/range {v27 .. v27}, Lorg/json/JSONArray;-><init>()V

    .line 1526
    .local v27, "newScreens":Lorg/json/JSONArray;
    new-instance v28, Lorg/json/JSONArray;

    invoke-direct/range {v28 .. v28}, Lorg/json/JSONArray;-><init>()V

    .line 1527
    .local v28, "oldScreens":Lorg/json/JSONArray;
    :goto_5
    invoke-interface/range {v17 .. v17}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-eqz v3, :cond_31

    .line 1529
    const-string v3, "name"

    move-object/from16 v0, v17

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    move-object/from16 v0, v17

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v26

    .line 1531
    .local v26, "name":Ljava/lang/String;
    const-string v3, "type"

    move-object/from16 v0, v17

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    move-object/from16 v0, v17

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    if-nez v3, :cond_2f

    .line 1533
    const-string v37, "e"

    .line 1540
    .local v37, "type":Ljava/lang/String;
    :goto_6
    const-string v3, "processed_in_blob"

    move-object/from16 v0, v17

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    move-object/from16 v0, v17

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    cmp-long v3, p4, v3

    if-nez v3, :cond_30

    .line 1542
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    move-object/from16 v0, v37

    move-object/from16 v1, v26

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v3

    move-object/from16 v0, v27

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_5

    goto :goto_5

    .line 1555
    .end local v26    # "name":Ljava/lang/String;
    .end local v27    # "newScreens":Lorg/json/JSONArray;
    .end local v28    # "oldScreens":Lorg/json/JSONArray;
    .end local v37    # "type":Ljava/lang/String;
    :catchall_5
    move-exception v3

    if-eqz v17, :cond_2e

    .line 1557
    :try_start_13
    invoke-interface/range {v17 .. v17}, Landroid/database/Cursor;->close()V

    .line 1558
    const/16 v17, 0x0

    :cond_2e
    throw v3
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_1

    .line 1537
    .restart local v26    # "name":Ljava/lang/String;
    .restart local v27    # "newScreens":Lorg/json/JSONArray;
    .restart local v28    # "oldScreens":Lorg/json/JSONArray;
    :cond_2f
    :try_start_14
    const-string v37, "s"

    .restart local v37    # "type":Ljava/lang/String;
    goto :goto_6

    .line 1546
    :cond_30
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    move-object/from16 v0, v37

    move-object/from16 v1, v26

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v3

    move-object/from16 v0, v28

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_5

    .line 1550
    .end local v26    # "name":Ljava/lang/String;
    .end local v37    # "type":Ljava/lang/String;
    :cond_31
    const-string v3, "nw"

    move-object/from16 v0, v29

    move-object/from16 v1, v27

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1551
    const-string v3, "od"

    move-object/from16 v0, v29

    move-object/from16 v1, v28

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_5

    .line 1555
    if-eqz v17, :cond_11

    .line 1557
    :try_start_15
    invoke-interface/range {v17 .. v17}, Landroid/database/Cursor;->close()V

    .line 1558
    const/16 v17, 0x0

    goto/16 :goto_1

    .line 1568
    .end local v17    # "eventHistoryCursor":Landroid/database/Cursor;
    .end local v27    # "newScreens":Lorg/json/JSONArray;
    .end local v28    # "oldScreens":Lorg/json/JSONArray;
    :cond_32
    const-string v3, "dt"

    const-string v4, "e"

    move-object/from16 v0, v29

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1569
    const-string v3, "ct"

    const-string v4, "wall_time"

    invoke-interface {v13, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v13, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    long-to-double v4, v4

    const-wide v6, 0x408f400000000000L    # 1000.0

    div-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v4

    move-object/from16 v0, v29

    invoke-virtual {v0, v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 1571
    const-string v3, "u"

    const-string v4, "uuid"

    invoke-interface {v13, v4}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v13, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v29

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1572
    const-string v3, "su"

    move-object/from16 v0, v29

    move-object/from16 v1, v36

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1573
    const-string v3, "n"

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v5

    move-object/from16 v0, v18

    invoke-virtual {v0, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v29

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1578
    const-string v3, "clv_increase"

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v11

    .line 1579
    .local v11, "clv":J
    const-wide/16 v3, 0x0

    cmp-long v3, v11, v3

    if-eqz v3, :cond_33

    .line 1581
    const-string v3, "v"

    move-object/from16 v0, v29

    invoke-virtual {v0, v3, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 1587
    :cond_33
    const-string v3, "event_lat"

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-nez v3, :cond_34

    const-string v3, "event_lng"

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-nez v3, :cond_34

    .line 1590
    const-string v3, "event_lat"

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v22

    .line 1591
    .restart local v22    # "lat":D
    const-string v3, "event_lng"

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v24

    .line 1593
    .restart local v24    # "lng":D
    const-wide/16 v3, 0x0

    cmpl-double v3, v22, v3

    if-eqz v3, :cond_34

    const-wide/16 v3, 0x0

    cmpl-double v3, v24, v3

    if-eqz v3, :cond_34

    .line 1595
    const-string v3, "lat"

    move-object/from16 v0, v29

    move-wide/from16 v1, v22

    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 1596
    const-string v3, "lng"

    move-object/from16 v0, v29

    move-wide/from16 v1, v24

    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 1600
    .end local v22    # "lat":D
    .end local v24    # "lng":D
    :cond_34
    const-string v3, "customer_id"

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-nez v3, :cond_35

    .line 1602
    const-string v3, "customer_id"

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v14

    .line 1603
    .restart local v14    # "customerID":Ljava/lang/String;
    const-string v3, "user_type"

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v38

    .line 1605
    .restart local v38    # "userType":Ljava/lang/String;
    const-string v3, "cid"

    move-object/from16 v0, v29

    invoke-virtual {v0, v3, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1606
    const-string v3, "utp"

    move-object/from16 v0, v29

    move-object/from16 v1, v38

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1609
    .end local v14    # "customerID":Ljava/lang/String;
    .end local v38    # "userType":Ljava/lang/String;
    :cond_35
    const-string v3, "ids"

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-nez v3, :cond_36

    .line 1611
    const-string v3, "ids"

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v19

    .line 1612
    .restart local v19    # "ids":Ljava/lang/String;
    const-string v3, "ids"

    new-instance v4, Lorg/json/JSONObject;

    move-object/from16 v0, v19

    invoke-direct {v4, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v29

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_1

    .line 1618
    .end local v19    # "ids":Ljava/lang/String;
    :cond_36
    const/4 v10, 0x0

    .line 1621
    .restart local v10    # "attributesCursor":Landroid/database/Cursor;
    :try_start_16
    const-string v4, "attributes"

    const/4 v5, 0x0

    const-string v3, "%s = ?"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    const-string v8, "events_key_ref"

    aput-object v8, v6, v7

    invoke-static {v3, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const/4 v3, 0x1

    new-array v7, v3, [Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static/range {p2 .. p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v3

    const/4 v8, 0x0

    move-object/from16 v3, p0

    invoke-virtual/range {v3 .. v8}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 1623
    const-string v3, "attribute_key"

    invoke-interface {v10, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v21

    .line 1624
    .restart local v21    # "keyColumn":I
    const-string v3, "attribute_value"

    invoke-interface {v10, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v40

    .line 1625
    .restart local v40    # "valueColumn":I
    :cond_37
    :goto_7
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-eqz v3, :cond_42

    .line 1627
    move/from16 v0, v21

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v20

    .line 1628
    .restart local v20    # "key":Ljava/lang/String;
    move/from16 v0, v40

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v39

    .line 1630
    .restart local v39    # "value":Ljava/lang/String;
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_1:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_39

    .line 1632
    const-string v3, "c0"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_6

    goto :goto_7

    .line 1674
    .end local v20    # "key":Ljava/lang/String;
    .end local v21    # "keyColumn":I
    .end local v39    # "value":Ljava/lang/String;
    .end local v40    # "valueColumn":I
    :catchall_6
    move-exception v3

    if-eqz v10, :cond_38

    .line 1676
    :try_start_17
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 1677
    const/4 v10, 0x0

    :cond_38
    throw v3
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_1

    .line 1634
    .restart local v20    # "key":Ljava/lang/String;
    .restart local v21    # "keyColumn":I
    .restart local v39    # "value":Ljava/lang/String;
    .restart local v40    # "valueColumn":I
    :cond_39
    :try_start_18
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_2:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3a

    .line 1636
    const-string v3, "c1"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_7

    .line 1638
    :cond_3a
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_3:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3b

    .line 1640
    const-string v3, "c2"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_7

    .line 1642
    :cond_3b
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_4:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3c

    .line 1644
    const-string v3, "c3"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_7

    .line 1646
    :cond_3c
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_5:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3d

    .line 1648
    const-string v3, "c4"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_7

    .line 1650
    :cond_3d
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_6:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3e

    .line 1652
    const-string v3, "c5"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_7

    .line 1654
    :cond_3e
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_7:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3f

    .line 1656
    const-string v3, "c6"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_7

    .line 1658
    :cond_3f
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_8:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_40

    .line 1660
    const-string v3, "c7"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_7

    .line 1662
    :cond_40
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_9:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_41

    .line 1664
    const-string v3, "c8"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_7

    .line 1666
    :cond_41
    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_10:Ljava/lang/String;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_37

    .line 1668
    const-string v3, "c9"

    move-object/from16 v0, v29

    move-object/from16 v1, v39

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_6

    goto/16 :goto_7

    .line 1674
    .end local v20    # "key":Ljava/lang/String;
    .end local v39    # "value":Ljava/lang/String;
    :cond_42
    if-eqz v10, :cond_43

    .line 1676
    :try_start_19
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 1677
    const/4 v10, 0x0

    .line 1681
    :cond_43
    invoke-static/range {p0 .. p3}, Lcom/localytics/android/UploadHandler;->convertAttributesToJson(Lcom/localytics/android/LocalyticsProvider;Landroid/content/Context;J)Lorg/json/JSONObject;

    move-result-object v9

    .line 1683
    .local v9, "attributes":Lorg/json/JSONObject;
    if-eqz v9, :cond_11

    .line 1685
    const-string v3, "attrs"

    move-object/from16 v0, v29

    invoke-virtual {v0, v3, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_1

    .line 1694
    .end local v9    # "attributes":Lorg/json/JSONObject;
    .end local v10    # "attributesCursor":Landroid/database/Cursor;
    .end local v11    # "clv":J
    .end local v18    # "eventName":Ljava/lang/String;
    .end local v21    # "keyColumn":I
    .end local v32    # "sessionId":J
    .end local v34    # "sessionStartTime":J
    .end local v36    # "sessionUuid":Ljava/lang/String;
    .end local v40    # "valueColumn":I
    :cond_44
    new-instance v3, Ljava/lang/RuntimeException;

    invoke-direct {v3}, Ljava/lang/RuntimeException;-><init>()V

    throw v3
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_1
.end method

.method static deleteBlobsAndSessions(Lcom/localytics/android/LocalyticsProvider;)V
    .locals 25
    .param p0, "provider"    # Lcom/localytics/android/LocalyticsProvider;

    .prologue
    .line 912
    new-instance v21, Ljava/util/LinkedList;

    invoke-direct/range {v21 .. v21}, Ljava/util/LinkedList;-><init>()V

    .line 913
    .local v21, "sessionsToDelete":Ljava/util/LinkedList;, "Ljava/util/LinkedList<Ljava/lang/Long;>;"
    new-instance v13, Ljava/util/HashSet;

    invoke-direct {v13}, Ljava/util/HashSet;-><init>()V

    .line 915
    .local v13, "blobsToDelete":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/Long;>;"
    const/4 v10, 0x0

    .line 918
    .local v10, "blobEvents":Landroid/database/Cursor;
    :try_start_0
    const-string v2, "upload_blob_events"

    const/4 v1, 0x3

    new-array v3, v1, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v4, "_id"

    aput-object v4, v3, v1

    const/4 v1, 0x1

    const-string v4, "events_key_ref"

    aput-object v4, v3, v1

    const/4 v1, 0x2

    const-string v4, "upload_blobs_key_ref"

    aput-object v4, v3, v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v1, p0

    invoke-virtual/range {v1 .. v6}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 924
    const-string v1, "upload_blobs_key_ref"

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v22

    .line 925
    .local v22, "uploadBlobIdColumn":I
    const-string v1, "_id"

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v9

    .line 926
    .local v9, "blobEventIdColumn":I
    const-string v1, "events_key_ref"

    invoke-interface {v10, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v17

    .line 927
    .local v17, "eventIdColumn":I
    :goto_0
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 929
    move/from16 v0, v22

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v11

    .line 930
    .local v11, "blobId":J
    invoke-interface {v10, v9}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v7

    .line 931
    .local v7, "blobEventId":J
    move/from16 v0, v17

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v15

    .line 934
    .local v15, "eventId":J
    const-string v1, "upload_blob_events"

    const-string v2, "%s = ?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "_id"

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    invoke-static {v7, v8}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    move-object/from16 v0, p0

    invoke-virtual {v0, v1, v2, v3}, Lcom/localytics/android/LocalyticsProvider;->remove(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 939
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v13, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 942
    const-string v1, "attributes"

    const-string v2, "%s = ?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "events_key_ref"

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    move-object/from16 v0, p0

    invoke-virtual {v0, v1, v2, v3}, Lcom/localytics/android/LocalyticsProvider;->remove(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 947
    const/4 v14, 0x0

    .line 950
    .local v14, "eventCursor":Landroid/database/Cursor;
    :try_start_1
    const-string v2, "events"

    const/4 v1, 0x1

    new-array v3, v1, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v4, "session_key_ref"

    aput-object v4, v3, v1

    const-string v1, "%s = ? AND %s = ?"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    const-string v6, "_id"

    aput-object v6, v4, v5

    const/4 v5, 0x1

    const-string v6, "event_name"

    aput-object v6, v4, v5

    invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/4 v1, 0x2

    new-array v5, v1, [Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v1

    const/4 v1, 0x1

    sget-object v6, Lcom/localytics/android/Constants;->CLOSE_EVENT:Ljava/lang/String;

    aput-object v6, v5, v1

    const/4 v6, 0x0

    move-object/from16 v1, p0

    invoke-virtual/range {v1 .. v6}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v14

    .line 956
    invoke-interface {v14}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 958
    const-string v1, "session_key_ref"

    invoke-interface {v14, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v14, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v19

    .line 960
    .local v19, "sessionId":J
    const-string v1, "event_history"

    const-string v2, "%s = ?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "session_key_ref"

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    invoke-static/range {v19 .. v20}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    move-object/from16 v0, p0

    invoke-virtual {v0, v1, v2, v3}, Lcom/localytics/android/LocalyticsProvider;->remove(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 963
    const-string v1, "session_key_ref"

    invoke-interface {v14, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v14, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object/from16 v0, v21

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 968
    .end local v19    # "sessionId":J
    :cond_0
    if-eqz v14, :cond_1

    .line 970
    :try_start_2
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 971
    const/4 v14, 0x0

    .line 976
    :cond_1
    const-string v1, "events"

    const-string v2, "%s = ?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "_id"

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    move-object/from16 v0, p0

    invoke-virtual {v0, v1, v2, v3}, Lcom/localytics/android/LocalyticsProvider;->remove(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0

    .line 981
    .end local v7    # "blobEventId":J
    .end local v9    # "blobEventIdColumn":I
    .end local v11    # "blobId":J
    .end local v14    # "eventCursor":Landroid/database/Cursor;
    .end local v15    # "eventId":J
    .end local v17    # "eventIdColumn":I
    .end local v22    # "uploadBlobIdColumn":I
    :catchall_0
    move-exception v1

    if-eqz v10, :cond_2

    .line 983
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 984
    const/4 v10, 0x0

    :cond_2
    throw v1

    .line 968
    .restart local v7    # "blobEventId":J
    .restart local v9    # "blobEventIdColumn":I
    .restart local v11    # "blobId":J
    .restart local v14    # "eventCursor":Landroid/database/Cursor;
    .restart local v15    # "eventId":J
    .restart local v17    # "eventIdColumn":I
    .restart local v22    # "uploadBlobIdColumn":I
    :catchall_1
    move-exception v1

    if-eqz v14, :cond_3

    .line 970
    :try_start_3
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 971
    const/4 v14, 0x0

    :cond_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 981
    .end local v7    # "blobEventId":J
    .end local v11    # "blobId":J
    .end local v14    # "eventCursor":Landroid/database/Cursor;
    .end local v15    # "eventId":J
    :cond_4
    if-eqz v10, :cond_5

    .line 983
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 984
    const/4 v10, 0x0

    .line 989
    :cond_5
    invoke-virtual {v13}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v18

    .local v18, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v23

    .line 991
    .local v23, "x":J
    const-string v1, "upload_blobs"

    const-string v2, "%s = ?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "_id"

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    invoke-static/range {v23 .. v24}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    move-object/from16 v0, p0

    invoke-virtual {v0, v1, v2, v3}, Lcom/localytics/android/LocalyticsProvider;->remove(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    goto :goto_1

    .line 995
    .end local v23    # "x":J
    :cond_6
    invoke-virtual/range {v21 .. v21}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_2
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v23

    .line 997
    .restart local v23    # "x":J
    const-string v1, "sessions"

    const-string v2, "%s = ?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "_id"

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    invoke-static/range {v23 .. v24}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    move-object/from16 v0, p0

    invoke-virtual {v0, v1, v2, v3}, Lcom/localytics/android/LocalyticsProvider;->remove(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    goto :goto_2

    .line 999
    .end local v23    # "x":J
    :cond_7
    return-void
.end method

.method static deleteProfileAttribute(Lcom/localytics/android/LocalyticsProvider;Ljava/lang/StringBuilder;)V
    .locals 5
    .param p0, "provider"    # Lcom/localytics/android/LocalyticsProvider;
    .param p1, "rowsToDelete"    # Ljava/lang/StringBuilder;

    .prologue
    .line 894
    const-string v0, "profile"

    const-string v1, "%s IN (%s)"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "_id"

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/localytics/android/LocalyticsProvider;->remove(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 895
    return-void
.end method

.method private getApiKey()Ljava/lang/String;
    .locals 3

    .prologue
    .line 169
    iget-object v0, p0, Lcom/localytics/android/UploadHandler;->mApiKey:Ljava/lang/String;

    .line 170
    .local v0, "apiKey":Ljava/lang/String;
    iget-object v2, p0, Lcom/localytics/android/UploadHandler;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/localytics/android/DatapointHelper;->getLocalyticsRollupKeyOrNull(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 171
    .local v1, "rollupKey":Ljava/lang/String;
    if-eqz v1, :cond_0

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 173
    move-object v0, v1

    .line 176
    :cond_0
    return-object v0
.end method

.method static getApiKeyCreationTime(Lcom/localytics/android/LocalyticsProvider;Ljava/lang/String;)J
    .locals 7
    .param p0, "provider"    # Lcom/localytics/android/LocalyticsProvider;
    .param p1, "key"    # Ljava/lang/String;

    .prologue
    .line 1011
    const/4 v6, 0x0

    .line 1014
    .local v6, "cursor":Landroid/database/Cursor;
    :try_start_0
    const-string v1, "api_keys"

    const/4 v2, 0x0

    const-string v0, "%s = ?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "api_key"

    aput-object v5, v3, v4

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v4, v0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 1016
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1018
    const-string v0, "created_time"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    long-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    int-to-long v0, v0

    .line 1028
    if-eqz v6, :cond_0

    .line 1030
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1031
    const/4 v6, 0x0

    :cond_0
    return-wide v0

    .line 1024
    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "API key entry couldn\'t be found"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1028
    :catchall_0
    move-exception v0

    if-eqz v6, :cond_2

    .line 1030
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1031
    const/4 v6, 0x0

    :cond_2
    throw v0
.end method

.method static getAttributesFromSession(Lcom/localytics/android/LocalyticsProvider;Ljava/lang/String;J)Lorg/json/JSONObject;
    .locals 18
    .param p0, "provider"    # Lcom/localytics/android/LocalyticsProvider;
    .param p1, "apiKey"    # Ljava/lang/String;
    .param p2, "sessionId"    # J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 1048
    const/4 v8, 0x0

    .line 1051
    .local v8, "cursor":Landroid/database/Cursor;
    :try_start_0
    const-string v3, "sessions"

    const/4 v4, 0x0

    const-string v2, "%s = ?"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    const-string v7, "_id"

    aput-object v7, v5, v6

    invoke-static {v2, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v2, 0x1

    new-array v6, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static/range {p2 .. p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v2

    const/4 v7, 0x0

    move-object/from16 v2, p0

    invoke-virtual/range {v2 .. v7}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 1053
    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_c

    .line 1055
    new-instance v17, Lorg/json/JSONObject;

    invoke-direct/range {v17 .. v17}, Lorg/json/JSONObject;-><init>()V

    .line 1058
    .local v17, "result":Lorg/json/JSONObject;
    const-string v2, "av"

    const-string v3, "app_version"

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1059
    const-string v2, "dac"

    const-string v3, "network_type"

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1060
    const-string v2, "device_android_id_hash"

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 1061
    .local v9, "deviceID":Ljava/lang/String;
    const-string v2, ""

    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1062
    const-string v2, "du"

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1064
    :cond_0
    const-string v2, "dc"

    const-string v3, "device_country"

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1065
    const-string v2, "dma"

    const-string v3, "device_manufacturer"

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1066
    const-string v2, "dmo"

    const-string v3, "device_model"

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1067
    const-string v2, "dov"

    const-string v3, "android_version"

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1068
    const-string v2, "dp"

    const-string v3, "Android"

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1069
    const-string v3, "dms"

    const-string v2, "device_serial_number_hash"

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v8, v2}, Landroid/database/Cursor;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_9

    sget-object v2, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    :goto_0
    move-object/from16 v0, v17

    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1071
    const-string v2, "dsdk"

    const-string v3, "android_sdk"

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1072
    const-string v2, "au"

    move-object/from16 v0, v17

    move-object/from16 v1, p1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1073
    const-string v2, "lv"

    const-string v3, "localytics_library_version"

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1074
    const-string v2, "dt"

    const-string v3, "a"

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1075
    const-string v3, "caid"

    const-string v2, "device_android_id"

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v8, v2}, Landroid/database/Cursor;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_a

    sget-object v2, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    :goto_1
    move-object/from16 v0, v17

    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1077
    const-string v3, "gcadid"

    const-string v2, "device_advertising_id"

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v8, v2}, Landroid/database/Cursor;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_b

    sget-object v2, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    :goto_2
    move-object/from16 v0, v17

    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1081
    const-string v2, "iu"

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 1082
    .local v13, "installationID":Ljava/lang/String;
    if-eqz v13, :cond_1

    .line 1084
    const-string v2, "iu"

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1086
    :cond_1
    const-string v2, "dlc"

    const-string v3, "locale_country"

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1087
    const-string v2, "dll"

    const-string v3, "locale_language"

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1088
    const-string v2, "nca"

    const-string v3, "network_carrier"

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1089
    const-string v2, "nc"

    const-string v3, "network_country"

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1092
    const-string v2, "fb_attribution"

    move-object/from16 v0, p0

    invoke-static {v0, v2}, Lcom/localytics/android/UploadHandler;->getStringFromAppInfo(Lcom/localytics/android/LocalyticsProvider;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 1093
    .local v10, "fbAttribution":Ljava/lang/String;
    if-eqz v10, :cond_2

    .line 1095
    const-string v2, "fbat"

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1098
    :cond_2
    const-string v2, "play_attribution"

    move-object/from16 v0, p0

    invoke-static {v0, v2}, Lcom/localytics/android/UploadHandler;->getStringFromAppInfo(Lcom/localytics/android/LocalyticsProvider;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 1099
    .local v15, "playAttribution":Ljava/lang/String;
    if-eqz v15, :cond_3

    .line 1101
    const-string v2, "aurl"

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1104
    :cond_3
    const-string v2, "registration_id"

    move-object/from16 v0, p0

    invoke-static {v0, v2}, Lcom/localytics/android/UploadHandler;->getStringFromAppInfo(Lcom/localytics/android/LocalyticsProvider;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 1105
    .local v16, "registrationId":Ljava/lang/String;
    if-eqz v16, :cond_4

    .line 1107
    const-string v2, "push"

    move-object/from16 v0, v17

    move-object/from16 v1, v16

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1110
    :cond_4
    const-string v2, "first_android_id"

    move-object/from16 v0, p0

    invoke-static {v0, v2}, Lcom/localytics/android/UploadHandler;->getStringFromAppInfo(Lcom/localytics/android/LocalyticsProvider;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 1111
    .local v12, "firstAndroidId":Ljava/lang/String;
    if-eqz v12, :cond_5

    .line 1113
    const-string v2, "aid"

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1116
    :cond_5
    const-string v2, "first_advertising_id"

    move-object/from16 v0, p0

    invoke-static {v0, v2}, Lcom/localytics/android/UploadHandler;->getStringFromAppInfo(Lcom/localytics/android/LocalyticsProvider;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 1117
    .local v11, "firstAdvertisingId":Ljava/lang/String;
    if-eqz v11, :cond_6

    .line 1119
    const-string v2, "gadid"

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1122
    :cond_6
    const-string v2, "package_name"

    move-object/from16 v0, p0

    invoke-static {v0, v2}, Lcom/localytics/android/UploadHandler;->getStringFromAppInfo(Lcom/localytics/android/LocalyticsProvider;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 1123
    .local v14, "packageName":Ljava/lang/String;
    if-eqz v14, :cond_7

    .line 1125
    const-string v2, "pkg"

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1135
    :cond_7
    if-eqz v8, :cond_8

    .line 1137
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 1138
    const/4 v8, 0x0

    :cond_8
    return-object v17

    .line 1069
    .end local v10    # "fbAttribution":Ljava/lang/String;
    .end local v11    # "firstAdvertisingId":Ljava/lang/String;
    .end local v12    # "firstAndroidId":Ljava/lang/String;
    .end local v13    # "installationID":Ljava/lang/String;
    .end local v14    # "packageName":Ljava/lang/String;
    .end local v15    # "playAttribution":Ljava/lang/String;
    .end local v16    # "registrationId":Ljava/lang/String;
    :cond_9
    :try_start_1
    const-string v2, "device_serial_number_hash"

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_0

    .line 1075
    :cond_a
    const-string v2, "device_android_id"

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_1

    .line 1077
    :cond_b
    const-string v2, "device_advertising_id"

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_2

    .line 1131
    .end local v9    # "deviceID":Ljava/lang/String;
    .end local v17    # "result":Lorg/json/JSONObject;
    :cond_c
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "No session exists"

    invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1135
    :catchall_0
    move-exception v2

    if-eqz v8, :cond_d

    .line 1137
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 1138
    const/4 v8, 0x0

    :cond_d
    throw v2
.end method

.method static getCustomerID(Lcom/localytics/android/LocalyticsProvider;)Ljava/lang/String;
    .locals 2
    .param p0, "provider"    # Lcom/localytics/android/LocalyticsProvider;

    .prologue
    .line 889
    invoke-virtual {p0}, Lcom/localytics/android/LocalyticsProvider;->getUserIdAndType()Ljava/util/Map;

    move-result-object v0

    const-string v1, "id"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method static getElapsedTimeSinceLastSession(Lcom/localytics/android/LocalyticsProvider;J)J
    .locals 7
    .param p0, "provider"    # Lcom/localytics/android/LocalyticsProvider;
    .param p1, "sessionId"    # J

    .prologue
    .line 1856
    const/4 v6, 0x0

    .line 1859
    .local v6, "cursor":Landroid/database/Cursor;
    :try_start_0
    const-string v1, "sessions"

    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string v3, "elapsed"

    aput-object v3, v2, v0

    const-string v0, "%s = ?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "_id"

    aput-object v5, v3, v4

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 1862
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1864
    const-string v0, "elapsed"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getLong(I)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    .line 1874
    if-eqz v6, :cond_0

    .line 1876
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1877
    const/4 v6, 0x0

    :cond_0
    return-wide v0

    .line 1870
    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1874
    :catchall_0
    move-exception v0

    if-eqz v6, :cond_2

    .line 1876
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1877
    const/4 v6, 0x0

    :cond_2
    throw v0
.end method

.method static getIdentifiers(Lcom/localytics/android/LocalyticsProvider;)Lorg/json/JSONObject;
    .locals 8
    .param p0, "provider"    # Lcom/localytics/android/LocalyticsProvider;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 1152
    const/4 v6, 0x0

    .line 1155
    .local v6, "cursor":Landroid/database/Cursor;
    :try_start_0
    const-string v1, "identifiers"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 1157
    const/4 v7, 0x0

    .line 1159
    .local v7, "result":Lorg/json/JSONObject;
    :goto_0
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1161
    if-nez v7, :cond_0

    .line 1163
    new-instance v7, Lorg/json/JSONObject;

    .end local v7    # "result":Lorg/json/JSONObject;
    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 1166
    .restart local v7    # "result":Lorg/json/JSONObject;
    :cond_0
    const-string v0, "key"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "value"

    invoke-interface {v6, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v6, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 1173
    .end local v7    # "result":Lorg/json/JSONObject;
    :catchall_0
    move-exception v0

    if-eqz v6, :cond_1

    .line 1175
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1176
    const/4 v6, 0x0

    :cond_1
    throw v0

    .line 1173
    .restart local v7    # "result":Lorg/json/JSONObject;
    :cond_2
    if-eqz v6, :cond_3

    .line 1175
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1176
    const/4 v6, 0x0

    :cond_3
    return-object v7
.end method

.method static getProfileAttributes(Lcom/localytics/android/LocalyticsProvider;)Ljava/util/TreeMap;
    .locals 16
    .param p0, "provider"    # Lcom/localytics/android/LocalyticsProvider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/localytics/android/LocalyticsProvider;",
            ")",
            "Ljava/util/TreeMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/localytics/android/UploadHandler$ProfileUploadDataPair;",
            ">;"
        }
    .end annotation

    .prologue
    .line 814
    new-instance v13, Ljava/util/TreeMap;

    invoke-direct {v13}, Ljava/util/TreeMap;-><init>()V

    .line 815
    .local v13, "profileAttributes":Ljava/util/TreeMap;, "Ljava/util/TreeMap<Ljava/lang/String;Lcom/localytics/android/UploadHandler$ProfileUploadDataPair;>;"
    const/4 v8, 0x0

    .line 818
    .local v8, "cursor":Landroid/database/Cursor;
    :try_start_0
    const-string v1, "profile"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "_id ASC"

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 820
    :cond_0
    :goto_0
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 822
    const-string v0, "action"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v12

    .line 823
    .local v12, "operation":I
    sget-object v0, Lcom/localytics/android/LocalyticsSession$ProfileDbAction;->SET_ATTRIBUTE:Lcom/localytics/android/LocalyticsSession$ProfileDbAction;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsSession$ProfileDbAction;->ordinal()I

    move-result v0

    if-ne v12, v0, :cond_0

    .line 825
    const-string v0, "customer_id"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 826
    .local v9, "customerID":Ljava/lang/String;
    const-string v0, "attribute"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 827
    .local v7, "attributeString":Ljava/lang/String;
    const-string v0, "_id"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v14

    .line 829
    .local v14, "rowID":Ljava/lang/String;
    invoke-virtual {v13, v9}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/localytics/android/UploadHandler$ProfileUploadDataPair;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 833
    .local v15, "tupleForCustomer":Lcom/localytics/android/UploadHandler$ProfileUploadDataPair;
    :try_start_1
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 844
    .local v6, "attributeJSON":Lorg/json/JSONObject;
    :cond_1
    :goto_1
    if-nez v15, :cond_3

    .line 846
    :try_start_2
    new-instance v15, Lcom/localytics/android/UploadHandler$ProfileUploadDataPair;

    .end local v15    # "tupleForCustomer":Lcom/localytics/android/UploadHandler$ProfileUploadDataPair;
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {v15, v6, v0}, Lcom/localytics/android/UploadHandler$ProfileUploadDataPair;-><init>(Lorg/json/JSONObject;Ljava/lang/StringBuilder;)V

    .line 847
    .restart local v15    # "tupleForCustomer":Lcom/localytics/android/UploadHandler$ProfileUploadDataPair;
    invoke-virtual {v13, v9, v15}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 865
    .end local v6    # "attributeJSON":Lorg/json/JSONObject;
    .end local v7    # "attributeString":Ljava/lang/String;
    .end local v9    # "customerID":Ljava/lang/String;
    .end local v12    # "operation":I
    .end local v14    # "rowID":Ljava/lang/String;
    .end local v15    # "tupleForCustomer":Lcom/localytics/android/UploadHandler$ProfileUploadDataPair;
    :catchall_0
    move-exception v0

    if-eqz v8, :cond_2

    .line 867
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 868
    const/4 v8, 0x0

    :cond_2
    throw v0

    .line 835
    .restart local v7    # "attributeString":Ljava/lang/String;
    .restart local v9    # "customerID":Ljava/lang/String;
    .restart local v12    # "operation":I
    .restart local v14    # "rowID":Ljava/lang/String;
    .restart local v15    # "tupleForCustomer":Lcom/localytics/android/UploadHandler$ProfileUploadDataPair;
    :catch_0
    move-exception v10

    .line 837
    .local v10, "e":Lorg/json/JSONException;
    :try_start_3
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 838
    .restart local v6    # "attributeJSON":Lorg/json/JSONObject;
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_1

    .line 840
    const-string v0, "Localytics"

    const-string v1, "Profile attribute is unreadable; data will not be uploaded but will be deleted."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 851
    .end local v10    # "e":Lorg/json/JSONException;
    :cond_3
    iget-object v0, v15, Lcom/localytics/android/UploadHandler$ProfileUploadDataPair;->rowIDs:Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 854
    :try_start_4
    invoke-virtual {v6}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    .line 855
    .local v11, "key":Ljava/lang/String;
    iget-object v0, v15, Lcom/localytics/android/UploadHandler$ProfileUploadDataPair;->consolidatedJSON:Lorg/json/JSONObject;

    invoke-virtual {v6, v11}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v11, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_0

    .line 857
    .end local v11    # "key":Ljava/lang/String;
    :catch_1
    move-exception v0

    goto/16 :goto_0

    .line 865
    .end local v6    # "attributeJSON":Lorg/json/JSONObject;
    .end local v7    # "attributeString":Ljava/lang/String;
    .end local v9    # "customerID":Ljava/lang/String;
    .end local v12    # "operation":I
    .end local v14    # "rowID":Ljava/lang/String;
    .end local v15    # "tupleForCustomer":Lcom/localytics/android/UploadHandler$ProfileUploadDataPair;
    :cond_4
    if-eqz v8, :cond_5

    .line 867
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 868
    const/4 v8, 0x0

    .line 872
    :cond_5
    return-object v13
.end method

.method static getSessionIdForBlobId(Lcom/localytics/android/LocalyticsProvider;J)J
    .locals 11
    .param p0, "provider"    # Lcom/localytics/android/LocalyticsProvider;
    .param p1, "blobId"    # J

    .prologue
    .line 1942
    const/4 v6, 0x0

    .line 1945
    .local v6, "cursor":Landroid/database/Cursor;
    :try_start_0
    const-string v1, "upload_blob_events"

    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string v3, "events_key_ref"

    aput-object v3, v2, v0

    const-string v0, "%s = ?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "upload_blobs_key_ref"

    aput-object v5, v3, v4

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 1949
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1951
    const-string v0, "events_key_ref"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getLong(I)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v7

    .line 1963
    .local v7, "eventId":J
    if-eqz v6, :cond_0

    .line 1965
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1966
    const/4 v6, 0x0

    .line 1973
    :cond_0
    const/4 v6, 0x0

    .line 1976
    :try_start_1
    const-string v1, "events"

    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string v3, "session_key_ref"

    aput-object v3, v2, v0

    const-string v0, "%s = ?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "_id"

    aput-object v5, v3, v4

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    invoke-static {v7, v8}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 1980
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1982
    const-string v0, "session_key_ref"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getLong(I)J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-wide v9

    .line 1994
    .local v9, "sessionId":J
    if-eqz v6, :cond_1

    .line 1996
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1997
    const/4 v6, 0x0

    .line 2002
    :cond_1
    return-wide v9

    .line 1958
    .end local v7    # "eventId":J
    .end local v9    # "sessionId":J
    :cond_2
    :try_start_2
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "No events associated with blob"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1963
    :catchall_0
    move-exception v0

    if-eqz v6, :cond_3

    .line 1965
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1966
    const/4 v6, 0x0

    :cond_3
    throw v0

    .line 1989
    .restart local v7    # "eventId":J
    :cond_4
    :try_start_3
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "No session associated with event"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 1994
    :catchall_1
    move-exception v0

    if-eqz v6, :cond_5

    .line 1996
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1997
    const/4 v6, 0x0

    :cond_5
    throw v0
.end method

.method static getSessionIdForEventId(Lcom/localytics/android/LocalyticsProvider;J)J
    .locals 7
    .param p0, "provider"    # Lcom/localytics/android/LocalyticsProvider;
    .param p1, "eventId"    # J

    .prologue
    .line 1718
    const/4 v6, 0x0

    .line 1721
    .local v6, "cursor":Landroid/database/Cursor;
    :try_start_0
    const-string v1, "events"

    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string v3, "session_key_ref"

    aput-object v3, v2, v0

    const-string v0, "%s = ?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "_id"

    aput-object v5, v3, v4

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 1724
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1726
    const-string v0, "session_key_ref"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getLong(I)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    .line 1736
    if-eqz v6, :cond_0

    .line 1738
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1739
    const/4 v6, 0x0

    :cond_0
    return-wide v0

    .line 1732
    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1736
    :catchall_0
    move-exception v0

    if-eqz v6, :cond_2

    .line 1738
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1739
    const/4 v6, 0x0

    :cond_2
    throw v0
.end method

.method static getSessionStartTime(Lcom/localytics/android/LocalyticsProvider;J)J
    .locals 7
    .param p0, "provider"    # Lcom/localytics/android/LocalyticsProvider;
    .param p1, "sessionId"    # J

    .prologue
    .line 1821
    const/4 v6, 0x0

    .line 1824
    .local v6, "cursor":Landroid/database/Cursor;
    :try_start_0
    const-string v1, "sessions"

    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string v3, "session_start_wall_time"

    aput-object v3, v2, v0

    const-string v0, "%s = ?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "_id"

    aput-object v5, v3, v4

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 1827
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1829
    const-string v0, "session_start_wall_time"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getLong(I)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    .line 1839
    if-eqz v6, :cond_0

    .line 1841
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1842
    const/4 v6, 0x0

    :cond_0
    return-wide v0

    .line 1835
    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1839
    :catchall_0
    move-exception v0

    if-eqz v6, :cond_2

    .line 1841
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1842
    const/4 v6, 0x0

    :cond_2
    throw v0
.end method

.method static getSessionUuid(Lcom/localytics/android/LocalyticsProvider;J)Ljava/lang/String;
    .locals 7
    .param p0, "provider"    # Lcom/localytics/android/LocalyticsProvider;
    .param p1, "sessionId"    # J

    .prologue
    .line 1753
    const/4 v6, 0x0

    .line 1756
    .local v6, "cursor":Landroid/database/Cursor;
    :try_start_0
    const-string v1, "sessions"

    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string v3, "uuid"

    aput-object v3, v2, v0

    const-string v0, "%s = ?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "_id"

    aput-object v5, v3, v4

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 1759
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1761
    const-string v0, "uuid"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 1771
    if-eqz v6, :cond_0

    .line 1773
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1774
    const/4 v6, 0x0

    :cond_0
    return-object v0

    .line 1767
    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1771
    :catchall_0
    move-exception v0

    if-eqz v6, :cond_2

    .line 1773
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1774
    const/4 v6, 0x0

    :cond_2
    throw v0
.end method

.method static getStringFromAppInfo(Lcom/localytics/android/LocalyticsProvider;Ljava/lang/String;)Ljava/lang/String;
    .locals 8
    .param p0, "provider"    # Lcom/localytics/android/LocalyticsProvider;
    .param p1, "key"    # Ljava/lang/String;

    .prologue
    const/4 v7, 0x0

    .line 1788
    const/4 v6, 0x0

    .line 1792
    .local v6, "cursor":Landroid/database/Cursor;
    :try_start_0
    const-string v1, "info"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 1794
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1796
    invoke-interface {v6, p1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 1801
    if-eqz v6, :cond_0

    .line 1803
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1804
    const/4 v6, 0x0

    .line 1808
    :cond_0
    :goto_0
    return-object v0

    .line 1801
    :cond_1
    if-eqz v6, :cond_2

    .line 1803
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1804
    const/4 v6, 0x0

    :cond_2
    move-object v0, v7

    .line 1808
    goto :goto_0

    .line 1801
    :catchall_0
    move-exception v0

    if-eqz v6, :cond_3

    .line 1803
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 1804
    const/4 v6, 0x0

    :cond_3
    throw v0
.end method

.method private isUploadTooBig(Ljava/lang/String;)Z
    .locals 4
    .param p1, "uploadString"    # Ljava/lang/String;

    .prologue
    .line 335
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    .line 336
    .local v1, "uploadBytes":[B
    array-length v2, v1

    const v3, 0xc350

    if-lt v2, v3, :cond_1

    const/4 v0, 0x1

    .line 337
    .local v0, "tooBig":Z
    :goto_0
    if-eqz v0, :cond_0

    sget-boolean v2, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v2, :cond_0

    .line 339
    const-string v2, "Localytics"

    const-string v3, "Attempting to upload too much data. Abandoning upload and deleting data."

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 341
    :cond_0
    return v0

    .line 336
    .end local v0    # "tooBig":Z
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private retrieveHttpResponse(Lcom/localytics/android/UploadHandler$UploadType;Ljava/io/InputStream;)V
    .locals 6
    .param p1, "uploadType"    # Lcom/localytics/android/UploadHandler$UploadType;
    .param p2, "input"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 698
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v4, Ljava/io/InputStreamReader;

    const-string v5, "UTF-8"

    invoke-direct {v4, p2, v5}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {v2, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 699
    .local v2, "reader":Ljava/io/BufferedReader;
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 701
    .local v0, "builder":Ljava/lang/StringBuilder;
    const/4 v1, 0x0

    .line 702
    .local v1, "line":Ljava/lang/String;
    :goto_0
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 704
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 707
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 708
    .local v3, "response":Ljava/lang/String;
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 710
    sget-object v4, Lcom/localytics/android/UploadHandler$UploadType;->SESSIONS:Lcom/localytics/android/UploadHandler$UploadType;

    if-ne p1, v4, :cond_2

    .line 712
    invoke-virtual {p0, v3}, Lcom/localytics/android/UploadHandler;->onUploadResponded(Ljava/lang/String;)V

    .line 720
    :cond_1
    :goto_1
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V

    .line 721
    return-void

    .line 716
    :cond_2
    invoke-virtual {p0, v3}, Lcom/localytics/android/UploadHandler;->onProfileUploadResponded(Ljava/lang/String;)V

    goto :goto_1
.end method

.method private upload(Lcom/localytics/android/UploadHandler$UploadType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 24
    .param p1, "uploadType"    # Lcom/localytics/android/UploadHandler$UploadType;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "body"    # Ljava/lang/String;
    .param p4, "installId"    # Ljava/lang/String;
    .param p5, "apiKey"    # Ljava/lang/String;
    .param p6, "customerID"    # Ljava/lang/String;

    .prologue
    .line 379
    if-nez p2, :cond_0

    .line 381
    new-instance v19, Ljava/lang/IllegalArgumentException;

    const-string v20, "url cannot be null"

    invoke-direct/range {v19 .. v20}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v19

    .line 384
    :cond_0
    if-nez p3, :cond_1

    .line 386
    new-instance v19, Ljava/lang/IllegalArgumentException;

    const-string v20, "body cannot be null"

    invoke-direct/range {v19 .. v20}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v19

    .line 390
    :cond_1
    sget-boolean v19, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v19, :cond_2

    .line 392
    sget-object v19, Lcom/localytics/android/UploadHandler$UploadType;->SESSIONS:Lcom/localytics/android/UploadHandler$UploadType;

    move-object/from16 v0, p1

    move-object/from16 v1, v19

    if-ne v0, v1, :cond_8

    .line 394
    const-string v19, "Localytics"

    const-string v20, "Upload body before compression is: %s"

    const/16 v21, 0x1

    move/from16 v0, v21

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v21, v0

    const/16 v22, 0x0

    aput-object p3, v21, v22

    invoke-static/range {v20 .. v21}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v19 .. v20}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 412
    :cond_2
    :goto_0
    const/4 v8, 0x0

    .line 415
    .local v8, "gos":Ljava/util/zip/GZIPOutputStream;
    :try_start_0
    const-string v19, "UTF-8"

    move-object/from16 v0, p3

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v12

    .line 416
    .local v12, "originalBytes":[B
    sget-object v19, Lcom/localytics/android/UploadHandler$UploadType;->SESSIONS:Lcom/localytics/android/UploadHandler$UploadType;

    move-object/from16 v0, p1

    move-object/from16 v1, v19

    if-ne v0, v1, :cond_9

    .line 421
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    array-length v0, v12

    move/from16 v19, v0

    move/from16 v0, v19

    invoke-direct {v3, v0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 422
    .local v3, "baos":Ljava/io/ByteArrayOutputStream;
    new-instance v9, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v9, v3}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 423
    .end local v8    # "gos":Ljava/util/zip/GZIPOutputStream;
    .local v9, "gos":Ljava/util/zip/GZIPOutputStream;
    :try_start_1
    invoke-virtual {v9, v12}, Ljava/util/zip/GZIPOutputStream;->write([B)V

    .line 424
    invoke-virtual {v9}, Ljava/util/zip/GZIPOutputStream;->finish()V

    .line 430
    invoke-static {}, Lcom/localytics/android/DatapointHelper;->getApiLevel()I

    move-result v19

    const/16 v20, 0x13

    move/from16 v0, v19

    move/from16 v1, v20

    if-ge v0, v1, :cond_3

    .line 432
    invoke-virtual {v9}, Ljava/util/zip/GZIPOutputStream;->flush()V

    .line 435
    :cond_3
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_b
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_a
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    move-result-object v18

    .local v18, "uploadData":[B
    move-object v8, v9

    .line 460
    .end local v3    # "baos":Ljava/io/ByteArrayOutputStream;
    .end local v9    # "gos":Ljava/util/zip/GZIPOutputStream;
    .restart local v8    # "gos":Ljava/util/zip/GZIPOutputStream;
    :goto_1
    if-eqz v8, :cond_4

    .line 464
    :try_start_2
    invoke-virtual {v8}, Ljava/util/zip/GZIPOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 465
    const/4 v8, 0x0

    .line 480
    :cond_4
    invoke-static {}, Lcom/localytics/android/DatapointHelper;->getApiLevel()I

    move-result v19

    const/16 v20, 0x9

    move/from16 v0, v19

    move/from16 v1, v20

    if-lt v0, v1, :cond_1a

    .line 482
    const/4 v5, 0x0

    .line 485
    .local v5, "connection":Ljava/net/HttpURLConnection;
    :try_start_3
    new-instance v19, Ljava/net/URL;

    move-object/from16 v0, v19

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {v19 .. v19}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v19

    move-object/from16 v0, v19

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v5, v0

    .line 487
    const v19, 0xea60

    move/from16 v0, v19

    invoke-virtual {v5, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 488
    const v19, 0xea60

    move/from16 v0, v19

    invoke-virtual {v5, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 489
    const/16 v19, 0x1

    move/from16 v0, v19

    invoke-virtual {v5, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 490
    sget-object v19, Lcom/localytics/android/UploadHandler$UploadType;->SESSIONS:Lcom/localytics/android/UploadHandler$UploadType;

    move-object/from16 v0, p1

    move-object/from16 v1, v19

    if-ne v0, v1, :cond_11

    .line 492
    const-string v19, "Content-Type"

    const-string v20, "application/x-gzip"

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-virtual {v5, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 493
    const-string v19, "Content-Encoding"

    const-string v20, "gzip"

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-virtual {v5, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 503
    :goto_2
    const-string v19, "Accept-Encoding"

    const-string v20, ""

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-virtual {v5, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 504
    const-string v19, "x-upload-time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v20

    move-wide/from16 v0, v20

    long-to-double v0, v0

    move-wide/from16 v20, v0

    const-wide v22, 0x408f400000000000L    # 1000.0

    div-double v20, v20, v22

    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->round(D)J

    move-result-wide v20

    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-virtual {v5, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 505
    const-string v19, "x-install-id"

    move-object/from16 v0, v19

    move-object/from16 v1, p4

    invoke-virtual {v5, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 506
    const-string v19, "x-app-id"

    move-object/from16 v0, v19

    move-object/from16 v1, p5

    invoke-virtual {v5, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 507
    const-string v19, "x-client-version"

    const-string v20, "androida_2.72"

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-virtual {v5, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 508
    const-string v19, "x-app-version"

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/localytics/android/UploadHandler;->mContext:Landroid/content/Context;

    move-object/from16 v20, v0

    invoke-static/range {v20 .. v20}, Lcom/localytics/android/DatapointHelper;->getAppVersion(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-virtual {v5, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 509
    const-string v19, "x-customer-id"

    move-object/from16 v0, v19

    move-object/from16 v1, p6

    invoke-virtual {v5, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 510
    move-object/from16 v0, v18

    array-length v0, v0

    move/from16 v19, v0

    move/from16 v0, v19

    invoke-virtual {v5, v0}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V
    :try_end_3
    .catch Ljava/net/MalformedURLException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_7
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 512
    const/16 v17, 0x0

    .line 515
    .local v17, "stream":Ljava/io/OutputStream;
    :try_start_4
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v17

    .line 517
    invoke-virtual/range {v17 .. v18}, Ljava/io/OutputStream;->write([B)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 521
    if-eqz v17, :cond_5

    .line 523
    :try_start_5
    invoke-virtual/range {v17 .. v17}, Ljava/io/OutputStream;->flush()V

    .line 524
    invoke-virtual/range {v17 .. v17}, Ljava/io/OutputStream;->close()V

    .line 525
    const/16 v17, 0x0

    .line 529
    :cond_5
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v16

    .line 531
    .local v16, "statusCode":I
    sget-boolean v19, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v19, :cond_6

    .line 533
    sget-object v19, Lcom/localytics/android/UploadHandler$UploadType;->SESSIONS:Lcom/localytics/android/UploadHandler$UploadType;

    move-object/from16 v0, p1

    move-object/from16 v1, v19

    if-ne v0, v1, :cond_15

    .line 535
    const-string v19, "Localytics"

    const-string v20, "Upload complete with status %d"

    const/16 v21, 0x1

    move/from16 v0, v21

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v21, v0

    const/16 v22, 0x0

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v23

    aput-object v23, v21, v22

    invoke-static/range {v20 .. v21}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v19 .. v20}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catch Ljava/net/MalformedURLException; {:try_start_5 .. :try_end_5} :catch_6
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_7
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 546
    :cond_6
    :goto_3
    const/16 v19, 0x190

    move/from16 v0, v16

    move/from16 v1, v19

    if-lt v0, v1, :cond_17

    const/16 v19, 0x1f3

    move/from16 v0, v16

    move/from16 v1, v19

    if-gt v0, v1, :cond_17

    .line 548
    const/16 v19, 0x1

    .line 584
    if-eqz v5, :cond_7

    .line 586
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 587
    const/4 v5, 0x0

    .line 688
    .end local v5    # "connection":Ljava/net/HttpURLConnection;
    .end local v12    # "originalBytes":[B
    .end local v16    # "statusCode":I
    .end local v17    # "stream":Ljava/io/OutputStream;
    .end local v18    # "uploadData":[B
    :cond_7
    :goto_4
    return v19

    .line 398
    .end local v8    # "gos":Ljava/util/zip/GZIPOutputStream;
    :cond_8
    const-string v19, "Localytics"

    const-string v20, "Profile upload body is: %s"

    const/16 v21, 0x1

    move/from16 v0, v21

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v21, v0

    const/16 v22, 0x0

    aput-object p3, v21, v22

    invoke-static/range {v20 .. v21}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v19 .. v20}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 439
    .restart local v8    # "gos":Ljava/util/zip/GZIPOutputStream;
    .restart local v12    # "originalBytes":[B
    :cond_9
    move-object/from16 v18, v12

    .restart local v18    # "uploadData":[B
    goto/16 :goto_1

    .line 467
    :catch_0
    move-exception v6

    .line 469
    .local v6, "e":Ljava/io/IOException;
    sget-boolean v19, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v19, :cond_a

    .line 471
    const-string v19, "Localytics"

    const-string v20, "Caught exception"

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-static {v0, v1, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 474
    :cond_a
    const/16 v19, 0x0

    goto :goto_4

    .line 442
    .end local v6    # "e":Ljava/io/IOException;
    .end local v12    # "originalBytes":[B
    .end local v18    # "uploadData":[B
    :catch_1
    move-exception v6

    .line 444
    .local v6, "e":Ljava/io/UnsupportedEncodingException;
    :goto_5
    :try_start_6
    sget-boolean v19, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v19, :cond_b

    .line 446
    const-string v19, "Localytics"

    const-string v20, "UnsupportedEncodingException"

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-static {v0, v1, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 448
    :cond_b
    const/16 v19, 0x0

    .line 460
    if-eqz v8, :cond_7

    .line 464
    :try_start_7
    invoke-virtual {v8}, Ljava/util/zip/GZIPOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2

    .line 465
    const/4 v8, 0x0

    goto :goto_4

    .line 467
    :catch_2
    move-exception v6

    .line 469
    .local v6, "e":Ljava/io/IOException;
    sget-boolean v19, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v19, :cond_c

    .line 471
    const-string v19, "Localytics"

    const-string v20, "Caught exception"

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-static {v0, v1, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 474
    :cond_c
    const/16 v19, 0x0

    goto :goto_4

    .line 450
    .end local v6    # "e":Ljava/io/IOException;
    :catch_3
    move-exception v6

    .line 452
    .restart local v6    # "e":Ljava/io/IOException;
    :goto_6
    :try_start_8
    sget-boolean v19, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v19, :cond_d

    .line 454
    const-string v19, "Localytics"

    const-string v20, "IOException"

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-static {v0, v1, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 456
    :cond_d
    const/16 v19, 0x0

    .line 460
    if-eqz v8, :cond_7

    .line 464
    :try_start_9
    invoke-virtual {v8}, Ljava/util/zip/GZIPOutputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4

    .line 465
    const/4 v8, 0x0

    goto :goto_4

    .line 467
    :catch_4
    move-exception v6

    .line 469
    sget-boolean v19, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v19, :cond_e

    .line 471
    const-string v19, "Localytics"

    const-string v20, "Caught exception"

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-static {v0, v1, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 474
    :cond_e
    const/16 v19, 0x0

    goto/16 :goto_4

    .line 460
    .end local v6    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v19

    :goto_7
    if-eqz v8, :cond_f

    .line 464
    :try_start_a
    invoke-virtual {v8}, Ljava/util/zip/GZIPOutputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_5

    .line 465
    const/4 v8, 0x0

    .line 474
    :cond_f
    throw v19

    .line 467
    :catch_5
    move-exception v6

    .line 469
    .restart local v6    # "e":Ljava/io/IOException;
    sget-boolean v19, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v19, :cond_10

    .line 471
    const-string v19, "Localytics"

    const-string v20, "Caught exception"

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-static {v0, v1, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 474
    :cond_10
    const/16 v19, 0x0

    goto/16 :goto_4

    .line 497
    .end local v6    # "e":Ljava/io/IOException;
    .restart local v5    # "connection":Ljava/net/HttpURLConnection;
    .restart local v12    # "originalBytes":[B
    .restart local v18    # "uploadData":[B
    :cond_11
    :try_start_b
    const-string v19, "Content-Type"

    const-string v20, "application/json; charset=utf-8"

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-virtual {v5, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_b
    .catch Ljava/net/MalformedURLException; {:try_start_b .. :try_end_b} :catch_6
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_7
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    goto/16 :goto_2

    .line 564
    :catch_6
    move-exception v6

    .line 566
    .local v6, "e":Ljava/net/MalformedURLException;
    :try_start_c
    sget-boolean v19, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v19, :cond_12

    .line 568
    const-string v19, "Localytics"

    const-string v20, "ClientProtocolException"

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-static {v0, v1, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 571
    :cond_12
    const/16 v19, 0x0

    .line 584
    if-eqz v5, :cond_7

    .line 586
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 587
    const/4 v5, 0x0

    goto/16 :goto_4

    .line 521
    .end local v6    # "e":Ljava/net/MalformedURLException;
    .restart local v17    # "stream":Ljava/io/OutputStream;
    :catchall_1
    move-exception v19

    if-eqz v17, :cond_13

    .line 523
    :try_start_d
    invoke-virtual/range {v17 .. v17}, Ljava/io/OutputStream;->flush()V

    .line 524
    invoke-virtual/range {v17 .. v17}, Ljava/io/OutputStream;->close()V

    .line 525
    const/16 v17, 0x0

    :cond_13
    throw v19
    :try_end_d
    .catch Ljava/net/MalformedURLException; {:try_start_d .. :try_end_d} :catch_6
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_7
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 573
    .end local v17    # "stream":Ljava/io/OutputStream;
    :catch_7
    move-exception v6

    .line 575
    .local v6, "e":Ljava/io/IOException;
    :try_start_e
    sget-boolean v19, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v19, :cond_14

    .line 577
    const-string v19, "Localytics"

    const-string v20, "ClientProtocolException"

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-static {v0, v1, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    .line 580
    :cond_14
    const/16 v19, 0x0

    .line 584
    if-eqz v5, :cond_7

    .line 586
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 587
    const/4 v5, 0x0

    goto/16 :goto_4

    .line 539
    .end local v6    # "e":Ljava/io/IOException;
    .restart local v16    # "statusCode":I
    .restart local v17    # "stream":Ljava/io/OutputStream;
    :cond_15
    :try_start_f
    const-string v19, "Localytics"

    const-string v20, "Profile upload complete with status %d"

    const/16 v21, 0x1

    move/from16 v0, v21

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v21, v0

    const/16 v22, 0x0

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v23

    aput-object v23, v21, v22

    invoke-static/range {v20 .. v21}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v19 .. v20}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_f
    .catch Ljava/net/MalformedURLException; {:try_start_f .. :try_end_f} :catch_6
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_7
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    goto/16 :goto_3

    .line 584
    .end local v16    # "statusCode":I
    .end local v17    # "stream":Ljava/io/OutputStream;
    :catchall_2
    move-exception v19

    if-eqz v5, :cond_16

    .line 586
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 587
    const/4 v5, 0x0

    :cond_16
    throw v19

    .line 554
    .restart local v16    # "statusCode":I
    .restart local v17    # "stream":Ljava/io/OutputStream;
    :cond_17
    const/16 v19, 0x1f4

    move/from16 v0, v16

    move/from16 v1, v19

    if-lt v0, v1, :cond_18

    const/16 v19, 0x257

    move/from16 v0, v16

    move/from16 v1, v19

    if-gt v0, v1, :cond_18

    .line 556
    const/16 v19, 0x0

    .line 584
    if-eqz v5, :cond_7

    .line 586
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 587
    const/4 v5, 0x0

    goto/16 :goto_4

    .line 562
    :cond_18
    :try_start_10
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v19

    invoke-direct {v0, v1, v2}, Lcom/localytics/android/UploadHandler;->retrieveHttpResponse(Lcom/localytics/android/UploadHandler$UploadType;Ljava/io/InputStream;)V
    :try_end_10
    .catch Ljava/net/MalformedURLException; {:try_start_10 .. :try_end_10} :catch_6
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_7
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    .line 584
    if-eqz v5, :cond_19

    .line 586
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 587
    const/4 v5, 0x0

    .line 688
    .end local v5    # "connection":Ljava/net/HttpURLConnection;
    .end local v17    # "stream":Ljava/io/OutputStream;
    :cond_19
    :goto_8
    const/16 v19, 0x1

    goto/16 :goto_4

    .line 598
    .end local v16    # "statusCode":I
    :cond_1a
    new-instance v10, Lorg/apache/http/params/BasicHttpParams;

    invoke-direct {v10}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    .line 600
    .local v10, "httpParameters":Lorg/apache/http/params/HttpParams;
    const v19, 0xea60

    move/from16 v0, v19

    invoke-static {v10, v0}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 603
    const v19, 0xea60

    move/from16 v0, v19

    invoke-static {v10, v0}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 605
    new-instance v4, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v4, v10}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V

    .line 606
    .local v4, "client":Lorg/apache/http/impl/client/DefaultHttpClient;
    new-instance v11, Lorg/apache/http/client/methods/HttpPost;

    move-object/from16 v0, p2

    invoke-direct {v11, v0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 607
    .local v11, "method":Lorg/apache/http/client/methods/HttpPost;
    sget-object v19, Lcom/localytics/android/UploadHandler$UploadType;->SESSIONS:Lcom/localytics/android/UploadHandler$UploadType;

    move-object/from16 v0, p1

    move-object/from16 v1, v19

    if-ne v0, v1, :cond_1c

    .line 609
    const-string v19, "Content-Type"

    const-string v20, "application/x-gzip"

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-virtual {v11, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 610
    const-string v19, "Content-Encoding"

    const-string v20, "gzip"

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-virtual {v11, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 616
    :goto_9
    const-string v19, "x-upload-time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v20

    move-wide/from16 v0, v20

    long-to-double v0, v0

    move-wide/from16 v20, v0

    const-wide v22, 0x408f400000000000L    # 1000.0

    div-double v20, v20, v22

    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->round(D)J

    move-result-wide v20

    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-virtual {v11, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 617
    const-string v19, "x-install-id"

    move-object/from16 v0, v19

    move-object/from16 v1, p4

    invoke-virtual {v11, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 618
    const-string v19, "x-app-id"

    move-object/from16 v0, v19

    move-object/from16 v1, p5

    invoke-virtual {v11, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 619
    const-string v19, "x-client-version"

    const-string v20, "androida_2.72"

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-virtual {v11, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 620
    const-string v19, "x-app-version"

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/localytics/android/UploadHandler;->mContext:Landroid/content/Context;

    move-object/from16 v20, v0

    invoke-static/range {v20 .. v20}, Lcom/localytics/android/DatapointHelper;->getAppVersion(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-virtual {v11, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 621
    const-string v19, "x-customer-id"

    move-object/from16 v0, v19

    move-object/from16 v1, p6

    invoke-virtual {v11, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 625
    :try_start_11
    new-instance v13, Lorg/apache/http/entity/ByteArrayEntity;

    move-object/from16 v0, v18

    invoke-direct {v13, v0}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V

    .line 626
    .local v13, "patchBody":Lorg/apache/http/entity/ByteArrayEntity;
    invoke-virtual {v11, v13}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 628
    invoke-virtual {v4, v11}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v14

    .line 630
    .local v14, "response":Lorg/apache/http/HttpResponse;
    invoke-interface {v14}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v15

    .line 631
    .local v15, "status":Lorg/apache/http/StatusLine;
    invoke-interface {v15}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v16

    .line 633
    .restart local v16    # "statusCode":I
    sget-boolean v19, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v19, :cond_1b

    .line 635
    sget-object v19, Lcom/localytics/android/UploadHandler$UploadType;->SESSIONS:Lcom/localytics/android/UploadHandler$UploadType;

    move-object/from16 v0, p1

    move-object/from16 v1, v19

    if-ne v0, v1, :cond_1d

    .line 637
    const-string v19, "Localytics"

    const-string v20, "Upload complete with status %d"

    const/16 v21, 0x1

    move/from16 v0, v21

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v21, v0

    const/16 v22, 0x0

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v23

    aput-object v23, v21, v22

    invoke-static/range {v20 .. v21}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v19 .. v20}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_11
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_11 .. :try_end_11} :catch_8
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_9

    .line 648
    :cond_1b
    :goto_a
    const/16 v19, 0x190

    move/from16 v0, v16

    move/from16 v1, v19

    if-lt v0, v1, :cond_1f

    const/16 v19, 0x1f3

    move/from16 v0, v16

    move/from16 v1, v19

    if-gt v0, v1, :cond_1f

    .line 650
    const/16 v19, 0x1

    goto/16 :goto_4

    .line 614
    .end local v13    # "patchBody":Lorg/apache/http/entity/ByteArrayEntity;
    .end local v14    # "response":Lorg/apache/http/HttpResponse;
    .end local v15    # "status":Lorg/apache/http/StatusLine;
    .end local v16    # "statusCode":I
    :cond_1c
    const-string v19, "Content-Type"

    const-string v20, "application/json; charset=utf-8"

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-virtual {v11, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_9

    .line 641
    .restart local v13    # "patchBody":Lorg/apache/http/entity/ByteArrayEntity;
    .restart local v14    # "response":Lorg/apache/http/HttpResponse;
    .restart local v15    # "status":Lorg/apache/http/StatusLine;
    .restart local v16    # "statusCode":I
    :cond_1d
    :try_start_12
    const-string v19, "Localytics"

    const-string v20, "Profile upload complete with status %d"

    const/16 v21, 0x1

    move/from16 v0, v21

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v21, v0

    const/16 v22, 0x0

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v23

    aput-object v23, v21, v22

    invoke-static/range {v20 .. v21}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v19 .. v20}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_12
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_12 .. :try_end_12} :catch_8
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_9

    goto :goto_a

    .line 670
    .end local v13    # "patchBody":Lorg/apache/http/entity/ByteArrayEntity;
    .end local v14    # "response":Lorg/apache/http/HttpResponse;
    .end local v15    # "status":Lorg/apache/http/StatusLine;
    .end local v16    # "statusCode":I
    :catch_8
    move-exception v6

    .line 672
    .local v6, "e":Lorg/apache/http/client/ClientProtocolException;
    sget-boolean v19, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v19, :cond_1e

    .line 674
    const-string v19, "Localytics"

    const-string v20, "ClientProtocolException"

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-static {v0, v1, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 676
    :cond_1e
    const/16 v19, 0x0

    goto/16 :goto_4

    .line 656
    .end local v6    # "e":Lorg/apache/http/client/ClientProtocolException;
    .restart local v13    # "patchBody":Lorg/apache/http/entity/ByteArrayEntity;
    .restart local v14    # "response":Lorg/apache/http/HttpResponse;
    .restart local v15    # "status":Lorg/apache/http/StatusLine;
    .restart local v16    # "statusCode":I
    :cond_1f
    const/16 v19, 0x1f4

    move/from16 v0, v16

    move/from16 v1, v19

    if-lt v0, v1, :cond_20

    const/16 v19, 0x257

    move/from16 v0, v16

    move/from16 v1, v19

    if-gt v0, v1, :cond_20

    .line 658
    const/16 v19, 0x0

    goto/16 :goto_4

    .line 664
    :cond_20
    :try_start_13
    invoke-interface {v14}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v7

    .line 665
    .local v7, "entry":Lorg/apache/http/HttpEntity;
    if-eqz v7, :cond_19

    .line 667
    invoke-interface {v7}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v19

    invoke-direct {v0, v1, v2}, Lcom/localytics/android/UploadHandler;->retrieveHttpResponse(Lcom/localytics/android/UploadHandler$UploadType;Ljava/io/InputStream;)V
    :try_end_13
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_13 .. :try_end_13} :catch_8
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_9

    goto/16 :goto_8

    .line 678
    .end local v7    # "entry":Lorg/apache/http/HttpEntity;
    .end local v13    # "patchBody":Lorg/apache/http/entity/ByteArrayEntity;
    .end local v14    # "response":Lorg/apache/http/HttpResponse;
    .end local v15    # "status":Lorg/apache/http/StatusLine;
    .end local v16    # "statusCode":I
    :catch_9
    move-exception v6

    .line 680
    .local v6, "e":Ljava/io/IOException;
    sget-boolean v19, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v19, :cond_21

    .line 682
    const-string v19, "Localytics"

    const-string v20, "IOException"

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-static {v0, v1, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 684
    :cond_21
    const/16 v19, 0x0

    goto/16 :goto_4

    .line 460
    .end local v4    # "client":Lorg/apache/http/impl/client/DefaultHttpClient;
    .end local v6    # "e":Ljava/io/IOException;
    .end local v8    # "gos":Ljava/util/zip/GZIPOutputStream;
    .end local v10    # "httpParameters":Lorg/apache/http/params/HttpParams;
    .end local v11    # "method":Lorg/apache/http/client/methods/HttpPost;
    .end local v18    # "uploadData":[B
    .restart local v3    # "baos":Ljava/io/ByteArrayOutputStream;
    .restart local v9    # "gos":Ljava/util/zip/GZIPOutputStream;
    :catchall_3
    move-exception v19

    move-object v8, v9

    .end local v9    # "gos":Ljava/util/zip/GZIPOutputStream;
    .restart local v8    # "gos":Ljava/util/zip/GZIPOutputStream;
    goto/16 :goto_7

    .line 450
    .end local v8    # "gos":Ljava/util/zip/GZIPOutputStream;
    .restart local v9    # "gos":Ljava/util/zip/GZIPOutputStream;
    :catch_a
    move-exception v6

    move-object v8, v9

    .end local v9    # "gos":Ljava/util/zip/GZIPOutputStream;
    .restart local v8    # "gos":Ljava/util/zip/GZIPOutputStream;
    goto/16 :goto_6

    .line 442
    .end local v8    # "gos":Ljava/util/zip/GZIPOutputStream;
    .restart local v9    # "gos":Ljava/util/zip/GZIPOutputStream;
    :catch_b
    move-exception v6

    move-object v8, v9

    .end local v9    # "gos":Ljava/util/zip/GZIPOutputStream;
    .restart local v8    # "gos":Ljava/util/zip/GZIPOutputStream;
    goto/16 :goto_5
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 21
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 184
    :try_start_0
    invoke-super/range {p0 .. p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 186
    move-object/from16 v0, p1

    iget v2, v0, Landroid/os/Message;->what:I

    packed-switch v2, :pswitch_data_0

    .line 315
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "Fell through switch statement"

    invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 319
    :catch_0
    move-exception v13

    .line 321
    .local v13, "e":Ljava/lang/Exception;
    sget-boolean v2, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v2, :cond_0

    .line 323
    const-string v2, "Localytics"

    const-string v3, "Localytics library threw an uncaught exception"

    invoke-static {v2, v3, v13}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 331
    .end local v13    # "e":Ljava/lang/Exception;
    :cond_0
    :goto_0
    return-void

    .line 190
    :pswitch_0
    :try_start_1
    sget-boolean v2, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v2, :cond_1

    .line 192
    const-string v2, "Localytics"

    const-string v3, "UploadHandler received MESSAGE_UPLOAD"

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 198
    :cond_1
    move-object/from16 v0, p1

    iget-object v11, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Runnable;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 202
    .local v11, "callback":Ljava/lang/Runnable;
    :try_start_2
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/localytics/android/UploadHandler;->mContext:Landroid/content/Context;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/localytics/android/UploadHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/localytics/android/UploadHandler;->mApiKey:Ljava/lang/String;

    invoke-static {v2, v3, v4}, Lcom/localytics/android/UploadHandler;->convertDatabaseToJson(Landroid/content/Context;Lcom/localytics/android/LocalyticsProvider;Ljava/lang/String;)Ljava/util/List;

    move-result-object v18

    .line 204
    .local v18, "toUpload":Ljava/util/List;, "Ljava/util/List<Lorg/json/JSONObject;>;"
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    .line 206
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 207
    .local v10, "builder":Ljava/lang/StringBuilder;
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    .local v14, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lorg/json/JSONObject;

    .line 209
    .local v15, "json":Lorg/json/JSONObject;
    invoke-virtual {v15}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    const/16 v2, 0xa

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 230
    .end local v10    # "builder":Ljava/lang/StringBuilder;
    .end local v14    # "i$":Ljava/util/Iterator;
    .end local v15    # "json":Lorg/json/JSONObject;
    .end local v18    # "toUpload":Ljava/util/List;, "Ljava/util/List<Lorg/json/JSONObject;>;"
    :catchall_0
    move-exception v2

    if-eqz v11, :cond_2

    .line 236
    :try_start_3
    new-instance v3, Ljava/lang/Thread;

    const-string v4, "upload_callback"

    invoke-direct {v3, v11, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    .line 239
    :cond_2
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/localytics/android/UploadHandler;->mSessionHandler:Landroid/os/Handler;

    const/4 v4, 0x5

    invoke-virtual {v3, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    throw v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 213
    .restart local v10    # "builder":Ljava/lang/StringBuilder;
    .restart local v14    # "i$":Ljava/util/Iterator;
    .restart local v18    # "toUpload":Ljava/util/List;, "Ljava/util/List<Lorg/json/JSONObject;>;"
    :cond_3
    :try_start_4
    invoke-direct/range {p0 .. p0}, Lcom/localytics/android/UploadHandler;->getApiKey()Ljava/lang/String;

    move-result-object v7

    .line 214
    .local v7, "apiKey":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/localytics/android/UploadHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    invoke-static {v2}, Lcom/localytics/android/UploadHandler;->getCustomerID(Lcom/localytics/android/LocalyticsProvider;)Ljava/lang/String;

    move-result-object v8

    .line 216
    .local v8, "customerID":Ljava/lang/String;
    sget-object v3, Lcom/localytics/android/UploadHandler$UploadType;->SESSIONS:Lcom/localytics/android/UploadHandler$UploadType;

    sget-boolean v2, Lcom/localytics/android/Constants;->USE_HTTPS:Z

    if-eqz v2, :cond_6

    const-string v2, "https://%s/api/v2/uploads"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v6, 0x0

    sget-object v20, Lcom/localytics/android/Constants;->ANALYTICS_URL:Ljava/lang/String;

    aput-object v20, v4, v6

    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    :goto_2
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/localytics/android/UploadHandler;->mInstallId:Ljava/lang/String;

    move-object/from16 v2, p0

    invoke-direct/range {v2 .. v8}, Lcom/localytics/android/UploadHandler;->upload(Lcom/localytics/android/UploadHandler$UploadType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 218
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/localytics/android/UploadHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    new-instance v3, Lcom/localytics/android/UploadHandler$1;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lcom/localytics/android/UploadHandler$1;-><init>(Lcom/localytics/android/UploadHandler;)V

    invoke-virtual {v2, v3}, Lcom/localytics/android/LocalyticsProvider;->runBatchTransaction(Ljava/lang/Runnable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 230
    .end local v7    # "apiKey":Ljava/lang/String;
    .end local v8    # "customerID":Ljava/lang/String;
    .end local v10    # "builder":Ljava/lang/StringBuilder;
    .end local v14    # "i$":Ljava/util/Iterator;
    :cond_4
    if-eqz v11, :cond_5

    .line 236
    :try_start_5
    new-instance v2, Ljava/lang/Thread;

    const-string v3, "upload_callback"

    invoke-direct {v2, v11, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 239
    :cond_5
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/localytics/android/UploadHandler;->mSessionHandler:Landroid/os/Handler;

    const/4 v3, 0x5

    invoke-virtual {v2, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    goto/16 :goto_0

    .line 216
    .restart local v7    # "apiKey":Ljava/lang/String;
    .restart local v8    # "customerID":Ljava/lang/String;
    .restart local v10    # "builder":Ljava/lang/StringBuilder;
    .restart local v14    # "i$":Ljava/util/Iterator;
    :cond_6
    :try_start_6
    const-string v2, "http://%s/api/v2/applications/%s/uploads"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v6, 0x0

    sget-object v20, Lcom/localytics/android/Constants;->ANALYTICS_URL:Ljava/lang/String;

    aput-object v20, v4, v6

    const/4 v6, 0x1

    aput-object v7, v4, v6

    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-result-object v4

    goto :goto_2

    .line 245
    .end local v7    # "apiKey":Ljava/lang/String;
    .end local v8    # "customerID":Ljava/lang/String;
    .end local v10    # "builder":Ljava/lang/StringBuilder;
    .end local v11    # "callback":Ljava/lang/Runnable;
    .end local v14    # "i$":Ljava/util/Iterator;
    .end local v18    # "toUpload":Ljava/util/List;, "Ljava/util/List<Lorg/json/JSONObject;>;"
    :pswitch_1
    :try_start_7
    sget-boolean v2, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v2, :cond_7

    .line 247
    const-string v2, "Localytics"

    const-string v3, "Received MESSAGE_RETRY_UPLOAD_REQUEST"

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 250
    :cond_7
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/localytics/android/UploadHandler;->mSessionHandler:Landroid/os/Handler;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/localytics/android/UploadHandler;->mSessionHandler:Landroid/os/Handler;

    const/4 v4, 0x4

    move-object/from16 v0, p1

    iget-object v6, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v3, v4, v6}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_0

    .line 255
    :pswitch_2
    sget-boolean v2, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v2, :cond_8

    .line 257
    const-string v2, "Localytics"

    const-string v3, "UploadHandler received MESSAGE_UPLOAD_PROFILE"

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 263
    :cond_8
    move-object/from16 v0, p1

    iget-object v11, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Runnable;

    .line 265
    .restart local v11    # "callback":Ljava/lang/Runnable;
    invoke-direct/range {p0 .. p0}, Lcom/localytics/android/UploadHandler;->getApiKey()Ljava/lang/String;

    move-result-object v7

    .line 267
    .restart local v7    # "apiKey":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/localytics/android/UploadHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    invoke-static {v2}, Lcom/localytics/android/UploadHandler;->getProfileAttributes(Lcom/localytics/android/LocalyticsProvider;)Ljava/util/TreeMap;

    move-result-object v16

    .line 268
    .local v16, "profileAttributes":Ljava/util/TreeMap;, "Ljava/util/TreeMap<Ljava/lang/String;Lcom/localytics/android/UploadHandler$ProfileUploadDataPair;>;"
    invoke-virtual/range {v16 .. v16}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v14

    .restart local v14    # "i$":Ljava/util/Iterator;
    :cond_9
    :goto_3
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map$Entry;

    .line 270
    .local v9, "attribute":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lcom/localytics/android/UploadHandler$ProfileUploadDataPair;>;"
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 271
    .restart local v8    # "customerID":Ljava/lang/String;
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/localytics/android/UploadHandler$ProfileUploadDataPair;

    iget-object v12, v2, Lcom/localytics/android/UploadHandler$ProfileUploadDataPair;->consolidatedJSON:Lorg/json/JSONObject;

    .line 272
    .local v12, "consolidatedJSON":Lorg/json/JSONObject;
    new-instance v19, Lorg/json/JSONObject;

    invoke-direct/range {v19 .. v19}, Lorg/json/JSONObject;-><init>()V

    .line 273
    .local v19, "uploadJSON":Lorg/json/JSONObject;
    const-string v2, "attributes"

    move-object/from16 v0, v19

    invoke-virtual {v0, v2, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 274
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/localytics/android/UploadHandler$ProfileUploadDataPair;

    iget-object v0, v2, Lcom/localytics/android/UploadHandler$ProfileUploadDataPair;->rowIDs:Ljava/lang/StringBuilder;

    move-object/from16 v17, v0

    .line 275
    .local v17, "rows":Ljava/lang/StringBuilder;
    invoke-virtual/range {v19 .. v19}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    .line 277
    .local v5, "uploadString":Ljava/lang/String;
    sget-object v3, Lcom/localytics/android/UploadHandler$UploadType;->PROFILES:Lcom/localytics/android/UploadHandler$UploadType;

    const-string v2, "https://%s/v1/apps/%s/profiles/%s"

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v6, 0x0

    sget-object v20, Lcom/localytics/android/Constants;->PROFILES_URL:Ljava/lang/String;

    aput-object v20, v4, v6

    const/4 v6, 0x1

    aput-object v7, v4, v6

    const/4 v6, 0x2

    const-string v20, "UTF-8"

    move-object/from16 v0, v20

    invoke-static {v8, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    aput-object v20, v4, v6

    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/localytics/android/UploadHandler;->mInstallId:Ljava/lang/String;

    move-object/from16 v2, p0

    invoke-direct/range {v2 .. v8}, Lcom/localytics/android/UploadHandler;->upload(Lcom/localytics/android/UploadHandler$UploadType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 279
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/localytics/android/UploadHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    new-instance v3, Lcom/localytics/android/UploadHandler$2;

    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-direct {v3, v0, v1}, Lcom/localytics/android/UploadHandler$2;-><init>(Lcom/localytics/android/UploadHandler;Ljava/lang/StringBuilder;)V

    invoke-virtual {v2, v3}, Lcom/localytics/android/LocalyticsProvider;->runBatchTransaction(Ljava/lang/Runnable;)V

    goto :goto_3

    .line 288
    .end local v5    # "uploadString":Ljava/lang/String;
    .end local v8    # "customerID":Ljava/lang/String;
    .end local v9    # "attribute":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lcom/localytics/android/UploadHandler$ProfileUploadDataPair;>;"
    .end local v12    # "consolidatedJSON":Lorg/json/JSONObject;
    .end local v17    # "rows":Ljava/lang/StringBuilder;
    .end local v19    # "uploadJSON":Lorg/json/JSONObject;
    :cond_a
    if-eqz v11, :cond_b

    .line 294
    new-instance v2, Ljava/lang/Thread;

    const-string v3, "upload_profile_callback"

    invoke-direct {v2, v11, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 297
    :cond_b
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/localytics/android/UploadHandler;->mSessionHandler:Landroid/os/Handler;

    const/16 v3, 0x12

    invoke-virtual {v2, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_0

    .line 302
    .end local v7    # "apiKey":Ljava/lang/String;
    .end local v11    # "callback":Ljava/lang/Runnable;
    .end local v14    # "i$":Ljava/util/Iterator;
    .end local v16    # "profileAttributes":Ljava/util/TreeMap;, "Ljava/util/TreeMap<Ljava/lang/String;Lcom/localytics/android/UploadHandler$ProfileUploadDataPair;>;"
    :pswitch_3
    sget-boolean v2, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v2, :cond_c

    .line 304
    const-string v2, "Localytics"

    const-string v3, "Received MESSAGE_RETRY_UPLOAD_PROFILE_REQUEST"

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 307
    :cond_c
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/localytics/android/UploadHandler;->mSessionHandler:Landroid/os/Handler;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/localytics/android/UploadHandler;->mSessionHandler:Landroid/os/Handler;

    const/16 v4, 0x11

    move-object/from16 v0, p1

    iget-object v6, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v3, v4, v6}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    goto/16 :goto_0

    .line 186
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method protected onProfileUploadResponded(Ljava/lang/String;)V
    .locals 4
    .param p1, "response"    # Ljava/lang/String;

    .prologue
    .line 360
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 362
    const-string v0, "Localytics"

    const-string v1, "Profile response is: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 364
    :cond_0
    return-void
.end method

.method protected onUploadResponded(Ljava/lang/String;)V
    .locals 0
    .param p1, "response"    # Ljava/lang/String;

    .prologue
    .line 351
    return-void
.end method
