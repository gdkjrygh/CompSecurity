.class public Lcom/facebook/contacts/contactcard/entry/f;
.super Lcom/facebook/contacts/contactcard/entry/h;
.source "DefaultEntryView.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0, p1}, Lcom/facebook/contacts/contactcard/entry/h;-><init>(Landroid/content/Context;)V

    .line 17
    return-void
.end method


# virtual methods
.method protected a(Landroid/widget/TextView;)V
    .locals 1

    .prologue
    .line 21
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/entry/f;->getEntry()Lcom/facebook/contacts/models/entry/Entry;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/models/entry/DefaultEntry;

    .line 22
    invoke-virtual {v0}, Lcom/facebook/contacts/models/entry/DefaultEntry;->getLabel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    return-void
.end method

.method protected b(Landroid/widget/TextView;)V
    .locals 1

    .prologue
    .line 27
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/entry/f;->getEntry()Lcom/facebook/contacts/models/entry/Entry;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/models/entry/DefaultEntry;

    .line 28
    invoke-virtual {v0}, Lcom/facebook/contacts/models/entry/DefaultEntry;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 29
    return-void
.end method
