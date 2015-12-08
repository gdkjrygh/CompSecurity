.class final Lkik/a/g/c;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/g/b;


# direct methods
.method constructor <init>(Lkik/a/g/b;)V
    .locals 0

    .prologue
    .line 119
    iput-object p1, p0, Lkik/a/g/c;->a:Lkik/a/g/b;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 119
    check-cast p2, Lkik/a/d/k;

    if-eqz p2, :cond_0

    instance-of v0, p2, Lkik/a/d/n;

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lkik/a/g/c;->a:Lkik/a/g/b;

    invoke-virtual {v0, p2}, Lkik/a/g/b;->a(Lkik/a/d/k;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v2, p0, Lkik/a/g/c;->a:Lkik/a/g/b;

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3}, Lkik/a/g/b;->a(Ljava/lang/String;Z)Lkik/a/d/n;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v2, p0, Lkik/a/g/c;->a:Lkik/a/g/b;

    invoke-static {v2}, Lkik/a/g/b;->a(Lkik/a/g/b;)Lkik/a/e/v;

    move-result-object v2

    invoke-interface {v2, v0}, Lkik/a/e/v;->d(Lkik/a/d/k;)V

    goto :goto_0
.end method
