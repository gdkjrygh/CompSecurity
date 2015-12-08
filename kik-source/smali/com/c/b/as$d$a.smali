.class public final Lcom/c/b/as$d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/as$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/c/b/as$d;

.field private final b:Ljava/util/Iterator;

.field private c:Ljava/util/Map$Entry;

.field private final d:Z


# direct methods
.method private constructor <init>(Lcom/c/b/as$d;)V
    .locals 1

    .prologue
    .line 831
    iput-object p1, p0, Lcom/c/b/as$d$a;->a:Lcom/c/b/as$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 826
    iget-object v0, p0, Lcom/c/b/as$d$a;->a:Lcom/c/b/as$d;

    invoke-static {v0}, Lcom/c/b/as$d;->a(Lcom/c/b/as$d;)Lcom/c/b/ar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/ar;->g()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$d$a;->b:Ljava/util/Iterator;

    .line 832
    iget-object v0, p0, Lcom/c/b/as$d$a;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 833
    iget-object v0, p0, Lcom/c/b/as$d$a;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iput-object v0, p0, Lcom/c/b/as$d$a;->c:Ljava/util/Map$Entry;

    .line 835
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/c/b/as$d$a;->d:Z

    .line 836
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$d;B)V
    .locals 0

    .prologue
    .line 822
    invoke-direct {p0, p1}, Lcom/c/b/as$d$a;-><init>(Lcom/c/b/as$d;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/c/b/h;)V
    .locals 3

    .prologue
    .line 840
    :goto_0
    iget-object v0, p0, Lcom/c/b/as$d$a;->c:Ljava/util/Map$Entry;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/c/b/as$d$a;->c:Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$f;

    invoke-virtual {v0}, Lcom/c/b/ak$f;->e()I

    move-result v0

    const/high16 v1, 0x20000000

    if-ge v0, v1, :cond_3

    .line 841
    iget-object v0, p0, Lcom/c/b/as$d$a;->c:Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$f;

    .line 842
    iget-boolean v1, p0, Lcom/c/b/as$d$a;->d:Z

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/c/b/ak$f;->g()Lcom/c/b/cd$b;

    move-result-object v1

    sget-object v2, Lcom/c/b/cd$b;->i:Lcom/c/b/cd$b;

    if-ne v1, v2, :cond_1

    invoke-virtual {v0}, Lcom/c/b/ak$f;->o()Z

    move-result v1

    if-nez v1, :cond_1

    .line 845
    iget-object v1, p0, Lcom/c/b/as$d$a;->c:Ljava/util/Map$Entry;

    instance-of v1, v1, Lcom/c/b/aw$a;

    if-eqz v1, :cond_0

    .line 846
    invoke-virtual {v0}, Lcom/c/b/ak$f;->e()I

    move-result v1

    iget-object v0, p0, Lcom/c/b/as$d$a;->c:Ljava/util/Map$Entry;

    check-cast v0, Lcom/c/b/aw$a;

    invoke-virtual {v0}, Lcom/c/b/aw$a;->a()Lcom/c/b/aw;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/aw;->c()Lcom/c/b/f;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/c/b/h;->b(ILcom/c/b/f;)V

    .line 862
    :goto_1
    iget-object v0, p0, Lcom/c/b/as$d$a;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 863
    iget-object v0, p0, Lcom/c/b/as$d$a;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iput-object v0, p0, Lcom/c/b/as$d$a;->c:Ljava/util/Map$Entry;

    goto :goto_0

    .line 849
    :cond_0
    invoke-virtual {v0}, Lcom/c/b/ak$f;->e()I

    move-result v1

    iget-object v0, p0, Lcom/c/b/as$d$a;->c:Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/bd;

    invoke-virtual {p1, v1, v0}, Lcom/c/b/h;->c(ILcom/c/b/be;)V

    goto :goto_1

    .line 860
    :cond_1
    iget-object v1, p0, Lcom/c/b/as$d$a;->c:Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lcom/c/b/ar;->a(Lcom/c/b/ar$a;Ljava/lang/Object;Lcom/c/b/h;)V

    goto :goto_1

    .line 865
    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/as$d$a;->c:Ljava/util/Map$Entry;

    goto :goto_0

    .line 868
    :cond_3
    return-void
.end method
