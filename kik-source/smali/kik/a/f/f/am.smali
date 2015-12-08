.class public final Lkik/a/f/f/am;
.super Lkik/a/f/f/y;
.source "SourceFile"


# instance fields
.field private a:Lkik/a/d/j;


# direct methods
.method public constructor <init>(Lkik/a/d/j;)V
    .locals 2

    .prologue
    .line 23
    const/4 v0, 0x0

    const-string v1, "set"

    invoke-direct {p0, v0, v1}, Lkik/a/f/f/y;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    .line 24
    iput-object p1, p0, Lkik/a/f/f/am;->a:Lkik/a/d/j;

    .line 25
    return-void
.end method


# virtual methods
.method protected final a(Lkik/a/f/n;)V
    .locals 2

    .prologue
    .line 41
    const-string v0, "query"

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    const-string v0, "xmlns"

    const-string v1, "kik:iq:friend"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/n;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    return-void
.end method

.method protected final b(Lkik/a/f/o;)V
    .locals 2

    .prologue
    .line 30
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 31
    const-string v0, "xmlns"

    const-string v1, "kik:iq:friend"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    const-string v0, "unblock"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 33
    const-string v0, "jid"

    iget-object v1, p0, Lkik/a/f/f/am;->a:Lkik/a/d/j;

    invoke-virtual {v1}, Lkik/a/d/j;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    const-string v0, "unblock"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 35
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 36
    return-void
.end method

.method public final d()Lkik/a/d/j;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lkik/a/f/f/am;->a:Lkik/a/d/j;

    return-object v0
.end method
