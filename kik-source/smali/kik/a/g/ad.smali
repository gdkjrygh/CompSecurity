.class final Lkik/a/g/ad;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/g/v;


# direct methods
.method constructor <init>(Lkik/a/g/v;)V
    .locals 0

    .prologue
    .line 1228
    iput-object p1, p0, Lkik/a/g/ad;->a:Lkik/a/g/v;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 1228
    check-cast p1, Lkik/a/f/f/am;

    invoke-virtual {p1}, Lkik/a/f/f/am;->d()Lkik/a/d/j;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lkik/a/g/ad;->a:Lkik/a/g/v;

    const/4 v2, 0x0

    new-instance v3, Lkik/a/g/ae;

    invoke-direct {v3, p0}, Lkik/a/g/ae;-><init>(Lkik/a/g/ad;)V

    invoke-virtual {v1, v0, v2, v3}, Lkik/a/g/v;->a(Ljava/lang/String;ZLkik/a/e/r$a;)Lkik/a/d/k;

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 1246
    iget-object v0, p0, Lkik/a/g/ad;->a:Lkik/a/g/v;

    invoke-static {v0}, Lkik/a/g/v;->f(Lkik/a/g/v;)Lcom/kik/g/k;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1247
    return-void
.end method
