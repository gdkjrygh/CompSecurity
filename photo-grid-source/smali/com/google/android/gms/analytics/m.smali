.class final Lcom/google/android/gms/analytics/m;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Z

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:J

.field final synthetic e:Z

.field final synthetic f:Z

.field final synthetic g:Ljava/lang/String;

.field final synthetic h:Lcom/google/android/gms/analytics/l;


# direct methods
.method constructor <init>(Lcom/google/android/gms/analytics/l;Ljava/util/Map;ZLjava/lang/String;JZZLjava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/analytics/m;->h:Lcom/google/android/gms/analytics/l;

    iput-object p2, p0, Lcom/google/android/gms/analytics/m;->a:Ljava/util/Map;

    iput-boolean p3, p0, Lcom/google/android/gms/analytics/m;->b:Z

    iput-object p4, p0, Lcom/google/android/gms/analytics/m;->c:Ljava/lang/String;

    iput-wide p5, p0, Lcom/google/android/gms/analytics/m;->d:J

    iput-boolean p7, p0, Lcom/google/android/gms/analytics/m;->e:Z

    iput-boolean p8, p0, Lcom/google/android/gms/analytics/m;->f:Z

    iput-object p9, p0, Lcom/google/android/gms/analytics/m;->g:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    .prologue
    const-wide/16 v10, 0x0

    const/4 v9, 0x1

    const/4 v1, 0x0

    .line 0
    iget-object v0, p0, Lcom/google/android/gms/analytics/m;->h:Lcom/google/android/gms/analytics/l;

    invoke-static {v0}, Lcom/google/android/gms/analytics/l;->a(Lcom/google/android/gms/analytics/l;)Lcom/google/android/gms/analytics/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/n;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/analytics/m;->a:Ljava/util/Map;

    const-string v2, "sc"

    const-string v3, "start"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/m;->a:Ljava/util/Map;

    const-string v2, "cid"

    iget-object v3, p0, Lcom/google/android/gms/analytics/m;->h:Lcom/google/android/gms/analytics/l;

    invoke-virtual {v3}, Lcom/google/android/gms/analytics/l;->q()Lcom/google/android/gms/analytics/f;

    move-result-object v3

    .line 1000
    const-string v4, "getClientId can not be called from the main thread"

    invoke-static {v4}, Lcom/google/android/gms/common/internal/bl;->c(Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/google/android/gms/analytics/f;->f()Lcom/google/android/gms/analytics/internal/aa;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/analytics/internal/aa;->o()Lcom/google/android/gms/analytics/internal/as;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/analytics/internal/as;->b()Ljava/lang/String;

    move-result-object v3

    .line 0
    invoke-static {v0, v2, v3}, Lcom/google/android/gms/analytics/internal/q;->b(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/m;->a:Ljava/util/Map;

    const-string v2, "sf"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/google/android/gms/analytics/internal/q;->a(Ljava/lang/String;)D

    move-result-wide v2

    iget-object v0, p0, Lcom/google/android/gms/analytics/m;->a:Ljava/util/Map;

    const-string v4, "cid"

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v2, v3, v0}, Lcom/google/android/gms/analytics/internal/q;->a(DLjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/analytics/m;->h:Lcom/google/android/gms/analytics/l;

    const-string v1, "Sampling enabled. Hit sampled out. sample rate"

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/analytics/l;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/analytics/m;->h:Lcom/google/android/gms/analytics/l;

    invoke-static {v0}, Lcom/google/android/gms/analytics/l;->b(Lcom/google/android/gms/analytics/l;)Lcom/google/android/gms/analytics/internal/b;

    move-result-object v0

    iget-boolean v2, p0, Lcom/google/android/gms/analytics/m;->b:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/analytics/m;->a:Ljava/util/Map;

    const-string v3, "ate"

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/b;->b()Z

    move-result v4

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/analytics/internal/q;->a(Ljava/util/Map;Ljava/lang/String;Z)V

    iget-object v2, p0, Lcom/google/android/gms/analytics/m;->a:Ljava/util/Map;

    const-string v3, "adid"

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/b;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v3, v0}, Lcom/google/android/gms/analytics/internal/q;->a(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/analytics/m;->h:Lcom/google/android/gms/analytics/l;

    invoke-static {v0}, Lcom/google/android/gms/analytics/l;->c(Lcom/google/android/gms/analytics/l;)Lcom/google/android/gms/analytics/internal/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/al;->b()Lcom/google/android/gms/internal/wu;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/analytics/m;->a:Ljava/util/Map;

    const-string v3, "an"

    invoke-virtual {v0}, Lcom/google/android/gms/internal/wu;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/analytics/internal/q;->a(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/analytics/m;->a:Ljava/util/Map;

    const-string v3, "av"

    invoke-virtual {v0}, Lcom/google/android/gms/internal/wu;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/analytics/internal/q;->a(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/analytics/m;->a:Ljava/util/Map;

    const-string v3, "aid"

    invoke-virtual {v0}, Lcom/google/android/gms/internal/wu;->c()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/analytics/internal/q;->a(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/analytics/m;->a:Ljava/util/Map;

    const-string v3, "aiid"

    invoke-virtual {v0}, Lcom/google/android/gms/internal/wu;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v3, v0}, Lcom/google/android/gms/analytics/internal/q;->a(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/m;->a:Ljava/util/Map;

    const-string v2, "v"

    const-string v3, "1"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/analytics/m;->a:Ljava/util/Map;

    const-string v2, "_v"

    sget-object v3, Lcom/google/android/gms/analytics/internal/z;->b:Ljava/lang/String;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/analytics/m;->a:Ljava/util/Map;

    const-string v2, "ul"

    iget-object v3, p0, Lcom/google/android/gms/analytics/m;->h:Lcom/google/android/gms/analytics/l;

    invoke-static {v3}, Lcom/google/android/gms/analytics/l;->d(Lcom/google/android/gms/analytics/l;)Lcom/google/android/gms/analytics/internal/bd;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/analytics/internal/bd;->b()Lcom/google/android/gms/internal/ww;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ww;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lcom/google/android/gms/analytics/internal/q;->a(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/m;->a:Ljava/util/Map;

    const-string v2, "sr"

    iget-object v3, p0, Lcom/google/android/gms/analytics/m;->h:Lcom/google/android/gms/analytics/l;

    invoke-static {v3}, Lcom/google/android/gms/analytics/l;->e(Lcom/google/android/gms/analytics/l;)Lcom/google/android/gms/analytics/internal/bd;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/analytics/internal/bd;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lcom/google/android/gms/analytics/internal/q;->a(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/m;->c:Ljava/lang/String;

    const-string v2, "transaction"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/analytics/m;->c:Ljava/lang/String;

    const-string v2, "item"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_2
    move v0, v9

    :goto_2
    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/analytics/m;->h:Lcom/google/android/gms/analytics/l;

    invoke-static {v0}, Lcom/google/android/gms/analytics/l;->f(Lcom/google/android/gms/analytics/l;)Lcom/google/android/gms/analytics/internal/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/h;->a()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/analytics/m;->h:Lcom/google/android/gms/analytics/l;

    invoke-static {v0}, Lcom/google/android/gms/analytics/l;->g(Lcom/google/android/gms/analytics/l;)Lcom/google/android/gms/analytics/internal/j;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/analytics/m;->a:Ljava/util/Map;

    const-string v2, "Too many hits sent too quickly, rate limiting invoked"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/analytics/internal/j;->a(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/analytics/m;->a:Ljava/util/Map;

    const-string v2, "ate"

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/analytics/m;->a:Ljava/util/Map;

    const-string v2, "adid"

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_1

    :cond_4
    move v0, v1

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/analytics/m;->a:Ljava/util/Map;

    const-string v2, "ht"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/analytics/internal/q;->b(Ljava/lang/String;)J

    move-result-wide v4

    cmp-long v0, v4, v10

    if-nez v0, :cond_6

    iget-wide v4, p0, Lcom/google/android/gms/analytics/m;->d:J

    :cond_6
    iget-boolean v0, p0, Lcom/google/android/gms/analytics/m;->e:Z

    if-eqz v0, :cond_7

    new-instance v1, Lcom/google/android/gms/analytics/internal/d;

    iget-object v2, p0, Lcom/google/android/gms/analytics/m;->h:Lcom/google/android/gms/analytics/l;

    iget-object v3, p0, Lcom/google/android/gms/analytics/m;->a:Ljava/util/Map;

    iget-boolean v6, p0, Lcom/google/android/gms/analytics/m;->f:Z

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/analytics/internal/d;-><init>(Lcom/google/android/gms/analytics/internal/x;Ljava/util/Map;JZ)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/m;->h:Lcom/google/android/gms/analytics/l;

    invoke-static {v0}, Lcom/google/android/gms/analytics/l;->h(Lcom/google/android/gms/analytics/l;)Lcom/google/android/gms/analytics/internal/j;

    move-result-object v0

    const-string v2, "Dry run enabled. Would have sent hit"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/analytics/internal/j;->c(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/analytics/m;->a:Ljava/util/Map;

    const-string v2, "cid"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    new-instance v12, Ljava/util/HashMap;

    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    const-string v0, "uid"

    iget-object v2, p0, Lcom/google/android/gms/analytics/m;->a:Ljava/util/Map;

    invoke-static {v12, v0, v2}, Lcom/google/android/gms/analytics/internal/q;->a(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)V

    const-string v0, "an"

    iget-object v2, p0, Lcom/google/android/gms/analytics/m;->a:Ljava/util/Map;

    invoke-static {v12, v0, v2}, Lcom/google/android/gms/analytics/internal/q;->a(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)V

    const-string v0, "aid"

    iget-object v2, p0, Lcom/google/android/gms/analytics/m;->a:Ljava/util/Map;

    invoke-static {v12, v0, v2}, Lcom/google/android/gms/analytics/internal/q;->a(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)V

    const-string v0, "av"

    iget-object v2, p0, Lcom/google/android/gms/analytics/m;->a:Ljava/util/Map;

    invoke-static {v12, v0, v2}, Lcom/google/android/gms/analytics/internal/q;->a(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)V

    const-string v0, "aiid"

    iget-object v2, p0, Lcom/google/android/gms/analytics/m;->a:Ljava/util/Map;

    invoke-static {v12, v0, v2}, Lcom/google/android/gms/analytics/internal/q;->a(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)V

    new-instance v6, Lcom/google/android/gms/analytics/internal/ad;

    iget-object v8, p0, Lcom/google/android/gms/analytics/m;->g:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/analytics/m;->a:Ljava/util/Map;

    const-string v2, "adid"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    :goto_3
    invoke-direct/range {v6 .. v12}, Lcom/google/android/gms/analytics/internal/ad;-><init>(Ljava/lang/String;Ljava/lang/String;ZJLjava/util/Map;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/m;->h:Lcom/google/android/gms/analytics/l;

    invoke-static {v0}, Lcom/google/android/gms/analytics/l;->i(Lcom/google/android/gms/analytics/l;)Lcom/google/android/gms/analytics/internal/s;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/google/android/gms/analytics/internal/s;->a(Lcom/google/android/gms/analytics/internal/ad;)J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/analytics/m;->a:Ljava/util/Map;

    const-string v3, "_s"

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/analytics/internal/d;

    iget-object v2, p0, Lcom/google/android/gms/analytics/m;->h:Lcom/google/android/gms/analytics/l;

    iget-object v3, p0, Lcom/google/android/gms/analytics/m;->a:Ljava/util/Map;

    iget-boolean v6, p0, Lcom/google/android/gms/analytics/m;->f:Z

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/analytics/internal/d;-><init>(Lcom/google/android/gms/analytics/internal/x;Ljava/util/Map;JZ)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/m;->h:Lcom/google/android/gms/analytics/l;

    invoke-static {v0}, Lcom/google/android/gms/analytics/l;->j(Lcom/google/android/gms/analytics/l;)Lcom/google/android/gms/analytics/internal/s;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/internal/s;->a(Lcom/google/android/gms/analytics/internal/d;)V

    goto/16 :goto_0

    :cond_8
    move v9, v1

    goto :goto_3
.end method
