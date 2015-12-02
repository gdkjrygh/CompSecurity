.class public Lcom/facebook/contacts/e/a;
.super Ljava/lang/Object;
.source "ContactsUserIterator.java"

# interfaces
.implements Lcom/facebook/user/e;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/contacts/database/g;

.field private final c:Landroid/content/ContentResolver;

.field private final d:Lcom/facebook/contacts/data/x;

.field private e:Landroid/database/Cursor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 29
    const-class v0, Lcom/facebook/contacts/e/a;

    sput-object v0, Lcom/facebook/contacts/e/a;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/contacts/database/g;Landroid/content/ContentResolver;Lcom/facebook/contacts/data/x;)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/facebook/contacts/e/a;->b:Lcom/facebook/contacts/database/g;

    .line 42
    iput-object p2, p0, Lcom/facebook/contacts/e/a;->c:Landroid/content/ContentResolver;

    .line 43
    iput-object p3, p0, Lcom/facebook/contacts/e/a;->d:Lcom/facebook/contacts/data/x;

    .line 44
    return-void
.end method


# virtual methods
.method public a()V
    .locals 7

    .prologue
    const/4 v4, 0x0

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "type IN "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/models/a/a;->MESSAGABLE_TYPES:Lcom/google/common/a/es;

    invoke-static {v1}, Lcom/facebook/common/w/k;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "AND fbid IS NOT NULL"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 50
    iget-object v0, p0, Lcom/facebook/contacts/e/a;->c:Landroid/content/ContentResolver;

    iget-object v1, p0, Lcom/facebook/contacts/e/a;->d:Lcom/facebook/contacts/data/x;

    iget-object v1, v1, Lcom/facebook/contacts/data/x;->c:Lcom/facebook/contacts/data/z;

    iget-object v1, v1, Lcom/facebook/contacts/data/z;->a:Landroid/net/Uri;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v5, 0x0

    const-string v6, "data"

    aput-object v6, v2, v5

    move-object v5, v4

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/e/a;->e:Landroid/database/Cursor;

    .line 57
    return-void
.end method

.method public a(I)V
    .locals 7

    .prologue
    .line 60
    sget-object v0, Lcom/facebook/contacts/e/a;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "initTopFriends: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "type IN "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/models/a/a;->MESSAGABLE_TYPES:Lcom/google/common/a/es;

    invoke-static {v1}, Lcom/facebook/common/w/k;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "AND fbid IS NOT NULL "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "AND communication_rank > 0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 66
    iget-object v0, p0, Lcom/facebook/contacts/e/a;->c:Landroid/content/ContentResolver;

    iget-object v1, p0, Lcom/facebook/contacts/e/a;->d:Lcom/facebook/contacts/data/x;

    iget-object v1, v1, Lcom/facebook/contacts/data/x;->c:Lcom/facebook/contacts/data/z;

    iget-object v1, v1, Lcom/facebook/contacts/data/z;->a:Landroid/net/Uri;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "data"

    aput-object v5, v2, v4

    const/4 v4, 0x0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "communication_rank DESC LIMIT "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/e/a;->e:Landroid/database/Cursor;

    .line 73
    return-void
.end method

