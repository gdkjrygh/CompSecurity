.class final Lcom/ijoysoft/a/n;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/ijoysoft/a/m;

.field private final synthetic b:Landroid/app/Activity;


# direct methods
.method constructor <init>(Lcom/ijoysoft/a/m;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/ijoysoft/a/n;->a:Lcom/ijoysoft/a/m;

    iput-object p2, p0, Lcom/ijoysoft/a/n;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/ijoysoft/a/n;->a:Lcom/ijoysoft/a/m;

    iget-object v0, v0, Lcom/ijoysoft/a/m;->a:Lcom/ijoysoft/a/a;

    iget-object v1, p0, Lcom/ijoysoft/a/n;->b:Landroid/app/Activity;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/ijoysoft/a/a;->a(Landroid/app/Activity;Z)V

    iget-object v0, p0, Lcom/ijoysoft/a/n;->a:Lcom/ijoysoft/a/m;

    iget-object v0, v0, Lcom/ijoysoft/a/m;->a:Lcom/ijoysoft/a/a;

    iget-object v1, p0, Lcom/ijoysoft/a/n;->b:Landroid/app/Activity;

    invoke-static {v0, v1}, Lcom/ijoysoft/a/a;->b(Lcom/ijoysoft/a/a;Landroid/app/Activity;)V

    return-void
.end method
