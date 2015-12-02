.class Lcom/facebook/contacts/contactcard/r;
.super Ljava/lang/Object;
.source "ContactCardFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/contacts/contactcard/ContactCardFragment;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/contactcard/ContactCardFragment;)V
    .locals 0

    .prologue
    .line 337
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/r;->a:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 340
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/r;->a:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    const-string v1, "goto_timeline"

    invoke-static {v0, v1}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Lcom/facebook/contacts/contactcard/ContactCardFragment;Ljava/lang/String;)V

    .line 341
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/r;->a:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-static {v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->d(Lcom/facebook/contacts/contactcard/ContactCardFragment;)Lcom/facebook/zero/ui/l;

    move-result-object v0

    sget-object v1, Lcom/facebook/zero/a/c;->g:Lcom/facebook/prefs/shared/ae;

    iget-object v2, p0, Lcom/facebook/contacts/contactcard/r;->a:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-virtual {v2}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->p()Landroid/support/v4/app/q;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/zero/ui/l;->a(Lcom/facebook/prefs/shared/ae;Landroid/support/v4/app/q;)V

    .line 343
    return-void
.end method
