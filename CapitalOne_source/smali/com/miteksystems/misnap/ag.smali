.class final Lcom/miteksystems/misnap/ag;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/miteksystems/misnap/u;


# direct methods
.method constructor <init>(Lcom/miteksystems/misnap/u;)V
    .locals 0

    iput-object p1, p0, Lcom/miteksystems/misnap/ag;->a:Lcom/miteksystems/misnap/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/ag;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->f(Lcom/miteksystems/misnap/u;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/ag;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->g(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/ag;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->g(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/miteksystems/misnap/b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/ag;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->g(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/miteksystems/misnap/b;->c()V

    :cond_0
    return-void
.end method
