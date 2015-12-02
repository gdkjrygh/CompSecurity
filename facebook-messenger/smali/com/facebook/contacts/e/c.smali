.class public Lcom/facebook/contacts/e/c;
.super Ljava/lang/Object;
.source "DbContactIteratorFactory.java"


# instance fields
.field private final a:Landroid/content/ContentResolver;

.field private final b:Lcom/facebook/contacts/data/a;

.field private final c:Lcom/facebook/contacts/data/x;


# direct methods
.method public constructor <init>(Landroid/content/ContentResolver;Lcom/facebook/contacts/data/a;Lcom/facebook/contacts/data/x;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/facebook/contacts/e/c;->a:Landroid/content/ContentResolver;

    .line 36
    iput-object p2, p0, Lcom/facebook/contacts/e/c;->b:Lcom/facebook/contacts/data/a;

    .line 37
    iput-object p3, p0, Lcom/facebook/contacts/e/c;->c:Lcom/facebook/contacts/data/x;

    .line 38
    return-void
.end method


# virtual methods
.method public a(Lcom/google/common/a/es;)Lcom/facebook/contacts/e/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/models/a/a;",
            ">;)",
            "Lcom/facebook/contacts/e/b;"
        }
    .end annotation

    .prologue
    .line 57
    sget-object v0, Lcom/facebook/contacts/e/d;->UNORDERED:Lcom/facebook/contacts/e/d;

    invoke-virtual {p0, p1, v0}, Lcom/facebook/contacts/e/c;->a(Lcom/google/common/a/es;Lcom/facebook/contacts/e/d;)Lcom/facebook/contacts/e/b;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/common/a/es;Lcom/facebook/contacts/e/d;)Lcom/facebook/contacts/e/b;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/models/a/a;",
            ">;",
            "Lcom/facebook/contacts/e/d;",
            ")",
            "Lcom/facebook/contacts/e/b;"
        }
    .end annotation

    .prologue
    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "type IN "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/common/w/k;->b(Ljava/lang/Iterable;)Ljava/lang/String;

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

    .line 69
    iget-object v0, p0, Lcom/facebook/contacts/e/c;->a:Landroid/content/ContentResolver;

    iget-object v1, p0, Lcom/facebook/contacts/e/c;->c:Lcom/facebook/contacts/data/x;

    iget-object v1, v1, Lcom/facebook/contacts/data/x;->c:Lcom/facebook/contacts/data/z;

    iget-object v1, v1, Lcom/facebook/contacts/data/z;->a:Landroid/net/Uri;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "data"

    aput-object v5, v2, v4

    const/4 v4, 0x0

    # getter for: Lcom/facebook/contacts/e/d;->providerOrderBy:Ljava/lang/String;
    invoke-static {p2}, Lcom/facebook/contacts/e/d;->access$000(Lcom/facebook/contacts/e/d;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 76
    new-instance v1, Lcom/facebook/contacts/e/b;

    iget-object v2, p0, Lcom/facebook/contacts/e/c;->b:Lcom/facebook/contacts/data/a;

    invoke-direct {v1, v2, v0}, Lcom/facebook/contacts/e/b;-><init>(Lcom/facebook/contacts/data/a;Landroid/database/Cursor;)V

    return-object v1
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/contacts/e/b;
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 159
    invoke-static {}, Lcom/facebook/phonenumbers/PhoneNumberUtil;->getInstance()Lcom/facebook/phonenumbers/PhoneNumberUtil;

    move-result-object v1

    .line 160
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    .line 161
    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v0, "US"

    .line 162
    :cond_0
    invoke-virtual {v1, p1, v0}, Lcom/facebook/phonenumbers/PhoneNumberUtil;->parse(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;

    move-result-object v0

    .line 163
    sget-object v2, Lcom/facebook/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;->E164:Lcom/facebook/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/phonenumbers/PhoneNumberUtil;->format(Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;Lcom/facebook/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;

    move-result-object v1

    .line 165
    iget-object v0, p0, Lcom/facebook/contacts/e/c;->a:Landroid/content/ContentResolver;

    iget-object v2, p0, Lcom/facebook/contacts/e/c;->c:Lcom/facebook/contacts/data/x;

    iget-object v2, v2, Lcom/facebook/contacts/data/x;->e:Lcom/facebook/contacts/data/ac;

    sget-object v4, Lcom/facebook/contacts/data/ad;->PHONE_E164:Lcom/facebook/contacts/data/ad;

    invoke-static {v4}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v4

    invoke-virtual {v2, v1, v4}, Lcom/facebook/contacts/data/ac;->a(Ljava/lang/String;Ljava/util/Set;)Landroid/net/Uri;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "data"

    aput-object v5, v2, v4

    move-object v4, v3

    move-object v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 175
    new-instance v1, Lcom/facebook/contacts/e/b;

    iget-object v2, p0, Lcom/facebook/contacts/e/c;->b:Lcom/facebook/contacts/data/a;

    invoke-direct {v1, v2, v0}, Lcom/facebook/contacts/e/b;-><init>(Lcom/facebook/contacts/data/a;Landroid/database/Cursor;)V

    return-object v1
.end method

.method public a(Ljava/lang/String;Lcom/google/common/a/es;)Lcom/facebook/contacts/e/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/models/a/a;",
            ">;)",
            "Lcom/facebook/contacts/e/b;"
        }
    .end annotation

    .prologue
    .line 119
    sget-object v0, Lcom/facebook/contacts/e/d;->UNORDERED:Lcom/facebook/contacts/e/d;

    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/contacts/e/c;->a(Ljava/lang/String;Lcom/google/common/a/es;Lcom/facebook/contacts/e/d;)Lcom/facebook/contacts/e/b;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;Lcom/google/common/a/es;Lcom/facebook/contacts/e/d;)Lcom/facebook/contacts/e/b;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/models/a/a;",
            ">;",
            "Lcom/facebook/contacts/e/d;",
            ")",
            "Lcom/facebook/contacts/e/b;"
        }
    .end annotation

    .prologue
    .line 134
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "type IN "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p2}, Lcom/facebook/common/w/k;->b(Ljava/lang/Iterable;)Ljava/lang/String;

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

    .line 137
    iget-object v0, p0, Lcom/facebook/contacts/e/c;->a:Landroid/content/ContentResolver;

    iget-object v1, p0, Lcom/facebook/contacts/e/c;->c:Lcom/facebook/contacts/data/x;

    iget-object v1, v1, Lcom/facebook/contacts/data/x;->e:Lcom/facebook/contacts/data/ac;

    invoke-virtual {v1, p1}, Lcom/facebook/contacts/data/ac;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "data"

    aput-object v5, v2, v4

    const/4 v4, 0x0

    # getter for: Lcom/facebook/contacts/e/d;->providerOrderBy:Ljava/lang/String;
    invoke-static {p3}, Lcom/facebook/contacts/e/d;->access$000(Lcom/facebook/contacts/e/d;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 144
    new-instance v1, Lcom/facebook/contacts/e/b;

    iget-object v2, p0, Lcom/facebook/contacts/e/c;->b:Lcom/facebook/contacts/data/a;

    invoke-direct {v1, v2, v0}, Lcom/facebook/contacts/e/b;-><init>(Lcom/facebook/contacts/data/a;Landroid/database/Cursor;)V

    return-object v1
.end method
