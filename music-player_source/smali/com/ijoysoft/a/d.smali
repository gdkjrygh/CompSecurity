.class final Lcom/ijoysoft/a/d;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/ijoysoft/a/a;

.field private final synthetic b:Landroid/app/AlertDialog;

.field private final synthetic c:Z

.field private final synthetic d:Ljava/lang/Runnable;

.field private final synthetic e:Landroid/app/Activity;


# direct methods
.method constructor <init>(Lcom/ijoysoft/a/a;Landroid/app/AlertDialog;Ljava/lang/Runnable;Landroid/app/Activity;)V
    .locals 1

    iput-object p1, p0, Lcom/ijoysoft/a/d;->a:Lcom/ijoysoft/a/a;

    iput-object p2, p0, Lcom/ijoysoft/a/d;->b:Landroid/app/AlertDialog;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/ijoysoft/a/d;->c:Z

    iput-object p3, p0, Lcom/ijoysoft/a/d;->d:Ljava/lang/Runnable;

    iput-object p4, p0, Lcom/ijoysoft/a/d;->e:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/ijoysoft/a/d;->b:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    iget-boolean v0, p0, Lcom/ijoysoft/a/d;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ijoysoft/a/d;->d:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ijoysoft/a/d;->d:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/ijoysoft/a/d;->a:Lcom/ijoysoft/a/a;

    iget-object v1, p0, Lcom/ijoysoft/a/d;->e:Landroid/app/Activity;

    invoke-static {v0, v1}, Lcom/ijoysoft/a/a;->b(Lcom/ijoysoft/a/a;Landroid/app/Activity;)V

    goto :goto_0
.end method
