.class final Lcom/c/b/aw$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/aw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;)V
    .locals 0

    .prologue
    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 131
    iput-object p1, p0, Lcom/c/b/aw$b;->a:Ljava/util/Iterator;

    .line 132
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .prologue
    .line 136
    iget-object v0, p0, Lcom/c/b/aw$b;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final synthetic next()Ljava/lang/Object;
    .locals 3

    .prologue
    .line 127
    iget-object v0, p0, Lcom/c/b/aw$b;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Lcom/c/b/aw;

    if-eqz v1, :cond_0

    new-instance v1, Lcom/c/b/aw$a;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/c/b/aw$a;-><init>(Ljava/util/Map$Entry;B)V

    move-object v0, v1

    :cond_0
    return-object v0
.end method

.method public final remove()V
    .locals 1

    .prologue
    .line 151
    iget-object v0, p0, Lcom/c/b/aw$b;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 152
    return-void
.end method
