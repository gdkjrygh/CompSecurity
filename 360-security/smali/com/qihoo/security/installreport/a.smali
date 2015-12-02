.class public Lcom/qihoo/security/installreport/a;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static final a:Ljava/lang/String;

.field private static final b:Landroid/net/Uri;

.field private static c:Ljava/lang/String;

.field private static d:Z

.field private static e:Z

.field private static f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/content/ContentProviderOperation;",
            ">;"
        }
    .end annotation
.end field

.field private static g:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 40
    const-class v0, Lcom/qihoo/security/installreport/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/installreport/a;->a:Ljava/lang/String;

    .line 41
    sget-object v0, Lcom/qihoo/security/installreport/b;->a:Landroid/net/Uri;

    const-string/jumbo v1, "log"

    invoke-static {v0, v1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/installreport/a;->b:Landroid/net/Uri;

    .line 44
    sput-object v3, Lcom/qihoo/security/installreport/a;->c:Ljava/lang/String;

    .line 46
    sput-boolean v2, Lcom/qihoo/security/installreport/a;->d:Z

    .line 47
    sput-boolean v2, Lcom/qihoo/security/installreport/a;->e:Z

    .line 523
    sput-object v3, Lcom/qihoo/security/installreport/a;->f:Ljava/util/ArrayList;

    .line 524
    const/16 v0, 0xb4

    sput v0, Lcom/qihoo/security/installreport/a;->g:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Landroid/database/Cursor;)Lcom/qihoo/security/installreport/d;
    .locals 15

    .prologue
    .line 201
    const-string/jumbo v0, "_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    .line 202
    const-string/jumbo v0, "mid"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v7

    .line 203
    const-string/jumbo v0, "pid"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v8

    .line 204
    const-string/jumbo v0, "pn"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 205
    const-string/jumbo v0, "adid"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 206
    const-string/jumbo v0, "c1"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    .line 207
    const-string/jumbo v0, "c2"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 208
    const-string/jumbo v0, "c3"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v14

    .line 209
    const-string/jumbo v0, "p1"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 210
    const-string/jumbo v0, "p2"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 211
    const-string/jumbo v0, "rn"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    .line 212
    const-string/jumbo v0, "tp"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    .line 213
    const-string/jumbo v0, "ts"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    .line 214
    new-instance v0, Lcom/qihoo/security/installreport/d;

    invoke-direct/range {v0 .. v14}, Lcom/qihoo/security/installreport/d;-><init>(IILjava/lang/String;JIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    return-object v0
.end method

.method public static a()V
    .locals 8

    .prologue
    .line 269
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "last_install_report_time"

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v0

    .line 271
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 280
    sub-long v4, v2, v0

    const-wide/32 v6, 0x6ddd00

    cmp-long v4, v4, v6

    if-gez v4, :cond_0

    cmp-long v0, v2, v0

    if-gez v0, :cond_1

    .line 284
    :cond_0
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->Install:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    invoke-static {v0}, Lcom/qihoo/security/installreport/a;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;)V

    .line 285
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->LaunchApp:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    invoke-static {v0}, Lcom/qihoo/security/installreport/a;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;)V

    .line 294
    :cond_1
    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 4

    .prologue
    .line 221
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lcom/qihoo/security/installreport/a;->b:Landroid/net/Uri;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 231
    :goto_0
    return-void

    .line 222
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private static a(Landroid/content/Context;Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;)V
    .locals 6

    .prologue
    .line 297
    const-wide/16 v2, 0x0

    .line 298
    const/4 v0, 0x0

    .line 299
    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->Install:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    if-ne p1, v1, :cond_1

    .line 300
    const-wide/32 v2, 0x5265c00

    .line 301
    const/4 v0, 0x1

    .line 306
    :cond_0
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long v2, v4, v2

    .line 307
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "ts<"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, " and "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, "tp"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 311
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    sget-object v2, Lcom/qihoo/security/installreport/a;->b:Landroid/net/Uri;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 320
    :goto_1
    return-void

    .line 302
    :cond_1
    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->LaunchApp:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    if-ne p1, v1, :cond_0

    .line 303
    const-wide v2, 0x9a7ec800L

    .line 304
    const/4 v0, 0x3

    goto :goto_0

    .line 317
    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method public static a(Landroid/content/Context;Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/installreport/d;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 240
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    .line 241
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 242
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/installreport/d;

    .line 243
    sget-object v4, Lcom/qihoo/security/installreport/a;->b:Landroid/net/Uri;

    invoke-static {v4}, Landroid/content/ContentProviderOperation;->newInsert(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v4

    .line 244
    invoke-virtual {v0}, Lcom/qihoo/security/installreport/d;->a()Landroid/content/ContentValues;

    move-result-object v0

    .line 246
    const-string/jumbo v5, "tp"

    const/4 v6, 0x3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v0, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 249
    const-string/jumbo v5, "ts"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v0, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 250
    invoke-virtual {v4, v0}, Landroid/content/ContentProviderOperation$Builder;->withValues(Landroid/content/ContentValues;)Landroid/content/ContentProviderOperation$Builder;

    .line 251
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/content/ContentProviderOperation$Builder;->withYieldAllowed(Z)Landroid/content/ContentProviderOperation$Builder;

    .line 252
    invoke-virtual {v4}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 255
    :catch_0
    move-exception v0

    .line 264
    :goto_1
    return-void

    .line 254
    :cond_0
    const-string/jumbo v0, "com.qihoo.security.lite.installreport"

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentResolver;->applyBatch(Ljava/lang/String;Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1
.end method

.method public static a(Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;)V
    .locals 14

    .prologue
    const/4 v3, 0x1

    const/4 v6, 0x0

    .line 342
    invoke-static {p0}, Lcom/qihoo/security/installreport/a;->b(Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 455
    :cond_0
    :goto_0
    return-void

    .line 349
    :cond_1
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v1

    .line 351
    if-eqz v1, :cond_0

    .line 358
    invoke-static {p0, v3}, Lcom/qihoo/security/installreport/a;->b(Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;Z)V

    .line 359
    invoke-static {v1, p0}, Lcom/qihoo/security/installreport/a;->a(Landroid/content/Context;Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;)V

    .line 360
    invoke-static {v1, p0}, Lcom/qihoo/security/installreport/a;->b(Landroid/content/Context;Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;)Ljava/util/List;

    move-result-object v4

    .line 361
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 362
    invoke-static {p0, v6}, Lcom/qihoo/security/installreport/a;->b(Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;Z)V

    goto :goto_0

    .line 366
    :cond_2
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 367
    invoke-static {v1}, Lcom/qihoo/security/b/a;->a(Landroid/content/Context;)Z

    move-result v5

    .line 372
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_3
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/installreport/d;

    .line 373
    if-eqz v0, :cond_3

    .line 376
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 378
    :try_start_0
    const-string/jumbo v9, "type"

    invoke-virtual {p0}, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->getType()I

    move-result v10

    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 379
    const-string/jumbo v9, "mid"

    iget v10, v0, Lcom/qihoo/security/installreport/d;->f:I

    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 380
    const-string/jumbo v9, "pid"

    iget v10, v0, Lcom/qihoo/security/installreport/d;->g:I

    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 381
    const-string/jumbo v9, "pkg"

    iget-object v10, v0, Lcom/qihoo/security/installreport/d;->c:Ljava/lang/String;

    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 382
    const-string/jumbo v9, "p1"

    iget-object v10, v0, Lcom/qihoo/security/installreport/d;->i:Ljava/lang/String;

    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 383
    const-string/jumbo v9, "p2"

    iget-object v10, v0, Lcom/qihoo/security/installreport/d;->j:Ljava/lang/String;

    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 384
    const-string/jumbo v9, "c1"

    iget-object v10, v0, Lcom/qihoo/security/installreport/d;->k:Ljava/lang/String;

    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 385
    const-string/jumbo v9, "c2"

    iget-object v10, v0, Lcom/qihoo/security/installreport/d;->l:Ljava/lang/String;

    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 386
    const-string/jumbo v9, "c3"

    iget-object v10, v0, Lcom/qihoo/security/installreport/d;->m:Ljava/lang/String;

    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 387
    const-string/jumbo v9, "adid"

    iget-object v10, v0, Lcom/qihoo/security/installreport/d;->h:Ljava/lang/String;

    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 388
    sget-object v9, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->Install:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    if-ne p0, v9, :cond_6

    .line 389
    const-string/jumbo v9, "co"

    if-eqz v5, :cond_5

    move v0, v3

    :goto_2
    invoke-virtual {v8, v9, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 396
    :cond_4
    :goto_3
    invoke-virtual {v2, v8}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_1

    :cond_5
    move v0, v6

    .line 389
    goto :goto_2

    .line 390
    :cond_6
    :try_start_1
    sget-object v9, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->LaunchApp:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    if-ne p0, v9, :cond_4

    .line 391
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    iget-wide v12, v0, Lcom/qihoo/security/installreport/d;->d:J

    sub-long/2addr v10, v12

    .line 392
    const-string/jumbo v0, "co"

    const-wide/32 v12, 0x5265c00

    div-long/2addr v10, v12

    invoke-virtual {v8, v0, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    .line 394
    :catch_0
    move-exception v0

    goto :goto_3

    .line 398
    :cond_7
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->c()Ljava/lang/String;

    move-result-object v6

    .line 399
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 400
    sget-object v0, Lcom/qihoo/security/installreport/a;->a:Ljava/lang/String;

    invoke-virtual {v2}, Lorg/json/JSONArray;->hashCode()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/qihoo/security/service/d;->a(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 402
    :cond_8
    invoke-static {}, Lcom/qihoo/security/adv/AdvDataManager;->a()Lcom/qihoo/security/adv/AdvDataManager;

    move-result-object v7

    new-instance v0, Lcom/qihoo/security/installreport/a$1;

    move-object v3, p0

    invoke-direct/range {v0 .. v6}, Lcom/qihoo/security/installreport/a$1;-><init>(Landroid/content/Context;Lorg/json/JSONArray;Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;Ljava/util/List;ZLjava/lang/String;)V

    invoke-virtual {v7, v2, v0}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lorg/json/JSONArray;Lcom/qihoo/security/adv/AdvDataManager$c;)V

    goto/16 :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;Z)V
    .locals 0

    .prologue
    .line 35
    invoke-static {p0, p1}, Lcom/qihoo/security/installreport/a;->b(Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;Z)V

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 100
    :try_start_0
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 101
    const-string/jumbo v1, "pn =? and tp = 3"

    .line 104
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    .line 105
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 106
    const-string/jumbo v4, "tp"

    const/4 v5, 0x4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 108
    sget-object v4, Lcom/qihoo/security/installreport/a;->b:Landroid/net/Uri;

    invoke-virtual {v0, v4, v3, v1, v2}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    .line 109
    if-lez v0, :cond_0

    .line 113
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->LaunchApp:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    invoke-static {v0}, Lcom/qihoo/security/installreport/a;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 125
    :cond_0
    :goto_0
    return-void

    .line 120
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 15

    .prologue
    .line 72
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 74
    new-instance v0, Lcom/qihoo/security/installreport/d;

    const/4 v1, -0x1

    const/4 v2, 0x1

    move-object v3, p0

    move/from16 v6, p1

    move/from16 v7, p2

    move/from16 v8, p3

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    move-object/from16 v11, p6

    move-object/from16 v12, p7

    move-object/from16 v13, p8

    move-object/from16 v14, p9

    invoke-direct/range {v0 .. v14}, Lcom/qihoo/security/installreport/d;-><init>(IILjava/lang/String;JIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    invoke-virtual {v0}, Lcom/qihoo/security/installreport/d;->a()Landroid/content/ContentValues;

    move-result-object v0

    .line 78
    if-eqz v0, :cond_0

    .line 79
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    .line 81
    :try_start_0
    sget-object v2, Lcom/qihoo/security/installreport/a;->b:Landroid/net/Uri;

    invoke-virtual {v1, v2, v0}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    :cond_0
    :goto_0
    return-void

    .line 82
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method static synthetic b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 35
    sget-object v0, Lcom/qihoo/security/installreport/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method private static b(Landroid/content/Context;Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/installreport/d;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    .line 482
    .line 483
    const/4 v0, 0x0

    .line 484
    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->Install:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    if-ne p1, v1, :cond_0

    .line 485
    const/4 v0, 0x2

    move v2, v0

    .line 489
    :goto_0
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 491
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 494
    sget-object v1, Lcom/qihoo/security/installreport/a;->b:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v1

    const-string/jumbo v3, "limit"

    const-string/jumbo v4, "20"

    invoke-virtual {v1, v3, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v1

    .line 496
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "tp = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 498
    const/4 v2, 0x0

    const/4 v4, 0x0

    const-string/jumbo v5, "_id DESC"

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 499
    if-eqz v0, :cond_1

    .line 500
    :goto_1
    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 501
    invoke-static {v0}, Lcom/qihoo/security/installreport/a;->a(Landroid/database/Cursor;)Lcom/qihoo/security/installreport/d;

    move-result-object v1

    .line 502
    invoke-interface {v7, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    .line 505
    :catch_0
    move-exception v1

    .line 514
    :goto_2
    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->closeCursor(Landroid/database/Cursor;)V

    .line 519
    :goto_3
    return-object v7

    .line 486
    :cond_0
    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->LaunchApp:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    if-ne p1, v1, :cond_2

    .line 487
    const/4 v0, 0x4

    move v2, v0

    goto :goto_0

    .line 514
    :cond_1
    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->closeCursor(Landroid/database/Cursor;)V

    goto :goto_3

    .line 509
    :catch_1
    move-exception v0

    .line 514
    :goto_4
    invoke-static {v6}, Lcom/qihoo360/common/utils/Utils;->closeCursor(Landroid/database/Cursor;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    :goto_5
    invoke-static {v6}, Lcom/qihoo360/common/utils/Utils;->closeCursor(Landroid/database/Cursor;)V

    throw v0

    :catchall_1
    move-exception v1

    move-object v6, v0

    move-object v0, v1

    goto :goto_5

    .line 509
    :catch_2
    move-exception v1

    move-object v6, v0

    goto :goto_4

    .line 505
    :catch_3
    move-exception v0

    move-object v0, v6

    goto :goto_2

    :cond_2
    move v2, v0

    goto :goto_0
.end method

.method static synthetic b(Landroid/content/Context;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 35
    invoke-static {p0, p1}, Lcom/qihoo/security/installreport/a;->c(Landroid/content/Context;Ljava/util/List;)V

    return-void
.end method

.method private static b(Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;Z)V
    .locals 1

    .prologue
    .line 332
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->Install:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    if-ne p0, v0, :cond_1

    .line 333
    sput-boolean p1, Lcom/qihoo/security/installreport/a;->d:Z

    .line 337
    :cond_0
    :goto_0
    return-void

    .line 334
    :cond_1
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->LaunchApp:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    if-ne p0, v0, :cond_0

    .line 335
    sput-boolean p1, Lcom/qihoo/security/installreport/a;->e:Z

    goto :goto_0
.end method

.method public static b(Ljava/lang/String;)V
    .locals 12

    .prologue
    const/4 v2, 0x0

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 142
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v8

    .line 143
    invoke-virtual {v8}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 146
    const-string/jumbo v3, "pn =? and tp = 1"

    .line 149
    new-array v4, v7, [Ljava/lang/String;

    aput-object p0, v4, v6

    .line 151
    sget-object v1, Lcom/qihoo/security/installreport/a;->b:Landroid/net/Uri;

    const-string/jumbo v5, "_id DESC"

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3

    .line 154
    if-eqz v3, :cond_5

    .line 155
    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    move-result v1

    if-lez v1, :cond_4

    move v1, v6

    .line 158
    :goto_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 159
    const-string/jumbo v4, "ts"

    invoke-interface {v3, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v3, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    .line 160
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 161
    const-wide/32 v10, 0x5265c00

    add-long/2addr v4, v10

    cmp-long v4, v6, v4

    if-gez v4, :cond_0

    .line 162
    invoke-static {v3}, Lcom/qihoo/security/installreport/a;->a(Landroid/database/Cursor;)Lcom/qihoo/security/installreport/d;

    move-result-object v2

    .line 167
    :cond_0
    invoke-static {v3}, Lcom/qihoo360/common/utils/Utils;->closeCursor(Landroid/database/Cursor;)V

    .line 169
    :goto_1
    if-eqz v1, :cond_2

    .line 197
    :cond_1
    :goto_2
    return-void

    .line 172
    :cond_2
    if-eqz v2, :cond_1

    .line 177
    invoke-virtual {v2}, Lcom/qihoo/security/installreport/d;->a()Landroid/content/ContentValues;

    move-result-object v1

    .line 178
    const-string/jumbo v3, "tp"

    const/4 v4, 0x2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 179
    if-eqz v1, :cond_3

    .line 181
    :try_start_0
    sget-object v3, Lcom/qihoo/security/installreport/a;->b:Landroid/net/Uri;

    invoke-virtual {v0, v3, v1}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 193
    :cond_3
    :goto_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 194
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 195
    invoke-static {v8, v0}, Lcom/qihoo/security/installreport/a;->a(Landroid/content/Context;Ljava/util/List;)V

    .line 196
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->Install:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    invoke-static {v0}, Lcom/qihoo/security/installreport/a;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;)V

    goto :goto_2

    .line 182
    :catch_0
    move-exception v0

    goto :goto_3

    :cond_4
    move v1, v7

    goto :goto_0

    :cond_5
    move v1, v7

    goto :goto_1
.end method

.method private static b(Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;)Z
    .locals 1

    .prologue
    .line 323
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->Install:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    if-ne p0, v0, :cond_0

    .line 324
    sget-boolean v0, Lcom/qihoo/security/installreport/a;->d:Z

    .line 328
    :goto_0
    return v0

    .line 325
    :cond_0
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->LaunchApp:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    if-ne p0, v0, :cond_1

    .line 326
    sget-boolean v0, Lcom/qihoo/security/installreport/a;->e:Z

    goto :goto_0

    .line 328
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static c(Landroid/content/Context;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/installreport/d;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 459
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    .line 460
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 461
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/installreport/d;

    .line 462
    sget-object v4, Lcom/qihoo/security/installreport/a;->b:Landroid/net/Uri;

    invoke-static {v4}, Landroid/content/ContentProviderOperation;->newDelete(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v4

    .line 463
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v6, "_id = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget v0, v0, Lcom/qihoo/security/installreport/d;->a:I

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v5, 0x0

    invoke-virtual {v4, v0, v5}, Landroid/content/ContentProviderOperation$Builder;->withSelection(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;

    .line 464
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/content/ContentProviderOperation$Builder;->withYieldAllowed(Z)Landroid/content/ContentProviderOperation$Builder;

    .line 465
    invoke-virtual {v4}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 473
    :catch_0
    move-exception v0

    .line 479
    :cond_0
    :goto_1
    return-void

    .line 467
    :cond_1
    const-string/jumbo v0, "com.qihoo.security.lite.installreport"

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentResolver;->applyBatch(Ljava/lang/String;Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 468
    if-eqz v0, :cond_0

    goto :goto_1
.end method
