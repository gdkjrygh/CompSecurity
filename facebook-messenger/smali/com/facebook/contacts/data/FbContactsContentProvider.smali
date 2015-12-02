.class public Lcom/facebook/contacts/data/FbContactsContentProvider;
.super Lcom/facebook/c/r;
.source "FbContactsContentProvider.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:Lcom/google/common/a/ev;
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

.field private static final d:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Lcom/facebook/contacts/data/ad;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:Lcom/google/common/base/CharMatcher;


# instance fields
.field private f:Lcom/facebook/contacts/data/b;

.field private g:Lcom/facebook/user/a/n;

.field private h:Lcom/facebook/contacts/data/x;

.field private i:Landroid/content/UriMatcher;

.field private j:Lcom/facebook/contacts/data/t;

.field private k:Lcom/facebook/contacts/data/u;

.field private l:Lcom/facebook/contacts/data/v;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 39
    const-class v0, Lcom/facebook/contacts/data/FbContactsContentProvider;

    sput-object v0, Lcom/facebook/contacts/data/FbContactsContentProvider;->a:Ljava/lang/Class;

    .line 41
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "_id"

    const-string v2, "internal_id"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "fbid"

    const-string v2, "fbid"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "type"

    const-string v2, "type"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "communication_rank"

    const-string v2, "communication_rank"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "sort_name_key"

    const-string v2, "sort_name_key"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "data"

    const-string v2, "data"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    sput-object v0, Lcom/facebook/contacts/data/FbContactsContentProvider;->b:Lcom/google/common/a/ev;

    .line 51
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "fbid"

    const-string v2, "fbid"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "display_order"

    const-string v2, "display_order"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    sput-object v0, Lcom/facebook/contacts/data/FbContactsContentProvider;->c:Lcom/google/common/a/ev;

    .line 58
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/data/ad;->PHONE_LOCAL:Lcom/facebook/contacts/data/ad;

    const-string v2, "phone_local"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/data/ad;->PHONE_NATIONAL:Lcom/facebook/contacts/data/ad;

    const-string v2, "phone_national"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/data/ad;->PHONE_E164:Lcom/facebook/contacts/data/ad;

    const-string v2, "phone_e164"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    sput-object v0, Lcom/facebook/contacts/data/FbContactsContentProvider;->d:Lcom/google/common/a/ev;

    .line 65
    const-string v0, "0123456789+"

    invoke-static {v0}, Lcom/google/common/base/CharMatcher;->anyOf(Ljava/lang/CharSequence;)Lcom/google/common/base/CharMatcher;

    move-result-object v0

    sput-object v0, Lcom/facebook/contacts/data/FbContactsContentProvider;->e:Lcom/google/common/base/CharMatcher;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/facebook/c/r;-><init>()V

    .line 245
    return-void
.end method

