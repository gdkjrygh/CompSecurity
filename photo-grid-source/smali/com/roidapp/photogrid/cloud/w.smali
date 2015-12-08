.class public final Lcom/roidapp/photogrid/cloud/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/baselib/e/s;


# static fields
.field private static volatile a:Z

.field private static volatile b:Z

.field private static c:Lcom/roidapp/photogrid/cloud/w;

.field private static d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final k:[Ljava/lang/String;


# instance fields
.field private e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/lang/String;

.field private g:Ljava/io/File;

.field private h:Lcom/roidapp/baselib/e/r;

.field private i:I

.field private j:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 42
    sput-boolean v2, Lcom/roidapp/photogrid/cloud/w;->a:Z

    .line 43
    sput-boolean v2, Lcom/roidapp/photogrid/cloud/w;->b:Z

    .line 45
    const/4 v0, 0x0

    sput-object v0, Lcom/roidapp/photogrid/cloud/w;->d:Ljava/util/Set;

    .line 322
    const/16 v0, 0x22

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "en"

    aput-object v1, v0, v2

    const/4 v1, 0x1

    const-string v2, "ar"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "de"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "es"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "fr"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "ja"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "ko"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "ru"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "th"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "tr"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "zh"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "zh-rCN"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, "zh-rTW"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string v2, "hi"

    aput-object v2, v0, v1

    const/16 v1, 0xe

    const-string v2, "in"

    aput-object v2, v0, v1

    const/16 v1, 0xf

    const-string v2, "it"

    aput-object v2, v0, v1

    const/16 v1, 0x10

    const-string v2, "ms"

    aput-object v2, v0, v1

    const/16 v1, 0x11

    const-string v2, "pt"

    aput-object v2, v0, v1

    const/16 v1, 0x12

    const-string v2, "uk"

    aput-object v2, v0, v1

    const/16 v1, 0x13

    const-string v2, "vi"

    aput-object v2, v0, v1

    const/16 v1, 0x14

    const-string v2, "fa"

    aput-object v2, v0, v1

    const/16 v1, 0x15

    const-string v2, "pl"

    aput-object v2, v0, v1

    const/16 v1, 0x16

    const-string v2, "az"

    aput-object v2, v0, v1

    const/16 v1, 0x17

    const-string v2, "da"

    aput-object v2, v0, v1

    const/16 v1, 0x18

    const-string v2, "no"

    aput-object v2, v0, v1

    const/16 v1, 0x19

    const-string v2, "iw"

    aput-object v2, v0, v1

    const/16 v1, 0x1a

    const-string v2, "nl"

    aput-object v2, v0, v1

    const/16 v1, 0x1b

    const-string v2, "ro"

    aput-object v2, v0, v1

    const/16 v1, 0x1c

    const-string v2, "el"

    aput-object v2, v0, v1

    const/16 v1, 0x1d

    const-string v2, "cs"

    aput-object v2, v0, v1

    const/16 v1, 0x1e

    const-string v2, "hu"

    aput-object v2, v0, v1

    const/16 v1, 0x1f

    const-string v2, "bg"

    aput-object v2, v0, v1

    const/16 v1, 0x20

    const-string v2, "sv"

    aput-object v2, v0, v1

    const/16 v1, 0x21

    const-string v2, "sr"

    aput-object v2, v0, v1

    sput-object v0, Lcom/roidapp/photogrid/cloud/w;->k:[Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;I)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    const-string v0, "cloudlib_prefs"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/w;->j:Landroid/content/SharedPreferences;

    .line 2179
    iput p2, p0, Lcom/roidapp/photogrid/cloud/w;->i:I

    .line 2180
    invoke-static {p2}, Lcom/roidapp/photogrid/cloud/w;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2231
    const-string v1, "en"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2232
    const-string v0, "strings2"

    .line 2181
    :goto_0
    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/w;->f:Ljava/lang/String;

    .line 71
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/w;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/w;->g:Ljava/io/File;

    .line 3157
    sget-boolean v0, Lcom/roidapp/photogrid/cloud/w;->b:Z

    if-nez v0, :cond_0

    .line 3159
    const/4 v0, 0x1

    sput-boolean v0, Lcom/roidapp/photogrid/cloud/w;->b:Z

    .line 3160
    iput-object v3, p0, Lcom/roidapp/photogrid/cloud/w;->e:Ljava/util/Map;

    .line 3161
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/w;->g:Ljava/io/File;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/w;->g:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_4

    .line 3175
    :cond_0
    :goto_1
    return-void

    .line 2234
    :cond_1
    const-string v1, "zh"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 2235
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "strings2-"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    const-string v2, "CN"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "-rCN"

    :goto_2
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    const-string v0, "-rTW"

    goto :goto_2

    .line 2238
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "strings2-"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 3164
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/w;->g:Ljava/io/File;

    const-string v1, "utf-8"

    invoke-static {v0, v1}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3165
    if-eqz v0, :cond_0

    .line 3168
    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/w;->e:Ljava/util/Map;

    .line 3170
    :try_start_0
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/w;->e:Ljava/util/Map;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/cloud/w;->a(Ljava/util/Map;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 3173
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    .line 3174
    iput-object v3, p0, Lcom/roidapp/photogrid/cloud/w;->e:Ljava/util/Map;

    goto :goto_1
.end method

.method public static a(Landroid/content/Context;I)Lcom/roidapp/photogrid/cloud/w;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 50
    sget-object v0, Lcom/roidapp/photogrid/cloud/w;->c:Lcom/roidapp/photogrid/cloud/w;

    if-nez v0, :cond_1

    .line 51
    new-instance v0, Lcom/roidapp/photogrid/cloud/w;

    invoke-direct {v0, p0, p1}, Lcom/roidapp/photogrid/cloud/w;-><init>(Landroid/content/Context;I)V

    sput-object v0, Lcom/roidapp/photogrid/cloud/w;->c:Lcom/roidapp/photogrid/cloud/w;

    .line 58
    :cond_0
    :goto_0
    sget-object v0, Lcom/roidapp/photogrid/cloud/w;->c:Lcom/roidapp/photogrid/cloud/w;

    return-object v0

    .line 53
    :cond_1
    sget-object v0, Lcom/roidapp/photogrid/cloud/w;->c:Lcom/roidapp/photogrid/cloud/w;

    iget v0, v0, Lcom/roidapp/photogrid/cloud/w;->i:I

    if-eq v0, p1, :cond_0

    .line 54
    sget-object v0, Lcom/roidapp/photogrid/cloud/w;->c:Lcom/roidapp/photogrid/cloud/w;

    .line 1220
    iget-object v1, v0, Lcom/roidapp/photogrid/cloud/w;->e:Ljava/util/Map;

    if-eqz v1, :cond_2

    .line 1221
    iget-object v1, v0, Lcom/roidapp/photogrid/cloud/w;->e:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 1222
    :cond_2
    iget-object v1, v0, Lcom/roidapp/photogrid/cloud/w;->h:Lcom/roidapp/baselib/e/r;

    if-eqz v1, :cond_3

    .line 1223
    iget-object v1, v0, Lcom/roidapp/photogrid/cloud/w;->h:Lcom/roidapp/baselib/e/r;

    invoke-virtual {v1}, Lcom/roidapp/baselib/e/r;->f()V

    .line 1224
    :cond_3
    iput-object v2, v0, Lcom/roidapp/photogrid/cloud/w;->e:Ljava/util/Map;

    .line 1225
    iput-object v2, v0, Lcom/roidapp/photogrid/cloud/w;->h:Lcom/roidapp/baselib/e/r;

    .line 1226
    iput-object v2, v0, Lcom/roidapp/photogrid/cloud/w;->f:Ljava/lang/String;

    .line 1227
    iput-object v2, v0, Lcom/roidapp/photogrid/cloud/w;->g:Ljava/io/File;

    .line 55
    new-instance v0, Lcom/roidapp/photogrid/cloud/w;

    invoke-direct {v0, p0, p1}, Lcom/roidapp/photogrid/cloud/w;-><init>(Landroid/content/Context;I)V

    sput-object v0, Lcom/roidapp/photogrid/cloud/w;->c:Lcom/roidapp/photogrid/cloud/w;

    goto :goto_0
.end method

.method public static a(I)Ljava/lang/String;
    .locals 2

    .prologue
    .line 247
    packed-switch p0, :pswitch_data_0

    .line 319
    const-string v0, "en"

    :cond_0
    :goto_0
    return-object v0

    .line 249
    :pswitch_0
    const-string v0, "en"

    goto :goto_0

    .line 251
    :pswitch_1
    const-string v0, "de"

    goto :goto_0

    .line 253
    :pswitch_2
    const-string v0, "fr"

    goto :goto_0

    .line 255
    :pswitch_3
    const-string v0, "ja"

    goto :goto_0

    .line 257
    :pswitch_4
    const-string v0, "ko"

    goto :goto_0

    .line 259
    :pswitch_5
    const-string v0, "th"

    goto :goto_0

    .line 261
    :pswitch_6
    const-string v0, "zh-rCN"

    goto :goto_0

    .line 263
    :pswitch_7
    const-string v0, "zh-rTW"

    goto :goto_0

    .line 265
    :pswitch_8
    const-string v0, "es"

    goto :goto_0

    .line 267
    :pswitch_9
    const-string v0, "ar"

    goto :goto_0

    .line 269
    :pswitch_a
    const-string v0, "tr"

    goto :goto_0

    .line 271
    :pswitch_b
    const-string v0, "ru"

    goto :goto_0

    .line 273
    :pswitch_c
    const-string v0, "hi"

    goto :goto_0

    .line 275
    :pswitch_d
    const-string v0, "in"

    goto :goto_0

    .line 277
    :pswitch_e
    const-string v0, "it"

    goto :goto_0

    .line 279
    :pswitch_f
    const-string v0, "ms"

    goto :goto_0

    .line 281
    :pswitch_10
    const-string v0, "pt"

    goto :goto_0

    .line 283
    :pswitch_11
    const-string v0, "uk"

    goto :goto_0

    .line 285
    :pswitch_12
    const-string v0, "vi"

    goto :goto_0

    .line 287
    :pswitch_13
    const-string v0, "fa"

    goto :goto_0

    .line 289
    :pswitch_14
    const-string v0, "pl"

    goto :goto_0

    .line 291
    :pswitch_15
    const-string v0, "az"

    goto :goto_0

    .line 293
    :pswitch_16
    const-string v0, "da"

    goto :goto_0

    .line 295
    :pswitch_17
    const-string v0, "no"

    goto :goto_0

    .line 297
    :pswitch_18
    const-string v0, "iw"

    goto :goto_0

    .line 299
    :pswitch_19
    const-string v0, "nl"

    goto :goto_0

    .line 301
    :pswitch_1a
    const-string v0, "ro"

    goto :goto_0

    .line 303
    :pswitch_1b
    const-string v0, "el"

    goto :goto_0

    .line 305
    :pswitch_1c
    const-string v0, "cs"

    goto :goto_0

    .line 307
    :pswitch_1d
    const-string v0, "hu"

    goto :goto_0

    .line 309
    :pswitch_1e
    const-string v0, "bg"

    goto :goto_0

    .line 311
    :pswitch_1f
    const-string v0, "sv"

    goto :goto_0

    .line 313
    :pswitch_20
    const-string v0, "sr"

    goto :goto_0

    .line 316
    :pswitch_21
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    .line 317
    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/w;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v0, "en"

    goto :goto_0

    .line 247
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_21
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
        :pswitch_18
        :pswitch_19
        :pswitch_1a
        :pswitch_1b
        :pswitch_1c
        :pswitch_1d
        :pswitch_1e
        :pswitch_1f
        :pswitch_20
    .end packed-switch
.end method

.method private static a(Ljava/util/Map;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 185
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 186
    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v2

    .line 187
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 188
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 189
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 190
    if-eqz v0, :cond_0

    if-eqz v3, :cond_0

    if-eqz p0, :cond_0

    .line 191
    invoke-interface {p0, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 193
    :cond_1
    return-void
.end method

.method private a(Ljava/lang/String;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 196
    if-eqz p1, :cond_0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/w;->g:Ljava/io/File;

    if-nez v1, :cond_1

    .line 216
    :cond_0
    :goto_0
    return v0

    .line 198
    :cond_1
    const/4 v3, 0x0

    .line 200
    :try_start_0
    new-instance v2, Ljava/io/FileOutputStream;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/w;->g:Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 201
    :try_start_1
    const-string v1, "utf-8"

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/io/OutputStream;->write([B)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 210
    :try_start_2
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 214
    :goto_1
    const/4 v0, 0x1

    goto :goto_0

    .line 213
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1

    .line 205
    :catch_1
    move-exception v1

    move-object v2, v3

    :goto_2
    :try_start_3
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 208
    if-eqz v2, :cond_0

    .line 210
    :try_start_4
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_0

    .line 213
    :catch_2
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 208
    :catchall_0
    move-exception v0

    move-object v2, v3

    :goto_3
    if-eqz v2, :cond_2

    .line 210
    :try_start_5
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 214
    :cond_2
    :goto_4
    throw v0

    .line 213
    :catch_3
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_4

    .line 208
    :catchall_1
    move-exception v0

    goto :goto_3

    .line 205
    :catch_4
    move-exception v1

    goto :goto_2
.end method

.method private static declared-synchronized b(Ljava/lang/String;)Z
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 332
    const-class v2, Lcom/roidapp/photogrid/cloud/w;

    monitor-enter v2

    :try_start_0
    sget-object v1, Lcom/roidapp/photogrid/cloud/w;->d:Ljava/util/Set;

    if-nez v1, :cond_0

    sget-object v1, Lcom/roidapp/photogrid/cloud/w;->k:[Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 333
    new-instance v1, Ljava/util/TreeSet;

    invoke-direct {v1}, Ljava/util/TreeSet;-><init>()V

    sput-object v1, Lcom/roidapp/photogrid/cloud/w;->d:Ljava/util/Set;

    .line 334
    sget-object v3, Lcom/roidapp/photogrid/cloud/w;->k:[Ljava/lang/String;

    array-length v4, v3

    move v1, v0

    :goto_0
    if-ge v1, v4, :cond_0

    aget-object v5, v3, v1

    .line 335
    sget-object v6, Lcom/roidapp/photogrid/cloud/w;->d:Ljava/util/Set;

    invoke-interface {v6, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 334
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 338
    :cond_0
    sget-object v1, Lcom/roidapp/photogrid/cloud/w;->d:Ljava/util/Set;

    if-eqz v1, :cond_1

    sget-object v0, Lcom/roidapp/photogrid/cloud/w;->d:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    :cond_1
    monitor-exit v2

    return v0

    .line 332
    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 80
    const/4 v0, 0x0

    .line 81
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/w;->e:Ljava/util/Map;

    if-eqz v1, :cond_0

    .line 82
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/w;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 84
    :cond_0
    if-nez v0, :cond_1

    :goto_0
    return-object p2

    :cond_1
    move-object p2, v0

    goto :goto_0
.end method

.method public final a(ILjava/lang/Exception;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 147
    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/w;->h:Lcom/roidapp/baselib/e/r;

    .line 149
    const/4 v0, 0x0

    sput-boolean v0, Lcom/roidapp/photogrid/cloud/w;->a:Z

    .line 150
    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/w;->j:Landroid/content/SharedPreferences;

    .line 151
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 33
    check-cast p1, Ljava/lang/String;

    .line 4121
    iput-object v4, p0, Lcom/roidapp/photogrid/cloud/w;->h:Lcom/roidapp/baselib/e/r;

    .line 4122
    if-eqz p1, :cond_0

    .line 4127
    const/4 v0, 0x0

    :try_start_0
    invoke-static {v0, p1}, Lcom/roidapp/photogrid/cloud/w;->a(Ljava/util/Map;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4128
    const/4 v0, 0x1

    .line 4134
    :goto_0
    if-eqz v0, :cond_0

    .line 4136
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/cloud/w;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4137
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/w;->j:Landroid/content/SharedPreferences;

    if-eqz v0, :cond_0

    .line 4138
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/w;->j:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "stringTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 4142
    :cond_0
    iput-object v4, p0, Lcom/roidapp/photogrid/cloud/w;->j:Landroid/content/SharedPreferences;

    .line 33
    return-void

    .line 4131
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    .line 4132
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/w;->e:Ljava/util/Map;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/w;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()Z
    .locals 8

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 93
    sget-boolean v2, Lcom/roidapp/photogrid/cloud/w;->a:Z

    if-eqz v2, :cond_1

    .line 116
    :cond_0
    :goto_0
    return v0

    .line 97
    :cond_1
    invoke-static {}, Lcom/roidapp/baselib/c/n;->i()I

    move-result v2

    rem-int/lit8 v2, v2, 0x3

    if-ne v2, v1, :cond_0

    .line 102
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/w;->j:Landroid/content/SharedPreferences;

    if-eqz v2, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/w;->j:Landroid/content/SharedPreferences;

    const-string v5, "stringTime"

    const-wide/16 v6, 0x0

    invoke-interface {v4, v5, v6, v7}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    sub-long/2addr v2, v4

    const-wide/32 v4, 0xf731400

    cmp-long v2, v2, v4

    if-ltz v2, :cond_0

    .line 106
    sput-boolean v1, Lcom/roidapp/photogrid/cloud/w;->a:Z

    .line 107
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/w;->h:Lcom/roidapp/baselib/e/r;

    if-eqz v0, :cond_2

    .line 108
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/w;->h:Lcom/roidapp/baselib/e/r;

    invoke-virtual {v0}, Lcom/roidapp/baselib/e/r;->f()V

    .line 109
    :cond_2
    new-instance v0, Lcom/roidapp/baselib/e/r;

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/w;->f:Ljava/lang/String;

    .line 3243
    const-string v3, "http://dl.pg.ksmobile.com/values2/"

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 109
    invoke-direct {v0, v2, p0}, Lcom/roidapp/baselib/e/r;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/s;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/w;->h:Lcom/roidapp/baselib/e/r;

    .line 111
    :try_start_0
    invoke-static {}, Lcom/roidapp/baselib/c/t;->a()Ljava/util/concurrent/AbstractExecutorService;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/w;->h:Lcom/roidapp/baselib/e/r;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/AbstractExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    move v0, v1

    .line 116
    goto :goto_0

    .line 114
    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/Thread;

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/w;->h:Lcom/roidapp/baselib/e/r;

    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_1
.end method
