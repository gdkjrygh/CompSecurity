.class public final Lkik/a/f/f/n;
.super Lkik/a/f/f/y;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private i:Ljava/util/List;

.field private j:Ljava/lang/String;

.field private k:Lkik/a/d/n;

.field private l:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1

    .prologue
    .line 52
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3, v0}, Lkik/a/f/f/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 53
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 43
    const/4 v0, 0x0

    const-string v1, "set"

    invoke-direct {p0, v0, v1}, Lkik/a/f/f/y;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    .line 44
    iput-object p1, p0, Lkik/a/f/f/n;->a:Ljava/lang/String;

    .line 45
    iput-object p2, p0, Lkik/a/f/f/n;->b:Ljava/lang/String;

    .line 46
    iput-object p3, p0, Lkik/a/f/f/n;->i:Ljava/util/List;

    .line 47
    iput-object p4, p0, Lkik/a/f/f/n;->l:Ljava/lang/String;

    .line 48
    return-void
.end method


# virtual methods
.method protected final a(Lkik/a/f/n;)V
    .locals 10

    .prologue
    const/4 v5, 0x1

    const/4 v7, 0x0

    .line 88
    :goto_0
    const-string v0, "iq"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 89
    const-string v0, "g"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 90
    const-string v0, "jid"

    invoke-virtual {p1, v7, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/f/n;->j:Ljava/lang/String;

    .line 91
    iget-object v0, p0, Lkik/a/f/f/n;->j:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 92
    new-instance v3, Lkik/a/d/n$a;

    invoke-direct {v3}, Lkik/a/d/n$a;-><init>()V

    .line 93
    iget-object v0, p0, Lkik/a/f/f/n;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 94
    iget-object v0, p0, Lkik/a/f/f/n;->b:Ljava/lang/String;

    invoke-virtual {v3, v0}, Lkik/a/d/n$a;->a(Ljava/lang/String;)V

    .line 96
    :cond_0
    iget-object v0, p0, Lkik/a/f/f/n;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 97
    invoke-virtual {v3, v0}, Lkik/a/d/n$a;->a(Ljava/lang/String;)V

    goto :goto_1

    .line 101
    :cond_1
    new-instance v0, Lkik/a/d/n;

    iget-object v1, p0, Lkik/a/f/f/n;->j:Ljava/lang/String;

    invoke-static {v1}, Lkik/a/d/j;->a(Ljava/lang/String;)Lkik/a/d/j;

    move-result-object v1

    iget-object v2, p0, Lkik/a/f/f/n;->a:Ljava/lang/String;

    invoke-static {v2}, Lkik/a/h/i;->a(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    move-object v2, v7

    :goto_2
    const/4 v4, 0x0

    move v6, v5

    move-object v8, v7

    move-object v9, v7

    invoke-direct/range {v0 .. v9}, Lkik/a/d/n;-><init>(Lkik/a/d/j;Ljava/lang/String;Lkik/a/d/n$a;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lkik/a/f/f/n;->k:Lkik/a/d/n;

    .line 107
    :cond_2
    return-void

    .line 101
    :cond_3
    iget-object v2, p0, Lkik/a/f/f/n;->a:Ljava/lang/String;

    goto :goto_2

    .line 105
    :cond_4
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_0
.end method

.method protected final b(Lkik/a/f/n;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/16 v2, 0x68

    .line 112
    :goto_0
    const-string v0, "iq"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 113
    const-string v0, "unsupported-client"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 114
    const/16 v0, 0xc9

    invoke-virtual {p0, v0}, Lkik/a/f/f/n;->c(I)V

    .line 115
    const-string v0, "jid"

    invoke-virtual {p1, v3, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/a/f/f/n;->a(Ljava/lang/Object;)V

    .line 172
    :cond_0
    :goto_1
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_0

    .line 117
    :cond_1
    const-string v0, "unacked-membership"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 118
    const/16 v0, 0xca

    invoke-virtual {p0, v0}, Lkik/a/f/f/n;->c(I)V

    .line 119
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 120
    :goto_2
    const-string v1, "unacked-membership"

    invoke-virtual {p1, v1}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 121
    const-string v1, "jid"

    invoke-virtual {p1, v3, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 122
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_2

    .line 124
    :cond_2
    invoke-virtual {p0, v0}, Lkik/a/f/f/n;->a(Ljava/lang/Object;)V

    goto :goto_1

    .line 126
    :cond_3
    const-string v0, "restricted-name"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 127
    const/16 v0, 0x193

    invoke-virtual {p0, v0}, Lkik/a/f/f/n;->c(I)V

    goto :goto_1

    .line 129
    :cond_4
    const-string v0, "invalid-name"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 130
    const/16 v0, 0x191

    invoke-virtual {p0, v0}, Lkik/a/f/f/n;->c(I)V

    goto :goto_1

    .line 132
    :cond_5
    const-string v0, "code-already-exists"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 133
    const/16 v0, 0x194

    invoke-virtual {p0, v0}, Lkik/a/f/f/n;->c(I)V

    .line 174
    :cond_6
    return-void

    .line 139
    :cond_7
    const-string v0, "restricted-code"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 140
    const/16 v0, 0x195

    invoke-virtual {p0, v0}, Lkik/a/f/f/n;->c(I)V

    goto :goto_1

    .line 142
    :cond_8
    const-string v0, "invalid"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 143
    invoke-virtual {p0, v2}, Lkik/a/f/f/n;->c(I)V

    .line 144
    :goto_3
    const-string v0, "error"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 145
    const-string v0, "text"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 146
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/a/f/f/n;->a(Ljava/lang/Object;)V

    .line 148
    :cond_9
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_3

    .line 151
    :cond_a
    const-string v0, "bad-roster-status"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 152
    const/16 v0, 0x196

    invoke-virtual {p0, v0}, Lkik/a/f/f/n;->c(I)V

    .line 154
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 156
    :goto_4
    const-string v1, "bad-roster-status"

    invoke-virtual {p1, v1}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_c

    .line 157
    const-string v1, "m"

    invoke-virtual {p1, v1}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 158
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v1

    .line 160
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 163
    :cond_b
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_4

    .line 166
    :cond_c
    invoke-virtual {p0, v0}, Lkik/a/f/f/n;->a(Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 168
    :cond_d
    const-string v0, "text"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 169
    invoke-virtual {p0, v2}, Lkik/a/f/f/n;->c(I)V

    .line 170
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/a/f/f/n;->a(Ljava/lang/Object;)V

    goto/16 :goto_1
.end method

.method protected final b(Lkik/a/f/o;)V
    .locals 3

    .prologue
    .line 58
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 59
    const-string v0, "xmlns"

    const-string v1, "kik:groups:admin"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    const-string v0, "g"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 61
    const-string v0, "create"

    const-string v1, "1"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    const-string v0, "cgid"

    iget-object v1, p0, Lkik/a/f/f/n;->l:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    iget-object v0, p0, Lkik/a/f/f/n;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 65
    const-string v0, "c"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 66
    iget-object v0, p0, Lkik/a/f/f/n;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lkik/a/f/o;->c(Ljava/lang/String;)Lorg/d/a/c;

    .line 67
    const-string v0, "c"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 70
    :cond_0
    iget-object v0, p0, Lkik/a/f/f/n;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 71
    const-string v2, "m"

    invoke-virtual {p1, v2}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 72
    invoke-virtual {p1, v0}, Lkik/a/f/o;->c(Ljava/lang/String;)Lorg/d/a/c;

    .line 73
    const-string v0, "m"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 75
    :cond_1
    iget-object v0, p0, Lkik/a/f/f/n;->a:Ljava/lang/String;

    invoke-static {v0}, Lkik/a/h/i;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 76
    const-string v0, "n"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 77
    iget-object v0, p0, Lkik/a/f/f/n;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lkik/a/f/o;->c(Ljava/lang/String;)Lorg/d/a/c;

    .line 78
    const-string v0, "n"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 80
    :cond_2
    const-string v0, "g"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 81
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 82
    return-void
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 178
    iget-object v0, p0, Lkik/a/f/f/n;->l:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 183
    iget-object v0, p0, Lkik/a/f/f/n;->j:Ljava/lang/String;

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 188
    iget-object v0, p0, Lkik/a/f/f/n;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final g()Lkik/a/d/n;
    .locals 1

    .prologue
    .line 205
    iget-object v0, p0, Lkik/a/f/f/n;->k:Lkik/a/d/n;

    return-object v0
.end method
