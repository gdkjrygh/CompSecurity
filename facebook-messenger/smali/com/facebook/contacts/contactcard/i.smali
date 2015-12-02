.class Lcom/facebook/contacts/contactcard/i;
.super Ljava/lang/Object;
.source "ContactCardFragment.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Landroid/net/Uri;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/facebook/contacts/contactcard/ContactCardFragment;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/contactcard/ContactCardFragment;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 787
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/i;->b:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    iput-object p2, p0, Lcom/facebook/contacts/contactcard/i;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/net/Uri;
    .locals 2

    .prologue
    .line 790
    sget-object v0, Landroid/provider/ContactsContract$Contacts;->CONTENT_LOOKUP_URI:Landroid/net/Uri;

    iget-object v1, p0, Lcom/facebook/contacts/contactcard/i;->a:Ljava/lang/String;

    invoke-static {v1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 793
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/i;->b:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-virtual {v1}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->n()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-static {v1, v0}, Landroid/provider/ContactsContract$Contacts;->lookupContact(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 787
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/i;->a()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method
