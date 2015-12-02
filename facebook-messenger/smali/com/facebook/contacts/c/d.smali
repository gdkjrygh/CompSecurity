.class public final Lcom/facebook/contacts/c/d;
.super Ljava/lang/Object;
.source "GraphQLContactsQueryBuilder.java"


# instance fields
.field private final a:Lcom/facebook/contacts/c/b;

.field private final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/contacts/models/a/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/contacts/c/b;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/contacts/c/b;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/contacts/models/a/b;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/facebook/contacts/c/d;->a:Lcom/facebook/contacts/c/b;

    .line 29
    iput-object p2, p0, Lcom/facebook/contacts/c/d;->b:Ljava/util/Set;

    .line 30
    return-void
.end method

.method private a()Ljava/lang/String;
    .locals 4

    .prologue
    .line 38
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 39
    iget-object v0, p0, Lcom/facebook/contacts/c/d;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/models/a/b;

    .line 40
    invoke-interface {v0}, Lcom/facebook/contacts/models/a/b;->a()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/models/a/a;

    .line 41
    invoke-virtual {v0}, Lcom/facebook/contacts/models/a/a;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 44
    :cond_1
    const-string v0, ","

    invoke-static {v0}, Lcom/google/common/base/Joiner;->on(Ljava/lang/String;)Lcom/google/common/base/Joiner;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/common/base/Joiner;->join(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(ILjava/lang/String;Lcom/facebook/contacts/c/e;)Ljava/lang/String;
    .locals 9

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 48
    sget-object v0, Lcom/facebook/contacts/c/e;->DELTA:Lcom/facebook/contacts/c/e;

    if-ne p3, v0, :cond_0

    .line 49
    if-eqz p2, :cond_3

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 52
    :cond_0
    const-string v0, "contacts"

    invoke-static {v0}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v3

    .line 55
    sget-object v0, Lcom/facebook/contacts/c/e;->FULL:Lcom/facebook/contacts/c/e;

    if-ne p3, v0, :cond_1

    .line 56
    const-string v0, "contact_profile_type"

    new-array v4, v1, [Ljava/lang/Object;

    invoke-direct {p0}, Lcom/facebook/contacts/c/d;->a()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-virtual {v3, v0, v4}, Lcom/facebook/g/a/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Lcom/facebook/g/a/b;

    move-result-object v0

    const-string v4, "high_quality"

    new-array v5, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v4, v5}, Lcom/facebook/g/a/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Lcom/facebook/g/a/b;

    move-result-object v0

    const-string v4, "orderby"

    new-array v5, v1, [Ljava/lang/Object;

    const-string v6, "communication"

    aput-object v6, v5, v2

    invoke-virtual {v0, v4, v5}, Lcom/facebook/g/a/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Lcom/facebook/g/a/b;

    .line 65
    :cond_1
    const-string v0, "page_info"

    invoke-static {v0}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v0

    const-string v4, "end_cursor"

    invoke-virtual {v0, v4}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v0

    const-string v4, "has_next_page"

    invoke-virtual {v0, v4}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v5

    .line 75
    sget-object v0, Lcom/facebook/contacts/c/e;->FULL:Lcom/facebook/contacts/c/e;

    if-ne p3, v0, :cond_4

    .line 77
    const-string v0, "nodes"

    invoke-static {v0}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v0

    .line 78
    iget-object v4, p0, Lcom/facebook/contacts/c/d;->a:Lcom/facebook/contacts/c/b;

    invoke-interface {v4, v0}, Lcom/facebook/contacts/c/b;->a(Lcom/facebook/g/a/b;)V

    .line 79
    const-string v4, "delta_cursor"

    invoke-virtual {v5, v4}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-object v4, v0

    move-object v0, v3

    .line 99
    :goto_1
    if-eqz p2, :cond_2

    .line 100
    const-string v6, "after"

    new-array v7, v1, [Ljava/lang/Object;

    aput-object p2, v7, v2

    invoke-virtual {v0, v6, v7}, Lcom/facebook/g/a/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Lcom/facebook/g/a/b;

    .line 101
    sget-object v6, Lcom/facebook/contacts/c/e;->DELTA:Lcom/facebook/contacts/c/e;

    if-ne p3, v6, :cond_2

    .line 102
    const-string v6, "contact_profile_type"

    new-array v7, v1, [Ljava/lang/Object;

    invoke-direct {p0}, Lcom/facebook/contacts/c/d;->a()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v2

    invoke-virtual {v0, v6, v7}, Lcom/facebook/g/a/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Lcom/facebook/g/a/b;

    move-result-object v6

    const-string v7, "high_quality"

    new-array v8, v2, [Ljava/lang/Object;

    invoke-virtual {v6, v7, v8}, Lcom/facebook/g/a/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Lcom/facebook/g/a/b;

    .line 111
    :cond_2
    const-string v6, "first"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v1, v2

    invoke-virtual {v0, v6, v1}, Lcom/facebook/g/a/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Lcom/facebook/g/a/b;

    move-result-object v0

    invoke-virtual {v5}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    .line 115
    invoke-virtual {v4}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v0

    .line 119
    invoke-static {}, Lcom/facebook/g/a/a;->a()Lcom/facebook/g/a/b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v0

    .line 123
    invoke-virtual {v0}, Lcom/facebook/g/a/a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_3
    move v0, v2

    .line 49
    goto/16 :goto_0

    .line 85
    :cond_4
    const-string v0, "added"

    invoke-static {v0}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v0

    .line 86
    iget-object v4, p0, Lcom/facebook/contacts/c/d;->a:Lcom/facebook/contacts/c/b;

    invoke-interface {v4, v0}, Lcom/facebook/contacts/c/b;->a(Lcom/facebook/g/a/b;)V

    .line 88
    const-string v4, "deltas"

    invoke-static {v4}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v4

    const-string v6, "nodes"

    invoke-static {v6}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v6

    invoke-virtual {v0}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v0

    const-string v6, "removed"

    invoke-virtual {v0, v6}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v0

    move-object v4, v0

    .line 96
    goto/16 :goto_1
.end method
