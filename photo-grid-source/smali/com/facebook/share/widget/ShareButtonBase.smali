.class public abstract Lcom/facebook/share/widget/ShareButtonBase;
.super Lcom/facebook/FacebookButtonBase;
.source "SourceFile"


# instance fields
.field private shareContent:Lcom/facebook/share/model/ShareContent;


# direct methods
.method protected constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;I)V
    .locals 7

    .prologue
    .line 45
    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/facebook/FacebookButtonBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILjava/lang/String;I)V

    .line 52
    return-void
.end method


# virtual methods
.method protected configureButton(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1

    .prologue
    .line 113
    invoke-super {p0, p1, p2, p3, p4}, Lcom/facebook/FacebookButtonBase;->configureButton(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 114
    invoke-virtual {p0}, Lcom/facebook/share/widget/ShareButtonBase;->getShareOnClickListener()Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/share/widget/ShareButtonBase;->setInternalOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 115
    return-void
.end method

.method public getShareContent()Lcom/facebook/share/model/ShareContent;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/share/widget/ShareButtonBase;->shareContent:Lcom/facebook/share/model/ShareContent;

    return-object v0
.end method

.method protected abstract getShareOnClickListener()Landroid/view/View$OnClickListener;
.end method

.method public registerCallback(Lcom/facebook/CallbackManager;Lcom/facebook/FacebookCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/CallbackManager;",
            "Lcom/facebook/FacebookCallback",
            "<",
            "Lcom/facebook/share/Sharer$Result;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 83
    invoke-virtual {p0}, Lcom/facebook/share/widget/ShareButtonBase;->getRequestCode()I

    move-result v0

    invoke-static {v0, p1, p2}, Lcom/facebook/share/internal/ShareInternalUtility;->registerSharerCallback(ILcom/facebook/CallbackManager;Lcom/facebook/FacebookCallback;)V

    .line 84
    return-void
.end method

.method public registerCallback(Lcom/facebook/CallbackManager;Lcom/facebook/FacebookCallback;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/CallbackManager;",
            "Lcom/facebook/FacebookCallback",
            "<",
            "Lcom/facebook/share/Sharer$Result;",
            ">;I)V"
        }
    .end annotation

    .prologue
    .line 103
    invoke-virtual {p0, p3}, Lcom/facebook/share/widget/ShareButtonBase;->setRequestCode(I)V

    .line 104
    invoke-virtual {p0, p1, p2}, Lcom/facebook/share/widget/ShareButtonBase;->registerCallback(Lcom/facebook/CallbackManager;Lcom/facebook/FacebookCallback;)V

    .line 105
    return-void
.end method

.method public setShareContent(Lcom/facebook/share/model/ShareContent;)V
    .locals 0

    .prologue
    .line 67
    iput-object p1, p0, Lcom/facebook/share/widget/ShareButtonBase;->shareContent:Lcom/facebook/share/model/ShareContent;

    .line 68
    return-void
.end method
