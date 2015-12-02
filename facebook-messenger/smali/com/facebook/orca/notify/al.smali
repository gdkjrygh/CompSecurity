.class Lcom/facebook/orca/notify/al;
.super Ljava/lang/Object;
.source "MessagingNotificationFeedback.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/notify/ak;


# direct methods
.method constructor <init>(Lcom/facebook/orca/notify/ak;)V
    .locals 0

    .prologue
    .line 127
    iput-object p1, p0, Lcom/facebook/orca/notify/al;->a:Lcom/facebook/orca/notify/ak;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 0

    .prologue
    .line 130
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->release()V

    .line 131
    return-void
.end method
