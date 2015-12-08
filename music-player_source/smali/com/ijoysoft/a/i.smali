.class final Lcom/ijoysoft/a/i;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/ijoysoft/a/h;

.field private final synthetic b:Landroid/app/Activity;


# direct methods
.method constructor <init>(Lcom/ijoysoft/a/h;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/ijoysoft/a/i;->a:Lcom/ijoysoft/a/h;

    iput-object p2, p0, Lcom/ijoysoft/a/i;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/ijoysoft/a/i;->a:Lcom/ijoysoft/a/h;

    iget-object v0, v0, Lcom/ijoysoft/a/h;->a:Lcom/ijoysoft/a/a;

    iget-object v1, p0, Lcom/ijoysoft/a/i;->b:Landroid/app/Activity;

    invoke-static {v0, v1}, Lcom/ijoysoft/a/a;->a(Lcom/ijoysoft/a/a;Landroid/app/Activity;)V

    return-void
.end method
