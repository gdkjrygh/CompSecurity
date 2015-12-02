.class public Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;
.super Lcom/facebook/c/r;
.source "FbSharedPreferencesContentProvider.java"


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

.field private static final c:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static d:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal",
            "<",
            "Lcom/facebook/prefs/shared/g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private e:Lcom/facebook/prefs/shared/ah;

.field private f:Lcom/facebook/prefs/shared/ag;

.field private g:Lcom/facebook/prefs/shared/h;

.field private h:Landroid/database/sqlite/SQLiteDatabase;

.field private i:Landroid/content/UriMatcher;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 46
    const-class v0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;

    sput-object v0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->a:Ljava/lang/Class;

    .line 48
    new-instance v0, Lcom/facebook/debug/log/l;

    invoke-direct {v0}, Lcom/facebook/debug/log/l;-><init>()V

    sput-object v0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->b:Lcom/facebook/debug/log/l;

    .line 50
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "_id"

    const-string v2, "_id"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "key"

    const-string v2, "key"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "value"

    const-string v2, "value"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "type"

    const-string v2, "type"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    sput-object v0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->c:Lcom/google/common/a/ev;

    .line 66
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->d:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0}, Lcom/facebook/c/r;-><init>()V

    .line 399
    return-void
.end method

.method static synthetic a(Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;)Landroid/database/sqlite/SQLiteDatabase;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->h:Landroid/database/sqlite/SQLiteDatabase;

    return-object v0
.end method

