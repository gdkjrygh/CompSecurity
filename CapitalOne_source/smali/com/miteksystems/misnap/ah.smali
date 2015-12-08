.class final Lcom/miteksystems/misnap/ah;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/miteksystems/misnap/u;


# direct methods
.method constructor <init>(Lcom/miteksystems/misnap/u;)V
    .locals 0

    iput-object p1, p0, Lcom/miteksystems/misnap/ah;->a:Lcom/miteksystems/misnap/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/miteksystems/misnap/ah;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->h(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/ah;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->h(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/miteksystems/misnap/b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/ah;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->h(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/miteksystems/misnap/b;->c()V

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/ah;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->i(Lcom/miteksystems/misnap/u;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/ah;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->c(Lcom/miteksystems/misnap/u;)V

    return-void
.end method
