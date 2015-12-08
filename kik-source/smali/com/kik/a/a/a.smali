.class public final Lcom/kik/a/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/a/a/a$e;,
        Lcom/kik/a/a/a$f;,
        Lcom/kik/a/a/a$c;,
        Lcom/kik/a/a/a$d;,
        Lcom/kik/a/a/a$a;,
        Lcom/kik/a/a/a$b;
    }
.end annotation


# static fields
.field private static a:Lcom/c/b/ak$a;

.field private static b:Lcom/c/b/as$g;

.field private static c:Lcom/c/b/ak$a;

.field private static d:Lcom/c/b/as$g;

.field private static e:Lcom/c/b/ak$a;

.field private static f:Lcom/c/b/as$g;

.field private static g:Lcom/c/b/ak$g;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 2358
    new-array v0, v6, [Ljava/lang/String;

    const-string v1, "\n\u0010ab_service.proto\u0012\u0013mobile.abtesting.v1\u001a\u0012common_model.proto\u001a\u0019protobuf_validation.proto\"i\n\nExperiment\u0012\u0019\n\u0004name\u0018\u0001 \u0001(\tB\u000b\u00ca\u009d%\u0007\u0008\u0001(\u00010\u00ff\u0001\u0012\u001c\n\u0007variant\u0018\u0002 \u0001(\tB\u000b\u00ca\u009d%\u0007\u0008\u0001(\u00010\u00ff\u0001\u0012\"\n\rexperiment_id\u0018\u0003 \u0001(\tB\u000b\u00ca\u009d%\u0007\u0008\u0000(\u00000\u00ff\u0001\"C\n\u0015GetExperimentsRequest\u0012*\n\u0003jid\u0018\u0001 \u0001(\u000b2\u0015.common.XiBareUserJidB\u0006\u00ca\u009d%\u0002\u0008\u0001\"\u007f\n\u0016GetExperimentsResponse\u0012B\n\u0019participating_experiments\u0018\u0001 \u0003(\u000b2\u001f.mobile.abtesting.v1.Experiment\u0012!\n\u0019should_send_metrics_event\u0018\u0002 \u0001(\u00082\u0085\u0001\n\tAbTe"

    aput-object v1, v0, v4

    const-string v1, "sting\u0012x\n\u001bGetParticipatingExperiments\u0012*.mobile.abtesting.v1.GetExperimentsRequest\u001a+.mobile.abtesting.v1.GetExperimentsResponse\"\u0000B\u0017\n\u0015com.kik.abtesting.rpcb\u0006proto3"

    aput-object v1, v0, v5

    .line 2374
    new-instance v1, Lcom/kik/a/a/b;

    invoke-direct {v1}, Lcom/kik/a/a/b;-><init>()V

    .line 2382
    new-array v2, v6, [Lcom/c/b/ak$g;

    invoke-static {}, Lcom/kik/o/a;->a()Lcom/c/b/ak$g;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {}, Lcom/kik/k/a;->a()Lcom/c/b/ak$g;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-static {v0, v2, v1}, Lcom/c/b/ak$g;->a([Ljava/lang/String;[Lcom/c/b/ak$g;Lcom/c/b/ak$g$a;)V

    .line 2388
    sget-object v0, Lcom/kik/a/a/a;->g:Lcom/c/b/ak$g;

    invoke-virtual {v0}, Lcom/c/b/ak$g;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$a;

    sput-object v0, Lcom/kik/a/a/a;->a:Lcom/c/b/ak$a;

    .line 2390
    new-instance v0, Lcom/c/b/as$g;

    sget-object v1, Lcom/kik/a/a/a;->a:Lcom/c/b/ak$a;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "Name"

    aput-object v3, v2, v4

    const-string v3, "Variant"

    aput-object v3, v2, v5

    const-string v3, "ExperimentId"

    aput-object v3, v2, v6

    invoke-direct {v0, v1, v2}, Lcom/c/b/as$g;-><init>(Lcom/c/b/ak$a;[Ljava/lang/String;)V

    sput-object v0, Lcom/kik/a/a/a;->b:Lcom/c/b/as$g;

    .line 2394
    sget-object v0, Lcom/kik/a/a/a;->g:Lcom/c/b/ak$g;

    invoke-virtual {v0}, Lcom/c/b/ak$g;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$a;

    sput-object v0, Lcom/kik/a/a/a;->c:Lcom/c/b/ak$a;

    .line 2396
    new-instance v0, Lcom/c/b/as$g;

    sget-object v1, Lcom/kik/a/a/a;->c:Lcom/c/b/ak$a;

    new-array v2, v5, [Ljava/lang/String;

    const-string v3, "Jid"

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lcom/c/b/as$g;-><init>(Lcom/c/b/ak$a;[Ljava/lang/String;)V

    sput-object v0, Lcom/kik/a/a/a;->d:Lcom/c/b/as$g;

    .line 2400
    sget-object v0, Lcom/kik/a/a/a;->g:Lcom/c/b/ak$g;

    invoke-virtual {v0}, Lcom/c/b/ak$g;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$a;

    sput-object v0, Lcom/kik/a/a/a;->e:Lcom/c/b/ak$a;

    .line 2402
    new-instance v0, Lcom/c/b/as$g;

    sget-object v1, Lcom/kik/a/a/a;->e:Lcom/c/b/ak$a;

    new-array v2, v6, [Ljava/lang/String;

    const-string v3, "ParticipatingExperiments"

    aput-object v3, v2, v4

    const-string v3, "ShouldSendMetricsEvent"

    aput-object v3, v2, v5

    invoke-direct {v0, v1, v2}, Lcom/c/b/as$g;-><init>(Lcom/c/b/ak$a;[Ljava/lang/String;)V

    sput-object v0, Lcom/kik/a/a/a;->f:Lcom/c/b/as$g;

    .line 2406
    invoke-static {}, Lcom/c/b/ap;->a()Lcom/c/b/ap;

    move-result-object v0

    .line 2408
    sget-object v1, Lcom/kik/k/a;->a:Lcom/c/b/as$h;

    invoke-virtual {v0, v1}, Lcom/c/b/ap;->a(Lcom/c/b/an;)V

    .line 2409
    sget-object v1, Lcom/kik/a/a/a;->g:Lcom/c/b/ak$g;

    invoke-static {v1, v0}, Lcom/c/b/ak$g;->a(Lcom/c/b/ak$g;Lcom/c/b/ap;)V

    .line 2411
    invoke-static {}, Lcom/kik/o/a;->a()Lcom/c/b/ak$g;

    .line 2412
    invoke-static {}, Lcom/kik/k/a;->a()Lcom/c/b/ak$g;

    .line 2413
    return-void
.end method

.method static synthetic a()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 6
    sget-object v0, Lcom/kik/a/a/a;->a:Lcom/c/b/ak$a;

    return-object v0
.end method

.method static synthetic a(Lcom/c/b/ak$g;)Lcom/c/b/ak$g;
    .locals 0

    .prologue
    .line 6
    sput-object p0, Lcom/kik/a/a/a;->g:Lcom/c/b/ak$g;

    return-object p0
.end method

.method static synthetic b()Lcom/c/b/as$g;
    .locals 1

    .prologue
    .line 6
    sget-object v0, Lcom/kik/a/a/a;->b:Lcom/c/b/as$g;

    return-object v0
.end method

.method static synthetic c()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 6
    sget-object v0, Lcom/kik/a/a/a;->c:Lcom/c/b/ak$a;

    return-object v0
.end method

.method static synthetic d()Lcom/c/b/as$g;
    .locals 1

    .prologue
    .line 6
    sget-object v0, Lcom/kik/a/a/a;->d:Lcom/c/b/as$g;

    return-object v0
.end method

.method static synthetic e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 6
    sget-object v0, Lcom/kik/a/a/a;->e:Lcom/c/b/ak$a;

    return-object v0
.end method

.method static synthetic f()Lcom/c/b/as$g;
    .locals 1

    .prologue
    .line 6
    sget-object v0, Lcom/kik/a/a/a;->f:Lcom/c/b/as$g;

    return-object v0
.end method
