.class final Lcom/arist/model/equize/c;
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

    iput-object p1, p0, Lcom/arist/model/equize/c;->a:Lcom/arist/model/equize/a;

    iput-object p2, p0, Lcom/arist/model/equize/c;->b:Landroid/app/AlertDialog;

    iput-object p3, p0, Lcom/arist/model/equize/c;->c:Lcom/arist/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/arist/model/equize/c;->b:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    iget-object v0, p0, Lcom/arist/model/equize/c;->a:Lcom/arist/model/equize/a;

    iget-object v1, p0, Lcom/arist/model/equize/c;->c:Lcom/arist/b/a;

    invoke-virtual {v0, v1}, Lcom/arist/model/equize/a;->a(Lcom/arist/b/a;)V

    return-void
.end method
