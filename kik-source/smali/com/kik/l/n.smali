.class final Lcom/kik/l/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/l/y$a;


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Lcom/kik/l/l;


# direct methods
.method constructor <init>(Lcom/kik/l/l;Ljava/util/Map;)V
    .locals 0

    .prologue
    .line 200
    iput-object p1, p0, Lcom/kik/l/n;->b:Lcom/kik/l/l;

    iput-object p2, p0, Lcom/kik/l/n;->a:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 200
    check-cast p1, Lcom/kik/l/aa;

    const-string v0, "group_id"

    invoke-virtual {p1, v0}, Lcom/kik/l/aa;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lcom/kik/l/n;->a:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/n$a;

    if-nez v0, :cond_0

    new-instance v0, Lkik/a/d/n$a;

    invoke-direct {v0}, Lkik/a/d/n$a;-><init>()V

    :cond_0
    const-string v2, "is_admin"

    invoke-virtual {p1, v2}, Lcom/kik/l/aa;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "member_jid"

    invoke-virtual {p1, v2}, Lcom/kik/l/aa;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lkik/a/d/n$a;->b(Ljava/lang/String;)Z

    :goto_0
    iget-object v2, p0, Lcom/kik/l/n;->a:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/kik/l/n;->a:Ljava/util/Map;

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void

    :cond_2
    const-string v2, "is_banned"

    invoke-virtual {p1, v2}, Lcom/kik/l/aa;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v2, "member_jid"

    invoke-virtual {p1, v2}, Lcom/kik/l/aa;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lkik/a/d/n$a;->f(Ljava/lang/String;)Z

    goto :goto_0

    :cond_3
    const-string v2, "member_jid"

    invoke-virtual {p1, v2}, Lcom/kik/l/aa;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lkik/a/d/n$a;->a(Ljava/lang/String;)V

    goto :goto_0
.end method
