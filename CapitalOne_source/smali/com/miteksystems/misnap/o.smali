.class final Lcom/miteksystems/misnap/o;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/miteksystems/misnap/l;


# direct methods
.method constructor <init>(Lcom/miteksystems/misnap/l;)V
    .locals 0

    iput-object p1, p0, Lcom/miteksystems/misnap/o;->a:Lcom/miteksystems/misnap/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/miteksystems/misnap/o;->a:Lcom/miteksystems/misnap/l;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/miteksystems/misnap/l;->a(Lcom/miteksystems/misnap/l;Z)V

    iget-object v0, p0, Lcom/miteksystems/misnap/o;->a:Lcom/miteksystems/misnap/l;

    invoke-static {v0}, Lcom/miteksystems/misnap/l;->a(Lcom/miteksystems/misnap/l;)Landroid/hardware/Camera;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/o;->a:Lcom/miteksystems/misnap/l;

    invoke-static {v0}, Lcom/miteksystems/misnap/l;->e(Lcom/miteksystems/misnap/l;)Lcom/miteksystems/misnap/MitekAnalyzer;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/o;->a:Lcom/miteksystems/misnap/l;

    invoke-static {v0}, Lcom/miteksystems/misnap/l;->f(Lcom/miteksystems/misnap/l;)Lcom/miteksystems/misnap/u;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/o;->a:Lcom/miteksystems/misnap/l;

    invoke-static {v0}, Lcom/miteksystems/misnap/l;->f(Lcom/miteksystems/misnap/l;)Lcom/miteksystems/misnap/u;

    move-result-object v0

    invoke-virtual {v0}, Lcom/miteksystems/misnap/u;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/o;->a:Lcom/miteksystems/misnap/l;

    invoke-static {v0}, Lcom/miteksystems/misnap/l;->c(Lcom/miteksystems/misnap/l;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/o;->a:Lcom/miteksystems/misnap/l;

    invoke-static {v0, v4}, Lcom/miteksystems/misnap/l;->a(Lcom/miteksystems/misnap/l;Z)V

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/miteksystems/misnap/o;->a:Lcom/miteksystems/misnap/l;

    invoke-static {v0}, Lcom/miteksystems/misnap/l;->g(Lcom/miteksystems/misnap/l;)Lcom/miteksystems/misnap/MiSnap;

    move-result-object v0

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/o;->a:Lcom/miteksystems/misnap/l;

    invoke-static {v0}, Lcom/miteksystems/misnap/l;->h(Lcom/miteksystems/misnap/l;)[B

    move-result-object v0

    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    :goto_1
    iget-object v1, p0, Lcom/miteksystems/misnap/o;->a:Lcom/miteksystems/misnap/l;

    invoke-static {v1}, Lcom/miteksystems/misnap/l;->e(Lcom/miteksystems/misnap/l;)Lcom/miteksystems/misnap/MitekAnalyzer;

    move-result-object v1

    iget-object v2, p0, Lcom/miteksystems/misnap/o;->a:Lcom/miteksystems/misnap/l;

    iget v2, v2, Lcom/miteksystems/misnap/l;->b:I

    iget-object v3, p0, Lcom/miteksystems/misnap/o;->a:Lcom/miteksystems/misnap/l;

    iget v3, v3, Lcom/miteksystems/misnap/l;->c:I

    invoke-virtual {v1, v0, v2, v3}, Lcom/miteksystems/misnap/MitekAnalyzer;->a([BII)V

    iget-object v0, p0, Lcom/miteksystems/misnap/o;->a:Lcom/miteksystems/misnap/l;

    invoke-static {v0}, Lcom/miteksystems/misnap/l;->i(Lcom/miteksystems/misnap/l;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/o;->a:Lcom/miteksystems/misnap/l;

    invoke-static {v0, v4}, Lcom/miteksystems/misnap/l;->a(Lcom/miteksystems/misnap/l;Z)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/miteksystems/misnap/o;->a:Lcom/miteksystems/misnap/l;

    invoke-static {v0}, Lcom/miteksystems/misnap/l;->h(Lcom/miteksystems/misnap/l;)[B

    move-result-object v0

    goto :goto_1
.end method
