.class public final Lkik/a/f/f/ad;
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

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Ljava/util/Hashtable;

.field private r:Ljava/lang/String;

.field private s:Ljava/util/Date;

.field private t:I


# direct methods
.method public constructor <init>(Lkik/a/f/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/util/Hashtable;)V
    .locals 1

    .prologue
    .line 75
    const-string v0, "set"

    invoke-direct {p0, p1, v0}, Lkik/a/f/f/w;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    .line 37
    const/4 v0, -0x1

    iput v0, p0, Lkik/a/f/f/ad;->t:I

    .line 76
    iput-object p2, p0, Lkik/a/f/f/ad;->i:Ljava/lang/String;

    .line 77
    iput-object p3, p0, Lkik/a/f/f/ad;->j:Ljava/lang/String;

    .line 78
    iput-object p6, p0, Lkik/a/f/f/ad;->k:Ljava/lang/String;

    .line 79
    iput-object p5, p0, Lkik/a/f/f/ad;->b:Ljava/lang/String;

    .line 80
    iput-object p4, p0, Lkik/a/f/f/ad;->a:Ljava/lang/String;

    .line 81
    iput-object p7, p0, Lkik/a/f/f/ad;->l:Ljava/lang/String;

    .line 82
    iput-object p8, p0, Lkik/a/f/f/ad;->m:Ljava/lang/String;

    .line 83
    iput-object p11, p0, Lkik/a/f/f/ad;->q:Ljava/util/Hashtable;

    .line 84
    iput-object p10, p0, Lkik/a/f/f/ad;->p:Ljava/lang/String;

    .line 85
    iput-object p9, p0, Lkik/a/f/f/ad;->s:Ljava/util/Date;

    .line 86
    return-void
.end method


# virtual methods
.method protected final a(Lkik/a/f/n;)V
    .locals 2

    .prologue
    .line 208
    const-string v0, "query"

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    const-string v0, "xmlns"

    const-string v1, "jabber:iq:register"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/n;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    :goto_0
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 212
    const-string v0, "node"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 213
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/f/ad;->r:Ljava/lang/String;

    .line 216
    :cond_0
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_0

    .line 219
    :cond_1
    iget-object v0, p0, Lkik/a/f/f/ad;->r:Ljava/lang/String;

    if-nez v0, :cond_2

    .line 221
    const/4 v0, 0x0

    iput v0, p0, Lkik/a/f/f/ad;->t:I

    .line 222
    const/16 v0, 0x64

    invoke-virtual {p0, v0}, Lkik/a/f/f/ad;->b(I)V

    .line 227
    :goto_1
    return-void

    .line 225
    :cond_2
    const/16 v0, 0xc8

    iput v0, p0, Lkik/a/f/f/ad;->t:I

    goto :goto_1
.end method

