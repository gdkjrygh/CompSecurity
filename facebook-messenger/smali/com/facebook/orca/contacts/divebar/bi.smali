.class Lcom/facebook/orca/contacts/divebar/bi;
.super Ljava/lang/Object;
.source "DivebarPickerView.java"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/divebar/be;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/divebar/be;)V
    .locals 0

    .prologue
    .line 108
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/bi;->a:Lcom/facebook/orca/contacts/divebar/be;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 4

    .prologue
    const/16 v1, 0x8

    const/4 v2, 0x0

    .line 111
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/bi;->a:Lcom/facebook/orca/contacts/divebar/be;

    invoke-static {v0}, Lcom/facebook/orca/contacts/divebar/be;->b(Lcom/facebook/orca/contacts/divebar/be;)Landroid/view/ViewGroup;

    move-result-object v3

    if-eqz p2, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 112
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/bi;->a:Lcom/facebook/orca/contacts/divebar/be;

    invoke-static {v0}, Lcom/facebook/orca/contacts/divebar/be;->c(Lcom/facebook/orca/contacts/divebar/be;)Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;

    move-result-object v0

    if-eqz p2, :cond_1

    :goto_1
    invoke-virtual {v0, v1}, Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;->setVisibility(I)V

    .line 113
    return-void

    :cond_0
    move v0, v2

    .line 111
    goto :goto_0

    :cond_1
    move v1, v2

    .line 112
    goto :goto_1
.end method
