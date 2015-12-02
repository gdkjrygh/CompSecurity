.class Lcom/facebook/orca/g/m;
.super Ljava/lang/Object;
.source "DbInsertThreadUsersHandler.java"


# instance fields
.field private final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private final b:Lcom/facebook/orca/g/aa;

.field private final c:Lcom/facebook/user/ac;


# direct methods
.method constructor <init>(Lcom/facebook/orca/g/aa;Lcom/facebook/user/ac;)V
    .locals 1

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const-class v0, Lcom/facebook/orca/g/m;

    iput-object v0, p0, Lcom/facebook/orca/g/m;->a:Ljava/lang/Class;

    .line 31
    iput-object p1, p0, Lcom/facebook/orca/g/m;->b:Lcom/facebook/orca/g/aa;

    .line 32
    iput-object p2, p0, Lcom/facebook/orca/g/m;->c:Lcom/facebook/user/ac;

    .line 33
    return-void
.end method


# virtual methods
.method a(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/user/User;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/orca/g/m;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 37
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 39
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 41
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 42
    const-string v4, "user_key"

    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v5

    invoke-virtual {v5}, Lcom/facebook/user/UserKey;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    invoke-virtual {v0}, Lcom/facebook/user/User;->d()Lcom/facebook/user/Name;

    move-result-object v4

    .line 44
    if-eqz v4, :cond_0

    .line 45
    const-string v5, "first_name"

    invoke-virtual {v4}, Lcom/facebook/user/Name;->getFirstName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    const-string v5, "last_name"

    invoke-virtual {v4}, Lcom/facebook/user/Name;->getLastName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    const-string v5, "name"

    invoke-virtual {v4}, Lcom/facebook/user/Name;->getDisplayName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    :cond_0
    const-string v4, "pic_big"

    invoke-virtual {v0}, Lcom/facebook/user/User;->p()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    const-string v4, "pic_square"

    invoke-virtual {v0}, Lcom/facebook/user/User;->q()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    invoke-virtual {v0}, Lcom/facebook/user/User;->s()Lcom/facebook/user/PicCropInfo;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 53
    iget-object v4, p0, Lcom/facebook/orca/g/m;->c:Lcom/facebook/user/ac;

    invoke-virtual {v0}, Lcom/facebook/user/User;->s()Lcom/facebook/user/PicCropInfo;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/facebook/user/ac;->a(Lcom/facebook/user/PicCropInfo;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v4

    .line 54
    const-string v5, "pic_crop"

    invoke-virtual {v4}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/user/User;->C()Lcom/facebook/user/LastActive;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 58
    const-string v4, "last_active"

    iget-object v5, p0, Lcom/facebook/orca/g/m;->c:Lcom/facebook/user/ac;

    invoke-virtual {v0}, Lcom/facebook/user/User;->C()Lcom/facebook/user/LastActive;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/facebook/user/ac;->a(Lcom/facebook/user/LastActive;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    :cond_2
    const-string v0, "thread_users"

    const-string v4, ""

    invoke-virtual {v1, v0, v4, v3}, Landroid/database/sqlite/SQLiteDatabase;->replaceOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 66
    :catch_0
    move-exception v0

    .line 67
    :try_start_1
    iget-object v2, p0, Lcom/facebook/orca/g/m;->a:Ljava/lang/Class;

    const-string v3, "SQLException"

    invoke-static {v2, v3, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 68
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0

    .line 65
    :cond_3
    :try_start_2
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_2
    .catch Landroid/database/SQLException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 70
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 72
    return-void
.end method
