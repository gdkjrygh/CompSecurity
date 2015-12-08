.class final Lkik/a/g/at;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/e/r$a;


# instance fields
.field final synthetic a:Lkik/a/d/k;

.field final synthetic b:Lkik/a/g/as;


# direct methods
.method constructor <init>(Lkik/a/g/as;Lkik/a/d/k;)V
    .locals 0

    .prologue
    .line 760
    iput-object p1, p0, Lkik/a/g/at;->b:Lkik/a/g/as;

    iput-object p2, p0, Lkik/a/g/at;->a:Lkik/a/d/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lkik/a/d/k;)V
    .locals 1

    .prologue
    .line 765
    iget-object v0, p0, Lkik/a/g/at;->a:Lkik/a/d/k;

    invoke-virtual {v0, p1}, Lkik/a/d/k;->b(Lkik/a/d/k;)V

    .line 766
    iget-object v0, p0, Lkik/a/g/at;->a:Lkik/a/d/k;

    invoke-virtual {p1, v0}, Lkik/a/d/k;->c(Lkik/a/d/k;)V

    .line 767
    return-void
.end method
