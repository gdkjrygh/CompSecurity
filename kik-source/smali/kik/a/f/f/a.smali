.class public final Lkik/a/f/f/a;
.super Lkik/a/f/f/y;
.source "SourceFile"


# instance fields
.field private final a:Lkik/a/d/j;

.field private final b:Ljava/util/HashMap;

.field private i:Lkik/a/d/k;


# direct methods
.method public constructor <init>(Lkik/a/d/j;Ljava/util/HashMap;)V
    .locals 2

    .prologue
    .line 29
    const/4 v0, 0x0

    const-string v1, "set"

    invoke-direct {p0, v0, v1}, Lkik/a/f/f/y;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    .line 30
    iput-object p1, p0, Lkik/a/f/f/a;->a:Lkik/a/d/j;

    .line 31
    iput-object p2, p0, Lkik/a/f/f/a;->b:Ljava/util/HashMap;

    .line 32
    return-void
.end method


# virtual methods
.method public final a()Lkik/a/d/k;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lkik/a/f/f/a;->i:Lkik/a/d/k;

    return-object v0
.end method

.method protected final a(Lkik/a/f/n;)V
    .locals 2

    .prologue
    .line 58
    const-string v0, "query"

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    const-string v0, "xmlns"

    const-string v1, "kik:iq:friend"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/n;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    :goto_0
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 62
    const-string v0, "item"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lkik/a/f/t;->a(Lkik/a/f/n;Z)Lkik/a/d/k;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/f/a;->i:Lkik/a/d/k;

    .line 65
    :cond_0
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_0

    .line 67
    :cond_1
    return-void
.end method

.method public final b()Lkik/a/d/j;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lkik/a/f/f/a;->a:Lkik/a/d/j;

    return-object v0
.end method

.method protected final b(Lkik/a/f/o;)V
    .locals 3

    .prologue
    .line 37
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 38
    const-string v0, "xmlns"

    const-string v1, "kik:iq:friend"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    const-string v0, "add"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 40
    const-string v0, "jid"

    iget-object v1, p0, Lkik/a/f/f/a;->a:Lkik/a/d/j;

    invoke-virtual {v1}, Lkik/a/d/j;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    const-string v0, "add"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 42
    iget-object v0, p0, Lkik/a/f/f/a;->b:Ljava/util/HashMap;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lkik/a/f/f/a;->b:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 43
    const-string v0, "context"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 44
    iget-object v0, p0, Lkik/a/f/f/a;->b:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 45
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 46
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 50
    :cond_1
    const-string v0, "context"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 52
    :cond_2
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 53
    return-void
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 91
    const/4 v0, 0x0

    return v0
.end method
