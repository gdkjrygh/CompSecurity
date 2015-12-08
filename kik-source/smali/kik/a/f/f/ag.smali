.class public final Lkik/a/f/f/ag;
.super Lkik/a/f/f/y;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 25
    const/4 v0, 0x0

    const-string v1, "set"

    invoke-direct {p0, v0, v1}, Lkik/a/f/f/y;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    .line 26
    iput-object p1, p0, Lkik/a/f/f/ag;->a:Ljava/lang/String;

    .line 27
    iput-object p2, p0, Lkik/a/f/f/ag;->b:Ljava/lang/String;

    .line 28
    return-void
.end method


# virtual methods
.method protected final a(Lkik/a/f/n;)V
    .locals 0

    .prologue
    .line 48
    return-void
.end method

.method protected final b(Lkik/a/f/n;)V
    .locals 1

    .prologue
    .line 53
    :goto_0
    const-string v0, "iq"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 54
    const-string v0, "not-authorized"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 55
    const/16 v0, 0x191

    invoke-virtual {p0, v0}, Lkik/a/f/f/ag;->c(I)V

    .line 68
    :cond_0
    :goto_1
    return-void

    .line 58
    :cond_1
    const-string v0, "bad-request"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 59
    const/16 v0, 0x190

    invoke-virtual {p0, v0}, Lkik/a/f/f/ag;->c(I)V

    goto :goto_1

    .line 62
    :cond_2
    const-string v0, "not-member"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 63
    const/16 v0, 0x192

    invoke-virtual {p0, v0}, Lkik/a/f/f/ag;->c(I)V

    goto :goto_1

    .line 66
    :cond_3
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_0
.end method

.method protected final b(Lkik/a/f/o;)V
    .locals 2

    .prologue
    .line 33
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 34
    const-string v0, "xmlns"

    const-string v1, "kik:groups:admin"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    const-string v0, "g"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 36
    const-string v0, "jid"

    iget-object v1, p0, Lkik/a/f/f/ag;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    const-string v0, "m"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 38
    const-string v0, "a"

    const-string v1, "1"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    iget-object v0, p0, Lkik/a/f/f/ag;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lkik/a/f/o;->c(Ljava/lang/String;)Lorg/d/a/c;

    .line 40
    const-string v0, "m"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 41
    const-string v0, "g"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 42
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 43
    return-void
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lkik/a/f/f/ag;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lkik/a/f/f/ag;->b:Ljava/lang/String;

    return-object v0
.end method
