.class Lcom/facebook/orca/contacts/favorites/q;
.super Ljava/lang/Object;
.source "EditFavoritesActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)V
    .locals 0

    .prologue
    .line 356
    iput-object p1, p0, Lcom/facebook/orca/contacts/favorites/q;->a:Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 359
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/q;->a:Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->finish()V

    .line 360
    return-void
.end method
