.class final Lcom/a/a/c/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb/a/a/a/a/g/q$b;


# instance fields
.field final synthetic a:Lcom/a/a/c/g;


# direct methods
.method constructor <init>(Lcom/a/a/c/g;)V
    .locals 0

    .prologue
    .line 903
    iput-object p1, p0, Lcom/a/a/c/m;->a:Lcom/a/a/c/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lb/a/a/a/a/g/t;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 903
    const/4 v0, 0x1

    iget-object v1, p0, Lcom/a/a/c/m;->a:Lcom/a/a/c/g;

    invoke-virtual {v1}, Lcom/a/a/c/g;->w()Lb/a/a/a/d;

    move-result-object v1

    invoke-virtual {v1}, Lb/a/a/a/d;->a()Landroid/app/Activity;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/a/a/c/m;->a:Lcom/a/a/c/g;

    invoke-virtual {v2}, Lcom/a/a/c/g;->r()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, p0, Lcom/a/a/c/m;->a:Lcom/a/a/c/g;

    iget-object v2, p1, Lb/a/a/a/a/g/t;->c:Lb/a/a/a/a/g/o;

    invoke-static {v0, v1, v2}, Lcom/a/a/c/g;->a(Lcom/a/a/c/g;Landroid/app/Activity;Lb/a/a/a/a/g/o;)Z

    move-result v0

    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
