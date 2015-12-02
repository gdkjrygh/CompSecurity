.class public Lcom/facebook/orca/p/a;
.super Ljava/lang/Object;
.source "BuiltInContactsUserIterator.java"


# instance fields
.field protected a:Landroid/database/Cursor;

.field private final b:Landroid/content/ContentResolver;

.field private final c:Lcom/facebook/user/i;

.field private d:Lcom/facebook/user/o;


# direct methods
.method public constructor <init>(Landroid/content/ContentResolver;Lcom/facebook/user/i;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/facebook/orca/p/a;->b:Landroid/content/ContentResolver;

    .line 37
    iput-object p2, p0, Lcom/facebook/orca/p/a;->c:Lcom/facebook/user/i;

    .line 38
    return-void
.end method

.method private a(Ljava/lang/String;I)Lcom/facebook/user/UserPhoneNumber;
    .locals 4

    .prologue
    .line 169
    const-string v0, "parseSmsAddress"

    const-string v1, "parseSmsAddress"

    invoke-static {v0, v1}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 170
    iget-object v0, p0, Lcom/facebook/orca/p/a;->c:Lcom/facebook/user/i;

    invoke-virtual {v0, p1}, Lcom/facebook/user/i;->a(Ljava/lang/String;)Lcom/facebook/user/j;

    move-result-object v2

    .line 171
    const/4 v0, 0x0

    .line 172
    invoke-virtual {v2}, Lcom/facebook/user/j;->a()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 173
    invoke-virtual {v2, p2}, Lcom/facebook/user/j;->a(I)Lcom/facebook/user/UserPhoneNumber;

    move-result-object v0

    .line 175
    :cond_0
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    .line 176
    return-object v0
.end method

.method private b(Ljava/lang/String;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 64
    iget-object v0, p0, Lcom/facebook/orca/p/a;->b:Landroid/content/ContentResolver;

    sget-object v1, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "contact_id"

    aput-object v3, v2, v5

    const-string v3, "display_name"

    aput-object v3, v2, v6

    const/4 v3, 0x2

    const-string v4, "data1"

    aput-object v4, v2, v3

    const/4 v3, 0x3

    const-string v4, "data2"

    aput-object v4, v2, v3

    const-string v3, "contact_id = ?"

    new-array v4, v6, [Ljava/lang/String;

    aput-object p1, v4, v5

    const-string v5, "contact_id"

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/p/a;->a:Landroid/database/Cursor;

    .line 75
    return-void
.end method

.method private c(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v3, 0x0

    .line 85
    if-nez p1, :cond_0

    .line 104
    :goto_0
    return-object v3

    .line 89
    :cond_0
    sget-object v0, Landroid/provider/ContactsContract$PhoneLookup;->CONTENT_FILTER_URI:Landroid/net/Uri;

    invoke-static {p1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 91
    iget-object v0, p0, Lcom/facebook/orca/p/a;->b:Landroid/content/ContentResolver;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v4, "_id"

    aput-object v4, v2, v5

    move-object v4, v3

    move-object v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 98
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 99
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    .line 102
    :cond_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/facebook/orca/p/a;->a:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    .line 79
    iget-object v0, p0, Lcom/facebook/orca/p/a;->a:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 80
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/p/a;->a:Landroid/database/Cursor;

    .line 82
    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 55
    invoke-direct {p0, p1}, Lcom/facebook/orca/p/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 56
    if-eqz v0, :cond_0

    .line 57
    invoke-direct {p0, v0}, Lcom/facebook/orca/p/a;->b(Ljava/lang/String;)V

    .line 61
    :goto_0
    return-void

    .line 59
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/p/a;->a:Landroid/database/Cursor;

    goto :goto_0
.end method

.method public b()Lcom/facebook/user/User;
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 108
    iget-object v0, p0, Lcom/facebook/orca/p/a;->a:Landroid/database/Cursor;

    if-nez v0, :cond_1

    .line 165
    :cond_0
    :goto_0
    return-object v1

    .line 111
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/p/a;->a:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 113
    iget-object v0, p0, Lcom/facebook/orca/p/a;->a:Landroid/database/Cursor;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    .line 114
    iget-object v0, p0, Lcom/facebook/orca/p/a;->a:Landroid/database/Cursor;

    const/4 v4, 0x1

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 115
    iget-object v0, p0, Lcom/facebook/orca/p/a;->a:Landroid/database/Cursor;

    const/4 v5, 0x2

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 116
    iget-object v0, p0, Lcom/facebook/orca/p/a;->a:Landroid/database/Cursor;

    const/4 v6, 0x3

    invoke-interface {v0, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    .line 117
    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    .line 119
    iget-object v0, p0, Lcom/facebook/orca/p/a;->d:Lcom/facebook/user/o;

    if-nez v0, :cond_6

    .line 120
    new-instance v0, Lcom/facebook/user/o;

    invoke-direct {v0}, Lcom/facebook/user/o;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/p/a;->d:Lcom/facebook/user/o;

    .line 121
    iget-object v0, p0, Lcom/facebook/orca/p/a;->d:Lcom/facebook/user/o;

    sget-object v3, Lcom/facebook/user/n;->ADDRESS_BOOK:Lcom/facebook/user/n;

    invoke-virtual {v0, v3, v2}, Lcom/facebook/user/o;->a(Lcom/facebook/user/n;Ljava/lang/String;)Lcom/facebook/user/o;

    move-object v0, v1

    .line 128
    :goto_1
    iget-object v3, p0, Lcom/facebook/orca/p/a;->d:Lcom/facebook/user/o;

    invoke-virtual {v3}, Lcom/facebook/user/o;->h()Lcom/facebook/user/Name;

    move-result-object v3

    if-nez v3, :cond_2

    .line 129
    iget-object v3, p0, Lcom/facebook/orca/p/a;->d:Lcom/facebook/user/o;

    new-instance v7, Lcom/facebook/user/Name;

    invoke-direct {v7, v1, v1, v4}, Lcom/facebook/user/Name;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v7}, Lcom/facebook/user/o;->a(Lcom/facebook/user/Name;)Lcom/facebook/user/o;

    .line 131
    :cond_2
    iget-object v3, p0, Lcom/facebook/orca/p/a;->d:Lcom/facebook/user/o;

    invoke-virtual {v3}, Lcom/facebook/user/o;->i()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    .line 135
    sget-object v3, Landroid/provider/ContactsContract$Contacts;->CONTENT_URI:Landroid/net/Uri;

    invoke-static {v3, v2}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    .line 139
    iget-object v3, p0, Lcom/facebook/orca/p/a;->d:Lcom/facebook/user/o;

    invoke-virtual {v3, v2}, Lcom/facebook/user/o;->b(Ljava/lang/String;)Lcom/facebook/user/o;

    .line 140
    iget-object v3, p0, Lcom/facebook/orca/p/a;->d:Lcom/facebook/user/o;

    invoke-virtual {v3, v2}, Lcom/facebook/user/o;->c(Ljava/lang/String;)Lcom/facebook/user/o;

    .line 143
    :cond_3
    invoke-direct {p0, v5, v6}, Lcom/facebook/orca/p/a;->a(Ljava/lang/String;I)Lcom/facebook/user/UserPhoneNumber;

    move-result-object v3

    .line 144
    if-eqz v3, :cond_5

    .line 145
    iget-object v2, p0, Lcom/facebook/orca/p/a;->d:Lcom/facebook/user/o;

    invoke-virtual {v2}, Lcom/facebook/user/o;->d()Ljava/util/List;

    move-result-object v2

    .line 146
    if-nez v2, :cond_4

    .line 147
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v2

    .line 148
    iget-object v4, p0, Lcom/facebook/orca/p/a;->d:Lcom/facebook/user/o;

    invoke-virtual {v4, v2}, Lcom/facebook/user/o;->b(Ljava/util/List;)Lcom/facebook/user/o;

    .line 150
    :cond_4
    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    .line 151
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 155
    :cond_5
    if-eqz v0, :cond_1

    move-object v1, v0

    .line 156
    goto/16 :goto_0

    .line 122
    :cond_6
    iget-object v0, p0, Lcom/facebook/orca/p/a;->d:Lcom/facebook/user/o;

    invoke-virtual {v0}, Lcom/facebook/user/o;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 123
    iget-object v0, p0, Lcom/facebook/orca/p/a;->d:Lcom/facebook/user/o;

    invoke-virtual {v0}, Lcom/facebook/user/o;->x()Lcom/facebook/user/User;

    move-result-object v0

    .line 124
    new-instance v3, Lcom/facebook/user/o;

    invoke-direct {v3}, Lcom/facebook/user/o;-><init>()V

    iput-object v3, p0, Lcom/facebook/orca/p/a;->d:Lcom/facebook/user/o;

    .line 125
    iget-object v3, p0, Lcom/facebook/orca/p/a;->d:Lcom/facebook/user/o;

    sget-object v7, Lcom/facebook/user/n;->ADDRESS_BOOK:Lcom/facebook/user/n;

    invoke-virtual {v3, v7, v2}, Lcom/facebook/user/o;->a(Lcom/facebook/user/n;Ljava/lang/String;)Lcom/facebook/user/o;

    goto :goto_1

    .line 160
    :cond_7
    iget-object v0, p0, Lcom/facebook/orca/p/a;->d:Lcom/facebook/user/o;

    if-eqz v0, :cond_0

    .line 161
    iget-object v0, p0, Lcom/facebook/orca/p/a;->d:Lcom/facebook/user/o;

    invoke-virtual {v0}, Lcom/facebook/user/o;->x()Lcom/facebook/user/User;

    move-result-object v0

    .line 162
    iput-object v1, p0, Lcom/facebook/orca/p/a;->d:Lcom/facebook/user/o;

    move-object v1, v0

    .line 163
    goto/16 :goto_0

    :cond_8
    move-object v0, v1

    goto/16 :goto_1
.end method
