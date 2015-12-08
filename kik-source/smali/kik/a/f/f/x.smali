.class public final Lkik/a/f/f/x;
.super Lkik/a/f/f/z;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/Vector;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/Vector;)V
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v4, 0x0

    .line 21
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkik/a/f/f/z;-><init>(Lkik/a/f/j;)V

    .line 22
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/Vector;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 23
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Illegal arguments to OutgoingReceiptStanza"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 25
    :cond_1
    invoke-virtual {p1, v4}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    invoke-virtual {v0}, Lkik/a/d/s;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/f/x;->b:Ljava/lang/String;

    move v1, v2

    .line 26
    :goto_0
    invoke-virtual {p1}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 27
    iget-object v3, p0, Lkik/a/f/f/x;->b:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    invoke-virtual {v0}, Lkik/a/d/s;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 28
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Illegal arguments: not all receipts go to same receiver"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 26
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 31
    :cond_3
    invoke-virtual {p1, v4}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    invoke-virtual {v0}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/f/x;->c:Ljava/lang/String;

    .line 32
    :goto_1
    invoke-virtual {p1}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v2, v0, :cond_5

    .line 33
    iget-object v1, p0, Lkik/a/f/f/x;->c:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    invoke-virtual {v0}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 34
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Illegal arguments: not all receipts go to same bin"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 32
    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 37
    :cond_5
    iput-object p1, p0, Lkik/a/f/f/x;->a:Ljava/util/Vector;

    .line 39
    invoke-static {}, Lkik/a/f/l;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/f/x;->d:Ljava/lang/String;

    .line 40
    return-void
.end method


# virtual methods
.method public final a(Lkik/a/f/o;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 46
    const-string v0, "message"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 47
    const-string v0, "type"

    const-string v2, "receipt"

    invoke-virtual {p1, v0, v2}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    const-string v0, "id"

    iget-object v2, p0, Lkik/a/f/f/x;->d:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    const-string v2, "to"

    iget-object v0, p0, Lkik/a/f/f/x;->a:Ljava/util/Vector;

    invoke-virtual {v0, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    invoke-virtual {v0}, Lkik/a/d/s;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    iget-boolean v0, p0, Lkik/a/f/f/x;->f:Z

    if-eqz v0, :cond_0

    .line 53
    const-string v0, "cts"

    iget-wide v2, p0, Lkik/a/f/f/x;->g:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    :cond_0
    const/4 v0, 0x1

    iget-wide v2, p0, Lkik/a/f/f/x;->g:J

    invoke-static {p1, v1, v0, v2, v3}, Lkik/a/f/t;->a(Lkik/a/f/o;ZZJ)V

    .line 58
    const-string v0, "receipt"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 59
    const-string v0, "xmlns"

    const-string v2, "kik:message:receipt"

    invoke-virtual {p1, v0, v2}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    const-string v0, "type"

    const-string v2, "read"

    invoke-virtual {p1, v0, v2}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    :goto_0
    iget-object v0, p0, Lkik/a/f/f/x;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 62
    const-string v0, "msgid"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 63
    const-string v2, "id"

    iget-object v0, p0, Lkik/a/f/f/x;->a:Ljava/util/Vector;

    invoke-virtual {v0, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    invoke-virtual {v0}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    const-string v0, "msgid"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 61
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 66
    :cond_1
    const-string v0, "receipt"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 68
    iget-object v0, p0, Lkik/a/f/f/x;->c:Ljava/lang/String;

    iget-object v1, p0, Lkik/a/f/f/x;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 69
    const-string v0, "g"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 70
    const-string v0, "jid"

    iget-object v1, p0, Lkik/a/f/f/x;->c:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    const-string v0, "g"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 74
    :cond_2
    const-string v0, "message"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 75
    invoke-virtual {p1}, Lkik/a/f/o;->c()V

    .line 76
    return-void
.end method

.method public final l_()Ljava/lang/String;
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lkik/a/f/f/x;->d:Ljava/lang/String;

    return-object v0
.end method
