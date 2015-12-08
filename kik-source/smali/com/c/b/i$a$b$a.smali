.class public final Lcom/c/b/i$a$b$a;
.super Lcom/c/b/as$a;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$a$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i$a$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 5120
    invoke-direct {p0}, Lcom/c/b/as$a;-><init>()V

    .line 5121
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 5103
    invoke-direct {p0}, Lcom/c/b/i$a$b$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$b;)V
    .locals 0

    .prologue
    .line 5126
    invoke-direct {p0, p1}, Lcom/c/b/as$a;-><init>(Lcom/c/b/as$b;)V

    .line 5127
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$b;B)V
    .locals 0

    .prologue
    .line 5103
    invoke-direct {p0, p1}, Lcom/c/b/i$a$b$a;-><init>(Lcom/c/b/as$b;)V

    return-void
.end method

.method private d(Lcom/c/b/bd;)Lcom/c/b/i$a$b$a;
    .locals 1

    .prologue
    .line 5177
    instance-of v0, p1, Lcom/c/b/i$a$b;

    if-eqz v0, :cond_0

    .line 5178
    check-cast p1, Lcom/c/b/i$a$b;

    invoke-virtual {p0, p1}, Lcom/c/b/i$a$b$a;->a(Lcom/c/b/i$a$b;)Lcom/c/b/i$a$b$a;

    move-result-object p0

    .line 5181
    :goto_0
    return-object p0

    .line 5180
    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as$a;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    goto :goto_0
.end method

.method private d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$a$b$a;
    .locals 4

    .prologue
    .line 5206
    const/4 v2, 0x0

    .line 5208
    :try_start_0
    sget-object v0, Lcom/c/b/i$a$b;->c:Lcom/c/b/bk;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bk;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$a$b;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5213
    if-eqz v0, :cond_0

    .line 5214
    invoke-virtual {p0, v0}, Lcom/c/b/i$a$b$a;->a(Lcom/c/b/i$a$b;)Lcom/c/b/i$a$b$a;

    .line 5217
    :cond_0
    return-object p0

    .line 5209
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 5210
    :try_start_1
    invoke-virtual {v1}, Lcom/c/b/av;->a()Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$a$b;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 5211
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 5213
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 5214
    invoke-virtual {p0, v1}, Lcom/c/b/i$a$b$a;->a(Lcom/c/b/i$a$b;)Lcom/c/b/i$a$b$a;

    .line 5213
    :cond_1
    throw v0

    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_0
.end method

.method private r()Lcom/c/b/i$a$b;
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 5160
    new-instance v2, Lcom/c/b/i$a$b;

    invoke-direct {v2, p0, v1}, Lcom/c/b/i$a$b;-><init>(Lcom/c/b/as$a;B)V

    .line 5161
    iget v3, p0, Lcom/c/b/i$a$b$a;->a:I

    .line 5163
    and-int/lit8 v4, v3, 0x1

    if-ne v4, v0, :cond_1

    .line 5166
    :goto_0
    iget v1, p0, Lcom/c/b/i$a$b$a;->b:I

    invoke-static {v2, v1}, Lcom/c/b/i$a$b;->a(Lcom/c/b/i$a$b;I)I

    .line 5167
    and-int/lit8 v1, v3, 0x2

    const/4 v3, 0x2

    if-ne v1, v3, :cond_0

    .line 5168
    or-int/lit8 v0, v0, 0x2

    .line 5170
    :cond_0
    iget v1, p0, Lcom/c/b/i$a$b$a;->c:I

    invoke-static {v2, v1}, Lcom/c/b/i$a$b;->b(Lcom/c/b/i$a$b;I)I

    .line 5171
    invoke-static {v2, v0}, Lcom/c/b/i$a$b;->c(Lcom/c/b/i$a$b;I)I

    .line 5172
    invoke-virtual {p0}, Lcom/c/b/i$a$b$a;->l()V

    .line 5173
    return-object v2

    :cond_1
    move v0, v1

    goto :goto_0
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/bd;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 5103
    invoke-direct {p0, p1}, Lcom/c/b/i$a$b$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$a$b$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 5103
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$a$b$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$a$b$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(I)Lcom/c/b/i$a$b$a;
    .locals 1

    .prologue
    .line 5238
    iget v0, p0, Lcom/c/b/i$a$b$a;->a:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/c/b/i$a$b$a;->a:I

    .line 5239
    iput p1, p0, Lcom/c/b/i$a$b$a;->b:I

    .line 5240
    invoke-virtual {p0}, Lcom/c/b/i$a$b$a;->q()V

    .line 5241
    return-object p0
