.class final Lcom/kik/android/c/r;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/p;

.field final synthetic b:Lcom/kik/android/c/l;


# direct methods
.method constructor <init>(Lcom/kik/android/c/l;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 278
    iput-object p1, p0, Lcom/kik/android/c/r;->b:Lcom/kik/android/c/l;

    iput-object p2, p0, Lcom/kik/android/c/r;->a:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 278
    check-cast p1, Ljava/util/Map;

    iget-object v0, p0, Lcom/kik/android/c/r;->b:Lcom/kik/android/c/l;

    invoke-static {v0}, Lcom/kik/android/c/l;->a(Lcom/kik/android/c/l;)Lcom/kik/android/c/d;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0, v1}, Lcom/kik/android/c/d;->a(Ljava/util/List;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 289
    iget-object v0, p0, Lcom/kik/android/c/r;->a:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 290
    return-void
.end method
