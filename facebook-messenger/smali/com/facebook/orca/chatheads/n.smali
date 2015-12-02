.class public Lcom/facebook/orca/chatheads/n;
.super Lcom/facebook/orca/chatheads/e;
.source "ChatHeadInboxButtonView.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 12
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/e;-><init>(Landroid/content/Context;)V

    .line 13
    sget v0, Lcom/facebook/k;->chat_head_inbox_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/n;->setContentView(I)V

    .line 14
    return-void
.end method
