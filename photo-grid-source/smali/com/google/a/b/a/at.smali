.class final Lcom/google/a/b/a/at;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/a/an;


# instance fields
.field final synthetic a:Lcom/google/a/c/a;

.field final synthetic b:Lcom/google/a/am;


# direct methods
.method constructor <init>(Lcom/google/a/c/a;Lcom/google/a/am;)V
    .locals 0

    .prologue
    .line 760
    iput-object p1, p0, Lcom/google/a/b/a/at;->a:Lcom/google/a/c/a;

    iput-object p2, p0, Lcom/google/a/b/a/at;->b:Lcom/google/a/am;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/a/k;Lcom/google/a/c/a;)Lcom/google/a/am;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/a/k;",
            "Lcom/google/a/c/a",
            "<TT;>;)",
            "Lcom/google/a/am",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 763
    iget-object v0, p0, Lcom/google/a/b/a/at;->a:Lcom/google/a/c/a;

    invoke-virtual {p2, v0}, Lcom/google/a/c/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/a/b/a/at;->b:Lcom/google/a/am;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
