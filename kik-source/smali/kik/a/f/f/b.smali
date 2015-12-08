.class public final Lkik/a/f/f/b;
.super Lkik/a/f/f/y;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:J

.field private l:Z


# direct methods
.method public constructor <init>(Lkik/a/f/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 26
    const-string v0, "set"

    invoke-direct {p0, p1, v0}, Lkik/a/f/f/y;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    .line 22
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/a/f/f/b;->l:Z

    .line 27
    iput-object p2, p0, Lkik/a/f/f/b;->a:Ljava/lang/String;

    .line 28
    iput-object p3, p0, Lkik/a/f/f/b;->b:Ljava/lang/String;

    .line 29
    iput-object p4, p0, Lkik/a/f/f/b;->i:Ljava/lang/String;

    .line 31
    const-wide/16 v0, 0x7530

    invoke-virtual {p0, v0, v1}, Lkik/a/f/f/b;->b(J)V

    .line 32
    return-void
.end method

.method private static a(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 70
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    const/4 v0, 0x1

    :goto_0
    return v0

    .line 73
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lkik/a/f/f/b;->j:Ljava/lang/String;

    return-object v0
.end method

.method protected final a(Lkik/a/f/n;)V
    .locals 2

    .prologue
    .line 37
    :goto_0
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "iq"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 38
    const-string v0, "url"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 39
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/f/b;->j:Ljava/lang/String;

    .line 40
    iget-object v0, p0, Lkik/a/f/f/b;->j:Ljava/lang/String;

    invoke-static {v0}, Lkik/a/f/f/b;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/a/f/f/b;->j:Ljava/lang/String;

    .line 42
    const/16 v0, 0x69

    invoke-virtual {p0, v0}, Lkik/a/f/f/b;->b(I)V

    .line 45
    :cond_0
    const-string v0, "revalidate"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 46
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lkik/a/f/f/b;->k:J

    .line 51
    :cond_1
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_0

    .line 53
    :cond_2
    return-void
.end method

.method public final b()J
    .locals 4

    .prologue
    .line 86
    iget-wide v0, p0, Lkik/a/f/f/b;->k:J

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    return-wide v0
.end method

.method protected final b(Lkik/a/f/n;)V
    .locals 1

    .prologue
    .line 58
    invoke-super {p0, p1}, Lkik/a/f/f/y;->b(Lkik/a/f/n;)V

    .line 59
    :goto_0
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "iq"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 60
    const-string v0, "regenerate-key"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/a/f/f/b;->l:Z

    .line 63
    :cond_0
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_0

    .line 65
    :cond_1
    return-void
.end method

.method protected final b(Lkik/a/f/o;)V
    .locals 2

    .prologue
    .line 97
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 98
    const-string v0, "xmlns"

    const-string v1, "kik:auth:cert"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    iget-object v0, p0, Lkik/a/f/f/b;->i:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 101
    const-string v0, "url"

    iget-object v1, p0, Lkik/a/f/f/b;->i:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    :cond_0
    const-string v0, "key"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 105
    const-string v0, "type"

    const-string v1, "rsa"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    const-string v0, "der"

    iget-object v1, p0, Lkik/a/f/f/b;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    const-string v0, "signature"

    iget-object v1, p0, Lkik/a/f/f/b;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    const-string v0, "key"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 111
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 112
    return-void
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 91
    iget-boolean v0, p0, Lkik/a/f/f/b;->l:Z

    return v0
.end method
