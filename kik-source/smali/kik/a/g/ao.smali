.class final Lkik/a/g/ao;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/g/v;


# direct methods
.method constructor <init>(Lkik/a/g/v;)V
    .locals 0

    .prologue
    .line 546
    iput-object p1, p0, Lkik/a/g/ao;->a:Lkik/a/g/v;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 9

    .prologue
    .line 546
    check-cast p1, Lkik/a/f/f/ak;

    iget-object v1, p0, Lkik/a/g/ao;->a:Lkik/a/g/v;

    invoke-virtual {p1}, Lkik/a/f/f/ak;->d()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p1}, Lkik/a/f/f/ak;->f()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p1}, Lkik/a/f/f/ak;->e()Ljava/util/List;

    move-result-object v4

    invoke-virtual {p1}, Lkik/a/f/f/ak;->g()Ljava/util/List;

    move-result-object v5

    invoke-virtual {p1}, Lkik/a/f/f/ak;->o()J

    move-result-wide v6

    invoke-virtual {p1}, Lkik/a/f/f/ak;->n()Z

    move-result v8

    invoke-static/range {v1 .. v8}, Lkik/a/g/v;->a(Lkik/a/g/v;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;JZ)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 556
    instance-of v0, p1, Lkik/a/f/q;

    if-eqz v0, :cond_0

    .line 557
    check-cast p1, Lkik/a/f/q;

    .line 558
    invoke-virtual {p1}, Lkik/a/f/q;->a()I

    move-result v0

    const/16 v1, 0x6d

    if-eq v0, v1, :cond_0

    .line 559
    iget-object v0, p0, Lkik/a/g/ao;->a:Lkik/a/g/v;

    invoke-static {v0}, Lkik/a/g/v;->f(Lkik/a/g/v;)Lcom/kik/g/k;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 562
    :cond_0
    return-void
.end method
