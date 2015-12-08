.class public final Lkik/a/f/f/u;
.super Lkik/a/f/f/y;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/Hashtable;

.field private b:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lkik/a/f/j;)V
    .locals 1

    .prologue
    .line 24
    const-string v0, "get"

    invoke-direct {p0, p1, v0}, Lkik/a/f/f/y;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    .line 19
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkik/a/f/f/u;->a:Ljava/util/Hashtable;

    .line 25
    return-void
.end method

.method public constructor <init>(Lkik/a/f/j;Ljava/util/ArrayList;)V
    .locals 1

    .prologue
    .line 29
    const-string v0, "get"

    invoke-direct {p0, p1, v0}, Lkik/a/f/f/y;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    .line 19
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkik/a/f/f/u;->a:Ljava/util/Hashtable;

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/a/f/f/u;->b:Ljava/util/ArrayList;

    .line 31
    iput-object p2, p0, Lkik/a/f/f/u;->b:Ljava/util/ArrayList;

    .line 32
    return-void
.end method


# virtual methods
.method protected final a(Lkik/a/f/n;)V
    .locals 10

    .prologue
    const-wide/16 v8, 0x0

    const/4 v6, 0x0

    const/4 v0, 0x0

    .line 52
    .line 56
    const-string v1, "query"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/n;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    const-string v1, "xmlns"

    const-string v2, "kik:iq:convos"

    invoke-virtual {p1, v1, v2}, Lkik/a/f/n;->b(Ljava/lang/String;Ljava/lang/String;)V

    move v3, v6

    move-wide v4, v8

    move-object v2, v0

    .line 59
    :goto_0
    const-string v1, "iq"

    invoke-virtual {p1, v1}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 60
    const-string v1, "convo"

    invoke-virtual {p1, v1}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 61
    const-string v1, "jid"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 75
    :cond_0
    :goto_1
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_0

    .line 63
    :cond_1
    const-string v1, "muted"

    invoke-virtual {p1, v1}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 64
    const/4 v3, 0x1

    .line 65
    const-string v1, "expires"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 66
    if-nez v1, :cond_2

    const-wide/16 v4, -0x1

    goto :goto_1

    :cond_2
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    goto :goto_1

    .line 68
    :cond_3
    const-string v1, "convo"

    invoke-virtual {p1, v1}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 70
    iget-object v7, p0, Lkik/a/f/f/u;->a:Ljava/util/Hashtable;

    new-instance v1, Lkik/a/d/g;

    invoke-direct/range {v1 .. v6}, Lkik/a/d/g;-><init>(Ljava/lang/String;ZJZ)V

    invoke-virtual {v7, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v3, v6

    move-wide v4, v8

    move-object v2, v0

    .line 73
    goto :goto_1

    .line 77
    :cond_4
    return-void
.end method

.method protected final b(Lkik/a/f/n;)V
    .locals 0

    .prologue
    .line 82
    return-void
.end method

.method protected final b(Lkik/a/f/o;)V
    .locals 3

    .prologue
    .line 37
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 38
    const-string v0, "xmlns"

    const-string v1, "kik:iq:convos"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    iget-object v0, p0, Lkik/a/f/f/u;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 40
    iget-object v0, p0, Lkik/a/f/f/u;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 41
    const-string v2, "convo"

    invoke-virtual {p1, v2}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 42
    const-string v2, "jid"

    invoke-virtual {p1, v2, v0}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    const-string v0, "convo"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 46
    :cond_0
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 47
    return-void
.end method

.method public final d()Ljava/util/Hashtable;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lkik/a/f/f/u;->a:Ljava/util/Hashtable;

    return-object v0
.end method
