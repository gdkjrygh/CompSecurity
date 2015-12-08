.class public final Lcom/kik/g/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/g/e$a;
    }
.end annotation


# instance fields
.field protected final a:Ljava/util/List;

.field protected b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/kik/g/e;->a:Ljava/util/List;

    .line 27
    iput-object p1, p0, Lcom/kik/g/e;->b:Ljava/lang/Object;

    .line 28
    return-void
.end method


# virtual methods
.method final a(Lcom/kik/g/i;)Lcom/kik/g/e$a;
    .locals 2

    .prologue
    .line 38
    new-instance v0, Lcom/kik/g/e$a;

    invoke-direct {v0, p0, p1}, Lcom/kik/g/e$a;-><init>(Lcom/kik/g/e;Lcom/kik/g/i;)V

    .line 40
    iget-object v1, p0, Lcom/kik/g/e;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    return-object v0
.end method

.method final a(Lcom/kik/g/e$a;)V
    .locals 2

    .prologue
    .line 52
    iget-object v0, p0, Lcom/kik/g/e;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/g/e$a;

    .line 53
    if-ne p1, v0, :cond_0

    .line 54
    iget-object v1, p0, Lcom/kik/g/e;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 58
    :cond_1
    return-void
.end method
