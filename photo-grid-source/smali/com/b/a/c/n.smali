.class final Lcom/b/a/c/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/a/a/a/a/g/s;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La/a/a/a/a/g/s",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/b/a/c/h;


# direct methods
.method constructor <init>(Lcom/b/a/c/h;)V
    .locals 0

    .prologue
    .line 908
    iput-object p1, p0, Lcom/b/a/c/n;->a:Lcom/b/a/c/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(La/a/a/a/a/g/v;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 908
    .line 1911
    const/4 v0, 0x1

    .line 1913
    iget-object v1, p0, Lcom/b/a/c/n;->a:Lcom/b/a/c/h;

    invoke-virtual {v1}, Lcom/b/a/c/h;->w()La/a/a/a/f;

    move-result-object v1

    invoke-virtual {v1}, La/a/a/a/f;->a()Landroid/app/Activity;

    move-result-object v1

    .line 1915
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/b/a/c/n;->a:Lcom/b/a/c/h;

    invoke-virtual {v2}, Lcom/b/a/c/h;->r()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1917
    iget-object v0, p0, Lcom/b/a/c/n;->a:Lcom/b/a/c/h;

    iget-object v2, p1, La/a/a/a/a/g/v;->c:La/a/a/a/a/g/o;

    invoke-static {v0, v1, v2}, Lcom/b/a/c/h;->a(Lcom/b/a/c/h;Landroid/app/Activity;La/a/a/a/a/g/o;)Z

    move-result v0

    .line 1920
    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 908
    return-object v0
.end method
