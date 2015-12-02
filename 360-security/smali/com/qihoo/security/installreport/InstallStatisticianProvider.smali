.class public Lcom/qihoo/security/installreport/InstallStatisticianProvider;
.super Landroid/content/ContentProvider;
.source "360Security"


# static fields
.field private static final a:Ljava/lang/String;

.field private static final b:Landroid/content/UriMatcher;

.field private static final c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private d:Lcom/qihoo/security/installreport/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 24
    const-class v0, Lcom/qihoo/security/installreport/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->a:Ljava/lang/String;

    .line 27
    new-instance v0, Landroid/content/UriMatcher;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Landroid/content/UriMatcher;-><init>(I)V

    sput-object v0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->b:Landroid/content/UriMatcher;

    .line 33
    sget-object v0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->b:Landroid/content/UriMatcher;

    const-string/jumbo v1, "com.qihoo.security.lite.installreport"

    const-string/jumbo v2, "log"

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 34
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->c:Ljava/util/HashMap;

    .line 35
    sget-object v0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->c:Ljava/util/HashMap;

    const-string/jumbo v1, "_id"

    const-string/jumbo v2, "_id"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    sget-object v0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->c:Ljava/util/HashMap;

    const-string/jumbo v1, "tp"

    const-string/jumbo v2, "tp"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    sget-object v0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->c:Ljava/util/HashMap;

    const-string/jumbo v1, "pn"

    const-string/jumbo v2, "pn"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    sget-object v0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->c:Ljava/util/HashMap;

    const-string/jumbo v1, "ts"

    const-string/jumbo v2, "ts"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    sget-object v0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->c:Ljava/util/HashMap;

    const-string/jumbo v1, "rn"

    const-string/jumbo v2, "rn"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    sget-object v0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->c:Ljava/util/HashMap;

    const-string/jumbo v1, "r0"

    const-string/jumbo v2, "r0"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    sget-object v0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->c:Ljava/util/HashMap;

    const-string/jumbo v1, "r1"

    const-string/jumbo v2, "r1"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    sget-object v0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->c:Ljava/util/HashMap;

    const-string/jumbo v1, "mid"

    const-string/jumbo v2, "mid"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    sget-object v0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->c:Ljava/util/HashMap;

    const-string/jumbo v1, "pid"

    const-string/jumbo v2, "pid"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    sget-object v0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->c:Ljava/util/HashMap;

    const-string/jumbo v1, "adid"

    const-string/jumbo v2, "adid"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    sget-object v0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->c:Ljava/util/HashMap;

    const-string/jumbo v1, "p1"

    const-string/jumbo v2, "p1"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    sget-object v0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->c:Ljava/util/HashMap;

    const-string/jumbo v1, "p2"

    const-string/jumbo v2, "p2"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    sget-object v0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->c:Ljava/util/HashMap;

    const-string/jumbo v1, "c1"

    const-string/jumbo v2, "c1"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    sget-object v0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->c:Ljava/util/HashMap;

    const-string/jumbo v1, "c2"

    const-string/jumbo v2, "c2"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    sget-object v0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->c:Ljava/util/HashMap;

    const-string/jumbo v1, "c3"

    const-string/jumbo v2, "c3"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    return-void
.end method

