.class public Lcom/thetransitapp/droid/ui/DelayedAutoCompleteView;
.super Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
.source "DelayedAutoCompleteView.java"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field private delay:I

.field private handler:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 19
    invoke-direct {p0, p1}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;-><init>(Landroid/content/Context;)V

    .line 13
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/thetransitapp/droid/ui/DelayedAutoCompleteView;->handler:Landroid/os/Handler;

    .line 16
    const/16 v0, 0x190

    iput v0, p0, Lcom/thetransitapp/droid/ui/DelayedAutoCompleteView;->delay:I

    .line 20
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 23
    invoke-direct {p0, p1, p2}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 13
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/thetransitapp/droid/ui/DelayedAutoCompleteView;->handler:Landroid/os/Handler;

    .line 16
    const/16 v0, 0x190

    iput v0, p0, Lcom/thetransitapp/droid/ui/DelayedAutoCompleteView;->delay:I

    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    .line 27
    invoke-direct {p0, p1, p2, p3}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 13
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/thetransitapp/droid/ui/DelayedAutoCompleteView;->handler:Landroid/os/Handler;

    .line 16
    const/16 v0, 0x190

    iput v0, p0, Lcom/thetransitapp/droid/ui/DelayedAutoCompleteView;->delay:I

    .line 28
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 2
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 32
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/CharSequence;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-super {p0, v0, v1}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->performFiltering(Ljava/lang/CharSequence;I)V

    .line 34
    const/4 v0, 0x1

    return v0
.end method

.method protected performFiltering(Ljava/lang/CharSequence;I)V
    .locals 4
    .param p1, "text"    # Ljava/lang/CharSequence;
    .param p2, "keyCode"    # I

    .prologue
    const/4 v2, 0x0

    .line 39
    iget-object v1, p0, Lcom/thetransitapp/droid/ui/DelayedAutoCompleteView;->handler:Landroid/os/Handler;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 41
    iget-object v1, p0, Lcom/thetransitapp/droid/ui/DelayedAutoCompleteView;->handler:Landroid/os/Handler;

    invoke-virtual {v1, v2, p2, v2, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 42
    .local v0, "msg":Landroid/os/Message;
    iget-object v1, p0, Lcom/thetransitapp/droid/ui/DelayedAutoCompleteView;->handler:Landroid/os/Handler;

    iget v2, p0, Lcom/thetransitapp/droid/ui/DelayedAutoCompleteView;->delay:I

    int-to-long v2, v2

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 43
    return-void
.end method

.method public setDelay(I)V
    .locals 0
    .param p1, "delay"    # I

    .prologue
    .line 15
    iput p1, p0, Lcom/thetransitapp/droid/ui/DelayedAutoCompleteView;->delay:I

    return-void
.end method
