.class Lcom/facebook/auth/login/ak;
.super Ljava/lang/Object;
.source "GenericPasswordCredentialsViewGroup.java"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field final synthetic a:Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;


# direct methods
.method constructor <init>(Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;)V
    .locals 0

    .prologue
    .line 96
    iput-object p1, p0, Lcom/facebook/auth/login/ak;->a:Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 99
    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    .line 100
    iget-object v0, p0, Lcom/facebook/auth/login/ak;->a:Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;

    # invokes: Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->onLoginClick()V
    invoke-static {v0}, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->access$100(Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;)V

    .line 101
    const/4 v0, 0x1

    .line 103
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
