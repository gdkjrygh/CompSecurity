.class final Lkik/android/util/cl;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/util/ck;


# direct methods
.method constructor <init>(Lkik/android/util/ck;)V
    .locals 0

    .prologue
    .line 127
    iput-object p1, p0, Lkik/android/util/cl;->a:Lkik/android/util/ck;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    .prologue
    .line 127
    check-cast p2, Ljava/lang/String;

    invoke-static {}, Lkik/android/util/ck$b;->values()[Lkik/android/util/ck$b;

    move-result-object v2

    array-length v3, v2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_1

    aget-object v0, v2, v1

    iget-object v4, p0, Lkik/android/util/cl;->a:Lkik/android/util/ck;

    invoke-static {v4}, Lkik/android/util/ck;->a(Lkik/android/util/ck;)Ljava/util/EnumMap;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/util/ck$a;

    new-instance v4, Ljava/util/ArrayList;

    iget-object v0, v0, Lkik/android/util/ck$a;->a:Ljava/util/ArrayList;

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/util/cl;->a:Lkik/android/util/ck;

    invoke-static {v0}, Lkik/android/util/ck;->b(Lkik/android/util/ck;)Lcom/kik/g/k;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    :cond_1
    return-void

    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method
