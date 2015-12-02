.class Lcom/facebook/orca/threadview/bf;
.super Ljava/lang/Object;
.source "ThreadViewAudioAttachmentView.java"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/l;

.field final synthetic b:Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;Lcom/facebook/orca/threadview/l;)V
    .locals 0

    .prologue
    .line 385
    iput-object p1, p0, Lcom/facebook/orca/threadview/bf;->b:Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;

    iput-object p2, p0, Lcom/facebook/orca/threadview/bf;->a:Lcom/facebook/orca/threadview/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 2

    .prologue
    .line 388
    iget-object v0, p0, Lcom/facebook/orca/threadview/bf;->a:Lcom/facebook/orca/threadview/l;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/l;->a(Landroid/os/Parcelable;)V

    .line 389
    const/4 v0, 0x1

    return v0
.end method