.method static synthetic a(Lcom/facebook/contacts/data/FbContactsContentProvider;)Lcom/facebook/contacts/data/b;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/contacts/data/FbContactsContentProvider;->f:Lcom/facebook/contacts/data/b;

    return-object v0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;)V
    .locals 3

    .prologue
    .line 414
    const-string v0, "_id"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 442
    :goto_0
    return-void

    .line 416
    :cond_0
    const-string v0, "data"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 418
    const-string v0, ", c.data AS data"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 419
    :cond_1
    const-string v0, "fbid"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 420
    const-string v0, "fbid"

    invoke-direct {p0, p3, v0}, Lcom/facebook/contacts/data/FbContactsContentProvider;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 421
    const-string v0, "fbid"

    const-string v1, "profile_fbid"

    invoke-direct {p0, p4, p1, v0, v1}, Lcom/facebook/contacts/data/FbContactsContentProvider;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 422
    :cond_2
    const-string v0, "type"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 423
    const-string v0, "type"

    invoke-direct {p0, p3, v0}, Lcom/facebook/contacts/data/FbContactsContentProvider;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 424
    const-string v0, "type"

    const-string v1, "contact_profile_type"

    invoke-direct {p0, p4, p1, v0, v1}, Lcom/facebook/contacts/data/FbContactsContentProvider;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 425
    :cond_3
    const-string v0, "communication_rank"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 426
    const-string v0, "communication_rank"

    invoke-direct {p0, p3, v0}, Lcom/facebook/contacts/data/FbContactsContentProvider;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 427
    const-string v0, "communication_rank"

    const-string v1, "communication_rank"

    invoke-direct {p0, p4, p1, v0, v1}, Lcom/facebook/contacts/data/FbContactsContentProvider;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 432
    :cond_4
    const-string v0, "sort_name_key"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 433
    const-string v0, "sort_name_key"

    invoke-direct {p0, p3, v0}, Lcom/facebook/contacts/data/FbContactsContentProvider;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 434
    const-string v0, "sort_name_key"

    const-string v1, "sort_name_key"

    invoke-direct {p0, p4, p1, v0, v1}, Lcom/facebook/contacts/data/FbContactsContentProvider;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 440
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown field: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private a(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 445
    const-string v0, ", idx_"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".indexed_data AS "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 446
    return-void
.end method

.method private a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 449
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " contacts_indexed_data AS idx_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ON ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "idx_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".contact_internal_id = c.internal_id "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "AND idx_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".type = \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\') "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 452
    return-void
.end method

.method static synthetic b(Lcom/facebook/contacts/data/FbContactsContentProvider;)Lcom/facebook/contacts/data/x;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/contacts/data/FbContactsContentProvider;->h:Lcom/facebook/contacts/data/x;

    return-object v0
.end method

.method static synthetic b()Lcom/google/common/a/ev;
    .locals 1

    .prologue
    .line 37
    sget-object v0, Lcom/facebook/contacts/data/FbContactsContentProvider;->b:Lcom/google/common/a/ev;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/contacts/data/FbContactsContentProvider;)Lcom/facebook/user/a/n;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/contacts/data/FbContactsContentProvider;->g:Lcom/facebook/user/a/n;

    return-object v0
.end method

.method static synthetic c()Lcom/google/common/a/ev;
    .locals 1

    .prologue
    .line 37
    sget-object v0, Lcom/facebook/contacts/data/FbContactsContentProvider;->c:Lcom/google/common/a/ev;

    return-object v0
.end method

.method static synthetic d()Lcom/google/common/a/ev;
    .locals 1

    .prologue
    .line 37
    sget-object v0, Lcom/facebook/contacts/data/FbContactsContentProvider;->d:Lcom/google/common/a/ev;

    return-object v0
.end method

.method static synthetic e()Lcom/google/common/base/CharMatcher;
    .locals 1

    .prologue
    .line 37
    sget-object v0, Lcom/facebook/contacts/data/FbContactsContentProvider;->e:Lcom/google/common/base/CharMatcher;

    return-object v0
.end method


