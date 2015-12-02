.class Lcom/google/common/a/ae;
.super Ljava/lang/Object;
.source "AbstractMultimap.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator",
        "<",
        "Ljava/util/Map$Entry",
        "<TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final a:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;",
            "Ljava/util/Collection",
            "<TV;>;>;>;"
        }
    .end annotation
.end field

.field b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field c:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<TV;>;"
        }
    .end annotation
.end field

.field d:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator",
            "<TV;>;"
        }
    .end annotation
.end field

.field final synthetic e:Lcom/google/common/a/x;


# direct methods
.method constructor <init>(Lcom/google/common/a/x;)V
    .locals 1

    .prologue
    .line 1114
    iput-object p1, p0, Lcom/google/common/a/ae;->e:Lcom/google/common/a/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1115
    invoke-static {p1}, Lcom/google/common/a/x;->a(Lcom/google/common/a/x;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/ae;->a:Ljava/util/Iterator;

    .line 1116
    iget-object v0, p0, Lcom/google/common/a/ae;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1117
    invoke-virtual {p0}, Lcom/google/common/a/ae;->a()V

    .line 1121
    :goto_0
    return-void

    .line 1119
    :cond_0
    invoke-static {}, Lcom/google/common/a/gg;->b()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/ae;->d:Ljava/util/Iterator;

    goto :goto_0
.end method


# virtual methods
.method a()V
    .locals 2

    .prologue
    .line 1124
    iget-object v0, p0, Lcom/google/common/a/ae;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 1125
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lcom/google/common/a/ae;->b:Ljava/lang/Object;

    .line 1126
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    iput-object v0, p0, Lcom/google/common/a/ae;->c:Ljava/util/Collection;

    .line 1127
    iget-object v0, p0, Lcom/google/common/a/ae;->c:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/ae;->d:Ljava/util/Iterator;

    .line 1128
    return-void
.end method

.method public b()Ljava/util/Map$Entry;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 1137
    iget-object v0, p0, Lcom/google/common/a/ae;->d:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1138
    invoke-virtual {p0}, Lcom/google/common/a/ae;->a()V

    .line 1140
    :cond_0
    iget-object v0, p0, Lcom/google/common/a/ae;->b:Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/common/a/ae;->d:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/a/ik;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public hasNext()Z
    .locals 1

    .prologue
    .line 1132
    iget-object v0, p0, Lcom/google/common/a/ae;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/common/a/ae;->d:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

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

.method public synthetic next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1108
    invoke-virtual {p0}, Lcom/google/common/a/ae;->b()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    .prologue
    .line 1145
    iget-object v0, p0, Lcom/google/common/a/ae;->d:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 1146
    iget-object v0, p0, Lcom/google/common/a/ae;->c:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1147
    iget-object v0, p0, Lcom/google/common/a/ae;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 1149
    :cond_0
    iget-object v0, p0, Lcom/google/common/a/ae;->e:Lcom/google/common/a/x;

    invoke-static {v0}, Lcom/google/common/a/x;->b(Lcom/google/common/a/x;)I

    .line 1150
    return-void
.end method
