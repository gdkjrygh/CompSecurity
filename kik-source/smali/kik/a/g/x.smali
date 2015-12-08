.class final Lkik/a/g/x;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/d/j;

.field final synthetic b:Lkik/a/g/v;


# direct methods
.method constructor <init>(Lkik/a/g/v;Lkik/a/d/j;)V
    .locals 0

    .prologue
    .line 1118
    iput-object p1, p0, Lkik/a/g/x;->b:Lkik/a/g/v;

    iput-object p2, p0, Lkik/a/g/x;->a:Lkik/a/d/j;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 1118
    check-cast p1, Lkik/a/f/f/a;

    iget-object v0, p0, Lkik/a/g/x;->b:Lkik/a/g/v;

    invoke-virtual {p1}, Lkik/a/f/f/a;->b()Lkik/a/d/j;

    move-result-object v1

    invoke-virtual {v1}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-instance v3, Lkik/a/g/y;

    invoke-direct {v3, p0, p1}, Lkik/a/g/y;-><init>(Lkik/a/g/x;Lkik/a/f/f/a;)V

    invoke-virtual {v0, v1, v2, v3}, Lkik/a/g/v;->a(Ljava/lang/String;ZLkik/a/e/r$a;)Lkik/a/d/k;

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 1142
    iget-object v0, p0, Lkik/a/g/x;->b:Lkik/a/g/v;

    invoke-static {v0}, Lkik/a/g/v;->f(Lkik/a/g/v;)Lcom/kik/g/k;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1144
    iget-object v0, p0, Lkik/a/g/x;->b:Lkik/a/g/v;

    invoke-static {v0}, Lkik/a/g/v;->i(Lkik/a/g/v;)Lcom/kik/g/k;

    move-result-object v0

    iget-object v1, p0, Lkik/a/g/x;->a:Lkik/a/d/j;

    invoke-virtual {v1}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1145
    return-void
.end method
