.class public final Lcom/qihoo/security/h/f;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/h/f$1;,
        Lcom/qihoo/security/h/f$a;,
        Lcom/qihoo/security/h/f$b;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/String;

.field private static d:Lcom/qihoo/security/h/f;


# instance fields
.field private final e:Landroid/content/Context;

.field private f:Landroid/content/pm/PackageManager;

.field private final g:Lcom/qihoo/security/h/k;

.field private h:Z

.field private final i:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/qihoo/security/h/e;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/qihoo/security/h/e;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private l:Lcom/qihoo/security/h/f$b;

.field private m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/h/f$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 37
    const-class v0, Lcom/qihoo/security/h/f;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/h/f;->a:Ljava/lang/String;

    .line 39
    const-string/jumbo v0, "SELECT * FROM %s ORDER BY %s"

    new-array v1, v5, [Ljava/lang/Object;

    const-string/jumbo v2, "pkginfo"

    aput-object v2, v1, v3

    const-string/jumbo v2, "taxis"

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/h/f;->b:Ljava/lang/String;

    .line 42
    const-string/jumbo v0, "SELECT * FROM %s WHERE %s = ?"

    new-array v1, v5, [Ljava/lang/Object;

    const-string/jumbo v2, "pkginfo"

    aput-object v2, v1, v3

    const-string/jumbo v2, "pkg"

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/h/f;->c:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/h/f;->h:Z

    .line 51
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/h/f;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 55
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/h/f;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 57
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/h/f;->k:Ljava/util/Set;

    .line 60
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/h/f;->e:Landroid/content/Context;

    .line 61
    iget-object v0, p0, Lcom/qihoo/security/h/f;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/h/f;->f:Landroid/content/pm/PackageManager;

    .line 62
    invoke-static {}, Lcom/qihoo/security/h/k;->a()Lcom/qihoo/security/h/k;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/h/f;->g:Lcom/qihoo/security/h/k;

    .line 63
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/h/f;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/qihoo/security/h/f;->e:Landroid/content/Context;

    return-object v0
.end method

.method public static a()Lcom/qihoo/security/h/f;
    .locals 3

    .prologue
    .line 66
    const-class v1, Lcom/qihoo/security/h/f;

    monitor-enter v1

    .line 67
    :try_start_0
    sget-object v0, Lcom/qihoo/security/h/f;->d:Lcom/qihoo/security/h/f;

    if-nez v0, :cond_0

    .line 68
    new-instance v0, Lcom/qihoo/security/h/f;

    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/qihoo/security/h/f;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/qihoo/security/h/f;->d:Lcom/qihoo/security/h/f;

    .line 70
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    sget-object v0, Lcom/qihoo/security/h/f;->d:Lcom/qihoo/security/h/f;

    return-object v0

    .line 70
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private a(Z)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 307
    invoke-static {}, Lcom/qihoo/security/h/b;->a()Lcom/qihoo/security/h/b;

    move-result-object v0

    sget-object v1, Lcom/qihoo/security/h/f;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/h/b;->b(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3

    .line 308
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 310
    if-eqz v3, :cond_1

    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 312
    :cond_0
    const-string/jumbo v0, "pkg"

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 314
    invoke-interface {v3}, Landroid/database/Cursor;->getPosition()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 315
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 318
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/h/f;->f:Landroid/content/pm/PackageManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;

    move-result-object v0

    .line 319
    iget-object v1, p0, Lcom/qihoo/security/h/f;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    .line 320
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageInfo;

    .line 321
    iget-object v1, p0, Lcom/qihoo/security/h/f;->k:Ljava/util/Set;

    iget-object v7, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-interface {v1, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 323
    iget-object v1, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 325
    iget-object v1, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 327
    if-eqz v1, :cond_3

    .line 329
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v3, v0}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 330
    iget-object v0, p0, Lcom/qihoo/security/h/f;->f:Landroid/content/pm/PackageManager;

    invoke-static {v3, v0, p1}, Lcom/qihoo/security/h/e;->a(Landroid/database/Cursor;Landroid/content/pm/PackageManager;Z)Lcom/qihoo/security/h/e;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 349
    :goto_1
    if-eqz v0, :cond_2

    .line 357
    invoke-virtual {v0}, Lcom/qihoo/security/h/e;->b()I

    move-result v1

    if-lez v1, :cond_2

    .line 358
    invoke-virtual {p0, v0}, Lcom/qihoo/security/h/f;->a(Lcom/qihoo/security/h/e;)V

    goto :goto_0

    .line 331
    :catch_0
    move-exception v0

    move-object v0, v2

    .line 334
    goto :goto_1

    .line 336
    :cond_3
    invoke-static {v0}, Lcom/qihoo/security/h/e;->a(Landroid/content/pm/PackageInfo;)Lcom/qihoo/security/h/e;

    move-result-object v0

    goto :goto_1

    .line 368
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/h/f;->e:Landroid/content/Context;

    const-string/jumbo v1, "key_sheild_db_init"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 370
    invoke-static {v3}, Lcom/qihoo360/common/utils/Utils;->closeCursor(Landroid/database/Cursor;)V

    .line 371
    return-void
.end method

.method private b(Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 378
    iget-object v0, p0, Lcom/qihoo/security/h/f;->f:Landroid/content/pm/PackageManager;

    .line 379
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;

    move-result-object v0

    .line 380
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 381
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageInfo;

    .line 382
    iget-object v3, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v1, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 384
    :cond_0
    invoke-static {}, Lcom/qihoo/security/h/b;->a()Lcom/qihoo/security/h/b;

    move-result-object v0

    sget-object v2, Lcom/qihoo/security/h/f;->b:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Lcom/qihoo/security/h/b;->a(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 385
    if-eqz v0, :cond_3

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 388
    :cond_1
    :try_start_0
    invoke-static {v0, v1, p1}, Lcom/qihoo/security/h/e;->a(Landroid/database/Cursor;Ljava/util/HashMap;Z)Lcom/qihoo/security/h/e;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 389
    if-nez v2, :cond_4

    .line 408
    :cond_2
    :goto_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-nez v2, :cond_1

    .line 410
    :cond_3
    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->closeCursor(Landroid/database/Cursor;)V

    .line 411
    return-void

    .line 391
    :cond_4
    :try_start_1
    iget-object v3, p0, Lcom/qihoo/security/h/f;->k:Ljava/util/Set;

    iget-object v4, v2, Lcom/qihoo/security/h/e;->a:Ljava/lang/String;

    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 393
    iget-object v3, p0, Lcom/qihoo/security/h/f;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v2, Lcom/qihoo/security/h/e;->a:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 400
    invoke-virtual {v2}, Lcom/qihoo/security/h/e;->b()I

    move-result v3

    if-lez v3, :cond_2

    .line 401
    invoke-virtual {p0, v2}, Lcom/qihoo/security/h/f;->a(Lcom/qihoo/security/h/e;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 403
    :catch_0
    move-exception v2

    goto :goto_1
.end method

.method private final e()V
    .locals 4

    .prologue
    .line 175
    iget-object v0, p0, Lcom/qihoo/security/h/f;->l:Lcom/qihoo/security/h/f$b;

    if-nez v0, :cond_0

    .line 176
    new-instance v0, Lcom/qihoo/security/h/f$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/h/f$b;-><init>(Lcom/qihoo/security/h/f;Lcom/qihoo/security/h/f$1;)V

    iput-object v0, p0, Lcom/qihoo/security/h/f;->l:Lcom/qihoo/security/h/f$b;

    .line 177
    iget-object v0, p0, Lcom/qihoo/security/h/f;->e:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo/security/h/f;->l:Lcom/qihoo/security/h/f$b;

    new-instance v2, Landroid/content/IntentFilter;

    const-string/jumbo v3, "android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 181
    :cond_0
    return-void
.end method

.method private f()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 271
    iget-object v0, p0, Lcom/qihoo/security/h/f;->f:Landroid/content/pm/PackageManager;

    invoke-virtual {v0, v5}, Landroid/content/pm/PackageManager;->getInstalledApplications(I)Ljava/util/List;

    move-result-object v0

    .line 274
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ApplicationInfo;

    .line 275
    iget-object v2, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 276
    if-eqz v2, :cond_0

    const-string/jumbo v3, "com.qihoo.security_"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string/jumbo v3, "com.qihoo.security"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 280
    :cond_1
    :try_start_0
    iget-object v3, p0, Lcom/qihoo/security/h/f;->f:Landroid/content/pm/PackageManager;

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const/16 v4, 0x40

    invoke-virtual {v3, v0, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 284
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 285
    if-eqz v0, :cond_0

    array-length v3, v0

    const/4 v4, 0x1

    if-lt v3, v4, :cond_0

    .line 287
    aget-object v0, v0, v5

    invoke-virtual {v0}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->getMD5([B)Ljava/lang/String;

    move-result-object v0

    .line 288
    sget-object v3, Lcom/qihoo/security/h/i;->a:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    sget-object v3, Lcom/qihoo/security/h/i;->b:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 289
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/h/f;->k:Ljava/util/Set;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 295
    :cond_3
    return-void

    .line 281
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private g()V
    .locals 3

    .prologue
    .line 621
    iget-object v0, p0, Lcom/qihoo/security/h/f;->m:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    .line 631
    :cond_0
    return-void

    .line 623
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/h/f;->k:Ljava/util/Set;

    .line 624
    iget-object v0, p0, Lcom/qihoo/security/h/f;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 625
    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 626
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/h/f$a;

    .line 627
    invoke-interface {v0, v1}, Lcom/qihoo/security/h/f$a;->a(Ljava/util/Set;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 628
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_0
.end method


# virtual methods
.method protected a(Lcom/qihoo/security/h/e;)V
    .locals 2

    .prologue
    .line 84
    invoke-virtual {p1}, Lcom/qihoo/security/h/e;->c()I

    move-result v0

    .line 85
    const/16 v1, 0x3e8

    if-eq v0, v1, :cond_0

    const/16 v1, 0x3e9

    if-ne v0, v1, :cond_1

    .line 119
    :cond_0
    :goto_0
    return-void

    .line 88
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/h/f;->i:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v1, p1, Lcom/qihoo/security/h/e;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/h/e;

    .line 89
    if-nez v0, :cond_0

    .line 92
    invoke-virtual {p1}, Lcom/qihoo/security/h/e;->c()I

    move-result v0

    .line 93
    const/16 v1, -0x3e8

    if-eq v0, v1, :cond_0

    .line 113
    iget-object v1, p0, Lcom/qihoo/security/h/f;->j:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    iget-object v0, p0, Lcom/qihoo/security/h/f;->i:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v1, p1, Lcom/qihoo/security/h/e;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;I)V
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 466
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 535
    :cond_0
    :goto_0
    return-void

    .line 470
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/h/f;->k:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 472
    if-eqz p1, :cond_4

    const-string/jumbo v0, "com.qihoo.security_"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string/jumbo v0, "com.qihoo.security"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 477
    :cond_2
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/h/f;->f:Landroid/content/pm/PackageManager;

    const/16 v1, 0x40

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    .line 478
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 479
    if-eqz v0, :cond_0

    array-length v1, v0

    if-lt v1, v2, :cond_0

    .line 481
    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->getMD5([B)Ljava/lang/String;

    move-result-object v0

    .line 482
    sget-object v1, Lcom/qihoo/security/h/i;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    sget-object v1, Lcom/qihoo/security/h/i;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 483
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/h/f;->k:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 484
    invoke-direct {p0}, Lcom/qihoo/security/h/f;->g()V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 487
    :catch_0
    move-exception v0

    goto :goto_0

    .line 491
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/h/f;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/h/e;

    .line 494
    if-eqz v0, :cond_5

    .line 495
    iget-object v1, p0, Lcom/qihoo/security/h/f;->f:Landroid/content/pm/PackageManager;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/h/e;->a(Landroid/content/pm/PackageManager;)V

    .line 496
    invoke-virtual {v0}, Lcom/qihoo/security/h/e;->d()Z

    goto :goto_0

    .line 498
    :cond_5
    invoke-static {}, Lcom/qihoo/security/h/b;->a()Lcom/qihoo/security/h/b;

    move-result-object v1

    .line 499
    new-array v2, v2, [Ljava/lang/String;

    aput-object p1, v2, v3

    .line 500
    sget-object v3, Lcom/qihoo/security/h/f;->c:Ljava/lang/String;

    invoke-virtual {v1, v3, v2}, Lcom/qihoo/security/h/b;->a(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 502
    if-eqz v1, :cond_6

    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v2

    if-eqz v2, :cond_6

    .line 504
    :try_start_2
    iget-object v2, p0, Lcom/qihoo/security/h/f;->f:Landroid/content/pm/PackageManager;

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Lcom/qihoo/security/h/e;->a(Landroid/database/Cursor;Landroid/content/pm/PackageManager;Z)Lcom/qihoo/security/h/e;

    move-result-object v0

    .line 505
    if-eqz v0, :cond_6

    .line 506
    iget-object v2, p0, Lcom/qihoo/security/h/f;->f:Landroid/content/pm/PackageManager;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/h/e;->a(Landroid/content/pm/PackageManager;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 516
    :cond_6
    :goto_1
    invoke-static {v1}, Lcom/qihoo360/common/utils/Utils;->closeCursor(Landroid/database/Cursor;)V

    .line 518
    if-nez v0, :cond_7

    .line 520
    :try_start_3
    iget-object v1, p0, Lcom/qihoo/security/h/f;->f:Landroid/content/pm/PackageManager;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 521
    invoke-static {v1}, Lcom/qihoo/security/h/e;->a(Landroid/content/pm/PackageInfo;)Lcom/qihoo/security/h/e;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    move-result-object v0

    .line 527
    :cond_7
    :goto_2
    if-eqz v0, :cond_0

    .line 528
    invoke-virtual {v0}, Lcom/qihoo/security/h/e;->d()Z

    .line 529
    invoke-virtual {v0}, Lcom/qihoo/security/h/e;->b()I

    move-result v1

    if-lez v1, :cond_0

    .line 530
    invoke-virtual {p0, v0}, Lcom/qihoo/security/h/f;->a(Lcom/qihoo/security/h/e;)V

    goto/16 :goto_0

    .line 513
    :catch_1
    move-exception v2

    goto :goto_1

    .line 522
    :catch_2
    move-exception v1

    goto :goto_2

    .line 508
    :catch_3
    move-exception v2

    goto :goto_1
.end method

.method public a([Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 206
    iget-boolean v0, p0, Lcom/qihoo/security/h/f;->h:Z

    if-nez v0, :cond_1

    .line 214
    :cond_0
    return-void

    .line 209
    :cond_1
    if-eqz p1, :cond_0

    .line 211
    array-length v2, p1

    move v0, v1

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, p1, v0

    .line 212
    invoke-virtual {p0, v3, v1}, Lcom/qihoo/security/h/f;->a(Ljava/lang/String;I)V

    .line 211
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method protected b(Lcom/qihoo/security/h/e;)V
    .locals 4

    .prologue
    .line 122
    invoke-virtual {p1}, Lcom/qihoo/security/h/e;->c()I

    move-result v1

    .line 123
    iget-object v2, p1, Lcom/qihoo/security/h/e;->a:Ljava/lang/String;

    .line 124
    iget-object v0, p0, Lcom/qihoo/security/h/f;->j:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/h/e;

    .line 125
    iget-object v3, p0, Lcom/qihoo/security/h/f;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    if-eqz v0, :cond_0

    .line 127
    invoke-virtual {v0}, Lcom/qihoo/security/h/e;->a()I

    move-result v0

    if-nez v0, :cond_0

    .line 128
    iget-object v0, p0, Lcom/qihoo/security/h/f;->j:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;I)V
    .locals 2

    .prologue
    .line 547
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 561
    :cond_0
    :goto_0
    return-void

    .line 550
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/h/f;->k:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 551
    iget-object v0, p0, Lcom/qihoo/security/h/f;->k:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 552
    invoke-direct {p0}, Lcom/qihoo/security/h/f;->g()V

    goto :goto_0

    .line 556
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/h/f;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/h/e;

    .line 557
    if-eqz v0, :cond_0

    .line 558
    iget-object v1, p0, Lcom/qihoo/security/h/f;->f:Landroid/content/pm/PackageManager;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/h/e;->a(Landroid/content/pm/PackageManager;)V

    .line 559
    invoke-virtual {p0, v0}, Lcom/qihoo/security/h/f;->b(Lcom/qihoo/security/h/e;)V

    goto :goto_0
.end method

.method protected b()Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 153
    iget-boolean v2, p0, Lcom/qihoo/security/h/f;->h:Z

    if-eqz v2, :cond_0

    .line 170
    :goto_0
    return v0

    .line 155
    :cond_0
    iput-boolean v1, p0, Lcom/qihoo/security/h/f;->h:Z

    .line 156
    invoke-direct {p0}, Lcom/qihoo/security/h/f;->e()V

    .line 157
    iget-object v2, p0, Lcom/qihoo/security/h/f;->e:Landroid/content/Context;

    const-string/jumbo v3, "key_sheild_db_init"

    invoke-static {v2, v3, v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v2

    .line 158
    if-eqz v2, :cond_1

    .line 160
    const/4 v1, 0x0

    :try_start_0
    invoke-direct {p0, v1}, Lcom/qihoo/security/h/f;->b(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 161
    :catch_0
    move-exception v1

    goto :goto_0

    .line 167
    :cond_1
    const/4 v0, 0x1

    :try_start_1
    invoke-direct {p0, v0}, Lcom/qihoo/security/h/f;->a(Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :goto_1
    move v0, v1

    .line 170
    goto :goto_0

    .line 168
    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method protected c()V
    .locals 2

    .prologue
    .line 217
    iget-object v0, p0, Lcom/qihoo/security/h/f;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    .line 218
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/h/e;

    .line 219
    invoke-virtual {v0}, Lcom/qihoo/security/h/e;->d()Z

    goto :goto_0

    .line 221
    :cond_0
    return-void
.end method

.method protected d()V
    .locals 5

    .prologue
    .line 224
    .line 226
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/h/f;->f:Landroid/content/pm/PackageManager;

    if-nez v0, :cond_0

    .line 227
    iget-object v0, p0, Lcom/qihoo/security/h/f;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/h/f;->f:Landroid/content/pm/PackageManager;

    .line 229
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/h/f;->f:Landroid/content/pm/PackageManager;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 247
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageInfo;

    .line 248
    iget-object v2, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 249
    if-eqz v2, :cond_1

    const-string/jumbo v3, "com.qihoo.security_"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    const-string/jumbo v3, "com.qihoo.security"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 252
    :cond_2
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 253
    if-eqz v0, :cond_1

    array-length v3, v0

    const/4 v4, 0x1

    if-lt v3, v4, :cond_1

    .line 255
    const/4 v3, 0x0

    aget-object v0, v0, v3

    invoke-virtual {v0}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->getMD5([B)Ljava/lang/String;

    move-result-object v0

    .line 256
    sget-object v3, Lcom/qihoo/security/h/i;->a:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    sget-object v3, Lcom/qihoo/security/h/i;->b:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 257
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/h/f;->k:Ljava/util/Set;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 230
    :catch_0
    move-exception v0

    .line 235
    iget-object v0, p0, Lcom/qihoo/security/h/f;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/h/f;->f:Landroid/content/pm/PackageManager;

    .line 236
    invoke-direct {p0}, Lcom/qihoo/security/h/f;->f()V

    .line 263
    :cond_4
    :goto_1
    return-void

    .line 238
    :catch_1
    move-exception v0

    .line 242
    invoke-direct {p0}, Lcom/qihoo/security/h/f;->f()V

    goto :goto_1
.end method
