.class public Lcom/facebook/contacts/data/m;
.super Ljava/lang/Object;
.source "DbInsertContactHandler.java"


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
.field private final b:Lcom/facebook/contacts/data/b;

.field private final c:Lcom/facebook/contacts/data/a;

.field private final d:Lcom/facebook/user/ac;

.field private final e:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/contacts/data/n;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/facebook/user/a/l;

.field private final g:Lcom/facebook/user/a/n;

.field private final h:Lcom/facebook/contacts/data/k;

.field private final i:Lcom/facebook/phonenumbers/PhoneNumberUtil;

.field private final j:Lcom/facebook/contacts/data/a/b;

.field private final k:Lcom/facebook/common/time/a;

.field private final l:Lcom/facebook/common/v/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 54
    const-class v0, Lcom/facebook/contacts/data/m;

    sput-object v0, Lcom/facebook/contacts/data/m;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/contacts/data/b;Lcom/facebook/contacts/data/a;Lcom/facebook/user/ac;Ljavax/inject/a;Lcom/facebook/user/a/l;Lcom/facebook/user/a/n;Lcom/facebook/contacts/data/k;Lcom/facebook/phonenumbers/PhoneNumberUtil;Lcom/facebook/contacts/data/a/b;Lcom/facebook/common/time/a;Lcom/facebook/common/v/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/contacts/data/b;",
            "Lcom/facebook/contacts/data/a;",
            "Lcom/facebook/user/ac;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/contacts/data/n;",
            ">;",
            "Lcom/facebook/user/a/l;",
            "Lcom/facebook/user/a/n;",
            "Lcom/facebook/contacts/data/k;",
            "Lcom/facebook/phonenumbers/PhoneNumberUtil;",
            "Lcom/facebook/contacts/data/a/b;",
            "Lcom/facebook/common/time/a;",
            "Lcom/facebook/common/v/f;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    iput-object p1, p0, Lcom/facebook/contacts/data/m;->b:Lcom/facebook/contacts/data/b;

    .line 87
    iput-object p2, p0, Lcom/facebook/contacts/data/m;->c:Lcom/facebook/contacts/data/a;

    .line 88
    iput-object p3, p0, Lcom/facebook/contacts/data/m;->d:Lcom/facebook/user/ac;

    .line 89
    iput-object p4, p0, Lcom/facebook/contacts/data/m;->e:Ljavax/inject/a;

    .line 90
    iput-object p5, p0, Lcom/facebook/contacts/data/m;->f:Lcom/facebook/user/a/l;

    .line 91
    iput-object p6, p0, Lcom/facebook/contacts/data/m;->g:Lcom/facebook/user/a/n;

    .line 92
    iput-object p7, p0, Lcom/facebook/contacts/data/m;->h:Lcom/facebook/contacts/data/k;

    .line 93
    iput-object p8, p0, Lcom/facebook/contacts/data/m;->i:Lcom/facebook/phonenumbers/PhoneNumberUtil;

    .line 94
    iput-object p9, p0, Lcom/facebook/contacts/data/m;->j:Lcom/facebook/contacts/data/a/b;

    .line 95
    iput-object p10, p0, Lcom/facebook/contacts/data/m;->k:Lcom/facebook/common/time/a;

    .line 96
    iput-object p11, p0, Lcom/facebook/contacts/data/m;->l:Lcom/facebook/common/v/f;

    .line 97
    return-void
.end method

