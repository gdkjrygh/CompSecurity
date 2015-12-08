.class final Lcom/ijoysoft/a/j;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/ijoysoft/a/a;

.field private final synthetic b:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lcom/ijoysoft/a/a;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/ijoysoft/a/j;->a:Lcom/ijoysoft/a/a;

    iput-object p2, p0, Lcom/ijoysoft/a/j;->b:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/ijoysoft/a/j;->a:Lcom/ijoysoft/a/a;

    invoke-static {v0}, Lcom/ijoysoft/a/a;->c(Lcom/ijoysoft/a/a;)V

    iget-object v0, p0, Lcom/ijoysoft/a/j;->b:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ijoysoft/a/j;->b:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method