.method private a(Landroid/net/Uri;)Ljava/lang/String;
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 72
    const-string/jumbo v1, "limit"

    invoke-virtual {p1, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 73
    if-nez v1, :cond_1

    .line 90
    :cond_0
    :goto_0
    return-object v0

    .line 78
    :cond_1
    :try_start_0
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 79
    if-ltz v1, :cond_0

    .line 85
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 86
    :catch_0
    move-exception v1

    goto :goto_0
.end method


# virtual methods
.method public applyBatch(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/content/ContentProviderOperation;",
            ">;)[",
            "Landroid/content/ContentProviderResult;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/OperationApplicationException;
        }
    .end annotation

    .prologue
    .line 203
    iget-object v0, p0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->d:Lcom/qihoo/security/installreport/c;

    invoke-virtual {v0}, Lcom/qihoo/security/installreport/c;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 204
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 206
    :try_start_0
    invoke-super {p0, p1}, Landroid/content/ContentProvider;->applyBatch(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;

    move-result-object v0

    .line 207
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 210
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
.end method

.method public delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 3

    .prologue
    .line 164
    sget-object v0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->b:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v1

    .line 165
    const/4 v0, 0x0

    .line 166
    const/4 v2, 0x1

    if-ne v2, v1, :cond_0

    .line 167
    iget-object v0, p0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->d:Lcom/qihoo/security/installreport/c;

    invoke-virtual {v0, p2, p3}, Lcom/qihoo/security/installreport/c;->a(Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    .line 169
    :cond_0
    return v0
.end method

.method public getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 68
    const/4 v0, 0x0

    return-object v0
.end method

.method public insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 140
    sget-object v1, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->b:Landroid/content/UriMatcher;

    invoke-virtual {v1, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v1

    .line 141
    const/4 v2, 0x1

    if-ne v2, v1, :cond_0

    .line 142
    iget-object v1, p0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->d:Lcom/qihoo/security/installreport/c;

    invoke-virtual {v1, p2}, Lcom/qihoo/security/installreport/c;->a(Landroid/content/ContentValues;)J

    move-result-wide v2

    .line 143
    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-gez v1, :cond_1

    .line 149
    :cond_0
    :goto_0
    return-object v0

    .line 147
    :cond_1
    invoke-static {p1, v2, v3}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v0

    goto :goto_0
.end method

.method public onCreate()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 56
    :try_start_0
    new-instance v1, Lcom/qihoo/security/installreport/c;

    invoke-virtual {p0}, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/qihoo/security/installreport/c;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->d:Lcom/qihoo/security/installreport/c;

    .line 57
    iget-object v1, p0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->d:Lcom/qihoo/security/installreport/c;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    .line 62
    :cond_0
    :goto_0
    return v0

    .line 58
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 8

    .prologue
    const/4 v6, 0x0

    .line 96
    sget-object v0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->b:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v0

    .line 97
    new-instance v1, Landroid/database/sqlite/SQLiteQueryBuilder;

    invoke-direct {v1}, Landroid/database/sqlite/SQLiteQueryBuilder;-><init>()V

    .line 99
    invoke-direct {p0, p1}, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->a(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v7

    .line 118
    const/4 v2, 0x1

    if-ne v2, v0, :cond_0

    .line 119
    const-string/jumbo v0, "bilog"

    invoke-virtual {v1, v0}, Landroid/database/sqlite/SQLiteQueryBuilder;->setTables(Ljava/lang/String;)V

    .line 120
    sget-object v0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->c:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Landroid/database/sqlite/SQLiteQueryBuilder;->setProjectionMap(Ljava/util/Map;)V

    .line 122
    iget-object v0, p0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->d:Lcom/qihoo/security/installreport/c;

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v7}, Lcom/qihoo/security/installreport/c;->a(Landroid/database/sqlite/SQLiteQueryBuilder;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 123
    if-eqz v6, :cond_0

    .line 124
    invoke-virtual {p0}, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lcom/qihoo/security/installreport/b;->a:Landroid/net/Uri;

    invoke-interface {v6, v0, v1}, Landroid/database/Cursor;->setNotificationUri(Landroid/content/ContentResolver;Landroid/net/Uri;)V

    .line 127
    :cond_0
    return-object v6
.end method

.method public update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 3

    .prologue
    .line 186
    sget-object v0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->b:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v1

    .line 187
    const/4 v0, 0x0

    .line 188
    const/4 v2, 0x1

    if-ne v2, v1, :cond_0

    .line 189
    iget-object v0, p0, Lcom/qihoo/security/installreport/InstallStatisticianProvider;->d:Lcom/qihoo/security/installreport/c;

    invoke-virtual {v0, p2, p3, p4}, Lcom/qihoo/security/installreport/c;->a(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    .line 191
    :cond_0
    return v0
.end method
