.class public Lcom/facebook/orca/messageview/MessageViewActivity;
.super Lcom/facebook/base/activity/i;
.source "MessageViewActivity.java"

# interfaces
.implements Lcom/facebook/analytics/d;


# static fields
.field private static final p:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private q:Lcom/facebook/widget/titlebar/a;

.field private r:Lcom/facebook/orca/f/k;

.field private s:Ljava/lang/String;

.field private t:Lcom/facebook/messages/model/threads/Message;

.field private u:Lcom/facebook/orca/threads/ThreadSummary;

.field private v:Lcom/facebook/base/broadcast/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 40
    const-class v0, Lcom/facebook/orca/messageview/MessageViewActivity;

    sput-object v0, Lcom/facebook/orca/messageview/MessageViewActivity;->p:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/messageview/MessageViewActivity;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewActivity;->s:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/orca/messageview/MessageViewActivity;)Lcom/facebook/messages/model/threads/Message;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewActivity;->t:Lcom/facebook/messages/model/threads/Message;

    return-object v0
.end method

.method private j()V
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewActivity;->v:Lcom/facebook/base/broadcast/q;

    invoke-virtual {v0}, Lcom/facebook/base/broadcast/q;->a()V

    .line 131
    return-void
.end method

.method private k()V
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewActivity;->v:Lcom/facebook/base/broadcast/q;

    if-eqz v0, :cond_0

    .line 135
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewActivity;->v:Lcom/facebook/base/broadcast/q;

    invoke-virtual {v0}, Lcom/facebook/base/broadcast/q;->b()V

    .line 137
    :cond_0
    return-void
.end method


# virtual methods
.method public b(Landroid/os/Bundle;)V
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 58
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    .line 60
    sget v0, Lcom/facebook/k;->orca_message_view_activity:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/messageview/MessageViewActivity;->setContentView(I)V

    .line 62
    invoke-virtual {p0}, Lcom/facebook/orca/messageview/MessageViewActivity;->i()Lcom/facebook/inject/t;

    move-result-object v2

    .line 63
    const-class v0, Lcom/facebook/orca/f/k;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/k;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewActivity;->r:Lcom/facebook/orca/f/k;

    .line 65
    invoke-static {p0}, Lcom/facebook/widget/titlebar/c;->a(Landroid/app/Activity;)Z

    .line 66
    sget v0, Lcom/facebook/i;->titlebar:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/messageview/MessageViewActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/titlebar/a;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewActivity;->q:Lcom/facebook/widget/titlebar/a;

    .line 68
    invoke-virtual {p0}, Lcom/facebook/orca/messageview/MessageViewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    .line 69
    const-string v0, "thread_id"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewActivity;->s:Ljava/lang/String;

    .line 70
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewActivity;->r:Lcom/facebook/orca/f/k;

    iget-object v4, p0, Lcom/facebook/orca/messageview/MessageViewActivity;->s:Ljava/lang/String;

    invoke-virtual {v0, v4}, Lcom/facebook/orca/f/k;->b(Ljava/lang/String;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewActivity;->u:Lcom/facebook/orca/threads/ThreadSummary;

    .line 71
    const-string v0, "message"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewActivity;->t:Lcom/facebook/messages/model/threads/Message;

    .line 72
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewActivity;->u:Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewActivity;->t:Lcom/facebook/messages/model/threads/Message;

    if-nez v0, :cond_1

    .line 73
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/messageview/MessageViewActivity;->finish()V

    .line 109
    :goto_0
    return-void

    .line 77
    :cond_1
    const-class v0, Lcom/facebook/orca/threadview/dn;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/dn;

    .line 78
    iget-object v2, p0, Lcom/facebook/orca/messageview/MessageViewActivity;->q:Lcom/facebook/widget/titlebar/a;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threadview/dn;->a(Lcom/facebook/widget/titlebar/a;)V

    .line 79
    iget-object v2, p0, Lcom/facebook/orca/messageview/MessageViewActivity;->u:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threadview/dn;->a(Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 81
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 82
    const-string v2, "com.facebook.orca.ACTION_DELETED_MESSAGES_FOR_UI"

    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 83
    new-instance v2, Lcom/facebook/orca/messageview/b;

    invoke-direct {v2, p0, p0, v0}, Lcom/facebook/orca/messageview/b;-><init>(Lcom/facebook/orca/messageview/MessageViewActivity;Landroid/content/Context;Landroid/content/IntentFilter;)V

    iput-object v2, p0, Lcom/facebook/orca/messageview/MessageViewActivity;->v:Lcom/facebook/base/broadcast/q;

    .line 96
    const-string v0, "readers"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 97
    const-string v2, "other_readers"

    invoke-virtual {v3, v2}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 98
    new-instance v4, Lcom/facebook/orca/messageview/k;

    iget-object v5, p0, Lcom/facebook/orca/messageview/MessageViewActivity;->u:Lcom/facebook/orca/threads/ThreadSummary;

    iget-object v6, p0, Lcom/facebook/orca/messageview/MessageViewActivity;->t:Lcom/facebook/messages/model/threads/Message;

    if-eqz v0, :cond_2

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    move-object v2, v0

    :goto_1
    if-eqz v3, :cond_3

    invoke-static {v3}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    :goto_2
    invoke-direct {v4, v5, v6, v2, v0}, Lcom/facebook/orca/messageview/k;-><init>(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/messages/model/threads/Message;Lcom/google/common/a/es;Lcom/google/common/a/es;)V

    .line 105
    invoke-virtual {p0}, Lcom/facebook/orca/messageview/MessageViewActivity;->f()Landroid/support/v4/app/q;

    move-result-object v0

    .line 106
    sget v1, Lcom/facebook/i;->message_view_fragment:I

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q;->a(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/messageview/MessageViewFragment;

    .line 108
    invoke-virtual {v0, v4}, Lcom/facebook/orca/messageview/MessageViewFragment;->a(Lcom/facebook/orca/messageview/k;)V

    goto :goto_0

    :cond_2
    move-object v2, v1

    .line 98
    goto :goto_1

    :cond_3
    move-object v0, v1

    goto :goto_2
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 53
    sget-object v0, Lcom/facebook/analytics/f/a;->MESSAGE_VIEW_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method

.method protected onDestroy()V
    .locals 0

    .prologue
    .line 125
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onDestroy()V

    .line 126
    invoke-direct {p0}, Lcom/facebook/orca/messageview/MessageViewActivity;->k()V

    .line 127
    return-void
.end method

.method protected onStart()V
    .locals 0

    .prologue
    .line 113
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onStart()V

    .line 114
    invoke-direct {p0}, Lcom/facebook/orca/messageview/MessageViewActivity;->j()V

    .line 115
    return-void
.end method

.method protected onStop()V
    .locals 0

    .prologue
    .line 119
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onStop()V

    .line 120
    invoke-direct {p0}, Lcom/facebook/orca/messageview/MessageViewActivity;->k()V

    .line 121
    return-void
.end method
