.class Lcom/facebook/messages/threads/ui/name/b;
.super Ljava/lang/Object;
.source "TextListWithMoreComputer.java"

# interfaces
.implements Lcom/google/common/a/jr;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/common/a/jr",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/common/a/jr;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/jr",
            "<TT;>;"
        }
    .end annotation
.end field

.field private b:I


# direct methods
.method private constructor <init>(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 240
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 241
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/gg;->g(Ljava/util/Iterator;)Lcom/google/common/a/jr;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/threads/ui/name/b;->a:Lcom/google/common/a/jr;

    .line 242
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    iput v0, p0, Lcom/facebook/messages/threads/ui/name/b;->b:I

    .line 243
    return-void
.end method

.method public static a(Ljava/util/Collection;)Lcom/facebook/messages/threads/ui/name/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection",
            "<TT;>;)",
            "Lcom/facebook/messages/threads/ui/name/b",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 237
    new-instance v0, Lcom/facebook/messages/threads/ui/name/b;

    invoke-direct {v0, p0}, Lcom/facebook/messages/threads/ui/name/b;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 247
    iget-object v0, p0, Lcom/facebook/messages/threads/ui/name/b;->a:Lcom/google/common/a/jr;

    invoke-interface {v0}, Lcom/google/common/a/jr;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 268
    iget v0, p0, Lcom/facebook/messages/threads/ui/name/b;->b:I

    return v0
.end method

.method public hasNext()Z
    .locals 1

    .prologue
    .line 252
    iget-object v0, p0, Lcom/facebook/messages/threads/ui/name/b;->a:Lcom/google/common/a/jr;

    invoke-interface {v0}, Lcom/google/common/a/jr;->hasNext()Z

    move-result v0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 257
    iget-object v0, p0, Lcom/facebook/messages/threads/ui/name/b;->a:Lcom/google/common/a/jr;

    invoke-interface {v0}, Lcom/google/common/a/jr;->next()Ljava/lang/Object;

    move-result-object v0

    .line 258
    iget v1, p0, Lcom/facebook/messages/threads/ui/name/b;->b:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/facebook/messages/threads/ui/name/b;->b:I

    .line 259
    return-object v0
.end method

.method public remove()V
    .locals 1

    .prologue
    .line 264
    iget-object v0, p0, Lcom/facebook/messages/threads/ui/name/b;->a:Lcom/google/common/a/jr;

    invoke-interface {v0}, Lcom/google/common/a/jr;->remove()V

    .line 265
    return-void
.end method
