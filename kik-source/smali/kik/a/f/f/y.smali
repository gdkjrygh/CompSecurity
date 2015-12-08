.class public abstract Lkik/a/f/f/y;
.super Lkik/a/f/f/z;
.source "SourceFile"


# instance fields
.field protected c:Ljava/lang/String;

.field protected d:Ljava/lang/String;

.field protected e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lkik/a/f/j;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 46
    invoke-direct {p0, p1}, Lkik/a/f/f/z;-><init>(Lkik/a/f/j;)V

    .line 47
    iput-object p2, p0, Lkik/a/f/f/y;->d:Ljava/lang/String;

    .line 48
    invoke-static {}, Lkik/a/f/l;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/f/y;->e:Ljava/lang/String;

    .line 49
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/a/f/f/y;->c:Ljava/lang/String;

    .line 52
    const-wide/16 v0, 0x3a98

    invoke-virtual {p0, v0, v1}, Lkik/a/f/f/y;->b(J)V

    .line 53
    return-void
.end method


# virtual methods
.method protected abstract a(Lkik/a/f/n;)V
.end method

.method public a(Lkik/a/f/o;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 74
    const-string v0, "iq"

    invoke-virtual {p1, v4, v0}, Lkik/a/f/o;->c(Ljava/lang/String;Ljava/lang/String;)Lorg/d/a/c;

    .line 75
    iget-object v0, p0, Lkik/a/f/f/y;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 76
    const-string v0, "to"

    iget-object v1, p0, Lkik/a/f/f/y;->c:Ljava/lang/String;

    invoke-virtual {p1, v4, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/d/a/c;

    .line 78
    :cond_0
    iget-object v0, p0, Lkik/a/f/f/y;->d:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 79
    const-string v0, "type"

    iget-object v1, p0, Lkik/a/f/f/y;->d:Ljava/lang/String;

    invoke-virtual {p1, v4, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/d/a/c;

    .line 81
    :cond_1
    const-string v0, "id"

    iget-object v1, p0, Lkik/a/f/f/y;->e:Ljava/lang/String;

    invoke-virtual {p1, v4, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/d/a/c;

    .line 83
    iget-boolean v0, p0, Lkik/a/f/f/y;->f:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lkik/a/f/f/y;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 84
    const-string v0, "cts"

    iget-wide v2, p0, Lkik/a/f/f/y;->g:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    :cond_2
    invoke-virtual {p0, p1}, Lkik/a/f/f/y;->b(Lkik/a/f/o;)V

    .line 88
    const-string v0, "iq"

    invoke-virtual {p1, v4, v0}, Lkik/a/f/o;->d(Ljava/lang/String;Ljava/lang/String;)Lorg/d/a/c;

    .line 89
    invoke-virtual {p1}, Lkik/a/f/o;->c()V

    .line 90
    return-void
.end method

.method protected b(Lkik/a/f/n;)V
    .locals 0

    .prologue
    .line 168
    return-void
.end method

.method protected abstract b(Lkik/a/f/o;)V
.end method

.method public final c(Lkik/a/f/n;)V
    .locals 4

    .prologue
    const/4 v3, 0x3

    const/4 v2, 0x0

    .line 109
    const-string v0, "iq"

    invoke-virtual {p1, v2, v0}, Lkik/a/f/n;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    iget-object v0, p0, Lkik/a/f/f/y;->e:Ljava/lang/String;

    const-string v1, "id"

    invoke-virtual {p1, v2, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 111
    new-instance v0, Lorg/d/a/b;

    const-string v1, "Wrong iq id"

    invoke-direct {v0, v1}, Lorg/d/a/b;-><init>(Ljava/lang/String;)V

    throw v0

    .line 114
    :cond_0
    :try_start_0
    const-string v0, "type"

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "result"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 115
    invoke-virtual {p1}, Lkik/a/f/n;->nextTag()I

    .line 116
    const-string v0, "iq"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 117
    invoke-virtual {p0, p1}, Lkik/a/f/f/y;->a(Lkik/a/f/n;)V

    .line 119
    :cond_1
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lkik/a/f/f/y;->a(I)V
    :try_end_0
    .catch Lorg/d/a/b; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 144
    :goto_0
    invoke-virtual {p1}, Lkik/a/f/n;->getEventType()I

    move-result v0

    if-ne v0, v3, :cond_2

    const-string v0, "iq"

    invoke-virtual {p1}, Lkik/a/f/n;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 145
    :cond_2
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_0

    .line 121
    :cond_3
    :try_start_1
    const-string v0, "type"

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "error"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 122
    invoke-virtual {p1}, Lkik/a/f/n;->nextTag()I

    .line 123
    const-string v0, "iq"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 124
    const/16 v0, 0x67

    invoke-virtual {p0, v0}, Lkik/a/f/f/y;->c(I)V

    .line 125
    invoke-virtual {p0, p1}, Lkik/a/f/f/y;->b(Lkik/a/f/n;)V

    .line 130
    :goto_1
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lkik/a/f/f/y;->a(I)V
    :try_end_1
    .catch Lorg/d/a/b; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 143
    :catch_0
    move-exception v0

    .line 137
    const/16 v1, 0x6a

    invoke-virtual {p0, v1, v0}, Lkik/a/f/f/y;->a(ILjava/lang/Object;)V

    .line 138
    throw v0

    .line 128
    :cond_4
    const/16 v0, 0x69

    :try_start_2
    invoke-virtual {p0, v0}, Lkik/a/f/f/y;->c(I)V
    :try_end_2
    .catch Lorg/d/a/b; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    .line 140
    :catch_1
    move-exception v0

    .line 141
    const/16 v1, 0x6b

    invoke-virtual {p0, v1, v0}, Lkik/a/f/f/y;->a(ILjava/lang/Object;)V

    .line 142
    throw v0

    .line 133
    :cond_5
    :try_start_3
    new-instance v0, Lorg/d/a/b;

    const-string v1, "Got unknown iq type."

    invoke-direct {v0, v1}, Lorg/d/a/b;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catch Lorg/d/a/b; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 147
    :cond_6
    return-void
.end method

.method public final h()Z
    .locals 1

    .prologue
    .line 63
    const/4 v0, 0x1

    return v0
.end method

.method protected i()Z
    .locals 1

    .prologue
    .line 190
    const/4 v0, 0x0

    return v0
.end method

.method public final l_()Ljava/lang/String;
    .locals 1

    .prologue
    .line 182
    iget-object v0, p0, Lkik/a/f/f/y;->e:Ljava/lang/String;

    return-object v0
.end method
