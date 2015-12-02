.class public Lcom/facebook/contacts/e/e;
.super Ljava/lang/Object;
.source "PhoneUserIterator.java"


# static fields
.field private static final a:Ljava/lang/String;

.field private static final f:[Ljava/lang/String;

.field private static final g:[Ljava/lang/String;

.field private static final h:[Ljava/lang/String;


# instance fields
.field private final b:Landroid/content/ContentResolver;

.field private final c:Lcom/facebook/user/i;

.field private d:Landroid/database/Cursor;

.field private e:Lcom/facebook/user/o;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 35
    const-class v0, Lcom/facebook/contacts/e/e;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/contacts/e/e;->a:Ljava/lang/String;

    .line 43
    new-array v0, v4, [Ljava/lang/String;

    const-string v1, "_id"

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/contacts/e/e;->f:[Ljava/lang/String;

    .line 47
    const/16 v0, 0x11

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "_id"

    aput-object v1, v0, v3

    const-string v1, "contact_id"

    aput-object v1, v0, v4

    const/4 v1, 0x2

    const-string v2, "deleted"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "data_version"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "mimetype"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "is_primary"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "is_super_primary"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "data_version"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "data1"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "data2"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "data3"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "data4"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, "data5"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string v2, "data6"

    aput-object v2, v0, v1

    const/16 v1, 0xe

    const-string v2, "data7"

    aput-object v2, v0, v1

    const/16 v1, 0xf

    const-string v2, "data8"

    aput-object v2, v0, v1

    const/16 v1, 0x10

    const-string v2, "data9"

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/contacts/e/e;->g:[Ljava/lang/String;

    .line 67
    new-array v0, v4, [Ljava/lang/String;

    const-string v1, "_id"

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/contacts/e/e;->h:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/ContentResolver;Lcom/facebook/user/i;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    iput-object p1, p0, Lcom/facebook/contacts/e/e;->b:Landroid/content/ContentResolver;

    .line 81
    iput-object p2, p0, Lcom/facebook/contacts/e/e;->c:Lcom/facebook/user/i;

    .line 82
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 224
    invoke-static {}, Lcom/facebook/d/d/e;->a()Lcom/facebook/d/d/f;

    move-result-object v4

    .line 225
    if-eqz p1, :cond_0

    .line 226
    invoke-static {p1}, Lcom/facebook/d/d/e;->a(Ljava/lang/String;)Lcom/facebook/d/d/j;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/facebook/d/d/f;->a(Lcom/facebook/d/d/j;)V

    .line 229
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "mimetype IN "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "vnd.android.cursor.item/name"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-string v3, "vnd.android.cursor.item/email_v2"

    aput-object v3, v1, v2

    const/4 v2, 0x2

    const-string v3, "vnd.android.cursor.item/phone_v2"

    aput-object v3, v1, v2

    invoke-static {v1}, Lcom/facebook/common/w/k;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 234
    invoke-static {v0}, Lcom/facebook/d/d/e;->a(Ljava/lang/String;)Lcom/facebook/d/d/j;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/facebook/d/d/f;->a(Lcom/facebook/d/d/j;)V

    .line 236
    iget-object v0, p0, Lcom/facebook/contacts/e/e;->b:Landroid/content/ContentResolver;

    sget-object v1, Landroid/provider/ContactsContract$RawContactsEntity;->CONTENT_URI:Landroid/net/Uri;

    sget-object v2, Lcom/facebook/contacts/e/e;->g:[Ljava/lang/String;

    invoke-virtual {v4}, Lcom/facebook/d/d/f;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4}, Lcom/facebook/d/d/f;->b()[Ljava/lang/String;

    move-result-object v4

    const-string v5, "contact_id"

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    .line 239
    return-void
.end method

.method private a(Ljava/lang/String;ILjava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 156
    sget-object v0, Landroid/provider/ContactsContract$Contacts;->CONTENT_FILTER_URI:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v1

    .line 157
    iget-object v0, p0, Lcom/facebook/contacts/e/e;->b:Landroid/content/ContentResolver;

    sget-object v2, Lcom/facebook/contacts/e/e;->f:[Ljava/lang/String;

    move-object v4, v3

    move-object v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 159
    :goto_0
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v0, p2, :cond_0

    .line 160
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 163
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0

    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 165
    return-void
.end method

.method private a(Ljava/util/Collection;Lcom/facebook/contacts/e/f;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/user/UserKey;",
            ">;",
            "Lcom/facebook/contacts/e/f;",
            ")V"
        }
    .end annotation

    .prologue
    .line 193
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserKey;

    .line 194
    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v2

    sget-object v3, Lcom/facebook/user/n;->ADDRESS_BOOK:Lcom/facebook/user/n;

    if-eq v2, v3, :cond_0

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v2

    sget-object v3, Lcom/facebook/user/n;->PHONE_NUMBER:Lcom/facebook/user/n;

    if-eq v2, v3, :cond_0

    .line 196
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot look up phone for user key "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 200
    :cond_1
    invoke-static {p1}, Lcom/facebook/user/UserKey;->b(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v1

    .line 203
    sget-object v0, Lcom/facebook/contacts/e/f;->EXCLUDE:Lcom/facebook/contacts/e/f;

    if-ne p2, v0, :cond_3

    .line 204
    const-string v0, " NOT IN "

    .line 209
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "contact_id"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v1}, Lcom/facebook/common/w/k;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 213
    sget-object v1, Lcom/facebook/contacts/e/e;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Searching for contact IDs where: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    invoke-direct {p0, v0}, Lcom/facebook/contacts/e/e;->a(Ljava/lang/String;)V

    .line 217
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    iget-object v1, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v1

    if-eq v0, v1, :cond_2

    .line 218
    sget-object v0, Lcom/facebook/contacts/e/e;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Looked for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " contacts, but only found "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    :cond_2
    return-void

    .line 206
    :cond_3
    const-string v0, " IN "

    goto :goto_0
.end method

.method private a(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 148
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "contact_id IN "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/common/w/k;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 150
    iget-object v0, p0, Lcom/facebook/contacts/e/e;->b:Landroid/content/ContentResolver;

    sget-object v1, Landroid/provider/ContactsContract$RawContactsEntity;->CONTENT_URI:Landroid/net/Uri;

    sget-object v2, Lcom/facebook/contacts/e/e;->g:[Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "contact_id"

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    .line 152
    return-void
.end method

.method private b(Ljava/lang/String;I)Lcom/facebook/user/UserPhoneNumber;
    .locals 3

    .prologue
    .line 387
    const-string v0, "parseSmsAddress"

    const-string v1, "parseSmsAddress"

    invoke-static {v0, v1}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 388
    iget-object v0, p0, Lcom/facebook/contacts/e/e;->c:Lcom/facebook/user/i;

    invoke-virtual {v0, p1}, Lcom/facebook/user/i;->a(Ljava/lang/String;)Lcom/facebook/user/j;

    move-result-object v2

    .line 389
    const/4 v0, 0x0

    .line 390
    invoke-virtual {v2}, Lcom/facebook/user/j;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 391
    iget-object v0, p0, Lcom/facebook/contacts/e/e;->c:Lcom/facebook/user/i;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/user/i;->a(Ljava/lang/String;I)Lcom/facebook/user/UserPhoneNumber;

    move-result-object v0

    .line 393
    :cond_0
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    .line 394
    return-object v0
.end method

.method private b(Ljava/lang/String;ILjava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 168
    sget-object v0, Landroid/provider/ContactsContract$PhoneLookup;->CONTENT_FILTER_URI:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v1

    .line 170
    iget-object v0, p0, Lcom/facebook/contacts/e/e;->b:Landroid/content/ContentResolver;

    sget-object v2, Lcom/facebook/contacts/e/e;->f:[Ljava/lang/String;

    move-object v4, v3

    move-object v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 172
    :goto_0
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v0, p2, :cond_0

    .line 173
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 176
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0

    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 178
    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 85
    invoke-direct {p0, v3}, Lcom/facebook/contacts/e/e;->a(Ljava/lang/String;)V

    .line 86
    iget-object v0, p0, Lcom/facebook/contacts/e/e;->b:Landroid/content/ContentResolver;

    sget-object v1, Landroid/provider/ContactsContract$RawContactsEntity;->CONTENT_URI:Landroid/net/Uri;

    sget-object v2, Lcom/facebook/contacts/e/e;->g:[Ljava/lang/String;

    const-string v5, "contact_id"

    move-object v4, v3

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    .line 88
    return-void
.end method

.method public a(Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 91
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    .line 92
    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/contacts/e/e;->a(Ljava/lang/String;ILjava/util/List;)V

    .line 93
    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/contacts/e/e;->b(Ljava/lang/String;ILjava/util/List;)V

    .line 94
    invoke-direct {p0, v0}, Lcom/facebook/contacts/e/e;->a(Ljava/util/List;)V

    .line 95
    return-void
.end method

.method public a(Ljava/util/Collection;)V
    .locals 2
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
    .line 187
    const-string v0, "initWithExcludedUserKeys"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 188
    sget-object v1, Lcom/facebook/contacts/e/f;->EXCLUDE:Lcom/facebook/contacts/e/f;

    invoke-direct {p0, p1, v1}, Lcom/facebook/contacts/e/e;->a(Ljava/util/Collection;Lcom/facebook/contacts/e/f;)V

    .line 189
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    .line 190
    return-void
.end method

.method public b()Ljava/util/Collection;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/user/UserKey;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    .line 104
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v7

    .line 108
    :try_start_0
    iget-object v0, p0, Lcom/facebook/contacts/e/e;->b:Landroid/content/ContentResolver;

    sget-object v1, Landroid/provider/ContactsContract$Contacts;->CONTENT_STREQUENT_URI:Landroid/net/Uri;

    sget-object v2, Lcom/facebook/contacts/e/e;->h:[Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v1

    .line 114
    if-nez v1, :cond_2

    .line 115
    :try_start_1
    sget-object v0, Lcom/facebook/contacts/e/e;->a:Ljava/lang/String;

    const-string v2, "Frequent contacts fetch returned null cursor"

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 138
    :cond_0
    :goto_0
    if-eqz v1, :cond_1

    .line 139
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 143
    :cond_1
    :goto_1
    sget-object v0, Lcom/facebook/contacts/e/f;->INCLUDE:Lcom/facebook/contacts/e/f;

    invoke-direct {p0, v7, v0}, Lcom/facebook/contacts/e/e;->a(Ljava/util/Collection;Lcom/facebook/contacts/e/f;)V

    .line 144
    return-object v7

    .line 116
    :cond_2
    :try_start_2
    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_3

    .line 117
    sget-object v0, Lcom/facebook/contacts/e/e;->a:Ljava/lang/String;

    const-string v2, "Frequent contacts fetch returned no entries"

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 126
    :catch_0
    move-exception v0

    .line 136
    :goto_2
    :try_start_3
    sget-object v2, Lcom/facebook/contacts/e/e;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Couldn\'t fetch frequent contacts: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 138
    if-eqz v1, :cond_1

    .line 139
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 119
    :cond_3
    :try_start_4
    sget-object v0, Lcom/facebook/contacts/e/e;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Frequent contacts fetch returned "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " rows"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    :goto_3
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 122
    new-instance v0, Lcom/facebook/user/UserKey;

    sget-object v2, Lcom/facebook/user/n;->ADDRESS_BOOK:Lcom/facebook/user/n;

    const/4 v3, 0x0

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_3

    .line 138
    :catchall_0
    move-exception v0

    :goto_4
    if-eqz v1, :cond_4

    .line 139
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_4
    throw v0

    .line 138
    :catchall_1
    move-exception v0

    move-object v1, v6

    goto :goto_4

    .line 126
    :catch_1
    move-exception v0

    move-object v1, v6

    goto :goto_2
.end method

.method public c()V
    .locals 1

    .prologue
    .line 242
    iget-object v0, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    .line 243
    iget-object v0, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 244
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    .line 246
    :cond_0
    return-void
.end method

.method public d()I
    .locals 7

    .prologue
    const/4 v0, 0x0

    const/4 v6, -0x1

    .line 249
    iget-object v1, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    if-eqz v1, :cond_2

    .line 251
    const-wide/16 v1, -0x1

    .line 256
    iget-object v3, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    invoke-interface {v3, v6}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 260
    :cond_0
    :goto_0
    iget-object v3, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 261
    iget-object v3, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    const/4 v4, 0x2

    invoke-interface {v3, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    .line 262
    if-nez v3, :cond_0

    .line 266
    iget-object v3, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    const/4 v4, 0x1

    invoke-interface {v3, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    .line 267
    cmp-long v5, v3, v1

    if-eqz v5, :cond_0

    .line 268
    add-int/lit8 v0, v0, 0x1

    move-wide v1, v3

    .line 269
    goto :goto_0

    .line 275
    :cond_1
    iget-object v1, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    invoke-interface {v1, v6}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 278
    :cond_2
    return v0
.end method

.method public e()Lcom/facebook/user/User;
    .locals 13

    .prologue
    const/4 v3, 0x0

    const/4 v1, 0x0

    const/16 v12, 0xa

    const/16 v11, 0x9

    const/16 v10, 0x8

    .line 283
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 285
    iget-object v0, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    .line 286
    iget-object v0, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    const/4 v2, 0x1

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    .line 287
    iget-object v0, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    const/4 v2, 0x2

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    .line 288
    iget-object v2, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    const/4 v8, 0x3

    invoke-interface {v2, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 289
    iget-object v2, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    const/4 v8, 0x4

    invoke-interface {v2, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 290
    iget-object v8, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    const/4 v9, 0x5

    invoke-interface {v8, v9}, Landroid/database/Cursor;->getInt(I)I

    .line 291
    iget-object v8, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    const/4 v9, 0x6

    invoke-interface {v8, v9}, Landroid/database/Cursor;->getInt(I)I

    move-result v8

    .line 293
    if-eqz v0, :cond_1

    .line 297
    sget-object v0, Lcom/facebook/contacts/e/e;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Skipping deleted raw contact row: "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 302
    :cond_1
    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    .line 303
    iget-object v0, p0, Lcom/facebook/contacts/e/e;->e:Lcom/facebook/user/o;

    if-nez v0, :cond_5

    .line 304
    new-instance v0, Lcom/facebook/user/o;

    invoke-direct {v0}, Lcom/facebook/user/o;-><init>()V

    iput-object v0, p0, Lcom/facebook/contacts/e/e;->e:Lcom/facebook/user/o;

    .line 305
    iget-object v0, p0, Lcom/facebook/contacts/e/e;->e:Lcom/facebook/user/o;

    sget-object v5, Lcom/facebook/user/n;->ADDRESS_BOOK:Lcom/facebook/user/n;

    invoke-virtual {v0, v5, v4}, Lcom/facebook/user/o;->a(Lcom/facebook/user/n;Ljava/lang/String;)Lcom/facebook/user/o;

    move-object v0, v1

    .line 312
    :goto_1
    iget-object v4, p0, Lcom/facebook/contacts/e/e;->e:Lcom/facebook/user/o;

    invoke-virtual {v4}, Lcom/facebook/user/o;->k()Lcom/facebook/user/PicCropInfo;

    move-result-object v4

    if-nez v4, :cond_2

    .line 319
    sget-object v4, Landroid/provider/ContactsContract$Contacts;->CONTENT_URI:Landroid/net/Uri;

    iget-object v5, p0, Lcom/facebook/contacts/e/e;->e:Lcom/facebook/user/o;

    invoke-virtual {v5}, Lcom/facebook/user/o;->b()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/user/PicCropInfo;->a(Ljava/lang/String;)Lcom/facebook/user/PicCropInfo;

    move-result-object v4

    .line 323
    sget-object v5, Lcom/facebook/contacts/e/e;->a:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Using pic crop info for contact "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, p0, Lcom/facebook/contacts/e/e;->e:Lcom/facebook/user/o;

    invoke-virtual {v7}, Lcom/facebook/user/o;->b()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    iget-object v5, p0, Lcom/facebook/contacts/e/e;->e:Lcom/facebook/user/o;

    invoke-virtual {v5, v4}, Lcom/facebook/user/o;->a(Lcom/facebook/user/PicCropInfo;)Lcom/facebook/user/o;

    .line 327
    :cond_2
    const-string v4, "vnd.android.cursor.item/name"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 328
    iget-object v2, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    invoke-interface {v2, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 329
    iget-object v4, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    invoke-interface {v4, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 330
    iget-object v5, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    invoke-interface {v5, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 332
    new-instance v6, Lcom/facebook/user/Name;

    invoke-direct {v6, v4, v5, v2}, Lcom/facebook/user/Name;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 333
    invoke-virtual {v6}, Lcom/facebook/user/Name;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    .line 335
    iget-object v2, p0, Lcom/facebook/contacts/e/e;->e:Lcom/facebook/user/o;

    invoke-virtual {v2}, Lcom/facebook/user/o;->h()Lcom/facebook/user/Name;

    move-result-object v2

    .line 336
    if-nez v2, :cond_6

    move v2, v3

    .line 341
    :goto_2
    if-gt v4, v2, :cond_3

    if-eqz v8, :cond_4

    if-lez v4, :cond_4

    .line 342
    :cond_3
    iget-object v2, p0, Lcom/facebook/contacts/e/e;->e:Lcom/facebook/user/o;

    invoke-virtual {v2, v6}, Lcom/facebook/user/o;->a(Lcom/facebook/user/Name;)Lcom/facebook/user/o;

    .line 373
    :cond_4
    :goto_3
    if-eqz v0, :cond_0

    .line 383
    :goto_4
    return-object v0

    .line 306
    :cond_5
    iget-object v0, p0, Lcom/facebook/contacts/e/e;->e:Lcom/facebook/user/o;

    invoke-virtual {v0}, Lcom/facebook/user/o;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    .line 307
    iget-object v0, p0, Lcom/facebook/contacts/e/e;->e:Lcom/facebook/user/o;

    invoke-virtual {v0}, Lcom/facebook/user/o;->x()Lcom/facebook/user/User;

    move-result-object v0

    .line 308
    new-instance v5, Lcom/facebook/user/o;

    invoke-direct {v5}, Lcom/facebook/user/o;-><init>()V

    iput-object v5, p0, Lcom/facebook/contacts/e/e;->e:Lcom/facebook/user/o;

    .line 309
    iget-object v5, p0, Lcom/facebook/contacts/e/e;->e:Lcom/facebook/user/o;

    sget-object v6, Lcom/facebook/user/n;->ADDRESS_BOOK:Lcom/facebook/user/n;

    invoke-virtual {v5, v6, v4}, Lcom/facebook/user/o;->a(Lcom/facebook/user/n;Ljava/lang/String;)Lcom/facebook/user/o;

    goto/16 :goto_1

    .line 336
    :cond_6
    invoke-virtual {v2}, Lcom/facebook/user/Name;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    goto :goto_2

    .line 344
    :cond_7
    const-string v4, "vnd.android.cursor.item/email_v2"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    .line 345
    iget-object v2, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    invoke-interface {v2, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 346
    iget-object v2, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    invoke-interface {v2, v11}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    .line 347
    iget-object v2, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    invoke-interface {v2, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 349
    invoke-static {v4}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 350
    iget-object v2, p0, Lcom/facebook/contacts/e/e;->e:Lcom/facebook/user/o;

    invoke-virtual {v2}, Lcom/facebook/user/o;->c()Ljava/util/List;

    move-result-object v2

    .line 351
    if-nez v2, :cond_8

    .line 352
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v2

    .line 353
    iget-object v6, p0, Lcom/facebook/contacts/e/e;->e:Lcom/facebook/user/o;

    invoke-virtual {v6, v2}, Lcom/facebook/user/o;->a(Ljava/util/List;)Lcom/facebook/user/o;

    .line 355
    :cond_8
    new-instance v6, Lcom/facebook/user/UserEmailAddress;

    invoke-direct {v6, v4, v5}, Lcom/facebook/user/UserEmailAddress;-><init>(Ljava/lang/String;I)V

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 358
    :cond_9
    const-string v4, "vnd.android.cursor.item/phone_v2"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 359
    iget-object v2, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    invoke-interface {v2, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 360
    iget-object v4, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    invoke-interface {v4, v11}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    .line 361
    iget-object v5, p0, Lcom/facebook/contacts/e/e;->d:Landroid/database/Cursor;

    invoke-interface {v5, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 362
    invoke-direct {p0, v2, v4}, Lcom/facebook/contacts/e/e;->b(Ljava/lang/String;I)Lcom/facebook/user/UserPhoneNumber;

    move-result-object v4

    .line 364
    if-eqz v4, :cond_4

    .line 365
    iget-object v2, p0, Lcom/facebook/contacts/e/e;->e:Lcom/facebook/user/o;

    invoke-virtual {v2}, Lcom/facebook/user/o;->d()Ljava/util/List;

    move-result-object v2

    .line 366
    if-nez v2, :cond_a

    .line 367
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v2

    .line 368
    iget-object v5, p0, Lcom/facebook/contacts/e/e;->e:Lcom/facebook/user/o;

    invoke-virtual {v5, v2}, Lcom/facebook/user/o;->b(Ljava/util/List;)Lcom/facebook/user/o;

    .line 370
    :cond_a
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    .line 378
    :cond_b
    iget-object v0, p0, Lcom/facebook/contacts/e/e;->e:Lcom/facebook/user/o;

    if-eqz v0, :cond_c

    .line 379
    iget-object v0, p0, Lcom/facebook/contacts/e/e;->e:Lcom/facebook/user/o;

    invoke-virtual {v0}, Lcom/facebook/user/o;->x()Lcom/facebook/user/User;

    move-result-object v0

    .line 380
    iput-object v1, p0, Lcom/facebook/contacts/e/e;->e:Lcom/facebook/user/o;

    goto/16 :goto_4

    :cond_c
    move-object v0, v1

    .line 383
    goto/16 :goto_4

    :cond_d
    move-object v0, v1

    goto/16 :goto_1
.end method
