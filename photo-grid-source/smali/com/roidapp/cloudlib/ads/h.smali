.class public final Lcom/roidapp/cloudlib/ads/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/cmcm/a/a/d;


# instance fields
.field private a:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Lcom/cmcm/a/a/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/ads/h;->a:Ljava/util/LinkedList;

    .line 17
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 33
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/h;->a:Ljava/util/LinkedList;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/h;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 34
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/h;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/a/a/d;

    .line 35
    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/cmcm/a/a/d;->a()V

    goto :goto_0

    .line 37
    :cond_1
    return-void
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 41
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/h;->a:Ljava/util/LinkedList;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/h;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 42
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/h;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/a/a/d;

    .line 43
    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/cmcm/a/a/d;->a(I)V

    goto :goto_0

    .line 45
    :cond_1
    return-void
.end method

.method public final a(Lcom/cmcm/a/a/a;)V
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/h;->a:Ljava/util/LinkedList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/h;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 51
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/h;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/a/a/d;

    .line 52
    if-eqz v0, :cond_0

    .line 53
    invoke-interface {v0, p1}, Lcom/cmcm/a/a/d;->a(Lcom/cmcm/a/a/a;)V

    .line 55
    :cond_0
    return-void
.end method

.method public final a(Lcom/cmcm/a/a/d;)V
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/h;->a:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 21
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/h;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 29
    return-void
.end method

.method public final b(Lcom/cmcm/a/a/d;)V
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/h;->a:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 25
    return-void
.end method
