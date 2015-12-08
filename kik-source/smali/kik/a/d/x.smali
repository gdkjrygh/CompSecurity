.class public final Lkik/a/d/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Ljava/lang/String;

.field protected b:Ljava/util/List;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/kik/n/a/f/c;)V
    .locals 4

    .prologue
    .line 34
    invoke-virtual {p1}, Lcom/kik/n/a/f/c;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/kik/n/a/f/c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/kik/n/a/f/c;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/kik/n/a/f/c;->e()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkik/a/d/x;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    invoke-direct {p0, v0, v1, v2, v3}, Lkik/a/d/x;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 35
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lkik/a/d/x;->c:Ljava/lang/String;

    .line 40
    iput-object p2, p0, Lkik/a/d/x;->a:Ljava/lang/String;

    .line 41
    iput-object p3, p0, Lkik/a/d/x;->d:Ljava/lang/String;

    .line 42
    iput-object p4, p0, Lkik/a/d/x;->b:Ljava/util/List;

    .line 43
    return-void
.end method

.method private static a(Ljava/util/List;)Ljava/util/List;
    .locals 4

    .prologue
    .line 19
    if-nez p0, :cond_0

    .line 20
    const/4 v0, 0x0

    .line 29
    :goto_0
    return-object v0

    .line 23
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 25
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/n/a/f/a;

    .line 26
    new-instance v3, Lkik/a/d/w;

    invoke-direct {v3, v0}, Lkik/a/d/w;-><init>(Lcom/kik/n/a/f/a;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    move-object v0, v1

    .line 29
    goto :goto_0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lkik/a/d/x;->d:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lkik/a/d/x;->d:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final a(Lkik/a/d/w;)V
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lkik/a/d/x;->b:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 59
    iget-object v0, p0, Lkik/a/d/x;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 61
    :cond_0
    return-void
.end method

.method public final b()Ljava/util/List;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lkik/a/d/x;->b:Ljava/util/List;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lkik/a/d/x;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lkik/a/d/x;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Lcom/kik/n/a/f/c;
    .locals 4

    .prologue
    .line 90
    new-instance v1, Lcom/kik/n/a/f/c;

    invoke-direct {v1}, Lcom/kik/n/a/f/c;-><init>()V

    .line 91
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 93
    iget-object v0, p0, Lkik/a/d/x;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/w;

    .line 94
    invoke-virtual {v0}, Lkik/a/d/w;->d()Lcom/kik/n/a/f/a;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 97
    :cond_0
    iget-object v0, p0, Lkik/a/d/x;->c:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/kik/n/a/f/c;->a(Ljava/lang/String;)Lcom/kik/n/a/f/c;

    .line 98
    iget-object v0, p0, Lkik/a/d/x;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/kik/n/a/f/c;->b(Ljava/lang/String;)Lcom/kik/n/a/f/c;

    .line 99
    iget-object v0, p0, Lkik/a/d/x;->d:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/kik/n/a/f/c;->c(Ljava/lang/String;)Lcom/kik/n/a/f/c;

    .line 100
    invoke-virtual {v1, v2}, Lcom/kik/n/a/f/c;->a(Ljava/util/List;)Lcom/kik/n/a/f/c;

    .line 102
    return-object v1
.end method
