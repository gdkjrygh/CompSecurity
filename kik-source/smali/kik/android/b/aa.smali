.class final Lkik/android/b/aa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Z

.field final synthetic c:Lkik/android/b/s;


# direct methods
.method constructor <init>(Lkik/android/b/s;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 271
    iput-object p1, p0, Lkik/android/b/aa;->c:Lkik/android/b/s;

    iput-object p2, p0, Lkik/android/b/aa;->a:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/b/aa;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    .line 271
    check-cast p1, Lcom/kik/n/a/b/c;

    if-nez p1, :cond_0

    new-instance v0, Lcom/kik/n/a/b/c;

    invoke-direct {v0}, Lcom/kik/n/a/b/c;-><init>()V

    iget-object v1, p0, Lkik/android/b/aa;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/kik/n/a/b/c;->a(Ljava/lang/String;)Lcom/kik/n/a/b/c;

    move-result-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/kik/n/a/b/c;->b()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1, v0}, Lcom/kik/n/a/b/c;->a(Ljava/util/List;)Lcom/kik/n/a/b/c;

    :cond_1
    invoke-virtual {p1}, Lcom/kik/n/a/b/c;->b()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/n/a/b/i;

    if-eqz v0, :cond_2

    sget-object v3, Lcom/kik/n/a/b/i$a;->a:Lcom/kik/n/a/b/i$a;

    invoke-virtual {v0}, Lcom/kik/n/a/b/i;->c()Lcom/kik/n/a/b/i$a;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/kik/n/a/b/i$a;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    :goto_0
    if-nez v0, :cond_3

    new-instance v0, Lcom/kik/n/a/b/i;

    invoke-direct {v0}, Lcom/kik/n/a/b/i;-><init>()V

    sget-object v1, Lcom/kik/n/a/b/i$a;->a:Lcom/kik/n/a/b/i$a;

    invoke-virtual {v0, v1}, Lcom/kik/n/a/b/i;->a(Lcom/kik/n/a/b/i$a;)Lcom/kik/n/a/b/i;

    move-result-object v0

    invoke-virtual {p1}, Lcom/kik/n/a/b/c;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    iget-boolean v1, p0, Lkik/android/b/aa;->b:Z

    if-eqz v1, :cond_4

    sget-object v1, Lcom/kik/n/a/b/i$b;->b:Lcom/kik/n/a/b/i$b;

    :goto_1
    invoke-virtual {v0, v1}, Lcom/kik/n/a/b/i;->a(Lcom/kik/n/a/b/i$b;)Lcom/kik/n/a/b/i;

    return-object p1

    :cond_4
    sget-object v1, Lcom/kik/n/a/b/i$b;->c:Lcom/kik/n/a/b/i$b;

    goto :goto_1

    :cond_5
    move-object v0, v1

    goto :goto_0
.end method
