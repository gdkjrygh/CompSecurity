.class final Lkik/a/g/ap;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/g/v;


# direct methods
.method constructor <init>(Lkik/a/g/v;)V
    .locals 0

    .prologue
    .line 712
    iput-object p1, p0, Lkik/a/g/ap;->a:Lkik/a/g/v;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 5

    .prologue
    .line 712
    check-cast p1, Lkik/a/f/f/g;

    invoke-virtual {p1}, Lkik/a/f/f/g;->d()Lkik/a/d/k;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkik/a/g/ap;->a:Lkik/a/g/v;

    const/4 v3, 0x0

    new-instance v4, Lkik/a/g/aq;

    invoke-direct {v4, p0, v0}, Lkik/a/g/aq;-><init>(Lkik/a/g/ap;Lkik/a/d/k;)V

    invoke-virtual {v2, v1, v3, v4}, Lkik/a/g/v;->a(Ljava/lang/String;ZLkik/a/e/r$a;)Lkik/a/d/k;

    :cond_0
    return-void
.end method
