.class Lcom/google/common/a/jt;
.super Lcom/google/common/a/ej;
.source "RegularImmutableBiMap.java"


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/ej",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field final transient a:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field final transient b:Lcom/google/common/a/ej;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ej",
            "<TV;TK;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/common/a/ev;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/ev",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/google/common/a/ej;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/google/common/a/jt;->a:Lcom/google/common/a/ev;

    .line 35
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v1

    .line 36
    invoke-virtual {p1}, Lcom/google/common/a/ev;->a()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 37
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v3, v0}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v1}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    .line 40
    new-instance v1, Lcom/google/common/a/jt;

    invoke-direct {v1, v0, p0}, Lcom/google/common/a/jt;-><init>(Lcom/google/common/a/ev;Lcom/google/common/a/ej;)V

    iput-object v1, p0, Lcom/google/common/a/jt;->b:Lcom/google/common/a/ej;

    .line 41
    return-void
.end method

.method constructor <init>(Lcom/google/common/a/ev;Lcom/google/common/a/ej;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/ev",
            "<TK;TV;>;",
            "Lcom/google/common/a/ej",
            "<TV;TK;>;)V"
        }
    .end annotation

    .prologue
    .line 44
    invoke-direct {p0}, Lcom/google/common/a/ej;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/google/common/a/jt;->a:Lcom/google/common/a/ev;

    .line 46
    iput-object p2, p0, Lcom/google/common/a/jt;->b:Lcom/google/common/a/ej;

    .line 47
    return-void
.end method


# virtual methods
.method public synthetic b()Lcom/google/common/a/av;
    .locals 1

    .prologue
    .line 26
    invoke-virtual {p0}, Lcom/google/common/a/jt;->h()Lcom/google/common/a/ej;

    move-result-object v0

    return-object v0
.end method

.method d()Z
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/google/common/a/jt;->a:Lcom/google/common/a/ev;

    invoke-virtual {v0}, Lcom/google/common/a/ev;->d()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/common/a/jt;->b:Lcom/google/common/a/ej;

    invoke-virtual {v0}, Lcom/google/common/a/ej;->g()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ev;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method g()Lcom/google/common/a/ev;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ev",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 50
    iget-object v0, p0, Lcom/google/common/a/jt;->a:Lcom/google/common/a/ev;

    return-object v0
.end method

.method public h()Lcom/google/common/a/ej;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ej",
            "<TV;TK;>;"
        }
    .end annotation

    .prologue
    .line 54
    iget-object v0, p0, Lcom/google/common/a/jt;->b:Lcom/google/common/a/ej;

    return-object v0
.end method
