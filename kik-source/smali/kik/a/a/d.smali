.class final Lkik/a/a/d;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/a/c;


# direct methods
.method constructor <init>(Lkik/a/a/c;)V
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lkik/a/a/d;->a:Lkik/a/a/c;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lkik/a/a/d;->a:Lkik/a/a/c;

    invoke-static {v0}, Lkik/a/a/c;->a(Lkik/a/a/c;)Lkik/a/a/l;

    move-result-object v0

    invoke-interface {v0}, Lkik/a/a/l;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/a/a/d;->a:Lkik/a/a/c;

    invoke-static {v0}, Lkik/a/a/c;->b(Lkik/a/a/c;)V

    :cond_0
    return-void
.end method
