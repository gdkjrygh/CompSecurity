.class final Lkik/a/b/a/l;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/b/a/a;


# direct methods
.method constructor <init>(Lkik/a/b/a/a;)V
    .locals 0

    .prologue
    .line 503
    iput-object p1, p0, Lkik/a/b/a/l;->a:Lkik/a/b/a/a;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 503
    check-cast p2, Lkik/a/f/f/q;

    invoke-virtual {p2}, Lkik/a/f/f/q;->d()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lkik/a/b/a/l;->a:Lkik/a/b/a/a;

    invoke-virtual {v1, v0}, Lkik/a/b/a/a;->b(Ljava/lang/String;)V

    return-void
.end method
