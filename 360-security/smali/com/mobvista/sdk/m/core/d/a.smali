.class public final Lcom/mobvista/sdk/m/core/d/a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/mobvista/sdk/m/a/c/d;


# instance fields
.field private a:Ljava/util/HashMap;

.field private b:Lcom/mobvista/sdk/m/a/c/a;

.field private c:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object v0, p0, Lcom/mobvista/sdk/m/core/d/a;->a:Ljava/util/HashMap;

    .line 20
    iput-object v0, p0, Lcom/mobvista/sdk/m/core/d/a;->b:Lcom/mobvista/sdk/m/a/c/a;

    .line 21
    iput-object v0, p0, Lcom/mobvista/sdk/m/core/d/a;->c:Ljava/util/List;

    .line 25
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/d/a;->a:Ljava/util/HashMap;

    .line 26
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/d/a;->c:Ljava/util/List;

    .line 27
    new-instance v0, Lcom/mobvista/sdk/m/a/c/a;

    invoke-direct {v0}, Lcom/mobvista/sdk/m/a/c/a;-><init>()V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/d/a;->b:Lcom/mobvista/sdk/m/a/c/a;

    .line 28
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/d/a;->b:Lcom/mobvista/sdk/m/a/c/a;

    invoke-virtual {v0, p0}, Lcom/mobvista/sdk/m/a/c/a;->a(Lcom/mobvista/sdk/m/a/c/d;)V

    .line 29
    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/d/a;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mobvista/sdk/m/core/d/b;

    .line 79
    if-eqz v0, :cond_0

    .line 80
    invoke-interface {v0, p2}, Lcom/mobvista/sdk/m/core/d/b;->b(Ljava/lang/String;)V

    .line 82
    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/d/a;->c:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 83
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/d/a;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/d/a;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mobvista/sdk/m/core/d/b;

    .line 89
    if-eqz v0, :cond_0

    .line 90
    invoke-interface {v0, p3}, Lcom/mobvista/sdk/m/core/d/b;->a(I)V

    .line 92
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Lcom/mobvista/sdk/m/core/d/b;)V
    .locals 6

    .prologue
    .line 44
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/d/a;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 45
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 46
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/d/a;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    :goto_0
    return-void

    .line 54
    :cond_1
    invoke-static {p1}, Lcom/mobvista/sdk/m/core/util/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 55
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/d/a;->b:Lcom/mobvista/sdk/m/a/c/a;

    sget-object v3, Lcom/mobvista/sdk/m/core/q;->c:Ljava/lang/String;

    move-object v1, p1

    move-object v2, p2

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lcom/mobvista/sdk/m/a/c/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mobvista/sdk/m/a/c/d;)V

    .line 58
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/d/a;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/d/a;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/d/a;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mobvista/sdk/m/core/d/b;

    .line 69
    if-eqz v0, :cond_0

    .line 70
    invoke-interface {v0, p3}, Lcom/mobvista/sdk/m/core/d/b;->a(Ljava/lang/String;)V

    .line 72
    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/d/a;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 73
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/d/a;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    return-void
.end method
