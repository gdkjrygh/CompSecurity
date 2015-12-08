.class final Lkik/a/g/aw;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lkik/a/g/v;


# direct methods
.method constructor <init>(Lkik/a/g/v;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1032
    iput-object p1, p0, Lkik/a/g/aw;->b:Lkik/a/g/v;

    iput-object p2, p0, Lkik/a/g/aw;->a:Ljava/lang/String;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 1036
    iget-object v0, p0, Lkik/a/g/aw;->b:Lkik/a/g/v;

    invoke-static {v0}, Lkik/a/g/v;->g(Lkik/a/g/v;)Lcom/kik/g/p;

    .line 1040
    iget-object v0, p0, Lkik/a/g/aw;->b:Lkik/a/g/v;

    invoke-static {v0}, Lkik/a/g/v;->c(Lkik/a/g/v;)Lkik/a/e/f;

    move-result-object v0

    invoke-interface {v0}, Lkik/a/e/f;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1041
    iget-object v0, p0, Lkik/a/g/aw;->b:Lkik/a/g/v;

    invoke-static {v0}, Lkik/a/g/v;->h(Lkik/a/g/v;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 1042
    :try_start_0
    iget-object v0, p0, Lkik/a/g/aw;->b:Lkik/a/g/v;

    invoke-virtual {v0}, Lkik/a/g/v;->p()V

    .line 1043
    monitor-exit v1

    .line 1045
    :cond_0
    return-void

    .line 1043
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1032
    iget-object v0, p0, Lkik/a/g/aw;->b:Lkik/a/g/v;

    invoke-virtual {v0, v1, v1}, Lkik/a/g/v;->a(ZZ)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 1057
    .line 1059
    instance-of v0, p1, Lkik/a/f/q;

    if-eqz v0, :cond_3

    .line 1060
    check-cast p1, Lkik/a/f/q;

    .line 1062
    invoke-virtual {p1}, Lkik/a/f/q;->a()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    move v0, v2

    :goto_0
    if-nez v0, :cond_3

    move v0, v1

    .line 1069
    :goto_1
    iget-object v3, p0, Lkik/a/g/aw;->b:Lkik/a/g/v;

    iget-object v4, p0, Lkik/a/g/aw;->a:Ljava/lang/String;

    new-instance v5, Lkik/a/g/ax;

    invoke-direct {v5, p0}, Lkik/a/g/ax;-><init>(Lkik/a/g/aw;)V

    invoke-virtual {v3, v4, v1, v5}, Lkik/a/g/v;->a(Ljava/lang/String;ZLkik/a/e/r$a;)Lkik/a/d/k;

    move-result-object v3

    .line 1082
    if-nez v0, :cond_0

    invoke-virtual {v3}, Lkik/a/d/k;->f()I

    move-result v0

    const/4 v3, 0x5

    if-lt v0, v3, :cond_1

    :cond_0
    move v2, v1

    .line 1084
    :cond_1
    if-eqz v2, :cond_2

    .line 1085
    iget-object v0, p0, Lkik/a/g/aw;->b:Lkik/a/g/v;

    iget-object v2, p0, Lkik/a/g/aw;->a:Ljava/lang/String;

    new-instance v3, Lkik/a/g/ay;

    invoke-direct {v3, p0}, Lkik/a/g/ay;-><init>(Lkik/a/g/aw;)V

    invoke-virtual {v0, v2, v1, v3}, Lkik/a/g/v;->a(Ljava/lang/String;ZLkik/a/e/r$a;)Lkik/a/d/k;

    .line 1107
    :cond_2
    return-void

    :pswitch_1
    move v0, v1

    .line 1062
    goto :goto_0

    :cond_3
    move v0, v2

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x65
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
