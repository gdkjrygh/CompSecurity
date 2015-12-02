.class public Lcom/facebook/contacts/data/l;
.super Ljava/lang/Object;
.source "DbFetchContactHandler.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final f:[Ljava/lang/String;

.field private static final g:[Ljava/lang/String;

.field private static final h:[Ljava/lang/String;


# instance fields
.field private final b:Lcom/facebook/contacts/data/b;

.field private final c:Lcom/fasterxml/jackson/databind/ObjectMapper;

.field private final d:Lcom/facebook/user/ac;

.field private final e:Lcom/facebook/contacts/a/c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 39
    const-class v0, Lcom/facebook/contacts/data/l;

    sput-object v0, Lcom/facebook/contacts/data/l;->a:Ljava/lang/Class;

    .line 46
    new-array v0, v3, [Ljava/lang/String;

    const-string v1, "data"

    aput-object v1, v0, v2

    sput-object v0, Lcom/facebook/contacts/data/l;->f:[Ljava/lang/String;

    .line 50
    new-array v0, v4, [Ljava/lang/String;

    const-string v1, "fb.indexed_data"

    aput-object v1, v0, v2

    const-string v1, "phone.indexed_data"

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/contacts/data/l;->g:[Ljava/lang/String;

    .line 55
    new-array v0, v4, [Ljava/lang/String;

    const-string v1, "fbid"

    aput-object v1, v0, v2

    const-string v1, "data"

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/contacts/data/l;->h:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/contacts/data/b;Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/facebook/user/ac;Lcom/facebook/contacts/a/c;)V
    .locals 0

    .prologue
    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-object p1, p0, Lcom/facebook/contacts/data/l;->b:Lcom/facebook/contacts/data/b;

    .line 66
    iput-object p2, p0, Lcom/facebook/contacts/data/l;->c:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 67
    iput-object p3, p0, Lcom/facebook/contacts/data/l;->d:Lcom/facebook/user/ac;

    .line 68
    iput-object p4, p0, Lcom/facebook/contacts/data/l;->e:Lcom/facebook/contacts/a/c;

    .line 69
    return-void
.end method

.method private a(Lcom/facebook/user/UserKey;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    const/4 v5, 0x0

    .line 108
    iget-object v0, p0, Lcom/facebook/contacts/data/l;->b:Lcom/facebook/contacts/data/b;

    invoke-virtual {v0}, Lcom/facebook/contacts/data/b;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 109
    invoke-virtual {p1}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v1

    sget-object v2, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    if-ne v1, v2, :cond_1

    .line 110
    sget-object v2, Lcom/facebook/contacts/data/l;->f:[Ljava/lang/String;

    const-string v3, "contact_id IN (SELECT cs.contact_id FROM contacts cs, contacts_indexed_data cid WHERE cid.type = ? AND cid.indexed_data = ? AND cs.internal_id = cid.contact_internal_id)"

    const/4 v1, 0x2

    new-array v4, v1, [Ljava/lang/String;

    const-string v1, "profile_fbid"

    aput-object v1, v4, v6

    invoke-virtual {p1}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v7

    move-object v1, p2

    move-object v6, v5

    move-object v7, v5

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 135
    :goto_0
    :try_start_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 136
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v5

    .line 139
    :cond_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 141
    return-object v5

    .line 123
    :cond_1
    sget-object v2, Lcom/facebook/contacts/data/l;->f:[Ljava/lang/String;

    const-string v3, "contact_id = ?"

    new-array v4, v7, [Ljava/lang/String;

    invoke-virtual {p1}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v6

    move-object v1, p2

    move-object v6, v5

    move-object v7, v5

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    goto :goto_0

    .line 139
    :catchall_0
    move-exception v1

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    throw v1
.end method

.method private c(Lcom/facebook/user/UserKey;)Lcom/facebook/contacts/models/Contact;
    .locals 3

    .prologue
    .line 89
    const-string v0, "contacts"

    invoke-direct {p0, p1, v0}, Lcom/facebook/contacts/data/l;->a(Lcom/facebook/user/UserKey;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 91
    if-nez v0, :cond_0

    .line 92
    const/4 v0, 0x0

    .line 94
    :goto_0
    return-object v0

    :cond_0
    iget-object v1, p0, Lcom/facebook/contacts/data/l;->c:Lcom/fasterxml/jackson/databind/ObjectMapper;

    const-class v2, Lcom/facebook/contacts/models/Contact;

    invoke-virtual {v1, v0, v2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readValue(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/models/Contact;

    goto :goto_0
.end method

.method private d(Lcom/facebook/user/UserKey;)Lcom/facebook/contacts/models/ContactDetails;
    .locals 3

    .prologue
    .line 98
    const-string v0, "contact_details"

    invoke-direct {p0, p1, v0}, Lcom/facebook/contacts/data/l;->a(Lcom/facebook/user/UserKey;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 100
    if-nez v0, :cond_0

    .line 101
    const/4 v0, 0x0

    .line 103
    :goto_0
    return-object v0

    :cond_0
    iget-object v1, p0, Lcom/facebook/contacts/data/l;->c:Lcom/fasterxml/jackson/databind/ObjectMapper;

    const-class v2, Lcom/facebook/contacts/models/ContactDetails;

    invoke-virtual {v1, v0, v2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readValue(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/models/ContactDetails;

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/user/UserKey;)Lcom/facebook/contacts/server/FetchContactResult;
    .locals 6

    .prologue
    .line 72
    invoke-virtual {p1}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v1, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v1, Lcom/facebook/user/n;->FACEBOOK_CONTACT:Lcom/facebook/user/n;

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 75
    invoke-direct {p0, p1}, Lcom/facebook/contacts/data/l;->c(Lcom/facebook/user/UserKey;)Lcom/facebook/contacts/models/Contact;

    move-result-object v4

    .line 76
    invoke-direct {p0, p1}, Lcom/facebook/contacts/data/l;->d(Lcom/facebook/user/UserKey;)Lcom/facebook/contacts/models/ContactDetails;

    move-result-object v5

    .line 79
    if-eqz v4, :cond_2

    if-eqz v5, :cond_2

    .line 80
    new-instance v0, Lcom/facebook/contacts/server/FetchContactResult;

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_CACHE_STALE:Lcom/facebook/fbservice/c/b;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-direct/range {v0 .. v5}, Lcom/facebook/contacts/server/FetchContactResult;-><init>(Lcom/facebook/fbservice/c/b;JLcom/facebook/contacts/models/Contact;Lcom/facebook/contacts/models/ContactDetails;)V

    .line 85
    :goto_1
    return-object v0

    .line 72
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 85
    :cond_2
    sget-object v0, Lcom/facebook/contacts/server/FetchContactResult;->a:Lcom/facebook/contacts/server/FetchContactResult;

    goto :goto_1
.end method

.method public a()Lcom/google/common/a/es;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v4, 0x1

    const/4 v7, 0x0

    const/4 v5, 0x0

    .line 148
    iget-object v0, p0, Lcom/facebook/contacts/data/l;->b:Lcom/facebook/contacts/data/b;

    invoke-virtual {v0}, Lcom/facebook/contacts/data/b;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 149
    const-string v1, "ephemeral_data"

    sget-object v2, Lcom/facebook/contacts/data/l;->h:[Ljava/lang/String;

    const-string v3, "type = ?"

    new-array v4, v4, [Ljava/lang/String;

    const-string v6, "last_active"

    aput-object v6, v4, v7

    move-object v6, v5

    move-object v7, v5

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 158
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v2

    .line 160
    :goto_0
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 161
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 162
    const/4 v3, 0x1

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 163
    iget-object v4, p0, Lcom/facebook/contacts/data/l;->d:Lcom/facebook/user/ac;

    iget-object v5, p0, Lcom/facebook/contacts/data/l;->c:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v5, v3}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/facebook/user/ac;->f(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/user/LastActive;

    move-result-object v3

    .line 165
    new-instance v4, Lcom/facebook/user/o;

    invoke-direct {v4}, Lcom/facebook/user/o;-><init>()V

    sget-object v5, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-virtual {v4, v5, v0}, Lcom/facebook/user/o;->a(Lcom/facebook/user/n;Ljava/lang/String;)Lcom/facebook/user/o;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/facebook/user/o;->a(Lcom/facebook/user/LastActive;)Lcom/facebook/user/o;

    move-result-object v0

    .line 168
    invoke-virtual {v0}, Lcom/facebook/user/o;->x()Lcom/facebook/user/User;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 170
    :catch_0
    move-exception v0

    .line 171
    :try_start_1
    sget-object v3, Lcom/facebook/contacts/data/l;->a:Ljava/lang/Class;

    const-string v4, "IOException"

    invoke-static {v3, v4, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 173
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 175
    :goto_1
    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v1

    .line 177
    invoke-virtual {v1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 178
    iget-object v3, p0, Lcom/facebook/contacts/data/l;->e:Lcom/facebook/contacts/a/c;

    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v4

    invoke-virtual {v0}, Lcom/facebook/user/User;->C()Lcom/facebook/user/LastActive;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Lcom/facebook/contacts/a/c;->a(Lcom/facebook/user/UserKey;Lcom/facebook/user/LastActive;)V

    goto :goto_2

    .line 173
    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0

    .line 180
    :cond_1
    return-object v1
.end method

.method public a(Ljava/util/Collection;)Lcom/google/common/a/ex;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/user/UserKey;",
            ">;)",
            "Lcom/google/common/a/ex",
            "<",
            "Lcom/facebook/user/UserKey;",
            "Lcom/facebook/user/UserKey;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    .line 234
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 235
    :cond_0
    invoke-static {}, Lcom/google/common/a/ex;->c()Lcom/google/common/a/ex;

    move-result-object v0

    .line 291
    :goto_0
    return-object v0

    .line 238
    :cond_1
    invoke-static {}, Lcom/google/common/a/ex;->j()Lcom/google/common/a/ey;

    move-result-object v9

    .line 240
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v1

    .line 241
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v2

    .line 242
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserKey;

    .line 243
    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v5

    sget-object v6, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    if-ne v5, v6, :cond_2

    .line 244
    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 246
    :cond_2
    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 250
    :cond_3
    new-instance v0, Landroid/database/sqlite/SQLiteQueryBuilder;

    invoke-direct {v0}, Landroid/database/sqlite/SQLiteQueryBuilder;-><init>()V

    .line 251
    const-string v3, "(SELECT type, contact_internal_id, indexed_data FROM contacts_indexed_data WHERE type = \'profile_fbid\') AS fb INNER JOIN (SELECT type, contact_internal_id, indexed_data FROM contacts_indexed_data WHERE type = \'phone_verified\') AS phone ON fb.contact_internal_id = phone.contact_internal_id"

    invoke-virtual {v0, v3}, Landroid/database/sqlite/SQLiteQueryBuilder;->setTables(Ljava/lang/String;)V

    .line 260
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "fb.contact_internal_id IN (SELECT contact_internal_id FROM contacts_indexed_data WHERE (indexed_data IN "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v2}, Lcom/facebook/common/w/k;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " AND "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "type = \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "phone_verified"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\')"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " OR "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "(indexed_data IN "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v1}, Lcom/facebook/common/w/k;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " AND "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "type = \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "profile_fbid"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\')"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 272
    iget-object v1, p0, Lcom/facebook/contacts/data/l;->b:Lcom/facebook/contacts/data/b;

    invoke-virtual {v1}, Lcom/facebook/contacts/data/b;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 273
    sget-object v2, Lcom/facebook/contacts/data/l;->g:[Ljava/lang/String;

    move-object v5, v4

    move-object v6, v4

    move-object v7, v4

    move-object v8, v4

    invoke-virtual/range {v0 .. v8}, Landroid/database/sqlite/SQLiteQueryBuilder;->query(Landroid/database/sqlite/SQLiteDatabase;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 283
    :goto_2
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 284
    new-instance v0, Lcom/facebook/user/UserKey;

    sget-object v2, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    const/4 v3, 0x0

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    .line 285
    new-instance v2, Lcom/facebook/user/UserKey;

    sget-object v3, Lcom/facebook/user/n;->PHONE_NUMBER:Lcom/facebook/user/n;

    const/4 v4, 0x1

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    .line 286
    invoke-virtual {v9, v0, v2}, Lcom/google/common/a/ey;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ey;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    .line 289
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0

    :cond_4
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 291
    invoke-virtual {v9}, Lcom/google/common/a/ey;->a()Lcom/google/common/a/ex;

    move-result-object v0

    goto/16 :goto_0
.end method

.method public b()Lcom/google/common/a/es;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v4, 0x1

    const/4 v7, 0x0

    const/4 v5, 0x0

    .line 187
    iget-object v0, p0, Lcom/facebook/contacts/data/l;->b:Lcom/facebook/contacts/data/b;

    invoke-virtual {v0}, Lcom/facebook/contacts/data/b;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 188
    const-string v1, "ephemeral_data"

    sget-object v2, Lcom/facebook/contacts/data/l;->h:[Ljava/lang/String;

    const-string v3, "type = ?"

    new-array v4, v4, [Ljava/lang/String;

    const-string v6, "mobile_app_data"

    aput-object v6, v4, v7

    move-object v6, v5

    move-object v7, v5

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 197
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v2

    .line 199
    :goto_0
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 200
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 201
    const/4 v3, 0x1

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 202
    iget-object v4, p0, Lcom/facebook/contacts/data/l;->d:Lcom/facebook/user/ac;

    iget-object v5, p0, Lcom/facebook/contacts/data/l;->c:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v5, v3}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/facebook/user/ac;->g(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/user/MobileAppData;

    move-result-object v3

    .line 204
    new-instance v4, Lcom/facebook/user/o;

    invoke-direct {v4}, Lcom/facebook/user/o;-><init>()V

    sget-object v5, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-virtual {v4, v5, v0}, Lcom/facebook/user/o;->a(Lcom/facebook/user/n;Ljava/lang/String;)Lcom/facebook/user/o;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/facebook/user/o;->a(Lcom/facebook/user/MobileAppData;)Lcom/facebook/user/o;

    move-result-object v0

    .line 207
    invoke-virtual {v0}, Lcom/facebook/user/o;->x()Lcom/facebook/user/User;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 209
    :catch_0
    move-exception v0

    .line 210
    :try_start_1
    sget-object v3, Lcom/facebook/contacts/data/l;->a:Ljava/lang/Class;

    const-string v4, "IOException"

    invoke-static {v3, v4, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 212
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 214
    :goto_1
    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0

    .line 212
    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0
.end method

.method public b(Lcom/facebook/user/UserKey;)Lcom/google/common/a/ex;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/user/UserKey;",
            ")",
            "Lcom/google/common/a/ex",
            "<",
            "Lcom/facebook/user/UserKey;",
            "Lcom/facebook/user/UserKey;",
            ">;"
        }
    .end annotation

    .prologue
    .line 224
    invoke-static {p1}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/data/l;->a(Ljava/util/Collection;)Lcom/google/common/a/ex;

    move-result-object v0

    return-object v0
.end method
