.class Lcom/facebook/orca/about/a;
.super Ljava/lang/Object;
.source "MessengerAboutActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/about/MessengerAboutActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/about/MessengerAboutActivity;)V
    .locals 0

    .prologue
    .line 79
    iput-object p1, p0, Lcom/facebook/orca/about/a;->a:Lcom/facebook/orca/about/MessengerAboutActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 82
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/about/a;->a:Lcom/facebook/orca/about/MessengerAboutActivity;

    const-class v2, Lcom/facebook/orca/about/MessengerAboutLicenseActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 86
    iget-object v1, p0, Lcom/facebook/orca/about/a;->a:Lcom/facebook/orca/about/MessengerAboutActivity;

    invoke-static {v1}, Lcom/facebook/orca/about/MessengerAboutActivity;->a(Lcom/facebook/orca/about/MessengerAboutActivity;)Lcom/facebook/c/s;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/about/a;->a:Lcom/facebook/orca/about/MessengerAboutActivity;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 87
    return-void
.end method
