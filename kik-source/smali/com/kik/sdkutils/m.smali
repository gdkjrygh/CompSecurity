.class final Lcom/kik/sdkutils/m;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lcom/kik/g/r;


# direct methods
.method constructor <init>(Landroid/view/View;Lcom/kik/g/r;)V
    .locals 0

    .prologue
    .line 135
    iput-object p1, p0, Lcom/kik/sdkutils/m;->a:Landroid/view/View;

    iput-object p2, p0, Lcom/kik/sdkutils/m;->b:Lcom/kik/g/r;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 140
    iget-object v0, p0, Lcom/kik/sdkutils/m;->a:Landroid/view/View;

    new-instance v1, Lcom/kik/sdkutils/n;

    invoke-direct {v1, p0}, Lcom/kik/sdkutils/n;-><init>(Lcom/kik/sdkutils/m;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 147
    return-void
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 188
    iget-object v0, p0, Lcom/kik/sdkutils/m;->a:Landroid/view/View;

    new-instance v1, Lcom/kik/sdkutils/r;

    invoke-direct {v1, p0, p1}, Lcom/kik/sdkutils/r;-><init>(Lcom/kik/sdkutils/m;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 195
    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 176
    iget-object v0, p0, Lcom/kik/sdkutils/m;->a:Landroid/view/View;

    new-instance v1, Lcom/kik/sdkutils/q;

    invoke-direct {v1, p0, p1}, Lcom/kik/sdkutils/q;-><init>(Lcom/kik/sdkutils/m;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 183
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 152
    iget-object v0, p0, Lcom/kik/sdkutils/m;->a:Landroid/view/View;

    new-instance v1, Lcom/kik/sdkutils/o;

    invoke-direct {v1, p0}, Lcom/kik/sdkutils/o;-><init>(Lcom/kik/sdkutils/m;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 159
    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 164
    iget-object v0, p0, Lcom/kik/sdkutils/m;->a:Landroid/view/View;

    new-instance v1, Lcom/kik/sdkutils/p;

    invoke-direct {v1, p0, p1}, Lcom/kik/sdkutils/p;-><init>(Lcom/kik/sdkutils/m;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 171
    return-void
.end method
