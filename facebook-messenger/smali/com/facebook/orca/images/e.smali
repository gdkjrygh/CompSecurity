.class Lcom/facebook/orca/images/e;
.super Ljava/lang/Object;
.source "ImageSearchActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/images/ImageSearchActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/images/ImageSearchActivity;)V
    .locals 0

    .prologue
    .line 154
    iput-object p1, p0, Lcom/facebook/orca/images/e;->a:Lcom/facebook/orca/images/ImageSearchActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 157
    iget-object v0, p0, Lcom/facebook/orca/images/e;->a:Lcom/facebook/orca/images/ImageSearchActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/images/ImageSearchActivity;->a(Lcom/facebook/orca/images/ImageSearchActivity;Z)V

    .line 158
    return-void
.end method
