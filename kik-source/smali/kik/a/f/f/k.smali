.class public final Lkik/a/f/f/k;
.super Lkik/a/f/f/y;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 23
    const/4 v0, 0x0

    const-string v1, "set"

    invoke-direct {p0, v0, v1}, Lkik/a/f/f/y;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    .line 24
    iput-object p1, p0, Lkik/a/f/f/k;->a:Ljava/lang/String;

    .line 25
    return-void
.end method


# virtual methods
.method protected final a(Lkik/a/f/n;)V
    .locals 0

    .prologue
    .line 44
    return-void
.end method

.method public final a(Lkik/a/f/f/z;)Z
    .locals 2

    .prologue
    .line 75
    instance-of v0, p1, Lkik/a/f/f/k;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/a/f/f/k;->a:Ljava/lang/String;

    check-cast p1, Lkik/a/f/f/k;

    iget-object v1, p1, Lkik/a/f/f/k;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected final b(Lkik/a/f/n;)V
    .locals 1

    .prologue
    .line 49
    :goto_0
    const-string v0, "iq"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 50
    const-string v0, "deleted"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 51
    const/16 v0, 0xca

    invoke-virtual {p0, v0}, Lkik/a/f/f/k;->c(I)V

    .line 65
    :cond_0
    :goto_1
    return-void

    .line 54
    :cond_1
    const-string v0, "not-member"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 55
    const/16 v0, 0xc9

    invoke-virtual {p0, v0}, Lkik/a/f/f/k;->c(I)V

    goto :goto_1

    .line 58
    :cond_2
    const-string v0, "invalid"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 59
    const/16 v0, 0x68

    invoke-virtual {p0, v0}, Lkik/a/f/f/k;->c(I)V

    .line 60
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/a/f/f/k;->a(Ljava/lang/Object;)V

    goto :goto_1

    .line 63
    :cond_3
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_0
.end method

.method protected final b(Lkik/a/f/o;)V
    .locals 2

    .prologue
    .line 30
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 31
    const-string v0, "xmlns"

    const-string v1, "kik:groups:admin"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    const-string v0, "g"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 33
    const-string v0, "jid"

    iget-object v1, p0, Lkik/a/f/f/k;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    const-string v0, "ack"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 35
    const-string v0, "ack"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 36
    const-string v0, "g"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 37
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 38
    return-void
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lkik/a/f/f/k;->a:Ljava/lang/String;

    return-object v0
.end method
