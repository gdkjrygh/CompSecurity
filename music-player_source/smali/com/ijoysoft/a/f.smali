.class final Lcom/ijoysoft/a/f;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/ijoysoft/a/a;

.field private final synthetic b:Landroid/app/AlertDialog;

.field private final synthetic c:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lcom/ijoysoft/a/a;Landroid/app/AlertDialog;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/ijoysoft/a/f;->a:Lcom/ijoysoft/a/a;

    iput-object p2, p0, Lcom/ijoysoft/a/f;->b:Landroid/app/AlertDialog;

    iput-object p3, p0, Lcom/ijoysoft/a/f;->c:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/ijoysoft/a/f;->b:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    iget-object v0, p0, Lcom/ijoysoft/a/f;->c:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ijoysoft/a/f;->c:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method
