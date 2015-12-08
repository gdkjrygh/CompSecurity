.class final Lcom/c/b/bc$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/bc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/c/b/bi;

.field private final b:Ljava/util/Iterator;


# direct methods
.method constructor <init>(Lcom/c/b/bi;Ljava/util/Iterator;)V
    .locals 0

    .prologue
    .line 510
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 511
    iput-object p1, p0, Lcom/c/b/bc$b;->a:Lcom/c/b/bi;

    .line 512
    iput-object p2, p0, Lcom/c/b/bc$b;->b:Ljava/util/Iterator;

    .line 513
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 533
    iget-object v0, p0, Lcom/c/b/bc$b;->b:Ljava/util/Iterator;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasNext()Z
    .locals 1

    .prologue
    .line 517
    iget-object v0, p0, Lcom/c/b/bc$b;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 538
    iget-object v0, p0, Lcom/c/b/bc$b;->b:Ljava/util/Iterator;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 522
    iget-object v0, p0, Lcom/c/b/bc$b;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 1

    .prologue
    .line 527
    iget-object v0, p0, Lcom/c/b/bc$b;->a:Lcom/c/b/bi;

    invoke-interface {v0}, Lcom/c/b/bi;->d()V

    .line 528
    iget-object v0, p0, Lcom/c/b/bc$b;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 529
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 543
    iget-object v0, p0, Lcom/c/b/bc$b;->b:Ljava/util/Iterator;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
