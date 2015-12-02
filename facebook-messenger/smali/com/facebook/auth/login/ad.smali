.class Lcom/facebook/auth/login/ad;
.super Ljava/lang/Object;
.source "GenericFirstPartySsoViewGroup.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;


# direct methods
.method constructor <init>(Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;)V
    .locals 0

    .prologue
    .line 39
    iput-object p1, p0, Lcom/facebook/auth/login/ad;->a:Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/auth/login/ad;->a:Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;

    # invokes: Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;->onLoginClicked()V
    invoke-static {v0}, Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;->access$000(Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;)V

    .line 43
    return-void
.end method
