.class public Lcom/facebook/abtest/qe/c/e;
.super Ljava/lang/Object;
.source "QuickExperimentStorage.java"


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

.field private static final c:[Ljava/lang/String;


# instance fields
.field private final d:Lcom/facebook/common/executors/a;

.field private final e:Lcom/facebook/abtest/qe/c/c;

.field private final f:Lcom/facebook/abtest/qe/protocol/sync/full/d;

.field private final g:Lcom/fasterxml/jackson/databind/ObjectMapper;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 53
    const-class v0, Lcom/facebook/abtest/qe/c/e;

    sput-object v0, Lcom/facebook/abtest/qe/c/e;->a:Ljava/lang/Class;

    .line 55
    new-instance v0, Lcom/facebook/debug/log/l;

    invoke-direct {v0}, Lcom/facebook/debug/log/l;-><init>()V

    sput-object v0, Lcom/facebook/abtest/qe/c/e;->b:Lcom/facebook/debug/log/l;

    .line 57
    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "name"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "groupName"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "hash"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "loggingEnabled"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "locale"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "customContentJSON"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "dataSource"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "meta_info"

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/abtest/qe/c/e;->c:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/common/executors/a;Lcom/facebook/abtest/qe/c/c;Lcom/facebook/abtest/qe/protocol/sync/full/d;Lcom/fasterxml/jackson/databind/ObjectMapper;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/executors/a;

    iput-object v0, p0, Lcom/facebook/abtest/qe/c/e;->d:Lcom/facebook/common/executors/a;

    .line 96
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/c/c;

    iput-object v0, p0, Lcom/facebook/abtest/qe/c/e;->e:Lcom/facebook/abtest/qe/c/c;

    .line 97
    iput-object p3, p0, Lcom/facebook/abtest/qe/c/e;->f:Lcom/facebook/abtest/qe/protocol/sync/full/d;

    .line 98
    invoke-static {p4}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    iput-object v0, p0, Lcom/facebook/abtest/qe/c/e;->g:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 99
    return-void
.end method

.method private a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Lcom/facebook/abtest/qe/c/f;)Lcom/facebook/abtest/qe/data/QuickExperimentInfo;
    .locals 11

    .prologue
    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x1

    .line 212
    .line 214
    const/4 v0, 0x2

    new-array v4, v0, [Ljava/lang/String;

    aput-object p2, v4, v9

    # getter for: Lcom/facebook/abtest/qe/c/f;->name:Ljava/lang/String;
    invoke-static {p3}, Lcom/facebook/abtest/qe/c/f;->access$000(Lcom/facebook/abtest/qe/c/f;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v8

    .line 215
    const-string v1, "experiments"

    sget-object v2, Lcom/facebook/abtest/qe/c/e;->c:[Ljava/lang/String;

    const-string v3, "name=? and dataSource=?"

    move-object v0, p1

    move-object v6, v5

    move-object v7, v5

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    .line 226
    :try_start_0
    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-le v0, v8, :cond_0

    .line 227
    sget-object v0, Lcom/facebook/abtest/qe/c/e;->b:Lcom/facebook/debug/log/l;

    sget-object v1, Lcom/facebook/abtest/qe/c/e;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Multiple entries for experiment "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v3}, Lcom/facebook/debug/log/b;->a(Lcom/facebook/debug/log/l;Ljava/lang/Class;Ljava/lang/String;)V

    .line 229
    :cond_0
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 230
    const-string v0, "name"

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 232
    const-string v0, "groupName"

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 234
    const-string v0, "hash"

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 236
    const-string v0, "loggingEnabled"

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    .line 238
    if-ne v0, v8, :cond_2

    move v1, v8

    .line 239
    :goto_1
    const-string v0, "locale"

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 241
    const-string v0, "customContentJSON"

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 244
    invoke-static {}, Lcom/google/common/a/ev;->j()Lcom/google/common/a/ev;

    move-result-object v0

    .line 245
    if-eqz v7, :cond_1

    .line 246
    invoke-virtual {p0, v7}, Lcom/facebook/abtest/qe/c/e;->b(Ljava/lang/String;)Lcom/google/common/a/ev;

    move-result-object v0

    .line 249
    :cond_1
    const-string v7, "meta_info"

    invoke-interface {v2, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    invoke-interface {v2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 251
    iget-object v10, p0, Lcom/facebook/abtest/qe/c/e;->f:Lcom/facebook/abtest/qe/protocol/sync/full/d;

    invoke-virtual {v10, v7}, Lcom/facebook/abtest/qe/protocol/sync/full/d;->a(Ljava/lang/String;)Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;

    move-result-object v7

    .line 254
    new-instance v10, Lcom/facebook/abtest/qe/data/c;

    invoke-direct {v10}, Lcom/facebook/abtest/qe/data/c;-><init>()V

    invoke-virtual {v10, v3}, Lcom/facebook/abtest/qe/data/c;->a(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/c;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/facebook/abtest/qe/data/c;->b(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/c;

    move-result-object v3

    invoke-virtual {v3, v5}, Lcom/facebook/abtest/qe/data/c;->c(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/c;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/facebook/abtest/qe/data/c;->a(Z)Lcom/facebook/abtest/qe/data/c;

    move-result-object v1

    invoke-virtual {v1, v6}, Lcom/facebook/abtest/qe/data/c;->d(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/c;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/abtest/qe/data/c;->a(Ljava/util/Map;)Lcom/facebook/abtest/qe/data/c;

    move-result-object v0

    invoke-virtual {v0, v7}, Lcom/facebook/abtest/qe/data/c;->a(Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;)Lcom/facebook/abtest/qe/data/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/data/c;->a()Lcom/facebook/abtest/qe/data/QuickExperimentInfo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v5

    goto/16 :goto_0

    :cond_2
    move v1, v9

    .line 238
    goto :goto_1

    .line 265
    :cond_3
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 268
    return-object v5

    .line 265
    :catchall_0
    move-exception v0

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    throw v0
.end method

.method private a(Landroid/database/sqlite/SQLiteDatabase;Lcom/facebook/abtest/qe/data/QuickExperimentInfo;Lcom/facebook/abtest/qe/c/f;)V
    .locals 4

    .prologue
    .line 281
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 282
    const-string v0, "name"

    invoke-virtual {p2}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    const-string v0, "groupName"

    invoke-virtual {p2}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    const-string v0, "hash"

    invoke-virtual {p2}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    const-string v2, "loggingEnabled"

    invoke-virtual {p2}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 290
    const-string v0, "locale"

    invoke-virtual {p2}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 292
    invoke-virtual {p2}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->f()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/c/e;->a(Lcom/google/common/a/ev;)Ljava/lang/String;

    move-result-object v0

    .line 293
    const-string v2, "customContentJSON"

    invoke-virtual {v1, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    const-string v0, "dataSource"

    # getter for: Lcom/facebook/abtest/qe/c/f;->name:Ljava/lang/String;
    invoke-static {p3}, Lcom/facebook/abtest/qe/c/f;->access$000(Lcom/facebook/abtest/qe/c/f;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 297
    invoke-virtual {p2}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->g()Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;

    move-result-object v0

    .line 298
    if-eqz v0, :cond_0

    .line 299
    const-string v2, "meta_info"

    iget-object v3, p0, Lcom/facebook/abtest/qe/c/e;->f:Lcom/facebook/abtest/qe/protocol/sync/full/d;

    invoke-virtual {v3, v0}, Lcom/facebook/abtest/qe/protocol/sync/full/d;->a(Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    :cond_0
    const-string v0, "experiments"

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1}, Landroid/database/sqlite/SQLiteDatabase;->replace(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 303
    return-void

    .line 288
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/lang/String;Lcom/facebook/abtest/qe/c/f;)Lcom/facebook/abtest/qe/data/QuickExperimentInfo;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .prologue
    .line 127
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    iget-object v0, p0, Lcom/facebook/abtest/qe/c/e;->e:Lcom/facebook/abtest/qe/c/c;

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/c/c;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 130
    invoke-direct {p0, v0, p1, p2}, Lcom/facebook/abtest/qe/c/e;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Lcom/facebook/abtest/qe/c/f;)Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    move-result-object v0

    .line 135
    if-eqz v0, :cond_0

    .line 138
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method a(Lcom/google/common/a/ev;)Ljava/lang/String;
    .locals 5
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 333
    :try_start_0
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 334
    iget-object v0, p0, Lcom/facebook/abtest/qe/c/e;->g:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;->getJsonFactory()Lcom/fasterxml/jackson/core/JsonFactory;

    move-result-object v0

    sget-object v1, Lcom/fasterxml/jackson/core/JsonEncoding;->UTF8:Lcom/fasterxml/jackson/core/JsonEncoding;

    invoke-virtual {v0, v2, v1}, Lcom/fasterxml/jackson/core/JsonFactory;->createJsonGenerator(Ljava/io/OutputStream;Lcom/fasterxml/jackson/core/JsonEncoding;)Lcom/fasterxml/jackson/core/JsonGenerator;

    move-result-object v3

    .line 336
    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartObject()V

    .line 337
    if-eqz p1, :cond_0

    .line 338
    invoke-virtual {p1}, Lcom/google/common/a/ev;->a()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 339
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3, v1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 346
    :catch_0
    move-exception v0

    .line 347
    sget-object v1, Lcom/facebook/abtest/qe/c/e;->a:Ljava/lang/Class;

    const-string v2, "Unable to store QE data"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 349
    const-string v0, "{}"

    :goto_1
    return-object v0

    .line 342
    :cond_0
    :try_start_1
    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    .line 344
    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/JsonGenerator;->close()V

    .line 345
    new-instance v0, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method

.method public a(Lcom/facebook/abtest/qe/c/f;)Ljava/util/Set;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/abtest/qe/c/f;",
            ")",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/abtest/qe/data/QuickExperimentInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 147
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/abtest/qe/c/e;->d:Lcom/facebook/common/executors/a;

    invoke-interface {v2}, Lcom/facebook/common/executors/a;->b()V

    .line 149
    const-string v2, "QuickExperimentStorage.loadAllQuickExperimentInfo"

    invoke-static {v2}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v10

    .line 151
    const/4 v2, 0x1

    new-array v6, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    # getter for: Lcom/facebook/abtest/qe/c/f;->name:Ljava/lang/String;
    invoke-static/range {p1 .. p1}, Lcom/facebook/abtest/qe/c/f;->access$000(Lcom/facebook/abtest/qe/c/f;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v6, v2

    .line 152
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/abtest/qe/c/e;->e:Lcom/facebook/abtest/qe/c/c;

    invoke-virtual {v2}, Lcom/facebook/abtest/qe/c/c;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    const-string v3, "experiments"

    sget-object v4, Lcom/facebook/abtest/qe/c/e;->c:[Ljava/lang/String;

    const-string v5, "dataSource=?"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-virtual/range {v2 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3

    .line 162
    invoke-static {}, Lcom/google/common/a/fi;->e()Lcom/google/common/a/fk;

    move-result-object v4

    .line 165
    :try_start_0
    const-string v2, "name"

    invoke-interface {v3, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    .line 166
    const-string v2, "groupName"

    invoke-interface {v3, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v6

    .line 168
    const-string v2, "hash"

    invoke-interface {v3, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    .line 170
    const-string v2, "loggingEnabled"

    invoke-interface {v3, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    .line 172
    const-string v2, "locale"

    invoke-interface {v3, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    .line 174
    const-string v2, "customContentJSON"

    invoke-interface {v3, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v11

    .line 176
    const-string v2, "meta_info"

    invoke-interface {v3, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    .line 179
    :goto_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 180
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 181
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v14

    .line 182
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v15

    .line 183
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    .line 184
    const/16 v16, 0x1

    move/from16 v0, v16

    if-ne v2, v0, :cond_0

    const/4 v2, 0x1

    .line 185
    :goto_1
    invoke-interface {v3, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v16

    .line 186
    invoke-interface {v3, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/facebook/abtest/qe/c/e;->b(Ljava/lang/String;)Lcom/google/common/a/ev;

    move-result-object v17

    .line 188
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/facebook/abtest/qe/c/e;->f:Lcom/facebook/abtest/qe/protocol/sync/full/d;

    move-object/from16 v18, v0

    invoke-interface {v3, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v19

    invoke-virtual/range {v18 .. v19}, Lcom/facebook/abtest/qe/protocol/sync/full/d;->a(Ljava/lang/String;)Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;

    move-result-object v18

    .line 190
    new-instance v19, Lcom/facebook/abtest/qe/data/c;

    invoke-direct/range {v19 .. v19}, Lcom/facebook/abtest/qe/data/c;-><init>()V

    move-object/from16 v0, v19

    invoke-virtual {v0, v13}, Lcom/facebook/abtest/qe/data/c;->a(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/c;

    move-result-object v13

    invoke-virtual {v13, v14}, Lcom/facebook/abtest/qe/data/c;->b(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/c;

    move-result-object v13

    invoke-virtual {v13, v15}, Lcom/facebook/abtest/qe/data/c;->c(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/c;

    move-result-object v13

    invoke-virtual {v13, v2}, Lcom/facebook/abtest/qe/data/c;->a(Z)Lcom/facebook/abtest/qe/data/c;

    move-result-object v2

    move-object/from16 v0, v16

    invoke-virtual {v2, v0}, Lcom/facebook/abtest/qe/data/c;->d(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/c;

    move-result-object v2

    move-object/from16 v0, v17

    invoke-virtual {v2, v0}, Lcom/facebook/abtest/qe/data/c;->a(Ljava/util/Map;)Lcom/facebook/abtest/qe/data/c;

    move-result-object v2

    move-object/from16 v0, v18

    invoke-virtual {v2, v0}, Lcom/facebook/abtest/qe/data/c;->a(Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;)Lcom/facebook/abtest/qe/data/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/abtest/qe/data/c;->a()Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    move-result-object v2

    invoke-virtual {v4, v2}, Lcom/google/common/a/fk;->b(Ljava/lang/Object;)Lcom/google/common/a/fk;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 202
    :catchall_0
    move-exception v2

    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 203
    sget-object v3, Lcom/facebook/abtest/qe/c/e;->a:Ljava/lang/Class;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Loading all quick experiment info took "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v10}, Lcom/facebook/debug/d/e;->a()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " ms."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    throw v2

    .line 184
    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    .line 202
    :cond_1
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 203
    sget-object v2, Lcom/facebook/abtest/qe/c/e;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Loading all quick experiment info took "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v10}, Lcom/facebook/debug/d/e;->a()J

    move-result-wide v5

    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, " ms."

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 206
    invoke-virtual {v4}, Lcom/google/common/a/fk;->b()Lcom/google/common/a/fi;

    move-result-object v2

    return-object v2
.end method

.method public a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 322
    iget-object v0, p0, Lcom/facebook/abtest/qe/c/e;->e:Lcom/facebook/abtest/qe/c/c;

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/c/c;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "experiments"

    invoke-virtual {v0, v1, v2, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 327
    return-void
.end method

.method public a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;Lcom/facebook/abtest/qe/c/f;)V
    .locals 2

    .prologue
    .line 107
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    iget-object v0, p0, Lcom/facebook/abtest/qe/c/e;->e:Lcom/facebook/abtest/qe/c/c;

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/c/c;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 110
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 112
    :try_start_0
    invoke-direct {p0, v0, p1, p2}, Lcom/facebook/abtest/qe/c/e;->a(Landroid/database/sqlite/SQLiteDatabase;Lcom/facebook/abtest/qe/data/QuickExperimentInfo;Lcom/facebook/abtest/qe/c/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 115
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 117
    return-void

    .line 114
    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 115
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v1
.end method

.method public a(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 312
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 314
    iget-object v1, p0, Lcom/facebook/abtest/qe/c/e;->e:Lcom/facebook/abtest/qe/c/c;

    invoke-virtual {v1}, Lcom/facebook/abtest/qe/c/c;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "experiments"

    const-string v3, "name=?"

    invoke-virtual {v1, v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 319
    return-void
.end method

.method b(Ljava/lang/String;)Lcom/google/common/a/ev;
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 354
    if-nez p1, :cond_0

    .line 355
    invoke-static {}, Lcom/google/common/a/ev;->j()Lcom/google/common/a/ev;

    move-result-object v0

    .line 374
    :goto_0
    return-object v0

    .line 358
    :cond_0
    new-instance v1, Lcom/google/common/a/ew;

    invoke-direct {v1}, Lcom/google/common/a/ew;-><init>()V

    .line 361
    :try_start_0
    iget-object v0, p0, Lcom/facebook/abtest/qe/c/e;->g:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;->getJsonFactory()Lcom/fasterxml/jackson/core/JsonFactory;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonFactory;->createJsonParser(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object v0

    .line 362
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    .line 363
    :goto_1
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v2

    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->END_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v2, v3, :cond_1

    .line 364
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentName()Ljava/lang/String;

    move-result-object v2

    .line 365
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    .line 366
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;
    :try_end_0
    .catch Lcom/fasterxml/jackson/core/JsonParseException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_1

    .line 368
    :catch_0
    move-exception v0

    .line 369
    sget-object v2, Lcom/facebook/abtest/qe/c/e;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error parsing "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 374
    :cond_1
    :goto_2
    invoke-virtual {v1}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    goto :goto_0

    .line 370
    :catch_1
    move-exception v0

    .line 371
    sget-object v2, Lcom/facebook/abtest/qe/c/e;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error parsing "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_2
.end method
