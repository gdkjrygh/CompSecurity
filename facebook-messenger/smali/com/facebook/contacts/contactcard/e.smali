.class Lcom/facebook/contacts/contactcard/e;
.super Ljava/lang/Object;
.source "BlockContactDialogFragment.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;)V
    .locals 0

    .prologue
    .line 107
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/e;->a:Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 110
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 111
    return-void
.end method
