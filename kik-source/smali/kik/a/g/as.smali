.class final Lkik/a/g/as;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/g/v;


# direct methods
.method constructor <init>(Lkik/a/g/v;)V
    .locals 0

    .prologue
    .line 749
    iput-object p1, p0, Lkik/a/g/as;->a:Lkik/a/g/v;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 6

    .prologue
    .line 749
    check-cast p1, Lkik/a/f/f/f;

    invoke-virtual {p1}, Lkik/a/f/f/f;->d()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lkik/a/g/as;->a:Lkik/a/g/v;

    const/4 v4, 0x0

    new-instance v5, Lkik/a/g/at;

    invoke-direct {v5, p0, v0}, Lkik/a/g/at;-><init>(Lkik/a/g/as;Lkik/a/d/k;)V

    invoke-virtual {v3, v2, v4, v5}, Lkik/a/g/v;->a(Ljava/lang/String;ZLkik/a/e/r$a;)Lkik/a/d/k;

    goto :goto_0

    :cond_1
    return-void
.end method