.method private a(Landroid/database/sqlite/SQLiteDatabase;Lcom/facebook/contacts/models/Contact;)J
    .locals 4

    .prologue
    .line 337
    const-string v0, "INSERT OR REPLACE INTO contacts (internal_id, contact_id, data) VALUES ((select internal_id from contacts where contact_id = ?), ?, ?)"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v1

    .line 343
    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {p2}, Lcom/facebook/contacts/models/Contact;->getContactId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 344
    const/4 v0, 0x2

    invoke-virtual {p2}, Lcom/facebook/contacts/models/Contact;->getContactId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 345
    const/4 v0, 0x3

    iget-object v2, p0, Lcom/facebook/contacts/data/m;->c:Lcom/facebook/contacts/data/a;

    invoke-virtual {v2, p2}, Lcom/facebook/contacts/data/a;->a(Lcom/facebook/contacts/models/Contact;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 346
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteStatement;->executeInsert()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v2

    .line 348
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteStatement;->close()V

    return-wide v2

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteStatement;->close()V

    throw v0
.end method

.method private a(Ljava/lang/String;Ljava/lang/Boolean;)Landroid/content/ContentValues;
    .locals 2

    .prologue
    .line 317
    new-instance v0, Landroid/content/ContentValues;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Landroid/content/ContentValues;-><init>(I)V

    .line 318
    const-string v1, "type"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 319
    const-string v1, "indexed_data"

    invoke-virtual {v0, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 320
    return-object v0
.end method

.method private a(Ljava/lang/String;Ljava/lang/Float;)Landroid/content/ContentValues;
    .locals 2

    .prologue
    .line 310
    new-instance v0, Landroid/content/ContentValues;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Landroid/content/ContentValues;-><init>(I)V

    .line 311
    const-string v1, "type"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 312
    const-string v1, "indexed_data"

    invoke-virtual {v0, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Float;)V

    .line 313
    return-object v0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Landroid/content/ContentValues;
    .locals 2

    .prologue
    .line 303
    new-instance v0, Landroid/content/ContentValues;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Landroid/content/ContentValues;-><init>(I)V

    .line 304
    const-string v1, "type"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    const-string v1, "indexed_data"

    invoke-virtual {v0, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    return-object v0
.end method

.method private a(Landroid/content/ContentValues;Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;Lcom/google/common/a/et;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/ContentValues;",
            "Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;",
            "Lcom/google/common/a/et",
            "<",
            "Landroid/content/ContentValues;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 426
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 427
    const-string v1, "type"

    const-string v2, "phone_e164"

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 428
    invoke-virtual {v0, p1}, Landroid/content/ContentValues;->putAll(Landroid/content/ContentValues;)V

    .line 429
    const-string v1, "indexed_data"

    iget-object v2, p0, Lcom/facebook/contacts/data/m;->i:Lcom/facebook/phonenumbers/PhoneNumberUtil;

    sget-object v3, Lcom/facebook/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;->E164:Lcom/facebook/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;

    invoke-virtual {v2, p2, v3}, Lcom/facebook/phonenumbers/PhoneNumberUtil;->format(Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;Lcom/facebook/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 432
    invoke-virtual {p3, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 435
    iget-object v0, p0, Lcom/facebook/contacts/data/m;->i:Lcom/facebook/phonenumbers/PhoneNumberUtil;

    invoke-virtual {v0, p2}, Lcom/facebook/phonenumbers/PhoneNumberUtil;->getNationalSignificantNumber(Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;)Ljava/lang/String;

    move-result-object v0

    .line 437
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 438
    const-string v2, "type"

    const-string v3, "phone_national"

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 439
    invoke-virtual {v1, p1}, Landroid/content/ContentValues;->putAll(Landroid/content/ContentValues;)V

    .line 440
    const-string v2, "indexed_data"

    invoke-virtual {v1, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 441
    invoke-virtual {p3, v1}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 443
    iget-object v1, p0, Lcom/facebook/contacts/data/m;->i:Lcom/facebook/phonenumbers/PhoneNumberUtil;

    invoke-virtual {v1, p2}, Lcom/facebook/phonenumbers/PhoneNumberUtil;->getLengthOfGeographicalAreaCode(Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;)I

    move-result v1

    .line 444
    if-lez v1, :cond_0

    .line 446
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 448
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 449
    const-string v2, "type"

    const-string v3, "phone_local"

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 450
    invoke-virtual {v1, p1}, Landroid/content/ContentValues;->putAll(Landroid/content/ContentValues;)V

    .line 451
    const-string v2, "indexed_data"

    invoke-virtual {v1, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 452
    invoke-virtual {p3, v1}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 454
    :cond_0
    return-void
.end method

.method static synthetic a(Landroid/database/sqlite/SQLiteStatement;Landroid/content/ContentValues;)V
    .locals 0

    .prologue
    .line 52
    invoke-static {p0, p1}, Lcom/facebook/contacts/data/m;->b(Landroid/database/sqlite/SQLiteStatement;Landroid/content/ContentValues;)V

    return-void
.end method

.method private a(Lcom/facebook/contacts/data/n;Ljava/lang/String;Lcom/facebook/user/Name;)V
    .locals 6
    .param p3    # Lcom/facebook/user/Name;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v5, 0x0

    .line 559
    if-eqz p3, :cond_0

    invoke-virtual {p3}, Lcom/facebook/user/Name;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 578
    :cond_0
    :goto_0
    return-void

    .line 565
    :cond_1
    invoke-static {}, Lcom/google/common/a/fi;->e()Lcom/google/common/a/fk;

    move-result-object v0

    .line 566
    invoke-direct {p0, p3, v0}, Lcom/facebook/contacts/data/m;->a(Lcom/facebook/user/Name;Lcom/google/common/a/fk;)V

    .line 568
    invoke-virtual {v0}, Lcom/google/common/a/fk;->b()Lcom/google/common/a/fi;

    move-result-object v0

    .line 570
    new-array v1, v5, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/common/a/fi;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/String;

    .line 572
    invoke-virtual {p3}, Lcom/facebook/user/Name;->getDisplayName()Ljava/lang/String;

    move-result-object v2

    array-length v4, v3

    iget-object v0, p0, Lcom/facebook/contacts/data/m;->f:Lcom/facebook/user/a/l;

    invoke-virtual {v0, v5}, Lcom/facebook/user/a/l;->a(I)I

    move-result v5

    move-object v0, p1

    move-object v1, p2

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/contacts/data/n;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/user/Name;Lcom/google/common/a/fk;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/user/Name;",
            "Lcom/google/common/a/fk",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 581
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 582
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 586
    const/16 v0, 0xa

    new-array v1, v0, [Ljava/lang/String;

    .line 587
    iget-object v0, p0, Lcom/facebook/contacts/data/m;->f:Lcom/facebook/user/a/l;

    invoke-virtual {p1}, Lcom/facebook/user/Name;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/user/a/l;->a([Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    .line 589
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    .line 590
    aget-object v3, v1, v0

    invoke-virtual {p2, v3}, Lcom/google/common/a/fk;->b(Ljava/lang/Object;)Lcom/google/common/a/fk;

    .line 589
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 593
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/user/Name;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 594
    invoke-virtual {p1}, Lcom/facebook/user/Name;->getLastName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/common/a/fk;->b(Ljava/lang/Object;)Lcom/google/common/a/fk;

    .line 596
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/user/Name;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 597
    invoke-virtual {p1}, Lcom/facebook/user/Name;->getFirstName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/common/a/fk;->b(Ljava/lang/Object;)Lcom/google/common/a/fk;

    .line 599
    :cond_2
    return-void
.end method

.method private a(Lcom/google/common/a/ex;Lcom/google/common/a/et;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/ex",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;",
            ">;",
            "Lcom/google/common/a/et",
            "<",
            "Landroid/content/ContentValues;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 402
    invoke-virtual {p1}, Lcom/google/common/a/ex;->n()Lcom/google/common/a/em;

    move-result-object v0

    .line 405
    invoke-virtual {v0}, Lcom/google/common/a/em;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 406
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 407
    const-string v4, "contact_id"

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v3, v4, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 408
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;

    .line 409
    invoke-direct {p0, v3, v0, p2}, Lcom/facebook/contacts/data/m;->a(Landroid/content/ContentValues;Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;Lcom/google/common/a/et;)V

    goto :goto_0

    .line 411
    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;I)V
    .locals 4

    .prologue
    .line 483
    iget-object v0, p0, Lcom/facebook/contacts/data/m;->b:Lcom/facebook/contacts/data/b;

    invoke-virtual {v0}, Lcom/facebook/contacts/data/b;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 484
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 485
    const-string v2, "fbid"

    invoke-virtual {v1, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 486
    const-string v2, "display_order"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 487
    const-string v2, "favorite_contacts"

    const-string v3, ""

    invoke-virtual {v0, v2, v3, v1}, Landroid/database/sqlite/SQLiteDatabase;->replaceOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 488
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 544
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 545
    const-string v1, "fbid"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 546
    const-string v1, "type"

    invoke-virtual {v0, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 547
    const-string v1, "data"

    invoke-virtual {v0, v1, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 548
    iget-object v1, p0, Lcom/facebook/contacts/data/m;->b:Lcom/facebook/contacts/data/b;

    invoke-virtual {v1}, Lcom/facebook/contacts/data/b;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 549
    const-string v2, "ephemeral_data"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->replaceOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 553
    return-void
.end method

.method private static b(Landroid/database/sqlite/SQLiteStatement;Landroid/content/ContentValues;)V
    .locals 2

    .prologue
    .line 386
    const/4 v0, 0x1

    const-string v1, "contact_id"

    invoke-virtual {p1, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 387
    const/4 v0, 0x2

    const-string v1, "type"

    invoke-virtual {p1, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 388
    const/4 v0, 0x3

    const-string v1, "indexed_data"

    invoke-virtual {p1, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/database/sqlite/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 389
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteStatement;->execute()V

    .line 390
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/contacts/models/Contact;)V
    .locals 1

    .prologue
    .line 156
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/contacts/data/m;->a(Lcom/facebook/contacts/models/Contact;Lcom/facebook/contacts/models/ContactDetails;)V

    .line 157
    return-void
.end method

.method public a(Lcom/facebook/contacts/models/Contact;Lcom/facebook/contacts/models/ContactDetails;)V
    .locals 12
    .param p2    # Lcom/facebook/contacts/models/ContactDetails;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v2, 0x0

    const/4 v0, 0x0

    const/4 v4, 0x1

    .line 164
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "insertContactIntoDatabase ("

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getContactId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ")"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v5

    .line 170
    if-eqz p2, :cond_e

    .line 171
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 172
    const-string v1, "contact_id"

    invoke-virtual {p2}, Lcom/facebook/contacts/models/ContactDetails;->getContactId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    const-string v1, "data"

    iget-object v3, p0, Lcom/facebook/contacts/data/m;->c:Lcom/facebook/contacts/data/a;

    invoke-virtual {v3, p2}, Lcom/facebook/contacts/data/a;->a(Lcom/facebook/contacts/models/ContactDetails;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    move-object v1, v0

    .line 176
    :goto_0
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v6

    .line 181
    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getCanMessage()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getIsMemorialized()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getContactProfileType()Lcom/facebook/contacts/models/a/a;

    move-result-object v0

    sget-object v3, Lcom/facebook/contacts/models/a/a;->PAGE:Lcom/facebook/contacts/models/a/a;

    if-ne v0, v3, :cond_8

    :cond_1
    move v3, v4

    .line 184
    :goto_1
    if-eqz v3, :cond_9

    .line 185
    const-string v0, "contact_profile_type"

    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getContactProfileType()Lcom/facebook/contacts/models/a/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/contacts/models/a/a;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2}, Lcom/facebook/contacts/data/m;->a(Ljava/lang/String;Ljava/lang/String;)Landroid/content/ContentValues;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 190
    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getName()Lcom/facebook/user/Name;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getName()Lcom/facebook/user/Name;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/Name;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 191
    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getName()Lcom/facebook/user/Name;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/Name;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v2

    .line 192
    const-string v0, ""

    .line 193
    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getPhoneticName()Lcom/facebook/user/Name;

    move-result-object v7

    .line 194
    if-eqz v7, :cond_2

    .line 195
    invoke-virtual {v7}, Lcom/facebook/user/Name;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    .line 198
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v7, v4, :cond_3

    move-object v0, v2

    .line 202
    :cond_3
    iget-object v2, p0, Lcom/facebook/contacts/data/m;->g:Lcom/facebook/user/a/n;

    invoke-interface {v2, v0}, Lcom/facebook/user/a/n;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 203
    const-string v2, "sort_name_key"

    invoke-direct {p0, v2, v0}, Lcom/facebook/contacts/data/m;->a(Ljava/lang/String;Ljava/lang/String;)Landroid/content/ContentValues;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 209
    :cond_4
    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getProfileFbid()Ljava/lang/String;

    move-result-object v0

    .line 210
    if-eqz v0, :cond_5

    .line 211
    const-string v2, "profile_fbid"

    invoke-direct {p0, v2, v0}, Lcom/facebook/contacts/data/m;->a(Ljava/lang/String;Ljava/lang/String;)Landroid/content/ContentValues;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 217
    :cond_5
    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getCommunicationRank()F

    move-result v0

    .line 218
    const/4 v2, 0x0

    cmpl-float v2, v0, v2

    if-lez v2, :cond_6

    .line 219
    const-string v2, "communication_rank"

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-direct {p0, v2, v0}, Lcom/facebook/contacts/data/m;->a(Ljava/lang/String;Ljava/lang/Float;)Landroid/content/ContentValues;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 225
    :cond_6
    new-instance v7, Landroid/content/ContentValues;

    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    .line 227
    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getPhones()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_7
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/models/ContactPhone;

    .line 230
    :try_start_0
    iget-object v2, p0, Lcom/facebook/contacts/data/m;->i:Lcom/facebook/phonenumbers/PhoneNumberUtil;

    invoke-virtual {v0}, Lcom/facebook/contacts/models/ContactPhone;->getUniversalNumber()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    invoke-virtual {v2, v9, v10}, Lcom/facebook/phonenumbers/PhoneNumberUtil;->parse(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;

    move-result-object v2

    .line 231
    invoke-direct {p0, v7, v2, v6}, Lcom/facebook/contacts/data/m;->a(Landroid/content/ContentValues;Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;Lcom/google/common/a/et;)V
    :try_end_0
    .catch Lcom/facebook/phonenumbers/NumberParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 241
    invoke-virtual {v0}, Lcom/facebook/contacts/models/ContactPhone;->getIsVerified()Z

    move-result v2

    if-eqz v2, :cond_7

    .line 242
    const-string v2, "phone_verified"

    invoke-virtual {v0}, Lcom/facebook/contacts/models/ContactPhone;->getUniversalNumber()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v2, v0}, Lcom/facebook/contacts/data/m;->a(Ljava/lang/String;Ljava/lang/String;)Landroid/content/ContentValues;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_2

    :cond_8
    move v3, v2

    .line 181
    goto/16 :goto_1

    .line 232
    :catch_0
    move-exception v2

    .line 233
    sget-object v9, Lcom/facebook/contacts/data/m;->a:Ljava/lang/Class;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Error parsing invalid E.164 number: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v0}, Lcom/facebook/contacts/models/ContactPhone;->getUniversalNumber()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v10, " Error: "

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_2

    .line 251
    :cond_9
    iget-object v0, p0, Lcom/facebook/contacts/data/m;->j:Lcom/facebook/contacts/data/a/b;

    invoke-interface {v0, p1}, Lcom/facebook/contacts/data/a/b;->a(Lcom/facebook/contacts/models/Contact;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 252
    const-string v0, "can_message"

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-direct {p0, v0, v2}, Lcom/facebook/contacts/data/m;->a(Ljava/lang/String;Ljava/lang/Boolean;)Landroid/content/ContentValues;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 258
    :cond_a
    iget-object v0, p0, Lcom/facebook/contacts/data/m;->b:Lcom/facebook/contacts/data/b;

    invoke-virtual {v0}, Lcom/facebook/contacts/data/b;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    .line 259
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 261
    :try_start_1
    invoke-direct {p0, v2, p1}, Lcom/facebook/contacts/data/m;->a(Landroid/database/sqlite/SQLiteDatabase;Lcom/facebook/contacts/models/Contact;)J

    move-result-wide v7

    .line 263
    if-eqz v1, :cond_b

    .line 264
    const-string v0, "contact_details"

    const/4 v4, 0x0

    invoke-virtual {v2, v0, v4, v1}, Landroid/database/sqlite/SQLiteDatabase;->replaceOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 270
    :cond_b
    const-string v0, "contacts_indexed_data"

    const-string v1, "contact_internal_id = ?"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v9, 0x0

    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v10

    aput-object v10, v4, v9

    invoke-virtual {v2, v0, v1, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 277
    if-eqz v3, :cond_c

    .line 278
    iget-object v0, p0, Lcom/facebook/contacts/data/m;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/data/n;

    .line 279
    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getContactId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/data/n;->a(Ljava/lang/String;)V

    .line 280
    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getContactId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getName()Lcom/facebook/user/Name;

    move-result-object v3

    invoke-direct {p0, v0, v1, v3}, Lcom/facebook/contacts/data/m;->a(Lcom/facebook/contacts/data/n;Ljava/lang/String;Lcom/facebook/user/Name;)V

    .line 281
    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getContactId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getPhoneticName()Lcom/facebook/user/Name;

    move-result-object v3

    invoke-direct {p0, v0, v1, v3}, Lcom/facebook/contacts/data/m;->a(Lcom/facebook/contacts/data/n;Ljava/lang/String;Lcom/facebook/user/Name;)V

    .line 282
    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getContactId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getNameSearchTokens()Lcom/google/common/a/es;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lcom/facebook/contacts/data/n;->a(Ljava/lang/String;Lcom/google/common/a/es;)V

    .line 286
    :cond_c
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 287
    invoke-virtual {v6}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ContentValues;

    .line 288
    sget-object v4, Lcom/facebook/contacts/data/m;->a:Ljava/lang/Class;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Inserting data lookup: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 289
    const-string v4, "contact_internal_id"

    invoke-virtual {v0, v4, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 290
    const-string v4, "contacts_indexed_data"

    const/4 v6, 0x0

    invoke-virtual {v2, v4, v6, v0}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    .line 296
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0

    .line 294
    :cond_d
    :try_start_2
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 296
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 299
    invoke-virtual {v5}, Lcom/facebook/debug/d/e;->a()J

    .line 300
    return-void

    :cond_e
    move-object v1, v0

    goto/16 :goto_0
.end method

.method public a(Lcom/google/common/a/em;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/em",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 133
    invoke-virtual {p1}, Lcom/google/common/a/em;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 153
    :goto_0
    return-void

    .line 137
    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/data/m;->l:Lcom/facebook/common/v/f;

    invoke-virtual {v0}, Lcom/facebook/common/v/f;->c()V

    .line 139
    iget-object v0, p0, Lcom/facebook/contacts/data/m;->b:Lcom/facebook/contacts/data/b;

    invoke-virtual {v0}, Lcom/facebook/contacts/data/b;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 140
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "contact_id IN "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/common/w/k;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 141
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "contact_internal_id in (select internal_id from contacts where "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 144
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 146
    :try_start_0
    const-string v3, "contacts_indexed_data"

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v2, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 147
    const-string v2, "contact_details"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 148
    const-string v2, "contacts"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 149
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
.end method

.method public a(Lcom/google/common/a/em;Lcom/facebook/contacts/data/o;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/em",
            "<",
            "Lcom/facebook/contacts/models/Contact;",
            ">;",
            "Lcom/facebook/contacts/data/o;",
            ")V"
        }
    .end annotation

    .prologue
    .line 103
    invoke-virtual {p1}, Lcom/google/common/a/em;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 130
    :goto_0
    return-void

    .line 107
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "insertContactsIntoDatabase ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/common/a/em;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " contacts)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 110
    iget-object v0, p0, Lcom/facebook/contacts/data/m;->b:Lcom/facebook/contacts/data/b;

    invoke-virtual {v0}, Lcom/facebook/contacts/data/b;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    .line 111
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 113
    :try_start_0
    sget-object v0, Lcom/facebook/contacts/data/o;->REPLACE_ALL:Lcom/facebook/contacts/data/o;

    if-ne p2, v0, :cond_1

    .line 114
    iget-object v0, p0, Lcom/facebook/contacts/data/m;->l:Lcom/facebook/common/v/f;

    invoke-virtual {v0}, Lcom/facebook/common/v/f;->c()V

    .line 115
    const-string v0, "contacts"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v2, v0, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 116
    const-string v0, "contact_details"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v2, v0, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 117
    const-string v0, "contacts_indexed_data"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v2, v0, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 120
    :cond_1
    invoke-virtual {p1}, Lcom/google/common/a/em;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/models/Contact;

    .line 121
    iget-object v4, p0, Lcom/facebook/contacts/data/m;->l:Lcom/facebook/common/v/f;

    invoke-virtual {v4}, Lcom/facebook/common/v/f;->c()V

    .line 122
    invoke-virtual {p0, v0}, Lcom/facebook/contacts/data/m;->a(Lcom/facebook/contacts/models/Contact;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 126
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0

    .line 124
    :cond_2
    :try_start_1
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 126
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 129
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    goto :goto_0
.end method

.method public a(Lcom/google/common/a/es;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 491
    iget-object v0, p0, Lcom/facebook/contacts/data/m;->b:Lcom/facebook/contacts/data/b;

    invoke-virtual {v0}, Lcom/facebook/contacts/data/b;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 492
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 495
    :try_start_0
    const-string v0, "ephemeral_data"

    const-string v2, "type = ?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "last_active"

    aput-object v5, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 499
    invoke-virtual {p1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 500
    invoke-virtual {v0}, Lcom/facebook/user/User;->b()Ljava/lang/String;

    move-result-object v3

    const-string v4, "last_active"

    iget-object v5, p0, Lcom/facebook/contacts/data/m;->d:Lcom/facebook/user/ac;

    invoke-virtual {v0}, Lcom/facebook/user/User;->C()Lcom/facebook/user/LastActive;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/facebook/user/ac;->a(Lcom/facebook/user/LastActive;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v3, v4, v0}, Lcom/facebook/contacts/data/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 506
    :catch_0
    move-exception v0

    .line 507
    :try_start_1
    sget-object v2, Lcom/facebook/contacts/data/m;->a:Ljava/lang/Class;

    const-string v3, "SQLException"

    invoke-static {v2, v3, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 508
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 512
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0

    .line 505
    :cond_0
    :try_start_2
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_2
    .catch Landroid/database/SQLException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 512
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 514
    :goto_1
    return-void

    .line 509
    :catch_1
    move-exception v0

    .line 510
    :try_start_3
    sget-object v2, Lcom/facebook/contacts/data/m;->a:Ljava/lang/Class;

    const-string v3, "IOException"

    invoke-static {v2, v3, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 512
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    goto :goto_1
.end method

.method public a(Lcom/google/common/a/ex;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/ex",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 360
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v0

    .line 361
    invoke-direct {p0, p1, v0}, Lcom/facebook/contacts/data/m;->a(Lcom/google/common/a/ex;Lcom/google/common/a/et;)V

    .line 363
    iget-object v1, p0, Lcom/facebook/contacts/data/m;->l:Lcom/facebook/common/v/f;

    invoke-virtual {v1}, Lcom/facebook/common/v/f;->c()V

    .line 364
    iget-object v1, p0, Lcom/facebook/contacts/data/m;->b:Lcom/facebook/contacts/data/b;

    invoke-virtual {v1}, Lcom/facebook/contacts/data/b;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 365
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 367
    :try_start_0
    invoke-static {v1}, Lcom/facebook/contacts/database/g;->a(Landroid/database/sqlite/SQLiteDatabase;)Landroid/database/sqlite/SQLiteStatement;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v2

    .line 370
    :try_start_1
    invoke-virtual {v0}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ContentValues;

    .line 371
    sget-object v4, Lcom/facebook/contacts/data/m;->a:Ljava/lang/Class;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Inserting phone lookup: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 372
    invoke-static {v2, v0}, Lcom/facebook/contacts/data/m;->b(Landroid/database/sqlite/SQLiteStatement;Landroid/content/ContentValues;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 375
    :catchall_0
    move-exception v0

    :try_start_2
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteStatement;->close()V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 379
    :catchall_1
    move-exception v0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0

    .line 375
    :cond_0
    :try_start_3
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteStatement;->close()V

    .line 377
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 379
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 381
    return-void
.end method

.method public a(Ljava/util/Collection;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/user/User;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 457
    iget-object v0, p0, Lcom/facebook/contacts/data/m;->b:Lcom/facebook/contacts/data/b;

    invoke-virtual {v0}, Lcom/facebook/contacts/data/b;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    .line 458
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 460
    :try_start_0
    const-string v0, "favorite_contacts"

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v1, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 461
    const/4 v0, 0x0

    .line 462
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v1, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 463
    invoke-virtual {v0}, Lcom/facebook/user/User;->b()Ljava/lang/String;

    move-result-object v4

    add-int/lit8 v0, v1, 0x1

    invoke-direct {p0, v4, v1}, Lcom/facebook/contacts/data/m;->a(Ljava/lang/String;I)V

    move v1, v0

    goto :goto_0

    .line 466
    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/data/m;->h:Lcom/facebook/contacts/data/k;

    sget-object v1, Lcom/facebook/contacts/data/i;->c:Lcom/facebook/contacts/data/j;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v3

    invoke-virtual {v0, v1, v3}, Lcom/facebook/contacts/data/k;->a(Lcom/facebook/common/s/a;I)V

    .line 469
    iget-object v0, p0, Lcom/facebook/contacts/data/m;->h:Lcom/facebook/contacts/data/k;

    sget-object v1, Lcom/facebook/contacts/data/i;->d:Lcom/facebook/contacts/data/j;

    iget-object v3, p0, Lcom/facebook/contacts/data/m;->k:Lcom/facebook/common/time/a;

    invoke-interface {v3}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v3

    invoke-virtual {v0, v1, v3, v4}, Lcom/facebook/contacts/data/k;->b(Lcom/facebook/common/s/a;J)V

    .line 473
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 478
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 480
    return-void

    .line 474
    :catch_0
    move-exception v0

    .line 475
    :try_start_1
    sget-object v1, Lcom/facebook/contacts/data/m;->a:Ljava/lang/Class;

    const-string v3, "SQLException"

    invoke-static {v1, v3, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 476
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 478
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
.end method

.method public b(Lcom/google/common/a/es;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 517
    iget-object v0, p0, Lcom/facebook/contacts/data/m;->b:Lcom/facebook/contacts/data/b;

    invoke-virtual {v0}, Lcom/facebook/contacts/data/b;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 518
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 521
    :try_start_0
    const-string v0, "ephemeral_data"

    const-string v2, "type = ?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "mobile_app_data"

    aput-object v5, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 525
    invoke-virtual {p1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 526
    invoke-virtual {v0}, Lcom/facebook/user/User;->b()Ljava/lang/String;

    move-result-object v3

    const-string v4, "mobile_app_data"

    iget-object v5, p0, Lcom/facebook/contacts/data/m;->d:Lcom/facebook/user/ac;

    invoke-virtual {v0}, Lcom/facebook/user/User;->D()Lcom/facebook/user/MobileAppData;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/facebook/user/ac;->a(Lcom/facebook/user/MobileAppData;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v3, v4, v0}, Lcom/facebook/contacts/data/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 532
    :catch_0
    move-exception v0

    .line 533
    :try_start_1
    sget-object v2, Lcom/facebook/contacts/data/m;->a:Ljava/lang/Class;

    const-string v3, "SQLException"

    invoke-static {v2, v3, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 534
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 538
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0

    .line 531
    :cond_0
    :try_start_2
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_2
    .catch Landroid/database/SQLException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 538
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 540
    :goto_1
    return-void

    .line 535
    :catch_1
    move-exception v0

    .line 536
    :try_start_3
    sget-object v2, Lcom/facebook/contacts/data/m;->a:Ljava/lang/Class;

    const-string v3, "IOException"

    invoke-static {v2, v3, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 538
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    goto :goto_1
.end method
