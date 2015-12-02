.class public Lcom/facebook/contacts/service/a;
.super Ljava/lang/Object;
.source "AddressBookContactFetcher.java"


# instance fields
.field private final a:Landroid/content/ContentResolver;

.field private final b:Lcom/facebook/contacts/data/a;


# direct methods
.method public constructor <init>(Landroid/content/ContentResolver;Lcom/facebook/contacts/data/a;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/facebook/contacts/service/a;->a:Landroid/content/ContentResolver;

    .line 39
    iput-object p2, p0, Lcom/facebook/contacts/service/a;->b:Lcom/facebook/contacts/data/a;

    .line 40
    return-void
.end method

.method private a(Ljava/lang/String;Lcom/facebook/contacts/models/b;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v7, 0x2

    const/4 v6, 0x1

    const/4 v5, 0x0

    const/4 v3, 0x0

    .line 87
    .line 88
    iget-object v0, p0, Lcom/facebook/contacts/service/a;->a:Landroid/content/ContentResolver;

    sget-object v1, Landroid/provider/ContactsContract$PhoneLookup;->CONTENT_FILTER_URI:Landroid/net/Uri;

    invoke-static {p1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/String;

    const-string v4, "_id"

    aput-object v4, v2, v5

    const-string v4, "display_name"

    aput-object v4, v2, v6

    const-string v4, "lookup"

    aput-object v4, v2, v7

    move-object v4, v3

    move-object v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 99
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 100
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 101
    const/4 v0, 0x1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 102
    const/4 v2, 0x2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 103
    invoke-virtual {p2, v0}, Lcom/facebook/contacts/models/b;->d(Ljava/lang/String;)Lcom/facebook/contacts/models/b;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/facebook/contacts/models/b;->h(Ljava/lang/String;)Lcom/facebook/contacts/models/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 109
    return-object v3

    .line 107
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0
.end method

.method private a(Ljava/lang/String;Lcom/google/common/a/fk;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/common/a/fk",
            "<",
            "Lcom/facebook/contacts/models/entry/PhoneEntry;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 114
    iget-object v0, p0, Lcom/facebook/contacts/service/a;->a:Landroid/content/ContentResolver;

    sget-object v1, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "data1"

    aput-object v3, v2, v6

    const-string v3, "data2"

    aput-object v3, v2, v5

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "contact_id = "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move-object v5, v4

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 123
    :goto_0
    :try_start_0
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 124
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 125
    const/4 v0, 0x1

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    .line 126
    new-instance v0, Lcom/facebook/contacts/models/entry/PhoneEntry;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const-wide/16 v4, -0x1

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-direct/range {v0 .. v7}, Lcom/facebook/contacts/models/entry/PhoneEntry;-><init>(Ljava/lang/String;ZLjava/lang/String;JLjava/lang/String;I)V

    invoke-virtual {p2, v0}, Lcom/google/common/a/fk;->b(Ljava/lang/Object;)Lcom/google/common/a/fk;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 129
    :catchall_0
    move-exception v0

    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    throw v0

    :cond_0
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 131
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/user/UserKey;)Lcom/facebook/contacts/server/FetchContactResult;
    .locals 6

    .prologue
    .line 46
    new-instance v4, Lcom/facebook/contacts/models/b;

    invoke-direct {v4}, Lcom/facebook/contacts/models/b;-><init>()V

    .line 49
    invoke-static {}, Lcom/google/common/a/fi;->e()Lcom/google/common/a/fk;

    move-result-object v0

    .line 51
    invoke-virtual {p1}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1, v4}, Lcom/facebook/contacts/service/a;->a(Ljava/lang/String;Lcom/facebook/contacts/models/b;)Ljava/lang/String;

    move-result-object v1

    .line 52
    if-nez v1, :cond_0

    .line 53
    new-instance v0, Lcom/facebook/contacts/server/FetchContactResult;

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sget-object v4, Lcom/facebook/contacts/models/Contact;->a:Lcom/facebook/contacts/models/Contact;

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/facebook/contacts/server/FetchContactResult;-><init>(Lcom/facebook/fbservice/c/b;JLcom/facebook/contacts/models/Contact;Lcom/facebook/contacts/models/ContactDetails;)V

    .line 79
    :goto_0
    return-object v0

    .line 63
    :cond_0
    sget-object v2, Landroid/provider/ContactsContract$Contacts;->CONTENT_URI:Landroid/net/Uri;

    invoke-static {v2, v1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    .line 67
    invoke-virtual {v4, v2}, Lcom/facebook/contacts/models/b;->e(Ljava/lang/String;)Lcom/facebook/contacts/models/b;

    .line 68
    invoke-virtual {v4, v2}, Lcom/facebook/contacts/models/b;->f(Ljava/lang/String;)Lcom/facebook/contacts/models/b;

    .line 70
    invoke-direct {p0, v1, v0}, Lcom/facebook/contacts/service/a;->a(Ljava/lang/String;Lcom/google/common/a/fk;)V

    .line 75
    iget-object v2, p0, Lcom/facebook/contacts/service/a;->b:Lcom/facebook/contacts/data/a;

    invoke-virtual {v0}, Lcom/google/common/a/fk;->b()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/facebook/contacts/data/a;->a(Lcom/google/common/a/es;)Lcom/facebook/contacts/models/EntrySection;

    move-result-object v0

    .line 78
    new-instance v5, Lcom/facebook/contacts/models/ContactDetails;

    const/4 v2, 0x0

    invoke-direct {v5, v1, v0, v2}, Lcom/facebook/contacts/models/ContactDetails;-><init>(Ljava/lang/String;Lcom/facebook/contacts/models/EntrySection;Z)V

    .line 79
    new-instance v0, Lcom/facebook/contacts/server/FetchContactResult;

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v4}, Lcom/facebook/contacts/models/b;->u()Lcom/facebook/contacts/models/Contact;

    move-result-object v4

    invoke-direct/range {v0 .. v5}, Lcom/facebook/contacts/server/FetchContactResult;-><init>(Lcom/facebook/fbservice/c/b;JLcom/facebook/contacts/models/Contact;Lcom/facebook/contacts/models/ContactDetails;)V

    goto :goto_0
.end method
