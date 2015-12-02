.class Lcom/facebook/orca/nux/c;
.super Ljava/lang/Object;
.source "NUXActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/nux/NUXActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/nux/NUXActivity;)V
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Lcom/facebook/orca/nux/c;->a:Lcom/facebook/orca/nux/NUXActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/facebook/orca/nux/c;->a:Lcom/facebook/orca/nux/NUXActivity;

    invoke-static {v0}, Lcom/facebook/orca/nux/NUXActivity;->a(Lcom/facebook/orca/nux/NUXActivity;)V

    .line 59
    return-void
.end method
