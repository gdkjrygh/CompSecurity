.class Lcom/facebook/contacts/contactcard/entry/c;
.super Ljava/lang/Object;
.source "CreatePhoneEntryView.java"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field final synthetic a:Lcom/facebook/contacts/contactcard/entry/b;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/contactcard/entry/b;)V
    .locals 0

    .prologue
    .line 52
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/entry/c;->a:Lcom/facebook/contacts/contactcard/entry/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 55
    const/4 v0, 0x6

    if-ne p2, v0, :cond_1

    .line 56
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/entry/c;->a:Lcom/facebook/contacts/contactcard/entry/b;

    invoke-static {v0}, Lcom/facebook/contacts/contactcard/entry/b;->a(Lcom/facebook/contacts/contactcard/entry/b;)Lcom/facebook/contacts/contactcard/entry/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 57
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/entry/c;->a:Lcom/facebook/contacts/contactcard/entry/b;

    invoke-static {v0}, Lcom/facebook/contacts/contactcard/entry/b;->a(Lcom/facebook/contacts/contactcard/entry/b;)Lcom/facebook/contacts/contactcard/entry/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/contacts/contactcard/entry/e;->a()V

    .line 59
    :cond_0
    const/4 v0, 0x1

    .line 61
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
