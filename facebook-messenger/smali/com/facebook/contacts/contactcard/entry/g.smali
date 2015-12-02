.class public Lcom/facebook/contacts/contactcard/entry/g;
.super Lcom/facebook/contacts/contactcard/entry/h;
.source "EmailEntryView.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0, p1}, Lcom/facebook/contacts/contactcard/entry/h;-><init>(Landroid/content/Context;)V

    .line 16
    return-void
.end method


# virtual methods
.method protected a(Landroid/widget/TextView;)V
    .locals 1

    .prologue
    .line 20
    sget v0, Lcom/facebook/o;->contact_email_type:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 21
    return-void
.end method

.method protected b(Landroid/widget/TextView;)V
    .locals 1

    .prologue
    .line 25
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/entry/g;->getEntry()Lcom/facebook/contacts/models/entry/Entry;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/models/entry/EmailEntry;

    .line 26
    invoke-virtual {v0}, Lcom/facebook/contacts/models/entry/EmailEntry;->getEmail()Ljava/lang/String;

    move-result-object v0

    .line 27
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    return-void
.end method
