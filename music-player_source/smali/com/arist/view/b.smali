.class final Lcom/arist/view/b;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/arist/view/a;


# direct methods
.method constructor <init>(Lcom/arist/view/a;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/view/b;->a:Lcom/arist/view/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/arist/view/b;)Lcom/arist/view/a;
    .locals 1

    iget-object v0, p0, Lcom/arist/view/b;->a:Lcom/arist/view/a;

    return-object v0
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    new-instance v0, Lcom/arist/model/a/b;

    invoke-direct {v0}, Lcom/arist/model/a/b;-><init>()V

    new-instance v1, Lcom/arist/view/c;

    invoke-direct {v1, p0}, Lcom/arist/view/c;-><init>(Lcom/arist/view/b;)V

    iget-object v2, p0, Lcom/arist/view/b;->a:Lcom/arist/view/a;

    invoke-virtual {v2}, Lcom/arist/view/a;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lcom/arist/model/a/b;->a(Landroid/content/Context;Ljava/lang/Runnable;)V

    return-void
.end method
