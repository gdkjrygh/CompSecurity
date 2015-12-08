.class public abstract Lkik/a/f/c/c;
.super Lkik/a/f/c/g;
.source "SourceFile"


# static fields
.field private static final k:Lorg/c/b;


# instance fields
.field protected a:Lkik/a/d/j;

.field protected b:Lkik/a/d/j;

.field protected c:Lkik/a/d/j;

.field protected d:Ljava/lang/String;

.field protected e:Ljava/lang/String;

.field protected f:J

.field protected g:Z

.field protected h:Z

.field protected i:Ljava/util/List;

.field private j:Z

.field private l:[B

.field private m:Lorg/spongycastle/jce/interfaces/ECPublicKey;

.field private n:Z

.field private o:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 50
    const-string v0, "IncomingMessageAbstract"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/a/f/c/c;->k:Lorg/c/b;

    return-void
.end method

.method protected constructor <init>(I)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 59
    invoke-direct {p0, p1}, Lkik/a/f/c/g;-><init>(I)V

    .line 44
    iput-boolean v0, p0, Lkik/a/f/c/c;->g:Z

    .line 45
    iput-boolean v0, p0, Lkik/a/f/c/c;->h:Z

    .line 47
    iput-boolean v0, p0, Lkik/a/f/c/c;->j:Z

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/a/f/c/c;->i:Ljava/util/List;

    .line 60
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 1

    .prologue
    .line 258
    iget-object v0, p0, Lkik/a/f/c/c;->c:Lkik/a/d/j;

    if-nez v0, :cond_0

    .line 259
    iget-object v0, p0, Lkik/a/f/c/c;->b:Lkik/a/d/j;

    iput-object v0, p0, Lkik/a/f/c/c;->c:Lkik/a/d/j;

    .line 261
    :cond_0
    return-void
.end method

.method protected a(Lkik/a/f/n;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 243
    const-string v0, "request"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "kik:message:receipt"

    const-string v1, "xmlns"

    invoke-virtual {p1, v2, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 244
    const-string v0, "true"

    const-string v1, "d"

    invoke-virtual {p1, v2, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Lkik/a/f/c/c;->g:Z

    .line 245
    const-string v0, "true"

    const-string v1, "r"

    invoke-virtual {p1, v2, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Lkik/a/f/c/c;->h:Z

    .line 254
    :goto_0
    return-void

    .line 247
    :cond_0
    const-string v0, "g"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 248
    const-string v0, "jid"

    invoke-virtual {p1, v2, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/a/d/j;->a(Ljava/lang/String;)Lkik/a/d/j;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/c/c;->c:Lkik/a/d/j;

    goto :goto_0

    .line 252
    :cond_1
    invoke-virtual {p1}, Lkik/a/f/n;->skipSubTree()V

    goto :goto_0
.end method

.method public final a(Lkik/a/f/n;Ljava/security/KeyPair;Lkik/a/e/o;)V
    .locals 12

    .prologue
    const/16 v11, 0x14

    const/4 v5, 0x0

    const/4 v4, 0x1

    const/4 v10, 0x0

    .line 85
    :try_start_0
    const-string v0, "message"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "msg"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 89
    new-instance v0, Lorg/d/a/b;

    const-string v1, "Not at start of message"

    invoke-direct {v0, v1}, Lorg/d/a/b;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Lkik/a/f/g; {:try_start_0 .. :try_end_0} :catch_0

    .line 223
    :catch_0
    move-exception v0

    iput-boolean v4, p0, Lkik/a/f/c/c;->n:Z

    .line 224
    iput-boolean v4, p0, Lkik/a/f/c/c;->j:Z

    .line 226
    :goto_0
    const-string v0, "message"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_14

    const-string v0, "msg"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_14

    .line 229
    const-string v0, "g"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 230
    const-string v0, "jid"

    invoke-virtual {p1, v10, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/a/d/j;->a(Ljava/lang/String;)Lkik/a/d/j;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/c/c;->c:Lkik/a/d/j;

    .line 234
    :cond_0
    invoke-virtual {p1, v4}, Lkik/a/f/n;->a(Z)I

    goto :goto_0

    .line 92
    :cond_1
    :try_start_1
    const-string v0, "from"

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/a/d/j;->a(Ljava/lang/String;)Lkik/a/d/j;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/c/c;->b:Lkik/a/d/j;

    .line 93
    const-string v0, "to"

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 94
    if-eqz v0, :cond_2

    .line 95
    invoke-static {v0}, Lkik/a/d/j;->a(Ljava/lang/String;)Lkik/a/d/j;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/c/c;->a:Lkik/a/d/j;

    .line 97
    :cond_2
    const-string v0, "id"

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/c/c;->e:Ljava/lang/String;

    .line 100
    iget-object v0, p0, Lkik/a/f/c/c;->e:Ljava/lang/String;

    if-nez v0, :cond_3

    .line 101
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    move-result-wide v0

    const/16 v2, 0x10

    invoke-static {v0, v1, v2}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/c/c;->e:Ljava/lang/String;

    .line 106
    :cond_3
    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lkik/a/f/c/c;->f:J

    .line 108
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/a/f/c/c;->d:Ljava/lang/String;

    .line 110
    const-string v0, ""

    .line 112
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 113
    if-eqz p2, :cond_15

    .line 114
    invoke-virtual {p2}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v0

    invoke-interface {v0}, Ljava/security/PublicKey;->getEncoded()[B

    move-result-object v0

    invoke-static {v0}, Lcom/kik/m/e;->b([B)Ljava/lang/String;

    move-result-object v0

    move-object v6, v0

    .line 116
    :goto_1
    const-wide/16 v0, 0x0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    sub-long v2, v8, v2

    add-long/2addr v0, v2

    .line 118
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    move-wide v2, v0

    .line 119
    :goto_2
    const-string v0, "message"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_13

    const-string v0, "msg"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_13

    .line 120
    const-string v0, "keys"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 121
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 122
    :cond_4
    :goto_3
    const-string v0, "keys"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 123
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    .line 125
    const-string v0, "s"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z
    :try_end_1
    .catch Lkik/a/f/g; {:try_start_1 .. :try_end_1} :catch_0

    move-result v0

    if-eqz v0, :cond_5

    .line 128
    :try_start_2
    const-string v0, "pub"

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lcom/kik/m/e;->a(Ljava/lang/String;I)[B

    move-result-object v0

    invoke-static {v0}, Lkik/a/h/h;->a([B)Lorg/spongycastle/jce/interfaces/ECPublicKey;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/c/c;->m:Lorg/spongycastle/jce/interfaces/ECPublicKey;
    :try_end_2
    .catch Ljava/security/NoSuchProviderException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Lkik/a/f/g; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    .line 130
    :catch_1
    move-exception v0

    .line 131
    :try_start_3
    new-instance v1, Lkik/a/f/g;

    invoke-direct {v1, v0}, Lkik/a/f/g;-><init>(Ljava/lang/Exception;)V

    throw v1

    .line 133
    :catch_2
    move-exception v0

    .line 134
    new-instance v1, Lkik/a/f/g;

    invoke-direct {v1, v0}, Lkik/a/f/g;-><init>(Ljava/lang/Exception;)V

    throw v1

    .line 136
    :catch_3
    move-exception v0

    .line 137
    new-instance v1, Lkik/a/f/g;

    invoke-direct {v1, v0}, Lkik/a/f/g;-><init>(Ljava/lang/Exception;)V

    throw v1

    .line 140
    :cond_5
    const-string v0, "r"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 142
    const-string v0, "pub"

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 143
    const-string v1, "key"

    const/4 v7, 0x0

    invoke-virtual {p1, v7, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 145
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 146
    const/16 v0, 0x10

    invoke-static {v1, v0}, Lcom/kik/m/e;->a(Ljava/lang/String;I)[B

    move-result-object v1

    .line 148
    if-eqz p2, :cond_6

    if-eqz p3, :cond_6

    .line 149
    iget-object v7, p0, Lkik/a/f/c/c;->m:Lorg/spongycastle/jce/interfaces/ECPublicKey;

    invoke-virtual {p2}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/interfaces/ECPrivateKey;

    invoke-interface {p3, v1, v7, v0}, Lkik/a/e/o;->b([BLorg/spongycastle/jce/interfaces/ECPublicKey;Lorg/spongycastle/jce/interfaces/ECPrivateKey;)[B

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/c/c;->l:[B

    .line 152
    :cond_6
    iget-object v0, p0, Lkik/a/f/c/c;->l:[B

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a([B)V

    goto :goto_3

    .line 156
    :cond_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v8

    add-long/2addr v2, v0

    move-wide v0, v2

    .line 215
    :goto_4
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    move-wide v2, v0

    goto/16 :goto_2

    .line 158
    :cond_8
    const-string v0, "body"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 159
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/c/c;->d:Ljava/lang/String;

    .line 160
    iget-object v0, p0, Lkik/a/f/c/c;->d:Ljava/lang/String;

    if-eqz v0, :cond_12

    iget-object v0, p0, Lkik/a/f/c/c;->d:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x800

    if-le v0, v1, :cond_12

    .line 161
    iget-object v0, p0, Lkik/a/f/c/c;->d:Ljava/lang/String;

    const/4 v1, 0x0

    const/16 v7, 0x800

    invoke-virtual {v0, v1, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/c/c;->d:Ljava/lang/String;

    move-wide v0, v2

    goto :goto_4

    .line 164
    :cond_9
    const-string v0, "kik"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 165
    const-string v0, "timestamp"

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 166
    if-nez v1, :cond_a

    .line 167
    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v0

    const-wide v8, 0x496cebb800L

    sub-long/2addr v0, v8

    iput-wide v0, p0, Lkik/a/f/c/c;->f:J

    .line 187
    :goto_5
    const-string v0, "false"

    const-string v1, "qos"

    const/4 v7, 0x0

    invoke-virtual {p1, v7, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    move v0, v4

    :goto_6
    iput-boolean v0, p0, Lkik/a/f/c/c;->j:Z
    :try_end_3
    .catch Lkik/a/f/g; {:try_start_3 .. :try_end_3} :catch_0

    move-wide v0, v2

    .line 188
    goto :goto_4

    .line 174
    :cond_a
    :try_start_4
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v8

    iput-wide v8, p0, Lkik/a/f/c/c;->f:J
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Lkik/a/f/g; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_5

    .line 176
    :catch_4
    move-exception v0

    .line 178
    :try_start_5
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    float-to-long v8, v1

    iput-wide v8, p0, Lkik/a/f/c/c;->f:J
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_5
    .catch Lkik/a/f/g; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_5

    .line 181
    :catch_5
    move-exception v1

    :try_start_6
    new-instance v1, Lorg/d/a/b;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Number format exception in timestamp: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/d/a/b;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_b
    move v0, v5

    .line 187
    goto :goto_6

    .line 189
    :cond_c
    const-string v0, "suggested-responses"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 190
    const-string v0, "suggested-responses"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_d

    .line 191
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    .line 193
    :cond_d
    :goto_7
    const-string v0, "suggested-responses"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_12

    .line 194
    iget-object v0, p0, Lkik/a/f/c/c;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x7

    if-ge v0, v1, :cond_f

    .line 195
    invoke-virtual {p1}, Lkik/a/f/n;->getName()Ljava/lang/String;

    move-result-object v1

    .line 196
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v0

    .line 197
    const-string v7, "text"

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_10

    .line 198
    const-string v7, "\n"

    const-string v8, " "

    invoke-virtual {v0, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 199
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    if-le v7, v11, :cond_e

    .line 200
    const/4 v7, 0x0

    const/16 v8, 0x14

    invoke-virtual {v0, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 202
    :cond_e
    iget-object v7, p0, Lkik/a/f/c/c;->i:Ljava/util/List;

    new-instance v8, Lkik/a/d/z;

    invoke-direct {v8, v1, v0}, Lkik/a/d/z;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 208
    :cond_f
    :goto_8
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_7

    .line 204
    :cond_10
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_f

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    const v8, 0x1f400

    if-gt v7, v8, :cond_f

    .line 205
    iget-object v7, p0, Lkik/a/f/c/c;->i:Ljava/util/List;

    new-instance v8, Lkik/a/d/z;

    invoke-direct {v8, v1, v0}, Lkik/a/d/z;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 211
    :cond_11
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 212
    invoke-virtual {p0, p1}, Lkik/a/f/c/c;->a(Lkik/a/f/n;)V

    :cond_12
    move-wide v0, v2

    goto/16 :goto_4

    .line 219
    :cond_13
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a([B)V

    .line 220
    iput-wide v2, p0, Lkik/a/f/c/c;->o:J
    :try_end_6
    .catch Lkik/a/f/g; {:try_start_6 .. :try_end_6} :catch_0

    .line 238
    :cond_14
    invoke-virtual {p0}, Lkik/a/f/c/c;->a()V

    .line 239
    return-void

    :cond_15
    move-object v6, v0

    goto/16 :goto_1
.end method

.method public final c()[B
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lkik/a/f/c/c;->l:[B

    return-object v0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 265
    iget-boolean v0, p0, Lkik/a/f/c/c;->n:Z

    return v0
.end method

.method public final e()J
    .locals 2

    .prologue
    .line 270
    iget-wide v0, p0, Lkik/a/f/c/c;->o:J

    return-wide v0
.end method

.method public final f()Z
    .locals 1

    .prologue
    .line 275
    iget-boolean v0, p0, Lkik/a/f/c/c;->j:Z

    return v0
.end method

.method public final g()Z
    .locals 1

    .prologue
    .line 280
    iget-boolean v0, p0, Lkik/a/f/c/c;->g:Z

    return v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 285
    iget-object v0, p0, Lkik/a/f/c/c;->b:Lkik/a/d/j;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lkik/a/f/c/c;->b:Lkik/a/d/j;

    invoke-virtual {v0}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    .prologue
    .line 290
    iget-object v0, p0, Lkik/a/f/c/c;->c:Lkik/a/d/j;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lkik/a/f/c/c;->c:Lkik/a/d/j;

    invoke-virtual {v0}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    .prologue
    .line 300
    iget-object v0, p0, Lkik/a/f/c/c;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final k()J
    .locals 2

    .prologue
    .line 305
    iget-wide v0, p0, Lkik/a/f/c/c;->f:J

    return-wide v0
.end method
