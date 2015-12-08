.class final Lcom/b/a/o;
.super Lcom/b/a/s;


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/b/a/n;


# direct methods
.method constructor <init>(Lcom/b/a/n;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/b/a/o;->b:Lcom/b/a/n;

    iput-object p2, p0, Lcom/b/a/o;->a:Landroid/content/Context;

    invoke-direct {p0}, Lcom/b/a/s;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/b/a/o;->b:Lcom/b/a/n;

    iget-object v1, p0, Lcom/b/a/o;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/b/a/n;->a(Lcom/b/a/n;Landroid/content/Context;)V

    return-void
.end method
