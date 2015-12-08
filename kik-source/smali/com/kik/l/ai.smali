.class final Lcom/kik/l/ai;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/l/y$a;


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Ljava/util/Set;

.field final synthetic c:Lcom/kik/l/ae;


# direct methods
.method constructor <init>(Lcom/kik/l/ae;Ljava/util/Map;Ljava/util/Set;)V
    .locals 0

    .prologue
    .line 374
    iput-object p1, p0, Lcom/kik/l/ai;->c:Lcom/kik/l/ae;

    iput-object p2, p0, Lcom/kik/l/ai;->a:Ljava/util/Map;

    iput-object p3, p0, Lcom/kik/l/ai;->b:Ljava/util/Set;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 374
    check-cast p1, Lcom/kik/l/z;

    iget-object v0, p0, Lcom/kik/l/ai;->a:Ljava/util/Map;

    const-string v1, "_id"

    invoke-virtual {p1, v1}, Lcom/kik/l/z;->d(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/d;

    if-eqz v0, :cond_0

    const-string v1, "_id"

    invoke-virtual {p1, v1}, Lcom/kik/l/z;->d(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lkik/a/d/a/d;->a(I)V

    const-string v1, "body"

    invoke-virtual {p1, v1}, Lcom/kik/l/z;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/a/d/a/d;->c(Ljava/lang/String;)V

    const-string v1, "friend_attribute_type"

    invoke-virtual {p1, v1}, Lcom/kik/l/z;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/a/d/a/d;->a(Ljava/lang/String;)V

    const-string v1, "referrer_jid"

    invoke-virtual {p1, v1}, Lcom/kik/l/z;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/a/d/a/d;->b(Ljava/lang/String;)V

    const-string v1, "reply"

    invoke-virtual {p1, v1}, Lcom/kik/l/z;->a(Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lkik/a/d/a/d;->a(Z)V

    const-string v1, "timestamp"

    invoke-virtual {p1, v1}, Lcom/kik/l/z;->e(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lkik/a/d/a/d;->a(J)V

    :cond_0
    const-string v1, "referrer_jid"

    invoke-virtual {p1, v1}, Lcom/kik/l/z;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/l/ai;->b:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lkik/a/d/a/d;->c()V

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/kik/l/ai;->b:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method
