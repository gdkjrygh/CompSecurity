.class Lcom/facebook/orca/threadlist/g;
.super Ljava/lang/Object;
.source "MuteGlobalWarningController.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadlist/f;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadlist/f;)V
    .locals 0

    .prologue
    .line 31
    iput-object p1, p0, Lcom/facebook/orca/threadlist/g;->a:Lcom/facebook/orca/threadlist/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/orca/threadlist/g;->a:Lcom/facebook/orca/threadlist/f;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/f;->a(Lcom/facebook/orca/threadlist/f;)V

    .line 35
    return-void
.end method
