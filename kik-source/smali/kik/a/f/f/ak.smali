.class public final Lkik/a/f/f/ak;
.super Lkik/a/f/f/y;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:Z

.field private i:J

.field private j:J

.field private k:Ljava/util/List;

.field private l:Ljava/util/List;

.field private m:Ljava/util/List;

.field private n:Ljava/util/List;

.field private o:Ljava/lang/String;


# direct methods
.method public constructor <init>(JZLjava/lang/String;)V
    .locals 3

    .prologue
    .line 40
    const/4 v0, 0x0

    const-string v1, "get"

    invoke-direct {p0, v0, v1}, Lkik/a/f/f/y;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    .line 41
    iput-wide p1, p0, Lkik/a/f/f/ak;->i:J

    .line 42
    iput-boolean p3, p0, Lkik/a/f/f/ak;->a:Z

    .line 43
    iput-object p4, p0, Lkik/a/f/f/ak;->o:Ljava/lang/String;

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/a/f/f/ak;->k:Ljava/util/List;

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/a/f/f/ak;->l:Ljava/util/List;

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/a/f/f/ak;->m:Ljava/util/List;

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/a/f/f/ak;->n:Ljava/util/List;

    .line 48
    return-void
.end method


# virtual methods
.method public final a(Lkik/a/f/n;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 53
    const-string v0, "query"

    invoke-virtual {p1, v2, v0}, Lkik/a/f/n;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    const-string v0, "xmlns"

    const-string v1, "jabber:iq:roster"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/n;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    const-string v0, "ts"

    invoke-virtual {p1, v2, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 58
    if-nez v0, :cond_2

    .line 59
    iget-wide v0, p0, Lkik/a/f/f/ak;->i:J

    iput-wide v0, p0, Lkik/a/f/f/ak;->j:J

    .line 65
    :goto_0
    const-string v0, "1"

    const-string v1, "more"

    invoke-virtual {p1, v2, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 66
    iput-boolean v3, p0, Lkik/a/f/f/ak;->b:Z

    .line 69
    :cond_0
    :goto_1
    const-string v0, "iq"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 70
    const-string v0, "item"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 71
    iget-object v0, p0, Lkik/a/f/f/ak;->k:Ljava/util/List;

    invoke-static {p1, v3}, Lkik/a/f/t;->a(Lkik/a/f/n;Z)Lkik/a/d/k;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    :cond_1
    :goto_2
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_1

    .line 62
    :cond_2
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lkik/a/f/f/ak;->j:J

    goto :goto_0

    .line 73
    :cond_3
    const-string v0, "remove"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 74
    iget-object v0, p0, Lkik/a/f/f/ak;->l:Ljava/util/List;

    const-string v1, "jid"

    invoke-virtual {p1, v2, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkik/a/d/j;->a(Ljava/lang/String;)Lkik/a/d/j;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 76
    :cond_4
    const-string v0, "g"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 77
    iget-object v0, p0, Lkik/a/f/f/ak;->m:Ljava/util/List;

    iget-object v1, p0, Lkik/a/f/f/ak;->o:Ljava/lang/String;

    invoke-static {p1, v1}, Lkik/a/f/t;->a(Lkik/a/f/n;Ljava/lang/String;)Lkik/a/d/n;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 79
    :cond_5
    const-string v0, "remove-group"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 80
    iget-object v0, p0, Lkik/a/f/f/ak;->n:Ljava/util/List;

    const-string v1, "jid"

    invoke-virtual {p1, v2, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkik/a/d/j;->a(Ljava/lang/String;)Lkik/a/d/j;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 84
    :cond_6
    return-void
.end method

.method public final a(Lkik/a/f/f/z;)Z
    .locals 1

    .prologue
    .line 25
    instance-of v0, p1, Lkik/a/f/f/ak;

    return v0
.end method

.method protected final b(Lkik/a/f/o;)V
    .locals 4

    .prologue
    .line 89
    const-string v0, ""

    const-string v1, "jabber:iq:roster"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    const-string v0, "jabber:iq:roster"

    const-string v1, "query"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->c(Ljava/lang/String;Ljava/lang/String;)Lorg/d/a/c;

    .line 92
    const-string v0, "p"

    const-string v1, "8"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    iget-wide v0, p0, Lkik/a/f/f/ak;->i:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 94
    const-string v0, "ts"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v2, p0, Lkik/a/f/f/ak;->i:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    :cond_0
    iget-boolean v0, p0, Lkik/a/f/f/ak;->a:Z

    if-eqz v0, :cond_1

    .line 97
    const-string v1, "b"

    iget-boolean v0, p0, Lkik/a/f/f/ak;->a:Z

    if-eqz v0, :cond_2

    const-string v0, "1"

    :goto_0
    invoke-virtual {p1, v1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    :cond_1
    const-string v0, "jabber:iq:roster"

    const-string v1, "query"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->d(Ljava/lang/String;Ljava/lang/String;)Lorg/d/a/c;

    .line 100
    return-void

    .line 97
    :cond_2
    const-string v0, "0"

    goto :goto_0
.end method

.method public final d()Ljava/util/List;
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lkik/a/f/f/ak;->k:Ljava/util/List;

    return-object v0
.end method

.method public final e()Ljava/util/List;
    .locals 1

    .prologue
    .line 109
    iget-object v0, p0, Lkik/a/f/f/ak;->l:Ljava/util/List;

    return-object v0
.end method

.method public final f()Ljava/util/List;
    .locals 1

    .prologue
    .line 114
    iget-object v0, p0, Lkik/a/f/f/ak;->m:Ljava/util/List;

    return-object v0
.end method

.method public final g()Ljava/util/List;
    .locals 1

    .prologue
    .line 119
    iget-object v0, p0, Lkik/a/f/f/ak;->n:Ljava/util/List;

    return-object v0
.end method

.method public final n()Z
    .locals 1

    .prologue
    .line 124
    iget-boolean v0, p0, Lkik/a/f/f/ak;->b:Z

    return v0
.end method

.method public final o()J
    .locals 2

    .prologue
    .line 129
    iget-wide v0, p0, Lkik/a/f/f/ak;->j:J

    return-wide v0
.end method
