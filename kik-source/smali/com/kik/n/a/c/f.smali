.class final Lcom/kik/n/a/c/f;
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
    .line 282
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 466
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/n/a/c/f;->a:Ljava/util/HashMap;

    .line 468
    iget-object v0, p0, Lcom/kik/n/a/c/f;->a:Ljava/util/HashMap;

    const-string v1, "url"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 469
    iget-object v0, p0, Lcom/kik/n/a/c/f;->a:Ljava/util/HashMap;

    const-string v1, "title"

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 470
    iget-object v0, p0, Lcom/kik/n/a/c/f;->a:Ljava/util/HashMap;

    const-string v1, "iconUrl"

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    iget-object v0, p0, Lcom/kik/n/a/c/f;->a:Ljava/util/HashMap;

    const-string v1, "mediaTrayIconUrl"

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 472
    iget-object v0, p0, Lcom/kik/n/a/c/f;->a:Ljava/util/HashMap;

    const-string v1, "termsOfServiceLink"

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 473
    iget-object v0, p0, Lcom/kik/n/a/c/f;->a:Ljava/util/HashMap;

    const-string v1, "privacyLink"

    const/4 v2, 0x6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 474
    iget-object v0, p0, Lcom/kik/n/a/c/f;->a:Ljava/util/HashMap;

    const-string v1, "pushToken"

    const/4 v2, 0x7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 475
    iget-object v0, p0, Lcom/kik/n/a/c/f;->a:Ljava/util/HashMap;

    const-string v1, "dateAdded"

    const/16 v2, 0x8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 476
    iget-object v0, p0, Lcom/kik/n/a/c/f;->a:Ljava/util/HashMap;

    const-string v1, "lastAccessed"

    const/16 v2, 0x9

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 477
    iget-object v0, p0, Lcom/kik/n/a/c/f;->a:Ljava/util/HashMap;

    const-string v1, "anonymousKey"

    const/16 v2, 0xa

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 478
    iget-object v0, p0, Lcom/kik/n/a/c/f;->a:Ljava/util/HashMap;

    const-string v1, "permissions"

    const/16 v2, 0xb

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 479
    iget-object v0, p0, Lcom/kik/n/a/c/f;->a:Ljava/util/HashMap;

    const-string v1, "webPageURL"

    const/16 v2, 0xc

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 480
    iget-object v0, p0, Lcom/kik/n/a/c/f;->a:Ljava/util/HashMap;

    const-string v1, "backStackEntries"

    const/16 v2, 0xd

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    return-void
.end method


# virtual methods
.method public final synthetic a()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 282
    new-instance v0, Lcom/kik/n/a/c/e;

    invoke-direct {v0}, Lcom/kik/n/a/c/e;-><init>()V

    return-object v0
.end method

