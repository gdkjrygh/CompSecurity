.class Lcom/facebook/orca/threadview/bb;
.super Ljava/lang/Object;
.source "ThreadViewAudioAttachmentView.java"

# interfaces
.implements Lcom/facebook/orca/d/l;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;)V
    .locals 0

    .prologue
    .line 65
    iput-object p1, p0, Lcom/facebook/orca/threadview/bb;->a:Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/d/k;)V
    .locals 2

    .prologue
    .line 68
    sget-object v0, Lcom/facebook/orca/threadview/bg;->a:[I

    invoke-virtual {p1}, Lcom/facebook/orca/d/k;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 82
    :goto_0
    return-void

    .line 70
    :pswitch_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/bb;->a:Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->a(Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;)V

    goto :goto_0

    .line 73
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/bb;->a:Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->c()V

    goto :goto_0

    .line 79
    :pswitch_2
    iget-object v0, p0, Lcom/facebook/orca/threadview/bb;->a:Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->b(Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;)V

    goto :goto_0

    .line 68
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method
