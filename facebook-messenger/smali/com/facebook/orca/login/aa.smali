.class Lcom/facebook/orca/login/aa;
.super Lcom/facebook/widget/text/f;
.source "WildfireRegStartViewGroup.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/login/WildfireRegStartViewGroup;


# direct methods
.method constructor <init>(Lcom/facebook/orca/login/WildfireRegStartViewGroup;)V
    .locals 0

    .prologue
    .line 143
    iput-object p1, p0, Lcom/facebook/orca/login/aa;->a:Lcom/facebook/orca/login/WildfireRegStartViewGroup;

    invoke-direct {p0}, Lcom/facebook/widget/text/f;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 146
    iget-object v0, p0, Lcom/facebook/orca/login/aa;->a:Lcom/facebook/orca/login/WildfireRegStartViewGroup;

    # invokes: Lcom/facebook/orca/login/WildfireRegStartViewGroup;->onTermsClicked()V
    invoke-static {v0}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->access$200(Lcom/facebook/orca/login/WildfireRegStartViewGroup;)V

    .line 147
    return-void
.end method
