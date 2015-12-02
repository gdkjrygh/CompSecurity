.class Lcom/facebook/orca/auth/d;
.super Ljava/lang/Object;
.source "StartScreenActivity.java"

# interfaces
.implements Lcom/facebook/base/fragment/c;


# instance fields
.field final synthetic a:Lcom/facebook/orca/auth/StartScreenActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/auth/StartScreenActivity;)V
    .locals 0

    .prologue
    .line 88
    iput-object p1, p0, Lcom/facebook/orca/auth/d;->a:Lcom/facebook/orca/auth/StartScreenActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/facebook/orca/auth/d;->a:Lcom/facebook/orca/auth/StartScreenActivity;

    invoke-static {v0, p2}, Lcom/facebook/orca/auth/StartScreenActivity;->a(Lcom/facebook/orca/auth/StartScreenActivity;Landroid/content/Intent;)V

    .line 92
    return-void
.end method
