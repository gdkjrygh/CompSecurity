.class Lcom/facebook/orca/chatheads/dn;
.super Ljava/lang/Object;
.source "ChatThreadView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/dh;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/dh;)V
    .locals 0

    .prologue
    .line 363
    iput-object p1, p0, Lcom/facebook/orca/chatheads/dn;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 366
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dn;->a:Lcom/facebook/orca/chatheads/dh;

    const-string v1, "click_popupspace"

    invoke-static {v0, v1}, Lcom/facebook/orca/chatheads/dh;->a(Lcom/facebook/orca/chatheads/dh;Ljava/lang/String;)V

    .line 367
    return-void
.end method
