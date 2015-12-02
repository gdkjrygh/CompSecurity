.class Lcom/facebook/orca/threadlist/av;
.super Ljava/lang/Object;
.source "ThreadListFragment.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadlist/au;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadlist/au;)V
    .locals 0

    .prologue
    .line 372
    iput-object p1, p0, Lcom/facebook/orca/threadlist/av;->a:Lcom/facebook/orca/threadlist/au;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 0

    .prologue
    .line 375
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->release()V

    .line 376
    return-void
.end method
