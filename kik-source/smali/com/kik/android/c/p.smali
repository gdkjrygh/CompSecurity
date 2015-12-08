.class final Lcom/kik/android/c/p;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/android/c/l;


# direct methods
.method constructor <init>(Lcom/kik/android/c/l;)V
    .locals 0

    .prologue
    .line 250
    iput-object p1, p0, Lcom/kik/android/c/p;->a:Lcom/kik/android/c/l;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 250
    check-cast p1, Ljava/util/Map;

    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/c/a;

    iget-object v2, p0, Lcom/kik/android/c/p;->a:Lcom/kik/android/c/l;

    invoke-static {v2}, Lcom/kik/android/c/l;->a(Lcom/kik/android/c/l;)Lcom/kik/android/c/d;

    move-result-object v2

    invoke-interface {v2, v0}, Lcom/kik/android/c/d;->a(Lcom/kik/android/c/a;)V

    goto :goto_0

    :cond_0
    return-void
.end method
