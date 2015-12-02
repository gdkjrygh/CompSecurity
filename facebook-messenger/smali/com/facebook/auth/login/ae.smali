.class Lcom/facebook/auth/login/ae;
.super Lcom/facebook/widget/text/f;
.source "GenericFirstPartySsoViewGroup.java"


# instance fields
.field final synthetic a:Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;


# direct methods
.method constructor <init>(Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;)V
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lcom/facebook/auth/login/ae;->a:Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;

    invoke-direct {p0}, Lcom/facebook/widget/text/f;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/facebook/auth/login/ae;->a:Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;

    # invokes: Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;->onNotYouClicked()V
    invoke-static {v0}, Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;->access$100(Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;)V

    .line 68
    return-void
.end method
