.class public Lkik/android/KikDataProvider;
.super Landroid/content/ContentProvider;
.source "SourceFile"


# static fields
.field public static final a:Landroid/net/Uri;

.field public static final b:Landroid/net/Uri;

.field public static final c:Landroid/net/Uri;

.field public static final d:Landroid/net/Uri;

.field public static final e:Landroid/net/Uri;

.field private static f:Lkik/a/e/v;

.field private static g:Lcom/kik/l/ab;

.field private static h:Lkik/a/e/w;

.field private static final i:Landroid/content/UriMatcher;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v3, 0x1

    const/16 v4, 0x8

    .line 46
    const-string v0, "content://kik.android.KikDataProvider/contacts/roster"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lkik/android/KikDataProvider;->a:Landroid/net/Uri;

    .line 47
    const-string v0, "content://kik.android.KikDataProvider/contacts/canbegrouped"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lkik/android/KikDataProvider;->b:Landroid/net/Uri;

    .line 48
    const-string v0, "content://kik.android.KikDataProvider/contacts/contactid"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lkik/android/KikDataProvider;->c:Landroid/net/Uri;

    .line 49
    const-string v0, "content://kik.android.KikDataProvider/contacts/blockedcontacts"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lkik/android/KikDataProvider;->d:Landroid/net/Uri;

    .line 50
    const-string v0, "content://kik.android.KikDataProvider/contacts/notblockedcontacts"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lkik/android/KikDataProvider;->e:Landroid/net/Uri;

    .line 69
    new-instance v0, Landroid/content/UriMatcher;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Landroid/content/UriMatcher;-><init>(I)V

    .line 70
    sput-object v0, Lkik/android/KikDataProvider;->i:Landroid/content/UriMatcher;

    const-string v1, "kik.android.KikDataProvider"

    const-string v2, "contacts/search_suggest_query"

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 71
    sget-object v0, Lkik/android/KikDataProvider;->i:Landroid/content/UriMatcher;

    const-string v1, "kik.android.KikDataProvider"

    const-string v2, "contacts/search_suggest_query/*"

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 72
    sget-object v0, Lkik/android/KikDataProvider;->i:Landroid/content/UriMatcher;

    const-string v1, "kik.android.KikDataProvider"

    const-string v2, "contactsIncludeUsername/search_suggest_query"

    const/16 v3, 0x9

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 73
    sget-object v0, Lkik/android/KikDataProvider;->i:Landroid/content/UriMatcher;

    const-string v1, "kik.android.KikDataProvider"

    const-string v2, "contactsIncludeUsername/search_suggest_query/*"

    const/16 v3, 0x9

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 75
    sget-object v0, Lkik/android/KikDataProvider;->i:Landroid/content/UriMatcher;

    const-string v1, "kik.android.KikDataProvider"

    const-string v2, "notblockedcontacts/search_suggest_query"

    invoke-virtual {v0, v1, v2, v4}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 76
    sget-object v0, Lkik/android/KikDataProvider;->i:Landroid/content/UriMatcher;

    const-string v1, "kik.android.KikDataProvider"

    const-string v2, "notblockedcontacts/search_suggest_query/*"

    invoke-virtual {v0, v1, v2, v4}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 78
    sget-object v0, Lkik/android/KikDataProvider;->i:Landroid/content/UriMatcher;

    const-string v1, "kik.android.KikDataProvider"

    const-string v2, "conversations/search_suggest_query"

    invoke-virtual {v0, v1, v2, v5}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 79
    sget-object v0, Lkik/android/KikDataProvider;->i:Landroid/content/UriMatcher;

    const-string v1, "kik.android.KikDataProvider"

    const-string v2, "conversations/search_suggest_query/*"

    invoke-virtual {v0, v1, v2, v5}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 80
    sget-object v0, Lkik/android/KikDataProvider;->i:Landroid/content/UriMatcher;

    const-string v1, "kik.android.KikDataProvider"

    const-string v2, "contacts/roster"

    invoke-virtual {v0, v1, v2, v6}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 81
    sget-object v0, Lkik/android/KikDataProvider;->i:Landroid/content/UriMatcher;

    const-string v1, "kik.android.KikDataProvider"

    const-string v2, "contacts/roster/*"

    invoke-virtual {v0, v1, v2, v6}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 82
    sget-object v0, Lkik/android/KikDataProvider;->i:Landroid/content/UriMatcher;

    const-string v1, "kik.android.KikDataProvider"

    const-string v2, "contacts/roster/*/*"

    const/16 v3, 0xa

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 83
    sget-object v0, Lkik/android/KikDataProvider;->i:Landroid/content/UriMatcher;

    const-string v1, "kik.android.KikDataProvider"

    const-string v2, "contacts/contactid"

    invoke-virtual {v0, v1, v2, v7}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 84
    sget-object v0, Lkik/android/KikDataProvider;->i:Landroid/content/UriMatcher;

    const-string v1, "kik.android.KikDataProvider"

    const-string v2, "contacts/contactid/*"

    invoke-virtual {v0, v1, v2, v7}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 85
    sget-object v0, Lkik/android/KikDataProvider;->i:Landroid/content/UriMatcher;

    const-string v1, "kik.android.KikDataProvider"

    const-string v2, "contacts/canbegrouped"

    const/4 v3, 0x5

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 86
    sget-object v0, Lkik/android/KikDataProvider;->i:Landroid/content/UriMatcher;

    const-string v1, "kik.android.KikDataProvider"

    const-string v2, "contacts/canbegrouped/*"

    const/4 v3, 0x5

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 87
    sget-object v0, Lkik/android/KikDataProvider;->i:Landroid/content/UriMatcher;

    const-string v1, "kik.android.KikDataProvider"

    const-string v2, "contacts/canbegrouped/*/*"

    const/4 v3, 0x6

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 88
    sget-object v0, Lkik/android/KikDataProvider;->i:Landroid/content/UriMatcher;

    const-string v1, "kik.android.KikDataProvider"

    const-string v2, "contacts/blockedcontacts"

    const/4 v3, 0x7

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 89
    sget-object v0, Lkik/android/KikDataProvider;->i:Landroid/content/UriMatcher;

    const-string v1, "kik.android.KikDataProvider"

    const-string v2, "contacts/blockedcontacts/*"

    const/4 v3, 0x7

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 90
    sget-object v0, Lkik/android/KikDataProvider;->i:Landroid/content/UriMatcher;

    const-string v1, "kik.android.KikDataProvider"

    const-string v2, "contacts/notblockedcontacts"

    invoke-virtual {v0, v1, v2, v4}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 91
    sget-object v0, Lkik/android/KikDataProvider;->i:Landroid/content/UriMatcher;

    const-string v1, "kik.android.KikDataProvider"

    const-string v2, "contacts/notblockedcontacts/*"

    invoke-virtual {v0, v1, v2, v4}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 92
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/String;)Landroid/database/Cursor;
    .locals 3

    .prologue
    .line 271
    const-string v1, "pending_in_roster = 1 AND pending_is_blocked = 0 AND is_group = 0"

    .line 272
    const/4 v0, 0x0

    .line 273
    if-eqz p0, :cond_0

    const-string v2, ""

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 274
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " AND  ((suggest_text_1 LIKE ?) OR (suggest_text_1 LIKE ?) OR (suggest_text_2 LIKE ?) OR (suggest_text_2 LIKE ?)) "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 275
    invoke-static {p0}, Lkik/android/KikDataProvider;->b(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 277
    :cond_0
    sget-object v2, Lkik/android/KikDataProvider;->g:Lcom/kik/l/ab;

    invoke-interface {v2, v1, v0}, Lcom/kik/l/ab;->a(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/util/Vector;)Landroid/database/Cursor;
    .locals 4

    .prologue
    .line 345
    const-string v1, "pending_in_roster = 1 AND pending_is_blocked = 0 AND is_group = 0"

    .line 346
    sget-object v0, Lkik/android/KikDataProvider;->f:Lkik/a/e/v;

    invoke-static {v0}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v0

    .line 347
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lkik/a/z;->a()Lkik/a/d/j;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 348
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "pending_in_roster = 1 AND pending_is_blocked = 0 AND is_group = 0 AND suggest_intent_data_id <> \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lkik/a/z;->a()Lkik/a/d/j;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 350
    invoke-virtual {p0}, Ljava/util/Vector;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 351
    invoke-virtual {p0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 352
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " AND suggest_intent_data_id <> \'"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    .line 353
    goto :goto_0

    :cond_0
    move-object v1, v0

    .line 357
    :cond_1
    sget-object v0, Lkik/android/KikDataProvider;->g:Lcom/kik/l/ab;

    invoke-interface {v0, v1}, Lcom/kik/l/ab;->a(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/util/Vector;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 5

    .prologue
    .line 319
    const-string v0, "pending_in_roster = 1 AND pending_is_blocked = 0 AND is_group = 0"

    .line 320
    const/4 v2, 0x0

    .line 321
    sget-object v1, Lkik/android/KikDataProvider;->f:Lkik/a/e/v;

    invoke-static {v1}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v1

    .line 322
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lkik/a/z;->a()Lkik/a/d/j;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 323
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " AND suggest_intent_data_id <> \'"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v1}, Lkik/a/z;->a()Lkik/a/d/j;

    move-result-object v1

    invoke-virtual {v1}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 325
    invoke-virtual {p0}, Ljava/util/Vector;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 326
    invoke-virtual {p0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v1, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 327
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, " AND suggest_intent_data_id <> \'"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    .line 328
    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 331
    :cond_1
    if-eqz p1, :cond_2

    const-string v1, ""

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 332
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " AND  ((suggest_text_1 LIKE ?) OR (suggest_text_1 LIKE ?) OR (suggest_text_2 LIKE ?) OR (suggest_text_2 LIKE ?)) "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 333
    invoke-static {p1}, Lkik/android/KikDataProvider;->b(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 335
    :goto_1
    sget-object v2, Lkik/android/KikDataProvider;->g:Lcom/kik/l/ab;

    invoke-interface {v2, v1, v0}, Lcom/kik/l/ab;->a(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0

    :cond_2
    move-object v1, v0

    move-object v0, v2

    goto :goto_1
.end method

.method private static a(Ljava/util/Vector;Ljava/lang/String;Z)Landroid/database/Cursor;
    .locals 6

    .prologue
    .line 241
    const-string v1, "pending_in_roster = 1 AND pending_is_blocked = 0 AND is_group = 0"

    .line 242
    const/4 v0, 0x0

    .line 245
    if-eqz p2, :cond_0

    .line 246
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " AND suggest_text_2 NOT LIKE "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lkik/android/KikDataProvider;->h:Lkik/a/e/w;

    invoke-interface {v2}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v2

    iget-object v2, v2, Lkik/a/d/aa;->c:Ljava/lang/String;

    invoke-static {v2}, Landroid/database/DatabaseUtils;->sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 251
    :cond_0
    if-eqz p1, :cond_6

    const-string v2, ""

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    if-nez p2, :cond_6

    .line 252
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " AND  ((suggest_text_1 LIKE ?) OR (suggest_text_1 LIKE ?) OR (suggest_text_2 LIKE ?) OR (suggest_text_2 LIKE ?)) "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 253
    invoke-static {p1}, Lkik/android/KikDataProvider;->b(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    move-object v5, v0

    move-object v0, v1

    move-object v1, v5

    .line 256
    :goto_0
    invoke-virtual {p0}, Ljava/util/Vector;->size()I

    move-result v2

    if-lez v2, :cond_1

    .line 257
    invoke-virtual {p0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v2, v0

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 259
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " AND UPPER(suggest_text_2) != UPPER("

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v0}, Landroid/database/DatabaseUtils;->sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    .line 260
    goto :goto_1

    :cond_1
    move-object v2, v0

    .line 263
    :cond_2
    if-nez p1, :cond_4

    .line 264
    if-eqz p2, :cond_3

    sget-object v0, Lkik/android/KikDataProvider;->g:Lcom/kik/l/ab;

    invoke-interface {v0, v2}, Lcom/kik/l/ab;->a(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 266
    :goto_2
    return-object v0

    .line 264
    :cond_3
    sget-object v0, Lkik/android/KikDataProvider;->g:Lcom/kik/l/ab;

    invoke-interface {v0, v2, v1}, Lcom/kik/l/ab;->a(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    goto :goto_2

    .line 266
    :cond_4
    if-eqz p2, :cond_5

    sget-object v0, Lkik/android/KikDataProvider;->g:Lcom/kik/l/ab;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " AND 1 = 0"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/kik/l/ab;->a(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    goto :goto_2

    :cond_5
    sget-object v0, Lkik/android/KikDataProvider;->g:Lcom/kik/l/ab;

    invoke-interface {v0, v2, v1}, Lcom/kik/l/ab;->a(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    goto :goto_2

    :cond_6
    move-object v5, v0

    move-object v0, v1

    move-object v1, v5

    goto :goto_0
.end method

.method public static a(Lkik/a/e/v;Lcom/kik/l/ab;Lkik/a/e/w;)V
    .locals 0

    .prologue
    .line 96
    sput-object p0, Lkik/android/KikDataProvider;->f:Lkik/a/e/v;

    .line 97
    sput-object p1, Lkik/android/KikDataProvider;->g:Lcom/kik/l/ab;

    .line 98
    sput-object p2, Lkik/android/KikDataProvider;->h:Lkik/a/e/w;

    .line 99
    return-void
.end method

.method private static b(Ljava/lang/String;)[Ljava/lang/String;
    .locals 4

    .prologue
    .line 373
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "%"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "% "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "%"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "%"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    return-object v0
.end method


# virtual methods
.method public delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 104
    const/4 v0, 0x0

    return v0
.end method

.method public getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 110
    const/4 v0, 0x0

    return-object v0
.end method

.method public insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 0

    .prologue
    .line 116
    return-object p1
.end method

.method public onCreate()Z
    .locals 1

    .prologue
    .line 122
    const/4 v0, 0x1

    return v0
.end method

.method public query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 128
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-le v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    .line 129
    :goto_0
    sget-object v0, Lkik/android/KikDataProvider;->i:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    .line 130
    sget-object v0, Lkik/android/KikDataProvider;->i:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 192
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown URI "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    move-object v1, v2

    .line 128
    goto :goto_0

    .line 134
    :pswitch_0
    if-nez v1, :cond_1

    .line 135
    const-string v1, ""

    .line 138
    :cond_1
    invoke-static {v1}, Lkik/android/KikDataProvider;->a(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 188
    :goto_1
    return-object v0

    .line 141
    :pswitch_1
    if-nez v1, :cond_2

    .line 142
    const-string v1, ""

    .line 145
    :cond_2
    const-string v0, "pending_in_roster = 1 AND pending_is_blocked = 0 AND is_group = 0"

    if-eqz v1, :cond_3

    const-string v3, ""

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v0, "pending_in_roster = 1 AND pending_is_blocked = 0 AND is_group = 0 AND  ((suggest_text_1 LIKE ?) OR (suggest_text_1 LIKE ?) OR (suggest_text_2 LIKE ?) OR (suggest_text_2 LIKE ?)) "

    invoke-static {v1}, Lkik/android/KikDataProvider;->b(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    :cond_3
    sget-object v1, Lkik/android/KikDataProvider;->g:Lcom/kik/l/ab;

    invoke-interface {v1, v0, v2}, Lcom/kik/l/ab;->a(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    goto :goto_1

    .line 148
    :pswitch_2
    if-eqz p3, :cond_5

    const-string v0, "recentcontacts"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 149
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "pending_in_roster = 1 AND pending_is_blocked = 0 AND is_group = 0 AND suggest_text_2 NOT LIKE "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Lkik/android/KikDataProvider;->h:Lkik/a/e/w;

    invoke-interface {v2}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v2

    iget-object v2, v2, Lkik/a/d/aa;->c:Ljava/lang/String;

    invoke-static {v2}, Landroid/database/DatabaseUtils;->sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez v1, :cond_4

    sget-object v1, Lkik/android/KikDataProvider;->g:Lcom/kik/l/ab;

    invoke-interface {v1, v0}, Lcom/kik/l/ab;->a(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    goto :goto_1

    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " AND 1 = 0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lkik/android/KikDataProvider;->g:Lcom/kik/l/ab;

    invoke-interface {v1, v0}, Lcom/kik/l/ab;->a(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    goto :goto_1

    .line 152
    :cond_5
    if-eqz p3, :cond_7

    const-string v0, "filteredContacts"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "filteredRecentContacts"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_6
    if-eqz v1, :cond_7

    .line 153
    new-instance v0, Ljava/util/Vector;

    const-string v3, ";"

    invoke-virtual {v1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/Vector;-><init>(Ljava/util/Collection;)V

    .line 154
    const-string v1, "filteredRecentContacts"

    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v0, v2, v1}, Lkik/android/KikDataProvider;->a(Ljava/util/Vector;Ljava/lang/String;Z)Landroid/database/Cursor;

    move-result-object v0

    goto/16 :goto_1

    .line 156
    :cond_7
    invoke-static {v1}, Lkik/android/KikDataProvider;->a(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    goto/16 :goto_1

    .line 158
    :pswitch_3
    const-string v0, "is_group = 0 AND pending_is_blocked = 0"

    if-eqz v1, :cond_8

    const-string v0, "is_group = 0 AND pending_is_blocked = 0 AND (suggest_text_1= ?)"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    :cond_8
    sget-object v1, Lkik/android/KikDataProvider;->g:Lcom/kik/l/ab;

    invoke-interface {v1, v0, v2}, Lcom/kik/l/ab;->a(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    goto/16 :goto_1

    .line 161
    :pswitch_4
    if-nez v1, :cond_9

    .line 162
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    .line 167
    :goto_2
    if-eqz p3, :cond_a

    const-string v1, "recentcontacts"

    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 168
    invoke-static {v0}, Lkik/android/KikDataProvider;->a(Ljava/util/Vector;)Landroid/database/Cursor;

    move-result-object v0

    goto/16 :goto_1

    .line 165
    :cond_9
    new-instance v0, Ljava/util/Vector;

    const-string v3, ";"

    invoke-virtual {v1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/Vector;-><init>(Ljava/util/Collection;)V

    goto :goto_2

    .line 170
    :cond_a
    invoke-static {v0, v2}, Lkik/android/KikDataProvider;->a(Ljava/util/Vector;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    goto/16 :goto_1

    .line 172
    :pswitch_5
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v0

    .line 173
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 174
    new-instance v2, Ljava/util/Vector;

    const-string v3, ";"

    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/util/Vector;-><init>(Ljava/util/Collection;)V

    .line 175
    invoke-static {v2, v1}, Lkik/android/KikDataProvider;->a(Ljava/util/Vector;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    goto/16 :goto_1

    .line 177
    :pswitch_6
    const-string v0, "pending_is_blocked = 1"

    if-eqz v1, :cond_b

    const-string v3, ""

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    const-string v0, " ((suggest_text_1 LIKE ?) OR (suggest_text_1 LIKE ?) OR (suggest_text_2 LIKE ?) OR (suggest_text_2 LIKE ?))  AND pending_is_blocked = 1"

    invoke-static {v1}, Lkik/android/KikDataProvider;->b(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    :cond_b
    sget-object v1, Lkik/android/KikDataProvider;->g:Lcom/kik/l/ab;

    invoke-interface {v1, v0, v2}, Lcom/kik/l/ab;->a(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    goto/16 :goto_1

    .line 179
    :pswitch_7
    if-eqz p3, :cond_d

    const-string v0, "recentcontacts"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 180
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "pending_is_blocked = 0 AND is_group = 0 AND suggest_text_2 NOT LIKE "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Lkik/android/KikDataProvider;->h:Lkik/a/e/w;

    invoke-interface {v2}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v2

    iget-object v2, v2, Lkik/a/d/aa;->c:Ljava/lang/String;

    invoke-static {v2}, Landroid/database/DatabaseUtils;->sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez v1, :cond_c

    sget-object v1, Lkik/android/KikDataProvider;->g:Lcom/kik/l/ab;

    invoke-interface {v1, v0}, Lcom/kik/l/ab;->a(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    goto/16 :goto_1

    :cond_c
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " AND 1 = 0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lkik/android/KikDataProvider;->g:Lcom/kik/l/ab;

    invoke-interface {v1, v0}, Lcom/kik/l/ab;->a(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    goto/16 :goto_1

    .line 182
    :cond_d
    sget-object v0, Lkik/android/KikDataProvider;->f:Lkik/a/e/v;

    invoke-static {v0}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v3

    const-string v0, ""

    if-eqz v3, :cond_e

    invoke-virtual {v3}, Lkik/a/z;->a()Lkik/a/d/j;

    move-result-object v4

    if-eqz v4, :cond_e

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, " AND suggest_intent_data_id <> \'"

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lkik/a/z;->a()Lkik/a/d/j;

    move-result-object v3

    invoke-virtual {v3}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "\' "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_e
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "pending_is_blocked = 0 AND is_group = 0"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    if-eqz v1, :cond_f

    const-string v4, ""

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, " ((suggest_text_1 LIKE ?) OR (suggest_text_1 LIKE ?) OR (suggest_text_2 LIKE ?) OR (suggest_text_2 LIKE ?))  AND pending_is_blocked = 0 AND is_group = 0"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1}, Lkik/android/KikDataProvider;->b(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    :goto_3
    sget-object v1, Lkik/android/KikDataProvider;->g:Lcom/kik/l/ab;

    invoke-interface {v1, v0, v2}, Lcom/kik/l/ab;->a(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    goto/16 :goto_1

    .line 185
    :pswitch_8
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v0

    .line 186
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 187
    new-instance v2, Ljava/util/Vector;

    const-string v3, ";"

    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/util/Vector;-><init>(Ljava/util/Collection;)V

    .line 188
    const-string v0, "filteredRecentContacts"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v2, v1, v0}, Lkik/android/KikDataProvider;->a(Ljava/util/Vector;Ljava/lang/String;Z)Landroid/database/Cursor;

    move-result-object v0

    goto/16 :goto_1

    :cond_f
    move-object v0, v3

    goto :goto_3

    .line 130
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_1
        :pswitch_8
    .end packed-switch
.end method

.method public update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 363
    const/4 v0, 0x0

    return v0
.end method
