.class final Lcom/kik/f/a/a/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/u;


# instance fields
.field final a:Ljava/util/HashMap;


# direct methods
.method constructor <init>()V
    .locals 3

    .prologue
    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 174
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/f/a/a/d;->a:Ljava/util/HashMap;

    .line 176
    iget-object v0, p0, Lcom/kik/f/a/a/d;->a:Ljava/util/HashMap;

    const-string v1, "contentlink"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    return-void
.end method


# virtual methods
.method public final synthetic a()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 97
    new-instance v0, Lcom/kik/f/a/a/c;

    invoke-direct {v0}, Lcom/kik/f/a/a/c;-><init>()V

    return-object v0
.end method

.method public final synthetic a(Lcom/b/a/k;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 97
    check-cast p2, Lcom/kik/f/a/a/c;

    invoke-interface {p1, p0}, Lcom/b/a/k;->a(Lcom/b/a/u;)I

    move-result v0

    :goto_0
    packed-switch v0, :pswitch_data_0

    invoke-interface {p1, v0, p0}, Lcom/b/a/k;->a(ILcom/b/a/u;)V

    :goto_1
    invoke-interface {p1, p0}, Lcom/b/a/k;->a(Lcom/b/a/u;)I

    move-result v0

    goto :goto_0

    :pswitch_0
    iget-object v0, p2, Lcom/kik/f/a/a/c;->b:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p2, Lcom/kik/f/a/a/c;->b:Ljava/util/List;

    :cond_0
    iget-object v0, p2, Lcom/kik/f/a/a/c;->b:Ljava/util/List;

    const/4 v1, 0x0

    invoke-static {}, Lcom/kik/f/a/a/a;->b()Lcom/b/a/u;

    move-result-object v2

    invoke-interface {p1, v1, v2}, Lcom/b/a/k;->a(Ljava/lang/Object;Lcom/b/a/u;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :pswitch_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic a(Lcom/b/a/o;Ljava/lang/Object;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 97
    check-cast p2, Lcom/kik/f/a/a/c;

    iget-object v0, p2, Lcom/kik/f/a/a/c;->b:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p2, Lcom/kik/f/a/a/c;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/f/a/a/a;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/kik/f/a/a/a;->b()Lcom/b/a/u;

    move-result-object v2

    invoke-interface {p1, v3, v0, v2, v3}, Lcom/b/a/o;->a(ILjava/lang/Object;Lcom/b/a/u;Z)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final bridge synthetic a(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 97
    const/4 v0, 0x1

    return v0
.end method
