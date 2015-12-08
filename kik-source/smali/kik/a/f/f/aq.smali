.class public final Lkik/a/f/f/aq;
.super Lkik/a/f/f/y;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/List;

.field private b:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 2

    .prologue
    .line 36
    const/4 v0, 0x0

    const-string v1, "set"

    invoke-direct {p0, v0, v1}, Lkik/a/f/f/y;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    .line 38
    iput-object p1, p0, Lkik/a/f/f/aq;->a:Ljava/util/List;

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/a/f/f/aq;->b:Ljava/util/List;

    .line 40
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 185
    new-instance v0, Lkik/a/d/ab;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lkik/a/d/ab;-><init>(Ljava/lang/String;Ljava/lang/String;[B)V

    .line 187
    iget-object v1, p0, Lkik/a/f/f/aq;->b:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 188
    return-void
.end method

.method private static a(Lkik/a/d/ab;Lkik/a/f/o;)V
    .locals 2

    .prologue
    .line 98
    const-string v0, "record"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 100
    invoke-virtual {p0}, Lkik/a/d/ab;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 101
    const-string v0, "sk"

    invoke-virtual {p0}, Lkik/a/d/ab;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    :goto_0
    invoke-virtual {p0}, Lkik/a/d/ab;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 109
    const-string v0, "d"

    const-string v1, "1"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    :goto_1
    const-string v0, "record"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 119
    return-void

    .line 104
    :cond_0
    const-string v0, "pk"

    invoke-virtual {p0}, Lkik/a/d/ab;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 113
    :cond_1
    invoke-virtual {p0}, Lkik/a/d/ab;->c()[B

    move-result-object v0

    invoke-static {v0}, Lcom/kik/m/e;->b([B)Ljava/lang/String;

    move-result-object v0

    .line 115
    invoke-virtual {p1, v0}, Lkik/a/f/o;->c(Ljava/lang/String;)Lorg/d/a/c;

    goto :goto_1
.end method


# virtual methods
.method protected final a(Lkik/a/f/n;)V
    .locals 3

    .prologue
    .line 124
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "kik:iq:xdata"

    const-string v1, "xmlns"

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 125
    :cond_0
    new-instance v0, Lorg/d/a/b;

    const-string v1, "Expected start of xdata request"

    invoke-direct {v0, v1}, Lorg/d/a/b;-><init>(Ljava/lang/String;)V

    throw v0

    .line 127
    :cond_1
    return-void
.end method

.method protected final b(Lkik/a/f/n;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 132
    const-string v0, "error"

    invoke-virtual {p1, v2, v0}, Lkik/a/f/n;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    :cond_0
    :goto_0
    const-string v0, "error"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 135
    const-string v0, "type"

    invoke-virtual {p1, v2, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 137
    if-nez v0, :cond_1

    .line 138
    const/16 v0, 0x67

    invoke-virtual {p0, v0}, Lkik/a/f/f/aq;->c(I)V

    .line 139
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_0

    .line 141
    :cond_1
    const-string v1, "wait"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 142
    const/16 v0, 0xc9

    invoke-virtual {p0, v0}, Lkik/a/f/f/aq;->c(I)V

    .line 144
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_0

    .line 146
    :cond_2
    const-string v1, "modify"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 147
    const/16 v0, 0xca

    invoke-virtual {p0, v0}, Lkik/a/f/f/aq;->c(I)V

    .line 149
    :goto_1
    const-string v0, "error"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 150
    const-string v0, "record"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 151
    const-string v0, "pk"

    invoke-virtual {p1, v2, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 153
    invoke-direct {p0, v0, v2}, Lkik/a/f/f/aq;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    :cond_3
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_1

    .line 155
    :cond_4
    const-string v0, "record-set"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 156
    const-string v0, "pk"

    invoke-virtual {p1, v2, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 158
    :goto_2
    const-string v1, "record-set"

    invoke-virtual {p1, v1}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "record"

    invoke-virtual {p1, v1}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    const-string v1, "sk"

    invoke-virtual {p1, v2, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lkik/a/f/f/aq;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_2

    .line 164
    :cond_6
    iget-object v0, p0, Lkik/a/f/f/aq;->b:Ljava/util/List;

    invoke-virtual {p0, v0}, Lkik/a/f/f/aq;->a(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 167
    :cond_7
    return-void
.end method

.method protected final b(Lkik/a/f/o;)V
    .locals 5

    .prologue
    .line 45
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 46
    const-string v0, "xmlns"

    const-string v1, "kik:iq:xdata"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    iget-object v0, p0, Lkik/a/f/f/aq;->a:Ljava/util/List;

    if-eqz v0, :cond_6

    .line 50
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 52
    iget-object v0, p0, Lkik/a/f/f/aq;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/ab;

    .line 53
    invoke-virtual {v0}, Lkik/a/d/ab;->a()Ljava/lang/String;

    move-result-object v4

    .line 54
    invoke-virtual {v0}, Lkik/a/d/ab;->b()Ljava/lang/String;

    move-result-object v1

    .line 57
    if-eqz v1, :cond_0

    .line 58
    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    .line 60
    if-nez v1, :cond_1

    .line 61
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 64
    :cond_1
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    invoke-virtual {v2, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 71
    :cond_2
    iget-object v0, p0, Lkik/a/f/f/aq;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/ab;

    .line 72
    invoke-virtual {v0}, Lkik/a/d/ab;->b()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    .line 73
    invoke-static {v0, p1}, Lkik/a/f/f/aq;->a(Lkik/a/d/ab;Lkik/a/f/o;)V

    goto :goto_1

    .line 78
    :cond_4
    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 79
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    .line 81
    const-string v4, "record-set"

    invoke-virtual {p1, v4}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 82
    const-string v4, "pk"

    invoke-virtual {p1, v4, v0}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/ab;

    .line 86
    invoke-static {v0, p1}, Lkik/a/f/f/aq;->a(Lkik/a/d/ab;Lkik/a/f/o;)V

    goto :goto_3

    .line 89
    :cond_5
    const-string v0, "record-set"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    goto :goto_2

    .line 93
    :cond_6
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 94
    return-void
.end method
