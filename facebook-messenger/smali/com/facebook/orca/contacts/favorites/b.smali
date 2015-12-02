.class Lcom/facebook/orca/contacts/favorites/b;
.super Ljava/lang/Object;
.source "AddFavoriteContactItemView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/favorites/a;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/favorites/a;)V
    .locals 0

    .prologue
    .line 58
    iput-object p1, p0, Lcom/facebook/orca/contacts/favorites/b;->a:Lcom/facebook/orca/contacts/favorites/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/b;->a:Lcom/facebook/orca/contacts/favorites/a;

    invoke-static {v0}, Lcom/facebook/orca/contacts/favorites/a;->a(Lcom/facebook/orca/contacts/favorites/a;)Lcom/facebook/orca/contacts/favorites/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/favorites/c;->b()V

    .line 63
    return-void
.end method
