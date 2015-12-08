.class final Lcom/arist/model/equize/d;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/arist/model/equize/a;

.field private final synthetic b:Landroid/app/AlertDialog;

.field private final synthetic c:Lcom/arist/b/a;


# direct methods
.method constructor <init>(Lcom/arist/model/equize/a;Landroid/app/AlertDialog;Lcom/arist/b/a;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/equize/d;->a:Lcom/arist/model/equize/a;

    iput-object p2, p0, Lcom/arist/model/equize/d;->b:Landroid/app/AlertDialog;

    iput-object p3, p0, Lcom/arist/model/equize/d;->c:Lcom/arist/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/arist/model/equize/d;->b:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    iget-object v0, p0, Lcom/arist/model/equize/d;->a:Lcom/arist/model/equize/a;

    invoke-static {v0}, Lcom/arist/model/equize/a;->a(Lcom/arist/model/equize/a;)Lcom/arist/model/equize/j;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/model/equize/d;->c:Lcom/arist/b/a;

    invoke-virtual {v0, v1}, Lcom/arist/model/equize/j;->c(Lcom/arist/b/a;)V

    iget-object v0, p0, Lcom/arist/model/equize/d;->a:Lcom/arist/model/equize/a;

    const v1, 0x7f0900a6

    invoke-static {v0, v1}, Lcom/arist/model/equize/a;->a(Lcom/arist/model/equize/a;I)V

    return-void
.end method
