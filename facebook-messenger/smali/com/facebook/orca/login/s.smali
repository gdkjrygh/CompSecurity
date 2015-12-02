.class Lcom/facebook/orca/login/s;
.super Ljava/lang/Object;
.source "WildfireRegSmsCodeViewGroup.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;


# direct methods
.method constructor <init>(Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;)V
    .locals 0

    .prologue
    .line 108
    iput-object p1, p0, Lcom/facebook/orca/login/s;->a:Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, Lcom/facebook/orca/login/s;->a:Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;

    # invokes: Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->onNextClick()V
    invoke-static {v0}, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->access$100(Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;)V

    .line 112
    return-void
.end method
