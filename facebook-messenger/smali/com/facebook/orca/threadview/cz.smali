.class Lcom/facebook/orca/threadview/cz;
.super Ljava/lang/Object;
.source "ThreadViewMessageFragment.java"

# interfaces
.implements Lcom/facebook/orca/dialog/e;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;)V
    .locals 0

    .prologue
    .line 290
    iput-object p1, p0, Lcom/facebook/orca/threadview/cz;->a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/dialog/MenuDialogItem;Landroid/os/Parcelable;)Z
    .locals 2

    .prologue
    .line 293
    instance-of v0, p2, Landroid/os/Bundle;

    if-eqz v0, :cond_0

    .line 294
    check-cast p2, Landroid/os/Bundle;

    const-string v0, "message_position"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 295
    iget-object v1, p0, Lcom/facebook/orca/threadview/cz;->a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-static {v1, p1, v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;Lcom/facebook/orca/dialog/MenuDialogItem;Ljava/lang/Integer;)Z

    move-result v0

    .line 297
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
