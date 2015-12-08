.class final Lcom/arist/view/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/arist/view/b;


# direct methods
.method constructor <init>(Lcom/arist/view/b;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/view/c;->a:Lcom/arist/view/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/arist/view/c;->a:Lcom/arist/view/b;

    invoke-static {v0}, Lcom/arist/view/b;->a(Lcom/arist/view/b;)Lcom/arist/view/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/view/a;->b()V

    return-void
.end method
