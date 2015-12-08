.class final Lcom/kik/l/af;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/l/y$a;


# instance fields
.field a:Ljava/util/Vector;

.field b:Lkik/a/d/f;

.field final synthetic c:Ljava/util/Hashtable;

.field final synthetic d:Ljava/util/Map;

.field final synthetic e:Ljava/util/Map;

.field final synthetic f:Lcom/kik/l/ae;


# direct methods
.method constructor <init>(Lcom/kik/l/ae;Ljava/util/Hashtable;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1

    .prologue
    .line 268
    iput-object p1, p0, Lcom/kik/l/af;->f:Lcom/kik/l/ae;

    iput-object p2, p0, Lcom/kik/l/af;->c:Ljava/util/Hashtable;

    iput-object p3, p0, Lcom/kik/l/af;->d:Ljava/util/Map;

    iput-object p4, p0, Lcom/kik/l/af;->e:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 269
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lcom/kik/l/af;->a:Ljava/util/Vector;

    .line 270
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/l/af;->b:Lkik/a/d/f;

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 22

    .prologue
    .line 268
    check-cast p1, Lcom/kik/l/ad;

    const-string v2, "body"

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Lcom/kik/l/ad;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "was_me"

    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Lcom/kik/l/ad;->a(Ljava/lang/String;)Z

    move-result v6

    const-string v3, "read_state"

    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Lcom/kik/l/ad;->d(Ljava/lang/String;)I

    move-result v10

    const-string v3, "uid"

    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Lcom/kik/l/ad;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v3, "timestamp"

    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Lcom/kik/l/ad;->e(Ljava/lang/String;)J

    move-result-wide v8

    const-string v3, "partner_jid"

    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Lcom/kik/l/ad;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v3, "bin_id"

    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Lcom/kik/l/ad;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v3, "sys_msg"

    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Lcom/kik/l/ad;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const-string v3, "stat_msg"

    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Lcom/kik/l/ad;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const-string v3, "stat_user_jid"

    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Lcom/kik/l/ad;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    const-string v3, "stat_special_visibility"

    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Lcom/kik/l/ad;->a(Ljava/lang/String;)Z

    move-result v17

    const-string v3, "content_id"

    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Lcom/kik/l/ad;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    const-string v3, "friend_attr_id"

    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Lcom/kik/l/ad;->d(Ljava/lang/String;)I

    move-result v19

    const-string v3, "render_instructions"

    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Lcom/kik/l/ad;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    const-string v3, "message_retry_count"

    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Lcom/kik/l/ad;->d(Ljava/lang/String;)I

    move-result v12

    const-string v3, "req_read_reciept"

    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Lcom/kik/l/ad;->a(Ljava/lang/String;)Z

    move-result v11

    const-string v3, "encryption_failure"

    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Lcom/kik/l/ad;->a(Ljava/lang/String;)Z

    move-result v21

    const-string v3, "encryption_key"

    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Lcom/kik/l/ad;->b(Ljava/lang/String;)[B

    move-result-object v13

    new-instance v3, Lkik/a/d/s;

    invoke-direct/range {v3 .. v13}, Lkik/a/d/s;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JIZI[B)V

    move/from16 v0, v21

    invoke-virtual {v3, v0}, Lkik/a/d/s;->b(Z)V

    if-eqz v2, :cond_0

    new-instance v4, Lkik/a/d/a/h;

    invoke-direct {v4, v2}, Lkik/a/d/a/h;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Lkik/a/d/s;->a(Lkik/a/d/a/g;)V

    :cond_0
    if-eqz v14, :cond_1

    new-instance v2, Lkik/a/d/a/m;

    invoke-direct {v2, v14}, Lkik/a/d/a/m;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Lkik/a/d/s;->a(Lkik/a/d/a/g;)V

    :cond_1
    if-eqz v21, :cond_2

    new-instance v2, Lkik/a/d/a/b;

    const/4 v4, 0x0

    invoke-direct {v2, v4}, Lkik/a/d/a/b;-><init>(B)V

    invoke-virtual {v3, v2}, Lkik/a/d/s;->a(Lkik/a/d/a/g;)V

    :cond_2
    if-eqz v15, :cond_3

    if-eqz v16, :cond_3

    new-instance v2, Lkik/a/d/a/l;

    move-object/from16 v0, v16

    move/from16 v1, v17

    invoke-direct {v2, v15, v0, v1}, Lkik/a/d/a/l;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v3, v2}, Lkik/a/d/s;->a(Lkik/a/d/a/g;)V

    :cond_3
    if-eqz v20, :cond_4

    new-instance v2, Lkik/a/f/e/k;

    move-object/from16 v0, v20

    invoke-direct {v2, v0}, Lkik/a/f/e/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Lkik/a/d/s;->a(Lkik/a/d/a/g;)V

    :cond_4
    if-eqz v18, :cond_5

    const-string v2, "app_id"

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Lcom/kik/l/ad;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-instance v4, Lkik/a/d/a/a;

    const-string v7, "2"

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v5, v18

    invoke-direct/range {v4 .. v11}, Lkik/a/d/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/Hashtable;Ljava/util/Hashtable;Ljava/util/Hashtable;)V

    invoke-virtual {v3, v4}, Lkik/a/d/s;->a(Lkik/a/d/a/g;)V

    :cond_5
    if-eqz v19, :cond_6

    new-instance v2, Lkik/a/d/a/d;

    move/from16 v0, v19

    invoke-direct {v2, v0}, Lkik/a/d/a/d;-><init>(I)V

    invoke-virtual {v3, v2}, Lkik/a/d/s;->a(Lkik/a/d/a/g;)V

    :cond_6
    invoke-virtual {v3}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/l/af;->b:Lkik/a/d/f;

    if-eqz v2, :cond_7

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/l/af;->b:Lkik/a/d/f;

    invoke-virtual {v2}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    :cond_7
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/l/af;->b:Lkik/a/d/f;

    if-eqz v2, :cond_8

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/l/af;->b:Lkik/a/d/f;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/kik/l/af;->a:Ljava/util/Vector;

    invoke-virtual {v2, v5}, Lkik/a/d/f;->a(Ljava/util/List;)V

    new-instance v2, Ljava/util/Vector;

    invoke-direct {v2}, Ljava/util/Vector;-><init>()V

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/kik/l/af;->a:Ljava/util/Vector;

    :cond_8
    new-instance v2, Lkik/a/d/f;

    invoke-direct {v2, v4}, Lkik/a/d/f;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/kik/l/af;->b:Lkik/a/d/f;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/l/af;->c:Ljava/util/Hashtable;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/kik/l/af;->b:Lkik/a/d/f;

    invoke-virtual {v2, v4, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/l/af;->a:Ljava/util/Vector;

    invoke-virtual {v2, v3}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Lkik/a/d/s;->l()Ljava/util/Vector;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_a
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkik/a/d/a/g;

    instance-of v3, v2, Lkik/a/d/a/a;

    if-eqz v3, :cond_c

    const-string v3, "content_id"

    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Lcom/kik/l/ad;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/l/af;->d:Ljava/util/Map;

    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-nez v3, :cond_b

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :cond_b
    check-cast v2, Lkik/a/d/a/a;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/l/af;->d:Ljava/util/Map;

    invoke-interface {v2, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_c
    instance-of v3, v2, Lkik/a/d/a/d;

    if-eqz v3, :cond_a

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/l/af;->e:Ljava/util/Map;

    const-string v6, "friend_attr_id"

    move-object/from16 v0, p1

    invoke-virtual {v0, v6}, Lcom/kik/l/ad;->d(Ljava/lang/String;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    check-cast v2, Lkik/a/d/a/d;

    invoke-interface {v3, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_d
    invoke-virtual/range {p1 .. p1}, Lcom/kik/l/ad;->isLast()Z

    move-result v2

    if-eqz v2, :cond_e

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/l/af;->b:Lkik/a/d/f;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/l/af;->a:Ljava/util/Vector;

    invoke-virtual {v2, v3}, Lkik/a/d/f;->a(Ljava/util/List;)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/l/af;->c:Ljava/util/Hashtable;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/l/af;->b:Lkik/a/d/f;

    invoke-virtual {v2, v4, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_e
    return-void
.end method
