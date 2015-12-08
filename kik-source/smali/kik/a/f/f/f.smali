.class public final Lkik/a/f/f/f;
.super Lkik/a/f/f/y;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/Set;

.field private b:Ljava/util/HashSet;

.field private i:Ljava/util/HashSet;


# direct methods
.method private constructor <init>(Ljava/util/Set;)V
    .locals 2

    .prologue
    .line 33
    const/4 v0, 0x0

    const-string v1, "get"

    invoke-direct {p0, v0, v1}, Lkik/a/f/f/y;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    .line 26
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lkik/a/f/f/f;->b:Ljava/util/HashSet;

    .line 27
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lkik/a/f/f/f;->i:Ljava/util/HashSet;

    .line 34
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 35
    iput-object p1, p0, Lkik/a/f/f/f;->a:Ljava/util/Set;

    return-void

    .line 39
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid list of identifiers"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static a(Ljava/util/Set;)Lkik/a/f/f/f;
    .locals 1

    .prologue
    .line 45
    new-instance v0, Lkik/a/f/f/f;

    invoke-direct {v0, p0}, Lkik/a/f/f/f;-><init>(Ljava/util/Set;)V

    return-object v0
.end method


# virtual methods
.method protected final a(Lkik/a/f/n;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 71
    const-string v0, "query"

    invoke-virtual {p1, v2, v0}, Lkik/a/f/n;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    const-string v0, "xmlns"

    const-string v1, "kik:iq:friend:batch"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/n;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    :cond_0
    :goto_0
    const-string v0, "iq"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 75
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 76
    :goto_1
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 77
    const-string v0, "success"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 78
    :goto_2
    const-string v0, "success"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 79
    const-string v0, "item"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 80
    iget-object v0, p0, Lkik/a/f/f/f;->b:Ljava/util/HashSet;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lkik/a/f/t;->a(Lkik/a/f/n;Z)Lkik/a/d/k;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 82
    :cond_1
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_2

    .line 86
    :cond_2
    const-string v0, "failed"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 87
    :goto_3
    const-string v0, "failed"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 88
    const-string v0, "item"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 89
    const-string v0, "jid"

    invoke-virtual {p1, v2, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 91
    if-eqz v0, :cond_3

    .line 92
    iget-object v1, p0, Lkik/a/f/f/f;->i:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 95
    :cond_3
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_3

    .line 99
    :cond_4
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_1

    .line 102
    :cond_5
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_0

    .line 105
    :cond_6
    return-void
.end method

.method public final a(Lkik/a/f/f/z;)Z
    .locals 2

    .prologue
    .line 130
    instance-of v0, p1, Lkik/a/f/f/f;

    if-eqz v0, :cond_0

    .line 131
    iget-object v0, p0, Lkik/a/f/f/f;->a:Ljava/util/Set;

    check-cast p1, Lkik/a/f/f/f;

    iget-object v1, p1, Lkik/a/f/f/f;->a:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 133
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected final b(Lkik/a/f/n;)V
    .locals 2

    .prologue
    .line 110
    const-string v0, "query"

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    const-string v0, "type"

    const-string v1, "error"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/n;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    const/4 v0, 0x2

    const-string v1, "error"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/n;->a(ILjava/lang/String;)V

    .line 113
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    .line 114
    const/16 v0, 0xc9

    invoke-virtual {p0, v0}, Lkik/a/f/f/f;->c(I)V

    .line 115
    return-void
.end method

.method protected final b(Lkik/a/f/o;)V
    .locals 3

    .prologue
    .line 56
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 57
    const-string v0, "xmlns"

    const-string v1, "kik:iq:friend:batch"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    iget-object v0, p0, Lkik/a/f/f/f;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 59
    const-string v2, "item"

    invoke-virtual {p1, v2}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 60
    if-eqz v0, :cond_0

    .line 61
    const-string v2, "jid"

    invoke-virtual {p1, v2, v0}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    :cond_0
    const-string v0, "item"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 65
    :cond_1
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 66
    return-void
.end method

.method public final d()Ljava/util/Set;
    .locals 1

    .prologue
    .line 119
    iget-object v0, p0, Lkik/a/f/f/f;->b:Ljava/util/HashSet;

    return-object v0
.end method
