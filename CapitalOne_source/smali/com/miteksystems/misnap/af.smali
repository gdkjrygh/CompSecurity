.class final Lcom/miteksystems/misnap/af;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/miteksystems/misnap/u;


# direct methods
.method constructor <init>(Lcom/miteksystems/misnap/u;)V
    .locals 0

    iput-object p1, p0, Lcom/miteksystems/misnap/af;->a:Lcom/miteksystems/misnap/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/miteksystems/misnap/af;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->e(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/MitekAnalyzer;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/af;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->e(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/MitekAnalyzer;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/miteksystems/misnap/MitekAnalyzer;->i:Z

    :cond_0
    return-void
.end method