.method private a(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 307
    const-string v1, "key"

    invoke-virtual {p1, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    instance-of v1, p3, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 309
    const-string v1, "type"

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 310
    const-string v0, "value"

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p1, v0, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 329
    :goto_0
    return-void

    .line 311
    :cond_0
    instance-of v1, p3, Ljava/lang/Boolean;

    if-eqz v1, :cond_2

    .line 312
    const-string v1, "type"

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 313
    const-string v1, "value"

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    .line 314
    :cond_2
    instance-of v0, p3, Ljava/lang/Integer;

    if-eqz v0, :cond_3

    .line 315
    const-string v0, "type"

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 316
    const-string v0, "value"

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p1, v0, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    goto :goto_0

    .line 317
    :cond_3
    instance-of v0, p3, Ljava/lang/Long;

    if-eqz v0, :cond_4

    .line 318
    const-string v0, "type"

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 319
    const-string v0, "value"

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p1, v0, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    goto :goto_0

    .line 320
    :cond_4
    instance-of v0, p3, Ljava/lang/Float;

    if-eqz v0, :cond_5

    .line 321
    const-string v0, "type"

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 322
    const-string v0, "value"

    check-cast p3, Ljava/lang/Float;

    invoke-virtual {p1, v0, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Float;)V

    goto :goto_0

    .line 323
    :cond_5
    instance-of v0, p3, Ljava/lang/Double;

    if-eqz v0, :cond_6

    .line 324
    const-string v0, "type"

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 325
    const-string v0, "value"

    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p1, v0, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    goto :goto_0

    .line 327
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported type"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private a(Ljava/util/SortedMap;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/SortedMap",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 287
    iget-object v0, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->e:Lcom/facebook/prefs/shared/ah;

    invoke-virtual {v0, p1}, Lcom/facebook/prefs/shared/ah;->a(Ljava/util/SortedMap;)Ljava/util/SortedMap;

    move-result-object v0

    .line 288
    const-string v1, "#migrate"

    invoke-static {v1}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v2

    .line 289
    iget-object v1, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->h:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 291
    :try_start_0
    iget-object v1, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->h:Landroid/database/sqlite/SQLiteDatabase;

    const-string v3, "preferences"

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {v1, v3, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 292
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 293
    invoke-interface {v0}, Ljava/util/SortedMap;->entrySet()Ljava/util/Set;

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

    .line 294
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/prefs/shared/ae;

    .line 295
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 296
    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v1, v0}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->a(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/Object;)V

    .line 297
    iget-object v0, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->h:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "preferences"

    const/4 v5, 0x0

    invoke-virtual {v0, v1, v5, v3}, Landroid/database/sqlite/SQLiteDatabase;->replaceOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 301
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->h:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 302
    invoke-virtual {v2}, Lcom/facebook/debug/d/e;->a()J

    throw v0

    .line 299
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->h:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 301
    iget-object v0, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->h:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 302
    invoke-virtual {v2}, Lcom/facebook/debug/d/e;->a()J

    .line 304
    return-void
.end method

.method private b(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 243
    iget-object v0, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->i:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 253
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown URL "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 245
    :pswitch_0
    if-nez p2, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "Selection not supported"

    invoke-static {v0, v3}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 246
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v0

    const/4 v3, 0x2

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 247
    iget-object v3, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->h:Landroid/database/sqlite/SQLiteDatabase;

    const-string v4, "preferences"

    const-string v5, "key=?"

    new-array v1, v1, [Ljava/lang/String;

    aput-object v0, v1, v2

    invoke-virtual {v3, v4, v5, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v2

    .line 248
    sget-object v1, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->d:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/prefs/shared/g;

    invoke-virtual {v1, v0}, Lcom/facebook/prefs/shared/g;->a(Ljava/lang/String;)V

    .line 256
    return v2

    :cond_0
    move v0, v2

    .line 245
    goto :goto_0

    .line 243
    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method private b(Landroid/net/Uri;[Landroid/content/ContentValues;)I
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 233
    .line 234
    array-length v2, p2

    move v1, v0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, p2, v0

    .line 235
    invoke-direct {p0, p1, v3}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->b(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 236
    add-int/lit8 v1, v1, 0x1

    .line 234
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 238
    :cond_0
    return v1
.end method

.method private b(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 218
    iget-object v1, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->i:Landroid/content/UriMatcher;

    invoke-virtual {v1, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 219
    const-string v0, "key"

    invoke-virtual {p2, v0}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 221
    iget-object v0, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->h:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "preferences"

    const-string v2, "key"

    invoke-virtual {v0, v1, v2, p2}, Landroid/database/sqlite/SQLiteDatabase;->replaceOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v0

    .line 222
    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_1

    .line 223
    iget-object v2, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->g:Lcom/facebook/prefs/shared/h;

    invoke-virtual {v2}, Lcom/facebook/prefs/shared/h;->d()Lcom/facebook/prefs/shared/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/prefs/shared/i;->a()Landroid/net/Uri;

    move-result-object v2

    .line 224
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 225
    sget-object v0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->d:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/g;

    const-string v2, "key"

    invoke-virtual {p2, v2}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/prefs/shared/g;->a(Ljava/lang/String;)V

    .line 226
    return-object v1

    .line 218
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 228
    :cond_1
    new-instance v0, Landroid/database/SQLException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to insert row into "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/database/SQLException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private b()Lcom/facebook/prefs/shared/g;
    .locals 2

    .prologue
    .line 184
    sget-object v0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->d:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/g;

    .line 185
    if-nez v0, :cond_0

    .line 186
    new-instance v0, Lcom/facebook/prefs/shared/g;

    invoke-direct {v0, p0}, Lcom/facebook/prefs/shared/g;-><init>(Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;)V

    .line 187
    sget-object v1, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->d:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 189
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/prefs/shared/g;->c()V

    .line 190
    return-object v0
.end method

.method private c()V
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 194
    sget-object v0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->d:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/g;

    .line 196
    :try_start_0
    invoke-virtual {v0}, Lcom/facebook/prefs/shared/g;->e()V

    .line 197
    invoke-virtual {v0}, Lcom/facebook/prefs/shared/g;->b()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/facebook/prefs/shared/g;->a()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 198
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->g:Lcom/facebook/prefs/shared/h;

    invoke-virtual {v2}, Lcom/facebook/prefs/shared/h;->c()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 199
    invoke-virtual {v0}, Lcom/facebook/prefs/shared/g;->a()Ljava/util/Set;

    move-result-object v2

    invoke-static {v2}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v2

    .line 200
    const-string v3, "prefs"

    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 201
    sget-object v3, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->a:Ljava/lang/Class;

    const-string v4, "Broadcasting changed preference keys: %s"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v2, v5, v6

    invoke-static {v3, v4, v5}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    iget-object v2, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->g:Lcom/facebook/prefs/shared/h;

    invoke-virtual {v2}, Lcom/facebook/prefs/shared/h;->e()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    .line 204
    invoke-virtual {p0}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 210
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lcom/facebook/prefs/shared/g;->b()I

    move-result v0

    if-nez v0, :cond_1

    .line 212
    sget-object v0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->d:Ljava/lang/ThreadLocal;

    invoke-virtual {v0, v7}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 215
    :cond_1
    return-void

    .line 206
    :cond_2
    :try_start_1
    invoke-virtual {p0}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->g:Lcom/facebook/prefs/shared/h;

    invoke-virtual {v3}, Lcom/facebook/prefs/shared/h;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 210
    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lcom/facebook/prefs/shared/g;->b()I

    move-result v0

    if-nez v0, :cond_3

    .line 212
    sget-object v0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->d:Ljava/lang/ThreadLocal;

    invoke-virtual {v0, v7}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_3
    throw v1
.end method

.method private d()Ljava/util/SortedMap;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/SortedMap",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v1, 0x2

    .line 335
    invoke-static {}, Lcom/google/common/a/ik;->d()Ljava/util/TreeMap;

    move-result-object v10

    .line 336
    const/4 v0, 0x3

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "key"

    aput-object v0, v2, v9

    const-string v0, "type"

    aput-object v0, v2, v8

    const-string v0, "value"

    aput-object v0, v2, v1

    .line 341
    iget-object v0, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->h:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "preferences"

    move-object v4, v3

    move-object v5, v3

    move-object v6, v3

    move-object v7, v3

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 343
    :goto_0
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 344
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 345
    const/4 v2, 0x1

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    .line 346
    packed-switch v2, :pswitch_data_0

    goto :goto_0

    .line 348
    :pswitch_0
    new-instance v2, Lcom/facebook/prefs/shared/ae;

    invoke-direct {v2, v0}, Lcom/facebook/prefs/shared/ae;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v2, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 369
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0

    .line 352
    :pswitch_1
    :try_start_1
    new-instance v2, Lcom/facebook/prefs/shared/ae;

    invoke-direct {v2, v0}, Lcom/facebook/prefs/shared/ae;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_0

    move v0, v8

    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v10, v2, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move v0, v9

    goto :goto_1

    .line 356
    :pswitch_2
    new-instance v2, Lcom/facebook/prefs/shared/ae;

    invoke-direct {v2, v0}, Lcom/facebook/prefs/shared/ae;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v2, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 360
    :pswitch_3
    new-instance v2, Lcom/facebook/prefs/shared/ae;

    invoke-direct {v2, v0}, Lcom/facebook/prefs/shared/ae;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v10, v2, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 364
    :pswitch_4
    new-instance v2, Lcom/facebook/prefs/shared/ae;

    invoke-direct {v2, v0}, Lcom/facebook/prefs/shared/ae;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getFloat(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v10, v2, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 369
    :cond_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 371
    return-object v10

    .line 346
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private declared-synchronized e()V
    .locals 4

    .prologue
    .line 378
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->f:Lcom/facebook/prefs/shared/ag;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 389
    :goto_0
    monitor-exit p0

    return-void

    .line 382
    :cond_0
    :try_start_1
    invoke-direct {p0}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->m()Lcom/facebook/prefs/shared/ag;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->f:Lcom/facebook/prefs/shared/ag;
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 383
    :catch_0
    move-exception v0

    .line 385
    :try_start_2
    sget-object v1, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->b:Lcom/facebook/debug/log/l;

    sget-object v2, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->a:Ljava/lang/Class;

    const-string v3, "Possible prefs database corruption"

    invoke-static {v1, v2, v3, v0}, Lcom/facebook/debug/log/b;->a(Lcom/facebook/debug/log/l;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 386
    invoke-virtual {p0}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "prefs_db"

    invoke-virtual {v0, v1}, Landroid/content/Context;->deleteDatabase(Ljava/lang/String;)Z

    .line 387
    invoke-direct {p0}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->m()Lcom/facebook/prefs/shared/ag;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->f:Lcom/facebook/prefs/shared/ag;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 378
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private m()Lcom/facebook/prefs/shared/ag;
    .locals 3

    .prologue
    .line 392
    const-string v0, "initializePrefsDatabase"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 393
    new-instance v1, Lcom/facebook/prefs/shared/ag;

    invoke-virtual {p0}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/facebook/prefs/shared/ag;-><init>(Landroid/content/Context;)V

    .line 394
    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ag;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 395
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    .line 396
    return-object v1
.end method


# virtual methods
.method protected a(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 180
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Update not supported"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected a(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 167
    invoke-direct {p0}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->b()Lcom/facebook/prefs/shared/g;

    move-result-object v0

    .line 169
    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->b(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v1

    .line 170
    invoke-virtual {v0}, Lcom/facebook/prefs/shared/g;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 173
    invoke-direct {p0}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->c()V

    return v1

    :catchall_0
    move-exception v0

    invoke-direct {p0}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->c()V

    throw v0
.end method

.method protected a(Landroid/net/Uri;[Landroid/content/ContentValues;)I
    .locals 2

    .prologue
    .line 155
    invoke-direct {p0}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->b()Lcom/facebook/prefs/shared/g;

    move-result-object v0

    .line 157
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->b(Landroid/net/Uri;[Landroid/content/ContentValues;)I

    move-result v1

    .line 158
    invoke-virtual {v0}, Lcom/facebook/prefs/shared/g;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    invoke-direct {p0}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->c()V

    return v1

    :catchall_0
    move-exception v0

    invoke-direct {p0}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->c()V

    throw v0
.end method

.method protected a(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 8

    .prologue
    const/4 v5, 0x0

    .line 83
    new-instance v0, Landroid/database/sqlite/SQLiteQueryBuilder;

    invoke-direct {v0}, Landroid/database/sqlite/SQLiteQueryBuilder;-><init>()V

    .line 85
    const-string v1, "preferences"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteQueryBuilder;->setTables(Ljava/lang/String;)V

    .line 86
    sget-object v1, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->c:Lcom/google/common/a/ev;

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteQueryBuilder;->setProjectionMap(Ljava/util/Map;)V

    .line 88
    iget-object v1, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->i:Landroid/content/UriMatcher;

    invoke-virtual {v1, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 105
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown URL "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 93
    :pswitch_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "_id=\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v1

    const/4 v3, 0x1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Landroid/database/DatabaseUtils;->sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteQueryBuilder;->appendWhere(Ljava/lang/CharSequence;)V

    .line 111
    :goto_0
    :pswitch_1
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 112
    const-string v7, "key DESC"

    .line 117
    :goto_1
    iget-object v1, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->h:Landroid/database/sqlite/SQLiteDatabase;

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, v5

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteQueryBuilder;->query(Landroid/database/sqlite/SQLiteDatabase;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0

    .line 99
    :pswitch_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "key=\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v1

    const/4 v3, 0x2

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Landroid/database/DatabaseUtils;->sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteQueryBuilder;->appendWhere(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    move-object v7, p5

    .line 114
    goto :goto_1

    .line 88
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method protected a(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 2

    .prologue
    .line 143
    invoke-direct {p0}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->b()Lcom/facebook/prefs/shared/g;

    move-result-object v0

    .line 145
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->b(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object v1

    .line 146
    invoke-virtual {v0}, Lcom/facebook/prefs/shared/g;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    invoke-direct {p0}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->c()V

    return-object v1

    :catchall_0
    move-exception v0

    invoke-direct {p0}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->c()V

    throw v0
.end method

.method protected a(Landroid/net/Uri;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 122
    const/4 v0, 0x0

    return-object v0
.end method

.method protected declared-synchronized a()V
    .locals 5

    .prologue
    .line 261
    monitor-enter p0

    :try_start_0
    const-string v0, "FbSharedPreferencesContentProvider.onInitialize"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 262
    invoke-virtual {p0}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v2

    .line 263
    const-class v0, Lcom/facebook/prefs/shared/ah;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ah;

    iput-object v0, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->e:Lcom/facebook/prefs/shared/ah;

    .line 264
    const-class v0, Lcom/facebook/prefs/shared/h;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/h;

    iput-object v0, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->g:Lcom/facebook/prefs/shared/h;

    .line 266
    iget-object v0, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->g:Lcom/facebook/prefs/shared/h;

    invoke-virtual {v0}, Lcom/facebook/prefs/shared/h;->a()Ljava/lang/String;

    move-result-object v0

    .line 267
    new-instance v2, Landroid/content/UriMatcher;

    const/4 v3, -0x1

    invoke-direct {v2, v3}, Landroid/content/UriMatcher;-><init>(I)V

    iput-object v2, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->i:Landroid/content/UriMatcher;

    .line 268
    iget-object v2, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->i:Landroid/content/UriMatcher;

    const-string v3, "prefs"

    const/4 v4, 0x1

    invoke-virtual {v2, v0, v3, v4}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 269
    iget-object v2, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->i:Landroid/content/UriMatcher;

    const-string v3, "prefs/#"

    const/4 v4, 0x2

    invoke-virtual {v2, v0, v3, v4}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 270
    iget-object v2, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->i:Landroid/content/UriMatcher;

    const-string v3, "prefs/key/*"

    const/4 v4, 0x3

    invoke-virtual {v2, v0, v3, v4}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 272
    invoke-direct {p0}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->e()V

    .line 274
    iget-object v0, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->f:Lcom/facebook/prefs/shared/ag;

    invoke-virtual {v0}, Lcom/facebook/prefs/shared/ag;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->h:Landroid/database/sqlite/SQLiteDatabase;

    .line 277
    const-string v0, "#maybeMigrate"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 278
    invoke-direct {p0}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->d()Ljava/util/SortedMap;

    move-result-object v2

    .line 279
    iget-object v3, p0, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->e:Lcom/facebook/prefs/shared/ah;

    invoke-virtual {v3, v2}, Lcom/facebook/prefs/shared/ah;->a(Ljava/util/Map;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 280
    invoke-direct {p0, v2}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->a(Ljava/util/SortedMap;)V

    .line 282
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    .line 283
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 284
    monitor-exit p0

    return-void

    .line 261
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected a(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
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

    .prologue
    .line 130
    invoke-direct {p0}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->b()Lcom/facebook/prefs/shared/g;

    move-result-object v0

    .line 132
    :try_start_0
    invoke-super {p0, p1}, Lcom/facebook/c/r;->a(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;

    move-result-object v1

    .line 133
    invoke-virtual {v0}, Lcom/facebook/prefs/shared/g;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    invoke-direct {p0}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->c()V

    .line 138
    return-object v1

    .line 135
    :catchall_0
    move-exception v0

    invoke-direct {p0}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->c()V

    throw v0
.end method
