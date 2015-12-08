.class final Lcom/c/b/am;
.super Lcom/c/b/c;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/c/b/al;


# direct methods
.method constructor <init>(Lcom/c/b/al;)V
    .locals 0

    .prologue
    .line 276
    iput-object p1, p0, Lcom/c/b/am;->a:Lcom/c/b/al;

    invoke-direct {p0}, Lcom/c/b/c;-><init>()V

    return-void
.end method

.method private b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/al;
    .locals 3

    .prologue
    .line 281
    iget-object v0, p0, Lcom/c/b/am;->a:Lcom/c/b/al;

    invoke-static {v0}, Lcom/c/b/al;->a(Lcom/c/b/al;)Lcom/c/b/ak$a;

    move-result-object v0

    invoke-static {v0}, Lcom/c/b/al;->b(Lcom/c/b/ak$a;)Lcom/c/b/al$a;

    move-result-object v0

    .line 283
    :try_start_0
    invoke-virtual {v0, p1, p2}, Lcom/c/b/al$a;->a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 290
    invoke-virtual {v0}, Lcom/c/b/al$a;->d()Lcom/c/b/al;

    move-result-object v0

    return-object v0

    .line 284
    :catch_0
    move-exception v1

    invoke-virtual {v0}, Lcom/c/b/al$a;->d()Lcom/c/b/al;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    throw v0

    .line 286
    :catch_1
    move-exception v1

    .line 287
    new-instance v2, Lcom/c/b/av;

    invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lcom/c/b/av;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/c/b/al$a;->d()Lcom/c/b/al;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    throw v0
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 276
    invoke-direct {p0, p1, p2}, Lcom/c/b/am;->b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/al;

    move-result-object v0

    return-object v0
.end method
