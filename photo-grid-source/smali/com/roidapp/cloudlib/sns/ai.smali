.class final Lcom/roidapp/cloudlib/sns/ai;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/roidapp/cloudlib/sns/aj;

.field final synthetic d:Landroid/app/AlertDialog;


# direct methods
.method constructor <init>(Landroid/app/Activity;Ljava/lang/String;Lcom/roidapp/cloudlib/sns/aj;Landroid/app/AlertDialog;)V
    .locals 0

    .prologue
    .line 122
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/ai;->a:Landroid/app/Activity;

    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/ai;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/roidapp/cloudlib/sns/ai;->c:Lcom/roidapp/cloudlib/sns/aj;

    iput-object p4, p0, Lcom/roidapp/cloudlib/sns/ai;->d:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 126
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ai;->a:Landroid/app/Activity;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/ai;->b:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/app/Activity;Ljava/lang/String;I)Z

    .line 127
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ai;->c:Lcom/roidapp/cloudlib/sns/aj;

    if-eqz v0, :cond_0

    .line 128
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ai;->c:Lcom/roidapp/cloudlib/sns/aj;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/aj;->a()V

    .line 129
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ai;->d:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 130
    return-void
.end method
