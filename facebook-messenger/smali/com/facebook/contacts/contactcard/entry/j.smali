.class Lcom/facebook/contacts/contactcard/entry/j;
.super Ljava/lang/Object;
.source "EntryView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/contacts/contactcard/entry/h;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/contactcard/entry/h;)V
    .locals 0

    .prologue
    .line 66
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/entry/j;->a:Lcom/facebook/contacts/contactcard/entry/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 69
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/entry/j;->a:Lcom/facebook/contacts/contactcard/entry/h;

    invoke-static {v0}, Lcom/facebook/contacts/contactcard/entry/h;->a(Lcom/facebook/contacts/contactcard/entry/h;)Lcom/facebook/contacts/contactcard/entry/k;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 70
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/entry/j;->a:Lcom/facebook/contacts/contactcard/entry/h;

    invoke-static {v0}, Lcom/facebook/contacts/contactcard/entry/h;->a(Lcom/facebook/contacts/contactcard/entry/h;)Lcom/facebook/contacts/contactcard/entry/k;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/contacts/contactcard/entry/j;->a:Lcom/facebook/contacts/contactcard/entry/h;

    invoke-static {v1}, Lcom/facebook/contacts/contactcard/entry/h;->b(Lcom/facebook/contacts/contactcard/entry/h;)Lcom/facebook/contacts/models/entry/Entry;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/contacts/contactcard/entry/k;->b(Lcom/facebook/contacts/models/entry/Entry;)V

    .line 72
    :cond_0
    return-void
.end method
