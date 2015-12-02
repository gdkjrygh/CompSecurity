.class Lcom/facebook/orca/compose/l;
.super Lcom/facebook/orca/photos/b/i;
.source "ComposeAttachmentContainer.java"


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
.field final synthetic a:Lcom/facebook/orca/compose/ComposeAttachmentContainer;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/compose/ComposeAttachmentContainer;)V
    .locals 0

    .prologue
    .line 384
    iput-object p1, p0, Lcom/facebook/orca/compose/l;->a:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    invoke-direct {p0}, Lcom/facebook/orca/photos/b/i;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/compose/ComposeAttachmentContainer;Lcom/facebook/orca/compose/i;)V
    .locals 0

    .prologue
    .line 384
    invoke-direct {p0, p1}, Lcom/facebook/orca/compose/l;-><init>(Lcom/facebook/orca/compose/ComposeAttachmentContainer;)V

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
    .line 410
    const-class v0, Lcom/facebook/orca/photos/b/w;

    return-object v0
.end method

.method public bridge synthetic a(Lcom/facebook/c/a/a;)V
    .locals 0

    .prologue
    .line 384
    check-cast p1, Lcom/facebook/orca/photos/b/w;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/compose/l;->a(Lcom/facebook/orca/photos/b/w;)V

    return-void
.end method

.method public a(Lcom/facebook/orca/photos/b/w;)V
    .locals 2

    .prologue
    .line 389
    iget-object v0, p0, Lcom/facebook/orca/compose/l;->a:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    invoke-static {v0}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->c(Lcom/facebook/orca/compose/ComposeAttachmentContainer;)Lcom/facebook/common/executors/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/compose/m;

    invoke-direct {v1, p0, p1}, Lcom/facebook/orca/compose/m;-><init>(Lcom/facebook/orca/compose/l;Lcom/facebook/orca/photos/b/w;)V

    invoke-interface {v0, v1}, Lcom/facebook/common/executors/a;->b(Ljava/lang/Runnable;)V

    .line 406
    return-void
.end method
