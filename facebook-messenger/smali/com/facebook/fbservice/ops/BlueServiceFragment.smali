.class public Lcom/facebook/fbservice/ops/BlueServiceFragment;
.super Landroid/support/v4/app/Fragment;
.source "BlueServiceFragment.java"


# instance fields
.field private a:Lcom/facebook/fbservice/ops/c;

.field private b:Lcom/facebook/fbservice/ops/h;

.field private c:Lcom/facebook/fbservice/ops/i;

.field private d:Lcom/facebook/fbservice/ops/ab;

.field private e:Z

.field private f:Lcom/facebook/fbservice/service/OperationType;

.field private g:Landroid/os/Bundle;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method

.method public static a(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Lcom/facebook/fbservice/ops/BlueServiceFragment;
    .locals 1

    .prologue
    .line 213
    invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->q()Landroid/support/v4/app/q;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Landroid/support/v4/app/q;Ljava/lang/String;)Lcom/facebook/fbservice/ops/BlueServiceFragment;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/support/v4/app/i;Ljava/lang/String;)Lcom/facebook/fbservice/ops/BlueServiceFragment;
    .locals 1

    .prologue
    .line 202
    invoke-virtual {p0}, Landroid/support/v4/app/i;->f()Landroid/support/v4/app/q;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Landroid/support/v4/app/q;Ljava/lang/String;)Lcom/facebook/fbservice/ops/BlueServiceFragment;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/support/v4/app/q;Ljava/lang/String;)Lcom/facebook/fbservice/ops/BlueServiceFragment;
    .locals 2

    .prologue
    .line 224
    invoke-virtual {p0, p1}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/ops/BlueServiceFragment;

    .line 225
    if-nez v0, :cond_0

    .line 226
    new-instance v0, Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-direct {v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;-><init>()V

    .line 227
    invoke-virtual {p0}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v1

    .line 228
    invoke-virtual {v1, v0, p1}, Landroid/support/v4/app/ad;->a(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/ad;

    .line 229
    invoke-virtual {v1}, Landroid/support/v4/app/ad;->a()I

    .line 231
    :cond_0
    return-object v0
.end method

.method static synthetic a(Lcom/facebook/fbservice/ops/BlueServiceFragment;)Lcom/facebook/fbservice/ops/h;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->b:Lcom/facebook/fbservice/ops/h;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/fbservice/ops/BlueServiceFragment;)Lcom/facebook/fbservice/ops/i;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->c:Lcom/facebook/fbservice/ops/i;

    return-object v0
.end method


# virtual methods
.method public C()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 82
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->C()V

    .line 83
    iget-object v0, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a:Lcom/facebook/fbservice/ops/c;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/c;->a()V

    .line 84
    iput-object v1, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->b:Lcom/facebook/fbservice/ops/h;

    .line 85
    iput-object v1, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->c:Lcom/facebook/fbservice/ops/i;

    .line 86
    return-void
.end method

.method public a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 35
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->a(Landroid/content/Context;)V

    .line 36
    invoke-virtual {p0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->c()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/fbservice/ops/c;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/ops/c;

    iput-object v0, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a:Lcom/facebook/fbservice/ops/c;

    .line 37
    return-void
.end method

.method public a(Lcom/facebook/fbservice/ops/ab;)V
    .locals 1

    .prologue
    .line 167
    iget-boolean v0, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->e:Z

    if-eqz v0, :cond_0

    .line 168
    iget-object v0, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a:Lcom/facebook/fbservice/ops/c;

    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/ops/c;->a(Lcom/facebook/fbservice/ops/ab;)V

    .line 172
    :goto_0
    return-void

    .line 170
    :cond_0
    iput-object p1, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->d:Lcom/facebook/fbservice/ops/ab;

    goto :goto_0
.end method

.method public a(Lcom/facebook/fbservice/ops/h;)V
    .locals 0

    .prologue
    .line 127
    iput-object p1, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->b:Lcom/facebook/fbservice/ops/h;

    .line 128
    return-void
.end method

.method public a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V
    .locals 1
    .param p2    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 182
    iget-boolean v0, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->e:Z

    if-eqz v0, :cond_0

    .line 183
    iget-object v0, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a:Lcom/facebook/fbservice/ops/c;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/fbservice/ops/c;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    .line 188
    :goto_0
    return-void

    .line 185
    :cond_0
    iput-object p1, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->f:Lcom/facebook/fbservice/service/OperationType;

    .line 186
    iput-object p2, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->g:Landroid/os/Bundle;

    goto :goto_0
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 100
    iget-boolean v0, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a:Lcom/facebook/fbservice/ops/c;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/c;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Lcom/facebook/fbservice/ops/j;
    .locals 1

    .prologue
    .line 109
    iget-object v0, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a:Lcom/facebook/fbservice/ops/c;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/c;->c()Lcom/facebook/fbservice/ops/j;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/facebook/inject/t;
    .locals 1

    .prologue
    .line 191
    invoke-virtual {p0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->n()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 41
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->d(Landroid/os/Bundle;)V

    .line 42
    iget-object v0, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a:Lcom/facebook/fbservice/ops/c;

    invoke-virtual {v0, v2}, Lcom/facebook/fbservice/ops/c;->a(Z)V

    .line 43
    iget-object v0, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a:Lcom/facebook/fbservice/ops/c;

    new-instance v1, Lcom/facebook/fbservice/ops/a;

    invoke-direct {v1, p0}, Lcom/facebook/fbservice/ops/a;-><init>(Lcom/facebook/fbservice/ops/BlueServiceFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/c;->a(Lcom/facebook/fbservice/ops/h;)V

    .line 58
    iget-object v0, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a:Lcom/facebook/fbservice/ops/c;

    new-instance v1, Lcom/facebook/fbservice/ops/b;

    invoke-direct {v1, p0}, Lcom/facebook/fbservice/ops/b;-><init>(Lcom/facebook/fbservice/ops/BlueServiceFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/c;->a(Lcom/facebook/fbservice/ops/i;)V

    .line 66
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->f:Lcom/facebook/fbservice/service/OperationType;

    if-nez v0, :cond_0

    .line 67
    iget-object v0, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a:Lcom/facebook/fbservice/ops/c;

    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/ops/c;->b(Landroid/os/Bundle;)V

    .line 69
    :cond_0
    iget-object v0, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a:Lcom/facebook/fbservice/ops/c;

    iget-object v1, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->d:Lcom/facebook/fbservice/ops/ab;

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/c;->a(Lcom/facebook/fbservice/ops/ab;)V

    .line 70
    iput-object v3, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->d:Lcom/facebook/fbservice/ops/ab;

    .line 71
    iput-boolean v2, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->e:Z

    .line 73
    iget-object v0, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->f:Lcom/facebook/fbservice/service/OperationType;

    if-eqz v0, :cond_1

    .line 74
    iget-object v0, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a:Lcom/facebook/fbservice/ops/c;

    iget-object v1, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->f:Lcom/facebook/fbservice/service/OperationType;

    iget-object v2, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->g:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/ops/c;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    .line 75
    iput-object v3, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->f:Lcom/facebook/fbservice/service/OperationType;

    .line 76
    iput-object v3, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->g:Landroid/os/Bundle;

    .line 78
    :cond_1
    return-void
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 90
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->e(Landroid/os/Bundle;)V

    .line 91
    iget-object v0, p0, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a:Lcom/facebook/fbservice/ops/c;

    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/ops/c;->a(Landroid/os/Bundle;)V

    .line 92
    return-void
.end method
