.class final Lkik/a/b/a/b;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/b/a/a;


# direct methods
.method constructor <init>(Lkik/a/b/a/a;)V
    .locals 0

    .prologue
    .line 492
    iput-object p1, p0, Lkik/a/b/a/b;->a:Lkik/a/b/a/a;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 492
    check-cast p2, Lkik/a/f/f/n;

    invoke-virtual {p2}, Lkik/a/f/f/n;->f()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/a/b/a/b;->a:Lkik/a/b/a/a;

    invoke-virtual {p2}, Lkik/a/f/f/n;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lkik/a/f/f/n;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lkik/a/b/a/a;->a(Lkik/a/b/a/a;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
