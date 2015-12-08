.class public Lcom/kik/cards/web/kik/KikPlugin;
.super Lcom/kik/cards/web/plugin/d;
.source "SourceFile"


# static fields
.field private static final a:Lorg/c/b;


# instance fields
.field private final b:Lcom/kik/cards/web/av;

.field private d:Lcom/kik/cards/web/kik/h;

.field private volatile e:Z

.field private f:Lcom/kik/cards/web/kik/KikMessageParcelable;

.field private g:Lcom/kik/cards/web/browser/BrowserPlugin$a;

.field private h:Lcom/kik/cards/web/picker/PickerPlugin;

.field private final i:Lcom/kik/android/c/f;

.field private final j:Z

.field private final k:Lkik/a/e/r;

.field private final l:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 39
    const-string v0, "CardsWebKik"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lcom/kik/cards/web/kik/KikPlugin;->a:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Lcom/kik/cards/web/av;Lcom/kik/cards/web/kik/b;Lcom/kik/cards/web/browser/BrowserPlugin$a;Lcom/kik/cards/web/picker/PickerPlugin;Lcom/kik/android/c/f;Ljava/lang/String;Lkik/a/e/r;)V
    .locals 1

    .prologue
    .line 57
    const-string v0, "Kik"

    invoke-direct {p0, v0}, Lcom/kik/cards/web/plugin/d;-><init>(Ljava/lang/String;)V

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/cards/web/kik/KikPlugin;->d:Lcom/kik/cards/web/kik/h;

    .line 42
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/cards/web/kik/KikPlugin;->e:Z

    .line 59
    invoke-interface {p2, p7}, Lcom/kik/cards/web/kik/b;->a(Lkik/a/e/r;)Lcom/kik/cards/web/kik/h;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/cards/web/kik/KikPlugin;->d:Lcom/kik/cards/web/kik/h;

    .line 60
    iput-object p3, p0, Lcom/kik/cards/web/kik/KikPlugin;->g:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    .line 61
    iput-object p4, p0, Lcom/kik/cards/web/kik/KikPlugin;->h:Lcom/kik/cards/web/picker/PickerPlugin;

    .line 62
    iput-object p5, p0, Lcom/kik/cards/web/kik/KikPlugin;->i:Lcom/kik/android/c/f;

    .line 63
    iput-object p6, p0, Lcom/kik/cards/web/kik/KikPlugin;->l:Ljava/lang/String;

    .line 64
    invoke-static {}, Lkik/android/util/DeviceUtils;->c()Z

    move-result v0

    iput-boolean v0, p0, Lcom/kik/cards/web/kik/KikPlugin;->j:Z

    .line 65
    iput-object p1, p0, Lcom/kik/cards/web/kik/KikPlugin;->b:Lcom/kik/cards/web/av;

    .line 66
    iput-object p7, p0, Lcom/kik/cards/web/kik/KikPlugin;->k:Lkik/a/e/r;

    .line 67
    return-void
.end method

.method static synthetic a(Lcom/kik/cards/web/kik/KikPlugin;)Lcom/kik/cards/web/kik/h;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/kik/cards/web/kik/KikPlugin;->d:Lcom/kik/cards/web/kik/h;

    return-object v0
.end method

