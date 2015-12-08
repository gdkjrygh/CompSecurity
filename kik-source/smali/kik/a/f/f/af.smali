.class public final Lkik/a/f/f/af;
.super Lkik/a/f/f/w;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private i:Z

.field private j:Z


# direct methods
.method public constructor <init>(Lkik/a/f/j;Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 32
    const-string v0, "get"

    invoke-direct {p0, p1, v0}, Lkik/a/f/f/w;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    .line 14
    iput-object v1, p0, Lkik/a/f/f/af;->a:Ljava/lang/String;

    .line 15
    iput-object v1, p0, Lkik/a/f/f/af;->b:Ljava/lang/String;

    .line 17
    iput-boolean v2, p0, Lkik/a/f/f/af;->i:Z

    .line 18
    iput-boolean v2, p0, Lkik/a/f/f/af;->j:Z

    .line 34
    if-nez p2, :cond_0

    .line 35
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Must pass an email or a username"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 38
    :cond_0
    iput-object p2, p0, Lkik/a/f/f/af;->b:Ljava/lang/String;

    .line 39
    iput-object v1, p0, Lkik/a/f/f/af;->a:Ljava/lang/String;

    .line 40
    return-void
.end method


# virtual methods
.method protected final a(Lkik/a/f/n;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 63
    const-string v0, "kik:iq:check-unique"

    const-string v1, "query"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/n;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    :goto_0
    const-string v0, "iq"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 65
    const-string v0, "username"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "true"

    const-string v1, "is-unique"

    invoke-virtual {p1, v3, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 66
    iput-boolean v2, p0, Lkik/a/f/f/af;->j:Z

    .line 68
    :cond_0
    const-string v0, "email"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "true"

    const-string v1, "is-unique"

    invoke-virtual {p1, v3, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 69
    iput-boolean v2, p0, Lkik/a/f/f/af;->i:Z

    .line 71
    :cond_1
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_0

    .line 73
    :cond_2
    return-void
.end method

.method protected final b(Lkik/a/f/o;)V
    .locals 2

    .prologue
    .line 45
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 46
    const-string v0, "xmlns"

    const-string v1, "kik:iq:check-unique"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    iget-object v0, p0, Lkik/a/f/f/af;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 49
    const-string v0, "username"

    iget-object v1, p0, Lkik/a/f/f/af;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    :cond_0
    iget-object v0, p0, Lkik/a/f/f/af;->a:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 53
    const-string v0, "email"

    iget-object v1, p0, Lkik/a/f/f/af;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    :cond_1
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 57
    return-void
.end method

.method public final d()Ljava/lang/Boolean;
    .locals 2

    .prologue
    .line 91
    iget-object v0, p0, Lkik/a/f/f/af;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 92
    const/4 v0, 0x0

    .line 94
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/Boolean;

    iget-boolean v1, p0, Lkik/a/f/f/af;->j:Z

    invoke-direct {v0, v1}, Ljava/lang/Boolean;-><init>(Z)V

    goto :goto_0
.end method
