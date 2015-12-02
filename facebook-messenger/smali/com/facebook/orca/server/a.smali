.class public Lcom/facebook/orca/server/a;
.super Ljava/lang/Object;
.source "AbstractBlueServiceHandlerFilter.java"

# interfaces
.implements Lcom/facebook/fbservice/service/f;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method protected constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/facebook/orca/server/a;->a:Ljava/lang/String;

    .line 21
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 5

    .prologue
    const-wide/16 v3, 0xa

    .line 27
    iget-object v0, p0, Lcom/facebook/orca/server/a;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 29
    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v0

    .line 30
    sget-object v2, Lcom/facebook/orca/server/aq;->i:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v2, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 31
    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/server/a;->b(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 80
    invoke-virtual {v1, v3, v4}, Lcom/facebook/debug/d/e;->a(J)J

    :goto_0
    return-object v0

    .line 32
    :cond_0
    :try_start_1
    sget-object v2, Lcom/facebook/orca/server/aq;->j:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v2, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 33
    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/server/a;->c(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 80
    invoke-virtual {v1, v3, v4}, Lcom/facebook/debug/d/e;->a(J)J

    goto :goto_0

    .line 34
    :cond_1
    :try_start_2
    sget-object v2, Lcom/facebook/orca/server/aq;->k:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v2, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 35
    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/server/a;->d(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    .line 80
    invoke-virtual {v1, v3, v4}, Lcom/facebook/debug/d/e;->a(J)J

    goto :goto_0

    .line 36
    :cond_2
    :try_start_3
    sget-object v2, Lcom/facebook/orca/server/aq;->l:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v2, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 37
    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/server/a;->u(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-object v0

    .line 80
    invoke-virtual {v1, v3, v4}, Lcom/facebook/debug/d/e;->a(J)J

    goto :goto_0

    .line 38
    :cond_3
    :try_start_4
    sget-object v2, Lcom/facebook/orca/server/aq;->m:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v2, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 39
    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/server/a;->s(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result-object v0

    .line 80
    invoke-virtual {v1, v3, v4}, Lcom/facebook/debug/d/e;->a(J)J

    goto :goto_0

    .line 40
    :cond_4
    :try_start_5
    sget-object v2, Lcom/facebook/orca/server/aq;->x:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v2, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 41
    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/server/a;->g(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-result-object v0

    .line 80
    invoke-virtual {v1, v3, v4}, Lcom/facebook/debug/d/e;->a(J)J

    goto :goto_0

    .line 42
    :cond_5
    :try_start_6
    sget-object v2, Lcom/facebook/orca/server/aq;->z:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v2, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 43
    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/server/a;->x(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-result-object v0

    .line 80
    invoke-virtual {v1, v3, v4}, Lcom/facebook/debug/d/e;->a(J)J

    goto :goto_0

    .line 44
    :cond_6
    :try_start_7
    sget-object v2, Lcom/facebook/orca/server/aq;->n:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v2, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 45
    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/server/a;->h(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    move-result-object v0

    .line 80
    invoke-virtual {v1, v3, v4}, Lcom/facebook/debug/d/e;->a(J)J

    goto :goto_0

    .line 46
    :cond_7
    :try_start_8
    sget-object v2, Lcom/facebook/orca/server/aq;->e:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v2, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 47
    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/server/a;->e(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    move-result-object v0

    .line 80
    invoke-virtual {v1, v3, v4}, Lcom/facebook/debug/d/e;->a(J)J

    goto :goto_0

    .line 48
    :cond_8
    :try_start_9
    sget-object v2, Lcom/facebook/orca/server/aq;->f:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v2, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 49
    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/server/a;->f(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    move-result-object v0

    .line 80
    invoke-virtual {v1, v3, v4}, Lcom/facebook/debug/d/e;->a(J)J

    goto/16 :goto_0

    .line 50
    :cond_9
    :try_start_a
    sget-object v2, Lcom/facebook/orca/server/aq;->u:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v2, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 51
    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/server/a;->t(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    move-result-object v0

    .line 80
    invoke-virtual {v1, v3, v4}, Lcom/facebook/debug/d/e;->a(J)J

    goto/16 :goto_0

    .line 52
    :cond_a
    :try_start_b
    sget-object v2, Lcom/facebook/orca/server/aq;->o:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v2, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 53
    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/server/a;->i(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    move-result-object v0

    .line 80
    invoke-virtual {v1, v3, v4}, Lcom/facebook/debug/d/e;->a(J)J

    goto/16 :goto_0

    .line 54
    :cond_b
    :try_start_c
    sget-object v2, Lcom/facebook/orca/server/aq;->p:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v2, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 55
    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/server/a;->j(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    move-result-object v0

    .line 80
    invoke-virtual {v1, v3, v4}, Lcom/facebook/debug/d/e;->a(J)J

    goto/16 :goto_0

    .line 56
    :cond_c
    :try_start_d
    sget-object v2, Lcom/facebook/orca/server/aq;->g:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v2, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 57
    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/server/a;->m(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    move-result-object v0

    .line 80
    invoke-virtual {v1, v3, v4}, Lcom/facebook/debug/d/e;->a(J)J

    goto/16 :goto_0

    .line 58
    :cond_d
    :try_start_e
    sget-object v2, Lcom/facebook/orca/server/aq;->h:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v2, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    .line 59
    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/server/a;->n(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    move-result-object v0

    .line 80
    invoke-virtual {v1, v3, v4}, Lcom/facebook/debug/d/e;->a(J)J

    goto/16 :goto_0

    .line 60
    :cond_e
    :try_start_f
    sget-object v2, Lcom/facebook/orca/server/aq;->v:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v2, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    .line 61
    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/server/a;->o(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    move-result-object v0

    .line 80
    invoke-virtual {v1, v3, v4}, Lcom/facebook/debug/d/e;->a(J)J

    goto/16 :goto_0

    .line 62
    :cond_f
    :try_start_10
    sget-object v2, Lcom/facebook/orca/server/aq;->s:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v2, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    .line 63
    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/server/a;->q(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    move-result-object v0

    .line 80
    invoke-virtual {v1, v3, v4}, Lcom/facebook/debug/d/e;->a(J)J

    goto/16 :goto_0

    .line 64
    :cond_10
    :try_start_11
    sget-object v2, Lcom/facebook/orca/server/aq;->t:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v2, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    .line 65
    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/server/a;->p(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    move-result-object v0

    .line 80
    invoke-virtual {v1, v3, v4}, Lcom/facebook/debug/d/e;->a(J)J

    goto/16 :goto_0

    .line 66
    :cond_11
    :try_start_12
    sget-object v2, Lcom/facebook/orca/server/aq;->y:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v2, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_12

    .line 67
    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/server/a;->r(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    move-result-object v0

    .line 80
    invoke-virtual {v1, v3, v4}, Lcom/facebook/debug/d/e;->a(J)J

    goto/16 :goto_0

    .line 68
    :cond_12
    :try_start_13
    sget-object v2, Lcom/facebook/orca/server/aq;->E:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v2, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_13

    .line 69
    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/server/a;->v(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    move-result-object v0

    .line 80
    invoke-virtual {v1, v3, v4}, Lcom/facebook/debug/d/e;->a(J)J

    goto/16 :goto_0

    .line 70
    :cond_13
    :try_start_14
    sget-object v2, Lcom/facebook/orca/server/aq;->q:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v2, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_14

    .line 71
    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/server/a;->k(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_0

    move-result-object v0

    .line 80
    invoke-virtual {v1, v3, v4}, Lcom/facebook/debug/d/e;->a(J)J

    goto/16 :goto_0

    .line 72
    :cond_14
    :try_start_15
    sget-object v2, Lcom/facebook/orca/server/aq;->r:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v2, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_15

    .line 73
    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/server/a;->l(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    move-result-object v0

    .line 80
    invoke-virtual {v1, v3, v4}, Lcom/facebook/debug/d/e;->a(J)J

    goto/16 :goto_0

    .line 74
    :cond_15
    :try_start_16
    sget-object v2, Lcom/facebook/orca/server/aq;->F:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v2, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 75
    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/server/a;->w(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_0

    move-result-object v0

    .line 80
    invoke-virtual {v1, v3, v4}, Lcom/facebook/debug/d/e;->a(J)J

    goto/16 :goto_0

    .line 77
    :cond_16
    :try_start_17
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_0

    move-result-object v0

    .line 80
    invoke-virtual {v1, v3, v4}, Lcom/facebook/debug/d/e;->a(J)J

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v1, v3, v4}, Lcom/facebook/debug/d/e;->a(J)J

    throw v0
.end method

.method protected b(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 87
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected c(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 93
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected d(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 99
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected e(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 135
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected f(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 141
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected g(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 117
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected h(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 129
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected i(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 153
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected j(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 159
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected k(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 207
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected l(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 213
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected m(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 165
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected n(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 171
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected o(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 177
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected p(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 189
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected q(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 183
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected r(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 195
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected s(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 111
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected t(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 147
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected u(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 105
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected v(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 201
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected w(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 220
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected x(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 123
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method