.method protected final b(Lkik/a/f/n;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 155
    const-string v0, "query"

    invoke-virtual {p1, v2, v0}, Lkik/a/f/n;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    const-string v0, "xmlns"

    const-string v1, "jabber:iq:register"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/n;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    iput v3, p0, Lkik/a/f/f/ad;->t:I

    .line 160
    :goto_0
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 161
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_0

    .line 163
    :cond_0
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    .line 164
    const-string v0, "error"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 165
    const-string v0, "cancel"

    const-string v1, "type"

    invoke-virtual {p1, v2, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 166
    iput v3, p0, Lkik/a/f/f/ad;->t:I

    .line 172
    :cond_1
    :goto_1
    const-string v0, "error"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 173
    const-string v0, "already-registered"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 174
    const/16 v0, 0xc9

    invoke-virtual {p0, v0}, Lkik/a/f/f/ad;->c(I)V

    .line 175
    iget-object v0, p0, Lkik/a/f/f/ad;->i:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lkik/a/f/f/ad;->a(Ljava/lang/Object;)V

    .line 203
    :cond_2
    :goto_2
    return-void

    .line 168
    :cond_3
    const-string v0, "modify"

    const-string v1, "type"

    invoke-virtual {p1, v2, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 169
    const/4 v0, 0x1

    iput v0, p0, Lkik/a/f/f/ad;->t:I

    goto :goto_1

    .line 178
    :cond_4
    const-string v0, "username-already-exists"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 179
    const/16 v0, 0xca

    invoke-virtual {p0, v0}, Lkik/a/f/f/ad;->c(I)V

    .line 180
    iget-object v0, p0, Lkik/a/f/f/ad;->k:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lkik/a/f/f/ad;->a(Ljava/lang/Object;)V

    goto :goto_2

    .line 183
    :cond_5
    const-string v0, "captcha-url"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 184
    const/16 v0, 0xcb

    invoke-virtual {p0, v0}, Lkik/a/f/f/ad;->c(I)V

    .line 185
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/f/ad;->n:Ljava/lang/String;

    goto :goto_2

    .line 188
    :cond_6
    const-string v0, "message"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 189
    const/16 v0, 0xcc

    invoke-virtual {p0, v0}, Lkik/a/f/f/ad;->c(I)V

    .line 190
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/f/ad;->o:Ljava/lang/String;

    .line 200
    :cond_7
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_1

    .line 192
    :cond_8
    const-string v0, "invalid-birthday"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 193
    const/16 v0, 0xcd

    invoke-virtual {p0, v0}, Lkik/a/f/f/ad;->c(I)V

    goto :goto_2

    .line 196
    :cond_9
    const-string v0, "username-rejected"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 197
    const/16 v0, 0xce

    invoke-virtual {p0, v0}, Lkik/a/f/f/ad;->c(I)V

    goto :goto_2
.end method

.method protected final b(Lkik/a/f/o;)V
    .locals 3

    .prologue
    .line 103
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 104
    const-string v0, "xmlns"

    const-string v1, "jabber:iq:register"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    const-string v0, "email"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 107
    iget-object v0, p0, Lkik/a/f/f/ad;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lkik/a/f/o;->c(Ljava/lang/String;)Lorg/d/a/c;

    .line 108
    const-string v0, "email"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 109
    const-string v0, "passkey-e"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 110
    iget-object v0, p0, Lkik/a/f/f/ad;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lkik/a/f/o;->c(Ljava/lang/String;)Lorg/d/a/c;

    .line 111
    const-string v0, "passkey-e"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 112
    const-string v0, "passkey-u"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 113
    iget-object v0, p0, Lkik/a/f/f/ad;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lkik/a/f/o;->c(Ljava/lang/String;)Lorg/d/a/c;

    .line 114
    const-string v0, "passkey-u"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 115
    const-string v0, "device-id"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 116
    iget-object v0, p0, Lkik/a/f/f/ad;->j:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lkik/a/f/o;->c(Ljava/lang/String;)Lorg/d/a/c;

    .line 117
    const-string v0, "device-id"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 118
    const-string v0, "username"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 119
    iget-object v0, p0, Lkik/a/f/f/ad;->k:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lkik/a/f/o;->c(Ljava/lang/String;)Lorg/d/a/c;

    .line 120
    const-string v0, "username"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 121
    const-string v0, "first"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 122
    iget-object v0, p0, Lkik/a/f/f/ad;->l:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lkik/a/f/o;->c(Ljava/lang/String;)Lorg/d/a/c;

    .line 123
    const-string v0, "first"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 124
    const-string v0, "last"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 125
    iget-object v0, p0, Lkik/a/f/f/ad;->m:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lkik/a/f/o;->c(Ljava/lang/String;)Lorg/d/a/c;

    .line 126
    const-string v0, "last"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 127
    const-string v0, "birthday"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 128
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 129
    iget-object v1, p0, Lkik/a/f/f/ad;->s:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lkik/a/f/o;->c(Ljava/lang/String;)Lorg/d/a/c;

    .line 130
    const-string v0, "birthday"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 132
    iget-object v0, p0, Lkik/a/f/f/ad;->p:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 133
    const-string v0, "challenge"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 134
    const-string v0, "response"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 135
    iget-object v0, p0, Lkik/a/f/f/ad;->p:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lkik/a/f/o;->c(Ljava/lang/String;)Lorg/d/a/c;

    .line 136
    const-string v0, "response"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 137
    const-string v0, "challenge"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 140
    :cond_0
    iget-object v0, p0, Lkik/a/f/f/ad;->q:Ljava/util/Hashtable;

    if-eqz v0, :cond_1

    .line 141
    iget-object v0, p0, Lkik/a/f/f/ad;->q:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v2

    .line 142
    :goto_0
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 143
    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 144
    iget-object v1, p0, Lkik/a/f/f/ad;->q:Ljava/util/Hashtable;

    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 145
    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 149
    :cond_1
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 150
    return-void
.end method

.method public final d()Lkik/a/d/aa;
    .locals 2

    .prologue
    .line 90
    new-instance v0, Lkik/a/d/aa;

    invoke-direct {v0}, Lkik/a/d/aa;-><init>()V

    .line 92
    iget-object v1, p0, Lkik/a/f/f/ad;->k:Ljava/lang/String;

    iput-object v1, v0, Lkik/a/d/aa;->c:Ljava/lang/String;

    .line 93
    iget-object v1, p0, Lkik/a/f/f/ad;->i:Ljava/lang/String;

    iput-object v1, v0, Lkik/a/d/aa;->a:Ljava/lang/String;

    .line 94
    iget-object v1, p0, Lkik/a/f/f/ad;->l:Ljava/lang/String;

    iput-object v1, v0, Lkik/a/d/aa;->d:Ljava/lang/String;

    .line 95
    iget-object v1, p0, Lkik/a/f/f/ad;->m:Ljava/lang/String;

    iput-object v1, v0, Lkik/a/d/aa;->e:Ljava/lang/String;

    .line 97
    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 231
    iget-object v0, p0, Lkik/a/f/f/ad;->r:Ljava/lang/String;

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 256
    iget-object v0, p0, Lkik/a/f/f/ad;->k:Ljava/lang/String;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 271
    iget-object v0, p0, Lkik/a/f/f/ad;->n:Ljava/lang/String;

    return-object v0
.end method

.method public final n()Ljava/lang/String;
    .locals 1

    .prologue
    .line 276
    iget-object v0, p0, Lkik/a/f/f/ad;->o:Ljava/lang/String;

    return-object v0
.end method
