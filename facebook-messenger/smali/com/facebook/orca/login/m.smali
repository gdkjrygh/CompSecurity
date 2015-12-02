.class Lcom/facebook/orca/login/m;
.super Ljava/lang/Object;
.source "WildfireRegPhoneNumberViewGroup.java"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;


# direct methods
.method constructor <init>(Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;)V
    .locals 0

    .prologue
    .line 153
    iput-object p1, p0, Lcom/facebook/orca/login/m;->a:Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 159
    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    .line 160
    iget-object v0, p0, Lcom/facebook/orca/login/m;->a:Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;

    # invokes: Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->onNextClick()V
    invoke-static {v0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->access$200(Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;)V

    .line 161
    const/4 v0, 0x1

    .line 163
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
