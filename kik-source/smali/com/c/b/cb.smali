.class final Lcom/c/b/cb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field a:Ljava/util/Iterator;

.field final synthetic b:Lcom/c/b/bz;


# direct methods
.method constructor <init>(Lcom/c/b/bz;)V
    .locals 1

    .prologue
    .line 160
    iput-object p1, p0, Lcom/c/b/cb;->b:Lcom/c/b/bz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 161
    iget-object v0, p0, Lcom/c/b/cb;->b:Lcom/c/b/bz;

    invoke-static {v0}, Lcom/c/b/bz;->a(Lcom/c/b/bz;)Lcom/c/b/az;

    move-result-object v0

    invoke-interface {v0}, Lcom/c/b/az;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/cb;->a:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .prologue
    .line 165
    iget-object v0, p0, Lcom/c/b/cb;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 160
    iget-object v0, p0, Lcom/c/b/cb;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final remove()V
    .locals 1

    .prologue
    .line 175
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
