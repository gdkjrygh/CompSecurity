.class public final Lkik/a/f/f/m;
.super Lkik/a/f/f/y;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 29
    const/4 v0, 0x0

    const-string v1, "set"

    invoke-direct {p0, v0, v1}, Lkik/a/f/f/y;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    .line 30
    iput-object p2, p0, Lkik/a/f/f/m;->b:Ljava/lang/String;

    .line 31
    iput-object p1, p0, Lkik/a/f/f/m;->a:Ljava/lang/String;

    .line 32
    return-void
.end method


# virtual methods
.method protected final a(Lkik/a/f/n;)V
    .locals 2

    .prologue
    .line 52
    const-string v0, "query"

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    const-string v0, "xmlns"

    const-string v1, "kik:groups:admin"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/n;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    return-void
.end method

.method protected final b(Lkik/a/f/n;)V
    .locals 1

    .prologue
    .line 59
    :goto_0
    const-string v0, "iq"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 60
    const-string v0, "bad-request"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 61
    const/16 v0, 0xfa0

    invoke-virtual {p0, v0}, Lkik/a/f/f/m;->c(I)V

    .line 72
    :cond_0
    :goto_1
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_0

    .line 63
    :cond_1
    const-string v0, "restricted-name"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 64
    const/16 v0, 0x193

    invoke-virtual {p0, v0}, Lkik/a/f/f/m;->c(I)V

    goto :goto_1

    .line 66
    :cond_2
    const-string v0, "not-allowed"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 67
    const/16 v0, 0x195

    invoke-virtual {p0, v0}, Lkik/a/f/f/m;->c(I)V

    goto :goto_1

    .line 69
    :cond_3
    const-string v0, "not-admin"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 70
    const/16 v0, 0xfa1

    invoke-virtual {p0, v0}, Lkik/a/f/f/m;->c(I)V

    goto :goto_1

    .line 74
    :cond_4
    return-void
.end method

.method protected final b(Lkik/a/f/o;)V
    .locals 2

    .prologue
    .line 37
    iget-object v0, p0, Lkik/a/f/f/m;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/a/f/f/m;->a:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 47
    :cond_0
    :goto_0
    return-void

    .line 40
    :cond_1
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 41
    const-string v0, "xmlns"

    const-string v1, "kik:groups:admin"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    const-string v0, "g"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 43
    const-string v0, "jid"

    iget-object v1, p0, Lkik/a/f/f/m;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    const-string v0, "n"

    iget-object v1, p0, Lkik/a/f/f/m;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    const-string v0, "g"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 46
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    goto :goto_0
.end method
