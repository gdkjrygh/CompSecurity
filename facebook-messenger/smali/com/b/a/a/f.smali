.class public Lcom/b/a/a/f;
.super Ljava/lang/Object;
.source "StrictModeMultiSetter.java"

# interfaces
.implements Lcom/b/a/a/g;


# instance fields
.field private final mSetters:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/b/a/a/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/b/a/a/g;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/b/a/a/f;->mSetters:Ljava/util/List;

    .line 23
    return-void
.end method

.method public varargs constructor <init>([Lcom/b/a/a/g;)V
    .locals 1

    .prologue
    .line 18
    invoke-static {p1}, Lcom/b/a/a/f;->toList([Lcom/b/a/a/g;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/b/a/a/f;-><init>(Ljava/util/List;)V

    .line 19
    return-void
.end method

.method private static toList([Lcom/b/a/a/g;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/b/a/a/g;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/b/a/a/g;",
            ">;"
        }
    .end annotation

    .prologue
    .line 9
    new-instance v1, Ljava/util/ArrayList;

    array-length v0, p0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    array-length v2, p0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, p0, v0

    .line 11
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 13
    :cond_0
    return-object v1
.end method


# virtual methods
.method public set()V
    .locals 2

    .prologue
    .line 27
    iget-object v0, p0, Lcom/b/a/a/f;->mSetters:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/b/a/a/g;

    .line 28
    invoke-interface {v0}, Lcom/b/a/a/g;->set()V

    goto :goto_0

    .line 30
    :cond_0
    return-void
.end method
