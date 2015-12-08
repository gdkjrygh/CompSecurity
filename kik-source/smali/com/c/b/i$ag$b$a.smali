.class public final Lcom/c/b/i$ag$b$a;
.super Lcom/c/b/as$a;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$ag$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i$ag$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/Object;

.field private c:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 27173
    invoke-direct {p0}, Lcom/c/b/as$a;-><init>()V

    .line 27282
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$ag$b$a;->b:Ljava/lang/Object;

    .line 27174
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 27156
    invoke-direct {p0}, Lcom/c/b/i$ag$b$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$b;)V
    .locals 1

    .prologue
    .line 27179
    invoke-direct {p0, p1}, Lcom/c/b/as$a;-><init>(Lcom/c/b/as$b;)V

    .line 27282
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$ag$b$a;->b:Ljava/lang/Object;

    .line 27180
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$b;B)V
    .locals 0

    .prologue
    .line 27156
    invoke-direct {p0, p1}, Lcom/c/b/i$ag$b$a;-><init>(Lcom/c/b/as$b;)V

    return-void
.end method

.method private d(Lcom/c/b/bd;)Lcom/c/b/i$ag$b$a;
    .locals 1

    .prologue
    .line 27230
    instance-of v0, p1, Lcom/c/b/i$ag$b;

    if-eqz v0, :cond_0

    .line 27231
    check-cast p1, Lcom/c/b/i$ag$b;

    invoke-virtual {p0, p1}, Lcom/c/b/i$ag$b$a;->a(Lcom/c/b/i$ag$b;)Lcom/c/b/i$ag$b$a;

    move-result-object p0

    .line 27234
    :goto_0
    return-object p0

    .line 27233
    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as$a;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    goto :goto_0
.end method

.method private d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$ag$b$a;
    .locals 4

    .prologue
    .line 27267
    const/4 v2, 0x0

    .line 27269
    :try_start_0
    sget-object v0, Lcom/c/b/i$ag$b;->c:Lcom/c/b/bk;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bk;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$ag$b;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 27274
    if-eqz v0, :cond_0

    .line 27275
    invoke-virtual {p0, v0}, Lcom/c/b/i$ag$b$a;->a(Lcom/c/b/i$ag$b;)Lcom/c/b/i$ag$b$a;

    .line 27278
    :cond_0
    return-object p0

    .line 27270
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 27271
    :try_start_1
    invoke-virtual {v1}, Lcom/c/b/av;->a()Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$ag$b;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 27272
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 27274
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 27275
    invoke-virtual {p0, v1}, Lcom/c/b/i$ag$b$a;->a(Lcom/c/b/i$ag$b;)Lcom/c/b/i$ag$b$a;

    .line 27274
    :cond_1
    throw v0

    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_0
.end method

.method private r()Lcom/c/b/i$ag$b;
    .locals 2

    .prologue
    .line 27205
    invoke-direct {p0}, Lcom/c/b/i$ag$b$a;->s()Lcom/c/b/i$ag$b;

    move-result-object v0

    .line 27206
    invoke-virtual {v0}, Lcom/c/b/i$ag$b;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 27207
    invoke-static {v0}, Lcom/c/b/i$ag$b$a;->b(Lcom/c/b/bd;)Lcom/c/b/bx;

    move-result-object v0

    throw v0

    .line 27209
    :cond_0
    return-object v0
.end method

