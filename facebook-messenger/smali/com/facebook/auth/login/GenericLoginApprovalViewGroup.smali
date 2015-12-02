.class public Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;
.super Lcom/facebook/auth/login/m;
.source "GenericLoginApprovalViewGroup.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/auth/login/m",
        "<",
        "Lcom/facebook/auth/login/ao;",
        ">;"
    }
.end annotation


# static fields
.field public static final LAYOUT_RESOURCE:Ljava/lang/String; = "orca:authparam:login_approval_layout"


# instance fields
.field private final inputMethodManager:Landroid/view/inputmethod/InputMethodManager;

.field private final loginButton:Landroid/widget/Button;

.field private final passwordText:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/auth/login/ao;)V
    .locals 2

    .prologue
    .line 47
    invoke-direct {p0, p1, p2}, Lcom/facebook/auth/login/m;-><init>(Landroid/content/Context;Lcom/facebook/auth/login/c;)V

    .line 48
    invoke-virtual {p0}, Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;->getInjector()Lcom/facebook/inject/t;

    move-result-object v0

    .line 49
    const-class v1, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;->inputMethodManager:Landroid/view/inputmethod/InputMethodManager;

    .line 51
    const-string v0, "orca:authparam:login_approval_layout"

    sget v1, Lcom/facebook/k;->orca_login_approval:I

    invoke-virtual {p0, v0, v1}, Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;->getResource(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;->setContentView(I)V

    .line 52
    sget v0, Lcom/facebook/i;->password:I

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;->passwordText:Landroid/widget/TextView;

    .line 53
    sget v0, Lcom/facebook/i;->login:I

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;->loginButton:Landroid/widget/Button;

    .line 55
    iget-object v0, p0, Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;->loginButton:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/auth/login/af;

    invoke-direct {v1, p0}, Lcom/facebook/auth/login/af;-><init>(Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 61
    iget-object v0, p0, Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;->passwordText:Landroid/widget/TextView;

    new-instance v1, Lcom/facebook/auth/login/ag;

    invoke-direct {v1, p0}, Lcom/facebook/auth/login/ag;-><init>(Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 71
    return-void
.end method

.method static synthetic access$000(Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;->onLoginClick()V

    return-void
.end method

.method public static createParameterBundle(I)Landroid/os/Bundle;
    .locals 2

    .prologue
    .line 41
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 42
    const-string v1, "orca:authparam:login_approval_layout"

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 43
    return-object v0
.end method

.method private onLoginClick()V
    .locals 5

    .prologue
    .line 74
    iget-object v0, p0, Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;->passwordText:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 75
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    if-gtz v0, :cond_0

    .line 81
    :goto_0
    return-void

    .line 78
    :cond_0
    iget-object v0, p0, Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;->inputMethodManager:Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {p0}, Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 79
    iget-object v0, p0, Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;->control:Lcom/facebook/auth/login/c;

    check-cast v0, Lcom/facebook/auth/login/ao;

    new-instance v2, Lcom/facebook/fbservice/ops/aa;

    invoke-virtual {p0}, Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, Lcom/facebook/o;->login_screen_login_progress:I

    invoke-direct {v2, v3, v4}, Lcom/facebook/fbservice/ops/aa;-><init>(Landroid/content/Context;I)V

    invoke-interface {v0, v1, v2}, Lcom/facebook/auth/login/ao;->a(Ljava/lang/String;Lcom/facebook/fbservice/ops/ab;)V

    goto :goto_0
.end method
