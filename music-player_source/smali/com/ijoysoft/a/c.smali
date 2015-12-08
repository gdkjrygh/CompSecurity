.class final Lcom/ijoysoft/a/c;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/ijoysoft/a/a;

.field private final synthetic b:Landroid/app/AlertDialog;

.field private final synthetic c:Landroid/app/Activity;


# direct methods
.method constructor <init>(Lcom/ijoysoft/a/a;Landroid/app/AlertDialog;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/ijoysoft/a/c;->a:Lcom/ijoysoft/a/a;

    iput-object p2, p0, Lcom/ijoysoft/a/c;->b:Landroid/app/AlertDialog;

    iput-object p3, p0, Lcom/ijoysoft/a/c;->c:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/ijoysoft/a/c;->b:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    iget-object v0, p0, Lcom/ijoysoft/a/c;->a:Lcom/ijoysoft/a/a;

    iget-object v0, p0, Lcom/ijoysoft/a/c;->c:Landroid/app/Activity;

    invoke-static {v0}, Lcom/ijoysoft/a/a;->b(Landroid/app/Activity;)V

    return-void
.end method
