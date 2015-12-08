.class final Lcom/arist/model/skin/d;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/arist/model/skin/b;

.field private final synthetic b:Landroid/content/Context;

.field private final synthetic c:Landroid/app/AlertDialog;


# direct methods
.method constructor <init>(Lcom/arist/model/skin/b;Landroid/content/Context;Landroid/app/AlertDialog;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/skin/d;->a:Lcom/arist/model/skin/b;

    iput-object p2, p0, Lcom/arist/model/skin/d;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/arist/model/skin/d;->c:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    iget-object v0, p0, Lcom/arist/model/skin/d;->a:Lcom/arist/model/skin/b;

    iget-object v1, p0, Lcom/arist/model/skin/d;->b:Landroid/content/Context;

    new-instance v2, Lcom/arist/model/skin/g;

    sget-object v3, Lcom/arist/activity/MyApplication;->e:Lcom/arist/c/f;

    invoke-virtual {v3}, Lcom/arist/c/f;->m()I

    move-result v3

    invoke-direct {v2, v1, v3}, Lcom/arist/model/skin/g;-><init>(Landroid/content/Context;I)V

    new-instance v1, Lcom/arist/model/skin/e;

    invoke-direct {v1, v0, v2}, Lcom/arist/model/skin/e;-><init>(Lcom/arist/model/skin/b;Lcom/arist/model/skin/g;)V

    invoke-virtual {v2, v1}, Lcom/arist/model/skin/g;->a(Lcom/arist/model/skin/i;)V

    invoke-virtual {v2}, Lcom/arist/model/skin/g;->show()V

    iget-object v0, p0, Lcom/arist/model/skin/d;->c:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    return-void
.end method