.method public final synthetic a(Lcom/b/a/k;Ljava/lang/Object;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 282
    check-cast p2, Lcom/kik/n/a/c/e;

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
    invoke-interface {p1}, Lcom/b/a/k;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/n/a/c/e;->b:Ljava/lang/String;

    goto :goto_1

    :pswitch_1
    invoke-interface {p1}, Lcom/b/a/k;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/n/a/c/e;->c:Ljava/lang/String;

    goto :goto_1

    :pswitch_2
    invoke-interface {p1}, Lcom/b/a/k;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/n/a/c/e;->d:Ljava/lang/String;

    goto :goto_1

    :pswitch_3
    invoke-interface {p1}, Lcom/b/a/k;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/n/a/c/e;->e:Ljava/lang/String;

    goto :goto_1

    :pswitch_4
    invoke-interface {p1}, Lcom/b/a/k;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/n/a/c/e;->f:Ljava/lang/String;

    goto :goto_1

    :pswitch_5
    invoke-interface {p1}, Lcom/b/a/k;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/n/a/c/e;->g:Ljava/lang/String;

    goto :goto_1

    :pswitch_6
    invoke-interface {p1}, Lcom/b/a/k;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/n/a/c/e;->h:Ljava/lang/String;

    goto :goto_1

    :pswitch_7
    invoke-interface {p1}, Lcom/b/a/k;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/n/a/c/e;->i:Ljava/lang/Long;

    goto :goto_1

    :pswitch_8
    invoke-interface {p1}, Lcom/b/a/k;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/n/a/c/e;->j:Ljava/lang/Long;

    goto :goto_1

    :pswitch_9
    iget-object v0, p2, Lcom/kik/n/a/c/e;->k:Lcom/kik/n/a/c/a;

    invoke-static {}, Lcom/kik/n/a/c/a;->b()Lcom/b/a/u;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/b/a/k;->a(Ljava/lang/Object;Lcom/b/a/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/n/a/c/a;

    iput-object v0, p2, Lcom/kik/n/a/c/e;->k:Lcom/kik/n/a/c/a;

    goto :goto_1

    :pswitch_a
    iget-object v0, p2, Lcom/kik/n/a/c/e;->l:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p2, Lcom/kik/n/a/c/e;->l:Ljava/util/List;

    :cond_0
    iget-object v0, p2, Lcom/kik/n/a/c/e;->l:Ljava/util/List;

    invoke-static {}, Lcom/kik/n/a/c/g;->b()Lcom/b/a/u;

    move-result-object v1

    invoke-interface {p1, v2, v1}, Lcom/b/a/k;->a(Ljava/lang/Object;Lcom/b/a/u;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :pswitch_b
    invoke-interface {p1}, Lcom/b/a/k;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/n/a/c/e;->m:Ljava/lang/String;

    goto :goto_1

    :pswitch_c
    iget-object v0, p2, Lcom/kik/n/a/c/e;->n:Ljava/util/List;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p2, Lcom/kik/n/a/c/e;->n:Ljava/util/List;

    :cond_1
    iget-object v0, p2, Lcom/kik/n/a/c/e;->n:Ljava/util/List;

    invoke-static {}, Lcom/kik/n/a/c/c;->b()Lcom/b/a/u;

    move-result-object v1

    invoke-interface {p1, v2, v1}, Lcom/b/a/k;->a(Ljava/lang/Object;Lcom/b/a/u;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :pswitch_d
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
    .end packed-switch
.end method

.method public final synthetic a(Lcom/b/a/o;Ljava/lang/Object;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 282
    check-cast p2, Lcom/kik/n/a/c/e;

    iget-object v0, p2, Lcom/kik/n/a/c/e;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p2, Lcom/kik/n/a/c/e;->b:Ljava/lang/String;

    invoke-interface {p1, v5, v0, v4}, Lcom/b/a/o;->a(ILjava/lang/String;Z)V

    :cond_0
    iget-object v0, p2, Lcom/kik/n/a/c/e;->c:Ljava/lang/String;

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    iget-object v1, p2, Lcom/kik/n/a/c/e;->c:Ljava/lang/String;

    invoke-interface {p1, v0, v1, v4}, Lcom/b/a/o;->a(ILjava/lang/String;Z)V

    :cond_1
    iget-object v0, p2, Lcom/kik/n/a/c/e;->d:Ljava/lang/String;

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    iget-object v1, p2, Lcom/kik/n/a/c/e;->d:Ljava/lang/String;

    invoke-interface {p1, v0, v1, v4}, Lcom/b/a/o;->a(ILjava/lang/String;Z)V

    :cond_2
    iget-object v0, p2, Lcom/kik/n/a/c/e;->e:Ljava/lang/String;

    if-eqz v0, :cond_3

    const/4 v0, 0x4

    iget-object v1, p2, Lcom/kik/n/a/c/e;->e:Ljava/lang/String;

    invoke-interface {p1, v0, v1, v4}, Lcom/b/a/o;->a(ILjava/lang/String;Z)V

    :cond_3
    iget-object v0, p2, Lcom/kik/n/a/c/e;->f:Ljava/lang/String;

    if-eqz v0, :cond_4

    const/4 v0, 0x5

    iget-object v1, p2, Lcom/kik/n/a/c/e;->f:Ljava/lang/String;

    invoke-interface {p1, v0, v1, v4}, Lcom/b/a/o;->a(ILjava/lang/String;Z)V

    :cond_4
    iget-object v0, p2, Lcom/kik/n/a/c/e;->g:Ljava/lang/String;

    if-eqz v0, :cond_5

    const/4 v0, 0x6

    iget-object v1, p2, Lcom/kik/n/a/c/e;->g:Ljava/lang/String;

    invoke-interface {p1, v0, v1, v4}, Lcom/b/a/o;->a(ILjava/lang/String;Z)V

    :cond_5
    iget-object v0, p2, Lcom/kik/n/a/c/e;->h:Ljava/lang/String;

    if-eqz v0, :cond_6

    const/4 v0, 0x7

    iget-object v1, p2, Lcom/kik/n/a/c/e;->h:Ljava/lang/String;

    invoke-interface {p1, v0, v1, v4}, Lcom/b/a/o;->a(ILjava/lang/String;Z)V

    :cond_6
    iget-object v0, p2, Lcom/kik/n/a/c/e;->i:Ljava/lang/Long;

    if-eqz v0, :cond_7

    const/16 v0, 0x8

    iget-object v1, p2, Lcom/kik/n/a/c/e;->i:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v0, v2, v3, v4}, Lcom/b/a/o;->a(IJZ)V

    :cond_7
    iget-object v0, p2, Lcom/kik/n/a/c/e;->j:Ljava/lang/Long;

    if-eqz v0, :cond_8

    const/16 v0, 0x9

    iget-object v1, p2, Lcom/kik/n/a/c/e;->j:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v0, v2, v3, v4}, Lcom/b/a/o;->a(IJZ)V

    :cond_8
    iget-object v0, p2, Lcom/kik/n/a/c/e;->k:Lcom/kik/n/a/c/a;

    if-eqz v0, :cond_9

    const/16 v0, 0xa

    iget-object v1, p2, Lcom/kik/n/a/c/e;->k:Lcom/kik/n/a/c/a;

    invoke-static {}, Lcom/kik/n/a/c/a;->b()Lcom/b/a/u;

    move-result-object v2

    invoke-interface {p1, v0, v1, v2, v4}, Lcom/b/a/o;->a(ILjava/lang/Object;Lcom/b/a/u;Z)V

    :cond_9
    iget-object v0, p2, Lcom/kik/n/a/c/e;->l:Ljava/util/List;

    if-eqz v0, :cond_b

    iget-object v0, p2, Lcom/kik/n/a/c/e;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_a
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/n/a/c/g;

    if-eqz v0, :cond_a

    const/16 v2, 0xb

    invoke-static {}, Lcom/kik/n/a/c/g;->b()Lcom/b/a/u;

    move-result-object v3

    invoke-interface {p1, v2, v0, v3, v5}, Lcom/b/a/o;->a(ILjava/lang/Object;Lcom/b/a/u;Z)V

    goto :goto_0

    :cond_b
    iget-object v0, p2, Lcom/kik/n/a/c/e;->m:Ljava/lang/String;

    if-eqz v0, :cond_c

    const/16 v0, 0xc

    iget-object v1, p2, Lcom/kik/n/a/c/e;->m:Ljava/lang/String;

    invoke-interface {p1, v0, v1, v4}, Lcom/b/a/o;->a(ILjava/lang/String;Z)V

    :cond_c
    iget-object v0, p2, Lcom/kik/n/a/c/e;->n:Ljava/util/List;

    if-eqz v0, :cond_e

    iget-object v0, p2, Lcom/kik/n/a/c/e;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_d
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/n/a/c/c;

    if-eqz v0, :cond_d

    const/16 v2, 0xd

    invoke-static {}, Lcom/kik/n/a/c/c;->b()Lcom/b/a/u;

    move-result-object v3

    invoke-interface {p1, v2, v0, v3, v5}, Lcom/b/a/o;->a(ILjava/lang/Object;Lcom/b/a/u;Z)V

    goto :goto_1

    :cond_e
    return-void
.end method

.method public final bridge synthetic a(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 282
    const/4 v0, 0x1

    return v0
.end method
