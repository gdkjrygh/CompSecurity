.class final Lcom/b/a/a/m;
.super La/a/a/a/a/d/b;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/a/w;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/a/a/a/a/d/b",
        "<",
        "Lcom/b/a/a/x;",
        ">;",
        "Lcom/b/a/a/w",
        "<",
        "Lcom/b/a/a/x;",
        ">;"
    }
.end annotation


# instance fields
.field final a:Lcom/b/a/a/aa;

.field b:Lcom/b/a/a/n;

.field c:La/a/a/a/a/d/l;

.field d:La/a/a/a/a/b/j;

.field e:Z

.field f:Z

.field private final l:La/a/a/a/p;

.field private final m:La/a/a/a/a/e/m;


# direct methods
.method public constructor <init>(La/a/a/a/p;Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lcom/b/a/a/t;La/a/a/a/a/e/m;Lcom/b/a/a/aa;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 40
    invoke-direct {p0, p2, p3, p4}, La/a/a/a/a/d/b;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;La/a/a/a/a/d/d;)V

    .line 30
    new-instance v0, Lcom/b/a/a/o;

    invoke-direct {v0}, Lcom/b/a/a/o;-><init>()V

    iput-object v0, p0, Lcom/b/a/a/m;->b:Lcom/b/a/a/n;

    .line 32
    new-instance v0, La/a/a/a/a/b/j;

    invoke-direct {v0}, La/a/a/a/a/b/j;-><init>()V

    iput-object v0, p0, Lcom/b/a/a/m;->d:La/a/a/a/a/b/j;

    .line 33
    iput-boolean v1, p0, Lcom/b/a/a/m;->e:Z

    .line 34
    iput-boolean v1, p0, Lcom/b/a/a/m;->f:Z

    .line 41
    iput-object p1, p0, Lcom/b/a/a/m;->l:La/a/a/a/p;

    .line 42
    iput-object p5, p0, Lcom/b/a/a/m;->m:La/a/a/a/a/e/m;

    .line 43
    iput-object p6, p0, Lcom/b/a/a/m;->a:Lcom/b/a/a/aa;

    .line 44
    return-void
.end method


# virtual methods
.method public final a()La/a/a/a/a/d/l;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/b/a/a/m;->c:La/a/a/a/a/d/l;

    return-object v0
.end method

