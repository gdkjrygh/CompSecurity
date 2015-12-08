.class public final Lkik/a/f/f/v;
.super Lkik/a/f/f/z;
.source "SourceFile"


# instance fields
.field protected final a:Lkik/a/d/s;

.field protected final b:Ljava/lang/String;

.field private final c:Lkik/a/e/o;

.field private d:[B

.field private e:Ljava/util/List;

.field private i:Ljava/security/KeyPair;

.field private j:Ljava/lang/String;

.field private k:J


# direct methods
.method private constructor <init>(Lkik/a/d/s;Lkik/a/f/j;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/security/KeyPair;Lkik/a/e/o;)V
    .locals 2

    .prologue
    .line 61
    invoke-direct {p0, p2}, Lkik/a/f/f/z;-><init>(Lkik/a/f/j;)V

    .line 63
    invoke-virtual {p1}, Lkik/a/d/s;->o()[B

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/f/v;->d:[B

    .line 65
    iput-object p5, p0, Lkik/a/f/f/v;->e:Ljava/util/List;

    .line 66
    iput-object p6, p0, Lkik/a/f/f/v;->i:Ljava/security/KeyPair;

    .line 67
    iput-object p7, p0, Lkik/a/f/f/v;->c:Lkik/a/e/o;

    .line 69
    invoke-static {p5, p6}, Lkik/a/f/f/v;->a(Ljava/util/List;Ljava/security/KeyPair;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/a/f/f/v;->d:[B

    .line 73
    :cond_0
    iput-object p3, p0, Lkik/a/f/f/v;->j:Ljava/lang/String;

    .line 75
    invoke-virtual {p1}, Lkik/a/d/s;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 76
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t send an outgoing message from somebody else"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 78
    :cond_1
    invoke-virtual {p1}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lkik/a/d/s;->h()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    .line 79
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t send message with no identifier"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 81
    :cond_3
    iput-object p1, p0, Lkik/a/f/f/v;->a:Lkik/a/d/s;

    .line 82
    iput-object p4, p0, Lkik/a/f/f/v;->b:Ljava/lang/String;

    .line 83
    return-void
.end method

.method public static a(Lkik/a/d/s;Ljava/util/List;Ljava/security/KeyPair;Lkik/a/e/o;Lkik/a/f/j;)Lkik/a/f/f/v;
    .locals 8

    .prologue
    .line 48
    new-instance v0, Lkik/a/f/f/v;

    const-string v3, "groupchat"

    const-string v4, "kik:groups"

    move-object v1, p0

    move-object v2, p4

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    invoke-direct/range {v0 .. v7}, Lkik/a/f/f/v;-><init>(Lkik/a/d/s;Lkik/a/f/j;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/security/KeyPair;Lkik/a/e/o;)V

    .line 49
    return-object v0
.end method

.method public static a(Ljava/util/List;Ljava/security/KeyPair;)Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 296
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    move v0, v1

    .line 307
    :goto_0
    return v0

    .line 300
    :cond_1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/interfaces/ECPublicKey;

    .line 301
    if-nez v0, :cond_2

    move v0, v1

    .line 302
    goto :goto_0

    .line 307
    :cond_3
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static b(Lkik/a/d/s;Ljava/util/List;Ljava/security/KeyPair;Lkik/a/e/o;Lkik/a/f/j;)Lkik/a/f/f/v;
    .locals 8

    .prologue
    .line 54
    new-instance v0, Lkik/a/f/f/v;

    const-string v3, "chat"

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p4

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    invoke-direct/range {v0 .. v7}, Lkik/a/f/f/v;-><init>(Lkik/a/d/s;Lkik/a/f/j;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/security/KeyPair;Lkik/a/e/o;)V

    .line 55
    iget-object v1, v0, Lkik/a/f/f/v;->j:Ljava/lang/String;

    const-string v2, "chat"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lkik/a/f/f/v;->a:Lkik/a/d/s;

    const-class v2, Lkik/a/d/a/f;

    invoke-static {v1, v2}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v1, "is-typing"

    iput-object v1, v0, Lkik/a/f/f/v;->j:Ljava/lang/String;

    .line 56
    :cond_0
    return-object v0
.end method

.method private b(Lkik/a/f/o;)V
    .locals 8

    .prologue
    .line 231
    iget-object v0, p0, Lkik/a/f/f/v;->a:Lkik/a/d/s;

    invoke-virtual {v0}, Lkik/a/d/s;->l()Ljava/util/Vector;

    move-result-object v2

    .line 232
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 233
    invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/g;

    invoke-static {v0}, Lkik/a/f/e/h;->a(Lkik/a/d/a/g;)Lkik/a/f/e/i;

    move-result-object v3

    .line 234
    if-eqz v3, :cond_0

    .line 235
    iget-wide v4, p0, Lkik/a/f/f/v;->k:J

    invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/g;

    invoke-interface {v3, p1, v0}, Lkik/a/f/e/i;->a(Lkik/a/f/o;Lkik/a/d/a/g;)J

    move-result-wide v6

    add-long/2addr v4, v6

    iput-wide v4, p0, Lkik/a/f/f/v;->k:J

    .line 232
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 238
    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Lkik/a/f/o;)V
    .locals 10

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 115
    iget-object v2, p0, Lkik/a/f/f/v;->a:Lkik/a/d/s;

    invoke-static {v2}, Lkik/a/d/a/g;->c(Lkik/a/d/s;)I

    move-result v2

    .line 116
    and-int/lit8 v3, v2, 0x4

    if-eqz v3, :cond_2

    move v5, v0

    .line 117
    :goto_0
    and-int/lit8 v3, v2, 0x8

    if-eqz v3, :cond_3

    move v4, v0

    .line 118
    :goto_1
    and-int/lit8 v3, v2, 0x1

    if-eqz v3, :cond_4

    move v3, v0

    .line 119
    :goto_2
    and-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_5

    move v2, v0

    .line 121
    :goto_3
    const-string v6, "message"

    invoke-virtual {p1, v6}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 122
    const-string v6, "type"

    iget-object v7, p0, Lkik/a/f/f/v;->j:Ljava/lang/String;

    invoke-virtual {p1, v6, v7}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    iget-object v6, p0, Lkik/a/f/f/v;->b:Ljava/lang/String;

    if-eqz v6, :cond_0

    .line 124
    const-string v6, "xmlns"

    iget-object v7, p0, Lkik/a/f/f/v;->b:Ljava/lang/String;

    invoke-virtual {p1, v6, v7}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    :cond_0
    const-string v6, "to"

    iget-object v7, p0, Lkik/a/f/f/v;->a:Lkik/a/d/s;

    invoke-virtual {v7}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v6, v7}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    const-string v6, "id"

    iget-object v7, p0, Lkik/a/f/f/v;->a:Lkik/a/d/s;

    invoke-virtual {v7}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v6, v7}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    iget-boolean v6, p0, Lkik/a/f/f/v;->f:Z

    if-eqz v6, :cond_1

    if-eqz v5, :cond_1

    .line 131
    const-string v6, "cts"

    iget-wide v8, p0, Lkik/a/f/f/v;->g:J

    invoke-static {v8, v9}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v6, v7}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    :cond_1
    iget-object v6, p0, Lkik/a/f/f/v;->d:[B

    if-eqz v6, :cond_6

    :goto_4
    if-eqz v0, :cond_8

    .line 137
    :try_start_0
    iget-object v6, p0, Lkik/a/f/f/v;->d:[B

    const-string v0, "keys"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    const-string v0, "s"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    const-string v0, "pub"

    iget-object v1, p0, Lkik/a/f/f/v;->i:Ljava/security/KeyPair;

    invoke-virtual {v1}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v1

    invoke-interface {v1}, Ljava/security/PublicKey;->getEncoded()[B

    move-result-object v1

    invoke-static {v1}, Lcom/kik/m/e;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "s"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lkik/a/f/f/v;->c:Lkik/a/e/o;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lkik/a/f/f/v;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/interfaces/ECPublicKey;

    iget-object v8, p0, Lkik/a/f/f/v;->c:Lkik/a/e/o;

    iget-object v1, p0, Lkik/a/f/f/v;->i:Ljava/security/KeyPair;

    invoke-virtual {v1}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/jce/interfaces/ECPrivateKey;

    invoke-interface {v8, v6, v0, v1}, Lkik/a/e/o;->a([BLorg/spongycastle/jce/interfaces/ECPublicKey;Lorg/spongycastle/jce/interfaces/ECPrivateKey;)[B

    move-result-object v1

    const-string v8, "r"

    invoke-virtual {p1, v8}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    const-string v8, "key"

    invoke-static {v1}, Lcom/kik/m/e;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v8, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "pub"

    invoke-interface {v0}, Lorg/spongycastle/jce/interfaces/ECPublicKey;->getEncoded()[B

    move-result-object v0

    invoke-static {v0}, Lcom/kik/m/e;->b([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "r"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/NoSuchProviderException; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_5

    .line 139
    :catch_0
    move-exception v0

    .line 140
    new-instance v1, Lkik/a/f/g;

    invoke-direct {v1, v0}, Lkik/a/f/g;-><init>(Ljava/lang/Exception;)V

    throw v1

    :cond_2
    move v5, v1

    .line 116
    goto/16 :goto_0

    :cond_3
    move v4, v1

    .line 117
    goto/16 :goto_1

    :cond_4
    move v3, v1

    .line 118
    goto/16 :goto_2

    :cond_5
    move v2, v1

    .line 119
    goto/16 :goto_3

    :cond_6
    move v0, v1

    .line 134
    goto :goto_4

    .line 137
    :cond_7
    :try_start_1
    const-string v0, "keys"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/security/InvalidKeyException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/NoSuchProviderException; {:try_start_1 .. :try_end_1} :catch_2

    .line 149
    iget-object v0, p0, Lkik/a/f/f/v;->d:[B

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a([B)V

    .line 152
    :cond_8
    iget-object v0, p0, Lkik/a/f/f/v;->a:Lkik/a/d/s;

    invoke-virtual {v0}, Lkik/a/d/s;->a()Ljava/lang/String;

    move-result-object v0

    .line 154
    if-eqz v0, :cond_9

    .line 155
    const-string v1, "body"

    invoke-virtual {p1, v1}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 157
    invoke-virtual {p1}, Lkik/a/f/o;->a()V

    .line 158
    invoke-virtual {p1, v0}, Lkik/a/f/o;->c(Ljava/lang/String;)Lorg/d/a/c;

    .line 159
    iget-wide v6, p0, Lkik/a/f/f/v;->k:J

    invoke-virtual {p1}, Lkik/a/f/o;->b()J

    move-result-wide v8

    add-long/2addr v6, v8

    iput-wide v6, p0, Lkik/a/f/f/v;->k:J

    .line 161
    const-string v1, "body"

    invoke-virtual {p1, v1}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 164
    :cond_9
    iget-object v1, p0, Lkik/a/f/f/v;->a:Lkik/a/d/s;

    invoke-virtual {v1}, Lkik/a/d/s;->r()I

    move-result v1

    .line 165
    sget v6, Lkik/a/d/s$a;->b:I

    if-ne v1, v6, :cond_a

    .line 166
    const-string v1, "suggested-response"

    const-string v6, ""

    invoke-virtual {p1, v1, v6}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    :cond_a
    if-eqz v0, :cond_c

    .line 174
    invoke-static {v0}, Lkik/a/h/i;->e(Ljava/lang/String;)I

    move-result v1

    .line 176
    const/16 v6, 0xa

    if-le v1, v6, :cond_b

    .line 177
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v0}, Lkik/a/h/i;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "..."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 180
    :cond_b
    const-string v1, "preview"

    invoke-virtual {p1, v1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    :cond_c
    iget-wide v0, p0, Lkik/a/f/f/v;->g:J

    invoke-static {p1, v4, v5, v0, v1}, Lkik/a/f/t;->a(Lkik/a/f/o;ZZJ)V

    .line 186
    if-nez v3, :cond_d

    if-eqz v2, :cond_e

    .line 187
    :cond_d
    const-string v0, "request"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 188
    const-string v0, "xmlns"

    const-string v1, "kik:message:receipt"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    const-string v1, "r"

    if-eqz v2, :cond_f

    const-string v0, "true"

    :goto_6
    invoke-virtual {p1, v1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    const-string v1, "d"

    if-eqz v3, :cond_10

    const-string v0, "true"

    :goto_7
    invoke-virtual {p1, v1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    const-string v0, "request"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 194
    :cond_e
    invoke-direct {p0, p1}, Lkik/a/f/f/v;->b(Lkik/a/f/o;)V

    .line 196
    const-string v0, "message"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 197
    invoke-virtual {p1}, Lkik/a/f/o;->c()V

    .line 200
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a([B)V

    .line 202
    iget-object v0, p0, Lkik/a/f/f/v;->a:Lkik/a/d/s;

    iget-wide v2, p0, Lkik/a/f/f/v;->k:J

    invoke-virtual {v0, v2, v3}, Lkik/a/d/s;->a(J)V

    .line 203
    return-void

    .line 142
    :catch_1
    move-exception v0

    .line 143
    new-instance v1, Lkik/a/f/g;

    invoke-direct {v1, v0}, Lkik/a/f/g;-><init>(Ljava/lang/Exception;)V

    throw v1

    .line 145
    :catch_2
    move-exception v0

    .line 146
    new-instance v1, Lkik/a/f/g;

    invoke-direct {v1, v0}, Lkik/a/f/g;-><init>(Ljava/lang/Exception;)V

    throw v1

    .line 189
    :cond_f
    const-string v0, "false"

    goto :goto_6

    .line 190
    :cond_10
    const-string v0, "false"

    goto :goto_7
.end method

.method public final a(J)Z
    .locals 1

    .prologue
    .line 103
    const/4 v0, 0x0

    return v0
.end method

.method public final a(Lkik/a/f/f/z;)Z
    .locals 2

    .prologue
    .line 274
    instance-of v0, p1, Lkik/a/f/f/v;

    if-eqz v0, :cond_0

    .line 275
    check-cast p1, Lkik/a/f/f/v;

    .line 276
    iget-object v0, p0, Lkik/a/f/f/v;->a:Lkik/a/d/s;

    const-class v1, Lkik/a/d/a/f;

    invoke-static {v0, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lkik/a/f/f/v;->a:Lkik/a/d/s;

    const-class v1, Lkik/a/d/a/f;

    invoke-static {v0, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 278
    iget-object v0, p0, Lkik/a/f/f/v;->a:Lkik/a/d/s;

    invoke-virtual {v0}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lkik/a/f/f/v;->a:Lkik/a/d/s;

    invoke-virtual {v1}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 281
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c()Z
    .locals 2

    .prologue
    .line 287
    iget-object v0, p0, Lkik/a/f/f/v;->a:Lkik/a/d/s;

    const-class v1, Lkik/a/d/a/f;

    invoke-static {v0, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 288
    const/4 v0, 0x0

    .line 290
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 92
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/a/f/f/v;->d:[B

    .line 93
    return-void
.end method

.method public final e()Lkik/a/d/s;
    .locals 1

    .prologue
    .line 242
    iget-object v0, p0, Lkik/a/f/f/v;->a:Lkik/a/d/s;

    return-object v0
.end method

.method public final l_()Ljava/lang/String;
    .locals 1

    .prologue
    .line 268
    iget-object v0, p0, Lkik/a/f/f/v;->a:Lkik/a/d/s;

    invoke-virtual {v0}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final m_()J
    .locals 2

    .prologue
    .line 109
    const-wide/16 v0, -0x1

    return-wide v0
.end method
