.class Lcom/facebook/contacts/contactcard/c;
.super Ljava/lang/Object;
.source "BlockContactDialogFragment.java"

# interfaces
.implements Lcom/facebook/widget/o;


# instance fields
.field final synthetic a:Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;)V
    .locals 0

    .prologue
    .line 94
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/c;->a:Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/widget/RadioButtonWithSubtitle;Z)V
    .locals 2

    .prologue
    .line 97
    if-eqz p2, :cond_0

    .line 98
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/c;->a:Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;->a(Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;I)V

    .line 100
    :cond_0
    return-void
.end method
