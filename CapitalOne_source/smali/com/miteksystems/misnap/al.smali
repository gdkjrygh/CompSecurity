.class final Lcom/miteksystems/misnap/al;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/miteksystems/misnap/u;


# direct methods
.method constructor <init>(Lcom/miteksystems/misnap/u;)V
    .locals 0

    iput-object p1, p0, Lcom/miteksystems/misnap/al;->a:Lcom/miteksystems/misnap/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/miteksystems/misnap/al;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->n(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/MiSnap;

    move-result-object v0

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/al;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->w(Lcom/miteksystems/misnap/u;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Lcom/miteksystems/misnap/u;->b(Lcom/miteksystems/misnap/u;I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/al;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->w(Lcom/miteksystems/misnap/u;)I

    move-result v0

    iget-object v1, p0, Lcom/miteksystems/misnap/al;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v1}, Lcom/miteksystems/misnap/u;->n(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/MiSnap;

    move-result-object v1

    iget-object v1, v1, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MiSnapAPI;->l()I

    move-result v1

    if-le v0, v1, :cond_1

    iget-object v0, p0, Lcom/miteksystems/misnap/al;->a:Lcom/miteksystems/misnap/u;

    iget-object v0, v0, Lcom/miteksystems/misnap/u;->j:Landroid/os/Handler;

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/miteksystems/misnap/al;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->x(Lcom/miteksystems/misnap/u;)Landroid/app/AlertDialog;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/al;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->x(Lcom/miteksystems/misnap/u;)Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    iget-object v0, p0, Lcom/miteksystems/misnap/al;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->k(Lcom/miteksystems/misnap/u;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/miteksystems/misnap/al;->a:Lcom/miteksystems/misnap/u;

    iget-object v0, v0, Lcom/miteksystems/misnap/u;->j:Landroid/os/Handler;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/miteksystems/misnap/al;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->m(Lcom/miteksystems/misnap/u;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/miteksystems/misnap/al;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v1}, Lcom/miteksystems/misnap/u;->y(Lcom/miteksystems/misnap/u;)Ljava/lang/Runnable;

    move-result-object v1

    iget-object v2, p0, Lcom/miteksystems/misnap/al;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v2}, Lcom/miteksystems/misnap/u;->z(Lcom/miteksystems/misnap/u;)I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method
