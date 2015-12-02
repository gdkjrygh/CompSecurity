.class public Landroid_src/mms/transaction/d;
.super Ljava/lang/Object;
.source "MessagingNotification.java"


# static fields
.field private static final a:[Ljava/lang/String;

.field private static final b:[Ljava/lang/String;

.field private static final c:Landroid_src/mms/transaction/g;

.field private static final d:Landroid/net/Uri;

.field private static e:Landroid_src/mms/transaction/h;

.field private static f:Landroid/content/Intent;

.field private static g:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 59
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "thread_id"

    aput-object v1, v0, v2

    const-string v1, "date"

    aput-object v1, v0, v3

    const-string v1, "_id"

    aput-object v1, v0, v4

    const-string v1, "sub"

    aput-object v1, v0, v5

    const-string v1, "sub_cs"

    aput-object v1, v0, v6

    sput-object v0, Landroid_src/mms/transaction/d;->a:[Ljava/lang/String;

    .line 63
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "thread_id"

    aput-object v1, v0, v2

    const-string v1, "date"

    aput-object v1, v0, v3

    const-string v1, "address"

    aput-object v1, v0, v4

    const-string v1, "subject"

    aput-object v1, v0, v5

    const-string v1, "body"

    aput-object v1, v0, v6

    sput-object v0, Landroid_src/mms/transaction/d;->b:[Ljava/lang/String;

    .line 90
    new-instance v0, Landroid_src/mms/transaction/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid_src/mms/transaction/g;-><init>(Landroid_src/mms/transaction/e;)V

    sput-object v0, Landroid_src/mms/transaction/d;->c:Landroid_src/mms/transaction/g;

    .line 93
    const-string v0, "content://mms-sms/undelivered"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Landroid_src/mms/transaction/d;->d:Landroid/net/Uri;

    .line 109
    new-instance v0, Landroid_src/mms/transaction/h;

    invoke-direct {v0}, Landroid_src/mms/transaction/h;-><init>()V

    sput-object v0, Landroid_src/mms/transaction/d;->e:Landroid_src/mms/transaction/h;

    .line 111
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    sput-object v0, Landroid_src/mms/transaction/d;->g:Landroid/os/Handler;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 118
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 119
    const-string v1, "com.android.mms.NOTIFICATION_DELETED_ACTION"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 120
    sget-object v1, Landroid_src/mms/transaction/d;->e:Landroid_src/mms/transaction/h;

    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 123
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.android.mms.NOTIFICATION_DELETED_ACTION"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    sput-object v0, Landroid_src/mms/transaction/d;->f:Landroid/content/Intent;

    .line 124
    return-void
.end method

.method public static a(Landroid/content/Context;I)V
    .locals 1

    .prologue
    .line 235
    const-string v0, "notification"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    .line 238
    invoke-virtual {v0, p1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 239
    return-void
.end method

.method public static a(Landroid/content/Context;J)V
    .locals 2

    .prologue
    .line 268
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, v0, p1, p2, v1}, Landroid_src/mms/transaction/d;->a(Landroid/content/Context;ZJZ)V

    .line 269
    return-void
.end method

.method public static a(Landroid/content/Context;Z)V
    .locals 3

    .prologue
    .line 276
    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    invoke-static {p0, v0, v1, v2, p1}, Landroid_src/mms/transaction/d;->a(Landroid/content/Context;ZJZ)V

    .line 277
    return-void
.end method

.method private static a(Landroid/content/Context;ZJZ)V
    .locals 0

    .prologue
    .line 282
    return-void
.end method

.method public static a(Landroid/content/Context;ZZ)V
    .locals 2

    .prologue
    .line 136
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Landroid_src/mms/transaction/e;

    invoke-direct {v1, p0, p1, p2}, Landroid_src/mms/transaction/e;-><init>(Landroid/content/Context;ZZ)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 142
    return-void
.end method

.method public static b(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 363
    invoke-static {p0}, Landroid_src/mms/transaction/d;->c(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    .line 364
    const/16 v0, 0x213

    invoke-static {p0, v0}, Landroid_src/mms/transaction/d;->a(Landroid/content/Context;I)V

    .line 366
    :cond_0
    return-void
.end method

.method public static b(Landroid/content/Context;ZZ)V
    .locals 0

    .prologue
    .line 154
    return-void
.end method

.method private static c(Landroid/content/Context;)I
    .locals 7

    .prologue
    const/4 v3, 0x0

    .line 347
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    sget-object v2, Landroid_src/c/f;->a:Landroid/net/Uri;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "m_type="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v4, 0x82

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, " AND "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "st"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v4, 0x87

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    move-object v0, p0

    move-object v5, v3

    move-object v6, v3

    invoke-static/range {v0 .. v6}, Landroid_src/a/a/a;->a(Landroid/content/Context;Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 354
    if-nez v1, :cond_0

    .line 355
    const/4 v0, 0x0

    .line 359
    :goto_0
    return v0

    .line 357
    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v0

    .line 358
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto :goto_0
.end method
