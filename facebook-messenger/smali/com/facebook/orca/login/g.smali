.class Lcom/facebook/orca/login/g;
.super Ljava/lang/Object;
.source "WildfireRegNameViewGroup.java"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/login/WildfireRegNameViewGroup;


# direct methods
.method constructor <init>(Lcom/facebook/orca/login/WildfireRegNameViewGroup;)V
    .locals 0

    .prologue
    .line 128
    iput-object p1, p0, Lcom/facebook/orca/login/g;->a:Lcom/facebook/orca/login/WildfireRegNameViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 134
    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    .line 135
    iget-object v0, p0, Lcom/facebook/orca/login/g;->a:Lcom/facebook/orca/login/WildfireRegNameViewGroup;

    # invokes: Lcom/facebook/orca/login/WildfireRegNameViewGroup;->onNextClick()V
    invoke-static {v0}, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->access$000(Lcom/facebook/orca/login/WildfireRegNameViewGroup;)V

    .line 136
    const/4 v0, 0x1

    .line 138
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
