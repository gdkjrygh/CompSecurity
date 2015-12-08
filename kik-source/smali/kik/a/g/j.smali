.class final Lkik/a/g/j;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/g/b;


# direct methods
.method constructor <init>(Lkik/a/g/b;)V
    .locals 0

    .prologue
    .line 622
    iput-object p1, p0, Lkik/a/g/j;->a:Lkik/a/g/b;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 622
    iget-object v0, p0, Lkik/a/g/j;->a:Lkik/a/g/b;

    invoke-static {v0}, Lkik/a/g/b;->b(Lkik/a/g/b;)Lkik/a/e/r;

    move-result-object v0

    invoke-interface {v0}, Lkik/a/e/r;->j()V

    return-void
.end method
