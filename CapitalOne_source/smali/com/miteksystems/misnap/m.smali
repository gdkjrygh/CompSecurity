.class final Lcom/miteksystems/misnap/m;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/miteksystems/misnap/l;


# direct methods
.method constructor <init>(Lcom/miteksystems/misnap/l;)V
    .locals 0

    iput-object p1, p0, Lcom/miteksystems/misnap/m;->a:Lcom/miteksystems/misnap/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/miteksystems/misnap/m;->a:Lcom/miteksystems/misnap/l;

    invoke-static {v0}, Lcom/miteksystems/misnap/l;->a(Lcom/miteksystems/misnap/l;)Landroid/hardware/Camera;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/m;->a:Lcom/miteksystems/misnap/l;

    invoke-static {v0}, Lcom/miteksystems/misnap/l;->b(Lcom/miteksystems/misnap/l;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/m;->a:Lcom/miteksystems/misnap/l;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/l;->c()V

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/m;->a:Lcom/miteksystems/misnap/l;

    invoke-static {v0}, Lcom/miteksystems/misnap/l;->c(Lcom/miteksystems/misnap/l;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/miteksystems/misnap/m;->a:Lcom/miteksystems/misnap/l;

    invoke-static {v0}, Lcom/miteksystems/misnap/l;->d(Lcom/miteksystems/misnap/l;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/miteksystems/misnap/m;->a:Lcom/miteksystems/misnap/l;

    iget-object v1, v1, Lcom/miteksystems/misnap/l;->e:Ljava/lang/Runnable;

    const-wide/16 v2, 0x5dc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    return-void
.end method
