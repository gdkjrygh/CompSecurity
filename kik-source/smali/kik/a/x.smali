.class public final Lkik/a/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/List;

.field private b:Ljava/util/Map;

.field private final c:Lkik/a/e/j;

.field private d:Lkik/a/d/h;


# direct methods
.method public constructor <init>(Lkik/a/e/j;)V
    .locals 3

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lkik/a/x;->b:Ljava/util/Map;

    .line 24
    iput-object p1, p0, Lkik/a/x;->c:Lkik/a/e/j;

    .line 25
    iget-object v0, p0, Lkik/a/x;->c:Lkik/a/e/j;

    invoke-interface {v0}, Lkik/a/e/j;->a()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lkik/a/x;->a:Ljava/util/List;

    .line 26
    iget-object v0, p0, Lkik/a/x;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/h;

    .line 27
    invoke-virtual {v0}, Lkik/a/d/h;->c()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 28
    iput-object v0, p0, Lkik/a/x;->d:Lkik/a/d/h;

    goto :goto_0

    .line 31
    :cond_1
    return-void
.end method


# virtual methods
.method public final a()Lkik/a/a;
    .locals 2

    .prologue
    .line 40
    iget-object v0, p0, Lkik/a/x;->d:Lkik/a/d/h;

    if-nez v0, :cond_0

    .line 41
    const/4 v0, 0x0

    .line 43
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lkik/a/x;->b:Ljava/util/Map;

    iget-object v1, p0, Lkik/a/x;->d:Lkik/a/d/h;

    invoke-virtual {v1}, Lkik/a/d/h;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/a;

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 141
    iget-object v0, p0, Lkik/a/x;->d:Lkik/a/d/h;

    if-nez v0, :cond_0

    .line 146
    :goto_0
    return-void

    .line 144
    :cond_0
    iget-object v0, p0, Lkik/a/x;->d:Lkik/a/d/h;

    invoke-virtual {v0, p1}, Lkik/a/d/h;->a(Ljava/lang/String;)V

    .line 145
    iget-object v0, p0, Lkik/a/x;->c:Lkik/a/e/j;

    invoke-interface {v0, p1}, Lkik/a/e/j;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lkik/a/x;->d:Lkik/a/d/h;

    if-eqz v0, :cond_0

    .line 54
    iget-object v0, p0, Lkik/a/x;->d:Lkik/a/d/h;

    invoke-virtual {v0}, Lkik/a/d/h;->a()Ljava/lang/String;

    move-result-object v0

    .line 56
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b(Ljava/lang/String;)Lkik/a/a;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 157
    if-nez p1, :cond_1

    .line 175
    :cond_0
    :goto_0
    return-object v1

    .line 160
    :cond_1
    iget-object v0, p0, Lkik/a/x;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/h;

    .line 161
    invoke-virtual {v0}, Lkik/a/d/h;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 162
    iget-object v1, p0, Lkik/a/x;->b:Ljava/util/Map;

    invoke-virtual {v0}, Lkik/a/d/h;->a()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkik/a/a;

    .line 163
    if-nez v1, :cond_3

    .line 164
    new-instance v1, Lkik/a/a;

    invoke-virtual {v0}, Lkik/a/d/h;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lkik/a/a;-><init>(Ljava/lang/String;)V

    .line 165
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lkik/a/d/h;->a(Z)V

    .line 166
    iget-object v2, p0, Lkik/a/x;->c:Lkik/a/e/j;

    invoke-interface {v2, v0}, Lkik/a/e/j;->a(Lkik/a/d/h;)Z

    .line 167
    iget-object v2, p0, Lkik/a/x;->b:Ljava/util/Map;

    invoke-virtual {v0}, Lkik/a/d/h;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    :cond_3
    iput-object v0, p0, Lkik/a/x;->d:Lkik/a/d/h;

    goto :goto_0
.end method

.method public final c()Lkik/a/a;
    .locals 4

    .prologue
    .line 70
    iget-object v0, p0, Lkik/a/x;->d:Lkik/a/d/h;

    if-eqz v0, :cond_0

    .line 72
    iget-object v0, p0, Lkik/a/x;->d:Lkik/a/d/h;

    invoke-virtual {v0}, Lkik/a/d/h;->a()Ljava/lang/String;

    move-result-object v1

    .line 73
    iget-object v0, p0, Lkik/a/x;->d:Lkik/a/d/h;

    .line 81
    :goto_0
    new-instance v2, Lkik/a/a;

    invoke-direct {v2, v1}, Lkik/a/a;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lkik/a/x;->a:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v3, p0, Lkik/a/x;->b:Ljava/util/Map;

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, Lkik/a/x;->d:Lkik/a/d/h;

    iget-object v0, p0, Lkik/a/x;->c:Lkik/a/e/j;

    iget-object v1, p0, Lkik/a/x;->d:Lkik/a/d/h;

    invoke-interface {v0, v1}, Lkik/a/e/j;->a(Lkik/a/d/h;)Z

    return-object v2

    .line 76
    :cond_0
    const/4 v1, 0x0

    iget-object v0, p0, Lkik/a/x;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/h;

    invoke-virtual {v0}, Lkik/a/d/h;->b()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    :goto_1
    if-nez v0, :cond_2

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v0, Lkik/a/d/h;

    invoke-direct {v0, v1}, Lkik/a/d/h;-><init>(Ljava/lang/String;)V

    .line 77
    :cond_2
    invoke-virtual {v0}, Lkik/a/d/h;->a()Ljava/lang/String;

    move-result-object v1

    .line 78
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lkik/a/d/h;->a(Z)V

    goto :goto_0

    :cond_3
    move-object v0, v1

    goto :goto_1
.end method

.method public final d()V
    .locals 5

    .prologue
    .line 183
    invoke-virtual {p0}, Lkik/a/x;->a()Lkik/a/a;

    move-result-object v0

    .line 184
    if-nez v0, :cond_0

    .line 189
    :goto_0
    return-void

    .line 187
    :cond_0
    iget-object v0, p0, Lkik/a/x;->d:Lkik/a/d/h;

    invoke-virtual {v0}, Lkik/a/d/h;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lkik/a/x;->b:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/a;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lkik/a/x;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkik/a/d/h;

    invoke-virtual {v1}, Lkik/a/d/h;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v3, p0, Lkik/a/x;->a:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_2
    iget-object v1, p0, Lkik/a/x;->b:Ljava/util/Map;

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lkik/a/x;->c:Lkik/a/e/j;

    invoke-interface {v1, v2}, Lkik/a/e/j;->b(Ljava/lang/String;)Z

    invoke-virtual {v0}, Lkik/a/a;->y()V

    invoke-virtual {v0}, Lkik/a/a;->e()V

    .line 188
    :cond_3
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/a/x;->d:Lkik/a/d/h;

    goto :goto_0
.end method
