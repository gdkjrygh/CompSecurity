.class Lcom/facebook/orca/creation/g;
.super Ljava/lang/Object;
.source "CreateThreadActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/activity/d;

.field final synthetic b:Lcom/facebook/orca/creation/CreateThreadActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/creation/CreateThreadActivity;Lcom/facebook/orca/activity/d;)V
    .locals 0

    .prologue
    .line 485
    iput-object p1, p0, Lcom/facebook/orca/creation/g;->b:Lcom/facebook/orca/creation/CreateThreadActivity;

    iput-object p2, p0, Lcom/facebook/orca/creation/g;->a:Lcom/facebook/orca/activity/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 488
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 489
    iget-object v0, p0, Lcom/facebook/orca/creation/g;->a:Lcom/facebook/orca/activity/d;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/facebook/orca/activity/d;->a(Z)V

    .line 490
    return-void
.end method
