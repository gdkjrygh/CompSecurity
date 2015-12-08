.class final Lkik/a/b/a/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/e/r$a;


# instance fields
.field final synthetic a:Lkik/a/d/a/c;

.field final synthetic b:Lkik/a/b/a/a;


# direct methods
.method constructor <init>(Lkik/a/b/a/a;Lkik/a/d/a/c;)V
    .locals 0

    .prologue
    .line 2382
    iput-object p1, p0, Lkik/a/b/a/k;->b:Lkik/a/b/a/a;

    iput-object p2, p0, Lkik/a/b/a/k;->a:Lkik/a/d/a/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lkik/a/d/k;)V
    .locals 1

    .prologue
    .line 2386
    iget-object v0, p0, Lkik/a/b/a/k;->a:Lkik/a/d/a/c;

    invoke-virtual {v0}, Lkik/a/d/a/c;->a()Z

    move-result v0

    invoke-virtual {p1, v0}, Lkik/a/d/k;->a(Z)V

    .line 2387
    return-void
.end method
