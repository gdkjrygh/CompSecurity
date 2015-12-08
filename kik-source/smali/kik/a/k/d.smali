.class public final Lkik/a/k/d;
.super Lkik/a/f/f/y;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final i:Lcom/c/b/as;

.field private final j:Lkik/a/k/b;

.field private k:Ljava/lang/Object;


# direct methods
.method private constructor <init>(Lkik/a/k/b;)V
    .locals 2

    .prologue
    .line 33
    const/4 v0, 0x0

    const-string v1, "set"

    invoke-direct {p0, v0, v1}, Lkik/a/f/f/y;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    .line 34
    iput-object p1, p0, Lkik/a/k/d;->j:Lkik/a/k/b;

    .line 35
    invoke-virtual {p1}, Lkik/a/k/b;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/k/d;->a:Ljava/lang/String;

    .line 36
    invoke-virtual {p1}, Lkik/a/k/b;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/k/d;->b:Ljava/lang/String;

    .line 37
    invoke-virtual {p1}, Lkik/a/k/b;->c()Lcom/c/b/as;

    move-result-object v0

    iput-object v0, p0, Lkik/a/k/d;->i:Lcom/c/b/as;

    .line 38
    return-void
.end method

.method public static a(Lkik/a/k/b;)Lkik/a/k/d;
    .locals 1

    .prologue
    .line 28
    new-instance v0, Lkik/a/k/d;

    invoke-direct {v0, p0}, Lkik/a/k/d;-><init>(Lkik/a/k/b;)V

    return-object v0
.end method


# virtual methods
.method protected final a(Lkik/a/f/n;)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 56
    const-string v1, "query"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/n;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    const-string v1, "xmlns"

    const-string v2, "kik:iq:xiphias:bridge"

    invoke-virtual {p1, v1, v2}, Lkik/a/f/n;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    :goto_0
    const-string v1, "query"

    invoke-virtual {p1, v1}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 60
    const-string v1, "body"

    invoke-virtual {p1, v1}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 62
    :try_start_0
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 67
    :cond_0
    :goto_1
    invoke-virtual {p1}, Lkik/a/f/n;->next()I

    goto :goto_0

    .line 69
    :cond_1
    if-eqz v0, :cond_2

    .line 70
    iget-object v1, p0, Lkik/a/k/d;->j:Lkik/a/k/b;

    const/16 v2, 0x10

    invoke-static {v0, v2}, Lcom/kik/m/e;->a(Ljava/lang/String;I)[B

    move-result-object v0

    invoke-virtual {v1, v0}, Lkik/a/k/b;->a([B)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lkik/a/k/d;->k:Ljava/lang/Object;

    .line 72
    :cond_2
    return-void

    :catch_0
    move-exception v1

    goto :goto_1
.end method

.method protected final b(Lkik/a/f/o;)V
    .locals 2

    .prologue
    .line 43
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 44
    const-string v0, "xmlns"

    const-string v1, "kik:iq:xiphias:bridge"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    const-string v0, "service"

    iget-object v1, p0, Lkik/a/k/d;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    const-string v0, "method"

    iget-object v1, p0, Lkik/a/k/d;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    const-string v0, "body"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 48
    iget-object v0, p0, Lkik/a/k/d;->i:Lcom/c/b/as;

    invoke-virtual {v0}, Lcom/c/b/as;->b_()[B

    move-result-object v0

    invoke-static {v0}, Lcom/kik/m/e;->b([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lkik/a/f/o;->c(Ljava/lang/String;)Lorg/d/a/c;

    .line 49
    const-string v0, "body"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 50
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 51
    return-void
.end method

.method public final d()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lkik/a/k/d;->k:Ljava/lang/Object;

    return-object v0
.end method