.method private a(Lorg/json/JSONObject;Lcom/kik/cards/web/plugin/a;Ljava/lang/String;)Lcom/kik/cards/web/plugin/j;
    .locals 28

    .prologue
    .line 207
    new-instance v4, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v4}, Lcom/kik/cards/web/plugin/j;-><init>()V

    .line 208
    if-eqz p2, :cond_d

    .line 211
    new-instance v4, Lcom/kik/cards/web/plugin/j;

    const/16 v5, 0xca

    invoke-direct {v4, v5}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    move-object/from16 v24, v4

    .line 213
    :goto_0
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/cards/web/kik/KikPlugin;->g:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v4}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->e()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 214
    new-instance v24, Lcom/kik/cards/web/plugin/j;

    const/16 v4, 0x195

    move-object/from16 v0, v24

    invoke-direct {v0, v4}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 356
    :goto_1
    return-object v24

    .line 217
    :cond_0
    move-object/from16 v0, p0

    iget-boolean v4, v0, Lcom/kik/cards/web/kik/KikPlugin;->e:Z

    if-eqz v4, :cond_1

    .line 218
    sget-object v4, Lcom/kik/cards/web/kik/KikPlugin;->a:Lorg/c/b;

    const-string v5, "Trying to send while another send is pending, ignoring"

    invoke-interface {v4, v5}, Lorg/c/b;->a(Ljava/lang/String;)V

    .line 219
    new-instance v24, Lcom/kik/cards/web/plugin/j;

    const/16 v4, 0x1ad

    move-object/from16 v0, v24

    invoke-direct {v0, v4}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_1

    .line 222
    :cond_1
    const/4 v4, 0x1

    move-object/from16 v0, p0

    iput-boolean v4, v0, Lcom/kik/cards/web/kik/KikPlugin;->e:Z

    .line 224
    const-string v4, "title"

    const-string v5, ""

    move-object/from16 v0, p1

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 225
    const-string v4, "text"

    const-string v6, ""

    move-object/from16 v0, p1

    invoke-virtual {v0, v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 226
    const-string v4, "image"

    const-string v7, ""

    move-object/from16 v0, p1

    invoke-virtual {v0, v4, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 227
    const-string v4, "pngImage"

    const-string v8, ""

    move-object/from16 v0, p1

    invoke-virtual {v0, v4, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 228
    const-string v4, "targetUser"

    const/4 v8, 0x0

    move-object/from16 v0, p1

    invoke-virtual {v0, v4, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 229
    const-string v4, "layout"

    move-object/from16 v0, p1

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 230
    const-string v4, "attribution"

    move-object/from16 v0, p1

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    .line 231
    const/4 v9, 0x0

    .line 232
    const-string v4, "returnToSender"

    const/4 v8, 0x0

    move-object/from16 v0, p1

    invoke-virtual {v0, v4, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v8

    .line 233
    const-string v4, "forwardable"

    const/4 v12, 0x1

    move-object/from16 v0, p1

    invoke-virtual {v0, v4, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v4

    .line 234
    const-string v12, "fallbackUrl"

    const/4 v13, 0x0

    move-object/from16 v0, p1

    invoke-virtual {v0, v12, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 235
    const-string v12, "videoUrl"

    move-object/from16 v0, p1

    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    .line 236
    const-string v12, "videoShouldAutoplay"

    move-object/from16 v0, p1

    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v20

    .line 237
    const-string v12, "videoShouldBeMuted"

    move-object/from16 v0, p1

    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v21

    .line 238
    const-string v12, "videoShouldLoop"

    move-object/from16 v0, p1

    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v22

    .line 239
    const-string v12, "disallowSave"

    move-object/from16 v0, p1

    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v23

    .line 241
    const-wide/16 v26, 0x0

    .line 243
    if-eqz v17, :cond_2

    .line 244
    invoke-static/range {p3 .. p3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v12

    .line 245
    invoke-virtual {v12}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x3

    new-array v13, v13, [Ljava/lang/String;

    const/4 v14, 0x0

    const-string v15, "crusher.herokuapp.com"

    aput-object v15, v13, v14

    const/4 v14, 0x1

    const-string v15, "stickers.kik.com"

    aput-object v15, v13, v14

    const/4 v14, 0x2

    const-string v15, "cards-sticker-dev.herokuapp.com"

    aput-object v15, v13, v14

    invoke-static {v12, v13}, Lcom/kik/cards/web/bf;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_2

    .line 246
    const/16 v17, 0x0

    .line 250
    :cond_2
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v12

    if-nez v12, :cond_3

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v12

    if-nez v12, :cond_3

    .line 251
    const/4 v4, 0x0

    move-object/from16 v0, p0

    iput-boolean v4, v0, Lcom/kik/cards/web/kik/KikPlugin;->e:Z

    .line 252
    new-instance v24, Lcom/kik/cards/web/plugin/j;

    const/16 v4, 0x190

    move-object/from16 v0, v24

    invoke-direct {v0, v4}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto/16 :goto_1

    .line 255
    :cond_3
    if-eqz v17, :cond_c

    .line 256
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v12

    if-eqz v12, :cond_c

    .line 257
    const/4 v4, 0x0

    move v13, v4

    .line 261
    :goto_2
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_4

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_4

    .line 262
    const/4 v4, 0x0

    move-object/from16 v0, p0

    iput-boolean v4, v0, Lcom/kik/cards/web/kik/KikPlugin;->e:Z

    .line 263
    new-instance v24, Lcom/kik/cards/web/plugin/j;

    const/16 v4, 0x190

    move-object/from16 v0, v24

    invoke-direct {v0, v4}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto/16 :goto_1

    .line 266
    :cond_4
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/cards/web/kik/KikPlugin;->h:Lcom/kik/cards/web/picker/PickerPlugin;

    invoke-virtual {v4}, Lcom/kik/cards/web/picker/PickerPlugin;->c()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_5

    .line 267
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/cards/web/kik/KikPlugin;->h:Lcom/kik/cards/web/picker/PickerPlugin;

    invoke-virtual {v4}, Lcom/kik/cards/web/picker/PickerPlugin;->c()Ljava/lang/String;

    move-result-object v4

    const-string v12, "conversations"

    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    .line 268
    if-eqz v4, :cond_5

    .line 269
    const/4 v4, 0x0

    move-object/from16 v0, p0

    iput-boolean v4, v0, Lcom/kik/cards/web/kik/KikPlugin;->e:Z

    .line 271
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/cards/web/kik/KikPlugin;->g:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    move-object/from16 v0, p1

    invoke-interface {v4, v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->a(Lorg/json/JSONObject;)V

    goto/16 :goto_1

    .line 276
    :cond_5
    if-eqz v8, :cond_6

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/cards/web/kik/KikPlugin;->f:Lcom/kik/cards/web/kik/KikMessageParcelable;

    if-eqz v4, :cond_6

    .line 277
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/cards/web/kik/KikPlugin;->f:Lcom/kik/cards/web/kik/KikMessageParcelable;

    iget-object v9, v4, Lcom/kik/cards/web/kik/KikMessageParcelable;->f:Ljava/lang/String;

    .line 280
    :cond_6
    if-eqz v9, :cond_7

    if-eqz v10, :cond_7

    .line 281
    new-instance v24, Lcom/kik/cards/web/plugin/j;

    const/16 v4, 0x190

    move-object/from16 v0, v24

    invoke-direct {v0, v4}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto/16 :goto_1

    .line 284
    :cond_7
    new-instance v4, Lcom/kik/cards/web/kik/KikMessageParcelable;

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-static {v13}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v15

    invoke-static/range {v20 .. v20}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v21 .. v21}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v21

    invoke-static/range {v22 .. v22}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v23 .. v23}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v23

    move-object/from16 v13, p3

    invoke-direct/range {v4 .. v23}, Lcom/kik/cards/web/kik/KikMessageParcelable;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    const-string v5, "extras"

    move-object/from16 v0, p1

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v8

    .line 291
    if-eqz v8, :cond_8

    .line 292
    invoke-virtual {v8}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v9

    move-wide/from16 v6, v26

    .line 294
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    .line 295
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 296
    invoke-virtual {v8, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 298
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v11

    int-to-long v12, v11

    add-long/2addr v6, v12

    .line 299
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v11

    int-to-long v12, v11

    add-long/2addr v6, v12

    .line 301
    const-wide/16 v12, 0x2800

    cmp-long v11, v6, v12

    if-gtz v11, :cond_9

    .line 302
    iget-object v11, v4, Lcom/kik/cards/web/kik/KikMessageParcelable;->t:Ljava/util/HashMap;

    invoke-virtual {v11, v5, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_8
    move-wide/from16 v6, v26

    .line 309
    :cond_9
    const-wide/16 v8, 0x2800

    cmp-long v5, v6, v8

    if-lez v5, :cond_a

    .line 310
    const/4 v4, 0x0

    move-object/from16 v0, p0

    iput-boolean v4, v0, Lcom/kik/cards/web/kik/KikPlugin;->e:Z

    .line 311
    new-instance v24, Lcom/kik/cards/web/plugin/j;

    const/16 v4, 0x190

    move-object/from16 v0, v24

    invoke-direct {v0, v4}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto/16 :goto_1

    .line 314
    :cond_a
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/kik/cards/web/kik/KikPlugin;->d:Lcom/kik/cards/web/kik/h;

    if-nez v5, :cond_b

    .line 315
    const/4 v4, 0x0

    move-object/from16 v0, p0

    iput-boolean v4, v0, Lcom/kik/cards/web/kik/KikPlugin;->e:Z

    .line 316
    sget-object v4, Lcom/kik/cards/web/kik/KikPlugin;->a:Lorg/c/b;

    const-string v5, "No sender set. Dropping!"

    invoke-interface {v4, v5}, Lorg/c/b;->b(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 319
    :cond_b
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/kik/cards/web/kik/KikPlugin;->b:Lcom/kik/cards/web/av;

    invoke-interface {v5}, Lcom/kik/cards/web/av;->a()Lcom/kik/g/p;

    move-result-object v5

    new-instance v6, Lcom/kik/cards/web/kik/f;

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p2

    invoke-direct {v6, v0, v4, v1, v2}, Lcom/kik/cards/web/kik/f;-><init>(Lcom/kik/cards/web/kik/KikPlugin;Lcom/kik/cards/web/kik/KikMessageParcelable;Ljava/lang/String;Lcom/kik/cards/web/plugin/a;)V

    invoke-virtual {v5, v6}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto/16 :goto_1

    :cond_c
    move v13, v4

    goto/16 :goto_2

    :cond_d
    move-object/from16 v24, v4

    goto/16 :goto_0
.end method

.method private static b(Lcom/kik/cards/web/kik/KikMessageParcelable;)Lorg/json/JSONObject;
    .locals 6

    .prologue
    .line 376
    const/4 v1, 0x0

    .line 379
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 380
    :try_start_1
    const-string v0, "title"

    iget-object v1, p0, Lcom/kik/cards/web/kik/KikMessageParcelable;->a:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 381
    const-string v0, "text"

    iget-object v1, p0, Lcom/kik/cards/web/kik/KikMessageParcelable;->b:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 382
    const-string v0, "image"

    iget-object v1, p0, Lcom/kik/cards/web/kik/KikMessageParcelable;->c:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 383
    const-string v0, "pngImage"

    iget-object v1, p0, Lcom/kik/cards/web/kik/KikMessageParcelable;->d:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 385
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 386
    iget-object v0, p0, Lcom/kik/cards/web/kik/KikMessageParcelable;->t:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 387
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 394
    :catch_0
    move-exception v0

    move-object v1, v0

    move-object v0, v2

    :goto_1
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    .line 398
    :goto_2
    return-object v0

    .line 389
    :cond_0
    :try_start_2
    const-string v0, "extras"

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    move-object v0, v2

    .line 396
    goto :goto_2

    .line 394
    :catch_1
    move-exception v0

    move-object v5, v0

    move-object v0, v1

    move-object v1, v5

    goto :goto_1
.end method

.method static synthetic b(Lcom/kik/cards/web/kik/KikPlugin;)Z
    .locals 1

    .prologue
    .line 36
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/cards/web/kik/KikPlugin;->e:Z

    return v0
.end method


# virtual methods
.method public final a(Lcom/kik/cards/web/kik/KikMessageParcelable;)V
    .locals 4

    .prologue
    .line 403
    if-eqz p1, :cond_0

    .line 404
    iput-object p1, p0, Lcom/kik/cards/web/kik/KikPlugin;->f:Lcom/kik/cards/web/kik/KikMessageParcelable;

    .line 406
    invoke-virtual {p0}, Lcom/kik/cards/web/kik/KikPlugin;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 407
    :try_start_0
    new-instance v0, Lcom/kik/cards/web/plugin/f;

    const-string v1, "message"

    invoke-static {p1}, Lcom/kik/cards/web/kik/KikPlugin;->b(Lcom/kik/cards/web/kik/KikMessageParcelable;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/kik/cards/web/plugin/f;-><init>(Ljava/lang/String;Lorg/json/JSONObject;)V

    invoke-virtual {p0, v0}, Lcom/kik/cards/web/kik/KikPlugin;->a(Lcom/kik/cards/web/plugin/f;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 410
    :cond_0
    :goto_0
    return-void

    .line 407
    :catch_0
    move-exception v0

    sget-object v1, Lcom/kik/cards/web/kik/KikPlugin;->a:Lorg/c/b;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error firing new message event: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lorg/c/b;->b(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public getLastMessage(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 3
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 362
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 363
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 365
    iget-object v2, p0, Lcom/kik/cards/web/kik/KikPlugin;->f:Lcom/kik/cards/web/kik/KikMessageParcelable;

    if-eqz v2, :cond_0

    .line 366
    iget-object v0, p0, Lcom/kik/cards/web/kik/KikPlugin;->f:Lcom/kik/cards/web/kik/KikMessageParcelable;

    invoke-static {v0}, Lcom/kik/cards/web/kik/KikPlugin;->b(Lcom/kik/cards/web/kik/KikMessageParcelable;)Lorg/json/JSONObject;

    move-result-object v0

    .line 369
    :cond_0
    const-string v2, "message"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 371
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(Lorg/json/JSONObject;)V

    return-object v0
.end method

.method public openConversation(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 2
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 85
    iget-object v0, p0, Lcom/kik/cards/web/kik/KikPlugin;->g:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 86
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 99
    :goto_0
    return-object v0

    .line 89
    :cond_0
    const-string v0, "returnToSender"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    .line 91
    const/4 v0, 0x0

    .line 93
    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/kik/cards/web/kik/KikPlugin;->f:Lcom/kik/cards/web/kik/KikMessageParcelable;

    if-eqz v1, :cond_1

    .line 94
    iget-object v0, p0, Lcom/kik/cards/web/kik/KikPlugin;->f:Lcom/kik/cards/web/kik/KikMessageParcelable;

    iget-object v0, v0, Lcom/kik/cards/web/kik/KikMessageParcelable;->f:Ljava/lang/String;

    .line 97
    :cond_1
    iget-object v1, p0, Lcom/kik/cards/web/kik/KikPlugin;->d:Lcom/kik/cards/web/kik/h;

    invoke-interface {v1, v0}, Lcom/kik/cards/web/kik/h;->a(Ljava/lang/String;)V

    .line 99
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0}, Lcom/kik/cards/web/plugin/j;-><init>()V

    goto :goto_0
.end method

.method public openConversationWithUser(Lcom/kik/cards/web/plugin/a;Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 3
    .annotation runtime Lcom/kik/cards/web/plugin/c;
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 105
    iget-object v0, p0, Lcom/kik/cards/web/kik/KikPlugin;->g:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 106
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 128
    :goto_0
    return-object v0

    .line 109
    :cond_0
    const-string v0, "username"

    invoke-virtual {p2, v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 110
    const-string v1, "campaignId"

    invoke-virtual {p2, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 112
    iget-object v2, p0, Lcom/kik/cards/web/kik/KikPlugin;->k:Lkik/a/e/r;

    invoke-interface {v2, v0}, Lkik/a/e/r;->d(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    .line 113
    new-instance v2, Lcom/kik/cards/web/kik/d;

    invoke-direct {v2, p0, v1, p1}, Lcom/kik/cards/web/kik/d;-><init>(Lcom/kik/cards/web/kik/KikPlugin;Ljava/lang/String;Lcom/kik/cards/web/plugin/a;)V

    invoke-virtual {v0, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 128
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0xca

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0
.end method

.method public sendKik(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/kik/cards/web/plugin/j;
    .locals 1
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 193
    const-string v0, "targetUser"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 194
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lcom/kik/cards/web/kik/KikPlugin;->a(Lorg/json/JSONObject;Lcom/kik/cards/web/plugin/a;Ljava/lang/String;)Lcom/kik/cards/web/plugin/j;

    move-result-object v0

    return-object v0
.end method

.method public sendKikToUser(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/kik/cards/web/plugin/j;
    .locals 1
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 134
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lcom/kik/cards/web/kik/KikPlugin;->a(Lorg/json/JSONObject;Lcom/kik/cards/web/plugin/a;Ljava/lang/String;)Lcom/kik/cards/web/plugin/j;

    move-result-object v0

    return-object v0
.end method

.method public sendKikWithCallback(Lcom/kik/cards/web/plugin/a;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/kik/cards/web/plugin/j;
    .locals 1
    .annotation runtime Lcom/kik/cards/web/plugin/c;
    .end annotation

    .prologue
    .line 201
    const-string v0, "targetUser"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 202
    invoke-direct {p0, p2, p1, p3}, Lcom/kik/cards/web/kik/KikPlugin;->a(Lorg/json/JSONObject;Lcom/kik/cards/web/plugin/a;Ljava/lang/String;)Lcom/kik/cards/web/plugin/j;

    move-result-object v0

    return-object v0
.end method

.method public sendSmiley(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/kik/cards/web/plugin/j;
    .locals 1
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 141
    const-string v0, "targetUser"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 143
    invoke-virtual {p0, p1, p2}, Lcom/kik/cards/web/kik/KikPlugin;->sendSmileyToUser(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/kik/cards/web/plugin/j;

    move-result-object v0

    return-object v0
.end method

.method public sendSmileyToUser(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/kik/cards/web/plugin/j;
    .locals 7
    .annotation runtime Lcom/kik/cards/web/plugin/c;
    .end annotation

    .prologue
    const/4 v1, 0x0

    const/16 v6, 0xca

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 149
    iget-object v0, p0, Lcom/kik/cards/web/kik/KikPlugin;->g:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 150
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 186
    :goto_0
    return-object v0

    .line 152
    :cond_0
    iget-boolean v0, p0, Lcom/kik/cards/web/kik/KikPlugin;->e:Z

    if-eqz v0, :cond_1

    .line 153
    sget-object v0, Lcom/kik/cards/web/kik/KikPlugin;->a:Lorg/c/b;

    const-string v1, "Trying to send while another send is pending, ignoring"

    invoke-interface {v0, v1}, Lorg/c/b;->a(Ljava/lang/String;)V

    .line 154
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x1ad

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0

    .line 157
    :cond_1
    if-nez p2, :cond_3

    move-object v0, v1

    .line 159
    :goto_1
    iget-boolean v2, p0, Lcom/kik/cards/web/kik/KikPlugin;->j:Z

    if-nez v2, :cond_4

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    new-array v2, v5, [Ljava/lang/String;

    const-string v3, "my.kik.com"

    aput-object v3, v2, v4

    invoke-static {v0, v2}, Lcom/kik/cards/web/bf;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 160
    :cond_2
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x191

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0

    .line 157
    :cond_3
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    goto :goto_1

    .line 163
    :cond_4
    iput-boolean v5, p0, Lcom/kik/cards/web/kik/KikPlugin;->e:Z

    .line 164
    invoke-static {p1}, Lcom/kik/android/c/f;->c(Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v0

    .line 165
    iget-object v2, p0, Lcom/kik/cards/web/kik/KikPlugin;->h:Lcom/kik/cards/web/picker/PickerPlugin;

    invoke-virtual {v2}, Lcom/kik/cards/web/picker/PickerPlugin;->c()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 166
    iget-object v2, p0, Lcom/kik/cards/web/kik/KikPlugin;->h:Lcom/kik/cards/web/picker/PickerPlugin;

    invoke-virtual {v2}, Lcom/kik/cards/web/picker/PickerPlugin;->c()Ljava/lang/String;

    move-result-object v2

    const-string v3, "conversations"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    .line 167
    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/kik/cards/web/kik/KikPlugin;->l:Ljava/lang/String;

    if-eqz v2, :cond_5

    .line 170
    iput-boolean v4, p0, Lcom/kik/cards/web/kik/KikPlugin;->e:Z

    .line 171
    iget-object v1, p0, Lcom/kik/cards/web/kik/KikPlugin;->d:Lcom/kik/cards/web/kik/h;

    iget-object v2, p0, Lcom/kik/cards/web/kik/KikPlugin;->l:Ljava/lang/String;

    invoke-interface {v1, v0, v2}, Lcom/kik/cards/web/kik/h;->b(Ljava/util/List;Ljava/lang/String;)V

    .line 172
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0, v6}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0

    .line 175
    :cond_5
    const-string v2, "targetUser"

    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 177
    iget-object v2, p0, Lcom/kik/cards/web/kik/KikPlugin;->d:Lcom/kik/cards/web/kik/h;

    invoke-interface {v2, v0, v1}, Lcom/kik/cards/web/kik/h;->a(Ljava/util/List;Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lcom/kik/cards/web/kik/e;

    invoke-direct {v1, p0}, Lcom/kik/cards/web/kik/e;-><init>(Lcom/kik/cards/web/kik/KikPlugin;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 186
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0, v6}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto/16 :goto_0
.end method
