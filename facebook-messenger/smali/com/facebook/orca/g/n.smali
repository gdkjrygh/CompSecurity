.class Lcom/facebook/orca/g/n;
.super Ljava/lang/Object;
.source "DbInsertThreadsHandler.java"


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

.field private final c:Lcom/facebook/orca/g/y;

.field private final d:Lcom/facebook/orca/g/h;

.field private final e:Lcom/facebook/orca/g/k;

.field private final f:Lcom/facebook/orca/g/r;

.field private final g:Lcom/facebook/orca/g/a;

.field private final h:Lcom/facebook/orca/g/w;

.field private final i:Lcom/facebook/orca/g/f;

.field private final j:Lcom/facebook/orca/g/q;

.field private final k:Lcom/facebook/orca/g/o;

.field private final l:Lcom/facebook/orca/g/g;

.field private final m:Lcom/facebook/orca/threads/i;

.field private final n:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Lcom/facebook/orca/threads/x;


# direct methods
.method constructor <init>(Lcom/facebook/orca/g/aa;Lcom/facebook/orca/g/y;Lcom/facebook/orca/g/h;Lcom/facebook/orca/g/k;Lcom/facebook/orca/g/r;Lcom/facebook/orca/g/a;Lcom/facebook/orca/g/w;Lcom/facebook/orca/g/f;Lcom/facebook/orca/g/q;Lcom/facebook/orca/g/o;Lcom/facebook/orca/g/g;Lcom/facebook/orca/threads/i;Ljavax/inject/a;Lcom/facebook/orca/threads/x;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/g/aa;",
            "Lcom/facebook/orca/g/y;",
            "Lcom/facebook/orca/g/h;",
            "Lcom/facebook/orca/g/k;",
            "Lcom/facebook/orca/g/r;",
            "Lcom/facebook/orca/g/a;",
            "Lcom/facebook/orca/g/w;",
            "Lcom/facebook/orca/g/f;",
            "Lcom/facebook/orca/g/q;",
            "Lcom/facebook/orca/g/o;",
            "Lcom/facebook/orca/g/g;",
            "Lcom/facebook/orca/threads/i;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/User;",
            ">;",
            "Lcom/facebook/orca/threads/x;",
            ")V"
        }
    .end annotation

    .prologue
    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    const-class v0, Lcom/facebook/orca/g/n;

    iput-object v0, p0, Lcom/facebook/orca/g/n;->a:Ljava/lang/Class;

    .line 99
    iput-object p1, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    .line 100
    iput-object p2, p0, Lcom/facebook/orca/g/n;->c:Lcom/facebook/orca/g/y;

    .line 101
    iput-object p3, p0, Lcom/facebook/orca/g/n;->d:Lcom/facebook/orca/g/h;

    .line 102
    iput-object p4, p0, Lcom/facebook/orca/g/n;->e:Lcom/facebook/orca/g/k;

    .line 103
    iput-object p5, p0, Lcom/facebook/orca/g/n;->f:Lcom/facebook/orca/g/r;

    .line 104
    iput-object p6, p0, Lcom/facebook/orca/g/n;->g:Lcom/facebook/orca/g/a;

    .line 105
    iput-object p7, p0, Lcom/facebook/orca/g/n;->h:Lcom/facebook/orca/g/w;

    .line 106
    iput-object p8, p0, Lcom/facebook/orca/g/n;->i:Lcom/facebook/orca/g/f;

    .line 107
    iput-object p9, p0, Lcom/facebook/orca/g/n;->j:Lcom/facebook/orca/g/q;

    .line 108
    iput-object p10, p0, Lcom/facebook/orca/g/n;->k:Lcom/facebook/orca/g/o;

    .line 109
    iput-object p11, p0, Lcom/facebook/orca/g/n;->l:Lcom/facebook/orca/g/g;

    .line 110
    iput-object p12, p0, Lcom/facebook/orca/g/n;->m:Lcom/facebook/orca/threads/i;

    .line 111
    iput-object p13, p0, Lcom/facebook/orca/g/n;->n:Ljavax/inject/a;

    .line 112
    iput-object p14, p0, Lcom/facebook/orca/g/n;->o:Lcom/facebook/orca/threads/x;

    .line 113
    return-void
.end method

.method private a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/ThreadSummary;)Landroid/content/ContentValues;
    .locals 4

    .prologue
    .line 912
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 913
    const-string v1, "folder"

    invoke-virtual {p1}, Lcom/facebook/orca/threads/FolderName;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 914
    const-string v1, "thread_id"

    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 915
    const-string v1, "timestamp_ms"

    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadSummary;->l()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 916
    return-object v0
.end method

.method private a(Lcom/facebook/orca/threads/ThreadParticipant;ZJLjava/lang/String;)Lcom/facebook/orca/threads/ThreadParticipant;
    .locals 1

    .prologue
    .line 669
    new-instance v0, Lcom/facebook/orca/threads/p;

    invoke-direct {v0}, Lcom/facebook/orca/threads/p;-><init>()V

    .line 670
    invoke-virtual {v0, p1}, Lcom/facebook/orca/threads/p;->a(Lcom/facebook/orca/threads/ThreadParticipant;)V

    .line 671
    if-eqz p2, :cond_0

    .line 672
    invoke-virtual {v0, p3, p4}, Lcom/facebook/orca/threads/p;->a(J)Lcom/facebook/orca/threads/p;

    .line 676
    :goto_0
    invoke-virtual {v0}, Lcom/facebook/orca/threads/p;->f()Lcom/facebook/orca/threads/ThreadParticipant;

    move-result-object v0

    return-object v0

    .line 674
    :cond_0
    invoke-virtual {v0, p5}, Lcom/facebook/orca/threads/p;->b(Ljava/lang/String;)Lcom/facebook/orca/threads/p;

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threads/ThreadSummary;
    .locals 2

    .prologue
    .line 983
    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadSummary;->z()Lcom/facebook/orca/compose/MessageDraft;

    move-result-object v0

    .line 984
    if-nez v0, :cond_0

    .line 990
    :goto_0
    return-object p1

    .line 987
    :cond_0
    new-instance v1, Lcom/facebook/orca/threads/v;

    invoke-direct {v1}, Lcom/facebook/orca/threads/v;-><init>()V

    invoke-virtual {v1, p1}, Lcom/facebook/orca/threads/v;->a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threads/v;

    move-result-object v1

    .line 989
    invoke-virtual {v1, v0}, Lcom/facebook/orca/threads/v;->a(Lcom/facebook/orca/compose/MessageDraft;)Lcom/facebook/orca/threads/v;

    .line 990
    invoke-virtual {v1}, Lcom/facebook/orca/threads/v;->z()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object p1

    goto :goto_0
.end method

.method private a(Ljava/util/Set;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 806
    iget-object v0, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 807
    invoke-direct {p0, p1}, Lcom/facebook/orca/g/n;->c(Ljava/util/Set;)Ljava/util/Map;

    move-result-object v1

    .line 809
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "msg_id IN "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Lcom/facebook/common/w/k;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 810
    const-string v3, "messages"

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v2, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 811
    return-object v1
.end method

.method private a(Lcom/facebook/messages/model/threads/Message;Z)V
    .locals 4

    .prologue
    .line 1038
    new-instance v0, Lcom/facebook/orca/threads/MessagesCollection;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/orca/threads/MessagesCollection;-><init>(Ljava/lang/String;Lcom/google/common/a/es;Z)V

    invoke-direct {p0, v0, p2}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/threads/MessagesCollection;Z)V

    .line 1040
    return-void
.end method

