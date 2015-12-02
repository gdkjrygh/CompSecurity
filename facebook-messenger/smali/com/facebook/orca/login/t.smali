.class Lcom/facebook/orca/login/t;
.super Ljava/lang/Object;
.source "WildfireRegSmsCodeViewGroup.java"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;


# direct methods
.method constructor <init>(Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;)V
    .locals 0

    .prologue
    .line 116
    iput-object p1, p0, Lcom/facebook/orca/login/t;->a:Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 122
    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    .line 123
    iget-object v0, p0, Lcom/facebook/orca/login/t;->a:Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;

    # invokes: Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->onNextClick()V
    invoke-static {v0}, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->access$100(Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;)V

    .line 124
    const/4 v0, 0x1

    .line 126
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
