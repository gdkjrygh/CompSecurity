.class final Lcom/a/a/a/f;
.super Lb/a/a/a/a/d/b;
.source "SourceFile"

# interfaces
.implements Lcom/a/a/a/p;


# instance fields
.field a:Lb/a/a/a/a/d/p;

.field b:Lcom/a/a/a/g;

.field private final h:Lb/a/a/a/a/e/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lcom/a/a/a/m;Lb/a/a/a/a/e/g;)V
    .locals 1

    .prologue
    .line 30
    invoke-direct {p0, p1, p2, p3}, Lb/a/a/a/a/d/b;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lb/a/a/a/a/d/d;)V

    .line 25
    new-instance v0, Lcom/a/a/a/h;

    invoke-direct {v0}, Lcom/a/a/a/h;-><init>()V

    iput-object v0, p0, Lcom/a/a/a/f;->b:Lcom/a/a/a/g;

    .line 31
    iput-object p4, p0, Lcom/a/a/a/f;->h:Lb/a/a/a/a/e/g;

    .line 32
    return-void
.end method


# virtual methods
.method public final a()Lb/a/a/a/a/d/p;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/a/a/a/f;->a:Lb/a/a/a/a/d/p;

    return-object v0
.end method

.method public final a(Lb/a/a/a/a/g/b;Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 42
    new-instance v0, Lcom/a/a/a/n;

    invoke-static {}, Lcom/a/a/a/a;->c()Lcom/a/a/a/a;

    move-result-object v1

    iget-object v3, p1, Lb/a/a/a/a/g/b;->a:Ljava/lang/String;

    iget-object v4, p0, Lcom/a/a/a/f;->h:Lb/a/a/a/a/e/g;

    new-instance v2, Lb/a/a/a/a/b/h;

    invoke-direct {v2}, Lb/a/a/a/a/b/h;-><init>()V

    iget-object v2, p0, Lcom/a/a/a/f;->c:Landroid/content/Context;

    invoke-static {v2}, Lb/a/a/a/a/b/h;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/a/a/a/n;-><init>(Lb/a/a/a/l;Ljava/lang/String;Ljava/lang/String;Lb/a/a/a/a/e/g;Ljava/lang/String;)V

    new-instance v1, Lcom/a/a/a/i;

    new-instance v2, Lb/a/a/a/a/c/a/c;

    invoke-direct {v2}, Lb/a/a/a/a/c/a/c;-><init>()V

    invoke-direct {v1, v2}, Lcom/a/a/a/i;-><init>(Lb/a/a/a/a/c/a/a;)V

    new-instance v2, Lb/a/a/a/a/c/a/b;

    const/4 v3, 0x5

    invoke-direct {v2, v3}, Lb/a/a/a/a/c/a/b;-><init>(I)V

    new-instance v3, Lb/a/a/a/a/c/a/e;

    invoke-direct {v3, v1, v2}, Lb/a/a/a/a/c/a/e;-><init>(Lb/a/a/a/a/c/a/a;Lb/a/a/a/a/c/a/d;)V

    new-instance v1, Lcom/a/a/a/j;

    invoke-direct {v1, v3}, Lcom/a/a/a/j;-><init>(Lb/a/a/a/a/c/a/e;)V

    new-instance v2, Lcom/a/a/a/b;

    invoke-direct {v2, v0, v1}, Lcom/a/a/a/b;-><init>(Lcom/a/a/a/n;Lcom/a/a/a/j;)V

    iput-object v2, p0, Lcom/a/a/a/f;->a:Lb/a/a/a/a/d/p;

    .line 45
    iget-object v0, p0, Lcom/a/a/a/f;->d:Lb/a/a/a/a/d/d;

    check-cast v0, Lcom/a/a/a/m;

    invoke-virtual {v0, p1}, Lcom/a/a/a/m;->a(Lb/a/a/a/a/g/b;)V

    .line 47
    iget v0, p1, Lb/a/a/a/a/g/b;->b:I

    invoke-virtual {p0, v0}, Lcom/a/a/a/f;->a(I)V

    .line 49
    iget v0, p1, Lb/a/a/a/a/g/b;->g:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 50
    new-instance v0, Lcom/a/a/a/k;

    iget v1, p1, Lb/a/a/a/a/g/b;->g:I

    invoke-direct {v0, v1}, Lcom/a/a/a/k;-><init>(I)V

    iput-object v0, p0, Lcom/a/a/a/f;->b:Lcom/a/a/a/g;

    .line 52
    :cond_0
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 19
    check-cast p1, Lcom/a/a/a/q;

    iget-object v0, p0, Lcom/a/a/a/f;->b:Lcom/a/a/a/g;

    invoke-interface {v0, p1}, Lcom/a/a/a/g;->a(Lcom/a/a/a/q;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/a/a/a/a;->c()Lcom/a/a/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/a/a/a/a;->v()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "skipping filtered event "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lb/a/a/a/a/b/j;->e(Landroid/content/Context;)V

    :goto_0
    return-void

    :cond_0
    invoke-super {p0, p1}, Lb/a/a/a/a/d/b;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method