.method private s()Lcom/c/b/i$ag$b;
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 27213
    new-instance v2, Lcom/c/b/i$ag$b;

    invoke-direct {v2, p0, v1}, Lcom/c/b/i$ag$b;-><init>(Lcom/c/b/as$a;B)V

    .line 27214
    iget v3, p0, Lcom/c/b/i$ag$b$a;->a:I

    .line 27216
    and-int/lit8 v4, v3, 0x1

    if-ne v4, v0, :cond_1

    .line 27219
    :goto_0
    iget-object v1, p0, Lcom/c/b/i$ag$b$a;->b:Ljava/lang/Object;

    invoke-static {v2, v1}, Lcom/c/b/i$ag$b;->a(Lcom/c/b/i$ag$b;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27220
    and-int/lit8 v1, v3, 0x2

    const/4 v3, 0x2

    if-ne v1, v3, :cond_0

    .line 27221
    or-int/lit8 v0, v0, 0x2

    .line 27223
    :cond_0
    iget-boolean v1, p0, Lcom/c/b/i$ag$b$a;->c:Z

    invoke-static {v2, v1}, Lcom/c/b/i$ag$b;->a(Lcom/c/b/i$ag$b;Z)Z

    .line 27224
    invoke-static {v2, v0}, Lcom/c/b/i$ag$b;->a(Lcom/c/b/i$ag$b;I)I

    .line 27225
    invoke-virtual {p0}, Lcom/c/b/i$ag$b$a;->l()V

    .line 27226
    return-object v2

    :cond_1
    move v0, v1

    goto :goto_0
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/bd;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 27156
    invoke-direct {p0, p1}, Lcom/c/b/i$ag$b$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$ag$b$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 27156
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$ag$b$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$ag$b$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/c/b/i$ag$b;)Lcom/c/b/i$ag$b$a;
    .locals 2

    .prologue
    .line 27239
    invoke-static {}, Lcom/c/b/i$ag$b;->k()Lcom/c/b/i$ag$b;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 27250
    :goto_0
    return-object p0

    .line 27240
    :cond_0
    invoke-virtual {p1}, Lcom/c/b/i$ag$b;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 27241
    iget v0, p0, Lcom/c/b/i$ag$b$a;->a:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/c/b/i$ag$b$a;->a:I

    .line 27242
    invoke-static {p1}, Lcom/c/b/i$ag$b;->a(Lcom/c/b/i$ag$b;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$ag$b$a;->b:Ljava/lang/Object;

    .line 27243
    invoke-virtual {p0}, Lcom/c/b/i$ag$b$a;->q()V

    .line 27245
    :cond_1
    invoke-virtual {p1}, Lcom/c/b/i$ag$b;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 27246
    invoke-virtual {p1}, Lcom/c/b/i$ag$b;->j()Z

    move-result v0

    iget v1, p0, Lcom/c/b/i$ag$b$a;->a:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Lcom/c/b/i$ag$b$a;->a:I

    iput-boolean v0, p0, Lcom/c/b/i$ag$b$a;->c:Z

    invoke-virtual {p0}, Lcom/c/b/i$ag$b$a;->q()V

    .line 27248
    :cond_2
    iget-object v0, p1, Lcom/c/b/i$ag$b;->e:Lcom/c/b/by;

    invoke-virtual {p0, v0}, Lcom/c/b/i$ag$b$a;->d(Lcom/c/b/by;)Lcom/c/b/as$a;

    .line 27249
    invoke-virtual {p0}, Lcom/c/b/i$ag$b$a;->q()V

    goto :goto_0
.end method

.method public final a()Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 27254
    iget v2, p0, Lcom/c/b/i$ag$b$a;->a:I

    and-int/lit8 v2, v2, 0x1

    if-ne v2, v1, :cond_1

    move v2, v1

    :goto_0
    if-nez v2, :cond_2

    .line 27260
    :cond_0
    :goto_1
    return v0

    :cond_1
    move v2, v0

    .line 27254
    goto :goto_0

    .line 27257
    :cond_2
    iget v2, p0, Lcom/c/b/i$ag$b$a;->a:I

    and-int/lit8 v2, v2, 0x2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_3

    move v2, v1

    :goto_2
    if-eqz v2, :cond_0

    move v0, v1

    .line 27260
    goto :goto_1

    :cond_3
    move v2, v0

    .line 27257
    goto :goto_2
.end method

.method public final synthetic b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 27156
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$ag$b$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$ag$b$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/bd;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 27156
    invoke-direct {p0, p1}, Lcom/c/b/i$ag$b$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$ag$b$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 27156
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$ag$b$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$ag$b$a;

    move-result-object v0

    return-object v0
.end method

.method protected final d()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 27167
    invoke-static {}, Lcom/c/b/i;->M()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$ag$b;

    const-class v2, Lcom/c/b/i$ag$b$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 27197
    invoke-static {}, Lcom/c/b/i;->L()Lcom/c/b/ak$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic h()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 27156
    invoke-direct {p0}, Lcom/c/b/i$ag$b$a;->s()Lcom/c/b/i$ag$b;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 27156
    invoke-direct {p0}, Lcom/c/b/i$ag$b$a;->r()Lcom/c/b/i$ag$b;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 27156
    invoke-direct {p0}, Lcom/c/b/i$ag$b$a;->r()Lcom/c/b/i$ag$b;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 27156
    invoke-static {}, Lcom/c/b/i$ag$b;->k()Lcom/c/b/i$ag$b;

    move-result-object v0

    return-object v0
.end method
