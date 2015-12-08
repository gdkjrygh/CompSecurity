.class public final Lkik/a/a/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/a/l;


# instance fields
.field private final a:Lkik/a/e/f;

.field private final b:Lkik/a/e/e;

.field private final c:Lkik/a/j/m;

.field private final d:Lkik/a/e/v;


# direct methods
.method public constructor <init>(Lkik/a/e/f;Lkik/a/e/e;Lkik/a/j/m;Lkik/a/e/v;)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lkik/a/a/j;->a:Lkik/a/e/f;

    .line 42
    iput-object p2, p0, Lkik/a/a/j;->b:Lkik/a/e/e;

    .line 43
    iput-object p3, p0, Lkik/a/a/j;->c:Lkik/a/j/m;

    .line 44
    iput-object p4, p0, Lkik/a/a/j;->d:Lkik/a/e/v;

    .line 45
    return-void
.end method


# virtual methods
.method public final a()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lkik/a/a/j;->a:Lkik/a/e/f;

    invoke-interface {v0}, Lkik/a/e/f;->b()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/util/List;)V
    .locals 7

    .prologue
    .line 101
    iget-object v0, p0, Lkik/a/a/j;->b:Lkik/a/e/e;

    invoke-interface {v0}, Lkik/a/e/e;->c()Lcom/kik/d/f;

    move-result-object v1

    if-eqz v1, :cond_4

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/a/a;

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v0}, Lkik/a/a/a;->b()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v0}, Lkik/a/a/a;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_1

    const-string v5, "variant"

    invoke-virtual {v0}, Lkik/a/a/a;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {v0}, Lkik/a/a/a;->c()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v0}, Lkik/a/a/a;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_2

    const-string v5, "experiment_id"

    invoke-virtual {v0}, Lkik/a/a/a;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-virtual {v0}, Lkik/a/a/a;->a()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v0}, Lkik/a/a/a;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_0

    invoke-virtual {v0}, Lkik/a/a/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lkik/a/a/j;->b:Lkik/a/e/e;

    invoke-interface {v0, v2}, Lkik/a/e/e;->a(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_4

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v3, "experiments"

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/kik/d/b/a$k;->j:Lcom/kik/d/b/a$k;

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v4

    invoke-virtual {v1, v0, v2, v4, v5}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$k;Ljava/util/Map;J)V

    .line 102
    :cond_4
    return-void
.end method

.method public final b()J
    .locals 2

    .prologue
    .line 56
    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lkik/a/a/j;->a:Lkik/a/e/f;

    invoke-interface {v0}, Lkik/a/e/f;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/a/a/j;->a:Lkik/a/e/f;

    invoke-interface {v0}, Lkik/a/e/f;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final d()Lcom/kik/g/p;
    .locals 4

    .prologue
    .line 68
    new-instance v1, Lcom/kik/g/p;

    invoke-direct {v1}, Lcom/kik/g/p;-><init>()V

    .line 70
    invoke-static {}, Lcom/kik/a/a/a$c;->j()Lcom/kik/a/a/a$c$a;

    move-result-object v2

    iget-object v0, p0, Lkik/a/a/j;->d:Lkik/a/e/v;

    invoke-static {v0}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/z;->a()Lkik/a/d/j;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v2, v0}, Lcom/kik/a/a/a$c$a;->a(Lcom/kik/o/c;)Lcom/kik/a/a/a$c$a;

    move-result-object v0

    .line 73
    invoke-virtual {v0}, Lcom/kik/a/a/a$c$a;->r()Lcom/kik/a/a/a$c;

    move-result-object v0

    invoke-static {v0}, Lkik/a/k/a;->a(Lcom/kik/a/a/a$c;)Lkik/a/k/b;

    move-result-object v0

    iget-object v2, p0, Lkik/a/a/j;->a:Lkik/a/e/f;

    invoke-virtual {v0, v2}, Lkik/a/k/b;->a(Lkik/a/e/f;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v2, Lkik/a/a/k;

    invoke-direct {v2, p0, v1}, Lkik/a/a/k;-><init>(Lkik/a/a/j;Lcom/kik/g/p;)V

    invoke-virtual {v0, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 94
    return-object v1

    .line 70
    :cond_0
    invoke-static {}, Lcom/kik/o/c;->i()Lcom/kik/o/c$a;

    move-result-object v3

    invoke-virtual {v0}, Lkik/a/d/j;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/kik/o/c$a;->a(Ljava/lang/String;)Lcom/kik/o/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/o/c$a;->r()Lcom/kik/o/c;

    move-result-object v0

    goto :goto_0
.end method
