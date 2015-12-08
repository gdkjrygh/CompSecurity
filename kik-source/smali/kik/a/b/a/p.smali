.class final Lkik/a/b/a/p;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lkik/a/b/a/a;


# direct methods
.method constructor <init>(Lkik/a/b/a/a;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1507
    iput-object p1, p0, Lkik/a/b/a/p;->b:Lkik/a/b/a/a;

    iput-object p2, p0, Lkik/a/b/a/p;->a:Ljava/lang/String;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 2

    .prologue
    .line 1512
    iget-object v0, p0, Lkik/a/b/a/p;->b:Lkik/a/b/a/a;

    invoke-static {v0}, Lkik/a/b/a/a;->a(Lkik/a/b/a/a;)Lkik/a/e/v;

    move-result-object v0

    iget-object v1, p0, Lkik/a/b/a/p;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Lkik/a/e/v;->l(Ljava/lang/String;)Z

    .line 1513
    iget-object v0, p0, Lkik/a/b/a/p;->b:Lkik/a/b/a/a;

    iget-object v1, p0, Lkik/a/b/a/p;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lkik/a/b/a/a;->a(Lkik/a/b/a/a;Ljava/lang/String;)V

    .line 1514
    iget-object v0, p0, Lkik/a/b/a/p;->b:Lkik/a/b/a/a;

    invoke-static {v0}, Lkik/a/b/a/a;->c(Lkik/a/b/a/a;)V

    .line 1515
    return-void
.end method
