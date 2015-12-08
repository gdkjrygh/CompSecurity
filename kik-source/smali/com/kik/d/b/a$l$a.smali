.class public final Lcom/kik/d/b/a$l$a;
.super Lcom/c/b/as$a;
.source "SourceFile"

# interfaces
.implements Lcom/kik/d/b/a$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/d/b/a$l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/Object;

.field private c:Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 6986
    invoke-direct {p0}, Lcom/c/b/as$a;-><init>()V

    .line 7097
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/d/b/a$l$a;->b:Ljava/lang/Object;

    .line 7173
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/d/b/a$l$a;->c:Ljava/lang/Object;

    .line 6987
    invoke-static {}, Lcom/kik/d/b/a$l;->l()Z

    .line 6988
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 6969
    invoke-direct {p0}, Lcom/kik/d/b/a$l$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$b;)V
    .locals 1

    .prologue
    .line 6992
    invoke-direct {p0, p1}, Lcom/c/b/as$a;-><init>(Lcom/c/b/as$b;)V

    .line 7097
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/d/b/a$l$a;->b:Ljava/lang/Object;

    .line 7173
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/d/b/a$l$a;->c:Ljava/lang/Object;

    .line 6993
    invoke-static {}, Lcom/kik/d/b/a$l;->l()Z

    .line 6994
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$b;B)V
    .locals 0

    .prologue
    .line 6969
    invoke-direct {p0, p1}, Lcom/kik/d/b/a$l$a;-><init>(Lcom/c/b/as$b;)V

    return-void
.end method

.method private d(Lcom/c/b/bd;)Lcom/kik/d/b/a$l$a;
    .locals 1

    .prologue
    .line 7043
    instance-of v0, p1, Lcom/kik/d/b/a$l;

    if-eqz v0, :cond_0

    .line 7044
    check-cast p1, Lcom/kik/d/b/a$l;

    invoke-virtual {p0, p1}, Lcom/kik/d/b/a$l$a;->a(Lcom/kik/d/b/a$l;)Lcom/kik/d/b/a$l$a;

    move-result-object p0

    .line 7047
    :goto_0
    return-object p0

    .line 7046
    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as$a;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    goto :goto_0
.end method

.method private d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/d/b/a$l$a;
    .locals 4

    .prologue
    .line 7082
    const/4 v2, 0x0

    .line 7084
    :try_start_0
    sget-object v0, Lcom/kik/d/b/a$l;->c:Lcom/c/b/bk;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bk;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/d/b/a$l;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 7089
    if-eqz v0, :cond_0

    .line 7090
    invoke-virtual {p0, v0}, Lcom/kik/d/b/a$l$a;->a(Lcom/kik/d/b/a$l;)Lcom/kik/d/b/a$l$a;

    .line 7093
    :cond_0
    return-object p0

    .line 7085
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 7086
    :try_start_1
    invoke-virtual {v1}, Lcom/c/b/av;->a()Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/kik/d/b/a$l;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 7087
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 7089
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 7090
    invoke-virtual {p0, v1}, Lcom/kik/d/b/a$l$a;->a(Lcom/kik/d/b/a$l;)Lcom/kik/d/b/a$l$a;

    :cond_1
    throw v0

    .line 7089
    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_0
.end method

