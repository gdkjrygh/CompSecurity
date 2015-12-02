.class Lcom/facebook/orca/login/z;
.super Ljava/lang/Object;
.source "WildfireRegStartViewGroup.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/login/WildfireRegStartViewGroup;


# direct methods
.method constructor <init>(Lcom/facebook/orca/login/WildfireRegStartViewGroup;)V
    .locals 0

    .prologue
    .line 94
    iput-object p1, p0, Lcom/facebook/orca/login/z;->a:Lcom/facebook/orca/login/WildfireRegStartViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lcom/facebook/orca/login/z;->a:Lcom/facebook/orca/login/WildfireRegStartViewGroup;

    # invokes: Lcom/facebook/orca/login/WildfireRegStartViewGroup;->onLoginClicked()V
    invoke-static {v0}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->access$100(Lcom/facebook/orca/login/WildfireRegStartViewGroup;)V

    .line 98
    return-void
.end method
