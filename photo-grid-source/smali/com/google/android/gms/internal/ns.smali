.class public final Lcom/google/android/gms/internal/ns;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# static fields
.field private static final a:Ljava/text/SimpleDateFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyyMMdd"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v0, Lcom/google/android/gms/internal/ns;->a:Ljava/text/SimpleDateFormat;

    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Ljava/lang/String;)Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
    .locals 34

    :try_start_0
    new-instance v28, Lorg/json/JSONObject;

    move-object/from16 v0, v28

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v4, "ad_base_url"

    const/4 v5, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v4, "ad_url"

    const/4 v5, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v4, "ad_size"

    const/4 v5, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    if-eqz p1, :cond_1

    move-object/from16 v0, p1

    iget v4, v0, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEt:I

    if-eqz v4, :cond_1

    const/16 v27, 0x1

    :goto_0
    if-eqz v27, :cond_2

    const-string v4, "ad_json"

    const/4 v5, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :goto_1
    const-wide/16 v20, -0x1

    const-string v4, "debug_dialog"

    const/4 v8, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    const-string v4, "interstitial_timeout"

    move-object/from16 v0, v28

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    const-string v4, "interstitial_timeout"

    move-object/from16 v0, v28

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v8

    const-wide v10, 0x408f400000000000L    # 1000.0

    mul-double/2addr v8, v10

    double-to-long v12, v8

    :goto_2
    const-string v4, "orientation"

    const/4 v8, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/16 v18, -0x1

    const-string v8, "portrait"

    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbx()Lcom/google/android/gms/internal/qd;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/qd;->b()I

    move-result v18

    :cond_0
    :goto_3
    const/4 v4, 0x0

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_5

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_17

    const-string v4, "Could not parse the mediation config: Missing required ad_base_url field"

    invoke-static {v4}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaH(Ljava/lang/String;)V

    new-instance v4, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;-><init>(I)V

    :goto_4
    return-object v4

    :cond_1
    const/16 v27, 0x0

    goto :goto_0

    :cond_2
    const-string v4, "ad_html"

    const/4 v5, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_3
    const-wide/16 v12, -0x1

    goto :goto_2

    :cond_4
    const-string v8, "landscape"

    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbx()Lcom/google/android/gms/internal/qd;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/qd;->a()I

    move-result v18

    goto :goto_3

    :cond_5
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_7

    move-object/from16 v0, p1

    iget-object v4, v0, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzqj:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v6, v4, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->zzJu:Ljava/lang/String;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v4, p1

    move-object/from16 v5, p0

    invoke-static/range {v4 .. v10}, Lcom/google/android/gms/internal/nj;->a(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/nx;Lcom/google/android/gms/internal/dm;Lcom/google/android/gms/internal/ni;)Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    move-result-object v4

    iget-object v6, v4, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzBF:Ljava/lang/String;

    iget-object v7, v4, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->body:Ljava/lang/String;

    iget-wide v0, v4, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEO:J

    move-wide/from16 v20, v0

    move-object v10, v4

    :goto_5
    const-string v4, "click_urls"

    move-object/from16 v0, v28

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    if-nez v10, :cond_9

    const/4 v4, 0x0

    :goto_6
    if-eqz v8, :cond_16

    if-nez v4, :cond_6

    new-instance v4, Ljava/util/LinkedList;

    invoke-direct {v4}, Ljava/util/LinkedList;-><init>()V

    :cond_6
    const/4 v5, 0x0

    :goto_7
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v9

    if-ge v5, v9, :cond_a

    invoke-virtual {v8, v5}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_7

    :cond_7
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v4, "Could not parse the mediation config: Missing required "

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz v27, :cond_8

    const-string v4, "ad_json"

    :goto_8
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " or ad_url field."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaH(Ljava/lang/String;)V

    new-instance v4, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;-><init>(I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_4

    :catch_0
    move-exception v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Could not parse the mediation config: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaH(Ljava/lang/String;)V

    new-instance v4, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;-><init>(I)V

    goto/16 :goto_4

    :cond_8
    :try_start_1
    const-string v4, "ad_html"

    goto :goto_8

    :cond_9
    iget-object v4, v10, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzyY:Ljava/util/List;

    goto :goto_6

    :cond_a
    move-object v8, v4

    :goto_9
    const-string v4, "impression_urls"

    move-object/from16 v0, v28

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v9

    if-nez v10, :cond_c

    const/4 v4, 0x0

    :goto_a
    if-eqz v9, :cond_15

    if-nez v4, :cond_b

    new-instance v4, Ljava/util/LinkedList;

    invoke-direct {v4}, Ljava/util/LinkedList;-><init>()V

    :cond_b
    const/4 v5, 0x0

    :goto_b
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    move-result v11

    if-ge v5, v11, :cond_d

    invoke-virtual {v9, v5}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v4, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_b

    :cond_c
    iget-object v4, v10, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzyZ:Ljava/util/List;

    goto :goto_a

    :cond_d
    move-object v9, v4

    :goto_c
    const-string v4, "manual_impression_urls"

    move-object/from16 v0, v28

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v11

    if-nez v10, :cond_f

    const/4 v4, 0x0

    :goto_d
    if-eqz v11, :cond_14

    if-nez v4, :cond_e

    new-instance v4, Ljava/util/LinkedList;

    invoke-direct {v4}, Ljava/util/LinkedList;-><init>()V

    :cond_e
    const/4 v5, 0x0

    :goto_e
    invoke-virtual {v11}, Lorg/json/JSONArray;->length()I

    move-result v14

    if-ge v5, v14, :cond_10

    invoke-virtual {v11, v5}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v14

    invoke-interface {v4, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_e

    :cond_f
    iget-object v4, v10, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEM:Ljava/util/List;

    goto :goto_d

    :cond_10
    move-object v15, v4

    :goto_f
    if-eqz v10, :cond_13

    iget v4, v10, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->orientation:I

    const/4 v5, -0x1

    if-eq v4, v5, :cond_11

    iget v0, v10, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->orientation:I

    move/from16 v18, v0

    :cond_11
    iget-wide v4, v10, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEJ:J

    const-wide/16 v16, 0x0

    cmp-long v4, v4, v16

    if-lez v4, :cond_13

    iget-wide v10, v10, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEJ:J

    :goto_10
    const-string v4, "active_view"

    move-object/from16 v0, v28

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v25

    const/16 v24, 0x0

    const-string v4, "ad_is_javascript"

    const/4 v5, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v23

    if-eqz v23, :cond_12

    const-string v4, "ad_passback_url"

    const/4 v5, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v24

    :cond_12
    const-string v4, "mediation"

    const/4 v5, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v12

    const-string v4, "custom_render_allowed"

    const/4 v5, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v26

    const-string v4, "content_url_opted_out"

    const/4 v5, 0x1

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v29

    const-string v4, "prefetch"

    const/4 v5, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v30

    const-string v4, "oauth2_token_status"

    const/4 v5, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v31

    const-string v4, "refresh_interval_milliseconds"

    const-wide/16 v16, -0x1

    move-object/from16 v0, v28

    move-wide/from16 v1, v16

    invoke-virtual {v0, v4, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v16

    const-string v4, "mediation_config_cache_time_milliseconds"

    const-wide/16 v32, -0x1

    move-object/from16 v0, v28

    move-wide/from16 v1, v32

    invoke-virtual {v0, v4, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v13

    const-string v4, "gws_query_id"

    const-string v5, ""

    move-object/from16 v0, v28

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v32

    const-string v4, "height"

    const-string v5, "fluid"

    const-string v33, ""

    move-object/from16 v0, v28

    move-object/from16 v1, v33

    invoke-virtual {v0, v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v33

    new-instance v4, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    move-object/from16 v0, p1

    iget-boolean v0, v0, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEv:Z

    move/from16 v28, v0

    move-object/from16 v5, p1

    invoke-direct/range {v4 .. v33}, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;-><init>(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JZJLjava/util/List;JILjava/lang/String;JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZZZILjava/lang/String;Z)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_4

    :cond_13
    move-wide v10, v12

    goto/16 :goto_10

    :cond_14
    move-object v15, v4

    goto/16 :goto_f

    :cond_15
    move-object v9, v4

    goto/16 :goto_c

    :cond_16
    move-object v8, v4

    goto/16 :goto_9

    :cond_17
    move-object v10, v4

    move-object v7, v5

    goto/16 :goto_5
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/appdatasearch/UsageInfo;
    .locals 4

    const/4 v1, 0x0

    :try_start_0
    new-instance v0, Lcom/google/android/gms/common/api/i;

    invoke-direct {v0, p0}, Lcom/google/android/gms/common/api/i;-><init>(Landroid/content/Context;)V

    sget-object v2, Lcom/google/android/gms/appdatasearch/e;->b:Lcom/google/android/gms/common/api/a;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/common/api/i;->a(Lcom/google/android/gms/common/api/a;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/i;->b()Lcom/google/android/gms/common/api/h;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    :try_start_1
    invoke-virtual {v2}, Lcom/google/android/gms/common/api/h;->b()V

    new-instance v0, Lcom/google/android/gms/appdatasearch/a;

    invoke-direct {v0}, Lcom/google/android/gms/appdatasearch/a;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/appdatasearch/a;->a()Lcom/google/android/gms/appdatasearch/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/appdatasearch/a;->a(Ljava/lang/String;)Lcom/google/android/gms/appdatasearch/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/appdatasearch/a;->b()Lcom/google/android/gms/appdatasearch/GetRecentContextCall$Request;

    move-result-object v0

    sget-object v3, Lcom/google/android/gms/appdatasearch/e;->c:Lcom/google/android/gms/appdatasearch/p;

    invoke-interface {v3, v2, v0}, Lcom/google/android/gms/appdatasearch/p;->a(Lcom/google/android/gms/common/api/h;Lcom/google/android/gms/appdatasearch/GetRecentContextCall$Request;)Lcom/google/android/gms/common/api/p;

    move-result-object v0

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/common/api/p;->a(Ljava/util/concurrent/TimeUnit;)Lcom/google/android/gms/common/api/r;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/appdatasearch/GetRecentContextCall$Response;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/appdatasearch/GetRecentContextCall$Response;->a()Lcom/google/android/gms/common/api/Status;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/common/api/Status;->e()Z

    move-result v3

    if-nez v3, :cond_1

    :cond_0
    const-string v0, "Fail to obtain recent context call"

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaG(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-virtual {v2}, Lcom/google/android/gms/common/api/h;->c()V

    :goto_0
    return-object v1

    :cond_1
    :try_start_2
    iget-object v3, v0, Lcom/google/android/gms/appdatasearch/GetRecentContextCall$Response;->b:Ljava/util/List;

    if-eqz v3, :cond_2

    iget-object v3, v0, Lcom/google/android/gms/appdatasearch/GetRecentContextCall$Response;->b:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    :cond_2
    const-string v0, "Fail to obtain recent context"

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaG(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {v2}, Lcom/google/android/gms/common/api/h;->c()V

    goto :goto_0

    :cond_3
    :try_start_3
    iget-object v0, v0, Lcom/google/android/gms/appdatasearch/GetRecentContextCall$Response;->b:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/appdatasearch/UsageInfo;
    :try_end_3
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-virtual {v2}, Lcom/google/android/gms/common/api/h;->c()V

    :goto_1
    move-object v1, v0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v0, v1

    :goto_2
    :try_start_4
    const-string v2, "Fail to get recent context"

    invoke-static {v2}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaH(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/h;->c()V

    move-object v0, v1

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v2, v1

    :goto_3
    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/google/android/gms/common/api/h;->c()V

    :cond_4
    throw v0

    :catchall_1
    move-exception v0

    goto :goto_3

    :catchall_2
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    goto :goto_3

    :catch_1
    move-exception v0

    move-object v0, v2

    goto :goto_2

    :cond_5
    move-object v0, v1

    goto :goto_1
.end method

.method private static a(Z)Ljava/lang/Integer;
    .locals 1

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static a(I)Ljava/lang/String;
    .locals 5

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "#%06x"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const v4, 0xffffff

    and-int/2addr v4, p0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Lcom/google/android/gms/internal/ny;Lcom/google/android/gms/internal/cn;Ljava/lang/String;Ljava/util/List;)Lorg/json/JSONObject;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;",
            "Lcom/google/android/gms/internal/ny;",
            "Lcom/google/android/gms/internal/cn;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/json/JSONObject;"
        }
    .end annotation

    .prologue
    .line 0
    :try_start_0
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "eid"

    const-string v1, ","

    invoke-static {v1, p5}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEm:Landroid/os/Bundle;

    if-eqz v0, :cond_1

    const-string v0, "ad_pos"

    iget-object v1, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEm:Landroid/os/Bundle;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v1, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEn:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    .line 1000
    invoke-static {}, Lcom/google/android/gms/internal/pi;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v3, "abf"

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-wide v4, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsB:J

    const-wide/16 v6, -0x1

    cmp-long v0, v4, v6

    if-eqz v0, :cond_3

    const-string v0, "cust_age"

    sget-object v3, Lcom/google/android/gms/internal/ns;->a:Ljava/text/SimpleDateFormat;

    new-instance v4, Ljava/util/Date;

    iget-wide v6, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsB:J

    invoke-direct {v4, v6, v7}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v3, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object v0, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->extras:Landroid/os/Bundle;

    if-eqz v0, :cond_4

    const-string v0, "extras"

    iget-object v3, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->extras:Landroid/os/Bundle;

    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    iget v0, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsC:I

    const/4 v3, -0x1

    if-eq v0, v3, :cond_5

    const-string v0, "cust_gender"

    iget v3, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsC:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    iget-object v0, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsD:Ljava/util/List;

    if-eqz v0, :cond_6

    const-string v0, "kw"

    iget-object v3, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsD:Ljava/util/List;

    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    iget v0, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsF:I

    const/4 v3, -0x1

    if-eq v0, v3, :cond_7

    const-string v0, "tag_for_child_directed_treatment"

    iget v3, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsF:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    iget-boolean v0, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsE:Z

    if-eqz v0, :cond_8

    const-string v0, "adtest"

    const-string v3, "on"

    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    iget v0, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->versionCode:I

    const/4 v3, 0x2

    if-lt v0, v3, :cond_15

    iget-boolean v0, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsG:Z

    if-eqz v0, :cond_9

    const-string v0, "d_imp_hdr"

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    iget-object v0, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsH:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_a

    const-string v0, "ppid"

    iget-object v3, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsH:Ljava/lang/String;

    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    iget-object v0, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsI:Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;

    if-eqz v0, :cond_15

    iget-object v3, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsI:Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;

    .line 2000
    iget v0, v3, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztP:I

    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    if-eqz v0, :cond_b

    const-string v0, "acolor"

    iget v4, v3, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztP:I

    invoke-static {v4}, Lcom/google/android/gms/internal/ns;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    iget v0, v3, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->backgroundColor:I

    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    if-eqz v0, :cond_c

    const-string v0, "bgcolor"

    iget v4, v3, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->backgroundColor:I

    invoke-static {v4}, Lcom/google/android/gms/internal/ns;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    iget v0, v3, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztQ:I

    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    if-eqz v0, :cond_d

    iget v0, v3, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztR:I

    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    if-eqz v0, :cond_d

    const-string v0, "gradientto"

    iget v4, v3, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztQ:I

    invoke-static {v4}, Lcom/google/android/gms/internal/ns;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "gradientfrom"

    iget v4, v3, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztR:I

    invoke-static {v4}, Lcom/google/android/gms/internal/ns;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d
    iget v0, v3, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztS:I

    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    if-eqz v0, :cond_e

    const-string v0, "bcolor"

    iget v4, v3, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztS:I

    invoke-static {v4}, Lcom/google/android/gms/internal/ns;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_e
    const-string v0, "bthick"

    iget v4, v3, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztT:I

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, v3, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztU:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_f

    const-string v4, "btype"

    invoke-virtual {v2, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_f
    iget v0, v3, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztV:I

    packed-switch v0, :pswitch_data_1

    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_10

    const-string v4, "callbuttoncolor"

    invoke-virtual {v2, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_10
    iget-object v0, v3, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztW:Ljava/lang/String;

    if-eqz v0, :cond_11

    const-string v0, "channel"

    iget-object v4, v3, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztW:Ljava/lang/String;

    invoke-virtual {v2, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_11
    iget v0, v3, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztX:I

    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    if-eqz v0, :cond_12

    const-string v0, "dcolor"

    iget v4, v3, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztX:I

    invoke-static {v4}, Lcom/google/android/gms/internal/ns;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_12
    iget-object v0, v3, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztY:Ljava/lang/String;

    if-eqz v0, :cond_13

    const-string v0, "font"

    iget-object v4, v3, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztY:Ljava/lang/String;

    invoke-virtual {v2, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_13
    iget v0, v3, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztZ:I

    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    if-eqz v0, :cond_14

    const-string v0, "hcolor"

    iget v4, v3, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zztZ:I

    invoke-static {v4}, Lcom/google/android/gms/internal/ns;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_14
    const-string v0, "headersize"

    iget v4, v3, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zzua:I

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v3, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zzub:Ljava/lang/String;

    if-eqz v0, :cond_15

    const-string v0, "q"

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;->zzub:Ljava/lang/String;

    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1000
    :cond_15
    iget v0, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->versionCode:I

    const/4 v3, 0x3

    if-lt v0, v3, :cond_16

    iget-object v0, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsK:Ljava/lang/String;

    if-eqz v0, :cond_16

    const-string v0, "url"

    iget-object v3, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsK:Ljava/lang/String;

    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_16
    iget v0, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->versionCode:I

    const/4 v3, 0x5

    if-lt v0, v3, :cond_19

    iget-object v0, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsM:Landroid/os/Bundle;

    if-eqz v0, :cond_17

    const-string v0, "custom_targeting"

    iget-object v3, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsM:Landroid/os/Bundle;

    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_17
    iget-object v0, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsN:Ljava/util/List;

    if-eqz v0, :cond_18

    const-string v0, "category_exclusions"

    iget-object v3, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsN:Ljava/util/List;

    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_18
    iget-object v0, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsO:Ljava/lang/String;

    if-eqz v0, :cond_19

    const-string v0, "request_agent"

    iget-object v3, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsO:Ljava/lang/String;

    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_19
    iget v0, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->versionCode:I

    const/4 v3, 0x6

    if-lt v0, v3, :cond_1a

    iget-object v0, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsP:Ljava/lang/String;

    if-eqz v0, :cond_1a

    const-string v0, "request_pkg"

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsP:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 0
    :cond_1a
    const-string v0, "format"

    iget-object v1, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzqn:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zzte:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzqn:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget v0, v0, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->width:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1b

    const-string v0, "smart_w"

    const-string v1, "full"

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1b
    iget-object v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzqn:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget v0, v0, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->height:I

    const/4 v1, -0x2

    if-ne v0, v1, :cond_1c

    const-string v0, "smart_h"

    const-string v1, "auto"

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1c
    iget-object v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzqn:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-boolean v0, v0, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zzti:Z

    if-eqz v0, :cond_1d

    const-string v0, "fluid"

    const-string v1, "height"

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1d
    iget-object v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzqn:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zztg:[Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    if-eqz v0, :cond_22

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzqn:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-object v4, v0, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zztg:[Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    array-length v5, v4

    const/4 v0, 0x0

    move v1, v0

    :goto_2
    if-ge v1, v5, :cond_21

    aget-object v6, v4, v1

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-eqz v0, :cond_1e

    const-string v0, "|"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1e
    iget v0, v6, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->width:I

    const/4 v7, -0x1

    if-ne v0, v7, :cond_1f

    iget v0, v6, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->widthPixels:I

    int-to-float v0, v0

    iget v7, p2, Lcom/google/android/gms/internal/ny;->r:F

    div-float/2addr v0, v7

    float-to-int v0, v0

    :goto_3
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "x"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, v6, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->height:I

    const/4 v7, -0x2

    if-ne v0, v7, :cond_20

    iget v0, v6, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->heightPixels:I

    int-to-float v0, v0

    iget v6, p2, Lcom/google/android/gms/internal/ny;->r:F

    div-float/2addr v0, v6

    float-to-int v0, v0

    :goto_4
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    .line 2000
    :pswitch_0
    const-string v0, "none"

    goto/16 :goto_0

    :pswitch_1
    const-string v0, "dashed"

    goto/16 :goto_0

    :pswitch_2
    const-string v0, "dotted"

    goto/16 :goto_0

    :pswitch_3
    const-string v0, "solid"

    goto/16 :goto_0

    :pswitch_4
    const-string v0, "dark"

    goto/16 :goto_1

    :pswitch_5
    const-string v0, "light"

    goto/16 :goto_1

    :pswitch_6
    const-string v0, "medium"

    goto/16 :goto_1

    .line 0
    :cond_1f
    iget v0, v6, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->width:I

    goto :goto_3

    :cond_20
    iget v0, v6, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->height:I

    goto :goto_4

    :cond_21
    const-string v0, "sz"

    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_22
    iget v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEt:I

    if-eqz v0, :cond_23

    const-string v0, "native_version"

    iget v1, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEt:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "native_templates"

    iget-object v1, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzqD:Ljava/util/List;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "native_image_orientation"

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzqB:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    .line 3000
    if-eqz v0, :cond_34

    iget v0, v0, Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;->zzwS:I

    :goto_5
    packed-switch v0, :pswitch_data_2

    const-string v0, "any"

    .line 0
    :goto_6
    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEE:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_23

    const-string v0, "native_custom_templates"

    iget-object v1, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEE:Ljava/util/List;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_23
    const-string v0, "slotname"

    iget-object v1, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzqh:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "pn"

    iget-object v1, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEo:Landroid/content/pm/PackageInfo;

    if-eqz v0, :cond_24

    const-string v0, "vc"

    iget-object v1, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEo:Landroid/content/pm/PackageInfo;

    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_24
    const-string v0, "ms"

    invoke-virtual {v2, v0, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "seq_num"

    iget-object v1, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEq:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "session_id"

    iget-object v1, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEr:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "js"

    iget-object v1, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzqj:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->zzJu:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4000
    const-string v0, "am"

    iget v1, p2, Lcom/google/android/gms/internal/ny;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "cog"

    iget-boolean v1, p2, Lcom/google/android/gms/internal/ny;->b:Z

    invoke-static {v1}, Lcom/google/android/gms/internal/ns;->a(Z)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "coh"

    iget-boolean v1, p2, Lcom/google/android/gms/internal/ny;->c:Z

    invoke-static {v1}, Lcom/google/android/gms/internal/ns;->a(Z)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p2, Lcom/google/android/gms/internal/ny;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_25

    const-string v0, "carrier"

    iget-object v1, p2, Lcom/google/android/gms/internal/ny;->d:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_25
    const-string v0, "gl"

    iget-object v1, p2, Lcom/google/android/gms/internal/ny;->e:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, p2, Lcom/google/android/gms/internal/ny;->f:Z

    if-eqz v0, :cond_26

    const-string v0, "simulator"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_26
    iget-boolean v0, p2, Lcom/google/android/gms/internal/ny;->g:Z

    if-eqz v0, :cond_27

    const-string v0, "is_sidewinder"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_27
    const-string v0, "ma"

    iget-boolean v1, p2, Lcom/google/android/gms/internal/ny;->h:Z

    invoke-static {v1}, Lcom/google/android/gms/internal/ns;->a(Z)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "sp"

    iget-boolean v1, p2, Lcom/google/android/gms/internal/ny;->i:Z

    invoke-static {v1}, Lcom/google/android/gms/internal/ns;->a(Z)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "hl"

    iget-object v1, p2, Lcom/google/android/gms/internal/ny;->j:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p2, Lcom/google/android/gms/internal/ny;->k:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_28

    const-string v0, "mv"

    iget-object v1, p2, Lcom/google/android/gms/internal/ny;->k:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_28
    const-string v0, "muv"

    iget v1, p2, Lcom/google/android/gms/internal/ny;->l:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p2, Lcom/google/android/gms/internal/ny;->m:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_29

    const-string v0, "cnt"

    iget v1, p2, Lcom/google/android/gms/internal/ny;->m:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_29
    const-string v0, "gnt"

    iget v1, p2, Lcom/google/android/gms/internal/ny;->n:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "pt"

    iget v1, p2, Lcom/google/android/gms/internal/ny;->o:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "rm"

    iget v1, p2, Lcom/google/android/gms/internal/ny;->p:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "riv"

    iget v1, p2, Lcom/google/android/gms/internal/ny;->q:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "build"

    iget-object v3, p2, Lcom/google/android/gms/internal/ny;->y:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v3, "is_charging"

    iget-boolean v4, p2, Lcom/google/android/gms/internal/ny;->v:Z

    invoke-virtual {v1, v3, v4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v3, "battery_level"

    iget-wide v4, p2, Lcom/google/android/gms/internal/ny;->u:D

    invoke-virtual {v1, v3, v4, v5}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    const-string v3, "battery"

    invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v3, "active_network_state"

    iget v4, p2, Lcom/google/android/gms/internal/ny;->x:I

    invoke-virtual {v1, v3, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v3, "active_network_metered"

    iget-boolean v4, p2, Lcom/google/android/gms/internal/ny;->w:Z

    invoke-virtual {v1, v3, v4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v3, "network"

    invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    const-string v1, "device"

    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 0
    const-string v0, "fdz"

    invoke-virtual {p3}, Lcom/google/android/gms/internal/cn;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "platform"

    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "submodel"

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEn:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    iget v0, v0, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->versionCode:I

    const/4 v1, 0x2

    if-lt v0, v1, :cond_2a

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEn:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsJ:Landroid/location/Location;

    if-eqz v0, :cond_2a

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEn:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsJ:Landroid/location/Location;

    .line 5000
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v0}, Landroid/location/Location;->getAccuracy()F

    move-result v3

    const/high16 v4, 0x447a0000    # 1000.0f

    mul-float/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v0}, Landroid/location/Location;->getTime()J

    move-result-wide v4

    const-wide/16 v6, 0x3e8

    mul-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v6

    const-wide v8, 0x416312d000000000L    # 1.0E7

    mul-double/2addr v6, v8

    double-to-long v6, v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v6

    const-wide v8, 0x416312d000000000L    # 1.0E7

    mul-double/2addr v6, v8

    double-to-long v6, v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v6, "radius"

    invoke-virtual {v1, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "lat"

    invoke-virtual {v1, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "long"

    invoke-virtual {v1, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "time"

    invoke-virtual {v1, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "uule"

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 0
    :cond_2a
    iget v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->versionCode:I

    const/4 v1, 0x2

    if-lt v0, v1, :cond_2b

    const-string v0, "quality_signals"

    iget-object v1, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEs:Landroid/os/Bundle;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2b
    iget v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->versionCode:I

    const/4 v1, 0x4

    if-lt v0, v1, :cond_2c

    iget-boolean v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEv:Z

    if-eqz v0, :cond_2c

    const-string v0, "forceHttps"

    iget-boolean v1, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEv:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2c
    iget v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->versionCode:I

    const/4 v1, 0x4

    if-lt v0, v1, :cond_35

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEu:Landroid/os/Bundle;

    if-eqz v0, :cond_35

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEu:Landroid/os/Bundle;

    move-object v1, v0

    .line 6000
    :goto_7
    sget-object v0, Lcom/google/android/gms/internal/cy;->P:Lcom/google/android/gms/internal/cq;

    .line 7000
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbE()Lcom/google/android/gms/internal/cx;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/cx;->a(Lcom/google/android/gms/internal/cq;)Ljava/lang/Object;

    move-result-object v0

    .line 6000
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_36

    const-string v0, "App index is not enabled"

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaG(Ljava/lang/String;)V

    .line 0
    :cond_2d
    :goto_8
    const-string v0, "content_info"

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->versionCode:I

    const/4 v1, 0x5

    if-lt v0, v1, :cond_3d

    const-string v0, "u_sd"

    iget v1, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEz:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "sh"

    iget v1, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEy:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "sw"

    iget v1, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEx:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_9
    iget v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->versionCode:I

    const/4 v1, 0x6

    if-lt v0, v1, :cond_2f

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEA:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-nez v0, :cond_2e

    :try_start_1
    const-string v0, "view_hierarchy"

    new-instance v1, Lorg/json/JSONObject;

    iget-object v3, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEA:Ljava/lang/String;

    invoke-direct {v1, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_3

    :cond_2e
    :goto_a
    :try_start_2
    const-string v0, "correlation_id"

    iget-wide v4, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEB:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2f
    iget v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->versionCode:I

    const/4 v1, 0x7

    if-lt v0, v1, :cond_30

    const-string v0, "request_id"

    iget-object v1, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEC:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_30
    iget v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->versionCode:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_31

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEG:Lcom/google/android/gms/ads/internal/request/CapabilityParcel;

    if-eqz v0, :cond_31

    const-string v0, "capability"

    iget-object v1, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEG:Lcom/google/android/gms/ads/internal/request/CapabilityParcel;

    invoke-virtual {v1}, Lcom/google/android/gms/ads/internal/request/CapabilityParcel;->toBundle()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_31
    iget v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->versionCode:I

    const/16 v1, 0xc

    if-lt v0, v1, :cond_32

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEH:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_32

    const-string v0, "anchor"

    iget-object v1, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEH:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_32
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzN(I)Z

    move-result v0

    if-eqz v0, :cond_33

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbv()Lcom/google/android/gms/internal/qa;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/qa;->a(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Ad Request JSON: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->v(Ljava/lang/String;)V

    :cond_33
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbv()Lcom/google/android/gms/internal/qa;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/qa;->a(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v0

    :goto_b
    return-object v0

    .line 3000
    :cond_34
    const/4 v0, 0x0

    goto/16 :goto_5

    :pswitch_7
    const-string v0, "portrait"

    goto/16 :goto_6

    :pswitch_8
    const-string v0, "landscape"

    goto/16 :goto_6

    .line 0
    :cond_35
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    move-object v1, v0

    goto/16 :goto_7

    .line 6000
    :cond_36
    invoke-static {}, Lcom/google/android/gms/internal/wf;->a()Z

    move-result v0

    if-nez v0, :cond_37

    const-string v0, "Not on service, return"

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaG(Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_8

    .line 0
    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Problem serializing ad request to JSON: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaH(Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_b

    .line 6000
    :cond_37
    :try_start_3
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzl;->zzcF()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzgT()Z

    move-result v0

    if-eqz v0, :cond_38

    const-string v0, "Cannot invoked on UI thread"

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaG(Ljava/lang/String;)V

    goto/16 :goto_8

    :cond_38
    if-eqz p1, :cond_39

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEo:Landroid/content/pm/PackageInfo;

    if-nez v0, :cond_3a

    :cond_39
    const-string v0, "Invalid ad request info"

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaH(Ljava/lang/String;)V

    goto/16 :goto_8

    :cond_3a
    iget-object v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEo:Landroid/content/pm/PackageInfo;

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3b

    const-string v0, "Fail to get package name"

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaH(Ljava/lang/String;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    goto/16 :goto_8

    :cond_3b
    :try_start_4
    invoke-static {p0, v0}, Lcom/google/android/gms/internal/ns;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/appdatasearch/UsageInfo;

    move-result-object v3

    .line 8000
    if-eqz v3, :cond_2d

    invoke-virtual {v3}, Lcom/google/android/gms/appdatasearch/UsageInfo;->a()Lcom/google/android/gms/appdatasearch/DocumentContents;

    move-result-object v4

    if-eqz v4, :cond_2d

    invoke-virtual {v3}, Lcom/google/android/gms/appdatasearch/UsageInfo;->a()Lcom/google/android/gms/appdatasearch/DocumentContents;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/appdatasearch/DocumentContents;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_3c

    const-string v5, "web_url"

    invoke-virtual {v1, v5, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    :cond_3c
    :try_start_5
    const-string v4, "intent_data"

    invoke-virtual {v3, v4}, Lcom/google/android/gms/appdatasearch/DocumentContents;->a(Ljava/lang/String;)Lcom/google/android/gms/appdatasearch/DocumentSection;

    move-result-object v3

    if-eqz v3, :cond_2d

    iget-object v4, v3, Lcom/google/android/gms/appdatasearch/DocumentSection;->c:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2d

    iget-object v3, v3, Lcom/google/android/gms/appdatasearch/DocumentSection;->c:Ljava/lang/String;

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/android/gms/a/a;->a(Ljava/lang/String;Landroid/net/Uri;)Lcom/google/android/gms/a/a;

    move-result-object v0

    const-string v3, "app_uri"

    invoke-virtual {v0}, Lcom/google/android/gms/a/a;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v3, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_0

    goto/16 :goto_8

    :catch_1
    move-exception v0

    :try_start_6
    const-string v0, "Failed to parse the third-party Android App URI"

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaH(Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_0

    goto/16 :goto_8

    .line 6000
    :catch_2
    move-exception v0

    :try_start_7
    const-string v0, "Fail to add app index to content info"

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaG(Ljava/lang/String;)V

    goto/16 :goto_8

    .line 0
    :cond_3d
    const-string v0, "u_sd"

    iget v1, p2, Lcom/google/android/gms/internal/ny;->r:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "sh"

    iget v1, p2, Lcom/google/android/gms/internal/ny;->t:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "sw"

    iget v1, p2, Lcom/google/android/gms/internal/ny;->s:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_9

    :catch_3
    move-exception v0

    const-string v1, "Problem serializing view hierarchy to JSON"

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzd(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_0

    goto/16 :goto_a

    .line 2000
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_6
        :pswitch_4
    .end packed-switch

    .line 3000
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method