.method private s()Lcom/kik/d/b/a$l;
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 7026
    new-instance v2, Lcom/kik/d/b/a$l;

    invoke-direct {v2, p0, v1}, Lcom/kik/d/b/a$l;-><init>(Lcom/c/b/as$a;B)V

    .line 7027
    iget v3, p0, Lcom/kik/d/b/a$l$a;->a:I

    .line 7029
    and-int/lit8 v4, v3, 0x1

    if-ne v4, v0, :cond_1

    .line 7032
    :goto_0
    iget-object v1, p0, Lcom/kik/d/b/a$l$a;->b:Ljava/lang/Object;

    invoke-static {v2, v1}, Lcom/kik/d/b/a$l;->a(Lcom/kik/d/b/a$l;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7033
    and-int/lit8 v1, v3, 0x2

    const/4 v3, 0x2

    if-ne v1, v3, :cond_0

    .line 7034
    or-int/lit8 v0, v0, 0x2

    .line 7036
    :cond_0
    iget-object v1, p0, Lcom/kik/d/b/a$l$a;->c:Ljava/lang/Object;

    invoke-static {v2, v1}, Lcom/kik/d/b/a$l;->b(Lcom/kik/d/b/a$l;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7037
    invoke-static {v2, v0}, Lcom/kik/d/b/a$l;->a(Lcom/kik/d/b/a$l;I)I

    .line 7038
    invoke-virtual {p0}, Lcom/kik/d/b/a$l$a;->l()V

    .line 7039
    return-object v2

    :cond_1
    move v0, v1

    goto :goto_0
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/bd;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 6969
    invoke-direct {p0, p1}, Lcom/kik/d/b/a$l$a;->d(Lcom/c/b/bd;)Lcom/kik/d/b/a$l$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 6969
    invoke-direct {p0, p1, p2}, Lcom/kik/d/b/a$l$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/d/b/a$l$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/kik/d/b/a$l;)Lcom/kik/d/b/a$l$a;
    .locals 1

    .prologue
    .line 7052
    invoke-static {}, Lcom/kik/d/b/a$l;->k()Lcom/kik/d/b/a$l;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 7065
    :goto_0
    return-object p0

    .line 7053
    :cond_0
    invoke-virtual {p1}, Lcom/kik/d/b/a$l;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7054
    iget v0, p0, Lcom/kik/d/b/a$l$a;->a:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/kik/d/b/a$l$a;->a:I

    .line 7055
    invoke-static {p1}, Lcom/kik/d/b/a$l;->a(Lcom/kik/d/b/a$l;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$l$a;->b:Ljava/lang/Object;

    .line 7056
    invoke-virtual {p0}, Lcom/kik/d/b/a$l$a;->q()V

    .line 7058
    :cond_1
    invoke-virtual {p1}, Lcom/kik/d/b/a$l;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 7059
    iget v0, p0, Lcom/kik/d/b/a$l$a;->a:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/kik/d/b/a$l$a;->a:I

    .line 7060
    invoke-static {p1}, Lcom/kik/d/b/a$l;->b(Lcom/kik/d/b/a$l;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$l$a;->c:Ljava/lang/Object;

    .line 7061
    invoke-virtual {p0}, Lcom/kik/d/b/a$l$a;->q()V

    .line 7063
    :cond_2
    invoke-static {p1}, Lcom/kik/d/b/a$l;->c(Lcom/kik/d/b/a$l;)Lcom/c/b/by;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/kik/d/b/a$l$a;->d(Lcom/c/b/by;)Lcom/c/b/as$a;

    .line 7064
    invoke-virtual {p0}, Lcom/kik/d/b/a$l$a;->q()V

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;)Lcom/kik/d/b/a$l$a;
    .locals 1

    .prologue
    .line 7142
    if-nez p1, :cond_0

    .line 7143
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 7145
    :cond_0
    iget v0, p0, Lcom/kik/d/b/a$l$a;->a:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/kik/d/b/a$l$a;->a:I

    .line 7146
    iput-object p1, p0, Lcom/kik/d/b/a$l$a;->b:Ljava/lang/Object;

    .line 7147
    invoke-virtual {p0}, Lcom/kik/d/b/a$l$a;->q()V

    .line 7148
    return-object p0
.end method

.method public final a()Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 7069
    iget v2, p0, Lcom/kik/d/b/a$l$a;->a:I

    and-int/lit8 v2, v2, 0x1

    if-ne v2, v1, :cond_1

    move v2, v1

    :goto_0
    if-nez v2, :cond_2

    .line 7075
    :cond_0
    :goto_1
    return v0

    :cond_1
    move v2, v0

    .line 7069
    goto :goto_0

    .line 7072
    :cond_2
    iget v2, p0, Lcom/kik/d/b/a$l$a;->a:I

    and-int/lit8 v2, v2, 0x2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_3

    move v2, v1

    :goto_2
    if-eqz v2, :cond_0

    move v0, v1

    .line 7075
    goto :goto_1

    :cond_3
    move v2, v0

    .line 7072
    goto :goto_2
.end method

.method public final synthetic b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 6969
    invoke-direct {p0, p1, p2}, Lcom/kik/d/b/a$l$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/d/b/a$l$a;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/String;)Lcom/kik/d/b/a$l$a;
    .locals 1

    .prologue
    .line 7218
    if-nez p1, :cond_0

    .line 7219
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 7221
    :cond_0
    iget v0, p0, Lcom/kik/d/b/a$l$a;->a:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/kik/d/b/a$l$a;->a:I

    .line 7222
    iput-object p1, p0, Lcom/kik/d/b/a$l$a;->c:Ljava/lang/Object;

    .line 7223
    invoke-virtual {p0}, Lcom/kik/d/b/a$l$a;->q()V

    .line 7224
    return-object p0
.end method

.method public final synthetic c(Lcom/c/b/bd;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 6969
    invoke-direct {p0, p1}, Lcom/kik/d/b/a$l$a;->d(Lcom/c/b/bd;)Lcom/kik/d/b/a$l$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 6969
    invoke-direct {p0, p1, p2}, Lcom/kik/d/b/a$l$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/d/b/a$l$a;

    move-result-object v0

    return-object v0
.end method

.method protected final d()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 6980
    invoke-static {}, Lcom/kik/d/b/a;->j()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/kik/d/b/a$l;

    const-class v2, Lcom/kik/d/b/a$l$a;

    .line 6981
    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 7010
    invoke-static {}, Lcom/kik/d/b/a;->i()Lcom/c/b/ak$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic h()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 6969
    invoke-direct {p0}, Lcom/kik/d/b/a$l$a;->s()Lcom/kik/d/b/a$l;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 6969
    invoke-virtual {p0}, Lcom/kik/d/b/a$l$a;->r()Lcom/kik/d/b/a$l;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 6969
    invoke-virtual {p0}, Lcom/kik/d/b/a$l$a;->r()Lcom/kik/d/b/a$l;

    move-result-object v0

    return-object v0
.end method

.method public final r()Lcom/kik/d/b/a$l;
    .locals 2

    .prologue
    .line 7018
    invoke-direct {p0}, Lcom/kik/d/b/a$l$a;->s()Lcom/kik/d/b/a$l;

    move-result-object v0

    .line 7019
    invoke-virtual {v0}, Lcom/kik/d/b/a$l;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 7020
    invoke-static {v0}, Lcom/kik/d/b/a$l$a;->b(Lcom/c/b/bd;)Lcom/c/b/bx;

    move-result-object v0

    throw v0

    .line 7022
    :cond_0
    return-object v0
.end method

.method public final synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 6969
    invoke-static {}, Lcom/kik/d/b/a$l;->k()Lcom/kik/d/b/a$l;

    move-result-object v0

    return-object v0
.end method
