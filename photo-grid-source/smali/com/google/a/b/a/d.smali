.class final Lcom/google/a/b/a/d;
.super Lcom/google/a/am;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/a/am",
        "<",
        "Ljava/util/Collection",
        "<TE;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/a/b/a/c;

.field private final b:Lcom/google/a/am;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/a/am",
            "<TE;>;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/a/b/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/a/b/s",
            "<+",
            "Ljava/util/Collection",
            "<TE;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/a/b/a/c;Lcom/google/a/k;Ljava/lang/reflect/Type;Lcom/google/a/am;Lcom/google/a/b/s;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/a/k;",
            "Ljava/lang/reflect/Type;",
            "Lcom/google/a/am",
            "<TE;>;",
            "Lcom/google/a/b/s",
            "<+",
            "Ljava/util/Collection",
            "<TE;>;>;)V"
        }
    .end annotation

    .prologue
    .line 66
    iput-object p1, p0, Lcom/google/a/b/a/d;->a:Lcom/google/a/b/a/c;

    invoke-direct {p0}, Lcom/google/a/am;-><init>()V

    .line 67
    new-instance v0, Lcom/google/a/b/a/x;

    invoke-direct {v0, p2, p4, p3}, Lcom/google/a/b/a/x;-><init>(Lcom/google/a/k;Lcom/google/a/am;Ljava/lang/reflect/Type;)V

    iput-object v0, p0, Lcom/google/a/b/a/d;->b:Lcom/google/a/am;

    .line 69
    iput-object p5, p0, Lcom/google/a/b/a/d;->c:Lcom/google/a/b/s;

    .line 70
    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/google/a/d/a;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 60
    .line 1073
    invoke-virtual {p1}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    move-result-object v0

    sget-object v1, Lcom/google/a/d/e;->i:Lcom/google/a/d/e;

    if-ne v0, v1, :cond_0

    .line 1074
    invoke-virtual {p1}, Lcom/google/a/d/a;->j()V

    .line 1075
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 1078
    :cond_0
    iget-object v0, p0, Lcom/google/a/b/a/d;->c:Lcom/google/a/b/s;

    invoke-interface {v0}, Lcom/google/a/b/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 1079
    invoke-virtual {p1}, Lcom/google/a/d/a;->a()V

    .line 1080
    :goto_1
    invoke-virtual {p1}, Lcom/google/a/d/a;->e()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1081
    iget-object v1, p0, Lcom/google/a/b/a/d;->b:Lcom/google/a/am;

    invoke-virtual {v1, p1}, Lcom/google/a/am;->a(Lcom/google/a/d/a;)Ljava/lang/Object;

    move-result-object v1

    .line 1082
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1084
    :cond_1
    invoke-virtual {p1}, Lcom/google/a/d/a;->b()V

    goto :goto_0
.end method

.method public final synthetic a(Lcom/google/a/d/f;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 60
    check-cast p2, Ljava/util/Collection;

    .line 1089
    if-nez p2, :cond_0

    .line 1090
    invoke-virtual {p1}, Lcom/google/a/d/f;->f()Lcom/google/a/d/f;

    .line 1091
    :goto_0
    return-void

    .line 1094
    :cond_0
    invoke-virtual {p1}, Lcom/google/a/d/f;->b()Lcom/google/a/d/f;

    .line 1095
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 1096
    iget-object v2, p0, Lcom/google/a/b/a/d;->b:Lcom/google/a/am;

    invoke-virtual {v2, p1, v1}, Lcom/google/a/am;->a(Lcom/google/a/d/f;Ljava/lang/Object;)V

    goto :goto_1

    .line 1098
    :cond_1
    invoke-virtual {p1}, Lcom/google/a/d/f;->c()Lcom/google/a/d/f;

    goto :goto_0
.end method