# virtual methods
.method protected a(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 471
    const/4 v0, 0x0

    return v0
.end method

.method protected a(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 456
    const/4 v0, 0x0

    return v0
.end method

.method protected a(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 9

    .prologue
    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 136
    const-string v0, "FbContactsContentProvider.doQuery"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v6

    .line 139
    :try_start_0
    iget-object v0, p0, Lcom/facebook/contacts/data/FbContactsContentProvider;->i:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 153
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
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 157
    :catchall_0
    move-exception v0

    invoke-virtual {v6}, Lcom/facebook/debug/d/e;->a()J

    move-result-wide v1

    .line 158
    sget-object v3, Lcom/facebook/contacts/data/FbContactsContentProvider;->a:Ljava/lang/Class;

    const-string v4, "FbContactsContentProvider.doQuery took %d ms"

    new-array v5, v8, [Ljava/lang/Object;

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, v5, v7

    invoke-static {v3, v4, v5}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    throw v0

    .line 141
    :pswitch_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/contacts/data/FbContactsContentProvider;->j:Lcom/facebook/contacts/data/t;

    :goto_0
    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 155
    invoke-interface/range {v0 .. v5}, Lcom/facebook/contacts/data/w;->a(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 157
    invoke-virtual {v6}, Lcom/facebook/debug/d/e;->a()J

    move-result-wide v1

    .line 158
    sget-object v3, Lcom/facebook/contacts/data/FbContactsContentProvider;->a:Ljava/lang/Class;

    const-string v4, "FbContactsContentProvider.doQuery took %d ms"

    new-array v5, v8, [Ljava/lang/Object;

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, v5, v7

    invoke-static {v3, v4, v5}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    return-object v0

    .line 145
    :pswitch_1
    :try_start_2
    iget-object v0, p0, Lcom/facebook/contacts/data/FbContactsContentProvider;->k:Lcom/facebook/contacts/data/u;

    goto :goto_0

    .line 149
    :pswitch_2
    iget-object v0, p0, Lcom/facebook/contacts/data/FbContactsContentProvider;->l:Lcom/facebook/contacts/data/v;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 139
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method protected a(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 1

    .prologue
    .line 466
    const/4 v0, 0x0

    return-object v0
.end method

.method protected a(Landroid/net/Uri;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 461
    const/4 v0, 0x0

    return-object v0
.end method

.method a(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 370
    invoke-static {p2}, Lcom/google/common/a/kl;->a([Ljava/lang/Object;)Ljava/util/HashSet;

    move-result-object v1

    .line 374
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v2

    .line 381
    invoke-static {p3}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 382
    invoke-static {p4}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 383
    sget-object v0, Lcom/facebook/contacts/data/FbContactsContentProvider;->b:Lcom/google/common/a/ev;

    invoke-virtual {v0}, Lcom/google/common/a/ev;->i_()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 384
    invoke-virtual {v3, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 385
    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 386
    :cond_1
    invoke-virtual {v4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 387
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 392
    :cond_2
    invoke-interface {v1, v2}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 394
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 395
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 396
    const-string v0, "c.internal_id AS _id"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, " AS c "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 400
    const-string v5, "INNER JOIN"

    invoke-direct {p0, v5, v0, v3, v4}, Lcom/facebook/contacts/data/FbContactsContentProvider;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;)V

    goto :goto_1

    .line 402
    :cond_3
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 403
    const-string v2, "LEFT OUTER JOIN"

    invoke-direct {p0, v2, v0, v3, v4}, Lcom/facebook/contacts/data/FbContactsContentProvider;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;)V

    goto :goto_2

    .line 406
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "(SELECT "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " FROM "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected declared-synchronized a()V
    .locals 5

    .prologue
    .line 81
    monitor-enter p0

    :try_start_0
    const-string v0, "ContactsContentProvider.onInitialize"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 82
    invoke-virtual {p0}, Lcom/facebook/contacts/data/FbContactsContentProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v2

    .line 84
    const-class v0, Lcom/facebook/d/b/a;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/d/b/a;

    const-string v3, "contacts"

    invoke-virtual {v0, v3}, Lcom/facebook/d/b/a;->b(Ljava/lang/String;)V

    .line 87
    const-class v0, Lcom/facebook/contacts/data/b;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/data/b;

    iput-object v0, p0, Lcom/facebook/contacts/data/FbContactsContentProvider;->f:Lcom/facebook/contacts/data/b;

    .line 88
    const-class v0, Lcom/facebook/user/a/n;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/a/n;

    iput-object v0, p0, Lcom/facebook/contacts/data/FbContactsContentProvider;->g:Lcom/facebook/user/a/n;

    .line 89
    const-class v0, Lcom/facebook/contacts/data/x;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/data/x;

    iput-object v0, p0, Lcom/facebook/contacts/data/FbContactsContentProvider;->h:Lcom/facebook/contacts/data/x;

    .line 91
    new-instance v0, Landroid/content/UriMatcher;

    const/4 v2, -0x1

    invoke-direct {v0, v2}, Landroid/content/UriMatcher;-><init>(I)V

    iput-object v0, p0, Lcom/facebook/contacts/data/FbContactsContentProvider;->i:Landroid/content/UriMatcher;

    .line 92
    iget-object v0, p0, Lcom/facebook/contacts/data/FbContactsContentProvider;->i:Landroid/content/UriMatcher;

    iget-object v2, p0, Lcom/facebook/contacts/data/FbContactsContentProvider;->h:Lcom/facebook/contacts/data/x;

    iget-object v2, v2, Lcom/facebook/contacts/data/x;->a:Ljava/lang/String;

    const-string v3, "contacts_with_fbids"

    const/4 v4, 0x1

    invoke-virtual {v0, v2, v3, v4}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 97
    iget-object v0, p0, Lcom/facebook/contacts/data/FbContactsContentProvider;->i:Landroid/content/UriMatcher;

    iget-object v2, p0, Lcom/facebook/contacts/data/FbContactsContentProvider;->h:Lcom/facebook/contacts/data/x;

    iget-object v2, v2, Lcom/facebook/contacts/data/x;->a:Ljava/lang/String;

    const-string v3, "favorites"

    const/4 v4, 0x2

    invoke-virtual {v0, v2, v3, v4}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 102
    iget-object v0, p0, Lcom/facebook/contacts/data/FbContactsContentProvider;->i:Landroid/content/UriMatcher;

    iget-object v2, p0, Lcom/facebook/contacts/data/FbContactsContentProvider;->h:Lcom/facebook/contacts/data/x;

    iget-object v2, v2, Lcom/facebook/contacts/data/x;->a:Ljava/lang/String;

    const-string v3, "search"

    const/4 v4, 0x3

    invoke-virtual {v0, v2, v3, v4}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 107
    iget-object v0, p0, Lcom/facebook/contacts/data/FbContactsContentProvider;->i:Landroid/content/UriMatcher;

    iget-object v2, p0, Lcom/facebook/contacts/data/FbContactsContentProvider;->h:Lcom/facebook/contacts/data/x;

    iget-object v2, v2, Lcom/facebook/contacts/data/x;->a:Ljava/lang/String;

    const-string v3, "search/"

    const/4 v4, 0x3

    invoke-virtual {v0, v2, v3, v4}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 112
    iget-object v0, p0, Lcom/facebook/contacts/data/FbContactsContentProvider;->i:Landroid/content/UriMatcher;

    iget-object v2, p0, Lcom/facebook/contacts/data/FbContactsContentProvider;->h:Lcom/facebook/contacts/data/x;

    iget-object v2, v2, Lcom/facebook/contacts/data/x;->a:Ljava/lang/String;

    const-string v3, "search/*"

    const/4 v4, 0x3

    invoke-virtual {v0, v2, v3, v4}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 117
    iget-object v0, p0, Lcom/facebook/contacts/data/FbContactsContentProvider;->i:Landroid/content/UriMatcher;

    iget-object v2, p0, Lcom/facebook/contacts/data/FbContactsContentProvider;->h:Lcom/facebook/contacts/data/x;

    iget-object v2, v2, Lcom/facebook/contacts/data/x;->a:Ljava/lang/String;

    const-string v3, "search/*/*"

    const/4 v4, 0x3

    invoke-virtual {v0, v2, v3, v4}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 123
    new-instance v0, Lcom/facebook/contacts/data/t;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/facebook/contacts/data/t;-><init>(Lcom/facebook/contacts/data/FbContactsContentProvider;Lcom/facebook/contacts/data/s;)V

    iput-object v0, p0, Lcom/facebook/contacts/data/FbContactsContentProvider;->j:Lcom/facebook/contacts/data/t;

    .line 124
    new-instance v0, Lcom/facebook/contacts/data/u;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/facebook/contacts/data/u;-><init>(Lcom/facebook/contacts/data/FbContactsContentProvider;Lcom/facebook/contacts/data/s;)V

    iput-object v0, p0, Lcom/facebook/contacts/data/FbContactsContentProvider;->k:Lcom/facebook/contacts/data/u;

    .line 125
    new-instance v0, Lcom/facebook/contacts/data/v;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/facebook/contacts/data/v;-><init>(Lcom/facebook/contacts/data/FbContactsContentProvider;Lcom/facebook/contacts/data/s;)V

    iput-object v0, p0, Lcom/facebook/contacts/data/FbContactsContentProvider;->l:Lcom/facebook/contacts/data/v;

    .line 126
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    monitor-exit p0

    return-void

    .line 81
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