.method private a(Lcom/facebook/orca/threads/FolderName;)V
    .locals 6

    .prologue
    .line 699
    iget-object v0, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 700
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 702
    :try_start_0
    const-string v0, "folders"

    const-string v2, "folder=?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {p1}, Lcom/facebook/orca/threads/FolderName;->b()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 703
    iget-object v0, p0, Lcom/facebook/orca/g/n;->c:Lcom/facebook/orca/g/y;

    sget-object v2, Lcom/facebook/orca/g/s;->b:Lcom/facebook/orca/g/x;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/g/y;->c(Lcom/facebook/common/s/a;)V

    .line 704
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 709
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 711
    return-void

    .line 705
    :catch_0
    move-exception v0

    .line 706
    :try_start_1
    iget-object v2, p0, Lcom/facebook/orca/g/n;->a:Ljava/lang/Class;

    const-string v3, "SQLException"

    invoke-static {v2, v3, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 707
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 709
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
.end method

.method private a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/ThreadsCollection;)V
    .locals 5

    .prologue
    .line 867
    iget-object v0, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 868
    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadsCollection;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    .line 869
    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/ThreadSummary;)Landroid/content/ContentValues;

    move-result-object v0

    .line 870
    const-string v3, "folders"

    const-string v4, ""

    invoke-virtual {v1, v3, v4, v0}, Landroid/database/sqlite/SQLiteDatabase;->replaceOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    goto :goto_0

    .line 873
    :cond_0
    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadsCollection;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 874
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 875
    const-string v2, "folder"

    invoke-virtual {p1}, Lcom/facebook/orca/threads/FolderName;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 876
    const-string v2, "thread_id"

    invoke-static {p1}, Lcom/facebook/orca/g/l;->a(Lcom/facebook/orca/threads/FolderName;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 877
    const-string v2, "timestamp_ms"

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 878
    const-string v2, "folders"

    const-string v3, ""

    invoke-virtual {v1, v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->replaceOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 880
    :cond_1
    return-void
.end method

.method private a(Lcom/facebook/orca/threads/FolderName;Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 714
    iget-object v0, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 715
    const-string v1, "folders"

    const-string v2, "folder=? AND thread_id=?"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {p1}, Lcom/facebook/orca/threads/FolderName;->b()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    aput-object p2, v3, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 720
    return-void
.end method

.method private a(Lcom/facebook/orca/threads/MessagesCollection;)V
    .locals 1

    .prologue
    .line 1043
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/threads/MessagesCollection;Z)V

    .line 1044
    return-void
.end method

.method private a(Lcom/facebook/orca/threads/MessagesCollection;Z)V
    .locals 15

    .prologue
    .line 1048
    iget-object v1, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v1}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    .line 1049
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 1051
    :try_start_0
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v2

    .line 1052
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v4

    .line 1053
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v5

    .line 1054
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v6

    .line 1055
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v7

    .line 1056
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/orca/threads/MessagesCollection;->b()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_0
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/messages/model/threads/Message;

    .line 1057
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v7, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1058
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->y()Z

    move-result v9

    if-eqz v9, :cond_1

    .line 1059
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v2, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1061
    :cond_1
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->x()Z

    move-result v9

    if-eqz v9, :cond_2

    .line 1062
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v4, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1063
    invoke-direct {p0, v1}, Lcom/facebook/orca/g/n;->c(Lcom/facebook/messages/model/threads/Message;)Z

    move-result v9

    if-eqz v9, :cond_0

    .line 1064
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 1179
    :catchall_0
    move-exception v1

    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v1

    .line 1066
    :cond_2
    :try_start_1
    invoke-direct {p0, v1}, Lcom/facebook/orca/g/n;->c(Lcom/facebook/messages/model/threads/Message;)Z

    move-result v9

    if-eqz v9, :cond_0

    .line 1067
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1072
    :cond_3
    invoke-direct {p0, v6}, Lcom/facebook/orca/g/n;->c(Ljava/util/Set;)Ljava/util/Map;

    move-result-object v6

    .line 1076
    invoke-interface {v6}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v5, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 1079
    invoke-direct {p0, v5}, Lcom/facebook/orca/g/n;->d(Ljava/util/Set;)Ljava/util/Map;

    move-result-object v8

    .line 1083
    invoke-direct {p0, v5}, Lcom/facebook/orca/g/n;->e(Ljava/util/Set;)Ljava/util/Map;

    move-result-object v9

    .line 1087
    invoke-direct {p0, v5}, Lcom/facebook/orca/g/n;->f(Ljava/util/Set;)Ljava/util/Map;

    move-result-object v5

    .line 1091
    invoke-direct {p0, v7}, Lcom/facebook/orca/g/n;->b(Ljava/util/Set;)Ljava/util/Map;

    move-result-object v7

    .line 1095
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    .line 1096
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "offline_threading_id IN "

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v4}, Lcom/facebook/common/w/k;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1098
    iget-object v4, p0, Lcom/facebook/orca/g/n;->a:Ljava/lang/Class;

    const-string v10, "Deleting messsages WHERE %s"

    const/4 v11, 0x1

    new-array v11, v11, [Ljava/lang/Object;

    const/4 v12, 0x0

    aput-object v1, v11, v12

    invoke-static {v4, v10, v11}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1099
    const-string v4, "messages"

    const/4 v10, 0x0

    invoke-virtual {v3, v4, v1, v10}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 1103
    :cond_4
    invoke-direct {p0, v2}, Lcom/facebook/orca/g/n;->g(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v4

    .line 1105
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/orca/threads/MessagesCollection;->b()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_5
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/messages/model/threads/Message;

    .line 1107
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v9, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v2

    if-eqz v2, :cond_9

    .line 1110
    :try_start_2
    iget-object v11, p0, Lcom/facebook/orca/g/n;->k:Lcom/facebook/orca/g/o;

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v9, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v11, v2}, Lcom/facebook/orca/g/o;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 1112
    new-instance v11, Lcom/facebook/messages/model/threads/e;

    invoke-direct {v11}, Lcom/facebook/messages/model/threads/e;-><init>()V

    invoke-virtual {v11, v1}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/threads/e;

    move-result-object v11

    invoke-virtual {v11, v2}, Lcom/facebook/messages/model/threads/e;->e(Ljava/util/List;)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/e;->B()Lcom/facebook/messages/model/threads/Message;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v1

    move-object v2, v1

    .line 1122
    :goto_2
    :try_start_3
    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result v1

    if-eqz v1, :cond_a

    .line 1125
    :try_start_4
    iget-object v11, p0, Lcom/facebook/orca/g/n;->h:Lcom/facebook/orca/g/w;

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v11, v1}, Lcom/facebook/orca/g/w;->a(Ljava/lang/String;)Lcom/google/common/a/es;

    move-result-object v1

    .line 1127
    new-instance v11, Lcom/facebook/messages/model/threads/e;

    invoke-direct {v11}, Lcom/facebook/messages/model/threads/e;-><init>()V

    invoke-virtual {v11, v2}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/threads/e;

    move-result-object v11

    invoke-virtual {v11, v1}, Lcom/facebook/messages/model/threads/e;->f(Ljava/util/List;)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/e;->B()Lcom/facebook/messages/model/threads/Message;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result-object v1

    .line 1136
    :goto_3
    :try_start_5
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    .line 1141
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->x()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v6, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 1143
    new-instance v2, Lcom/facebook/messages/model/threads/e;

    invoke-direct {v2}, Lcom/facebook/messages/model/threads/e;-><init>()V

    invoke-virtual {v2, v1}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v2, v1}, Lcom/facebook/messages/model/threads/e;->e(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/e;->B()Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    .line 1150
    :cond_6
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v11

    const-wide/16 v13, 0x0

    cmp-long v2, v11, v13

    if-nez v2, :cond_7

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->x()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v8, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 1153
    new-instance v2, Lcom/facebook/messages/model/threads/e;

    invoke-direct {v2}, Lcom/facebook/messages/model/threads/e;-><init>()V

    invoke-virtual {v2, v1}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v8, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    invoke-virtual {v2, v11, v12}, Lcom/facebook/messages/model/threads/e;->b(J)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/e;->B()Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    .line 1160
    :cond_7
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v7, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 1161
    new-instance v2, Lcom/facebook/messages/model/threads/e;

    invoke-direct {v2}, Lcom/facebook/messages/model/threads/e;-><init>()V

    invoke-virtual {v2, v1}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    invoke-virtual {v2, v11, v12}, Lcom/facebook/messages/model/threads/e;->d(J)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/e;->B()Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    .line 1167
    :cond_8
    move/from16 v0, p2

    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/g/n;->b(Lcom/facebook/messages/model/threads/Message;Z)V

    goto/16 :goto_1

    .line 1116
    :catch_0
    move-exception v2

    .line 1117
    iget-object v2, p0, Lcom/facebook/orca/g/n;->a:Ljava/lang/Class;

    const-string v11, "Preserving of the prior pendingSetnAttachment failed"

    invoke-static {v2, v11}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    :cond_9
    move-object v2, v1

    goto/16 :goto_2

    .line 1131
    :catch_1
    move-exception v1

    .line 1132
    iget-object v1, p0, Lcom/facebook/orca/g/n;->a:Ljava/lang/Class;

    const-string v11, "Preserving of the prior pendingSendShares failed"

    invoke-static {v1, v11}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    :cond_a
    move-object v1, v2

    goto/16 :goto_3

    .line 1169
    :cond_b
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/orca/threads/MessagesCollection;->d()Z

    move-result v1

    if-eqz v1, :cond_c

    .line 1170
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/orca/threads/MessagesCollection;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/facebook/orca/g/n;->g(Ljava/lang/String;)Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    .line 1171
    move/from16 v0, p2

    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/g/n;->b(Lcom/facebook/messages/model/threads/Message;Z)V

    .line 1177
    :cond_c
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 1179
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 1181
    return-void
.end method

.method private a(Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 7

    .prologue
    .line 883
    iget-object v0, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 884
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->y()Lcom/facebook/orca/threads/FolderName;

    move-result-object v1

    .line 885
    invoke-direct {p0, v1, p1}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/ThreadSummary;)Landroid/content/ContentValues;

    move-result-object v2

    .line 886
    iget-object v3, p0, Lcom/facebook/orca/g/n;->e:Lcom/facebook/orca/g/k;

    invoke-virtual {v3, v1}, Lcom/facebook/orca/g/k;->a(Lcom/facebook/orca/threads/FolderName;)J

    move-result-wide v3

    .line 901
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->l()J

    move-result-wide v5

    cmp-long v1, v5, v3

    if-ltz v1, :cond_0

    .line 902
    const-string v1, "folders"

    const-string v3, ""

    invoke-virtual {v0, v1, v3, v2}, Landroid/database/sqlite/SQLiteDatabase;->replaceOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 907
    :goto_0
    return-void

    .line 905
    :cond_0
    const-string v1, "folders"

    const-string v2, "thread_id=?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/threads/ThreadSummary;J)V
    .locals 5

    .prologue
    .line 922
    invoke-direct {p0, p1}, Lcom/facebook/orca/g/n;->b(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v1

    .line 924
    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 925
    const-string v0, "thread_id"

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 926
    const-string v0, "thread_fbid"

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 927
    const-string v0, "action_id"

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->c()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 928
    const-string v0, "refetch_action_id"

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->d()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 929
    const-string v0, "last_visible_action_id"

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->e()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 930
    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 931
    const-string v0, "name"

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 933
    :cond_0
    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->r()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 934
    const-string v0, "pic_hash"

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->q()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 936
    :cond_1
    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->t()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 937
    const-string v0, "pic"

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->s()Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 939
    :cond_2
    const-string v0, "participants"

    iget-object v3, p0, Lcom/facebook/orca/g/n;->f:Lcom/facebook/orca/g/r;

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->j()Lcom/google/common/a/es;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/orca/g/r;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 941
    const-string v0, "former_participants"

    iget-object v3, p0, Lcom/facebook/orca/g/n;->f:Lcom/facebook/orca/g/r;

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->B()Lcom/google/common/a/es;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/orca/g/r;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 943
    const-string v0, "object_participants"

    iget-object v3, p0, Lcom/facebook/orca/g/n;->f:Lcom/facebook/orca/g/r;

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->k()Lcom/google/common/a/es;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/orca/g/r;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 946
    const-string v0, "senders"

    iget-object v3, p0, Lcom/facebook/orca/g/n;->f:Lcom/facebook/orca/g/r;

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->m()Lcom/google/common/a/es;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/orca/g/r;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 948
    const-string v3, "single_recipient_thread"

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->h()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 950
    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->h()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 951
    const-string v0, "single_recipient_user_key"

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->i()Lcom/facebook/user/UserKey;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/user/UserKey;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 953
    :cond_3
    const-string v0, "snippet"

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->n()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 954
    const-string v0, "snippet_sender"

    iget-object v3, p0, Lcom/facebook/orca/g/n;->f:Lcom/facebook/orca/g/r;

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->p()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/orca/g/r;->a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 956
    const-string v0, "admin_snippet"

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->o()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 957
    const-string v0, "timestamp_ms"

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->l()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 958
    const-string v0, "last_fetch_time_ms"

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 959
    const-string v0, "unread"

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->u()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 960
    const-string v0, "can_reply_to"

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->v()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 961
    const-string v0, "is_subscribed"

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->w()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 962
    const-string v0, "folder"

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->y()Lcom/facebook/orca/threads/FolderName;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/orca/threads/FolderName;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 963
    const-string v0, "draft"

    iget-object v3, p0, Lcom/facebook/orca/g/n;->l:Lcom/facebook/orca/g/g;

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->z()Lcom/facebook/orca/compose/MessageDraft;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/facebook/orca/g/g;->a(Lcom/facebook/orca/compose/MessageDraft;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 964
    iget-object v0, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 965
    const-string v1, "threads"

    const-string v3, ""

    invoke-virtual {v0, v1, v3, v2}, Landroid/database/sqlite/SQLiteDatabase;->replaceOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 966
    return-void

    .line 948
    :cond_4
    const/4 v0, 0x0

    goto/16 :goto_0
.end method

.method private a(Lcom/google/common/a/es;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;J)V"
        }
    .end annotation

    .prologue
    .line 217
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/facebook/orca/g/n;->a(Lcom/google/common/a/es;JZ)V

    .line 218
    return-void
.end method

.method private a(Lcom/google/common/a/es;JZ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;JZ)V"
        }
    .end annotation

    .prologue
    .line 237
    invoke-virtual {p1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    .line 239
    invoke-direct {p0, v0, p2, p3}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/threads/ThreadSummary;J)V

    .line 241
    if-eqz p4, :cond_0

    .line 242
    iget-object v2, p0, Lcom/facebook/orca/g/n;->d:Lcom/facebook/orca/g/h;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Lcom/facebook/orca/g/h;->a(Ljava/lang/String;I)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v2

    .line 244
    invoke-virtual {v2}, Lcom/facebook/orca/server/FetchThreadResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v3

    sget-object v4, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    if-eq v3, v4, :cond_0

    .line 245
    invoke-virtual {v2}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v2

    .line 246
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->d()J

    move-result-wide v3

    invoke-virtual {v2}, Lcom/facebook/orca/threads/ThreadSummary;->d()J

    move-result-wide v5

    cmp-long v2, v3, v5

    if-lez v2, :cond_0

    .line 247
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/g/n;->f(Ljava/lang/String;)V

    goto :goto_0

    .line 252
    :cond_1
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 723
    iget-object v0, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 724
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 726
    :try_start_0
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 727
    const-string v2, "thread_id"

    invoke-virtual {v0, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 728
    const-string v2, "archived_sms_mms_threads"

    const-string v3, ""

    invoke-virtual {v1, v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 729
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 734
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 736
    return-void

    .line 730
    :catch_0
    move-exception v0

    .line 731
    :try_start_1
    iget-object v2, p0, Lcom/facebook/orca/g/n;->a:Ljava/lang/Class;

    const-string v3, "SQLException"

    invoke-static {v2, v3, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 732
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 734
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
.end method

.method private a(Ljava/lang/String;J)V
    .locals 6

    .prologue
    .line 815
    iget-object v0, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 816
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 817
    const-string v2, "handled_internally_time"

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 818
    const-string v2, "messages"

    const-string v3, "msg_id = ?"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    invoke-virtual {v0, v2, v1, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 819
    return-void
.end method

.method private a(Ljava/lang/String;Lcom/facebook/user/UserKey;ZJLjava/lang/String;)V
    .locals 9

    .prologue
    .line 636
    iget-object v0, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v6

    .line 637
    iget-object v0, p0, Lcom/facebook/orca/g/n;->d:Lcom/facebook/orca/g/h;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/facebook/orca/g/h;->a(Ljava/lang/String;I)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v0

    .line 638
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v1

    sget-object v2, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    if-ne v1, v2, :cond_0

    .line 661
    :goto_0
    return-void

    .line 642
    :cond_0
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v7

    .line 643
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->j()Lcom/google/common/a/es;

    move-result-object v0

    .line 645
    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/threads/ThreadParticipant;

    .line 646
    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/facebook/user/UserKey;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, p0

    move v2, p3

    move-wide v3, p4

    move-object v5, p6

    .line 647
    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/threads/ThreadParticipant;ZJLjava/lang/String;)Lcom/facebook/orca/threads/ThreadParticipant;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 653
    :cond_1
    invoke-interface {v7, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 657
    :cond_2
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 658
    const-string v1, "participants"

    iget-object v2, p0, Lcom/facebook/orca/g/n;->f:Lcom/facebook/orca/g/r;

    invoke-virtual {v2, v7}, Lcom/facebook/orca/g/r;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 660
    const-string v1, "threads"

    const-string v2, "thread_id=?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-virtual {v6, v1, v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    goto :goto_0
.end method

.method private b(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threads/ThreadSummary;
    .locals 3

    .prologue
    .line 969
    iget-object v0, p0, Lcom/facebook/orca/g/n;->d:Lcom/facebook/orca/g/h;

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/g/h;->a(Ljava/lang/String;I)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v0

    .line 971
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v1

    sget-object v2, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    if-ne v1, v2, :cond_0

    .line 978
    :goto_0
    return-object p1

    .line 975
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 976
    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/g/n;->b(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v1

    .line 977
    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object p1

    goto :goto_0
.end method

.method private b(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threads/ThreadSummary;
    .locals 11

    .prologue
    .line 995
    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadSummary;->j()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    invoke-static {v0}, Lcom/google/common/a/ik;->a(I)Ljava/util/HashMap;

    move-result-object v2

    .line 998
    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadSummary;->j()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadParticipant;

    .line 999
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v3

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 1002
    :cond_0
    new-instance v0, Lcom/facebook/orca/threads/v;

    invoke-direct {v0}, Lcom/facebook/orca/threads/v;-><init>()V

    invoke-virtual {v0, p1}, Lcom/facebook/orca/threads/v;->a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threads/v;

    move-result-object v3

    .line 1004
    invoke-virtual {v3}, Lcom/facebook/orca/threads/v;->i()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0}, Lcom/google/common/a/hq;->c(I)Ljava/util/ArrayList;

    move-result-object v4

    .line 1006
    invoke-virtual {v3}, Lcom/facebook/orca/threads/v;->i()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadParticipant;

    .line 1007
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/threads/ThreadParticipant;

    .line 1009
    if-nez v1, :cond_1

    .line 1010
    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1012
    :cond_1
    new-instance v6, Lcom/facebook/orca/threads/p;

    invoke-direct {v6}, Lcom/facebook/orca/threads/p;-><init>()V

    .line 1013
    invoke-virtual {v6, v0}, Lcom/facebook/orca/threads/p;->a(Lcom/facebook/orca/threads/ThreadParticipant;)V

    .line 1016
    invoke-virtual {v6}, Lcom/facebook/orca/threads/p;->d()J

    move-result-wide v7

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadParticipant;->i()J

    move-result-wide v9

    cmp-long v0, v7, v9

    if-gez v0, :cond_2

    .line 1018
    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadParticipant;->i()J

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Lcom/facebook/orca/threads/p;->a(J)Lcom/facebook/orca/threads/p;

    .line 1021
    :cond_2
    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadParticipant;->j()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/facebook/orca/threads/p;->b(Ljava/lang/String;)Lcom/facebook/orca/threads/p;

    .line 1023
    invoke-virtual {v6}, Lcom/facebook/orca/threads/p;->f()Lcom/facebook/orca/threads/ThreadParticipant;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1027
    :cond_3
    invoke-virtual {v3, v4}, Lcom/facebook/orca/threads/v;->a(Ljava/util/List;)Lcom/facebook/orca/threads/v;

    .line 1028
    invoke-virtual {v3}, Lcom/facebook/orca/threads/v;->z()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 1029
    return-object v0
.end method

.method private b(Ljava/util/Set;)Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v5, 0x1

    const/4 v7, 0x0

    const/4 v4, 0x0

    .line 1184
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v8

    .line 1185
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, v8

    .line 1209
    :goto_0
    return-object v0

    .line 1189
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 1190
    const-string v1, "messages"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "msg_id"

    aput-object v3, v2, v7

    const-string v3, "handled_internally_time"

    aput-object v3, v2, v5

    const-string v3, "msg_id IN %s and handled_internally_time > 0"

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {p1}, Lcom/facebook/common/w/k;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v7

    invoke-static {v3, v5}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    move-object v5, v4

    move-object v6, v4

    move-object v7, v4

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 1202
    :goto_1
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1203
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v8, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 1206
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0

    :cond_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    move-object v0, v8

    .line 1209
    goto :goto_0
.end method

.method private b(Lcom/facebook/messages/model/threads/Message;)V
    .locals 4

    .prologue
    .line 1033
    new-instance v0, Lcom/facebook/orca/threads/MessagesCollection;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/orca/threads/MessagesCollection;-><init>(Ljava/lang/String;Lcom/google/common/a/es;Z)V

    invoke-direct {p0, v0}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/threads/MessagesCollection;)V

    .line 1035
    return-void
.end method

.method private b(Lcom/facebook/messages/model/threads/Message;Z)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 1383
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 1384
    const-string v1, "msg_id"

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1385
    const-string v1, "thread_id"

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1386
    const-string v1, "action_id"

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->s()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 1387
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->j()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 1388
    const-string v1, "subject"

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1390
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->k()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 1391
    const-string v1, "text"

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1393
    :cond_1
    const-string v1, "sender"

    iget-object v2, p0, Lcom/facebook/orca/g/n;->f:Lcom/facebook/orca/g/r;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/orca/g/r;->a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1395
    const-string v1, "timestamp_ms"

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 1396
    const-string v1, "msg_type"

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->u()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1397
    const-string v1, "affected_users"

    iget-object v2, p0, Lcom/facebook/orca/g/n;->f:Lcom/facebook/orca/g/r;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->v()Lcom/google/common/a/es;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/orca/g/r;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1399
    const-string v1, "mms_attachments"

    iget-object v2, p0, Lcom/facebook/orca/g/n;->k:Lcom/facebook/orca/g/o;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->o()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/orca/g/o;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1401
    const-string v1, "attachments"

    iget-object v2, p0, Lcom/facebook/orca/g/n;->g:Lcom/facebook/orca/g/a;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->p()Lcom/google/common/a/es;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/orca/g/a;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1403
    const-string v1, "shares"

    iget-object v2, p0, Lcom/facebook/orca/g/n;->h:Lcom/facebook/orca/g/w;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->q()Lcom/google/common/a/es;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/orca/g/w;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1404
    const-string v1, "coordinates"

    iget-object v2, p0, Lcom/facebook/orca/g/n;->i:Lcom/facebook/orca/g/f;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->n()Lcom/facebook/location/Coordinates;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/orca/g/f;->a(Lcom/facebook/location/Coordinates;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1406
    const-string v1, "client_tags"

    iget-object v2, p0, Lcom/facebook/orca/g/n;->j:Lcom/facebook/orca/g/q;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->J()Lcom/google/common/a/ev;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/orca/g/q;->a(Lcom/google/common/a/ev;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1408
    const-string v1, "offline_threading_id"

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1409
    const-string v1, "source"

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->z()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1410
    if-eqz p2, :cond_4

    .line 1411
    const-string v1, "is_non_authoritative"

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 1415
    :goto_0
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->C()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1416
    const-string v1, "pending_send_media_attachment"

    iget-object v2, p0, Lcom/facebook/orca/g/n;->k:Lcom/facebook/orca/g/o;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->B()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/orca/g/o;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1420
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_3

    .line 1421
    const-string v1, "timestamp_sent_ms"

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 1423
    :cond_3
    const-string v1, "handled_internally_time"

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->F()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 1424
    const-string v1, "pending_shares"

    iget-object v2, p0, Lcom/facebook/orca/g/n;->h:Lcom/facebook/orca/g/w;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->D()Lcom/google/common/a/es;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/orca/g/w;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1425
    const-string v1, "pending_attachment_fbid"

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->E()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1426
    const-string v1, "send_error"

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->K()Lcom/facebook/messages/model/threads/SendError;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/SendError;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1428
    iget-object v1, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v1}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 1429
    const-string v2, "messages"

    const-string v3, ""

    invoke-virtual {v1, v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->replaceOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 1430
    iget-object v0, p0, Lcom/facebook/orca/g/n;->a:Ljava/lang/Class;

    const-string v1, "Inserted message: %s"

    new-array v2, v5, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1431
    return-void

    .line 1413
    :cond_4
    const-string v1, "is_non_authoritative"

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->y()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    goto/16 :goto_0
.end method

.method private b(Lcom/google/common/a/es;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;J)V"
        }
    .end annotation

    .prologue
    .line 224
    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/facebook/orca/g/n;->a(Lcom/google/common/a/es;JZ)V

    .line 225
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 739
    iget-object v0, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 740
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 742
    :try_start_0
    const-string v0, "archived_sms_mms_threads"

    const-string v2, "thread_id = ?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 743
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 748
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 750
    return-void

    .line 744
    :catch_0
    move-exception v0

    .line 745
    :try_start_1
    iget-object v2, p0, Lcom/facebook/orca/g/n;->a:Ljava/lang/Class;

    const-string v3, "SQLException"

    invoke-static {v2, v3, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 746
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 748
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
.end method

.method private b(Ljava/lang/String;J)V
    .locals 12

    .prologue
    const-wide/16 v10, 0x1

    .line 822
    iget-object v0, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 823
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 825
    :try_start_0
    invoke-static {}, Lcom/facebook/d/d/e;->a()Lcom/facebook/d/d/f;

    move-result-object v4

    .line 826
    const-string v1, "thread_id"

    invoke-static {v1, p1}, Lcom/facebook/d/d/e;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/d/d/j;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/facebook/d/d/f;->a(Lcom/facebook/d/d/j;)V

    .line 827
    const-string v1, "msg_type"

    const/16 v2, 0x384

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/d/d/e;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/d/d/j;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/facebook/d/d/f;->a(Lcom/facebook/d/d/j;)V

    .line 830
    invoke-static {}, Lcom/google/common/a/ik;->b()Ljava/util/LinkedHashMap;

    move-result-object v8

    .line 831
    const-string v1, "messages"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v5, "msg_id"

    aput-object v5, v2, v3

    const/4 v3, 0x1

    const-string v5, "timestamp_ms"

    aput-object v5, v2, v3

    invoke-virtual {v4}, Lcom/facebook/d/d/f;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4}, Lcom/facebook/d/d/f;->b()[Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v7, "timestamp_ms"

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v2

    .line 835
    :goto_0
    :try_start_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 836
    const/4 v1, 0x0

    invoke-interface {v2, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 837
    const/4 v3, 0x1

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    .line 838
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v8, v1, v3}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 841
    :catchall_0
    move-exception v1

    :try_start_2
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 861
    :catchall_1
    move-exception v1

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v1

    .line 841
    :cond_0
    :try_start_3
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 844
    invoke-virtual {v8}, Ljava/util/LinkedHashMap;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 845
    add-long v1, p2, v10

    .line 846
    invoke-virtual {v8}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move-wide v3, v1

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 849
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    cmp-long v2, v6, v3

    if-gez v2, :cond_1

    .line 850
    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 851
    const-string v6, "timestamp_ms"

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v2, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 852
    const-string v6, "messages"

    const-string v7, "msg_id=?"

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/String;

    const/4 v9, 0x0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    aput-object v1, v8, v9

    invoke-virtual {v0, v6, v2, v7, v8}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 853
    add-long v1, v3, v10

    :goto_2
    move-wide v3, v1

    .line 855
    goto :goto_1

    :cond_1
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    add-long/2addr v1, v10

    goto :goto_2

    .line 859
    :cond_2
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 861
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 863
    return-void
.end method

.method private c(Ljava/util/Set;)Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v7, 0x0

    const/4 v6, 0x1

    const/4 v4, 0x0

    .line 1220
    invoke-static {}, Lcom/google/common/a/ev;->j()Lcom/google/common/a/ev;

    move-result-object v0

    .line 1221
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 1222
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v8

    .line 1223
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "msg_id IN "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/common/w/k;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 1225
    iget-object v0, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 1226
    const-string v1, "messages"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const-string v5, "msg_id"

    aput-object v5, v2, v7

    const-string v5, "offline_threading_id"

    aput-object v5, v2, v6

    move-object v5, v4

    move-object v6, v4

    move-object v7, v4

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 1236
    :cond_0
    :goto_0
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1237
    const/4 v0, 0x1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1238
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v8, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 1242
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0

    :cond_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    move-object v0, v8

    .line 1245
    :cond_2
    return-object v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 753
    iget-object v0, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 754
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 756
    :try_start_0
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 757
    const-string v2, "thread_id"

    invoke-virtual {v0, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 758
    const-string v2, "unread_mms_sms_threads"

    const-string v3, ""

    invoke-virtual {v1, v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 759
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 764
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 766
    return-void

    .line 760
    :catch_0
    move-exception v0

    .line 761
    :try_start_1
    iget-object v2, p0, Lcom/facebook/orca/g/n;->a:Ljava/lang/Class;

    const-string v3, "SQLException"

    invoke-static {v2, v3, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 762
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 764
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
.end method

.method private c(Lcom/facebook/messages/model/threads/Message;)Z
    .locals 2

    .prologue
    .line 1443
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v1

    .line 1444
    iget-object v0, p0, Lcom/facebook/orca/g/n;->n:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 1445
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private d(Ljava/util/Set;)Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v7, 0x0

    const/4 v6, 0x1

    const/4 v4, 0x0

    .line 1257
    invoke-static {}, Lcom/google/common/a/ev;->j()Lcom/google/common/a/ev;

    move-result-object v0

    .line 1258
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1282
    :goto_0
    return-object v0

    .line 1261
    :cond_0
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v8

    .line 1262
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "offline_threading_id IN "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/common/w/k;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 1264
    iget-object v0, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 1265
    const-string v1, "messages"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const-string v5, "offline_threading_id"

    aput-object v5, v2, v7

    const-string v5, "timestamp_sent_ms"

    aput-object v5, v2, v6

    move-object v5, v4

    move-object v6, v4

    move-object v7, v4

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 1274
    :cond_1
    :goto_1
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1275
    const/4 v0, 0x1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1276
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v8, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 1280
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0

    :cond_2
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    move-object v0, v8

    .line 1282
    goto :goto_0
.end method

.method private d(Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 769
    iget-object v0, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 770
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 772
    :try_start_0
    const-string v0, "unread_mms_sms_threads"

    const-string v2, "thread_id = ?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 773
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 778
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 780
    return-void

    .line 774
    :catch_0
    move-exception v0

    .line 775
    :try_start_1
    iget-object v2, p0, Lcom/facebook/orca/g/n;->a:Ljava/lang/Class;

    const-string v3, "SQLException"

    invoke-static {v2, v3, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 776
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 778
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
.end method

.method private e(Ljava/util/Set;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    const/4 v4, 0x0

    .line 1293
    invoke-static {}, Lcom/google/common/a/ev;->j()Lcom/google/common/a/ev;

    .line 1294
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "pending_send_media_attachment NOT NULL AND offline_threading_id IN "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/common/w/k;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 1296
    iget-object v0, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 1297
    const-string v1, "messages"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const-string v5, "offline_threading_id"

    aput-object v5, v2, v6

    const-string v5, "pending_send_media_attachment"

    aput-object v5, v2, v7

    move-object v5, v4

    move-object v6, v4

    move-object v7, v4

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 1306
    :try_start_0
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    .line 1307
    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1308
    const/4 v2, 0x0

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 1311
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0

    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 1313
    return-object v0
.end method

.method private e(Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 783
    iget-object v0, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 784
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 786
    :try_start_0
    const-string v0, "folders"

    const-string v2, "thread_id=?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 787
    const-string v0, "threads"

    const-string v2, "thread_id=?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 788
    const-string v0, "messages"

    const-string v2, "thread_id=?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 789
    const-string v0, "archived_sms_mms_threads"

    const-string v2, "thread_id=?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 790
    iget-object v0, p0, Lcom/facebook/orca/g/n;->c:Lcom/facebook/orca/g/y;

    invoke-static {p1}, Lcom/facebook/orca/g/s;->a(Ljava/lang/String;)Lcom/facebook/orca/g/x;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/orca/g/y;->b(Lcom/facebook/common/s/a;)V

    .line 791
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 796
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 798
    return-void

    .line 792
    :catch_0
    move-exception v0

    .line 793
    :try_start_1
    iget-object v2, p0, Lcom/facebook/orca/g/n;->a:Ljava/lang/Class;

    const-string v3, "SQLException"

    invoke-static {v2, v3, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 794
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 796
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
.end method

.method private f(Ljava/util/Set;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    const/4 v4, 0x0

    .line 1324
    invoke-static {}, Lcom/google/common/a/ev;->j()Lcom/google/common/a/ev;

    .line 1325
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "pending_shares NOT NULL AND offline_threading_id IN "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/common/w/k;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 1327
    iget-object v0, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 1328
    const-string v1, "messages"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const-string v5, "offline_threading_id"

    aput-object v5, v2, v6

    const-string v5, "pending_shares"

    aput-object v5, v2, v7

    move-object v5, v4

    move-object v6, v4

    move-object v7, v4

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 1337
    :try_start_0
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    .line 1338
    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1339
    const/4 v2, 0x0

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 1342
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0

    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 1344
    return-object v0
.end method

.method private f(Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 801
    iget-object v0, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 802
    const-string v1, "messages"

    const-string v2, "thread_id=?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 803
    return-void
.end method

.method private g(Ljava/lang/String;)Lcom/facebook/messages/model/threads/Message;
    .locals 3

    .prologue
    .line 1434
    new-instance v0, Lcom/facebook/messages/model/threads/e;

    invoke-direct {v0}, Lcom/facebook/messages/model/threads/e;-><init>()V

    invoke-virtual {v0, p1}, Lcom/facebook/messages/model/threads/e;->a(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/messages/model/threads/e;->b(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/threads/e;->a(I)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/facebook/messages/model/threads/e;->a(J)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/e;->B()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    return-object v0
.end method

.method private g(Ljava/util/Set;)Ljava/util/Set;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    const/4 v4, 0x0

    .line 1354
    invoke-static {}, Lcom/google/common/a/fi;->d()Lcom/google/common/a/fi;

    move-result-object v0

    .line 1355
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1377
    :goto_0
    return-object v0

    .line 1358
    :cond_0
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v8

    .line 1359
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "msg_id IN "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/common/w/k;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 1360
    iget-object v0, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 1361
    const-string v1, "messages"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v5, "msg_id"

    aput-object v5, v2, v6

    move-object v5, v4

    move-object v6, v4

    move-object v7, v4

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 1370
    :goto_1
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1371
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 1372
    invoke-interface {v8, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 1375
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0

    :cond_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    move-object v0, v8

    .line 1377
    goto :goto_0
.end method


# virtual methods
.method a(Lcom/facebook/orca/server/NewMessageResult;)Lcom/facebook/orca/server/NewMessageResult;
    .locals 10

    .prologue
    const-wide/16 v6, 0x0

    const/4 v0, 0x0

    .line 358
    iget-object v1, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v1}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v9

    .line 359
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 361
    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/orca/server/NewMessageResult;->a()Ljava/lang/String;

    move-result-object v1

    .line 363
    invoke-virtual {p1}, Lcom/facebook/orca/server/NewMessageResult;->b()Lcom/facebook/messages/model/threads/Message;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 364
    if-nez v2, :cond_0

    .line 466
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    :goto_0
    return-object p1

    .line 369
    :cond_0
    :try_start_1
    invoke-static {v1}, Lcom/facebook/orca/threads/m;->g(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 370
    invoke-direct {p0, v1}, Lcom/facebook/orca/g/n;->b(Ljava/lang/String;)V

    .line 374
    :cond_1
    iget-object v3, p0, Lcom/facebook/orca/g/n;->d:Lcom/facebook/orca/g/h;

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/orca/g/h;->a(Ljava/lang/String;)Lcom/facebook/messages/model/threads/Message;

    move-result-object v3

    .line 375
    if-nez v3, :cond_2

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/Message;->x()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 376
    iget-object v3, p0, Lcom/facebook/orca/g/n;->d:Lcom/facebook/orca/g/h;

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/orca/g/h;->b(Ljava/lang/String;)Lcom/facebook/messages/model/threads/Message;

    move-result-object v3

    .line 383
    :cond_2
    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v4

    cmp-long v4, v4, v6

    if-nez v4, :cond_9

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v4

    cmp-long v4, v4, v6

    if-eqz v4, :cond_9

    .line 386
    new-instance v4, Lcom/facebook/messages/model/threads/e;

    invoke-direct {v4}, Lcom/facebook/messages/model/threads/e;-><init>()V

    invoke-virtual {v4, v2}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    invoke-virtual {v3}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/facebook/messages/model/threads/e;->b(J)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/e;->B()Lcom/facebook/messages/model/threads/Message;

    move-result-object v2

    move-object v7, v2

    .line 392
    :goto_1
    invoke-virtual {v7}, Lcom/facebook/messages/model/threads/Message;->A()Lcom/facebook/messages/model/threads/c;

    move-result-object v2

    sget-object v4, Lcom/facebook/messages/model/threads/c;->C2DM:Lcom/facebook/messages/model/threads/c;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v2, v4, :cond_3

    if-eqz v3, :cond_3

    .line 395
    const/4 p1, 0x0

    .line 466
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    goto :goto_0

    .line 409
    :cond_3
    :try_start_2
    invoke-virtual {v7}, Lcom/facebook/messages/model/threads/Message;->y()Z

    move-result v2

    if-eqz v2, :cond_7

    .line 422
    :cond_4
    :goto_2
    if-eqz v0, :cond_8

    .line 424
    invoke-virtual {p1}, Lcom/facebook/orca/server/NewMessageResult;->c()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/threads/MessagesCollection;)V

    .line 438
    :cond_5
    :goto_3
    invoke-direct {p0, v7}, Lcom/facebook/orca/g/n;->c(Lcom/facebook/messages/model/threads/Message;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 439
    invoke-virtual {v7}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-direct {p0, v0, v2, v3}, Lcom/facebook/orca/g/n;->a(Ljava/lang/String;J)V

    .line 443
    invoke-virtual {v7}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v2

    invoke-direct {p0, v1, v2, v3}, Lcom/facebook/orca/g/n;->b(Ljava/lang/String;J)V

    .line 448
    iget-object v0, p0, Lcom/facebook/orca/g/n;->d:Lcom/facebook/orca/g/h;

    invoke-virtual {v7}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v2

    const-wide/16 v4, -0x1

    const/16 v6, 0x64

    invoke-virtual/range {v0 .. v6}, Lcom/facebook/orca/g/h;->a(Ljava/lang/String;JJI)Lcom/facebook/orca/server/FetchMoreMessagesResult;

    move-result-object v0

    .line 450
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchMoreMessagesResult;->a()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v6

    .line 453
    iget-object v0, p0, Lcom/facebook/orca/g/n;->d:Lcom/facebook/orca/g/h;

    invoke-virtual {v7}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/orca/g/h;->a(Ljava/lang/String;)Lcom/facebook/messages/model/threads/Message;

    move-result-object v5

    .line 455
    new-instance v2, Lcom/facebook/orca/server/NewMessageResult;

    invoke-virtual {p1}, Lcom/facebook/orca/server/NewMessageResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v3

    invoke-virtual {p1}, Lcom/facebook/orca/server/NewMessageResult;->f()J

    move-result-wide v7

    move-object v4, v1

    invoke-direct/range {v2 .. v8}, Lcom/facebook/orca/server/NewMessageResult;-><init>(Lcom/facebook/fbservice/c/b;Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/MessagesCollection;J)V

    move-object p1, v2

    .line 463
    :cond_6
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 466
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    goto/16 :goto_0

    .line 411
    :cond_7
    :try_start_3
    invoke-virtual {p1}, Lcom/facebook/orca/server/NewMessageResult;->c()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 416
    iget-object v0, p0, Lcom/facebook/orca/g/n;->d:Lcom/facebook/orca/g/h;

    const/4 v2, 0x5

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/g/h;->a(Ljava/lang/String;I)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v0

    .line 417
    iget-object v2, p0, Lcom/facebook/orca/g/n;->m:Lcom/facebook/orca/threads/i;

    invoke-virtual {p1}, Lcom/facebook/orca/server/NewMessageResult;->c()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v3

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->b()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/facebook/orca/threads/i;->c(Lcom/facebook/orca/threads/MessagesCollection;Lcom/facebook/orca/threads/MessagesCollection;)Z

    move-result v0

    goto :goto_2

    .line 426
    :cond_8
    const/4 v0, 0x1

    invoke-direct {p0, v7, v0}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/messages/model/threads/Message;Z)V

    .line 427
    iget-object v0, p0, Lcom/facebook/orca/g/n;->d:Lcom/facebook/orca/g/h;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/g/h;->a(Ljava/lang/String;I)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v0

    .line 428
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 429
    iget-object v2, p0, Lcom/facebook/orca/g/n;->o:Lcom/facebook/orca/threads/x;

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    invoke-virtual {v2, v0, v7}, Lcom/facebook/orca/threads/x;->a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 433
    invoke-direct {p0, v0}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 434
    invoke-virtual {p1}, Lcom/facebook/orca/server/NewMessageResult;->f()J

    move-result-wide v2

    invoke-direct {p0, v0, v2, v3}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/threads/ThreadSummary;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_3

    .line 466
    :catchall_0
    move-exception v0

    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0

    :cond_9
    move-object v7, v2

    goto/16 :goto_1
.end method

.method a(Lcom/facebook/orca/server/DeleteMessagesParams;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/server/DeleteMessagesParams;",
            ")",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 695
    invoke-virtual {p1}, Lcom/facebook/orca/server/DeleteMessagesParams;->b()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/g/n;->a(Ljava/util/Set;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method a(Lcom/facebook/messages/model/threads/Message;)V
    .locals 4

    .prologue
    .line 471
    invoke-direct {p0, p1}, Lcom/facebook/orca/g/n;->b(Lcom/facebook/messages/model/threads/Message;)V

    .line 472
    iget-object v0, p0, Lcom/facebook/orca/g/n;->d:Lcom/facebook/orca/g/h;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/g/h;->a(Ljava/lang/String;I)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v0

    .line 474
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 475
    iget-object v1, p0, Lcom/facebook/orca/g/n;->o:Lcom/facebook/orca/threads/x;

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Lcom/facebook/orca/threads/x;->a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v1

    .line 479
    invoke-direct {p0, v1}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 480
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->f()J

    move-result-wide v2

    invoke-direct {p0, v1, v2, v3}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/threads/ThreadSummary;J)V

    .line 482
    :cond_0
    return-void
.end method

.method a(Lcom/facebook/orca/server/DeleteThreadParams;)V
    .locals 1

    .prologue
    .line 680
    invoke-virtual {p1}, Lcom/facebook/orca/server/DeleteThreadParams;->a()Ljava/lang/String;

    move-result-object v0

    .line 681
    invoke-direct {p0, v0}, Lcom/facebook/orca/g/n;->e(Ljava/lang/String;)V

    .line 682
    return-void
.end method

.method a(Lcom/facebook/orca/server/DeliveredReceiptParams;)V
    .locals 7

    .prologue
    .line 617
    invoke-virtual {p1}, Lcom/facebook/orca/server/DeliveredReceiptParams;->b()Ljava/lang/String;

    move-result-object v1

    .line 618
    invoke-virtual {p1}, Lcom/facebook/orca/server/DeliveredReceiptParams;->c()Lcom/facebook/user/UserKey;

    move-result-object v2

    .line 619
    invoke-virtual {p1}, Lcom/facebook/orca/server/DeliveredReceiptParams;->a()Ljava/lang/String;

    move-result-object v6

    .line 621
    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/g/n;->a(Ljava/lang/String;Lcom/facebook/user/UserKey;ZJLjava/lang/String;)V

    .line 627
    return-void
.end method

.method a(Lcom/facebook/orca/server/FetchGroupThreadsParams;Lcom/facebook/orca/server/FetchGroupThreadsResult;)V
    .locals 7

    .prologue
    .line 185
    iget-object v0, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 186
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 188
    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchGroupThreadsParams;->a()Lcom/facebook/orca/server/j;

    move-result-object v0

    sget-object v2, Lcom/facebook/orca/server/j;->TOP_RANKED:Lcom/facebook/orca/server/j;

    if-ne v0, v2, :cond_1

    .line 189
    const-string v0, "group_conversations"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 190
    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchGroupThreadsResult;->a()Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadsCollection;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    .line 191
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 192
    const-string v4, "thread_id"

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    const-string v4, "rank"

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->e()J

    move-result-wide v5

    long-to-float v0, v5

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Float;)V

    .line 194
    const-string v0, "group_conversations"

    const-string v4, ""

    invoke-virtual {v1, v0, v4, v3}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 205
    :catch_0
    move-exception v0

    .line 206
    :try_start_1
    iget-object v2, p0, Lcom/facebook/orca/g/n;->a:Ljava/lang/Class;

    const-string v3, "SQLException"

    invoke-static {v2, v3, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 207
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 209
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0

    .line 196
    :cond_0
    :try_start_2
    iget-object v0, p0, Lcom/facebook/orca/g/n;->c:Lcom/facebook/orca/g/y;

    sget-object v2, Lcom/facebook/orca/g/s;->c:Lcom/facebook/orca/g/x;

    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchGroupThreadsResult;->f()J

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Lcom/facebook/orca/g/y;->b(Lcom/facebook/common/s/a;J)V

    .line 201
    :cond_1
    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchGroupThreadsResult;->a()Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadsCollection;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchGroupThreadsResult;->f()J

    move-result-wide v2

    invoke-direct {p0, v0, v2, v3}, Lcom/facebook/orca/g/n;->b(Lcom/google/common/a/es;J)V

    .line 204
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_2
    .catch Landroid/database/SQLException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 209
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 211
    return-void
.end method

.method a(Lcom/facebook/orca/server/FetchMoreMessagesResult;Lcom/facebook/orca/server/FetchMoreMessagesResult;)V
    .locals 4

    .prologue
    .line 532
    iget-object v0, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 533
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 535
    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreMessagesResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v0

    sget-object v2, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    if-eq v0, v2, :cond_0

    .line 539
    iget-object v0, p0, Lcom/facebook/orca/g/n;->m:Lcom/facebook/orca/threads/i;

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreMessagesResult;->a()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v2

    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchMoreMessagesResult;->a()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/facebook/orca/threads/i;->c(Lcom/facebook/orca/threads/MessagesCollection;Lcom/facebook/orca/threads/MessagesCollection;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 543
    iget-object v0, p0, Lcom/facebook/orca/g/n;->a:Ljava/lang/Class;

    const-string v2, "Performance warning - can\'t add more messages"

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 553
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 555
    :goto_0
    return-void

    .line 547
    :cond_0
    :try_start_1
    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchMoreMessagesResult;->a()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/threads/MessagesCollection;)V

    .line 548
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 553
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    goto :goto_0

    .line 549
    :catch_0
    move-exception v0

    .line 550
    :try_start_2
    iget-object v2, p0, Lcom/facebook/orca/g/n;->a:Ljava/lang/Class;

    const-string v3, "SQLException"

    invoke-static {v2, v3, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 551
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 553
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
.end method

.method a(Lcom/facebook/orca/server/FetchMoreThreadsResult;)V
    .locals 6

    .prologue
    .line 260
    iget-object v0, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 261
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 263
    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreThreadsResult;->f()J

    move-result-wide v2

    .line 264
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreThreadsResult;->b()Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v0

    .line 266
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreThreadsResult;->a()Lcom/facebook/orca/threads/FolderName;

    move-result-object v4

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreThreadsResult;->b()Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v5

    invoke-direct {p0, v4, v5}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/ThreadsCollection;)V

    .line 268
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadsCollection;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    .line 269
    invoke-direct {p0, v0, v2, v3}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/threads/ThreadSummary;J)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 272
    :catch_0
    move-exception v0

    .line 273
    :try_start_1
    iget-object v2, p0, Lcom/facebook/orca/g/n;->a:Ljava/lang/Class;

    const-string v3, "SQLException"

    invoke-static {v2, v3, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 274
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 276
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0

    .line 271
    :cond_0
    :try_start_2
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_2
    .catch Landroid/database/SQLException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 276
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 278
    return-void
.end method

.method a(Lcom/facebook/orca/server/FetchThreadListResult;)V
    .locals 8

    .prologue
    .line 122
    iget-object v0, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 123
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 125
    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->f()J

    move-result-wide v2

    .line 126
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->a()Lcom/facebook/orca/threads/FolderName;

    move-result-object v4

    .line 127
    iget-object v0, p0, Lcom/facebook/orca/g/n;->c:Lcom/facebook/orca/g/y;

    invoke-static {v4}, Lcom/facebook/orca/g/s;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/g/x;

    move-result-object v5

    invoke-virtual {v0, v5, v2, v3}, Lcom/facebook/orca/g/y;->b(Lcom/facebook/common/s/a;J)V

    .line 131
    iget-object v0, p0, Lcom/facebook/orca/g/n;->c:Lcom/facebook/orca/g/y;

    invoke-static {v4}, Lcom/facebook/orca/g/s;->b(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/g/x;

    move-result-object v5

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->k()J

    move-result-wide v6

    invoke-virtual {v0, v5, v6, v7}, Lcom/facebook/orca/g/y;->b(Lcom/facebook/common/s/a;J)V

    .line 135
    iget-object v0, p0, Lcom/facebook/orca/g/n;->c:Lcom/facebook/orca/g/y;

    invoke-static {v4}, Lcom/facebook/orca/g/s;->c(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/g/x;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Lcom/facebook/orca/g/y;->b(Lcom/facebook/common/s/a;Z)V

    .line 140
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 142
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->d()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 144
    invoke-direct {p0, v0}, Lcom/facebook/orca/g/n;->e(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 169
    :catch_0
    move-exception v0

    .line 170
    :try_start_1
    iget-object v2, p0, Lcom/facebook/orca/g/n;->a:Ljava/lang/Class;

    const-string v3, "SQLException"

    invoke-static {v2, v3, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 171
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 173
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0

    .line 146
    :cond_0
    :try_start_2
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->g()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 147
    invoke-direct {p0, v4, v0}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/threads/FolderName;Ljava/lang/String;)V

    goto :goto_1

    .line 151
    :cond_1
    invoke-direct {p0, v4}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/threads/FolderName;)V

    .line 154
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->h()Lcom/facebook/orca/threads/FolderCounts;

    move-result-object v0

    invoke-virtual {p0, v4, v0}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/FolderCounts;)V

    .line 155
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->b()Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v0

    invoke-direct {p0, v4, v0}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/ThreadsCollection;)V

    .line 158
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->b()Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v0

    .line 159
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->j()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 160
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadsCollection;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-direct {p0, v0, v2, v3}, Lcom/facebook/orca/g/n;->b(Lcom/google/common/a/es;J)V

    .line 168
    :goto_2
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_2
    .catch Landroid/database/SQLException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 173
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 175
    return-void

    .line 164
    :cond_3
    :try_start_3
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadsCollection;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-direct {p0, v0, v2, v3}, Lcom/facebook/orca/g/n;->a(Lcom/google/common/a/es;J)V
    :try_end_3
    .catch Landroid/database/SQLException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2
.end method

.method a(Lcom/facebook/orca/server/FetchThreadResult;)V
    .locals 3

    .prologue
    .line 344
    iget-object v0, p0, Lcom/facebook/orca/g/n;->d:Lcom/facebook/orca/g/h;

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/g/h;->a(Ljava/lang/String;I)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v0

    .line 346
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v1

    sget-object v2, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    if-ne v1, v2, :cond_0

    .line 347
    const/4 v0, 0x0

    .line 349
    :cond_0
    invoke-virtual {p0, v0, p1}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/server/FetchThreadResult;Lcom/facebook/orca/server/FetchThreadResult;)V

    .line 350
    return-void
.end method

.method a(Lcom/facebook/orca/server/FetchThreadResult;Lcom/facebook/orca/server/FetchThreadResult;)V
    .locals 9

    .prologue
    const-wide/16 v2, -0x1

    .line 290
    iget-object v0, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    .line 291
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 293
    :try_start_0
    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v5

    .line 294
    invoke-virtual {v5}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v6

    .line 295
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v0

    sget-object v1, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    if-eq v0, v1, :cond_0

    .line 299
    iget-object v0, p0, Lcom/facebook/orca/g/n;->m:Lcom/facebook/orca/threads/i;

    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->b()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadResult;->b()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v7

    invoke-virtual {v0, v1, v7}, Lcom/facebook/orca/threads/i;->c(Lcom/facebook/orca/threads/MessagesCollection;Lcom/facebook/orca/threads/MessagesCollection;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 304
    iget-object v0, p0, Lcom/facebook/orca/g/n;->a:Ljava/lang/Class;

    const-string v1, "Performance warning - deleting old messages to avoid hole"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 305
    const-string v0, "messages"

    const-string v1, "thread_id=?"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/String;

    const/4 v8, 0x0

    aput-object v6, v7, v8

    invoke-virtual {v4, v0, v1, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 310
    :cond_0
    invoke-direct {p0, v5}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 311
    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->f()J

    move-result-wide v0

    invoke-direct {p0, v5, v0, v1}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/threads/ThreadSummary;J)V

    .line 312
    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->b()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/threads/MessagesCollection;)V

    .line 315
    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->b()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/threads/MessagesCollection;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 316
    invoke-direct {p0, v0}, Lcom/facebook/orca/g/n;->c(Lcom/facebook/messages/model/threads/Message;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 317
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v0

    .line 322
    :goto_0
    cmp-long v2, v0, v2

    if-eqz v2, :cond_2

    .line 323
    invoke-direct {p0, v6, v0, v1}, Lcom/facebook/orca/g/n;->b(Ljava/lang/String;J)V

    .line 326
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/g/n;->c:Lcom/facebook/orca/g/y;

    invoke-static {v6}, Lcom/facebook/orca/g/s;->a(Ljava/lang/String;)Lcom/facebook/orca/g/x;

    move-result-object v1

    invoke-virtual {v5}, Lcom/facebook/orca/threads/ThreadSummary;->c()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/orca/g/y;->b(Lcom/facebook/common/s/a;J)V

    .line 329
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 334
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 336
    return-void

    .line 330
    :catch_0
    move-exception v0

    .line 331
    :try_start_1
    iget-object v1, p0, Lcom/facebook/orca/g/n;->a:Ljava/lang/Class;

    const-string v2, "SQLException"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 332
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 334
    :catchall_0
    move-exception v0

    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0

    :cond_3
    move-wide v0, v2

    goto :goto_0
.end method

.method a(Lcom/facebook/orca/server/MarkThreadParams;)V
    .locals 7

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 569
    invoke-virtual {p1}, Lcom/facebook/orca/server/MarkThreadParams;->a()Ljava/lang/String;

    move-result-object v2

    .line 570
    invoke-virtual {p1}, Lcom/facebook/orca/server/MarkThreadParams;->b()Lcom/facebook/orca/server/ai;

    move-result-object v3

    .line 572
    iget-object v4, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v4}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    .line 573
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 575
    :try_start_0
    sget-object v5, Lcom/facebook/orca/server/ai;->READ:Lcom/facebook/orca/server/ai;

    if-ne v3, v5, :cond_3

    .line 576
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 577
    const-string v5, "unread"

    invoke-virtual {p1}, Lcom/facebook/orca/server/MarkThreadParams;->c()Z

    move-result v6

    if-nez v6, :cond_1

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v3, v5, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 578
    const-string v0, "threads"

    const-string v1, "thread_id=?"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/String;

    const/4 v6, 0x0

    aput-object v2, v5, v6

    invoke-virtual {v4, v0, v3, v1, v5}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 579
    invoke-static {v2}, Lcom/facebook/orca/threads/m;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 580
    invoke-virtual {p1}, Lcom/facebook/orca/server/MarkThreadParams;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 581
    invoke-direct {p0, v2}, Lcom/facebook/orca/g/n;->d(Ljava/lang/String;)V

    .line 594
    :cond_0
    :goto_1
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 599
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 601
    return-void

    :cond_1
    move v0, v1

    .line 577
    goto :goto_0

    .line 583
    :cond_2
    :try_start_1
    invoke-direct {p0, v2}, Lcom/facebook/orca/g/n;->c(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 595
    :catch_0
    move-exception v0

    .line 596
    :try_start_2
    iget-object v1, p0, Lcom/facebook/orca/g/n;->a:Ljava/lang/Class;

    const-string v2, "SQLException"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 597
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 599
    :catchall_0
    move-exception v0

    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0

    .line 587
    :cond_3
    :try_start_3
    sget-object v0, Lcom/facebook/orca/server/ai;->ARCHIVED:Lcom/facebook/orca/server/ai;

    if-ne v3, v0, :cond_0

    invoke-virtual {p1}, Lcom/facebook/orca/server/MarkThreadParams;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 588
    invoke-static {v2}, Lcom/facebook/orca/threads/m;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 589
    invoke-direct {p0, v2}, Lcom/facebook/orca/g/n;->a(Ljava/lang/String;)V

    goto :goto_1

    .line 591
    :cond_4
    sget-object v0, Lcom/facebook/orca/threads/FolderName;->b:Lcom/facebook/orca/threads/FolderName;

    invoke-direct {p0, v0, v2}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/threads/FolderName;Ljava/lang/String;)V
    :try_end_3
    .catch Landroid/database/SQLException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1
.end method

.method a(Lcom/facebook/orca/server/ReadReceiptParams;)V
    .locals 7

    .prologue
    .line 604
    invoke-virtual {p1}, Lcom/facebook/orca/server/ReadReceiptParams;->b()Ljava/lang/String;

    move-result-object v1

    .line 605
    invoke-virtual {p1}, Lcom/facebook/orca/server/ReadReceiptParams;->c()Lcom/facebook/user/UserKey;

    move-result-object v2

    .line 606
    invoke-virtual {p1}, Lcom/facebook/orca/server/ReadReceiptParams;->a()J

    move-result-wide v4

    .line 608
    const/4 v3, 0x1

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/g/n;->a(Ljava/lang/String;Lcom/facebook/user/UserKey;ZJLjava/lang/String;)V

    .line 614
    return-void
.end method

.method a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/FolderCounts;)V
    .locals 5

    .prologue
    .line 558
    iget-object v0, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 559
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 560
    const-string v2, "folder"

    invoke-virtual {p1}, Lcom/facebook/orca/threads/FolderName;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 561
    const-string v2, "unread_count"

    invoke-virtual {p2}, Lcom/facebook/orca/threads/FolderCounts;->a()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 562
    const-string v2, "unseen_count"

    invoke-virtual {p2}, Lcom/facebook/orca/threads/FolderCounts;->b()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 563
    const-string v2, "last_seen_time"

    invoke-virtual {p2}, Lcom/facebook/orca/threads/FolderCounts;->c()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 564
    const-string v2, "last_action_id"

    invoke-virtual {p2}, Lcom/facebook/orca/threads/FolderCounts;->d()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 565
    const-string v2, "folder_counts"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v1}, Landroid/database/sqlite/SQLiteDatabase;->replaceOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 566
    return-void
.end method

.method a(Ljava/lang/String;Lcom/facebook/orca/compose/MessageDraft;)V
    .locals 6

    .prologue
    .line 485
    iget-object v0, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 486
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 487
    const-string v2, "draft"

    iget-object v3, p0, Lcom/facebook/orca/g/n;->l:Lcom/facebook/orca/g/g;

    invoke-virtual {v3, p2}, Lcom/facebook/orca/g/g;->a(Lcom/facebook/orca/compose/MessageDraft;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 488
    const-string v2, "threads"

    const-string v3, "thread_id=?"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    invoke-virtual {v0, v2, v1, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 489
    return-void
.end method

.method a(Ljava/lang/String;Lcom/facebook/orca/server/FetchThreadResult;Lcom/facebook/orca/server/FetchMoreMessagesResult;)V
    .locals 4

    .prologue
    .line 501
    iget-object v0, p0, Lcom/facebook/orca/g/n;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 502
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 506
    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/g/n;->m:Lcom/facebook/orca/threads/i;

    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->b()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v2

    invoke-virtual {p3}, Lcom/facebook/orca/server/FetchMoreMessagesResult;->a()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/facebook/orca/threads/i;->c(Lcom/facebook/orca/threads/MessagesCollection;Lcom/facebook/orca/threads/MessagesCollection;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 510
    iget-object v0, p0, Lcom/facebook/orca/g/n;->a:Ljava/lang/Class;

    const-string v2, "Performance warning - can\'t add more messages"

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 519
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 521
    :goto_0
    return-void

    .line 513
    :cond_0
    :try_start_1
    invoke-virtual {p3}, Lcom/facebook/orca/server/FetchMoreMessagesResult;->a()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/threads/MessagesCollection;)V

    .line 514
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 519
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    goto :goto_0

    .line 515
    :catch_0
    move-exception v0

    .line 516
    :try_start_2
    iget-object v2, p0, Lcom/facebook/orca/g/n;->a:Ljava/lang/Class;

    const-string v3, "SQLException"

    invoke-static {v2, v3, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 517
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 519
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
.end method
