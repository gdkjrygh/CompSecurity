.class Lcom/facebook/orca/g/j;
.super Ljava/lang/Object;
.source "DbFetchThreadUsersHandler.java"


# static fields
.field private static final d:[Ljava/lang/String;


# instance fields
.field private final a:Lcom/facebook/orca/g/aa;

.field private final b:Lcom/facebook/user/ac;

.field private final c:Lcom/fasterxml/jackson/databind/ObjectMapper;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 49
    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "user_key"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "first_name"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "last_name"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "name"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "pic_big"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "pic_square"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "pic_crop"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "last_active"

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/orca/g/j;->d:[Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Lcom/facebook/orca/g/aa;Lcom/facebook/user/ac;Lcom/fasterxml/jackson/databind/ObjectMapper;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/facebook/orca/g/j;->a:Lcom/facebook/orca/g/aa;

    .line 41
    iput-object p2, p0, Lcom/facebook/orca/g/j;->b:Lcom/facebook/user/ac;

    .line 42
    iput-object p3, p0, Lcom/facebook/orca/g/j;->c:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 43
    return-void
.end method


# virtual methods
.method a(Ljava/util/Collection;)Lcom/google/common/a/es;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/user/UserKey;",
            ">;)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    .line 61
    const-string v0, "DbFetchThreadUsersHandler.doThreadUsersQuery"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v8

    .line 62
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v9

    .line 66
    if-eqz p1, :cond_3

    .line 67
    invoke-static {p1}, Lcom/facebook/user/UserKey;->a(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    .line 68
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "user_key IN "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v0}, Lcom/facebook/common/w/k;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 70
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/g/j;->a:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 71
    const-string v1, "thread_users"

    sget-object v2, Lcom/facebook/orca/g/j;->d:[Ljava/lang/String;

    move-object v5, v4

    move-object v6, v4

    move-object v7, v4

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    .line 73
    :goto_1
    :try_start_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 74
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/user/UserKey;->a(Ljava/lang/String;)Lcom/facebook/user/UserKey;

    move-result-object v3

    .line 75
    new-instance v5, Lcom/facebook/user/Name;

    const/4 v0, 0x1

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-interface {v2, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v6, 0x3

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v0, v1, v6}, Lcom/facebook/user/Name;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    const/4 v0, 0x6

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 80
    iget-object v0, p0, Lcom/facebook/orca/g/j;->c:Lcom/fasterxml/jackson/databind/ObjectMapper;

    const/4 v1, 0x6

    invoke-interface {v2, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 81
    iget-object v1, p0, Lcom/facebook/orca/g/j;->b:Lcom/facebook/user/ac;

    invoke-virtual {v1, v0}, Lcom/facebook/user/ac;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/user/PicCropInfo;

    move-result-object v0

    move-object v1, v0

    .line 85
    :goto_2
    const/4 v0, 0x7

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 86
    iget-object v0, p0, Lcom/facebook/orca/g/j;->c:Lcom/fasterxml/jackson/databind/ObjectMapper;

    const/4 v6, 0x7

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 87
    iget-object v6, p0, Lcom/facebook/orca/g/j;->b:Lcom/facebook/user/ac;

    invoke-virtual {v6, v0}, Lcom/facebook/user/ac;->f(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/user/LastActive;

    move-result-object v0

    .line 90
    :goto_3
    new-instance v6, Lcom/facebook/user/o;

    invoke-direct {v6}, Lcom/facebook/user/o;-><init>()V

    invoke-virtual {v3}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v7

    invoke-virtual {v3}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6, v7, v10}, Lcom/facebook/user/o;->a(Lcom/facebook/user/n;Ljava/lang/String;)Lcom/facebook/user/o;

    move-result-object v6

    invoke-virtual {v6, v5}, Lcom/facebook/user/o;->a(Lcom/facebook/user/Name;)Lcom/facebook/user/o;

    move-result-object v5

    const/4 v6, 0x4

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/facebook/user/o;->c(Ljava/lang/String;)Lcom/facebook/user/o;

    move-result-object v5

    const/4 v6, 0x5

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/facebook/user/o;->b(Ljava/lang/String;)Lcom/facebook/user/o;

    move-result-object v5

    invoke-virtual {v5, v1}, Lcom/facebook/user/o;->a(Lcom/facebook/user/PicCropInfo;)Lcom/facebook/user/o;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/user/o;->a(Lcom/facebook/user/LastActive;)Lcom/facebook/user/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/o;->x()Lcom/facebook/user/User;

    move-result-object v0

    .line 98
    invoke-interface {v9, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_1

    .line 102
    :catchall_0
    move-exception v0

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 103
    invoke-virtual {v8}, Lcom/facebook/debug/d/e;->a()J

    throw v0

    .line 100
    :cond_0
    :try_start_1
    invoke-interface {v9}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 102
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 103
    invoke-virtual {v8}, Lcom/facebook/debug/d/e;->a()J

    return-object v0

    :cond_1
    move-object v0, v4

    goto :goto_3

    :cond_2
    move-object v1, v4

    goto :goto_2

    :cond_3
    move-object v3, v4

    goto/16 :goto_0
.end method
