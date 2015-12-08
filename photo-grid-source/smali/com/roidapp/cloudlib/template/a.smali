.class public final Lcom/roidapp/cloudlib/template/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/roidapp/cloudlib/template/TemplateInfo;


# instance fields
.field private b:Ljava/util/LinkedList;
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
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/a;->b:Ljava/util/LinkedList;

    .line 22
    return-void
.end method

.method public static a()V
    .locals 1

    .prologue
    .line 33
    sget-object v0, Lcom/roidapp/cloudlib/template/a;->a:Lcom/roidapp/cloudlib/template/TemplateInfo;

    if-eqz v0, :cond_0

    .line 34
    const/4 v0, 0x0

    sput-object v0, Lcom/roidapp/cloudlib/template/a;->a:Lcom/roidapp/cloudlib/template/TemplateInfo;

    .line 36
    :cond_0
    return-void
.end method

.method public static a(Lcom/roidapp/cloudlib/template/TemplateInfo;)V
    .locals 0

    .prologue
    .line 29
    sput-object p0, Lcom/roidapp/cloudlib/template/a;->a:Lcom/roidapp/cloudlib/template/TemplateInfo;

    .line 30
    return-void
.end method

.method public static d()Lcom/roidapp/cloudlib/template/TemplateInfo;
    .locals 1

    .prologue
    .line 61
    sget-object v0, Lcom/roidapp/cloudlib/template/a;->a:Lcom/roidapp/cloudlib/template/TemplateInfo;

    return-object v0
.end method

.method private h()V
    .locals 8

    .prologue
    .line 129
    new-instance v1, Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 130
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/TemplateInfo;

    .line 131
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 132
    const-string v4, "id"

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    const-string v4, "version"

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->f()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    const-string v4, "url"

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->h()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    const-string v4, "downloadUrl"

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->g()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    const-string v4, "height"

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->l()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    const-string v4, "width"

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->k()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    const-string v4, "templateName"

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->i()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    const-string v4, "supportLayout"

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->m()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    const-string v4, "needFilter"

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->n()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    const-string v4, "needWeather"

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->p()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    const-string v4, "count"

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->j()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    const-string v4, "toCameraPreview"

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->o()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    const-string v4, "needLock"

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->q()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 147
    :cond_0
    const-string v0, "favourite"

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/template/j;->a(Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 148
    return-void
.end method


# virtual methods
.method public final a(I)Lcom/roidapp/cloudlib/template/TemplateInfo;
    .locals 1

    .prologue
    .line 99
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/a;->f()Z

    move-result v0

    if-nez v0, :cond_0

    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 100
    :cond_0
    const/4 v0, 0x0

    .line 102
    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a;->b:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/TemplateInfo;

    goto :goto_0
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
    .line 65
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a;->b:Ljava/util/LinkedList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 66
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a;->b:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    .line 68
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 42
    sget-object v0, Lcom/roidapp/cloudlib/template/a;->a:Lcom/roidapp/cloudlib/template/TemplateInfo;

    instance-of v0, v0, Lcom/roidapp/cloudlib/template/TemplateInfo;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/roidapp/cloudlib/template/a;->a:Lcom/roidapp/cloudlib/template/TemplateInfo;

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/template/a;->d(Lcom/roidapp/cloudlib/template/TemplateInfo;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 43
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a;->b:Ljava/util/LinkedList;

    sget-object v1, Lcom/roidapp/cloudlib/template/a;->a:Lcom/roidapp/cloudlib/template/TemplateInfo;

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    .line 44
    invoke-direct {p0}, Lcom/roidapp/cloudlib/template/a;->h()V

    .line 46
    :cond_0
    return-void
.end method

.method public final b(Lcom/roidapp/cloudlib/template/TemplateInfo;)V
    .locals 1

    .prologue
    .line 71
    instance-of v0, p1, Lcom/roidapp/cloudlib/template/TemplateInfo;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/template/a;->d(Lcom/roidapp/cloudlib/template/TemplateInfo;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 72
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a;->b:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    .line 73
    invoke-direct {p0}, Lcom/roidapp/cloudlib/template/a;->h()V

    .line 75
    :cond_0
    return-void
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 52
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a;->b:Ljava/util/LinkedList;

    sget-object v1, Lcom/roidapp/cloudlib/template/a;->a:Lcom/roidapp/cloudlib/template/TemplateInfo;

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 53
    invoke-direct {p0}, Lcom/roidapp/cloudlib/template/a;->h()V

    .line 54
    return-void
.end method

.method public final c(Lcom/roidapp/cloudlib/template/TemplateInfo;)V
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a;->b:Ljava/util/LinkedList;

    if-eqz v0, :cond_0

    .line 86
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a;->b:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 87
    invoke-direct {p0}, Lcom/roidapp/cloudlib/template/a;->h()V

    .line 89
    :cond_0
    return-void
.end method

.method public final d(Lcom/roidapp/cloudlib/template/TemplateInfo;)Z
    .locals 1

    .prologue
    .line 106
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/a;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 107
    const/4 v0, 0x0

    .line 109
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a;->b:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->contains(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public final e()I
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a;->b:Ljava/util/LinkedList;

    if-nez v0, :cond_0

    .line 93
    const/4 v0, 0x0

    .line 95
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    goto :goto_0
.end method

.method public final f()Z
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a;->b:Ljava/util/LinkedList;

    if-nez v0, :cond_0

    .line 114
    const/4 v0, 0x1

    .line 116
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    goto :goto_0
.end method

.method public final g()V
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a;->b:Ljava/util/LinkedList;

    if-eqz v0, :cond_0

    .line 121
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 123
    :cond_0
    return-void
.end method