.end method

.method public final a(Lcom/c/b/i$a$b;)Lcom/c/b/i$a$b$a;
    .locals 1

    .prologue
    .line 5186
    invoke-static {}, Lcom/c/b/i$a$b;->m()Lcom/c/b/i$a$b;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 5195
    :goto_0
    return-object p0

    .line 5187
    :cond_0
    invoke-virtual {p1}, Lcom/c/b/i$a$b;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5188
    invoke-virtual {p1}, Lcom/c/b/i$a$b;->i()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/c/b/i$a$b$a;->a(I)Lcom/c/b/i$a$b$a;

    .line 5190
    :cond_1
    invoke-virtual {p1}, Lcom/c/b/i$a$b;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 5191
    invoke-virtual {p1}, Lcom/c/b/i$a$b;->k()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/c/b/i$a$b$a;->b(I)Lcom/c/b/i$a$b$a;

    .line 5193
    :cond_2
    iget-object v0, p1, Lcom/c/b/i$a$b;->e:Lcom/c/b/by;

    invoke-virtual {p0, v0}, Lcom/c/b/i$a$b$a;->d(Lcom/c/b/by;)Lcom/c/b/as$a;

    .line 5194
    invoke-virtual {p0}, Lcom/c/b/i$a$b$a;->q()V

    goto :goto_0
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 5199
    const/4 v0, 0x1

    return v0
.end method

.method public final synthetic b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 5103
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$a$b$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$a$b$a;

    move-result-object v0

    return-object v0
.end method

.method public final b(I)Lcom/c/b/i$a$b$a;
    .locals 1

    .prologue
    .line 5270
    iget v0, p0, Lcom/c/b/i$a$b$a;->a:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/c/b/i$a$b$a;->a:I

    .line 5271
    iput p1, p0, Lcom/c/b/i$a$b$a;->c:I

    .line 5272
    invoke-virtual {p0}, Lcom/c/b/i$a$b$a;->q()V

    .line 5273
    return-object p0
.end method

.method public final synthetic c(Lcom/c/b/bd;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 5103
    invoke-direct {p0, p1}, Lcom/c/b/i$a$b$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$a$b$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 5103
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$a$b$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$a$b$a;

    move-result-object v0

    return-object v0
.end method

.method protected final d()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 5114
    invoke-static {}, Lcom/c/b/i;->g()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$a$b;

    const-class v2, Lcom/c/b/i$a$b$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 5144
    invoke-static {}, Lcom/c/b/i;->f()Lcom/c/b/ak$a;

    move-result-object v0

    return-object v0
.end method

.method public final g()Lcom/c/b/i$a$b;
    .locals 2

    .prologue
    .line 5152
    invoke-direct {p0}, Lcom/c/b/i$a$b$a;->r()Lcom/c/b/i$a$b;

    move-result-object v0

    .line 5153
    invoke-virtual {v0}, Lcom/c/b/i$a$b;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 5154
    invoke-static {v0}, Lcom/c/b/i$a$b$a;->b(Lcom/c/b/bd;)Lcom/c/b/bx;

    move-result-object v0

    throw v0

    .line 5156
    :cond_0
    return-object v0
.end method

.method public final synthetic h()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 5103
    invoke-direct {p0}, Lcom/c/b/i$a$b$a;->r()Lcom/c/b/i$a$b;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 5103
    invoke-virtual {p0}, Lcom/c/b/i$a$b$a;->g()Lcom/c/b/i$a$b;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 5103
    invoke-virtual {p0}, Lcom/c/b/i$a$b$a;->g()Lcom/c/b/i$a$b;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 5103
    invoke-static {}, Lcom/c/b/i$a$b;->m()Lcom/c/b/i$a$b;

    move-result-object v0

    return-object v0
.end method
