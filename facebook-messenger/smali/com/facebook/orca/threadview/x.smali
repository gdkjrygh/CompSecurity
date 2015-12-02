.class Lcom/facebook/orca/threadview/x;
.super Ljava/lang/Object;
.source "MuteThreadWarningController.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/w;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/w;)V
    .locals 0

    .prologue
    .line 38
    iput-object p1, p0, Lcom/facebook/orca/threadview/x;->a:Lcom/facebook/orca/threadview/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/facebook/orca/threadview/x;->a:Lcom/facebook/orca/threadview/w;

    invoke-static {v0}, Lcom/facebook/orca/threadview/w;->a(Lcom/facebook/orca/threadview/w;)V

    .line 42
    return-void
.end method
