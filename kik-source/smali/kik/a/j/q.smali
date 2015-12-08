.class final Lkik/a/j/q;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/e/x;

.field final synthetic b:[B

.field final synthetic c:[B

.field final synthetic d:Lkik/a/j/o;


# direct methods
.method constructor <init>(Lkik/a/j/o;Lkik/a/e/x;[B[B)V
    .locals 0

    .prologue
    .line 112
    iput-object p1, p0, Lkik/a/j/q;->d:Lkik/a/j/o;

    iput-object p2, p0, Lkik/a/j/q;->a:Lkik/a/e/x;

    iput-object p3, p0, Lkik/a/j/q;->b:[B

    iput-object p4, p0, Lkik/a/j/q;->c:[B

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 112
    check-cast p1, Ljava/util/List;

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Object;)Lcom/kik/g/p;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v3, "enc_"

    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lkik/a/j/q;->a:Lkik/a/e/x;

    invoke-interface {v3, v0}, Lkik/a/e/x;->a(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v3, Lkik/a/j/r;

    invoke-direct {v3, p0}, Lkik/a/j/r;-><init>(Lkik/a/j/q;)V

    invoke-virtual {v0, v3}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    invoke-static {v1, v0}, Lcom/kik/g/s;->a(Lcom/kik/g/p;Lcom/kik/g/p;)Lcom/kik/g/aq;

    move-result-object v0

    :goto_1
    move-object v1, v0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    move-object v0, v1

    goto :goto_1
.end method
