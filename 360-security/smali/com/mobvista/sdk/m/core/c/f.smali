.class public final Lcom/mobvista/sdk/m/core/c/f;
.super Lcom/mobvista/sdk/m/a/a/a/a;
.source "360Security"


# static fields
.field private static a:Lcom/mobvista/sdk/m/core/c/f;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0, p1}, Lcom/mobvista/sdk/m/a/a/a/a;-><init>(Landroid/content/Context;)V

    .line 18
    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lcom/mobvista/sdk/m/core/c/f;
    .locals 3

    .prologue
    .line 21
    const-class v1, Lcom/mobvista/sdk/m/core/c/f;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/mobvista/sdk/m/core/c/f;->a:Lcom/mobvista/sdk/m/core/c/f;

    if-nez v0, :cond_0

    .line 22
    new-instance v0, Lcom/mobvista/sdk/m/core/c/f;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/mobvista/sdk/m/core/c/f;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/mobvista/sdk/m/core/c/f;->a:Lcom/mobvista/sdk/m/core/c/f;

    .line 25
    :cond_0
    sget-object v0, Lcom/mobvista/sdk/m/core/c/f;->a:Lcom/mobvista/sdk/m/core/c/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 21
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private static c(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .prologue
    .line 52
    :try_start_0
    const-string/jumbo v0, "CREATE TABLE IF NOT EXISTS campaign (id TEXT,unitid TEXT,tab INTEGER,package_name TEXT,app_name TEXT,app_desc TEXT,app_size TEXT,icon_url TEXT,image_url TEXT,impression_url TEXT,notice_url TEXT,download_url TEXT,only_impression TEXT,bg_image TEXT,preclick INTEGER,ts INTEGER )"

    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 53
    const-string/jumbo v0, "CREATE TABLE IF NOT EXISTS frequence (id TEXT,unitid TEXT,fc_a INTEGER,fc_b INTEGER,impression_count INTEGER,click_count INTEGER,ts INTEGER )"

    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 54
    sget-object v0, Lcom/mobvista/sdk/m/core/c/e;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 55
    sget-object v0, Lcom/mobvista/sdk/m/core/c/h;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 56
    const-string/jumbo v0, "CREATE TABLE IF NOT EXISTS campaignclick (id TEXT,unitid TEXT,result TEXT,ts INTEGER )"

    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    :goto_0
    return-void

    .line 57
    :catch_0
    move-exception v0

    .line 58
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method private static d(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .prologue
    .line 64
    :try_start_0
    const-string/jumbo v0, "DROP TABLE IF EXISTS \'campaign\'"

    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 65
    const-string/jumbo v0, "DROP TABLE IF EXISTS \'frequence\'"

    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 66
    const-string/jumbo v0, "DROP TABLE IF EXISTS \'Profile\'"

    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 67
    const-string/jumbo v0, "DROP TABLE IF EXISTS \'Weight\'"

    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 68
    const-string/jumbo v0, "DROP TABLE IF EXISTS \'campaignclick\'"

    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    :goto_0
    return-void

    .line 69
    :catch_0
    move-exception v0

    .line 70
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method protected final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    const-string/jumbo v0, "mobvista.adn.sdk.m.db"

    return-object v0
.end method

.method protected final a(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 0

    .prologue
    .line 40
    invoke-static {p1}, Lcom/mobvista/sdk/m/core/c/f;->c(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 41
    return-void
.end method

.method protected final b(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 0

    .prologue
    .line 45
    invoke-static {p1}, Lcom/mobvista/sdk/m/core/c/f;->d(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 46
    invoke-static {p1}, Lcom/mobvista/sdk/m/core/c/f;->c(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 47
    return-void
.end method
