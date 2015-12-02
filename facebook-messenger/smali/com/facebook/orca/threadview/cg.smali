.class Lcom/facebook/orca/threadview/cg;
.super Lcom/facebook/orca/photos/b/i;
.source "ThreadViewImageAttachmentView.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/orca/photos/b/i",
        "<",
        "Lcom/facebook/orca/photos/b/w;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;)V
    .locals 0

    .prologue
    .line 731
    iput-object p1, p0, Lcom/facebook/orca/threadview/cg;->a:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    invoke-direct {p0}, Lcom/facebook/orca/photos/b/i;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;Lcom/facebook/orca/threadview/cc;)V
    .locals 0

    .prologue
    .line 731
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/cg;-><init>(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<",
            "Lcom/facebook/orca/photos/b/w;",
            ">;"
        }
    .end annotation

    .prologue
    .line 767
    const-class v0, Lcom/facebook/orca/photos/b/w;

    return-object v0
.end method

.method public bridge synthetic a(Lcom/facebook/c/a/a;)V
    .locals 0

    .prologue
    .line 731
    check-cast p1, Lcom/facebook/orca/photos/b/w;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/threadview/cg;->a(Lcom/facebook/orca/photos/b/w;)V

    return-void
.end method

.method public a(Lcom/facebook/orca/photos/b/w;)V
    .locals 2

    .prologue
    .line 736
    iget-object v0, p0, Lcom/facebook/orca/threadview/cg;->a:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->e(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;)Lcom/facebook/common/executors/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/threadview/ch;

    invoke-direct {v1, p0, p1}, Lcom/facebook/orca/threadview/ch;-><init>(Lcom/facebook/orca/threadview/cg;Lcom/facebook/orca/photos/b/w;)V

    invoke-interface {v0, v1}, Lcom/facebook/common/executors/a;->b(Ljava/lang/Runnable;)V

    .line 763
    return-void
.end method
