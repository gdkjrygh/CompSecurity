.class public Lcom/facebook/orca/push/sms/MmsReceiver;
.super Landroid/app/IntentService;
.source "MmsReceiver.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:Lcom/facebook/debug/log/l;


# instance fields
.field private c:Lcom/facebook/orca/sms/t;

.field private d:Lcom/facebook/prefs/shared/d;

.field private e:Lcom/facebook/orca/sms/af;

.field private f:Lcom/facebook/orca/sms/y;

.field private g:Lcom/facebook/orca/f/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 45
    const-class v0, Lcom/facebook/orca/push/sms/MmsReceiver;

    sput-object v0, Lcom/facebook/orca/push/sms/MmsReceiver;->a:Ljava/lang/Class;

    .line 47
    new-instance v0, Lcom/facebook/debug/log/l;

    invoke-direct {v0}, Lcom/facebook/debug/log/l;-><init>()V

    sput-object v0, Lcom/facebook/orca/push/sms/MmsReceiver;->b:Lcom/facebook/debug/log/l;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 56
    const-string v0, "MmsReceiver"

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    .line 57
    return-void
.end method

.method private a(Landroid_src/mms/e/f;I)J
    .locals 8

    .prologue
    const/4 v5, 0x0

    const/16 v2, 0x3d

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 255
    const/16 v0, 0x86

    if-ne p2, v0, :cond_0

    .line 256
    new-instance v0, Ljava/lang/String;

    check-cast p1, Landroid_src/mms/e/d;

    invoke-virtual {p1}, Landroid_src/mms/e/d;->b()[B

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    .line 261
    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 262
    const-string v1, "m_id"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 264
    invoke-static {v0}, Landroid/database/DatabaseUtils;->sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    const-string v0, " AND "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    const-string v0, "m_type"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 268
    const/16 v0, 0x80

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 272
    invoke-virtual {p0}, Lcom/facebook/orca/push/sms/MmsReceiver;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    sget-object v2, Landroid_src/c/d;->a:Landroid/net/Uri;

    new-array v3, v7, [Ljava/lang/String;

    const-string v0, "thread_id"

    aput-object v0, v3, v6

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    move-object v0, p0

    move-object v6, v5

    invoke-static/range {v0 .. v6}, Landroid_src/mms/g/o;->a(Landroid/content/Context;Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    .line 275
    if-eqz v2, :cond_2

    .line 277
    :try_start_0
    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-ne v0, v7, :cond_1

    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 278
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    .line 281
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 284
    :goto_1
    return-wide v0

    .line 258
    :cond_0
    new-instance v0, Ljava/lang/String;

    check-cast p1, Landroid_src/mms/e/v;

    invoke-virtual {p1}, Landroid_src/mms/e/v;->b()[B

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    goto :goto_0

    .line 281
    :cond_1
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 284
    :cond_2
    const-wide/16 v0, -0x1

    goto :goto_1

    .line 281
    :catchall_0
    move-exception v0

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    throw v0
.end method

.method private a(Landroid_src/mms/e/f;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 288
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 289
    const-string v1, "\n     Message Type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Landroid_src/mms/e/f;->f()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 290
    const-string v1, "\n      Mms Version: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Landroid_src/mms/e/f;->g()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 291
    const-string v1, "\n             From: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Landroid_src/mms/e/f;->h()Landroid_src/mms/e/e;

    move-result-object v2

    invoke-virtual {v2}, Landroid_src/mms/e/e;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    invoke-virtual {p1}, Landroid_src/mms/e/f;->f()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    .line 303
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 294
    :sswitch_0
    check-cast p1, Landroid_src/mms/e/d;

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/push/sms/MmsReceiver;->a(Landroid_src/mms/e/d;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 297
    :sswitch_1
    check-cast p1, Landroid_src/mms/e/v;

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/push/sms/MmsReceiver;->a(Landroid_src/mms/e/v;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 300
    :sswitch_2
    check-cast p1, Landroid_src/mms/e/h;

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/push/sms/MmsReceiver;->a(Landroid_src/mms/e/h;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 292
    :sswitch_data_0
    .sparse-switch
        0x82 -> :sswitch_2
        0x86 -> :sswitch_0
        0x88 -> :sswitch_1
    .end sparse-switch
.end method

.method private a(Landroid_src/mms/e/d;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 5

    .prologue
    .line 307
    const-string v0, "\n             Date:"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Landroid_src/mms/e/d;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 308
    const-string v0, "\n       Message Id:"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/lang/String;

    invoke-virtual {p1}, Landroid_src/mms/e/d;->b()[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    const-string v0, "\n           Status:"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Landroid_src/mms/e/d;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 310
    invoke-virtual {p1}, Landroid_src/mms/e/d;->d()[Landroid_src/mms/e/e;

    move-result-object v1

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_1

    aget-object v3, v1, v0

    .line 311
    if-eqz v3, :cond_0

    .line 312
    const-string v4, "\n               To:"

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v3}, Landroid_src/mms/e/e;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 315
    :cond_1
    return-object p2
.end method

.method private a(Landroid_src/mms/e/h;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 3

    .prologue
    .line 331
    const-string v0, "\n    Content Class: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Landroid_src/mms/e/h;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 332
    const-string v0, "\n Content Location: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/lang/String;

    invoke-virtual {p1}, Landroid_src/mms/e/h;->b()[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    const-string v0, "\n           Expiry: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Landroid_src/mms/e/h;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 334
    const-string v0, "\n    Message Class: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/lang/String;

    invoke-virtual {p1}, Landroid_src/mms/e/h;->d()[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    const-string v0, "\n     Message Size: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Landroid_src/mms/e/h;->i()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 336
    const-string v0, "\n          Subject: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Landroid_src/mms/e/h;->j()Landroid_src/mms/e/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 337
    const-string v0, "\n   Transaction Id: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/lang/String;

    invoke-virtual {p1}, Landroid_src/mms/e/h;->k()[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    const-string v0, "\n  Delivery Report: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Landroid_src/mms/e/h;->l()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 339
    return-object p2
.end method

.method private a(Landroid_src/mms/e/v;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 5

    .prologue
    .line 319
    const-string v0, "\n             Date: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Landroid_src/mms/e/v;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 320
    const-string v0, "\n       Message Id: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/lang/String;

    invoke-virtual {p1}, Landroid_src/mms/e/v;->b()[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    const-string v0, "\n      Read Status: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Landroid_src/mms/e/v;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 322
    invoke-virtual {p1}, Landroid_src/mms/e/v;->d()[Landroid_src/mms/e/e;

    move-result-object v1

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_1

    aget-object v3, v1, v0

    .line 323
    if-eqz v3, :cond_0

    .line 324
    const-string v4, "\n               To:"

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v3}, Landroid_src/mms/e/e;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 327
    :cond_1
    return-object p2
.end method

.method static a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 78
    invoke-static {p0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/sms/t;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/sms/t;

    .line 80
    iget-object v0, v0, Lcom/facebook/orca/sms/t;->a:Lcom/facebook/common/hardware/o;

    invoke-virtual {v0}, Lcom/facebook/common/hardware/o;->a()V

    .line 82
    const-class v0, Lcom/facebook/orca/push/sms/MmsReceiver;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 83
    invoke-virtual {p0, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 84
    return-void
.end method

.method private a(Landroid/content/Intent;)V
    .locals 11

    .prologue
    const-wide/16 v8, -0x1

    const/4 v4, 0x1

    const/4 v6, 0x0

    .line 121
    const-string v1, "data"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    move-result-object v1

    .line 122
    new-instance v2, Landroid_src/mms/e/r;

    invoke-direct {v2, v1}, Landroid_src/mms/e/r;-><init>([B)V

    .line 123
    invoke-virtual {v2}, Landroid_src/mms/e/r;->a()Landroid_src/mms/e/f;

    move-result-object v3

    .line 125
    if-nez v3, :cond_0

    .line 126
    sget-object v1, Lcom/facebook/orca/push/sms/MmsReceiver;->a:Ljava/lang/Class;

    const-string v2, "Invalid PUSH data"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 208
    :goto_0
    return-void

    .line 131
    :cond_0
    const/4 v1, 0x2

    invoke-static {v1}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 132
    sget-object v1, Lcom/facebook/orca/push/sms/MmsReceiver;->a:Ljava/lang/Class;

    const-string v2, "Received MMS msg: \n%s"

    new-array v4, v4, [Ljava/lang/Object;

    invoke-direct {p0, v3}, Lcom/facebook/orca/push/sms/MmsReceiver;->a(Landroid_src/mms/e/f;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-static {v1, v2, v4}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    :cond_1
    invoke-static {p0}, Landroid_src/mms/e/t;->a(Landroid/content/Context;)Landroid_src/mms/e/t;

    move-result-object v4

    .line 136
    invoke-virtual {p0}, Lcom/facebook/orca/push/sms/MmsReceiver;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    .line 137
    invoke-virtual {v3}, Landroid_src/mms/e/f;->f()I

    move-result v7

    .line 141
    sparse-switch v7, :sswitch_data_0

    .line 199
    :try_start_0
    sget-object v1, Lcom/facebook/orca/push/sms/MmsReceiver;->a:Ljava/lang/Class;

    const-string v2, "Received unrecognized PDU."

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid_src/mms/d; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 206
    :cond_2
    :goto_1
    sget-object v1, Lcom/facebook/orca/push/sms/MmsReceiver;->a:Ljava/lang/Class;

    const-string v2, "PUSH Intent processed."

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 144
    :sswitch_0
    :try_start_1
    invoke-direct {p0, v3, v7}, Lcom/facebook/orca/push/sms/MmsReceiver;->a(Landroid_src/mms/e/f;I)J

    move-result-wide v5

    .line 145
    cmp-long v1, v5, v8

    if-eqz v1, :cond_2

    .line 151
    sget-object v1, Landroid_src/c/f;->a:Landroid/net/Uri;

    invoke-virtual {v4, v3, v1}, Landroid_src/mms/e/t;->a(Landroid_src/mms/e/f;Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v3

    .line 153
    new-instance v4, Landroid/content/ContentValues;

    const/4 v1, 0x1

    invoke-direct {v4, v1}, Landroid/content/ContentValues;-><init>(I)V

    .line 154
    const-string v1, "thread_id"

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v4, v1, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 155
    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Landroid_src/mms/g/o;->a(Landroid/content/Context;Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_1
    .catch Landroid_src/mms/d; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    .line 201
    :catch_0
    move-exception v1

    .line 202
    sget-object v2, Lcom/facebook/orca/push/sms/MmsReceiver;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed to save the data from PUSH: type="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 159
    :sswitch_1
    :try_start_2
    iget-object v1, p0, Lcom/facebook/orca/push/sms/MmsReceiver;->e:Lcom/facebook/orca/sms/af;

    invoke-virtual {v1}, Lcom/facebook/orca/sms/af;->a()V

    .line 160
    move-object v0, v3

    check-cast v0, Landroid_src/mms/e/h;

    move-object v1, v0

    .line 162
    invoke-static {}, Landroid_src/mms/c;->c()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 163
    invoke-virtual {v1}, Landroid_src/mms/e/h;->b()[B

    move-result-object v2

    .line 164
    const/16 v5, 0x3d

    array-length v6, v2

    add-int/lit8 v6, v6, -0x1

    aget-byte v6, v2, v6

    if-ne v5, v6, :cond_3

    .line 165
    invoke-virtual {v1}, Landroid_src/mms/e/h;->k()[B

    move-result-object v5

    .line 166
    array-length v6, v2

    array-length v8, v5

    add-int/2addr v6, v8

    new-array v6, v6, [B

    .line 168
    const/4 v8, 0x0

    const/4 v9, 0x0

    array-length v10, v2

    invoke-static {v2, v8, v6, v9, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 170
    const/4 v8, 0x0

    array-length v2, v2

    array-length v9, v5

    invoke-static {v5, v8, v6, v2, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 172
    invoke-virtual {v1, v6}, Landroid_src/mms/e/h;->a([B)V

    .line 176
    :cond_3
    invoke-direct {p0, v1}, Lcom/facebook/orca/push/sms/MmsReceiver;->a(Landroid_src/mms/e/h;)Z

    move-result v2

    if-nez v2, :cond_5

    .line 179
    iget-object v1, p0, Lcom/facebook/orca/push/sms/MmsReceiver;->f:Lcom/facebook/orca/sms/y;

    invoke-virtual {v1}, Lcom/facebook/orca/sms/y;->b()Ljava/util/Set;

    move-result-object v1

    .line 180
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    .line 181
    invoke-static {v5, v6}, Lcom/facebook/orca/threads/m;->a(J)Ljava/lang/String;

    move-result-object v1

    .line 182
    iget-object v5, p0, Lcom/facebook/orca/push/sms/MmsReceiver;->g:Lcom/facebook/orca/f/o;

    const-wide/16 v8, -0x1

    invoke-virtual {v5, v1, v8, v9}, Lcom/facebook/orca/f/o;->a(Ljava/lang/String;J)V
    :try_end_2
    .catch Landroid_src/mms/d; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    .line 203
    :catch_1
    move-exception v1

    .line 204
    sget-object v2, Lcom/facebook/orca/push/sms/MmsReceiver;->a:Ljava/lang/Class;

    const-string v3, "Unexpected Exception."

    invoke-static {v2, v3, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_1

    .line 185
    :cond_4
    :try_start_3
    sget-object v1, Landroid_src/c/f;->a:Landroid/net/Uri;

    invoke-virtual {v4, v3, v1}, Landroid_src/mms/e/t;->a(Landroid_src/mms/e/f;Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v1

    .line 187
    new-instance v2, Landroid/content/Intent;

    const-class v3, Landroid_src/mms/transaction/TransactionService;

    invoke-direct {v2, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 188
    const-string v3, "uri"

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 189
    const-string v1, "type"

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 191
    invoke-virtual {p0, v2}, Lcom/facebook/orca/push/sms/MmsReceiver;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto/16 :goto_1

    .line 193
    :cond_5
    sget-object v2, Lcom/facebook/orca/push/sms/MmsReceiver;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Skip downloading duplicate message: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    new-instance v4, Ljava/lang/String;

    invoke-virtual {v1}, Landroid_src/mms/e/h;->b()[B

    move-result-object v1

    invoke-direct {v4, v1}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V
    :try_end_3
    .catch Landroid_src/mms/d; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto/16 :goto_1

    .line 141
    nop

    :sswitch_data_0
    .sparse-switch
        0x82 -> :sswitch_1
        0x86 -> :sswitch_0
        0x88 -> :sswitch_0
    .end sparse-switch
.end method

.method private a(Landroid_src/mms/e/h;)Z
    .locals 9

    .prologue
    const/4 v7, 0x1

    const/4 v8, 0x0

    .line 220
    invoke-virtual {p1}, Landroid_src/mms/e/h;->b()[B

    move-result-object v0

    .line 221
    if-eqz v0, :cond_1

    .line 222
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    .line 223
    const-string v4, "ct_l = ?"

    .line 224
    new-array v5, v7, [Ljava/lang/String;

    aput-object v1, v5, v8

    .line 225
    invoke-virtual {p0}, Lcom/facebook/orca/push/sms/MmsReceiver;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    sget-object v2, Landroid_src/c/d;->a:Landroid/net/Uri;

    new-array v3, v7, [Ljava/lang/String;

    const-string v0, "_id"

    aput-object v0, v3, v8

    const/4 v6, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Landroid_src/mms/g/o;->a(Landroid/content/Context;Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 229
    if-eqz v0, :cond_1

    .line 231
    :try_start_0
    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    if-lez v1, :cond_0

    .line 236
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    move v0, v7

    .line 240
    :goto_0
    return v0

    .line 236
    :cond_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_1
    move v0, v8

    .line 240
    goto :goto_0

    .line 236
    :catchall_0
    move-exception v1

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    throw v1
.end method

.method private b(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .prologue
    .line 103
    sget-object v0, Lcom/facebook/orca/push/sms/MmsReceiver;->a:Ljava/lang/Class;

    const-string v1, "Received onMessage"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 105
    invoke-direct {p0, p2}, Lcom/facebook/orca/push/sms/MmsReceiver;->a(Landroid/content/Intent;)V

    .line 107
    iget-object v0, p0, Lcom/facebook/orca/push/sms/MmsReceiver;->d:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 108
    sget-object v1, Lcom/facebook/orca/prefs/n;->d:Lcom/facebook/prefs/shared/ae;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    .line 109
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 110
    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 2

    .prologue
    .line 61
    invoke-super {p0}, Landroid/app/IntentService;->onCreate()V

    .line 63
    invoke-static {p0}, Lcom/facebook/base/a/g;->a(Landroid/content/Context;)V

    .line 64
    invoke-static {p0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 65
    const-class v0, Lcom/facebook/orca/sms/t;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/sms/t;

    iput-object v0, p0, Lcom/facebook/orca/push/sms/MmsReceiver;->c:Lcom/facebook/orca/sms/t;

    .line 66
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/orca/push/sms/MmsReceiver;->d:Lcom/facebook/prefs/shared/d;

    .line 67
    const-class v0, Lcom/facebook/orca/sms/af;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/sms/af;

    iput-object v0, p0, Lcom/facebook/orca/push/sms/MmsReceiver;->e:Lcom/facebook/orca/sms/af;

    .line 68
    const-class v0, Lcom/facebook/orca/sms/y;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/sms/y;

    iput-object v0, p0, Lcom/facebook/orca/push/sms/MmsReceiver;->f:Lcom/facebook/orca/sms/y;

    .line 69
    const-class v0, Lcom/facebook/orca/f/o;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/o;

    iput-object v0, p0, Lcom/facebook/orca/push/sms/MmsReceiver;->g:Lcom/facebook/orca/f/o;

    .line 70
    return-void
.end method

.method public final onHandleIntent(Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 89
    :try_start_0
    invoke-direct {p0, p0, p1}, Lcom/facebook/orca/push/sms/MmsReceiver;->b(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    iget-object v0, p0, Lcom/facebook/orca/push/sms/MmsReceiver;->c:Lcom/facebook/orca/sms/t;

    iget-object v0, v0, Lcom/facebook/orca/sms/t;->a:Lcom/facebook/common/hardware/o;

    invoke-virtual {v0}, Lcom/facebook/common/hardware/o;->b()V

    .line 99
    return-void

    .line 97
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/facebook/orca/push/sms/MmsReceiver;->c:Lcom/facebook/orca/sms/t;

    iget-object v1, v1, Lcom/facebook/orca/sms/t;->a:Lcom/facebook/common/hardware/o;

    invoke-virtual {v1}, Lcom/facebook/common/hardware/o;->b()V

    throw v0
.end method
