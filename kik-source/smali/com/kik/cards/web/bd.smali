.class public final Lcom/kik/cards/web/bd;
.super Lcom/kik/cards/web/aq;
.source "SourceFile"


# instance fields
.field private final c:Lcom/kik/g/k;

.field private d:Lcom/kik/cards/web/plugin/JavascriptGlue;

.field private e:Lcom/kik/cards/web/plugin/h;

.field private final f:Lcom/kik/g/i;

.field private g:Lcom/kik/g/k;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/kik/cards/web/au;Lcom/kik/m/a;Lcom/kik/cards/web/az;Lkik/a/f/k;Lkik/a/e/q;)V
    .locals 4

    .prologue
    .line 34
    invoke-direct {p0, p1, p6}, Lcom/kik/cards/web/aq;-><init>(Landroid/content/Context;Lkik/a/e/q;)V

    .line 20
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cards/web/bd;->c:Lcom/kik/g/k;

    .line 23
    new-instance v0, Lcom/kik/cards/web/be;

    invoke-direct {v0, p0}, Lcom/kik/cards/web/be;-><init>(Lcom/kik/cards/web/bd;)V

    iput-object v0, p0, Lcom/kik/cards/web/bd;->f:Lcom/kik/g/i;

    .line 30
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cards/web/bd;->g:Lcom/kik/g/k;

    .line 37
    const-string v0, "dev"

    .line 41
    :try_start_0
    invoke-virtual {p0}, Lcom/kik/cards/web/bd;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p0}, Lcom/kik/cards/web/bd;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 42
    iget-object v0, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    :goto_0
    new-instance v1, Lcom/kik/cards/web/plugin/h;

    invoke-direct {v1, p3, v0, p5}, Lcom/kik/cards/web/plugin/h;-><init>(Lcom/kik/m/a;Ljava/lang/String;Lkik/a/f/k;)V

    iput-object v1, p0, Lcom/kik/cards/web/bd;->e:Lcom/kik/cards/web/plugin/h;

    .line 49
    iget-object v0, p0, Lcom/kik/cards/web/bd;->e:Lcom/kik/cards/web/plugin/h;

    invoke-static {p0, v0, p2, p4}, Lcom/kik/cards/web/plugin/JavascriptGlue;->a(Landroid/webkit/WebView;Lcom/kik/cards/web/plugin/h;Lcom/kik/cards/web/au;Lcom/kik/cards/web/az;)Lcom/kik/cards/web/plugin/JavascriptGlue;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/cards/web/bd;->d:Lcom/kik/cards/web/plugin/JavascriptGlue;

    .line 51
    invoke-virtual {p0}, Lcom/kik/cards/web/bd;->l()Lcom/kik/g/f;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/bd;->d:Lcom/kik/cards/web/plugin/JavascriptGlue;

    invoke-virtual {v1}, Lcom/kik/cards/web/plugin/JavascriptGlue;->a()Lcom/kik/cards/web/ba;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kik/cards/web/ba;->a()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/cards/web/bd;->g:Lcom/kik/g/k;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/k;)Lcom/kik/g/e;

    .line 52
    invoke-virtual {p0}, Lcom/kik/cards/web/bd;->l()Lcom/kik/g/f;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/bd;->e:Lcom/kik/cards/web/plugin/h;

    invoke-virtual {v1}, Lcom/kik/cards/web/plugin/h;->a()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/cards/web/bd;->f:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 53
    return-void

    .line 45
    :catch_0
    move-exception v1

    sget-object v1, Lcom/kik/cards/web/bd;->a:Lorg/c/b;

    const-string v2, "Could not retrieve app version"

    invoke-interface {v1, v2}, Lorg/c/b;->b(Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method public final destroy()V
    .locals 0

    .prologue
    .line 107
    invoke-virtual {p0}, Lcom/kik/cards/web/bd;->v()V

    .line 109
    invoke-super {p0}, Lcom/kik/cards/web/aq;->destroy()V

    .line 110
    return-void
.end method

.method public final q()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/kik/cards/web/bd;->g:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final r()Lcom/kik/cards/web/plugin/h;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/kik/cards/web/bd;->e:Lcom/kik/cards/web/plugin/h;

    return-object v0
.end method

.method public final s()Lcom/kik/cards/web/plugin/JavascriptGlue;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/kik/cards/web/bd;->d:Lcom/kik/cards/web/plugin/JavascriptGlue;

    return-object v0
.end method

.method public final t()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/kik/cards/web/bd;->d:Lcom/kik/cards/web/plugin/JavascriptGlue;

    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/JavascriptGlue;->a()Lcom/kik/cards/web/ba;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/cards/web/ba;->c()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final u()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/kik/cards/web/bd;->d:Lcom/kik/cards/web/plugin/JavascriptGlue;

    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/JavascriptGlue;->a()Lcom/kik/cards/web/ba;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/cards/web/ba;->b()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final v()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 88
    iget-object v0, p0, Lcom/kik/cards/web/bd;->d:Lcom/kik/cards/web/plugin/JavascriptGlue;

    if-eqz v0, :cond_0

    .line 89
    iget-object v0, p0, Lcom/kik/cards/web/bd;->d:Lcom/kik/cards/web/plugin/JavascriptGlue;

    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/JavascriptGlue;->b()V

    .line 90
    iput-object v1, p0, Lcom/kik/cards/web/bd;->d:Lcom/kik/cards/web/plugin/JavascriptGlue;

    .line 92
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/bd;->e:Lcom/kik/cards/web/plugin/h;

    if-eqz v0, :cond_1

    .line 93
    iget-object v0, p0, Lcom/kik/cards/web/bd;->e:Lcom/kik/cards/web/plugin/h;

    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/h;->c()V

    .line 94
    iput-object v1, p0, Lcom/kik/cards/web/bd;->e:Lcom/kik/cards/web/plugin/h;

    .line 96
    :cond_1
    return-void
.end method

.method public final w()Z
    .locals 1

    .prologue
    .line 100
    iget-object v0, p0, Lcom/kik/cards/web/bd;->e:Lcom/kik/cards/web/plugin/h;

    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/h;->b()Z

    move-result v0

    return v0
.end method
