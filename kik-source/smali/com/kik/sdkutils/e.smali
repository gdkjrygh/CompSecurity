.class final Lcom/kik/sdkutils/e;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lcom/kik/g/p;


# direct methods
.method constructor <init>(Landroid/view/View;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 21
    iput-object p1, p0, Lcom/kik/sdkutils/e;->a:Landroid/view/View;

    iput-object p2, p0, Lcom/kik/sdkutils/e;->b:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 50
    iget-object v0, p0, Lcom/kik/sdkutils/e;->a:Landroid/view/View;

    new-instance v1, Lcom/kik/sdkutils/h;

    invoke-direct {v1, p0, p1}, Lcom/kik/sdkutils/h;-><init>(Lcom/kik/sdkutils/e;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 57
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 26
    iget-object v0, p0, Lcom/kik/sdkutils/e;->a:Landroid/view/View;

    new-instance v1, Lcom/kik/sdkutils/f;

    invoke-direct {v1, p0}, Lcom/kik/sdkutils/f;-><init>(Lcom/kik/sdkutils/e;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 33
    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 38
    iget-object v0, p0, Lcom/kik/sdkutils/e;->a:Landroid/view/View;

    new-instance v1, Lcom/kik/sdkutils/g;

    invoke-direct {v1, p0, p1}, Lcom/kik/sdkutils/g;-><init>(Lcom/kik/sdkutils/e;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 45
    return-void
.end method
