.class public final Lcom/roidapp/cloudlib/template/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Lcom/roidapp/cloudlib/template/TemplateInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>()V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/b;->a:Ljava/util/LinkedList;

    .line 21
    return-void
.end method

.method private c()Z
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b;->a:Ljava/util/LinkedList;

    if-nez v0, :cond_0

    .line 66
    const/4 v0, 0x1

    .line 68
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    goto :goto_0
.end method

.method private d()V
    .locals 8

    .prologue
    .line 81
    new-instance v1, Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 82
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/TemplateInfo;

    .line 83
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 84
    const-string v4, "id"

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    const-string v4, "version"

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->f()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    const-string v4, "url"

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->h()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    const-string v4, "downloadUrl"

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->g()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    const-string v4, "height"

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->l()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    const-string v4, "width"

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->k()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    const-string v4, "templateName"

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->i()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    const-string v4, "supportLayout"

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->m()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    const-string v4, "needFilter"

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->n()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    const-string v4, "needWeather"

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->p()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    const-string v4, "count"

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->j()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    const-string v4, "toCameraPreview"

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->o()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    const-string v4, "needLock"

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->q()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 99
    :cond_0
    const-string v0, "local"

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/template/j;->a(Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 100
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 44
    invoke-direct {p0}, Lcom/roidapp/cloudlib/template/b;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 45
    const/4 v0, 0x0

    .line 47
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    goto :goto_0
.end method

.method public final a(I)Lcom/roidapp/cloudlib/template/TemplateInfo;
    .locals 1

    .prologue
    .line 51
    invoke-direct {p0}, Lcom/roidapp/cloudlib/template/b;->c()Z

    move-result v0

    if-nez v0, :cond_0

    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 52
    :cond_0
    const/4 v0, 0x0

    .line 54
    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b;->a:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/TemplateInfo;

    goto :goto_0
.end method

.method public final a(Lcom/roidapp/cloudlib/template/TemplateInfo;)V
    .locals 1

    .prologue
    .line 30
    instance-of v0, p1, Lcom/roidapp/cloudlib/template/TemplateInfo;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b;->a:Ljava/util/LinkedList;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/template/b;->c(Lcom/roidapp/cloudlib/template/TemplateInfo;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 31
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b;->a:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    .line 32
    invoke-direct {p0}, Lcom/roidapp/cloudlib/template/b;->d()V

    .line 34
    :cond_0
    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/template/TemplateInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 24
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b;->a:Ljava/util/LinkedList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 25
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b;->a:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    .line 27
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b;->a:Ljava/util/LinkedList;

    if-eqz v0, :cond_0

    .line 73
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 75
    :cond_0
    return-void
.end method

.method public final b(Lcom/roidapp/cloudlib/template/TemplateInfo;)V
    .locals 1

    .prologue
    .line 37
    instance-of v0, p1, Lcom/roidapp/cloudlib/template/TemplateInfo;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b;->a:Ljava/util/LinkedList;

    if-eqz v0, :cond_0

    .line 38
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b;->a:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 39
    invoke-direct {p0}, Lcom/roidapp/cloudlib/template/b;->d()V

    .line 41
    :cond_0
    return-void
.end method

.method public final c(Lcom/roidapp/cloudlib/template/TemplateInfo;)Z
    .locals 1

    .prologue
    .line 58
    invoke-direct {p0}, Lcom/roidapp/cloudlib/template/b;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 59
    const/4 v0, 0x0

    .line 61
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b;->a:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->contains(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method
