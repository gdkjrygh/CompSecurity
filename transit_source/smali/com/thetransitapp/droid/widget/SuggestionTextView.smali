.class public Lcom/thetransitapp/droid/widget/SuggestionTextView;
.super Landroid/widget/AutoCompleteTextView;
.source "SuggestionTextView.java"

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
    .line 18
    invoke-direct {p0, p1}, Landroid/widget/AutoCompleteTextView;-><init>(Landroid/content/Context;)V

    .line 12
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/SuggestionTextView;->handler:Landroid/os/Handler;

    .line 15
    const/16 v0, 0x190

    iput v0, p0, Lcom/thetransitapp/droid/widget/SuggestionTextView;->delay:I

    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 22
    invoke-direct {p0, p1, p2}, Landroid/widget/AutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 12
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/SuggestionTextView;->handler:Landroid/os/Handler;

    .line 15
    const/16 v0, 0x190

    iput v0, p0, Lcom/thetransitapp/droid/widget/SuggestionTextView;->delay:I

    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    .line 26
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/AutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/SuggestionTextView;->handler:Landroid/os/Handler;

    .line 15
    const/16 v0, 0x190

    iput v0, p0, Lcom/thetransitapp/droid/widget/SuggestionTextView;->delay:I

    .line 27
    return-void
.end method


# virtual methods
.method public enoughToFilter()Z
    .locals 1

    .prologue
    .line 36
    const/4 v0, 0x1

    return v0
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 2
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 41
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/CharSequence;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-super {p0, v0, v1}, Landroid/widget/AutoCompleteTextView;->performFiltering(Ljava/lang/CharSequence;I)V

    .line 43
    const/4 v0, 0x1

    return v0
.end method

.method protected performFiltering(Ljava/lang/CharSequence;I)V
    .locals 4
    .param p1, "text"    # Ljava/lang/CharSequence;
    .param p2, "keyCode"    # I

    .prologue
    const/4 v2, 0x0

    .line 48
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/SuggestionTextView;->handler:Landroid/os/Handler;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 50
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/SuggestionTextView;->handler:Landroid/os/Handler;

    invoke-virtual {v1, v2, p2, v2, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 51
    .local v0, "msg":Landroid/os/Message;
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/SuggestionTextView;->handler:Landroid/os/Handler;

    iget v2, p0, Lcom/thetransitapp/droid/widget/SuggestionTextView;->delay:I

    int-to-long v2, v2

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 52
    return-void
.end method

.method protected replaceText(Ljava/lang/CharSequence;)V
    .locals 0
    .param p1, "text"    # Ljava/lang/CharSequence;

    .prologue
    .line 32
    return-void
.end method

.method public setDelay(I)V
    .locals 0
    .param p1, "delay"    # I

    .prologue
    .line 14
    iput p1, p0, Lcom/thetransitapp/droid/widget/SuggestionTextView;->delay:I

    return-void
.end method
