.class public Lkik/a/f/c/a;
.super Lkik/a/f/c/c;
.source "SourceFile"


# instance fields
.field private j:Ljava/util/Vector;

.field private k:Lkik/a/d/s;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .prologue
    .line 24
    const/4 v0, 0x7

    invoke-direct {p0, v0}, Lkik/a/f/c/c;-><init>(I)V

    .line 20
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lkik/a/f/c/a;->j:Ljava/util/Vector;

    .line 25
    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 7

    .prologue
    .line 37
    invoke-super {p0}, Lkik/a/f/c/c;->a()V

    .line 38
    iget-object v0, p0, Lkik/a/f/c/a;->c:Lkik/a/d/j;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/a/f/c/a;->b:Lkik/a/d/j;

    if-eqz v0, :cond_1

    .line 39
    iget-object v0, p0, Lkik/a/f/c/a;->c:Lkik/a/d/j;

    invoke-virtual {v0}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lkik/a/f/c/a;->b:Lkik/a/d/j;

    invoke-virtual {v0}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lkik/a/f/c/a;->e:Ljava/lang/String;

    iget-wide v4, p0, Lkik/a/f/c/a;->f:J

    invoke-virtual {p0}, Lkik/a/f/c/a;->c()[B

    move-result-object v6

    invoke-static/range {v1 .. v6}, Lkik/a/d/s;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J[B)Lkik/a/d/s;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/c/a;->k:Lkik/a/d/s;

    .line 40
    iget-object v0, p0, Lkik/a/f/c/a;->k:Lkik/a/d/s;

    iget-boolean v1, p0, Lkik/a/f/c/a;->h:Z

    invoke-virtual {v0, v1}, Lkik/a/d/s;->a(Z)V

    .line 42
    invoke-virtual {p0}, Lkik/a/f/c/a;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 43
    iget-object v0, p0, Lkik/a/f/c/a;->k:Lkik/a/d/s;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/a/d/s;->b(Z)V

    .line 44
    iget-object v0, p0, Lkik/a/f/c/a;->k:Lkik/a/d/s;

    new-instance v1, Lkik/a/d/a/b;

    invoke-direct {v1}, Lkik/a/d/a/b;-><init>()V

    invoke-virtual {v0, v1}, Lkik/a/d/s;->a(Lkik/a/d/a/g;)V

    .line 56
    :cond_0
    iget-object v0, p0, Lkik/a/f/c/a;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 57
    iget-object v0, p0, Lkik/a/f/c/a;->k:Lkik/a/d/s;

    iget-object v1, p0, Lkik/a/f/c/a;->i:Ljava/util/List;

    invoke-virtual {v0, v1}, Lkik/a/d/s;->a(Ljava/util/List;)V

    .line 60
    :cond_1
    return-void

    .line 47
    :cond_2
    iget-object v0, p0, Lkik/a/f/c/a;->k:Lkik/a/d/s;

    invoke-virtual {p0}, Lkik/a/f/c/a;->e()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lkik/a/d/s;->a(J)V

    .line 49
    iget-object v0, p0, Lkik/a/f/c/a;->d:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 50
    iget-object v0, p0, Lkik/a/f/c/a;->k:Lkik/a/d/s;

    new-instance v1, Lkik/a/d/a/h;

    iget-object v2, p0, Lkik/a/f/c/a;->d:Ljava/lang/String;

    invoke-direct {v1, v2}, Lkik/a/d/a/h;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lkik/a/d/s;->a(Lkik/a/d/a/g;)V

    .line 52
    :cond_3
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lkik/a/f/c/a;->j:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 53
    iget-object v2, p0, Lkik/a/f/c/a;->k:Lkik/a/d/s;

    iget-object v0, p0, Lkik/a/f/c/a;->j:Ljava/util/Vector;

    invoke-virtual {v0, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/g;

    invoke-virtual {v2, v0}, Lkik/a/d/s;->a(Lkik/a/d/a/g;)V

    .line 52
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method protected final a(Lkik/a/f/n;)V
    .locals 3

    .prologue
    .line 65
    invoke-virtual {p1}, Lkik/a/f/n;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/a/f/e/h;->a(Ljava/lang/String;)Lkik/a/f/e/g;

    move-result-object v0

    .line 67
    const-string v1, "g"

    invoke-virtual {p1, v1}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 68
    const-string v1, "jid"

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkik/a/d/j;->a(Ljava/lang/String;)Lkik/a/d/j;

    move-result-object v1

    iput-object v1, p0, Lkik/a/f/c/a;->c:Lkik/a/d/j;

    .line 71
    :cond_0
    if-eqz v0, :cond_2

    .line 72
    invoke-interface {v0, p1}, Lkik/a/f/e/g;->a(Lkik/a/f/n;)Lkik/a/d/a/g;

    move-result-object v0

    .line 73
    if-eqz v0, :cond_1

    .line 74
    iget-object v1, p0, Lkik/a/f/c/a;->j:Ljava/util/Vector;

    invoke-virtual {v1, v0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 80
    :cond_1
    :goto_0
    return-void

    .line 78
    :cond_2
    invoke-super {p0, p1}, Lkik/a/f/c/c;->a(Lkik/a/f/n;)V

    goto :goto_0
.end method

.method public final b()Lkik/a/d/s;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lkik/a/f/c/a;->k:Lkik/a/d/s;

    return-object v0
.end method
