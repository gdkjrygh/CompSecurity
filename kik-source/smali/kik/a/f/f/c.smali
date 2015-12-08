.class public final Lkik/a/f/f/c;
.super Lkik/a/f/f/y;
.source "SourceFile"


# instance fields
.field private a:Lkik/a/d/j;

.field private b:Z


# direct methods
.method public constructor <init>(Lkik/a/d/j;)V
    .locals 2

    .prologue
    .line 24
    const/4 v0, 0x0

    const-string v1, "set"

    invoke-direct {p0, v0, v1}, Lkik/a/f/f/y;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    .line 20
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/a/f/f/c;->b:Z

    .line 25
    iput-object p1, p0, Lkik/a/f/f/c;->a:Lkik/a/d/j;

    .line 26
    return-void
.end method


# virtual methods
.method public final a()Lkik/a/d/j;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lkik/a/f/f/c;->a:Lkik/a/d/j;

    return-object v0
.end method

.method protected final a(Lkik/a/f/n;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 42
    const-string v0, "query"

    invoke-virtual {p1, v2, v0}, Lkik/a/f/n;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    const-string v0, "xmlns"

    const-string v1, "kik:iq:friend"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/n;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    :goto_0
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 46
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 47
    const-string v0, "ok"

    const-string v1, "status"

    invoke-virtual {p1, v2, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Lkik/a/f/f/c;->b:Z

    .line 49
    :cond_0
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_0

    .line 51
    :cond_1
    return-void
.end method

.method protected final b(Lkik/a/f/o;)V
    .locals 2

    .prologue
    .line 31
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 32
    const-string v0, "xmlns"

    const-string v1, "kik:iq:friend"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    const-string v0, "block"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 34
    const-string v0, "jid"

    iget-object v1, p0, Lkik/a/f/f/c;->a:Lkik/a/d/j;

    invoke-virtual {v1}, Lkik/a/d/j;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    const-string v0, "block"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 36
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 37
    return-void
.end method
