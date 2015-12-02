.class Lcom/facebook/orca/threadview/bq;
.super Ljava/lang/Object;
.source "ThreadViewFragment.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/ThreadViewFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ThreadViewFragment;)V
    .locals 0

    .prologue
    .line 2040
    iput-object p1, p0, Lcom/facebook/orca/threadview/bq;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 2043
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 2044
    return-void
.end method