.method public final a(La/a/a/a/a/g/b;Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 54
    new-instance v0, Lcom/b/a/a/u;

    iget-object v1, p0, Lcom/b/a/a/m;->l:La/a/a/a/p;

    iget-object v3, p1, La/a/a/a/a/g/b;->a:Ljava/lang/String;

    iget-object v4, p0, Lcom/b/a/a/m;->m:La/a/a/a/a/e/m;

    iget-object v2, p0, Lcom/b/a/a/m;->g:Landroid/content/Context;

    invoke-static {v2}, La/a/a/a/a/b/j;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/b/a/a/u;-><init>(La/a/a/a/p;Ljava/lang/String;Ljava/lang/String;La/a/a/a/a/e/m;Ljava/lang/String;)V

    .line 1031
    new-instance v1, Lcom/b/a/a/p;

    new-instance v2, La/a/a/a/a/c/a/c;

    invoke-direct {v2}, La/a/a/a/a/c/a/c;-><init>()V

    invoke-direct {v1, v2}, Lcom/b/a/a/p;-><init>(La/a/a/a/a/c/a/a;)V

    .line 1033
    new-instance v2, La/a/a/a/a/c/a/b;

    const/4 v3, 0x5

    invoke-direct {v2, v3}, La/a/a/a/a/c/a/b;-><init>(I)V

    .line 1034
    new-instance v3, La/a/a/a/a/c/a/e;

    invoke-direct {v3, v1, v2}, La/a/a/a/a/c/a/e;-><init>(La/a/a/a/a/c/a/a;La/a/a/a/a/c/a/d;)V

    .line 1035
    new-instance v1, Lcom/b/a/a/q;

    invoke-direct {v1, v3}, Lcom/b/a/a/q;-><init>(La/a/a/a/a/c/a/e;)V

    .line 1036
    new-instance v2, Lcom/b/a/a/k;

    invoke-direct {v2, v0, v1}, Lcom/b/a/a/k;-><init>(Lcom/b/a/a/u;Lcom/b/a/a/q;)V

    .line 54
    iput-object v2, p0, Lcom/b/a/a/m;->c:La/a/a/a/a/d/l;

    .line 57
    iget-object v0, p0, Lcom/b/a/a/m;->h:La/a/a/a/a/d/d;

    check-cast v0, Lcom/b/a/a/t;

    invoke-virtual {v0, p1}, Lcom/b/a/a/t;->a(La/a/a/a/a/g/b;)V

    .line 60
    iget-boolean v0, p1, La/a/a/a/a/g/b;->f:Z

    iput-boolean v0, p0, Lcom/b/a/a/m;->e:Z

    .line 61
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v0, "Custom event tracking "

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/b/a/a/m;->e:Z

    if-eqz v0, :cond_1

    const-string v0, "enabled"

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    iget-boolean v0, p1, La/a/a/a/a/g/b;->g:Z

    iput-boolean v0, p0, Lcom/b/a/a/m;->f:Z

    .line 65
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v0, "Predefined event tracking "

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/b/a/a/m;->f:Z

    if-eqz v0, :cond_2

    const-string v0, "enabled"

    :goto_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    iget v0, p1, La/a/a/a/a/g/b;->h:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 69
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 70
    new-instance v0, Lcom/b/a/a/r;

    iget v1, p1, La/a/a/a/a/g/b;->h:I

    invoke-direct {v0, v1}, Lcom/b/a/a/r;-><init>(I)V

    iput-object v0, p0, Lcom/b/a/a/m;->b:Lcom/b/a/a/n;

    .line 73
    :cond_0
    iget v0, p1, La/a/a/a/a/g/b;->b:I

    invoke-virtual {p0, v0}, Lcom/b/a/a/m;->a(I)V

    .line 74
    return-void

    .line 61
    :cond_1
    const-string v0, "disabled"

    goto :goto_0

    .line 65
    :cond_2
    const-string v0, "disabled"

    goto :goto_1
.end method

.method public final a(Lcom/b/a/a/y;)V
    .locals 11

    .prologue
    .line 78
    iget-object v1, p0, Lcom/b/a/a/m;->a:Lcom/b/a/a/aa;

    .line 1132
    new-instance v0, Lcom/b/a/a/x;

    iget-wide v2, p1, Lcom/b/a/a/y;->b:J

    iget-object v4, p1, Lcom/b/a/a/y;->a:Lcom/b/a/a/z;

    iget-object v5, p1, Lcom/b/a/a/y;->c:Ljava/util/Map;

    iget-object v6, p1, Lcom/b/a/a/y;->d:Ljava/lang/String;

    iget-object v7, p1, Lcom/b/a/a/y;->e:Ljava/util/Map;

    iget-object v8, p1, Lcom/b/a/a/y;->f:Ljava/lang/String;

    iget-object v9, p1, Lcom/b/a/a/y;->g:Ljava/util/Map;

    const/4 v10, 0x0

    invoke-direct/range {v0 .. v10}, Lcom/b/a/a/x;-><init>(Lcom/b/a/a/aa;JLcom/b/a/a/z;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;B)V

    .line 80
    iget-boolean v1, p0, Lcom/b/a/a/m;->e:Z

    if-nez v1, :cond_0

    sget-object v1, Lcom/b/a/a/z;->k:Lcom/b/a/a/z;

    iget-object v2, v0, Lcom/b/a/a/x;->c:Lcom/b/a/a/z;

    invoke-virtual {v1, v2}, Lcom/b/a/a/z;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 81
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Custom events tracking disabled - skipping event: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    :goto_0
    return-void

    .line 86
    :cond_0
    iget-boolean v1, p0, Lcom/b/a/a/m;->f:Z

    if-nez v1, :cond_1

    sget-object v1, Lcom/b/a/a/z;->l:Lcom/b/a/a/z;

    iget-object v2, v0, Lcom/b/a/a/x;->c:Lcom/b/a/a/z;

    invoke-virtual {v1, v2}, Lcom/b/a/a/z;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 87
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Predefined events tracking disabled - skipping event: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 92
    :cond_1
    iget-object v1, p0, Lcom/b/a/a/m;->b:Lcom/b/a/a/n;

    invoke-interface {v1, v0}, Lcom/b/a/a/n;->a(Lcom/b/a/a/x;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 93
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Skipping filtered event: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 97
    :cond_2
    invoke-virtual {p0, v0}, Lcom/b/a/a/m;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method
