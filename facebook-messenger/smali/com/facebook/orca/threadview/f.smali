.class Lcom/facebook/orca/threadview/f;
.super Ljava/lang/Object;
.source "GlobalAlertMessageView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/e;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/e;)V
    .locals 0

    .prologue
    .line 57
    iput-object p1, p0, Lcom/facebook/orca/threadview/f;->a:Lcom/facebook/orca/threadview/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/orca/threadview/f;->a:Lcom/facebook/orca/threadview/e;

    invoke-static {v0}, Lcom/facebook/orca/threadview/e;->a(Lcom/facebook/orca/threadview/e;)V

    .line 61
    return-void
.end method
