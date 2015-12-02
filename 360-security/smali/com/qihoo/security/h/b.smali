.class public Lcom/qihoo/security/h/b;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/h/b$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;

.field private static b:Lcom/qihoo/security/h/b;


# instance fields
.field private c:Landroid/database/sqlite/SQLiteDatabase;

.field private d:Landroid/database/sqlite/SQLiteDatabase;

.field private e:Z

.field private final f:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 17
    const-class v0, Lcom/qihoo/security/h/b;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/h/b;->a:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/h/b;->e:Z

    .line 37
    iput-object p1, p0, Lcom/qihoo/security/h/b;->f:Landroid/content/Context;

    .line 38
    return-void
.end method

.method public static a()Lcom/qihoo/security/h/b;
    .locals 3

    .prologue
    .line 197
    const-class v1, Lcom/qihoo/security/h/b;

    monitor-enter v1

    .line 198
    :try_start_0
    sget-object v0, Lcom/qihoo/security/h/b;->b:Lcom/qihoo/security/h/b;

    if-nez v0, :cond_0

    .line 199
    new-instance v0, Lcom/qihoo/security/h/b;

    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/qihoo/security/h/b;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/qihoo/security/h/b;->b:Lcom/qihoo/security/h/b;

    .line 201
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 202
    sget-object v0, Lcom/qihoo/security/h/b;->b:Lcom/qihoo/security/h/b;

    return-object v0

    .line 201
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private b()V
    .locals 3

    .prologue
    .line 41
    iget-boolean v0, p0, Lcom/qihoo/security/h/b;->e:Z

    if-eqz v0, :cond_0

    .line 57
    :goto_0
    return-void

    .line 43
    :cond_0
    const-class v1, Lcom/qihoo/security/h/b;

    monitor-enter v1

    .line 45
    :try_start_0
    new-instance v0, Lcom/qihoo/security/h/b$a;

    iget-object v2, p0, Lcom/qihoo/security/h/b;->f:Landroid/content/Context;

    invoke-direct {v0, v2}, Lcom/qihoo/security/h/b$a;-><init>(Landroid/content/Context;)V

    .line 46
    invoke-virtual {v0}, Lcom/qihoo/security/h/b$a;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    iput-object v2, p0, Lcom/qihoo/security/h/b;->d:Landroid/database/sqlite/SQLiteDatabase;

    .line 47
    invoke-virtual {v0}, Lcom/qihoo/security/h/b$a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/h/b;->c:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    :goto_1
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lcom/qihoo/security/h/b;->e:Z

    .line 56
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 48
    :catch_0
    move-exception v0

    .line 49
    const/4 v0, 0x0

    :try_start_2
    iput-object v0, p0, Lcom/qihoo/security/h/b;->d:Landroid/database/sqlite/SQLiteDatabase;

    .line 50
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/h/b;->c:Landroid/database/sqlite/SQLiteDatabase;

    goto :goto_1

    .line 51
    :catch_1
    move-exception v0

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/h/b;->d:Landroid/database/sqlite/SQLiteDatabase;

    .line 53
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/h/b;->c:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1
.end method


# virtual methods
.method public a(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 103
    invoke-direct {p0}, Lcom/qihoo/security/h/b;->b()V

    .line 104
    iget-object v0, p0, Lcom/qihoo/security/h/b;->c:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_0

    .line 106
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/h/b;->c:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 114
    :goto_0
    return v0

    .line 107
    :catch_0
    move-exception v0

    .line 114
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 133
    invoke-direct {p0}, Lcom/qihoo/security/h/b;->b()V

    .line 134
    iget-object v0, p0, Lcom/qihoo/security/h/b;->c:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_0

    .line 136
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/h/b;->c:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, p1, p2, p3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 143
    :goto_0
    return v0

    .line 137
    :catch_0
    move-exception v0

    .line 143
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Landroid/content/ContentValues;)J
    .locals 2

    .prologue
    .line 118
    invoke-direct {p0}, Lcom/qihoo/security/h/b;->b()V

    .line 119
    iget-object v0, p0, Lcom/qihoo/security/h/b;->c:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_0

    .line 121
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/h/b;->c:Landroid/database/sqlite/SQLiteDatabase;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, p2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    .line 129
    :goto_0
    return-wide v0

    .line 122
    :catch_0
    move-exception v0

    .line 129
    :cond_0
    const-wide/16 v0, -0x1

    goto :goto_0
.end method

.method public a(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    .locals 1

    .prologue
    .line 60
    invoke-direct {p0}, Lcom/qihoo/security/h/b;->b()V

    .line 61
    iget-object v0, p0, Lcom/qihoo/security/h/b;->d:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_0

    .line 63
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/h/b;->d:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 70
    :goto_0
    return-object v0

    .line 64
    :catch_0
    move-exception v0

    .line 70
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    .locals 1

    .prologue
    .line 89
    invoke-direct {p0}, Lcom/qihoo/security/h/b;->b()V

    .line 90
    iget-object v0, p0, Lcom/qihoo/security/h/b;->d:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_0

    .line 92
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/h/b;->d:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 99
    :goto_0
    return-object v0

    .line 93
    :catch_0
    move-exception v0

    .line 99
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
