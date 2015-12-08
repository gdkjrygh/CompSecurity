.class public final Lcom/roidapp/photogrid/cloud/aj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/baselib/e/s;


# static fields
.field private static final a:Ljava/lang/String;

.field private static volatile b:Z


# instance fields
.field private c:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/roidapp/baselib/d/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".Fonts"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/photogrid/cloud/aj;->a:Ljava/lang/String;

    .line 34
    const/4 v0, 0x0

    sput-boolean v0, Lcom/roidapp/photogrid/cloud/aj;->b:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 170
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/cloud/ak;",
            ">;"
        }
    .end annotation

    .prologue
    .line 126
    const/4 v2, 0x0

    .line 127
    invoke-static/range {p1 .. p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 129
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    move-object/from16 v0, p1

    invoke-direct {v3, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 131
    const-string v4, "data"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v15

    .line 132
    if-eqz v15, :cond_2

    .line 133
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 134
    :try_start_1
    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    .line 135
    const/4 v2, 0x0

    invoke-virtual {v15}, Lorg/json/JSONArray;->length()I

    move-result v17

    move v14, v2

    :goto_0
    move/from16 v0, v17

    if-ge v14, v0, :cond_3

    .line 136
    invoke-virtual {v15, v14}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    .line 137
    if-eqz v2, :cond_0

    .line 143
    const-string v3, "name"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 144
    const-string v3, "realName"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 145
    if-eqz v4, :cond_0

    .line 146
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "http://dl.pg.ksmobile.com/fonts/preview/"

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v6, "preview"

    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 147
    const-string v3, "size"

    const-wide/16 v8, 0x0

    invoke-virtual {v2, v3, v8, v9}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v7

    .line 148
    const-string v3, "language"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 149
    const-string v3, "CRC"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v10

    .line 151
    move-object/from16 v0, p2

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 152
    new-instance v2, Lcom/roidapp/photogrid/cloud/ak;

    const/4 v12, 0x0

    move-object/from16 v3, p0

    invoke-direct/range {v2 .. v12}, Lcom/roidapp/photogrid/cloud/ak;-><init>(Lcom/roidapp/photogrid/cloud/aj;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JB)V

    invoke-interface {v13, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 135
    :cond_0
    :goto_1
    add-int/lit8 v2, v14, 0x1

    move v14, v2

    goto :goto_0

    .line 153
    :cond_1
    new-instance v2, Lcom/roidapp/photogrid/cloud/ak;

    const/4 v12, 0x0

    move-object/from16 v3, p0

    invoke-direct/range {v2 .. v12}, Lcom/roidapp/photogrid/cloud/ak;-><init>(Lcom/roidapp/photogrid/cloud/aj;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JB)V

    move-object/from16 v0, v16

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 161
    :catch_0
    move-exception v2

    move-object v3, v2

    move-object v2, v13

    :goto_2
    invoke-virtual {v3}, Lorg/json/JSONException;->printStackTrace()V

    .line 164
    :cond_2
    :goto_3
    return-object v2

    .line 157
    :cond_3
    :try_start_2
    move-object/from16 v0, v16

    invoke-interface {v13, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    move-object v2, v13

    goto :goto_3

    .line 161
    :catch_1
    move-exception v3

    goto :goto_2
.end method

.method private static b(Ljava/lang/String;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 113
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 115
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 116
    const-string v2, "data"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    .line 122
    :cond_0
    :goto_0
    return v0

    .line 119
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/cloud/ak;",
            ">;"
        }
    .end annotation

    .prologue
    .line 45
    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/roidapp/photogrid/cloud/aj;->a:Ljava/lang/String;

    const-string v2, "info"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "UTF-8"

    invoke-static {v0, v1}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/roidapp/photogrid/cloud/aj;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final a(ILjava/lang/Exception;)V
    .locals 1

    .prologue
    .line 108
    const/4 v0, 0x0

    sput-boolean v0, Lcom/roidapp/photogrid/cloud/aj;->b:Z

    .line 109
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/aj;->c:Landroid/content/SharedPreferences;

    .line 110
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 29
    check-cast p1, Ljava/lang/String;

    .line 1091
    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/aj;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1093
    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/roidapp/photogrid/cloud/aj;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1094
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1095
    :cond_0
    new-instance v1, Ljava/io/File;

    const-string v2, "info"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const-string v0, "UTF-8"

    invoke-static {p1, v1, v0}, Lcom/roidapp/baselib/d/a;->a(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1096
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/aj;->c:Landroid/content/SharedPreferences;

    if-eqz v0, :cond_1

    .line 1097
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/aj;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "FontListTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1098
    :cond_1
    :goto_0
    return-void

    .line 1103
    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/aj;->c:Landroid/content/SharedPreferences;

    goto :goto_0
.end method

.method public final a(Landroid/content/Context;)Z
    .locals 8

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 54
    if-nez p1, :cond_1

    .line 85
    :cond_0
    :goto_0
    return v0

    .line 57
    :cond_1
    new-instance v2, Ljava/io/File;

    sget-object v3, Lcom/roidapp/photogrid/cloud/aj;->a:Ljava/lang/String;

    const-string v4, "info"

    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_4

    move v2, v1

    .line 60
    :goto_1
    if-nez v2, :cond_2

    sget-boolean v3, Lcom/roidapp/photogrid/cloud/aj;->b:Z

    if-nez v3, :cond_0

    .line 63
    :cond_2
    sput-boolean v1, Lcom/roidapp/photogrid/cloud/aj;->b:Z

    .line 65
    if-nez v2, :cond_3

    .line 66
    invoke-static {}, Lcom/roidapp/baselib/c/n;->i()I

    move-result v2

    rem-int/lit8 v2, v2, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    .line 72
    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    iput-object v2, p0, Lcom/roidapp/photogrid/cloud/aj;->c:Landroid/content/SharedPreferences;

    .line 73
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/aj;->c:Landroid/content/SharedPreferences;

    if-eqz v2, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/aj;->c:Landroid/content/SharedPreferences;

    const-string v5, "FontListTime"

    const-wide/16 v6, 0x0

    invoke-interface {v4, v5, v6, v7}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    sub-long/2addr v2, v4

    const-wide/32 v4, 0xf731400

    cmp-long v2, v2, v4

    if-ltz v2, :cond_0

    .line 78
    :cond_3
    new-instance v0, Lcom/roidapp/baselib/e/r;

    const-string v2, "http://dl.pg.ksmobile.com/fonts/info"

    invoke-direct {v0, v2, p0}, Lcom/roidapp/baselib/e/r;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/s;)V

    .line 80
    :try_start_0
    invoke-static {}, Lcom/roidapp/baselib/c/t;->a()Ljava/util/concurrent/AbstractExecutorService;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/util/concurrent/AbstractExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    move v0, v1

    .line 85
    goto :goto_0

    :cond_4
    move v2, v0

    .line 57
    goto :goto_1

    .line 83
    :catch_0
    move-exception v2

    new-instance v2, Ljava/lang/Thread;

    invoke-direct {v2, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    goto :goto_2
.end method
