.class Lcom/facebook/contacts/contactcard/entry/d;
.super Ljava/lang/Object;
.source "CreatePhoneEntryView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/contacts/contactcard/entry/b;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/contactcard/entry/b;)V
    .locals 0

    .prologue
    .line 66
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/entry/d;->a:Lcom/facebook/contacts/contactcard/entry/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/entry/d;->a:Lcom/facebook/contacts/contactcard/entry/b;

    invoke-static {v0}, Lcom/facebook/contacts/contactcard/entry/b;->a(Lcom/facebook/contacts/contactcard/entry/b;)Lcom/facebook/contacts/contactcard/entry/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 70
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/entry/d;->a:Lcom/facebook/contacts/contactcard/entry/b;

    invoke-static {v0}, Lcom/facebook/contacts/contactcard/entry/b;->a(Lcom/facebook/contacts/contactcard/entry/b;)Lcom/facebook/contacts/contactcard/entry/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/contacts/contactcard/entry/e;->b()V

    .line 72
    :cond_0
    return-void
.end method
