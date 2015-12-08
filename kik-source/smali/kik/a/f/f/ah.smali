.class public final Lkik/a/f/f/ah;
.super Lkik/a/f/f/y;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/a/f/f/ah$a;,
        Lkik/a/f/f/ah$b;
    }
.end annotation


# static fields
.field private static final a:Lorg/c/b;


# instance fields
.field private b:Lkik/a/e/o;

.field private i:Ljava/security/KeyPair;

.field private final j:Z

.field private final k:Ljava/util/Map;

.field private final l:Ljava/util/List;

.field private m:Ljava/util/Vector;

.field private n:J

.field private o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    const-string v0, "QosRequest"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/a/f/f/ah;->a:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Lkik/a/f/j;Ljava/security/KeyPair;Lkik/a/e/o;)V
    .locals 1

    .prologue
    .line 95
    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, p3, v0}, Lkik/a/f/f/ah;-><init>(Lkik/a/f/j;Ljava/security/KeyPair;Lkik/a/e/o;Z)V

    .line 96
    return-void
.end method

.method public constructor <init>(Lkik/a/f/j;Ljava/security/KeyPair;Lkik/a/e/o;Z)V
    .locals 2

    .prologue
    .line 100
    const-string v0, "set"

    invoke-direct {p0, p1, v0}, Lkik/a/f/f/y;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    .line 89
    const-wide/32 v0, 0x36ee80

    iput-wide v0, p0, Lkik/a/f/f/ah;->n:J

    .line 91
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/a/f/f/ah;->o:Z

    .line 102
    iput-object p2, p0, Lkik/a/f/f/ah;->i:Ljava/security/KeyPair;

    .line 103
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lkik/a/f/f/ah;->k:Ljava/util/Map;

    .line 104
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/a/f/f/ah;->l:Ljava/util/List;

    .line 105
    iput-boolean p4, p0, Lkik/a/f/f/ah;->j:Z

    .line 106
    iput-object p3, p0, Lkik/a/f/f/ah;->b:Lkik/a/e/o;

    .line 107
    return-void
.end method


# virtual methods
.method public final a(Lkik/a/f/c/c;ZZ)V
    .locals 4

    .prologue
    .line 165
    invoke-virtual {p1}, Lkik/a/f/c/c;->h()Ljava/lang/String;

    move-result-object v2

    .line 166
    const/4 v0, 0x0

    .line 167
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lkik/a/f/c/c;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lkik/a/f/c/c;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 168
    if-eqz p2, :cond_0

    .line 171
    invoke-virtual {p1}, Lkik/a/f/c/c;->i()Ljava/lang/String;

    move-result-object v0

    .line 175
    :cond_0
    iget-object v1, p0, Lkik/a/f/f/ah;->k:Ljava/util/Map;

    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 176
    new-instance v1, Lkik/a/f/f/ah$b;

    invoke-direct {v1, p3, v2, v0}, Lkik/a/f/f/ah$b;-><init>(ZLjava/lang/String;Ljava/lang/String;)V

    .line 177
    iget-object v0, p0, Lkik/a/f/f/ah;->k:Ljava/util/Map;

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, v1

    .line 183
    :goto_0
    iget-boolean v1, v0, Lkik/a/f/f/ah$b;->b:Z

    if-eq v1, p3, :cond_2

    .line 184
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Attempting to block a message for an unblocked user"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 180
    :cond_1
    iget-object v0, p0, Lkik/a/f/f/ah;->k:Ljava/util/Map;

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/f/f/ah$b;

    goto :goto_0

    .line 188
    :cond_2
    iget-object v0, v0, Lkik/a/f/f/ah$b;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 189
    return-void
.end method

