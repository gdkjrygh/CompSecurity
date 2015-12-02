.class Lcom/facebook/orca/contacts/favorites/f;
.super Ljava/lang/Object;
.source "AddFavoriteGroupItemView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/favorites/e;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/favorites/e;)V
    .locals 0

    .prologue
    .line 74
    iput-object p1, p0, Lcom/facebook/orca/contacts/favorites/f;->a:Lcom/facebook/orca/contacts/favorites/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/f;->a:Lcom/facebook/orca/contacts/favorites/e;

    invoke-static {v0}, Lcom/facebook/orca/contacts/favorites/e;->a(Lcom/facebook/orca/contacts/favorites/e;)Lcom/facebook/orca/contacts/favorites/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/favorites/g;->b()V

    .line 79
    return-void
.end method
