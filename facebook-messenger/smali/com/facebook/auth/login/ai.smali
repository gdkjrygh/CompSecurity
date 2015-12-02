.class Lcom/facebook/auth/login/ai;
.super Ljava/lang/Object;
.source "GenericPasswordCredentialsViewGroup.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;


# direct methods
.method constructor <init>(Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;)V
    .locals 0

    .prologue
    .line 83
    iput-object p1, p0, Lcom/facebook/auth/login/ai;->a:Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/facebook/auth/login/ai;->a:Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;

    # invokes: Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->onLoginClick()V
    invoke-static {v0}, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->access$100(Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;)V

    .line 87
    return-void
.end method