.method protected final a(Lkik/a/f/n;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 208
    iget-boolean v0, p0, Lkik/a/f/f/ah;->j:Z

    if-eqz v0, :cond_0

    .line 209
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lkik/a/f/f/ah;->m:Ljava/util/Vector;

    .line 212
    :cond_0
    const-string v0, "query"

    invoke-virtual {p1, v6, v0}, Lkik/a/f/n;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    const-string v0, "xmlns"

    const-string v1, "kik:iq:QoS"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/n;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    :goto_0
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "iq"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 216
    iget-boolean v0, p0, Lkik/a/f/f/ah;->j:Z

    if-eqz v0, :cond_3

    const-string v0, "msg"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 217
    const-string v0, "from"

    invoke-virtual {p1, v6, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 218
    const-string v1, "id"

    invoke-virtual {p1, v6, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 221
    :try_start_0
    iget-object v2, p0, Lkik/a/f/f/ah;->i:Ljava/security/KeyPair;

    iget-object v3, p0, Lkik/a/f/f/ah;->b:Lkik/a/e/o;

    invoke-static {p1, v2, v3}, Lkik/a/f/c/e;->a(Lkik/a/f/n;Ljava/security/KeyPair;Lkik/a/e/o;)Lkik/a/f/c/c;

    move-result-object v2

    .line 222
    iget-object v3, p0, Lkik/a/f/f/ah;->m:Ljava/util/Vector;

    invoke-virtual {v3, v2}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 245
    :cond_1
    :goto_1
    iget-boolean v0, p0, Lkik/a/f/f/ah;->j:Z

    if-eqz v0, :cond_2

    const-string v0, "history"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 246
    const-string v0, "1"

    const-string v1, "more"

    invoke-virtual {p1, v6, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 247
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/a/f/f/ah;->o:Z

    .line 250
    :cond_2
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_0

    .line 225
    :catch_0
    move-exception v2

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    .line 226
    iget-object v2, p0, Lkik/a/f/f/ah;->l:Ljava/util/List;

    new-instance v3, Lkik/a/f/c/f;

    invoke-static {v0}, Lkik/a/d/j;->a(Ljava/lang/String;)Lkik/a/d/j;

    move-result-object v4

    invoke-static {v0}, Lkik/a/d/j;->a(Ljava/lang/String;)Lkik/a/d/j;

    move-result-object v0

    invoke-direct {v3, v1, v4, v0}, Lkik/a/f/c/f;-><init>(Ljava/lang/String;Lkik/a/d/j;Lkik/a/d/j;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 230
    :cond_3
    const-string v0, "polling"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 232
    const-string v0, "interval"

    invoke-virtual {p1, v6, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 233
    :try_start_1
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 238
    int-to-long v2, v1

    const-wide/32 v4, 0xea60

    mul-long/2addr v2, v4

    iput-wide v2, p0, Lkik/a/f/f/ah;->n:J
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    .line 242
    :catch_1
    move-exception v1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to parse polling interval, got \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 253
    :cond_4
    iget-boolean v0, p0, Lkik/a/f/f/ah;->j:Z

    if-eqz v0, :cond_5

    .line 255
    iget-object v0, p0, Lkik/a/f/f/ah;->m:Ljava/util/Vector;

    new-instance v1, Lkik/a/f/f/ah$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lkik/a/f/f/ah$a;-><init>(Lkik/a/f/f/ah;B)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 257
    :cond_5
    return-void
.end method

.method public final a(Lkik/a/f/f/z;)Z
    .locals 1

    .prologue
    .line 196
    iget-object v0, p0, Lkik/a/f/f/ah;->k:Ljava/util/Map;

    if-nez v0, :cond_0

    instance-of v0, p1, Lkik/a/f/f/ah;

    if-eqz v0, :cond_0

    check-cast p1, Lkik/a/f/f/ah;

    iget-object v0, p1, Lkik/a/f/f/ah;->k:Ljava/util/Map;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected final b(Lkik/a/f/o;)V
    .locals 6

    .prologue
    .line 262
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 263
    const-string v0, "xmlns"

    const-string v1, "kik:iq:QoS"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 265
    const-string v0, "msg-acks"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 267
    iget-object v0, p0, Lkik/a/f/f/ah;->k:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/f/f/ah$b;

    .line 268
    iget-object v1, v0, Lkik/a/f/f/ah$b;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 269
    const-string v1, "sender"

    invoke-virtual {p1, v1}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 270
    const-string v1, "jid"

    iget-object v2, v0, Lkik/a/f/f/ah$b;->d:Ljava/lang/String;

    invoke-virtual {p1, v1, v2}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    iget-boolean v1, v0, Lkik/a/f/f/ah$b;->b:Z

    if-eqz v1, :cond_1

    .line 274
    const-string v1, "b"

    const-string v2, "1"

    invoke-virtual {p1, v1, v2}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    :cond_1
    iget-object v1, v0, Lkik/a/f/f/ah$b;->c:Ljava/lang/String;

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    :goto_1
    if-eqz v1, :cond_2

    .line 279
    const-string v1, "g"

    iget-object v2, v0, Lkik/a/f/f/ah$b;->c:Ljava/lang/String;

    invoke-virtual {p1, v1, v2}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    :cond_2
    iget-object v0, v0, Lkik/a/f/f/ah$b;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/f/c/c;

    .line 283
    const-string v1, "ack-id"

    invoke-virtual {p1, v1}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 285
    invoke-virtual {v0}, Lkik/a/f/c/c;->d()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 286
    const-string v2, "e"

    const-string v1, "1"

    move-object v3, p1

    .line 289
    :goto_3
    invoke-virtual {v3, v2, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 292
    invoke-virtual {v0}, Lkik/a/f/c/c;->j()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lkik/a/f/o;->c(Ljava/lang/String;)Lorg/d/a/c;

    .line 293
    const-string v0, "ack-id"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    goto :goto_2

    .line 278
    :cond_3
    const/4 v1, 0x0

    goto :goto_1

    .line 289
    :cond_4
    const-string v2, "receipt"

    invoke-virtual {v0}, Lkik/a/f/c/c;->g()Z

    move-result v1

    if-eqz v1, :cond_5

    const-string v1, "true"

    move-object v3, p1

    goto :goto_3

    :cond_5
    const-string v1, "false"

    move-object v3, p1

    goto :goto_3

    .line 296
    :cond_6
    const-string v0, "sender"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 300
    :cond_7
    const-string v0, "msg-acks"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 302
    iget-boolean v0, p0, Lkik/a/f/f/ah;->j:Z

    if-eqz v0, :cond_8

    const-string v0, "true"

    .line 303
    :goto_4
    const-string v1, "history"

    invoke-virtual {p1, v1}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 304
    const-string v1, "attach"

    invoke-virtual {p1, v1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    const-string v0, "history"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 307
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 308
    return-void

    .line 302
    :cond_8
    const-string v0, "false"

    goto :goto_4
.end method

.method public final d()J
    .locals 2

    .prologue
    .line 111
    iget-wide v0, p0, Lkik/a/f/f/ah;->n:J

    return-wide v0
.end method

.method public final e()Ljava/util/Vector;
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lkik/a/f/f/ah;->m:Ljava/util/Vector;

    return-object v0
.end method

.method public final f()Z
    .locals 1

    .prologue
    .line 129
    iget-boolean v0, p0, Lkik/a/f/f/ah;->o:Z

    return v0
.end method

.method public final g()Ljava/util/List;
    .locals 1

    .prologue
    .line 149
    iget-object v0, p0, Lkik/a/f/f/ah;->l:Ljava/util/List;

    return-object v0
.end method

.method protected final i()Z
    .locals 1

    .prologue
    .line 202
    const/4 v0, 0x1

    return v0
.end method
