.class public final Lkik/a/f/f/o;
.super Lkik/a/f/f/y;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 28
    const/4 v0, 0x0

    const-string v1, "set"

    invoke-direct {p0, v0, v1}, Lkik/a/f/f/y;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    .line 29
    iput-object p2, p0, Lkik/a/f/f/o;->a:Ljava/lang/String;

    .line 30
    iput-object p1, p0, Lkik/a/f/f/o;->b:Ljava/lang/String;

    .line 31
    return-void
.end method


# virtual methods
.method protected final a(Lkik/a/f/n;)V
    .locals 2

    .prologue
    .line 53
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 54
    const-string v0, "xmlns"

    const-string v1, "kik:groups:admin"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/n;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    :cond_0
    return-void
.end method

.method protected final b(Lkik/a/f/n;)V
    .locals 1

    .prologue
    .line 61
    :goto_0
    const-string v0, "iq"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 62
    const-string v0, "banned"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 63
    const/16 v0, 0x191

    invoke-virtual {p0, v0}, Lkik/a/f/f/o;->c(I)V

    .line 76
    :cond_0
    :goto_1
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_0

    .line 65
    :cond_1
    const-string v0, "not-public"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 66
    const/16 v0, 0x192

    invoke-virtual {p0, v0}, Lkik/a/f/f/o;->c(I)V

    goto :goto_1

    .line 68
    :cond_2
    const-string v0, "mismatch"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 69
    const/16 v0, 0x193

    invoke-virtual {p0, v0}, Lkik/a/f/f/o;->c(I)V

    .line 78
    :cond_3
    :goto_2
    return-void

    .line 72
    :cond_4
    const-string v0, "full"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 73
    const/16 v0, 0x194

    invoke-virtual {p0, v0}, Lkik/a/f/f/o;->c(I)V

    goto :goto_2
.end method

.method protected final b(Lkik/a/f/o;)V
    .locals 2

    .prologue
    .line 36
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 37
    const-string v0, "xmlns"

    const-string v1, "kik:groups:admin"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    const-string v0, "g"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 39
    const-string v0, "jid"

    iget-object v1, p0, Lkik/a/f/f/o;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    const-string v0, "action"

    const-string v1, "join"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    const-string v0, "invite-code"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 43
    iget-object v0, p0, Lkik/a/f/f/o;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lkik/a/f/o;->c(Ljava/lang/String;)Lorg/d/a/c;

    .line 44
    const-string v0, "invite-code"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 46
    const-string v0, "g"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 47
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 48
    return-void
.end method
