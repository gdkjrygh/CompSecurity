.class public final Lkik/a/f/f/ae;
.super Lkik/a/f/f/w;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:I

.field private o:Ljava/util/Hashtable;

.field private p:Lkik/a/d/aa;


# direct methods
.method public constructor <init>(Lkik/a/f/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Hashtable;)V
    .locals 1

    .prologue
    .line 69
    const-string v0, "set"

    invoke-direct {p0, p1, v0}, Lkik/a/f/f/w;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    .line 28
    const/4 v0, -0x1

    iput v0, p0, Lkik/a/f/f/ae;->n:I

    .line 70
    iput-object p2, p0, Lkik/a/f/f/ae;->a:Ljava/lang/String;

    .line 71
    iput-object p5, p0, Lkik/a/f/f/ae;->l:Ljava/lang/String;

    .line 72
    iput-object p4, p0, Lkik/a/f/f/ae;->b:Ljava/lang/String;

    .line 73
    iput-object p6, p0, Lkik/a/f/f/ae;->o:Ljava/util/Hashtable;

    .line 74
    iput-object p3, p0, Lkik/a/f/f/ae;->k:Ljava/lang/String;

    .line 75
    return-void
.end method


# virtual methods
.method protected final a(Lkik/a/f/n;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 187
    const-string v0, "query"

    invoke-virtual {p1, v4, v0}, Lkik/a/f/n;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    const-string v0, "xmlns"

    const-string v1, "jabber:iq:register"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/n;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    new-instance v0, Lkik/a/d/aa;

    invoke-direct {v0}, Lkik/a/d/aa;-><init>()V

    iput-object v0, p0, Lkik/a/f/f/ae;->p:Lkik/a/d/aa;

    .line 192
    :goto_0
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 193
    const-string v0, "node"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 194
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/f/ae;->m:Ljava/lang/String;

    .line 215
    :cond_0
    :goto_1
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_0

    .line 196
    :cond_1
    const-string v0, "email"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 197
    iget-object v0, p0, Lkik/a/f/f/ae;->p:Lkik/a/d/aa;

    new-instance v1, Ljava/lang/Boolean;

    const-string v2, "true"

    const-string v3, "confirmed"

    invoke-virtual {p1, v4, v3}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    invoke-direct {v1, v2}, Ljava/lang/Boolean;-><init>(Z)V

    iput-object v1, v0, Lkik/a/d/aa;->b:Ljava/lang/Boolean;

    .line 198
    iget-object v0, p0, Lkik/a/f/f/ae;->p:Lkik/a/d/aa;

    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lkik/a/d/aa;->a:Ljava/lang/String;

    goto :goto_1

    .line 200
    :cond_2
    const-string v0, "first"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 201
    iget-object v0, p0, Lkik/a/f/f/ae;->p:Lkik/a/d/aa;

    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lkik/a/d/aa;->d:Ljava/lang/String;

    goto :goto_1

    .line 203
    :cond_3
    const-string v0, "last"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 204
    iget-object v0, p0, Lkik/a/f/f/ae;->p:Lkik/a/d/aa;

    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lkik/a/d/aa;->e:Ljava/lang/String;

    goto :goto_1

    .line 206
    :cond_4
    const-string v0, "username"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 207
    iget-object v0, p0, Lkik/a/f/f/ae;->p:Lkik/a/d/aa;

    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lkik/a/d/aa;->c:Ljava/lang/String;

    goto :goto_1

    .line 209
    :cond_5
    const-string v0, "pic"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 210
    iget-object v0, p0, Lkik/a/f/f/ae;->p:Lkik/a/d/aa;

    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lkik/a/d/aa;->f:Ljava/lang/String;

    goto :goto_1

    .line 212
    :cond_6
    const-string v0, "notify-new-people"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 213
    iget-object v0, p0, Lkik/a/f/f/ae;->p:Lkik/a/d/aa;

    new-instance v1, Ljava/lang/Boolean;

    const-string v2, "true"

    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    invoke-direct {v1, v2}, Ljava/lang/Boolean;-><init>(Z)V

    iput-object v1, v0, Lkik/a/d/aa;->h:Ljava/lang/Boolean;

    goto/16 :goto_1

    .line 218
    :cond_7
    iget-object v0, p0, Lkik/a/f/f/ae;->m:Ljava/lang/String;

    if-nez v0, :cond_8

    .line 220
    const/4 v0, 0x0

    iput v0, p0, Lkik/a/f/f/ae;->n:I

    .line 221
    const/16 v0, 0x64

    invoke-virtual {p0, v0}, Lkik/a/f/f/ae;->b(I)V

    .line 226
    :goto_2
    return-void

    .line 224
    :cond_8
    const/16 v0, 0xc8

    iput v0, p0, Lkik/a/f/f/ae;->n:I

    goto :goto_2
.end method

.method protected final b(Lkik/a/f/n;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 129
    const-string v0, "query"

    invoke-virtual {p1, v2, v0}, Lkik/a/f/n;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    const-string v0, "xmlns"

    const-string v1, "jabber:iq:register"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/n;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    :goto_0
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 133
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_0

    .line 136
    :cond_0
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    .line 138
    const-string v0, "error"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 139
    const-string v0, "cancel"

    const-string v1, "type"

    invoke-virtual {p1, v2, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 140
    const-string v0, "modify"

    const-string v1, "type"

    invoke-virtual {p1, v2, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 143
    const/4 v0, 0x1

    iput v0, p0, Lkik/a/f/f/ae;->n:I

    .line 149
    :goto_1
    const-string v0, "error"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 150
    const-string v0, "not-registered"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 151
    iget-object v0, p0, Lkik/a/f/f/ae;->a:Ljava/lang/String;

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_3

    .line 152
    const/16 v0, 0xc9

    invoke-virtual {p0, v0}, Lkik/a/f/f/ae;->c(I)V

    .line 153
    iget-object v0, p0, Lkik/a/f/f/ae;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lkik/a/f/f/ae;->a(Ljava/lang/Object;)V

    .line 182
    :cond_1
    :goto_2
    return-void

    .line 146
    :cond_2
    const/4 v0, 0x0

    iput v0, p0, Lkik/a/f/f/ae;->n:I

    goto :goto_1

    .line 157
    :cond_3
    const/16 v0, 0xca

    invoke-virtual {p0, v0}, Lkik/a/f/f/ae;->c(I)V

    .line 158
    iget-object v0, p0, Lkik/a/f/f/ae;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lkik/a/f/f/ae;->a(Ljava/lang/Object;)V

    goto :goto_2

    .line 162
    :cond_4
    const-string v0, "password-mismatch"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 163
    const/16 v0, 0xcb

    invoke-virtual {p0, v0}, Lkik/a/f/f/ae;->c(I)V

    goto :goto_2

    .line 166
    :cond_5
    const-string v0, "device-change-timeout"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 167
    const/16 v0, 0xcc

    invoke-virtual {p0, v0}, Lkik/a/f/f/ae;->c(I)V

    goto :goto_2

    .line 170
    :cond_6
    const-string v0, "captcha-url"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 171
    const/16 v0, 0xcd

    invoke-virtual {p0, v0}, Lkik/a/f/f/ae;->c(I)V

    .line 172
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/f/ae;->i:Ljava/lang/String;

    goto :goto_2

    .line 175
    :cond_7
    const-string v0, "message"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 176
    const/16 v0, 0xce

    invoke-virtual {p0, v0}, Lkik/a/f/f/ae;->c(I)V

    .line 177
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/f/ae;->j:Ljava/lang/String;

    .line 179
    :cond_8
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_1
.end method

.method protected final b(Lkik/a/f/o;)V
    .locals 3

    .prologue
    const/16 v2, 0x40

    .line 85
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 86
    const-string v0, "xmlns"

    const-string v1, "jabber:iq:register"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    iget-object v0, p0, Lkik/a/f/f/ae;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-ltz v0, :cond_1

    .line 89
    const-string v0, "email"

    iget-object v1, p0, Lkik/a/f/f/ae;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    :goto_0
    iget-object v0, p0, Lkik/a/f/f/ae;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-ltz v0, :cond_2

    const-string v0, "passkey-e"

    .line 97
    :goto_1
    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 98
    iget-object v1, p0, Lkik/a/f/f/ae;->l:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lkik/a/f/o;->c(Ljava/lang/String;)Lorg/d/a/c;

    .line 99
    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 101
    iget-object v0, p0, Lkik/a/f/f/ae;->k:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 102
    const-string v0, "challenge"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 103
    const-string v0, "response"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 104
    iget-object v0, p0, Lkik/a/f/f/ae;->k:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lkik/a/f/o;->c(Ljava/lang/String;)Lorg/d/a/c;

    .line 105
    const-string v0, "response"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 106
    const-string v0, "challenge"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 109
    :cond_0
    const-string v0, "device-id"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 110
    iget-object v0, p0, Lkik/a/f/f/ae;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lkik/a/f/o;->c(Ljava/lang/String;)Lorg/d/a/c;

    .line 111
    const-string v0, "device-id"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 113
    iget-object v0, p0, Lkik/a/f/f/ae;->o:Ljava/util/Hashtable;

    if-eqz v0, :cond_3

    .line 114
    iget-object v0, p0, Lkik/a/f/f/ae;->o:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v2

    .line 115
    :goto_2
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 116
    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 117
    iget-object v1, p0, Lkik/a/f/f/ae;->o:Ljava/util/Hashtable;

    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 118
    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 92
    :cond_1
    const-string v0, "username"

    iget-object v1, p0, Lkik/a/f/f/ae;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 95
    :cond_2
    const-string v0, "passkey-u"

    goto :goto_1

    .line 123
    :cond_3
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 124
    return-void
.end method

.method public final d()Lkik/a/d/aa;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lkik/a/f/f/ae;->p:Lkik/a/d/aa;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 230
    iget-object v0, p0, Lkik/a/f/f/ae;->m:Ljava/lang/String;

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 240
    iget-object v0, p0, Lkik/a/f/f/ae;->i:Ljava/lang/String;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 245
    iget-object v0, p0, Lkik/a/f/f/ae;->j:Ljava/lang/String;

    return-object v0
.end method
