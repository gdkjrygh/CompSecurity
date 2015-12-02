.class Lcom/facebook/auth/login/h;
.super Ljava/lang/Object;
.source "AuthFragmentLogoViewGroup.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/auth/login/g;


# direct methods
.method constructor <init>(Lcom/facebook/auth/login/g;)V
    .locals 0

    .prologue
    .line 320
    iput-object p1, p0, Lcom/facebook/auth/login/h;->a:Lcom/facebook/auth/login/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 323
    iget-object v0, p0, Lcom/facebook/auth/login/h;->a:Lcom/facebook/auth/login/g;

    iget-object v0, v0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    invoke-virtual {v0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->onHelpClick()V

    .line 324
    return-void
.end method
