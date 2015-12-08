.class final Lcom/b/a/a/ac;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:La/a/a/a/a/b/x;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;La/a/a/a/a/b/x;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/b/a/a/ac;->a:Landroid/content/Context;

    .line 24
    iput-object p2, p0, Lcom/b/a/a/ac;->b:La/a/a/a/a/b/x;

    .line 25
    iput-object p3, p0, Lcom/b/a/a/ac;->c:Ljava/lang/String;

    .line 26
    iput-object p4, p0, Lcom/b/a/a/ac;->d:Ljava/lang/String;

    .line 27
    return-void
.end method


# virtual methods
.method public final a()Lcom/b/a/a/aa;
    .locals 13

    .prologue
    .line 34
    iget-object v0, p0, Lcom/b/a/a/ac;->b:La/a/a/a/a/b/x;

    invoke-virtual {v0}, La/a/a/a/a/b/x;->g()Ljava/util/Map;

    move-result-object v0

    .line 36
    iget-object v1, p0, Lcom/b/a/a/ac;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 37
    iget-object v2, p0, Lcom/b/a/a/ac;->b:La/a/a/a/a/b/x;

    invoke-virtual {v2}, La/a/a/a/a/b/x;->b()Ljava/lang/String;

    move-result-object v3

    .line 38
    sget-object v2, La/a/a/a/a/b/y;->d:La/a/a/a/a/b/y;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 40
    sget-object v2, La/a/a/a/a/b/y;->g:La/a/a/a/a/b/y;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 42
    iget-object v2, p0, Lcom/b/a/a/ac;->b:La/a/a/a/a/b/x;

    invoke-virtual {v2}, La/a/a/a/a/b/x;->i()Ljava/lang/Boolean;

    move-result-object v6

    .line 43
    sget-object v2, La/a/a/a/a/b/y;->c:La/a/a/a/a/b/y;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 45
    iget-object v0, p0, Lcom/b/a/a/ac;->a:Landroid/content/Context;

    invoke-static {v0}, La/a/a/a/a/b/l;->l(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    .line 46
    invoke-static {}, La/a/a/a/a/b/x;->d()Ljava/lang/String;

    move-result-object v9

    .line 47
    invoke-static {}, La/a/a/a/a/b/x;->e()Ljava/lang/String;

    move-result-object v10

    .line 48
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    .line 50
    new-instance v0, Lcom/b/a/a/aa;

    iget-object v11, p0, Lcom/b/a/a/ac;->c:Ljava/lang/String;

    iget-object v12, p0, Lcom/b/a/a/ac;->d:Ljava/lang/String;

    invoke-direct/range {v0 .. v12}, Lcom/b/a/a/aa;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