.method public a(Lcom/google/common/a/em;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/em",
            "<",
            "Lcom/facebook/user/UserKey;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    .line 152
    sget-object v0, Lcom/facebook/contacts/e/a;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "initWithUserKeyExclusion: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 154
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "type IN "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/models/a/a;->MESSAGABLE_TYPES:Lcom/google/common/a/es;

    invoke-static {v1}, Lcom/facebook/common/w/k;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "AND fbid NOT IN "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/user/UserKey;->b(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/k;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "AND fbid IS NOT NULL"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 158
    iget-object v0, p0, Lcom/facebook/contacts/e/a;->c:Landroid/content/ContentResolver;

    iget-object v1, p0, Lcom/facebook/contacts/e/a;->d:Lcom/facebook/contacts/data/x;

    iget-object v1, v1, Lcom/facebook/contacts/data/x;->c:Lcom/facebook/contacts/data/z;

    iget-object v1, v1, Lcom/facebook/contacts/data/z;->a:Landroid/net/Uri;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v5, 0x0

    const-string v6, "data"

    aput-object v6, v2, v5

    move-object v5, v4

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/e/a;->e:Landroid/database/Cursor;

    .line 165
    return-void
.end method

.method public a(Ljava/lang/String;I)V
    .locals 7

    .prologue
    .line 101
    sget-object v0, Lcom/facebook/contacts/e/a;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "initWithSearchRestrict: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " max: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 102
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "type IN "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/models/a/a;->MESSAGABLE_TYPES:Lcom/google/common/a/es;

    invoke-static {v1}, Lcom/facebook/common/w/k;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 103
    iget-object v0, p0, Lcom/facebook/contacts/e/a;->c:Landroid/content/ContentResolver;

    iget-object v1, p0, Lcom/facebook/contacts/e/a;->d:Lcom/facebook/contacts/data/x;

    iget-object v1, v1, Lcom/facebook/contacts/data/x;->e:Lcom/facebook/contacts/data/ac;

    invoke-virtual {v1, p1}, Lcom/facebook/contacts/data/ac;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "data"

    aput-object v5, v2, v4

    const/4 v4, 0x0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "_id LIMIT "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/e/a;->e:Landroid/database/Cursor;

    .line 110
    return-void
.end method

.method public a(Ljava/util/Collection;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/user/UserKey;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    .line 113
    sget-object v0, Lcom/facebook/contacts/e/a;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "initWithUserKeyRestrict: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " keys"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 114
    sget-object v0, Lcom/facebook/contacts/e/a;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "User keys: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 117
    invoke-static {p1}, Lcom/facebook/user/UserKey;->b(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    .line 118
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "type IN "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/facebook/contacts/models/a/a;->MESSAGABLE_TYPES:Lcom/google/common/a/es;

    invoke-static {v2}, Lcom/facebook/common/w/k;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "AND fbid IN "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v0}, Lcom/facebook/common/w/k;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 122
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v5, v4

    .line 142
    :goto_0
    iget-object v0, p0, Lcom/facebook/contacts/e/a;->c:Landroid/content/ContentResolver;

    iget-object v1, p0, Lcom/facebook/contacts/e/a;->d:Lcom/facebook/contacts/data/x;

    iget-object v1, v1, Lcom/facebook/contacts/data/x;->c:Lcom/facebook/contacts/data/z;

    iget-object v1, v1, Lcom/facebook/contacts/data/z;->a:Landroid/net/Uri;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v6, 0x0

    const-string v7, "data"

    aput-object v7, v2, v6

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/e/a;->e:Landroid/database/Cursor;

    .line 149
    return-void

    .line 140
    :cond_0
    const-string v1, "fbid"

    invoke-static {v1, v0}, Lcom/facebook/common/w/k;->a(Ljava/lang/String;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v5

    goto :goto_0
.end method

.method public b()V
    .locals 7

    .prologue
    const/4 v3, 0x0

    const/4 v5, 0x0

    .line 76
    sget-object v0, Lcom/facebook/contacts/e/a;->a:Ljava/lang/Class;

    const-string v1, "initFavoriteFriends"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 77
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v6

    .line 78
    iget-object v0, p0, Lcom/facebook/contacts/e/a;->c:Landroid/content/ContentResolver;

    iget-object v1, p0, Lcom/facebook/contacts/e/a;->d:Lcom/facebook/contacts/data/x;

    iget-object v1, v1, Lcom/facebook/contacts/data/x;->d:Lcom/facebook/contacts/data/aa;

    iget-object v1, v1, Lcom/facebook/contacts/data/aa;->a:Landroid/net/Uri;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v4, "fbid"

    aput-object v4, v2, v5

    const-string v5, "display_order ASC"

    move-object v4, v3

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 86
    :goto_0
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 88
    new-instance v2, Lcom/facebook/user/UserKey;

    sget-object v3, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-direct {v2, v3, v0}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 91
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0

    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 94
    sget-object v0, Lcom/facebook/contacts/e/a;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Looking up favorites by user ID: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 97
    invoke-virtual {p0, v6}, Lcom/facebook/contacts/e/a;->a(Ljava/util/Collection;)V

    .line 98
    return-void
.end method

.method public c()Lcom/facebook/user/User;
    .locals 5

    .prologue
    const/4 v0, 0x0

    const/4 v4, 0x0

    .line 168
    iget-object v1, p0, Lcom/facebook/contacts/e/a;->e:Landroid/database/Cursor;

    if-nez v1, :cond_0

    .line 169
    sget-object v1, Lcom/facebook/contacts/e/a;->a:Ljava/lang/Class;

    const-string v2, "next: not initialized, skipping"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 182
    :goto_0
    return-object v0

    .line 173
    :cond_0
    iget-object v1, p0, Lcom/facebook/contacts/e/a;->e:Landroid/database/Cursor;

    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_1

    .line 174
    sget-object v1, Lcom/facebook/contacts/e/a;->a:Ljava/lang/Class;

    const-string v2, "next: cursor empty"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 178
    :cond_1
    iget-object v0, p0, Lcom/facebook/contacts/e/a;->b:Lcom/facebook/contacts/database/g;

    iget-object v1, p0, Lcom/facebook/contacts/e/a;->e:Landroid/database/Cursor;

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/database/g;->a(Ljava/lang/String;)Lcom/facebook/user/User;

    move-result-object v0

    .line 180
    sget-object v1, Lcom/facebook/contacts/e/a;->a:Ljava/lang/Class;

    const-string v2, "next: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public d()V
    .locals 2

    .prologue
    .line 186
    sget-object v0, Lcom/facebook/contacts/e/a;->a:Ljava/lang/Class;

    const-string v1, "closing"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 187
    iget-object v0, p0, Lcom/facebook/contacts/e/a;->e:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    .line 188
    iget-object v0, p0, Lcom/facebook/contacts/e/a;->e:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 189
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/contacts/e/a;->e:Landroid/database/Cursor;

    .line 191
    :cond_0
    return-void
.end method
