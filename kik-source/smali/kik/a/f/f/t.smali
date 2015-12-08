.class public final Lkik/a/f/f/t;
.super Lkik/a/f/f/y;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lkik/a/f/j;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 33
    const-string v0, "set"

    invoke-direct {p0, p1, v0}, Lkik/a/f/f/y;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    .line 34
    iput-object p2, p0, Lkik/a/f/f/t;->a:Ljava/lang/String;

    .line 35
    iput-object p3, p0, Lkik/a/f/f/t;->b:Ljava/lang/String;

    .line 36
    return-void
.end method


# virtual methods
.method protected final a(Lkik/a/f/n;)V
    .locals 0

    .prologue
    .line 57
    return-void
.end method

.method protected final b(Lkik/a/f/n;)V
    .locals 0

    .prologue
    .line 62
    return-void
.end method

.method protected final b(Lkik/a/f/o;)V
    .locals 2

    .prologue
    .line 41
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 42
    const-string v0, "xmlns"

    const-string v1, "kik:iq:convos"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    const-string v0, "convo"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 44
    const-string v0, "jid"

    iget-object v1, p0, Lkik/a/f/f/t;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    const-string v0, "mute"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 46
    iget-object v0, p0, Lkik/a/f/f/t;->b:Ljava/lang/String;

    const-string v1, "-1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 47
    const-string v0, "expires"

    iget-object v1, p0, Lkik/a/f/f/t;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    :cond_0
    const-string v0, "mute"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 50
    const-string v0, "convo"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 51
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 52
    return-void
.end method
