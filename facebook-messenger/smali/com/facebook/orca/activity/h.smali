.class Lcom/facebook/orca/activity/h;
.super Ljava/lang/Object;
.source "ConfirmActionActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/activity/e;


# direct methods
.method constructor <init>(Lcom/facebook/orca/activity/e;)V
    .locals 0

    .prologue
    .line 69
    iput-object p1, p0, Lcom/facebook/orca/activity/h;->a:Lcom/facebook/orca/activity/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/facebook/orca/activity/h;->a:Lcom/facebook/orca/activity/e;

    invoke-virtual {v0}, Lcom/facebook/orca/activity/e;->l()V

    .line 73
    return-void
.end method
