.class public final Lkik/a/f/f/ao;
.super Lkik/a/f/f/y;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/Boolean;

.field private m:Ljava/lang/Boolean;

.field private n:Lkik/a/d/aa;


# direct methods
.method public constructor <init>(Lkik/a/f/j;)V
    .locals 1

    .prologue
    .line 38
    const-string v0, "get"

    invoke-direct {p0, p1, v0}, Lkik/a/f/f/y;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    .line 23
    new-instance v0, Lkik/a/d/aa;

    invoke-direct {v0}, Lkik/a/d/aa;-><init>()V

    iput-object v0, p0, Lkik/a/f/f/ao;->n:Lkik/a/d/aa;

    .line 39
    return-void
.end method

.method public constructor <init>(Lkik/a/f/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 50
    const-string v0, "set"

    invoke-direct {p0, p1, v0}, Lkik/a/f/f/y;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    .line 23
    new-instance v0, Lkik/a/d/aa;

    invoke-direct {v0}, Lkik/a/d/aa;-><init>()V

    iput-object v0, p0, Lkik/a/f/f/ao;->n:Lkik/a/d/aa;

    .line 54
    invoke-static {p2}, Lkik/a/h/i;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/f/ao;->i:Ljava/lang/String;

    .line 55
    invoke-static {p3}, Lkik/a/h/i;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/f/ao;->j:Ljava/lang/String;

    .line 56
    invoke-static {p4}, Lkik/a/h/i;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/f/ao;->k:Ljava/lang/String;

    .line 57
    iput-object p6, p0, Lkik/a/f/f/ao;->a:Ljava/lang/String;

    .line 58
    iput-object p7, p0, Lkik/a/f/f/ao;->b:Ljava/lang/String;

    .line 59
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/a/f/f/ao;->l:Ljava/lang/Boolean;

    .line 60
    iput-object p5, p0, Lkik/a/f/f/ao;->m:Ljava/lang/Boolean;

    .line 62
    iget-object v0, p0, Lkik/a/f/f/ao;->n:Lkik/a/d/aa;

    iput-object p4, v0, Lkik/a/d/aa;->a:Ljava/lang/String;

    .line 63
    iget-object v0, p0, Lkik/a/f/f/ao;->n:Lkik/a/d/aa;

    iput-object p2, v0, Lkik/a/d/aa;->d:Ljava/lang/String;

    .line 64
    iget-object v0, p0, Lkik/a/f/f/ao;->n:Lkik/a/d/aa;

    iput-object p3, v0, Lkik/a/d/aa;->e:Ljava/lang/String;

    .line 65
    return-void
.end method


# virtual methods
.method protected final a(Lkik/a/f/n;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 70
    iget-object v0, p0, Lkik/a/f/f/ao;->n:Lkik/a/d/aa;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Lkik/a/d/aa;->g:Ljava/lang/Boolean;

    .line 72
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "kik:iq:user-profile"

    const-string v1, "xmlns"

    invoke-virtual {p1, v5, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 73
    :cond_0
    new-instance v0, Lorg/d/a/b;

    const-string v1, "Expected start of user-profile query."

    invoke-direct {v0, v1}, Lorg/d/a/b;-><init>(Ljava/lang/String;)V

    throw v0

    .line 76
    :cond_1
    :goto_0
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 77
    const-string v0, "email"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 78
    iget-object v0, p0, Lkik/a/f/f/ao;->n:Lkik/a/d/aa;

    new-instance v1, Ljava/lang/Boolean;

    const-string v2, "true"

    const-string v3, "confirmed"

    invoke-virtual {p1, v5, v3}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    invoke-direct {v1, v2}, Ljava/lang/Boolean;-><init>(Z)V

    iput-object v1, v0, Lkik/a/d/aa;->b:Ljava/lang/Boolean;

    .line 79
    iget-object v0, p0, Lkik/a/f/f/ao;->n:Lkik/a/d/aa;

    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lkik/a/d/aa;->a:Ljava/lang/String;

    .line 99
    :cond_2
    :goto_1
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_0

    .line 81
    :cond_3
    const-string v0, "first"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 82
    iget-object v0, p0, Lkik/a/f/f/ao;->n:Lkik/a/d/aa;

    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lkik/a/d/aa;->d:Ljava/lang/String;

    goto :goto_1

    .line 84
    :cond_4
    const-string v0, "last"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 85
    iget-object v0, p0, Lkik/a/f/f/ao;->n:Lkik/a/d/aa;

    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lkik/a/d/aa;->e:Ljava/lang/String;

    goto :goto_1

    .line 87
    :cond_5
    const-string v0, "username"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 88
    iget-object v0, p0, Lkik/a/f/f/ao;->n:Lkik/a/d/aa;

    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lkik/a/d/aa;->c:Ljava/lang/String;

    goto :goto_1

    .line 90
    :cond_6
    const-string v0, "pic"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 91
    iget-object v0, p0, Lkik/a/f/f/ao;->n:Lkik/a/d/aa;

    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lkik/a/d/aa;->f:Ljava/lang/String;

    goto :goto_1

    .line 93
    :cond_7
    const-string v0, "notify-new-people"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 94
    iget-object v0, p0, Lkik/a/f/f/ao;->n:Lkik/a/d/aa;

    new-instance v1, Ljava/lang/Boolean;

    const-string v2, "true"

    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    invoke-direct {v1, v2}, Ljava/lang/Boolean;-><init>(Z)V

    iput-object v1, v0, Lkik/a/d/aa;->h:Ljava/lang/Boolean;

    goto :goto_1

    .line 96
    :cond_8
    const-string v0, "verified"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 97
    iget-object v0, p0, Lkik/a/f/f/ao;->n:Lkik/a/d/aa;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Lkik/a/d/aa;->i:Ljava/lang/Boolean;

    goto :goto_1

    .line 101
    :cond_9
    return-void
.end method

.method protected final b(Lkik/a/f/n;)V
    .locals 1

    .prologue
    .line 140
    :goto_0
    const-string v0, "iq"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 141
    const-string v0, "error"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 142
    :goto_1
    const-string v0, "error"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 143
    const-string v0, "already-registered"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 144
    const/16 v0, 0xc9

    invoke-virtual {p0, v0}, Lkik/a/f/f/ao;->c(I)V

    .line 145
    iget-object v0, p0, Lkik/a/f/f/ao;->k:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lkik/a/f/f/ao;->a(Ljava/lang/Object;)V

    .line 156
    :cond_0
    return-void

    .line 148
    :cond_1
    const-string v0, "first-last-name-rejected"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 149
    const/16 v0, 0xca

    invoke-virtual {p0, v0}, Lkik/a/f/f/ao;->c(I)V

    .line 151
    :cond_2
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_1

    .line 154
    :cond_3
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_0
.end method

.method protected final b(Lkik/a/f/o;)V
    .locals 2

    .prologue
    .line 106
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 107
    const-string v0, "xmlns"

    const-string v1, "kik:iq:user-profile"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    const-string v0, "set"

    iget-object v1, p0, Lkik/a/f/f/ao;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 110
    iget-object v0, p0, Lkik/a/f/f/ao;->k:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 111
    const-string v0, "email"

    iget-object v1, p0, Lkik/a/f/f/ao;->k:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    :cond_0
    iget-object v0, p0, Lkik/a/f/f/ao;->i:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 114
    const-string v0, "first"

    iget-object v1, p0, Lkik/a/f/f/ao;->i:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    :cond_1
    iget-object v0, p0, Lkik/a/f/f/ao;->j:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 117
    const-string v0, "last"

    iget-object v1, p0, Lkik/a/f/f/ao;->j:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    :cond_2
    iget-object v0, p0, Lkik/a/f/f/ao;->a:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 120
    const-string v0, "passkey-e"

    iget-object v1, p0, Lkik/a/f/f/ao;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    :cond_3
    iget-object v0, p0, Lkik/a/f/f/ao;->b:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 123
    const-string v0, "passkey-u"

    iget-object v1, p0, Lkik/a/f/f/ao;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    :cond_4
    iget-object v0, p0, Lkik/a/f/f/ao;->l:Ljava/lang/Boolean;

    if-eqz v0, :cond_5

    .line 126
    const-string v0, "listen-by-default"

    iget-object v1, p0, Lkik/a/f/f/ao;->l:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    :cond_5
    iget-object v0, p0, Lkik/a/f/f/ao;->m:Ljava/lang/Boolean;

    if-eqz v0, :cond_6

    .line 129
    const-string v0, "notify-new-people"

    iget-object v1, p0, Lkik/a/f/f/ao;->m:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    :cond_6
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 134
    return-void
.end method

.method public final d()Lkik/a/d/aa;
    .locals 1

    .prologue
    .line 160
    iget-object v0, p0, Lkik/a/f/f/ao;->n:Lkik/a/d/aa;

    return-object v0
.end method
