.class final Lkik/a/g/ab;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/g/v;


# direct methods
.method constructor <init>(Lkik/a/g/v;)V
    .locals 0

    .prologue
    .line 1198
    iput-object p1, p0, Lkik/a/g/ab;->a:Lkik/a/g/v;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 1198
    check-cast p1, Lkik/a/f/f/c;

    invoke-virtual {p1}, Lkik/a/f/f/c;->a()Lkik/a/d/j;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lkik/a/g/ab;->a:Lkik/a/g/v;

    const/4 v2, 0x0

    new-instance v3, Lkik/a/g/ac;

    invoke-direct {v3, p0}, Lkik/a/g/ac;-><init>(Lkik/a/g/ab;)V

    invoke-virtual {v1, v0, v2, v3}, Lkik/a/g/v;->a(Ljava/lang/String;ZLkik/a/e/r$a;)Lkik/a/d/k;

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 1216
    iget-object v0, p0, Lkik/a/g/ab;->a:Lkik/a/g/v;

    invoke-static {v0}, Lkik/a/g/v;->f(Lkik/a/g/v;)Lcom/kik/g/k;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1217
    return-void
.end method
