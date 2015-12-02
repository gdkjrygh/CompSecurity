.class public final Lcom/facebook/contacts/data/z;
.super Ljava/lang/Object;
.source "FbContactsContract.java"

# interfaces
.implements Lcom/facebook/contacts/data/y;


# instance fields
.field public final a:Landroid/net/Uri;

.field final synthetic b:Lcom/facebook/contacts/data/x;


# direct methods
.method public constructor <init>(Lcom/facebook/contacts/data/x;)V
    .locals 2

    .prologue
    .line 76
    iput-object p1, p0, Lcom/facebook/contacts/data/z;->b:Lcom/facebook/contacts/data/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    iget-object v0, p0, Lcom/facebook/contacts/data/z;->b:Lcom/facebook/contacts/data/x;

    iget-object v0, v0, Lcom/facebook/contacts/data/x;->b:Landroid/net/Uri;

    const-string v1, "contacts_with_fbids"

    invoke-static {v0, v1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/data/z;->a:Landroid/net/Uri;

    return-void
.end method
